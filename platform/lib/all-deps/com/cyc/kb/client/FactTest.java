package com.cyc.kb.client;

/*
 * #%L
 * KBAPI
 * %%
 * Copyright (C) 1995 - 2014 Cycorp, Inc
 * %%
 * This software is the proprietary information of Cycorp, Inc.
 * Use is subject to license terms.
 * #L%
 */

import com.cyc.base.CycAccessManager;
import com.cyc.base.cycobject.CycAssertion;
import com.cyc.base.cycobject.CycConstantI;
import com.cyc.base.cycobject.FormulaSentence;
import com.cyc.baseclient.cycobject.CycFormulaSentence;
import com.cyc.baseclient.cycobject.DefaultCycAssertion;
import com.cyc.kb.Context;
import com.cyc.kb.Fact;
import com.cyc.kb.KBCollection;
import com.cyc.kb.KBIndividual;
import com.cyc.kb.KBPredicate;
import com.cyc.kb.Sentence;
import com.cyc.kb.client.AssertionImpl;
import com.cyc.kb.client.Constants;
import com.cyc.kb.client.ContextImpl;
import com.cyc.kb.client.FactImpl;
import com.cyc.kb.client.FirstOrderCollectionImpl;
import com.cyc.kb.client.KBCollectionImpl;
import com.cyc.kb.client.KBIndividualImpl;
import com.cyc.kb.client.KBObjectImpl;
import com.cyc.kb.client.KBPredicateImpl;
import com.cyc.kb.client.SentenceImpl;
import com.cyc.kb.exception.CreateException;
import com.cyc.kb.exception.DeleteException;
import com.cyc.kb.exception.KBApiException;
import com.cyc.kb.exception.KBObjectNotFoundException;
import com.cyc.kb.exception.KBTypeException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

import org.junit.AfterClass;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class FactTest {

  private static Logger log = null;

  @BeforeClass
  public static void setUp() throws Exception {
    log = Logger.getLogger(FactTest.class.getName());
    TestConstants.ensureInitialized();
  }

  @AfterClass
  public static void tearDown() throws Exception {
  }

  @Test
  public void testFactCycObject() throws Exception {    
    FormulaSentence cfs = CycFormulaSentence.makeCycSentence("(isa TeletubbiesMt FictionalContext)");
    CycConstantI cc = CycAccessManager.get().getCurrentAccess().getLookupTool().find("FictionalWorksMt");
    CycAssertion ca = new DefaultCycAssertion(cfs, cc);
    System.out.println("Assertion OC API: " + ca);

    FactImpl f = new FactImpl(ca);
    assertEquals(ca, f.getCore());
  }
  
  @Test
  public void testFactStringString() throws KBApiException {

    

    //Fact a = new Fact("'( #$genls  #$Dog  #$CanisGenus )", "#$UniversalVocabularyMt" );
    Fact a = new FactImpl("#$UniversalVocabularyMt", "(#$superTaxons #$Dog #$CanisGenus)");
    assertEquals("(ist UniversalVocabularyMt (superTaxons Dog CanisGenus))", a.toString());

    assertEquals(a.<KBPredicate>getArgument(0).toString(), "superTaxons");
    assertEquals(a.<KBCollection>getArgument(1).toString(), "Dog");
    assertEquals(a.<KBCollection>getArgument(2).toString(), "CanisGenus");

    KBIndividual v = KBIndividualImpl.findOrCreate("VijayRaj001");

    Fact f = new FactImpl("UniversalVocabularyMt", "(isa VijayRaj001 MaleHuman)");
    assertEquals("(ist UniversalVocabularyMt (isa VijayRaj001 MaleHuman))", f.toString());


  }

  @Test
  public void testFactContextObject() throws KBApiException {

    Context uctx = Constants.uvMt();

    Context ctx = ContextImpl.get("(UserAnalysisContextOfThingFn JonC (AVWorkWithIDFn 701537))");
    Fact anA = new FactImpl("(AVAnalysisContextFn (AVWorkWithIDFn 701537))", "(visuallyDepictsTypes-Refined (AVWorkWithIDFn 701537) Food-ReadyToEat)");

    Fact anAonA = new FactImpl("(UserAnalysisContextOfThingFn JonC (AVWorkWithIDFn 701537))", "(#$assertionConfidence  (#$ist (#$AVAnalysisContextFn (#$AVWorkWithIDFn 701537)) (#$visuallyDepictsTypes-Refined (#$AVWorkWithIDFn 701537) #$Food-ReadyToEat))  0.5 )");

    KBPredicate p = KBPredicateImpl.get("assertionConfidence");
    FactImpl a = new FactImpl(uctx, p, anA, 0.89);
    assertEquals("(ist UniversalVocabularyMt (assertionConfidence (() ((#$visuallyDepictsTypes-Refined (#$AVWorkWithIDFn 701537) #$Food-ReadyToEat))) 0.89))", a.toString());

    assertEquals(a.context().toString(), "UniversalVocabularyMt");

  }

  @Test
  public void testConstructAssertion() throws KBApiException {
    //(genls Dog CanisGenus)
    KBPredicate p = KBPredicateImpl.get("genls");
    KBCollection c = KBCollectionImpl.get("Dog");
    KBCollection genl = KBCollectionImpl.get("CanisGenus");
    List<Object> arguments = new ArrayList<Object>();
    arguments.add(c);
    arguments.add(genl);

    Context ctx = Constants.uvMt();
    Fact a = new FactImpl(ctx, p, arguments.toArray());
    String factString = a.toString();

    System.out.println("Fact string: " + factString);

    // With date

    ContextImpl octx = ContextImpl.get("OrionAssetMt");
    KBPredicate op = KBPredicateImpl.get("wellHasProductionStartDate");
    KBIndividual iwell = KBIndividualImpl.get("Well-106P1-Orion");
    Date d = new Date(2012, 03, 19);
    System.out.println("Check the date: " + d.toString());

    Fact wellA = new FactImpl(octx, op, iwell, d);
    System.out.println("Fact to start the well today: " + wellA.toString());


  }
  
  @Test
  public void testFactFactories() throws KBTypeException, CreateException, ParseException, DeleteException {
    
    // Only GAFs can be Fact.class
    System.out.println("Testing that only GAFs can be Fact");
    try {
      @SuppressWarnings("deprecation")
      Fact f = FactImpl.get(TestConstants.flyingRule.getCore());
    } catch (KBObjectNotFoundException kboe){
      System.out.println("Got Exception: " + kboe.toString());
    }
    
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy MM dd HH:mm");
    ContextImpl airlineLogMt = ContextImpl.findOrCreate("SomeAirlineLogMt");
    KBIndividual flight = KBIndividualImpl.get("FlightXYZ-APITest");

    Date d = sdf.parse("2014 03 15 10:20");
    SentenceImpl s = new SentenceImpl(KBPredicateImpl.get("endingDate"), flight, d);
    AssertionImpl a = AssertionImpl.get(s, airlineLogMt);
    @SuppressWarnings("deprecation")
    Fact flDate = FactImpl.get(a.getCore());

    System.out.println("Testing HLID Factory");
    String hlid = a.getId();
    Fact flDate1 = FactImpl.get(hlid);
    assertTrue("Fact not equal to one from HLID", flDate1 == flDate);
    
    // Get based on formula and context strings
    System.out.println("Testing factory get(formulaStr, ctxStr)");
    Fact flDate2 = FactImpl.get(s.toString(), airlineLogMt.toString());
    assertTrue("Fact not equal to one from formulaStr, ctxStr", flDate2 == flDate);
    
    System.out.println("Testing factory get(formula, ctx)");
    Fact flDate3 = FactImpl.get(s, airlineLogMt);
    assertTrue("Fact not equal to one from formula, ctx", flDate3 == flDate);
    
    FirstOrderCollectionImpl flying2Col = FirstOrderCollectionImpl.get("Flying-Move");
    KBIndividual flight2 = KBIndividualImpl.findOrCreate("FlightABC-APITest", flying2Col, airlineLogMt);
    
    SentenceImpl s2 = new SentenceImpl(KBPredicateImpl.get("endingDate"), flight2, d);
    FactImpl fl2Date = FactImpl.findOrCreate(s2, airlineLogMt);
    fl2Date.delete();
    
    Fact fl3Date = FactImpl.findOrCreate(s2.toString(), airlineLogMt.toString());
    assertFalse("Probably failed to assert, HLID is empty string", fl2Date.getId().equals(""));
  }

  @Test
  public void testDelete() throws KBApiException {

    Fact a = new FactImpl("#$UniversalVocabularyMt", "(#$superTaxons #$Dog #$CanisGenus)");
    assertEquals("(ist UniversalVocabularyMt (superTaxons Dog CanisGenus))", a.toString());
    a.delete();

  }

  @Test
  public void testAddList() throws KBApiException {
    KBIndividualImpl report = new KBIndividualImpl ("TestReport");
    report.instantiates(KBCollectionImpl.get("DatabaseTable"));
    
    List<String> ls = new ArrayList<String>();
    ls.add("INDEX1");
    ls.add("INDEX2");
    ls.add("CUSTOM_NAME");

    SentenceImpl s = new SentenceImpl(KBPredicateImpl.get("tableFieldNameList"), report, ls);
    Fact f = new FactImpl(ContextImpl.get("ReportGeneratorEntitiesMt"), s);
    System.out.println("Fact F: " + f);
  }

  @Test
  public void testAddSet() throws KBApiException {
    KBIndividual i = KBIndividualImpl.get("TheSet");
    Set<KBObjectImpl> ls = new HashSet<KBObjectImpl>();
    ls.add(KBIndividualImpl.get("BillClinton"));
    ls.add(KBIndividualImpl.get("BarackObama"));
    ls.add(KBIndividualImpl.get("GeorgeHWBush"));
      ls.add(KBIndividualImpl.get("GeorgeWBush"));
    //Fact f = i.addFact(Context.get("UniversalVocabularyMt"), Predicate.get("exampleNATs"), 1, ls);
    SentenceImpl s = new SentenceImpl(KBPredicateImpl.get("exampleNATs"), i, ls);
      Fact f = new FactImpl(ContextImpl.get("UniversalVocabularyMt"), s);
    System.out.println("Fact F: " + f);
    
    
  }

  @Test
  public void testAddAndGetSentence() throws KBApiException {

    KBIndividualImpl i = KBIndividualImpl.findOrCreate("SomeRandom-LS");
    i.isInstanceOf(KBCollectionImpl.get("LogicalSchema"));
    KBPredicateImpl p = KBPredicateImpl.get("meaningSentenceOfSchema");
    List<Object> l = new ArrayList<Object>();
    l.add(KBPredicateImpl.get("isa"));
    l.add(i);
    l.add(p);
    Sentence s = new SentenceImpl(l.toArray());

    i.addFact(ContextImpl.get("UniversalVocabularyMt"), p, 1, s);

    Collection<Fact> lfs = i.getFacts(p, 1, ContextImpl.get("UniversalVocabularyMt"));
    KBIndividual iback = lfs.iterator().next().<KBIndividual>getArgument(1);
    Sentence a = lfs.iterator().next().<Sentence>getArgument(2);
    System.out.println("Got a sentence: " + a);
  }
}

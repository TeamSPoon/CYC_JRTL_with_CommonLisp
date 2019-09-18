/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cyc.kb;

import com.cyc.kb.exception.KBApiException;
import java.util.Collection;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.opencyc.api.CycAccess;
import org.opencyc.cycobject.CycAssertion;
import org.opencyc.cycobject.CycConstant;
import org.opencyc.cycobject.CycFormulaSentence;

/**
 *
 * @author daves
 */
public class AssertionTest {

  public AssertionTest() {
  }
  private static Logger log = null;

  @BeforeClass
  public static void setUpClass() throws Exception {
    log = Logger.getLogger(ContextTest.class.getName());
    TestConstants.ensureInitialized();
  }

  @AfterClass
  public static void tearDownClass() throws Exception {
  }

  @Before
  public void setUp() {
  }

  @After
  public void tearDown() {
  }

  @Test
  public void testAssertionFactoryMethods() throws Exception {
    CycFormulaSentence cfs = CycFormulaSentence.makeCycSentence("(isa TeletubbiesMt FictionalContext)");
    CycConstant cc = CycAccess.getCurrent().find("FictionalWorksMt");
    CycAssertion ca = new CycAssertion(cfs, cc);
    System.out.println("Assertion OC API: " + ca);

    Assertion a = Assertion.get(ca);
    System.out.println("Assertion KB API: " + a);
    assertEquals(ca, a.getCore());

    String hlid = a.getId();
    Assertion aid = Assertion.get(hlid);
    System.out.println("HL ID of Assertion: " + hlid);
    assertTrue(a == aid);
    
    // Did I get it from the cache?
    Assertion acache = Assertion.get(ca);
    assertTrue(a == acache);
    
    Assertion astr = Assertion.get("(isa TeletubbiesMt FictionalContext)", "FictionalWorksMt");
    assertTrue(a == astr);
    
    Sentence s = new Sentence(Predicate.get("isa"), Context.get("TeletubbiesMt"), KBCollection.get("FictionalContext"));
    Context ctx = Context.get("FictionalWorksMt");
    Assertion asent = Assertion.get(s, ctx);
    assertTrue(a == asent);
    
    Assertion atemp = Assertion.findOrCreate("(isa VijayRaj Person)", "BaseKB");
    System.out.println("Assertion: " + atemp);
  }

  /**
   * Test of context method, of class Assertion.
   */
  //@Test
  public void testContext() throws Exception {
    System.out.println("context");
    Assertion instance = new Assertion();
    Context expResult = null;
    Context result = instance.context();
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of getSupportingAssertions method, of class Assertion.
   */
  @Test
  public void testGetSupportingAssertions() throws KBApiException {
    System.out.println("getSupportingAssertions");
    Assertion instance = new Fact(true, "UniversalVocabularyMt", "(isa (FruitFn AppleTree) ExistingObjectType)");
    Collection result = instance.getSupportingAssertions();
    assertTrue(!result.isEmpty());

    // non-deduced assertion
    instance = new Fact(true, "UniversalVocabularyMt", "(isa (FruitFn AppleTree) SpatiallyDisjointObjectType)");
    result = instance.getSupportingAssertions();
    assertTrue(result.isEmpty());
  }

  /**
   * Test of getAllSupportingAssertions method, of class Assertion.
   */
  //@Test
  /*
   public void testGetAllSupportingAssertions() throws KBApiException {
   System.out.println("getAllSupportingAssertions");
   Assertion instance = new Assertion();
   Collection expResult = null;
   Collection result = instance.getAllSupportingAssertions();
   assertEquals(expResult, result);
   // TODO review the generated test code and remove the default call to fail.
   fail("The test case is a prototype.");
   }
   * */
  /**
   * Test of isDeducedAssertion method, of class Assertion.
   */
  @Test
  public void testIsDeducedAssertion() throws Exception {
    System.out.println("isDeducedAssertion");
    Assertion instance = new Fact(true, "UniversalVocabularyMt", "(isa (FruitFn AppleTree) ExistingObjectType)");
    boolean expResult = true;
    boolean result = instance.isDeducedAssertion();
    assertEquals(expResult, result);
    instance = new Fact(true, "BaseKB", "(genls (FruitFn RedDeliciousAppleTree) (FruitFn AppleTree))");
    assertEquals(true, instance.isDeducedAssertion());

    //asserted only
    instance = new Fact(true, "UniversalVocabularyMt", "(isa (FruitFn AppleTree) SpatiallyDisjointObjectType)");
    assertEquals(false, instance.isDeducedAssertion());

  }

  /**
   * Test of isAssertedAssertion method, of class Assertion.
   */
  @Test
  public void testIsAssertedAssertion() throws Exception {
    System.out.println("isAssertedAssertion");
    Assertion instance = new Fact(true, "BaseKB", "(genls (FruitFn RedDeliciousAppleTree) (FruitFn AppleTree))");
    assertEquals(true, instance.isAssertedAssertion());
    instance = new Fact(true, "UniversalVocabularyMt", "(isa (FruitFn AppleTree) SpatiallyDisjointObjectType)");
    assertEquals(true, instance.isAssertedAssertion());
    //derived only
    instance = new Fact(true, "UniversalVocabularyMt", "(isa (FruitFn AppleTree) ExistingObjectType)");
    assertEquals(false, instance.isAssertedAssertion());

  }
}
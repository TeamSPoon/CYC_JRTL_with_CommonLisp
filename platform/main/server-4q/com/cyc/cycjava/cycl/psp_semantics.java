package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class psp_semantics
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.psp_semantics";
  public static final String myFingerPrint = "77f426e3f4ecfcb134520dadcdae36e28d1926df673ab0cab0bb11e20a33bcbc";
  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 840L)
  private static SubLSymbol $psp_context$;
  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 1137L)
  public static SubLSymbol $dtp_phrase_structure_parser_weighted_cycl$;
  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 7892L)
  private static SubLSymbol $psp_category_from_frame_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 13401L)
  private static SubLSymbol $psp_special_semantic_methods$;
  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 31034L)
  private static SubLSymbol $psp_head_key_for_category_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 38612L)
  private static SubLSymbol $psp_reformulator_modules_to_skip$;
  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 50352L)
  private static SubLSymbol $psp_genl_posP_caching_state$;
  private static final SubLSymbol $sym0$PHRASE_STRUCTURE_PARSER_WEIGHTED_CYCL;
  private static final SubLSymbol $sym1$PHRASE_STRUCTURE_PARSER_WEIGHTED_CYCL_P;
  private static final SubLList $list2;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLSymbol $sym6$PPRINT_PSP_WEIGHTED_CYCL;
  private static final SubLSymbol $sym7$PHRASE_STRUCTURE_PARSER_WEIGHTED_CYCL_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list8;
  private static final SubLSymbol $sym9$PSP_WEIGHTED_CYCL_CYCL;
  private static final SubLSymbol $sym10$_CSETF_PSP_WEIGHTED_CYCL_CYCL;
  private static final SubLSymbol $sym11$PSP_WEIGHTED_CYCL_WEIGHT;
  private static final SubLSymbol $sym12$_CSETF_PSP_WEIGHTED_CYCL_WEIGHT;
  private static final SubLSymbol $kw13$CYCL;
  private static final SubLSymbol $kw14$WEIGHT;
  private static final SubLString $str15$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw16$BEGIN;
  private static final SubLSymbol $sym17$MAKE_PHRASE_STRUCTURE_PARSER_WEIGHTED_CYCL;
  private static final SubLSymbol $kw18$SLOT;
  private static final SubLSymbol $kw19$END;
  private static final SubLSymbol $sym20$VISIT_DEFSTRUCT_OBJECT_PHRASE_STRUCTURE_PARSER_WEIGHTED_CYCL_METH;
  private static final SubLSymbol $sym21$PSP_WEIGHTED_CYCL_P;
  private static final SubLString $str22$__PSP_WEIGHTED_CYCL__S__S_;
  private static final SubLString $str23$Weighting_CycL_with_weights_____S;
  private static final SubLFloat $float24$0_0;
  private static final SubLSymbol $sym25$PSP_CYCL_WEIGHT__;
  private static final SubLFloat $float26$1_0;
  private static final SubLSymbol $sym27$PSP_CYCL_CYCL;
  private static final SubLSymbol $sym28$PSP_WEIGHT_P;
  private static final SubLSymbol $sym29$COPY_PSP_CYCL;
  private static final SubLSymbol $sym30$BOOLEANP;
  private static final SubLSymbol $kw31$LOOKUP;
  private static final SubLSymbol $kw32$SPECIAL;
  private static final SubLSymbol $kw33$LEXICAL;
  private static final SubLSymbol $kw34$UNARY;
  private static final SubLSymbol $kw35$MULTI_DTR;
  private static final SubLList $list36;
  private static final SubLSymbol $kw37$DENOT_GROUND;
  private static final SubLSymbol $kw38$DENOT_TEMPLATE;
  private static final SubLSymbol $kw39$PROP_GROUND;
  private static final SubLSymbol $kw40$PROP_TEMPLATE;
  private static final SubLSymbol $sym41$PSP_CATEGORY_FROM_FRAME;
  private static final SubLObject $const42$GenericVerbPhraseModifyingFrame;
  private static final SubLList $list43;
  private static final SubLObject $const44$NounPhraseModifyingFrame;
  private static final SubLObject $const45$NounPhrase;
  private static final SubLObject $const46$FrameForNouns;
  private static final SubLObject $const47$Noun;
  private static final SubLObject $const48$FrameForVerbs;
  private static final SubLObject $const49$Verb;
  private static final SubLSymbol $sym50$_PSP_CATEGORY_FROM_FRAME_CACHING_STATE_;
  private static final SubLInteger $int51$128;
  private static final SubLSymbol $kw52$IDENTITY;
  private static final SubLObject $const53$Adverb;
  private static final SubLString $str54$No_templates_for__S___;
  private static final SubLSymbol $kw55$NON_WFF;
  private static final SubLList $list56;
  private static final SubLString $str57$__Couldn_t_find_template_semx_for;
  private static final SubLSymbol $sym58$KEYWORDP;
  private static final SubLList $list59;
  private static final SubLList $list60;
  private static final SubLSymbol $sym61$_PSP_SPECIAL_SEMANTIC_METHODS_;
  private static final SubLObject $const62$psRuleSemanticsHandler;
  private static final SubLSymbol $kw63$GAF;
  private static final SubLList $list64;
  private static final SubLSymbol $kw65$INIT_STATE;
  private static final SubLSymbol $kw66$INITIALIZED;
  private static final SubLList $list67;
  private static final SubLObject $const68$NLNumberFn;
  private static final SubLList $list69;
  private static final SubLSymbol $kw70$NBAR;
  private static final SubLSymbol $kw71$DET;
  private static final SubLObject $const72$NLDefinitenessAttribute;
  private static final SubLObject $const73$ScalarInterval;
  private static final SubLObject $const74$TimesFn;
  private static final SubLObject $const75$GroupOfCardinalityFn;
  private static final SubLObject $const76$UnitOfMeasure;
  private static final SubLObject $const77$PossessivePronoun_Pre;
  private static final SubLObject $const78$PossessiveMarker_Sg;
  private static final SubLSymbol $kw79$NONE;
  private static final SubLString $str80$of;
  private static final SubLSymbol $kw81$QUADS;
  private static final SubLSymbol $kw82$TRIPLES;
  private static final SubLFloat $float83$0_1;
  private static final SubLString $str84$Parsed__S_in__S_seconds_;
  private static final SubLSymbol $kw85$BEST_ONLY;
  private static final SubLFloat $float86$0_8;
  private static final SubLList $list87;
  private static final SubLList $list88;
  private static final SubLSymbol $kw89$NO_DENOT;
  private static final SubLObject $const90$plural_Generic;
  private static final SubLSymbol $sym91$UPPER_CASE_P;
  private static final SubLSymbol $sym92$PSP_PARSE_NOUN_COMPOUND_TOKENS;
  private static final SubLSymbol $sym93$PSP_EXTRACT_SUBJECT_SEMX;
  private static final SubLSymbol $sym94$PSP_QUANTIFY_SUBJECT;
  private static final SubLList $list95;
  private static final SubLSymbol $kw96$INSTANCE;
  private static final SubLSymbol $kw97$ERROR;
  private static final SubLSymbol $sym98$PSP_CYCL__;
  private static final SubLSymbol $sym99$PSP_COERCE_TEMPLATE_TO_COLLECTION_MEMOIZED;
  private static final SubLSymbol $kw100$OK;
  private static final SubLSymbol $sym101$_OBJ;
  private static final SubLSymbol $kw102$REPLACE;
  private static final SubLSymbol $kw103$ACTION;
  private static final SubLObject $const104$thereExists;
  private static final SubLObject $const105$isa;
  private static final SubLObject $const106$StateFn;
  private static final SubLList $list107;
  private static final SubLSymbol $sym108$MAKE_NEGATION;
  private static final SubLSymbol $sym109$EL_NEGATION_P;
  private static final SubLSymbol $sym110$PSP_DNF_FOR_SENTENCE;
  private static final SubLList $list111;
  private static final SubLSymbol $kw112$UNSPECIFIED;
  private static final SubLSymbol $sym113$PSP_HEAD_KEY_FOR_CATEGORY;
  private static final SubLSymbol $kw114$NOUN;
  private static final SubLSymbol $sym115$_PSP_HEAD_KEY_FOR_CATEGORY_CACHING_STATE_;
  private static final SubLSymbol $sym116$PSP_SUBSTITUTE_BINDINGS;
  private static final SubLSymbol $sym117$CYC_VAR_;
  private static final SubLList $list118;
  private static final SubLList $list119;
  private static final SubLList $list120;
  private static final SubLSymbol $kw121$UNKNOWN;
  private static final SubLString $str122$No_bindings_for__S___;
  private static final SubLString $str123$Binding__S_has_no_corresponding_d;
  private static final SubLSymbol $kw124$TYPE;
  private static final SubLSymbol $sym125$PSP_COLLECTION_;
  private static final SubLSymbol $sym126$STRIP_NL_TAGS;
  private static final SubLObject $const127$PSRule_VbarVComps;
  private static final SubLSymbol $kw128$SUBJECT;
  private static final SubLString $str129$__No_cycls_found_for____S__;
  private static final SubLString $str130$__All_cycls_were_non_wff_for____S;
  private static final SubLList $list131;
  private static final SubLList $list132;
  private static final SubLString $str133$__No_filtered_cycls_for__S;
  private static final SubLList $list134;
  private static final SubLList $list135;
  private static final SubLString $str136$Bad_binding_pair___S;
  private static final SubLSymbol $kw137$VALID;
  private static final SubLSymbol $sym138$PSP_COLLECTION_MEMOIZED_;
  private static final SubLList $list139;
  private static final SubLSymbol $sym140$PSP_REFORMULATE_INT;
  private static final SubLSymbol $sym141$MEMOIZATION_STATE_P;
  private static final SubLSymbol $kw142$CLEAR_CACHES_;
  private static final SubLSymbol $kw143$FALSE;
  private static final SubLSymbol $sym144$PSP_WFF_;
  private static final SubLSymbol $sym145$CDR;
  private static final SubLString $str146$__Not_WFF___S__;
  private static final SubLList $list147;
  private static final SubLSymbol $sym148$PSP_SEM_TEMPLATES_FROM_LEXICAL_EDGE;
  private static final SubLObject $const149$Preposition;
  private static final SubLObject $const150$Adjective;
  private static final SubLObject $const151$RegularNounFrame;
  private static final SubLObject $const152$Thing;
  private static final SubLString $str153$_S_is_not_a_known_keyword_for__S_;
  private static final SubLSymbol $sym154$CYCL_DENOTATIONAL_TERM_P;
  private static final SubLSymbol $sym155$PSP_LOOKUP_TEMPLATES_MEMOIZED;
  private static final SubLSymbol $sym156$_EXCLUDE_VULGARITIES__;
  private static final SubLSymbol $sym157$_EXCLUDE_SLANG__;
  private static final SubLSymbol $sym158$_EXCLUDE_ARCHAIC_SPEECH__;
  private static final SubLSymbol $sym159$_EXCLUDE_INDIRECT_RELATIONS__;
  private static final SubLSymbol $sym160$GET;
  private static final SubLSymbol $kw161$SEMTRANS;
  private static final SubLSymbol $kw162$FRAME;
  private static final SubLSymbol $kw163$WORD_UNIT;
  private static final SubLSymbol $kw164$PRAGMATICS;
  private static final SubLSymbol $kw165$CYC_POS;
  private static final SubLSymbol $sym166$PRAGMATICALLY_ACCEPTABLE_;
  private static final SubLSymbol $sym167$GET_SEMTRANS_ENTRIES;
  private static final SubLObject $const168$PhraseFn;
  private static final SubLSymbol $sym169$PSP_ROLES_FOR_DENOT;
  private static final SubLObject $const170$GeographicalRegion;
  private static final SubLList $list171;
  private static final SubLObject $const172$Collection;
  private static final SubLList $list173;
  private static final SubLObject $const174$Relation;
  private static final SubLList $list175;
  private static final SubLSymbol $sym176$PSP_GENL_POS_;
  private static final SubLSymbol $sym177$_PSP_GENL_POS__CACHING_STATE_;
  private static final SubLInteger $int178$32;
  private static final SubLSymbol $sym179$PSP_DEVISE_NOUN_TEMPLATES;
  private static final SubLSymbol $sym180$PSP_DEVISE_DEVERBAL_NOUN_TEMPLATE;
  private static final SubLList $list181;
  private static final SubLSymbol $kw182$OBLIQUE_OBJECT;
  private static final SubLSymbol $kw183$OBJECT;
  private static final SubLSymbol $sym184$PSP_SUBJECT_CLAUSE_;
  private static final SubLObject $const185$TransitiveNPFrame;
  private static final SubLSymbol $sym186$PSP_PASSIVIZE_TEMPLATE;
  private static final SubLSymbol $kw187$PASSIVE_WITH_BY;
  private static final SubLSymbol $kw188$BY_SUBJECT;
  private static final SubLObject $const189$TheActiveSubject;
  private static final SubLSymbol $sym190$PSP_QUANTIFY_TEMPLATE;
  private static final SubLString $str191$__PSP_MAKE_CONJUNCTION_passed_NIL;
  private static final SubLString $str192$__PSP_MAKE_DISJUNCTION_passed_NIL;
  private static final SubLSymbol $sym193$PSP_DAVIDSONIANIZE_VERB_TEMPLATE;
  private static final SubLList $list194;
  private static final SubLSymbol $kw195$ISA;
  private static final SubLSymbol $kw196$GENL;
  private static final SubLSymbol $kw197$NOT_DISJOINT;
  private static final SubLObject $const198$SpecsFn;
  private static final SubLSymbol $sym199$PSP_OK_TEMPLATE__INT;
  private static final SubLString $str200$Non_canonical_semtrans_template__;
  private static final SubLList $list201;
  private static final SubLList $list202;
  private static final SubLObject $const203$PSRule_GerundNPFromVbar;
  private static final SubLObject $const204$NLQuantFn_3;
  private static final SubLObject $const205$ProperName_NLAttr;
  private static final SubLObject $const206$NLQuantFn;
  private static final SubLObject $const207$singular_Generic;
  private static final SubLString $str208$;
  private static final SubLSymbol $sym209$PSP_EXTRACT_SUBJECT_SEMX_INT;
  private static final SubLSymbol $kw210$IGNORE;
  private static final SubLObject $const211$TheSentenceSubject;
  private static final SubLSymbol $sym212$_SUBJECT;
  private static final SubLSymbol $sym213$PSP_REMOVE_DISPREFERRED_CYCLS;
  private static final SubLSymbol $sym214$PSP_LESS_PREFERABLE_CYCL_;
  private static final SubLSymbol $sym215$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const216$EverythingPSC;
  private static final SubLSymbol $kw217$GENERAL;
  private static final SubLSymbol $kw218$SPECIFIC;
  private static final SubLSymbol $sym219$_;
  private static final SubLSymbol $sym220$PSP_GENERALITY_ESTIMATE;
  private static final SubLSymbol $sym221$_;
  private static final SubLSymbol $sym222$_;
  private static final SubLSymbol $sym223$PSP_GENERALITY_ESTIMATE_RECURSIVE;

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 925L)
  public static SubLObject psp_mother_of_current_edge()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $psp_context$.getDynamicValue( thread ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 1137L)
  public static SubLObject phrase_structure_parser_weighted_cycl_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    pprint_psp_weighted_cycl( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 1137L)
  public static SubLObject phrase_structure_parser_weighted_cycl_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $phrase_structure_parser_weighted_cycl_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 1137L)
  public static SubLObject psp_weighted_cycl_cycl(final SubLObject v_object)
  {
    assert NIL != phrase_structure_parser_weighted_cycl_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 1137L)
  public static SubLObject psp_weighted_cycl_weight(final SubLObject v_object)
  {
    assert NIL != phrase_structure_parser_weighted_cycl_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 1137L)
  public static SubLObject _csetf_psp_weighted_cycl_cycl(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != phrase_structure_parser_weighted_cycl_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 1137L)
  public static SubLObject _csetf_psp_weighted_cycl_weight(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != phrase_structure_parser_weighted_cycl_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 1137L)
  public static SubLObject make_phrase_structure_parser_weighted_cycl(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $phrase_structure_parser_weighted_cycl_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw13$CYCL ) )
      {
        _csetf_psp_weighted_cycl_cycl( v_new, current_value );
      }
      else if( pcase_var.eql( $kw14$WEIGHT ) )
      {
        _csetf_psp_weighted_cycl_weight( v_new, current_value );
      }
      else
      {
        Errors.error( $str15$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 1137L)
  public static SubLObject visit_defstruct_phrase_structure_parser_weighted_cycl(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw16$BEGIN, $sym17$MAKE_PHRASE_STRUCTURE_PARSER_WEIGHTED_CYCL, TWO_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw18$SLOT, $kw13$CYCL, psp_weighted_cycl_cycl( obj ) );
    Functions.funcall( visitor_fn, obj, $kw18$SLOT, $kw14$WEIGHT, psp_weighted_cycl_weight( obj ) );
    Functions.funcall( visitor_fn, obj, $kw19$END, $sym17$MAKE_PHRASE_STRUCTURE_PARSER_WEIGHTED_CYCL, TWO_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 1137L)
  public static SubLObject visit_defstruct_object_phrase_structure_parser_weighted_cycl_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_phrase_structure_parser_weighted_cycl( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 1355L)
  public static SubLObject psp_weighted_cycl_p(final SubLObject v_object)
  {
    return phrase_structure_parser_weighted_cycl_p( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 1461L)
  public static SubLObject contains_psp_weighted_cycl_p(final SubLObject expression)
  {
    return list_utilities.tree_find_if( $sym21$PSP_WEIGHTED_CYCL_P, expression, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 1578L)
  public static SubLObject pprint_psp_weighted_cycl(final SubLObject psp_weighted_cycl, SubLObject stream, SubLObject depth)
  {
    if( stream == UNPROVIDED )
    {
      stream = NIL;
    }
    if( depth == UNPROVIDED )
    {
      depth = NIL;
    }
    PrintLow.format( stream, $str22$__PSP_WEIGHTED_CYCL__S__S_, psp_weighted_cycl_weight( psp_weighted_cycl ), psp_weighted_cycl_cycl( psp_weighted_cycl ) );
    return psp_weighted_cycl;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 1848L)
  public static SubLObject psp_weight_cycl(final SubLObject cycl, final SubLObject weight)
  {
    if( NIL != psp_weighted_cycl_p( cycl ) )
    {
      final SubLObject cycl_cycl = psp_cycl_cycl( cycl );
      final SubLObject cycl_weight = psp_cycl_weight( cycl );
      final SubLObject new_weight = psp_chart.psp_weight_compose_two( weight, cycl_weight );
      return new_psp_weighted_cycl( cycl_cycl, new_weight );
    }
    if( NIL != contains_psp_weighted_cycl_p( cycl ) )
    {
      Errors.sublisp_break( $str23$Weighting_CycL_with_weights_____S, new SubLObject[] { cycl
      } );
      return NIL;
    }
    return new_psp_weighted_cycl( cycl, weight );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 2288L)
  public static SubLObject psp_cycl_weight_L(final SubLObject cycl1, final SubLObject cycl2, SubLObject margin_of_error)
  {
    if( margin_of_error == UNPROVIDED )
    {
      margin_of_error = $float24$0_0;
    }
    return psp_chart.psp_weight_L( psp_cycl_weight( cycl1 ), psp_cycl_weight( cycl2 ), margin_of_error );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 2459L)
  public static SubLObject sort_psp_cycls_by_weight_ascending(final SubLObject cycls)
  {
    return Sort.sort( cycls, $sym25$PSP_CYCL_WEIGHT__, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 2562L)
  public static SubLObject psp_cycl_weight(final SubLObject cycl)
  {
    if( NIL != psp_weighted_cycl_p( cycl ) )
    {
      return psp_weighted_cycl_weight( cycl );
    }
    return parsing_utilities.psp_weight_from_float( $float26$1_0 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 2726L)
  public static SubLObject psp_cycl_cycl(final SubLObject cycl)
  {
    if( NIL != psp_weighted_cycl_p( cycl ) )
    {
      return psp_weighted_cycl_cycl( cycl );
    }
    return cycl;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 2863L)
  public static SubLObject psp_cycls_to_cycls(final SubLObject psp_cycls)
  {
    return Mapping.mapcar( $sym27$PSP_CYCL_CYCL, psp_cycls );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 2956L)
  public static SubLObject psp_cycl_E(final SubLObject cycl1, final SubLObject cycl2)
  {
    return Equality.equal( psp_cycl_cycl( cycl1 ), psp_cycl_cycl( cycl2 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 3061L)
  public static SubLObject new_psp_weighted_cycl(final SubLObject cycl, final SubLObject weight)
  {
    assert NIL != psp_chart.psp_weight_p( weight ) : weight;
    final SubLObject weighted_cycl = make_phrase_structure_parser_weighted_cycl( ConsesLow.list( $kw13$CYCL, cycl, $kw14$WEIGHT, weight ) );
    return weighted_cycl;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 3295L)
  public static SubLObject copy_psp_cycls(final SubLObject psp_cycls)
  {
    return Mapping.mapcar( $sym29$COPY_PSP_CYCL, psp_cycls );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 3382L)
  public static SubLObject copy_psp_cycl(final SubLObject psp_cycl)
  {
    final SubLObject cycl = psp_cycl_cycl( psp_cycl );
    final SubLObject weight = psp_cycl_weight( psp_cycl );
    return new_psp_weighted_cycl( cycl, weight );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 3552L)
  public static SubLObject psp_cycl_subst(final SubLObject in, final SubLObject out, final SubLObject cycl)
  {
    if( NIL != psp_weighted_cycl_p( cycl ) )
    {
      final SubLObject cycl_cycl = psp_cycl_cycl( cycl );
      final SubLObject subbed_psp_cycl = psp_cycl_subst( in, out, cycl_cycl );
      return psp_weight_cycl( subbed_psp_cycl, psp_cycl_weight( cycl ) );
    }
    if( NIL != psp_weighted_cycl_p( in ) )
    {
      final SubLObject in_cycl = psp_cycl_cycl( in );
      final SubLObject in_weight = psp_cycl_weight( in );
      final SubLObject subbed_cycl = psp_cycl_subst( in_cycl, out, cycl );
      return ( NIL != cycl_utilities.expression_find( in_cycl, subbed_cycl, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED ) ) ? psp_weight_cycl( subbed_cycl, in_weight ) : subbed_cycl;
    }
    return cycl_utilities.expression_subst( in, out, cycl, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 4139L)
  public static SubLObject psp_weighted_cycl_set_cycl(final SubLObject weighted_cycl, final SubLObject new_cycl)
  {
    _csetf_psp_weighted_cycl_cycl( weighted_cycl, new_cycl );
    return weighted_cycl;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 4291L)
  public static SubLObject psp_weighted_cycl_set_weight(final SubLObject weighted_cycl, final SubLObject new_weight)
  {
    _csetf_psp_weighted_cycl_weight( weighted_cycl, new_weight );
    return weighted_cycl;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 4451L)
  public static SubLObject psp_semantics_for_edge(final SubLObject edge, SubLObject denotP, SubLObject groundP)
  {
    if( denotP == UNPROVIDED )
    {
      denotP = T;
    }
    if( groundP == UNPROVIDED )
    {
      groundP = T;
    }
    assert NIL != Types.booleanp( denotP ) : denotP;
    assert NIL != Types.booleanp( groundP ) : groundP;
    final SubLObject output_type = psp_semantic_output_type( denotP, groundP );
    return psp_semantics_for_edge_int( edge, output_type );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 5106L)
  public static SubLObject psp_semantics_for_edge_int(final SubLObject edge, final SubLObject output_type)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject semx = NIL;
    final SubLObject computation_type = psp_semantic_computation_type( edge, output_type );
    if( !edge.eql( psp_mother_of_current_edge() ) )
    {
      $psp_context$.setDynamicValue( ConsesLow.cons( edge, $psp_context$.getDynamicValue( thread ) ), thread );
      try
      {
        semx = psp_compute_semantics( edge, computation_type, output_type );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          $psp_context$.setDynamicValue( $psp_context$.getDynamicValue( thread ).rest(), thread );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
      if( NIL != semx && NIL != parsing_vars.$npp_use_nl_tagsP$.getDynamicValue( thread ) && computation_type != $kw31$LOOKUP )
      {
        semx = psp_add_nl_tags( semx, edge );
      }
      SubLObject cdolist_list_var = semx;
      SubLObject new_cycl = NIL;
      new_cycl = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        psp_chart.psp_edge_add_cycl( edge, new_cycl, output_type );
        cdolist_list_var = cdolist_list_var.rest();
        new_cycl = cdolist_list_var.first();
      }
    }
    return semx;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 5729L)
  public static SubLObject psp_compute_semantics(final SubLObject edge, final SubLObject computation_type, final SubLObject output_type)
  {
    SubLObject semx = NIL;
    if( computation_type.eql( $kw31$LOOKUP ) )
    {
      semx = psp_filter_cycls_by_generality( psp_chart.psp_edge_lookup_semx( edge, output_type ) );
    }
    else if( computation_type.eql( $kw32$SPECIAL ) )
    {
      semx = psp_edge_special_semx( edge, output_type );
    }
    else if( computation_type.eql( $kw33$LEXICAL ) )
    {
      semx = psp_filter_cycls_by_generality( psp_edge_lexical_semx( edge, output_type ) );
    }
    else if( computation_type.eql( $kw34$UNARY ) )
    {
      semx = psp_edge_unary_semx( edge, output_type );
    }
    else if( computation_type.eql( $kw35$MULTI_DTR ) )
    {
      semx = psp_edge_multi_dtr_semx( edge, output_type );
    }
    if( NIL != semx && NIL != conses_high.member( output_type, $list36, UNPROVIDED, UNPROVIDED ) )
    {
      final SubLObject lexical_head_dtr = psp_chart.psp_edge_lexical_head_dtr( edge );
      final SubLObject cat = psp_chart.get_psp_edge_category( lexical_head_dtr );
      final SubLObject frame = psp_chart.get_psp_edge_frame( lexical_head_dtr );
      semx = psp_coerce_templates_to_collections( edge, semx, T, psp_head_key_for_category( cat, frame ) );
    }
    SubLObject cdolist_list_var = semx;
    SubLObject meaning = NIL;
    meaning = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      psp_parse_tree_generator.psp_edge_note_meaning_on_node_if_known( edge, psp_cycl_cycl( meaning ), UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      meaning = cdolist_list_var.first();
    }
    return semx;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 6905L)
  public static SubLObject psp_semantic_output_type(final SubLObject denotP, final SubLObject groundP)
  {
    if( NIL != denotP && NIL != groundP )
    {
      return $kw37$DENOT_GROUND;
    }
    if( NIL != denotP )
    {
      return $kw38$DENOT_TEMPLATE;
    }
    if( NIL != groundP )
    {
      return $kw39$PROP_GROUND;
    }
    return $kw40$PROP_TEMPLATE;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 7141L)
  public static SubLObject psp_template_form(final SubLObject output_type)
  {
    if( output_type.eql( $kw37$DENOT_GROUND ) || output_type.eql( $kw38$DENOT_TEMPLATE ) )
    {
      return $kw38$DENOT_TEMPLATE;
    }
    if( output_type.eql( $kw39$PROP_GROUND ) || output_type.eql( $kw40$PROP_TEMPLATE ) )
    {
      return $kw40$PROP_TEMPLATE;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 7396L)
  public static SubLObject psp_semantic_computation_type(final SubLObject edge, final SubLObject output_type)
  {
    if( NIL != psp_chart.psp_edge_semx_doneP( edge, output_type ) )
    {
      return $kw31$LOOKUP;
    }
    if( NIL != psp_edge_semx_specialP( edge, output_type ) )
    {
      return $kw32$SPECIAL;
    }
    if( NIL != psp_chart.psp_lexical_edgeP( edge ) )
    {
      return $kw33$LEXICAL;
    }
    if( psp_chart.psp_edge_dtr_count( edge ).isZero() )
    {
      return $kw33$LEXICAL;
    }
    if( ONE_INTEGER.numE( psp_chart.psp_edge_dtr_count( edge ) ) )
    {
      return $kw34$UNARY;
    }
    return $kw35$MULTI_DTR;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 7892L)
  public static SubLObject clear_psp_category_from_frame()
  {
    final SubLObject cs = $psp_category_from_frame_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 7892L)
  public static SubLObject remove_psp_category_from_frame(final SubLObject frame, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = parsing_utilities.psp_lexicon_root_mt( UNPROVIDED );
    }
    return memoization_state.caching_state_remove_function_results_with_args( $psp_category_from_frame_caching_state$.getGlobalValue(), ConsesLow.list( frame, mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 7892L)
  public static SubLObject psp_category_from_frame_internal(final SubLObject frame, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      if( NIL != isa.isaP( frame, $const42$GenericVerbPhraseModifyingFrame, UNPROVIDED, UNPROVIDED ) )
      {
        ans = $list43;
      }
      else if( NIL != isa.isaP( frame, $const44$NounPhraseModifyingFrame, UNPROVIDED, UNPROVIDED ) )
      {
        ans = $const45$NounPhrase;
      }
      else if( NIL != isa.isaP( frame, $const46$FrameForNouns, UNPROVIDED, UNPROVIDED ) )
      {
        ans = $const47$Noun;
      }
      else if( NIL != isa.isaP( frame, $const48$FrameForVerbs, UNPROVIDED, UNPROVIDED ) )
      {
        ans = $const49$Verb;
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 7892L)
  public static SubLObject psp_category_from_frame(final SubLObject frame, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = parsing_utilities.psp_lexicon_root_mt( UNPROVIDED );
    }
    SubLObject caching_state = $psp_category_from_frame_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym41$PSP_CATEGORY_FROM_FRAME, $sym50$_PSP_CATEGORY_FROM_FRAME_CACHING_STATE_, NIL, EQUAL, TWO_INTEGER, $int51$128 );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( frame, mt );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( frame.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && mt.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( psp_category_from_frame_internal( frame, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( frame, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 8519L)
  public static SubLObject psp_edge_lexical_semx(final SubLObject edge, final SubLObject output_type)
  {
    if( output_type.eql( $kw40$PROP_TEMPLATE ) || output_type.eql( $kw38$DENOT_TEMPLATE ) )
    {
      return psp_sem_templates_from_lexical_edge( edge );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 8805L)
  public static SubLObject psp_edge_unary_semx(final SubLObject edge, final SubLObject output_type)
  {
    final SubLObject head_dtr = psp_chart.get_psp_edge_head_dtr( edge );
    SubLObject cdolist_list_var;
    final SubLObject semx = cdolist_list_var = copy_psp_cycls( psp_semantics_for_edge_int( head_dtr, output_type ) );
    SubLObject meaning = NIL;
    meaning = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      psp_parse_tree_generator.psp_note_semantic_dependency( edge, meaning, head_dtr, meaning );
      cdolist_list_var = cdolist_list_var.rest();
      meaning = cdolist_list_var.first();
    }
    return semx;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 9211L)
  public static SubLObject psp_edge_multi_dtr_semx(final SubLObject edge, final SubLObject output_type)
  {
    SubLObject semx = NIL;
    final SubLObject rule_struct = psp_chart.psp_edge_rule_struct( edge );
    final SubLObject syn_head_dtr_num = psp_chart.psp_edge_head_dtr_num( edge );
    final SubLObject rule_fort = psp_chart.psp_edge_rule_fort( edge );
    final SubLObject rule_semx = psp_rules.psp_rule_semx( rule_struct );
    final SubLObject semx_type = rule_semx.first();
    final SubLObject semx_args = rule_semx.rest();
    final SubLObject semx_head_dtr_num = semx_args.first();
    final SubLObject semx_head_dtr = semx_head_dtr_num.isInteger() ? psp_chart.psp_edge_nth_dtr( semx_head_dtr_num, edge ) : NIL;
    final SubLObject semx_head_dtr_cat = ( NIL != semx_head_dtr ) ? psp_chart.get_psp_edge_category( psp_chart.psp_edge_lexical_head_dtr( semx_head_dtr ) ) : NIL;
    final SubLObject syn_headP = Equality.eql( syn_head_dtr_num, semx_head_dtr_num );
    if( semx_type == $kw52$IDENTITY )
    {
      return copy_psp_cycls( psp_semantics_for_edge_int( semx_head_dtr, $kw37$DENOT_GROUND ) );
    }
    final SubLObject raw_bindings = ( NIL != list_utilities.lengthG( semx_args, ONE_INTEGER, UNPROVIDED ) ) ? semx_args.rest() : ( ( NIL != semx_head_dtr ) ? psp_chart.psp_bindings_from_head( semx_head_dtr ) : NIL );
    final SubLObject template_type = ( NIL != psp_modifier_dtrP( semx_head_dtr, edge ) ) ? psp_semantic_output_type( NIL, NIL ) : psp_template_form( output_type );
    SubLObject templates = ( NIL != semx_head_dtr ) ? psp_semantics_for_edge_int( semx_head_dtr, template_type ) : NIL;
    final SubLObject head_key = psp_head_key_from_bindings( raw_bindings, syn_head_dtr_num );
    if( NIL != templates && NIL != head_key && !semx_head_dtr_cat.eql( $const53$Adverb ) )
    {
      templates = psp_coerce_templates_to_collections( semx_head_dtr, templates, syn_headP, head_key );
    }
    if( NIL == templates )
    {
      if( NIL != psp_rules.psp_traced_ruleP( rule_fort ) )
      {
        PrintLow.format( T, $str54$No_templates_for__S___, edge );
      }
    }
    else
    {
      final SubLObject ppb_result = psp_process_bindings( raw_bindings, edge, rule_struct, output_type );
      if( ppb_result != $kw55$NON_WFF )
      {
        SubLObject cdolist_list_var = templates;
        SubLObject template = NIL;
        template = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL != ppb_result )
          {
            SubLObject cdolist_list_var_$1 = ppb_result;
            SubLObject v_bindings = NIL;
            v_bindings = cdolist_list_var_$1.first();
            while ( NIL != cdolist_list_var_$1)
            {
              final SubLObject result = psp_substitute_bindings( template, v_bindings, head_key );
              if( result != $kw55$NON_WFF )
              {
                semx = ConsesLow.cons( result, semx );
                SubLObject cdolist_list_var_$2;
                final SubLObject dependencies = cdolist_list_var_$2 = psp_determine_semantic_dependencies( template, v_bindings, raw_bindings );
                SubLObject cons = NIL;
                cons = cdolist_list_var_$2.first();
                while ( NIL != cdolist_list_var_$2)
                {
                  SubLObject current;
                  final SubLObject datum = current = cons;
                  SubLObject dtr_num = NIL;
                  SubLObject dtr_semx = NIL;
                  cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list56 );
                  dtr_num = current.first();
                  current = ( dtr_semx = current.rest() );
                  final SubLObject dtr = psp_chart.psp_edge_nth_dtr( dtr_num, edge );
                  psp_parse_tree_generator.psp_note_semantic_dependency( edge, result, dtr, dtr_semx );
                  psp_parse_tree_generator.psp_note_semantic_dependency( edge, result, semx_head_dtr, template );
                  cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                  cons = cdolist_list_var_$2.first();
                }
              }
              cdolist_list_var_$1 = cdolist_list_var_$1.rest();
              v_bindings = cdolist_list_var_$1.first();
            }
          }
          else
          {
            semx = ConsesLow.cons( template, semx );
          }
          cdolist_list_var = cdolist_list_var.rest();
          template = cdolist_list_var.first();
        }
      }
    }
    if( NIL == semx && NIL != psp_rules.psp_traced_ruleP( rule_fort ) )
    {
      PrintLow.format( T, $str57$__Couldn_t_find_template_semx_for, psp_chart.get_psp_edge_string( edge ), rule_fort );
    }
    return semx;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 12432L)
  public static SubLObject psp_determine_semantic_dependencies(final SubLObject template, final SubLObject v_bindings, final SubLObject raw_bindings)
  {
    SubLObject dependencies = NIL;
    SubLObject cdolist_list_var;
    final SubLObject keys = cdolist_list_var = cycl_utilities.expression_gather( template, Symbols.symbol_function( $sym58$KEYWORDP ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject key = NIL;
    key = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject dtr_num = NIL;
      SubLObject dtr_semx = NIL;
      if( NIL == dtr_semx )
      {
        SubLObject csome_list_var = v_bindings;
        SubLObject binding = NIL;
        binding = csome_list_var.first();
        while ( NIL == dtr_semx && NIL != csome_list_var)
        {
          SubLObject current;
          final SubLObject datum = current = binding;
          SubLObject binding_semx = NIL;
          SubLObject binding_key = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list59 );
          binding_semx = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list59 );
          binding_key = current.first();
          current = current.rest();
          if( NIL == current )
          {
            if( binding_key.eql( key ) )
            {
              dtr_semx = binding_semx;
            }
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( datum, $list59 );
          }
          csome_list_var = csome_list_var.rest();
          binding = csome_list_var.first();
        }
      }
      if( NIL == dtr_num )
      {
        SubLObject csome_list_var = raw_bindings;
        SubLObject binding = NIL;
        binding = csome_list_var.first();
        while ( NIL == dtr_num && NIL != csome_list_var)
        {
          SubLObject current;
          final SubLObject datum = current = binding;
          SubLObject level = NIL;
          SubLObject binding_dtr_num = NIL;
          SubLObject binding_key2 = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list60 );
          level = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list60 );
          binding_dtr_num = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list60 );
          binding_key2 = current.first();
          current = current.rest();
          if( NIL == current )
          {
            if( binding_key2.eql( key ) )
            {
              dtr_num = binding_dtr_num;
            }
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( datum, $list60 );
          }
          csome_list_var = csome_list_var.rest();
          binding = csome_list_var.first();
        }
      }
      if( NIL != dtr_num && NIL != dtr_semx )
      {
        dependencies = list_utilities.alist_enter( dependencies, dtr_num, dtr_semx, UNPROVIDED );
      }
      cdolist_list_var = cdolist_list_var.rest();
      key = cdolist_list_var.first();
    }
    return dependencies;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 13532L)
  public static SubLObject psp_semx_slurp_handlers(SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = parsing_vars.$psp_rule_lookup_mt$.getGlobalValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    psp_semx_clear_handlers();
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      final SubLObject pred_var = $const62$psRuleSemanticsHandler;
      if( NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( pred_var ) )
      {
        final SubLObject str = NIL;
        final SubLObject _prev_bind_0_$3 = utilities_macros.$progress_start_time$.currentBinding( thread );
        final SubLObject _prev_bind_1_$4 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
        final SubLObject _prev_bind_2_$5 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
        final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding( thread );
        final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding( thread );
        final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding( thread );
        final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding( thread );
        final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding( thread );
        try
        {
          utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
          utilities_macros.$progress_last_pacification_time$.bind( utilities_macros.$progress_start_time$.getDynamicValue( thread ), thread );
          utilities_macros.$progress_elapsed_seconds_for_notification$.bind( utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue( thread ), thread );
          utilities_macros.$progress_notification_count$.bind( ZERO_INTEGER, thread );
          utilities_macros.$progress_pacifications_since_last_nl$.bind( ZERO_INTEGER, thread );
          utilities_macros.$progress_count$.bind( ZERO_INTEGER, thread );
          utilities_macros.$is_noting_progressP$.bind( T, thread );
          utilities_macros.$silent_progressP$.bind( ( NIL != str ) ? utilities_macros.$silent_progressP$.getDynamicValue( thread ) : T, thread );
          utilities_macros.noting_progress_preamble( str );
          final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator( pred_var );
          SubLObject done_var = NIL;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
            if( NIL != valid )
            {
              utilities_macros.note_progress();
              SubLObject final_index_iterator = NIL;
              try
              {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw63$GAF, NIL, NIL );
                SubLObject done_var_$6 = NIL;
                final SubLObject token_var_$7 = NIL;
                while ( NIL == done_var_$6)
                {
                  final SubLObject as = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$7 );
                  final SubLObject valid_$8 = makeBoolean( !token_var_$7.eql( as ) );
                  if( NIL != valid_$8 )
                  {
                    SubLObject current;
                    final SubLObject datum = current = assertions_high.gaf_args( as );
                    SubLObject rule = NIL;
                    SubLObject method = NIL;
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list64 );
                    rule = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list64 );
                    method = current.first();
                    current = current.rest();
                    if( NIL == current )
                    {
                      method = el_utilities.cycl_subl_symbol_symbol( method );
                      if( NIL != Symbols.fboundp( method ) )
                      {
                        dictionary_utilities.dictionary_push( $psp_special_semantic_methods$.getGlobalValue(), $kw37$DENOT_GROUND, ConsesLow.list( rule, method ) );
                      }
                    }
                    else
                    {
                      cdestructuring_bind.cdestructuring_bind_error( datum, $list64 );
                    }
                  }
                  done_var_$6 = makeBoolean( NIL == valid_$8 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values = Values.getValuesAsVector();
                  if( NIL != final_index_iterator )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                  }
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$4, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
          utilities_macros.noting_progress_postamble();
        }
        finally
        {
          utilities_macros.$silent_progressP$.rebind( _prev_bind_8, thread );
          utilities_macros.$is_noting_progressP$.rebind( _prev_bind_7, thread );
          utilities_macros.$progress_count$.rebind( _prev_bind_6, thread );
          utilities_macros.$progress_pacifications_since_last_nl$.rebind( _prev_bind_5, thread );
          utilities_macros.$progress_notification_count$.rebind( _prev_bind_4, thread );
          utilities_macros.$progress_elapsed_seconds_for_notification$.rebind( _prev_bind_2_$5, thread );
          utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_1_$4, thread );
          utilities_macros.$progress_start_time$.rebind( _prev_bind_0_$3, thread );
        }
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    dictionary.dictionary_enter( $psp_special_semantic_methods$.getGlobalValue(), $kw65$INIT_STATE, $kw66$INITIALIZED );
    return $psp_special_semantic_methods$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 14075L)
  public static SubLObject psp_semx_clear_handlers()
  {
    return dictionary.clear_dictionary( $psp_special_semantic_methods$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 14180L)
  public static SubLObject psp_special_methods_for_output_type(final SubLObject output_type)
  {
    if( dictionary.dictionary_lookup( $psp_special_semantic_methods$.getGlobalValue(), $kw65$INIT_STATE, UNPROVIDED ) != $kw66$INITIALIZED )
    {
      psp_semx_slurp_handlers( UNPROVIDED );
    }
    return dictionary.dictionary_lookup( $psp_special_semantic_methods$.getGlobalValue(), output_type, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 14442L)
  public static SubLObject psp_edge_semx_specialP(final SubLObject edge, final SubLObject output_type)
  {
    return list_utilities.sublisp_boolean( psp_edge_special_method( edge, output_type ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 14679L)
  public static SubLObject psp_edge_special_method(final SubLObject edge, final SubLObject output_type)
  {
    SubLObject method = NIL;
    if( NIL == method )
    {
      SubLObject csome_list_var = psp_special_methods_for_output_type( output_type );
      SubLObject pair = NIL;
      pair = csome_list_var.first();
      while ( NIL == method && NIL != csome_list_var)
      {
        SubLObject current;
        final SubLObject datum = current = pair;
        SubLObject rule = NIL;
        SubLObject this_method = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list67 );
        rule = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list67 );
        this_method = current.first();
        current = current.rest();
        if( NIL == current )
        {
          if( psp_chart.psp_edge_rule_fort( edge ).eql( rule ) )
          {
            method = this_method;
          }
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list67 );
        }
        csome_list_var = csome_list_var.rest();
        pair = csome_list_var.first();
      }
    }
    return method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 14981L)
  public static SubLObject psp_edge_special_semx(final SubLObject edge, final SubLObject output_type)
  {
    final SubLObject method = psp_edge_special_method( edge, output_type );
    if( NIL != Symbols.fboundp( method ) )
    {
      return Functions.funcall( method, edge );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 15166L)
  public static SubLObject psp_semx_for_participle_rel_clause_nbar(final SubLObject edge)
  {
    final SubLObject cycls = NIL;
    final SubLObject nbar = psp_chart.psp_edge_nth_dtr( ONE_INTEGER, edge );
    final SubLObject nbar_cycls = psp_semantics_for_edge_int( nbar, $kw37$DENOT_GROUND );
    final SubLObject participle = psp_chart.psp_edge_nth_dtr( TWO_INTEGER, edge );
    final SubLObject participle_templates = psp_semantics_for_edge_int( participle, $kw38$DENOT_TEMPLATE );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 15624L)
  public static SubLObject psp_semx_for_det_nbar(final SubLObject edge)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject cycls = NIL;
    final SubLObject detp = psp_chart.psp_edge_nth_dtr( ONE_INTEGER, edge );
    final SubLObject det_pos = psp_chart.get_psp_edge_category( psp_chart.psp_edge_lexical_head_dtr( detp ) );
    final SubLObject nbar = psp_chart.psp_edge_nth_dtr( TWO_INTEGER, edge );
    final SubLObject nbar_cycls = psp_semantics_for_edge_int( nbar, $kw37$DENOT_GROUND );
    if( NIL != psp_possessive_det_posP( det_pos ) )
    {
      SubLObject cdolist_list_var = psp_semantics_for_edge_int( detp, $kw37$DENOT_GROUND );
      SubLObject det_denot = NIL;
      det_denot = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject weightless_det_denot = psp_cycl_cycl( det_denot );
        SubLObject cdolist_list_var_$10 = copy_psp_cycls( nbar_cycls );
        SubLObject nbar_denot = NIL;
        nbar_denot = cdolist_list_var_$10.first();
        while ( NIL != cdolist_list_var_$10)
        {
          final SubLObject weightless_nbar_denot = psp_cycl_cycl( nbar_denot );
          final SubLObject tagless_weightless_nbar_denot = parsing_utilities.strip_nl_tags( weightless_nbar_denot, T );
          if( NIL != psp_collectionP( tagless_weightless_nbar_denot ) )
          {
            final SubLObject number_tag = ( NIL != parsing_utilities.nl_tagged_termP( weightless_nbar_denot ) && cycl_utilities.nat_function( weightless_nbar_denot ).eql( $const68$NLNumberFn ) ) ? cycl_utilities
                .nat_arg1( weightless_nbar_denot, UNPROVIDED ) : NIL;
            final SubLObject template = $list69;
            final SubLObject v_bindings = ConsesLow.list( ConsesLow.list( tagless_weightless_nbar_denot, $kw70$NBAR ), ConsesLow.list( weightless_det_denot, $kw71$DET ) );
            SubLObject result = psp_substitute_bindings( template, v_bindings, $kw70$NBAR );
            if( result != $kw55$NON_WFF )
            {
              if( NIL != number_tag )
              {
                result = ConsesLow.list( $const68$NLNumberFn, number_tag, result );
              }
              final SubLObject item_var = result;
              if( NIL == conses_high.member( item_var, cycls, EQUAL, Symbols.symbol_function( IDENTITY ) ) )
              {
                cycls = ConsesLow.cons( item_var, cycls );
              }
            }
          }
          cdolist_list_var_$10 = cdolist_list_var_$10.rest();
          nbar_denot = cdolist_list_var_$10.first();
        }
        cdolist_list_var = cdolist_list_var.rest();
        det_denot = cdolist_list_var.first();
      }
    }
    else if( NIL == parsing_vars.$npp_use_nl_tagsP$.getDynamicValue( thread ) )
    {
      SubLObject cdolist_list_var = nbar_cycls;
      SubLObject nbar_denot2 = NIL;
      nbar_denot2 = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject weightless_nbar_denot2 = psp_cycl_cycl( nbar_denot2 );
        SubLObject cdolist_list_var_$11 = psp_semantics_for_edge_int( detp, $kw37$DENOT_GROUND );
        SubLObject det_denot2 = NIL;
        det_denot2 = cdolist_list_var_$11.first();
        while ( NIL != cdolist_list_var_$11)
        {
          final SubLObject weightless_det_denot2 = psp_cycl_cycl( det_denot2 );
          if( NIL != at_defns.quiet_has_typeP( weightless_det_denot2, $const72$NLDefinitenessAttribute, UNPROVIDED ) )
          {
            final SubLObject item_var2 = weightless_nbar_denot2;
            if( NIL == conses_high.member( item_var2, cycls, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              cycls = ConsesLow.cons( item_var2, cycls );
            }
          }
          else if( NIL == parsing_utilities.nl_tagP( weightless_det_denot2, UNPROVIDED ) )
          {
            if( NIL == lexicon_utilities.det_denot_is_scalar_intervalP( weightless_det_denot2 ) )
            {
              final SubLObject item_var2 = weightless_nbar_denot2;
              if( NIL == conses_high.member( item_var2, cycls, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
              {
                cycls = ConsesLow.cons( item_var2, cycls );
              }
            }
            else if( NIL != at_defns.quiet_has_typeP( weightless_nbar_denot2, $const73$ScalarInterval, UNPROVIDED ) )
            {
              SubLObject math = ConsesLow.list( $const74$TimesFn, weightless_det_denot2, weightless_nbar_denot2 );
              thread.resetMultipleValues();
              final SubLObject evaluated = relation_evaluation.cyc_evaluate( math );
              final SubLObject evaluatedP = thread.secondMultipleValue();
              thread.resetMultipleValues();
              if( NIL != evaluatedP )
              {
                math = evaluated;
              }
              final SubLObject item_var3 = math;
              if( NIL == conses_high.member( item_var3, cycls, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
              {
                cycls = ConsesLow.cons( item_var3, cycls );
              }
            }
            else if( NIL != subl_promotions.positive_integer_p( weightless_det_denot2 ) && NIL != fort_types_interface.collection_in_any_mtP( weightless_nbar_denot2 ) )
            {
              cycls = ConsesLow.cons( el_utilities.make_binary_formula( $const75$GroupOfCardinalityFn, weightless_nbar_denot2, weightless_det_denot2 ), cycls );
            }
            else if( NIL != isa.isa_in_any_mtP( weightless_nbar_denot2, $const76$UnitOfMeasure ) )
            {
              cycls = ConsesLow.cons( el_utilities.make_unary_formula( weightless_nbar_denot2, weightless_det_denot2 ), cycls );
            }
          }
          cdolist_list_var_$11 = cdolist_list_var_$11.rest();
          det_denot2 = cdolist_list_var_$11.first();
        }
        cdolist_list_var = cdolist_list_var.rest();
        nbar_denot2 = cdolist_list_var.first();
      }
    }
    else
    {
      cycls = copy_psp_cycls( nbar_cycls );
    }
    return cycls;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 18500L)
  public static SubLObject psp_possessive_det_posP(final SubLObject category)
  {
    return makeBoolean( NIL != psp_genl_posP( category, $const77$PossessivePronoun_Pre, UNPROVIDED ) || NIL != psp_genl_posP( category, $const78$PossessiveMarker_Sg, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 18758L)
  public static SubLObject psp_semx_for_of_noun_compound(final SubLObject edge)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = parsing_vars.$psp_generality_preference$.currentBinding( thread );
    try
    {
      parsing_vars.$psp_generality_preference$.bind( $kw79$NONE, thread );
      final SubLObject dtr1 = psp_chart.psp_edge_nth_dtr( ONE_INTEGER, edge );
      final SubLObject dtr2 = psp_chart.psp_edge_nth_dtr( TWO_INTEGER, edge );
      final SubLObject of_phraseP = makeBoolean( NIL != dtr2 && NIL != psp_chart.psp_edge_nth_dtr( ONE_INTEGER, dtr2 ) && psp_chart.get_psp_edge_string( psp_chart.psp_edge_nth_dtr( ONE_INTEGER, dtr2 ) ).equal(
          $str80$of ) );
      final SubLObject np_dtr = ( NIL != of_phraseP ) ? psp_chart.psp_edge_nth_dtr( TWO_INTEGER, dtr2 ) : NIL;
      if( NIL == psp_chart.psp_gap_edge_p( dtr1 ) && NIL == psp_chart.psp_gap_edge_p( dtr2 ) && NIL != np_dtr )
      {
        final SubLObject value_type = ( NIL != parsing_vars.$rbp_include_word_unitsP$.getDynamicValue( thread ) ) ? $kw81$QUADS : $kw82$TRIPLES;
        final SubLObject tokens1 = rbp_tokens_from_edge( dtr1, value_type );
        final SubLObject tokens2 = rbp_tokens_from_edge( np_dtr, value_type );
        SubLObject timed_outP = parsing_macros.parsing_timeout_time_reachedP();
        if( NIL == psp_regular_pluralP( psp_chart.get_psp_edge_string( dtr1 ), psp_chart.get_psp_edge_pos_pred( dtr1 ) ) && NIL == psp_closed_class_edge_likely_misconstrued_as_nameP( dtr1 )
            && NIL == psp_closed_class_edge_likely_misconstrued_as_nameP( np_dtr ) && NIL == timed_outP )
        {
          SubLObject csome_list_var = tokens1;
          SubLObject token1 = NIL;
          token1 = csome_list_var.first();
          while ( NIL == timed_outP && NIL != csome_list_var)
          {
            if( NIL == timed_outP )
            {
              SubLObject csome_list_var_$12 = tokens2;
              SubLObject token2 = NIL;
              token2 = csome_list_var_$12.first();
              while ( NIL == timed_outP && NIL != csome_list_var_$12)
              {
                final SubLObject tokens3 = ConsesLow.list( token2, token1 );
                SubLObject best = NIL;
                SubLObject rest = NIL;
                SubLObject time = NIL;
                final SubLObject time_var = Time.get_internal_real_time();
                thread.resetMultipleValues();
                final SubLObject best_$13 = psp_parse_noun_compound_tokens( tokens3 );
                final SubLObject rest_$14 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                best = best_$13;
                rest = rest_$14;
                time = Numbers.divide( Numbers.subtract( Time.get_internal_real_time(), time_var ), time_high.$internal_time_units_per_second$.getGlobalValue() );
                if( NIL != parsing_vars.$psp_verboseP$.getDynamicValue( thread ) && time.numG( $float83$0_1 ) )
                {
                  Errors.warn( $str84$Parsed__S_in__S_seconds_, tokens3, time );
                }
                if( parsing_vars.$psp_return_mode$.getDynamicValue( thread ) != $kw85$BEST_ONLY )
                {
                  final SubLObject dispreferred_weight = parsing_utilities.psp_weight_from_float( $float86$0_8 );
                  SubLObject cdolist_list_var = rest;
                  SubLObject annotated_parse = NIL;
                  annotated_parse = cdolist_list_var.first();
                  while ( NIL != cdolist_list_var)
                  {
                    SubLObject current;
                    final SubLObject datum = current = annotated_parse;
                    SubLObject parse = NIL;
                    SubLObject comments = NIL;
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list87 );
                    parse = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list87 );
                    comments = current.first();
                    current = current.rest();
                    if( NIL == current )
                    {
                      SubLObject current_$16;
                      final SubLObject datum_$15 = current_$16 = parse;
                      SubLObject cycl = NIL;
                      SubLObject pos_pred = NIL;
                      cdestructuring_bind.destructuring_bind_must_consp( current_$16, datum_$15, $list88 );
                      cycl = current_$16.first();
                      current_$16 = current_$16.rest();
                      cdestructuring_bind.destructuring_bind_must_consp( current_$16, datum_$15, $list88 );
                      pos_pred = current_$16.first();
                      current_$16 = current_$16.rest();
                      if( NIL == current_$16 )
                      {
                        final SubLObject weighted_cycl = new_psp_weighted_cycl( cycl, dispreferred_weight );
                        ans = ConsesLow.cons( weighted_cycl, ans );
                      }
                      else
                      {
                        cdestructuring_bind.cdestructuring_bind_error( datum_$15, $list88 );
                      }
                    }
                    else
                    {
                      cdestructuring_bind.cdestructuring_bind_error( datum, $list87 );
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    annotated_parse = cdolist_list_var.first();
                  }
                }
                SubLObject cdolist_list_var2 = best;
                SubLObject parse2 = NIL;
                parse2 = cdolist_list_var2.first();
                while ( NIL != cdolist_list_var2)
                {
                  SubLObject current2;
                  final SubLObject datum2 = current2 = parse2;
                  SubLObject cycl2 = NIL;
                  SubLObject pos_pred2 = NIL;
                  cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list88 );
                  cycl2 = current2.first();
                  current2 = current2.rest();
                  cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list88 );
                  pos_pred2 = current2.first();
                  current2 = current2.rest();
                  if( NIL == current2 )
                  {
                    ans = ConsesLow.cons( cycl2, ans );
                  }
                  else
                  {
                    cdestructuring_bind.cdestructuring_bind_error( datum2, $list88 );
                  }
                  cdolist_list_var2 = cdolist_list_var2.rest();
                  parse2 = cdolist_list_var2.first();
                }
                timed_outP = parsing_macros.parsing_timeout_time_reachedP();
                csome_list_var_$12 = csome_list_var_$12.rest();
                token2 = csome_list_var_$12.first();
              }
            }
            csome_list_var = csome_list_var.rest();
            token1 = csome_list_var.first();
          }
        }
      }
    }
    finally
    {
      parsing_vars.$psp_generality_preference$.rebind( _prev_bind_0, thread );
    }
    return psp_filter_cycls_by_generality( ans );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 20821L)
  public static SubLObject psp_semx_for_noun_compound(final SubLObject edge)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = parsing_vars.$psp_generality_preference$.currentBinding( thread );
    try
    {
      parsing_vars.$psp_generality_preference$.bind( $kw79$NONE, thread );
      final SubLObject dtr1 = psp_chart.psp_edge_nth_dtr( ONE_INTEGER, edge );
      final SubLObject dtr2 = psp_chart.psp_edge_nth_dtr( TWO_INTEGER, edge );
      if( NIL == psp_chart.psp_gap_edge_p( dtr1 ) && NIL == psp_chart.psp_gap_edge_p( dtr2 ) )
      {
        final SubLObject value_type = ( NIL != parsing_vars.$rbp_include_word_unitsP$.getDynamicValue( thread ) ) ? $kw81$QUADS : $kw82$TRIPLES;
        final SubLObject tokens1 = rbp_tokens_from_edge( dtr1, value_type );
        final SubLObject tokens2 = rbp_tokens_from_edge( dtr2, value_type );
        SubLObject timed_outP = parsing_macros.parsing_timeout_time_reachedP();
        if( NIL == psp_regular_pluralP( psp_chart.get_psp_edge_string( dtr1 ), psp_chart.get_psp_edge_pos_pred( dtr1 ) ) && NIL == psp_closed_class_edge_likely_misconstrued_as_nameP( dtr1 )
            && NIL == psp_closed_class_edge_likely_misconstrued_as_nameP( dtr2 ) && NIL == timed_outP )
        {
          SubLObject csome_list_var = tokens1;
          SubLObject token1 = NIL;
          token1 = csome_list_var.first();
          while ( NIL == timed_outP && NIL != csome_list_var)
          {
            if( NIL == timed_outP )
            {
              SubLObject csome_list_var_$17 = tokens2;
              SubLObject token2 = NIL;
              token2 = csome_list_var_$17.first();
              while ( NIL == timed_outP && NIL != csome_list_var_$17)
              {
                final SubLObject _prev_bind_0_$18 = parsing_vars.$rbp_reformulate_resultsP$.currentBinding( thread );
                try
                {
                  parsing_vars.$rbp_reformulate_resultsP$.bind( NIL, thread );
                  final SubLObject tokens3 = ConsesLow.list( token1, token2 );
                  SubLObject best = NIL;
                  SubLObject rest = NIL;
                  SubLObject time = NIL;
                  final SubLObject time_var = Time.get_internal_real_time();
                  thread.resetMultipleValues();
                  final SubLObject best_$19 = psp_parse_noun_compound_tokens( tokens3 );
                  final SubLObject rest_$20 = thread.secondMultipleValue();
                  thread.resetMultipleValues();
                  best = best_$19;
                  rest = rest_$20;
                  time = Numbers.divide( Numbers.subtract( Time.get_internal_real_time(), time_var ), time_high.$internal_time_units_per_second$.getGlobalValue() );
                  if( NIL != parsing_vars.$psp_verboseP$.getDynamicValue( thread ) && time.numG( $float83$0_1 ) )
                  {
                    Errors.warn( $str84$Parsed__S_in__S_seconds_, tokens3, time );
                  }
                  if( parsing_vars.$psp_return_mode$.getDynamicValue( thread ) != $kw85$BEST_ONLY )
                  {
                    final SubLObject dispreferred_weight = parsing_utilities.psp_weight_from_float( $float86$0_8 );
                    SubLObject cdolist_list_var = rest;
                    SubLObject annotated_parse = NIL;
                    annotated_parse = cdolist_list_var.first();
                    while ( NIL != cdolist_list_var)
                    {
                      SubLObject current;
                      final SubLObject datum = current = annotated_parse;
                      SubLObject parse = NIL;
                      SubLObject comments = NIL;
                      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list87 );
                      parse = current.first();
                      current = current.rest();
                      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list87 );
                      comments = current.first();
                      current = current.rest();
                      if( NIL == current )
                      {
                        SubLObject current_$22;
                        final SubLObject datum_$21 = current_$22 = parse;
                        SubLObject cycl = NIL;
                        SubLObject pos_pred = NIL;
                        cdestructuring_bind.destructuring_bind_must_consp( current_$22, datum_$21, $list88 );
                        cycl = current_$22.first();
                        current_$22 = current_$22.rest();
                        cdestructuring_bind.destructuring_bind_must_consp( current_$22, datum_$21, $list88 );
                        pos_pred = current_$22.first();
                        current_$22 = current_$22.rest();
                        if( NIL == current_$22 )
                        {
                          final SubLObject weighted_cycl = new_psp_weighted_cycl( cycl, dispreferred_weight );
                          ans = ConsesLow.cons( weighted_cycl, ans );
                        }
                        else
                        {
                          cdestructuring_bind.cdestructuring_bind_error( datum_$21, $list88 );
                        }
                      }
                      else
                      {
                        cdestructuring_bind.cdestructuring_bind_error( datum, $list87 );
                      }
                      cdolist_list_var = cdolist_list_var.rest();
                      annotated_parse = cdolist_list_var.first();
                    }
                  }
                  SubLObject cdolist_list_var2 = best;
                  SubLObject parse2 = NIL;
                  parse2 = cdolist_list_var2.first();
                  while ( NIL != cdolist_list_var2)
                  {
                    SubLObject current2;
                    final SubLObject datum2 = current2 = parse2;
                    SubLObject cycl2 = NIL;
                    SubLObject pos_pred2 = NIL;
                    cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list88 );
                    cycl2 = current2.first();
                    current2 = current2.rest();
                    cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list88 );
                    pos_pred2 = current2.first();
                    current2 = current2.rest();
                    if( NIL == current2 )
                    {
                      ans = ConsesLow.cons( cycl2, ans );
                    }
                    else
                    {
                      cdestructuring_bind.cdestructuring_bind_error( datum2, $list88 );
                    }
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    parse2 = cdolist_list_var2.first();
                  }
                }
                finally
                {
                  parsing_vars.$rbp_reformulate_resultsP$.rebind( _prev_bind_0_$18, thread );
                }
                timed_outP = parsing_macros.parsing_timeout_time_reachedP();
                csome_list_var_$17 = csome_list_var_$17.rest();
                token2 = csome_list_var_$17.first();
              }
            }
            csome_list_var = csome_list_var.rest();
            token1 = csome_list_var.first();
          }
        }
      }
    }
    finally
    {
      parsing_vars.$psp_generality_preference$.rebind( _prev_bind_0, thread );
    }
    return psp_filter_cycls_by_generality( ans );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 22691L)
  public static SubLObject rbp_tokens_from_edge(final SubLObject edge, final SubLObject value_type)
  {
    final SubLObject string = psp_chart.get_psp_edge_string( edge );
    final SubLObject pos = psp_chart.get_psp_edge_category( edge );
    final SubLObject wu = psp_chart.get_psp_edge_wu( edge );
    final SubLObject pred = psp_chart.get_psp_edge_pos_pred( edge );
    final SubLObject cycls = psp_semantics_for_edge_int( edge, $kw37$DENOT_GROUND );
    SubLObject tokens = NIL;
    SubLObject cdolist_list_var = ConsesLow.cons( $kw89$NO_DENOT, cycls );
    SubLObject cycl = NIL;
    cycl = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject my_value_type = np_parser.make_npp_value_type( value_type, psp_cycl_cycl( cycl ), pos, pred, wu );
      final SubLObject s_token = standard_tokenization.new_string_token( string, ConsesLow.list( my_value_type ) );
      tokens = ConsesLow.cons( s_token, tokens );
      cdolist_list_var = cdolist_list_var.rest();
      cycl = cdolist_list_var.first();
    }
    return tokens;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 23222L)
  public static SubLObject psp_regular_pluralP(final SubLObject string, final SubLObject pred)
  {
    final SubLObject regularP = makeBoolean( NIL != lexicon_accessors.speech_part_predP( pred, UNPROVIDED ) && NIL != nl_trie_accessors.nl_trie_regular_formP( string, pred, UNPROVIDED ) && NIL != lexicon_accessors
        .genl_pos_predP( pred, $const90$plural_Generic, UNPROVIDED ) );
    return regularP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 23489L)
  public static SubLObject psp_closed_class_edge_likely_misconstrued_as_nameP(final SubLObject edge)
  {
    return psp_closed_class_likely_misconstrued_as_nameP( psp_chart.get_psp_edge_string( edge ), psp_chart.get_psp_edge_category( edge ), psp_chart.get_psp_edge_pos_pred( edge ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 23709L)
  public static SubLObject psp_closed_class_likely_misconstrued_as_nameP(final SubLObject string, final SubLObject pos, final SubLObject pred)
  {
    return makeBoolean( NIL != lexicon_accessors.closed_lexical_class_stringP( string, UNPROVIDED ) && NIL == Sequences.find_if( $sym91$UPPER_CASE_P, string, UNPROVIDED, UNPROVIDED, UNPROVIDED )
        && NIL != lexicon_accessors.npP( pos ) && NIL != lexicon_vars.name_string_predP( pred ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 23995L)
  public static SubLObject psp_parse_noun_compound_tokens_internal(final SubLObject tokens)
  {
    return noun_compound_parser.parse_noun_compound_from_string_tokens( tokens, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 23995L)
  public static SubLObject psp_parse_noun_compound_tokens(final SubLObject tokens)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return psp_parse_noun_compound_tokens_internal( tokens );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym92$PSP_PARSE_NOUN_COMPOUND_TOKENS, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym92$PSP_PARSE_NOUN_COMPOUND_TOKENS, ONE_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym92$PSP_PARSE_NOUN_COMPOUND_TOKENS, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, tokens, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( psp_parse_noun_compound_tokens_internal( tokens ) ) );
      memoization_state.caching_state_put( caching_state, tokens, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 24127L)
  public static SubLObject psp_semx_for_gerund_np(final SubLObject edge)
  {
    final SubLObject vbar_semx = psp_semantics_for_edge_int( psp_chart.get_psp_edge_head_dtr( edge ), $kw38$DENOT_TEMPLATE );
    final SubLObject simplified_vbar_semx = Mapping.mapcar( $sym93$PSP_EXTRACT_SUBJECT_SEMX, vbar_semx );
    final SubLObject semx = Mapping.mapcar( $sym94$PSP_QUANTIFY_SUBJECT, simplified_vbar_semx );
    return semx;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 24418L)
  public static SubLObject psp_semx_for_appositive_np(final SubLObject edge)
  {
    final SubLObject sem_head_dtr = psp_chart.psp_edge_nth_dtr( THREE_INTEGER, edge );
    final SubLObject raw_semx = ( NIL != psp_chart.phrase_structure_parser_edge_p( sem_head_dtr ) ) ? psp_semantics_for_edge_int( sem_head_dtr, $kw37$DENOT_GROUND ) : NIL;
    return psp_rules.psp_filter_cycls( raw_semx, THREE_INTEGER, psp_chart.psp_edge_rule_struct( edge ), edge );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 24725L)
  public static SubLObject psp_modifier_dtrP(final SubLObject dtr, final SubLObject mother)
  {
    return makeBoolean( dtr.eql( psp_chart.psp_edge_sem_head_dtr( mother ) ) && !dtr.eql( psp_chart.get_psp_edge_head_dtr( mother ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 25007L)
  public static SubLObject psp_head_key_from_bindings(final SubLObject v_bindings, final SubLObject head_dtr_num)
  {
    SubLObject head_key = NIL;
    if( v_bindings.isList() && NIL == head_key )
    {
      SubLObject csome_list_var = v_bindings;
      SubLObject binding = NIL;
      binding = csome_list_var.first();
      while ( NIL == head_key && NIL != csome_list_var)
      {
        SubLObject current;
        final SubLObject datum = current = binding;
        SubLObject instance_or_typeP = NIL;
        SubLObject dtr_num = NIL;
        SubLObject keyword = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list95 );
        instance_or_typeP = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list95 );
        dtr_num = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list95 );
        keyword = current.first();
        current = current.rest();
        if( NIL == current )
        {
          if( instance_or_typeP == $kw96$INSTANCE && dtr_num.eql( head_dtr_num ) )
          {
            head_key = keyword;
          }
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list95 );
        }
        csome_list_var = csome_list_var.rest();
        binding = csome_list_var.first();
      }
    }
    return head_key;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 25405L)
  public static SubLObject psp_coerce_templates_to_collections(final SubLObject edge, final SubLObject templates, final SubLObject syn_headP, final SubLObject head_key)
  {
    SubLObject ans = NIL;
    SubLObject cdolist_list_var = templates;
    SubLObject template = NIL;
    template = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject coll_template = psp_coerce_template_to_collection( template, syn_headP, head_key );
      if( coll_template != $kw97$ERROR )
      {
        if( NIL == psp_cycl_E( coll_template, template ) )
        {
          psp_parse_tree_generator.psp_note_semantic_dependency( edge, coll_template, edge, template );
        }
        final SubLObject item_var = coll_template;
        if( NIL == conses_high.member( item_var, ans, $sym98$PSP_CYCL__, Symbols.symbol_function( IDENTITY ) ) )
        {
          ans = ConsesLow.cons( item_var, ans );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      template = cdolist_list_var.first();
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 25859L)
  public static SubLObject psp_coerce_template_to_collection(final SubLObject template, final SubLObject syn_headP, final SubLObject head_key)
  {
    final SubLObject weightless_template = psp_cycl_cycl( template );
    final SubLObject template_weight = psp_cycl_weight( template );
    if( NIL != rbp_wff.npp_collectionP( weightless_template ) )
    {
      return template;
    }
    final SubLObject ans = psp_coerce_template_to_collection_memoized( weightless_template, syn_headP, head_key );
    return psp_weight_cycl( ans, template_weight );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 26416L)
  public static SubLObject psp_coerce_template_to_collection_memoized_internal(SubLObject weightless_template, final SubLObject syn_headP, final SubLObject head_key)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    SubLObject head_collection = head_key;
    SubLObject phs_status = $kw100$OK;
    if( NIL != syn_headP )
    {
      thread.resetMultipleValues();
      final SubLObject head_collection_$23 = psp_extract_head_semx( weightless_template, head_key );
      final SubLObject weightless_template_$24 = thread.secondMultipleValue();
      final SubLObject phs_status_$25 = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      head_collection = head_collection_$23;
      weightless_template = weightless_template_$24;
      phs_status = phs_status_$25;
    }
    if( phs_status == $kw97$ERROR )
    {
      ans = $kw97$ERROR;
    }
    else if( NIL == weightless_template )
    {
      ans = head_collection;
    }
    else
    {
      final SubLObject head_var = czer_utilities.unique_el_var_wrt_expression( weightless_template, $sym101$_OBJ );
      final SubLObject restrictions_formula = psp_handle_keywords_in_formula( weightless_template, head_var, head_key );
      SubLObject new_restrictions = ( NIL != el_utilities.el_conjunction_p( restrictions_formula ) ) ? cycl_utilities.formula_args( restrictions_formula, UNPROVIDED ) : ConsesLow.list( restrictions_formula );
      final SubLObject isa_clause = psp_find_isa( new_restrictions, head_var );
      if( NIL != cycl_utilities.expression_find( $kw102$REPLACE, cycl_utilities.formula_arg2( isa_clause, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        head_collection = cycl_utilities.formula_arg2( isa_clause, UNPROVIDED );
        new_restrictions = Sequences.remove( isa_clause, new_restrictions, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      final SubLObject nat = ans = parsing_utilities.make_collection_expression( head_collection, head_var, new_restrictions );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 26416L)
  public static SubLObject psp_coerce_template_to_collection_memoized(final SubLObject weightless_template, final SubLObject syn_headP, final SubLObject head_key)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return psp_coerce_template_to_collection_memoized_internal( weightless_template, syn_headP, head_key );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym99$PSP_COERCE_TEMPLATE_TO_COLLECTION_MEMOIZED, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym99$PSP_COERCE_TEMPLATE_TO_COLLECTION_MEMOIZED, THREE_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym99$PSP_COERCE_TEMPLATE_TO_COLLECTION_MEMOIZED, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_3( weightless_template, syn_headP, head_key );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( weightless_template.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( syn_headP.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( NIL != cached_args && NIL == cached_args.rest() && head_key.equal( cached_args.first() ) )
            {
              return memoization_state.caching_results( results2 );
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( psp_coerce_template_to_collection_memoized_internal( weightless_template, syn_headP, head_key ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( weightless_template, syn_headP, head_key ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 27624L)
  public static SubLObject psp_handle_keywords_in_formula(SubLObject formula, final SubLObject var, final SubLObject var_key)
  {
    if( NIL != var_key )
    {
      formula = conses_high.subst( var, var_key, formula, UNPROVIDED, UNPROVIDED );
      if( NIL != cycl_utilities.expression_find( $kw103$ACTION, formula, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        formula = psp_handle_keyword_in_formula( $kw103$ACTION, formula );
      }
    }
    return formula;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 27893L)
  public static SubLObject psp_handle_keyword_in_formula(final SubLObject key, SubLObject formula)
  {
    final SubLObject key_var = czer_utilities.unique_el_var_wrt_expression( formula, cycl_variables.make_el_var( Symbols.symbol_name( key ) ) );
    if( NIL != psp_davidsonian_clause_p( formula, key ) )
    {
      formula = cycl_utilities.formula_arg1( cycl_utilities.formula_arg2( formula, UNPROVIDED ), UNPROVIDED );
    }
    if( NIL != cycl_utilities.expression_find( key, formula, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return ConsesLow.list( $const104$thereExists, key_var, conses_high.subst( key_var, key, formula, UNPROVIDED, UNPROVIDED ) );
    }
    return formula;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 28294L)
  public static SubLObject psp_davidsonian_clause_p(final SubLObject formula, SubLObject head)
  {
    if( head == UNPROVIDED )
    {
      head = NIL;
    }
    return makeBoolean( NIL != el_utilities.el_formula_with_operator_p( formula, $const105$isa ) && ( NIL == head || cycl_utilities.formula_arg1( formula, UNPROVIDED ).eql( head ) ) && NIL != el_utilities
        .el_formula_with_operator_p( cycl_utilities.formula_arg2( formula, UNPROVIDED ), $const106$StateFn ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 28543L)
  public static SubLObject psp_make_davidsonian_clause(final SubLObject head, final SubLObject prop)
  {
    return ConsesLow.list( $const105$isa, head, ConsesLow.list( $const106$StateFn, prop ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 28642L)
  public static SubLObject psp_find_isa(final SubLObject formula, final SubLObject v_term)
  {
    if( formula.isAtom() )
    {
      return NIL;
    }
    if( NIL != formula_pattern_match.formula_matches_pattern( formula, ConsesLow.listS( $const105$isa, v_term, $list107 ) ) )
    {
      return formula;
    }
    if( NIL != el_utilities.el_conjunction_p( formula ) )
    {
      SubLObject ans = NIL;
      if( NIL == ans )
      {
        SubLObject csome_list_var;
        SubLObject item;
        for( csome_list_var = formula, item = NIL, item = csome_list_var.first(); NIL == ans && NIL != csome_list_var; ans = psp_find_isa( item, v_term ), csome_list_var = csome_list_var.rest(), item = csome_list_var
            .first() )
        {
        }
      }
      return ans;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 29036L)
  public static SubLObject psp_extract_head_semx(final SubLObject template, final SubLObject head_key)
  {
    if( NIL == list_utilities.tree_find_if( Symbols.symbol_function( $sym58$KEYWORDP ), template, UNPROVIDED ) )
    {
      return template;
    }
    SubLObject head_semx = head_key;
    SubLObject new_template = template;
    SubLObject status = $kw100$OK;
    SubLObject doneP = NIL;
    if( NIL != head_key )
    {
      final SubLObject dnfs = psp_dnf_clausal_form( template );
      final SubLObject pcase_var = Sequences.length( dnfs );
      if( pcase_var.eql( ZERO_INTEGER ) )
      {
        status = $kw97$ERROR;
      }
      else if( pcase_var.eql( ONE_INTEGER ) )
      {
        final SubLObject dnf = dnfs.first();
        final SubLObject pos_lits = clauses.pos_lits( dnf );
        final SubLObject neg_lits = clauses.neg_lits( dnf );
        if( NIL == doneP )
        {
          SubLObject csome_list_var = pos_lits;
          SubLObject clause = NIL;
          clause = csome_list_var.first();
          while ( NIL == doneP && NIL != csome_list_var)
          {
            if( NIL != formula_pattern_match.formula_matches_pattern( clause, ConsesLow.listS( $const105$isa, head_key, $list107 ) ) )
            {
              final SubLObject other_pos_lits = Sequences.remove( clause, pos_lits, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              final SubLObject conjuncts = ConsesLow.append( other_pos_lits, Mapping.mapcar( $sym108$MAKE_NEGATION, neg_lits ) );
              new_template = ( NIL != conjuncts ) ? psp_make_conjunction( conjuncts ) : NIL;
              head_semx = cycl_utilities.formula_arg2( clause, UNPROVIDED );
              doneP = T;
            }
            csome_list_var = csome_list_var.rest();
            clause = csome_list_var.first();
          }
        }
      }
      else
      {
        status = $kw97$ERROR;
      }
    }
    return Values.values( head_semx, new_template, status );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 30010L)
  public static SubLObject psp_dnf_clausal_form(final SubLObject formula)
  {
    if( NIL != el_utilities.el_conjunction_p( formula ) )
    {
      SubLObject dnfs = NIL;
      final SubLObject conjuncts = cycl_utilities.formula_args( formula, UNPROVIDED );
      final SubLObject pos_lits = Sequences.remove_if( $sym109$EL_NEGATION_P, conjuncts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      final SubLObject neg_lits = conses_high.set_difference( conjuncts, pos_lits, UNPROVIDED, UNPROVIDED );
      dnfs = ConsesLow.cons( clauses.make_clause( neg_lits, pos_lits ), dnfs );
      return dnfs;
    }
    if( NIL != el_utilities.el_disjunction_p( formula ) )
    {
      return Mapping.mapcar( $sym110$PSP_DNF_FOR_SENTENCE, cycl_utilities.formula_args( formula, UNPROVIDED ) );
    }
    SubLObject dnfs = NIL;
    dnfs = ConsesLow.cons( psp_dnf_for_sentence( formula ), dnfs );
    return dnfs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 30673L)
  public static SubLObject psp_dnf_for_sentence(final SubLObject sentence)
  {
    if( NIL == el_utilities.el_negation_p( sentence ) )
    {
      final SubLObject pos_lits = ConsesLow.list( sentence );
      final SubLObject neg_lits = NIL;
      return clauses.make_clause( neg_lits, pos_lits );
    }
    final SubLObject backwards = psp_dnf_for_sentence( cycl_utilities.formula_arg1( sentence, UNPROVIDED ) );
    SubLObject current;
    final SubLObject datum = current = backwards;
    SubLObject pos_lits2 = NIL;
    SubLObject neg_lits2 = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list111 );
    pos_lits2 = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list111 );
    neg_lits2 = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return clauses.make_clause( neg_lits2, pos_lits2 );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list111 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 31034L)
  public static SubLObject clear_psp_head_key_for_category()
  {
    final SubLObject cs = $psp_head_key_for_category_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 31034L)
  public static SubLObject remove_psp_head_key_for_category(final SubLObject category, SubLObject frame)
  {
    if( frame == UNPROVIDED )
    {
      frame = $kw112$UNSPECIFIED;
    }
    return memoization_state.caching_state_remove_function_results_with_args( $psp_head_key_for_category_caching_state$.getGlobalValue(), ConsesLow.list( category, frame ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 31034L)
  public static SubLObject psp_head_key_for_category_internal(final SubLObject category, final SubLObject frame)
  {
    if( NIL != lexicon_accessors.vbarP( category ) || NIL != psp_rules.psp_valid_constituent_typeP( category, $const49$Verb ) )
    {
      return $kw103$ACTION;
    }
    if( NIL != lexicon_accessors.nbarP( category ) )
    {
      return $kw114$NOUN;
    }
    if( NIL == forts.fort_p( frame ) )
    {
      return $kw114$NOUN;
    }
    if( NIL != isa.isaP( frame, $const42$GenericVerbPhraseModifyingFrame, UNPROVIDED, UNPROVIDED ) )
    {
      return $kw103$ACTION;
    }
    return $kw114$NOUN;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 31034L)
  public static SubLObject psp_head_key_for_category(final SubLObject category, SubLObject frame)
  {
    if( frame == UNPROVIDED )
    {
      frame = $kw112$UNSPECIFIED;
    }
    SubLObject caching_state = $psp_head_key_for_category_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym113$PSP_HEAD_KEY_FOR_CATEGORY, $sym115$_PSP_HEAD_KEY_FOR_CATEGORY_CACHING_STATE_, NIL, EQUAL, TWO_INTEGER, ZERO_INTEGER );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( category, frame );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( category.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && frame.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( psp_head_key_for_category_internal( category, frame ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( category, frame ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 31542L)
  public static SubLObject psp_substitute_bindings_internal(final SubLObject template, final SubLObject v_bindings, final SubLObject head_key)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = template;
    final SubLObject template_cycl = psp_cycl_cycl( template );
    final SubLObject template_vars = list_utilities.tree_gather( template_cycl, $sym117$CYC_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject non_wffP = NIL;
    if( NIL == non_wffP )
    {
      SubLObject csome_list_var = v_bindings;
      SubLObject binding = NIL;
      binding = csome_list_var.first();
      while ( NIL == non_wffP && NIL != csome_list_var)
      {
        SubLObject current;
        final SubLObject datum = current = binding;
        SubLObject in = NIL;
        SubLObject out = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list118 );
        in = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list118 );
        out = current.first();
        current = current.rest();
        if( NIL == current )
        {
          if( NIL != subl_promotions.memberP( out, $list119, UNPROVIDED, UNPROVIDED ) && NIL == parsing_vars.$npp_use_nl_tagsP$.getDynamicValue( thread ) && NIL != psp_collectionP( in ) )
          {
            in = psp_add_some_fn( in );
          }
          in = psp_rename_variables( in, template_vars );
          final SubLObject wff_check_bindings = ConsesLow.list( ConsesLow.cons( out, psp_cycl_cycl( in ) ) );
          if( NIL == psp_wffP( template_cycl, wff_check_bindings ) )
          {
            non_wffP = T;
          }
          else if( NIL != psp_collectionP( template_cycl ) )
          {
            ans = psp_substitute_bindings_coll( ans, in, out, head_key );
          }
          else if( head_key.eql( out ) )
          {
            SubLObject nl_tag_templates = NIL;
            thread.resetMultipleValues();
            final SubLObject in_$26 = parsing_macros.psp_strip_and_remember_nl_tags( in );
            final SubLObject nl_tag_templates_$27 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            in = in_$26;
            nl_tag_templates = nl_tag_templates_$27;
            ans = psp_cycl_subst( in, out, ans );
            ans = parsing_macros.psp_add_nl_tag_templates( ans, nl_tag_templates );
          }
          else
          {
            ans = psp_cycl_subst( in, out, ans );
          }
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list118 );
        }
        csome_list_var = csome_list_var.rest();
        binding = csome_list_var.first();
      }
    }
    return ( NIL != non_wffP ) ? $kw55$NON_WFF : ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 31542L)
  public static SubLObject psp_substitute_bindings(final SubLObject template, final SubLObject v_bindings, final SubLObject head_key)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return psp_substitute_bindings_internal( template, v_bindings, head_key );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym116$PSP_SUBSTITUTE_BINDINGS, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym116$PSP_SUBSTITUTE_BINDINGS, THREE_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym116$PSP_SUBSTITUTE_BINDINGS, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_3( template, v_bindings, head_key );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( template.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( v_bindings.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( NIL != cached_args && NIL == cached_args.rest() && head_key.equal( cached_args.first() ) )
            {
              return memoization_state.caching_results( results2 );
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( psp_substitute_bindings_internal( template, v_bindings, head_key ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( template, v_bindings, head_key ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 32718L)
  public static SubLObject psp_add_some_fn(final SubLObject psp_cycl)
  {
    return psp_cycl_subst( psp_cycl, $kw102$REPLACE, $list120 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 32829L)
  public static SubLObject psp_rename_variables(SubLObject cycl, final SubLObject template_vars)
  {
    SubLObject cdolist_list_var = conses_high.intersection( list_utilities.tree_gather( cycl, $sym117$CYC_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED ), template_vars, UNPROVIDED, UNPROVIDED );
    SubLObject var = NIL;
    var = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      cycl = conses_high.subst( czer_utilities.unique_el_var_wrt_expression( ConsesLow.list( cycl, template_vars ), var ), var, cycl, UNPROVIDED, UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      var = cdolist_list_var.first();
    }
    return cycl;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 33154L)
  public static SubLObject psp_substitute_bindings_coll(final SubLObject template, SubLObject in, final SubLObject out, final SubLObject head_key)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( out.eql( head_key ) )
    {
      SubLObject nl_tag_templates = NIL;
      thread.resetMultipleValues();
      final SubLObject in_$28 = parsing_macros.psp_strip_and_remember_nl_tags( in );
      final SubLObject nl_tag_templates_$29 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      in = in_$28;
      nl_tag_templates = nl_tag_templates_$29;
      return psp_substitute_bindings_coll( template, in, out, NIL );
    }
    thread.resetMultipleValues();
    final SubLObject coll = parsing_utilities.parse_collection_expression( template );
    final SubLObject var = thread.secondMultipleValue();
    final SubLObject old_restrictions = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    SubLObject ans;
    if( coll.eql( out ) )
    {
      final SubLObject weightless_in = psp_cycl_cycl( in );
      final SubLObject in_weight = psp_cycl_weight( in );
      thread.resetMultipleValues();
      final SubLObject in_coll = parsing_utilities.parse_collection_expression( weightless_in );
      SubLObject in_var = thread.secondMultipleValue();
      final SubLObject new_restrictions = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      SubLObject all_restrictions;
      if( NIL != ( all_restrictions = new_restrictions ) )
      {
        SubLObject cdolist_list_var = old_restrictions;
        SubLObject restr = NIL;
        restr = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          all_restrictions = ConsesLow.cons( psp_cycl_subst( in_var, var, restr ), all_restrictions );
          cdolist_list_var = cdolist_list_var.rest();
          restr = cdolist_list_var.first();
        }
      }
      else
      {
        all_restrictions = old_restrictions;
        in_var = var;
      }
      ans = psp_weight_cycl( parsing_utilities.make_collection_expression( in_coll, in_var, all_restrictions ), in_weight );
    }
    else
    {
      ans = psp_cycl_subst( in, out, template );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 34274L)
  public static SubLObject psp_process_bindings(final SubLObject v_bindings, final SubLObject edge, final SubLObject rule_struct, final SubLObject head_output_type)
  {
    final SubLObject dtrs = psp_chart.psp_edge_dtrs( edge );
    SubLObject dtr_cycls_bindings = NIL;
    SubLObject failP = NIL;
    final SubLObject rule_fort = psp_chart.psp_edge_rule_fort( edge );
    final SubLObject head_dtr_num = psp_rules.psp_rule_head( rule_struct );
    if( v_bindings == $kw121$UNKNOWN )
    {
      failP = T;
      if( NIL != psp_rules.psp_traced_ruleP( rule_fort ) )
      {
        PrintLow.format( T, $str122$No_bindings_for__S___, edge );
      }
    }
    if( NIL == failP )
    {
      SubLObject csome_list_var = v_bindings;
      SubLObject binding = NIL;
      binding = csome_list_var.first();
      while ( NIL == failP && NIL != csome_list_var)
      {
        SubLObject current;
        final SubLObject datum = current = binding;
        SubLObject instance_or_typeP = NIL;
        SubLObject dtr_num = NIL;
        SubLObject keyword = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list95 );
        instance_or_typeP = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list95 );
        dtr_num = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list95 );
        keyword = current.first();
        current = current.rest();
        if( NIL == current )
        {
          if( NIL != list_utilities.lengthL( dtrs, dtr_num, UNPROVIDED ) )
          {
            if( NIL != psp_rules.psp_traced_ruleP( rule_fort ) )
            {
              PrintLow.format( T, $str123$Binding__S_has_no_corresponding_d, binding, dtrs );
            }
          }
          else
          {
            final SubLObject dtr = ConsesLow.nth( number_utilities.f_1_( dtr_num ), dtrs );
            final SubLObject syntactic_head_dtrP = Equality.eql( dtr_num, head_dtr_num );
            final SubLObject template_keywordP = psp_template_keywordP( keyword );
            final SubLObject output_type = ( NIL != syntactic_head_dtrP ) ? head_output_type : ( ( NIL != template_keywordP ) ? $kw38$DENOT_TEMPLATE : $kw37$DENOT_GROUND );
            final SubLObject dtr_cycls = psp_semantics_for_edge_int( dtr, output_type );
            SubLObject filtered_cycls = psp_rules.psp_filter_cycls( dtr_cycls, dtr_num, rule_struct, edge );
            if( instance_or_typeP == $kw124$TYPE )
            {
              filtered_cycls = list_utilities.remove_if_not( $sym125$PSP_COLLECTION_, filtered_cycls, $sym126$STRIP_NL_TAGS, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
            if( psp_rules.psp_rule_fort( rule_struct ).eql( $const127$PSRule_VbarVComps ) )
            {
              filtered_cycls = psp_cycl_subst( $kw128$SUBJECT, $kw114$NOUN, filtered_cycls );
            }
            if( instance_or_typeP == $kw96$INSTANCE && NIL == dtr_cycls )
            {
              failP = T;
              if( NIL != psp_rules.psp_traced_ruleP( rule_fort ) )
              {
                PrintLow.format( T, $str129$__No_cycls_found_for____S__, dtr );
              }
            }
            else if( instance_or_typeP == $kw96$INSTANCE && NIL == filtered_cycls )
            {
              failP = T;
              if( NIL != psp_rules.psp_traced_ruleP( rule_fort ) )
              {
                PrintLow.format( T, $str130$__All_cycls_were_non_wff_for____S, dtr );
              }
            }
            else if( NIL != filtered_cycls )
            {
              SubLObject current_$31;
              final SubLObject datum_$30 = current_$31 = list_utilities.alist_lookup( dtr_cycls_bindings, dtr_num, Symbols.symbol_function( EQL ), $list131 );
              SubLObject existing_cycls = NIL;
              SubLObject existing_keywords = NIL;
              cdestructuring_bind.destructuring_bind_must_consp( current_$31, datum_$30, $list132 );
              existing_cycls = current_$31.first();
              current_$31 = current_$31.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current_$31, datum_$30, $list132 );
              existing_keywords = current_$31.first();
              current_$31 = current_$31.rest();
              if( NIL == current_$31 )
              {
                final SubLObject new_cycls = ( NIL != existing_keywords ) ? conses_high.intersection( existing_cycls, filtered_cycls, Symbols.symbol_function( $sym98$PSP_CYCL__ ), UNPROVIDED ) : filtered_cycls;
                final SubLObject new_keywords = ConsesLow.cons( keyword, existing_keywords );
                dtr_cycls_bindings = list_utilities.alist_enter( dtr_cycls_bindings, dtr_num, ConsesLow.list( new_cycls, new_keywords ), UNPROVIDED );
              }
              else
              {
                cdestructuring_bind.cdestructuring_bind_error( datum_$30, $list132 );
              }
            }
            else if( NIL != psp_rules.psp_traced_ruleP( rule_fort ) )
            {
              PrintLow.format( T, $str133$__No_filtered_cycls_for__S, dtr );
            }
          }
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list95 );
        }
        csome_list_var = csome_list_var.rest();
        binding = csome_list_var.first();
      }
    }
    return ( NIL != failP ) ? $kw55$NON_WFF : psp_process_bindings_int( list_utilities.alist_values( dtr_cycls_bindings ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 36860L)
  public static SubLObject psp_template_keywordP(final SubLObject keyword)
  {
    return conses_high.member( keyword, $list134, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 37009L)
  public static SubLObject psp_process_bindings_int(final SubLObject cycls_bindings)
  {
    if( NIL == cycls_bindings )
    {
      return NIL;
    }
    SubLObject ans = NIL;
    SubLObject current;
    final SubLObject datum = current = cycls_bindings.first();
    SubLObject first_cycls = NIL;
    SubLObject keywords = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list135 );
    first_cycls = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list135 );
    keywords = current.first();
    current = current.rest();
    if( NIL == current )
    {
      if( NIL != list_utilities.singletonP( cycls_bindings ) )
      {
        SubLObject cdolist_list_var = first_cycls;
        SubLObject cycl = NIL;
        cycl = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          SubLObject binding_pairs = NIL;
          SubLObject cdolist_list_var_$32 = keywords;
          SubLObject keyword = NIL;
          keyword = cdolist_list_var_$32.first();
          while ( NIL != cdolist_list_var_$32)
          {
            final SubLObject binding_pair = ConsesLow.list( cycl, keyword );
            validate_binding_pair( binding_pair );
            binding_pairs = ConsesLow.cons( binding_pair, binding_pairs );
            cdolist_list_var_$32 = cdolist_list_var_$32.rest();
            keyword = cdolist_list_var_$32.first();
          }
          ans = ConsesLow.cons( binding_pairs, ans );
          cdolist_list_var = cdolist_list_var.rest();
          cycl = cdolist_list_var.first();
        }
      }
      else
      {
        final SubLObject pair_lists_from_rest = psp_process_bindings_int( cycls_bindings.rest() );
        SubLObject cdolist_list_var2 = first_cycls;
        SubLObject cycl2 = NIL;
        cycl2 = cdolist_list_var2.first();
        while ( NIL != cdolist_list_var2)
        {
          SubLObject cdolist_list_var_$33 = pair_lists_from_rest;
          SubLObject binding_pairs2 = NIL;
          binding_pairs2 = cdolist_list_var_$33.first();
          while ( NIL != cdolist_list_var_$33)
          {
            SubLObject cdolist_list_var_$34 = keywords;
            SubLObject keyword2 = NIL;
            keyword2 = cdolist_list_var_$34.first();
            while ( NIL != cdolist_list_var_$34)
            {
              final SubLObject binding_pair2 = ConsesLow.list( cycl2, keyword2 );
              validate_binding_pair( binding_pair2 );
              binding_pairs2 = ConsesLow.cons( binding_pair2, binding_pairs2 );
              cdolist_list_var_$34 = cdolist_list_var_$34.rest();
              keyword2 = cdolist_list_var_$34.first();
            }
            ans = ConsesLow.cons( binding_pairs2, ans );
            cdolist_list_var_$33 = cdolist_list_var_$33.rest();
            binding_pairs2 = cdolist_list_var_$33.first();
          }
          cdolist_list_var2 = cdolist_list_var2.rest();
          cycl2 = cdolist_list_var2.first();
        }
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list135 );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 38066L)
  public static SubLObject validate_binding_pair(final SubLObject binding_pair)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( !binding_pair.isList() || NIL == list_utilities.lengthE( binding_pair, TWO_INTEGER, UNPROVIDED ) || !conses_high.second( binding_pair ).isKeyword() ) )
    {
      Errors.error( $str136$Bad_binding_pair___S, binding_pair );
    }
    return $kw137$VALID;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 38285L)
  public static SubLObject psp_collectionP(final SubLObject psp_cycl)
  {
    return psp_collection_memoizedP( psp_cycl_cycl( psp_cycl ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 38513L)
  public static SubLObject psp_collection_memoizedP_internal(final SubLObject cycl)
  {
    return rbp_wff.npp_collectionP( cycl );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 38513L)
  public static SubLObject psp_collection_memoizedP(final SubLObject cycl)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return psp_collection_memoizedP_internal( cycl );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym138$PSP_COLLECTION_MEMOIZED_, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym138$PSP_COLLECTION_MEMOIZED_, ONE_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym138$PSP_COLLECTION_MEMOIZED_, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, cycl, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( psp_collection_memoizedP_internal( cycl ) ) );
      memoization_state.caching_state_put( caching_state, cycl, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 38986L)
  public static SubLObject psp_reformulate(final SubLObject psp_cycl)
  {
    final SubLObject cycl = psp_cycl_cycl( psp_cycl );
    final SubLObject new_cycl = psp_reformulate_int( cycl );
    SubLObject new_psp_cycl = NIL;
    if( NIL != psp_weighted_cycl_p( psp_cycl ) )
    {
      psp_weighted_cycl_set_cycl( psp_cycl, new_cycl );
      new_psp_cycl = psp_cycl;
    }
    else
    {
      new_psp_cycl = new_cycl;
    }
    return Values.values( new_psp_cycl, parsing_macros.parsing_timeout_time_reachedP() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 39409L)
  public static SubLObject psp_reformulate_int_internal(final SubLObject cycl)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject new_cycl = cycl;
    SubLObject error_message = NIL;
    final SubLObject _prev_bind_0 = nl_reformulator.$nl_reformulator_settings$.currentBinding( thread );
    try
    {
      nl_reformulator.$nl_reformulator_settings$.bind( nl_reformulator.nl_ref_remove_modules( $psp_reformulator_modules_to_skip$.getGlobalValue() ), thread );
      thread.resetMultipleValues();
      final SubLObject new_cycl_$35 = nl_reformulator.nl_reformulate( cycl, parsing_macros.parsing_timeout_time_remaining() );
      final SubLObject error_message_$36 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      new_cycl = new_cycl_$35;
      error_message = error_message_$36;
    }
    finally
    {
      nl_reformulator.$nl_reformulator_settings$.rebind( _prev_bind_0, thread );
    }
    if( $kw97$ERROR == new_cycl )
    {
      Errors.warn( error_message );
      return cycl;
    }
    if( !cycl.equal( new_cycl ) && NIL == parsing_vars.$npp_use_nl_tagsP$.getDynamicValue( thread ) && NIL == rbp_wff.rbp_wf_natP( new_cycl, parsing_vars.$np_wff_filter_level$.getDynamicValue( thread ) ) )
    {
      new_cycl = NIL;
    }
    return new_cycl;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 39409L)
  public static SubLObject psp_reformulate_int(final SubLObject cycl)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return psp_reformulate_int_internal( cycl );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym140$PSP_REFORMULATE_INT, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym140$PSP_REFORMULATE_INT, ONE_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym140$PSP_REFORMULATE_INT, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, cycl, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( psp_reformulate_int_internal( cycl ) ) );
      memoization_state.caching_state_put( caching_state, cycl, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 40052L)
  public static SubLObject psp_reformulate_cycls(SubLObject cycls)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject new_cycls = NIL;
    SubLObject timed_outP = parsing_macros.parsing_timeout_time_reachedP();
    if( NIL != rkf_discourse_tracking.rkf_discourse_context_p( rkf_discourse_tracking.$rkf_discourse_context$.getDynamicValue( thread ) ) )
    {
      SubLObject accumulator = NIL;
      SubLObject cdolist_list_var = cycls;
      SubLObject cycl = NIL;
      cycl = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        accumulator = Sequences.cconcatenate( accumulator, psp_disc_resolve_sentence_entities( cycl ) );
        cdolist_list_var = cdolist_list_var.rest();
        cycl = cdolist_list_var.first();
      }
      cycls = accumulator;
    }
    final SubLObject v_memoization_state = memoization_state.new_memoization_state( UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    assert NIL != memoization_state.memoization_state_p( v_memoization_state ) : v_memoization_state;
    final SubLObject _prev_bind_0 = reformulator_datastructures.$reformulator_memoization_state$.currentBinding( thread );
    try
    {
      reformulator_datastructures.$reformulator_memoization_state$.bind( v_memoization_state, thread );
      final SubLObject local_state = reformulator_datastructures.$reformulator_memoization_state$.getDynamicValue( thread );
      final SubLObject _prev_bind_0_$37 = memoization_state.$memoization_state$.currentBinding( thread );
      try
      {
        memoization_state.$memoization_state$.bind( local_state, thread );
        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
        try
        {
          final SubLObject _prev_bind_0_$38 = nl_reformulator.$nl_reformulator_settings$.currentBinding( thread );
          try
          {
            nl_reformulator.$nl_reformulator_settings$.bind( nl_reformulator.add_or_change_nl_reformulator_settings( $kw142$CLEAR_CACHES_, $kw143$FALSE ), thread );
            if( NIL == timed_outP )
            {
              SubLObject csome_list_var = cycls;
              SubLObject cycl2 = NIL;
              cycl2 = csome_list_var.first();
              while ( NIL == timed_outP && NIL != csome_list_var)
              {
                thread.resetMultipleValues();
                final SubLObject new_cycl = psp_reformulate( cycl2 );
                final SubLObject timeP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if( NIL != timeP )
                {
                  timed_outP = T;
                }
                else
                {
                  new_cycls = ConsesLow.cons( new_cycl, new_cycls );
                }
                csome_list_var = csome_list_var.rest();
                cycl2 = csome_list_var.first();
              }
            }
          }
          finally
          {
            nl_reformulator.$nl_reformulator_settings$.rebind( _prev_bind_0_$38, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$39 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$39, thread );
          }
        }
      }
      finally
      {
        memoization_state.$memoization_state$.rebind( _prev_bind_0_$37, thread );
      }
    }
    finally
    {
      reformulator_datastructures.$reformulator_memoization_state$.rebind( _prev_bind_0, thread );
    }
    return Values.values( Sequences.nreverse( new_cycls ), timed_outP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 40771L)
  public static SubLObject psp_disc_resolve_sentence_entities(final SubLObject psp_cycl)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject cycl = psp_cycl_cycl( psp_cycl );
    final SubLObject resolved_cycls = rkf_discourse_tracking.rkf_disc_resolve_sentence_entities( cycl, rkf_discourse_tracking.$rkf_discourse_context$.getDynamicValue( thread ) );
    if( NIL != psp_weighted_cycl_p( psp_cycl ) )
    {
      final SubLObject weight = psp_weighted_cycl_weight( psp_cycl );
      SubLObject resolved_weighted_cycls = NIL;
      SubLObject cdolist_list_var = resolved_cycls;
      SubLObject resolved_cycl = NIL;
      resolved_cycl = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        resolved_weighted_cycls = ConsesLow.cons( new_psp_weighted_cycl( resolved_cycl, weight ), resolved_weighted_cycls );
        cdolist_list_var = cdolist_list_var.rest();
        resolved_cycl = cdolist_list_var.first();
      }
      return resolved_weighted_cycls;
    }
    return resolved_cycls;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 41361L)
  public static SubLObject psp_wffP_internal(final SubLObject template, final SubLObject v_bindings)
  {
    return psp_wffP_int( template, v_bindings );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 41361L)
  public static SubLObject psp_wffP(final SubLObject template, final SubLObject v_bindings)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return psp_wffP_internal( template, v_bindings );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym144$PSP_WFF_, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym144$PSP_WFF_, TWO_INTEGER, NIL, EQUALP, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym144$PSP_WFF_, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( template, v_bindings );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( template.equalp( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && v_bindings.equalp( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( psp_wffP_internal( template, v_bindings ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( template, v_bindings ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 41570L)
  public static SubLObject psp_wffP_int(final SubLObject template, final SubLObject v_bindings)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject wfP = NIL;
    if( NIL != list_utilities.tree_find_if( Symbols.symbol_function( $sym58$KEYWORDP ), Mapping.mapcar( Symbols.symbol_function( $sym145$CDR ), v_bindings ), UNPROVIDED ) )
    {
      wfP = T;
    }
    else if( NIL != list_utilities.tree_find( psp_chart.psp_np_gap_referent(), Mapping.mapcar( Symbols.symbol_function( $sym145$CDR ), v_bindings ), UNPROVIDED, UNPROVIDED ) )
    {
      wfP = T;
    }
    else if( NIL != psp_indexical_bindings_p( v_bindings ) )
    {
      wfP = T;
    }
    else if( ( !parsing_vars.$np_wff_filter_level$.getDynamicValue( thread ).isPositive() || NIL != rbp_wff.rbp_wf_template_argsP( template, v_bindings, ONE_INTEGER ) ) && ( !parsing_vars.$np_wff_filter_level$
        .getDynamicValue( thread ).numG( ONE_INTEGER ) || NIL != rbp_wff.rbp_wf_template_argsP( template, v_bindings, TWO_INTEGER ) ) )
    {
      wfP = T;
    }
    if( NIL == wfP && NIL != rbp_wff.$rbp_show_non_wffP$.getDynamicValue( thread ) )
    {
      SubLObject nat = template;
      SubLObject cdolist_list_var = v_bindings;
      SubLObject binding = NIL;
      binding = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject out = binding.first();
        final SubLObject in = binding.rest();
        nat = conses_high.subst( in, out, nat, UNPROVIDED, UNPROVIDED );
        cdolist_list_var = cdolist_list_var.rest();
        binding = cdolist_list_var.first();
      }
      PrintLow.format( T, $str146$__Not_WFF___S__, nat );
    }
    return wfP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 42350L)
  public static SubLObject psp_indexical_bindings_p(final SubLObject v_bindings)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans;
    SubLObject rest;
    SubLObject cons;
    SubLObject current;
    SubLObject datum;
    SubLObject indexical_string;
    SubLObject denot;
    for( ans = NIL, rest = NIL, rest = parsing_vars.$psp_indexical_map$.getDynamicValue( thread ); NIL == ans && NIL != rest; ans = list_utilities.tree_find( denot, Mapping.mapcar( Symbols.symbol_function( $sym145$CDR ),
        v_bindings ), Symbols.symbol_function( EQUAL ), UNPROVIDED ), rest = rest.rest() )
    {
      cons = rest.first();
      datum = ( current = cons );
      indexical_string = NIL;
      denot = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list147 );
      indexical_string = current.first();
      current = ( denot = current.rest() );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 42688L)
  public static SubLObject psp_sem_templates_from_lexical_edge_internal(final SubLObject edge)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject frame = psp_chart.get_psp_edge_frame( edge );
    if( NIL != frame || NIL != psp_genl_posP( psp_chart.get_psp_edge_category( edge ), $const149$Preposition, UNPROVIDED ) || NIL != psp_genl_posP( psp_chart.get_psp_edge_category( edge ), $const150$Adjective,
        UNPROVIDED ) || NIL != psp_genl_posP( psp_chart.get_psp_edge_category( edge ), $const53$Adverb, UNPROVIDED ) )
    {
      final SubLObject category = psp_chart.get_psp_edge_category( edge );
      final SubLObject passiveP = psp_chart.psp_passive_frameP( frame );
      final SubLObject active_frame = ( NIL != passiveP ) ? psp_chart.psp_active_frame( frame ) : frame;
      final SubLObject raw_templates = psp_raw_templates( edge, category, active_frame );
      final SubLObject davidsonian_templates = psp_davidsonianize_verb_templates( raw_templates, category );
      final SubLObject quantified_templates = psp_quantify_templates( davidsonian_templates );
      SubLObject output_templates = NIL;
      SubLObject cdolist_list_var = quantified_templates;
      SubLObject template = NIL;
      template = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != psp_ok_templateP( template, category, active_frame ) )
        {
          output_templates = ConsesLow.cons( template, output_templates );
        }
        cdolist_list_var = cdolist_list_var.rest();
        template = cdolist_list_var.first();
      }
      if( NIL != passiveP )
      {
        output_templates = psp_passivize_templates( output_templates, frame );
      }
      if( NIL == output_templates && NIL != parsing_vars.$psp_verboseP$.getDynamicValue( thread ) )
      {
        Errors.warn( $str54$No_templates_for__S___, edge );
      }
      return output_templates;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 42688L)
  public static SubLObject psp_sem_templates_from_lexical_edge(final SubLObject edge)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return psp_sem_templates_from_lexical_edge_internal( edge );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym148$PSP_SEM_TEMPLATES_FROM_LEXICAL_EDGE, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym148$PSP_SEM_TEMPLATES_FROM_LEXICAL_EDGE, ONE_INTEGER, NIL, EQ, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym148$PSP_SEM_TEMPLATES_FROM_LEXICAL_EDGE, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, edge, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( psp_sem_templates_from_lexical_edge_internal( edge ) ) );
      memoization_state.caching_state_put( caching_state, edge, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 43943L)
  public static SubLObject psp_noun_sem_trans_cycls(final SubLObject string, final SubLObject wu, final SubLObject pos)
  {
    final SubLObject raw_templates = psp_lookup_templates_memoized( string, wu, pos, $const151$RegularNounFrame, UNPROVIDED, UNPROVIDED );
    final SubLObject templates = psp_quantify_templates( raw_templates );
    SubLObject ans = NIL;
    SubLObject cdolist_list_var = templates;
    SubLObject propositional_template = NIL;
    propositional_template = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject collection_expr = psp_coerce_template_to_collection( propositional_template, T, $kw114$NOUN );
      if( collection_expr != $kw97$ERROR )
      {
        collection_expr = psp_cycl_subst( $const152$Thing, $kw114$NOUN, collection_expr );
        if( NIL == cycl_utilities.expression_find_if( $sym58$KEYWORDP, collection_expr, UNPROVIDED, UNPROVIDED ) )
        {
          final SubLObject item_var = collection_expr;
          if( NIL == conses_high.member( item_var, ans, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
          {
            ans = ConsesLow.cons( item_var, ans );
          }
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      propositional_template = cdolist_list_var.first();
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 44646L)
  public static SubLObject psp_bad_templateP(final SubLObject template, final SubLObject frame)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject badP = NIL;
    if( NIL == badP )
    {
      SubLObject csome_list_var = cycl_utilities.expression_gather( template, Symbols.symbol_function( $sym154$CYCL_DENOTATIONAL_TERM_P ), NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      SubLObject v_term = NIL;
      v_term = csome_list_var.first();
      while ( NIL == badP && NIL != csome_list_var)
      {
        if( v_term.isKeyword() )
        {
          if( NIL == subl_promotions.memberP( v_term, psp_chart.psp_keywords_for_frame( frame ), UNPROVIDED, UNPROVIDED ) )
          {
            if( NIL != parsing_vars.$psp_verboseP$.getDynamicValue( thread ) )
            {
              Errors.warn( $str153$_S_is_not_a_known_keyword_for__S_, v_term, frame );
            }
            badP = T;
          }
        }
        else if( NIL == psp_chart.psp_term_passes_constraintsP( v_term, UNPROVIDED ) )
        {
          badP = T;
        }
        csome_list_var = csome_list_var.rest();
        v_term = csome_list_var.first();
      }
    }
    return badP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 45834L)
  public static SubLObject psp_raw_templates(final SubLObject edge, final SubLObject category, SubLObject frame)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == frame )
    {
      frame = psp_frame_type_from_context( edge, category );
    }
    final SubLObject string = psp_chart.get_psp_edge_string( edge );
    final SubLObject wu = psp_chart.get_psp_edge_wu( edge );
    SubLObject templates = NIL;
    thread.resetMultipleValues();
    final SubLObject templates_from_lookup = psp_lookup_templates_memoized( string, wu, category, frame, UNPROVIDED, UNPROVIDED );
    final SubLObject frames = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != templates_from_lookup )
    {
      templates = templates_from_lookup;
    }
    else
    {
      templates = psp_devise_templates( edge, category, frames );
    }
    return templates;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 46425L)
  public static SubLObject psp_lookup_templates_memoized_internal(SubLObject string, final SubLObject wu, final SubLObject category, final SubLObject frame, SubLObject filters, SubLObject lexicon)
  {
    if( filters == UNPROVIDED )
    {
      filters = lexicon_vars.active_lexicon_filters();
    }
    if( lexicon == UNPROVIDED )
    {
      lexicon = ( ( NIL != misc_utilities.initialized_p( parsing_vars.$psp_lexicon$.getDynamicValue() ) ) ? parsing_vars.$psp_lexicon$.getDynamicValue()
          : psp_lexicon.get_default_psp_lexicon( UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != wu && NIL != lexicon_accessors.speech_partP( category, parsing_utilities.psp_lexicon_root_mt( UNPROVIDED ) ) && NIL != string_utilities.empty_string_p( string ) )
    {
      string = lexicon_cache.first_string_of_word_unit( wu, lexicon_utilities.preds_of_pos( category, parsing_utilities.psp_lexicon_root_mt( UNPROVIDED ) ), UNPROVIDED, UNPROVIDED );
    }
    SubLObject templates = NIL;
    final SubLObject frames = ( NIL != psp_collectionP( frame ) ) ? isa.all_fort_instances( frame, parsing_utilities.psp_lexicon_root_mt( lexicon ), UNPROVIDED ) : ConsesLow.list( frame );
    final SubLObject _prev_bind_0 = lexicon_vars.$exclude_vulgaritiesP$.currentBinding( thread );
    final SubLObject _prev_bind_2 = lexicon_vars.$exclude_slangP$.currentBinding( thread );
    final SubLObject _prev_bind_3 = lexicon_vars.$exclude_archaic_speechP$.currentBinding( thread );
    final SubLObject _prev_bind_4 = lexicon_vars.$exclude_indirect_relationsP$.currentBinding( thread );
    try
    {
      lexicon_vars.$exclude_vulgaritiesP$.bind( subl_promotions.memberP( $sym156$_EXCLUDE_VULGARITIES__, filters, UNPROVIDED, UNPROVIDED ), thread );
      lexicon_vars.$exclude_slangP$.bind( subl_promotions.memberP( $sym157$_EXCLUDE_SLANG__, filters, UNPROVIDED, UNPROVIDED ), thread );
      lexicon_vars.$exclude_archaic_speechP$.bind( subl_promotions.memberP( $sym158$_EXCLUDE_ARCHAIC_SPEECH__, filters, UNPROVIDED, UNPROVIDED ), thread );
      lexicon_vars.$exclude_indirect_relationsP$.bind( subl_promotions.memberP( $sym159$_EXCLUDE_INDIRECT_RELATIONS__, filters, UNPROVIDED, UNPROVIDED ), thread );
      SubLObject cdolist_list_var = methods.funcall_instance_method_with_1_args( lexicon, $sym167$GET_SEMTRANS_ENTRIES, string );
      SubLObject lex_entry = NIL;
      lex_entry = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject template = methods.funcall_instance_method_with_1_args( lex_entry, $sym160$GET, $kw161$SEMTRANS );
        final SubLObject frame_inst = methods.funcall_instance_method_with_1_args( lex_entry, $sym160$GET, $kw162$FRAME );
        final SubLObject lex_entry_wu = methods.funcall_instance_method_with_1_args( lex_entry, $sym160$GET, $kw163$WORD_UNIT );
        final SubLObject pragmatics = methods.funcall_instance_method_with_1_args( lex_entry, $sym160$GET, $kw164$PRAGMATICS );
        final SubLObject pos = methods.funcall_instance_method_with_1_args( lex_entry, $sym160$GET, $kw165$CYC_POS );
        if( NIL != lexicon_accessors.genl_posP( category, pos, UNPROVIDED ) && NIL != subl_promotions.memberP( frame_inst, frames, UNPROVIDED, UNPROVIDED ) && lex_entry_wu.eql( wu ) && ( NIL == lexicon_vars
            .active_lexicon_filtersP() || NIL == list_utilities.find_if_not( $sym166$PRAGMATICALLY_ACCEPTABLE_, pragmatics, UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) && NIL == psp_bad_templateP( template, frame_inst ) )
        {
          final SubLObject item_var = template;
          if( NIL == conses_high.member( item_var, templates, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
          {
            templates = ConsesLow.cons( item_var, templates );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        lex_entry = cdolist_list_var.first();
      }
    }
    finally
    {
      lexicon_vars.$exclude_indirect_relationsP$.rebind( _prev_bind_4, thread );
      lexicon_vars.$exclude_archaic_speechP$.rebind( _prev_bind_3, thread );
      lexicon_vars.$exclude_slangP$.rebind( _prev_bind_2, thread );
      lexicon_vars.$exclude_vulgaritiesP$.rebind( _prev_bind_0, thread );
    }
    return Values.values( templates, frames );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 46425L)
  public static SubLObject psp_lookup_templates_memoized(final SubLObject string, final SubLObject wu, final SubLObject category, final SubLObject frame, SubLObject filters, SubLObject lexicon)
  {
    if( filters == UNPROVIDED )
    {
      filters = lexicon_vars.active_lexicon_filters();
    }
    if( lexicon == UNPROVIDED )
    {
      lexicon = ( ( NIL != misc_utilities.initialized_p( parsing_vars.$psp_lexicon$.getDynamicValue() ) ) ? parsing_vars.$psp_lexicon$.getDynamicValue()
          : psp_lexicon.get_default_psp_lexicon( UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return psp_lookup_templates_memoized_internal( string, wu, category, frame, filters, lexicon );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym155$PSP_LOOKUP_TEMPLATES_MEMOIZED, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym155$PSP_LOOKUP_TEMPLATES_MEMOIZED, SIX_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym155$PSP_LOOKUP_TEMPLATES_MEMOIZED, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_6( string, wu, category, frame, filters, lexicon );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( string.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( wu.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( category.equal( cached_args.first() ) )
            {
              cached_args = cached_args.rest();
              if( frame.equal( cached_args.first() ) )
              {
                cached_args = cached_args.rest();
                if( filters.equal( cached_args.first() ) )
                {
                  cached_args = cached_args.rest();
                  if( NIL != cached_args && NIL == cached_args.rest() && lexicon.equal( cached_args.first() ) )
                  {
                    return memoization_state.caching_results( results2 );
                  }
                }
              }
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( psp_lookup_templates_memoized_internal( string, wu, category, frame, filters, lexicon ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( string, wu, category, frame, filters, lexicon ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 47803L)
  public static SubLObject psp_frame_type_from_context(final SubLObject edge, final SubLObject category)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject frame_type = NIL;
    if( NIL != psp_genl_posP( category, $const150$Adjective, UNPROVIDED ) || NIL != psp_genl_posP( category, $const149$Preposition, UNPROVIDED ) )
    {
      SubLObject current = edge;
      SubLObject nowP = NIL;
      if( NIL == frame_type )
      {
        SubLObject csome_list_var = $psp_context$.getDynamicValue( thread );
        SubLObject phrase = NIL;
        phrase = csome_list_var.first();
        while ( NIL == frame_type && NIL != csome_list_var)
        {
          if( NIL != psp_rules.psp_valid_constituent_typeP( psp_chart.get_psp_edge_category( phrase ), ConsesLow.list( $const168$PhraseFn, category ) ) )
          {
            nowP = T;
          }
          else if( NIL != nowP )
          {
            final SubLObject rule_struct = psp_chart.psp_edge_rule_struct( phrase );
            final SubLObject n = number_utilities.f_1X( Sequences.position( current, psp_chart.psp_edge_dtrs( phrase ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
            frame_type = psp_rules.psp_find_dtr_frame_type( rule_struct, n );
          }
          current = phrase;
          csome_list_var = csome_list_var.rest();
          phrase = csome_list_var.first();
        }
      }
    }
    return frame_type;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 48511L)
  public static SubLObject psp_roles_for_denot_internal(final SubLObject denot)
  {
    return parsing_utilities.known_roles_for_denot( denot, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 48511L)
  public static SubLObject psp_roles_for_denot(final SubLObject denot)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return psp_roles_for_denot_internal( denot );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym169$PSP_ROLES_FOR_DENOT, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym169$PSP_ROLES_FOR_DENOT, ONE_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym169$PSP_ROLES_FOR_DENOT, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, denot, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( psp_roles_for_denot_internal( denot ) ) );
      memoization_state.caching_state_put( caching_state, denot, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 48613L)
  public static SubLObject psp_devise_templates(final SubLObject edge, final SubLObject category, final SubLObject frames)
  {
    final SubLObject denots = psp_chart.psp_edge_lookup_semx( edge, $kw37$DENOT_GROUND );
    final SubLObject word = psp_chart.get_psp_edge_wu( edge );
    return psp_devise_word_templates( word, category, denots, frames );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 48835L)
  public static SubLObject psp_devise_word_templates(final SubLObject word, final SubLObject category, final SubLObject psp_cycls, final SubLObject frames)
  {
    SubLObject templates = NIL;
    if( NIL != psp_genl_posP( category, $const49$Verb, UNPROVIDED ) )
    {
      SubLObject cdolist_list_var = psp_cycls;
      SubLObject psp_cycl = NIL;
      psp_cycl = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        templates = psp_devise_verb_templates( psp_cycl, frames );
        cdolist_list_var = cdolist_list_var.rest();
        psp_cycl = cdolist_list_var.first();
      }
    }
    else if( NIL != psp_genl_posP( category, $const150$Adjective, UNPROVIDED ) )
    {
      SubLObject cdolist_list_var = psp_cycls;
      SubLObject psp_cycl = NIL;
      psp_cycl = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject denot = psp_cycl_cycl( psp_cycl );
        SubLObject template_template = NIL;
        if( NIL != isa.isa_in_any_mtP( denot, $const170$GeographicalRegion ) )
        {
          template_template = $list171;
        }
        else if( NIL != isa.isa_in_any_mtP( denot, $const172$Collection ) )
        {
          template_template = $list173;
        }
        else if( NIL == isa.isa_in_any_mtP( denot, $const174$Relation ) )
        {
          template_template = $list175;
        }
        if( NIL != template_template )
        {
          templates = ConsesLow.cons( psp_cycl_subst( psp_cycl, $kw102$REPLACE, template_template ), templates );
        }
        cdolist_list_var = cdolist_list_var.rest();
        psp_cycl = cdolist_list_var.first();
      }
    }
    else if( NIL != psp_genl_posP( category, $const47$Noun, UNPROVIDED ) )
    {
      return psp_devise_noun_templates( word, category, frames );
    }
    return templates;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 49849L)
  public static SubLObject psp_devise_verb_templates(final SubLObject denot, final SubLObject frames)
  {
    SubLObject templates = NIL;
    final SubLObject roles = psp_roles_for_denot( denot );
    if( NIL != roles )
    {
      SubLObject cdolist_list_var = frames;
      SubLObject frame = NIL;
      frame = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cdolist_list_var_$40 = parsing_utilities.verb_semtrans_from_denot_rolesXframe( denot, roles, frame, UNPROVIDED );
        SubLObject template = NIL;
        template = cdolist_list_var_$40.first();
        while ( NIL != cdolist_list_var_$40)
        {
          templates = ConsesLow.cons( template, templates );
          cdolist_list_var_$40 = cdolist_list_var_$40.rest();
          template = cdolist_list_var_$40.first();
        }
        cdolist_list_var = cdolist_list_var.rest();
        frame = cdolist_list_var.first();
      }
    }
    return templates;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 50352L)
  public static SubLObject clear_psp_genl_posP()
  {
    final SubLObject cs = $psp_genl_posP_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 50352L)
  public static SubLObject remove_psp_genl_posP(final SubLObject pos1, final SubLObject pos2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = parsing_utilities.psp_lexicon_root_mt( UNPROVIDED );
    }
    return memoization_state.caching_state_remove_function_results_with_args( $psp_genl_posP_caching_state$.getGlobalValue(), ConsesLow.list( pos1, pos2, mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 50352L)
  public static SubLObject psp_genl_posP_internal(final SubLObject pos1, final SubLObject pos2, final SubLObject mt)
  {
    return lexicon_accessors.genl_posP( pos1, pos2, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 50352L)
  public static SubLObject psp_genl_posP(final SubLObject pos1, final SubLObject pos2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = parsing_utilities.psp_lexicon_root_mt( UNPROVIDED );
    }
    SubLObject caching_state = $psp_genl_posP_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym176$PSP_GENL_POS_, $sym177$_PSP_GENL_POS__CACHING_STATE_, NIL, EQUAL, THREE_INTEGER, $int178$32 );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_3( pos1, pos2, mt );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( pos1.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( pos2.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( NIL != cached_args && NIL == cached_args.rest() && mt.equal( cached_args.first() ) )
            {
              return memoization_state.caching_results( results2 );
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( psp_genl_posP_internal( pos1, pos2, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( pos1, pos2, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 50550L)
  public static SubLObject psp_devise_noun_templates_internal(final SubLObject word_unit, final SubLObject category, final SubLObject frames)
  {
    return ( NIL != word_unit && NIL != psp_chart.deverbal_noun_posP( category ) ) ? psp_devise_deverbal_noun_templates( word_unit, frames ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 50550L)
  public static SubLObject psp_devise_noun_templates(final SubLObject word_unit, final SubLObject category, final SubLObject frames)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return psp_devise_noun_templates_internal( word_unit, category, frames );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym179$PSP_DEVISE_NOUN_TEMPLATES, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym179$PSP_DEVISE_NOUN_TEMPLATES, THREE_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym179$PSP_DEVISE_NOUN_TEMPLATES, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_3( word_unit, category, frames );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( word_unit.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( category.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( NIL != cached_args && NIL == cached_args.rest() && frames.equal( cached_args.first() ) )
            {
              return memoization_state.caching_results( results2 );
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( psp_devise_noun_templates_internal( word_unit, category, frames ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( word_unit, category, frames ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 50759L)
  public static SubLObject psp_devise_deverbal_noun_templates(final SubLObject word_unit, final SubLObject frames)
  {
    SubLObject templates = NIL;
    SubLObject cdolist_list_var = frames;
    SubLObject frame = NIL;
    frame = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$41 = psp_devise_deverbal_noun_template( word_unit, frame );
      SubLObject template = NIL;
      template = cdolist_list_var_$41.first();
      while ( NIL != cdolist_list_var_$41)
      {
        templates = ConsesLow.cons( template, templates );
        cdolist_list_var_$41 = cdolist_list_var_$41.rest();
        template = cdolist_list_var_$41.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      frame = cdolist_list_var.first();
    }
    return templates;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 51084L)
  public static SubLObject psp_devise_deverbal_noun_template_internal(final SubLObject word_unit, final SubLObject frame)
  {
    SubLObject templates = NIL;
    if( function_terms.nart_to_naut( frame ).equal( $list181 ) )
    {
      SubLObject cdolist_list_var = lexicon_accessors.semtrans_of_wuXpos( word_unit, $const49$Verb, $const185$TransitiveNPFrame );
      SubLObject template = NIL;
      template = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( template.isCons() )
        {
          final SubLObject item_var = conses_high.subst( $kw114$NOUN, $kw103$ACTION, conses_high.subst( $kw182$OBLIQUE_OBJECT, $kw183$OBJECT, Sequences.remove_if( $sym184$PSP_SUBJECT_CLAUSE_, template, UNPROVIDED,
              UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
          if( NIL == conses_high.member( item_var, templates, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
          {
            templates = ConsesLow.cons( item_var, templates );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        template = cdolist_list_var.first();
      }
    }
    return templates;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 51084L)
  public static SubLObject psp_devise_deverbal_noun_template(final SubLObject word_unit, final SubLObject frame)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return psp_devise_deverbal_noun_template_internal( word_unit, frame );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym180$PSP_DEVISE_DEVERBAL_NOUN_TEMPLATE, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym180$PSP_DEVISE_DEVERBAL_NOUN_TEMPLATE, TWO_INTEGER, NIL, EQ, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym180$PSP_DEVISE_DEVERBAL_NOUN_TEMPLATE, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( word_unit, frame );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( word_unit.eql( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && frame.eql( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( psp_devise_deverbal_noun_template_internal( word_unit, frame ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( word_unit, frame ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 51573L)
  public static SubLObject psp_passivize_templates(final SubLObject templates, final SubLObject passive_frame)
  {
    SubLObject output_templates = NIL;
    final SubLObject active_frame = psp_chart.psp_active_frame( passive_frame );
    final SubLObject type = psp_chart.psp_passive_frame_type( passive_frame );
    final SubLObject p_dtr_key = psp_chart.psp_passivized_dtr_keyword( active_frame );
    SubLObject cdolist_list_var = templates;
    SubLObject template = NIL;
    template = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject var = psp_passivize_template( template, type, p_dtr_key );
      if( NIL != var )
      {
        output_templates = ConsesLow.cons( var, output_templates );
      }
      cdolist_list_var = cdolist_list_var.rest();
      template = cdolist_list_var.first();
    }
    return output_templates;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 52026L)
  public static SubLObject psp_passivize_template_internal(SubLObject template, final SubLObject type, final SubLObject p_dtr_key)
  {
    SubLObject v_clauses = ( NIL != el_utilities.el_conjunction_p( template ) ) ? cycl_utilities.formula_args( template, UNPROVIDED ) : ConsesLow.list( template );
    final SubLObject subject_clauses = list_utilities.remove_if_not( $sym184$PSP_SUBJECT_CLAUSE_, v_clauses, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( type == $kw187$PASSIVE_WITH_BY )
    {
      v_clauses = conses_high.subst( $kw188$BY_SUBJECT, $kw128$SUBJECT, v_clauses, UNPROVIDED, UNPROVIDED );
    }
    else
    {
      v_clauses = conses_high.set_difference( v_clauses, subject_clauses, UNPROVIDED, UNPROVIDED );
    }
    if( NIL != v_clauses )
    {
      template = psp_make_conjunction( v_clauses );
      template = conses_high.subst( $const189$TheActiveSubject, $kw128$SUBJECT, template, UNPROVIDED, UNPROVIDED );
      template = conses_high.subst( $kw128$SUBJECT, p_dtr_key, template, UNPROVIDED, UNPROVIDED );
      return template;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 52026L)
  public static SubLObject psp_passivize_template(final SubLObject template, final SubLObject type, final SubLObject p_dtr_key)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return psp_passivize_template_internal( template, type, p_dtr_key );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym186$PSP_PASSIVIZE_TEMPLATE, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym186$PSP_PASSIVIZE_TEMPLATE, THREE_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym186$PSP_PASSIVIZE_TEMPLATE, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_3( template, type, p_dtr_key );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( template.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( type.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( NIL != cached_args && NIL == cached_args.rest() && p_dtr_key.equal( cached_args.first() ) )
            {
              return memoization_state.caching_results( results2 );
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( psp_passivize_template_internal( template, type, p_dtr_key ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( template, type, p_dtr_key ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 52662L)
  public static SubLObject psp_quantify_templates(final SubLObject templates)
  {
    SubLObject output_templates = NIL;
    SubLObject cdolist_list_var = templates;
    SubLObject template = NIL;
    template = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      output_templates = ConsesLow.cons( psp_quantify_template( template ), output_templates );
      cdolist_list_var = cdolist_list_var.rest();
      template = cdolist_list_var.first();
    }
    return output_templates;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 52989L)
  public static SubLObject psp_quantify_template_internal(SubLObject template)
  {
    if( NIL != psp_quantifiable_template_p( template ) )
    {
      SubLObject cdolist_list_var = el_utilities.sentence_free_variables( template, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      SubLObject var = NIL;
      var = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject disjuncts = NIL;
        SubLObject cdolist_list_var_$42;
        final SubLObject dnfs = cdolist_list_var_$42 = psp_dnf_clausal_form( template );
        SubLObject dnf = NIL;
        dnf = cdolist_list_var_$42.first();
        while ( NIL != cdolist_list_var_$42)
        {
          SubLObject conjuncts = NIL;
          SubLObject scoped_conjuncts = NIL;
          SubLObject cdolist_list_var_$43 = clauses.neg_lits( dnf );
          SubLObject neg_lit = NIL;
          neg_lit = cdolist_list_var_$43.first();
          while ( NIL != cdolist_list_var_$43)
          {
            if( NIL != cycl_utilities.expression_find( var, neg_lit, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
            {
              scoped_conjuncts = ConsesLow.cons( el_utilities.make_negation( neg_lit ), scoped_conjuncts );
            }
            else
            {
              conjuncts = ConsesLow.cons( el_utilities.make_negation( neg_lit ), conjuncts );
            }
            cdolist_list_var_$43 = cdolist_list_var_$43.rest();
            neg_lit = cdolist_list_var_$43.first();
          }
          SubLObject cdolist_list_var_$44 = clauses.pos_lits( dnf );
          SubLObject pos_lit = NIL;
          pos_lit = cdolist_list_var_$44.first();
          while ( NIL != cdolist_list_var_$44)
          {
            if( NIL != cycl_utilities.expression_find( var, pos_lit, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
            {
              scoped_conjuncts = ConsesLow.cons( pos_lit, scoped_conjuncts );
            }
            else
            {
              conjuncts = ConsesLow.cons( pos_lit, conjuncts );
            }
            cdolist_list_var_$44 = cdolist_list_var_$44.rest();
            pos_lit = cdolist_list_var_$44.first();
          }
          final SubLObject scoped_conjunction = psp_make_conjunction( scoped_conjuncts );
          final SubLObject scoped_conjunct = psp_make_existential( var, scoped_conjunction );
          disjuncts = ConsesLow.cons( psp_make_conjunction( ConsesLow.cons( scoped_conjunct, conjuncts ) ), disjuncts );
          cdolist_list_var_$42 = cdolist_list_var_$42.rest();
          dnf = cdolist_list_var_$42.first();
        }
        template = psp_make_disjunction( disjuncts );
        cdolist_list_var = cdolist_list_var.rest();
        var = cdolist_list_var.first();
      }
    }
    return template;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 52989L)
  public static SubLObject psp_quantify_template(final SubLObject template)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return psp_quantify_template_internal( template );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym190$PSP_QUANTIFY_TEMPLATE, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym190$PSP_QUANTIFY_TEMPLATE, ONE_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym190$PSP_QUANTIFY_TEMPLATE, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, template, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( psp_quantify_template_internal( template ) ) );
      memoization_state.caching_state_put( caching_state, template, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 53940L)
  public static SubLObject psp_quantifiable_template_p(final SubLObject template)
  {
    return makeBoolean( NIL != el_utilities.atomic_sentenceP( template ) || NIL != el_utilities.el_conjunction_p( template ) || NIL != el_utilities.el_existential_p( template ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 54105L)
  public static SubLObject psp_make_conjunction(final SubLObject conjuncts)
  {
    final SubLObject pcase_var = Sequences.length( conjuncts );
    if( pcase_var.eql( ZERO_INTEGER ) )
    {
      Errors.warn( $str191$__PSP_MAKE_CONJUNCTION_passed_NIL );
      return NIL;
    }
    if( pcase_var.eql( ONE_INTEGER ) )
    {
      return conjuncts.first();
    }
    return el_utilities.make_conjunction( conjuncts );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 54320L)
  public static SubLObject psp_make_disjunction(final SubLObject disjuncts)
  {
    final SubLObject pcase_var = Sequences.length( disjuncts );
    if( pcase_var.eql( ZERO_INTEGER ) )
    {
      Errors.warn( $str192$__PSP_MAKE_DISJUNCTION_passed_NIL );
      return NIL;
    }
    if( pcase_var.eql( ONE_INTEGER ) )
    {
      return disjuncts.first();
    }
    return el_utilities.make_disjunction( disjuncts );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 54535L)
  public static SubLObject psp_make_existential(final SubLObject var, final SubLObject formula)
  {
    if( NIL != psp_davidsonian_clause_p( formula, UNPROVIDED ) )
    {
      final SubLObject head = cycl_utilities.formula_arg1( formula, UNPROVIDED );
      final SubLObject prop = cycl_utilities.formula_arg1( cycl_utilities.formula_arg2( formula, UNPROVIDED ), UNPROVIDED );
      return psp_make_davidsonian_clause( head, el_utilities.make_existential( var, prop ) );
    }
    return el_utilities.make_existential( var, formula );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 54849L)
  public static SubLObject psp_davidsonianize_verb_templates(final SubLObject templates, final SubLObject category)
  {
    if( NIL == psp_rules.psp_valid_constituent_typeP( category, $const49$Verb ) )
    {
      return templates;
    }
    SubLObject output_templates = NIL;
    SubLObject cdolist_list_var = templates;
    SubLObject template = NIL;
    template = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      output_templates = ConsesLow.cons( psp_davidsonianize_verb_template( template ), output_templates );
      cdolist_list_var = cdolist_list_var.rest();
      template = cdolist_list_var.first();
    }
    return output_templates;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 55311L)
  public static SubLObject psp_davidsonianize_verb_template_internal(final SubLObject template)
  {
    if( NIL != psp_contains_isa_clauseP( template, $kw103$ACTION ) )
    {
      return template;
    }
    if( NIL != cycl_utilities.expression_find( $kw103$ACTION, template, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      final SubLObject action_type = psp_action_type( template );
      return simplifier.conjoin( ConsesLow.list( el_utilities.make_binary_formula( $const105$isa, $kw103$ACTION, action_type ), template ), T );
    }
    return psp_make_davidsonian_clause( $kw103$ACTION, template );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 55311L)
  public static SubLObject psp_davidsonianize_verb_template(final SubLObject template)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return psp_davidsonianize_verb_template_internal( template );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym193$PSP_DAVIDSONIANIZE_VERB_TEMPLATE, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym193$PSP_DAVIDSONIANIZE_VERB_TEMPLATE, ONE_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym193$PSP_DAVIDSONIANIZE_VERB_TEMPLATE, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, template, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( psp_davidsonianize_verb_template_internal( template ) ) );
      memoization_state.caching_state_put( caching_state, template, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 55824L)
  public static SubLObject psp_action_type(final SubLObject template)
  {
    SubLObject action_type = $const152$Thing;
    final SubLObject raw_constraint = rbp_wff.rbp_formula_variable_isa_constraints( template, $kw103$ACTION ).first();
    if( NIL != raw_constraint )
    {
      SubLObject current;
      final SubLObject datum = current = raw_constraint;
      SubLObject type = NIL;
      SubLObject target = NIL;
      SubLObject constraint_mt = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list194 );
      type = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list194 );
      target = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list194 );
      constraint_mt = current.first();
      current = current.rest();
      if( NIL == current )
      {
        final SubLObject pcase_var = type;
        if( pcase_var.eql( $kw195$ISA ) )
        {
          action_type = target;
        }
        else if( pcase_var.eql( $kw196$GENL ) || pcase_var.eql( $kw197$NOT_DISJOINT ) )
        {
          action_type = el_utilities.make_unary_formula( $const198$SpecsFn, target );
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list194 );
      }
    }
    return action_type;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 56359L)
  public static SubLObject psp_contains_isa_clauseP(final SubLObject formula, final SubLObject target)
  {
    SubLObject ans = NIL;
    final SubLObject v_clauses = ( NIL != el_utilities.el_conjunction_p( formula ) ) ? cycl_utilities.formula_args( formula, UNPROVIDED ) : ConsesLow.list( formula );
    if( NIL == ans )
    {
      SubLObject csome_list_var;
      SubLObject clause;
      for( csome_list_var = v_clauses, clause = NIL, clause = csome_list_var.first(); NIL == ans && NIL != csome_list_var; ans = makeBoolean( clause.isCons() && conses_high.butlast( clause, UNPROVIDED ).equal( ConsesLow
          .list( $const105$isa, target ) ) ), csome_list_var = csome_list_var.rest(), clause = csome_list_var.first() )
      {
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 56670L)
  public static SubLObject psp_ok_templateP(final SubLObject template, final SubLObject category, SubLObject frame)
  {
    if( frame == UNPROVIDED )
    {
      frame = $kw112$UNSPECIFIED;
    }
    return makeBoolean( NIL != psp_no_isa_clause_neededP( category ) || NIL != psp_ok_templateP_int( template, category, frame ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 56974L)
  public static SubLObject psp_ok_templateP_int_internal(final SubLObject template, final SubLObject category, final SubLObject frame)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject head_key = psp_head_key_for_category( category, frame );
    final SubLObject okP = psp_contains_isa_clauseP( template, head_key );
    if( NIL == okP && NIL != parsing_vars.$psp_verboseP$.getDynamicValue( thread ) )
    {
      Errors.warn( $str200$Non_canonical_semtrans_template__, head_key, template );
    }
    return okP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 56974L)
  public static SubLObject psp_ok_templateP_int(final SubLObject template, final SubLObject category, final SubLObject frame)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return psp_ok_templateP_int_internal( template, category, frame );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym199$PSP_OK_TEMPLATE__INT, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym199$PSP_OK_TEMPLATE__INT, THREE_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym199$PSP_OK_TEMPLATE__INT, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_3( template, category, frame );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( template.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( category.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( NIL != cached_args && NIL == cached_args.rest() && frame.equal( cached_args.first() ) )
            {
              return memoization_state.caching_results( results2 );
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( psp_ok_templateP_int_internal( template, category, frame ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( template, category, frame ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 57337L)
  public static SubLObject psp_no_isa_clause_neededP(final SubLObject category)
  {
    return makeBoolean( NIL == subl_promotions.memberP( category, $list201, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 57558L)
  public static SubLObject psp_add_nl_tags(final SubLObject semx, final SubLObject edge)
  {
    final SubLObject category = psp_chart.get_psp_edge_category( edge );
    final SubLObject rule_fort = psp_chart.psp_edge_rule_fort( edge );
    if( NIL != conses_high.member( rule_fort, $list202, UNPROVIDED, UNPROVIDED ) )
    {
      return semx;
    }
    if( NIL != lexicon_accessors.npP( category ) && NIL != lexicon_vars.name_or_term_strings_predP( psp_chart.get_psp_edge_pos_pred( edge ) ) )
    {
      return psp_add_name_tags( copy_psp_cycls( semx ), edge );
    }
    if( rule_fort.eql( $const203$PSRule_GerundNPFromVbar ) )
    {
      return psp_add_np_tags( psp_add_nbar_tags( copy_psp_cycls( semx ), edge ), edge );
    }
    if( NIL != lexicon_accessors.nbarP( category ) )
    {
      return psp_add_nbar_tags( copy_psp_cycls( semx ), edge );
    }
    if( NIL != lexicon_accessors.npP( category ) )
    {
      return psp_add_np_tags( copy_psp_cycls( semx ), edge );
    }
    return semx;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 58380L)
  public static SubLObject psp_add_name_tags(final SubLObject psp_cycls, final SubLObject edge)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    final SubLObject start_index = psp_chart.psp_edge_start_index( edge );
    SubLObject cdolist_list_var = psp_cycls;
    SubLObject psp_cycl = NIL;
    psp_cycl = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject cycl = psp_cycl_cycl( psp_cycl );
      SubLObject tagged_cycl = ( NIL != parsing_vars.$use_ternary_np_tagsP$.getDynamicValue( thread ) ) ? ConsesLow.list( $const204$NLQuantFn_3, $const205$ProperName_NLAttr, cycl, start_index )
          : ConsesLow.list( $const206$NLQuantFn, $const205$ProperName_NLAttr, cycl );
      if( NIL != psp_weighted_cycl_p( psp_cycl ) )
      {
        psp_weighted_cycl_set_cycl( psp_cycl, tagged_cycl );
        tagged_cycl = psp_cycl;
      }
      ans = ConsesLow.cons( tagged_cycl, ans );
      psp_parse_tree_generator.psp_note_semantic_dependency( edge, tagged_cycl, edge, cycl );
      cdolist_list_var = cdolist_list_var.rest();
      psp_cycl = cdolist_list_var.first();
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 58968L)
  public static SubLObject psp_add_nbar_tags(final SubLObject psp_cycls, final SubLObject edge)
  {
    SubLObject pred = psp_chart.get_psp_edge_pos_pred( edge );
    SubLObject ans = NIL;
    if( NIL != lexicon_vars.name_string_predP( pred ) )
    {
      pred = psp_guess_agr_pred( psp_chart.get_psp_edge_string( edge ) );
    }
    SubLObject cdolist_list_var = psp_cycls;
    SubLObject psp_cycl = NIL;
    psp_cycl = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject cycl = psp_cycl_cycl( psp_cycl );
      SubLObject tagged_cycl = parsing_utilities.add_nl_number_wrapper( cycl, pred );
      if( NIL != psp_weighted_cycl_p( psp_cycl ) )
      {
        psp_weighted_cycl_set_cycl( psp_cycl, tagged_cycl );
        tagged_cycl = psp_cycl;
      }
      ans = ConsesLow.cons( tagged_cycl, ans );
      psp_parse_tree_generator.psp_note_semantic_dependency( edge, tagged_cycl, edge, cycl );
      cdolist_list_var = cdolist_list_var.rest();
      psp_cycl = cdolist_list_var.first();
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 59582L)
  public static SubLObject psp_guess_agr_pred(final SubLObject string)
  {
    if( NIL != morphology.plural_nounP( string ) )
    {
      return $const90$plural_Generic;
    }
    return $const207$singular_Generic;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 59720L)
  public static SubLObject psp_add_np_tags(final SubLObject psp_cycls, final SubLObject edge)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != psp_chart.psp_gap_edge_p( edge ) )
    {
      return psp_cycls;
    }
    final SubLObject start_index = psp_chart.psp_edge_start_index( edge );
    final SubLObject left_dtr = psp_chart.psp_edge_nth_dtr( ONE_INTEGER, edge );
    SubLObject det_cycls = NIL;
    SubLObject det_head_category = NIL;
    SubLObject det_head_string = $str208$;
    SubLObject det_string = $str208$;
    SubLObject ans = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( parsing_utilities.psp_lexicon_root_mt( UNPROVIDED ) );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      if( NIL != psp_chart.psp_edge_starts_with_detpP( edge ) )
      {
        det_string = psp_chart.get_psp_edge_string( left_dtr );
        det_cycls = psp_cycls_to_cycls( psp_semantics_for_edge_int( left_dtr, $kw37$DENOT_GROUND ) );
        det_head_category = psp_chart.get_psp_edge_category( psp_chart.psp_edge_lexical_head_dtr( left_dtr ) );
        det_head_string = psp_chart.get_psp_edge_string( psp_chart.psp_edge_lexical_head_dtr( left_dtr ) );
      }
      SubLObject cdolist_list_var = psp_cycls;
      SubLObject psp_cycl = NIL;
      psp_cycl = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject cycl = psp_cycl_cycl( psp_cycl );
        SubLObject cdolist_list_var_$45 = parsing_utilities.add_nl_def_wrapper( cycl, det_string, det_head_category, det_cycls, start_index );
        SubLObject def_tagged_cycl = NIL;
        def_tagged_cycl = cdolist_list_var_$45.first();
        while ( NIL != cdolist_list_var_$45)
        {
          SubLObject cdolist_list_var_$46 = parsing_utilities.add_nl_quant_wrapper( def_tagged_cycl, det_head_string, det_cycls, start_index );
          SubLObject tagged_cycl = NIL;
          tagged_cycl = cdolist_list_var_$46.first();
          while ( NIL != cdolist_list_var_$46)
          {
            if( NIL != el_utilities.el_formula_p( tagged_cycl ) && ( NIL == el_utilities.el_formula_p( cycl ) || NIL != psp_nl_tag_addedP( tagged_cycl, cycl ) ) )
            {
              if( NIL != psp_weighted_cycl_p( psp_cycl ) )
              {
                psp_weighted_cycl_set_cycl( psp_cycl, tagged_cycl );
                tagged_cycl = psp_cycl;
              }
              ans = ConsesLow.cons( tagged_cycl, ans );
              psp_parse_tree_generator.psp_note_semantic_dependency( edge, tagged_cycl, edge, cycl );
            }
            psp_parse_tree_generator.psp_note_semantic_dependency( edge, tagged_cycl, edge, cycl );
            cdolist_list_var_$46 = cdolist_list_var_$46.rest();
            tagged_cycl = cdolist_list_var_$46.first();
          }
          cdolist_list_var_$45 = cdolist_list_var_$45.rest();
          def_tagged_cycl = cdolist_list_var_$45.first();
        }
        cdolist_list_var = cdolist_list_var.rest();
        psp_cycl = cdolist_list_var.first();
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 61381L)
  public static SubLObject psp_nl_tag_addedP(final SubLObject tagged_cycl, final SubLObject cycl)
  {
    final SubLObject tag_fn = cycl_utilities.formula_arg0( tagged_cycl );
    return makeBoolean( NIL != parsing_utilities.nl_tag_fnP( tag_fn, UNPROVIDED ) && !tag_fn.eql( cycl_utilities.formula_arg0( cycl ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 61647L)
  public static SubLObject psp_extract_subject_semx(final SubLObject psp_cycl)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    SubLObject new_cycl = psp_extract_subject_semx_int( psp_cycl_cycl( psp_cycl ) );
    final SubLObject subject_role = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != psp_weighted_cycl_p( psp_cycl ) )
    {
      final SubLObject weight = psp_cycl_weight( psp_cycl );
      new_cycl = psp_weight_cycl( new_cycl, weight );
    }
    return Values.values( new_cycl, subject_role );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 62251L)
  public static SubLObject psp_extract_subject_semx_int_internal(final SubLObject cycl)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject new_cycl = cycl;
    SubLObject subject_role = NIL;
    if( NIL != el_utilities.el_conjunction_p( cycl ) )
    {
      SubLObject new_conjuncts = NIL;
      final SubLObject args = cycl_utilities.formula_args( cycl, $kw210$IGNORE );
      SubLObject rest;
      SubLObject conjunct;
      for( rest = NIL, rest = args; NIL == subject_role && NIL != rest; rest = rest.rest() )
      {
        conjunct = rest.first();
        if( NIL != psp_subject_clauseP( conjunct ) )
        {
          new_conjuncts = Sequences.remove( conjunct, cycl_utilities.formula_args( cycl, UNPROVIDED ), Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          new_cycl = simplifier.nconjoin( new_conjuncts, UNPROVIDED );
          subject_role = cycl_utilities.formula_arg0( conjunct );
        }
      }
    }
    else
    {
      thread.resetMultipleValues();
      final SubLObject coll = parsing_utilities.parse_collection_expression( cycl );
      final SubLObject var = thread.secondMultipleValue();
      final SubLObject restrictions = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      SubLObject new_clauses = NIL;
      if( NIL == subject_role )
      {
        SubLObject csome_list_var = restrictions;
        SubLObject clause = NIL;
        clause = csome_list_var.first();
        while ( NIL == subject_role && NIL != csome_list_var)
        {
          if( NIL != psp_subject_clauseP( clause ) )
          {
            new_clauses = Sequences.remove( clause, restrictions, Symbols.symbol_function( EQUALP ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            new_cycl = parsing_utilities.make_collection_expression( coll, var, new_clauses );
            subject_role = cycl_utilities.formula_arg0( clause );
          }
          csome_list_var = csome_list_var.rest();
          clause = csome_list_var.first();
        }
      }
    }
    new_cycl = psp_cyclify_subject( new_cycl );
    return Values.values( new_cycl, subject_role );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 62251L)
  public static SubLObject psp_extract_subject_semx_int(final SubLObject cycl)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return psp_extract_subject_semx_int_internal( cycl );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym209$PSP_EXTRACT_SUBJECT_SEMX_INT, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym209$PSP_EXTRACT_SUBJECT_SEMX_INT, ONE_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym209$PSP_EXTRACT_SUBJECT_SEMX_INT, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, cycl, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( psp_extract_subject_semx_int_internal( cycl ) ) );
      memoization_state.caching_state_put( caching_state, cycl, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 63415L)
  public static SubLObject psp_cyclify_subject(final SubLObject cycl)
  {
    return conses_high.subst( $const211$TheSentenceSubject, $kw128$SUBJECT, cycl, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 63511L)
  public static SubLObject psp_quantify_subject(final SubLObject cycl)
  {
    if( NIL != cycl_utilities.expression_find( $const211$TheSentenceSubject, cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      final SubLObject var = czer_utilities.unique_el_var_wrt_expression( cycl, $sym212$_SUBJECT );
      return psp_quantify_template( conses_high.subst( var, $const211$TheSentenceSubject, cycl, UNPROVIDED, UNPROVIDED ) );
    }
    return cycl;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 63763L)
  public static SubLObject psp_subject_clauseP(final SubLObject clause)
  {
    return makeBoolean( NIL != el_utilities.el_formula_p( clause ) && NIL != el_utilities.formula_arityE( clause, TWO_INTEGER, UNPROVIDED ) && cycl_utilities.formula_arg2( clause, UNPROVIDED ) == $kw128$SUBJECT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 63922L)
  public static SubLObject psp_filter_cycls_by_generality(SubLObject cycls)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( parsing_vars.$psp_generality_preference$.getDynamicValue( thread ) != $kw79$NONE && NIL == list_utilities.lengthL( cycls, TWO_INTEGER, UNPROVIDED ) )
    {
      cycls = psp_remove_dispreferred_cycls( cycls );
    }
    return cycls;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 64394L)
  public static SubLObject psp_remove_dispreferred_cycls_internal(final SubLObject cycls)
  {
    SubLObject output_cycls = NIL;
    SubLObject cdolist_list_var = psp_sort_cycls_by_generality( cycls );
    SubLObject cycl = NIL;
    cycl = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == Sequences.find( cycl, output_cycls, $sym214$PSP_LESS_PREFERABLE_CYCL_, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        output_cycls = ConsesLow.cons( cycl, output_cycls );
      }
      cdolist_list_var = cdolist_list_var.rest();
      cycl = cdolist_list_var.first();
    }
    return Sequences.nreverse( output_cycls );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 64394L)
  public static SubLObject psp_remove_dispreferred_cycls(final SubLObject cycls)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return psp_remove_dispreferred_cycls_internal( cycls );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym213$PSP_REMOVE_DISPREFERRED_CYCLS, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym213$PSP_REMOVE_DISPREFERRED_CYCLS, ONE_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym213$PSP_REMOVE_DISPREFERRED_CYCLS, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, cycls, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( psp_remove_dispreferred_cycls_internal( cycls ) ) );
      memoization_state.caching_state_put( caching_state, cycls, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 64813L)
  public static SubLObject psp_less_preferable_cyclP(final SubLObject cycl1, final SubLObject cycl2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( parsing_vars.$psp_generality_preference$.getDynamicValue( thread ) == $kw79$NONE )
    {
      return NIL;
    }
    return psp_less_preferable_cyclP_recursive( psp_cycl_cycl( cycl1 ), psp_cycl_cycl( cycl2 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 65043L)
  public static SubLObject psp_less_preferable_cyclP_recursive(final SubLObject cycl1, final SubLObject cycl2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    if( !cycl1.equal( cycl2 ) )
    {
      if( NIL != forts.fort_p( cycl1 ) && NIL != forts.fort_p( cycl2 ) )
      {
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$relevant_mt_function$.bind( $sym215$RELEVANT_MT_IS_EVERYTHING, thread );
          mt_relevance_macros.$mt$.bind( $const216$EverythingPSC, thread );
          if( NIL == ans )
          {
            SubLObject csome_list_var = conses_high.intersection( fort_types_interface.fort_types( cycl1, UNPROVIDED ), fort_types_interface.fort_types( cycl2, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
            SubLObject fort_type = NIL;
            fort_type = csome_list_var.first();
            while ( NIL == ans && NIL != csome_list_var)
            {
              final SubLObject pcase_var = fort_type;
              if( pcase_var.eql( $const172$Collection ) )
              {
                final SubLObject pcase_var_$47 = parsing_vars.$psp_generality_preference$.getDynamicValue( thread );
                if( pcase_var_$47.eql( $kw217$GENERAL ) )
                {
                  ans = rbp_wff.npp_genlP( cycl1, cycl2, UNPROVIDED );
                }
                else if( pcase_var_$47.eql( $kw218$SPECIFIC ) )
                {
                  ans = rbp_wff.npp_genlP( cycl2, cycl1, UNPROVIDED );
                }
              }
              csome_list_var = csome_list_var.rest();
              fort_type = csome_list_var.first();
            }
          }
        }
        finally
        {
          mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
        }
      }
      else if( NIL != el_utilities.el_formula_p( cycl1 ) && NIL != el_utilities.el_formula_p( cycl2 ) && NIL != list_utilities.same_length_p( cycl1, cycl2 ) && NIL == ans )
      {
        SubLObject term1;
        SubLObject term1_$48;
        SubLObject term2;
        SubLObject term2_$49;
        for( term1 = NIL, term1_$48 = NIL, term2 = NIL, term2_$49 = NIL, term1 = cycl1, term1_$48 = term1.first(), term2 = cycl2, term2_$49 = term2.first(); NIL == ans && ( NIL != term2
            || NIL != term1 ); ans = psp_less_preferable_cyclP_recursive( term1_$48, term2_$49 ), term1 = term1.rest(), term1_$48 = term1.first(), term2 = term2.rest(), term2_$49 = term2.first() )
        {
        }
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 65951L)
  public static SubLObject psp_nsort_cycls_by_generality(final SubLObject cycls)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject pcase_var = parsing_vars.$psp_generality_preference$.getDynamicValue( thread );
    if( pcase_var.eql( $kw217$GENERAL ) )
    {
      return Sort.sort( cycls, Symbols.symbol_function( $sym219$_ ), $sym220$PSP_GENERALITY_ESTIMATE );
    }
    if( pcase_var.eql( $kw218$SPECIFIC ) )
    {
      return Sort.sort( cycls, Symbols.symbol_function( $sym221$_ ), $sym220$PSP_GENERALITY_ESTIMATE );
    }
    return cycls;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 66237L)
  public static SubLObject psp_sort_cycls_by_generality(final SubLObject cycls)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject pcase_var = parsing_vars.$psp_generality_preference$.getDynamicValue( thread );
    if( pcase_var.eql( $kw217$GENERAL ) )
    {
      return Sort.sort( conses_high.copy_list( cycls ), Symbols.symbol_function( $sym219$_ ), $sym220$PSP_GENERALITY_ESTIMATE );
    }
    if( pcase_var.eql( $kw218$SPECIFIC ) )
    {
      return Sort.sort( conses_high.copy_list( cycls ), Symbols.symbol_function( $sym221$_ ), $sym220$PSP_GENERALITY_ESTIMATE );
    }
    return cycls;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 66550L)
  public static SubLObject psp_generality_estimate(final SubLObject v_term)
  {
    return psp_generality_estimate_recursive( v_term );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-semantics.lisp", position = 66648L)
  public static SubLObject psp_generality_estimate_recursive(final SubLObject v_term)
  {
    if( NIL != el_utilities.el_formula_p( v_term ) )
    {
      return Functions.apply( Symbols.symbol_function( $sym222$_ ), Mapping.mapcar( $sym223$PSP_GENERALITY_ESTIMATE_RECURSIVE, v_term ) );
    }
    return cardinality_estimates.generality_estimate( v_term );
  }

  public static SubLObject declare_psp_semantics_file()
  {
    SubLFiles.declareFunction( me, "psp_mother_of_current_edge", "PSP-MOTHER-OF-CURRENT-EDGE", 0, 0, false );
    SubLFiles.declareFunction( me, "phrase_structure_parser_weighted_cycl_print_function_trampoline", "PHRASE-STRUCTURE-PARSER-WEIGHTED-CYCL-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "phrase_structure_parser_weighted_cycl_p", "PHRASE-STRUCTURE-PARSER-WEIGHTED-CYCL-P", 1, 0, false );
    new $phrase_structure_parser_weighted_cycl_p$UnaryFunction();
    SubLFiles.declareFunction( me, "psp_weighted_cycl_cycl", "PSP-WEIGHTED-CYCL-CYCL", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_weighted_cycl_weight", "PSP-WEIGHTED-CYCL-WEIGHT", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_psp_weighted_cycl_cycl", "_CSETF-PSP-WEIGHTED-CYCL-CYCL", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_psp_weighted_cycl_weight", "_CSETF-PSP-WEIGHTED-CYCL-WEIGHT", 2, 0, false );
    SubLFiles.declareFunction( me, "make_phrase_structure_parser_weighted_cycl", "MAKE-PHRASE-STRUCTURE-PARSER-WEIGHTED-CYCL", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_phrase_structure_parser_weighted_cycl", "VISIT-DEFSTRUCT-PHRASE-STRUCTURE-PARSER-WEIGHTED-CYCL", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_phrase_structure_parser_weighted_cycl_method", "VISIT-DEFSTRUCT-OBJECT-PHRASE-STRUCTURE-PARSER-WEIGHTED-CYCL-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "psp_weighted_cycl_p", "PSP-WEIGHTED-CYCL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "contains_psp_weighted_cycl_p", "CONTAINS-PSP-WEIGHTED-CYCL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "pprint_psp_weighted_cycl", "PPRINT-PSP-WEIGHTED-CYCL", 1, 2, false );
    SubLFiles.declareFunction( me, "psp_weight_cycl", "PSP-WEIGHT-CYCL", 2, 0, false );
    SubLFiles.declareFunction( me, "psp_cycl_weight_L", "PSP-CYCL-WEIGHT-<", 2, 1, false );
    SubLFiles.declareFunction( me, "sort_psp_cycls_by_weight_ascending", "SORT-PSP-CYCLS-BY-WEIGHT-ASCENDING", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_cycl_weight", "PSP-CYCL-WEIGHT", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_cycl_cycl", "PSP-CYCL-CYCL", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_cycls_to_cycls", "PSP-CYCLS-TO-CYCLS", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_cycl_E", "PSP-CYCL-=", 2, 0, false );
    SubLFiles.declareFunction( me, "new_psp_weighted_cycl", "NEW-PSP-WEIGHTED-CYCL", 2, 0, false );
    SubLFiles.declareFunction( me, "copy_psp_cycls", "COPY-PSP-CYCLS", 1, 0, false );
    SubLFiles.declareFunction( me, "copy_psp_cycl", "COPY-PSP-CYCL", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_cycl_subst", "PSP-CYCL-SUBST", 3, 0, false );
    SubLFiles.declareFunction( me, "psp_weighted_cycl_set_cycl", "PSP-WEIGHTED-CYCL-SET-CYCL", 2, 0, false );
    SubLFiles.declareFunction( me, "psp_weighted_cycl_set_weight", "PSP-WEIGHTED-CYCL-SET-WEIGHT", 2, 0, false );
    SubLFiles.declareFunction( me, "psp_semantics_for_edge", "PSP-SEMANTICS-FOR-EDGE", 1, 2, false );
    SubLFiles.declareFunction( me, "psp_semantics_for_edge_int", "PSP-SEMANTICS-FOR-EDGE-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "psp_compute_semantics", "PSP-COMPUTE-SEMANTICS", 3, 0, false );
    SubLFiles.declareFunction( me, "psp_semantic_output_type", "PSP-SEMANTIC-OUTPUT-TYPE", 2, 0, false );
    SubLFiles.declareFunction( me, "psp_template_form", "PSP-TEMPLATE-FORM", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_semantic_computation_type", "PSP-SEMANTIC-COMPUTATION-TYPE", 2, 0, false );
    SubLFiles.declareFunction( me, "clear_psp_category_from_frame", "CLEAR-PSP-CATEGORY-FROM-FRAME", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_psp_category_from_frame", "REMOVE-PSP-CATEGORY-FROM-FRAME", 1, 1, false );
    SubLFiles.declareFunction( me, "psp_category_from_frame_internal", "PSP-CATEGORY-FROM-FRAME-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "psp_category_from_frame", "PSP-CATEGORY-FROM-FRAME", 1, 1, false );
    SubLFiles.declareFunction( me, "psp_edge_lexical_semx", "PSP-EDGE-LEXICAL-SEMX", 2, 0, false );
    SubLFiles.declareFunction( me, "psp_edge_unary_semx", "PSP-EDGE-UNARY-SEMX", 2, 0, false );
    SubLFiles.declareFunction( me, "psp_edge_multi_dtr_semx", "PSP-EDGE-MULTI-DTR-SEMX", 2, 0, false );
    SubLFiles.declareFunction( me, "psp_determine_semantic_dependencies", "PSP-DETERMINE-SEMANTIC-DEPENDENCIES", 3, 0, false );
    SubLFiles.declareFunction( me, "psp_semx_slurp_handlers", "PSP-SEMX-SLURP-HANDLERS", 0, 1, false );
    SubLFiles.declareFunction( me, "psp_semx_clear_handlers", "PSP-SEMX-CLEAR-HANDLERS", 0, 0, false );
    SubLFiles.declareFunction( me, "psp_special_methods_for_output_type", "PSP-SPECIAL-METHODS-FOR-OUTPUT-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_edge_semx_specialP", "PSP-EDGE-SEMX-SPECIAL?", 2, 0, false );
    SubLFiles.declareFunction( me, "psp_edge_special_method", "PSP-EDGE-SPECIAL-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "psp_edge_special_semx", "PSP-EDGE-SPECIAL-SEMX", 2, 0, false );
    SubLFiles.declareFunction( me, "psp_semx_for_participle_rel_clause_nbar", "PSP-SEMX-FOR-PARTICIPLE-REL-CLAUSE-NBAR", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_semx_for_det_nbar", "PSP-SEMX-FOR-DET-NBAR", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_possessive_det_posP", "PSP-POSSESSIVE-DET-POS?", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_semx_for_of_noun_compound", "PSP-SEMX-FOR-OF-NOUN-COMPOUND", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_semx_for_noun_compound", "PSP-SEMX-FOR-NOUN-COMPOUND", 1, 0, false );
    SubLFiles.declareFunction( me, "rbp_tokens_from_edge", "RBP-TOKENS-FROM-EDGE", 2, 0, false );
    SubLFiles.declareFunction( me, "psp_regular_pluralP", "PSP-REGULAR-PLURAL?", 2, 0, false );
    SubLFiles.declareFunction( me, "psp_closed_class_edge_likely_misconstrued_as_nameP", "PSP-CLOSED-CLASS-EDGE-LIKELY-MISCONSTRUED-AS-NAME?", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_closed_class_likely_misconstrued_as_nameP", "PSP-CLOSED-CLASS-LIKELY-MISCONSTRUED-AS-NAME?", 3, 0, false );
    SubLFiles.declareFunction( me, "psp_parse_noun_compound_tokens_internal", "PSP-PARSE-NOUN-COMPOUND-TOKENS-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_parse_noun_compound_tokens", "PSP-PARSE-NOUN-COMPOUND-TOKENS", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_semx_for_gerund_np", "PSP-SEMX-FOR-GERUND-NP", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_semx_for_appositive_np", "PSP-SEMX-FOR-APPOSITIVE-NP", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_modifier_dtrP", "PSP-MODIFIER-DTR?", 2, 0, false );
    SubLFiles.declareFunction( me, "psp_head_key_from_bindings", "PSP-HEAD-KEY-FROM-BINDINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "psp_coerce_templates_to_collections", "PSP-COERCE-TEMPLATES-TO-COLLECTIONS", 4, 0, false );
    SubLFiles.declareFunction( me, "psp_coerce_template_to_collection", "PSP-COERCE-TEMPLATE-TO-COLLECTION", 3, 0, false );
    SubLFiles.declareFunction( me, "psp_coerce_template_to_collection_memoized_internal", "PSP-COERCE-TEMPLATE-TO-COLLECTION-MEMOIZED-INTERNAL", 3, 0, false );
    SubLFiles.declareFunction( me, "psp_coerce_template_to_collection_memoized", "PSP-COERCE-TEMPLATE-TO-COLLECTION-MEMOIZED", 3, 0, false );
    SubLFiles.declareFunction( me, "psp_handle_keywords_in_formula", "PSP-HANDLE-KEYWORDS-IN-FORMULA", 3, 0, false );
    SubLFiles.declareFunction( me, "psp_handle_keyword_in_formula", "PSP-HANDLE-KEYWORD-IN-FORMULA", 2, 0, false );
    SubLFiles.declareFunction( me, "psp_davidsonian_clause_p", "PSP-DAVIDSONIAN-CLAUSE-P", 1, 1, false );
    SubLFiles.declareFunction( me, "psp_make_davidsonian_clause", "PSP-MAKE-DAVIDSONIAN-CLAUSE", 2, 0, false );
    SubLFiles.declareFunction( me, "psp_find_isa", "PSP-FIND-ISA", 2, 0, false );
    SubLFiles.declareFunction( me, "psp_extract_head_semx", "PSP-EXTRACT-HEAD-SEMX", 2, 0, false );
    SubLFiles.declareFunction( me, "psp_dnf_clausal_form", "PSP-DNF-CLAUSAL-FORM", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_dnf_for_sentence", "PSP-DNF-FOR-SENTENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_psp_head_key_for_category", "CLEAR-PSP-HEAD-KEY-FOR-CATEGORY", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_psp_head_key_for_category", "REMOVE-PSP-HEAD-KEY-FOR-CATEGORY", 1, 1, false );
    SubLFiles.declareFunction( me, "psp_head_key_for_category_internal", "PSP-HEAD-KEY-FOR-CATEGORY-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "psp_head_key_for_category", "PSP-HEAD-KEY-FOR-CATEGORY", 1, 1, false );
    SubLFiles.declareFunction( me, "psp_substitute_bindings_internal", "PSP-SUBSTITUTE-BINDINGS-INTERNAL", 3, 0, false );
    SubLFiles.declareFunction( me, "psp_substitute_bindings", "PSP-SUBSTITUTE-BINDINGS", 3, 0, false );
    SubLFiles.declareFunction( me, "psp_add_some_fn", "PSP-ADD-SOME-FN", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_rename_variables", "PSP-RENAME-VARIABLES", 2, 0, false );
    SubLFiles.declareFunction( me, "psp_substitute_bindings_coll", "PSP-SUBSTITUTE-BINDINGS-COLL", 4, 0, false );
    SubLFiles.declareFunction( me, "psp_process_bindings", "PSP-PROCESS-BINDINGS", 4, 0, false );
    SubLFiles.declareFunction( me, "psp_template_keywordP", "PSP-TEMPLATE-KEYWORD?", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_process_bindings_int", "PSP-PROCESS-BINDINGS-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "validate_binding_pair", "VALIDATE-BINDING-PAIR", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_collectionP", "PSP-COLLECTION?", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_collection_memoizedP_internal", "PSP-COLLECTION-MEMOIZED?-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_collection_memoizedP", "PSP-COLLECTION-MEMOIZED?", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_reformulate", "PSP-REFORMULATE", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_reformulate_int_internal", "PSP-REFORMULATE-INT-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_reformulate_int", "PSP-REFORMULATE-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_reformulate_cycls", "PSP-REFORMULATE-CYCLS", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_disc_resolve_sentence_entities", "PSP-DISC-RESOLVE-SENTENCE-ENTITIES", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_wffP_internal", "PSP-WFF?-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "psp_wffP", "PSP-WFF?", 2, 0, false );
    SubLFiles.declareFunction( me, "psp_wffP_int", "PSP-WFF?-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "psp_indexical_bindings_p", "PSP-INDEXICAL-BINDINGS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_sem_templates_from_lexical_edge_internal", "PSP-SEM-TEMPLATES-FROM-LEXICAL-EDGE-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_sem_templates_from_lexical_edge", "PSP-SEM-TEMPLATES-FROM-LEXICAL-EDGE", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_noun_sem_trans_cycls", "PSP-NOUN-SEM-TRANS-CYCLS", 3, 0, false );
    SubLFiles.declareFunction( me, "psp_bad_templateP", "PSP-BAD-TEMPLATE?", 2, 0, false );
    SubLFiles.declareFunction( me, "psp_raw_templates", "PSP-RAW-TEMPLATES", 3, 0, false );
    SubLFiles.declareFunction( me, "psp_lookup_templates_memoized_internal", "PSP-LOOKUP-TEMPLATES-MEMOIZED-INTERNAL", 4, 2, false );
    SubLFiles.declareFunction( me, "psp_lookup_templates_memoized", "PSP-LOOKUP-TEMPLATES-MEMOIZED", 4, 2, false );
    SubLFiles.declareFunction( me, "psp_frame_type_from_context", "PSP-FRAME-TYPE-FROM-CONTEXT", 2, 0, false );
    SubLFiles.declareFunction( me, "psp_roles_for_denot_internal", "PSP-ROLES-FOR-DENOT-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_roles_for_denot", "PSP-ROLES-FOR-DENOT", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_devise_templates", "PSP-DEVISE-TEMPLATES", 3, 0, false );
    SubLFiles.declareFunction( me, "psp_devise_word_templates", "PSP-DEVISE-WORD-TEMPLATES", 4, 0, false );
    SubLFiles.declareFunction( me, "psp_devise_verb_templates", "PSP-DEVISE-VERB-TEMPLATES", 2, 0, false );
    SubLFiles.declareFunction( me, "clear_psp_genl_posP", "CLEAR-PSP-GENL-POS?", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_psp_genl_posP", "REMOVE-PSP-GENL-POS?", 2, 1, false );
    SubLFiles.declareFunction( me, "psp_genl_posP_internal", "PSP-GENL-POS?-INTERNAL", 3, 0, false );
    SubLFiles.declareFunction( me, "psp_genl_posP", "PSP-GENL-POS?", 2, 1, false );
    SubLFiles.declareFunction( me, "psp_devise_noun_templates_internal", "PSP-DEVISE-NOUN-TEMPLATES-INTERNAL", 3, 0, false );
    SubLFiles.declareFunction( me, "psp_devise_noun_templates", "PSP-DEVISE-NOUN-TEMPLATES", 3, 0, false );
    SubLFiles.declareFunction( me, "psp_devise_deverbal_noun_templates", "PSP-DEVISE-DEVERBAL-NOUN-TEMPLATES", 2, 0, false );
    SubLFiles.declareFunction( me, "psp_devise_deverbal_noun_template_internal", "PSP-DEVISE-DEVERBAL-NOUN-TEMPLATE-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "psp_devise_deverbal_noun_template", "PSP-DEVISE-DEVERBAL-NOUN-TEMPLATE", 2, 0, false );
    SubLFiles.declareFunction( me, "psp_passivize_templates", "PSP-PASSIVIZE-TEMPLATES", 2, 0, false );
    SubLFiles.declareFunction( me, "psp_passivize_template_internal", "PSP-PASSIVIZE-TEMPLATE-INTERNAL", 3, 0, false );
    SubLFiles.declareFunction( me, "psp_passivize_template", "PSP-PASSIVIZE-TEMPLATE", 3, 0, false );
    SubLFiles.declareFunction( me, "psp_quantify_templates", "PSP-QUANTIFY-TEMPLATES", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_quantify_template_internal", "PSP-QUANTIFY-TEMPLATE-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_quantify_template", "PSP-QUANTIFY-TEMPLATE", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_quantifiable_template_p", "PSP-QUANTIFIABLE-TEMPLATE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_make_conjunction", "PSP-MAKE-CONJUNCTION", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_make_disjunction", "PSP-MAKE-DISJUNCTION", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_make_existential", "PSP-MAKE-EXISTENTIAL", 2, 0, false );
    SubLFiles.declareFunction( me, "psp_davidsonianize_verb_templates", "PSP-DAVIDSONIANIZE-VERB-TEMPLATES", 2, 0, false );
    SubLFiles.declareFunction( me, "psp_davidsonianize_verb_template_internal", "PSP-DAVIDSONIANIZE-VERB-TEMPLATE-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_davidsonianize_verb_template", "PSP-DAVIDSONIANIZE-VERB-TEMPLATE", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_action_type", "PSP-ACTION-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_contains_isa_clauseP", "PSP-CONTAINS-ISA-CLAUSE?", 2, 0, false );
    SubLFiles.declareFunction( me, "psp_ok_templateP", "PSP-OK-TEMPLATE?", 2, 1, false );
    SubLFiles.declareFunction( me, "psp_ok_templateP_int_internal", "PSP-OK-TEMPLATE?-INT-INTERNAL", 3, 0, false );
    SubLFiles.declareFunction( me, "psp_ok_templateP_int", "PSP-OK-TEMPLATE?-INT", 3, 0, false );
    SubLFiles.declareFunction( me, "psp_no_isa_clause_neededP", "PSP-NO-ISA-CLAUSE-NEEDED?", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_add_nl_tags", "PSP-ADD-NL-TAGS", 2, 0, false );
    SubLFiles.declareFunction( me, "psp_add_name_tags", "PSP-ADD-NAME-TAGS", 2, 0, false );
    SubLFiles.declareFunction( me, "psp_add_nbar_tags", "PSP-ADD-NBAR-TAGS", 2, 0, false );
    SubLFiles.declareFunction( me, "psp_guess_agr_pred", "PSP-GUESS-AGR-PRED", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_add_np_tags", "PSP-ADD-NP-TAGS", 2, 0, false );
    SubLFiles.declareFunction( me, "psp_nl_tag_addedP", "PSP-NL-TAG-ADDED?", 2, 0, false );
    SubLFiles.declareFunction( me, "psp_extract_subject_semx", "PSP-EXTRACT-SUBJECT-SEMX", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_extract_subject_semx_int_internal", "PSP-EXTRACT-SUBJECT-SEMX-INT-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_extract_subject_semx_int", "PSP-EXTRACT-SUBJECT-SEMX-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_cyclify_subject", "PSP-CYCLIFY-SUBJECT", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_quantify_subject", "PSP-QUANTIFY-SUBJECT", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_subject_clauseP", "PSP-SUBJECT-CLAUSE?", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_filter_cycls_by_generality", "PSP-FILTER-CYCLS-BY-GENERALITY", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_remove_dispreferred_cycls_internal", "PSP-REMOVE-DISPREFERRED-CYCLS-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_remove_dispreferred_cycls", "PSP-REMOVE-DISPREFERRED-CYCLS", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_less_preferable_cyclP", "PSP-LESS-PREFERABLE-CYCL?", 2, 0, false );
    SubLFiles.declareFunction( me, "psp_less_preferable_cyclP_recursive", "PSP-LESS-PREFERABLE-CYCL?-RECURSIVE", 2, 0, false );
    SubLFiles.declareFunction( me, "psp_nsort_cycls_by_generality", "PSP-NSORT-CYCLS-BY-GENERALITY", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_sort_cycls_by_generality", "PSP-SORT-CYCLS-BY-GENERALITY", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_generality_estimate", "PSP-GENERALITY-ESTIMATE", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_generality_estimate_recursive", "PSP-GENERALITY-ESTIMATE-RECURSIVE", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_psp_semantics_file()
  {
    $psp_context$ = SubLFiles.defparameter( "*PSP-CONTEXT*", NIL );
    $dtp_phrase_structure_parser_weighted_cycl$ = SubLFiles.defconstant( "*DTP-PHRASE-STRUCTURE-PARSER-WEIGHTED-CYCL*", $sym0$PHRASE_STRUCTURE_PARSER_WEIGHTED_CYCL );
    $psp_category_from_frame_caching_state$ = SubLFiles.deflexical( "*PSP-CATEGORY-FROM-FRAME-CACHING-STATE*", NIL );
    $psp_special_semantic_methods$ = SubLFiles.deflexical( "*PSP-SPECIAL-SEMANTIC-METHODS*", maybeDefault( $sym61$_PSP_SPECIAL_SEMANTIC_METHODS_, $psp_special_semantic_methods$, () -> ( dictionary.new_dictionary(
        UNPROVIDED, UNPROVIDED ) ) ) );
    $psp_head_key_for_category_caching_state$ = SubLFiles.deflexical( "*PSP-HEAD-KEY-FOR-CATEGORY-CACHING-STATE*", NIL );
    $psp_reformulator_modules_to_skip$ = SubLFiles.deflexical( "*PSP-REFORMULATOR-MODULES-TO-SKIP*", $list139 );
    $psp_genl_posP_caching_state$ = SubLFiles.deflexical( "*PSP-GENL-POS?-CACHING-STATE*", NIL );
    return NIL;
  }

  public static SubLObject setup_psp_semantics_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_phrase_structure_parser_weighted_cycl$.getGlobalValue(), Symbols.symbol_function(
        $sym7$PHRASE_STRUCTURE_PARSER_WEIGHTED_CYCL_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list8 );
    Structures.def_csetf( $sym9$PSP_WEIGHTED_CYCL_CYCL, $sym10$_CSETF_PSP_WEIGHTED_CYCL_CYCL );
    Structures.def_csetf( $sym11$PSP_WEIGHTED_CYCL_WEIGHT, $sym12$_CSETF_PSP_WEIGHTED_CYCL_WEIGHT );
    Equality.identity( $sym0$PHRASE_STRUCTURE_PARSER_WEIGHTED_CYCL );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_phrase_structure_parser_weighted_cycl$.getGlobalValue(), Symbols.symbol_function(
        $sym20$VISIT_DEFSTRUCT_OBJECT_PHRASE_STRUCTURE_PARSER_WEIGHTED_CYCL_METH ) );
    memoization_state.note_globally_cached_function( $sym41$PSP_CATEGORY_FROM_FRAME );
    subl_macro_promotions.declare_defglobal( $sym61$_PSP_SPECIAL_SEMANTIC_METHODS_ );
    memoization_state.note_memoized_function( $sym92$PSP_PARSE_NOUN_COMPOUND_TOKENS );
    memoization_state.note_memoized_function( $sym99$PSP_COERCE_TEMPLATE_TO_COLLECTION_MEMOIZED );
    memoization_state.note_globally_cached_function( $sym113$PSP_HEAD_KEY_FOR_CATEGORY );
    memoization_state.note_memoized_function( $sym116$PSP_SUBSTITUTE_BINDINGS );
    memoization_state.note_memoized_function( $sym138$PSP_COLLECTION_MEMOIZED_ );
    memoization_state.note_memoized_function( $sym140$PSP_REFORMULATE_INT );
    memoization_state.note_memoized_function( $sym144$PSP_WFF_ );
    memoization_state.note_memoized_function( $sym148$PSP_SEM_TEMPLATES_FROM_LEXICAL_EDGE );
    memoization_state.note_memoized_function( $sym155$PSP_LOOKUP_TEMPLATES_MEMOIZED );
    memoization_state.note_memoized_function( $sym169$PSP_ROLES_FOR_DENOT );
    memoization_state.note_globally_cached_function( $sym176$PSP_GENL_POS_ );
    memoization_state.note_memoized_function( $sym179$PSP_DEVISE_NOUN_TEMPLATES );
    memoization_state.note_memoized_function( $sym180$PSP_DEVISE_DEVERBAL_NOUN_TEMPLATE );
    memoization_state.note_memoized_function( $sym186$PSP_PASSIVIZE_TEMPLATE );
    memoization_state.note_memoized_function( $sym190$PSP_QUANTIFY_TEMPLATE );
    memoization_state.note_memoized_function( $sym193$PSP_DAVIDSONIANIZE_VERB_TEMPLATE );
    memoization_state.note_memoized_function( $sym199$PSP_OK_TEMPLATE__INT );
    memoization_state.note_memoized_function( $sym209$PSP_EXTRACT_SUBJECT_SEMX_INT );
    memoization_state.note_memoized_function( $sym213$PSP_REMOVE_DISPREFERRED_CYCLS );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_psp_semantics_file();
  }

  @Override
  public void initializeVariables()
  {
    init_psp_semantics_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_psp_semantics_file();
  }
  static
  {
    me = new psp_semantics();
    $psp_context$ = null;
    $dtp_phrase_structure_parser_weighted_cycl$ = null;
    $psp_category_from_frame_caching_state$ = null;
    $psp_special_semantic_methods$ = null;
    $psp_head_key_for_category_caching_state$ = null;
    $psp_reformulator_modules_to_skip$ = null;
    $psp_genl_posP_caching_state$ = null;
    $sym0$PHRASE_STRUCTURE_PARSER_WEIGHTED_CYCL = makeSymbol( "PHRASE-STRUCTURE-PARSER-WEIGHTED-CYCL" );
    $sym1$PHRASE_STRUCTURE_PARSER_WEIGHTED_CYCL_P = makeSymbol( "PHRASE-STRUCTURE-PARSER-WEIGHTED-CYCL-P" );
    $list2 = ConsesLow.list( makeSymbol( "CYCL" ), makeSymbol( "WEIGHT" ) );
    $list3 = ConsesLow.list( makeKeyword( "CYCL" ), makeKeyword( "WEIGHT" ) );
    $list4 = ConsesLow.list( makeSymbol( "PSP-WEIGHTED-CYCL-CYCL" ), makeSymbol( "PSP-WEIGHTED-CYCL-WEIGHT" ) );
    $list5 = ConsesLow.list( makeSymbol( "_CSETF-PSP-WEIGHTED-CYCL-CYCL" ), makeSymbol( "_CSETF-PSP-WEIGHTED-CYCL-WEIGHT" ) );
    $sym6$PPRINT_PSP_WEIGHTED_CYCL = makeSymbol( "PPRINT-PSP-WEIGHTED-CYCL" );
    $sym7$PHRASE_STRUCTURE_PARSER_WEIGHTED_CYCL_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "PHRASE-STRUCTURE-PARSER-WEIGHTED-CYCL-PRINT-FUNCTION-TRAMPOLINE" );
    $list8 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "PHRASE-STRUCTURE-PARSER-WEIGHTED-CYCL-P" ) );
    $sym9$PSP_WEIGHTED_CYCL_CYCL = makeSymbol( "PSP-WEIGHTED-CYCL-CYCL" );
    $sym10$_CSETF_PSP_WEIGHTED_CYCL_CYCL = makeSymbol( "_CSETF-PSP-WEIGHTED-CYCL-CYCL" );
    $sym11$PSP_WEIGHTED_CYCL_WEIGHT = makeSymbol( "PSP-WEIGHTED-CYCL-WEIGHT" );
    $sym12$_CSETF_PSP_WEIGHTED_CYCL_WEIGHT = makeSymbol( "_CSETF-PSP-WEIGHTED-CYCL-WEIGHT" );
    $kw13$CYCL = makeKeyword( "CYCL" );
    $kw14$WEIGHT = makeKeyword( "WEIGHT" );
    $str15$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw16$BEGIN = makeKeyword( "BEGIN" );
    $sym17$MAKE_PHRASE_STRUCTURE_PARSER_WEIGHTED_CYCL = makeSymbol( "MAKE-PHRASE-STRUCTURE-PARSER-WEIGHTED-CYCL" );
    $kw18$SLOT = makeKeyword( "SLOT" );
    $kw19$END = makeKeyword( "END" );
    $sym20$VISIT_DEFSTRUCT_OBJECT_PHRASE_STRUCTURE_PARSER_WEIGHTED_CYCL_METH = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-PHRASE-STRUCTURE-PARSER-WEIGHTED-CYCL-METHOD" );
    $sym21$PSP_WEIGHTED_CYCL_P = makeSymbol( "PSP-WEIGHTED-CYCL-P" );
    $str22$__PSP_WEIGHTED_CYCL__S__S_ = makeString( "#<PSP-WEIGHTED-CYCL ~S ~S>" );
    $str23$Weighting_CycL_with_weights_____S = makeString( "Weighting CycL with weights:~% ~S" );
    $float24$0_0 = makeDouble( 0.0 );
    $sym25$PSP_CYCL_WEIGHT__ = makeSymbol( "PSP-CYCL-WEIGHT-<" );
    $float26$1_0 = makeDouble( 1.0 );
    $sym27$PSP_CYCL_CYCL = makeSymbol( "PSP-CYCL-CYCL" );
    $sym28$PSP_WEIGHT_P = makeSymbol( "PSP-WEIGHT-P" );
    $sym29$COPY_PSP_CYCL = makeSymbol( "COPY-PSP-CYCL" );
    $sym30$BOOLEANP = makeSymbol( "BOOLEANP" );
    $kw31$LOOKUP = makeKeyword( "LOOKUP" );
    $kw32$SPECIAL = makeKeyword( "SPECIAL" );
    $kw33$LEXICAL = makeKeyword( "LEXICAL" );
    $kw34$UNARY = makeKeyword( "UNARY" );
    $kw35$MULTI_DTR = makeKeyword( "MULTI-DTR" );
    $list36 = ConsesLow.list( makeKeyword( "DENOT-TEMPLATE" ), makeKeyword( "DENOT-GROUND" ) );
    $kw37$DENOT_GROUND = makeKeyword( "DENOT-GROUND" );
    $kw38$DENOT_TEMPLATE = makeKeyword( "DENOT-TEMPLATE" );
    $kw39$PROP_GROUND = makeKeyword( "PROP-GROUND" );
    $kw40$PROP_TEMPLATE = makeKeyword( "PROP-TEMPLATE" );
    $sym41$PSP_CATEGORY_FROM_FRAME = makeSymbol( "PSP-CATEGORY-FROM-FRAME" );
    $const42$GenericVerbPhraseModifyingFrame = constant_handles.reader_make_constant_shell( makeString( "GenericVerbPhraseModifyingFrame" ) );
    $list43 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "PhraseFn-Bar1" ) ), constant_handles.reader_make_constant_shell( makeString( "Verb" ) ) );
    $const44$NounPhraseModifyingFrame = constant_handles.reader_make_constant_shell( makeString( "NounPhraseModifyingFrame" ) );
    $const45$NounPhrase = constant_handles.reader_make_constant_shell( makeString( "NounPhrase" ) );
    $const46$FrameForNouns = constant_handles.reader_make_constant_shell( makeString( "FrameForNouns" ) );
    $const47$Noun = constant_handles.reader_make_constant_shell( makeString( "Noun" ) );
    $const48$FrameForVerbs = constant_handles.reader_make_constant_shell( makeString( "FrameForVerbs" ) );
    $const49$Verb = constant_handles.reader_make_constant_shell( makeString( "Verb" ) );
    $sym50$_PSP_CATEGORY_FROM_FRAME_CACHING_STATE_ = makeSymbol( "*PSP-CATEGORY-FROM-FRAME-CACHING-STATE*" );
    $int51$128 = makeInteger( 128 );
    $kw52$IDENTITY = makeKeyword( "IDENTITY" );
    $const53$Adverb = constant_handles.reader_make_constant_shell( makeString( "Adverb" ) );
    $str54$No_templates_for__S___ = makeString( "No templates for ~S.~%" );
    $kw55$NON_WFF = makeKeyword( "NON-WFF" );
    $list56 = ConsesLow.cons( makeSymbol( "DTR-NUM" ), makeSymbol( "DTR-SEMX" ) );
    $str57$__Couldn_t_find_template_semx_for = makeString( "~&Couldn't find template semx for ~S with ~S.~%" );
    $sym58$KEYWORDP = makeSymbol( "KEYWORDP" );
    $list59 = ConsesLow.list( makeSymbol( "BINDING-SEMX" ), makeSymbol( "BINDING-KEY" ) );
    $list60 = ConsesLow.list( makeSymbol( "LEVEL" ), makeSymbol( "BINDING-DTR-NUM" ), makeSymbol( "BINDING-KEY" ) );
    $sym61$_PSP_SPECIAL_SEMANTIC_METHODS_ = makeSymbol( "*PSP-SPECIAL-SEMANTIC-METHODS*" );
    $const62$psRuleSemanticsHandler = constant_handles.reader_make_constant_shell( makeString( "psRuleSemanticsHandler" ) );
    $kw63$GAF = makeKeyword( "GAF" );
    $list64 = ConsesLow.list( makeSymbol( "RULE" ), makeSymbol( "METHOD" ) );
    $kw65$INIT_STATE = makeKeyword( "INIT-STATE" );
    $kw66$INITIALIZED = makeKeyword( "INITIALIZED" );
    $list67 = ConsesLow.list( makeSymbol( "RULE" ), makeSymbol( "THIS-METHOD" ) );
    $const68$NLNumberFn = constant_handles.reader_make_constant_shell( makeString( "NLNumberFn" ) );
    $list69 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SubcollectionOfWithRelationFromFn" ) ), makeKeyword( "NBAR" ), constant_handles.reader_make_constant_shell( makeString(
        "possessiveRelation" ) ), makeKeyword( "DET" ) );
    $kw70$NBAR = makeKeyword( "NBAR" );
    $kw71$DET = makeKeyword( "DET" );
    $const72$NLDefinitenessAttribute = constant_handles.reader_make_constant_shell( makeString( "NLDefinitenessAttribute" ) );
    $const73$ScalarInterval = constant_handles.reader_make_constant_shell( makeString( "ScalarInterval" ) );
    $const74$TimesFn = constant_handles.reader_make_constant_shell( makeString( "TimesFn" ) );
    $const75$GroupOfCardinalityFn = constant_handles.reader_make_constant_shell( makeString( "GroupOfCardinalityFn" ) );
    $const76$UnitOfMeasure = constant_handles.reader_make_constant_shell( makeString( "UnitOfMeasure" ) );
    $const77$PossessivePronoun_Pre = constant_handles.reader_make_constant_shell( makeString( "PossessivePronoun-Pre" ) );
    $const78$PossessiveMarker_Sg = constant_handles.reader_make_constant_shell( makeString( "PossessiveMarker-Sg" ) );
    $kw79$NONE = makeKeyword( "NONE" );
    $str80$of = makeString( "of" );
    $kw81$QUADS = makeKeyword( "QUADS" );
    $kw82$TRIPLES = makeKeyword( "TRIPLES" );
    $float83$0_1 = makeDouble( 0.1 );
    $str84$Parsed__S_in__S_seconds_ = makeString( "Parsed ~S in ~S seconds." );
    $kw85$BEST_ONLY = makeKeyword( "BEST-ONLY" );
    $float86$0_8 = makeDouble( 0.8 );
    $list87 = ConsesLow.list( makeSymbol( "PARSE" ), makeSymbol( "COMMENTS" ) );
    $list88 = ConsesLow.list( makeSymbol( "CYCL" ), makeSymbol( "POS-PRED" ) );
    $kw89$NO_DENOT = makeKeyword( "NO-DENOT" );
    $const90$plural_Generic = constant_handles.reader_make_constant_shell( makeString( "plural-Generic" ) );
    $sym91$UPPER_CASE_P = makeSymbol( "UPPER-CASE-P" );
    $sym92$PSP_PARSE_NOUN_COMPOUND_TOKENS = makeSymbol( "PSP-PARSE-NOUN-COMPOUND-TOKENS" );
    $sym93$PSP_EXTRACT_SUBJECT_SEMX = makeSymbol( "PSP-EXTRACT-SUBJECT-SEMX" );
    $sym94$PSP_QUANTIFY_SUBJECT = makeSymbol( "PSP-QUANTIFY-SUBJECT" );
    $list95 = ConsesLow.list( makeSymbol( "INSTANCE-OR-TYPE?" ), makeSymbol( "DTR-NUM" ), makeSymbol( "KEYWORD" ) );
    $kw96$INSTANCE = makeKeyword( "INSTANCE" );
    $kw97$ERROR = makeKeyword( "ERROR" );
    $sym98$PSP_CYCL__ = makeSymbol( "PSP-CYCL-=" );
    $sym99$PSP_COERCE_TEMPLATE_TO_COLLECTION_MEMOIZED = makeSymbol( "PSP-COERCE-TEMPLATE-TO-COLLECTION-MEMOIZED" );
    $kw100$OK = makeKeyword( "OK" );
    $sym101$_OBJ = makeSymbol( "?OBJ" );
    $kw102$REPLACE = makeKeyword( "REPLACE" );
    $kw103$ACTION = makeKeyword( "ACTION" );
    $const104$thereExists = constant_handles.reader_make_constant_shell( makeString( "thereExists" ) );
    $const105$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $const106$StateFn = constant_handles.reader_make_constant_shell( makeString( "StateFn" ) );
    $list107 = ConsesLow.list( makeKeyword( "ANYTHING" ) );
    $sym108$MAKE_NEGATION = makeSymbol( "MAKE-NEGATION" );
    $sym109$EL_NEGATION_P = makeSymbol( "EL-NEGATION-P" );
    $sym110$PSP_DNF_FOR_SENTENCE = makeSymbol( "PSP-DNF-FOR-SENTENCE" );
    $list111 = ConsesLow.list( makeSymbol( "POS-LITS" ), makeSymbol( "NEG-LITS" ) );
    $kw112$UNSPECIFIED = makeKeyword( "UNSPECIFIED" );
    $sym113$PSP_HEAD_KEY_FOR_CATEGORY = makeSymbol( "PSP-HEAD-KEY-FOR-CATEGORY" );
    $kw114$NOUN = makeKeyword( "NOUN" );
    $sym115$_PSP_HEAD_KEY_FOR_CATEGORY_CACHING_STATE_ = makeSymbol( "*PSP-HEAD-KEY-FOR-CATEGORY-CACHING-STATE*" );
    $sym116$PSP_SUBSTITUTE_BINDINGS = makeSymbol( "PSP-SUBSTITUTE-BINDINGS" );
    $sym117$CYC_VAR_ = makeSymbol( "CYC-VAR?" );
    $list118 = ConsesLow.list( makeSymbol( "IN" ), makeSymbol( "OUT" ) );
    $list119 = ConsesLow.list( makeKeyword( "OBLIQUE-OBJECT" ), makeKeyword( "OBJECT" ), makeKeyword( "BY-SUBJECT" ) );
    $list120 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SomeFn" ) ), makeKeyword( "REPLACE" ) );
    $kw121$UNKNOWN = makeKeyword( "UNKNOWN" );
    $str122$No_bindings_for__S___ = makeString( "No bindings for ~S.~%" );
    $str123$Binding__S_has_no_corresponding_d = makeString( "Binding ~S has no corresponding daughter in ~S.~%" );
    $kw124$TYPE = makeKeyword( "TYPE" );
    $sym125$PSP_COLLECTION_ = makeSymbol( "PSP-COLLECTION?" );
    $sym126$STRIP_NL_TAGS = makeSymbol( "STRIP-NL-TAGS" );
    $const127$PSRule_VbarVComps = constant_handles.reader_make_constant_shell( makeString( "PSRule-VbarVComps" ) );
    $kw128$SUBJECT = makeKeyword( "SUBJECT" );
    $str129$__No_cycls_found_for____S__ = makeString( "~&No cycls found for~% ~S~%" );
    $str130$__All_cycls_were_non_wff_for____S = makeString( "~&All cycls were non-wff for~% ~S~%" );
    $list131 = ConsesLow.list( NIL, NIL );
    $list132 = ConsesLow.list( makeSymbol( "EXISTING-CYCLS" ), makeSymbol( "EXISTING-KEYWORDS" ) );
    $str133$__No_filtered_cycls_for__S = makeString( "~&No filtered cycls for ~S" );
    $list134 = ConsesLow.list( makeKeyword( "INF-COMP" ) );
    $list135 = ConsesLow.list( makeSymbol( "FIRST-CYCLS" ), makeSymbol( "KEYWORDS" ) );
    $str136$Bad_binding_pair___S = makeString( "Bad binding pair: ~S" );
    $kw137$VALID = makeKeyword( "VALID" );
    $sym138$PSP_COLLECTION_MEMOIZED_ = makeSymbol( "PSP-COLLECTION-MEMOIZED?" );
    $list139 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "QuantifierProcessing-3-RLModule" ) ), constant_handles.reader_make_constant_shell( makeString( "QuantifierUnifier-3-RLModule" ) ),
        constant_handles.reader_make_constant_shell( makeString( "WffViolationResolutionRLModule" ) ), constant_handles.reader_make_constant_shell( makeString( "QueryProcessingRLModule" ) ), constant_handles
            .reader_make_constant_shell( makeString( "DatesReformulatorRLModule" ) ) );
    $sym140$PSP_REFORMULATE_INT = makeSymbol( "PSP-REFORMULATE-INT" );
    $sym141$MEMOIZATION_STATE_P = makeSymbol( "MEMOIZATION-STATE-P" );
    $kw142$CLEAR_CACHES_ = makeKeyword( "CLEAR-CACHES?" );
    $kw143$FALSE = makeKeyword( "FALSE" );
    $sym144$PSP_WFF_ = makeSymbol( "PSP-WFF?" );
    $sym145$CDR = makeSymbol( "CDR" );
    $str146$__Not_WFF___S__ = makeString( "~&Not WFF! ~S~%" );
    $list147 = ConsesLow.cons( makeSymbol( "INDEXICAL-STRING" ), makeSymbol( "DENOT" ) );
    $sym148$PSP_SEM_TEMPLATES_FROM_LEXICAL_EDGE = makeSymbol( "PSP-SEM-TEMPLATES-FROM-LEXICAL-EDGE" );
    $const149$Preposition = constant_handles.reader_make_constant_shell( makeString( "Preposition" ) );
    $const150$Adjective = constant_handles.reader_make_constant_shell( makeString( "Adjective" ) );
    $const151$RegularNounFrame = constant_handles.reader_make_constant_shell( makeString( "RegularNounFrame" ) );
    $const152$Thing = constant_handles.reader_make_constant_shell( makeString( "Thing" ) );
    $str153$_S_is_not_a_known_keyword_for__S_ = makeString( "~S is not a known keyword for ~S.~%" );
    $sym154$CYCL_DENOTATIONAL_TERM_P = makeSymbol( "CYCL-DENOTATIONAL-TERM-P" );
    $sym155$PSP_LOOKUP_TEMPLATES_MEMOIZED = makeSymbol( "PSP-LOOKUP-TEMPLATES-MEMOIZED" );
    $sym156$_EXCLUDE_VULGARITIES__ = makeSymbol( "*EXCLUDE-VULGARITIES?*" );
    $sym157$_EXCLUDE_SLANG__ = makeSymbol( "*EXCLUDE-SLANG?*" );
    $sym158$_EXCLUDE_ARCHAIC_SPEECH__ = makeSymbol( "*EXCLUDE-ARCHAIC-SPEECH?*" );
    $sym159$_EXCLUDE_INDIRECT_RELATIONS__ = makeSymbol( "*EXCLUDE-INDIRECT-RELATIONS?*" );
    $sym160$GET = makeSymbol( "GET" );
    $kw161$SEMTRANS = makeKeyword( "SEMTRANS" );
    $kw162$FRAME = makeKeyword( "FRAME" );
    $kw163$WORD_UNIT = makeKeyword( "WORD-UNIT" );
    $kw164$PRAGMATICS = makeKeyword( "PRAGMATICS" );
    $kw165$CYC_POS = makeKeyword( "CYC-POS" );
    $sym166$PRAGMATICALLY_ACCEPTABLE_ = makeSymbol( "PRAGMATICALLY-ACCEPTABLE?" );
    $sym167$GET_SEMTRANS_ENTRIES = makeSymbol( "GET-SEMTRANS-ENTRIES" );
    $const168$PhraseFn = constant_handles.reader_make_constant_shell( makeString( "PhraseFn" ) );
    $sym169$PSP_ROLES_FOR_DENOT = makeSymbol( "PSP-ROLES-FOR-DENOT" );
    $const170$GeographicalRegion = constant_handles.reader_make_constant_shell( makeString( "GeographicalRegion" ) );
    $list171 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "possessiveRelation" ) ), makeKeyword( "REPLACE" ), makeKeyword( "NOUN" ) );
    $const172$Collection = constant_handles.reader_make_constant_shell( makeString( "Collection" ) );
    $list173 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword( "NOUN" ), makeKeyword( "REPLACE" ) );
    $const174$Relation = constant_handles.reader_make_constant_shell( makeString( "Relation" ) );
    $list175 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "is-Underspecified" ) ), makeKeyword( "NOUN" ), makeKeyword( "REPLACE" ) );
    $sym176$PSP_GENL_POS_ = makeSymbol( "PSP-GENL-POS?" );
    $sym177$_PSP_GENL_POS__CACHING_STATE_ = makeSymbol( "*PSP-GENL-POS?-CACHING-STATE*" );
    $int178$32 = makeInteger( 32 );
    $sym179$PSP_DEVISE_NOUN_TEMPLATES = makeSymbol( "PSP-DEVISE-NOUN-TEMPLATES" );
    $sym180$PSP_DEVISE_DEVERBAL_NOUN_TEMPLATE = makeSymbol( "PSP-DEVISE-DEVERBAL-NOUN-TEMPLATE" );
    $list181 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "PPCompFrameFn" ) ), constant_handles.reader_make_constant_shell( makeString( "TransitivePPFrameType" ) ), constant_handles
        .reader_make_constant_shell( makeString( "Of-TheWord" ) ) );
    $kw182$OBLIQUE_OBJECT = makeKeyword( "OBLIQUE-OBJECT" );
    $kw183$OBJECT = makeKeyword( "OBJECT" );
    $sym184$PSP_SUBJECT_CLAUSE_ = makeSymbol( "PSP-SUBJECT-CLAUSE?" );
    $const185$TransitiveNPFrame = constant_handles.reader_make_constant_shell( makeString( "TransitiveNPFrame" ) );
    $sym186$PSP_PASSIVIZE_TEMPLATE = makeSymbol( "PSP-PASSIVIZE-TEMPLATE" );
    $kw187$PASSIVE_WITH_BY = makeKeyword( "PASSIVE-WITH-BY" );
    $kw188$BY_SUBJECT = makeKeyword( "BY-SUBJECT" );
    $const189$TheActiveSubject = constant_handles.reader_make_constant_shell( makeString( "TheActiveSubject" ) );
    $sym190$PSP_QUANTIFY_TEMPLATE = makeSymbol( "PSP-QUANTIFY-TEMPLATE" );
    $str191$__PSP_MAKE_CONJUNCTION_passed_NIL = makeString( "~&PSP-MAKE-CONJUNCTION passed NIL.~%" );
    $str192$__PSP_MAKE_DISJUNCTION_passed_NIL = makeString( "~&PSP-MAKE-DISJUNCTION passed NIL.~%" );
    $sym193$PSP_DAVIDSONIANIZE_VERB_TEMPLATE = makeSymbol( "PSP-DAVIDSONIANIZE-VERB-TEMPLATE" );
    $list194 = ConsesLow.list( makeSymbol( "TYPE" ), makeSymbol( "TARGET" ), makeSymbol( "CONSTRAINT-MT" ) );
    $kw195$ISA = makeKeyword( "ISA" );
    $kw196$GENL = makeKeyword( "GENL" );
    $kw197$NOT_DISJOINT = makeKeyword( "NOT-DISJOINT" );
    $const198$SpecsFn = constant_handles.reader_make_constant_shell( makeString( "SpecsFn" ) );
    $sym199$PSP_OK_TEMPLATE__INT = makeSymbol( "PSP-OK-TEMPLATE?-INT" );
    $str200$Non_canonical_semtrans_template__ = makeString( "Non-canonical semtrans template (missing #$isa for ~S):~% ~S.~%" );
    $list201 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Verb" ) ) );
    $list202 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "PSRule-NP-Appositive" ) ), constant_handles.reader_make_constant_shell( makeString( "PSRule-NPfromPronoun" ) ) );
    $const203$PSRule_GerundNPFromVbar = constant_handles.reader_make_constant_shell( makeString( "PSRule-GerundNPFromVbar" ) );
    $const204$NLQuantFn_3 = constant_handles.reader_make_constant_shell( makeString( "NLQuantFn-3" ) );
    $const205$ProperName_NLAttr = constant_handles.reader_make_constant_shell( makeString( "ProperName-NLAttr" ) );
    $const206$NLQuantFn = constant_handles.reader_make_constant_shell( makeString( "NLQuantFn" ) );
    $const207$singular_Generic = constant_handles.reader_make_constant_shell( makeString( "singular-Generic" ) );
    $str208$ = makeString( "" );
    $sym209$PSP_EXTRACT_SUBJECT_SEMX_INT = makeSymbol( "PSP-EXTRACT-SUBJECT-SEMX-INT" );
    $kw210$IGNORE = makeKeyword( "IGNORE" );
    $const211$TheSentenceSubject = constant_handles.reader_make_constant_shell( makeString( "TheSentenceSubject" ) );
    $sym212$_SUBJECT = makeSymbol( "?SUBJECT" );
    $sym213$PSP_REMOVE_DISPREFERRED_CYCLS = makeSymbol( "PSP-REMOVE-DISPREFERRED-CYCLS" );
    $sym214$PSP_LESS_PREFERABLE_CYCL_ = makeSymbol( "PSP-LESS-PREFERABLE-CYCL?" );
    $sym215$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const216$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $kw217$GENERAL = makeKeyword( "GENERAL" );
    $kw218$SPECIFIC = makeKeyword( "SPECIFIC" );
    $sym219$_ = makeSymbol( ">" );
    $sym220$PSP_GENERALITY_ESTIMATE = makeSymbol( "PSP-GENERALITY-ESTIMATE" );
    $sym221$_ = makeSymbol( "<" );
    $sym222$_ = makeSymbol( "+" );
    $sym223$PSP_GENERALITY_ESTIMATE_RECURSIVE = makeSymbol( "PSP-GENERALITY-ESTIMATE-RECURSIVE" );
  }

  public static final class $phrase_structure_parser_weighted_cycl_native
      extends
        SubLStructNative
  {
    public SubLObject $cycl;
    public SubLObject $weight;
    private static final SubLStructDeclNative structDecl;

    public $phrase_structure_parser_weighted_cycl_native()
    {
      this.$cycl = CommonSymbols.NIL;
      this.$weight = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $phrase_structure_parser_weighted_cycl_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$cycl;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$weight;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$cycl = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$weight = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $phrase_structure_parser_weighted_cycl_native.class, $sym0$PHRASE_STRUCTURE_PARSER_WEIGHTED_CYCL, $sym1$PHRASE_STRUCTURE_PARSER_WEIGHTED_CYCL_P, $list2, $list3,
          new String[]
          { "$cycl", "$weight"
          }, $list4, $list5, $sym6$PPRINT_PSP_WEIGHTED_CYCL );
    }
  }

  public static final class $phrase_structure_parser_weighted_cycl_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $phrase_structure_parser_weighted_cycl_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "PHRASE-STRUCTURE-PARSER-WEIGHTED-CYCL-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return phrase_structure_parser_weighted_cycl_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 1080 ms
 * 
 */
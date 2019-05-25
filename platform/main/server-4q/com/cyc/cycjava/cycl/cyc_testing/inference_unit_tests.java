package com.cyc.cycjava.cycl.cyc_testing;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.cycjava.cycl.access_macros;
import com.cyc.cycjava.cycl.meta_macros;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import java.util.ArrayList;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.cycjava.cycl.api_control_vars;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.cycjava.cycl.id_index;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.el_grammar;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.cycjava.cycl.misc_utilities;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.cycjava.cycl.cfasl_utilities;
import com.cyc.cycjava.cycl.cfasl;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.hash_table_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class inference_unit_tests
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.cyc_testing.inference_unit_tests";
  public static final String myFingerPrint = "8e37c142c8f536b42fbb635f6a5f70262e9a739c14d9f0541f05b16a4b1cd606";
  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 1063L)
  private static SubLSymbol $within_inference_unit_testP$;
  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 1245L)
  private static SubLSymbol $inference_unit_test_assertions_created$;
  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 2281L)
  public static SubLSymbol $dtp_inference_unit_test$;
  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 9612L)
  private static SubLSymbol $cfasl_wide_opcode_inference_unit_test$;
  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 11024L)
  private static SubLSymbol $inference_unit_test_names_in_order$;
  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 11129L)
  private static SubLSymbol $inference_unit_tests_by_name$;
  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 15425L)
  private static SubLSymbol $inference_unit_test_properties$;
  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 16041L)
  private static SubLSymbol $inference_unit_test_followup_properties$;
  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 28515L)
  private static SubLSymbol $test_followups_use_public_problem_storeP$;
  private static final SubLSymbol $kw0$UNINITIALIZED;
  private static final SubLSymbol $sym1$INFERENCE_UNIT_TEST;
  private static final SubLSymbol $sym2$INFERENCE_UNIT_TEST_P;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLList $list6;
  private static final SubLSymbol $sym7$DEFAULT_STRUCT_PRINT_FUNCTION;
  private static final SubLSymbol $sym8$INFERENCE_UNIT_TEST_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list9;
  private static final SubLSymbol $sym10$IUT_NAME;
  private static final SubLSymbol $sym11$_CSETF_IUT_NAME;
  private static final SubLSymbol $sym12$IUT_COMMENT;
  private static final SubLSymbol $sym13$_CSETF_IUT_COMMENT;
  private static final SubLSymbol $sym14$IUT_SENTENCE;
  private static final SubLSymbol $sym15$_CSETF_IUT_SENTENCE;
  private static final SubLSymbol $sym16$IUT_PROPERTIES;
  private static final SubLSymbol $sym17$_CSETF_IUT_PROPERTIES;
  private static final SubLSymbol $sym18$IUT_RESULT;
  private static final SubLSymbol $sym19$_CSETF_IUT_RESULT;
  private static final SubLSymbol $sym20$IUT_HALT_REASON;
  private static final SubLSymbol $sym21$_CSETF_IUT_HALT_REASON;
  private static final SubLSymbol $sym22$IUT_RESULT_TEST;
  private static final SubLSymbol $sym23$_CSETF_IUT_RESULT_TEST;
  private static final SubLSymbol $sym24$IUT_FOLLOWUPS;
  private static final SubLSymbol $sym25$_CSETF_IUT_FOLLOWUPS;
  private static final SubLSymbol $sym26$IUT_BINDINGS;
  private static final SubLSymbol $sym27$_CSETF_IUT_BINDINGS;
  private static final SubLSymbol $sym28$IUT_KB;
  private static final SubLSymbol $sym29$_CSETF_IUT_KB;
  private static final SubLSymbol $sym30$IUT_OWNER;
  private static final SubLSymbol $sym31$_CSETF_IUT_OWNER;
  private static final SubLSymbol $sym32$IUT_BUG_NUMBER;
  private static final SubLSymbol $sym33$_CSETF_IUT_BUG_NUMBER;
  private static final SubLSymbol $sym34$IUT_CREATION_DATE;
  private static final SubLSymbol $sym35$_CSETF_IUT_CREATION_DATE;
  private static final SubLSymbol $sym36$IUT_CREATOR;
  private static final SubLSymbol $sym37$_CSETF_IUT_CREATOR;
  private static final SubLSymbol $sym38$IUT_WORKING_;
  private static final SubLSymbol $sym39$_CSETF_IUT_WORKING_;
  private static final SubLSymbol $sym40$IUT_SUBTYPE;
  private static final SubLSymbol $sym41$_CSETF_IUT_SUBTYPE;
  private static final SubLSymbol $kw42$NAME;
  private static final SubLSymbol $kw43$COMMENT;
  private static final SubLSymbol $kw44$SENTENCE;
  private static final SubLSymbol $kw45$PROPERTIES;
  private static final SubLSymbol $kw46$RESULT;
  private static final SubLSymbol $kw47$HALT_REASON;
  private static final SubLSymbol $kw48$RESULT_TEST;
  private static final SubLSymbol $kw49$FOLLOWUPS;
  private static final SubLSymbol $kw50$BINDINGS;
  private static final SubLSymbol $kw51$KB;
  private static final SubLSymbol $kw52$OWNER;
  private static final SubLSymbol $kw53$BUG_NUMBER;
  private static final SubLSymbol $kw54$CREATION_DATE;
  private static final SubLSymbol $kw55$CREATOR;
  private static final SubLSymbol $kw56$WORKING_;
  private static final SubLSymbol $kw57$SUBTYPE;
  private static final SubLString $str58$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw59$BEGIN;
  private static final SubLSymbol $sym60$MAKE_INFERENCE_UNIT_TEST;
  private static final SubLSymbol $kw61$SLOT;
  private static final SubLSymbol $kw62$END;
  private static final SubLSymbol $sym63$VISIT_DEFSTRUCT_OBJECT_INFERENCE_UNIT_TEST_METHOD;
  private static final SubLSymbol $sym64$INVALID_CONSTANT_;
  private static final SubLString $str65$Cannot_build_inference_test_recip;
  private static final SubLSymbol $kw66$EXPECTED_RESULT;
  private static final SubLInteger $int67$513;
  private static final SubLSymbol $sym68$CFASL_INPUT_INFERENCE_UNIT_TEST;
  private static final SubLSymbol $sym69$CFASL_OUTPUT_OBJECT_INFERENCE_UNIT_TEST_METHOD;
  private static final SubLString $str70$Deserialization_produced__A_inste;
  private static final SubLSymbol $sym71$_INFERENCE_UNIT_TEST_NAMES_IN_ORDER_;
  private static final SubLSymbol $sym72$_INFERENCE_UNIT_TESTS_BY_NAME_;
  private static final SubLInteger $int73$212;
  private static final SubLList $list74;
  private static final SubLList $list75;
  private static final SubLSymbol $kw76$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw77$DONE;
  private static final SubLSymbol $sym78$NAME;
  private static final SubLSymbol $sym79$DO_LIST;
  private static final SubLSymbol $sym80$CLET;
  private static final SubLSymbol $sym81$FIND_INFERENCE_UNIT_TEST_BY_NAME;
  private static final SubLList $list82;
  private static final SubLSymbol $kw83$CONTINUE;
  private static final SubLSymbol $kw84$PREVIOUS;
  private static final SubLList $list85;
  private static final SubLSymbol $kw86$EXPECTED_HALT_REASON;
  private static final SubLSymbol $kw87$EXHAUST_TOTAL;
  private static final SubLSymbol $kw88$EXPECTED_RESULT_TEST;
  private static final SubLSymbol $kw89$TINY;
  private static final SubLSymbol $kw90$BUG;
  private static final SubLSymbol $kw91$CREATED;
  private static final SubLSymbol $sym92$PROGN;
  private static final SubLSymbol $sym93$VALIDATE_INFERENCE_UNIT_TEST_PLIST;
  private static final SubLSymbol $sym94$QUOTE;
  private static final SubLSymbol $sym95$DEFINE_INFERENCE_UNIT_TEST_INTERNAL;
  private static final SubLSymbol $sym96$CANONICALIZE_INFERENCE_UNIT_TEST_FOLLOWUPS;
  private static final SubLSymbol $sym97$DEFINE_INFERENCE_UNIT_TEST;
  private static final SubLList $list98;
  private static final SubLList $list99;
  private static final SubLSymbol $sym100$PROPERTY_LIST_P;
  private static final SubLString $str101$_s_is_not_a_known__a;
  private static final SubLSymbol $sym102$INFERENCE_UNIT_TEST_PROPERTY_P;
  private static final SubLList $list103;
  private static final SubLSymbol $sym104$VALIDATE_INFERENCE_UNIT_TEST_FOLLOWUP_PLIST;
  private static final SubLSymbol $sym105$INFERENCE_UNIT_TEST_FOLLOWUP_PROPERTY_P;
  private static final SubLSymbol $sym106$KEYWORDP;
  private static final SubLSymbol $sym107$POSSIBLY_SENTENCE_P;
  private static final SubLSymbol $sym108$QUERY_PROPERTY_P;
  private static final SubLSymbol $sym109$BINDING_LISTS_P;
  private static final SubLSymbol $sym110$QUERY_HALT_REASON_P;
  private static final SubLSymbol $sym111$FUNCTION_SYMBOL_P;
  private static final SubLSymbol $sym112$INFERENCE_TEST_COMMENT_P;
  private static final SubLSymbol $sym113$NON_DOTTED_LIST_P;
  private static final SubLSymbol $sym114$INFERENCE_UNIT_TEST_FOLLOWUP_P;
  private static final SubLSymbol $sym115$SUBL_VARIABLE_BINDING_LIST_P;
  private static final SubLSymbol $sym116$CYC_TEST_KB_P;
  private static final SubLSymbol $sym117$INFERENCE_TEST_OWNER_P;
  private static final SubLSymbol $sym118$POSITIVE_INTEGER_P;
  private static final SubLSymbol $sym119$UNIVERSAL_DATE_P;
  private static final SubLSymbol $sym120$STRINGP;
  private static final SubLSymbol $sym121$BOOLEANP;
  private static final SubLSymbol $kw122$CONDITIONAL_SENTENCE_;
  private static final SubLString $str123$The_test__S_is_not_queried_with__;
  private static final SubLSymbol $kw124$STANDARD;
  private static final SubLSymbol $kw125$VERBOSE;
  private static final SubLSymbol $kw126$TERSE;
  private static final SubLSymbol $kw127$IUT;
  private static final SubLSymbol $sym128$CYC_TEST_OUTPUT_FORMAT_P;
  private static final SubLSymbol $sym129$CYC_TEST_P;
  private static final SubLSymbol $sym130$FIND_CYC_TEST;
  private static final SubLString $str131$No_test_with_name__a_was_found;
  private static final SubLSymbol $kw132$NOT_RUN;
  private static final SubLSymbol $kw133$INVALID;
  private static final SubLSymbol $kw134$SUCCESS;
  private static final SubLSymbol $sym135$EL_SENTENCE_P;
  private static final SubLSymbol $kw136$UNPROVIDED;
  private static final SubLSymbol $kw137$PROBLEM_STORE;
  private static final SubLString $str138$Previous_inference_was_not_browsa;
  private static final SubLSymbol $kw139$FAILURE;
  private static final SubLSymbol $kw140$SKIP;
  private static final SubLSymbol $kw141$BLOCK_;
  private static final SubLList $list142;
  private static final SubLSymbol $kw143$BROWSABLE_;
  private static final SubLSymbol $kw144$BINDINGS_AND_HYPOTHETICAL_BINDINGS;
  private static final SubLSymbol $kw145$PRUNING;
  private static final SubLString $str146$___IUT__S____;
  private static final SubLString $str147$_S____3f___;
  private static final SubLSymbol $kw148$POST_BUILD;
  private static final SubLString $str149$__Failure_when_asking;
  private static final SubLString $str150$_______S;
  private static final SubLString $str151$____with_properties__s;
  private static final SubLString $str152$__Result_test____s;
  private static final SubLString $str153$__Actual_result______s;
  private static final SubLString $str154$__Expected_result____s;
  private static final SubLString $str155$__Actual_halt_reason______s;
  private static final SubLString $str156$__Expected_halt_reason____s;
  private static final SubLString $str157$____;

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 1157L)
  public static SubLObject within_inference_unit_testP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $within_inference_unit_testP$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 1477L)
  public static SubLObject note_assertion_for_inference_unit_test(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    $inference_unit_test_assertions_created$.setDynamicValue( ConsesLow.cons( assertion, $inference_unit_test_assertions_created$.getDynamicValue( thread ) ), thread );
    return assertion;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 1744L)
  public static SubLObject inference_unit_test_cleanup()
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 2281L)
  public static SubLObject inference_unit_test_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 2281L)
  public static SubLObject inference_unit_test_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $inference_unit_test_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 2281L)
  public static SubLObject iut_name(final SubLObject v_object)
  {
    assert NIL != inference_unit_test_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 2281L)
  public static SubLObject iut_comment(final SubLObject v_object)
  {
    assert NIL != inference_unit_test_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 2281L)
  public static SubLObject iut_sentence(final SubLObject v_object)
  {
    assert NIL != inference_unit_test_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 2281L)
  public static SubLObject iut_properties(final SubLObject v_object)
  {
    assert NIL != inference_unit_test_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 2281L)
  public static SubLObject iut_result(final SubLObject v_object)
  {
    assert NIL != inference_unit_test_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 2281L)
  public static SubLObject iut_halt_reason(final SubLObject v_object)
  {
    assert NIL != inference_unit_test_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 2281L)
  public static SubLObject iut_result_test(final SubLObject v_object)
  {
    assert NIL != inference_unit_test_p( v_object ) : v_object;
    return v_object.getField8();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 2281L)
  public static SubLObject iut_followups(final SubLObject v_object)
  {
    assert NIL != inference_unit_test_p( v_object ) : v_object;
    return v_object.getField9();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 2281L)
  public static SubLObject iut_bindings(final SubLObject v_object)
  {
    assert NIL != inference_unit_test_p( v_object ) : v_object;
    return v_object.getField10();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 2281L)
  public static SubLObject iut_kb(final SubLObject v_object)
  {
    assert NIL != inference_unit_test_p( v_object ) : v_object;
    return v_object.getField11();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 2281L)
  public static SubLObject iut_owner(final SubLObject v_object)
  {
    assert NIL != inference_unit_test_p( v_object ) : v_object;
    return v_object.getField12();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 2281L)
  public static SubLObject iut_bug_number(final SubLObject v_object)
  {
    assert NIL != inference_unit_test_p( v_object ) : v_object;
    return v_object.getField13();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 2281L)
  public static SubLObject iut_creation_date(final SubLObject v_object)
  {
    assert NIL != inference_unit_test_p( v_object ) : v_object;
    return v_object.getField14();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 2281L)
  public static SubLObject iut_creator(final SubLObject v_object)
  {
    assert NIL != inference_unit_test_p( v_object ) : v_object;
    return v_object.getField15();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 2281L)
  public static SubLObject iut_workingP(final SubLObject v_object)
  {
    assert NIL != inference_unit_test_p( v_object ) : v_object;
    return v_object.getField16();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 2281L)
  public static SubLObject iut_subtype(final SubLObject v_object)
  {
    assert NIL != inference_unit_test_p( v_object ) : v_object;
    return v_object.getField17();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 2281L)
  public static SubLObject _csetf_iut_name(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_unit_test_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 2281L)
  public static SubLObject _csetf_iut_comment(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_unit_test_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 2281L)
  public static SubLObject _csetf_iut_sentence(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_unit_test_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 2281L)
  public static SubLObject _csetf_iut_properties(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_unit_test_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 2281L)
  public static SubLObject _csetf_iut_result(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_unit_test_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 2281L)
  public static SubLObject _csetf_iut_halt_reason(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_unit_test_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 2281L)
  public static SubLObject _csetf_iut_result_test(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_unit_test_p( v_object ) : v_object;
    return v_object.setField8( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 2281L)
  public static SubLObject _csetf_iut_followups(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_unit_test_p( v_object ) : v_object;
    return v_object.setField9( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 2281L)
  public static SubLObject _csetf_iut_bindings(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_unit_test_p( v_object ) : v_object;
    return v_object.setField10( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 2281L)
  public static SubLObject _csetf_iut_kb(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_unit_test_p( v_object ) : v_object;
    return v_object.setField11( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 2281L)
  public static SubLObject _csetf_iut_owner(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_unit_test_p( v_object ) : v_object;
    return v_object.setField12( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 2281L)
  public static SubLObject _csetf_iut_bug_number(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_unit_test_p( v_object ) : v_object;
    return v_object.setField13( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 2281L)
  public static SubLObject _csetf_iut_creation_date(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_unit_test_p( v_object ) : v_object;
    return v_object.setField14( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 2281L)
  public static SubLObject _csetf_iut_creator(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_unit_test_p( v_object ) : v_object;
    return v_object.setField15( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 2281L)
  public static SubLObject _csetf_iut_workingP(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_unit_test_p( v_object ) : v_object;
    return v_object.setField16( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 2281L)
  public static SubLObject _csetf_iut_subtype(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_unit_test_p( v_object ) : v_object;
    return v_object.setField17( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 2281L)
  public static SubLObject make_inference_unit_test(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $inference_unit_test_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw42$NAME ) )
      {
        _csetf_iut_name( v_new, current_value );
      }
      else if( pcase_var.eql( $kw43$COMMENT ) )
      {
        _csetf_iut_comment( v_new, current_value );
      }
      else if( pcase_var.eql( $kw44$SENTENCE ) )
      {
        _csetf_iut_sentence( v_new, current_value );
      }
      else if( pcase_var.eql( $kw45$PROPERTIES ) )
      {
        _csetf_iut_properties( v_new, current_value );
      }
      else if( pcase_var.eql( $kw46$RESULT ) )
      {
        _csetf_iut_result( v_new, current_value );
      }
      else if( pcase_var.eql( $kw47$HALT_REASON ) )
      {
        _csetf_iut_halt_reason( v_new, current_value );
      }
      else if( pcase_var.eql( $kw48$RESULT_TEST ) )
      {
        _csetf_iut_result_test( v_new, current_value );
      }
      else if( pcase_var.eql( $kw49$FOLLOWUPS ) )
      {
        _csetf_iut_followups( v_new, current_value );
      }
      else if( pcase_var.eql( $kw50$BINDINGS ) )
      {
        _csetf_iut_bindings( v_new, current_value );
      }
      else if( pcase_var.eql( $kw51$KB ) )
      {
        _csetf_iut_kb( v_new, current_value );
      }
      else if( pcase_var.eql( $kw52$OWNER ) )
      {
        _csetf_iut_owner( v_new, current_value );
      }
      else if( pcase_var.eql( $kw53$BUG_NUMBER ) )
      {
        _csetf_iut_bug_number( v_new, current_value );
      }
      else if( pcase_var.eql( $kw54$CREATION_DATE ) )
      {
        _csetf_iut_creation_date( v_new, current_value );
      }
      else if( pcase_var.eql( $kw55$CREATOR ) )
      {
        _csetf_iut_creator( v_new, current_value );
      }
      else if( pcase_var.eql( $kw56$WORKING_ ) )
      {
        _csetf_iut_workingP( v_new, current_value );
      }
      else if( pcase_var.eql( $kw57$SUBTYPE ) )
      {
        _csetf_iut_subtype( v_new, current_value );
      }
      else
      {
        Errors.error( $str58$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 2281L)
  public static SubLObject visit_defstruct_inference_unit_test(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw59$BEGIN, $sym60$MAKE_INFERENCE_UNIT_TEST, SIXTEEN_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw61$SLOT, $kw42$NAME, iut_name( obj ) );
    Functions.funcall( visitor_fn, obj, $kw61$SLOT, $kw43$COMMENT, iut_comment( obj ) );
    Functions.funcall( visitor_fn, obj, $kw61$SLOT, $kw44$SENTENCE, iut_sentence( obj ) );
    Functions.funcall( visitor_fn, obj, $kw61$SLOT, $kw45$PROPERTIES, iut_properties( obj ) );
    Functions.funcall( visitor_fn, obj, $kw61$SLOT, $kw46$RESULT, iut_result( obj ) );
    Functions.funcall( visitor_fn, obj, $kw61$SLOT, $kw47$HALT_REASON, iut_halt_reason( obj ) );
    Functions.funcall( visitor_fn, obj, $kw61$SLOT, $kw48$RESULT_TEST, iut_result_test( obj ) );
    Functions.funcall( visitor_fn, obj, $kw61$SLOT, $kw49$FOLLOWUPS, iut_followups( obj ) );
    Functions.funcall( visitor_fn, obj, $kw61$SLOT, $kw50$BINDINGS, iut_bindings( obj ) );
    Functions.funcall( visitor_fn, obj, $kw61$SLOT, $kw51$KB, iut_kb( obj ) );
    Functions.funcall( visitor_fn, obj, $kw61$SLOT, $kw52$OWNER, iut_owner( obj ) );
    Functions.funcall( visitor_fn, obj, $kw61$SLOT, $kw53$BUG_NUMBER, iut_bug_number( obj ) );
    Functions.funcall( visitor_fn, obj, $kw61$SLOT, $kw54$CREATION_DATE, iut_creation_date( obj ) );
    Functions.funcall( visitor_fn, obj, $kw61$SLOT, $kw55$CREATOR, iut_creator( obj ) );
    Functions.funcall( visitor_fn, obj, $kw61$SLOT, $kw56$WORKING_, iut_workingP( obj ) );
    Functions.funcall( visitor_fn, obj, $kw61$SLOT, $kw57$SUBTYPE, iut_subtype( obj ) );
    Functions.funcall( visitor_fn, obj, $kw62$END, $sym60$MAKE_INFERENCE_UNIT_TEST, SIXTEEN_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 2281L)
  public static SubLObject visit_defstruct_object_inference_unit_test_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_inference_unit_test( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 3692L)
  public static SubLObject inference_unit_test_name(final SubLObject test)
  {
    assert NIL != inference_unit_test_p( test ) : test;
    return iut_name( test );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 3822L)
  public static SubLObject inference_unit_test_comment(final SubLObject test)
  {
    assert NIL != inference_unit_test_p( test ) : test;
    return iut_comment( test );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 3946L)
  public static SubLObject inference_unit_test_sentence(final SubLObject test)
  {
    assert NIL != inference_unit_test_p( test ) : test;
    return iut_sentence( test );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 4070L)
  public static SubLObject inference_unit_test_properties(final SubLObject test)
  {
    assert NIL != inference_unit_test_p( test ) : test;
    return iut_properties( test );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 4198L)
  public static SubLObject inference_unit_test_expected_result(final SubLObject test)
  {
    assert NIL != inference_unit_test_p( test ) : test;
    return iut_result( test );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 4327L)
  public static SubLObject inference_unit_test_expected_halt_reason(final SubLObject test)
  {
    assert NIL != inference_unit_test_p( test ) : test;
    return iut_halt_reason( test );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 4466L)
  public static SubLObject inference_unit_test_result_test(final SubLObject test)
  {
    assert NIL != inference_unit_test_p( test ) : test;
    return iut_result_test( test );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 4596L)
  public static SubLObject inference_unit_test_followups(final SubLObject test)
  {
    assert NIL != inference_unit_test_p( test ) : test;
    return iut_followups( test );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 4722L)
  public static SubLObject inference_unit_test_bindings(final SubLObject test)
  {
    assert NIL != inference_unit_test_p( test ) : test;
    return iut_bindings( test );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 4846L)
  public static SubLObject inference_unit_test_kb(final SubLObject test)
  {
    assert NIL != inference_unit_test_p( test ) : test;
    return iut_kb( test );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 4960L)
  public static SubLObject inference_unit_test_owner(final SubLObject test)
  {
    assert NIL != inference_unit_test_p( test ) : test;
    return iut_owner( test );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 5080L)
  public static SubLObject inference_unit_test_bug_number(final SubLObject test)
  {
    assert NIL != inference_unit_test_p( test ) : test;
    return iut_bug_number( test );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 5208L)
  public static SubLObject inference_unit_test_creation_date(final SubLObject test)
  {
    assert NIL != inference_unit_test_p( test ) : test;
    return iut_creation_date( test );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 5342L)
  public static SubLObject inference_unit_test_creator(final SubLObject test)
  {
    assert NIL != inference_unit_test_p( test ) : test;
    return iut_creator( test );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 5466L)
  public static SubLObject inference_unit_test_workingP(final SubLObject test)
  {
    assert NIL != inference_unit_test_p( test ) : test;
    return iut_workingP( test );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 5592L)
  public static SubLObject inference_unit_test_subtype(final SubLObject test)
  {
    assert NIL != inference_unit_test_p( test ) : test;
    return iut_subtype( test );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 5716L)
  public static SubLObject inference_unit_test_mentions_invalid_constantP(final SubLObject iut)
  {
    return makeBoolean( NIL != list_utilities.tree_find_if( Symbols.symbol_function( $sym64$INVALID_CONSTANT_ ), inference_unit_test_sentence( iut ), UNPROVIDED ) || NIL != list_utilities.tree_find_if( Symbols
        .symbol_function( $sym64$INVALID_CONSTANT_ ), inference_unit_test_followups( iut ), UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 5951L)
  public static SubLObject inference_unit_test_invalid_constants(final SubLObject iut)
  {
    return Sequences.remove_duplicates( ConsesLow.append( cycl_utilities.expression_gather( inference_unit_test_sentence( iut ), $sym64$INVALID_CONSTANT_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), cycl_utilities
        .expression_gather( inference_unit_test_followups( iut ), $sym64$INVALID_CONSTANT_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 6208L)
  public static SubLObject inference_unit_test_recipe(final SubLObject test)
  {
    final SubLObject raw_result_test = inference_unit_test_result_test( test );
    final SubLObject result_test = inference_unit_result_test_recipe( raw_result_test );
    SubLObject recipe = NIL;
    if( NIL == result_test && raw_result_test.isFunction() )
    {
      Errors.error( $str65$Cannot_build_inference_test_recip, raw_result_test );
    }
    recipe = conses_high.putf( recipe, $kw42$NAME, inference_unit_test_name( test ) );
    recipe = conses_high.putf( recipe, $kw43$COMMENT, inference_unit_test_comment( test ) );
    recipe = conses_high.putf( recipe, $kw44$SENTENCE, inference_unit_test_sentence( test ) );
    recipe = conses_high.putf( recipe, $kw45$PROPERTIES, inference_unit_test_properties( test ) );
    recipe = conses_high.putf( recipe, $kw46$RESULT, inference_unit_test_expected_result( test ) );
    recipe = conses_high.putf( recipe, $kw47$HALT_REASON, inference_unit_test_expected_halt_reason( test ) );
    recipe = conses_high.putf( recipe, $kw48$RESULT_TEST, result_test );
    recipe = conses_high.putf( recipe, $kw49$FOLLOWUPS, inference_unit_test_followups( test ) );
    recipe = conses_high.putf( recipe, $kw50$BINDINGS, inference_unit_test_bindings( test ) );
    recipe = conses_high.putf( recipe, $kw51$KB, inference_unit_test_kb( test ) );
    recipe = conses_high.putf( recipe, $kw52$OWNER, inference_unit_test_owner( test ) );
    recipe = conses_high.putf( recipe, $kw53$BUG_NUMBER, inference_unit_test_bug_number( test ) );
    recipe = conses_high.putf( recipe, $kw54$CREATION_DATE, inference_unit_test_creation_date( test ) );
    recipe = conses_high.putf( recipe, $kw55$CREATOR, inference_unit_test_creator( test ) );
    recipe = conses_high.putf( recipe, $kw56$WORKING_, inference_unit_test_workingP( test ) );
    recipe = conses_high.putf( recipe, $kw57$SUBTYPE, inference_unit_test_subtype( test ) );
    return recipe;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 8136L)
  public static SubLObject inference_unit_result_test_recipe(final SubLObject result_test)
  {
    if( result_test.isSymbol() )
    {
      return result_test;
    }
    SubLObject test_recipe = NIL;
    test_recipe = hash_table_utilities.hash_test_to_symbol( result_test );
    if( NIL != list_utilities.sublisp_boolean( test_recipe ) )
    {
      return test_recipe;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 8831L)
  public static SubLObject new_inference_unit_test_from_recipe(final SubLObject recipe)
  {
    final SubLObject name_tail = cdestructuring_bind.property_list_member( $kw42$NAME, recipe );
    final SubLObject name = ( NIL != name_tail ) ? conses_high.cadr( name_tail ) : NIL;
    final SubLObject comment_tail = cdestructuring_bind.property_list_member( $kw43$COMMENT, recipe );
    final SubLObject comment = ( NIL != comment_tail ) ? conses_high.cadr( comment_tail ) : NIL;
    final SubLObject sentence_tail = cdestructuring_bind.property_list_member( $kw44$SENTENCE, recipe );
    final SubLObject sentence = ( NIL != sentence_tail ) ? conses_high.cadr( sentence_tail ) : NIL;
    final SubLObject properties_tail = cdestructuring_bind.property_list_member( $kw45$PROPERTIES, recipe );
    final SubLObject v_properties = ( NIL != properties_tail ) ? conses_high.cadr( properties_tail ) : NIL;
    final SubLObject expected_result_tail = cdestructuring_bind.property_list_member( $kw66$EXPECTED_RESULT, recipe );
    final SubLObject expected_result = ( NIL != expected_result_tail ) ? conses_high.cadr( expected_result_tail ) : NIL;
    final SubLObject halt_reason_tail = cdestructuring_bind.property_list_member( $kw47$HALT_REASON, recipe );
    final SubLObject halt_reason = ( NIL != halt_reason_tail ) ? conses_high.cadr( halt_reason_tail ) : NIL;
    final SubLObject result_test_tail = cdestructuring_bind.property_list_member( $kw48$RESULT_TEST, recipe );
    final SubLObject result_test = ( NIL != result_test_tail ) ? conses_high.cadr( result_test_tail ) : NIL;
    final SubLObject followups_tail = cdestructuring_bind.property_list_member( $kw49$FOLLOWUPS, recipe );
    final SubLObject followups = ( NIL != followups_tail ) ? conses_high.cadr( followups_tail ) : NIL;
    final SubLObject bindings_tail = cdestructuring_bind.property_list_member( $kw50$BINDINGS, recipe );
    final SubLObject v_bindings = ( NIL != bindings_tail ) ? conses_high.cadr( bindings_tail ) : NIL;
    final SubLObject kb_tail = cdestructuring_bind.property_list_member( $kw51$KB, recipe );
    final SubLObject kb = ( NIL != kb_tail ) ? conses_high.cadr( kb_tail ) : NIL;
    final SubLObject owner_tail = cdestructuring_bind.property_list_member( $kw52$OWNER, recipe );
    final SubLObject owner = ( NIL != owner_tail ) ? conses_high.cadr( owner_tail ) : NIL;
    final SubLObject bug_number_tail = cdestructuring_bind.property_list_member( $kw53$BUG_NUMBER, recipe );
    final SubLObject bug_number = ( NIL != bug_number_tail ) ? conses_high.cadr( bug_number_tail ) : NIL;
    final SubLObject creation_date_tail = cdestructuring_bind.property_list_member( $kw54$CREATION_DATE, recipe );
    final SubLObject creation_date = ( NIL != creation_date_tail ) ? conses_high.cadr( creation_date_tail ) : NIL;
    final SubLObject creator_tail = cdestructuring_bind.property_list_member( $kw55$CREATOR, recipe );
    final SubLObject creator = ( NIL != creator_tail ) ? conses_high.cadr( creator_tail ) : NIL;
    final SubLObject workingP_tail = cdestructuring_bind.property_list_member( $kw56$WORKING_, recipe );
    final SubLObject workingP = ( NIL != workingP_tail ) ? conses_high.cadr( workingP_tail ) : NIL;
    final SubLObject subtype_tail = cdestructuring_bind.property_list_member( $kw57$SUBTYPE, recipe );
    final SubLObject subtype = ( NIL != subtype_tail ) ? conses_high.cadr( subtype_tail ) : NIL;
    return define_inference_unit_test_internal( name, comment, sentence, v_properties, expected_result, halt_reason, result_test, followups, v_bindings, kb, owner, bug_number, creation_date, creator, workingP, subtype );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 9792L)
  public static SubLObject cfasl_output_object_inference_unit_test_method(final SubLObject v_object, final SubLObject stream)
  {
    return cfasl_output_inference_unit_test( v_object, stream );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 9925L)
  public static SubLObject cfasl_output_inference_unit_test(final SubLObject test, final SubLObject stream)
  {
    cfasl.cfasl_output_wide_opcode( $cfasl_wide_opcode_inference_unit_test$.getGlobalValue(), stream );
    cfasl_output_inference_unit_test_internal( test, stream );
    return test;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 10138L)
  public static SubLObject cfasl_output_inference_unit_test_internal(final SubLObject test, final SubLObject stream)
  {
    final SubLObject recipe = inference_unit_test_recipe( test );
    cfasl.cfasl_output( recipe, stream );
    return test;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 10313L)
  public static SubLObject cfasl_input_inference_unit_test(final SubLObject stream)
  {
    final SubLObject recipe = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    return new_inference_unit_test_from_recipe( recipe );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 10469L)
  public static SubLObject test_inference_unit_test_serialization(final SubLObject iut)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject old_recipe = inference_unit_test_recipe( iut );
    SubLObject new_iut = NIL;
    new_iut = cfasl_utilities.cfasl_copy_object( iut );
    final SubLObject new_recipe = inference_unit_test_recipe( new_iut );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == list_utilities.slow_plists_equalP( old_recipe, new_recipe, EQUALP ) )
    {
      Errors.error( $str70$Deserialization_produced__A_inste, new_recipe, old_recipe, iut );
    }
    return iut;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 11208L)
  public static SubLObject find_inference_unit_test_by_name(final SubLObject name)
  {
    return Hashtables.gethash( name, $inference_unit_tests_by_name$.getGlobalValue(), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 11320L)
  public static SubLObject store_inference_unit_test(final SubLObject test)
  {
    final SubLObject name = inference_unit_test_name( test );
    $inference_unit_test_names_in_order$.setGlobalValue( Sequences.delete( name, $inference_unit_test_names_in_order$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    $inference_unit_test_names_in_order$.setGlobalValue( ConsesLow.append( $inference_unit_test_names_in_order$.getGlobalValue(), ConsesLow.list( name ) ) );
    return Hashtables.sethash( name, $inference_unit_tests_by_name$.getGlobalValue(), test );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 11689L)
  public static SubLObject do_inference_unit_tests(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list74 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject test_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list74 );
    test_var = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list74 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list74 );
      if( NIL == conses_high.member( current_$1, $list75, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw76$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list74 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw77$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject name = $sym78$NAME;
    return ConsesLow.list( $sym79$DO_LIST, ConsesLow.list( name, $sym71$_INFERENCE_UNIT_TEST_NAMES_IN_ORDER_, $kw77$DONE, done ), ConsesLow.listS( $sym80$CLET, ConsesLow.list( ConsesLow.list( test_var, ConsesLow.list(
        $sym81$FIND_INFERENCE_UNIT_TEST_BY_NAME, name ) ) ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 11952L)
  public static SubLObject all_inference_unit_test_names()
  {
    SubLObject names = NIL;
    SubLObject cdolist_list_var = $inference_unit_test_names_in_order$.getGlobalValue();
    SubLObject name = NIL;
    name = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject test = find_inference_unit_test_by_name( name );
      final SubLObject name_$2 = inference_unit_test_name( test );
      names = ConsesLow.cons( name_$2, names );
      cdolist_list_var = cdolist_list_var.rest();
      name = cdolist_list_var.first();
    }
    return Sequences.nreverse( names );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 12162L)
  public static SubLObject inference_unit_test_followup_p(final SubLObject followup)
  {
    if( NIL != list_utilities.proper_list_p( followup ) && NIL != list_utilities.lengthE( followup, FIVE_INTEGER, UNPROVIDED ) )
    {
      SubLObject sentence = NIL;
      SubLObject v_properties = NIL;
      SubLObject expected_result = NIL;
      SubLObject expected_result_test = NIL;
      SubLObject expected_halt_reason = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( followup, followup, $list82 );
      sentence = followup.first();
      SubLObject current = followup.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, followup, $list82 );
      v_properties = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, followup, $list82 );
      expected_result = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, followup, $list82 );
      expected_result_test = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, followup, $list82 );
      expected_halt_reason = current.first();
      current = current.rest();
      if( NIL == current )
      {
        return makeBoolean( ( $kw83$CONTINUE == sentence || $kw84$PREVIOUS == sentence || NIL != el_utilities.possibly_sentence_p( sentence ) ) && NIL != inference_datastructures_enumerated_types.query_properties_p(
            v_properties ) && ( NIL == expected_result_test || NIL != subl_promotions.function_symbol_p( expected_result_test ) ) && ( NIL == expected_halt_reason || NIL != inference_datastructures_enumerated_types
                .query_halt_reason_p( expected_halt_reason ) ) );
      }
      cdestructuring_bind.cdestructuring_bind_error( followup, $list82 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 12792L)
  public static SubLObject define_inference_unit_test(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list85 );
    name = current.first();
    final SubLObject plist;
    current = ( plist = current.rest() );
    final SubLObject sentence_tail = cdestructuring_bind.property_list_member( $kw44$SENTENCE, current );
    final SubLObject sentence = ( NIL != sentence_tail ) ? conses_high.cadr( sentence_tail ) : NIL;
    final SubLObject properties_tail = cdestructuring_bind.property_list_member( $kw45$PROPERTIES, current );
    final SubLObject v_properties = ( NIL != properties_tail ) ? conses_high.cadr( properties_tail ) : NIL;
    final SubLObject expected_result_tail = cdestructuring_bind.property_list_member( $kw66$EXPECTED_RESULT, current );
    final SubLObject expected_result = ( NIL != expected_result_tail ) ? conses_high.cadr( expected_result_tail ) : NIL;
    final SubLObject expected_halt_reason_tail = cdestructuring_bind.property_list_member( $kw86$EXPECTED_HALT_REASON, current );
    final SubLObject expected_halt_reason = ( NIL != expected_halt_reason_tail ) ? conses_high.cadr( expected_halt_reason_tail ) : $kw87$EXHAUST_TOTAL;
    final SubLObject expected_result_test_tail = cdestructuring_bind.property_list_member( $kw88$EXPECTED_RESULT_TEST, current );
    final SubLObject expected_result_test = ( NIL != expected_result_test_tail ) ? conses_high.cadr( expected_result_test_tail ) : NIL;
    final SubLObject comment_tail = cdestructuring_bind.property_list_member( $kw43$COMMENT, current );
    final SubLObject comment = ( NIL != comment_tail ) ? conses_high.cadr( comment_tail ) : NIL;
    final SubLObject followups_tail = cdestructuring_bind.property_list_member( $kw49$FOLLOWUPS, current );
    final SubLObject followups = ( NIL != followups_tail ) ? conses_high.cadr( followups_tail ) : NIL;
    final SubLObject bindings_tail = cdestructuring_bind.property_list_member( $kw50$BINDINGS, current );
    final SubLObject v_bindings = ( NIL != bindings_tail ) ? conses_high.cadr( bindings_tail ) : NIL;
    final SubLObject kb_tail = cdestructuring_bind.property_list_member( $kw51$KB, current );
    final SubLObject kb = ( NIL != kb_tail ) ? conses_high.cadr( kb_tail ) : $kw89$TINY;
    final SubLObject owner_tail = cdestructuring_bind.property_list_member( $kw52$OWNER, current );
    final SubLObject owner = ( NIL != owner_tail ) ? conses_high.cadr( owner_tail ) : NIL;
    final SubLObject bug_tail = cdestructuring_bind.property_list_member( $kw90$BUG, current );
    final SubLObject bug = ( NIL != bug_tail ) ? conses_high.cadr( bug_tail ) : NIL;
    final SubLObject created_tail = cdestructuring_bind.property_list_member( $kw91$CREATED, current );
    final SubLObject created = ( NIL != created_tail ) ? conses_high.cadr( created_tail ) : NIL;
    final SubLObject creator_tail = cdestructuring_bind.property_list_member( $kw55$CREATOR, current );
    final SubLObject creator = ( NIL != creator_tail ) ? conses_high.cadr( creator_tail ) : NIL;
    final SubLObject workingP_tail = cdestructuring_bind.property_list_member( $kw56$WORKING_, current );
    final SubLObject workingP = ( NIL != workingP_tail ) ? conses_high.cadr( workingP_tail ) : T;
    final SubLObject subtype_tail = cdestructuring_bind.property_list_member( $kw57$SUBTYPE, current );
    final SubLObject subtype = ( NIL != subtype_tail ) ? conses_high.cadr( subtype_tail ) : NIL;
    return ConsesLow.list( $sym92$PROGN, ConsesLow.list( $sym93$VALIDATE_INFERENCE_UNIT_TEST_PLIST, ConsesLow.list( $sym94$QUOTE, plist ) ), ConsesLow.list( new SubLObject[] { $sym95$DEFINE_INFERENCE_UNIT_TEST_INTERNAL,
      name, comment, sentence, v_properties, expected_result, expected_halt_reason, expected_result_test, ConsesLow.list( $sym96$CANONICALIZE_INFERENCE_UNIT_TEST_FOLLOWUPS, followups ), v_bindings, kb, owner, bug,
      created, creator, workingP, subtype
    } ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 14836L)
  public static SubLObject undefine_inference_unit_test(final SubLObject name)
  {
    final SubLObject removedP = Hashtables.remhash( name, $inference_unit_tests_by_name$.getGlobalValue() );
    $inference_unit_test_names_in_order$.setGlobalValue( Sequences.delete( name, $inference_unit_test_names_in_order$.getGlobalValue(), Symbols.symbol_function( EQ ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    return removedP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 15171L)
  public static SubLObject undefine_all_inference_unit_tests()
  {
    $inference_unit_test_names_in_order$.setGlobalValue( NIL );
    $inference_unit_tests_by_name$.setGlobalValue( Hashtables.make_hash_table( $int73$212, Symbols.symbol_function( EQ ), UNPROVIDED ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 15738L)
  public static SubLObject inference_unit_test_property_p(final SubLObject v_object)
  {
    return list_utilities.member_eqP( v_object, $inference_unit_test_properties$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 15856L)
  public static SubLObject validate_inference_unit_test_plist(final SubLObject plist)
  {
    assert NIL != list_utilities.property_list_p( plist ) : plist;
    SubLObject remainder;
    SubLObject property;
    SubLObject value;
    for( remainder = NIL, remainder = plist; NIL != remainder; remainder = conses_high.cddr( remainder ) )
    {
      property = remainder.first();
      value = conses_high.cadr( remainder );
      if( NIL == inference_unit_test_property_p( property ) )
      {
        Errors.warn( $str101$_s_is_not_a_known__a, property, $sym102$INFERENCE_UNIT_TEST_PROPERTY_P );
      }
    }
    return plist;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 16262L)
  public static SubLObject inference_unit_test_followup_property_p(final SubLObject v_object)
  {
    return list_utilities.member_eqP( v_object, $inference_unit_test_followup_properties$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 16398L)
  public static SubLObject validate_inference_unit_test_followup_plist(final SubLObject plist)
  {
    assert NIL != list_utilities.property_list_p( plist ) : plist;
    SubLObject remainder;
    SubLObject property;
    SubLObject value;
    for( remainder = NIL, remainder = plist; NIL != remainder; remainder = conses_high.cddr( remainder ) )
    {
      property = remainder.first();
      value = conses_high.cadr( remainder );
      if( NIL == inference_unit_test_followup_property_p( property ) )
      {
        Errors.warn( $str101$_s_is_not_a_known__a, property, $sym105$INFERENCE_UNIT_TEST_FOLLOWUP_PROPERTY_P );
      }
    }
    return plist;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 16601L)
  public static SubLObject define_inference_unit_test_internal(final SubLObject name, final SubLObject comment, final SubLObject sentence, final SubLObject v_properties, final SubLObject expected_result,
      final SubLObject halt_reason, final SubLObject result_test, final SubLObject followups, final SubLObject v_bindings, final SubLObject kb, final SubLObject owner, final SubLObject bug_number,
      final SubLObject creation_date, final SubLObject creator, final SubLObject workingP, final SubLObject subtype)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.keywordp( name ) : name;
    assert NIL != el_utilities.possibly_sentence_p( sentence ) : sentence;
    assert NIL != list_utilities.property_list_p( v_properties ) : v_properties;
    SubLObject remainder;
    SubLObject property;
    SubLObject value;
    for( remainder = NIL, remainder = v_properties; NIL != remainder; remainder = conses_high.cddr( remainder ) )
    {
      property = remainder.first();
      value = conses_high.cadr( remainder );
      assert NIL != inference_datastructures_enumerated_types.query_property_p( property ) : property;
    }
    if( NIL == result_test && !assertionsDisabledInClass && NIL == bindings.binding_lists_p( expected_result ) )
    {
      throw new AssertionError( expected_result );
    }
    if( NIL != halt_reason && !assertionsDisabledInClass && NIL == inference_datastructures_enumerated_types.query_halt_reason_p( halt_reason ) )
    {
      throw new AssertionError( halt_reason );
    }
    if( NIL != result_test && !assertionsDisabledInClass && NIL == subl_promotions.function_symbol_p( result_test ) )
    {
      throw new AssertionError( result_test );
    }
    assert NIL != inference_testing.inference_test_comment_p( comment ) : comment;
    assert NIL != list_utilities.non_dotted_list_p( followups ) : followups;
    SubLObject cdolist_list_var = followups;
    SubLObject elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != inference_unit_test_followup_p( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    assert NIL != misc_utilities.subl_variable_binding_list_p( v_bindings ) : v_bindings;
    assert NIL != cyc_testing.cyc_test_kb_p( kb ) : kb;
    assert NIL != inference_testing.inference_test_owner_p( owner ) : owner;
    if( NIL != bug_number && !assertionsDisabledInClass && NIL == subl_promotions.positive_integer_p( bug_number ) )
    {
      throw new AssertionError( bug_number );
    }
    if( NIL != creation_date && !assertionsDisabledInClass && NIL == numeric_date_utilities.universal_date_p( creation_date ) )
    {
      throw new AssertionError( creation_date );
    }
    if( NIL != creator && !assertionsDisabledInClass && NIL == Types.stringp( creator ) )
    {
      throw new AssertionError( creator );
    }
    assert NIL != Types.booleanp( workingP ) : workingP;
    if( NIL != subtype && !assertionsDisabledInClass && NIL == Types.keywordp( subtype ) )
    {
      throw new AssertionError( subtype );
    }
    if( NIL != el_utilities.el_conditional_sentence_p( sentence ) && NIL == conses_high.getf( v_properties, $kw122$CONDITIONAL_SENTENCE_, UNPROVIDED ) )
    {
      Errors.warn( $str123$The_test__S_is_not_queried_with__, name );
    }
    final SubLObject test = make_inference_unit_test( ConsesLow.list( new SubLObject[] { $kw42$NAME, name, $kw43$COMMENT, comment, $kw44$SENTENCE, sentence, $kw45$PROPERTIES, v_properties, $kw46$RESULT, expected_result,
      $kw47$HALT_REASON, halt_reason, $kw48$RESULT_TEST, result_test, $kw49$FOLLOWUPS, followups, $kw50$BINDINGS, v_bindings, $kw51$KB, kb, $kw52$OWNER, owner, $kw53$BUG_NUMBER, bug_number, $kw54$CREATION_DATE,
      creation_date, $kw55$CREATOR, creator, $kw56$WORKING_, workingP, $kw57$SUBTYPE, subtype
    } ) );
    store_inference_unit_test( test );
    cyc_testing.new_cyc_test( cyc_testing.$cyc_test_filename$.getDynamicValue( thread ), test );
    return test;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 18546L)
  public static SubLObject canonicalize_inference_unit_test_followups(final SubLObject followup_specs)
  {
    SubLObject followups = NIL;
    SubLObject cdolist_list_var = followup_specs;
    SubLObject followup_spec = NIL;
    followup_spec = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      validate_inference_unit_test_followup_plist( followup_spec );
      final SubLObject current;
      final SubLObject datum = current = followup_spec;
      final SubLObject sentence_tail = cdestructuring_bind.property_list_member( $kw44$SENTENCE, current );
      final SubLObject sentence = ( NIL != sentence_tail ) ? conses_high.cadr( sentence_tail ) : $kw83$CONTINUE;
      final SubLObject properties_tail = cdestructuring_bind.property_list_member( $kw45$PROPERTIES, current );
      final SubLObject v_properties = ( NIL != properties_tail ) ? conses_high.cadr( properties_tail ) : NIL;
      final SubLObject expected_result_tail = cdestructuring_bind.property_list_member( $kw66$EXPECTED_RESULT, current );
      final SubLObject expected_result = ( NIL != expected_result_tail ) ? conses_high.cadr( expected_result_tail ) : NIL;
      final SubLObject expected_result_test_tail = cdestructuring_bind.property_list_member( $kw88$EXPECTED_RESULT_TEST, current );
      final SubLObject expected_result_test = ( NIL != expected_result_test_tail ) ? conses_high.cadr( expected_result_test_tail ) : NIL;
      final SubLObject expected_halt_reason_tail = cdestructuring_bind.property_list_member( $kw86$EXPECTED_HALT_REASON, current );
      final SubLObject expected_halt_reason = ( NIL != expected_halt_reason_tail ) ? conses_high.cadr( expected_halt_reason_tail ) : $kw87$EXHAUST_TOTAL;
      followups = ConsesLow.cons( ConsesLow.list( sentence, v_properties, expected_result, expected_result_test, expected_halt_reason ), followups );
      cdolist_list_var = cdolist_list_var.rest();
      followup_spec = cdolist_list_var.first();
    }
    return Sequences.nreverse( followups );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 19151L)
  public static SubLObject run_all_inference_unit_tests(SubLObject verboseP, SubLObject stop_at_first_failureP, SubLObject output_format, SubLObject stream, SubLObject run_tiny_kb_tests_in_full_kbP,
      SubLObject return_test_runsP)
  {
    if( verboseP == UNPROVIDED )
    {
      verboseP = T;
    }
    if( stop_at_first_failureP == UNPROVIDED )
    {
      stop_at_first_failureP = NIL;
    }
    if( output_format == UNPROVIDED )
    {
      output_format = $kw124$STANDARD;
    }
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    if( run_tiny_kb_tests_in_full_kbP == UNPROVIDED )
    {
      run_tiny_kb_tests_in_full_kbP = cyc_testing.$run_tiny_kb_tests_in_full_kbP$.getDynamicValue();
    }
    if( return_test_runsP == UNPROVIDED )
    {
      return_test_runsP = NIL;
    }
    final SubLObject verbosity = ( NIL != verboseP ) ? $kw125$VERBOSE : $kw126$TERSE;
    return cyc_testing.run_all_loaded_cyc_tests( stream, verbosity, stop_at_first_failureP, output_format, run_tiny_kb_tests_in_full_kbP, NIL, return_test_runsP, $kw127$IUT, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED,
        UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 20061L)
  public static SubLObject run_inference_unit_tests(SubLObject names, SubLObject verboseP, SubLObject stop_at_first_failureP, SubLObject output_format, SubLObject stream, SubLObject run_tiny_kb_tests_in_full_kbP,
      SubLObject return_test_runsP)
  {
    if( names == UNPROVIDED )
    {
      names = all_inference_unit_test_names();
    }
    if( verboseP == UNPROVIDED )
    {
      verboseP = T;
    }
    if( stop_at_first_failureP == UNPROVIDED )
    {
      stop_at_first_failureP = NIL;
    }
    if( output_format == UNPROVIDED )
    {
      output_format = $kw124$STANDARD;
    }
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    if( run_tiny_kb_tests_in_full_kbP == UNPROVIDED )
    {
      run_tiny_kb_tests_in_full_kbP = cyc_testing.$run_tiny_kb_tests_in_full_kbP$.getDynamicValue();
    }
    if( return_test_runsP == UNPROVIDED )
    {
      return_test_runsP = NIL;
    }
    assert NIL != Types.booleanp( verboseP ) : verboseP;
    assert NIL != Types.booleanp( stop_at_first_failureP ) : stop_at_first_failureP;
    assert NIL != cyc_testing.cyc_test_output_format_p( output_format ) : output_format;
    final SubLObject verbosity = ( NIL != verboseP ) ? $kw125$VERBOSE : $kw126$TERSE;
    final SubLObject cyc_tests = list_utilities.delete_if_not( $sym129$CYC_TEST_P, Mapping.mapcar( $sym130$FIND_CYC_TEST, names ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return cyc_testing.run_all_loaded_cyc_tests( stream, verbosity, stop_at_first_failureP, output_format, run_tiny_kb_tests_in_full_kbP, NIL, return_test_runsP, $kw127$IUT, NIL, NIL, NIL, cyc_tests, UNPROVIDED,
        UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 21205L)
  public static SubLObject run_inference_unit_test(final SubLObject name, SubLObject verboseP, SubLObject browsableP, SubLObject blockingP, SubLObject output_format, SubLObject stream,
      SubLObject run_tiny_kb_tests_in_full_kbP)
  {
    if( verboseP == UNPROVIDED )
    {
      verboseP = T;
    }
    if( browsableP == UNPROVIDED )
    {
      browsableP = NIL;
    }
    if( blockingP == UNPROVIDED )
    {
      blockingP = NIL;
    }
    if( output_format == UNPROVIDED )
    {
      output_format = $kw124$STANDARD;
    }
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    if( run_tiny_kb_tests_in_full_kbP == UNPROVIDED )
    {
      run_tiny_kb_tests_in_full_kbP = cyc_testing.$run_tiny_kb_tests_in_full_kbP$.getDynamicValue();
    }
    assert NIL != Types.keywordp( name ) : name;
    assert NIL != cyc_testing.cyc_test_output_format_p( output_format ) : output_format;
    final SubLObject test = find_inference_unit_test_by_name( name );
    if( NIL == test )
    {
      Errors.error( $str131$No_test_with_name__a_was_found, name );
    }
    return run_inference_unit_test_int( test, verboseP, browsableP, blockingP, output_format, stream, run_tiny_kb_tests_in_full_kbP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 21943L)
  public static SubLObject run_inference_unit_test_int(final SubLObject test, final SubLObject verboseP, final SubLObject browsableP, final SubLObject blockingP, final SubLObject output_format, final SubLObject stream,
      final SubLObject run_tiny_kb_tests_in_full_kbP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == run_inference_unit_testP( test, run_tiny_kb_tests_in_full_kbP ) )
    {
      final SubLObject name = inference_unit_test_name( test );
      return Values.values( $kw132$NOT_RUN, cyc_testing.new_cyc_test_run( $kw127$IUT, name, $kw132$NOT_RUN, NIL ) );
    }
    if( NIL != inference_unit_test_mentions_invalid_constantP( test ) )
    {
      final SubLObject name = inference_unit_test_name( test );
      return Values.values( $kw133$INVALID, cyc_testing.new_cyc_test_run( $kw127$IUT, name, $kw133$INVALID, NIL ) );
    }
    SubLObject all_inferences = NIL;
    SubLObject overall_result = NIL;
    SubLObject overall_test_time = NIL;
    SubLObject test_run = NIL;
    final SubLObject _prev_bind_0 = $within_inference_unit_testP$.currentBinding( thread );
    final SubLObject _prev_bind_2 = $inference_unit_test_assertions_created$.currentBinding( thread );
    final SubLObject _prev_bind_3 = print_high.$print_pretty$.currentBinding( thread );
    try
    {
      $within_inference_unit_testP$.bind( T, thread );
      $inference_unit_test_assertions_created$.bind( NIL, thread );
      print_high.$print_pretty$.bind( NIL, thread );
      final SubLObject name2 = inference_unit_test_name( test );
      final SubLObject sentence = inference_unit_test_sentence( test );
      final SubLObject v_properties = inference_unit_test_properties( test );
      final SubLObject expected_result = inference_unit_test_expected_result( test );
      final SubLObject expected_halt_reason = inference_unit_test_expected_halt_reason( test );
      final SubLObject result_test_func = inference_unit_test_result_test( test );
      final SubLObject followups = inference_unit_test_followups( test );
      final SubLObject v_bindings = inference_unit_test_bindings( test );
      final SubLObject subtype = inference_unit_test_subtype( test );
      SubLObject previous_inference = NIL;
      print_inference_unit_test_preamble( name2, verboseP, output_format, stream );
      thread.resetMultipleValues();
      final SubLObject overall_result_$3 = run_inference_unit_test_query( name2, sentence, v_properties, v_bindings, expected_result, expected_halt_reason, result_test_func, verboseP, browsableP, blockingP,
          list_utilities.sublisp_boolean( followups ), subtype, output_format, stream );
      final SubLObject overall_test_time_$4 = thread.secondMultipleValue();
      final SubLObject previous_inference_$5 = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      overall_result = overall_result_$3;
      overall_test_time = overall_test_time_$4;
      final SubLObject var;
      previous_inference = ( var = previous_inference_$5 );
      if( NIL != var )
      {
        all_inferences = ConsesLow.cons( var, all_inferences );
      }
      SubLObject rest;
      SubLObject followup;
      SubLObject current;
      SubLObject datum;
      SubLObject sentence_$6;
      SubLObject v_properties_$7;
      SubLObject expected_result_$8;
      SubLObject expected_result_test;
      SubLObject expected_halt_reason_$9;
      SubLObject followup_result;
      SubLObject followup_test_time;
      SubLObject followup_inference;
      SubLObject var2;
      SubLObject item_var;
      for( rest = NIL, rest = followups; $kw134$SUCCESS == overall_result && NIL != rest; rest = rest.rest() )
      {
        followup = rest.first();
        datum = ( current = followup );
        sentence_$6 = NIL;
        v_properties_$7 = NIL;
        expected_result_$8 = NIL;
        expected_result_test = NIL;
        expected_halt_reason_$9 = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list82 );
        sentence_$6 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list82 );
        v_properties_$7 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list82 );
        expected_result_$8 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list82 );
        expected_result_test = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list82 );
        expected_halt_reason_$9 = current.first();
        current = current.rest();
        if( NIL == current )
        {
          thread.resetMultipleValues();
          followup_result = run_inference_unit_test_followup_query( name2, previous_inference, sentence_$6, v_properties_$7, v_bindings, expected_result_$8, expected_halt_reason_$9, expected_result_test, verboseP,
              browsableP, blockingP, subtype, output_format, stream );
          followup_test_time = thread.secondMultipleValue();
          followup_inference = thread.thirdMultipleValue();
          thread.resetMultipleValues();
          overall_result = followup_result;
          overall_test_time = Numbers.add( overall_test_time, followup_test_time );
          previous_inference = ( var2 = followup_inference );
          if( NIL != var2 )
          {
            item_var = var2;
            if( NIL == conses_high.member( item_var, all_inferences, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              all_inferences = ConsesLow.cons( item_var, all_inferences );
            }
          }
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list82 );
        }
      }
      if( $kw134$SUCCESS == overall_result )
      {
        print_inference_unit_test_postamble( overall_result, name2, overall_test_time, verboseP, output_format, stream );
      }
      test_run = cyc_testing.new_cyc_test_run( $kw127$IUT, name2, overall_result, overall_test_time );
      inference_unit_test_cleanup();
    }
    finally
    {
      print_high.$print_pretty$.rebind( _prev_bind_3, thread );
      $inference_unit_test_assertions_created$.rebind( _prev_bind_2, thread );
      $within_inference_unit_testP$.rebind( _prev_bind_0, thread );
    }
    if( NIL == browsableP )
    {
      SubLObject cdolist_list_var = all_inferences;
      SubLObject inference = NIL;
      inference = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        inference_datastructures_inference.destroy_inference_and_problem_store( inference );
        cdolist_list_var = cdolist_list_var.rest();
        inference = cdolist_list_var.first();
      }
    }
    return Values.values( overall_result, test_run );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 24941L)
  public static SubLObject run_inference_unit_testP(final SubLObject test, final SubLObject run_tiny_kb_tests_in_full_kbP)
  {
    final SubLObject test_kb = inference_unit_test_kb( test );
    if( NIL == inference_testing.kb_matches_expectationsP( test_kb, run_tiny_kb_tests_in_full_kbP ) )
    {
      return NIL;
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 25359L)
  public static SubLObject run_inference_unit_test_followup_query(final SubLObject name, final SubLObject previous_inference, SubLObject sentence_spec, SubLObject v_properties, final SubLObject v_bindings,
      SubLObject expected_result, final SubLObject expected_halt_reason, final SubLObject result_test_func, final SubLObject verboseP, final SubLObject browsableP, final SubLObject blockingP, final SubLObject subtype,
      final SubLObject output_format, final SubLObject stream)
  {
    if( $kw83$CONTINUE == sentence_spec )
    {
      return run_inference_unit_test_query( name, previous_inference, v_properties, v_bindings, expected_result, expected_halt_reason, result_test_func, verboseP, browsableP, blockingP, T, subtype, output_format,
          stream );
    }
    if( $kw84$PREVIOUS == sentence_spec )
    {
      sentence_spec = el_utilities.make_ist_sentence( inference_datastructures_inference.inference_mt( previous_inference ), inference_datastructures_inference.inference_el_query( previous_inference ) );
    }
    SubLObject sentence = sentence_spec;
    assert NIL != el_grammar.el_sentence_p( sentence ) : sentence;
    if( NIL != previous_inference )
    {
      final SubLObject store = inference_datastructures_inference.inference_problem_store( previous_inference );
      sentence = followup_substitute_hypothetical_bindings( store, sentence );
      expected_result = followup_substitute_hypothetical_bindings( store, expected_result );
    }
    if( $kw136$UNPROVIDED != conses_high.getf( v_properties, $kw137$PROBLEM_STORE, $kw136$UNPROVIDED ) )
    {
      return run_inference_unit_test_query( name, sentence, v_properties, v_bindings, expected_result, expected_halt_reason, result_test_func, verboseP, browsableP, blockingP, T, subtype, output_format, stream );
    }
    if( NIL == previous_inference )
    {
      final SubLObject actual_result = NIL;
      final SubLObject actual_halt_reason = inference_datastructures_enumerated_types.new_inference_error_suspend_status( $str138$Previous_inference_was_not_browsa );
      final SubLObject result = $kw139$FAILURE;
      final SubLObject followup_time = ZERO_INTEGER;
      final SubLObject followup_inference = NIL;
      print_inference_unit_test_postamble( result, name, followup_time, verboseP, output_format, stream );
      print_inference_unit_test_failure( stream, verboseP, sentence, v_properties, result_test_func, expected_result, actual_result, expected_halt_reason, actual_halt_reason );
      return Values.values( result, followup_time, followup_inference );
    }
    final SubLObject problem_store = inference_datastructures_inference.inference_problem_store( previous_inference );
    v_properties = conses_high.putf( conses_high.copy_list( v_properties ), $kw137$PROBLEM_STORE, problem_store );
    return run_inference_unit_test_query( name, sentence, v_properties, v_bindings, expected_result, expected_halt_reason, result_test_func, verboseP, browsableP, blockingP, T, subtype, output_format, stream );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 28061L)
  public static SubLObject followup_substitute_hypothetical_bindings(final SubLObject store, SubLObject sentence)
  {
    final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw140$SKIP ) )
    {
      final SubLObject idx_$10 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$10, $kw140$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$10 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject earlier_inference;
        SubLObject hypothetical_bindings;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          earlier_inference = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( earlier_inference ) || NIL == id_index.id_index_skip_tombstones_p( $kw140$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( earlier_inference ) )
            {
              earlier_inference = $kw140$SKIP;
            }
            hypothetical_bindings = inference_datastructures_inference.inference_hypothetical_bindings( earlier_inference );
            sentence = bindings.apply_bindings( hypothetical_bindings, sentence );
          }
        }
      }
      final SubLObject idx_$11 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$11 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$11 );
        SubLObject id2 = NIL;
        SubLObject earlier_inference2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            earlier_inference2 = Hashtables.getEntryValue( cdohash_entry );
            final SubLObject hypothetical_bindings2 = inference_datastructures_inference.inference_hypothetical_bindings( earlier_inference2 );
            sentence = bindings.apply_bindings( hypothetical_bindings2, sentence );
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return sentence;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 28803L)
  public static SubLObject run_inference_unit_test_query(final SubLObject name, final SubLObject sentence_or_inference, SubLObject v_properties, final SubLObject v_bindings, SubLObject expected_result,
      final SubLObject expected_halt_reason, final SubLObject result_test_func, final SubLObject verboseP, final SubLObject browsableP, final SubLObject blockingP, final SubLObject has_followupsP,
      final SubLObject subtype, final SubLObject output_format, final SubLObject stream)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    SubLObject test_time = NIL;
    SubLObject query_inference = NIL;
    if( NIL != blockingP )
    {
      v_properties = conses_high.putf( conses_high.copy_list( v_properties ), $kw141$BLOCK_, T );
      v_properties = list_utilities.nmerge_plist( v_properties, $list142 );
    }
    if( NIL != browsableP )
    {
      v_properties = conses_high.putf( conses_high.copy_list( v_properties ), $kw143$BROWSABLE_, T );
    }
    if( NIL != $test_followups_use_public_problem_storeP$.getDynamicValue( thread ) && NIL != has_followupsP && NIL == pruning_inference_testP( subtype ) && NIL == inference_datastructures_inference.inference_p(
        sentence_or_inference ) )
    {
      final SubLObject store = inference_kernel.problem_store_from_properties( inference_datastructures_enumerated_types.extract_query_static_properties( v_properties ) );
      v_properties = conses_high.putf( conses_high.copy_list( v_properties ), $kw137$PROBLEM_STORE, store );
    }
    SubLObject actual_result = NIL;
    SubLObject hypothetical_bindings = NIL;
    SubLObject actual_halt_reason = NIL;
    SubLObject query_result = NIL;
    final SubLObject return_type = inference_datastructures_enumerated_types.inference_properties_return_type( v_properties );
    SubLObject time = ZERO_INTEGER;
    final SubLObject _prev_bind_0 = control_vars.$use_transcriptP$.currentBinding( thread );
    final SubLObject _prev_bind_2 = api_control_vars.$use_local_queueP$.currentBinding( thread );
    try
    {
      control_vars.$use_transcriptP$.bind( NIL, thread );
      api_control_vars.$use_local_queueP$.bind( NIL, thread );
      final SubLObject cprogv_var = misc_utilities.subl_variable_binding_list_variables( v_bindings );
      final ArrayList old_values = Dynamic.extract_dynamic_values( cprogv_var );
      try
      {
        Dynamic.bind_dynamic_vars( cprogv_var, misc_utilities.subl_variable_binding_list_values( v_bindings ) );
        if( NIL != inference_datastructures_inference.inference_p( sentence_or_inference ) )
        {
          final SubLObject time_var = Time.get_internal_real_time();
          thread.resetMultipleValues();
          final SubLObject query_result_$12 = inference_kernel.continue_inference( sentence_or_inference, v_properties );
          final SubLObject actual_halt_reason_$13 = thread.secondMultipleValue();
          final SubLObject query_inference_$14 = thread.thirdMultipleValue();
          thread.resetMultipleValues();
          query_result = query_result_$12;
          actual_halt_reason = actual_halt_reason_$13;
          query_inference = query_inference_$14;
          time = Numbers.divide( Numbers.subtract( Time.get_internal_real_time(), time_var ), time_high.$internal_time_units_per_second$.getGlobalValue() );
        }
        else
        {
          final SubLObject time_var = Time.get_internal_real_time();
          thread.resetMultipleValues();
          final SubLObject query_result_$13 = inference_kernel.new_cyc_query( sentence_or_inference, NIL, v_properties );
          final SubLObject actual_halt_reason_$14 = thread.secondMultipleValue();
          final SubLObject query_inference_$15 = thread.thirdMultipleValue();
          thread.resetMultipleValues();
          query_result = query_result_$13;
          actual_halt_reason = actual_halt_reason_$14;
          query_inference = query_inference_$15;
          time = Numbers.divide( Numbers.subtract( Time.get_internal_real_time(), time_var ), time_high.$internal_time_units_per_second$.getGlobalValue() );
        }
      }
      finally
      {
        Dynamic.rebind_dynamic_vars( cprogv_var, old_values );
      }
    }
    finally
    {
      api_control_vars.$use_local_queueP$.rebind( _prev_bind_2, thread );
      control_vars.$use_transcriptP$.rebind( _prev_bind_0, thread );
    }
    test_time = time;
    final SubLObject pcase_var = return_type;
    if( pcase_var.eql( $kw50$BINDINGS ) )
    {
      actual_result = query_result;
      hypothetical_bindings = NIL;
    }
    else if( pcase_var.eql( $kw144$BINDINGS_AND_HYPOTHETICAL_BINDINGS ) )
    {
      actual_result = query_result.first();
      hypothetical_bindings = conses_high.second( query_result );
    }
    else
    {
      actual_result = query_result;
      hypothetical_bindings = NIL;
    }
    if( NIL != hypothetical_bindings )
    {
      expected_result = bindings.apply_bindings( hypothetical_bindings, expected_result );
    }
    result = boolean_to_test_result( makeBoolean( NIL != halt_reason_matches_specP( actual_halt_reason, expected_halt_reason ) && NIL != iut_result_test_passesP( result_test_func, actual_result, expected_result ) ) );
    if( $kw139$FAILURE == result )
    {
      print_inference_unit_test_postamble( result, name, test_time, verboseP, output_format, stream );
      print_inference_unit_test_failure( stream, verboseP, sentence_or_inference, v_properties, result_test_func, expected_result, actual_result, expected_halt_reason, actual_halt_reason );
    }
    return Values.values( result, test_time, query_inference );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 31792L)
  public static SubLObject pruning_inference_testP(final SubLObject subtype)
  {
    return Equality.eq( $kw145$PRUNING, subtype );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 31874L)
  public static SubLObject boolean_to_test_result(final SubLObject v_boolean)
  {
    if( NIL != v_boolean )
    {
      return $kw134$SUCCESS;
    }
    return $kw139$FAILURE;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 32033L)
  public static SubLObject halt_reason_matches_specP(final SubLObject actual_halt_reason, final SubLObject expected_halt_reason)
  {
    return makeBoolean( NIL == expected_halt_reason || actual_halt_reason.equal( expected_halt_reason ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 32214L)
  public static SubLObject iut_result_test_passesP(final SubLObject result_test_func, final SubLObject actual_result, final SubLObject expected_result)
  {
    if( NIL == result_test_func )
    {
      return bindings.lists_of_binding_lists_equalP( actual_result, expected_result );
    }
    return Functions.funcall( result_test_func, actual_result, expected_result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 32482L)
  public static SubLObject print_inference_unit_test_preamble(final SubLObject name, final SubLObject verboseP, final SubLObject output_format, final SubLObject stream)
  {
    if( NIL != verboseP && $kw124$STANDARD == output_format )
    {
      PrintLow.format( stream, $str146$___IUT__S____, name );
      streams_high.force_output( stream );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 32735L)
  public static SubLObject print_inference_unit_test_postamble(final SubLObject result, final SubLObject name, final SubLObject test_time, final SubLObject verboseP, final SubLObject output_format,
      final SubLObject stream)
  {
    if( NIL != verboseP && $kw124$STANDARD == output_format )
    {
      PrintLow.format( stream, $str147$_S____3f___, result, test_time );
    }
    if( $kw148$POST_BUILD == output_format )
    {
      cyc_testing.print_post_build_test_summary( stream, result, $kw127$IUT, name, test_time, inference_unit_test_owner( find_inference_unit_test_by_name( name ) ) );
    }
    streams_high.force_output( stream );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 33236L)
  public static SubLObject print_inference_unit_test_failure(final SubLObject stream, final SubLObject verboseP, final SubLObject sentence_or_inference, final SubLObject v_properties, final SubLObject result_test_func,
      final SubLObject expected_result, final SubLObject actual_result, final SubLObject expected_halt_reason, final SubLObject actual_halt_reason)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != verboseP )
    {
      final SubLObject _prev_bind_0 = print_high.$print_pretty$.currentBinding( thread );
      try
      {
        print_high.$print_pretty$.bind( T, thread );
        PrintLow.format( stream, $str149$__Failure_when_asking );
        PrintLow.format( stream, $str150$_______S, sentence_or_inference );
        PrintLow.format( stream, $str151$____with_properties__s, v_properties );
        if( result_test_func.isFunctionSpec() )
        {
          PrintLow.format( stream, $str152$__Result_test____s, result_test_func );
        }
        PrintLow.format( stream, $str153$__Actual_result______s, actual_result );
        PrintLow.format( stream, $str154$__Expected_result____s, expected_result );
        PrintLow.format( stream, $str155$__Actual_halt_reason______s, actual_halt_reason );
        PrintLow.format( stream, $str156$__Expected_halt_reason____s, expected_halt_reason );
        PrintLow.format( stream, $str157$____ );
        streams_high.force_output( stream );
      }
      finally
      {
        print_high.$print_pretty$.rebind( _prev_bind_0, thread );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 34143L)
  public static SubLObject previous_query_inference()
  {
    final SubLObject store = inference_worker.currently_active_problem_store();
    final SubLObject inference = inference_datastructures_problem_store.find_inference_by_id( store, ZERO_INTEGER );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 34439L)
  public static SubLObject previous_query_root_problem_and_strategy()
  {
    final SubLObject inference = previous_query_inference();
    final SubLObject problem = inference_datastructures_inference.inference_root_problem( inference );
    final SubLObject strategy = inference_datastructures_inference.simplest_inference_strategy( inference );
    return Values.values( problem, strategy );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 34737L)
  public static SubLObject previous_query_root_problem()
  {
    return Values.nth_value_step_2( Values.nth_value_step_1( ZERO_INTEGER ), previous_query_root_problem_and_strategy() );
  }

  public static SubLObject declare_inference_unit_tests_file()
  {
    SubLFiles.declareFunction( me, "within_inference_unit_testP", "WITHIN-INFERENCE-UNIT-TEST?", 0, 0, false );
    SubLFiles.declareFunction( me, "note_assertion_for_inference_unit_test", "NOTE-ASSERTION-FOR-INFERENCE-UNIT-TEST", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_unit_test_cleanup", "INFERENCE-UNIT-TEST-CLEANUP", 0, 0, false );
    SubLFiles.declareFunction( me, "inference_unit_test_print_function_trampoline", "INFERENCE-UNIT-TEST-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_unit_test_p", "INFERENCE-UNIT-TEST-P", 1, 0, false );
    new $inference_unit_test_p$UnaryFunction();
    SubLFiles.declareFunction( me, "iut_name", "IUT-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "iut_comment", "IUT-COMMENT", 1, 0, false );
    SubLFiles.declareFunction( me, "iut_sentence", "IUT-SENTENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "iut_properties", "IUT-PROPERTIES", 1, 0, false );
    SubLFiles.declareFunction( me, "iut_result", "IUT-RESULT", 1, 0, false );
    SubLFiles.declareFunction( me, "iut_halt_reason", "IUT-HALT-REASON", 1, 0, false );
    SubLFiles.declareFunction( me, "iut_result_test", "IUT-RESULT-TEST", 1, 0, false );
    SubLFiles.declareFunction( me, "iut_followups", "IUT-FOLLOWUPS", 1, 0, false );
    SubLFiles.declareFunction( me, "iut_bindings", "IUT-BINDINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "iut_kb", "IUT-KB", 1, 0, false );
    SubLFiles.declareFunction( me, "iut_owner", "IUT-OWNER", 1, 0, false );
    SubLFiles.declareFunction( me, "iut_bug_number", "IUT-BUG-NUMBER", 1, 0, false );
    SubLFiles.declareFunction( me, "iut_creation_date", "IUT-CREATION-DATE", 1, 0, false );
    SubLFiles.declareFunction( me, "iut_creator", "IUT-CREATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "iut_workingP", "IUT-WORKING?", 1, 0, false );
    SubLFiles.declareFunction( me, "iut_subtype", "IUT-SUBTYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_iut_name", "_CSETF-IUT-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_iut_comment", "_CSETF-IUT-COMMENT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_iut_sentence", "_CSETF-IUT-SENTENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_iut_properties", "_CSETF-IUT-PROPERTIES", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_iut_result", "_CSETF-IUT-RESULT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_iut_halt_reason", "_CSETF-IUT-HALT-REASON", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_iut_result_test", "_CSETF-IUT-RESULT-TEST", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_iut_followups", "_CSETF-IUT-FOLLOWUPS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_iut_bindings", "_CSETF-IUT-BINDINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_iut_kb", "_CSETF-IUT-KB", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_iut_owner", "_CSETF-IUT-OWNER", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_iut_bug_number", "_CSETF-IUT-BUG-NUMBER", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_iut_creation_date", "_CSETF-IUT-CREATION-DATE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_iut_creator", "_CSETF-IUT-CREATOR", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_iut_workingP", "_CSETF-IUT-WORKING?", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_iut_subtype", "_CSETF-IUT-SUBTYPE", 2, 0, false );
    SubLFiles.declareFunction( me, "make_inference_unit_test", "MAKE-INFERENCE-UNIT-TEST", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_inference_unit_test", "VISIT-DEFSTRUCT-INFERENCE-UNIT-TEST", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_inference_unit_test_method", "VISIT-DEFSTRUCT-OBJECT-INFERENCE-UNIT-TEST-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_unit_test_name", "INFERENCE-UNIT-TEST-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_unit_test_comment", "INFERENCE-UNIT-TEST-COMMENT", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_unit_test_sentence", "INFERENCE-UNIT-TEST-SENTENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_unit_test_properties", "INFERENCE-UNIT-TEST-PROPERTIES", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_unit_test_expected_result", "INFERENCE-UNIT-TEST-EXPECTED-RESULT", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_unit_test_expected_halt_reason", "INFERENCE-UNIT-TEST-EXPECTED-HALT-REASON", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_unit_test_result_test", "INFERENCE-UNIT-TEST-RESULT-TEST", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_unit_test_followups", "INFERENCE-UNIT-TEST-FOLLOWUPS", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_unit_test_bindings", "INFERENCE-UNIT-TEST-BINDINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_unit_test_kb", "INFERENCE-UNIT-TEST-KB", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_unit_test_owner", "INFERENCE-UNIT-TEST-OWNER", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_unit_test_bug_number", "INFERENCE-UNIT-TEST-BUG-NUMBER", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_unit_test_creation_date", "INFERENCE-UNIT-TEST-CREATION-DATE", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_unit_test_creator", "INFERENCE-UNIT-TEST-CREATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_unit_test_workingP", "INFERENCE-UNIT-TEST-WORKING?", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_unit_test_subtype", "INFERENCE-UNIT-TEST-SUBTYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_unit_test_mentions_invalid_constantP", "INFERENCE-UNIT-TEST-MENTIONS-INVALID-CONSTANT?", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_unit_test_invalid_constants", "INFERENCE-UNIT-TEST-INVALID-CONSTANTS", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_unit_test_recipe", "INFERENCE-UNIT-TEST-RECIPE", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_unit_result_test_recipe", "INFERENCE-UNIT-RESULT-TEST-RECIPE", 1, 0, false );
    SubLFiles.declareFunction( me, "new_inference_unit_test_from_recipe", "NEW-INFERENCE-UNIT-TEST-FROM-RECIPE", 1, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_object_inference_unit_test_method", "CFASL-OUTPUT-OBJECT-INFERENCE-UNIT-TEST-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_inference_unit_test", "CFASL-OUTPUT-INFERENCE-UNIT-TEST", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_inference_unit_test_internal", "CFASL-OUTPUT-INFERENCE-UNIT-TEST-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_input_inference_unit_test", "CFASL-INPUT-INFERENCE-UNIT-TEST", 1, 0, false );
    SubLFiles.declareFunction( me, "test_inference_unit_test_serialization", "TEST-INFERENCE-UNIT-TEST-SERIALIZATION", 1, 0, false );
    SubLFiles.declareFunction( me, "find_inference_unit_test_by_name", "FIND-INFERENCE-UNIT-TEST-BY-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "store_inference_unit_test", "STORE-INFERENCE-UNIT-TEST", 1, 0, false );
    SubLFiles.declareMacro( me, "do_inference_unit_tests", "DO-INFERENCE-UNIT-TESTS" );
    SubLFiles.declareFunction( me, "all_inference_unit_test_names", "ALL-INFERENCE-UNIT-TEST-NAMES", 0, 0, false );
    SubLFiles.declareFunction( me, "inference_unit_test_followup_p", "INFERENCE-UNIT-TEST-FOLLOWUP-P", 1, 0, false );
    SubLFiles.declareMacro( me, "define_inference_unit_test", "DEFINE-INFERENCE-UNIT-TEST" );
    SubLFiles.declareFunction( me, "undefine_inference_unit_test", "UNDEFINE-INFERENCE-UNIT-TEST", 1, 0, false );
    SubLFiles.declareFunction( me, "undefine_all_inference_unit_tests", "UNDEFINE-ALL-INFERENCE-UNIT-TESTS", 0, 0, false );
    SubLFiles.declareFunction( me, "inference_unit_test_property_p", "INFERENCE-UNIT-TEST-PROPERTY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "validate_inference_unit_test_plist", "VALIDATE-INFERENCE-UNIT-TEST-PLIST", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_unit_test_followup_property_p", "INFERENCE-UNIT-TEST-FOLLOWUP-PROPERTY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "validate_inference_unit_test_followup_plist", "VALIDATE-INFERENCE-UNIT-TEST-FOLLOWUP-PLIST", 1, 0, false );
    SubLFiles.declareFunction( me, "define_inference_unit_test_internal", "DEFINE-INFERENCE-UNIT-TEST-INTERNAL", 16, 0, false );
    SubLFiles.declareFunction( me, "canonicalize_inference_unit_test_followups", "CANONICALIZE-INFERENCE-UNIT-TEST-FOLLOWUPS", 1, 0, false );
    SubLFiles.declareFunction( me, "run_all_inference_unit_tests", "RUN-ALL-INFERENCE-UNIT-TESTS", 0, 6, false );
    SubLFiles.declareFunction( me, "run_inference_unit_tests", "RUN-INFERENCE-UNIT-TESTS", 0, 7, false );
    SubLFiles.declareFunction( me, "run_inference_unit_test", "RUN-INFERENCE-UNIT-TEST", 1, 6, false );
    SubLFiles.declareFunction( me, "run_inference_unit_test_int", "RUN-INFERENCE-UNIT-TEST-INT", 7, 0, false );
    SubLFiles.declareFunction( me, "run_inference_unit_testP", "RUN-INFERENCE-UNIT-TEST?", 2, 0, false );
    SubLFiles.declareFunction( me, "run_inference_unit_test_followup_query", "RUN-INFERENCE-UNIT-TEST-FOLLOWUP-QUERY", 14, 0, false );
    SubLFiles.declareFunction( me, "followup_substitute_hypothetical_bindings", "FOLLOWUP-SUBSTITUTE-HYPOTHETICAL-BINDINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "run_inference_unit_test_query", "RUN-INFERENCE-UNIT-TEST-QUERY", 14, 0, false );
    SubLFiles.declareFunction( me, "pruning_inference_testP", "PRUNING-INFERENCE-TEST?", 1, 0, false );
    SubLFiles.declareFunction( me, "boolean_to_test_result", "BOOLEAN-TO-TEST-RESULT", 1, 0, false );
    SubLFiles.declareFunction( me, "halt_reason_matches_specP", "HALT-REASON-MATCHES-SPEC?", 2, 0, false );
    SubLFiles.declareFunction( me, "iut_result_test_passesP", "IUT-RESULT-TEST-PASSES?", 3, 0, false );
    SubLFiles.declareFunction( me, "print_inference_unit_test_preamble", "PRINT-INFERENCE-UNIT-TEST-PREAMBLE", 4, 0, false );
    SubLFiles.declareFunction( me, "print_inference_unit_test_postamble", "PRINT-INFERENCE-UNIT-TEST-POSTAMBLE", 6, 0, false );
    SubLFiles.declareFunction( me, "print_inference_unit_test_failure", "PRINT-INFERENCE-UNIT-TEST-FAILURE", 9, 0, false );
    SubLFiles.declareFunction( me, "previous_query_inference", "PREVIOUS-QUERY-INFERENCE", 0, 0, false );
    SubLFiles.declareFunction( me, "previous_query_root_problem_and_strategy", "PREVIOUS-QUERY-ROOT-PROBLEM-AND-STRATEGY", 0, 0, false );
    SubLFiles.declareFunction( me, "previous_query_root_problem", "PREVIOUS-QUERY-ROOT-PROBLEM", 0, 0, false );
    return NIL;
  }

  public static SubLObject init_inference_unit_tests_file()
  {
    $within_inference_unit_testP$ = SubLFiles.defparameter( "*WITHIN-INFERENCE-UNIT-TEST?*", NIL );
    $inference_unit_test_assertions_created$ = SubLFiles.defparameter( "*INFERENCE-UNIT-TEST-ASSERTIONS-CREATED*", $kw0$UNINITIALIZED );
    $dtp_inference_unit_test$ = SubLFiles.defconstant( "*DTP-INFERENCE-UNIT-TEST*", $sym1$INFERENCE_UNIT_TEST );
    $cfasl_wide_opcode_inference_unit_test$ = SubLFiles.defconstant( "*CFASL-WIDE-OPCODE-INFERENCE-UNIT-TEST*", $int67$513 );
    $inference_unit_test_names_in_order$ = SubLFiles.deflexical( "*INFERENCE-UNIT-TEST-NAMES-IN-ORDER*", ( NIL != Symbols.boundp( $sym71$_INFERENCE_UNIT_TEST_NAMES_IN_ORDER_ ) ) ? $inference_unit_test_names_in_order$
        .getGlobalValue() : NIL );
    $inference_unit_tests_by_name$ = SubLFiles.deflexical( "*INFERENCE-UNIT-TESTS-BY-NAME*", ( NIL != Symbols.boundp( $sym72$_INFERENCE_UNIT_TESTS_BY_NAME_ ) ) ? $inference_unit_tests_by_name$.getGlobalValue()
        : Hashtables.make_hash_table( $int73$212, Symbols.symbol_function( EQ ), UNPROVIDED ) );
    $inference_unit_test_properties$ = SubLFiles.deflexical( "*INFERENCE-UNIT-TEST-PROPERTIES*", $list99 );
    $inference_unit_test_followup_properties$ = SubLFiles.deflexical( "*INFERENCE-UNIT-TEST-FOLLOWUP-PROPERTIES*", $list103 );
    $test_followups_use_public_problem_storeP$ = SubLFiles.defparameter( "*TEST-FOLLOWUPS-USE-PUBLIC-PROBLEM-STORE?*", NIL );
    return NIL;
  }

  public static SubLObject setup_inference_unit_tests_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_inference_unit_test$.getGlobalValue(), Symbols.symbol_function( $sym8$INFERENCE_UNIT_TEST_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list9 );
    Structures.def_csetf( $sym10$IUT_NAME, $sym11$_CSETF_IUT_NAME );
    Structures.def_csetf( $sym12$IUT_COMMENT, $sym13$_CSETF_IUT_COMMENT );
    Structures.def_csetf( $sym14$IUT_SENTENCE, $sym15$_CSETF_IUT_SENTENCE );
    Structures.def_csetf( $sym16$IUT_PROPERTIES, $sym17$_CSETF_IUT_PROPERTIES );
    Structures.def_csetf( $sym18$IUT_RESULT, $sym19$_CSETF_IUT_RESULT );
    Structures.def_csetf( $sym20$IUT_HALT_REASON, $sym21$_CSETF_IUT_HALT_REASON );
    Structures.def_csetf( $sym22$IUT_RESULT_TEST, $sym23$_CSETF_IUT_RESULT_TEST );
    Structures.def_csetf( $sym24$IUT_FOLLOWUPS, $sym25$_CSETF_IUT_FOLLOWUPS );
    Structures.def_csetf( $sym26$IUT_BINDINGS, $sym27$_CSETF_IUT_BINDINGS );
    Structures.def_csetf( $sym28$IUT_KB, $sym29$_CSETF_IUT_KB );
    Structures.def_csetf( $sym30$IUT_OWNER, $sym31$_CSETF_IUT_OWNER );
    Structures.def_csetf( $sym32$IUT_BUG_NUMBER, $sym33$_CSETF_IUT_BUG_NUMBER );
    Structures.def_csetf( $sym34$IUT_CREATION_DATE, $sym35$_CSETF_IUT_CREATION_DATE );
    Structures.def_csetf( $sym36$IUT_CREATOR, $sym37$_CSETF_IUT_CREATOR );
    Structures.def_csetf( $sym38$IUT_WORKING_, $sym39$_CSETF_IUT_WORKING_ );
    Structures.def_csetf( $sym40$IUT_SUBTYPE, $sym41$_CSETF_IUT_SUBTYPE );
    Equality.identity( $sym1$INFERENCE_UNIT_TEST );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_inference_unit_test$.getGlobalValue(), Symbols.symbol_function(
        $sym63$VISIT_DEFSTRUCT_OBJECT_INFERENCE_UNIT_TEST_METHOD ) );
    cfasl.register_wide_cfasl_opcode_input_function( $cfasl_wide_opcode_inference_unit_test$.getGlobalValue(), $sym68$CFASL_INPUT_INFERENCE_UNIT_TEST );
    Structures.register_method( cfasl.$cfasl_output_object_method_table$.getGlobalValue(), $dtp_inference_unit_test$.getGlobalValue(), Symbols.symbol_function( $sym69$CFASL_OUTPUT_OBJECT_INFERENCE_UNIT_TEST_METHOD ) );
    subl_macro_promotions.declare_defglobal( $sym71$_INFERENCE_UNIT_TEST_NAMES_IN_ORDER_ );
    subl_macro_promotions.declare_defglobal( $sym72$_INFERENCE_UNIT_TESTS_BY_NAME_ );
    meta_macros.declare_indention_pattern( $sym97$DEFINE_INFERENCE_UNIT_TEST, $list98 );
    access_macros.register_macro_helper( $sym93$VALIDATE_INFERENCE_UNIT_TEST_PLIST, $sym97$DEFINE_INFERENCE_UNIT_TEST );
    access_macros.register_macro_helper( $sym104$VALIDATE_INFERENCE_UNIT_TEST_FOLLOWUP_PLIST, $sym97$DEFINE_INFERENCE_UNIT_TEST );
    access_macros.register_macro_helper( $sym95$DEFINE_INFERENCE_UNIT_TEST_INTERNAL, $sym97$DEFINE_INFERENCE_UNIT_TEST );
    access_macros.register_macro_helper( $sym96$CANONICALIZE_INFERENCE_UNIT_TEST_FOLLOWUPS, $sym97$DEFINE_INFERENCE_UNIT_TEST );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_inference_unit_tests_file();
  }

  @Override
  public void initializeVariables()
  {
    init_inference_unit_tests_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_inference_unit_tests_file();
  }
  static
  {
    me = new inference_unit_tests();
    $within_inference_unit_testP$ = null;
    $inference_unit_test_assertions_created$ = null;
    $dtp_inference_unit_test$ = null;
    $cfasl_wide_opcode_inference_unit_test$ = null;
    $inference_unit_test_names_in_order$ = null;
    $inference_unit_tests_by_name$ = null;
    $inference_unit_test_properties$ = null;
    $inference_unit_test_followup_properties$ = null;
    $test_followups_use_public_problem_storeP$ = null;
    $kw0$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $sym1$INFERENCE_UNIT_TEST = makeSymbol( "INFERENCE-UNIT-TEST" );
    $sym2$INFERENCE_UNIT_TEST_P = makeSymbol( "INFERENCE-UNIT-TEST-P" );
    $list3 = ConsesLow.list( new SubLObject[] { makeSymbol( "NAME" ), makeSymbol( "COMMENT" ), makeSymbol( "SENTENCE" ), makeSymbol( "PROPERTIES" ), makeSymbol( "RESULT" ), makeSymbol( "HALT-REASON" ), makeSymbol(
        "RESULT-TEST" ), makeSymbol( "FOLLOWUPS" ), makeSymbol( "BINDINGS" ), makeSymbol( "KB" ), makeSymbol( "OWNER" ), makeSymbol( "BUG-NUMBER" ), makeSymbol( "CREATION-DATE" ), makeSymbol( "CREATOR" ), makeSymbol(
            "WORKING?" ), makeSymbol( "SUBTYPE" )
    } );
    $list4 = ConsesLow.list( new SubLObject[] { makeKeyword( "NAME" ), makeKeyword( "COMMENT" ), makeKeyword( "SENTENCE" ), makeKeyword( "PROPERTIES" ), makeKeyword( "RESULT" ), makeKeyword( "HALT-REASON" ), makeKeyword(
        "RESULT-TEST" ), makeKeyword( "FOLLOWUPS" ), makeKeyword( "BINDINGS" ), makeKeyword( "KB" ), makeKeyword( "OWNER" ), makeKeyword( "BUG-NUMBER" ), makeKeyword( "CREATION-DATE" ), makeKeyword( "CREATOR" ),
      makeKeyword( "WORKING?" ), makeKeyword( "SUBTYPE" )
    } );
    $list5 = ConsesLow.list( new SubLObject[] { makeSymbol( "IUT-NAME" ), makeSymbol( "IUT-COMMENT" ), makeSymbol( "IUT-SENTENCE" ), makeSymbol( "IUT-PROPERTIES" ), makeSymbol( "IUT-RESULT" ), makeSymbol(
        "IUT-HALT-REASON" ), makeSymbol( "IUT-RESULT-TEST" ), makeSymbol( "IUT-FOLLOWUPS" ), makeSymbol( "IUT-BINDINGS" ), makeSymbol( "IUT-KB" ), makeSymbol( "IUT-OWNER" ), makeSymbol( "IUT-BUG-NUMBER" ), makeSymbol(
            "IUT-CREATION-DATE" ), makeSymbol( "IUT-CREATOR" ), makeSymbol( "IUT-WORKING?" ), makeSymbol( "IUT-SUBTYPE" )
    } );
    $list6 = ConsesLow.list( new SubLObject[] { makeSymbol( "_CSETF-IUT-NAME" ), makeSymbol( "_CSETF-IUT-COMMENT" ), makeSymbol( "_CSETF-IUT-SENTENCE" ), makeSymbol( "_CSETF-IUT-PROPERTIES" ), makeSymbol(
        "_CSETF-IUT-RESULT" ), makeSymbol( "_CSETF-IUT-HALT-REASON" ), makeSymbol( "_CSETF-IUT-RESULT-TEST" ), makeSymbol( "_CSETF-IUT-FOLLOWUPS" ), makeSymbol( "_CSETF-IUT-BINDINGS" ), makeSymbol( "_CSETF-IUT-KB" ),
      makeSymbol( "_CSETF-IUT-OWNER" ), makeSymbol( "_CSETF-IUT-BUG-NUMBER" ), makeSymbol( "_CSETF-IUT-CREATION-DATE" ), makeSymbol( "_CSETF-IUT-CREATOR" ), makeSymbol( "_CSETF-IUT-WORKING?" ), makeSymbol(
          "_CSETF-IUT-SUBTYPE" )
    } );
    $sym7$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol( "DEFAULT-STRUCT-PRINT-FUNCTION" );
    $sym8$INFERENCE_UNIT_TEST_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "INFERENCE-UNIT-TEST-PRINT-FUNCTION-TRAMPOLINE" );
    $list9 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "INFERENCE-UNIT-TEST-P" ) );
    $sym10$IUT_NAME = makeSymbol( "IUT-NAME" );
    $sym11$_CSETF_IUT_NAME = makeSymbol( "_CSETF-IUT-NAME" );
    $sym12$IUT_COMMENT = makeSymbol( "IUT-COMMENT" );
    $sym13$_CSETF_IUT_COMMENT = makeSymbol( "_CSETF-IUT-COMMENT" );
    $sym14$IUT_SENTENCE = makeSymbol( "IUT-SENTENCE" );
    $sym15$_CSETF_IUT_SENTENCE = makeSymbol( "_CSETF-IUT-SENTENCE" );
    $sym16$IUT_PROPERTIES = makeSymbol( "IUT-PROPERTIES" );
    $sym17$_CSETF_IUT_PROPERTIES = makeSymbol( "_CSETF-IUT-PROPERTIES" );
    $sym18$IUT_RESULT = makeSymbol( "IUT-RESULT" );
    $sym19$_CSETF_IUT_RESULT = makeSymbol( "_CSETF-IUT-RESULT" );
    $sym20$IUT_HALT_REASON = makeSymbol( "IUT-HALT-REASON" );
    $sym21$_CSETF_IUT_HALT_REASON = makeSymbol( "_CSETF-IUT-HALT-REASON" );
    $sym22$IUT_RESULT_TEST = makeSymbol( "IUT-RESULT-TEST" );
    $sym23$_CSETF_IUT_RESULT_TEST = makeSymbol( "_CSETF-IUT-RESULT-TEST" );
    $sym24$IUT_FOLLOWUPS = makeSymbol( "IUT-FOLLOWUPS" );
    $sym25$_CSETF_IUT_FOLLOWUPS = makeSymbol( "_CSETF-IUT-FOLLOWUPS" );
    $sym26$IUT_BINDINGS = makeSymbol( "IUT-BINDINGS" );
    $sym27$_CSETF_IUT_BINDINGS = makeSymbol( "_CSETF-IUT-BINDINGS" );
    $sym28$IUT_KB = makeSymbol( "IUT-KB" );
    $sym29$_CSETF_IUT_KB = makeSymbol( "_CSETF-IUT-KB" );
    $sym30$IUT_OWNER = makeSymbol( "IUT-OWNER" );
    $sym31$_CSETF_IUT_OWNER = makeSymbol( "_CSETF-IUT-OWNER" );
    $sym32$IUT_BUG_NUMBER = makeSymbol( "IUT-BUG-NUMBER" );
    $sym33$_CSETF_IUT_BUG_NUMBER = makeSymbol( "_CSETF-IUT-BUG-NUMBER" );
    $sym34$IUT_CREATION_DATE = makeSymbol( "IUT-CREATION-DATE" );
    $sym35$_CSETF_IUT_CREATION_DATE = makeSymbol( "_CSETF-IUT-CREATION-DATE" );
    $sym36$IUT_CREATOR = makeSymbol( "IUT-CREATOR" );
    $sym37$_CSETF_IUT_CREATOR = makeSymbol( "_CSETF-IUT-CREATOR" );
    $sym38$IUT_WORKING_ = makeSymbol( "IUT-WORKING?" );
    $sym39$_CSETF_IUT_WORKING_ = makeSymbol( "_CSETF-IUT-WORKING?" );
    $sym40$IUT_SUBTYPE = makeSymbol( "IUT-SUBTYPE" );
    $sym41$_CSETF_IUT_SUBTYPE = makeSymbol( "_CSETF-IUT-SUBTYPE" );
    $kw42$NAME = makeKeyword( "NAME" );
    $kw43$COMMENT = makeKeyword( "COMMENT" );
    $kw44$SENTENCE = makeKeyword( "SENTENCE" );
    $kw45$PROPERTIES = makeKeyword( "PROPERTIES" );
    $kw46$RESULT = makeKeyword( "RESULT" );
    $kw47$HALT_REASON = makeKeyword( "HALT-REASON" );
    $kw48$RESULT_TEST = makeKeyword( "RESULT-TEST" );
    $kw49$FOLLOWUPS = makeKeyword( "FOLLOWUPS" );
    $kw50$BINDINGS = makeKeyword( "BINDINGS" );
    $kw51$KB = makeKeyword( "KB" );
    $kw52$OWNER = makeKeyword( "OWNER" );
    $kw53$BUG_NUMBER = makeKeyword( "BUG-NUMBER" );
    $kw54$CREATION_DATE = makeKeyword( "CREATION-DATE" );
    $kw55$CREATOR = makeKeyword( "CREATOR" );
    $kw56$WORKING_ = makeKeyword( "WORKING?" );
    $kw57$SUBTYPE = makeKeyword( "SUBTYPE" );
    $str58$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw59$BEGIN = makeKeyword( "BEGIN" );
    $sym60$MAKE_INFERENCE_UNIT_TEST = makeSymbol( "MAKE-INFERENCE-UNIT-TEST" );
    $kw61$SLOT = makeKeyword( "SLOT" );
    $kw62$END = makeKeyword( "END" );
    $sym63$VISIT_DEFSTRUCT_OBJECT_INFERENCE_UNIT_TEST_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-INFERENCE-UNIT-TEST-METHOD" );
    $sym64$INVALID_CONSTANT_ = makeSymbol( "INVALID-CONSTANT?" );
    $str65$Cannot_build_inference_test_recip = makeString( "Cannot build inference test recipe; symbolic form of result test function ~A unknown." );
    $kw66$EXPECTED_RESULT = makeKeyword( "EXPECTED-RESULT" );
    $int67$513 = makeInteger( 513 );
    $sym68$CFASL_INPUT_INFERENCE_UNIT_TEST = makeSymbol( "CFASL-INPUT-INFERENCE-UNIT-TEST" );
    $sym69$CFASL_OUTPUT_OBJECT_INFERENCE_UNIT_TEST_METHOD = makeSymbol( "CFASL-OUTPUT-OBJECT-INFERENCE-UNIT-TEST-METHOD" );
    $str70$Deserialization_produced__A_inste = makeString( "Deserialization produced ~A instead of ~A for IUT ~A." );
    $sym71$_INFERENCE_UNIT_TEST_NAMES_IN_ORDER_ = makeSymbol( "*INFERENCE-UNIT-TEST-NAMES-IN-ORDER*" );
    $sym72$_INFERENCE_UNIT_TESTS_BY_NAME_ = makeSymbol( "*INFERENCE-UNIT-TESTS-BY-NAME*" );
    $int73$212 = makeInteger( 212 );
    $list74 = ConsesLow.list( ConsesLow.list( makeSymbol( "TEST-VAR" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list75 = ConsesLow.list( makeKeyword( "DONE" ) );
    $kw76$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw77$DONE = makeKeyword( "DONE" );
    $sym78$NAME = makeUninternedSymbol( "NAME" );
    $sym79$DO_LIST = makeSymbol( "DO-LIST" );
    $sym80$CLET = makeSymbol( "CLET" );
    $sym81$FIND_INFERENCE_UNIT_TEST_BY_NAME = makeSymbol( "FIND-INFERENCE-UNIT-TEST-BY-NAME" );
    $list82 = ConsesLow.list( makeSymbol( "SENTENCE" ), makeSymbol( "PROPERTIES" ), makeSymbol( "EXPECTED-RESULT" ), makeSymbol( "EXPECTED-RESULT-TEST" ), makeSymbol( "EXPECTED-HALT-REASON" ) );
    $kw83$CONTINUE = makeKeyword( "CONTINUE" );
    $kw84$PREVIOUS = makeKeyword( "PREVIOUS" );
    $list85 = ConsesLow.list( new SubLObject[] { makeSymbol( "NAME" ), makeSymbol( "&REST" ), makeSymbol( "PLIST" ), makeSymbol( "&KEY" ), makeSymbol( "SENTENCE" ), makeSymbol( "PROPERTIES" ), makeSymbol(
        "EXPECTED-RESULT" ), ConsesLow.list( makeSymbol( "EXPECTED-HALT-REASON" ), makeKeyword( "EXHAUST-TOTAL" ) ), makeSymbol( "EXPECTED-RESULT-TEST" ), makeSymbol( "COMMENT" ), makeSymbol( "FOLLOWUPS" ), makeSymbol(
            "BINDINGS" ), ConsesLow.list( makeSymbol( "KB" ), makeKeyword( "TINY" ) ), makeSymbol( "OWNER" ), makeSymbol( "BUG" ), makeSymbol( "CREATED" ), makeSymbol( "CREATOR" ), ConsesLow.list( makeSymbol(
                "WORKING?" ), T ), makeSymbol( "SUBTYPE" ), makeSymbol( "&ALLOW-OTHER-KEYS" )
    } );
    $kw86$EXPECTED_HALT_REASON = makeKeyword( "EXPECTED-HALT-REASON" );
    $kw87$EXHAUST_TOTAL = makeKeyword( "EXHAUST-TOTAL" );
    $kw88$EXPECTED_RESULT_TEST = makeKeyword( "EXPECTED-RESULT-TEST" );
    $kw89$TINY = makeKeyword( "TINY" );
    $kw90$BUG = makeKeyword( "BUG" );
    $kw91$CREATED = makeKeyword( "CREATED" );
    $sym92$PROGN = makeSymbol( "PROGN" );
    $sym93$VALIDATE_INFERENCE_UNIT_TEST_PLIST = makeSymbol( "VALIDATE-INFERENCE-UNIT-TEST-PLIST" );
    $sym94$QUOTE = makeSymbol( "QUOTE" );
    $sym95$DEFINE_INFERENCE_UNIT_TEST_INTERNAL = makeSymbol( "DEFINE-INFERENCE-UNIT-TEST-INTERNAL" );
    $sym96$CANONICALIZE_INFERENCE_UNIT_TEST_FOLLOWUPS = makeSymbol( "CANONICALIZE-INFERENCE-UNIT-TEST-FOLLOWUPS" );
    $sym97$DEFINE_INFERENCE_UNIT_TEST = makeSymbol( "DEFINE-INFERENCE-UNIT-TEST" );
    $list98 = ConsesLow.list( makeSymbol( "NAME" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list99 = ConsesLow.list( new SubLObject[] { makeKeyword( "NAME" ), makeKeyword( "COMMENT" ), makeKeyword( "SENTENCE" ), makeKeyword( "PROPERTIES" ), makeKeyword( "EXPECTED-RESULT" ), makeKeyword(
        "EXPECTED-HALT-REASON" ), makeKeyword( "EXPECTED-RESULT-TEST" ), makeKeyword( "FOLLOWUPS" ), makeKeyword( "BINDINGS" ), makeKeyword( "KB" ), makeKeyword( "OWNER" ), makeKeyword( "BUG" ), makeKeyword( "JIRA" ),
      makeKeyword( "CREATION" ), makeKeyword( "CREATOR" ), makeKeyword( "WORKING?" ), makeKeyword( "SUBTYPE" )
    } );
    $sym100$PROPERTY_LIST_P = makeSymbol( "PROPERTY-LIST-P" );
    $str101$_s_is_not_a_known__a = makeString( "~s is not a known ~a" );
    $sym102$INFERENCE_UNIT_TEST_PROPERTY_P = makeSymbol( "INFERENCE-UNIT-TEST-PROPERTY-P" );
    $list103 = ConsesLow.list( makeKeyword( "SENTENCE" ), makeKeyword( "PROPERTIES" ), makeKeyword( "EXPECTED-RESULT" ), makeKeyword( "EXPECTED-HALT-REASON" ), makeKeyword( "EXPECTED-RESULT-TEST" ) );
    $sym104$VALIDATE_INFERENCE_UNIT_TEST_FOLLOWUP_PLIST = makeSymbol( "VALIDATE-INFERENCE-UNIT-TEST-FOLLOWUP-PLIST" );
    $sym105$INFERENCE_UNIT_TEST_FOLLOWUP_PROPERTY_P = makeSymbol( "INFERENCE-UNIT-TEST-FOLLOWUP-PROPERTY-P" );
    $sym106$KEYWORDP = makeSymbol( "KEYWORDP" );
    $sym107$POSSIBLY_SENTENCE_P = makeSymbol( "POSSIBLY-SENTENCE-P" );
    $sym108$QUERY_PROPERTY_P = makeSymbol( "QUERY-PROPERTY-P" );
    $sym109$BINDING_LISTS_P = makeSymbol( "BINDING-LISTS-P" );
    $sym110$QUERY_HALT_REASON_P = makeSymbol( "QUERY-HALT-REASON-P" );
    $sym111$FUNCTION_SYMBOL_P = makeSymbol( "FUNCTION-SYMBOL-P" );
    $sym112$INFERENCE_TEST_COMMENT_P = makeSymbol( "INFERENCE-TEST-COMMENT-P" );
    $sym113$NON_DOTTED_LIST_P = makeSymbol( "NON-DOTTED-LIST-P" );
    $sym114$INFERENCE_UNIT_TEST_FOLLOWUP_P = makeSymbol( "INFERENCE-UNIT-TEST-FOLLOWUP-P" );
    $sym115$SUBL_VARIABLE_BINDING_LIST_P = makeSymbol( "SUBL-VARIABLE-BINDING-LIST-P" );
    $sym116$CYC_TEST_KB_P = makeSymbol( "CYC-TEST-KB-P" );
    $sym117$INFERENCE_TEST_OWNER_P = makeSymbol( "INFERENCE-TEST-OWNER-P" );
    $sym118$POSITIVE_INTEGER_P = makeSymbol( "POSITIVE-INTEGER-P" );
    $sym119$UNIVERSAL_DATE_P = makeSymbol( "UNIVERSAL-DATE-P" );
    $sym120$STRINGP = makeSymbol( "STRINGP" );
    $sym121$BOOLEANP = makeSymbol( "BOOLEANP" );
    $kw122$CONDITIONAL_SENTENCE_ = makeKeyword( "CONDITIONAL-SENTENCE?" );
    $str123$The_test__S_is_not_queried_with__ = makeString( "The test ~S is not queried with :conditional-sentence? T." );
    $kw124$STANDARD = makeKeyword( "STANDARD" );
    $kw125$VERBOSE = makeKeyword( "VERBOSE" );
    $kw126$TERSE = makeKeyword( "TERSE" );
    $kw127$IUT = makeKeyword( "IUT" );
    $sym128$CYC_TEST_OUTPUT_FORMAT_P = makeSymbol( "CYC-TEST-OUTPUT-FORMAT-P" );
    $sym129$CYC_TEST_P = makeSymbol( "CYC-TEST-P" );
    $sym130$FIND_CYC_TEST = makeSymbol( "FIND-CYC-TEST" );
    $str131$No_test_with_name__a_was_found = makeString( "No test with name ~a was found" );
    $kw132$NOT_RUN = makeKeyword( "NOT-RUN" );
    $kw133$INVALID = makeKeyword( "INVALID" );
    $kw134$SUCCESS = makeKeyword( "SUCCESS" );
    $sym135$EL_SENTENCE_P = makeSymbol( "EL-SENTENCE-P" );
    $kw136$UNPROVIDED = makeKeyword( "UNPROVIDED" );
    $kw137$PROBLEM_STORE = makeKeyword( "PROBLEM-STORE" );
    $str138$Previous_inference_was_not_browsa = makeString( "Previous inference was not browsable" );
    $kw139$FAILURE = makeKeyword( "FAILURE" );
    $kw140$SKIP = makeKeyword( "SKIP" );
    $kw141$BLOCK_ = makeKeyword( "BLOCK?" );
    $list142 = ConsesLow.list( makeKeyword( "PROBABLY-APPROXIMATELY-DONE" ), ONE_INTEGER, makeKeyword( "MAX-TIME" ), NIL );
    $kw143$BROWSABLE_ = makeKeyword( "BROWSABLE?" );
    $kw144$BINDINGS_AND_HYPOTHETICAL_BINDINGS = makeKeyword( "BINDINGS-AND-HYPOTHETICAL-BINDINGS" );
    $kw145$PRUNING = makeKeyword( "PRUNING" );
    $str146$___IUT__S____ = makeString( "~&:IUT ~S -> " );
    $str147$_S____3f___ = makeString( "~S (~,3f)~%" );
    $kw148$POST_BUILD = makeKeyword( "POST-BUILD" );
    $str149$__Failure_when_asking = makeString( "~%Failure when asking" );
    $str150$_______S = makeString( "~%~%  ~S" );
    $str151$____with_properties__s = makeString( "~%~%with properties ~s" );
    $str152$__Result_test____s = makeString( "~%Result test : ~s" );
    $str153$__Actual_result______s = makeString( "~%Actual result   : ~s" );
    $str154$__Expected_result____s = makeString( "~%Expected result : ~s" );
    $str155$__Actual_halt_reason______s = makeString( "~%Actual halt reason   : ~s" );
    $str156$__Expected_halt_reason____s = makeString( "~%Expected halt reason : ~s" );
    $str157$____ = makeString( "~%~%" );
  }

  public static final class $inference_unit_test_native
      extends
        SubLStructNative
  {
    public SubLObject $name;
    public SubLObject $comment;
    public SubLObject $sentence;
    public SubLObject $properties;
    public SubLObject $result;
    public SubLObject $halt_reason;
    public SubLObject $result_test;
    public SubLObject $followups;
    public SubLObject $bindings;
    public SubLObject $kb;
    public SubLObject $owner;
    public SubLObject $bug_number;
    public SubLObject $creation_date;
    public SubLObject $creator;
    public SubLObject $workingP;
    public SubLObject $subtype;
    private static final SubLStructDeclNative structDecl;

    public $inference_unit_test_native()
    {
      this.$name = CommonSymbols.NIL;
      this.$comment = CommonSymbols.NIL;
      this.$sentence = CommonSymbols.NIL;
      this.$properties = CommonSymbols.NIL;
      this.$result = CommonSymbols.NIL;
      this.$halt_reason = CommonSymbols.NIL;
      this.$result_test = CommonSymbols.NIL;
      this.$followups = CommonSymbols.NIL;
      this.$bindings = CommonSymbols.NIL;
      this.$kb = CommonSymbols.NIL;
      this.$owner = CommonSymbols.NIL;
      this.$bug_number = CommonSymbols.NIL;
      this.$creation_date = CommonSymbols.NIL;
      this.$creator = CommonSymbols.NIL;
      this.$workingP = CommonSymbols.NIL;
      this.$subtype = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $inference_unit_test_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$name;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$comment;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$sentence;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$properties;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$result;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$halt_reason;
    }

    @Override
    public SubLObject getField8()
    {
      return this.$result_test;
    }

    @Override
    public SubLObject getField9()
    {
      return this.$followups;
    }

    @Override
    public SubLObject getField10()
    {
      return this.$bindings;
    }

    @Override
    public SubLObject getField11()
    {
      return this.$kb;
    }

    @Override
    public SubLObject getField12()
    {
      return this.$owner;
    }

    @Override
    public SubLObject getField13()
    {
      return this.$bug_number;
    }

    @Override
    public SubLObject getField14()
    {
      return this.$creation_date;
    }

    @Override
    public SubLObject getField15()
    {
      return this.$creator;
    }

    @Override
    public SubLObject getField16()
    {
      return this.$workingP;
    }

    @Override
    public SubLObject getField17()
    {
      return this.$subtype;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$name = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$comment = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$sentence = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$properties = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$result = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$halt_reason = value;
    }

    @Override
    public SubLObject setField8(final SubLObject value)
    {
      return this.$result_test = value;
    }

    @Override
    public SubLObject setField9(final SubLObject value)
    {
      return this.$followups = value;
    }

    @Override
    public SubLObject setField10(final SubLObject value)
    {
      return this.$bindings = value;
    }

    @Override
    public SubLObject setField11(final SubLObject value)
    {
      return this.$kb = value;
    }

    @Override
    public SubLObject setField12(final SubLObject value)
    {
      return this.$owner = value;
    }

    @Override
    public SubLObject setField13(final SubLObject value)
    {
      return this.$bug_number = value;
    }

    @Override
    public SubLObject setField14(final SubLObject value)
    {
      return this.$creation_date = value;
    }

    @Override
    public SubLObject setField15(final SubLObject value)
    {
      return this.$creator = value;
    }

    @Override
    public SubLObject setField16(final SubLObject value)
    {
      return this.$workingP = value;
    }

    @Override
    public SubLObject setField17(final SubLObject value)
    {
      return this.$subtype = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $inference_unit_test_native.class, $sym1$INFERENCE_UNIT_TEST, $sym2$INFERENCE_UNIT_TEST_P, $list3, $list4, new String[] { "$name", "$comment", "$sentence",
        "$properties", "$result", "$halt_reason", "$result_test", "$followups", "$bindings", "$kb", "$owner", "$bug_number", "$creation_date", "$creator", "$workingP", "$subtype"
      }, $list5, $list6, $sym7$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $inference_unit_test_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $inference_unit_test_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "INFERENCE-UNIT-TEST-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return inference_unit_test_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 582 ms synthetic
 */
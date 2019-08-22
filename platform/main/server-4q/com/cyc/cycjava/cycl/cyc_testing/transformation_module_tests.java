package com.cyc.cycjava.cycl.cyc_testing;


import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_internal_real_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.hash_table_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_strategist;
import com.cyc.cycjava.cycl.inference.harness.inference_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;
 public final class transformation_module_tests extends SubLTranslatedFile {
    public static final SubLFile me = new transformation_module_tests();

    public static final String myName = "com.cyc.cycjava.cycl.cyc_testing.transformation_module_tests";

    public static final String myFingerPrint = "3a2e03dc6955a4ee6bd0c62e9411f2f8c8db91d34fc40ca3d5b2575c132d4bc3";

    // defconstant
    public static final SubLSymbol $dtp_transformation_module_test$ = makeSymbol("*DTP-TRANSFORMATION-MODULE-TEST*");



    // Internal Constants
    public static final SubLSymbol TRANSFORMATION_MODULE_TEST = makeSymbol("TRANSFORMATION-MODULE-TEST");

    public static final SubLSymbol TRANSFORMATION_MODULE_TEST_P = makeSymbol("TRANSFORMATION-MODULE-TEST-P");

    public static final SubLList $list2 = list(new SubLObject[]{ makeSymbol("HL-MODULE"), makeSymbol("ID"), makeSymbol("SENTENCE"), makeSymbol("MT"), makeSymbol("PROPERTIES"), makeSymbol("COMMENT"), makeSymbol("KB"), makeSymbol("OWNER"), makeSymbol("BUG-NUMBER"), makeSymbol("CREATION-DATE"), makeSymbol("CREATOR"), makeSymbol("WORKING?") });

    public static final SubLList $list3 = list(new SubLObject[]{ makeKeyword("HL-MODULE"), makeKeyword("ID"), makeKeyword("SENTENCE"), makeKeyword("MT"), makeKeyword("PROPERTIES"), makeKeyword("COMMENT"), makeKeyword("KB"), makeKeyword("OWNER"), makeKeyword("BUG-NUMBER"), makeKeyword("CREATION-DATE"), makeKeyword("CREATOR"), makeKeyword("WORKING?") });

    public static final SubLList $list4 = list(new SubLObject[]{ makeSymbol("TMT-HL-MODULE"), makeSymbol("TMT-ID"), makeSymbol("TMT-SENTENCE"), makeSymbol("TMT-MT"), makeSymbol("TMT-PROPERTIES"), makeSymbol("TMT-COMMENT"), makeSymbol("TMT-KB"), makeSymbol("TMT-OWNER"), makeSymbol("TMT-BUG-NUMBER"), makeSymbol("TMT-CREATION-DATE"), makeSymbol("TMT-CREATOR"), makeSymbol("TMT-WORKING?") });

    public static final SubLList $list5 = list(new SubLObject[]{ makeSymbol("_CSETF-TMT-HL-MODULE"), makeSymbol("_CSETF-TMT-ID"), makeSymbol("_CSETF-TMT-SENTENCE"), makeSymbol("_CSETF-TMT-MT"), makeSymbol("_CSETF-TMT-PROPERTIES"), makeSymbol("_CSETF-TMT-COMMENT"), makeSymbol("_CSETF-TMT-KB"), makeSymbol("_CSETF-TMT-OWNER"), makeSymbol("_CSETF-TMT-BUG-NUMBER"), makeSymbol("_CSETF-TMT-CREATION-DATE"), makeSymbol("_CSETF-TMT-CREATOR"), makeSymbol("_CSETF-TMT-WORKING?") });



    public static final SubLSymbol TRANSFORMATION_MODULE_TEST_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("TRANSFORMATION-MODULE-TEST-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("TRANSFORMATION-MODULE-TEST-P"));

    private static final SubLSymbol TMT_HL_MODULE = makeSymbol("TMT-HL-MODULE");

    private static final SubLSymbol _CSETF_TMT_HL_MODULE = makeSymbol("_CSETF-TMT-HL-MODULE");

    private static final SubLSymbol TMT_ID = makeSymbol("TMT-ID");

    private static final SubLSymbol _CSETF_TMT_ID = makeSymbol("_CSETF-TMT-ID");

    private static final SubLSymbol TMT_SENTENCE = makeSymbol("TMT-SENTENCE");

    private static final SubLSymbol _CSETF_TMT_SENTENCE = makeSymbol("_CSETF-TMT-SENTENCE");

    private static final SubLSymbol TMT_MT = makeSymbol("TMT-MT");

    private static final SubLSymbol _CSETF_TMT_MT = makeSymbol("_CSETF-TMT-MT");

    private static final SubLSymbol TMT_PROPERTIES = makeSymbol("TMT-PROPERTIES");

    private static final SubLSymbol _CSETF_TMT_PROPERTIES = makeSymbol("_CSETF-TMT-PROPERTIES");

    private static final SubLSymbol TMT_COMMENT = makeSymbol("TMT-COMMENT");

    private static final SubLSymbol _CSETF_TMT_COMMENT = makeSymbol("_CSETF-TMT-COMMENT");

    private static final SubLSymbol TMT_KB = makeSymbol("TMT-KB");

    private static final SubLSymbol _CSETF_TMT_KB = makeSymbol("_CSETF-TMT-KB");

    private static final SubLSymbol TMT_OWNER = makeSymbol("TMT-OWNER");

    private static final SubLSymbol _CSETF_TMT_OWNER = makeSymbol("_CSETF-TMT-OWNER");

    private static final SubLSymbol TMT_BUG_NUMBER = makeSymbol("TMT-BUG-NUMBER");

    private static final SubLSymbol _CSETF_TMT_BUG_NUMBER = makeSymbol("_CSETF-TMT-BUG-NUMBER");

    private static final SubLSymbol TMT_CREATION_DATE = makeSymbol("TMT-CREATION-DATE");

    private static final SubLSymbol _CSETF_TMT_CREATION_DATE = makeSymbol("_CSETF-TMT-CREATION-DATE");

    private static final SubLSymbol TMT_CREATOR = makeSymbol("TMT-CREATOR");

    private static final SubLSymbol _CSETF_TMT_CREATOR = makeSymbol("_CSETF-TMT-CREATOR");

    private static final SubLSymbol $sym31$TMT_WORKING_ = makeSymbol("TMT-WORKING?");

    private static final SubLSymbol $sym32$_CSETF_TMT_WORKING_ = makeSymbol("_CSETF-TMT-WORKING?");

























    private static final SubLString $str45$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_TRANSFORMATION_MODULE_TEST = makeSymbol("MAKE-TRANSFORMATION-MODULE-TEST");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_TRANSFORMATION_MODULE_TEST_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-TRANSFORMATION-MODULE-TEST-METHOD");

    private static final SubLSymbol $transformation_module_tests$ = makeSymbol("*TRANSFORMATION-MODULE-TESTS*");



    private static final SubLSymbol $sym53$TERM__ = makeSymbol("TERM-<");

    private static final SubLSymbol HL_MODULE_NAME = makeSymbol("HL-MODULE-NAME");

    private static final SubLSymbol $sym55$_ = makeSymbol("<");

    private static final SubLSymbol $sym56$INVALID_CONSTANT_ = makeSymbol("INVALID-CONSTANT?");

    private static final SubLList $list57 = list(new SubLObject[]{ makeSymbol("NAME"), makeSymbol("ID"), makeSymbol("SENTENCE"), makeSymbol("&KEY"), list(makeSymbol("MT"), reader_make_constant_shell(makeString("EverythingPSC"))), makeSymbol("PROPERTIES"), list(makeSymbol("KB"), makeKeyword("TINY")), makeSymbol("OWNER"), makeSymbol("COMMENT"), makeSymbol("BUG"), makeSymbol("CREATED"), makeSymbol("CREATOR"), list(makeSymbol("WORKING?"), T) });

    private static final SubLList $list58 = list(new SubLObject[]{ makeKeyword("MT"), makeKeyword("PROPERTIES"), makeKeyword("KB"), makeKeyword("OWNER"), makeKeyword("COMMENT"), makeKeyword("BUG"), makeKeyword("CREATED"), makeKeyword("CREATOR"), makeKeyword("WORKING?") });

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));







    private static final SubLSymbol DEFINE_TRANSFORMATION_MODULE_TEST_INT = makeSymbol("DEFINE-TRANSFORMATION-MODULE-TEST-INT");

    private static final SubLSymbol DEFINE_TRANSFORMATION_MODULE_TEST = makeSymbol("DEFINE-TRANSFORMATION-MODULE-TEST");





    private static final SubLSymbol INFERENCE_TEST_OWNER_P = makeSymbol("INFERENCE-TEST-OWNER-P");









    private static final SubLSymbol CYC_TEST_OUTPUT_FORMAT_P = makeSymbol("CYC-TEST-OUTPUT-FORMAT-P");













    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");



    private static final SubLSymbol $kw83$CONDITIONAL_SENTENCE_ = makeKeyword("CONDITIONAL-SENTENCE?");



    private static final SubLSymbol $MAX_TRANSFORMATION_DEPTH = makeKeyword("MAX-TRANSFORMATION-DEPTH");

    private static final SubLSymbol $kw86$CACHE_INFERENCE_RESULTS_ = makeKeyword("CACHE-INFERENCE-RESULTS?");



    private static final SubLList $list88 = list(makeKeyword("PROBABLY-APPROXIMATELY-DONE"), ONE_INTEGER, makeKeyword("MAX-TIME"), NIL);

    private static final SubLString $str89$___TMT__S__S____ = makeString("~&:TMT ~S ~S -> ");



    private static final SubLString $str91$Unknown_output_format__A = makeString("Unknown output format ~A");

    private static final SubLString $str92$_S____3f___ = makeString("~S (~,3f)~%");

    public static SubLObject transformation_module_test_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject transformation_module_test_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$transformation_module_test_native.class ? T : NIL;
    }

    public static SubLObject tmt_hl_module(final SubLObject v_object) {
        assert NIL != transformation_module_test_p(v_object) : "transformation_module_tests.transformation_module_test_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject tmt_id(final SubLObject v_object) {
        assert NIL != transformation_module_test_p(v_object) : "transformation_module_tests.transformation_module_test_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject tmt_sentence(final SubLObject v_object) {
        assert NIL != transformation_module_test_p(v_object) : "transformation_module_tests.transformation_module_test_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject tmt_mt(final SubLObject v_object) {
        assert NIL != transformation_module_test_p(v_object) : "transformation_module_tests.transformation_module_test_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject tmt_properties(final SubLObject v_object) {
        assert NIL != transformation_module_test_p(v_object) : "transformation_module_tests.transformation_module_test_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject tmt_comment(final SubLObject v_object) {
        assert NIL != transformation_module_test_p(v_object) : "transformation_module_tests.transformation_module_test_p error :" + v_object;
        return v_object.getField7();
    }

    public static SubLObject tmt_kb(final SubLObject v_object) {
        assert NIL != transformation_module_test_p(v_object) : "transformation_module_tests.transformation_module_test_p error :" + v_object;
        return v_object.getField8();
    }

    public static SubLObject tmt_owner(final SubLObject v_object) {
        assert NIL != transformation_module_test_p(v_object) : "transformation_module_tests.transformation_module_test_p error :" + v_object;
        return v_object.getField9();
    }

    public static SubLObject tmt_bug_number(final SubLObject v_object) {
        assert NIL != transformation_module_test_p(v_object) : "transformation_module_tests.transformation_module_test_p error :" + v_object;
        return v_object.getField10();
    }

    public static SubLObject tmt_creation_date(final SubLObject v_object) {
        assert NIL != transformation_module_test_p(v_object) : "transformation_module_tests.transformation_module_test_p error :" + v_object;
        return v_object.getField11();
    }

    public static SubLObject tmt_creator(final SubLObject v_object) {
        assert NIL != transformation_module_test_p(v_object) : "transformation_module_tests.transformation_module_test_p error :" + v_object;
        return v_object.getField12();
    }

    public static SubLObject tmt_workingP(final SubLObject v_object) {
        assert NIL != transformation_module_test_p(v_object) : "transformation_module_tests.transformation_module_test_p error :" + v_object;
        return v_object.getField13();
    }

    public static SubLObject _csetf_tmt_hl_module(final SubLObject v_object, final SubLObject value) {
        assert NIL != transformation_module_test_p(v_object) : "transformation_module_tests.transformation_module_test_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_tmt_id(final SubLObject v_object, final SubLObject value) {
        assert NIL != transformation_module_test_p(v_object) : "transformation_module_tests.transformation_module_test_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_tmt_sentence(final SubLObject v_object, final SubLObject value) {
        assert NIL != transformation_module_test_p(v_object) : "transformation_module_tests.transformation_module_test_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_tmt_mt(final SubLObject v_object, final SubLObject value) {
        assert NIL != transformation_module_test_p(v_object) : "transformation_module_tests.transformation_module_test_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_tmt_properties(final SubLObject v_object, final SubLObject value) {
        assert NIL != transformation_module_test_p(v_object) : "transformation_module_tests.transformation_module_test_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_tmt_comment(final SubLObject v_object, final SubLObject value) {
        assert NIL != transformation_module_test_p(v_object) : "transformation_module_tests.transformation_module_test_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_tmt_kb(final SubLObject v_object, final SubLObject value) {
        assert NIL != transformation_module_test_p(v_object) : "transformation_module_tests.transformation_module_test_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_tmt_owner(final SubLObject v_object, final SubLObject value) {
        assert NIL != transformation_module_test_p(v_object) : "transformation_module_tests.transformation_module_test_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_tmt_bug_number(final SubLObject v_object, final SubLObject value) {
        assert NIL != transformation_module_test_p(v_object) : "transformation_module_tests.transformation_module_test_p error :" + v_object;
        return v_object.setField10(value);
    }

    public static SubLObject _csetf_tmt_creation_date(final SubLObject v_object, final SubLObject value) {
        assert NIL != transformation_module_test_p(v_object) : "transformation_module_tests.transformation_module_test_p error :" + v_object;
        return v_object.setField11(value);
    }

    public static SubLObject _csetf_tmt_creator(final SubLObject v_object, final SubLObject value) {
        assert NIL != transformation_module_test_p(v_object) : "transformation_module_tests.transformation_module_test_p error :" + v_object;
        return v_object.setField12(value);
    }

    public static SubLObject _csetf_tmt_workingP(final SubLObject v_object, final SubLObject value) {
        assert NIL != transformation_module_test_p(v_object) : "transformation_module_tests.transformation_module_test_p error :" + v_object;
        return v_object.setField13(value);
    }

    public static SubLObject make_transformation_module_test(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $transformation_module_test_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($HL_MODULE)) {
                _csetf_tmt_hl_module(v_new, current_value);
            } else
                if (pcase_var.eql($ID)) {
                    _csetf_tmt_id(v_new, current_value);
                } else
                    if (pcase_var.eql($SENTENCE)) {
                        _csetf_tmt_sentence(v_new, current_value);
                    } else
                        if (pcase_var.eql($MT)) {
                            _csetf_tmt_mt(v_new, current_value);
                        } else
                            if (pcase_var.eql($PROPERTIES)) {
                                _csetf_tmt_properties(v_new, current_value);
                            } else
                                if (pcase_var.eql($COMMENT)) {
                                    _csetf_tmt_comment(v_new, current_value);
                                } else
                                    if (pcase_var.eql($KB)) {
                                        _csetf_tmt_kb(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($OWNER)) {
                                            _csetf_tmt_owner(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($BUG_NUMBER)) {
                                                _csetf_tmt_bug_number(v_new, current_value);
                                            } else
                                                if (pcase_var.eql($CREATION_DATE)) {
                                                    _csetf_tmt_creation_date(v_new, current_value);
                                                } else
                                                    if (pcase_var.eql($CREATOR)) {
                                                        _csetf_tmt_creator(v_new, current_value);
                                                    } else
                                                        if (pcase_var.eql($WORKING_)) {
                                                            _csetf_tmt_workingP(v_new, current_value);
                                                        } else {
                                                            Errors.error($str45$Invalid_slot__S_for_construction_, current_arg);
                                                        }











        }
        return v_new;
    }

    public static SubLObject visit_defstruct_transformation_module_test(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_TRANSFORMATION_MODULE_TEST, TWELVE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $HL_MODULE, tmt_hl_module(obj));
        funcall(visitor_fn, obj, $SLOT, $ID, tmt_id(obj));
        funcall(visitor_fn, obj, $SLOT, $SENTENCE, tmt_sentence(obj));
        funcall(visitor_fn, obj, $SLOT, $MT, tmt_mt(obj));
        funcall(visitor_fn, obj, $SLOT, $PROPERTIES, tmt_properties(obj));
        funcall(visitor_fn, obj, $SLOT, $COMMENT, tmt_comment(obj));
        funcall(visitor_fn, obj, $SLOT, $KB, tmt_kb(obj));
        funcall(visitor_fn, obj, $SLOT, $OWNER, tmt_owner(obj));
        funcall(visitor_fn, obj, $SLOT, $BUG_NUMBER, tmt_bug_number(obj));
        funcall(visitor_fn, obj, $SLOT, $CREATION_DATE, tmt_creation_date(obj));
        funcall(visitor_fn, obj, $SLOT, $CREATOR, tmt_creator(obj));
        funcall(visitor_fn, obj, $SLOT, $WORKING_, tmt_workingP(obj));
        funcall(visitor_fn, obj, $END, MAKE_TRANSFORMATION_MODULE_TEST, TWELVE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_transformation_module_test_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_transformation_module_test(obj, visitor_fn);
    }

    public static SubLObject transformation_modules_with_transformation_module_tests() {
        SubLObject hl_modules = hash_table_utilities.hash_table_keys($transformation_module_tests$.getGlobalValue());
        hl_modules = Sort.sort(hl_modules, symbol_function($sym53$TERM__), symbol_function(HL_MODULE_NAME));
        return hl_modules;
    }

    public static SubLObject transformation_module_tests(final SubLObject hl_module) {
        SubLObject tests = copy_list(gethash(hl_module, $transformation_module_tests$.getGlobalValue(), UNPROVIDED));
        tests = Sort.sort(tests, symbol_function($sym55$_), symbol_function(TMT_ID));
        return tests;
    }

    public static SubLObject some_transformation_module_testsP(final SubLObject hl_module) {
        return list_utilities.sublisp_boolean(gethash(hl_module, $transformation_module_tests$.getGlobalValue(), UNPROVIDED));
    }

    public static SubLObject transformation_module_test_name(final SubLObject tmt) {
        return list(inference_modules.hl_module_name(tmt_hl_module(tmt)), tmt_id(tmt));
    }

    public static SubLObject transformation_module_test_id(final SubLObject tmt) {
        return tmt_id(tmt);
    }

    public static SubLObject transformation_module_test_mt(final SubLObject tmt) {
        return tmt_mt(tmt);
    }

    public static SubLObject transformation_module_test_sentence(final SubLObject tmt) {
        return tmt_sentence(tmt);
    }

    public static SubLObject transformation_module_test_owner(final SubLObject tmt) {
        return tmt_owner(tmt);
    }

    public static SubLObject transformation_module_test_comment(final SubLObject tmt) {
        return tmt_comment(tmt);
    }

    public static SubLObject transformation_module_test_kb(final SubLObject tmt) {
        return tmt_kb(tmt);
    }

    public static SubLObject transformation_module_test_workingP(final SubLObject tmt) {
        return tmt_workingP(tmt);
    }

    public static SubLObject transformation_module_test_mentions_invalid_constantP(final SubLObject tmt) {
        return makeBoolean((NIL != list_utilities.tree_find_if(symbol_function($sym56$INVALID_CONSTANT_), transformation_module_test_mt(tmt), UNPROVIDED)) || (NIL != list_utilities.tree_find_if(symbol_function($sym56$INVALID_CONSTANT_), transformation_module_test_sentence(tmt), UNPROVIDED)));
    }

    public static SubLObject transformation_module_test_invalid_constants(final SubLObject tmt) {
        return remove_duplicates(append(cycl_utilities.expression_gather(transformation_module_test_mt(tmt), $sym56$INVALID_CONSTANT_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), cycl_utilities.expression_gather(transformation_module_test_sentence(tmt), $sym56$INVALID_CONSTANT_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject define_transformation_module_test(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = NIL;
        SubLObject id = NIL;
        SubLObject sentence = NIL;
        destructuring_bind_must_consp(current, datum, $list57);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list57);
        id = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list57);
        sentence = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list57);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list57);
            if (NIL == member(current_$1, $list58, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list57);
        }
        final SubLObject mt_tail = property_list_member($MT, current);
        final SubLObject mt = (NIL != mt_tail) ? cadr(mt_tail) : $$EverythingPSC;
        final SubLObject properties_tail = property_list_member($PROPERTIES, current);
        final SubLObject v_properties = (NIL != properties_tail) ? cadr(properties_tail) : NIL;
        final SubLObject kb_tail = property_list_member($KB, current);
        final SubLObject kb = (NIL != kb_tail) ? cadr(kb_tail) : $TINY;
        final SubLObject owner_tail = property_list_member($OWNER, current);
        final SubLObject owner = (NIL != owner_tail) ? cadr(owner_tail) : NIL;
        final SubLObject comment_tail = property_list_member($COMMENT, current);
        final SubLObject comment = (NIL != comment_tail) ? cadr(comment_tail) : NIL;
        final SubLObject bug_tail = property_list_member($BUG, current);
        final SubLObject bug = (NIL != bug_tail) ? cadr(bug_tail) : NIL;
        final SubLObject created_tail = property_list_member($CREATED, current);
        final SubLObject created = (NIL != created_tail) ? cadr(created_tail) : NIL;
        final SubLObject creator_tail = property_list_member($CREATOR, current);
        final SubLObject creator = (NIL != creator_tail) ? cadr(creator_tail) : NIL;
        final SubLObject workingP_tail = property_list_member($WORKING_, current);
        final SubLObject workingP = (NIL != workingP_tail) ? cadr(workingP_tail) : T;
        return list(new SubLObject[]{ DEFINE_TRANSFORMATION_MODULE_TEST_INT, name, id, sentence, mt, v_properties, kb, owner, comment, bug, created, creator, workingP });
    }

    public static SubLObject define_transformation_module_test_int(final SubLObject name, final SubLObject id, final SubLObject sentence, final SubLObject mt, final SubLObject v_properties, final SubLObject kb, final SubLObject owner, final SubLObject comment, final SubLObject bug_number, final SubLObject creation_date, final SubLObject creator, final SubLObject workingP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((NIL != comment) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == stringp(comment))) {
            throw new AssertionError(comment);
        }
        assert NIL != cyc_testing.cyc_test_kb_p(kb) : "cyc_testing.cyc_test_kb_p(kb) " + "CommonSymbols.NIL != cyc_testing.cyc_test_kb_p(kb) " + kb;
        assert NIL != inference_testing.inference_test_owner_p(owner) : "inference_testing.inference_test_owner_p(owner) " + "CommonSymbols.NIL != inference_testing.inference_test_owner_p(owner) " + owner;
        if (((NIL != bug_number) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == subl_promotions.positive_integer_p(bug_number))) {
            throw new AssertionError(bug_number);
        }
        if (((NIL != creation_date) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == numeric_date_utilities.universal_date_p(creation_date))) {
            throw new AssertionError(creation_date);
        }
        if (((NIL != creator) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == stringp(creator))) {
            throw new AssertionError(creator);
        }
        assert NIL != booleanp(workingP) : "Types.booleanp(workingP) " + "CommonSymbols.NIL != Types.booleanp(workingP) " + workingP;
        final SubLObject hl_module = inference_modules.find_hl_module_by_name(name);
        if (NIL != inference_modules.transformation_module_p(hl_module)) {
            final SubLObject test = make_transformation_module_test(list(new SubLObject[]{ $HL_MODULE, hl_module, $ID, id, $SENTENCE, sentence, $MT, mt, $PROPERTIES, v_properties, $KB, kb, $OWNER, owner, $COMMENT, comment, $BUG_NUMBER, bug_number, $CREATION_DATE, creation_date, $CREATOR, creator, $WORKING_, workingP }));
            SubLObject existing_tests = gethash(hl_module, $transformation_module_tests$.getGlobalValue(), UNPROVIDED);
            existing_tests = delete(id, existing_tests, symbol_function(EQL), symbol_function(TMT_ID), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            existing_tests = cons(test, existing_tests);
            sethash(hl_module, $transformation_module_tests$.getGlobalValue(), existing_tests);
            cyc_testing.new_cyc_test(cyc_testing.$cyc_test_filename$.getDynamicValue(thread), test);
            return test;
        }
        return NIL;
    }

    public static SubLObject clear_transformation_module_tests() {
        clrhash($transformation_module_tests$.getGlobalValue());
        return NIL;
    }

    public static SubLObject run_all_transformation_module_tests(SubLObject output_format, SubLObject stream, SubLObject run_tiny_kb_tests_in_full_kbP, SubLObject return_test_runsP) {
        if (output_format == UNPROVIDED) {
            output_format = $STANDARD;
        }
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (run_tiny_kb_tests_in_full_kbP == UNPROVIDED) {
            run_tiny_kb_tests_in_full_kbP = cyc_testing.$run_tiny_kb_tests_in_full_kbP$.getDynamicValue();
        }
        if (return_test_runsP == UNPROVIDED) {
            return_test_runsP = NIL;
        }
        assert NIL != cyc_testing.cyc_test_output_format_p(output_format) : "cyc_testing.cyc_test_output_format_p(output_format) " + "CommonSymbols.NIL != cyc_testing.cyc_test_output_format_p(output_format) " + output_format;
        return cyc_testing.run_all_loaded_cyc_tests(stream, $TERSE, NIL, output_format, run_tiny_kb_tests_in_full_kbP, NIL, return_test_runsP, $TMT, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject run_transformation_module_tests_browsable(final SubLObject name, SubLObject output_format, SubLObject stream) {
        if (output_format == UNPROVIDED) {
            output_format = $STANDARD;
        }
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        return run_transformation_module_tests(name, output_format, stream, T, UNPROVIDED);
    }

    public static SubLObject run_transformation_module_tests_blockingP(final SubLObject name, SubLObject output_format, SubLObject stream) {
        if (output_format == UNPROVIDED) {
            output_format = $STANDARD;
        }
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        return run_transformation_module_tests(name, output_format, stream, T, T);
    }

    public static SubLObject run_transformation_module_tests(final SubLObject name, SubLObject output_format, SubLObject stream, SubLObject browsableP, SubLObject blockP) {
        if (output_format == UNPROVIDED) {
            output_format = $STANDARD;
        }
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (browsableP == UNPROVIDED) {
            browsableP = NIL;
        }
        if (blockP == UNPROVIDED) {
            blockP = NIL;
        }
        assert NIL != cyc_testing.cyc_test_output_format_p(output_format) : "cyc_testing.cyc_test_output_format_p(output_format) " + "CommonSymbols.NIL != cyc_testing.cyc_test_output_format_p(output_format) " + output_format;
        final SubLObject hl_module = inference_modules.find_hl_module_by_name(name);
        if (NIL != inference_modules.transformation_module_p(hl_module)) {
            return run_transformation_module_tests_int(hl_module, output_format, stream, browsableP, blockP);
        }
        return NIL;
    }

    public static SubLObject run_transformation_module_tests_int(final SubLObject hl_module, final SubLObject output_format, final SubLObject stream, final SubLObject browsableP, final SubLObject blockP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = $SUCCESS;
        SubLObject test_runs = NIL;
        SubLObject cdolist_list_var = transformation_module_tests(hl_module);
        SubLObject tmt = NIL;
        tmt = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject partial_result = run_transformation_module_test(tmt, output_format, stream, browsableP, blockP);
            final SubLObject test_run = thread.secondMultipleValue();
            thread.resetMultipleValues();
            test_runs = cons(test_run, test_runs);
            if (partial_result != $SUCCESS) {
                result = partial_result;
            }
            cdolist_list_var = cdolist_list_var.rest();
            tmt = cdolist_list_var.first();
        } 
        return values(result, nreverse(test_runs));
    }

    public static SubLObject run_transformation_module_test_number_browsable(final SubLObject name, final SubLObject number, SubLObject output_format, SubLObject stream) {
        if (output_format == UNPROVIDED) {
            output_format = $STANDARD;
        }
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        return run_transformation_module_test_number(name, number, output_format, stream, T, UNPROVIDED);
    }

    public static SubLObject run_transformation_module_test_number_blocking(final SubLObject name, final SubLObject number, SubLObject output_format, SubLObject stream) {
        if (output_format == UNPROVIDED) {
            output_format = $STANDARD;
        }
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        return run_transformation_module_test_number(name, number, output_format, stream, T, T);
    }

    public static SubLObject run_transformation_module_test_number(final SubLObject name, final SubLObject number, SubLObject output_format, SubLObject stream, SubLObject browsableP, SubLObject blockP) {
        if (output_format == UNPROVIDED) {
            output_format = $STANDARD;
        }
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (browsableP == UNPROVIDED) {
            browsableP = NIL;
        }
        if (blockP == UNPROVIDED) {
            blockP = NIL;
        }
        assert NIL != cyc_testing.cyc_test_output_format_p(output_format) : "cyc_testing.cyc_test_output_format_p(output_format) " + "CommonSymbols.NIL != cyc_testing.cyc_test_output_format_p(output_format) " + output_format;
        final SubLObject hl_module = inference_modules.find_hl_module_by_name(name);
        SubLObject test = NIL;
        if ((NIL != inference_modules.transformation_module_p(hl_module)) && (NIL == test)) {
            SubLObject csome_list_var = transformation_module_tests(hl_module);
            SubLObject tmt = NIL;
            tmt = csome_list_var.first();
            while ((NIL == test) && (NIL != csome_list_var)) {
                if (number.numE(tmt_id(tmt))) {
                    test = tmt;
                }
                csome_list_var = csome_list_var.rest();
                tmt = csome_list_var.first();
            } 
        }
        return run_transformation_module_test(test, output_format, stream, browsableP, blockP);
    }

    public static SubLObject run_transformation_module_test(final SubLObject tmt, SubLObject output_format, SubLObject stream, SubLObject browsableP, SubLObject blockP) {
        if (output_format == UNPROVIDED) {
            output_format = $STANDARD;
        }
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (browsableP == UNPROVIDED) {
            browsableP = NIL;
        }
        if (blockP == UNPROVIDED) {
            blockP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != transformation_module_test_p(tmt) : "transformation_module_tests.transformation_module_test_p(tmt) " + "CommonSymbols.NIL != transformation_module_tests.transformation_module_test_p(tmt) " + tmt;
        assert NIL != cyc_testing.cyc_test_output_format_p(output_format) : "cyc_testing.cyc_test_output_format_p(output_format) " + "CommonSymbols.NIL != cyc_testing.cyc_test_output_format_p(output_format) " + output_format;
        final SubLObject name = transformation_module_test_name(tmt);
        SubLObject time = NIL;
        SubLObject result = NIL;
        if (NIL == run_transformation_module_testP(tmt)) {
            result = $NOT_RUN;
        } else
            if (NIL != transformation_module_test_mentions_invalid_constantP(tmt)) {
                result = $INVALID;
            } else {
                final SubLObject hl_module = tmt_hl_module(tmt);
                final SubLObject sentence = tmt_sentence(tmt);
                final SubLObject mt = tmt_mt(tmt);
                final SubLObject v_properties = tmt_properties(tmt);
                final SubLObject _prev_bind_0 = $print_pretty$.currentBinding(thread);
                try {
                    $print_pretty$.bind(NIL, thread);
                    print_transformation_test_preamble(tmt, output_format, stream);
                    thread.resetMultipleValues();
                    final SubLObject result_$2 = run_transformation_module_test_query(hl_module, sentence, mt, v_properties, browsableP, blockP);
                    final SubLObject time_$3 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    result = result_$2;
                    time = time_$3;
                    print_transformation_module_test_result(tmt, result, time, output_format, stream);
                } finally {
                    $print_pretty$.rebind(_prev_bind_0, thread);
                }
            }

        final SubLObject test_run = cyc_testing.new_cyc_test_run($TMT, name, result, time);
        return values(result, test_run);
    }

    public static SubLObject run_transformation_module_testP(final SubLObject tmt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject test_kb = tmt_kb(tmt);
        if (NIL == inference_testing.kb_matches_expectationsP(test_kb, cyc_testing.$run_tiny_kb_tests_in_full_kbP$.getDynamicValue(thread))) {
            return NIL;
        }
        return T;
    }

    public static SubLObject run_transformation_module_test_query(final SubLObject hl_module, final SubLObject sentence, final SubLObject mt, final SubLObject v_properties, final SubLObject browsableP, final SubLObject blockP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = $ERROR;
        SubLObject time = NIL;
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    thread.resetMultipleValues();
                    final SubLObject inference = transformation_module_test_query_inference(sentence, mt, v_properties, blockP);
                    final SubLObject inference_time = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    time = inference_time;
                    if (NIL != inference_utilities.inference_some_proof_uses_transformation_moduleP(inference, hl_module)) {
                        v_answer = $SUCCESS;
                    } else {
                        v_answer = $FAILURE;
                    }
                    if (NIL == browsableP) {
                        inference_datastructures_inference.destroy_inference_and_problem_store(inference);
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        return values(v_answer, time);
    }

    public static SubLObject transformation_module_test_query_inference(final SubLObject sentence, SubLObject mt, SubLObject v_properties, SubLObject blockP) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        if (blockP == UNPROVIDED) {
            blockP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject conditionalP = inference_strategist.inference_conditional_sentence_p(sentence);
        v_properties = copy_list(v_properties);
        v_properties = putf(v_properties, $kw83$CONDITIONAL_SENTENCE_, conditionalP);
        v_properties = putf(v_properties, $BROWSABLE_, T);
        v_properties = putf(v_properties, $MAX_TRANSFORMATION_DEPTH, ONE_INTEGER);
        v_properties = putf(v_properties, $kw86$CACHE_INFERENCE_RESULTS_, NIL);
        if (NIL != blockP) {
            v_properties = putf(v_properties, $BLOCK_, T);
            v_properties = list_utilities.nmerge_plist(v_properties, $list88);
        }
        SubLObject time = NIL;
        SubLObject result = NIL;
        SubLObject halt_reason = NIL;
        SubLObject inference = NIL;
        final SubLObject time_var = get_internal_real_time();
        thread.resetMultipleValues();
        final SubLObject result_$4 = inference_kernel.new_cyc_query(sentence, mt, v_properties);
        final SubLObject halt_reason_$5 = thread.secondMultipleValue();
        final SubLObject inference_$6 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        result = result_$4;
        halt_reason = halt_reason_$5;
        inference = inference_$6;
        time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
        return values(inference, time);
    }

    public static SubLObject print_transformation_test_preamble(final SubLObject tmt, final SubLObject output_format, final SubLObject stream) {
        if (output_format.eql($STANDARD)) {
            final SubLObject hl_module = tmt_hl_module(tmt);
            final SubLObject name = inference_modules.hl_module_name(hl_module);
            final SubLObject id = tmt_id(tmt);
            format(stream, $str89$___TMT__S__S____, name, id);
            force_output(stream);
        } else
            if (!output_format.eql($POST_BUILD)) {
                format(stream, $str91$Unknown_output_format__A, output_format);
            }

        return NIL;
    }

    public static SubLObject print_transformation_module_test_result(final SubLObject tmt, final SubLObject result, final SubLObject time, final SubLObject output_format, final SubLObject stream) {
        if (output_format.eql($STANDARD)) {
            format(stream, $str92$_S____3f___, result, time);
            force_output(stream);
        } else
            if (output_format.eql($POST_BUILD)) {
                final SubLObject hl_module = tmt_hl_module(tmt);
                final SubLObject name = inference_modules.hl_module_name(hl_module);
                final SubLObject id = tmt_id(tmt);
                final SubLObject owner = tmt_owner(tmt);
                cyc_testing.print_post_build_test_summary(stream, result, $TMT, list(name, id), time, owner);
            } else {
                format(stream, $str91$Unknown_output_format__A, output_format);
            }

        return NIL;
    }

    public static SubLObject declare_transformation_module_tests_file() {
        declareFunction(me, "transformation_module_test_print_function_trampoline", "TRANSFORMATION-MODULE-TEST-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "transformation_module_test_p", "TRANSFORMATION-MODULE-TEST-P", 1, 0, false);
        new transformation_module_tests.$transformation_module_test_p$UnaryFunction();
        declareFunction(me, "tmt_hl_module", "TMT-HL-MODULE", 1, 0, false);
        declareFunction(me, "tmt_id", "TMT-ID", 1, 0, false);
        declareFunction(me, "tmt_sentence", "TMT-SENTENCE", 1, 0, false);
        declareFunction(me, "tmt_mt", "TMT-MT", 1, 0, false);
        declareFunction(me, "tmt_properties", "TMT-PROPERTIES", 1, 0, false);
        declareFunction(me, "tmt_comment", "TMT-COMMENT", 1, 0, false);
        declareFunction(me, "tmt_kb", "TMT-KB", 1, 0, false);
        declareFunction(me, "tmt_owner", "TMT-OWNER", 1, 0, false);
        declareFunction(me, "tmt_bug_number", "TMT-BUG-NUMBER", 1, 0, false);
        declareFunction(me, "tmt_creation_date", "TMT-CREATION-DATE", 1, 0, false);
        declareFunction(me, "tmt_creator", "TMT-CREATOR", 1, 0, false);
        declareFunction(me, "tmt_workingP", "TMT-WORKING?", 1, 0, false);
        declareFunction(me, "_csetf_tmt_hl_module", "_CSETF-TMT-HL-MODULE", 2, 0, false);
        declareFunction(me, "_csetf_tmt_id", "_CSETF-TMT-ID", 2, 0, false);
        declareFunction(me, "_csetf_tmt_sentence", "_CSETF-TMT-SENTENCE", 2, 0, false);
        declareFunction(me, "_csetf_tmt_mt", "_CSETF-TMT-MT", 2, 0, false);
        declareFunction(me, "_csetf_tmt_properties", "_CSETF-TMT-PROPERTIES", 2, 0, false);
        declareFunction(me, "_csetf_tmt_comment", "_CSETF-TMT-COMMENT", 2, 0, false);
        declareFunction(me, "_csetf_tmt_kb", "_CSETF-TMT-KB", 2, 0, false);
        declareFunction(me, "_csetf_tmt_owner", "_CSETF-TMT-OWNER", 2, 0, false);
        declareFunction(me, "_csetf_tmt_bug_number", "_CSETF-TMT-BUG-NUMBER", 2, 0, false);
        declareFunction(me, "_csetf_tmt_creation_date", "_CSETF-TMT-CREATION-DATE", 2, 0, false);
        declareFunction(me, "_csetf_tmt_creator", "_CSETF-TMT-CREATOR", 2, 0, false);
        declareFunction(me, "_csetf_tmt_workingP", "_CSETF-TMT-WORKING?", 2, 0, false);
        declareFunction(me, "make_transformation_module_test", "MAKE-TRANSFORMATION-MODULE-TEST", 0, 1, false);
        declareFunction(me, "visit_defstruct_transformation_module_test", "VISIT-DEFSTRUCT-TRANSFORMATION-MODULE-TEST", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_transformation_module_test_method", "VISIT-DEFSTRUCT-OBJECT-TRANSFORMATION-MODULE-TEST-METHOD", 2, 0, false);
        declareFunction(me, "transformation_modules_with_transformation_module_tests", "TRANSFORMATION-MODULES-WITH-TRANSFORMATION-MODULE-TESTS", 0, 0, false);
        declareFunction(me, "transformation_module_tests", "TRANSFORMATION-MODULE-TESTS", 1, 0, false);
        declareFunction(me, "some_transformation_module_testsP", "SOME-TRANSFORMATION-MODULE-TESTS?", 1, 0, false);
        declareFunction(me, "transformation_module_test_name", "TRANSFORMATION-MODULE-TEST-NAME", 1, 0, false);
        declareFunction(me, "transformation_module_test_id", "TRANSFORMATION-MODULE-TEST-ID", 1, 0, false);
        declareFunction(me, "transformation_module_test_mt", "TRANSFORMATION-MODULE-TEST-MT", 1, 0, false);
        declareFunction(me, "transformation_module_test_sentence", "TRANSFORMATION-MODULE-TEST-SENTENCE", 1, 0, false);
        declareFunction(me, "transformation_module_test_owner", "TRANSFORMATION-MODULE-TEST-OWNER", 1, 0, false);
        declareFunction(me, "transformation_module_test_comment", "TRANSFORMATION-MODULE-TEST-COMMENT", 1, 0, false);
        declareFunction(me, "transformation_module_test_kb", "TRANSFORMATION-MODULE-TEST-KB", 1, 0, false);
        declareFunction(me, "transformation_module_test_workingP", "TRANSFORMATION-MODULE-TEST-WORKING?", 1, 0, false);
        declareFunction(me, "transformation_module_test_mentions_invalid_constantP", "TRANSFORMATION-MODULE-TEST-MENTIONS-INVALID-CONSTANT?", 1, 0, false);
        declareFunction(me, "transformation_module_test_invalid_constants", "TRANSFORMATION-MODULE-TEST-INVALID-CONSTANTS", 1, 0, false);
        declareMacro(me, "define_transformation_module_test", "DEFINE-TRANSFORMATION-MODULE-TEST");
        declareFunction(me, "define_transformation_module_test_int", "DEFINE-TRANSFORMATION-MODULE-TEST-INT", 12, 0, false);
        declareFunction(me, "clear_transformation_module_tests", "CLEAR-TRANSFORMATION-MODULE-TESTS", 0, 0, false);
        declareFunction(me, "run_all_transformation_module_tests", "RUN-ALL-TRANSFORMATION-MODULE-TESTS", 0, 4, false);
        declareFunction(me, "run_transformation_module_tests_browsable", "RUN-TRANSFORMATION-MODULE-TESTS-BROWSABLE", 1, 2, false);
        declareFunction(me, "run_transformation_module_tests_blockingP", "RUN-TRANSFORMATION-MODULE-TESTS-BLOCKING?", 1, 2, false);
        declareFunction(me, "run_transformation_module_tests", "RUN-TRANSFORMATION-MODULE-TESTS", 1, 4, false);
        declareFunction(me, "run_transformation_module_tests_int", "RUN-TRANSFORMATION-MODULE-TESTS-INT", 5, 0, false);
        declareFunction(me, "run_transformation_module_test_number_browsable", "RUN-TRANSFORMATION-MODULE-TEST-NUMBER-BROWSABLE", 2, 2, false);
        declareFunction(me, "run_transformation_module_test_number_blocking", "RUN-TRANSFORMATION-MODULE-TEST-NUMBER-BLOCKING", 2, 2, false);
        declareFunction(me, "run_transformation_module_test_number", "RUN-TRANSFORMATION-MODULE-TEST-NUMBER", 2, 4, false);
        declareFunction(me, "run_transformation_module_test", "RUN-TRANSFORMATION-MODULE-TEST", 1, 4, false);
        declareFunction(me, "run_transformation_module_testP", "RUN-TRANSFORMATION-MODULE-TEST?", 1, 0, false);
        declareFunction(me, "run_transformation_module_test_query", "RUN-TRANSFORMATION-MODULE-TEST-QUERY", 6, 0, false);
        declareFunction(me, "transformation_module_test_query_inference", "TRANSFORMATION-MODULE-TEST-QUERY-INFERENCE", 1, 3, false);
        declareFunction(me, "print_transformation_test_preamble", "PRINT-TRANSFORMATION-TEST-PREAMBLE", 3, 0, false);
        declareFunction(me, "print_transformation_module_test_result", "PRINT-TRANSFORMATION-MODULE-TEST-RESULT", 5, 0, false);
        return NIL;
    }

    public static SubLObject init_transformation_module_tests_file() {
        defconstant("*DTP-TRANSFORMATION-MODULE-TEST*", TRANSFORMATION_MODULE_TEST);
        deflexical("*TRANSFORMATION-MODULE-TESTS*", SubLTrampolineFile.maybeDefault($transformation_module_tests$, $transformation_module_tests$, () -> make_hash_table($int$100, UNPROVIDED, UNPROVIDED)));
        return NIL;
    }

    public static SubLObject setup_transformation_module_tests_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_transformation_module_test$.getGlobalValue(), symbol_function(TRANSFORMATION_MODULE_TEST_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list8);
        def_csetf(TMT_HL_MODULE, _CSETF_TMT_HL_MODULE);
        def_csetf(TMT_ID, _CSETF_TMT_ID);
        def_csetf(TMT_SENTENCE, _CSETF_TMT_SENTENCE);
        def_csetf(TMT_MT, _CSETF_TMT_MT);
        def_csetf(TMT_PROPERTIES, _CSETF_TMT_PROPERTIES);
        def_csetf(TMT_COMMENT, _CSETF_TMT_COMMENT);
        def_csetf(TMT_KB, _CSETF_TMT_KB);
        def_csetf(TMT_OWNER, _CSETF_TMT_OWNER);
        def_csetf(TMT_BUG_NUMBER, _CSETF_TMT_BUG_NUMBER);
        def_csetf(TMT_CREATION_DATE, _CSETF_TMT_CREATION_DATE);
        def_csetf(TMT_CREATOR, _CSETF_TMT_CREATOR);
        def_csetf($sym31$TMT_WORKING_, $sym32$_CSETF_TMT_WORKING_);
        identity(TRANSFORMATION_MODULE_TEST);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_transformation_module_test$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_TRANSFORMATION_MODULE_TEST_METHOD));
        declare_defglobal($transformation_module_tests$);
        register_macro_helper(DEFINE_TRANSFORMATION_MODULE_TEST_INT, DEFINE_TRANSFORMATION_MODULE_TEST);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_transformation_module_tests_file();
    }

    @Override
    public void initializeVariables() {
        init_transformation_module_tests_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_transformation_module_tests_file();
    }

    

    public static final class $transformation_module_test_native extends SubLStructNative {
        public SubLObject $hl_module;

        public SubLObject $id;

        public SubLObject $sentence;

        public SubLObject $mt;

        public SubLObject $properties;

        public SubLObject $comment;

        public SubLObject $kb;

        public SubLObject $owner;

        public SubLObject $bug_number;

        public SubLObject $creation_date;

        public SubLObject $creator;

        public SubLObject $workingP;

        private static final SubLStructDeclNative structDecl;

        private $transformation_module_test_native() {
            this.$hl_module = Lisp.NIL;
            this.$id = Lisp.NIL;
            this.$sentence = Lisp.NIL;
            this.$mt = Lisp.NIL;
            this.$properties = Lisp.NIL;
            this.$comment = Lisp.NIL;
            this.$kb = Lisp.NIL;
            this.$owner = Lisp.NIL;
            this.$bug_number = Lisp.NIL;
            this.$creation_date = Lisp.NIL;
            this.$creator = Lisp.NIL;
            this.$workingP = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$hl_module;
        }

        @Override
        public SubLObject getField3() {
            return this.$id;
        }

        @Override
        public SubLObject getField4() {
            return this.$sentence;
        }

        @Override
        public SubLObject getField5() {
            return this.$mt;
        }

        @Override
        public SubLObject getField6() {
            return this.$properties;
        }

        @Override
        public SubLObject getField7() {
            return this.$comment;
        }

        @Override
        public SubLObject getField8() {
            return this.$kb;
        }

        @Override
        public SubLObject getField9() {
            return this.$owner;
        }

        @Override
        public SubLObject getField10() {
            return this.$bug_number;
        }

        @Override
        public SubLObject getField11() {
            return this.$creation_date;
        }

        @Override
        public SubLObject getField12() {
            return this.$creator;
        }

        @Override
        public SubLObject getField13() {
            return this.$workingP;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$hl_module = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$id = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$sentence = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$mt = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$properties = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return this.$comment = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return this.$kb = value;
        }

        @Override
        public SubLObject setField9(final SubLObject value) {
            return this.$owner = value;
        }

        @Override
        public SubLObject setField10(final SubLObject value) {
            return this.$bug_number = value;
        }

        @Override
        public SubLObject setField11(final SubLObject value) {
            return this.$creation_date = value;
        }

        @Override
        public SubLObject setField12(final SubLObject value) {
            return this.$creator = value;
        }

        @Override
        public SubLObject setField13(final SubLObject value) {
            return this.$workingP = value;
        }

        static {
            structDecl = makeStructDeclNative($transformation_module_test_native.class, TRANSFORMATION_MODULE_TEST, TRANSFORMATION_MODULE_TEST_P, $list2, $list3, new String[]{ "$hl_module", "$id", "$sentence", "$mt", "$properties", "$comment", "$kb", "$owner", "$bug_number", "$creation_date", "$creator", "$workingP" }, $list4, $list5, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $transformation_module_test_p$UnaryFunction extends UnaryFunction {
        public $transformation_module_test_p$UnaryFunction() {
            super(extractFunctionNamed("TRANSFORMATION-MODULE-TEST-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return transformation_module_test_p(arg1);
        }
    }
}

/**
 * Total time: 262 ms synthetic
 */

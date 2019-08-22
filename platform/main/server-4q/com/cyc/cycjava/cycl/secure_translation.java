package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.all_external_symbols;
import static com.cyc.cycjava.cycl.cfasl.*;
import static com.cyc.cycjava.cycl.control_vars.$sublisp_package$;
import static com.cyc.cycjava.cycl.id_index.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import java.util.Iterator;
import java.util.Map;

import org.armedbear.lisp.Lisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
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
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile; 
 public final class secure_translation extends SubLTranslatedFile {
    public static final SubLFile me = new secure_translation();

    public static final String myName = "com.cyc.cycjava.cycl.secure_translation";

    public static final String myFingerPrint = "8e02c8fd8d38b619f2aa31987c6a7e940131e21d1edd92f340605593711ed76b";

    // deflexical
    // Definitions
    // The possible security (obfuscation) levels possible in the translator.
    private static final SubLSymbol $translator_security_levels$ = makeSymbol("*TRANSLATOR-SECURITY-LEVELS*");

    // defconstant
    public static final SubLSymbol $dtp_secure_id_database$ = makeSymbol("*DTP-SECURE-ID-DATABASE*");

    // deflexical
    // The GUID for the serialization type.
    private static final SubLSymbol $secure_id_database_type_marker$ = makeSymbol("*SECURE-ID-DATABASE-TYPE-MARKER*");

    // deflexical
    private static final SubLSymbol $standard_library_symbols_not_to_obfuscate$ = makeSymbol("*STANDARD-LIBRARY-SYMBOLS-NOT-TO-OBFUSCATE*");

    // deflexical
    private static final SubLSymbol $misc_symbols_not_to_obfuscate$ = makeSymbol("*MISC-SYMBOLS-NOT-TO-OBFUSCATE*");

    // Internal Constants
    public static final SubLList $list0 = list(makeKeyword("NONE"), makeKeyword("LOW"), makeKeyword("MEDIUM"), makeKeyword("HIGH"));

    public static final SubLSymbol SECURE_ID_DATABASE = makeSymbol("SECURE-ID-DATABASE");

    public static final SubLSymbol SECURE_ID_DATABASE_P = makeSymbol("SECURE-ID-DATABASE-P");

    public static final SubLList $list3 = list(new SubLObject[]{ makeSymbol("SECURITY-LEVEL"), makeSymbol("ID-MODULE-TABLE"), makeSymbol("MODULE-ID-TABLE"), makeSymbol("ID-METHOD-TABLE"), makeSymbol("METHOD-ID-TABLE"), makeSymbol("ID-GLOBAL-TABLE"), makeSymbol("GLOBAL-ID-TABLE"), makeSymbol("SYMBOL-EXCEPTIONS"), makeSymbol("ID-SYMBOL-TABLE"), makeSymbol("SYMBOL-ID-TABLE") });

    public static final SubLList $list4 = list(new SubLObject[]{ makeKeyword("SECURITY-LEVEL"), makeKeyword("ID-MODULE-TABLE"), makeKeyword("MODULE-ID-TABLE"), makeKeyword("ID-METHOD-TABLE"), makeKeyword("METHOD-ID-TABLE"), makeKeyword("ID-GLOBAL-TABLE"), makeKeyword("GLOBAL-ID-TABLE"), makeKeyword("SYMBOL-EXCEPTIONS"), makeKeyword("ID-SYMBOL-TABLE"), makeKeyword("SYMBOL-ID-TABLE") });

    public static final SubLList $list5 = list(new SubLObject[]{ makeSymbol("SID-DB-SECURITY-LEVEL"), makeSymbol("SID-DB-ID-MODULE-TABLE"), makeSymbol("SID-DB-MODULE-ID-TABLE"), makeSymbol("SID-DB-ID-METHOD-TABLE"), makeSymbol("SID-DB-METHOD-ID-TABLE"), makeSymbol("SID-DB-ID-GLOBAL-TABLE"), makeSymbol("SID-DB-GLOBAL-ID-TABLE"), makeSymbol("SID-DB-SYMBOL-EXCEPTIONS"), makeSymbol("SID-DB-ID-SYMBOL-TABLE"), makeSymbol("SID-DB-SYMBOL-ID-TABLE") });

    public static final SubLList $list6 = list(new SubLObject[]{ makeSymbol("_CSETF-SID-DB-SECURITY-LEVEL"), makeSymbol("_CSETF-SID-DB-ID-MODULE-TABLE"), makeSymbol("_CSETF-SID-DB-MODULE-ID-TABLE"), makeSymbol("_CSETF-SID-DB-ID-METHOD-TABLE"), makeSymbol("_CSETF-SID-DB-METHOD-ID-TABLE"), makeSymbol("_CSETF-SID-DB-ID-GLOBAL-TABLE"), makeSymbol("_CSETF-SID-DB-GLOBAL-ID-TABLE"), makeSymbol("_CSETF-SID-DB-SYMBOL-EXCEPTIONS"), makeSymbol("_CSETF-SID-DB-ID-SYMBOL-TABLE"), makeSymbol("_CSETF-SID-DB-SYMBOL-ID-TABLE") });



    public static final SubLSymbol SECURE_ID_DATABASE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SECURE-ID-DATABASE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list9 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("SECURE-ID-DATABASE-P"));

    private static final SubLSymbol SID_DB_SECURITY_LEVEL = makeSymbol("SID-DB-SECURITY-LEVEL");

    private static final SubLSymbol _CSETF_SID_DB_SECURITY_LEVEL = makeSymbol("_CSETF-SID-DB-SECURITY-LEVEL");

    private static final SubLSymbol SID_DB_ID_MODULE_TABLE = makeSymbol("SID-DB-ID-MODULE-TABLE");

    private static final SubLSymbol _CSETF_SID_DB_ID_MODULE_TABLE = makeSymbol("_CSETF-SID-DB-ID-MODULE-TABLE");

    private static final SubLSymbol SID_DB_MODULE_ID_TABLE = makeSymbol("SID-DB-MODULE-ID-TABLE");

    private static final SubLSymbol _CSETF_SID_DB_MODULE_ID_TABLE = makeSymbol("_CSETF-SID-DB-MODULE-ID-TABLE");

    private static final SubLSymbol SID_DB_ID_METHOD_TABLE = makeSymbol("SID-DB-ID-METHOD-TABLE");

    private static final SubLSymbol _CSETF_SID_DB_ID_METHOD_TABLE = makeSymbol("_CSETF-SID-DB-ID-METHOD-TABLE");

    private static final SubLSymbol SID_DB_METHOD_ID_TABLE = makeSymbol("SID-DB-METHOD-ID-TABLE");

    private static final SubLSymbol _CSETF_SID_DB_METHOD_ID_TABLE = makeSymbol("_CSETF-SID-DB-METHOD-ID-TABLE");

    private static final SubLSymbol SID_DB_ID_GLOBAL_TABLE = makeSymbol("SID-DB-ID-GLOBAL-TABLE");

    private static final SubLSymbol _CSETF_SID_DB_ID_GLOBAL_TABLE = makeSymbol("_CSETF-SID-DB-ID-GLOBAL-TABLE");

    private static final SubLSymbol SID_DB_GLOBAL_ID_TABLE = makeSymbol("SID-DB-GLOBAL-ID-TABLE");

    private static final SubLSymbol _CSETF_SID_DB_GLOBAL_ID_TABLE = makeSymbol("_CSETF-SID-DB-GLOBAL-ID-TABLE");

    private static final SubLSymbol SID_DB_SYMBOL_EXCEPTIONS = makeSymbol("SID-DB-SYMBOL-EXCEPTIONS");

    private static final SubLSymbol _CSETF_SID_DB_SYMBOL_EXCEPTIONS = makeSymbol("_CSETF-SID-DB-SYMBOL-EXCEPTIONS");

    private static final SubLSymbol SID_DB_ID_SYMBOL_TABLE = makeSymbol("SID-DB-ID-SYMBOL-TABLE");

    private static final SubLSymbol _CSETF_SID_DB_ID_SYMBOL_TABLE = makeSymbol("_CSETF-SID-DB-ID-SYMBOL-TABLE");

    private static final SubLSymbol SID_DB_SYMBOL_ID_TABLE = makeSymbol("SID-DB-SYMBOL-ID-TABLE");

    private static final SubLSymbol _CSETF_SID_DB_SYMBOL_ID_TABLE = makeSymbol("_CSETF-SID-DB-SYMBOL-ID-TABLE");



    private static final SubLSymbol $ID_MODULE_TABLE = makeKeyword("ID-MODULE-TABLE");

    private static final SubLSymbol $MODULE_ID_TABLE = makeKeyword("MODULE-ID-TABLE");

    private static final SubLSymbol $ID_METHOD_TABLE = makeKeyword("ID-METHOD-TABLE");

    private static final SubLSymbol $METHOD_ID_TABLE = makeKeyword("METHOD-ID-TABLE");

    private static final SubLSymbol $ID_GLOBAL_TABLE = makeKeyword("ID-GLOBAL-TABLE");

    private static final SubLSymbol $GLOBAL_ID_TABLE = makeKeyword("GLOBAL-ID-TABLE");



    private static final SubLSymbol $ID_SYMBOL_TABLE = makeKeyword("ID-SYMBOL-TABLE");

    private static final SubLSymbol $SYMBOL_ID_TABLE = makeKeyword("SYMBOL-ID-TABLE");

    private static final SubLString $str40$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_SECURE_ID_DATABASE = makeSymbol("MAKE-SECURE-ID-DATABASE");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_SECURE_ID_DATABASE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-SECURE-ID-DATABASE-METHOD");

    private static final SubLSymbol TRANSLATOR_SECURITY_LEVEL_P = makeSymbol("TRANSLATOR-SECURITY-LEVEL-P");

    private static final SubLInteger $int$1500 = makeInteger(1500);

    private static final SubLInteger $int$10000 = makeInteger(10000);





    private static final SubLList $list51 = list(makeKeyword("MEDIUM"), makeKeyword("HIGH"));

    private static final SubLString $$$S = makeString("S");

    private static final SubLString $$$US = makeString("US");



    private static final SubLString $str55$_ = makeString("#");



    private static final SubLString $str57$Unable_to_open__S = makeString("Unable to open ~S");

    private static final SubLString $str58$c3edef08_eef1_11dd_9624_00219b50e = makeString("c3edef08-eef1-11dd-9624-00219b50e0e5");









    private static final SubLString $str63$Invalid_format___A_cannot_be_inte = makeString("Invalid format: ~A cannot be interpreted as a secure ID database.~%");

    private static final SubLString $str64$ = makeString("");

    private static final SubLString $str65$Invalid_format__The_type_ID_is_mi = makeString("Invalid format: The type ID is missing or invalid.~%");



    private static final SubLString $str67$Invalid_format___A_is_not_a_valid = makeString("Invalid format: ~A is not a valid version specification.~%");

    private static final SubLList $list68 = list(ONE_INTEGER, ZERO_INTEGER);

    private static final SubLString $str69$Invalid_format___A_is_not_a_known = makeString("Invalid format: ~A is not a known version specification.~%");

    private static final SubLString $str70$Invalid_format___A_is_not_a_valid = makeString("Invalid format: ~A is not a valid security level.~%");

    private static final SubLString $str71$Invalid_format___A_is_not_a_valid = makeString("Invalid format: ~A is not a valid symbol exceptions set.~%");

    private static final SubLString $str72$Invalid_format___A_is_not_a_valid = makeString("Invalid format: ~A is not a valid table mapping to ids of type ~A.");





    private static final SubLSymbol API_MUTABLE_GLOBAL_P = makeSymbol("API-MUTABLE-GLOBAL-P");

    private static final SubLString $$$CYC = makeString("CYC");

    private static final SubLList $list77 = list(new SubLObject[]{ makeSymbol("READER-WRITER-LOCK-P"), makeSymbol("RW-LOCK-P"), makeSymbol("NEW-RW-LOCK"), makeSymbol("RW-LOCK-NAME"), makeSymbol("RW-LOCK-SEIZE-READ-LOCK"), makeSymbol("RW-LOCK-SEIZE-WRITE-LOCK"), makeSymbol("RW-LOCK-RELEASE-READ-LOCK"), makeSymbol("RW-LOCK-RELEASE-WRITE-LOCK"), makeSymbol("SEMAPHORE-P"), makeSymbol("NEW-SEMAPHORE"), makeSymbol("SEMAPHORE-NAME"), makeSymbol("SEMAPHORE-SIGNAL"), makeSymbol("SEMAPHORE-CURRENT-COUNT"), makeSymbol("SEMAPHORE-WAIT"), makeSymbol("SEMAPHORE-DRAIN"), makeSymbol("SEMAPHORE-WAIT-WITH-TIMEOUT") });

    private static final SubLObject $list78 = _constant_78_initializer();





    private static final SubLSymbol $sym81$STRING_ = makeSymbol("STRING<");



    private static final SubLString $str83$Stuck_on__A_which_is_neither_meth = makeString("Stuck on ~A which is neither method nor macro.~%");

    private static final SubLString $str84$___in_package__cyc___ = makeString("~%(in-package :cyc)~%");

    private static final SubLString $str85$___deflexical__unprovided_trampol = makeString("~%(deflexical *unprovided-trampoline-arg* '|the unprovided trampoline argument|)~%");

    private static final SubLString $str86$___define__A_ = makeString("~%(define ~A ");

    private static final SubLSymbol $sym87$_OPTIONAL = makeSymbol("&OPTIONAL");

    private static final SubLString $str88$_____ = makeString(")~%~%");

    private static final SubLString $str89$___defmacro__A___rest_rest_ = makeString("~%(defmacro ~A (&rest rest)");

    private static final SubLString $str90$_ret___ = makeString("(ret `(");

    private static final SubLString $str91$___rest___ = makeString(" ,@rest)))");

    private static final SubLString $str92$_ = makeString("(");

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLString $str94$_optional = makeString("&optional");

    private static final SubLString $str95$__ = makeString(" (");

    private static final SubLString $str96$__unprovided_trampoline_arg__ = makeString(" *unprovided-trampoline-arg*)");

    private static final SubLString $str97$_ = makeString(")");

    private static final SubLString $str98$_ret___A = makeString("(ret (~A");

    private static final SubLString $str99$__ = makeString("))");

    private static final SubLString $str100$_pcond = makeString("(pcond");

    private static final SubLString $str101$__eq__unprovided_trampoline_arg__ = makeString("((eq *unprovided-trampoline-arg* ");

    private static final SubLString $str102$__ = makeString(") ");

    private static final SubLString $str103$_t_ = makeString("(t ");

    public static SubLObject translator_security_level_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $translator_security_levels$.getGlobalValue());
    }

    public static SubLObject secure_id_database_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject secure_id_database_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$secure_id_database_native.class ? T : NIL;
    }

    public static SubLObject sid_db_security_level(final SubLObject v_object) {
        assert NIL != secure_id_database_p(v_object) : "secure_translation.secure_id_database_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject sid_db_id_module_table(final SubLObject v_object) {
        assert NIL != secure_id_database_p(v_object) : "secure_translation.secure_id_database_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject sid_db_module_id_table(final SubLObject v_object) {
        assert NIL != secure_id_database_p(v_object) : "secure_translation.secure_id_database_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject sid_db_id_method_table(final SubLObject v_object) {
        assert NIL != secure_id_database_p(v_object) : "secure_translation.secure_id_database_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject sid_db_method_id_table(final SubLObject v_object) {
        assert NIL != secure_id_database_p(v_object) : "secure_translation.secure_id_database_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject sid_db_id_global_table(final SubLObject v_object) {
        assert NIL != secure_id_database_p(v_object) : "secure_translation.secure_id_database_p error :" + v_object;
        return v_object.getField7();
    }

    public static SubLObject sid_db_global_id_table(final SubLObject v_object) {
        assert NIL != secure_id_database_p(v_object) : "secure_translation.secure_id_database_p error :" + v_object;
        return v_object.getField8();
    }

    public static SubLObject sid_db_symbol_exceptions(final SubLObject v_object) {
        assert NIL != secure_id_database_p(v_object) : "secure_translation.secure_id_database_p error :" + v_object;
        return v_object.getField9();
    }

    public static SubLObject sid_db_id_symbol_table(final SubLObject v_object) {
        assert NIL != secure_id_database_p(v_object) : "secure_translation.secure_id_database_p error :" + v_object;
        return v_object.getField10();
    }

    public static SubLObject sid_db_symbol_id_table(final SubLObject v_object) {
        assert NIL != secure_id_database_p(v_object) : "secure_translation.secure_id_database_p error :" + v_object;
        return v_object.getField11();
    }

    public static SubLObject _csetf_sid_db_security_level(final SubLObject v_object, final SubLObject value) {
        assert NIL != secure_id_database_p(v_object) : "secure_translation.secure_id_database_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_sid_db_id_module_table(final SubLObject v_object, final SubLObject value) {
        assert NIL != secure_id_database_p(v_object) : "secure_translation.secure_id_database_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_sid_db_module_id_table(final SubLObject v_object, final SubLObject value) {
        assert NIL != secure_id_database_p(v_object) : "secure_translation.secure_id_database_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_sid_db_id_method_table(final SubLObject v_object, final SubLObject value) {
        assert NIL != secure_id_database_p(v_object) : "secure_translation.secure_id_database_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_sid_db_method_id_table(final SubLObject v_object, final SubLObject value) {
        assert NIL != secure_id_database_p(v_object) : "secure_translation.secure_id_database_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_sid_db_id_global_table(final SubLObject v_object, final SubLObject value) {
        assert NIL != secure_id_database_p(v_object) : "secure_translation.secure_id_database_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_sid_db_global_id_table(final SubLObject v_object, final SubLObject value) {
        assert NIL != secure_id_database_p(v_object) : "secure_translation.secure_id_database_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_sid_db_symbol_exceptions(final SubLObject v_object, final SubLObject value) {
        assert NIL != secure_id_database_p(v_object) : "secure_translation.secure_id_database_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_sid_db_id_symbol_table(final SubLObject v_object, final SubLObject value) {
        assert NIL != secure_id_database_p(v_object) : "secure_translation.secure_id_database_p error :" + v_object;
        return v_object.setField10(value);
    }

    public static SubLObject _csetf_sid_db_symbol_id_table(final SubLObject v_object, final SubLObject value) {
        assert NIL != secure_id_database_p(v_object) : "secure_translation.secure_id_database_p error :" + v_object;
        return v_object.setField11(value);
    }

    public static SubLObject make_secure_id_database(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $secure_id_database_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($SECURITY_LEVEL)) {
                _csetf_sid_db_security_level(v_new, current_value);
            } else
                if (pcase_var.eql($ID_MODULE_TABLE)) {
                    _csetf_sid_db_id_module_table(v_new, current_value);
                } else
                    if (pcase_var.eql($MODULE_ID_TABLE)) {
                        _csetf_sid_db_module_id_table(v_new, current_value);
                    } else
                        if (pcase_var.eql($ID_METHOD_TABLE)) {
                            _csetf_sid_db_id_method_table(v_new, current_value);
                        } else
                            if (pcase_var.eql($METHOD_ID_TABLE)) {
                                _csetf_sid_db_method_id_table(v_new, current_value);
                            } else
                                if (pcase_var.eql($ID_GLOBAL_TABLE)) {
                                    _csetf_sid_db_id_global_table(v_new, current_value);
                                } else
                                    if (pcase_var.eql($GLOBAL_ID_TABLE)) {
                                        _csetf_sid_db_global_id_table(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($SYMBOL_EXCEPTIONS)) {
                                            _csetf_sid_db_symbol_exceptions(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($ID_SYMBOL_TABLE)) {
                                                _csetf_sid_db_id_symbol_table(v_new, current_value);
                                            } else
                                                if (pcase_var.eql($SYMBOL_ID_TABLE)) {
                                                    _csetf_sid_db_symbol_id_table(v_new, current_value);
                                                } else {
                                                    Errors.error($str40$Invalid_slot__S_for_construction_, current_arg);
                                                }









        }
        return v_new;
    }

    public static SubLObject visit_defstruct_secure_id_database(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_SECURE_ID_DATABASE, TEN_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $SECURITY_LEVEL, sid_db_security_level(obj));
        funcall(visitor_fn, obj, $SLOT, $ID_MODULE_TABLE, sid_db_id_module_table(obj));
        funcall(visitor_fn, obj, $SLOT, $MODULE_ID_TABLE, sid_db_module_id_table(obj));
        funcall(visitor_fn, obj, $SLOT, $ID_METHOD_TABLE, sid_db_id_method_table(obj));
        funcall(visitor_fn, obj, $SLOT, $METHOD_ID_TABLE, sid_db_method_id_table(obj));
        funcall(visitor_fn, obj, $SLOT, $ID_GLOBAL_TABLE, sid_db_id_global_table(obj));
        funcall(visitor_fn, obj, $SLOT, $GLOBAL_ID_TABLE, sid_db_global_id_table(obj));
        funcall(visitor_fn, obj, $SLOT, $SYMBOL_EXCEPTIONS, sid_db_symbol_exceptions(obj));
        funcall(visitor_fn, obj, $SLOT, $ID_SYMBOL_TABLE, sid_db_id_symbol_table(obj));
        funcall(visitor_fn, obj, $SLOT, $SYMBOL_ID_TABLE, sid_db_symbol_id_table(obj));
        funcall(visitor_fn, obj, $END, MAKE_SECURE_ID_DATABASE, TEN_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_secure_id_database_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_secure_id_database(obj, visitor_fn);
    }

    public static SubLObject new_secure_id_database(final SubLObject security_level) {
        assert NIL != translator_security_level_p(security_level) : "secure_translation.translator_security_level_p(security_level) " + "CommonSymbols.NIL != secure_translation.translator_security_level_p(security_level) " + security_level;
        final SubLObject sid_db = make_secure_id_database(UNPROVIDED);
        SubLObject id_module_table = NIL;
        SubLObject module_id_table = NIL;
        SubLObject id_method_table = NIL;
        SubLObject method_id_table = NIL;
        SubLObject id_global_table = NIL;
        SubLObject global_id_table = NIL;
        SubLObject id_symbol_table = NIL;
        SubLObject symbol_id_table = NIL;
        SubLObject symbol_exceptions = NIL;
        final SubLObject expected_module_count = $int$1500;
        id_module_table = new_id_index(expected_module_count, ZERO_INTEGER);
        module_id_table = make_hash_table(expected_module_count, symbol_function(EQUAL), UNPROVIDED);
        final SubLObject expected_method_count = $int$10000;
        id_method_table = new_id_index(expected_method_count, ZERO_INTEGER);
        method_id_table = make_hash_table(expected_method_count, symbol_function(EQ), UNPROVIDED);
        final SubLObject expected_global_count = $int$10000;
        id_global_table = new_id_index(expected_global_count, ZERO_INTEGER);
        global_id_table = make_hash_table(expected_global_count, symbol_function(EQ), UNPROVIDED);
        final SubLObject expected_symbol_count = $int$10000;
        id_symbol_table = new_id_index(expected_symbol_count, ZERO_INTEGER);
        symbol_id_table = make_hash_table(expected_symbol_count, symbol_function(EQ), UNPROVIDED);
        final SubLObject excepted_symbol_count = $int$1000;
        symbol_exceptions = set.new_set(symbol_function(EQ), excepted_symbol_count);
        set_secure_id_database_slots(sid_db, security_level, id_module_table, module_id_table, id_method_table, method_id_table, id_global_table, global_id_table, id_symbol_table, symbol_id_table, symbol_exceptions);
        secure_id_database_populate_symbol_exceptions(sid_db);
        return sid_db;
    }

    public static SubLObject set_secure_id_database_slots(final SubLObject sid_db, final SubLObject security_level, final SubLObject id_module_table, final SubLObject module_id_table, final SubLObject id_method_table, final SubLObject method_id_table, final SubLObject id_global_table, final SubLObject global_id_table, final SubLObject id_symbol_table, final SubLObject symbol_id_table, final SubLObject symbol_exceptions) {
        _csetf_sid_db_security_level(sid_db, security_level);
        _csetf_sid_db_id_module_table(sid_db, id_module_table);
        _csetf_sid_db_module_id_table(sid_db, module_id_table);
        _csetf_sid_db_id_method_table(sid_db, id_method_table);
        _csetf_sid_db_method_id_table(sid_db, method_id_table);
        _csetf_sid_db_id_global_table(sid_db, id_global_table);
        _csetf_sid_db_global_id_table(sid_db, global_id_table);
        _csetf_sid_db_id_symbol_table(sid_db, id_symbol_table);
        _csetf_sid_db_symbol_id_table(sid_db, symbol_id_table);
        _csetf_sid_db_symbol_exceptions(sid_db, symbol_exceptions);
        return sid_db;
    }

    public static SubLObject destroy_secure_id_database(final SubLObject sid_db) {
        assert NIL != secure_id_database_p(sid_db) : "secure_translation.secure_id_database_p(sid_db) " + "CommonSymbols.NIL != secure_translation.secure_id_database_p(sid_db) " + sid_db;
        _csetf_sid_db_security_level(sid_db, $FREE);
        clear_id_index(sid_db_id_module_table(sid_db));
        _csetf_sid_db_id_module_table(sid_db, $FREE);
        clrhash(sid_db_module_id_table(sid_db));
        _csetf_sid_db_module_id_table(sid_db, $FREE);
        clear_id_index(sid_db_id_method_table(sid_db));
        _csetf_sid_db_id_method_table(sid_db, $FREE);
        clrhash(sid_db_method_id_table(sid_db));
        _csetf_sid_db_method_id_table(sid_db, $FREE);
        clear_id_index(sid_db_id_global_table(sid_db));
        _csetf_sid_db_id_global_table(sid_db, $FREE);
        clrhash(sid_db_global_id_table(sid_db));
        _csetf_sid_db_global_id_table(sid_db, $FREE);
        clrhash(sid_db_symbol_exceptions(sid_db));
        _csetf_sid_db_symbol_exceptions(sid_db, $FREE);
        clear_id_index(sid_db_id_symbol_table(sid_db));
        _csetf_sid_db_id_symbol_table(sid_db, $FREE);
        clrhash(sid_db_symbol_id_table(sid_db));
        _csetf_sid_db_symbol_id_table(sid_db, $FREE);
        return sid_db;
    }

    public static SubLObject secure_id_database_security_level(final SubLObject sid_db) {
        assert NIL != secure_id_database_p(sid_db) : "secure_translation.secure_id_database_p(sid_db) " + "CommonSymbols.NIL != secure_translation.secure_id_database_p(sid_db) " + sid_db;
        return sid_db_security_level(sid_db);
    }

    public static SubLObject secure_id_database_lookup_module(final SubLObject sid_db, final SubLObject id) {
        assert NIL != secure_id_database_p(sid_db) : "secure_translation.secure_id_database_p(sid_db) " + "CommonSymbols.NIL != secure_translation.secure_id_database_p(sid_db) " + sid_db;
        return id_index_lookup(sid_db_id_module_table(sid_db), id, UNPROVIDED);
    }

    public static SubLObject secure_id_database_lookup_method(final SubLObject sid_db, final SubLObject id) {
        assert NIL != secure_id_database_p(sid_db) : "secure_translation.secure_id_database_p(sid_db) " + "CommonSymbols.NIL != secure_translation.secure_id_database_p(sid_db) " + sid_db;
        return id_index_lookup(sid_db_id_method_table(sid_db), id, UNPROVIDED);
    }

    public static SubLObject secure_id_database_lookup_global(final SubLObject sid_db, final SubLObject id) {
        assert NIL != secure_id_database_p(sid_db) : "secure_translation.secure_id_database_p(sid_db) " + "CommonSymbols.NIL != secure_translation.secure_id_database_p(sid_db) " + sid_db;
        return id_index_lookup(sid_db_id_global_table(sid_db), id, UNPROVIDED);
    }

    public static SubLObject secure_id_database_excepted_symbolP(final SubLObject sid_db, final SubLObject symbol) {
        assert NIL != secure_id_database_p(sid_db) : "secure_translation.secure_id_database_p(sid_db) " + "CommonSymbols.NIL != secure_translation.secure_id_database_p(sid_db) " + sid_db;
        return set.set_memberP(symbol, sid_db_symbol_exceptions(sid_db));
    }

    public static SubLObject secure_id_database_lookup_symbol(final SubLObject sid_db, final SubLObject id) {
        assert NIL != secure_id_database_p(sid_db) : "secure_translation.secure_id_database_p(sid_db) " + "CommonSymbols.NIL != secure_translation.secure_id_database_p(sid_db) " + sid_db;
        return id_index_lookup(sid_db_id_symbol_table(sid_db), id, UNPROVIDED);
    }

    public static SubLObject secure_id_database_symbol_name(final SubLObject sid_db, final SubLObject symbol) {
        final SubLObject level = secure_id_database_security_level(sid_db);
        final SubLObject v_package = symbol_package(symbol);
        SubLObject secure_name;
        SubLObject basis = secure_name = symbol_name(symbol);
        if (((NIL == secure_id_database_name_sensitive_symbolP(symbol)) && (NIL != list_utilities.member_eqP(level, $list51))) && (NIL == secure_id_database_excepted_symbolP(sid_db, symbol))) {
            final SubLObject prefix = (NIL != v_package) ? $$$S : $$$US;
            if (level == $HIGH) {
                if (NIL != v_package) {
                    basis = secure_id_database_symbol_id(sid_db, symbol);
                } else {
                    basis = string_utilities.integer_to_hex_string(sxhash_external.sxhash_external(symbol_name(symbol)));
                }
            }
            secure_name = cconcatenate(format_nil.format_nil_a_no_copy(prefix), new SubLObject[]{ $str55$_, format_nil.format_nil_a_no_copy(basis) });
        }
        return secure_name;
    }

    public static SubLObject secure_id_database_name_sensitive_symbolP(final SubLObject v_object) {
        return makeBoolean(v_object.isSymbol() && ((v_object.isKeyword() || (NIL != sublisp_symbol_p(v_object))) || (NIL != cycl_variables.el_varP(v_object))));
    }

    public static SubLObject sublisp_symbol_p(final SubLObject v_object) {
        return makeBoolean(v_object.isSymbol() && v_object.eql(find_symbol(symbol_name(v_object), $sublisp_package$.getGlobalValue())));
    }

    public static SubLObject save_secure_id_database_to_file(final SubLObject sid_db, final SubLObject file) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_binary(file, $OUTPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str57$Unable_to_open__S, file);
            }
            final SubLObject s = stream;
            save_secure_id_database(sid_db, s);
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return file;
    }

    public static SubLObject save_secure_id_database(final SubLObject sid_db, final SubLObject stream) {
        cfasl_output(construct_recipe_for_secure_id_database(sid_db), stream);
        return sid_db;
    }

    public static SubLObject construct_recipe_for_secure_id_database(final SubLObject sid_db) {
        SubLObject recipe = NIL;
        recipe = cons(list($TYPE, $secure_id_database_type_marker$.getGlobalValue()), recipe);
        recipe = cons(list($VERSION, list(ONE_INTEGER, ZERO_INTEGER)), recipe);
        recipe = cons(list($COPYRIGHT, misc_utilities.copyright_notice()), recipe);
        recipe = cons(list($SECURITY_LEVEL, sid_db_security_level(sid_db)), recipe);
        recipe = cons(list($MODULE_ID_TABLE, sid_db_module_id_table(sid_db)), recipe);
        recipe = cons(list($METHOD_ID_TABLE, sid_db_method_id_table(sid_db)), recipe);
        recipe = cons(list($GLOBAL_ID_TABLE, sid_db_global_id_table(sid_db)), recipe);
        recipe = cons(list($SYMBOL_ID_TABLE, sid_db_symbol_id_table(sid_db)), recipe);
        recipe = cons(list($SYMBOL_EXCEPTIONS, sid_db_symbol_exceptions(sid_db)), recipe);
        return recipe;
    }

    public static SubLObject restore_secure_id_database_from_file(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sid_db = NIL;
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_binary(filename, $INPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str57$Unable_to_open__S, filename);
            }
            final SubLObject s = stream;
            sid_db = restore_secure_id_database(s);
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return sid_db;
    }

    public static SubLObject restore_secure_id_database(final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject recipe = load_secure_id_database_recipe(stream);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!recipe.isCons())) {
            Errors.error($str63$Invalid_format___A_cannot_be_inte, recipe);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == Strings.stringE($secure_id_database_type_marker$.getGlobalValue(), sid_db_recipe_get(recipe, $TYPE, $str64$), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            Errors.error($str65$Invalid_format__The_type_ID_is_mi);
        }
        final SubLObject version = sid_db_recipe_get(recipe, $VERSION, UNPROVIDED);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ((!version.isCons()) || (NIL == list_utilities.list_of_type_p(FIXNUMP, version)))) {
            Errors.error($str67$Invalid_format___A_is_not_a_valid, version);
        }
        return interpret_secure_id_database_recipe_by_version(recipe, version);
    }

    public static SubLObject load_secure_id_database_recipe(final SubLObject stream) {
        return cfasl_input(stream, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject sid_db_recipe_get(final SubLObject recipe, final SubLObject marker, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        return list_utilities.alist_lookup(recipe, marker, symbol_function(EQ), v_default).first();
    }

    public static SubLObject interpret_secure_id_database_recipe_by_version(final SubLObject recipe, final SubLObject version) {
        if ($list68.equal(version)) {
            return interpret_secure_id_database_recipe_v1p0(recipe);
        }
        Errors.error($str69$Invalid_format___A_is_not_a_known, version);
        return NIL;
    }

    public static SubLObject interpret_secure_id_database_recipe_v1p0(final SubLObject recipe) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject security_level = NIL;
        SubLObject id_module_table = NIL;
        SubLObject module_id_table = NIL;
        SubLObject id_method_table = NIL;
        SubLObject method_id_table = NIL;
        SubLObject id_global_table = NIL;
        SubLObject global_id_table = NIL;
        SubLObject id_symbol_table = NIL;
        SubLObject symbol_id_table = NIL;
        SubLObject symbol_exceptions = NIL;
        security_level = sid_db_recipe_get(recipe, $SECURITY_LEVEL, UNPROVIDED);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == translator_security_level_p(security_level))) {
            Errors.error($str70$Invalid_format___A_is_not_a_valid, security_level);
        }
        module_id_table = fetch_valid_secure_id_database_table(recipe, $MODULE_ID_TABLE);
        method_id_table = fetch_valid_secure_id_database_table(recipe, $METHOD_ID_TABLE);
        global_id_table = fetch_valid_secure_id_database_table(recipe, $GLOBAL_ID_TABLE);
        symbol_id_table = fetch_valid_secure_id_database_table(recipe, $SYMBOL_ID_TABLE);
        id_module_table = new_id_index_from_reverse_index(module_id_table);
        id_method_table = new_id_index_from_reverse_index(method_id_table);
        id_global_table = new_id_index_from_reverse_index(global_id_table);
        id_symbol_table = new_id_index_from_reverse_index(symbol_id_table);
        symbol_exceptions = sid_db_recipe_get(recipe, $SYMBOL_EXCEPTIONS, UNPROVIDED);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == set.set_p(symbol_exceptions))) {
            Errors.error($str71$Invalid_format___A_is_not_a_valid, symbol_exceptions);
        }
        return set_secure_id_database_slots(make_secure_id_database(UNPROVIDED), security_level, id_module_table, module_id_table, id_method_table, method_id_table, id_global_table, global_id_table, id_symbol_table, symbol_id_table, symbol_exceptions);
    }

    public static SubLObject fetch_valid_secure_id_database_table(final SubLObject recipe, final SubLObject tag) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject table = sid_db_recipe_get(recipe, tag, UNPROVIDED);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == map_utilities.map_p(table))) {
            Errors.error($str72$Invalid_format___A_is_not_a_valid, table, tag);
        }
        return table;
    }

    public static SubLObject secure_id_database_known_moduleP(final SubLObject sid_db, final SubLObject module_name) {
        assert NIL != secure_id_database_p(sid_db) : "secure_translation.secure_id_database_p(sid_db) " + "CommonSymbols.NIL != secure_translation.secure_id_database_p(sid_db) " + sid_db;
        assert NIL != stringp(module_name) : "Types.stringp(module_name) " + "CommonSymbols.NIL != Types.stringp(module_name) " + module_name;
        return list_utilities.sublisp_boolean(gethash_without_values(module_name, sid_db_module_id_table(sid_db), UNPROVIDED));
    }

    public static SubLObject secure_id_database_known_methodP(final SubLObject sid_db, final SubLObject method) {
        assert NIL != secure_id_database_p(sid_db) : "secure_translation.secure_id_database_p(sid_db) " + "CommonSymbols.NIL != secure_translation.secure_id_database_p(sid_db) " + sid_db;
        assert NIL != symbolp(method) : "Types.symbolp(method) " + "CommonSymbols.NIL != Types.symbolp(method) " + method;
        return list_utilities.sublisp_boolean(gethash_without_values(method, sid_db_method_id_table(sid_db), UNPROVIDED));
    }

    public static SubLObject secure_id_database_known_globalP(final SubLObject sid_db, final SubLObject global) {
        assert NIL != secure_id_database_p(sid_db) : "secure_translation.secure_id_database_p(sid_db) " + "CommonSymbols.NIL != secure_translation.secure_id_database_p(sid_db) " + sid_db;
        assert NIL != symbolp(global) : "Types.symbolp(global) " + "CommonSymbols.NIL != Types.symbolp(global) " + global;
        return list_utilities.sublisp_boolean(gethash_without_values(global, sid_db_global_id_table(sid_db), UNPROVIDED));
    }

    public static SubLObject secure_id_database_module_id(final SubLObject sid_db, final SubLObject module_name) {
        assert NIL != secure_id_database_p(sid_db) : "secure_translation.secure_id_database_p(sid_db) " + "CommonSymbols.NIL != secure_translation.secure_id_database_p(sid_db) " + sid_db;
        assert NIL != stringp(module_name) : "Types.stringp(module_name) " + "CommonSymbols.NIL != Types.stringp(module_name) " + module_name;
        SubLObject id = gethash_without_values(module_name, sid_db_module_id_table(sid_db), UNPROVIDED);
        if (NIL == id) {
            id = id_index_reserve(sid_db_id_module_table(sid_db));
            id_index_enter(sid_db_id_module_table(sid_db), id, module_name);
            sethash(module_name, sid_db_module_id_table(sid_db), id);
        }
        return id;
    }

    public static SubLObject secure_id_database_method_id(final SubLObject sid_db, final SubLObject method) {
        assert NIL != secure_id_database_p(sid_db) : "secure_translation.secure_id_database_p(sid_db) " + "CommonSymbols.NIL != secure_translation.secure_id_database_p(sid_db) " + sid_db;
        assert NIL != symbolp(method) : "Types.symbolp(method) " + "CommonSymbols.NIL != Types.symbolp(method) " + method;
        SubLObject id = gethash_without_values(method, sid_db_method_id_table(sid_db), UNPROVIDED);
        if (NIL == id) {
            id = id_index_reserve(sid_db_id_method_table(sid_db));
            id_index_enter(sid_db_id_method_table(sid_db), id, method);
            sethash(method, sid_db_method_id_table(sid_db), id);
        }
        return id;
    }

    public static SubLObject secure_id_database_global_id(final SubLObject sid_db, final SubLObject global) {
        assert NIL != secure_id_database_p(sid_db) : "secure_translation.secure_id_database_p(sid_db) " + "CommonSymbols.NIL != secure_translation.secure_id_database_p(sid_db) " + sid_db;
        assert NIL != symbolp(global) : "Types.symbolp(global) " + "CommonSymbols.NIL != Types.symbolp(global) " + global;
        SubLObject id = gethash_without_values(global, sid_db_global_id_table(sid_db), UNPROVIDED);
        if (NIL == id) {
            id = id_index_reserve(sid_db_id_global_table(sid_db));
            id_index_enter(sid_db_id_global_table(sid_db), id, global);
            sethash(global, sid_db_global_id_table(sid_db), id);
        }
        return id;
    }

    public static SubLObject secure_id_database_symbol_id(final SubLObject sid_db, final SubLObject symbol) {
        assert NIL != secure_id_database_p(sid_db) : "secure_translation.secure_id_database_p(sid_db) " + "CommonSymbols.NIL != secure_translation.secure_id_database_p(sid_db) " + sid_db;
        assert NIL != symbolp(symbol) : "Types.symbolp(symbol) " + "CommonSymbols.NIL != Types.symbolp(symbol) " + symbol;
        SubLObject id = gethash_without_values(symbol, sid_db_symbol_id_table(sid_db), UNPROVIDED);
        if (NIL == id) {
            id = id_index_reserve(sid_db_id_symbol_table(sid_db));
            id_index_enter(sid_db_id_symbol_table(sid_db), id, symbol);
            sethash(symbol, sid_db_symbol_id_table(sid_db), id);
        }
        return id;
    }

    public static SubLObject secure_id_database_populate_symbol_exceptions(final SubLObject sid_db) {
        assert NIL != secure_id_database_p(sid_db) : "secure_translation.secure_id_database_p(sid_db) " + "CommonSymbols.NIL != secure_translation.secure_id_database_p(sid_db) " + sid_db;
        if (NIL != list_utilities.member_eqP(secure_id_database_security_level(sid_db), $list51)) {
            final SubLObject exceptions = sid_db_symbol_exceptions(sid_db);
            sid_db_symbol_exceptions_add_all(exceptions);
            return T;
        }
        return NIL;
    }

    public static SubLObject secure_id_database_note_symbol_exception(final SubLObject sid_db, final SubLObject symbol) {
        assert NIL != secure_id_database_p(sid_db) : "secure_translation.secure_id_database_p(sid_db) " + "CommonSymbols.NIL != secure_translation.secure_id_database_p(sid_db) " + sid_db;
        assert NIL != symbolp(symbol) : "Types.symbolp(symbol) " + "CommonSymbols.NIL != Types.symbolp(symbol) " + symbol;
        if (NIL != list_utilities.member_eqP(secure_id_database_security_level(sid_db), $list51)) {
            set.set_add(symbol, sid_db_symbol_exceptions(sid_db));
            return T;
        }
        return NIL;
    }

    public static SubLObject current_system_translation_secure_module_lookup(final SubLObject secure_module_id) {
        final SubLObject sys_tran = system_translation.current_system_translation();
        if (NIL != sys_tran) {
            final SubLObject sid_db = system_translation.sys_tran_secure_id_database(sys_tran);
            if (NIL != sid_db) {
                return secure_id_database_lookup_module(sid_db, secure_module_id);
            }
        }
        return NIL;
    }

    public static SubLObject current_system_translation_secure_method_lookup(final SubLObject secure_method_id) {
        final SubLObject sys_tran = system_translation.current_system_translation();
        if (NIL != sys_tran) {
            final SubLObject sid_db = system_translation.sys_tran_secure_id_database(sys_tran);
            if (NIL != sid_db) {
                return secure_id_database_lookup_method(sid_db, secure_method_id);
            }
        }
        return NIL;
    }

    public static SubLObject current_system_translation_secure_global_lookup(final SubLObject secure_global_id) {
        final SubLObject sys_tran = system_translation.current_system_translation();
        if (NIL != sys_tran) {
            final SubLObject sid_db = system_translation.sys_tran_secure_id_database(sys_tran);
            if (NIL != sid_db) {
                return secure_id_database_lookup_global(sid_db, secure_global_id);
            }
        }
        return NIL;
    }

    public static SubLObject current_system_translation_secure_symbol_lookup(final SubLObject secure_symbol_id) {
        final SubLObject sys_tran = system_translation.current_system_translation();
        if (NIL != sys_tran) {
            final SubLObject sid_db = system_translation.sys_tran_secure_id_database(sys_tran);
            if (NIL != sid_db) {
                return secure_id_database_lookup_symbol(sid_db, secure_symbol_id);
            }
        }
        return NIL;
    }

    public static SubLObject sid_db_symbol_exceptions_add_all(final SubLObject exceptions) {
        sid_db_symbol_exceptions_add_for_api(exceptions);
        sid_db_symbol_exceptions_add_for_external(exceptions);
        sid_db_symbol_exceptions_add_for_system_parameters(exceptions);
        sid_db_symbol_exceptions_add_for_html_handlers(exceptions);
        sid_db_symbol_exceptions_add_for_kb_function_symbols(exceptions);
        sid_db_symbol_exceptions_add_for_standard_libraries(exceptions);
        sid_db_symbol_exceptions_add_for_misc_symbols(exceptions);
        return NIL;
    }

    public static SubLObject sid_db_symbol_exceptions_add_for_api(final SubLObject exceptions) {
        SubLObject symbol = NIL;
        SubLObject value = NIL;
        Iterator cdohash_iterator = getEntrySetIterator($api_predefined_function_table$.getGlobalValue());
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                symbol = getEntryKey(cdohash_entry);
                value = getEntryValue(cdohash_entry);
                set.set_add(symbol, exceptions);
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        symbol = NIL;
        value = NIL;
        cdohash_iterator = getEntrySetIterator($api_predefined_macro_table$.getGlobalValue());
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                symbol = getEntryKey(cdohash_entry);
                value = getEntryValue(cdohash_entry);
                set.set_add(symbol, exceptions);
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        set.set_add(API_MUTABLE_GLOBAL_P, exceptions);
        return NIL;
    }

    public static SubLObject sid_db_symbol_exceptions_add_symbols(final SubLObject exceptions, final SubLObject symbols) {
        final SubLObject cyc_package = find_package($$$CYC);
        SubLObject total = ZERO_INTEGER;
        SubLObject cdolist_list_var = symbols;
        SubLObject symbol = NIL;
        symbol = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (cyc_package.eql(symbol_package(symbol))) {
                total = add(total, ONE_INTEGER);
                set.set_add(symbol, exceptions);
            }
            cdolist_list_var = cdolist_list_var.rest();
            symbol = cdolist_list_var.first();
        } 
        return total;
    }

    public static SubLObject sid_db_symbol_exceptions_add_for_external(final SubLObject exceptions) {
        return sid_db_symbol_exceptions_add_symbols(exceptions, all_external_symbols());
    }

    public static SubLObject sid_db_symbol_exceptions_add_for_system_parameters(final SubLObject exceptions) {
        return sid_db_symbol_exceptions_add_symbols(exceptions, system_parameters.all_system_parameters());
    }

    public static SubLObject sid_db_symbol_exceptions_add_for_html_handlers(final SubLObject exceptions) {
        return sid_db_symbol_exceptions_add_symbols(exceptions, html_macros.all_html_handler_symbols());
    }

    public static SubLObject sid_db_symbol_exceptions_add_for_kb_function_symbols(final SubLObject exceptions) {
        return sid_db_symbol_exceptions_add_symbols(exceptions, all_kb_functions());
    }

    public static SubLObject sid_db_symbol_exceptions_add_for_standard_libraries(final SubLObject exceptions) {
        return sid_db_symbol_exceptions_add_symbols(exceptions, $standard_library_symbols_not_to_obfuscate$.getGlobalValue());
    }

    public static SubLObject sid_db_symbol_exceptions_add_for_misc_symbols(final SubLObject exceptions) {
        return sid_db_symbol_exceptions_add_symbols(exceptions, $misc_symbols_not_to_obfuscate$.getGlobalValue());
    }

    public static SubLObject sid_db_symbol_exceptions_register_and_retranslate_misc(SubLObject symbols) {
        if (symbols == UNPROVIDED) {
            symbols = $misc_symbols_not_to_obfuscate$.getGlobalValue();
        }
        final SubLObject sys_tran = system_translation.current_system_translation();
        if (NIL != sys_tran) {
            final SubLObject sid_db = system_translation.sys_tran_secure_id_database(sys_tran);
            final SubLObject exceptions = sid_db_symbol_exceptions(sid_db);
            sid_db_symbol_exceptions_add_symbols(exceptions, symbols);
        }
        SubLObject v_modules = NIL;
        SubLObject cdolist_list_var = symbols;
        SubLObject symbol = NIL;
        symbol = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject method_module = xref_database.xref_method_defining_module(symbol);
            final SubLObject module = (NIL != method_module) ? method_module : xref_database.xref_global_defining_module(symbol);
            if (NIL != module) {
                final SubLObject item_var = module;
                if (NIL == member(item_var, v_modules, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                    v_modules = cons(item_var, v_modules);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            symbol = cdolist_list_var.first();
        } 
        system_translation.retranslate_modules(v_modules);
        return length(v_modules);
    }

    public static SubLObject gather_all_subl_functions_mentioned_in_file(final SubLObject file, SubLObject functions) {
        if (functions == UNPROVIDED) {
            functions = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == set.set_p(functions)) {
            functions = set.new_set(UNPROVIDED, UNPROVIDED);
        }
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_text(file, $INPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str57$Unable_to_open__S, file);
            }
            SubLObject s;
            SubLObject form;
            SubLObject fsyms;
            for (s = stream, form = NIL, form = read(s, NIL, $EOF, UNPROVIDED); $EOF != form; form = read(s, NIL, $EOF, UNPROVIDED)) {
                fsyms = list_utilities.remove_if_not(FBOUNDP, list_utilities.tree_gather(form, SYMBOLP, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                set_utilities.set_add_all(fsyms, functions);
            }
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return functions;
    }

    public static SubLObject gather_all_subl_functions_mentioned_in_files(final SubLObject files, SubLObject functions) {
        if (functions == UNPROVIDED) {
            functions = NIL;
        }
        SubLObject cdolist_list_var = files;
        SubLObject file = NIL;
        file = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            functions = gather_all_subl_functions_mentioned_in_file(file, functions);
            cdolist_list_var = cdolist_list_var.rest();
            file = cdolist_list_var.first();
        } 
        return functions;
    }

    public static SubLObject all_securely_translated_methods_requiring_trampolines(final SubLObject sid_db, final SubLObject v_methods) {
        SubLObject method_list = NIL;
        final SubLObject set_contents_var = set.do_set_internal(v_methods);
        SubLObject basis_object;
        SubLObject state;
        SubLObject method;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            method = set_contents.do_set_contents_next(basis_object, state);
            if (((NIL != set_contents.do_set_contents_element_validP(state, method)) && (NIL != secure_id_database_known_methodP(sid_db, method))) && (NIL == secure_id_database_excepted_symbolP(sid_db, method))) {
                method_list = cons(method, method_list);
            }
        }
        return Sort.sort(method_list, $sym81$STRING_, SYMBOL_NAME);
    }

    public static SubLObject write_trampolines_for_securely_translated_methods(final SubLObject sid_db, final SubLObject v_methods, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        write_trampoline_file_header_for_securely_translated_methods(stream);
        SubLObject cdolist_list_var = all_securely_translated_methods_requiring_trampolines(sid_db, v_methods);
        SubLObject method = NIL;
        method = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject secure_method_name = secure_id_database_symbol_name(sid_db, method);
            if (method.isMacroOperator()) {
                write_trampoline_for_securely_translated_macro(method, secure_method_name, stream);
            } else
                if (NIL != subl_promotions.function_symbol_p(method)) {
                    final SubLObject argument_list = write_trampolines_get_method_arglist_names_only(method);
                    write_trampoline_for_securely_translated_method(method, secure_method_name, argument_list, stream);
                } else {
                    Errors.error($str83$Stuck_on__A_which_is_neither_meth, method);
                }

            cdolist_list_var = cdolist_list_var.rest();
            method = cdolist_list_var.first();
        } 
        return sid_db;
    }

    public static SubLObject write_trampolines_get_method_arglist_names_only(final SubLObject method) {
        final SubLObject raw_arglist = subl_promotions.function_symbol_arglist(method);
        SubLObject arg_list = NIL;
        SubLObject cdolist_list_var = raw_arglist;
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (arg.isCons()) {
                arg = arg.first();
            }
            arg_list = cons(arg, arg_list);
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        } 
        return nreverse(arg_list);
    }

    public static SubLObject write_trampoline_file_header_for_securely_translated_methods(final SubLObject stream) {
        format(stream, $str84$___in_package__cyc___);
        format(stream, $str85$___deflexical__unprovided_trampol);
        return stream;
    }

    public static SubLObject write_trampoline_for_securely_translated_method(final SubLObject method, final SubLObject secure_method_name, final SubLObject argument_list, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        format(stream, $str86$___define__A_, method);
        SubLObject required = argument_list;
        final SubLObject split_point = position($sym87$_OPTIONAL, argument_list, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject optional = NIL;
        if (split_point.isInteger()) {
            required = subseq(argument_list, ZERO_INTEGER, split_point);
            optional = subseq(argument_list, add(split_point, ONE_INTEGER), UNPROVIDED);
        }
        write_trampoline_argument_list(required, optional, stream);
        terpri(stream);
        string_utilities.indent(stream, TWO_INTEGER);
        if (NIL == optional) {
            write_trampoline_invocation_form(secure_method_name, required, stream);
        } else {
            write_trampoline_invocation_form_for_optional_args(secure_method_name, required, optional, stream);
        }
        format(stream, $str88$_____);
        return secure_method_name;
    }

    public static SubLObject write_trampoline_for_securely_translated_macro(final SubLObject method, final SubLObject secure_method_name, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        format(stream, $str89$___defmacro__A___rest_rest_, method);
        terpri(stream);
        string_utilities.indent(stream, TWO_INTEGER);
        write_string($str90$_ret___, stream, UNPROVIDED, UNPROVIDED);
        write_string(secure_method_name, stream, UNPROVIDED, UNPROVIDED);
        write_string($str91$___rest___, stream, UNPROVIDED, UNPROVIDED);
        terpri(stream);
        terpri(stream);
        return secure_method_name;
    }

    public static SubLObject write_trampoline_argument_list(final SubLObject required, final SubLObject optional, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        SubLObject need_spaceP = NIL;
        write_string($str92$_, stream, UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var = required;
        SubLObject req = NIL;
        req = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != need_spaceP) {
                write_string($$$_, stream, UNPROVIDED, UNPROVIDED);
            }
            write_string(symbol_name(req), stream, UNPROVIDED, UNPROVIDED);
            need_spaceP = T;
            cdolist_list_var = cdolist_list_var.rest();
            req = cdolist_list_var.first();
        } 
        if (NIL != list_utilities.sublisp_boolean(optional)) {
            if (NIL != need_spaceP) {
                write_string($$$_, stream, UNPROVIDED, UNPROVIDED);
            }
            write_string($str94$_optional, stream, UNPROVIDED, UNPROVIDED);
            cdolist_list_var = optional;
            SubLObject opt = NIL;
            opt = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                write_string($str95$__, stream, UNPROVIDED, UNPROVIDED);
                write_string(symbol_name(opt), stream, UNPROVIDED, UNPROVIDED);
                write_string($str96$__unprovided_trampoline_arg__, stream, UNPROVIDED, UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                opt = cdolist_list_var.first();
            } 
        }
        write_string($str97$_, stream, UNPROVIDED, UNPROVIDED);
        return required;
    }

    public static SubLObject write_trampoline_invocation_form(final SubLObject secure_method_name, final SubLObject args, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        format(stream, $str98$_ret___A, secure_method_name);
        SubLObject cdolist_list_var = args;
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            write_string($$$_, stream, UNPROVIDED, UNPROVIDED);
            write_string(symbol_name(arg), stream, UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        } 
        write_string($str99$__, stream, UNPROVIDED, UNPROVIDED);
        return secure_method_name;
    }

    public static SubLObject write_trampoline_invocation_form_for_optional_args(final SubLObject secure_method_name, final SubLObject required, final SubLObject optional, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        write_string($str100$_pcond, stream, UNPROVIDED, UNPROVIDED);
        SubLObject args = copy_list(required);
        SubLObject cdolist_list_var = optional;
        SubLObject opt = NIL;
        opt = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            terpri(stream);
            string_utilities.indent(stream, FOUR_INTEGER);
            write_string($str101$__eq__unprovided_trampoline_arg__, stream, UNPROVIDED, UNPROVIDED);
            write_string(symbol_name(opt), stream, UNPROVIDED, UNPROVIDED);
            write_string($str102$__, stream, UNPROVIDED, UNPROVIDED);
            write_trampoline_invocation_form(secure_method_name, args, stream);
            write_string($str97$_, stream, UNPROVIDED, UNPROVIDED);
            args = append(args, list(opt));
            cdolist_list_var = cdolist_list_var.rest();
            opt = cdolist_list_var.first();
        } 
        terpri(stream);
        string_utilities.indent(stream, FOUR_INTEGER);
        write_string($str103$_t_, stream, UNPROVIDED, UNPROVIDED);
        write_trampoline_invocation_form(secure_method_name, args, stream);
        write_string($str97$_, stream, UNPROVIDED, UNPROVIDED);
        write_string($str97$_, stream, UNPROVIDED, UNPROVIDED);
        return secure_method_name;
    }

    public static SubLObject declare_secure_translation_file() {
        declareFunction(me, "translator_security_level_p", "TRANSLATOR-SECURITY-LEVEL-P", 1, 0, false);
        declareFunction(me, "secure_id_database_print_function_trampoline", "SECURE-ID-DATABASE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "secure_id_database_p", "SECURE-ID-DATABASE-P", 1, 0, false);
        new secure_translation.$secure_id_database_p$UnaryFunction();
        declareFunction(me, "sid_db_security_level", "SID-DB-SECURITY-LEVEL", 1, 0, false);
        declareFunction(me, "sid_db_id_module_table", "SID-DB-ID-MODULE-TABLE", 1, 0, false);
        declareFunction(me, "sid_db_module_id_table", "SID-DB-MODULE-ID-TABLE", 1, 0, false);
        declareFunction(me, "sid_db_id_method_table", "SID-DB-ID-METHOD-TABLE", 1, 0, false);
        declareFunction(me, "sid_db_method_id_table", "SID-DB-METHOD-ID-TABLE", 1, 0, false);
        declareFunction(me, "sid_db_id_global_table", "SID-DB-ID-GLOBAL-TABLE", 1, 0, false);
        declareFunction(me, "sid_db_global_id_table", "SID-DB-GLOBAL-ID-TABLE", 1, 0, false);
        declareFunction(me, "sid_db_symbol_exceptions", "SID-DB-SYMBOL-EXCEPTIONS", 1, 0, false);
        declareFunction(me, "sid_db_id_symbol_table", "SID-DB-ID-SYMBOL-TABLE", 1, 0, false);
        declareFunction(me, "sid_db_symbol_id_table", "SID-DB-SYMBOL-ID-TABLE", 1, 0, false);
        declareFunction(me, "_csetf_sid_db_security_level", "_CSETF-SID-DB-SECURITY-LEVEL", 2, 0, false);
        declareFunction(me, "_csetf_sid_db_id_module_table", "_CSETF-SID-DB-ID-MODULE-TABLE", 2, 0, false);
        declareFunction(me, "_csetf_sid_db_module_id_table", "_CSETF-SID-DB-MODULE-ID-TABLE", 2, 0, false);
        declareFunction(me, "_csetf_sid_db_id_method_table", "_CSETF-SID-DB-ID-METHOD-TABLE", 2, 0, false);
        declareFunction(me, "_csetf_sid_db_method_id_table", "_CSETF-SID-DB-METHOD-ID-TABLE", 2, 0, false);
        declareFunction(me, "_csetf_sid_db_id_global_table", "_CSETF-SID-DB-ID-GLOBAL-TABLE", 2, 0, false);
        declareFunction(me, "_csetf_sid_db_global_id_table", "_CSETF-SID-DB-GLOBAL-ID-TABLE", 2, 0, false);
        declareFunction(me, "_csetf_sid_db_symbol_exceptions", "_CSETF-SID-DB-SYMBOL-EXCEPTIONS", 2, 0, false);
        declareFunction(me, "_csetf_sid_db_id_symbol_table", "_CSETF-SID-DB-ID-SYMBOL-TABLE", 2, 0, false);
        declareFunction(me, "_csetf_sid_db_symbol_id_table", "_CSETF-SID-DB-SYMBOL-ID-TABLE", 2, 0, false);
        declareFunction(me, "make_secure_id_database", "MAKE-SECURE-ID-DATABASE", 0, 1, false);
        declareFunction(me, "visit_defstruct_secure_id_database", "VISIT-DEFSTRUCT-SECURE-ID-DATABASE", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_secure_id_database_method", "VISIT-DEFSTRUCT-OBJECT-SECURE-ID-DATABASE-METHOD", 2, 0, false);
        declareFunction(me, "new_secure_id_database", "NEW-SECURE-ID-DATABASE", 1, 0, false);
        declareFunction(me, "set_secure_id_database_slots", "SET-SECURE-ID-DATABASE-SLOTS", 11, 0, false);
        declareFunction(me, "destroy_secure_id_database", "DESTROY-SECURE-ID-DATABASE", 1, 0, false);
        declareFunction(me, "secure_id_database_security_level", "SECURE-ID-DATABASE-SECURITY-LEVEL", 1, 0, false);
        declareFunction(me, "secure_id_database_lookup_module", "SECURE-ID-DATABASE-LOOKUP-MODULE", 2, 0, false);
        declareFunction(me, "secure_id_database_lookup_method", "SECURE-ID-DATABASE-LOOKUP-METHOD", 2, 0, false);
        declareFunction(me, "secure_id_database_lookup_global", "SECURE-ID-DATABASE-LOOKUP-GLOBAL", 2, 0, false);
        declareFunction(me, "secure_id_database_excepted_symbolP", "SECURE-ID-DATABASE-EXCEPTED-SYMBOL?", 2, 0, false);
        declareFunction(me, "secure_id_database_lookup_symbol", "SECURE-ID-DATABASE-LOOKUP-SYMBOL", 2, 0, false);
        declareFunction(me, "secure_id_database_symbol_name", "SECURE-ID-DATABASE-SYMBOL-NAME", 2, 0, false);
        declareFunction(me, "secure_id_database_name_sensitive_symbolP", "SECURE-ID-DATABASE-NAME-SENSITIVE-SYMBOL?", 1, 0, false);
        declareFunction(me, "sublisp_symbol_p", "SUBLISP-SYMBOL-P", 1, 0, false);
        declareFunction(me, "save_secure_id_database_to_file", "SAVE-SECURE-ID-DATABASE-TO-FILE", 2, 0, false);
        declareFunction(me, "save_secure_id_database", "SAVE-SECURE-ID-DATABASE", 2, 0, false);
        declareFunction(me, "construct_recipe_for_secure_id_database", "CONSTRUCT-RECIPE-FOR-SECURE-ID-DATABASE", 1, 0, false);
        declareFunction(me, "restore_secure_id_database_from_file", "RESTORE-SECURE-ID-DATABASE-FROM-FILE", 1, 0, false);
        declareFunction(me, "restore_secure_id_database", "RESTORE-SECURE-ID-DATABASE", 1, 0, false);
        declareFunction(me, "load_secure_id_database_recipe", "LOAD-SECURE-ID-DATABASE-RECIPE", 1, 0, false);
        declareFunction(me, "sid_db_recipe_get", "SID-DB-RECIPE-GET", 2, 1, false);
        declareFunction(me, "interpret_secure_id_database_recipe_by_version", "INTERPRET-SECURE-ID-DATABASE-RECIPE-BY-VERSION", 2, 0, false);
        declareFunction(me, "interpret_secure_id_database_recipe_v1p0", "INTERPRET-SECURE-ID-DATABASE-RECIPE-V1P0", 1, 0, false);
        declareFunction(me, "fetch_valid_secure_id_database_table", "FETCH-VALID-SECURE-ID-DATABASE-TABLE", 2, 0, false);
        declareFunction(me, "secure_id_database_known_moduleP", "SECURE-ID-DATABASE-KNOWN-MODULE?", 2, 0, false);
        declareFunction(me, "secure_id_database_known_methodP", "SECURE-ID-DATABASE-KNOWN-METHOD?", 2, 0, false);
        declareFunction(me, "secure_id_database_known_globalP", "SECURE-ID-DATABASE-KNOWN-GLOBAL?", 2, 0, false);
        declareFunction(me, "secure_id_database_module_id", "SECURE-ID-DATABASE-MODULE-ID", 2, 0, false);
        declareFunction(me, "secure_id_database_method_id", "SECURE-ID-DATABASE-METHOD-ID", 2, 0, false);
        declareFunction(me, "secure_id_database_global_id", "SECURE-ID-DATABASE-GLOBAL-ID", 2, 0, false);
        declareFunction(me, "secure_id_database_symbol_id", "SECURE-ID-DATABASE-SYMBOL-ID", 2, 0, false);
        declareFunction(me, "secure_id_database_populate_symbol_exceptions", "SECURE-ID-DATABASE-POPULATE-SYMBOL-EXCEPTIONS", 1, 0, false);
        declareFunction(me, "secure_id_database_note_symbol_exception", "SECURE-ID-DATABASE-NOTE-SYMBOL-EXCEPTION", 2, 0, false);
        declareFunction(me, "current_system_translation_secure_module_lookup", "CURRENT-SYSTEM-TRANSLATION-SECURE-MODULE-LOOKUP", 1, 0, false);
        declareFunction(me, "current_system_translation_secure_method_lookup", "CURRENT-SYSTEM-TRANSLATION-SECURE-METHOD-LOOKUP", 1, 0, false);
        declareFunction(me, "current_system_translation_secure_global_lookup", "CURRENT-SYSTEM-TRANSLATION-SECURE-GLOBAL-LOOKUP", 1, 0, false);
        declareFunction(me, "current_system_translation_secure_symbol_lookup", "CURRENT-SYSTEM-TRANSLATION-SECURE-SYMBOL-LOOKUP", 1, 0, false);
        declareFunction(me, "sid_db_symbol_exceptions_add_all", "SID-DB-SYMBOL-EXCEPTIONS-ADD-ALL", 1, 0, false);
        declareFunction(me, "sid_db_symbol_exceptions_add_for_api", "SID-DB-SYMBOL-EXCEPTIONS-ADD-FOR-API", 1, 0, false);
        declareFunction(me, "sid_db_symbol_exceptions_add_symbols", "SID-DB-SYMBOL-EXCEPTIONS-ADD-SYMBOLS", 2, 0, false);
        declareFunction(me, "sid_db_symbol_exceptions_add_for_external", "SID-DB-SYMBOL-EXCEPTIONS-ADD-FOR-EXTERNAL", 1, 0, false);
        declareFunction(me, "sid_db_symbol_exceptions_add_for_system_parameters", "SID-DB-SYMBOL-EXCEPTIONS-ADD-FOR-SYSTEM-PARAMETERS", 1, 0, false);
        declareFunction(me, "sid_db_symbol_exceptions_add_for_html_handlers", "SID-DB-SYMBOL-EXCEPTIONS-ADD-FOR-HTML-HANDLERS", 1, 0, false);
        declareFunction(me, "sid_db_symbol_exceptions_add_for_kb_function_symbols", "SID-DB-SYMBOL-EXCEPTIONS-ADD-FOR-KB-FUNCTION-SYMBOLS", 1, 0, false);
        declareFunction(me, "sid_db_symbol_exceptions_add_for_standard_libraries", "SID-DB-SYMBOL-EXCEPTIONS-ADD-FOR-STANDARD-LIBRARIES", 1, 0, false);
        declareFunction(me, "sid_db_symbol_exceptions_add_for_misc_symbols", "SID-DB-SYMBOL-EXCEPTIONS-ADD-FOR-MISC-SYMBOLS", 1, 0, false);
        declareFunction(me, "sid_db_symbol_exceptions_register_and_retranslate_misc", "SID-DB-SYMBOL-EXCEPTIONS-REGISTER-AND-RETRANSLATE-MISC", 0, 1, false);
        declareFunction(me, "gather_all_subl_functions_mentioned_in_file", "GATHER-ALL-SUBL-FUNCTIONS-MENTIONED-IN-FILE", 1, 1, false);
        declareFunction(me, "gather_all_subl_functions_mentioned_in_files", "GATHER-ALL-SUBL-FUNCTIONS-MENTIONED-IN-FILES", 1, 1, false);
        declareFunction(me, "all_securely_translated_methods_requiring_trampolines", "ALL-SECURELY-TRANSLATED-METHODS-REQUIRING-TRAMPOLINES", 2, 0, false);
        declareFunction(me, "write_trampolines_for_securely_translated_methods", "WRITE-TRAMPOLINES-FOR-SECURELY-TRANSLATED-METHODS", 2, 1, false);
        declareFunction(me, "write_trampolines_get_method_arglist_names_only", "WRITE-TRAMPOLINES-GET-METHOD-ARGLIST-NAMES-ONLY", 1, 0, false);
        declareFunction(me, "write_trampoline_file_header_for_securely_translated_methods", "WRITE-TRAMPOLINE-FILE-HEADER-FOR-SECURELY-TRANSLATED-METHODS", 1, 0, false);
        declareFunction(me, "write_trampoline_for_securely_translated_method", "WRITE-TRAMPOLINE-FOR-SECURELY-TRANSLATED-METHOD", 3, 1, false);
        declareFunction(me, "write_trampoline_for_securely_translated_macro", "WRITE-TRAMPOLINE-FOR-SECURELY-TRANSLATED-MACRO", 2, 1, false);
        declareFunction(me, "write_trampoline_argument_list", "WRITE-TRAMPOLINE-ARGUMENT-LIST", 2, 1, false);
        declareFunction(me, "write_trampoline_invocation_form", "WRITE-TRAMPOLINE-INVOCATION-FORM", 2, 1, false);
        declareFunction(me, "write_trampoline_invocation_form_for_optional_args", "WRITE-TRAMPOLINE-INVOCATION-FORM-FOR-OPTIONAL-ARGS", 3, 1, false);
        return NIL;
    }

    public static SubLObject init_secure_translation_file() {
        deflexical("*TRANSLATOR-SECURITY-LEVELS*", $list0);
        defconstant("*DTP-SECURE-ID-DATABASE*", SECURE_ID_DATABASE);
        deflexical("*SECURE-ID-DATABASE-TYPE-MARKER*", $str58$c3edef08_eef1_11dd_9624_00219b50e);
        deflexical("*STANDARD-LIBRARY-SYMBOLS-NOT-TO-OBFUSCATE*", $list77);
        deflexical("*MISC-SYMBOLS-NOT-TO-OBFUSCATE*", $list78);
        return NIL;
    }

    public static SubLObject setup_secure_translation_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_secure_id_database$.getGlobalValue(), symbol_function(SECURE_ID_DATABASE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list9);
        def_csetf(SID_DB_SECURITY_LEVEL, _CSETF_SID_DB_SECURITY_LEVEL);
        def_csetf(SID_DB_ID_MODULE_TABLE, _CSETF_SID_DB_ID_MODULE_TABLE);
        def_csetf(SID_DB_MODULE_ID_TABLE, _CSETF_SID_DB_MODULE_ID_TABLE);
        def_csetf(SID_DB_ID_METHOD_TABLE, _CSETF_SID_DB_ID_METHOD_TABLE);
        def_csetf(SID_DB_METHOD_ID_TABLE, _CSETF_SID_DB_METHOD_ID_TABLE);
        def_csetf(SID_DB_ID_GLOBAL_TABLE, _CSETF_SID_DB_ID_GLOBAL_TABLE);
        def_csetf(SID_DB_GLOBAL_ID_TABLE, _CSETF_SID_DB_GLOBAL_ID_TABLE);
        def_csetf(SID_DB_SYMBOL_EXCEPTIONS, _CSETF_SID_DB_SYMBOL_EXCEPTIONS);
        def_csetf(SID_DB_ID_SYMBOL_TABLE, _CSETF_SID_DB_ID_SYMBOL_TABLE);
        def_csetf(SID_DB_SYMBOL_ID_TABLE, _CSETF_SID_DB_SYMBOL_ID_TABLE);
        identity(SECURE_ID_DATABASE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_secure_id_database$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_SECURE_ID_DATABASE_METHOD));
        return NIL;
    }

    private static SubLObject _constant_78_initializer() {
        return list(new SubLObject[]{ makeSymbol("*CACHE-INFERENCE-RESULTS*"), makeSymbol("*HL-FAILURE-BACKCHAINING*"), makeSymbol("*ENABLE-REWRITE-OF-PROPAGATION?*"), makeSymbol("*FORWARD-PROPAGATE-FROM-NEGATIONS*"), makeSymbol("KB-STATISTICS"), makeSymbol("SERVER-SUMMARY"), makeSymbol("HALT-CYC-IMAGE"), makeSymbol("ALL"), makeSymbol("NONE"), makeSymbol("*INIT-FILE-LOADED?*"), makeSymbol("*THESAURUS-FILENAME*"), makeSymbol("*THESAURUS-FILENAME-EXTENSION*"), makeSymbol("*THESAURUS-SUBDIRECTORIES*"), makeSymbol("INITIALIZE-AGENDA"), makeSymbol("INITIALIZE-TRANSCRIPT-HANDLING"), makeSymbol("LOAD-SYSTEM-PARAMETERS"), makeSymbol("LOAD-THESAURUS-INIT-FILE"), makeSymbol("PROBE-FILE"), makeSymbol("SYSTEM-CODE-INITIALIZATIONS"), makeSymbol("SYSTEM-KB-INITIALIZATIONS"), makeSymbol("LOAD-API"), makeSymbol("CORE-KB-FINALIZATION"), makeSymbol("CORE-KB-FINISH-BOOTSTRAPPING"), makeSymbol("CORE-KB-FINISH-DEFINITIONS"), makeSymbol("CORE-KB-INITIALIZATION"), makeSymbol("CORE-KB-START-BOOTSTRAPPING"), makeSymbol("CORE-KB-START-DEFINITIONS"), makeSymbol("CYC-FUNCTION-TO-ARG"), makeSymbol("FI-ASSERT-INT"), makeSymbol("HL-EXTERNAL-ID-STRING-P"), makeSymbol("HL-FIND-OR-CREATE-NART"), makeSymbol("LOW-ASSERT-LITERAL"), makeSymbol("RELEVANT-MT?"), makeSymbol("DUMP-STANDARD-KB"), makeSymbol("DUMP-KB"), makeSymbol("LOAD-KB"), makeSymbol("*STANDARD-INPUT*"), makeSymbol("READ-IGNORING-ERRORS"), makeSymbol("*INFERENCE-TRACE-PORT*"), makeSymbol("API-PORT"), makeSymbol("API-SERVER-TOP-LEVEL"), makeSymbol("CFASL-PORT"), makeSymbol("CFASL-SERVER-TOP-LEVEL"), makeSymbol("CYC-HTML-FEATURE"), makeSymbol("CYC-THESAURUS-FEATURE"), makeSymbol("ENABLE-TCP-SERVER"), makeSymbol("FINISH-OUTPUT"), makeSymbol("HTML-PORT"), makeSymbol("HTTP-PORT"), makeSymbol("HTML-SERVER-TOP-LEVEL"), makeSymbol("HTTP-SERVER-TOP-LEVEL"), makeSymbol("ROBUST-ENABLE-TCP-SERVER"), makeSymbol("START-AGENDA"), makeSymbol("THESAURUS-MANAGER-ACCESS-PROTOCOL-SERVER-TOP-LEVEL"), makeSymbol("TMAP-PORT"), makeSymbol("HOSTNAME"), makeSymbol("*EVAL-IN-API?*"), makeSymbol("*SILENT-PROGRESS?*"), makeSymbol("CYC-HOME-FILENAME"), makeSymbol("HALT-AGENDA"), makeSymbol("LOAD-INFERENCE-TESTS"), makeSymbol("SET-COMMUNICATION-MODE"), makeSymbol("LOAD-INFERENCE-TESTS"), makeSymbol("DEF-INFERENCE-TEST"), makeSymbol("DEFINE-INFERENCE-TEST"), makeSymbol("DEFINE-SUBTEST"), makeSymbol("CYC-HOME-FILENAME"), makeSymbol("LOAD-ALL-CYC-TESTS"), makeSymbol("RUN-ALL-CYC-TESTS"), makeSymbol("RUN-CYC-TESTS"), makeSymbol("RUN-ALL-INFERENCE-UNIT-TESTS"), makeSymbol("RUN-ALL-REMOVAL-MODULE-TESTS"), makeSymbol("RUN-ALL-EVALUATABLE-RELATION-TESTS"), makeSymbol("*SECONDS-IN-A-NON-LEAP-YEAR*"), makeSymbol("CLOSED-QUERY-SUCCESS-TOKEN"), makeSymbol("DEFINE-EVALUATABLE-PREDICATE-TEST"), makeSymbol("DEFINE-SIMPLE-EVALUATABLE-FUNCTION-TEST-BLOCK"), makeSymbol("DEFINE-SIMPLE-EVALUATABLE-PREDICATE-TEST-BLOCK"), makeSymbol("EQUALS-EL?"), makeSymbol("HTML-ESCAPED-TO-UNICODE-VECTOR"), makeSymbol("LENGTH="), makeSymbol("LENGTH>="), makeSymbol("LENGTHS="), makeSymbol("NEW-INFERENCE-ERROR-SUSPEND-STATUS"), makeSymbol("NOT-EQ"), makeSymbol("TREE-MATCHES-PATTERN"), makeSymbol("UNICODE-VECTOR-TO-DISPLAY"), makeSymbol("DECLARE-CYC-TEST-FILE"), makeSymbol("DEFINE-EVALUATABLE-FUNCTION-TEST"), makeSymbol("DEFINE-INFERENCE-UNIT-TEST"), makeSymbol("DEFINE-TRANSFORMATION-MODULE-TEST"), makeSymbol("LOAD-ALL-KB-CONTENT-POST-BUILD-TESTS"), makeSymbol("PWHEN-FEATURE"), makeSymbol("*TRANSFORMATION-DEPTH-COMPUTATION*"), makeSymbol("GENL-CARDINALITY"), makeSymbol("PROBLEM-MIN-TRANSFORMATION-DEPTH"), makeSymbol("PROBLEM-MIN-TRANSFORMATION-DEPTH"), makeSymbol("PROBLEM-PROOF-COUNT"), makeSymbol("PROBLEM-SOLE-CLAUSE"), makeSymbol("PROBLEM-STORE-UNMANIFESTED-NON-FOCAL-COUNT"), makeSymbol("QUERY-ABORT"), makeSymbol("RESIDUAL-TRANSFORMATION-LINK-RESIDUAL-PROBLEM"), makeSymbol("RESIDUAL-TRANSFORMATION-LINK-RESIDUAL-PROBLEM"), makeSymbol("SPEC-CARDINALITY"), makeSymbol("STRATEGICALLY-PENDING-PROBLEM-P"), makeSymbol("STRATEGICALLY-POSSIBLE-PROBLEM-P"), makeSymbol("STRATEGICALLY-POSSIBLE-PROBLEM-P"), makeSymbol("TACTICALLY-PENDING-PROBLEM-P"), makeSymbol("TACTICALLY-PENDING-PROBLEM-P"), makeSymbol("TACTICALLY-POSSIBLE-PROBLEM-P"), makeSymbol("TRANSFORMATION-RULE-SUCCESS-COUNT"), makeSymbol("CONSTANT-SUID"), makeSymbol("*ACCUMULATING-AT-VIOLATIONS?*"), makeSymbol("*ACCUMULATING-WFF-VIOLATIONS?*"), makeSymbol("*ADDITIONAL-FORT-TYPING-COLLECTIONS*"), makeSymbol("*ADMIT-NART-MTS-IN-MT-GAFS-IN-MT-MT?*"), makeSymbol("*ANECT-MT*"), makeSymbol("*ASSUME-SBHL-EXTENSIONS-NONEMPTY*"), makeSymbol("*AT-ADMIT-CONSISTENT-NAUTS?*"), makeSymbol("*AT-APPLY-NECESSARY-DEFNS?*"), makeSymbol("*AT-CHECK-ARG-GENLS?*"), makeSymbol("*AT-CHECK-ARG-ISA?*"), makeSymbol("*AT-CHECK-GENL-INVERSES?*"), makeSymbol("*AT-CHECK-GENL-PREDS?*"), makeSymbol("*AT-CHECK-INTER-ARG-GENL?*"), makeSymbol("*AT-CHECK-INTER-ARG-ISA?*"), makeSymbol("*AT-CHECK-NON-CONSTANT-INTER-ARG-ISA?*"), makeSymbol("*AT-CHECK-NOT-GENLS-DISJOINT?*"), makeSymbol("*AT-CHECK-NOT-ISA-DISJOINT?*"), makeSymbol("*AT-CHECK-NOT-MDW?*"), makeSymbol("*AT-CHECK-NOT-SDC?*"), makeSymbol("*AT-POSSIBLY-CHECK-DEFINING-MTS?*"), makeSymbol("*AT-SOME-ARG-ISA-REQUIRED?*"), makeSymbol("*AT-TRACE-LEVEL*"), makeSymbol("*BREAK-ON-FAILURE*"), makeSymbol("*CACHE-INFERENCE-RESULTS*"), makeSymbol("*CACHED-GENL-PREDICATES*"), makeSymbol("*CACHED-GENL-PREDICATES-SET*"), makeSymbol("*CACHED-GENLS*"), makeSymbol("*CACHED-GENLS-SET*"), makeSymbol("*CACHED-ISAS*"), makeSymbol("*CACHED-ISAS-SET*"), makeSymbol("*CANONICALIZE-ALL-SENTENCE-ARGS?*"), makeSymbol("*CATCH-ERROR-MESSAGE-TARGET*"), makeSymbol("*CHECK-WFF-COHERENCE?*"), makeSymbol("*CHEMISTRY-LEXICAL-MT*"), makeSymbol("*CIRCULAR-COMPLEXITY-COUNT-LIMIT*"), makeSymbol("*CONTINUE-CERROR?*"), makeSymbol("*CONTROL-1*"), makeSymbol("*CONTROL-2*"), makeSymbol("*CONTROL-3*"), makeSymbol("*CONTROL-4*"), makeSymbol("*CONTROL-5*"), makeSymbol("*CONTROL-6*"), makeSymbol("*CONTROL?*"), makeSymbol("*CORE-MT-FLOOR*"), makeSymbol("*CURRENT-TEST*"), makeSymbol("*DEBUG-CONTINUE*"), makeSymbol("*DEFINITIONAL-FORT-TYPING-COLLECTIONS*"), makeSymbol("*DEFN-TRACE-LEVEL*"), makeSymbol("*DETERMINERS-BEFORE-VARIABLES*"), makeSymbol("*EL-SUPPORTS-CONTRACTIONS?*"), makeSymbol("*EL-SUPPORTS-DOT-SYNTAX?*"), makeSymbol("*ENCAPSULATE-INTENSIONAL-FORMULA?*"), makeSymbol("*ENFORCE-ONLY-DEFINITIONAL-GAFS-IN-VOCAB-MT?*"), makeSymbol("*EVALUATABLE-BACKCHAIN-ENABLED*"), makeSymbol("*EXPRESS-AS-ASYMMETRIC?*"), makeSymbol("*EXPRESS-AS-DISJOINT-WITH?*"), makeSymbol("*EXPRESS-AS-GENLS?*"), makeSymbol("*EXPRESS-AS-IRREFLEXIVE?*"), makeSymbol("*EXPRESS-AS-NEGATION-INVERSE?*"), makeSymbol("*EXPRESS-AS-NEGATION-PREDICATES?*"), makeSymbol("*EXPRESS-AS-REFLEXIVE?*"), makeSymbol("*EXPRESS-AS-RELATION-TYPE?*"), makeSymbol("*EXPRESS-AS-RULE-MACRO?*"), makeSymbol("*EXPRESS-AS-SYMMETRIC?*"), makeSymbol("*EXPRESS-AS-TRANSITIVE?*"), makeSymbol("*FI-ERROR*"), makeSymbol("*FI-WARNING*"), makeSymbol("*FORWARD-PROPAGATE-FROM-NEGATIONS*"), makeSymbol("*GT-MAX-NODES-DIRECTION*"), makeSymbol("*HL-FAILURE-BACKCHAINING*"), makeSymbol("*IMPLICIT-FORT-TYPING-COLLECTIONS*"), makeSymbol("*IMPLICITIFY-UNIVERSALS?*"), makeSymbol("*INCLUDE-AT-CONSTRAINT-GAF?*"), makeSymbol("*INDEX-CONVERT-COMPLEX-THRESHOLD*"), makeSymbol("*INDEX-CONVERT-SIMPLE-THRESHOLD*"), makeSymbol("*INDEX-OVERLAP-ENABLED?*"), makeSymbol("*INHIBIT-CYCLIC-COMMUTATIVE-IN-ARGS?*"), makeSymbol("*IT-BACKCHAIN*"), makeSymbol("*IT-DEPTH*"), makeSymbol("*IT-NUMBER*"), makeSymbol("*IT-TIME*"), makeSymbol("*IT-VERBOSE*"), makeSymbol("*KNOWN-ANTECEDENT-RULE-ENABLED?*"), makeSymbol("*LEXICON-LOOKUP-MT*"), makeSymbol("*LOOKUP-OVERLAP-WATERMARK*"), makeSymbol("*MT*"), makeSymbol("*MT-MT*"), makeSymbol("*MUST-ENFORCE-SEMANTICS?*"), makeSymbol("*NL-TRIE-ROTATION-INDEX*"), makeSymbol("*NOTING-AT-VIOLATIONS?*"), makeSymbol("*PARAPHRASE-MODE*"), makeSymbol("*PPH-COERCE-DEFINITE-DESCRIPTIONS-FOR-UNLEXIFIED-TERMS?*"), makeSymbol("*PPH-DOMAIN-MT*"), makeSymbol("*PPH-EXPAND-E-NOTATION-FOR-FLOATS?*"), makeSymbol("*PPH-LANGUAGE-MT*"), makeSymbol("*PPH-LINK-ARG0?*"), makeSymbol("*PPH-QUANTIFY-VARS?*"), makeSymbol("*PPH-USE-BULLETED-LISTS?*"), makeSymbol("*PPH-USE-SMART-VARIABLE-REPLACEMENT?*"), makeSymbol("*PPH-USE-WHOM?*"), makeSymbol("*READ-REQUIRE-CONSTANT-EXISTS*"), makeSymbol("*RESIDUAL-TRANSFORMATION-LINKS-ENABLED?*"), makeSymbol("*REWRITE-MODULES*"), makeSymbol("*SBHL-TEMPORALITY-ACTIVE?*"), makeSymbol("*SDC-COMMON-SPEC-EXCEPTION?*"), makeSymbol("*SDC-EXCEPTION-TRANSFERS-THRU-SPECS?*"), makeSymbol("*SIMPLIFY-SENTENCE?*"), makeSymbol("*SIMPLIFY-SEQUENCE-VARS-USING-KB-ARITY?*"), makeSymbol("*SKOLEM-AXIOM-TABLE*"), makeSymbol("*STANDARDIZE-VARIABLES-MEMORY*"), makeSymbol("*TERM-FUNCTIONAL-COMPLEXITY-CUTOFF*"), makeSymbol("*TEST-DIRECTION*"), makeSymbol("*TEST-STATUS*"), makeSymbol("*THE-CYCLIST*"), makeSymbol("*KE-PURPOSE*"), makeSymbol("*CB-CONSTANT-HISTORY*"), makeSymbol("*CB-NAT-HISTORY*"), makeSymbol("*CB-SENTENCE-HISTORY*"), makeSymbol("*CB-ASSERTION-HISTORY*"), makeSymbol("*PPH-REPLACE-BULLETED-LIST-TAGS?*"), makeSymbol("*PARAPHRASE-PRECISION*"), makeSymbol("*PPH-TERSE-MT-SCOPE?*"), makeSymbol("*PPH-MAXIMIZE-LINKS?*"), makeSymbol("*PPH-USE-TITLE-CAPITALIZATION?*"), makeSymbol("*PPH-USE-INDEXICAL-DATES?*"), makeSymbol("*PPH-ADDRESSEE*"), makeSymbol("*PPH-SPEAKER*"), makeSymbol("*TVA-PRECOMPUTE-CLOSURE-THRESHOLD*"), makeSymbol("*UNBOUND-RULE-BACKCHAIN-ENABLED*"), makeSymbol("*USE-TRANSCRIPT?*"), makeSymbol("*VALIDATE-EXPANSIONS?*"), makeSymbol("*WFF-VIOLATION-DATA-TERSE?*"), makeSymbol("*WITHIN-ASK*"), makeSymbol("1+"), makeSymbol("ABORT-CURRENT-CONTROLLING-INFERENCE"), makeSymbol("ALL-CONSTANTS"), makeSymbol("ALL-CONTIGUOUS-AFTER"), makeSymbol("ALL-CONTIGUOUS-AFTER-INVERSE"), makeSymbol("ALL-COTEMPORAL"), makeSymbol("ALL-DENOTS-OF-STRING"), makeSymbol("ALL-ENDS-AFTER-ENDING-OF"), makeSymbol("ALL-ENDS-AFTER-ENDING-OF-INVERSE"), makeSymbol("ALL-ENDS-AFTER-STARTING-OF"), makeSymbol("ALL-ENDS-AFTER-STARTING-OF-INVERSE"), makeSymbol("ALL-ENDS-DURING"), makeSymbol("ALL-ENDS-DURING-INVERSE"), makeSymbol("ALL-LEXICON-STRING-PREDICATES"), makeSymbol("ALL-NEGATION-INVERSES"), makeSymbol("ALL-NEGATION-PREDICATES"), makeSymbol("ALL-NEGATION-PREDS"), makeSymbol("ALL-OVERLAPS-START"), makeSymbol("ALL-OVERLAPS-START-INVERSE"), makeSymbol("ALL-SPEC-PREDS"), makeSymbol("ALL-STARTS-AFTER-ENDING-OF"), makeSymbol("ALL-STARTS-AFTER-ENDING-OF-INVERSE"), makeSymbol("ALL-STARTS-AFTER-STARTING-OF"), makeSymbol("ALL-STARTS-AFTER-STARTING-OF-INVERSE"), makeSymbol("ALL-STARTS-DURING"), makeSymbol("ALL-STARTS-DURING-INVERSE"), makeSymbol("ALL-TEMPORAL-BOUNDS-CONTAIN"), makeSymbol("ALL-TEMPORAL-BOUNDS-CONTAIN-INVERSE"), makeSymbol("ALL-TEMPORAL-BOUNDS-IDENTICAL"), makeSymbol("ALL-TEMPORAL-BOUNDS-INTERSECT"), makeSymbol("ALL-TEMPORALLY-COORIGINATING"), makeSymbol("ALL-TEMPORALLY-COTERMINAL"), makeSymbol("ALL-TEMPORALLY-FINISHED-BY"), makeSymbol("ALL-TEMPORALLY-FINISHED-BY-INVERSE"), makeSymbol("ALL-TEMPORALLY-STARTED-BY"), makeSymbol("ALL-TEMPORALLY-STARTED-BY-INVERSE"), makeSymbol("ALL-TEMPORALLY-SUBSUMES"), makeSymbol("ALL-TEMPORALLY-SUBSUMES-INVERSE"), makeSymbol("ANY-SDC-WRT?"), makeSymbol("ASENT-SENSE-AND-MT-TO-PROBLEM-QUERY"), makeSymbol("ASSERT-QUERY-TEST"), makeSymbol("ASSERT-RETURN-UNCANON"), makeSymbol("ASSERTED-SECOND"), makeSymbol("ASSERTED-WHY"), makeSymbol("ASSERTION-ARGUMENTS"), makeSymbol("ASSERTION-CONS"), makeSymbol("ASSERTION-FI-FORMULA"), makeSymbol("ASSERTION-FIND-IF"), makeSymbol("ASSERTION-GATHER"), makeSymbol("ASSERTION-HL-FORMULA"), makeSymbol("ATOMIC-SENTENCE-ARG1"), makeSymbol("ATOMIC-SENTENCE-ARG2"), makeSymbol("ATOMIC-SENTENCE-ARG3"), makeSymbol("ATOMIC-SENTENCE-ARG4"), makeSymbol("ATOMIC-SENTENCE-ARGS"), makeSymbol("ATOMIC-SENTENCE-PREDICATE"), makeSymbol("B-TEST-FORM"), makeSymbol("BELIEF-P"), makeSymbol("BINDING-VERIFY"), makeSymbol("BULL"), makeSymbol("CANON-ASSERT-EQUAL?"), makeSymbol("CANON-ASSERT-ISOMORPHIC?"), makeSymbol("CANON-EQUAL-HL-NAMES?"), makeSymbol("CANON-EQUAL?"), makeSymbol("CANON-FORMS-EQUAL?"), makeSymbol("CANON-QUERY-EQUAL?"), makeSymbol("CANONICALIZE-AND-RETURN-SKOLEM-VARS"), makeSymbol("CANONICALIZE-ASK"), makeSymbol("CANONICALIZE-CYCL"), makeSymbol("CANONICALIZE-CYCL-SENTENCE"), makeSymbol("CANONICALIZE-DEFAULT-EL-VARS"), makeSymbol("CANONICALIZE-PROBLEM-QUERY"), makeSymbol("CANONICALIZE-QUERY"), makeSymbol("CANONICALIZE-QUERY-SENTENCE"), makeSymbol("CANONICALIZE-WF-CYCL"), makeSymbol("CATCH-ERROR-MESSAGE"), makeSymbol("CB-GUESS-FORT"), makeSymbol("CDOHASH"), makeSymbol("CHECK-DENOT"), makeSymbol("CLEAR-SBHL-CACHES"), makeSymbol("CLOSED-QUERY-SUCCESS-TOKEN"), makeSymbol("CMULTIPLE-VALUE-SETQ"), makeSymbol("COLLECTION-P"), makeSymbol("COMPLEX-INDEX-P"), makeSymbol("COMPLEX-INDEXED-TERM-P"), makeSymbol("CONTIGUOUS-AFTER?"), makeSymbol("CONTINUE-INFERENCE"), makeSymbol("COPY-FORMULA"), makeSymbol("COTEMPORAL?"), makeSymbol("CPUSHNEW"), makeSymbol("CSOME"), makeSymbol("CURRENT-CONTROLLING-INFERENCE"), makeSymbol("CURRENT-MT-RELEVANCE-MT"), makeSymbol("CURRENT-REWRITE-MT"), makeSymbol("CURRENTLY-ACTIVE-PROBLEM"), makeSymbol("CURRENTLY-ACTIVE-PROBLEM-STORE"), makeSymbol("CVS-ID"), makeSymbol("CYC-EVALUATE"), makeSymbol("CYC-FIND-OR-CREATE-NART"), makeSymbol("CYCL-PROBLEM-DECODE"), makeSymbol("CYCL-PROBLEM-STORE-DECODE"), makeSymbol("CYCL-SENTENCE-P"), makeSymbol("CYCL-SUBL-SYMBOL-SYMBOL"), makeSymbol("CYCL-TERM-P"), makeSymbol("DATE-KB-LOADED-P"), makeSymbol("DECLARE-CYC-TEST-FILE"), makeSymbol("DEDUCTION-SUPPORTS"), makeSymbol("DEFAULT-EL-VAR?"), makeSymbol("DEFAULT-REFORMULATOR-MODE-PRECEDENCE"), makeSymbol("DEFGLOBAL-PRIVATE"), makeSymbol("DEFINE-EVALUATABLE-FUNCTION-TEST"), makeSymbol("DEFINE-EVALUATABLE-PREDICATE-TEST"), makeSymbol("DEFINE-INFERENCE-UNIT-TEST"), makeSymbol("DEFINE-REMOVAL-MODULE-COST-TEST"), makeSymbol("DEFINE-REMOVAL-MODULE-TEST"), makeSymbol("DEFINE-SIMPLE-EVALUATABLE-FUNCTION-TEST-BLOCK"), makeSymbol("DEFINE-SIMPLE-EVALUATABLE-PREDICATE-TEST-BLOCK"), makeSymbol("DEFINE-SUBTEST"), makeSymbol("DEFINE-TRANSFORMATION-MODULE-TEST"), makeSymbol("DEFLEXICAL-PRIVATE"), makeSymbol("DEFNS"), makeSymbol("DEFPARAMETER"), makeSymbol("DEFPARAMETER-PRIVATE"), makeSymbol("DELETE-FILE"), makeSymbol("DENOT-WS-LOOKUP"), makeSymbol("DENOTS-OF-ABBREVIATION-STRING"), makeSymbol("DENOTS-OF-COMPLEX-WORD-STRING"), makeSymbol("DENOTS-OF-NAME-STRING"), makeSymbol("DENOTS-OF-PARTIAL-STRING"), makeSymbol("DENOTS-OF-STRING&POS"), makeSymbol("DENOTS-OF-STRING&PRED"), makeSymbol("DEPENDENT-NARTS"), makeSymbol("DEREGISTER-SKSI-HL-STORAGE-MODULES-FOR-SKS"), makeSymbol("DEREGISTER-SKSI-REMOVAL-MODULES-FOR-SKS"), makeSymbol("DESTROY-ALL-PROBLEM-STORES"), makeSymbol("DESTROY-INFERENCE"), makeSymbol("DESTROY-PROBLEM-STORE"), makeSymbol("DESTROYING-NEW-PPH-PHRASES-WHEN-DONE"), makeSymbol("DETERMINE-DENOTATION-PREDS"), makeSymbol("DISJOIN"), makeSymbol("DNF-AND-MT-TO-HL-QUERY"), makeSymbol("DO-INDEXED-TERMS"), makeSymbol("DO-INTERMEDIATE-INDEX"), makeSymbol("DO-PREDICATE-EXTENT-INDEX"), makeSymbol("DO-PROBLEM-STORE-LINKS"), makeSymbol("DO-PROBLEM-STORE-PROBLEMS"), makeSymbol("DO-PROBLEM-TACTICS"), makeSymbol("DOUBLETON?"), makeSymbol("DUPLICATE-NART-TUPLES"), makeSymbol("EL-BINARY-FORMULA-P"), makeSymbol("EL-CONTRACTION"), makeSymbol("EL-EXPAND-ALL"), makeSymbol("EL-FIND-NART"), makeSymbol("EL-UNARY-FORMULA-P"), makeSymbol("EL-VERSION"), makeSymbol("EL-WFE?"), makeSymbol("EL-WFF-ASSERTIBLE?"), makeSymbol("EL-WFT?"), makeSymbol("EL-ZERO-ARITY-FORMULA-P"), makeSymbol("ENDS-AFTER-ENDING-OF?"), makeSymbol("ENDS-AFTER-STARTING-OF?"), makeSymbol("ENDS-DURING?"), makeSymbol("ENDS-WITH"), makeSymbol("EQUAL-WRT-SVM"), makeSymbol("ASSERTION-FI-FORMULA"), makeSymbol("EQUALS-EL?"), makeSymbol("EXPRESSION-FIND"), makeSymbol("EXPRESSION-FIND-IF"), makeSymbol("EXPRESSION-GATHER"), makeSymbol("EXPRESSION-NSUBLIS"), makeSymbol("EXPRESSION-NSUBST"), makeSymbol("EXPRESSION-NTRANSFORM"), makeSymbol("EXPRESSION-SUBLIS"), makeSymbol("EXPRESSION-SUBST"), makeSymbol("EXPRESSION-TRANSFORM"), makeSymbol("EXTRACT-EL-CLAUSES"), makeSymbol("FAILING-IT-FORM-IDENTIFIER"), makeSymbol("FAST-DELETE-DUPLICATES"), makeSymbol("FAST-SKOLEM-NART?"), makeSymbol("FI-CREATE-INT"), makeSymbol("FI-KILL-INT"), makeSymbol("FI-REASSERT-INT"), makeSymbol("FI-RENAME-INT"), makeSymbol("FI-RENAME-VARIABLES-INT"), makeSymbol("FI-UNASSERT-INT"), makeSymbol("ASSERTION-FI-FORMULA"), makeSymbol("FIMPLIES"), makeSymbol("FIND-ALL-MATCHES-FOR-REGULAR-EXPRESSION"), makeSymbol("FIND-ASSERTION-CYCL"), makeSymbol("FIND-ASSERTIONS-CYCL"), makeSymbol("FIND-ASSERTIONS-VIA-TL"), makeSymbol("FIND-CONSTANT-BY-GUID"), makeSymbol("FIND-CONSTANT-BY-NAME"), makeSymbol("FIND-IF-NOT"), makeSymbol("FIND-INFERENCE-ANSWER-BY-ID"), makeSymbol("FIND-INFERENCE-BY-IDS"), makeSymbol("FIND-OR-CREATE-ASSERTION"), makeSymbol("FIND-PREVIOUS-INFERENCE-PROBLEM-BY-EL-ASENT"), makeSymbol("FIND-PROBLEM-BY-EL-QUERY"), makeSymbol("FIND-PROBLEM-BY-ID"), makeSymbol("FIND-PROBLEM-BY-QUERY"), makeSymbol("FIND-PROOF-BY-ID"), makeSymbol("FIND-REFORMULATOR-RULE-FOR-RULE-ASSERTION"), makeSymbol("FIND-STRATEGY-BY-ID"), makeSymbol("FIND-VISIBLE-ASSERTION-CYCL"), makeSymbol("FIND-VISIBLE-ASSERTIONS-CYCL"), makeSymbol("FIRST-CHAR"), makeSymbol("FIRST-OF"), makeSymbol("FMAKUNBOUND"), makeSymbol("FORM-VERIFY"), makeSymbol("FORMULA-ARGS"), makeSymbol("FORMULA-ARGS-OK-WRT-TYPE?"), makeSymbol("FORMULA-ARITY>"), makeSymbol("FORMULA-VARIABLES-ARG-CONSTRAINTS"), makeSymbol("FWHEN"), makeSymbol("GAF-ARG"), makeSymbol("GAF-CNF-LITERAL"), makeSymbol("GAF-FORMULA"), makeSymbol("GAF-OK-WRT-ANTI-TRANSITIVE-PRED?"), makeSymbol("GATHER-PREDICATE-RULE-INDEX-IN-ALL-MTS"), makeSymbol("GENERATE-DISAMBIGUATION-PHRASES"), makeSymbol("GENERATE-GENFORMAT-ARG"), makeSymbol("GENERATE-QUESTION"), makeSymbol("GENERATE-REGULAR-STRING"), makeSymbol("GENERATE-SPEECH-ACT"), makeSymbol("GENERATE-TEXT"), makeSymbol("GENLS?"), makeSymbol("GET-CYCLS-FOR-STRING-ESCALATING"), makeSymbol("GET-NL-TRIE"), makeSymbol("GET-STRINGS-OF-TYPE"), makeSymbol("GET-VARIABLE"), makeSymbol("GT-INFERIOR?"), makeSymbol("GT-SUPERIOR-IN-WHAT-MTS"), makeSymbol("GT-SUPERIOR?"), makeSymbol("GTM"), makeSymbol("HL-MODULE-NAME"), makeSymbol("HL-TO-EL"), makeSymbol("HL-VAR-FOR-DEFAULT-EL-VAR"), makeSymbol("HL-WFF?"), makeSymbol("HLMT-EQUAL"), makeSymbol("HTML-GENERATE-PHRASE"), makeSymbol("HTML-GENERATE-TEXT"), makeSymbol("INFERENCE-ABORT"), makeSymbol("INFERENCE-ANSWER-BINDINGS-EQUAL?"), makeSymbol("INFERENCE-ANSWER-JUSTIFICATION-PROOFS"), makeSymbol("INFERENCE-ANSWER-JUSTIFICATIONS"), makeSymbol("INFERENCE-ANSWER-P"), makeSymbol("INFERENCE-ANSWERS-TO-BINDINGS"), makeSymbol("INFERENCE-CANONICALIZE-ASK-INT"), makeSymbol("INFERENCE-COMPLETELY-ASSERTED-ASENT-GAFS"), makeSymbol("INFERENCE-COMPLETELY-DECIDABLE-ASENT-GAFS"), makeSymbol("INFERENCE-COMPLETELY-ENUMERABLE-ASENT-GAFS"), makeSymbol("INFERENCE-ERROR-SUSPEND-STATUS-P"), makeSymbol("INFERENCE-HL-MTS"), makeSymbol("INFERENCE-INTERRUPT"), makeSymbol("INFERENCE-P"), makeSymbol("INFERENCE-PROBLEM-STORE"), makeSymbol("INFERENCE-REWRITE-MODULE"), makeSymbol("INFERENCE-ROOT-PROBLEM"), makeSymbol("INFERENCE-SOME-SPEC-PRED-OR-INVERSE?"), makeSymbol("INFERENCE-SUID"), makeSymbol("INITIALIZE-ALL-SBHL-CACHING"), makeSymbol("INITIALIZE-INFERENCE-TEST-CARDINALITIES"), makeSymbol("INITIALIZE-NL-TRIE-ROTATION-INDEX"), makeSymbol("INTERMEDIATE-INDEX-KEYS"), makeSymbol("INTERMEDIATE-INDEX-LOOKUP"), makeSymbol("INTERMEDIATE-INDEX-P"), makeSymbol("INTERSECT?"), makeSymbol("INTERVAL-TOKEN-VALUE"), makeSymbol("IS-REGULAR-EXPRESSIONS-SUPPORT-AVAILABLE?"), makeSymbol("KE-UNASSERT-ASSERTION-NOW"), makeSymbol("KEYWORD-FOR-POS"), makeSymbol("LEGACY-B-VERIFY"), makeSymbol("LEGACY-BINDING-VERIFY"), makeSymbol("LEGACY-VERIFY-NOT"), makeSymbol("LENGTH="), makeSymbol("LENGTH>="), makeSymbol("LOAD-PARTITION"), makeSymbol("M-VERIFY"), makeSymbol("MAKE-BINARY-FORMULA"), makeSymbol("MAKE-CONJUNCTION"), makeSymbol("MAKE-DISJUNCTION"), makeSymbol("MAKE-EL-FORMULA"), makeSymbol("MAKE-EL-VAR"), makeSymbol("MAKE-EXISTENTIAL"), makeSymbol("MAKE-EXISTENTIAL-EXACT"), makeSymbol("MAKE-EXISTENTIAL-MAX"), makeSymbol("MAKE-EXISTENTIAL-MIN"), makeSymbol("MAKE-FORMULA"), makeSymbol("MAKE-GAF-CNF"), makeSymbol("MAKE-PROCESS-WITH-ARGS"), makeSymbol("MAKE-SET-FROM-LIST"), makeSymbol("MAKE-SYMBOL"), makeSymbol("MAKE-TERNARY-FORMULA"), makeSymbol("MAKE-UNARY-FORMULA"), makeSymbol("MAKE-UNUSED-TEMP-FILENAME"), makeSymbol("MAL-VARIABLES"), makeSymbol("MAPEXP"), makeSymbol("MAPPED-PROBLEM-PROBLEM"), makeSymbol("MAPPED-PROBLEM-VARIABLE-MAP"), makeSymbol("MAX-FLOOR-MTS-OF-GENL-PRED-PATHS"), makeSymbol("MAX-FLOOR-MTS-OF-NAT"), makeSymbol("MAX-FLOOR-MTS-OF-NEGATION-INVERSE-PATHS"), makeSymbol("MAX-FLOOR-MTS-OF-NEGATION-PRED-PATHS"), makeSymbol("MAX-NEGATION-INVERSES"), makeSymbol("MAXIMIZING-PPH-LINKS"), makeSymbol("MDW?"), makeSymbol("MIN-GENL-MTS"), makeSymbol("MIN-MTS-OF-GENL-INVERSE-PATHS"), makeSymbol("MIN-MTS-OF-GENL-PRED-PATHS"), makeSymbol("MIN-MTS-OF-GENLS-PATHS"), makeSymbol("MIN-MTS-OF-ISA-PATHS"), makeSymbol("MIN-MTS-OF-NEGATION-INVERSE-PATHS"), makeSymbol("MIN-MTS-OF-NEGATION-PRED-PATHS"), makeSymbol("NAT-ARG1"), makeSymbol("NAT-ARG2"), makeSymbol("NAT-FUNCTION"), makeSymbol("NAT-FUNCTOR"), makeSymbol("NAUT-TO-NART"), makeSymbol("NEGATION-INVERSE?"), makeSymbol("NEGATION-PRED?"), makeSymbol("NEGATION-PREDS"), makeSymbol("NEW-CONTINUABLE-INFERENCE"), makeSymbol("NEW-INFERENCE-ERROR-SUSPEND-STATUS"), makeSymbol("NEW-PROBLEM-STORE"), makeSymbol("NEW-SET"), makeSymbol("NEXT-AVAILABLE-WS"), makeSymbol("NL-TRIE-ENTRY-DENOTS"), makeSymbol("NL-TRIE-INDEX-ITEM-TERM"), makeSymbol("NL-TRIE-MATCHING-PHRASES"), makeSymbol("NL-TRIE-ROTATION-INDEX-INITIALIZED?"), makeSymbol("NL-TRIE-SEARCH"), makeSymbol("NL-TRIE-SEMTRANS-TEMPLATES-OF-STRING"), makeSymbol("NL-TRIE-SENTENCE-TOKENIZE"), makeSymbol("NON-EMPTY-STRING?"), makeSymbol("NON-HL-PREDICATE-P"), makeSymbol("NOT-ENDS-AFTER-ENDING-OF?"), makeSymbol("NOT-ENDS-AFTER-STARTING-OF?"), makeSymbol("NOT-EQ"), makeSymbol("NOT-GENLS?"), makeSymbol("NOT-MDW?"), makeSymbol("NOT-STARTS-AFTER-ENDING-OF?"), makeSymbol("NOT-STARTS-AFTER-STARTING-OF?"), makeSymbol("NTH-VALUE"), makeSymbol("NUM-INDEX-SLOW"), makeSymbol("NUMBER"), makeSymbol("OBJECT-TO-STRING"), makeSymbol("ORDERED-LEXIFICATION-PREDS-FOR-KEYWORD"), makeSymbol("ORDERED-LEXIFICATION-PREDS-OF-STRING"), makeSymbol("ORDERED-STRINGS-OF-WORD-UNIT"), makeSymbol("ORDERED-WORD-VARIANTS"), makeSymbol("OVERLAPS-START?"), makeSymbol("PAD-TABLE-INITIALIZED?"), makeSymbol("PARAMETERIZED-TEST-VALUE"), makeSymbol("PARSE-LEXICAL-SEMANTIC-FORMULA"), makeSymbol("PIF-FEATURE"), makeSymbol("PLACEHOLDER-DENOTS-OF-SENSE"), makeSymbol("POS-FOR-KEYWORD"), makeSymbol("POS-LIT-VARIABLE-GENL-CONSTRAINTS"), makeSymbol("POS-LIT-VARIABLE-INTER-ARG-GENL-CONSTRAINTS"), makeSymbol("POS-LIT-VARIABLE-INTER-ARG-ISA-CONSTRAINTS"), makeSymbol("POS-LIT-VARIABLE-ISA-CONSTRAINTS"), makeSymbol("POS-OF-STRING"), makeSymbol("POS-OF-STRING&WORD"), makeSymbol("POSITIVE-INTEGER-P"), makeSymbol("POWERSET"), makeSymbol("PPH-IDENTIFY-TYPE"), makeSymbol("PPH-PHRASE-OUTPUT-LIST-STRING"), makeSymbol("PPH-SYMBOL-STRING"), makeSymbol("PRECISE-KEYWORD-FOR-POS"), makeSymbol("PREDS-FOR-KEYWORD"), makeSymbol("PREDS-OF-STRING"), makeSymbol("PREDS-OF-STRING&WORD"), makeSymbol("PRINT-DICTIONARY-CONTENTS"), makeSymbol("PRINT-FAILING-FORM"), makeSymbol("PRINT-JUSTIFY"), makeSymbol("PRINT-TMS-FORMULA"), makeSymbol("PRINT-TMS-MT"), makeSymbol("PRINT-UNASSERT"), makeSymbol("PRINTED-FORMS-EQUAL?"), makeSymbol("PROBLEM-ARGUMENT-LINK-COUNT"), makeSymbol("PROBLEM-DEPENDENT-LINK-COUNT"), makeSymbol("PROBLEM-DISCARDED-TACTIC-COUNT"), makeSymbol("PROBLEM-EXECUTED-TACTIC-COUNT"), makeSymbol("PROBLEM-EXECUTED-TACTICS"), makeSymbol("PROBLEM-HAS-TACTIC-OF-TYPE-WITH-STATUS?"), makeSymbol("PROBLEM-LINK-SUPPORTED-PROBLEM"), makeSymbol("PROBLEM-QUERY-SOLE-CLAUSE"), makeSymbol("PROBLEM-RELEVANT-TO-INFERENCE?"), makeSymbol("PROBLEM-STORE"), makeSymbol("PROBLEM-STORE-FIRST-LINK-OF-TYPE"), makeSymbol("PROBLEM-STORE-REJECTED-PROOF-COUNT"), makeSymbol("PROBLEM-STORE-RESIDUAL-TRANSFORMATION-LINK-COUNT"), makeSymbol("PROBLEM-STORE-RESTRICTION-LINK-COUNT"), makeSymbol("PROBLEM-STORE-REWRITE-LINK-COUNT"), makeSymbol("PROBLEM-STORE-STRATEGY-COUNT"), makeSymbol("PROBLEM-STORE-SUID"), makeSymbol("PROBLEM-STORE-TACTIC-OF-TYPE-WITH-STATUS-COUNT"), makeSymbol("PROOF-REJECTED?"), makeSymbol("PUTF"), makeSymbol("PWHEN-FEATURE"), makeSymbol("QUERY-PROPERTIES-FROM-LEGACY-ASK-PARAMETERS"), makeSymbol("READ-LINE"), makeSymbol("REBUILD-MODULE-TESTS"), makeSymbol("RECLASSIFY-REMOVAL-MODULES"), makeSymbol("REDECLARE-INFERENCE-REMOVAL-MODULE"), makeSymbol("REFORMULATE-CYCL"), makeSymbol("REGISTER-SKSI-HL-STORAGE-MODULES-FOR-SKS"), makeSymbol("REGISTER-SKSI-REMOVAL-MODULES-FOR-SKS"), makeSymbol("REIFIABLE-FUNCTION-TERM?"), makeSymbol("REIFIABLE-FUNCTOR?"), makeSymbol("REIFIED-SKOLEM-FN?"), makeSymbol("RELATED-DENOTS-OF-SENSE"), makeSymbol("RELATION-VARIABLE-GENL-CONSTRAINTS"), makeSymbol("RELATION-VARIABLE-INTER-ARG-GENL-CONSTRAINTS"), makeSymbol("RELATION-VARIABLE-INTER-ARG-ISA-CONSTRAINTS"), makeSymbol("RELATION-VARIABLE-ISA-CONSTRAINTS"), makeSymbol("RELATIONAL-NOUN-POSSESSED-ARGNUMS"), makeSymbol("REMOVE-IF-NOT"), makeSymbol("RESIDUAL-TRANSFORMATION-LINK-SUPPORTING-MAPPED-PROBLEM"), makeSymbol("RESIDUAL-TRANSFORMATION-LINK-SUPPORTING-PROBLEM"), makeSymbol("RESTRICTION-REWRITE-ADD-LINK"), makeSymbol("RESULT-GENL"), makeSymbol("RESULT-INTER-ARG-GENL-RELN"), makeSymbol("RESULT-INTER-ARG-ISA-RELN"), makeSymbol("RETURN-UNCANON"), makeSymbol("REWRITE-ADD-LINK"), makeSymbol("REWRITE-LINK-TACTIC"), makeSymbol("STRENGTHEN-PREDICATE-W/TYPED-AND-ALL-SUGGESTIONS"), makeSymbol("STRENGTHEN-PREDICATE-W/TYPED-AND-MINIMAL-SUGGESTIONS"), makeSymbol("STRENGTHEN-PREDICATE-W/TYPED-LINKS-ONLY"), makeSymbol("STRENGTHENED-PREDS"), makeSymbol("TYPED-PRED-STRENGTHEN-FORMULA"), makeSymbol("RSUBLIS"), makeSymbol("RULES-MENTIONING"), makeSymbol("RUN-ALL-CYC-TESTS"), makeSymbol("RUN-EVALUATABLE-RELATION-TESTS"), makeSymbol("RUN-TEST-CASE-TABLES-OF-CLASS"), makeSymbol("RUN-TEST-SUITE"), makeSymbol("SAFE-FI"), makeSymbol("SAMPLE-DIFFERENT-LEAF-INSTANCES"), makeSymbol("SAMPLE-DIFFERENT-LEAF-SPECS"), makeSymbol("SAMPLE-LEAF-INSTANCES"), makeSymbol("SAVE-PARTITION"), makeSymbol("SBHL-CACHED-PREDICATE-RELATION-P"), makeSymbol("SBHL-CACHED-RELATIONS-FOR-NODE"), makeSymbol("SBHL-MARKED-NODES"), makeSymbol("SDC"), makeSymbol("SDC?"), makeSymbol("SEMANTICALLY-WF-LITERAL?"), makeSymbol("SENTENCE-ASSERTIONS"), makeSymbol("SENTENCE-ASSERTIONS-IN-MT"), makeSymbol("SENTENCE-FREE-SEQUENCE-VARIABLES"), makeSymbol("SENTENCE-FREE-VARIABLES"), makeSymbol("SENTENCE-VARIABLES"), makeSymbol("SET"), makeSymbol("SET-ADD"), makeSymbol("SET-ASSERTION-ASSERTED-BY"), makeSymbol("SET-ASSERTION-ASSERTED-SECOND"), makeSymbol("SETHASH"), makeSymbol("SETS-EQUAL-EQUAL?"), makeSymbol("SETS-EQUAL?"), makeSymbol("SIMPLE-INDEX-P"), makeSymbol("SIMPLEST-INFERENCE-STRATEGY"), makeSymbol("SIMPLIFY-TRANSITIVE-REDUNDANCIES"), makeSymbol("SINGLE-LITERAL-PROBLEM-ATOMIC-SENTENCE"), makeSymbol("SINGLETON?"), makeSymbol("SKOLEM-DEFN-ASSERTIONS"), makeSymbol("SKOLEM-FUNCTION-P"), makeSymbol("SKOLEM-FUNCTION?"), makeSymbol("SKOLEM-NART?"), makeSymbol("SKOLEM-RULE-HOSED?"), makeSymbol("SOME-GENL-PRED-OR-INVERSE?"), makeSymbol("SOME-NEGATION-PRED-OR-INVERSE?"), makeSymbol("SOME-SPEC-PRED-OR-INVERSE?"), makeSymbol("SPEC-POS-PRED?"), makeSymbol("STARTS-AFTER-ENDING-OF?"), makeSymbol("STARTS-AFTER-STARTING-OF?"), makeSymbol("STARTS-DURING?"), makeSymbol("STARTS-WITH"), makeSymbol("STRATEGICALLY-FINISHED-PROBLEM-P"), makeSymbol("STRATEGICALLY-NO-GOOD-PROBLEM-P"), makeSymbol("STRING-IS-POS-ON-WU?"), makeSymbol("STRING-TOKEN-VALUE"), makeSymbol("STRINGS-OF-WORD-UNIT"), makeSymbol("SUBINDEX-LEAF-COUNT"), makeSymbol("SUBINDEX-LEAVES"), makeSymbol("SUBINDEX-P"), makeSymbol("SUBL-ESCAPE-P"), makeSymbol("SUBL-STRING-P"), makeSymbol("SUBSTRING?"), makeSymbol("SUF-DEFN?"), makeSymbol("SUPERSETP"), makeSymbol("TACTIC-HL-MODULE"), makeSymbol("TACTIC-HL-MODULE-NAME"), makeSymbol("TACTICALLY-FINISHED-PROBLEM-P"), makeSymbol("TACTICALLY-NO-GOOD-PROBLEM-P"), makeSymbol("TACTICALLY-UNEXAMINED-PROBLEM-P"), makeSymbol("TEMPORAL-BOUNDS-CONTAIN?"), makeSymbol("TEMPORAL-BOUNDS-IDENTICAL?"), makeSymbol("TEMPORAL-BOUNDS-INTERSECT?"), makeSymbol("TEMPORALLY-COORIGINATING?"), makeSymbol("TEMPORALLY-COTERMINAL?"), makeSymbol("TEMPORALLY-FINISHED-BY?"), makeSymbol("TEMPORALLY-STARTED-BY?"), makeSymbol("TEMPORALLY-SUBSUMES?"), makeSymbol("TERM-INDEX"), makeSymbol("TERM-OF-UNIT"), makeSymbol("TERM-UNIFY"), makeSymbol("TEST-CANONICALIZE-ASSERT"), makeSymbol("TEST-CANONICALIZE-ASSERT-SENTENCE"), makeSymbol("TEST-ERROR"), makeSymbol("TEST-SUITE-DEFINED-P"), makeSymbol("TEST-VERIFY"), makeSymbol("TEST-VERIFY-NEW"), makeSymbol("THROW-UNEVALUATABLE"), makeSymbol("TIME"), makeSymbol("TRANSFORM"), makeSymbol("TREE-FIND"), makeSymbol("TREE-FIND-IF"), makeSymbol("TREE-GATHER"), makeSymbol("TREE-MATCHES-PATTERN"), makeSymbol("TYPED-DENOTS-OF-STRING-AT-PLACE"), makeSymbol("UNCANON-TEST"), makeSymbol("UNDECLARE-INFERENCE-REMOVAL-MODULE"), makeSymbol("UNKNOWN-ASSERTION?"), makeSymbol("UNWRAP-IF-IST-PERMISSIVE"), makeSymbol("USELESS-NART?"), makeSymbol("VALID-ASSERTION?"), makeSymbol("VALID-EL-VAR?"), makeSymbol("VALID-SBHL-LINKS-P"), makeSymbol("VAR-NAMES-IN-STRING"), makeSymbol("VARIABLE-LOOKUP"), makeSymbol("VERIFY-NOT"), makeSymbol("WHY-NOT-QUERY-OK"), makeSymbol("WHY-NOT-SEMANTICALLY-WF-WRT-TYPES"), makeSymbol("WHY-NOT-WFF"), makeSymbol("WHY-NOT-WFF-ASK"), makeSymbol("WHY-NOT-WFF-ASSERT"), makeSymbol("WHY-NOT-WFT"), makeSymbol("WITH-ALL-PREDICATES"), makeSymbol("WITH-INFERENCE-ERROR-HANDLING"), makeSymbol("WITH-INFERENCE-MT-RELEVANCE"), makeSymbol("WITH-NL-TRIE-CASE-SENSITIVITY-OFF"), makeSymbol("WITH-NL-TRIE-CASE-SENSITIVITY-ON"), makeSymbol("WITH-PARAPHRASE-MAPPINGS"), makeSymbol("WITH-PPH-DEMERIT-CUTOFF"), makeSymbol("WITH-PPH-MEMOIZATION"), makeSymbol("WITH-PRECISE-PARAPHRASE-OFF"), makeSymbol("WITH-ALL-SPEC-PREDICATES"), makeSymbol("WITH-TEST-ASSERTION-LISTS"), makeSymbol("WITH-TEST-ASSERTIONS"), makeSymbol("WITH-TEST-CONSTANTS"), makeSymbol("WITH-TEXT-FILE"), makeSymbol("WITH-THE-CYCLIST"), makeSymbol("WITH-TVA-PRECOMPUTE-CLOSURE-THRESHOLD"), makeSymbol("WITHOUT-SBHL-CACHES"), makeSymbol("WITHOUT-UNLEXIFIED-TERM-DISCOVERY-LOGGING"), makeSymbol("WORD-HAS-POS?"), makeSymbol("WORD-VARIANTS"), makeSymbol("WORDS-OF-STRING&POS"), makeSymbol("WORDS-OF-STRING&PRED"), makeSymbol("WORDS-OF-STRING&SPEECH-PART") });
    }

    @Override
    public void declareFunctions() {
        declare_secure_translation_file();
    }

    @Override
    public void initializeVariables() {
        init_secure_translation_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_secure_translation_file();
    }

    

    public static final class $secure_id_database_native extends SubLStructNative {
        public SubLObject $security_level;

        public SubLObject $id_module_table;

        public SubLObject $module_id_table;

        public SubLObject $id_method_table;

        public SubLObject $method_id_table;

        public SubLObject $id_global_table;

        public SubLObject $global_id_table;

        public SubLObject $symbol_exceptions;

        public SubLObject $id_symbol_table;

        public SubLObject $symbol_id_table;

        private static final SubLStructDeclNative structDecl;

        private $secure_id_database_native() {
            this.$security_level = Lisp.NIL;
            this.$id_module_table = Lisp.NIL;
            this.$module_id_table = Lisp.NIL;
            this.$id_method_table = Lisp.NIL;
            this.$method_id_table = Lisp.NIL;
            this.$id_global_table = Lisp.NIL;
            this.$global_id_table = Lisp.NIL;
            this.$symbol_exceptions = Lisp.NIL;
            this.$id_symbol_table = Lisp.NIL;
            this.$symbol_id_table = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$security_level;
        }

        @Override
        public SubLObject getField3() {
            return this.$id_module_table;
        }

        @Override
        public SubLObject getField4() {
            return this.$module_id_table;
        }

        @Override
        public SubLObject getField5() {
            return this.$id_method_table;
        }

        @Override
        public SubLObject getField6() {
            return this.$method_id_table;
        }

        @Override
        public SubLObject getField7() {
            return this.$id_global_table;
        }

        @Override
        public SubLObject getField8() {
            return this.$global_id_table;
        }

        @Override
        public SubLObject getField9() {
            return this.$symbol_exceptions;
        }

        @Override
        public SubLObject getField10() {
            return this.$id_symbol_table;
        }

        @Override
        public SubLObject getField11() {
            return this.$symbol_id_table;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$security_level = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$id_module_table = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$module_id_table = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$id_method_table = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$method_id_table = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return this.$id_global_table = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return this.$global_id_table = value;
        }

        @Override
        public SubLObject setField9(final SubLObject value) {
            return this.$symbol_exceptions = value;
        }

        @Override
        public SubLObject setField10(final SubLObject value) {
            return this.$id_symbol_table = value;
        }

        @Override
        public SubLObject setField11(final SubLObject value) {
            return this.$symbol_id_table = value;
        }

        static {
            structDecl = makeStructDeclNative($secure_id_database_native.class, SECURE_ID_DATABASE, SECURE_ID_DATABASE_P, $list3, $list4, new String[]{ "$security_level", "$id_module_table", "$module_id_table", "$id_method_table", "$method_id_table", "$id_global_table", "$global_id_table", "$symbol_exceptions", "$id_symbol_table", "$symbol_id_table" }, $list5, $list6, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $secure_id_database_p$UnaryFunction extends UnaryFunction {
        public $secure_id_database_p$UnaryFunction() {
            super(extractFunctionNamed("SECURE-ID-DATABASE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return secure_id_database_p(arg1);
        }
    }
}

/**
 * Total time: 595 ms
 */

package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_with_any_of_operators_p;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.consp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class conflicts extends SubLTranslatedFile {
    public static final SubLFile me = new conflicts();

    public static final String myName = "com.cyc.cycjava.cycl.conflicts";

    public static final String myFingerPrint = "8d6e4a134aa340adec83243ae8e7e09aa85beb01e4380cab6875213bfe95aaf5";

    // defparameter
    private static final SubLSymbol $inconsistent_support_sets$ = makeSymbol("*INCONSISTENT-SUPPORT-SETS*");







    public static final SubLSymbol $current_conflicts$ = makeSymbol("*CURRENT-CONFLICTS*");

    public static final SubLSymbol $mt_conflicts$ = makeSymbol("*MT-CONFLICTS*");



    public static final SubLString $str4$Unable_to_open__S = makeString("Unable to open ~S");

    public static final SubLString $str5$_______Mode__LISP__Package__CYC__ = makeString(";; -*- Mode: LISP; Package: CYC; Syntax: ANSI-Common-Lisp -*-");

    public static final SubLString $str6$____ = makeString("~%;;");

    public static final SubLString $str7$______A = makeString("~%;; ~A");

    public static final SubLString $str8$_____SBHL_Utilities_conflicts_for = makeString("~%;; SBHL Utilities conflicts for CycL version ~A from KB ~S.~S");

    public static final SubLString $str9$_____This_file_is_automatically_g = makeString("~%;; This file is automatically generated at dump time!");

    public static final SubLString $str10$_____See_CONFLICTS_LISP_for_detai = makeString("~%;; See CONFLICTS.LISP for details.");

    public static final SubLString $str11$_________________________________ = makeString("~%;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");

    public static final SubLString $str12$___S = makeString("~%~S");

    private static final SubLString $str13$Aborting_due_to_conflict____S = makeString("Aborting due to conflict:~%~S");



    private static final SubLString $str15$deduction_conflict___s__a__a = makeString("deduction conflict: ~s ~a ~a");



    private static final SubLString $str17$_S_is_semantically_invalid_in__S = makeString("~S is semantically invalid in ~S");







    private static final SubLString $str21$leave_the_kb_inconsistent_for_now = makeString("leave the kb inconsistent for now and resolve the conflict later");

    private static final SubLList $list22 = list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("genls")));



    public static final SubLList $list24 = list(makeSymbol("FUNCTION"), makeSymbol("CONFLICT-HANDLER"));



    public static final SubLList $list26 = list(list(makeSymbol("*CONFLICTS-FROM-INVALID-DEDUCTIONS*"), T), list(makeSymbol("*IGNORE-WARNS?*"), T), list(makeSymbol("*ENFORCE-LITERAL-WFF-IDIOSYNCRASIES?*"), NIL), list(makeSymbol("*RECORD-INCONSISTENT-SUPPORT-SETS*"), T));

    public static SubLObject inconsistent_support_sets() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $inconsistent_support_sets$.getDynamicValue(thread);
    }

    public static SubLObject clear_inconsistent_support_sets() {
        $inconsistent_support_sets$.setDynamicValue(NIL);
        return NIL;
    }

    public static SubLObject add_inconsistent_support_set(final SubLObject supports) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != consp(supports) : "Types.consp(supports) " + "CommonSymbols.NIL != Types.consp(supports) " + supports;
        $inconsistent_support_sets$.setDynamicValue(cons(supports, $inconsistent_support_sets$.getDynamicValue(thread)), thread);
        return supports;
    }

    public static SubLObject write_current_conflicts(final SubLObject output_filename) {
        SubLObject stream = NIL;
        try {
            stream = compatibility.open_text(output_filename, $OUTPUT);
            if (!stream.isStream()) {
                Errors.error($str4$Unable_to_open__S, output_filename);
            }
            final SubLObject s = stream;
            format(s, $str5$_______Mode__LISP__Package__CYC__);
            format(s, $str6$____);
            format(s, $str7$______A, misc_utilities.copyright_notice());
            format(s, $str6$____);
            format(s, $str7$______A, output_filename);
            format(s, $str7$______A, numeric_date_utilities.timestring(UNPROVIDED));
            format(s, $str6$____);
            format(s, $str8$_____SBHL_Utilities_conflicts_for, new SubLObject[]{ system_info.cyc_revision_string(), kb_loaded(), operation_communication.kb_op_number() });
            format(s, $str6$____);
            format(s, $str9$_____This_file_is_automatically_g);
            format(s, $str10$_____See_CONFLICTS_LISP_for_detai);
            format(s, $str11$_________________________________);
            SubLObject cdolist_list_var = $current_conflicts$.getGlobalValue();
            SubLObject conflict = NIL;
            conflict = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                format(s, $str12$___S, conflict);
                cdolist_list_var = cdolist_list_var.rest();
                conflict = cdolist_list_var.first();
            } 
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return NIL;
    }

    public static SubLObject conflict_abort() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $inference_debugP$.getDynamicValue(thread)) {
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(NIL, thread);
                try {
                    Errors.error($str13$Aborting_due_to_conflict____S, inconsistent_support_sets());
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        sublisp_throw($CONFLICT, NIL);
        return NIL;
    }

    public static SubLObject conflict_handler() {
        conflict_abort();
        return NIL;
    }

    public static SubLObject handle_invalid_deduction_conflict(final SubLObject gaf, final SubLObject truth, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $conflicts_from_invalid_deductions$.getDynamicValue(thread)) {
            if (((NIL == $ignore_conflictsP$.getDynamicValue(thread)) && (NIL == $suppress_conflict_noticesP$.getDynamicValue(thread))) && ((NIL == $ignore_non_definitional_conflictsP$.getDynamicValue(thread)) || (NIL == non_definitional_asentP(gaf)))) {
                Errors.warn($str15$deduction_conflict___s__a__a, gaf, truth, mt);
                conflict_notify($str15$deduction_conflict___s__a__a, gaf, truth, mt, UNPROVIDED);
            }
        } else {
            backward_results.note_inference_rejected(list($INVALID_LITERAL, $str17$_S_is_semantically_invalid_in__S, gaf, mt));
        }
        return NIL;
    }

    public static SubLObject conflict_notify(final SubLObject format_string, final SubLObject gaf, final SubLObject truth, final SubLObject mt, SubLObject aux) {
        if (aux == UNPROVIDED) {
            aux = NIL;
        }
        if (NIL != agenda.within_agenda()) {
            final SubLObject pcase_var = agenda.agenda_error_mode();
            if (pcase_var.eql($IGNORE)) {
                Errors.warn(format_string, new SubLObject[]{ gaf, truth, mt, aux });
            } else
                if (pcase_var.eql($HALT)) {
                    Errors.error(format_string, new SubLObject[]{ gaf, truth, mt, aux });
                } else
                    if (pcase_var.eql($DEBUG)) {
                        conflict_notify_int(format_string, gaf, truth, mt, aux);
                    }


        } else {
            conflict_notify_int(format_string, gaf, truth, mt, aux);
        }
        return NIL;
    }

    public static SubLObject conflict_notify_int(final SubLObject format_string, final SubLObject gaf, final SubLObject truth, final SubLObject mt, final SubLObject aux) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $conflicts_from_invalid_deductions$.getDynamicValue(thread)) {
            conflict_abort();
            return NIL;
        }
        return Errors.cerror($str21$leave_the_kb_inconsistent_for_now, format_string, new SubLObject[]{ gaf, truth, mt, aux });
    }

    public static SubLObject non_definitional_asentP(final SubLObject asent) {
        return makeBoolean(NIL == el_formula_with_any_of_operators_p(asent, $list22));
    }

    public static SubLObject with_conflicts_from_invalid_deductions(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(WITH_ERROR_HANDLER, $list24, listS(CLET, $list26, append(body, NIL)));
    }

    public static SubLObject declare_conflicts_file() {
        declareFunction(me, "inconsistent_support_sets", "INCONSISTENT-SUPPORT-SETS", 0, 0, false);
        declareFunction(me, "clear_inconsistent_support_sets", "CLEAR-INCONSISTENT-SUPPORT-SETS", 0, 0, false);
        declareFunction(me, "add_inconsistent_support_set", "ADD-INCONSISTENT-SUPPORT-SET", 1, 0, false);
        declareFunction(me, "write_current_conflicts", "WRITE-CURRENT-CONFLICTS", 1, 0, false);
        declareFunction(me, "conflict_abort", "CONFLICT-ABORT", 0, 0, false);
        declareFunction(me, "conflict_handler", "CONFLICT-HANDLER", 0, 0, false);
        declareFunction(me, "handle_invalid_deduction_conflict", "HANDLE-INVALID-DEDUCTION-CONFLICT", 3, 0, false);
        declareFunction(me, "conflict_notify", "CONFLICT-NOTIFY", 4, 1, false);
        declareFunction(me, "conflict_notify_int", "CONFLICT-NOTIFY-INT", 5, 0, false);
        declareFunction(me, "non_definitional_asentP", "NON-DEFINITIONAL-ASENT?", 1, 0, false);
        declareMacro(me, "with_conflicts_from_invalid_deductions", "WITH-CONFLICTS-FROM-INVALID-DEDUCTIONS");
        return NIL;
    }

    public static SubLObject init_conflicts_file() {
        defparameter("*INCONSISTENT-SUPPORT-SETS*", NIL);
        deflexical("*CURRENT-CONFLICTS*", SubLTrampolineFile.maybeDefault($current_conflicts$, $current_conflicts$, NIL));
        deflexical("*MT-CONFLICTS*", SubLTrampolineFile.maybeDefault($mt_conflicts$, $mt_conflicts$, NIL));
        return NIL;
    }

    public static SubLObject setup_conflicts_file() {
        declare_defglobal($current_conflicts$);
        declare_defglobal($mt_conflicts$);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_conflicts_file();
    }

    @Override
    public void initializeVariables() {
        init_conflicts_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_conflicts_file();
    }

    
}

/**
 * Total time: 128 ms
 */

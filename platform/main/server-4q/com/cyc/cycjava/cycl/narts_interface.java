package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.control_vars.$hl_lock$;
import static com.cyc.cycjava.cycl.utilities_macros.register_cyc_api_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class narts_interface extends SubLTranslatedFile {
    public static final SubLFile me = new narts_interface();

    public static final String myName = "com.cyc.cycjava.cycl.narts_interface";

    public static final String myFingerPrint = "5096c7b79213d9f24c421ef05c86f2d12d69676ed0353e68c4ac4d4b1d46806e";

    // Internal Constants
    public static final SubLSymbol NAT_FORMULA_P = makeSymbol("NAT-FORMULA-P");

    public static final SubLSymbol KB_CREATE_NART = makeSymbol("KB-CREATE-NART");

    public static final SubLSymbol $sym2$_EXIT = makeSymbol("%EXIT");

    public static final SubLList $list3 = list(makeSymbol("NART-HL-FORMULA"));

    public static final SubLString $str4$Create_a_new_NART_to_implement_NA = makeString("Create a new NART to implement NART-HL-FORMULA.");

    public static final SubLList $list5 = list(list(makeSymbol("NART-HL-FORMULA"), makeSymbol("NAT-FORMULA-P")));

    public static final SubLList $list6 = list(makeSymbol("NART-P"));

    public static final SubLSymbol KB_CREATE_NART_KB_STORE = makeSymbol("KB-CREATE-NART-KB-STORE");



    public static final SubLSymbol KB_REMOVE_NART = makeSymbol("KB-REMOVE-NART");



    public static final SubLList $list11 = list(makeSymbol("NART"));

    public static final SubLString $str12$Remove_NART_from_the_KB_ = makeString("Remove NART from the KB.");

    public static final SubLList $list13 = list(list(makeSymbol("NART"), makeSymbol("NART-P")));

    public static final SubLList $list14 = list(makeSymbol("NULL"));

    public static final SubLSymbol KB_NART_HL_FORMULA = makeSymbol("KB-NART-HL-FORMULA");

    public static final SubLString $str16$Return_the_hl_formula_of_this_NAR = makeString("Return the hl formula of this NART.");

    public static final SubLList $list17 = list(list(makeSymbol("NIL-OR"), makeSymbol("CONSP")));

    public static final SubLSymbol POSSIBLY_NAUT_P = makeSymbol("POSSIBLY-NAUT-P");

    public static final SubLSymbol KB_LOOKUP_NART = makeSymbol("KB-LOOKUP-NART");

    public static final SubLString $str20$Return_the_NART_implementing_NART = makeString("Return the NART implementing NART-HL-FORMULA, or NIL if none is present.\n   No substitutions for sub-NARTs are performed.");

    public static final SubLList $list21 = list(list(makeSymbol("NART-HL-FORMULA"), makeSymbol("POSSIBLY-NAUT-P")));

    public static final SubLList $list22 = list(list(makeSymbol("NIL-OR"), makeSymbol("NART-P")));

    public static SubLObject kb_create_nart(final SubLObject nart_hl_formula) {
        SubLTrampolineFile.enforceType(nart_hl_formula, NAT_FORMULA_P);
        hl_interface_infrastructure.define_hl_modifier_preamble();
        hl_interface_infrastructure.note_hl_modifier_invocation(KB_CREATE_NART, nart_hl_formula, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != hl_interface_infrastructure.hl_modify_anywhereP()) {
            SubLObject release = NIL;
            try {
                release = seize_lock($hl_lock$.getGlobalValue());
                hl_transcript_tracing.note_hlt_find_or_create_nart(nart_hl_formula);
                final SubLObject nart = (NIL != hl_interface_infrastructure.hl_modify_remoteP()) ? kb_create_nart_remote(nart_hl_formula) : kb_create_nart_local(nart_hl_formula);
                kb_modification_event.post_kb_modify_create_nart_event(nart_hl_formula);
                hl_interface_infrastructure.define_hl_modifier_postamble();
                return nart;
            } finally {
                if (NIL != release) {
                    release_lock($hl_lock$.getGlobalValue());
                }
            }
        }
        return NIL;
    }

    public static SubLObject kb_create_nart_remote(final SubLObject nart_hl_formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject internal_id = hl_interface_infrastructure.hl_store_remote_eval(list(KB_CREATE_NART_KB_STORE, list_utilities.quotify(nart_hl_formula)));
        SubLObject nart = NIL;
        final SubLObject _prev_bind_0 = hl_interface_infrastructure.$override_hl_store_remote_accessP$.currentBinding(thread);
        try {
            hl_interface_infrastructure.$override_hl_store_remote_accessP$.bind(T, thread);
            nart = narts_low.kb_create_nart_cyc(internal_id);
            if (NIL != hl_interface_infrastructure.hl_modify_localP()) {
                narts_low.kb_create_nart_int(nart, internal_id, nart_hl_formula);
            }
        } finally {
            hl_interface_infrastructure.$override_hl_store_remote_accessP$.rebind(_prev_bind_0, thread);
        }
        return nart;
    }

    public static SubLObject kb_create_nart_local(final SubLObject nart_hl_formula) {
        final SubLObject internal_id = narts_low.kb_create_nart_kb_store(nart_hl_formula);
        return nart_handles.find_nart_by_id(internal_id);
    }

    public static SubLObject kb_remove_nart(final SubLObject nart) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(nart, NART_P);
        SubLObject result = NIL;
        hl_interface_infrastructure.define_hl_modifier_preamble();
        hl_interface_infrastructure.note_hl_modifier_invocation(KB_REMOVE_NART, nart, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != hl_interface_infrastructure.hl_modify_remoteP()) {
            result = hl_interface_infrastructure.hl_store_remote_eval(list(KB_REMOVE_NART, list(QUOTE, nart)));
        }
        if (NIL != hl_interface_infrastructure.hl_modify_localP()) {
            final SubLObject _prev_bind_0 = hl_interface_infrastructure.$override_hl_store_remote_accessP$.currentBinding(thread);
            try {
                hl_interface_infrastructure.$override_hl_store_remote_accessP$.bind(T, thread);
                SubLObject release = NIL;
                try {
                    release = seize_lock($hl_lock$.getGlobalValue());
                    hl_transcript_tracing.note_hlt_remove_nart(nart);
                    kb_modification_event.post_kb_modify_remove_nart_event(nart);
                    return narts_low.kb_remove_nart_internal(nart);
                } finally {
                    if (NIL != release) {
                        release_lock($hl_lock$.getGlobalValue());
                    }
                }
            } finally {
                hl_interface_infrastructure.$override_hl_store_remote_accessP$.rebind(_prev_bind_0, thread);
            }
        }
        return result;
    }

    public static SubLObject kb_nart_hl_formula(final SubLObject nart) {
        SubLTrampolineFile.enforceType(nart, NART_P);
        if (NIL != hl_interface_infrastructure.hl_access_remoteP()) {
            return hl_interface_infrastructure.hl_store_remote_eval(list(KB_NART_HL_FORMULA, list(QUOTE, nart)));
        }
        return narts_low.nart_hl_formula_internal(nart);
    }

    public static SubLObject kb_lookup_nart(final SubLObject nart_hl_formula) {
        SubLTrampolineFile.enforceType(nart_hl_formula, POSSIBLY_NAUT_P);
        if (NIL != hl_interface_infrastructure.hl_access_remoteP()) {
            return hl_interface_infrastructure.hl_store_remote_eval(list(KB_LOOKUP_NART, list(QUOTE, nart_hl_formula)));
        }
        return narts_low.lookup_nart_internal(nart_hl_formula);
    }

    public static SubLObject initialize_nart_hl_formulas() {
        return narts_low.initialize_nart_hl_formulas_internal();
    }

    public static SubLObject rebuild_nart_hl_formulas() {
        return initialize_nart_hl_formulas();
    }

    public static SubLObject declare_narts_interface_file() {
        declareFunction(me, "kb_create_nart", "KB-CREATE-NART", 1, 0, false);
        declareFunction(me, "kb_create_nart_remote", "KB-CREATE-NART-REMOTE", 1, 0, false);
        declareFunction(me, "kb_create_nart_local", "KB-CREATE-NART-LOCAL", 1, 0, false);
        declareFunction(me, "kb_remove_nart", "KB-REMOVE-NART", 1, 0, false);
        declareFunction(me, "kb_nart_hl_formula", "KB-NART-HL-FORMULA", 1, 0, false);
        declareFunction(me, "kb_lookup_nart", "KB-LOOKUP-NART", 1, 0, false);
        declareFunction(me, "initialize_nart_hl_formulas", "INITIALIZE-NART-HL-FORMULAS", 0, 0, false);
        declareFunction(me, "rebuild_nart_hl_formulas", "REBUILD-NART-HL-FORMULAS", 0, 0, false);
        return NIL;
    }

    public static SubLObject init_narts_interface_file() {
        return NIL;
    }

    public static SubLObject setup_narts_interface_file() {
        register_cyc_api_function(KB_CREATE_NART, $list3, $str4$Create_a_new_NART_to_implement_NA, $list5, $list6);
        register_cyc_api_function(KB_REMOVE_NART, $list11, $str12$Remove_NART_from_the_KB_, $list13, $list14);
        register_cyc_api_function(KB_NART_HL_FORMULA, $list11, $str16$Return_the_hl_formula_of_this_NAR, $list13, $list17);
        register_cyc_api_function(KB_LOOKUP_NART, $list3, $str20$Return_the_NART_implementing_NART, $list21, $list22);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_narts_interface_file();
    }

    @Override
    public void initializeVariables() {
        init_narts_interface_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_narts_interface_file();
    }

    
}

/**
 * Total time: 71 ms
 */

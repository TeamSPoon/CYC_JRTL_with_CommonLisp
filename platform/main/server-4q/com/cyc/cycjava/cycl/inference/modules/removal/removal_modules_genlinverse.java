package com.cyc.cycjava.cycl.inference.modules.removal;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.cardinality_estimates;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.genl_predicates;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class removal_modules_genlinverse extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlinverse";
    public static String myFingerPrint = "3a30f363df17cbac5a8369fc81aaff29702eff50f806dfce2067532dae017ba7";
    @SubL(source = "cycl/inference/modules/removal/removal-modules-genlinverse.lisp", position = 500L)
    private static SubLSymbol $default_genlinverse_check_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-genlinverse.lisp", position = 3500L)
    private static SubLSymbol $default_not_genlinverse_check_cost$;
    private static SubLList $list0;
    private static SubLSymbol $GENLPREDS;
    private static SubLSymbol $REMOVAL_GENLINVERSE_CHECK;
    private static SubLList $list3;
    private static SubLSymbol $REMOVAL_ALL_GENL_INVERSES;
    private static SubLList $list5;
    private static SubLSymbol $REMOVAL_ALL_SPEC_INVERSES;
    private static SubLList $list7;
    private static SubLSymbol $MINIMIZE;
    private static SubLSymbol $REMOVAL_NOT_GENLINVERSE_CHECK;
    private static SubLList $list10;
    private static SubLObject $$genlInverse;
    private static SubLSymbol $NEG;

    @SubL(source = "cycl/inference/modules/removal/removal-modules-genlinverse.lisp", position = 700L)
    public static SubLObject removal_genlinverse_check_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject current;
        SubLObject datum = current = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
        SubLObject spec_pred = NIL;
        SubLObject genl_pred = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list0);
        spec_pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list0);
        genl_pred = current.first();
        current = current.rest();
        if (NIL == current) {
            if (NIL != genl_predicates.genl_inverseP(spec_pred, genl_pred, UNPROVIDED, UNPROVIDED)) {
                backward.removal_add_node(arguments.make_hl_support($GENLPREDS, asent, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            }
        } else {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list0);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-genlinverse.lisp", position = 1200L)
    public static SubLObject removal_all_genl_inverses_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return cardinality_estimates.genl_cardinality(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-genlinverse.lisp", position = 1500L)
    public static SubLObject removal_all_genl_inverses_iterator(SubLObject spec_pred) {
        return iteration.new_list_iterator(genl_predicates.all_genl_inverses(spec_pred, UNPROVIDED, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-genlinverse.lisp", position = 2400L)
    public static SubLObject removal_all_spec_inverses_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return cardinality_estimates.spec_cardinality(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-genlinverse.lisp", position = 2600L)
    public static SubLObject removal_all_spec_inverses_iterator(SubLObject genl_pred) {
        return iteration.new_list_iterator(genl_predicates.all_spec_inverses(genl_pred, UNPROVIDED, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-genlinverse.lisp", position = 3700L)
    public static SubLObject removal_not_genlinverse_check_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        SubLObject datum = current = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
        SubLObject spec_pred = NIL;
        SubLObject genl_pred = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list0);
        spec_pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list0);
        genl_pred = current.first();
        current = current.rest();
        if (NIL == current) {
            if (NIL != control_vars.$negation_by_failure$.getDynamicValue(thread) && NIL == genl_predicates.genl_inverseP(spec_pred, genl_pred, UNPROVIDED, UNPROVIDED)) {
                backward.removal_add_node(arguments.make_hl_support($MINIMIZE, cycl_utilities.negate(asent), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            } else if (NIL != genl_predicates.not_genl_inverseP(spec_pred, genl_pred, UNPROVIDED, UNPROVIDED)) {
                backward.removal_add_node(arguments.make_hl_support($GENLPREDS, cycl_utilities.negate(asent), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            }
        } else {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list0);
        }
        return NIL;
    }

    public static SubLObject declare_removal_modules_genlinverse_file() {
        declareFunction(myName, "removal_genlinverse_check_expand", "REMOVAL-GENLINVERSE-CHECK-EXPAND", 1, 1, false);
        declareFunction(myName, "removal_all_genl_inverses_cost", "REMOVAL-ALL-GENL-INVERSES-COST", 1, 1, false);
        declareFunction(myName, "removal_all_genl_inverses_iterator", "REMOVAL-ALL-GENL-INVERSES-ITERATOR", 1, 0, false);
        declareFunction(myName, "removal_all_spec_inverses_cost", "REMOVAL-ALL-SPEC-INVERSES-COST", 1, 1, false);
        declareFunction(myName, "removal_all_spec_inverses_iterator", "REMOVAL-ALL-SPEC-INVERSES-ITERATOR", 1, 0, false);
        declareFunction(myName, "removal_not_genlinverse_check_expand", "REMOVAL-NOT-GENLINVERSE-CHECK-EXPAND", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_genlinverse_file() {
        $default_genlinverse_check_cost$ = defparameter("*DEFAULT-GENLINVERSE-CHECK-COST*", control_vars.$hl_module_check_cost$.getDynamicValue());
        $default_not_genlinverse_check_cost$ = defparameter("*DEFAULT-NOT-GENLINVERSE-CHECK-COST*", TWO_INTEGER);
        return NIL;
    }

    public static SubLObject setup_removal_modules_genlinverse_file() {
        inference_modules.inference_removal_module($REMOVAL_GENLINVERSE_CHECK, $list3);
        inference_modules.inference_removal_module($REMOVAL_ALL_GENL_INVERSES, $list5);
        inference_modules.inference_removal_module($REMOVAL_ALL_SPEC_INVERSES, $list7);
        inference_modules.inference_removal_module($REMOVAL_NOT_GENLINVERSE_CHECK, $list10);
        inference_modules.register_solely_specific_removal_module_predicate($$genlInverse);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$genlInverse);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_genlinverse_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_genlinverse_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_genlinverse_file();
    }

    static {
        me = new removal_modules_genlinverse();
        $default_genlinverse_check_cost$ = null;
        $default_not_genlinverse_check_cost$ = null;
        $list0 = list(makeSymbol("SPEC-PRED"), makeSymbol("GENL-PRED"));
        $GENLPREDS = makeKeyword("GENLPREDS");
        $REMOVAL_GENLINVERSE_CHECK = makeKeyword("REMOVAL-GENLINVERSE-CHECK");
        $list3 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("genlInverse")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("genlInverse")), makeKeyword("PREDICATE-FORT"), makeKeyword("PREDICATE-FORT")),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-GENLINVERSE-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-GENLINVERSE-CHECK-EXPAND") });
        $REMOVAL_ALL_GENL_INVERSES = makeKeyword("REMOVAL-ALL-GENL-INVERSES");
        $list5 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("genlInverse")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("genlInverse")), makeKeyword("PREDICATE-FORT"), makeKeyword("VARIABLE")), makeKeyword("COST"),
                makeSymbol("REMOVAL-ALL-GENL-INVERSES-COST"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeConstSym(("genlInverse")), list(makeKeyword("BIND"), makeSymbol("SPEC-PRED")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("SPEC-PRED"))),
                makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-GENL-INVERSES-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
                list(makeConstSym(("genlInverse")), list(makeKeyword("VALUE"), makeSymbol("SPEC-PRED")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("GENLPREDS"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("DEFAULT"), makeKeyword("DOCUMENTATION"),
                makeString("(#$genlInverse <predicate-fort> <variable>"), makeKeyword("EXAMPLE"), makeString("(#$genlInverse #$geographicalSubRegions ?WHAT)") });
        $REMOVAL_ALL_SPEC_INVERSES = makeKeyword("REMOVAL-ALL-SPEC-INVERSES");
        $list7 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("genlInverse")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("genlInverse")), makeKeyword("VARIABLE"), makeKeyword("PREDICATE-FORT")), makeKeyword("COST"),
                makeSymbol("REMOVAL-ALL-SPEC-INVERSES-COST"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeConstSym(("genlInverse")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("GENL-PRED"))), list(makeKeyword("VALUE"), makeSymbol("GENL-PRED"))),
                makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-SPEC-INVERSES-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
                list(makeConstSym(("genlInverse")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("GENL-PRED"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("GENLPREDS"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("DEFAULT"), makeKeyword("DOCUMENTATION"),
                makeString("(#$genlInverse <variable> <predicate-fort>)"), makeKeyword("EXAMPLE"), makeString("(#$genlInverse ?WHAT #$inRegion)") });
        $MINIMIZE = makeKeyword("MINIMIZE");
        $REMOVAL_NOT_GENLINVERSE_CHECK = makeKeyword("REMOVAL-NOT-GENLINVERSE-CHECK");
        $list10 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("genlInverse")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("genlInverse")), makeKeyword("PREDICATE-FORT"), makeKeyword("PREDICATE-FORT")),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NOT-GENLINVERSE-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-GENLINVERSE-CHECK-EXPAND") });
        $$genlInverse = makeConstSym(("genlInverse"));
        $NEG = makeKeyword("NEG");
    }
}
/*
 *
 * Total time: 86 ms
 *
 */
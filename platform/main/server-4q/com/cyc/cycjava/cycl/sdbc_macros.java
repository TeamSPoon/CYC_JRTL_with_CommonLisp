package com.cyc.cycjava.cycl;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class sdbc_macros extends SubLTranslatedFile {
    public static final SubLFile me = new sdbc_macros();

    public static final String myName = "com.cyc.cycjava.cycl.sdbc_macros";

    public static final String myFingerPrint = "a799f1ffbae1489d24bcb65be8dfdf1a8866494d20364bfbfc7aa191a1c9f075";

    // Internal Constants
    public static final SubLList $list0 = list(makeSymbol("WRAPPER-FN"), makeSymbol("WRAPPED-FN"), makeSymbol("ARGS"), makeSymbol("KEYS"));

    public static final SubLSymbol $sym1$RESULT_SET = makeUninternedSymbol("RESULT-SET");

    public static final SubLSymbol $sym2$COLUMN_COUNT = makeUninternedSymbol("COLUMN-COUNT");

    public static final SubLSymbol $sym3$I = makeUninternedSymbol("I");

    public static final SubLSymbol $sym4$KEY = makeUninternedSymbol("KEY");

    public static final SubLSymbol $sym5$RESULTS = makeUninternedSymbol("RESULTS");

    public static final SubLSymbol $sym6$BINDINGS = makeUninternedSymbol("BINDINGS");













    public static final SubLSymbol SQL_RESULT_SET_P = makeSymbol("SQL-RESULT-SET-P");



    public static final SubLString $str15$SQLC_error___A = makeString("SQLC error: ~A");

    public static final SubLList $list16 = list(list(makeSymbol("RET"), NIL));

    public static final SubLSymbol SQLRS_COLUMN_COUNT = makeSymbol("SQLRS-COLUMN-COUNT");





    public static final SubLSymbol SQLRS_IS_LAST = makeSymbol("SQLRS-IS-LAST");

    public static final SubLSymbol SQLRS_NEXT = makeSymbol("SQLRS-NEXT");

    public static final SubLList $list22 = list(ZERO_INTEGER);







    public static final SubLSymbol $sym26$__ = makeSymbol("<=");









    public static SubLObject define_sqlc_wrapper(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject wrapper_fn = NIL;
        SubLObject wrapped_fn = NIL;
        SubLObject args = NIL;
        SubLObject keys = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        wrapper_fn = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        wrapped_fn = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        args = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        keys = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject result_set = $sym1$RESULT_SET;
            final SubLObject column_count = $sym2$COLUMN_COUNT;
            final SubLObject i = $sym3$I;
            final SubLObject key = $sym4$KEY;
            final SubLObject results = $sym5$RESULTS;
            final SubLObject v_bindings = $sym6$BINDINGS;
            return list(DEFINE_PROTECTED, wrapper_fn, args, list(CLET, list(list(result_set, list(APPLY, list(QUOTE, wrapped_fn), bq_cons(LIST, append(args, NIL))))), listS(PUNLESS, list(SQL_RESULT_SET_P, result_set), list(WARN, $str15$SQLC_error___A, result_set), $list16), list(CLET, list(list(column_count, list(SQLRS_COLUMN_COUNT, result_set)), results), list(WHILE, list(CNOT, list(SQLRS_IS_LAST, result_set)), list(SQLRS_NEXT, result_set), list(CLET, list(bq_cons(i, $list22), v_bindings), list(CDOLIST, list(key, list(QUOTE, keys)), list(CINC, i), list(PWHEN, list($sym26$__, i, column_count), list(CPUSH, key, v_bindings), list(CPUSH, list(SQLRS_GET_OBJECT, result_set, i), v_bindings))), list(CPUSH, list(NREVERSE, v_bindings), results))), list(RET, list(NREVERSE, results)))));
        }
        cdestructuring_bind_error(datum, $list0);
        return NIL;
    }

    public static SubLObject declare_sdbc_macros_file() {
        declareMacro(me, "define_sqlc_wrapper", "DEFINE-SQLC-WRAPPER");
        return NIL;
    }

    public static SubLObject init_sdbc_macros_file() {
        return NIL;
    }

    public static SubLObject setup_sdbc_macros_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_sdbc_macros_file();
    }

    @Override
    public void initializeVariables() {
        init_sdbc_macros_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sdbc_macros_file();
    }

    
}

/**
 * Total time: 80 ms
 */

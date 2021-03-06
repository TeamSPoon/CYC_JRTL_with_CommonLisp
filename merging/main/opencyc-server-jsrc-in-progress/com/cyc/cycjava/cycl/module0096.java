package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0096 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0096";
    public static final String myFingerPrint = "7813db9ae07f14d2e345c10bf958a46b5a5c841c27cb53be47728b9578cfe7e8";
    public static SubLSymbol $g1259$;
    public static SubLSymbol $g1260$;
    private static SubLSymbol $g1261$;
    public static SubLSymbol $g1262$;
    public static SubLSymbol $g1263$;
    private static SubLSymbol $g1264$;
    public static SubLSymbol $g1265$;
    private static final SubLSymbol $ic0$;
    private static final SubLString $ic1$;
    private static final SubLList $ic2$;
    private static final SubLString $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLList $ic6$;
    private static final SubLList $ic7$;
    private static final SubLList $ic8$;
    private static final SubLList $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLList $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLString $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLString $ic25$;
    private static final SubLString $ic26$;
    private static final SubLString $ic27$;
    private static final SubLString $ic28$;
    private static final SubLString $ic29$;
    private static final SubLString $ic30$;
    private static final SubLString $ic31$;
    private static final SubLString $ic32$;
    private static final SubLString $ic33$;
    private static final SubLString $ic34$;
    private static final SubLInteger $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLList $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLList $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLString $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLList $ic56$;
    private static final SubLList $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLList $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLString $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLList $ic75$;
    private static final SubLList $ic76$;
    private static final SubLList $ic77$;
    private static final SubLList $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLList $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLList $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLString $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLString $ic99$;
    private static final SubLString $ic100$;
    private static final SubLString $ic101$;
    private static final SubLString $ic102$;
    private static final SubLSymbol $ic103$;
    private static final SubLInteger $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLList $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLSymbol $ic110$;
    private static final SubLSymbol $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLSymbol $ic113$;
    private static final SubLSymbol $ic114$;
    private static final SubLSymbol $ic115$;
    private static final SubLSymbol $ic116$;
    private static final SubLSymbol $ic117$;
    private static final SubLSymbol $ic118$;
    private static final SubLString $ic119$;
    private static final SubLString $ic120$;
    private static final SubLSymbol $ic121$;
    private static final SubLSymbol $ic122$;
    private static final SubLSymbol $ic123$;
    private static final SubLList $ic124$;
    private static final SubLSymbol $ic125$;
    private static final SubLString $ic126$;
    private static final SubLString $ic127$;
    private static final SubLSymbol $ic128$;
    private static final SubLSymbol $ic129$;
    private static final SubLSymbol $ic130$;
    private static final SubLSymbol $ic131$;
    private static final SubLSymbol $ic132$;
    private static final SubLSymbol $ic133$;
    private static final SubLSymbol $ic134$;
    private static final SubLObject $ic135$;
    private static final SubLSymbol $ic136$;
    private static final SubLString $ic137$;
    private static final SubLString $ic138$;
    private static final SubLString $ic139$;
    private static final SubLString $ic140$;
    private static final SubLString $ic141$;
    private static final SubLString $ic142$;
    private static final SubLString $ic143$;
    private static final SubLString $ic144$;
    private static final SubLString $ic145$;
    private static final SubLString $ic146$;
    private static final SubLString $ic147$;
    private static final SubLString $ic148$;
    private static final SubLString $ic149$;
    private static final SubLSymbol $ic150$;
    private static final SubLSymbol $ic151$;
    private static final SubLSymbol $ic152$;
    private static final SubLString $ic153$;
    private static final SubLString $ic154$;
    private static final SubLSymbol $ic155$;
    private static final SubLInteger $ic156$;
    private static final SubLList $ic157$;
    private static final SubLString $ic158$;
    private static final SubLString $ic159$;
    private static final SubLString $ic160$;
    private static final SubLList $ic161$;
    private static final SubLString $ic162$;
    private static final SubLString $ic163$;
    private static final SubLString $ic164$;
    private static final SubLSymbol $ic165$;
    private static final SubLString $ic166$;
    private static final SubLString $ic167$;
    private static final SubLString $ic168$;
    private static final SubLString $ic169$;
    private static final SubLString $ic170$;
    private static final SubLString $ic171$;
    private static final SubLString $ic172$;
    private static final SubLString $ic173$;
    private static final SubLList $ic174$;
    private static final SubLString $ic175$;
    
    
    public static SubLObject f6873(final SubLObject var1, final SubLObject var2, final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        try {
            final SubLObject var7 = stream_macros.$stream_requires_locking$.currentBinding(var4);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)NIL, var4);
                var6 = compatibility.open_binary(var2, (SubLObject)$ic0$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var7, var4);
            }
            if (!var6.isStream()) {
                Errors.error((SubLObject)$ic1$, var2);
            }
            final SubLObject var8 = var6;
            SubLObject var9_10 = (SubLObject)NIL;
            try {
                final SubLObject var9 = stream_macros.$stream_requires_locking$.currentBinding(var4);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)NIL, var4);
                    var9_10 = compatibility.open_binary(var3, (SubLObject)$ic0$);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(var9, var4);
                }
                if (!var9_10.isStream()) {
                    Errors.error((SubLObject)$ic1$, var3);
                }
                final SubLObject var10 = var9_10;
                final SubLObject var11 = module0095.f6846(var8, var10);
                var5 = f6874(var1, var11);
                module0095.f6849(var11);
            }
            finally {
                final SubLObject var12 = Threads.$is_thread_performing_cleanupP$.currentBinding(var4);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var4);
                    if (var9_10.isStream()) {
                        streams_high.close(var9_10, (SubLObject)UNPROVIDED);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var12, var4);
                }
            }
        }
        finally {
            final SubLObject var13 = Threads.$is_thread_performing_cleanupP$.currentBinding(var4);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var4);
                if (var6.isStream()) {
                    streams_high.close(var6, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var13, var4);
            }
        }
        return var5;
    }
    
    public static SubLObject f6874(final SubLObject var1, final SubLObject var12) {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        final SubLObject var14 = module0095.f6852(var12);
        f6875(var1, var14);
        final SubLObject var15 = module0079.f5424(var1);
        SubLObject var18;
        for (SubLObject var16 = (SubLObject)NIL; NIL == var16; var16 = (SubLObject)makeBoolean(NIL == var18)) {
            var13.resetMultipleValues();
            final SubLObject var17 = module0052.f3693(var15);
            var18 = var13.secondMultipleValue();
            var13.resetMultipleValues();
            if (NIL != var18) {
                SubLObject var20;
                final SubLObject var19 = var20 = var17;
                SubLObject var21 = (SubLObject)NIL;
                SubLObject var22 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var20, var19, (SubLObject)$ic2$);
                var21 = var20.first();
                var20 = var20.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var20, var19, (SubLObject)$ic2$);
                var22 = var20.first();
                var20 = var20.rest();
                if (NIL == var20) {
                    f6876(var21, var22, var12);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var19, (SubLObject)$ic2$);
                }
            }
        }
        return var1;
    }
    
    public static SubLObject f6877(final SubLObject var1, final SubLObject var12) {
        final SubLObject var13 = module0095.f6852(var12);
        return f6875(var1, var13);
    }
    
    public static SubLObject f6876(final SubLObject var19, final SubLObject var20, final SubLObject var12) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        final SubLObject var22 = module0095.f6852(var12);
        SubLObject var23 = (SubLObject)NIL;
        var23 = module0095.f6857(var12);
        module0095.f6862(var12);
        module0021.f1038(var19, var22);
        final SubLObject var24 = f6878(var23);
        final SubLObject var25 = module0095.f6857(var12);
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var21) && !var24.numE(var25)) {
            Errors.error((SubLObject)$ic3$, var24, var25);
        }
        module0095.f6862(var12);
        module0021.f1038(var20, var22);
        return var23;
    }
    
    public static SubLObject f6875(final SubLObject var1, final SubLObject var8) {
        module0021.f1038(module0079.f5411(var1), var8);
        module0021.f1038(module0079.f5406(var1), var8);
        return var1;
    }
    
    public static SubLObject f6879(final SubLObject var24, final SubLObject var2, final SubLObject var3) {
        final SubLThread var25 = SubLProcess.currentSubLThread();
        SubLObject var26 = (SubLObject)NIL;
        SubLObject var27 = (SubLObject)NIL;
        try {
            final SubLObject var28 = stream_macros.$stream_requires_locking$.currentBinding(var25);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)NIL, var25);
                var27 = compatibility.open_binary(var2, (SubLObject)$ic0$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var28, var25);
            }
            if (!var27.isStream()) {
                Errors.error((SubLObject)$ic1$, var2);
            }
            final SubLObject var29 = var27;
            SubLObject var26_27 = (SubLObject)NIL;
            try {
                final SubLObject var30 = stream_macros.$stream_requires_locking$.currentBinding(var25);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)NIL, var25);
                    var26_27 = compatibility.open_binary(var3, (SubLObject)$ic0$);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(var30, var25);
                }
                if (!var26_27.isStream()) {
                    Errors.error((SubLObject)$ic1$, var3);
                }
                final SubLObject var31 = var26_27;
                final SubLObject var32 = module0095.f6846(var29, var31);
                var26 = f6880(var24, var32);
                module0095.f6849(var32);
            }
            finally {
                final SubLObject var33 = Threads.$is_thread_performing_cleanupP$.currentBinding(var25);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var25);
                    if (var26_27.isStream()) {
                        streams_high.close(var26_27, (SubLObject)UNPROVIDED);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var33, var25);
                }
            }
        }
        finally {
            final SubLObject var34 = Threads.$is_thread_performing_cleanupP$.currentBinding(var25);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var25);
                if (var27.isStream()) {
                    streams_high.close(var27, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var34, var25);
            }
        }
        return var26;
    }
    
    public static SubLObject f6880(final SubLObject var24, final SubLObject var12) {
        final SubLObject var25 = module0095.f6852(var12);
        module0021.f1038(Sequences.length(var24), var25);
        SubLObject var26 = var24;
        SubLObject var27 = (SubLObject)NIL;
        var27 = var26.first();
        while (NIL != var26) {
            f6874(var27, var12);
            var26 = var26.rest();
            var27 = var26.first();
        }
        return var24;
    }
    
    public static SubLObject f6881(final SubLObject var29, final SubLObject var30) {
        f6882(var29, var30, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f6883(final SubLObject var29) {
        return (SubLObject)((var29.getClass() == $sX8670_native.class) ? T : NIL);
    }
    
    public static SubLObject f6884(final SubLObject var29) {
        assert NIL != f6883(var29) : var29;
        return var29.getField2();
    }
    
    public static SubLObject f6885(final SubLObject var29) {
        assert NIL != f6883(var29) : var29;
        return var29.getField3();
    }
    
    public static SubLObject f6886(final SubLObject var29, final SubLObject var32) {
        assert NIL != f6883(var29) : var29;
        return var29.setField2(var32);
    }
    
    public static SubLObject f6887(final SubLObject var29, final SubLObject var32) {
        assert NIL != f6883(var29) : var29;
        return var29.setField3(var32);
    }
    
    public static SubLObject f6888(SubLObject var33) {
        if (var33 == UNPROVIDED) {
            var33 = (SubLObject)NIL;
        }
        final SubLObject var34 = (SubLObject)new $sX8670_native();
        SubLObject var35;
        SubLObject var36;
        SubLObject var37;
        SubLObject var38;
        for (var35 = (SubLObject)NIL, var35 = var33; NIL != var35; var35 = conses_high.cddr(var35)) {
            var36 = var35.first();
            var37 = conses_high.cadr(var35);
            var38 = var36;
            if (var38.eql((SubLObject)$ic17$)) {
                f6886(var34, var37);
            }
            else if (var38.eql((SubLObject)$ic18$)) {
                f6887(var34, var37);
            }
            else {
                Errors.error((SubLObject)$ic19$, var36);
            }
        }
        return var34;
    }
    
    public static SubLObject f6889(final SubLObject var39, final SubLObject var40) {
        Functions.funcall(var40, var39, (SubLObject)$ic20$, (SubLObject)$ic21$, (SubLObject)TWO_INTEGER);
        Functions.funcall(var40, var39, (SubLObject)$ic22$, (SubLObject)$ic17$, f6884(var39));
        Functions.funcall(var40, var39, (SubLObject)$ic22$, (SubLObject)$ic18$, f6885(var39));
        Functions.funcall(var40, var39, (SubLObject)$ic23$, (SubLObject)$ic21$, (SubLObject)TWO_INTEGER);
        return var39;
    }
    
    public static SubLObject f6890(final SubLObject var39, final SubLObject var40) {
        return f6889(var39, var40);
    }
    
    public static SubLObject f6882(final SubLObject var41, final SubLObject var30, final SubLObject var42) {
        final SubLThread var43 = SubLProcess.currentSubLThread();
        streams_high.write_string((SubLObject)$ic25$, var30, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        print_high.princ(f6891(var41), var30);
        print_high.princ((SubLObject)$ic26$, var30);
        if (NIL != $g1259$.getDynamicValue(var43)) {
            print_high.princ(f6892(var41), var30);
        }
        else {
            print_high.princ(f6893(var41), var30);
        }
        print_high.princ((SubLObject)$ic27$, var30);
        streams_high.write_string((SubLObject)$ic28$, var30, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return var41;
    }
    
    public static SubLObject f6894(final SubLObject var21) {
        final SubLThread var22 = SubLProcess.currentSubLThread();
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var22) && !var21.isPositive()) {
            Errors.error((SubLObject)$ic29$);
        }
        final SubLObject var23 = f6888((SubLObject)UNPROVIDED);
        f6886(var23, var21);
        f6895(var23);
        return var23;
    }
    
    public static SubLObject f6896(final SubLObject var21, final SubLObject var44) {
        final SubLObject var45 = f6894(var21);
        f6897(var45, var44);
        return var45;
    }
    
    public static SubLObject f6891(final SubLObject var43) {
        return f6884(var43);
    }
    
    public static SubLObject f6898(final SubLObject var43) {
        final SubLObject var44 = f6884(var43);
        final SubLObject var45 = Numbers.minus(Numbers.abs(var44));
        f6886(var43, var45);
        return var43;
    }
    
    public static SubLObject f6899(final SubLObject var43) {
        final SubLObject var44 = f6884(var43);
        return Numbers.abs(var44);
    }
    
    public static SubLObject f6900(final SubLObject var43) {
        final SubLObject var44 = f6899(var43);
        f6886(var43, var44);
        f6895(var43);
        return var43;
    }
    
    public static SubLObject f6897(final SubLObject var43, final SubLObject var41) {
        f6887(var43, var41);
        return var43;
    }
    
    public static SubLObject f6895(final SubLObject var43) {
        return f6897(var43, (SubLObject)NIL);
    }
    
    public static SubLObject f6892(final SubLObject var43) {
        return f6885(var43);
    }
    
    public static SubLObject f6901(final SubLObject var43) {
        f6898(var43);
        return f6895(var43);
    }
    
    public static SubLObject f6902(final SubLObject var43) {
        return (SubLObject)makeBoolean(NIL != f6885(var43));
    }
    
    public static SubLObject f6903(final SubLObject var21) {
        return Numbers.plusp(var21);
    }
    
    public static SubLObject f6904(final SubLObject var43) {
        return f6903(f6884(var43));
    }
    
    public static SubLObject f6905(final SubLObject var21) {
        return Numbers.minusp(var21);
    }
    
    public static SubLObject f6906(final SubLObject var43) {
        return f6905(f6884(var43));
    }
    
    public static SubLObject f6907(final SubLObject var43) {
        return (SubLObject)makeBoolean(NIL != f6904(var43) && NIL == f6902(var43));
    }
    
    public static SubLObject f6908(final SubLObject var43) {
        return (SubLObject)makeBoolean(NIL != f6904(var43) && NIL != f6902(var43));
    }
    
    public static SubLObject f6909(final SubLObject var43) {
        return (SubLObject)makeBoolean(NIL != f6906(var43) && NIL != f6902(var43));
    }
    
    public static SubLObject f6910(final SubLObject var43) {
        return (SubLObject)makeBoolean(NIL != f6906(var43) && NIL == f6902(var43));
    }
    
    public static SubLObject f6893(final SubLObject var43) {
        if (NIL != f6907(var43)) {
            return (SubLObject)$ic30$;
        }
        if (NIL != f6908(var43)) {
            return (SubLObject)$ic31$;
        }
        if (NIL != f6909(var43)) {
            return (SubLObject)$ic32$;
        }
        if (NIL != f6910(var43)) {
            return (SubLObject)$ic33$;
        }
        return (SubLObject)$ic34$;
    }
    
    public static SubLObject f6911(final SubLObject var43) {
        return (SubLObject)makeBoolean(NIL != f6908(var43) || NIL != f6909(var43));
    }
    
    public static SubLObject f6912(final SubLObject var30) {
        final SubLObject var31 = module0021.f1060(var30, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL != f6903(var31)) {
            return f6894(var31);
        }
        final SubLObject var32 = module0021.f1060(var30, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return f6896(var31, var32);
    }
    
    public static SubLObject f6913(final SubLObject var41, final SubLObject var30) {
        module0021.f1086($g1261$.getGlobalValue(), var30);
        final SubLObject var42 = f6891(var41);
        module0021.f1038(var42, var30);
        if (NIL != f6905(var42)) {
            module0021.f1038(f6892(var41), var30);
        }
        return var41;
    }
    
    public static SubLObject f6914(final SubLObject var41, final SubLObject var30) {
        return f6913(var41, var30);
    }
    
    public static SubLObject f6915(final SubLObject var46, final SubLObject var47) {
        final SubLObject var48 = var46.rest();
        final SubLObject var50;
        final SubLObject var49 = var50 = var48;
        final SubLObject var51 = (SubLObject)$ic38$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic39$, (SubLObject)ConsesLow.list(reader.bq_cons(var51, (SubLObject)$ic40$)), (SubLObject)ConsesLow.list((SubLObject)$ic41$, (SubLObject)ConsesLow.list((SubLObject)$ic42$, var51), (SubLObject)ConsesLow.listS((SubLObject)$ic43$, (SubLObject)ConsesLow.list(var51), ConsesLow.append(var50, (SubLObject)NIL)), reader.bq_cons((SubLObject)$ic44$, ConsesLow.append(var50, (SubLObject)NIL))));
    }
    
    public static SubLObject f6916(final SubLObject var46, final SubLObject var47) {
        SubLObject var49;
        final SubLObject var48 = var49 = var46.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var49, var48, (SubLObject)$ic45$);
        final SubLObject var50 = var49.rest();
        var49 = var49.first();
        SubLObject var51 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var49, var48, (SubLObject)$ic45$);
        var51 = var49.first();
        var49 = var49.rest();
        if (NIL == var49) {
            final SubLObject var52;
            var49 = (var52 = var50);
            return (SubLObject)ConsesLow.listS((SubLObject)$ic39$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic46$, var51)), ConsesLow.append(var52, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var48, (SubLObject)$ic45$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f6917(final SubLObject var12, SubLObject var56, SubLObject var57, SubLObject var58) {
        if (var56 == UNPROVIDED) {
            var56 = (SubLObject)EQL;
        }
        if (var57 == UNPROVIDED) {
            var57 = (SubLObject)$ic47$;
        }
        if (var58 == UNPROVIDED) {
            var58 = (SubLObject)ZERO_INTEGER;
        }
        if ($ic47$ == var57) {
            var57 = f6918(var12);
        }
        final SubLObject var59 = module0067.f4880(var56, var57);
        final SubLObject var60 = module0095.f6852(var12);
        SubLObject var61;
        SubLObject var62;
        SubLObject var63;
        SubLObject var64;
        for (var61 = (SubLObject)NIL, var61 = (SubLObject)ZERO_INTEGER; var61.numL(var57); var61 = Numbers.add(var61, (SubLObject)ONE_INTEGER)) {
            var62 = (SubLObject)NIL;
            var63 = (SubLObject)NIL;
            var64 = (SubLObject)NIL;
            if (var61.isZero()) {
                module0095.f6858(var12, var58);
            }
            else {
                module0095.f6858(var12, (SubLObject)UNPROVIDED);
            }
            var62 = f6919(var60);
            module0095.f6858(var12, (SubLObject)UNPROVIDED);
            var63 = f6920(Numbers.add(var58, var61));
            var64 = f6894(var63);
            module0079.f5412(var59, var62, var64);
        }
        return var59;
    }
    
    public static SubLObject f6921(final SubLObject var2, final SubLObject var3) {
        SubLObject var4 = (SubLObject)NIL;
        SubLObject var5 = (SubLObject)NIL;
        try {
            var5 = module0095.f6845(var2, var3, (SubLObject)$ic48$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            var4 = f6922(var5, (SubLObject)UNPROVIDED);
        }
        finally {
            final SubLObject var6 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                if (NIL != module0095.f6844(var5)) {
                    module0095.f6849(var5);
                }
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var6);
            }
        }
        return var4;
    }
    
    public static SubLObject f6922(final SubLObject var12, SubLObject var58) {
        if (var58 == UNPROVIDED) {
            var58 = (SubLObject)ZERO_INTEGER;
        }
        final SubLObject var59 = module0095.f6852(var12);
        final SubLObject var60 = module0021.f1060(var59, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var61 = module0021.f1060(var59, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return f6917(var12, var60, var61, var58);
    }
    
    public static SubLObject f6923(final SubLObject var2, final SubLObject var3) {
        SubLObject var4 = (SubLObject)NIL;
        SubLObject var5 = (SubLObject)NIL;
        try {
            var5 = module0095.f6845(var2, var3, (SubLObject)$ic48$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var6 = module0095.f6852(var5);
            final SubLObject var7 = module0021.f1060(var6, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            SubLObject var8 = (SubLObject)ZERO_INTEGER;
            SubLObject var9;
            SubLObject var10;
            for (var9 = (SubLObject)NIL, var9 = (SubLObject)ZERO_INTEGER; var9.numL(var7); var9 = Numbers.add(var9, (SubLObject)ONE_INTEGER)) {
                var10 = f6922(var5, var8);
                var4 = (SubLObject)ConsesLow.cons(var10, var4);
                var8 = Numbers.add(var8, module0079.f5406(var10));
            }
            var4 = Sequences.nreverse(var4);
        }
        finally {
            final SubLObject var11 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                if (NIL != module0095.f6844(var5)) {
                    module0095.f6849(var5);
                }
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var11);
            }
        }
        return var4;
    }
    
    public static SubLObject f6924(final SubLObject var1, final SubLObject var12, final SubLObject var19, SubLObject var68) {
        if (var68 == UNPROVIDED) {
            var68 = (SubLObject)NIL;
        }
        return f6925(var1, var12, (SubLObject)NIL, var19, var68);
    }
    
    public static SubLObject f6925(final SubLObject var1, final SubLObject var12, final SubLObject var69, final SubLObject var19, SubLObject var68) {
        if (var68 == UNPROVIDED) {
            var68 = (SubLObject)NIL;
        }
        final SubLThread var70 = SubLProcess.currentSubLThread();
        assert NIL != module0090.f6129(var69) : var69;
        final SubLObject var71 = module0079.f5416(var1, var19, var68);
        if (NIL != f6883(var71)) {
            if (NIL != f6911(var71)) {
                final SubLObject var72 = f6892(var71);
                if (NIL != module0090.f6127(var69) && NIL != f6908(var71)) {
                    final SubLObject var73 = $g1262$.getDynamicValue(var70);
                    if (var73.isLock()) {
                        final SubLObject var74 = var73;
                        SubLObject var75 = (SubLObject)NIL;
                        try {
                            var75 = Locks.seize_lock(var74);
                            module0090.f6145(var69);
                            module0090.f6158(var69, var19);
                        }
                        finally {
                            if (NIL != var75) {
                                Locks.release_lock(var74);
                            }
                        }
                    }
                    else {
                        module0090.f6145(var69);
                        module0090.f6158(var69, var19);
                    }
                }
                return var72;
            }
            if (NIL != f6910(var71)) {
                return var68;
            }
            if (NIL != f6907(var71)) {
                final SubLObject var76 = f6891(var71);
                SubLObject var77 = (SubLObject)NIL;
                SubLObject var78 = $g1262$.getDynamicValue(var70);
                if (var78.isLock()) {
                    final SubLObject var79 = var78;
                    SubLObject var80 = (SubLObject)NIL;
                    try {
                        var80 = Locks.seize_lock(var79);
                        module0095.f6858(var12, var76);
                        var77 = f6926(module0095.f6852(var12));
                    }
                    finally {
                        if (NIL != var80) {
                            Locks.release_lock(var79);
                        }
                    }
                }
                else {
                    module0095.f6858(var12, var76);
                    var77 = f6926(module0095.f6852(var12));
                }
                f6897(var71, var77);
                if (NIL != module0090.f6127(var69)) {
                    var78 = $g1262$.getDynamicValue(var70);
                    if (var78.isLock()) {
                        final SubLObject var81 = var78;
                        SubLObject var82 = (SubLObject)NIL;
                        try {
                            var82 = Locks.seize_lock(var81);
                            final SubLObject var83 = module0090.f6139(var69, var19);
                            if (!var83.eql(var19)) {
                                f6927(var1, var83);
                            }
                            module0090.f6150(var69);
                        }
                        finally {
                            if (NIL != var82) {
                                Locks.release_lock(var81);
                            }
                        }
                    }
                    else {
                        final SubLObject var84 = module0090.f6139(var69, var19);
                        if (!var84.eql(var19)) {
                            f6927(var1, var84);
                        }
                        module0090.f6150(var69);
                    }
                }
                return var77;
            }
            Errors.error((SubLObject)$ic50$, var71);
        }
        return var71;
    }
    
    public static SubLObject f6928(final SubLObject var1, final SubLObject var19, final SubLObject var20) {
        return f6929(var1, (SubLObject)NIL, var19, var20);
    }
    
    public static SubLObject f6929(final SubLObject var1, final SubLObject var69, final SubLObject var19, final SubLObject var20) {
        final SubLThread var70 = SubLProcess.currentSubLThread();
        assert NIL != module0090.f6129(var69) : var69;
        final SubLObject var71 = module0079.f5416(var1, var19, (SubLObject)$ic51$);
        SubLObject var72 = (SubLObject)NIL;
        if (NIL != f6883(var71)) {
            final SubLObject var73 = var71;
            f6898(var73);
            f6897(var73, var20);
            if (NIL != module0090.f6127(var69)) {
                final SubLObject var74 = $g1262$.getDynamicValue(var70);
                if (var74.isLock()) {
                    final SubLObject var75 = var74;
                    SubLObject var76 = (SubLObject)NIL;
                    try {
                        var76 = Locks.seize_lock(var75);
                        module0090.f6143(var69, var19);
                    }
                    finally {
                        if (NIL != var76) {
                            Locks.release_lock(var75);
                        }
                    }
                }
                else {
                    module0090.f6143(var69, var19);
                }
            }
            var72 = (SubLObject)$ic52$;
        }
        else {
            module0079.f5412(var1, var19, var20);
        }
        return var72;
    }
    
    public static SubLObject f6930(final SubLObject var1, final SubLObject var19, SubLObject var83) {
        if (var83 == UNPROVIDED) {
            var83 = (SubLObject)NIL;
        }
        return f6931(var1, (SubLObject)NIL, var19, var83);
    }
    
    public static SubLObject f6931(final SubLObject var1, final SubLObject var69, final SubLObject var19, SubLObject var83) {
        if (var83 == UNPROVIDED) {
            var83 = (SubLObject)NIL;
        }
        final SubLThread var84 = SubLProcess.currentSubLThread();
        assert NIL != module0090.f6129(var69) : var69;
        final SubLObject var85 = module0079.f5416(var1, var19, (SubLObject)$ic51$);
        final SubLObject var86 = f6883(var85);
        SubLObject var87 = (SubLObject)NIL;
        if (NIL != var83 && NIL != var86) {
            final SubLObject var88 = var85;
            f6901(var88);
            var87 = (SubLObject)$ic53$;
        }
        else {
            module0079.f5418(var1, var19);
        }
        if (NIL != var86 && NIL != module0090.f6127(var69)) {
            final SubLObject var89 = $g1262$.getDynamicValue(var84);
            if (var89.isLock()) {
                final SubLObject var90 = var89;
                SubLObject var91 = (SubLObject)NIL;
                try {
                    var91 = Locks.seize_lock(var90);
                    module0090.f6143(var69, var19);
                }
                finally {
                    if (NIL != var91) {
                        Locks.release_lock(var90);
                    }
                }
            }
            else {
                module0090.f6143(var69, var19);
            }
        }
        return var87;
    }
    
    public static SubLObject f6932(final SubLObject var1, final SubLObject var19, SubLObject var88) {
        if (var88 == UNPROVIDED) {
            var88 = (SubLObject)NIL;
        }
        return f6933(var1, (SubLObject)NIL, var19, var88);
    }
    
    public static SubLObject f6933(final SubLObject var1, final SubLObject var69, final SubLObject var19, SubLObject var88) {
        if (var88 == UNPROVIDED) {
            var88 = (SubLObject)NIL;
        }
        final SubLThread var89 = SubLProcess.currentSubLThread();
        assert NIL != module0090.f6129(var69) : var69;
        final SubLObject var90 = module0079.f5416(var1, var19, (SubLObject)$ic51$);
        SubLObject var91 = (SubLObject)NIL;
        if (NIL != f6883(var90)) {
            final SubLObject var92 = var90;
            if (NIL != f6907(var92)) {
                assert NIL != module0095.f6844(var88) : var88;
                f6925(var1, var88, var69, var19, (SubLObject)UNPROVIDED);
            }
            f6898(var92);
            if (NIL != module0090.f6127(var69)) {
                final SubLObject var93 = $g1262$.getDynamicValue(var89);
                if (var93.isLock()) {
                    final SubLObject var94 = var93;
                    SubLObject var95 = (SubLObject)NIL;
                    try {
                        var95 = Locks.seize_lock(var94);
                        module0090.f6143(var69, var19);
                    }
                    finally {
                        if (NIL != var95) {
                            Locks.release_lock(var94);
                        }
                    }
                }
                else {
                    module0090.f6143(var69, var19);
                }
            }
            var91 = (SubLObject)$ic52$;
        }
        return var91;
    }
    
    public static SubLObject f6934(final SubLObject var1, final SubLObject var19) {
        return f6935(var1, (SubLObject)NIL, var19);
    }
    
    public static SubLObject f6935(final SubLObject var1, final SubLObject var69, final SubLObject var19) {
        final SubLThread var70 = SubLProcess.currentSubLThread();
        assert NIL != module0090.f6129(var69) : var69;
        final SubLObject var71 = module0079.f5416(var1, var19, (SubLObject)$ic51$);
        SubLObject var72 = (SubLObject)NIL;
        if (NIL != f6883(var71)) {
            final SubLObject var73 = var71;
            if (NIL != f6906(var73)) {
                f6900(var73);
                if (NIL != module0090.f6127(var69)) {
                    final SubLObject var74 = $g1262$.getDynamicValue(var70);
                    if (var74.isLock()) {
                        final SubLObject var75 = var74;
                        SubLObject var76 = (SubLObject)NIL;
                        try {
                            var76 = Locks.seize_lock(var75);
                            module0090.f6139(var69, var19);
                            module0090.f6150(var69);
                        }
                        finally {
                            if (NIL != var76) {
                                Locks.release_lock(var75);
                            }
                        }
                    }
                    else {
                        module0090.f6139(var69, var19);
                        module0090.f6150(var69);
                    }
                }
                var72 = (SubLObject)$ic55$;
            }
        }
        return var72;
    }
    
    public static SubLObject f6936(final SubLObject var46, final SubLObject var47) {
        SubLObject var49;
        final SubLObject var48 = var49 = var46.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var49, var48, (SubLObject)$ic56$);
        final SubLObject var50 = var49.rest();
        var49 = var49.first();
        SubLObject var51 = (SubLObject)NIL;
        SubLObject var52 = (SubLObject)NIL;
        SubLObject var53 = (SubLObject)NIL;
        SubLObject var54 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var49, var48, (SubLObject)$ic56$);
        var51 = var49.first();
        var49 = var49.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var49, var48, (SubLObject)$ic56$);
        var52 = var49.first();
        var49 = var49.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var49, var48, (SubLObject)$ic56$);
        var53 = var49.first();
        var49 = var49.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var49, var48, (SubLObject)$ic56$);
        var54 = var49.first();
        var49 = var49.rest();
        SubLObject var55 = (SubLObject)NIL;
        SubLObject var56 = var49;
        SubLObject var57 = (SubLObject)NIL;
        SubLObject var100_101 = (SubLObject)NIL;
        while (NIL != var56) {
            cdestructuring_bind.destructuring_bind_must_consp(var56, var48, (SubLObject)$ic56$);
            var100_101 = var56.first();
            var56 = var56.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var56, var48, (SubLObject)$ic56$);
            if (NIL == conses_high.member(var100_101, (SubLObject)$ic57$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var57 = (SubLObject)T;
            }
            if (var100_101 == $ic58$) {
                var55 = var56.first();
            }
            var56 = var56.rest();
        }
        if (NIL != var57 && NIL == var55) {
            cdestructuring_bind.cdestructuring_bind_error(var48, (SubLObject)$ic56$);
        }
        final SubLObject var58 = cdestructuring_bind.property_list_member((SubLObject)$ic59$, var49);
        final SubLObject var59 = (SubLObject)((NIL != var58) ? conses_high.cadr(var58) : NIL);
        final SubLObject var60 = cdestructuring_bind.property_list_member((SubLObject)$ic60$, var49);
        final SubLObject var61 = (SubLObject)((NIL != var60) ? conses_high.cadr(var60) : NIL);
        final SubLObject var62;
        var49 = (var62 = var50);
        final SubLObject var63 = (SubLObject)$ic61$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic39$, (SubLObject)ConsesLow.list(var52), (SubLObject)ConsesLow.list((SubLObject)$ic62$, (SubLObject)ConsesLow.list(var51, var63, var53, (SubLObject)$ic59$, var59), (SubLObject)ConsesLow.listS((SubLObject)$ic63$, (SubLObject)ConsesLow.list((SubLObject)$ic64$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var63), (SubLObject)ConsesLow.list((SubLObject)$ic65$, var63)), (SubLObject)ConsesLow.list((SubLObject)$ic66$, var52, (SubLObject)ConsesLow.list((SubLObject)$ic67$, var53, var54, var61, var51)), ConsesLow.append(var62, (SubLObject)NIL))));
    }
    
    public static SubLObject f6937(final SubLObject var1, final SubLObject var12, SubLObject var106, SubLObject var69) {
        if (var106 == UNPROVIDED) {
            var106 = (SubLObject)NIL;
        }
        if (var69 == UNPROVIDED) {
            var69 = (SubLObject)NIL;
        }
        if (NIL == var106) {
            var106 = module0021.f1153();
        }
        return module0052.f3689(f6938(var1, var12, var106, var69), (SubLObject)$ic68$, (SubLObject)$ic69$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f6938(final SubLObject var1, final SubLObject var12, final SubLObject var106, final SubLObject var69) {
        final SubLObject var107 = module0079.f5424(var1);
        final SubLObject var108 = module0052.f3693(var107);
        return (SubLObject)ConsesLow.list(var108, var107, var1, var12, var106, var69);
    }
    
    public static SubLObject f6939(final SubLObject var109) {
        SubLObject var110 = (SubLObject)NIL;
        SubLObject var111 = (SubLObject)NIL;
        SubLObject var112 = (SubLObject)NIL;
        SubLObject var113 = (SubLObject)NIL;
        SubLObject var114 = (SubLObject)NIL;
        SubLObject var115 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var109, var109, (SubLObject)$ic70$);
        var110 = var109.first();
        SubLObject var116 = var109.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var116, var109, (SubLObject)$ic70$);
        var111 = var116.first();
        var116 = var116.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var116, var109, (SubLObject)$ic70$);
        var112 = var116.first();
        var116 = var116.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var116, var109, (SubLObject)$ic70$);
        var113 = var116.first();
        var116 = var116.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var116, var109, (SubLObject)$ic70$);
        var114 = var116.first();
        var116 = var116.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var116, var109, (SubLObject)$ic70$);
        var115 = var116.first();
        var116 = var116.rest();
        if (NIL == var116) {
            return (SubLObject)makeBoolean(NIL != module0052.f3687(var111) && NIL == var110);
        }
        cdestructuring_bind.cdestructuring_bind_error(var109, (SubLObject)$ic70$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f6940(final SubLObject var109) {
        final SubLThread var110 = SubLProcess.currentSubLThread();
        SubLObject var111 = (SubLObject)NIL;
        SubLObject var112 = (SubLObject)NIL;
        SubLObject var113 = (SubLObject)NIL;
        SubLObject var114 = (SubLObject)NIL;
        SubLObject var115 = (SubLObject)NIL;
        SubLObject var116 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var109, var109, (SubLObject)$ic70$);
        var111 = var109.first();
        SubLObject var117 = var109.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var117, var109, (SubLObject)$ic70$);
        var112 = var117.first();
        var117 = var117.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var117, var109, (SubLObject)$ic70$);
        var113 = var117.first();
        var117 = var117.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var117, var109, (SubLObject)$ic70$);
        var114 = var117.first();
        var117 = var117.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var117, var109, (SubLObject)$ic70$);
        var115 = var117.first();
        var117 = var117.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var117, var109, (SubLObject)$ic70$);
        var116 = var117.first();
        var117 = var117.rest();
        if (NIL == var117) {
            SubLObject var118 = var109;
            SubLObject var119 = (SubLObject)NIL;
            while (var118.eql(var109)) {
                var119 = var111.first();
                final SubLObject var120 = module0021.$g777$.currentBinding(var110);
                try {
                    module0021.$g777$.bind((SubLObject)NIL, var110);
                    module0021.f1151(var115);
                    var118 = f6925(var113, var114, var116, var119, var109);
                }
                finally {
                    module0021.$g777$.rebind(var120, var110);
                }
                if (var118.eql(var109) && NIL != module0052.f3687(var112)) {
                    ConsesLow.set_nth((SubLObject)ZERO_INTEGER, var109, (SubLObject)NIL);
                    return Values.values((SubLObject)NIL, var109, (SubLObject)$ic71$);
                }
                final SubLObject var121 = module0052.f3693(var112);
                ConsesLow.set_nth((SubLObject)ZERO_INTEGER, var109, var121);
                var111 = var121;
            }
            var111 = (SubLObject)ConsesLow.list(var119, var118);
            return Values.values(var111, var109);
        }
        cdestructuring_bind.cdestructuring_bind_error(var109, (SubLObject)$ic70$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f6941(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)ZERO_INTEGER;
        SubLObject var4 = (SubLObject)ZERO_INTEGER;
        final SubLObject var5 = module0079.f5424(var1);
        SubLObject var8;
        for (SubLObject var6 = (SubLObject)NIL; NIL == var6; var6 = (SubLObject)makeBoolean(NIL == var8)) {
            var2.resetMultipleValues();
            final SubLObject var7 = module0052.f3693(var5);
            var8 = var2.secondMultipleValue();
            var2.resetMultipleValues();
            if (NIL != var8) {
                SubLObject var10;
                final SubLObject var9 = var10 = var7;
                SubLObject var11 = (SubLObject)NIL;
                SubLObject var12 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var10, var9, (SubLObject)$ic2$);
                var11 = var10.first();
                var10 = var10.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var10, var9, (SubLObject)$ic2$);
                var12 = var10.first();
                var10 = var10.rest();
                if (NIL == var10) {
                    if (NIL != f6883(var12)) {
                        if (NIL != f6911(var12)) {
                            var3 = Numbers.add(var3, (SubLObject)ONE_INTEGER);
                        }
                        else if (NIL != f6907(var12)) {
                            var4 = Numbers.add(var4, (SubLObject)ONE_INTEGER);
                        }
                    }
                    else {
                        var3 = Numbers.add(var3, (SubLObject)ONE_INTEGER);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var9, (SubLObject)$ic2$);
                }
            }
        }
        return Values.values(var3, var4);
    }
    
    public static SubLObject f6942(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)ZERO_INTEGER;
        final SubLObject var4 = module0079.f5424(var1);
        SubLObject var7;
        for (SubLObject var5 = (SubLObject)NIL; NIL == var5; var5 = (SubLObject)makeBoolean(NIL == var7)) {
            var2.resetMultipleValues();
            final SubLObject var6 = module0052.f3693(var4);
            var7 = var2.secondMultipleValue();
            var2.resetMultipleValues();
            if (NIL != var7) {
                SubLObject var9;
                final SubLObject var8 = var9 = var6;
                SubLObject var10 = (SubLObject)NIL;
                SubLObject var11 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic2$);
                var10 = var9.first();
                var9 = var9.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic2$);
                var11 = var9.first();
                var9 = var9.rest();
                if (NIL == var9) {
                    if (NIL != f6943(var11)) {
                        var3 = Numbers.add(var3, (SubLObject)ONE_INTEGER);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var8, (SubLObject)$ic2$);
                }
            }
        }
        return Values.values(var1, var3);
    }
    
    public static SubLObject f6927(final SubLObject var1, final SubLObject var19) {
        final SubLObject var20 = module0079.f5414(var1, var19, (SubLObject)UNPROVIDED);
        return f6943(var20);
    }
    
    public static SubLObject f6943(final SubLObject var20) {
        if (NIL != f6883(var20) && NIL != f6908(var20)) {
            f6895(var20);
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f6944(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0079.f5424(var1);
        SubLObject var6;
        for (SubLObject var4 = (SubLObject)NIL; NIL == var4; var4 = (SubLObject)makeBoolean(NIL == var6)) {
            var2.resetMultipleValues();
            final SubLObject var5 = module0052.f3693(var3);
            var6 = var2.secondMultipleValue();
            var2.resetMultipleValues();
            if (NIL != var6) {
                SubLObject var8;
                final SubLObject var7 = var8 = var5;
                SubLObject var9 = (SubLObject)NIL;
                SubLObject var10 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var8, var7, (SubLObject)$ic2$);
                var9 = var8.first();
                var8 = var8.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var8, var7, (SubLObject)$ic2$);
                var10 = var8.first();
                var8 = var8.rest();
                if (NIL == var8) {
                    if (NIL != f6883(var10)) {
                        if (NIL != f6910(var10)) {
                            module0079.f5418(var1, var9);
                        }
                        else if (NIL != f6909(var10)) {
                            final SubLObject var11 = f6892(var10);
                            module0079.f5412(var1, var9, var11);
                        }
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var7, (SubLObject)$ic2$);
                }
            }
        }
        return var1;
    }
    
    public static SubLObject f6920(final SubLObject var125) {
        final SubLObject var126 = Numbers.multiply(var125, (SubLObject)TWO_INTEGER);
        return f6878(var126);
    }
    
    public static SubLObject f6878(final SubLObject var126) {
        return Numbers.add(var126, (SubLObject)ONE_INTEGER);
    }
    
    public static SubLObject f6918(final SubLObject var12) {
        return Numbers.integerDivide(module0095.f6854(var12), (SubLObject)TWO_INTEGER);
    }
    
    public static SubLObject f6919(final SubLObject var8) {
        return module0021.f1060(var8, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f6926(final SubLObject var8) {
        return module0021.f1060(var8, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f6945(final SubLObject var1, final SubLObject var12, SubLObject var127) {
        if (var127 == UNPROVIDED) {
            var127 = (SubLObject)NIL;
        }
        return f6946(var1, var1, var12, var127);
    }
    
    public static SubLObject f6947(final SubLObject var128, final SubLObject var12, SubLObject var127) {
        if (var127 == UNPROVIDED) {
            var127 = (SubLObject)NIL;
        }
        final SubLObject var129 = module0079.f5427(var128);
        return f6946(var128, var129, var12, var127);
    }
    
    public static SubLObject f6948(final SubLObject var128, final SubLObject var63, final SubLObject var12, SubLObject var127) {
        if (var127 == UNPROVIDED) {
            var127 = (SubLObject)NIL;
        }
        return f6946(var128, var63, var12, var127);
    }
    
    public static SubLObject f6946(final SubLObject var128, final SubLObject var63, final SubLObject var12, SubLObject var127) {
        if (var127 == UNPROVIDED) {
            var127 = (SubLObject)NIL;
        }
        final SubLThread var129 = SubLProcess.currentSubLThread();
        f6877(var63, var12);
        final SubLObject var130 = module0079.f5424(var128);
        SubLObject var133;
        for (SubLObject var131 = (SubLObject)NIL; NIL == var131; var131 = (SubLObject)makeBoolean(NIL == var133)) {
            var129.resetMultipleValues();
            final SubLObject var132 = module0052.f3693(var130);
            var133 = var129.secondMultipleValue();
            var129.resetMultipleValues();
            if (NIL != var133) {
                SubLObject var135;
                final SubLObject var134 = var135 = var132;
                SubLObject var136 = (SubLObject)NIL;
                SubLObject var137 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var135, var134, (SubLObject)$ic2$);
                var136 = var135.first();
                var135 = var135.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var135, var134, (SubLObject)$ic2$);
                var137 = var135.first();
                var135 = var135.rest();
                if (NIL == var135) {
                    if (NIL == f6883(var137) || NIL == f6910(var137)) {
                        if (NIL != f6883(var137)) {
                            if (NIL == f6911(var137)) {
                                Errors.error((SubLObject)$ic72$);
                            }
                            var137 = f6892(var137);
                        }
                        final SubLObject var138 = f6876(var136, var137, var12);
                        final SubLObject var139 = f6878(var138);
                        final SubLObject var140 = (NIL != var127) ? f6894(var139) : f6896(var139, var137);
                        module0079.f5412(var63, var136, var140);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var134, (SubLObject)$ic2$);
                }
            }
        }
        return var63;
    }
    
    public static SubLObject f6949(final SubLObject var29, final SubLObject var30) {
        f6950(var29, var30, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f6951(final SubLObject var29) {
        return (SubLObject)((var29.getClass() == $sX8672_native.class) ? T : NIL);
    }
    
    public static SubLObject f6952(final SubLObject var29) {
        assert NIL != f6951(var29) : var29;
        return var29.getField2();
    }
    
    public static SubLObject f6953(final SubLObject var29) {
        assert NIL != f6951(var29) : var29;
        return var29.getField3();
    }
    
    public static SubLObject f6954(final SubLObject var29) {
        assert NIL != f6951(var29) : var29;
        return var29.getField4();
    }
    
    public static SubLObject f6955(final SubLObject var29, final SubLObject var32) {
        assert NIL != f6951(var29) : var29;
        return var29.setField2(var32);
    }
    
    public static SubLObject f6956(final SubLObject var29, final SubLObject var32) {
        assert NIL != f6951(var29) : var29;
        return var29.setField3(var32);
    }
    
    public static SubLObject f6957(final SubLObject var29, final SubLObject var32) {
        assert NIL != f6951(var29) : var29;
        return var29.setField4(var32);
    }
    
    public static SubLObject f6958(SubLObject var33) {
        if (var33 == UNPROVIDED) {
            var33 = (SubLObject)NIL;
        }
        final SubLObject var34 = (SubLObject)new $sX8672_native();
        SubLObject var35;
        SubLObject var36;
        SubLObject var37;
        SubLObject var38;
        for (var35 = (SubLObject)NIL, var35 = var33; NIL != var35; var35 = conses_high.cddr(var35)) {
            var36 = var35.first();
            var37 = conses_high.cadr(var35);
            var38 = var36;
            if (var38.eql((SubLObject)$ic88$)) {
                f6955(var34, var37);
            }
            else if (var38.eql((SubLObject)$ic89$)) {
                f6956(var34, var37);
            }
            else if (var38.eql((SubLObject)$ic90$)) {
                f6957(var34, var37);
            }
            else {
                Errors.error((SubLObject)$ic19$, var36);
            }
        }
        return var34;
    }
    
    public static SubLObject f6959(final SubLObject var39, final SubLObject var40) {
        Functions.funcall(var40, var39, (SubLObject)$ic20$, (SubLObject)$ic91$, (SubLObject)THREE_INTEGER);
        Functions.funcall(var40, var39, (SubLObject)$ic22$, (SubLObject)$ic88$, f6952(var39));
        Functions.funcall(var40, var39, (SubLObject)$ic22$, (SubLObject)$ic89$, f6953(var39));
        Functions.funcall(var40, var39, (SubLObject)$ic22$, (SubLObject)$ic90$, f6954(var39));
        Functions.funcall(var40, var39, (SubLObject)$ic23$, (SubLObject)$ic91$, (SubLObject)THREE_INTEGER);
        return var39;
    }
    
    public static SubLObject f6960(final SubLObject var39, final SubLObject var40) {
        return f6959(var39, var40);
    }
    
    public static SubLObject f6961(final SubLObject var1, final SubLObject var88, SubLObject var106) {
        if (var106 == UNPROVIDED) {
            var106 = (SubLObject)NIL;
        }
        assert NIL != module0079.f5404(var1) : var1;
        if (NIL != var88 && !areAssertionsDisabledFor(me) && NIL == module0095.f6844(var88)) {
            throw new AssertionError(var88);
        }
        final SubLObject var107 = f6958((SubLObject)UNPROVIDED);
        f6955(var107, var1);
        f6956(var107, var88);
        f6957(var107, var106);
        return var107;
    }
    
    public static SubLObject f6962(final SubLObject var1, final SubLObject var2, final SubLObject var3, SubLObject var106) {
        if (var106 == UNPROVIDED) {
            var106 = (SubLObject)NIL;
        }
        final SubLObject var107 = module0095.f6845(var2, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return f6961(var1, var107, var106);
    }
    
    public static SubLObject f6963(final SubLObject var46, final SubLObject var47) {
        SubLObject var49;
        final SubLObject var48 = var49 = var46.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var49, var48, (SubLObject)$ic94$);
        final SubLObject var50 = var49.rest();
        var49 = var49.first();
        SubLObject var51 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var49, var48, (SubLObject)$ic94$);
        var51 = var49.first();
        var49 = var49.rest();
        if (NIL == var49) {
            final SubLObject var52;
            var49 = (var52 = var50);
            final SubLObject var53 = (SubLObject)$ic95$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic39$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var53, (SubLObject)ConsesLow.list((SubLObject)$ic86$, var51))), (SubLObject)ConsesLow.listS((SubLObject)$ic96$, var53, ConsesLow.append(var52, (SubLObject)NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var48, (SubLObject)$ic94$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f6950(final SubLObject var41, final SubLObject var30, final SubLObject var42) {
        final SubLThread var43 = SubLProcess.currentSubLThread();
        if (NIL != print_high.$print_readably$.getDynamicValue(var43)) {
            print_high.print_not_readable(var41, var30);
        }
        else {
            streams_high.write_string((SubLObject)$ic97$, var30, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            PrintLow.write((SubLObject)Types.type_of(var41), new SubLObject[] { $ic98$, var30 });
            streams_high.write_char((SubLObject)Characters.CHAR_space, var30);
            streams_high.write_string((SubLObject)$ic99$, var30, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            print_high.princ(f6952(var41), var30);
            streams_high.write_string((SubLObject)$ic100$, var30, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            print_high.princ(f6953(var41), var30);
            streams_high.write_string((SubLObject)$ic101$, var30, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            print_high.princ(Sequences.length(f6954(var41)), var30);
            streams_high.write_string((SubLObject)$ic102$, var30, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            streams_high.write_char((SubLObject)Characters.CHAR_space, var30);
            PrintLow.write(Equality.pointer(var41), new SubLObject[] { $ic98$, var30, $ic103$, SIXTEEN_INTEGER });
            streams_high.write_char((SubLObject)Characters.CHAR_greater, var30);
        }
        return var41;
    }
    
    public static SubLObject f6964(final SubLObject var1) {
        return f6961(var1, (SubLObject)NIL, (SubLObject)NIL);
    }
    
    public static SubLObject f6965(final SubLObject var140, final SubLObject var88, SubLObject var106) {
        if (var106 == UNPROVIDED) {
            var106 = (SubLObject)NIL;
        }
        f6956(var140, var88);
        f6957(var140, var106);
        return var140;
    }
    
    public static SubLObject f6966(final SubLObject var140, final SubLObject var145) {
        final SubLObject var146 = f6953(var145);
        final SubLObject var147 = f6954(var145);
        f6965(var140, var146, var147);
        return var140;
    }
    
    public static SubLObject f6967(final SubLObject var30) {
        final SubLObject var31 = module0021.f1060(var30, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return f6961(var31, (SubLObject)NIL, (SubLObject)NIL);
    }
    
    public static SubLObject f6968(final SubLObject var41, final SubLObject var30) {
        module0021.f1086($g1264$.getGlobalValue(), var30);
        module0021.f1038(f6952(var41), var30);
        return var41;
    }
    
    public static SubLObject f6969(final SubLObject var41, final SubLObject var30) {
        return f6968(var41, var30);
    }
    
    public static SubLObject f6970(final SubLObject var46, final SubLObject var47) {
        SubLObject var49;
        final SubLObject var48 = var49 = var46.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var49, var48, (SubLObject)$ic107$);
        final SubLObject var50 = var49.rest();
        var49 = var49.first();
        SubLObject var51 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var49, var48, (SubLObject)$ic107$);
        var51 = var49.first();
        var49 = var49.rest();
        if (NIL == var49) {
            final SubLObject var52;
            var49 = (var52 = var50);
            return (SubLObject)ConsesLow.listS((SubLObject)$ic39$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic108$, var51)), ConsesLow.append(var52, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var48, (SubLObject)$ic107$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f6971() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        return $g1265$.getDynamicValue(var4);
    }
    
    public static SubLObject f6972(final SubLObject var41) {
        return (SubLObject)T;
    }
    
    public static SubLObject f6973(final SubLObject var41) {
        return f6974(var41);
    }
    
    public static SubLObject f6974(final SubLObject var140) {
        final SubLObject var141 = f6952(var140);
        return module0079.f5406(var141);
    }
    
    public static SubLObject f6975(final SubLObject var41) {
        return f6976(var41);
    }
    
    public static SubLObject f6976(final SubLObject var41) {
        final SubLObject var42 = f6952(var41);
        return module0079.f5408(var42);
    }
    
    public static SubLObject f6977(final SubLObject var41, final SubLObject var19, final SubLObject var20) {
        return f6978(var41, var19, var20);
    }
    
    public static SubLObject f6978(final SubLObject var41, final SubLObject var19, final SubLObject var20) {
        final SubLObject var42 = f6952(var41);
        return f6929(var42, f6971(), var19, var20);
    }
    
    public static SubLObject f6979(final SubLObject var41, final SubLObject var19, final SubLObject var68) {
        return f6980(var41, var19, var68);
    }
    
    public static SubLObject f6980(final SubLObject var41, final SubLObject var19, final SubLObject var68) {
        final SubLThread var69 = SubLProcess.currentSubLThread();
        final SubLObject var70 = f6952(var41);
        final SubLObject var71 = f6953(var41);
        SubLObject var72 = (SubLObject)NIL;
        SubLObject var73 = (SubLObject)NIL;
        final SubLObject var74 = f6954(var41);
        final SubLObject var75 = module0021.$g777$.currentBinding(var69);
        try {
            module0021.$g777$.bind((SubLObject)NIL, var69);
            module0021.f1151(var74);
            var72 = f6925(var70, var71, f6971(), var19, var68);
            var73 = (SubLObject)makeBoolean(!var72.eql(var68));
        }
        finally {
            module0021.$g777$.rebind(var75, var69);
        }
        if (NIL != f6951(var72)) {
            f6966(var72, var41);
        }
        return Values.values(var72, var73);
    }
    
    public static SubLObject f6981(final SubLObject var41, final SubLObject var19, final SubLObject var68) {
        return f6982(var41, var19, var68);
    }
    
    public static SubLObject f6982(final SubLObject var41, final SubLObject var19, final SubLObject var68) {
        final SubLThread var69 = SubLProcess.currentSubLThread();
        final SubLObject var70 = f6952(var41);
        final SubLObject var71 = f6953(var41);
        SubLObject var72 = (SubLObject)NIL;
        final SubLObject var73 = f6954(var41);
        final SubLObject var74 = module0021.$g777$.currentBinding(var69);
        try {
            module0021.$g777$.bind((SubLObject)NIL, var69);
            module0021.f1151(var73);
            var72 = f6925(var70, var71, f6971(), var19, var68);
        }
        finally {
            module0021.$g777$.rebind(var74, var69);
        }
        if (NIL != f6951(var72)) {
            f6966(var72, var41);
        }
        return var72;
    }
    
    public static SubLObject f6983(final SubLObject var41, final SubLObject var19) {
        return f6984(var41, var19);
    }
    
    public static SubLObject f6984(final SubLObject var41, final SubLObject var19) {
        final SubLObject var42 = f6952(var41);
        return f6931(var42, f6971(), var19, (SubLObject)NIL);
    }
    
    public static SubLObject f6985(final SubLObject var41) {
        return f6986(var41);
    }
    
    public static SubLObject f6986(final SubLObject var41) {
        final SubLObject var42 = f6952(var41);
        module0079.f5420(var42);
        return var41;
    }
    
    public static SubLObject f6987(final SubLObject var41, final SubLObject var19) {
        return f6988(var41, var19);
    }
    
    public static SubLObject f6988(final SubLObject var41, final SubLObject var19) {
        final SubLThread var42 = SubLProcess.currentSubLThread();
        final SubLObject var43 = f6952(var41);
        final SubLObject var44 = f6953(var41);
        SubLObject var45 = (SubLObject)NIL;
        final SubLObject var46 = f6954(var41);
        final SubLObject var47 = module0021.$g777$.currentBinding(var42);
        try {
            module0021.$g777$.bind((SubLObject)NIL, var42);
            module0021.f1151(var46);
            var45 = f6933(var43, f6971(), var19, var44);
        }
        finally {
            module0021.$g777$.rebind(var47, var42);
        }
        return var45;
    }
    
    public static SubLObject f6989(final SubLObject var41, final SubLObject var56, final SubLObject var57) {
        return f6990(var41, var56, var57);
    }
    
    public static SubLObject f6990(final SubLObject var41, final SubLObject var56, final SubLObject var57) {
        final SubLThread var58 = SubLProcess.currentSubLThread();
        final SubLObject var59 = f6952(var41);
        final SubLObject var60 = f6953(var41);
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var58) && !var56.eql(module0079.f5408(var59))) {
            Errors.error((SubLObject)$ic119$, module0079.f5408(var59), var56);
        }
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var58) && !var57.numE(module0079.f5406(var59))) {
            Errors.error((SubLObject)$ic120$, module0079.f5406(var59), var57);
        }
        final SubLObject var61 = module0079.f5427(var59);
        final SubLObject var62 = module0095.f6848(var60);
        return f6961(var61, var62, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f6991(final SubLObject var41) {
        return f6992(var41);
    }
    
    public static SubLObject f6992(final SubLObject var41) {
        return module0052.f3689(f6993(var41), (SubLObject)$ic122$, (SubLObject)$ic123$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f6993(final SubLObject var140) {
        final SubLThread var141 = SubLProcess.currentSubLThread();
        final SubLObject var142 = f6952(var140);
        final SubLObject var143 = f6953(var140);
        final SubLObject var144 = f6971();
        SubLObject var145 = (SubLObject)NIL;
        final SubLObject var146 = f6954(var140);
        final SubLObject var147 = module0021.$g777$.currentBinding(var141);
        try {
            module0021.$g777$.bind((SubLObject)NIL, var141);
            module0021.f1151(var146);
            var145 = f6937(var142, var143, (SubLObject)NIL, var144);
        }
        finally {
            module0021.$g777$.rebind(var147, var141);
        }
        return (SubLObject)ConsesLow.list(var140, var145, var144);
    }
    
    public static SubLObject f6994(final SubLObject var109) {
        SubLObject var110 = (SubLObject)NIL;
        SubLObject var111 = (SubLObject)NIL;
        SubLObject var112 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var109, var109, (SubLObject)$ic124$);
        var110 = var109.first();
        SubLObject var113 = var109.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var113, var109, (SubLObject)$ic124$);
        var111 = var113.first();
        var113 = var113.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var113, var109, (SubLObject)$ic124$);
        var112 = var113.first();
        var113 = var113.rest();
        if (NIL == var113) {
            return module0052.f3687(var111);
        }
        cdestructuring_bind.cdestructuring_bind_error(var109, (SubLObject)$ic124$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f6995(final SubLObject var109) {
        final SubLThread var110 = SubLProcess.currentSubLThread();
        SubLObject var111 = (SubLObject)NIL;
        SubLObject var112 = (SubLObject)NIL;
        SubLObject var113 = (SubLObject)NIL;
        SubLObject var114 = (SubLObject)NIL;
        SubLObject var115 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var109, var109, (SubLObject)$ic124$);
        var113 = var109.first();
        SubLObject var116 = var109.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var116, var109, (SubLObject)$ic124$);
        var114 = var116.first();
        var116 = var116.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var116, var109, (SubLObject)$ic124$);
        var115 = var116.first();
        var116 = var116.rest();
        if (NIL == var116) {
            final SubLObject var117 = $g1265$.currentBinding(var110);
            try {
                $g1265$.bind(var115, var110);
                var110.resetMultipleValues();
                final SubLObject var160_161 = module0052.f3693(var114);
                final SubLObject var162_163 = var110.secondMultipleValue();
                var110.resetMultipleValues();
                var111 = var160_161;
                var112 = var162_163;
                if (NIL != var112) {
                    SubLObject var166_167;
                    final SubLObject var164_165 = var166_167 = var111;
                    SubLObject var118 = (SubLObject)NIL;
                    SubLObject var119 = (SubLObject)NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var166_167, var164_165, (SubLObject)$ic2$);
                    var118 = var166_167.first();
                    var166_167 = var166_167.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var166_167, var164_165, (SubLObject)$ic2$);
                    var119 = var166_167.first();
                    var166_167 = var166_167.rest();
                    if (NIL == var166_167) {
                        if (NIL != f6951(var119)) {
                            final SubLObject var120 = f6954(var113);
                            final SubLObject var7_168 = module0021.$g777$.currentBinding(var110);
                            try {
                                module0021.$g777$.bind((SubLObject)NIL, var110);
                                module0021.f1151(var120);
                                final SubLObject var121 = f6953(var113);
                                f6965(var119, var121, module0021.f1153());
                            }
                            finally {
                                module0021.$g777$.rebind(var7_168, var110);
                            }
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var164_165, (SubLObject)$ic2$);
                    }
                }
            }
            finally {
                $g1265$.rebind(var117, var110);
            }
            return Values.values(var111, var109, (SubLObject)makeBoolean(NIL == var112));
        }
        cdestructuring_bind.cdestructuring_bind_error(var109, (SubLObject)$ic124$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f6996(final SubLObject var41) {
        return f6997(var41);
    }
    
    public static SubLObject f6997(final SubLObject var41) {
        final SubLObject var42 = f6952(var41);
        return module0079.f5430(var42, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f6998(final SubLObject var140) {
        final SubLThread var141 = SubLProcess.currentSubLThread();
        final SubLObject var142 = module0055.f4017();
        SubLObject var143 = (SubLObject)ZERO_INTEGER;
        module0055.f4021(var140, var142);
        while (NIL == module0055.f4019(var142)) {
            final SubLObject var144 = module0055.f4023(var142);
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var141) && NIL == f6951(var144)) {
                Errors.error((SubLObject)$ic126$, var144);
            }
            final SubLObject var145 = f6952(var144);
            var141.resetMultipleValues();
            final SubLObject var146 = f6942(var145);
            final SubLObject var147 = var141.secondMultipleValue();
            var141.resetMultipleValues();
            var143 = Numbers.add(var143, var147);
            final SubLObject var148 = module0079.f5424(var145);
            SubLObject var151;
            for (SubLObject var149 = (SubLObject)NIL; NIL == var149; var149 = (SubLObject)makeBoolean(NIL == var151)) {
                var141.resetMultipleValues();
                final SubLObject var150 = module0052.f3693(var148);
                var151 = var141.secondMultipleValue();
                var141.resetMultipleValues();
                if (NIL != var151) {
                    SubLObject var153;
                    final SubLObject var152 = var153 = var150;
                    SubLObject var154 = (SubLObject)NIL;
                    SubLObject var155 = (SubLObject)NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var153, var152, (SubLObject)$ic2$);
                    var154 = var153.first();
                    var153 = var153.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var153, var152, (SubLObject)$ic2$);
                    var155 = var153.first();
                    var153 = var153.rest();
                    if (NIL == var153) {
                        if (NIL != f6951(var155)) {
                            module0055.f4021(var155, var142);
                        }
                        else if (NIL != f6883(var155) && NIL != f6909(var155)) {
                            final SubLObject var156 = f6892(var155);
                            if (NIL != f6951(var156)) {
                                module0055.f4021(var156, var142);
                            }
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var152, (SubLObject)$ic2$);
                    }
                }
            }
        }
        return Values.values(var140, var143);
    }
    
    public static SubLObject f6999(final SubLObject var140) {
        final SubLThread var141 = SubLProcess.currentSubLThread();
        final SubLObject var142 = module0055.f4017();
        SubLObject var143 = (SubLObject)ZERO_INTEGER;
        SubLObject var144 = (SubLObject)ZERO_INTEGER;
        module0055.f4021(var140, var142);
        while (NIL == module0055.f4019(var142)) {
            final SubLObject var145 = module0055.f4023(var142);
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var141) && NIL == f6951(var145)) {
                Errors.error((SubLObject)$ic127$, var145);
            }
            var144 = Numbers.add(var144, (SubLObject)ONE_INTEGER);
            final SubLObject var146 = f6952(var145);
            final SubLObject var147 = module0079.f5424(var146);
            SubLObject var150;
            for (SubLObject var148 = (SubLObject)NIL; NIL == var148; var148 = (SubLObject)makeBoolean(NIL == var150)) {
                var141.resetMultipleValues();
                final SubLObject var149 = module0052.f3693(var147);
                var150 = var141.secondMultipleValue();
                var141.resetMultipleValues();
                if (NIL != var150) {
                    SubLObject var152;
                    final SubLObject var151 = var152 = var149;
                    SubLObject var153 = (SubLObject)NIL;
                    SubLObject var154 = (SubLObject)NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var152, var151, (SubLObject)$ic2$);
                    var153 = var152.first();
                    var152 = var152.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var152, var151, (SubLObject)$ic2$);
                    var154 = var152.first();
                    var152 = var152.rest();
                    if (NIL == var152) {
                        if (NIL != f6883(var154)) {
                            if (NIL != f6909(var154)) {
                                final SubLObject var155 = f6892(var154);
                                if (NIL != f6951(var155)) {
                                    module0055.f4021(var155, var142);
                                }
                                else {
                                    var143 = Numbers.add(var143, (SubLObject)ONE_INTEGER);
                                }
                            }
                        }
                        else {
                            var143 = Numbers.add(var143, (SubLObject)ONE_INTEGER);
                            if (NIL != f6951(var154)) {
                                module0055.f4021(var154, var142);
                            }
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var151, (SubLObject)$ic2$);
                    }
                }
            }
        }
        return Values.values(var143, var144);
    }
    
    public static SubLObject f7000(final SubLObject var180, SubLObject var181) {
        if (var181 == UNPROVIDED) {
            var181 = (SubLObject)EQUAL;
        }
        final SubLObject var182 = module0084.f5781(var180, (SubLObject)EQUALP);
        return f7001(var182, var181);
    }
    
    public static SubLObject f7001(final SubLObject var1, SubLObject var181) {
        if (var181 == UNPROVIDED) {
            var181 = (SubLObject)EQUAL;
        }
        final SubLThread var182 = SubLProcess.currentSubLThread();
        final SubLObject var183 = module0075.f5182((SubLObject)$ic137$);
        try {
            final SubLObject var184 = module0075.f5182((SubLObject)$ic137$);
            try {
                final SubLObject var185 = module0079.f5406(var1);
                SubLObject var186 = (SubLObject)NIL;
                f6873(var1, var183, var184);
                SubLObject var187 = (SubLObject)NIL;
                try {
                    var187 = module0095.f6845(var183, var184, (SubLObject)$ic48$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    var186 = f6917(var187, module0079.f5408(var1), module0079.f5406(var1), (SubLObject)UNPROVIDED);
                    f7002(var186, (SubLObject)ZERO_INTEGER, var185);
                    SubLObject var188 = module0079.f5424(var186);
                    SubLObject var191;
                    for (SubLObject var189 = (SubLObject)NIL; NIL == var189; var189 = (SubLObject)makeBoolean(NIL == var191)) {
                        var182.resetMultipleValues();
                        final SubLObject var190 = module0052.f3693(var188);
                        var191 = var182.secondMultipleValue();
                        var182.resetMultipleValues();
                        if (NIL != var191) {
                            SubLObject var193;
                            final SubLObject var192 = var193 = var190;
                            SubLObject var194 = (SubLObject)NIL;
                            SubLObject var195 = (SubLObject)NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var193, var192, (SubLObject)$ic2$);
                            var194 = var193.first();
                            var193 = var193.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var193, var192, (SubLObject)$ic2$);
                            var195 = var193.first();
                            var193 = var193.rest();
                            if (NIL == var193) {
                                if ($ic51$ == module0079.f5414(var1, var194, (SubLObject)$ic51$)) {
                                    Errors.error((SubLObject)$ic138$, var194);
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(var192, (SubLObject)$ic2$);
                            }
                        }
                    }
                    var188 = module0079.f5424(var1);
                    for (SubLObject var189 = (SubLObject)NIL; NIL == var189; var189 = (SubLObject)makeBoolean(NIL == var191)) {
                        var182.resetMultipleValues();
                        final SubLObject var190 = module0052.f3693(var188);
                        var191 = var182.secondMultipleValue();
                        var182.resetMultipleValues();
                        if (NIL != var191) {
                            SubLObject var197;
                            final SubLObject var196 = var197 = var190;
                            SubLObject var194 = (SubLObject)NIL;
                            SubLObject var195 = (SubLObject)NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var197, var196, (SubLObject)$ic2$);
                            var194 = var197.first();
                            var197 = var197.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var197, var196, (SubLObject)$ic2$);
                            var195 = var197.first();
                            var197 = var197.rest();
                            if (NIL == var197) {
                                final SubLObject var198 = f6924(var186, var187, var194, (SubLObject)$ic51$);
                                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var182) && $ic51$ == var198) {
                                    Errors.error((SubLObject)$ic139$, var194);
                                }
                                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var182) && NIL == module0035.sublisp_boolean(Functions.funcall(var181, var195, var198))) {
                                    Errors.error((SubLObject)$ic140$, var195, var198, var181);
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(var196, (SubLObject)$ic2$);
                            }
                        }
                    }
                    final SubLObject var199 = module0079.f5433(var1);
                    final SubLObject var200 = Sequences.length(var199);
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var182) && !var185.numE(var200)) {
                        Errors.error((SubLObject)$ic141$, var185, var200);
                    }
                    final SubLObject var201 = module0079.f5435(var1);
                    final SubLObject var202 = Sequences.length(var201);
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var182) && !var185.numE(var202)) {
                        Errors.error((SubLObject)$ic142$, var185, var202);
                    }
                    f7002(var186, var185, (SubLObject)ZERO_INTEGER);
                    f6942(var186);
                    f7002(var186, (SubLObject)ZERO_INTEGER, var185);
                    final SubLObject var203 = module0079.f5430(var186, (SubLObject)UNPROVIDED);
                    final SubLObject var204 = Numbers.subtract(var185, (SubLObject)ONE_INTEGER);
                    final SubLObject var205 = Guids.new_guid();
                    SubLObject var206 = (SubLObject)NIL;
                    var206 = f6924(var186, var187, var203, (SubLObject)$ic51$);
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var182) && $ic51$ == var206) {
                        Errors.error((SubLObject)$ic143$, var203);
                    }
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var182) && NIL == f6883(module0079.f5414(var186, var203, (SubLObject)$ic51$))) {
                        Errors.error((SubLObject)$ic144$, var203);
                    }
                    f7002(var186, (SubLObject)ONE_INTEGER, var204);
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var182) && $ic52$ != f6932(var186, var203, (SubLObject)UNPROVIDED)) {
                        Errors.error((SubLObject)$ic145$);
                    }
                    f6942(var186);
                    f7002(var186, (SubLObject)ONE_INTEGER, var204);
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var182) && $ic55$ != f6934(var186, var203)) {
                        Errors.error((SubLObject)$ic146$, var203);
                    }
                    f7002(var186, (SubLObject)ZERO_INTEGER, var185);
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var182) && $ic52$ != f6928(var186, var203, var205)) {
                        Errors.error((SubLObject)$ic147$, var203);
                    }
                    final SubLObject var207 = f6924(var186, (SubLObject)NIL, var203, (SubLObject)$ic51$);
                    if (!var205.equalp(var207)) {
                        module0084.f5789(var186, (SubLObject)UNPROVIDED);
                        Errors.error((SubLObject)$ic148$, var203, var205, var207);
                    }
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var182) && NIL == f6909(module0079.f5414(var186, var203, (SubLObject)UNPROVIDED))) {
                        Errors.error((SubLObject)$ic149$, var203);
                    }
                    f7002(var186, (SubLObject)ONE_INTEGER, var204);
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var182) && $ic55$ != f6934(var186, var203)) {
                        Errors.error((SubLObject)$ic146$, var203);
                    }
                    f7002(var186, (SubLObject)ZERO_INTEGER, var185);
                }
                finally {
                    final SubLObject var208 = Threads.$is_thread_performing_cleanupP$.currentBinding(var182);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var182);
                        if (NIL != module0095.f6844(var187)) {
                            module0095.f6849(var187);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var208, var182);
                    }
                }
            }
            finally {
                final SubLObject var209 = Threads.$is_thread_performing_cleanupP$.currentBinding(var182);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var182);
                    SubLObject var210 = (SubLObject)NIL;
                    try {
                        var182.throwStack.push($ic150$);
                        final SubLObject var7_196 = Errors.$error_handler$.currentBinding(var182);
                        try {
                            Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)$ic151$), var182);
                            try {
                                Filesys.delete_file(var184);
                            }
                            catch (Throwable var211) {
                                Errors.handleThrowable(var211, (SubLObject)NIL);
                            }
                        }
                        finally {
                            Errors.$error_handler$.rebind(var7_196, var182);
                        }
                    }
                    catch (Throwable var212) {
                        var210 = Errors.handleThrowable(var212, (SubLObject)$ic150$);
                        var182.throwStack.pop();
                    }
                    finally {
                        var182.throwStack.pop();
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var209, var182);
                }
            }
        }
        finally {
            final SubLObject var213 = Threads.$is_thread_performing_cleanupP$.currentBinding(var182);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var182);
                SubLObject var214 = (SubLObject)NIL;
                try {
                    var182.throwStack.push($ic150$);
                    final SubLObject var7_197 = Errors.$error_handler$.currentBinding(var182);
                    try {
                        Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)$ic151$), var182);
                        try {
                            Filesys.delete_file(var183);
                        }
                        catch (Throwable var215) {
                            Errors.handleThrowable(var215, (SubLObject)NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(var7_197, var182);
                    }
                }
                catch (Throwable var216) {
                    var214 = Errors.handleThrowable(var216, (SubLObject)$ic150$);
                    var182.throwStack.pop();
                }
                finally {
                    var182.throwStack.pop();
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var213, var182);
            }
        }
        return (SubLObject)$ic152$;
    }
    
    public static SubLObject f7002(final SubLObject var1, final SubLObject var116, final SubLObject var117) {
        final SubLThread var118 = SubLProcess.currentSubLThread();
        var118.resetMultipleValues();
        final SubLObject var119 = f6941(var1);
        final SubLObject var120 = var118.secondMultipleValue();
        var118.resetMultipleValues();
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var118) && !var116.numE(var119)) {
            Errors.error((SubLObject)$ic153$, var116, var119);
        }
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var118) && !var117.numE(var120)) {
            Errors.error((SubLObject)$ic154$, var117, var120);
        }
        return var1;
    }
    
    public static SubLObject f7003(final SubLObject var180, SubLObject var181) {
        if (var181 == UNPROVIDED) {
            var181 = (SubLObject)EQUAL;
        }
        final SubLObject var182 = module0084.f5781(var180, (SubLObject)EQUALP);
        return f7004(var182, var181);
    }
    
    public static SubLObject f7004(final SubLObject var1, SubLObject var181) {
        if (var181 == UNPROVIDED) {
            var181 = (SubLObject)EQUAL;
        }
        final SubLThread var182 = SubLProcess.currentSubLThread();
        final SubLObject var183 = module0079.f5429(var1, (SubLObject)$ic155$);
        final SubLObject var184 = module0075.f5182((SubLObject)$ic137$);
        try {
            final SubLObject var185 = module0075.f5182((SubLObject)$ic137$);
            try {
                SubLObject var186 = (SubLObject)NIL;
                try {
                    var186 = module0095.f6845(var184, var185, (SubLObject)$ic0$, (SubLObject)$ic156$, (SubLObject)$ic156$, (SubLObject)UNPROVIDED);
                    f6945(var1, var186, (SubLObject)UNPROVIDED);
                }
                finally {
                    final SubLObject var187 = Threads.$is_thread_performing_cleanupP$.currentBinding(var182);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var182);
                        if (NIL != module0095.f6844(var186)) {
                            module0095.f6849(var186);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var187, var182);
                    }
                }
                final SubLObject var188 = module0079.f5424(var1);
                SubLObject var191;
                for (SubLObject var189 = (SubLObject)NIL; NIL == var189; var189 = (SubLObject)makeBoolean(NIL == var191)) {
                    var182.resetMultipleValues();
                    final SubLObject var190 = module0052.f3693(var188);
                    var191 = var182.secondMultipleValue();
                    var182.resetMultipleValues();
                    if (NIL != var191) {
                        SubLObject var193;
                        final SubLObject var192 = var193 = var190;
                        SubLObject var194 = (SubLObject)NIL;
                        SubLObject var195 = (SubLObject)NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(var193, var192, (SubLObject)$ic157$);
                        var194 = var193.first();
                        var193 = var193.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var193, var192, (SubLObject)$ic157$);
                        var195 = var193.first();
                        var193 = var193.rest();
                        if (NIL == var193) {
                            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var182) && NIL == f6883(var195)) {
                                Errors.error((SubLObject)$ic158$, var194);
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(var192, (SubLObject)$ic157$);
                        }
                    }
                }
                SubLObject var196 = (SubLObject)NIL;
                SubLObject var197 = (SubLObject)NIL;
                try {
                    var197 = module0095.f6845(var184, var185, (SubLObject)$ic48$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    var196 = f6917(var197, module0079.f5408(var1), module0079.f5406(var1), (SubLObject)UNPROVIDED);
                }
                finally {
                    final SubLObject var198 = Threads.$is_thread_performing_cleanupP$.currentBinding(var182);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var182);
                        if (NIL != module0095.f6844(var197)) {
                            module0095.f6849(var197);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var198, var182);
                    }
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var182) && !module0079.f5406(var196).numE(module0079.f5406(var1))) {
                    Errors.error((SubLObject)$ic159$, module0079.f5406(var196), module0079.f5406(var1));
                }
                final SubLObject var199 = module0079.f5424(var196);
                SubLObject var202;
                for (SubLObject var200 = (SubLObject)NIL; NIL == var200; var200 = (SubLObject)makeBoolean(NIL == var202)) {
                    var182.resetMultipleValues();
                    final SubLObject var201 = module0052.f3693(var199);
                    var202 = var182.secondMultipleValue();
                    var182.resetMultipleValues();
                    if (NIL != var202) {
                        SubLObject var204;
                        final SubLObject var203 = var204 = var201;
                        SubLObject var205 = (SubLObject)NIL;
                        SubLObject var206 = (SubLObject)NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(var204, var203, (SubLObject)$ic157$);
                        var205 = var204.first();
                        var204 = var204.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var204, var203, (SubLObject)$ic157$);
                        var206 = var204.first();
                        var204 = var204.rest();
                        if (NIL == var204) {
                            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var182) && NIL == f6883(var206)) {
                                Errors.error((SubLObject)$ic160$, var205);
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(var203, (SubLObject)$ic157$);
                        }
                    }
                }
                var197 = (SubLObject)NIL;
                try {
                    var197 = module0095.f6845(var184, var185, (SubLObject)$ic48$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    SubLObject var207 = (SubLObject)NIL;
                    final SubLObject var208 = module0079.f5424(var196);
                    SubLObject var211;
                    for (SubLObject var209 = (SubLObject)NIL; NIL == var209; var209 = (SubLObject)makeBoolean(NIL == var211)) {
                        var182.resetMultipleValues();
                        final SubLObject var210 = module0052.f3693(var208);
                        var211 = var182.secondMultipleValue();
                        var182.resetMultipleValues();
                        if (NIL != var211) {
                            SubLObject var213;
                            final SubLObject var212 = var213 = var210;
                            SubLObject var214 = (SubLObject)NIL;
                            SubLObject var215 = (SubLObject)NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var213, var212, (SubLObject)$ic161$);
                            var214 = var213.first();
                            var213 = var213.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var213, var212, (SubLObject)$ic161$);
                            var215 = var213.first();
                            var213 = var213.rest();
                            if (NIL == var213) {
                                if (NIL == f6883(var215) || NIL == f6910(var215)) {
                                    var207 = f6925(var196, var197, (SubLObject)NIL, var214, (SubLObject)UNPROVIDED);
                                    final SubLObject var216 = f6924(var1, (SubLObject)NIL, var214, (SubLObject)$ic51$);
                                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var182) && $ic51$ == var216) {
                                        Errors.error((SubLObject)$ic162$, var214);
                                    }
                                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var182) && NIL == module0035.sublisp_boolean(Functions.funcall(var181, var207, var216))) {
                                        Errors.error((SubLObject)$ic163$, new SubLObject[] { var214, var181, var207, var216 });
                                    }
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(var212, (SubLObject)$ic161$);
                            }
                        }
                    }
                }
                finally {
                    final SubLObject var217 = Threads.$is_thread_performing_cleanupP$.currentBinding(var182);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var182);
                        if (NIL != module0095.f6844(var197)) {
                            module0095.f6849(var197);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var217, var182);
                    }
                }
                final SubLObject var218 = module0078.f5367(module0079.f5433(var183), module0079.f5408(var183), (SubLObject)UNPROVIDED);
                SubLObject var219 = (SubLObject)NIL;
                try {
                    var219 = module0095.f6845(var184, var185, (SubLObject)$ic48$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    SubLObject var220;
                    SubLObject var221;
                    SubLObject var222;
                    SubLObject var223;
                    SubLObject var224;
                    SubLObject var225;
                    SubLObject var226;
                    SubLObject var227;
                    SubLObject var228;
                    SubLObject var229;
                    SubLObject var231;
                    SubLObject var230;
                    SubLObject var232;
                    SubLObject var233;
                    SubLObject var234;
                    SubLObject var235;
                    SubLObject var236;
                    SubLObject var237;
                    for (var220 = module0077.f5311(var218), var221 = (SubLObject)NIL, var221 = (SubLObject)ZERO_INTEGER; var221.numL(var220); var221 = Numbers.add(var221, (SubLObject)ONE_INTEGER)) {
                        var222 = Numbers.subtract(module0077.f5311(var218), (SubLObject)ONE_INTEGER);
                        var223 = module0035.f2099(module0077.f5312(var218));
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var182) && NIL == module0079.f5437(var196, var223)) {
                            Errors.error((SubLObject)$ic164$, var196, var218, var223);
                        }
                        f6930(var196, var223, (SubLObject)$ic165$);
                        module0077.f5327(var223, var218);
                        var224 = (SubLObject)ZERO_INTEGER;
                        var225 = f6937(var196, var219, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        var226 = module0077.f5314(var218);
                        for (var227 = (SubLObject)NIL; NIL == var227; var227 = (SubLObject)makeBoolean(NIL == var229)) {
                            var182.resetMultipleValues();
                            var228 = module0052.f3693(var225);
                            var229 = var182.secondMultipleValue();
                            var182.resetMultipleValues();
                            if (NIL != var229) {
                                var230 = (var231 = var228);
                                var232 = (SubLObject)NIL;
                                var233 = (SubLObject)NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(var231, var230, (SubLObject)$ic157$);
                                var232 = var231.first();
                                var231 = var231.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(var231, var230, (SubLObject)$ic157$);
                                var233 = var231.first();
                                var231 = var231.rest();
                                if (NIL == var231) {
                                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var182) && NIL == module0077.f5320(var232, var226)) {
                                        Errors.error((SubLObject)$ic166$, var232, module0077.f5312(var226));
                                    }
                                    var224 = Numbers.add(var224, (SubLObject)ONE_INTEGER);
                                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var182) && var232.eql(var223)) {
                                        Errors.error((SubLObject)$ic167$, var223, var233);
                                    }
                                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var182) && !module0079.f5414(var183, var232, (SubLObject)UNPROVIDED).equalp(var233)) {
                                        Errors.error((SubLObject)$ic168$, var232, module0079.f5414(var183, var232, (SubLObject)UNPROVIDED), var233);
                                    }
                                    module0077.f5327(var232, var226);
                                }
                                else {
                                    cdestructuring_bind.cdestructuring_bind_error(var230, (SubLObject)$ic157$);
                                }
                            }
                        }
                        if (NIL == module0077.f5318(var226)) {
                            Errors.warn((SubLObject)$ic169$, module0077.f5312(var226));
                            var234 = module0077.f5333(var226);
                            for (var235 = module0032.f1741(var234), var236 = (SubLObject)NIL, var236 = module0032.f1742(var235, var234); NIL == module0032.f1744(var235, var236); var236 = module0032.f1743(var236)) {
                                var237 = module0032.f1745(var235, var236);
                                if (NIL != module0032.f1746(var236, var237)) {
                                    if (NIL != module0079.f5437(var196, var237)) {
                                        Errors.warn((SubLObject)$ic170$, var237);
                                    }
                                    else {
                                        Errors.warn((SubLObject)$ic171$, var237);
                                    }
                                }
                            }
                            Errors.error((SubLObject)$ic172$, var223, module0077.f5312(var218));
                        }
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var182) && !var224.numE(var222)) {
                            Errors.error((SubLObject)$ic173$, var224, var222);
                        }
                    }
                }
                finally {
                    final SubLObject var238 = Threads.$is_thread_performing_cleanupP$.currentBinding(var182);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var182);
                        if (NIL != module0095.f6844(var219)) {
                            module0095.f6849(var219);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var238, var182);
                    }
                }
            }
            finally {
                final SubLObject var239 = Threads.$is_thread_performing_cleanupP$.currentBinding(var182);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var182);
                    SubLObject var240 = (SubLObject)NIL;
                    try {
                        var182.throwStack.push($ic150$);
                        final SubLObject var7_226 = Errors.$error_handler$.currentBinding(var182);
                        try {
                            Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)$ic151$), var182);
                            try {
                                Filesys.delete_file(var185);
                            }
                            catch (Throwable var241) {
                                Errors.handleThrowable(var241, (SubLObject)NIL);
                            }
                        }
                        finally {
                            Errors.$error_handler$.rebind(var7_226, var182);
                        }
                    }
                    catch (Throwable var242) {
                        var240 = Errors.handleThrowable(var242, (SubLObject)$ic150$);
                        var182.throwStack.pop();
                    }
                    finally {
                        var182.throwStack.pop();
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var239, var182);
                }
            }
        }
        finally {
            final SubLObject var243 = Threads.$is_thread_performing_cleanupP$.currentBinding(var182);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var182);
                SubLObject var244 = (SubLObject)NIL;
                try {
                    var182.throwStack.push($ic150$);
                    final SubLObject var7_227 = Errors.$error_handler$.currentBinding(var182);
                    try {
                        Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)$ic151$), var182);
                        try {
                            Filesys.delete_file(var184);
                        }
                        catch (Throwable var245) {
                            Errors.handleThrowable(var245, (SubLObject)NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(var7_227, var182);
                    }
                }
                catch (Throwable var246) {
                    var244 = Errors.handleThrowable(var246, (SubLObject)$ic150$);
                    var182.throwStack.pop();
                }
                finally {
                    var182.throwStack.pop();
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var243, var182);
            }
        }
        return (SubLObject)$ic152$;
    }
    
    public static SubLObject f7005(final SubLObject var88, SubLObject var30, SubLObject var229) {
        if (var30 == UNPROVIDED) {
            var30 = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (var229 == UNPROVIDED) {
            var229 = (SubLObject)NIL;
        }
        final SubLThread var230 = SubLProcess.currentSubLThread();
        final SubLObject var231 = module0095.f6852(var88);
        SubLObject var232 = (SubLObject)NIL;
        final SubLObject var233 = module0095.f6864(var88);
        SubLObject var236;
        for (SubLObject var234 = (SubLObject)NIL; NIL == var234; var234 = (SubLObject)makeBoolean(NIL == var236)) {
            var230.resetMultipleValues();
            final SubLObject var235 = module0052.f3693(var233);
            var236 = var230.secondMultipleValue();
            var230.resetMultipleValues();
            if (NIL != var236) {
                SubLObject var238;
                final SubLObject var237 = var238 = var235;
                SubLObject var239 = (SubLObject)NIL;
                SubLObject var240 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var238, var237, (SubLObject)$ic174$);
                var239 = var238.first();
                var238 = (var240 = var238.rest());
                if (NIL != var232) {
                    if (NIL != var229) {
                        print_high.princ(var239, var30);
                        streams_high.write_char((SubLObject)Characters.CHAR_space, var30);
                    }
                    module0075.f5273(var231, var30, var232, var240);
                    streams_high.terpri(var30);
                }
                var232 = var240;
            }
        }
        module0075.f5273(var231, var30, var232, (SubLObject)UNPROVIDED);
        streams_high.terpri(var30);
        return var88;
    }
    
    public static SubLObject f7006(final SubLObject var88, final SubLObject var21) {
        final SubLThread var89 = SubLProcess.currentSubLThread();
        final SubLObject var90 = module0095.f6854(var88);
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var89) && !var21.numL(var90)) {
            Errors.error((SubLObject)$ic175$, var21, var90);
        }
        final SubLObject var91 = module0095.f6852(var88);
        final SubLObject var92 = module0095.f6859(var88, var21);
        final SubLObject var93 = Numbers.add(var21, (SubLObject)ONE_INTEGER);
        if (var93.numL(var90)) {
            final SubLObject var94 = module0095.f6859(var88, Numbers.add(var21, (SubLObject)ONE_INTEGER));
            return module0075.f5274(var91, var92, var94);
        }
        return module0075.f5274(var91, var92, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f7007() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6873", "S#8674", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6874", "S#8675", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6877", "S#8676", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6876", "S#8677", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6875", "S#8678", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6879", "S#8679", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6880", "S#8680", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6881", "S#8681", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6883", "S#8671", 1, 0, false);
        new $f6883$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6884", "S#8682", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6885", "S#8683", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6886", "S#8684", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6887", "S#8685", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6888", "S#8686", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6889", "S#8687", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6890", "S#8688", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6882", "S#8689", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6894", "S#8690", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6896", "S#8691", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6891", "S#8692", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6898", "S#8693", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6899", "S#8694", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6900", "S#8695", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6897", "S#8696", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6895", "S#8697", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6892", "S#8698", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6901", "S#8699", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6902", "S#8700", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6903", "S#8701", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6904", "S#8702", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6905", "S#8703", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6906", "S#8704", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6907", "S#8705", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6908", "S#8706", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6909", "S#8707", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6910", "S#8708", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6893", "S#8709", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6911", "S#8710", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6912", "S#8711", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6913", "S#8712", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6914", "S#8713", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0096", "f6915", "S#8714");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0096", "f6916", "S#8715");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6917", "S#8716", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6921", "S#8717", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6922", "S#8718", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6923", "S#8719", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6924", "S#8720", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6925", "S#8721", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6928", "S#8722", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6929", "S#8723", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6930", "S#8724", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6931", "S#8725", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6932", "S#8726", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6933", "S#8727", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6934", "S#8728", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6935", "S#8729", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0096", "f6936", "S#8730");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6937", "S#8731", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6938", "S#8732", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6939", "S#8733", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6940", "S#8734", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6941", "S#8735", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6942", "S#8736", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6927", "S#8737", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6943", "S#8738", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6944", "S#8739", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6920", "S#8740", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6878", "S#8741", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6918", "S#8742", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6919", "S#8743", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6926", "S#8744", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6945", "S#8745", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6947", "S#8746", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6948", "S#8747", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6946", "S#8748", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6949", "S#8749", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6951", "S#8673", 1, 0, false);
        new $f6951$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6952", "S#8750", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6953", "S#8751", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6954", "S#8752", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6955", "S#8753", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6956", "S#8754", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6957", "S#8755", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6958", "S#8756", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6959", "S#8757", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6960", "S#8758", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6961", "S#8759", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6962", "S#8760", 3, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0096", "f6963", "S#8761");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6950", "S#8762", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6964", "S#8763", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6965", "S#8764", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6966", "S#8765", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6967", "S#8766", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6968", "S#8767", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6969", "S#8768", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0096", "f6970", "S#8769");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6971", "S#8770", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6972", "S#8771", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6973", "S#8772", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6974", "S#8773", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6975", "S#8774", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6976", "S#8775", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6977", "S#8776", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6978", "S#8777", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6979", "S#8778", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6980", "S#8779", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6981", "S#8780", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6982", "S#8781", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6983", "S#8782", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6984", "S#8783", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6985", "S#8784", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6986", "S#8785", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6987", "S#8786", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6988", "S#8787", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6989", "S#8788", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6990", "S#8789", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6991", "S#8790", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6992", "S#8791", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6993", "S#8792", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6994", "S#8793", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6995", "S#8794", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6996", "S#8795", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6997", "S#8796", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6998", "S#8797", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f6999", "S#8798", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f7000", "S#8799", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f7001", "S#8800", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f7002", "S#8801", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f7003", "S#8802", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f7004", "S#8803", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f7005", "S#8804", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0096", "f7006", "S#8805", 2, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7008() {
        $g1259$ = SubLFiles.defparameter("S#8806", (SubLObject)NIL);
        $g1260$ = SubLFiles.defconstant("S#8807", (SubLObject)$ic4$);
        $g1261$ = SubLFiles.defconstant("S#8808", (SubLObject)$ic35$);
        $g1262$ = SubLFiles.defparameter("S#8809", (SubLObject)NIL);
        $g1263$ = SubLFiles.defconstant("S#8810", (SubLObject)$ic73$);
        $g1264$ = SubLFiles.defconstant("S#8811", (SubLObject)$ic104$);
        $g1265$ = SubLFiles.defparameter("S#8812", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7009() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g1260$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic11$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic12$);
        Structures.def_csetf((SubLObject)$ic13$, (SubLObject)$ic14$);
        Structures.def_csetf((SubLObject)$ic15$, (SubLObject)$ic16$);
        Equality.identity((SubLObject)$ic4$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g1260$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic24$));
        module0021.f1098($g1261$.getGlobalValue(), (SubLObject)$ic36$);
        Structures.register_method(module0021.$g749$.getGlobalValue(), $g1260$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic37$));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g1263$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic80$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic81$);
        Structures.def_csetf((SubLObject)$ic82$, (SubLObject)$ic83$);
        Structures.def_csetf((SubLObject)$ic84$, (SubLObject)$ic85$);
        Structures.def_csetf((SubLObject)$ic86$, (SubLObject)$ic87$);
        Equality.identity((SubLObject)$ic73$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g1263$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic92$));
        module0021.f1098($g1264$.getGlobalValue(), (SubLObject)$ic105$);
        Structures.register_method(module0021.$g749$.getGlobalValue(), $g1263$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic106$));
        Structures.register_method(module0079.$g1148$.getGlobalValue(), $g1263$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic109$));
        Structures.register_method(module0079.$g1149$.getGlobalValue(), $g1263$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic110$));
        Structures.register_method(module0079.$g1150$.getGlobalValue(), $g1263$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic111$));
        Structures.register_method(module0079.$g1151$.getGlobalValue(), $g1263$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic112$));
        Structures.register_method(module0079.$g1152$.getGlobalValue(), $g1263$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic113$));
        Structures.register_method(module0079.$g1153$.getGlobalValue(), $g1263$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic114$));
        Structures.register_method(module0079.$g1154$.getGlobalValue(), $g1263$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic115$));
        Structures.register_method(module0079.$g1159$.getGlobalValue(), $g1263$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic116$));
        Structures.register_method(module0079.$g1155$.getGlobalValue(), $g1263$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic117$));
        Structures.register_method(module0079.$g1156$.getGlobalValue(), $g1263$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic118$));
        Structures.register_method(module0079.$g1158$.getGlobalValue(), $g1263$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic121$));
        Structures.register_method(module0079.$g1157$.getGlobalValue(), $g1263$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic125$));
        module0027.f1449((SubLObject)$ic128$, (SubLObject)ConsesLow.list(new SubLObject[] { $ic129$, EQUALP, $ic130$, NIL, $ic131$, NIL, $ic132$, $ic133$, $ic134$, T }), $ic135$);
        module0027.f1449((SubLObject)$ic136$, (SubLObject)ConsesLow.list(new SubLObject[] { $ic129$, EQUAL, $ic130$, NIL, $ic131$, NIL, $ic132$, $ic133$, $ic134$, T }), $ic135$);
        return (SubLObject)NIL;
    }
    
    private static SubLObject _constant_135_initializer() {
        return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)ONE_INTEGER, (SubLObject)makeString("Eins")), (SubLObject)ConsesLow.cons((SubLObject)TWO_INTEGER, (SubLObject)makeString("Zwei")), (SubLObject)ConsesLow.cons((SubLObject)THREE_INTEGER, (SubLObject)makeString("Drei")), (SubLObject)ConsesLow.cons((SubLObject)FOUR_INTEGER, (SubLObject)makeString("Vier"))), (SubLObject)EQUAL), (SubLObject)makeKeyword("SUCCESS")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.cons((SubLObject)ONE_INTEGER, (SubLObject)makeString("Eins")), ConsesLow.cons((SubLObject)TWO_INTEGER, (SubLObject)makeString("Zwei")), ConsesLow.cons((SubLObject)THREE_INTEGER, (SubLObject)makeString("Drei")), ConsesLow.cons((SubLObject)FOUR_INTEGER, (SubLObject)makeString("Vier")), ConsesLow.cons((SubLObject)FIVE_INTEGER, (SubLObject)makeString("Fuenf")), ConsesLow.cons((SubLObject)SIX_INTEGER, (SubLObject)makeString("Sechs")), ConsesLow.cons((SubLObject)SEVEN_INTEGER, (SubLObject)makeString("Sieben")), ConsesLow.cons((SubLObject)EIGHT_INTEGER, (SubLObject)makeString("Acht")), ConsesLow.cons((SubLObject)NINE_INTEGER, (SubLObject)makeString("Neun")), ConsesLow.cons((SubLObject)TEN_INTEGER, (SubLObject)makeString("Zehn")), ConsesLow.cons((SubLObject)ELEVEN_INTEGER, (SubLObject)makeString("Elf")), ConsesLow.cons((SubLObject)TWELVE_INTEGER, (SubLObject)makeString("Zwoelf")), ConsesLow.cons((SubLObject)THIRTEEN_INTEGER, (SubLObject)makeString("Dreizehn")), ConsesLow.cons((SubLObject)FOURTEEN_INTEGER, (SubLObject)makeString("Vierzehtn")), ConsesLow.cons((SubLObject)FIFTEEN_INTEGER, (SubLObject)makeString("Fuenfzehn")), ConsesLow.cons((SubLObject)SIXTEEN_INTEGER, (SubLObject)makeString("Sechszehn")), ConsesLow.cons((SubLObject)SEVENTEEN_INTEGER, (SubLObject)makeString("Siebzehn")), ConsesLow.cons((SubLObject)EIGHTEEN_INTEGER, (SubLObject)makeString("Achtzehn")), ConsesLow.cons((SubLObject)NINETEEN_INTEGER, (SubLObject)makeString("Neunzehn")), ConsesLow.cons((SubLObject)TWENTY_INTEGER, (SubLObject)makeString("Zwanzig")), ConsesLow.cons((SubLObject)makeInteger(21), (SubLObject)makeString("Einundzwanzig")), ConsesLow.cons((SubLObject)makeInteger(22), (SubLObject)makeString("Zweiundzwanzig")), ConsesLow.cons((SubLObject)makeInteger(23), (SubLObject)makeString("Dreiundzwanzig")), ConsesLow.cons((SubLObject)makeInteger(24), (SubLObject)makeString("Vierundzwanzig")), ConsesLow.cons((SubLObject)makeInteger(25), (SubLObject)makeString("Fuenfundzwanzig")), ConsesLow.cons((SubLObject)makeInteger(26), (SubLObject)makeString("Sechsundzwanzig")), ConsesLow.cons((SubLObject)makeInteger(27), (SubLObject)makeString("Siebenundzwanzig")), ConsesLow.cons((SubLObject)makeInteger(28), (SubLObject)makeString("Achtundzwanzig")), ConsesLow.cons((SubLObject)makeInteger(29), (SubLObject)makeString("Neunundzwanzig")), ConsesLow.cons((SubLObject)makeInteger(30), (SubLObject)makeString("Dreissig")), ConsesLow.cons((SubLObject)makeInteger(31), (SubLObject)makeString("Einunddreissig")), ConsesLow.cons((SubLObject)makeInteger(32), (SubLObject)makeString("Zweiunddreissig")), ConsesLow.cons((SubLObject)makeInteger(33), (SubLObject)makeString("Dreiunddreissig")), ConsesLow.cons((SubLObject)makeInteger(34), (SubLObject)makeString("Vierunddreissig")), ConsesLow.cons((SubLObject)makeInteger(35), (SubLObject)makeString("Fuenfunddreissig")), ConsesLow.cons((SubLObject)makeInteger(36), (SubLObject)makeString("Sechsunddreissig")), ConsesLow.cons((SubLObject)makeInteger(37), (SubLObject)makeString("Siebenunddreissig")), ConsesLow.cons((SubLObject)makeInteger(38), (SubLObject)makeString("Achtunddreissig")), ConsesLow.cons((SubLObject)makeInteger(39), (SubLObject)makeString("Neununddreissig")), ConsesLow.cons((SubLObject)makeInteger(40), (SubLObject)makeString("Vierzig")), ConsesLow.cons((SubLObject)makeInteger(41), (SubLObject)makeString("Einundvierzig")), ConsesLow.cons((SubLObject)makeInteger(42), (SubLObject)makeString("Zweiundvierzig")) }), (SubLObject)EQUAL), (SubLObject)makeKeyword("SUCCESS")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.cons((SubLObject)makeString("C"), (SubLObject)makeInteger(100)), ConsesLow.cons((SubLObject)makeString("LXXXXVIIII"), (SubLObject)makeInteger(99)), ConsesLow.cons((SubLObject)makeString("LXXXXVIII"), (SubLObject)makeInteger(98)), ConsesLow.cons((SubLObject)makeString("LXXXXVII"), (SubLObject)makeInteger(97)), ConsesLow.cons((SubLObject)makeString("LXXXXVI"), (SubLObject)makeInteger(96)), ConsesLow.cons((SubLObject)makeString("LXXXXV"), (SubLObject)makeInteger(95)), ConsesLow.cons((SubLObject)makeString("LXXXXIIII"), (SubLObject)makeInteger(94)), ConsesLow.cons((SubLObject)makeString("LXXXXIII"), (SubLObject)makeInteger(93)), ConsesLow.cons((SubLObject)makeString("LXXXXII"), (SubLObject)makeInteger(92)), ConsesLow.cons((SubLObject)makeString("LXXXXI"), (SubLObject)makeInteger(91)), ConsesLow.cons((SubLObject)makeString("LXXXX"), (SubLObject)makeInteger(90)), ConsesLow.cons((SubLObject)makeString("LXXXVIIII"), (SubLObject)makeInteger(89)), ConsesLow.cons((SubLObject)makeString("LXXXVIII"), (SubLObject)makeInteger(88)), ConsesLow.cons((SubLObject)makeString("LXXXVII"), (SubLObject)makeInteger(87)), ConsesLow.cons((SubLObject)makeString("LXXXVI"), (SubLObject)makeInteger(86)), ConsesLow.cons((SubLObject)makeString("LXXXV"), (SubLObject)makeInteger(85)), ConsesLow.cons((SubLObject)makeString("LXXXIIII"), (SubLObject)makeInteger(84)), ConsesLow.cons((SubLObject)makeString("LXXXIII"), (SubLObject)makeInteger(83)), ConsesLow.cons((SubLObject)makeString("LXXXII"), (SubLObject)makeInteger(82)), ConsesLow.cons((SubLObject)makeString("LXXXI"), (SubLObject)makeInteger(81)), ConsesLow.cons((SubLObject)makeString("LXXX"), (SubLObject)makeInteger(80)), ConsesLow.cons((SubLObject)makeString("LXXVIIII"), (SubLObject)makeInteger(79)), ConsesLow.cons((SubLObject)makeString("LXXVIII"), (SubLObject)makeInteger(78)), ConsesLow.cons((SubLObject)makeString("LXXVII"), (SubLObject)makeInteger(77)), ConsesLow.cons((SubLObject)makeString("LXXVI"), (SubLObject)makeInteger(76)), ConsesLow.cons((SubLObject)makeString("LXXV"), (SubLObject)makeInteger(75)), ConsesLow.cons((SubLObject)makeString("LXXIIII"), (SubLObject)makeInteger(74)), ConsesLow.cons((SubLObject)makeString("LXXIII"), (SubLObject)makeInteger(73)), ConsesLow.cons((SubLObject)makeString("LXXII"), (SubLObject)makeInteger(72)), ConsesLow.cons((SubLObject)makeString("LXXI"), (SubLObject)makeInteger(71)), ConsesLow.cons((SubLObject)makeString("LXX"), (SubLObject)makeInteger(70)), ConsesLow.cons((SubLObject)makeString("LXVIIII"), (SubLObject)makeInteger(69)), ConsesLow.cons((SubLObject)makeString("LXVIII"), (SubLObject)makeInteger(68)), ConsesLow.cons((SubLObject)makeString("LXVII"), (SubLObject)makeInteger(67)), ConsesLow.cons((SubLObject)makeString("LXVI"), (SubLObject)makeInteger(66)), ConsesLow.cons((SubLObject)makeString("LXV"), (SubLObject)makeInteger(65)), ConsesLow.cons((SubLObject)makeString("LXIIII"), (SubLObject)makeInteger(64)), ConsesLow.cons((SubLObject)makeString("LXIII"), (SubLObject)makeInteger(63)), ConsesLow.cons((SubLObject)makeString("LXII"), (SubLObject)makeInteger(62)), ConsesLow.cons((SubLObject)makeString("LXI"), (SubLObject)makeInteger(61)), ConsesLow.cons((SubLObject)makeString("LX"), (SubLObject)makeInteger(60)), ConsesLow.cons((SubLObject)makeString("LVIIII"), (SubLObject)makeInteger(59)), ConsesLow.cons((SubLObject)makeString("LVIII"), (SubLObject)makeInteger(58)), ConsesLow.cons((SubLObject)makeString("LVII"), (SubLObject)makeInteger(57)), ConsesLow.cons((SubLObject)makeString("LVI"), (SubLObject)makeInteger(56)), ConsesLow.cons((SubLObject)makeString("LV"), (SubLObject)makeInteger(55)), ConsesLow.cons((SubLObject)makeString("LIIII"), (SubLObject)makeInteger(54)), ConsesLow.cons((SubLObject)makeString("LIII"), (SubLObject)makeInteger(53)), ConsesLow.cons((SubLObject)makeString("LII"), (SubLObject)makeInteger(52)), ConsesLow.cons((SubLObject)makeString("LI"), (SubLObject)makeInteger(51)), ConsesLow.cons((SubLObject)makeString("L"), (SubLObject)makeInteger(50)), ConsesLow.cons((SubLObject)makeString("XXXXVIIII"), (SubLObject)makeInteger(49)), ConsesLow.cons((SubLObject)makeString("XXXXVIII"), (SubLObject)makeInteger(48)), ConsesLow.cons((SubLObject)makeString("XXXXVII"), (SubLObject)makeInteger(47)), ConsesLow.cons((SubLObject)makeString("XXXXVI"), (SubLObject)makeInteger(46)), ConsesLow.cons((SubLObject)makeString("XXXXV"), (SubLObject)makeInteger(45)), ConsesLow.cons((SubLObject)makeString("XXXXIIII"), (SubLObject)makeInteger(44)), ConsesLow.cons((SubLObject)makeString("XXXXIII"), (SubLObject)makeInteger(43)), ConsesLow.cons((SubLObject)makeString("XXXXII"), (SubLObject)makeInteger(42)), ConsesLow.cons((SubLObject)makeString("XXXXI"), (SubLObject)makeInteger(41)), ConsesLow.cons((SubLObject)makeString("XXXX"), (SubLObject)makeInteger(40)), ConsesLow.cons((SubLObject)makeString("XXXVIIII"), (SubLObject)makeInteger(39)), ConsesLow.cons((SubLObject)makeString("XXXVIII"), (SubLObject)makeInteger(38)), ConsesLow.cons((SubLObject)makeString("XXXVII"), (SubLObject)makeInteger(37)), ConsesLow.cons((SubLObject)makeString("XXXVI"), (SubLObject)makeInteger(36)), ConsesLow.cons((SubLObject)makeString("XXXV"), (SubLObject)makeInteger(35)), ConsesLow.cons((SubLObject)makeString("XXXIIII"), (SubLObject)makeInteger(34)), ConsesLow.cons((SubLObject)makeString("XXXIII"), (SubLObject)makeInteger(33)), ConsesLow.cons((SubLObject)makeString("XXXII"), (SubLObject)makeInteger(32)), ConsesLow.cons((SubLObject)makeString("XXXI"), (SubLObject)makeInteger(31)), ConsesLow.cons((SubLObject)makeString("XXX"), (SubLObject)makeInteger(30)), ConsesLow.cons((SubLObject)makeString("XXVIIII"), (SubLObject)makeInteger(29)), ConsesLow.cons((SubLObject)makeString("XXVIII"), (SubLObject)makeInteger(28)), ConsesLow.cons((SubLObject)makeString("XXVII"), (SubLObject)makeInteger(27)), ConsesLow.cons((SubLObject)makeString("XXVI"), (SubLObject)makeInteger(26)), ConsesLow.cons((SubLObject)makeString("XXV"), (SubLObject)makeInteger(25)), ConsesLow.cons((SubLObject)makeString("XXIIII"), (SubLObject)makeInteger(24)), ConsesLow.cons((SubLObject)makeString("XXIII"), (SubLObject)makeInteger(23)), ConsesLow.cons((SubLObject)makeString("XXII"), (SubLObject)makeInteger(22)), ConsesLow.cons((SubLObject)makeString("XXI"), (SubLObject)makeInteger(21)), ConsesLow.cons((SubLObject)makeString("XX"), (SubLObject)TWENTY_INTEGER), ConsesLow.cons((SubLObject)makeString("XVIIII"), (SubLObject)NINETEEN_INTEGER), ConsesLow.cons((SubLObject)makeString("XVIII"), (SubLObject)EIGHTEEN_INTEGER), ConsesLow.cons((SubLObject)makeString("XVII"), (SubLObject)SEVENTEEN_INTEGER), ConsesLow.cons((SubLObject)makeString("XVI"), (SubLObject)SIXTEEN_INTEGER), ConsesLow.cons((SubLObject)makeString("XV"), (SubLObject)FIFTEEN_INTEGER), ConsesLow.cons((SubLObject)makeString("XIIII"), (SubLObject)FOURTEEN_INTEGER), ConsesLow.cons((SubLObject)makeString("XIII"), (SubLObject)THIRTEEN_INTEGER), ConsesLow.cons((SubLObject)makeString("XII"), (SubLObject)TWELVE_INTEGER), ConsesLow.cons((SubLObject)makeString("XI"), (SubLObject)ELEVEN_INTEGER), ConsesLow.cons((SubLObject)makeString("X"), (SubLObject)TEN_INTEGER), ConsesLow.cons((SubLObject)makeString("VIIII"), (SubLObject)NINE_INTEGER), ConsesLow.cons((SubLObject)makeString("VIII"), (SubLObject)EIGHT_INTEGER), ConsesLow.cons((SubLObject)makeString("VII"), (SubLObject)SEVEN_INTEGER), ConsesLow.cons((SubLObject)makeString("VI"), (SubLObject)SIX_INTEGER), ConsesLow.cons((SubLObject)makeString("V"), (SubLObject)FIVE_INTEGER), ConsesLow.cons((SubLObject)makeString("IIII"), (SubLObject)FOUR_INTEGER), ConsesLow.cons((SubLObject)makeString("III"), (SubLObject)THREE_INTEGER), ConsesLow.cons((SubLObject)makeString("II"), (SubLObject)TWO_INTEGER), ConsesLow.cons((SubLObject)makeString("I"), (SubLObject)ONE_INTEGER) }), (SubLObject)EQUALP), (SubLObject)makeKeyword("SUCCESS")));
    }
    
    public void declareFunctions() {
        f7007();
    }
    
    public void initializeVariables() {
        f7008();
    }
    
    public void runTopLevelForms() {
        f7009();
    }
    
    static {
        me = (SubLFile)new module0096();
        $g1259$ = null;
        $g1260$ = null;
        $g1261$ = null;
        $g1262$ = null;
        $g1263$ = null;
        $g1264$ = null;
        $g1265$ = null;
        $ic0$ = makeKeyword("OUTPUT");
        $ic1$ = makeString("Unable to open ~S");
        $ic2$ = ConsesLow.list((SubLObject)makeSymbol("S#131", "CYC"), (SubLObject)makeSymbol("S#132", "CYC"));
        $ic3$ = makeString("Error, writing file vector backing for map is not contiguous: expected ~A, got ~A~%");
        $ic4$ = makeSymbol("S#8670", "CYC");
        $ic5$ = makeSymbol("S#8671", "CYC");
        $ic6$ = ConsesLow.list((SubLObject)makeSymbol("S#134", "CYC"), (SubLObject)makeSymbol("S#5858", "CYC"));
        $ic7$ = ConsesLow.list((SubLObject)makeKeyword("INDEX"), (SubLObject)makeKeyword("PAYLOAD"));
        $ic8$ = ConsesLow.list((SubLObject)makeSymbol("S#8682", "CYC"), (SubLObject)makeSymbol("S#8683", "CYC"));
        $ic9$ = ConsesLow.list((SubLObject)makeSymbol("S#8684", "CYC"), (SubLObject)makeSymbol("S#8685", "CYC"));
        $ic10$ = makeSymbol("S#8689", "CYC");
        $ic11$ = makeSymbol("S#8681", "CYC");
        $ic12$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#8671", "CYC"));
        $ic13$ = makeSymbol("S#8682", "CYC");
        $ic14$ = makeSymbol("S#8684", "CYC");
        $ic15$ = makeSymbol("S#8683", "CYC");
        $ic16$ = makeSymbol("S#8685", "CYC");
        $ic17$ = makeKeyword("INDEX");
        $ic18$ = makeKeyword("PAYLOAD");
        $ic19$ = makeString("Invalid slot ~S for construction function");
        $ic20$ = makeKeyword("BEGIN");
        $ic21$ = makeSymbol("S#8686", "CYC");
        $ic22$ = makeKeyword("SLOT");
        $ic23$ = makeKeyword("END");
        $ic24$ = makeSymbol("S#8688", "CYC");
        $ic25$ = makeString("#<FILE-VECTOR-REF #");
        $ic26$ = makeString(" (");
        $ic27$ = makeString(") ");
        $ic28$ = makeString(">");
        $ic29$ = makeString("File Vector references cannot be zero.");
        $ic30$ = makeString("swapped out");
        $ic31$ = makeString("present & pristine");
        $ic32$ = makeString("present but mutated");
        $ic33$ = makeString("present but deleted");
        $ic34$ = makeString("invalid state");
        $ic35$ = makeInteger(69);
        $ic36$ = makeSymbol("S#8711", "CYC");
        $ic37$ = makeSymbol("S#8713", "CYC");
        $ic38$ = makeUninternedSymbol("US#2B193A1");
        $ic39$ = makeSymbol("CLET");
        $ic40$ = ConsesLow.list((SubLObject)makeSymbol("S#8809", "CYC"));
        $ic41$ = makeSymbol("PIF");
        $ic42$ = makeSymbol("LOCK-P");
        $ic43$ = makeSymbol("WITH-LOCK-HELD");
        $ic44$ = makeSymbol("PROGN");
        $ic45$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#672", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic46$ = makeSymbol("S#8809", "CYC");
        $ic47$ = makeKeyword("UNPROVIDED");
        $ic48$ = makeKeyword("INPUT");
        $ic49$ = makeSymbol("S#7787", "CYC");
        $ic50$ = makeString("Invalid state transition: ~A is neither present, nor deleted nor swapped out.");
        $ic51$ = makeKeyword("NOT-FOUND");
        $ic52$ = makeKeyword("MUTATED");
        $ic53$ = makeKeyword("DELETED");
        $ic54$ = makeSymbol("S#8636", "CYC");
        $ic55$ = makeKeyword("RECOVERED");
        $ic56$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#131", "CYC"), (SubLObject)makeSymbol("S#132", "CYC"), (SubLObject)makeSymbol("MAP"), (SubLObject)makeSymbol("S#8813", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC"), (SubLObject)makeSymbol("S#7999", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic57$ = ConsesLow.list((SubLObject)makeKeyword("DONE"), (SubLObject)makeKeyword("CACHE-STRATEGY"));
        $ic58$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic59$ = makeKeyword("DONE");
        $ic60$ = makeKeyword("CACHE-STRATEGY");
        $ic61$ = makeUninternedSymbol("US#102D8BE");
        $ic62$ = makeSymbol("S#7027", "CYC");
        $ic63$ = makeSymbol("PUNLESS");
        $ic64$ = makeSymbol("CAND");
        $ic65$ = makeSymbol("S#8708", "CYC");
        $ic66$ = makeSymbol("CSETQ");
        $ic67$ = makeSymbol("S#8721", "CYC");
        $ic68$ = makeSymbol("S#8733", "CYC");
        $ic69$ = makeSymbol("S#8734", "CYC");
        $ic70$ = ConsesLow.list((SubLObject)makeSymbol("S#8814", "CYC"), (SubLObject)makeSymbol("S#5090", "CYC"), (SubLObject)makeSymbol("MAP"), (SubLObject)makeSymbol("S#8813", "CYC"), (SubLObject)makeSymbol("S#8815", "CYC"), (SubLObject)makeSymbol("S#7999", "CYC"));
        $ic71$ = makeKeyword("ITERATION-HALTED-PREMATURELY");
        $ic72$ = makeString("Cannot convert a file-backed map that is not all swapped in.");
        $ic73$ = makeSymbol("S#8672", "CYC");
        $ic74$ = makeSymbol("S#8673", "CYC");
        $ic75$ = ConsesLow.list((SubLObject)makeSymbol("MAP"), (SubLObject)makeSymbol("S#8624", "CYC"), (SubLObject)makeSymbol("S#8815", "CYC"));
        $ic76$ = ConsesLow.list((SubLObject)makeKeyword("MAP"), (SubLObject)makeKeyword("FVECTOR"), (SubLObject)makeKeyword("COMMON-SYMBOLS"));
        $ic77$ = ConsesLow.list((SubLObject)makeSymbol("S#8750", "CYC"), (SubLObject)makeSymbol("S#8751", "CYC"), (SubLObject)makeSymbol("S#8752", "CYC"));
        $ic78$ = ConsesLow.list((SubLObject)makeSymbol("S#8753", "CYC"), (SubLObject)makeSymbol("S#8754", "CYC"), (SubLObject)makeSymbol("S#8755", "CYC"));
        $ic79$ = makeSymbol("S#8762", "CYC");
        $ic80$ = makeSymbol("S#8749", "CYC");
        $ic81$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#8673", "CYC"));
        $ic82$ = makeSymbol("S#8750", "CYC");
        $ic83$ = makeSymbol("S#8753", "CYC");
        $ic84$ = makeSymbol("S#8751", "CYC");
        $ic85$ = makeSymbol("S#8754", "CYC");
        $ic86$ = makeSymbol("S#8752", "CYC");
        $ic87$ = makeSymbol("S#8755", "CYC");
        $ic88$ = makeKeyword("MAP");
        $ic89$ = makeKeyword("FVECTOR");
        $ic90$ = makeKeyword("COMMON-SYMBOLS");
        $ic91$ = makeSymbol("S#8756", "CYC");
        $ic92$ = makeSymbol("S#8758", "CYC");
        $ic93$ = makeSymbol("S#3046", "CYC");
        $ic94$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#8672", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic95$ = makeUninternedSymbol("US#5089D43");
        $ic96$ = makeSymbol("S#2154", "CYC");
        $ic97$ = makeString("#<");
        $ic98$ = makeKeyword("STREAM");
        $ic99$ = makeString(" Map ");
        $ic100$ = makeString(" FVector ");
        $ic101$ = makeString(" CFASL ComSym ");
        $ic102$ = makeString(" ");
        $ic103$ = makeKeyword("BASE");
        $ic104$ = makeInteger(76);
        $ic105$ = makeSymbol("S#8766", "CYC");
        $ic106$ = makeSymbol("S#8768", "CYC");
        $ic107$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#8816", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic108$ = makeSymbol("S#8812", "CYC");
        $ic109$ = makeSymbol("S#8771", "CYC");
        $ic110$ = makeSymbol("S#8772", "CYC");
        $ic111$ = makeSymbol("S#8774", "CYC");
        $ic112$ = makeSymbol("S#8776", "CYC");
        $ic113$ = makeSymbol("S#8778", "CYC");
        $ic114$ = makeSymbol("S#8780", "CYC");
        $ic115$ = makeSymbol("S#8782", "CYC");
        $ic116$ = makeSymbol("S#8784", "CYC");
        $ic117$ = makeSymbol("S#8786", "CYC");
        $ic118$ = makeSymbol("S#8788", "CYC");
        $ic119$ = makeString("The test of the interior map ~A does not correspond to the provided test ~A.");
        $ic120$ = makeString("The size of the interior map ~A does not correspond to the provided size ~A.");
        $ic121$ = makeSymbol("S#8790", "CYC");
        $ic122$ = makeSymbol("S#8793", "CYC");
        $ic123$ = makeSymbol("S#8794", "CYC");
        $ic124$ = ConsesLow.list((SubLObject)makeSymbol("S#8672", "CYC"), (SubLObject)makeSymbol("S#5090", "CYC"), (SubLObject)makeSymbol("S#7999", "CYC"));
        $ic125$ = makeSymbol("S#8795", "CYC");
        $ic126$ = makeString("Error in swap-out algorithm: ~A is NOT a backed map.");
        $ic127$ = makeString("Error in non-pristine object count algorithm: ~A is NOT a backed map.");
        $ic128$ = makeSymbol("S#8799", "CYC");
        $ic129$ = makeKeyword("TEST");
        $ic130$ = makeKeyword("OWNER");
        $ic131$ = makeKeyword("CLASSES");
        $ic132$ = makeKeyword("KB");
        $ic133$ = makeKeyword("TINY");
        $ic134$ = makeKeyword("WORKING?");
        $ic135$ = _constant_135_initializer();
        $ic136$ = makeSymbol("S#8802", "CYC");
        $ic137$ = makeString("/tmp/");
        $ic138$ = makeString("Key ~A should be in the map but is not.");
        $ic139$ = makeString("The value for the key ~A is missing altogether from the new map.");
        $ic140$ = makeString("The old value ~A does not match the new value ~A according to ~A.");
        $ic141$ = makeString("There are supposed to be ~A keys, but there are ~A.");
        $ic142$ = makeString("There are supposed to be ~A values, but there are ~A.");
        $ic143$ = makeString("The value for the key ~A can all of a sudden no longer be found.");
        $ic144$ = makeString("The accessing of the value for ~A did not swap in the value.");
        $ic145$ = makeString("The touching of the object did not mutate the object.");
        $ic146$ = makeString("Undoing the change for key ~A did actually not succeed.");
        $ic147$ = makeString("The modification of the entry for ~A did not mutate anything.");
        $ic148$ = makeString("The modified entry for ~A no longer contains the new value ~A but rather ~A.");
        $ic149$ = makeString("The stored entry for ~A is not a present and mutated file vector reference.");
        $ic150$ = makeKeyword("IGNORE-ERRORS-TARGET");
        $ic151$ = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $ic152$ = makeKeyword("SUCCESS");
        $ic153$ = makeString("~A should be paged in, but ~A are actually paged in.");
        $ic154$ = makeString("~A should be paged out, but ~A are actually paged out.");
        $ic155$ = makeKeyword("COPY-CONTENTS");
        $ic156$ = makeInteger(4000000);
        $ic157$ = ConsesLow.list((SubLObject)makeSymbol("S#131", "CYC"), (SubLObject)makeSymbol("S#8817", "CYC"));
        $ic158$ = makeString("The entry for ~A in the original map is not a file vector reference.~%");
        $ic159$ = makeString("The loaded map does not have the same size as the original map: ~A =/= ~A~%");
        $ic160$ = makeString("The entry for ~A in the new map is not a file vector reference.");
        $ic161$ = ConsesLow.list((SubLObject)makeSymbol("S#8818", "CYC"), (SubLObject)makeUninternedSymbol("US#102D8BE"));
        $ic162$ = makeString("The new map has an entry for key ~A while the old one has none.");
        $ic163$ = makeString("The values for key ~A are not equal according to ~A: ~A =/= ~A (new =/= old).~%");
        $ic164$ = makeString("New map ~A and backup key set ~A have diverged; ~A not present.");
        $ic165$ = makeKeyword("SUPPORT-UNDO");
        $ic166$ = makeString("We are getting ~A back, but that's not one of the missing keys ~A.");
        $ic167$ = makeString("We are getting the removed key ~A returned to us with value ~A~%!");
        $ic168$ = makeString("We are not getting back the same reference for ~A: we expected ~A and got ~A.");
        $ic169$ = makeString("We no longer visited ~A ... investigating.");
        $ic170$ = makeString("... ~A is still present in map.~%");
        $ic171$ = makeString("... ~A is not even findable in the map anymore.~%");
        $ic172$ = makeString("Deleting ~A to produce ~A did not work right.");
        $ic173$ = makeString("We visited ~A entries but we should have visited ~A entries.");
        $ic174$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#134", "CYC"), (SubLObject)makeSymbol("S#1612", "CYC"));
        $ic175$ = makeString("The index ~A is outside of the range [0,~A).");
    }
    
    public static final class $sX8670_native extends SubLStructNative
    {
        public SubLObject $index;
        public SubLObject $payload;
        public static final SubLStructDeclNative structDecl;
        
        public $sX8670_native() {
            this.$index = (SubLObject)CommonSymbols.NIL;
            this.$payload = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SstructDecl;
        }
        
        public SubLObject getField2() {
            return this.$index;
        }
        
        public SubLObject getField3() {
            return this.$payload;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$index = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$payload = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX8670_native.class, $ic4$, $ic5$, $ic6$, $ic7$, new String[] { "$index", "$payload" }, $ic8$, $ic9$, $ic10$);
        }
    }
    
    public static final class $f6883$UnaryFunction extends UnaryFunction
    {
        public $f6883$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#8671"));
        }
        
        public SubLObject processItem(final SubLObject var31) {
            return f6883(var31);
        }
    }
    
    public static final class $sX8672_native extends SubLStructNative
    {
        public SubLObject $map;
        public SubLObject $fvector;
        public SubLObject $common_symbols;
        public static final SubLStructDeclNative structDecl;
        
        public $sX8672_native() {
            this.$map = (SubLObject)CommonSymbols.NIL;
            this.$fvector = (SubLObject)CommonSymbols.NIL;
            this.$common_symbols = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SstructDecl;
        }
        
        public SubLObject getField2() {
            return this.$map;
        }
        
        public SubLObject getField3() {
            return this.$fvector;
        }
        
        public SubLObject getField4() {
            return this.$common_symbols;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$map = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$fvector = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$common_symbols = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX8672_native.class, $ic73$, $ic74$, $ic75$, $ic76$, new String[] { "$map", "$fvector", "$common_symbols" }, $ic77$, $ic78$, $ic79$);
        }
    }
    
    public static final class $f6951$UnaryFunction extends UnaryFunction
    {
        public $f6951$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#8673"));
        }
        
        public SubLObject processItem(final SubLObject var31) {
            return f6951(var31);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 1292 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/
package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0054 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0054";
    public static final String myFingerPrint = "a477bffb0625be1159e30b953297eee33f27e88d671f72163844a6ece127c27d";
    public static SubLSymbol $g1031$;
    public static SubLSymbol $g1032$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLList $ic2$;
    private static final SubLList $ic3$;
    private static final SubLList $ic4$;
    private static final SubLList $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLList $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLString $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLString $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLString $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLList $ic25$;
    private static final SubLList $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLString $ic32$;
    private static final SubLString $ic33$;
    private static final SubLString $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLList $ic37$;
    private static final SubLList $ic38$;
    private static final SubLList $ic39$;
    private static final SubLList $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLList $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLString $ic52$;
    private static final SubLString $ic53$;
    private static final SubLString $ic54$;
    
    public static SubLObject f3957(final SubLObject var1, final SubLObject var2) {
        f3958(var1, var2, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3959(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX5431_native.class) ? T : NIL);
    }
    
    public static SubLObject f3960(final SubLObject var1) {
        assert NIL != f3959(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f3961(final SubLObject var1) {
        assert NIL != f3959(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f3962(final SubLObject var1, final SubLObject var4) {
        assert NIL != f3959(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f3963(final SubLObject var1, final SubLObject var4) {
        assert NIL != f3959(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f3964(SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX5431_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)NIL, var7 = var5; NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)$ic13$)) {
                f3962(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic14$)) {
                f3963(var6, var9);
            }
            else {
                Errors.error((SubLObject)$ic15$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f3965(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)$ic16$, (SubLObject)$ic17$, (SubLObject)TWO_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)$ic18$, (SubLObject)$ic13$, f3960(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic18$, (SubLObject)$ic14$, f3961(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic19$, (SubLObject)$ic17$, (SubLObject)TWO_INTEGER);
        return var11;
    }
    
    public static SubLObject f3966(final SubLObject var11, final SubLObject var12) {
        return f3965(var11, var12);
    }
    
    public static SubLObject f3958(final SubLObject var13, final SubLObject var2, final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        if (NIL != print_high.$print_readably$.getDynamicValue(var15)) {
            print_high.print_not_readable(var13, var2);
        }
        else {
            streams_high.write_string((SubLObject)$ic21$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            PrintLow.write((SubLObject)Types.type_of(var13), new SubLObject[] { $ic22$, var2 });
            streams_high.write_char((SubLObject)Characters.CHAR_space, var2);
            streams_high.write_string((SubLObject)$ic23$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            print_high.princ(f3967(var13), var2);
            streams_high.write_char((SubLObject)Characters.CHAR_space, var2);
            PrintLow.write(Equality.pointer(var13), new SubLObject[] { $ic22$, var2, $ic24$, SIXTEEN_INTEGER });
            streams_high.write_char((SubLObject)Characters.CHAR_greater, var2);
        }
        return var13;
    }
    
    public static SubLObject f3968() {
        return f3969(f3964((SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f3969(final SubLObject var13) {
        assert NIL != f3959(var13) : var13;
        f3962(var13, (SubLObject)ZERO_INTEGER);
        f3963(var13, (SubLObject)NIL);
        return var13;
    }
    
    public static SubLObject f3970(final SubLObject var13) {
        assert NIL != f3959(var13) : var13;
        return Types.sublisp_null(f3961(var13));
    }
    
    public static SubLObject f3971(final SubLObject var19, final SubLObject var20) {
        if (NIL != f3959(var20)) {
            return module0035.f2192(var19, f3961(var20));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3967(final SubLObject var13) {
        assert NIL != f3959(var13) : var13;
        return f3960(var13);
    }
    
    public static SubLObject f3972(final SubLObject var13) {
        assert NIL != f3959(var13) : var13;
        return conses_high.copy_list(f3961(var13));
    }
    
    public static SubLObject f3973(final SubLObject var21, final SubLObject var13) {
        assert NIL != f3959(var13) : var13;
        f3963(var13, (SubLObject)ConsesLow.cons(var21, f3961(var13)));
        f3962(var13, Numbers.add(f3960(var13), (SubLObject)ONE_INTEGER));
        return var13;
    }
    
    public static SubLObject f3974(final SubLObject var13) {
        assert NIL != f3959(var13) : var13;
        if (NIL == f3970(var13)) {
            final SubLObject var14 = f3961(var13);
            final SubLObject var15 = var14.first();
            final SubLObject var16 = var14.rest();
            f3962(var13, Numbers.subtract(f3960(var13), (SubLObject)ONE_INTEGER));
            f3963(var13, var16);
            return var15;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3975(final SubLObject var13) {
        assert NIL != f3959(var13) : var13;
        if (NIL == f3970(var13)) {
            final SubLObject var14 = f3961(var13);
            final SubLObject var15 = var14.first();
            return var15;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3976(final SubLObject var21, final SubLObject var13, SubLObject var24) {
        if (var24 == UNPROVIDED) {
            var24 = Symbols.symbol_function((SubLObject)EQL);
        }
        assert NIL != f3959(var13) : var13;
        SubLObject var25 = (SubLObject)NIL;
        SubLObject var26;
        for (var26 = (SubLObject)NIL, var26 = f3961(var13); NIL != var26; var26 = var26.rest()) {
            if (NIL != Functions.funcall(var24, var26.first(), var21)) {
                f3962(var13, Numbers.subtract(f3960(var13), (SubLObject)ONE_INTEGER));
                if (var26.eql(f3961(var13))) {
                    f3963(var13, var26.rest());
                }
                else {
                    ConsesLow.rplacd(var25, var26.rest());
                }
            }
            else {
                var25 = var26;
            }
        }
        return var13;
    }
    
    public static SubLObject f3977(final SubLObject var27, final SubLObject var28) {
        SubLObject var30;
        final SubLObject var29 = var30 = var27.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var30, var29, (SubLObject)$ic25$);
        final SubLObject var31 = var30.rest();
        var30 = var30.first();
        SubLObject var32 = (SubLObject)NIL;
        SubLObject var33 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var30, var29, (SubLObject)$ic25$);
        var32 = var30.first();
        var30 = var30.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var30, var29, (SubLObject)$ic25$);
        var33 = var30.first();
        var30 = var30.rest();
        SubLObject var34 = (SubLObject)NIL;
        SubLObject var35 = var30;
        SubLObject var36 = (SubLObject)NIL;
        SubLObject var36_37 = (SubLObject)NIL;
        while (NIL != var35) {
            cdestructuring_bind.destructuring_bind_must_consp(var35, var29, (SubLObject)$ic25$);
            var36_37 = var35.first();
            var35 = var35.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var35, var29, (SubLObject)$ic25$);
            if (NIL == conses_high.member(var36_37, (SubLObject)$ic26$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var36 = (SubLObject)T;
            }
            if (var36_37 == $ic27$) {
                var34 = var35.first();
            }
            var35 = var35.rest();
        }
        if (NIL != var36 && NIL == var34) {
            cdestructuring_bind.cdestructuring_bind_error(var29, (SubLObject)$ic25$);
        }
        final SubLObject var37 = cdestructuring_bind.property_list_member((SubLObject)$ic28$, var30);
        final SubLObject var38 = (SubLObject)((NIL != var37) ? conses_high.cadr(var37) : NIL);
        final SubLObject var39;
        var30 = (var39 = var31);
        return (SubLObject)ConsesLow.listS((SubLObject)$ic29$, (SubLObject)ConsesLow.list(var32, (SubLObject)ConsesLow.list((SubLObject)$ic30$, var33), (SubLObject)$ic28$, var38), ConsesLow.append(var39, (SubLObject)NIL));
    }
    
    public static SubLObject f3978(final SubLObject var13) {
        return f3961(var13);
    }
    
    public static SubLObject f3979(final SubLObject var21, final SubLObject var13, SubLObject var24, SubLObject var41) {
        if (var24 == UNPROVIDED) {
            var24 = Symbols.symbol_function((SubLObject)EQL);
        }
        if (var41 == UNPROVIDED) {
            var41 = Symbols.symbol_function((SubLObject)IDENTITY);
        }
        assert NIL != f3959(var13) : var13;
        return Sequences.find(var21, f3961(var13), var24, var41, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f3980(final SubLObject var24, final SubLObject var13, SubLObject var41) {
        if (var41 == UNPROVIDED) {
            var41 = Symbols.symbol_function((SubLObject)IDENTITY);
        }
        assert NIL != f3959(var13) : var13;
        return Sequences.find_if(var24, f3961(var13), var41, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f3981(final SubLObject var13, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)T;
        }
        PrintLow.format(var2, (SubLObject)$ic32$, f3967(var13));
        PrintLow.format(var2, (SubLObject)$ic33$);
        SubLObject var14 = f3961(var13);
        SubLObject var15 = (SubLObject)NIL;
        var15 = var14.first();
        while (NIL != var14) {
            PrintLow.format(var2, (SubLObject)$ic34$, var15);
            var14 = var14.rest();
            var15 = var14.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3982(final SubLObject var1, final SubLObject var2) {
        f3983(var1, var2, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3984(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX5435_native.class) ? T : NIL);
    }
    
    public static SubLObject f3985(final SubLObject var1) {
        assert NIL != f3984(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f3986(final SubLObject var1) {
        assert NIL != f3984(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f3987(final SubLObject var1, final SubLObject var4) {
        assert NIL != f3984(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f3988(final SubLObject var1, final SubLObject var4) {
        assert NIL != f3984(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f3989(SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX5435_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)NIL, var7 = var5; NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)$ic48$)) {
                f3987(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic49$)) {
                f3988(var6, var9);
            }
            else {
                Errors.error((SubLObject)$ic15$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f3990(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)$ic16$, (SubLObject)$ic50$, (SubLObject)TWO_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)$ic18$, (SubLObject)$ic48$, f3985(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic18$, (SubLObject)$ic49$, f3986(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic19$, (SubLObject)$ic50$, (SubLObject)TWO_INTEGER);
        return var11;
    }
    
    public static SubLObject f3991(final SubLObject var11, final SubLObject var12) {
        return f3990(var11, var12);
    }
    
    public static SubLObject f3983(final SubLObject var46, final SubLObject var2, final SubLObject var14) {
        final SubLThread var47 = SubLProcess.currentSubLThread();
        if (NIL != print_high.$print_readably$.getDynamicValue(var47)) {
            print_high.print_not_readable(var46, var2);
        }
        else {
            streams_high.write_string((SubLObject)$ic21$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            PrintLow.write((SubLObject)Types.type_of(var46), new SubLObject[] { $ic22$, var2 });
            streams_high.write_char((SubLObject)Characters.CHAR_space, var2);
            streams_high.write_string((SubLObject)$ic23$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            print_high.princ(f3992(var46), var2);
            streams_high.write_char((SubLObject)Characters.CHAR_space, var2);
            PrintLow.write(Equality.pointer(var46), new SubLObject[] { $ic22$, var2, $ic24$, SIXTEEN_INTEGER });
            streams_high.write_char((SubLObject)Characters.CHAR_greater, var2);
        }
        return var46;
    }
    
    public static SubLObject f3993() {
        final SubLObject var46 = f3989((SubLObject)UNPROVIDED);
        f3987(var46, Locks.make_lock((SubLObject)$ic52$));
        f3988(var46, f3968());
        return var46;
    }
    
    public static SubLObject f3994(final SubLObject var46) {
        assert NIL != f3984(var46) : var46;
        final SubLObject var47 = f3985(var46);
        SubLObject var48 = (SubLObject)NIL;
        try {
            var48 = Locks.seize_lock(var47);
            f3969(f3986(var46));
        }
        finally {
            if (NIL != var48) {
                Locks.release_lock(var47);
            }
        }
        return var46;
    }
    
    public static SubLObject f3995(final SubLObject var46) {
        assert NIL != f3984(var46) : var46;
        return f3970(f3986(var46));
    }
    
    public static SubLObject f3992(final SubLObject var46) {
        assert NIL != f3984(var46) : var46;
        return f3967(f3986(var46));
    }
    
    public static SubLObject f3996(final SubLObject var46) {
        assert NIL != f3984(var46) : var46;
        SubLObject var47 = (SubLObject)NIL;
        final SubLObject var48 = f3985(var46);
        SubLObject var49 = (SubLObject)NIL;
        try {
            var49 = Locks.seize_lock(var48);
            var47 = f3972(f3986(var46));
        }
        finally {
            if (NIL != var49) {
                Locks.release_lock(var48);
            }
        }
        return var47;
    }
    
    public static SubLObject f3997(final SubLObject var21, final SubLObject var46) {
        assert NIL != f3984(var46) : var46;
        SubLObject var47 = (SubLObject)NIL;
        final SubLObject var48 = f3985(var46);
        SubLObject var49 = (SubLObject)NIL;
        try {
            var49 = Locks.seize_lock(var48);
            var47 = f3973(var21, f3986(var46));
        }
        finally {
            if (NIL != var49) {
                Locks.release_lock(var48);
            }
        }
        return var47;
    }
    
    public static SubLObject f3998(final SubLObject var46) {
        assert NIL != f3984(var46) : var46;
        SubLObject var47 = (SubLObject)NIL;
        final SubLObject var48 = f3985(var46);
        SubLObject var49 = (SubLObject)NIL;
        try {
            var49 = Locks.seize_lock(var48);
            var47 = f3974(f3986(var46));
        }
        finally {
            if (NIL != var49) {
                Locks.release_lock(var48);
            }
        }
        return var47;
    }
    
    public static SubLObject f3999(final SubLObject var21, final SubLObject var46, SubLObject var24) {
        if (var24 == UNPROVIDED) {
            var24 = Symbols.symbol_function((SubLObject)EQL);
        }
        assert NIL != f3984(var46) : var46;
        SubLObject var47 = (SubLObject)NIL;
        final SubLObject var48 = f3985(var46);
        SubLObject var49 = (SubLObject)NIL;
        try {
            var49 = Locks.seize_lock(var48);
            var47 = f3976(var21, f3986(var46), var24);
        }
        finally {
            if (NIL != var49) {
                Locks.release_lock(var48);
            }
        }
        return var47;
    }
    
    public static SubLObject f4000(final SubLObject var46, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)T;
        }
        final SubLObject var47 = f3992(var46);
        final SubLObject var48 = f3996(var46);
        PrintLow.format(var2, (SubLObject)$ic53$, var47);
        PrintLow.format(var2, (SubLObject)$ic54$);
        SubLObject var49 = var48;
        SubLObject var50 = (SubLObject)NIL;
        var50 = var49.first();
        while (NIL != var49) {
            PrintLow.format(var2, (SubLObject)$ic34$, var50);
            var49 = var49.rest();
            var50 = var49.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f4001() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0054", "f3957", "S#5437", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0054", "f3959", "S#5434", 1, 0, false);
        new $f3959$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0054", "f3960", "S#5438", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0054", "f3961", "S#5439", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0054", "f3962", "S#5440", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0054", "f3963", "S#5441", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0054", "f3964", "S#5442", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0054", "f3965", "S#5443", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0054", "f3966", "S#5444", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0054", "f3958", "S#5445", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0054", "f3968", "S#3952", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0054", "f3969", "S#5446", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0054", "f3970", "S#3954", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0054", "f3971", "S#5447", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0054", "f3967", "S#5448", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0054", "f3972", "S#5449", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0054", "f3973", "S#3953", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0054", "f3974", "S#3955", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0054", "f3975", "S#5450", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0054", "f3976", "S#5451", 2, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0054", "f3977", "S#5452");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0054", "f3978", "S#5453", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0054", "f3979", "S#5454", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0054", "f3980", "S#5455", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0054", "f3981", "S#5456", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0054", "f3982", "S#5457", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0054", "f3984", "S#5436", 1, 0, false);
        new $f3984$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0054", "f3985", "S#5458", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0054", "f3986", "S#5459", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0054", "f3987", "S#5460", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0054", "f3988", "S#5461", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0054", "f3989", "S#5462", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0054", "f3990", "S#5463", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0054", "f3991", "S#5464", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0054", "f3983", "S#5465", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0054", "f3993", "S#5466", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0054", "f3994", "S#5467", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0054", "f3995", "S#5468", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0054", "f3992", "S#5469", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0054", "f3996", "S#5470", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0054", "f3997", "S#5471", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0054", "f3998", "S#5472", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0054", "f3999", "S#5473", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0054", "f4000", "S#5474", 1, 1, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f4002() {
        $g1031$ = SubLFiles.defconstant("S#5475", (SubLObject)$ic0$);
        $g1032$ = SubLFiles.defconstant("S#5476", (SubLObject)$ic35$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f4003() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g1031$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic7$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic8$);
        Structures.def_csetf((SubLObject)$ic9$, (SubLObject)$ic10$);
        Structures.def_csetf((SubLObject)$ic11$, (SubLObject)$ic12$);
        Equality.identity((SubLObject)$ic0$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g1031$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic20$));
        module0002.f50((SubLObject)$ic30$, (SubLObject)$ic31$);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g1032$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic42$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic43$);
        Structures.def_csetf((SubLObject)$ic44$, (SubLObject)$ic45$);
        Structures.def_csetf((SubLObject)$ic46$, (SubLObject)$ic47$);
        Equality.identity((SubLObject)$ic35$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g1032$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic51$));
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f4001();
    }
    
    public void initializeVariables() {
        f4002();
    }
    
    public void runTopLevelForms() {
        f4003();
    }
    
    static {
        me = (SubLFile)new module0054();
        $g1031$ = null;
        $g1032$ = null;
        $ic0$ = makeSymbol("S#5431", "CYC");
        $ic1$ = makeSymbol("S#5434", "CYC");
        $ic2$ = ConsesLow.list((SubLObject)makeSymbol("S#1993", "CYC"), (SubLObject)makeSymbol("S#5477", "CYC"));
        $ic3$ = ConsesLow.list((SubLObject)makeKeyword("NUM"), (SubLObject)makeKeyword("ELEMENTS"));
        $ic4$ = ConsesLow.list((SubLObject)makeSymbol("S#5438", "CYC"), (SubLObject)makeSymbol("S#5439", "CYC"));
        $ic5$ = ConsesLow.list((SubLObject)makeSymbol("S#5440", "CYC"), (SubLObject)makeSymbol("S#5441", "CYC"));
        $ic6$ = makeSymbol("S#5445", "CYC");
        $ic7$ = makeSymbol("S#5437", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#5434", "CYC"));
        $ic9$ = makeSymbol("S#5438", "CYC");
        $ic10$ = makeSymbol("S#5440", "CYC");
        $ic11$ = makeSymbol("S#5439", "CYC");
        $ic12$ = makeSymbol("S#5441", "CYC");
        $ic13$ = makeKeyword("NUM");
        $ic14$ = makeKeyword("ELEMENTS");
        $ic15$ = makeString("Invalid slot ~S for construction function");
        $ic16$ = makeKeyword("BEGIN");
        $ic17$ = makeSymbol("S#5442", "CYC");
        $ic18$ = makeKeyword("SLOT");
        $ic19$ = makeKeyword("END");
        $ic20$ = makeSymbol("S#5444", "CYC");
        $ic21$ = makeString("#<");
        $ic22$ = makeKeyword("STREAM");
        $ic23$ = makeString("size=");
        $ic24$ = makeKeyword("BASE");
        $ic25$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#5478", "CYC"), (SubLObject)makeSymbol("S#5431", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic26$ = ConsesLow.list((SubLObject)makeKeyword("DONE"));
        $ic27$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic28$ = makeKeyword("DONE");
        $ic29$ = makeSymbol("DO-LIST");
        $ic30$ = makeSymbol("S#5453", "CYC");
        $ic31$ = makeSymbol("S#5452", "CYC");
        $ic32$ = makeString("~%Stack length : ~a");
        $ic33$ = makeString("~%Stack contents :");
        $ic34$ = makeString("~%~s");
        $ic35$ = makeSymbol("S#5435", "CYC");
        $ic36$ = makeSymbol("S#5436", "CYC");
        $ic37$ = ConsesLow.list((SubLObject)makeSymbol("S#672", "CYC"), (SubLObject)makeSymbol("S#5431", "CYC"));
        $ic38$ = ConsesLow.list((SubLObject)makeKeyword("LOCK"), (SubLObject)makeKeyword("STACK"));
        $ic39$ = ConsesLow.list((SubLObject)makeSymbol("S#5458", "CYC"), (SubLObject)makeSymbol("S#5459", "CYC"));
        $ic40$ = ConsesLow.list((SubLObject)makeSymbol("S#5460", "CYC"), (SubLObject)makeSymbol("S#5461", "CYC"));
        $ic41$ = makeSymbol("S#5465", "CYC");
        $ic42$ = makeSymbol("S#5457", "CYC");
        $ic43$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#5436", "CYC"));
        $ic44$ = makeSymbol("S#5458", "CYC");
        $ic45$ = makeSymbol("S#5460", "CYC");
        $ic46$ = makeSymbol("S#5459", "CYC");
        $ic47$ = makeSymbol("S#5461", "CYC");
        $ic48$ = makeKeyword("LOCK");
        $ic49$ = makeKeyword("STACK");
        $ic50$ = makeSymbol("S#5462", "CYC");
        $ic51$ = makeSymbol("S#5464", "CYC");
        $ic52$ = makeString("Stack Lock");
        $ic53$ = makeString("~%Locked Stack size : ~a");
        $ic54$ = makeString("~%Locked Stack contents :");
    }
    
    public static final class $sX5431_native extends SubLStructNative
    {
        public SubLObject $num;
        public SubLObject $elements;
        public static final SubLStructDeclNative structDecl;
        
        public $sX5431_native() {
            this.$num = (SubLObject)CommonSymbols.NIL;
            this.$elements = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SstructDecl;
        }
        
        public SubLObject getField2() {
            return this.$num;
        }
        
        public SubLObject getField3() {
            return this.$elements;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$num = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$elements = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX5431_native.class, $ic0$, $ic1$, $ic2$, $ic3$, new String[] { "$num", "$elements" }, $ic4$, $ic5$, $ic6$);
        }
    }
    
    public static final class $f3959$UnaryFunction extends UnaryFunction
    {
        public $f3959$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#5434"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f3959(var3);
        }
    }
    
    public static final class $sX5435_native extends SubLStructNative
    {
        public SubLObject $lock;
        public SubLObject $stack;
        public static final SubLStructDeclNative structDecl;
        
        public $sX5435_native() {
            this.$lock = (SubLObject)CommonSymbols.NIL;
            this.$stack = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SstructDecl;
        }
        
        public SubLObject getField2() {
            return this.$lock;
        }
        
        public SubLObject getField3() {
            return this.$stack;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$lock = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$stack = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX5435_native.class, $ic35$, $ic36$, $ic37$, $ic38$, new String[] { "$lock", "$stack" }, $ic39$, $ic40$, $ic41$);
        }
    }
    
    public static final class $f3984$UnaryFunction extends UnaryFunction
    {
        public $f3984$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#5436"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f3984(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 152 ms
	
	Decompiled with Procyon 0.5.32.
*/
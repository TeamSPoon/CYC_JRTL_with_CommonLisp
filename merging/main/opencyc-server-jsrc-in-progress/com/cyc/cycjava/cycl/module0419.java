package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0419 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0419";
    public static final String myFingerPrint = "03c1e077272b2096eefd3b3f88ab5ce3a051aafd5d7aead01d4d21df4e90c56d";
    public static SubLSymbol $g3413$;
    private static SubLSymbol $g3414$;
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
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLString $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLInteger $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLString $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLList $ic36$;
    private static final SubLList $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLList $ic42$;
    private static final SubLList $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLList $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLList $ic50$;
    private static final SubLList $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLList $ic57$;
    private static final SubLList $ic58$;
    private static final SubLObject $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLList $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLObject $ic66$;
    private static final SubLObject $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLObject $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLObject $ic74$;
    private static final SubLObject $ic75$;
    private static final SubLObject $ic76$;
    private static final SubLList $ic77$;
    private static final SubLList $ic78$;
    private static final SubLList $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLList $ic82$;
    private static final SubLList $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLList $ic86$;
    private static final SubLObject $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLList $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLSymbol $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLSymbol $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLSymbol $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLString $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLString $ic107$;
    private static final SubLString $ic108$;
    private static final SubLString $ic109$;
    
    public static SubLObject f29316(final SubLObject var1, final SubLObject var2) {
        compatibility.default_struct_print_function(var1, var2, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29317(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX32482_native.class) ? T : NIL);
    }
    
    public static SubLObject f29318(final SubLObject var1) {
        assert NIL != f29317(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f29319(final SubLObject var1) {
        assert NIL != f29317(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f29320(final SubLObject var1) {
        assert NIL != f29317(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f29321(final SubLObject var1) {
        assert NIL != f29317(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f29322(final SubLObject var1) {
        assert NIL != f29317(var1) : var1;
        return var1.getField6();
    }
    
    public static SubLObject f29323(final SubLObject var1, final SubLObject var4) {
        assert NIL != f29317(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f29324(final SubLObject var1, final SubLObject var4) {
        assert NIL != f29317(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f29325(final SubLObject var1, final SubLObject var4) {
        assert NIL != f29317(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f29326(final SubLObject var1, final SubLObject var4) {
        assert NIL != f29317(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f29327(final SubLObject var1, final SubLObject var4) {
        assert NIL != f29317(var1) : var1;
        return var1.setField6(var4);
    }
    
    public static SubLObject f29328(SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX32482_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)NIL, var7 = var5; NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)$ic19$)) {
                f29323(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic20$)) {
                f29324(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic21$)) {
                f29325(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic22$)) {
                f29326(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic23$)) {
                f29327(var6, var9);
            }
            else {
                Errors.error((SubLObject)$ic24$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f29329(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)$ic25$, (SubLObject)$ic26$, (SubLObject)FIVE_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)$ic27$, (SubLObject)$ic19$, f29318(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic27$, (SubLObject)$ic20$, f29319(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic27$, (SubLObject)$ic21$, f29320(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic27$, (SubLObject)$ic22$, f29321(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic27$, (SubLObject)$ic23$, f29322(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic28$, (SubLObject)$ic26$, (SubLObject)FIVE_INTEGER);
        return var11;
    }
    
    public static SubLObject f29330(final SubLObject var11, final SubLObject var12) {
        return f29329(var11, var12);
    }
    
    public static SubLObject f29331() {
        Hashtables.clrhash($g3414$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29332() {
        SubLObject var13 = module0030.f1625($g3414$.getGlobalValue());
        var13 = module0213.f13926(var13, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return var13;
    }
    
    public static SubLObject f29333(final SubLObject var14) {
        assert NIL != module0173.f10955(var14) : var14;
        SubLObject var15 = conses_high.copy_list(Hashtables.gethash(var14, $g3414$.getGlobalValue(), (SubLObject)UNPROVIDED));
        var15 = Sort.sort(var15, Symbols.symbol_function((SubLObject)$ic33$), Symbols.symbol_function((SubLObject)$ic11$));
        return var15;
    }
    
    public static SubLObject f29334(final SubLObject var14) {
        assert NIL != module0173.f10955(var14) : var14;
        return module0035.sublisp_boolean(Hashtables.gethash(var14, $g3414$.getGlobalValue(), (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f29335(final SubLObject var16) {
        return (SubLObject)ConsesLow.list(f29318(var16), f29319(var16));
    }
    
    public static SubLObject f29336(final SubLObject var16) {
        return f29322(var16);
    }
    
    public static SubLObject f29337(final SubLObject var16) {
        return (SubLObject)$ic34$;
    }
    
    public static SubLObject f29338(final SubLObject var16) {
        return f29318(var16);
    }
    
    public static SubLObject f29339(final SubLObject var16) {
        return f29320(var16);
    }
    
    public static SubLObject f29340(final SubLObject var16) {
        return f29321(var16);
    }
    
    public static SubLObject f29341(final SubLObject var16) {
        return (SubLObject)T;
    }
    
    public static SubLObject f29342(final SubLObject var16) {
        return (SubLObject)makeBoolean(NIL != module0035.f2439((SubLObject)$ic35$, f29338(var16), (SubLObject)UNPROVIDED) || NIL != module0035.f2439((SubLObject)$ic35$, f29339(var16), (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f29343(final SubLObject var16) {
        return Sequences.remove_duplicates(ConsesLow.append(module0205.f13183(f29338(var16), (SubLObject)$ic35$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), module0205.f13183(f29339(var16), (SubLObject)$ic35$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f29344(final SubLObject var14) {
        return Sequences.length(Hashtables.gethash(var14, $g3414$.getGlobalValue(), (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f29345() {
        SubLObject var17 = (SubLObject)ZERO_INTEGER;
        SubLObject var18 = (SubLObject)NIL;
        SubLObject var19 = (SubLObject)NIL;
        final Iterator var20 = Hashtables.getEntrySetIterator($g3414$.getGlobalValue());
        try {
            while (Hashtables.iteratorHasNext(var20)) {
                final Map.Entry var21 = Hashtables.iteratorNextEntry(var20);
                var18 = Hashtables.getEntryKey(var21);
                var19 = Hashtables.getEntryValue(var21);
                var17 = Numbers.add(var17, Sequences.length(var19));
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var20);
        }
        return var17;
    }
    
    public static SubLObject f29346(final SubLObject var20, final SubLObject var21) {
        SubLObject var23;
        final SubLObject var22 = var23 = var20.rest();
        SubLObject var24 = (SubLObject)NIL;
        SubLObject var25 = (SubLObject)NIL;
        SubLObject var26 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)$ic36$);
        var24 = var23.first();
        var23 = var23.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)$ic36$);
        var25 = var23.first();
        var23 = var23.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)$ic36$);
        var26 = var23.first();
        var23 = var23.rest();
        SubLObject var27 = (SubLObject)NIL;
        SubLObject var28 = var23;
        SubLObject var29 = (SubLObject)NIL;
        SubLObject var30_31 = (SubLObject)NIL;
        while (NIL != var28) {
            cdestructuring_bind.destructuring_bind_must_consp(var28, var22, (SubLObject)$ic36$);
            var30_31 = var28.first();
            var28 = var28.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var28, var22, (SubLObject)$ic36$);
            if (NIL == conses_high.member(var30_31, (SubLObject)$ic37$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var29 = (SubLObject)T;
            }
            if (var30_31 == $ic38$) {
                var27 = var28.first();
            }
            var28 = var28.rest();
        }
        if (NIL != var29 && NIL == var27) {
            cdestructuring_bind.cdestructuring_bind_error(var22, (SubLObject)$ic36$);
        }
        final SubLObject var30 = cdestructuring_bind.property_list_member((SubLObject)$ic22$, var23);
        final SubLObject var31 = (SubLObject)((NIL != var30) ? conses_high.cadr(var30) : $ic39$);
        final SubLObject var32 = cdestructuring_bind.property_list_member((SubLObject)$ic23$, var23);
        final SubLObject var33 = (SubLObject)((NIL != var32) ? conses_high.cadr(var32) : NIL);
        return (SubLObject)ConsesLow.list((SubLObject)$ic40$, var24, var25, var26, var31, var33);
    }
    
    public static SubLObject f29347(final SubLObject var20, final SubLObject var21) {
        SubLObject var23;
        final SubLObject var22 = var23 = var20.rest();
        SubLObject var24 = (SubLObject)NIL;
        SubLObject var25 = (SubLObject)NIL;
        SubLObject var26 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)$ic43$);
        var24 = var23.first();
        var23 = var23.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)$ic43$);
        var25 = var23.first();
        var23 = var23.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)$ic43$);
        var26 = var23.first();
        var23 = var23.rest();
        SubLObject var27 = (SubLObject)NIL;
        SubLObject var28 = var23;
        SubLObject var29 = (SubLObject)NIL;
        SubLObject var42_43 = (SubLObject)NIL;
        while (NIL != var28) {
            cdestructuring_bind.destructuring_bind_must_consp(var28, var22, (SubLObject)$ic43$);
            var42_43 = var28.first();
            var28 = var28.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var28, var22, (SubLObject)$ic43$);
            if (NIL == conses_high.member(var42_43, (SubLObject)$ic37$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var29 = (SubLObject)T;
            }
            if (var42_43 == $ic38$) {
                var27 = var28.first();
            }
            var28 = var28.rest();
        }
        if (NIL != var29 && NIL == var27) {
            cdestructuring_bind.cdestructuring_bind_error(var22, (SubLObject)$ic43$);
        }
        final SubLObject var30 = cdestructuring_bind.property_list_member((SubLObject)$ic22$, var23);
        final SubLObject var31 = (SubLObject)((NIL != var30) ? conses_high.cadr(var30) : $ic39$);
        final SubLObject var32 = cdestructuring_bind.property_list_member((SubLObject)$ic23$, var23);
        final SubLObject var33 = (SubLObject)((NIL != var32) ? conses_high.cadr(var32) : NIL);
        return (SubLObject)ConsesLow.list((SubLObject)$ic40$, var24, var25, var26, var31, var33);
    }
    
    public static SubLObject f29348(final SubLObject var14, final SubLObject var25, final SubLObject var26, final SubLObject var33, final SubLObject var35) {
        final SubLThread var36 = SubLProcess.currentSubLThread();
        assert NIL != module0173.f10955(var14) : var14;
        assert NIL != Types.integerp(var25) : var25;
        assert NIL != module0202.f12660(var26) : var26;
        assert NIL != module0029.f1472(var33) : var33;
        assert NIL != module0421.f29459(var35) : var35;
        final SubLObject var37 = f29328((SubLObject)ConsesLow.list(new SubLObject[] { $ic19$, var14, $ic20$, var25, $ic21$, var26, $ic22$, var33, $ic23$, var35 }));
        SubLObject var38 = Hashtables.gethash(var14, $g3414$.getGlobalValue(), (SubLObject)UNPROVIDED);
        var38 = Sequences.delete(var25, var38, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)$ic11$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        var38 = (SubLObject)ConsesLow.cons(var37, var38);
        Hashtables.sethash(var14, $g3414$.getGlobalValue(), var38);
        module0029.f1506(module0029.$g836$.getDynamicValue(var36), var37);
        return var37;
    }
    
    public static SubLObject f29349(final SubLObject var20, final SubLObject var21) {
        SubLObject var23;
        final SubLObject var22 = var23 = var20.rest();
        SubLObject var24 = (SubLObject)NIL;
        SubLObject var25 = (SubLObject)NIL;
        SubLObject var26 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)$ic50$);
        var24 = var23.first();
        var23 = var23.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)$ic50$);
        var25 = var23.first();
        var23 = var23.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)$ic50$);
        var26 = var23.first();
        var23 = var23.rest();
        SubLObject var27 = (SubLObject)NIL;
        SubLObject var28 = var23;
        SubLObject var29 = (SubLObject)NIL;
        SubLObject var55_56 = (SubLObject)NIL;
        while (NIL != var28) {
            cdestructuring_bind.destructuring_bind_must_consp(var28, var22, (SubLObject)$ic50$);
            var55_56 = var28.first();
            var28 = var28.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var28, var22, (SubLObject)$ic50$);
            if (NIL == conses_high.member(var55_56, (SubLObject)$ic51$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var29 = (SubLObject)T;
            }
            if (var55_56 == $ic38$) {
                var27 = var28.first();
            }
            var28 = var28.rest();
        }
        if (NIL != var29 && NIL == var27) {
            cdestructuring_bind.cdestructuring_bind_error(var22, (SubLObject)$ic50$);
        }
        final SubLObject var30 = cdestructuring_bind.property_list_member((SubLObject)$ic52$, var23);
        final SubLObject var31 = (SubLObject)((NIL != var30) ? conses_high.cadr(var30) : $ic53$);
        final SubLObject var32 = cdestructuring_bind.property_list_member((SubLObject)$ic22$, var23);
        final SubLObject var33 = (SubLObject)((NIL != var32) ? conses_high.cadr(var32) : $ic39$);
        final SubLObject var34 = cdestructuring_bind.property_list_member((SubLObject)$ic54$, var23);
        final SubLObject var35 = (SubLObject)((NIL != var34) ? conses_high.cadr(var34) : NIL);
        final SubLObject var36 = cdestructuring_bind.property_list_member((SubLObject)$ic23$, var23);
        final SubLObject var37 = (SubLObject)((NIL != var36) ? conses_high.cadr(var36) : NIL);
        return (SubLObject)ConsesLow.list((SubLObject)$ic55$, var24, var25, var35, var31, var26, var33, var37);
    }
    
    public static SubLObject f29350(final SubLObject var20, final SubLObject var21) {
        SubLObject var23;
        final SubLObject var22 = var23 = var20.rest();
        SubLObject var24 = (SubLObject)NIL;
        SubLObject var25 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)$ic57$);
        var24 = var23.first();
        var23 = var23.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)$ic57$);
        var25 = var23.first();
        var23 = var23.rest();
        SubLObject var26 = (SubLObject)NIL;
        SubLObject var27 = var23;
        SubLObject var28 = (SubLObject)NIL;
        SubLObject var69_70 = (SubLObject)NIL;
        while (NIL != var27) {
            cdestructuring_bind.destructuring_bind_must_consp(var27, var22, (SubLObject)$ic57$);
            var69_70 = var27.first();
            var27 = var27.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var27, var22, (SubLObject)$ic57$);
            if (NIL == conses_high.member(var69_70, (SubLObject)$ic58$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var28 = (SubLObject)T;
            }
            if (var69_70 == $ic38$) {
                var26 = var27.first();
            }
            var27 = var27.rest();
        }
        if (NIL != var28 && NIL == var26) {
            cdestructuring_bind.cdestructuring_bind_error(var22, (SubLObject)$ic57$);
        }
        final SubLObject var29 = cdestructuring_bind.property_list_member((SubLObject)$ic54$, var23);
        final SubLObject var30 = (NIL != var29) ? conses_high.cadr(var29) : $ic59$;
        final SubLObject var31 = cdestructuring_bind.property_list_member((SubLObject)$ic22$, var23);
        final SubLObject var32 = (SubLObject)((NIL != var31) ? conses_high.cadr(var31) : $ic39$);
        final SubLObject var33 = cdestructuring_bind.property_list_member((SubLObject)$ic60$, var23);
        final SubLObject var34 = (SubLObject)((NIL != var33) ? conses_high.cadr(var33) : NIL);
        final SubLObject var35 = cdestructuring_bind.property_list_member((SubLObject)$ic23$, var23);
        final SubLObject var36 = (SubLObject)((NIL != var35) ? conses_high.cadr(var35) : NIL);
        final SubLObject var37 = cdestructuring_bind.property_list_member((SubLObject)$ic61$, var23);
        final SubLObject var38 = (SubLObject)((NIL != var37) ? conses_high.cadr(var37) : T);
        return (SubLObject)ConsesLow.list((SubLObject)$ic62$, var24, var25, var30, var34, var38, var32, var36);
    }
    
    public static SubLObject f29351(final SubLObject var24, final SubLObject var25, final SubLObject var61, final SubLObject var58, final SubLObject var51, final SubLObject var33, final SubLObject var35) {
        SubLObject var62 = (SubLObject)NIL;
        if (var58.eql((SubLObject)$ic65$)) {
            var62 = (SubLObject)ConsesLow.list($ic66$, (SubLObject)ConsesLow.list($ic67$, (SubLObject)ConsesLow.list((SubLObject)$ic68$, (SubLObject)ConsesLow.list((SubLObject)$ic69$, (SubLObject)ConsesLow.list((SubLObject)$ic70$, (SubLObject)ConsesLow.list($ic71$, (SubLObject)$ic72$, var51)), (SubLObject)ConsesLow.list((SubLObject)$ic70$, var61)))));
        }
        else if (var58.eql((SubLObject)$ic73$)) {
            var62 = (SubLObject)ConsesLow.list($ic74$, (SubLObject)ConsesLow.list($ic75$, (SubLObject)$ic72$, (SubLObject)ConsesLow.list($ic71$, (SubLObject)$ic72$, var51)));
        }
        else if (var58.eql((SubLObject)$ic53$)) {
            var62 = (SubLObject)ConsesLow.list($ic71$, (SubLObject)$ic72$, var51);
        }
        else {
            var62 = (SubLObject)ConsesLow.list($ic71$, var58, var51);
        }
        if (NIL != var61) {
            var62 = (SubLObject)ConsesLow.list($ic76$, var61, var62);
        }
        return f29348(var24, var25, var62, var33, var35);
    }
    
    public static SubLObject f29352(final SubLObject var24, final SubLObject var65, final SubLObject var61, final SubLObject var77, final SubLObject var76, final SubLObject var33, final SubLObject var35) {
        assert NIL != module0173.f10955(var24) : var24;
        assert NIL != Types.integerp(var65) : var65;
        if (NIL != var76) {
            SubLObject var78 = (SubLObject)NIL;
            SubLObject var79 = (SubLObject)NIL;
            SubLObject var80 = (SubLObject)NIL;
            var78 = var77;
            var79 = var78.first();
            for (var80 = (SubLObject)ZERO_INTEGER; NIL != var78; var78 = var78.rest(), var79 = var78.first(), var80 = Numbers.add((SubLObject)ONE_INTEGER, var80)) {
                final SubLObject var81 = Numbers.add(var65, var80);
                SubLObject var83;
                final SubLObject var82 = var83 = var79;
                SubLObject var84 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var83, var82, (SubLObject)$ic77$);
                var84 = var83.first();
                var83 = var83.rest();
                final SubLObject var85 = (SubLObject)(var83.isCons() ? var83.first() : $ic53$);
                cdestructuring_bind.destructuring_bind_must_listp(var83, var82, (SubLObject)$ic77$);
                var83 = var83.rest();
                if (NIL == var83) {
                    f29351(var24, var81, var61, var85, var84, var33, var35);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var82, (SubLObject)$ic77$);
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29353(final SubLObject var20, final SubLObject var21) {
        SubLObject var23;
        final SubLObject var22 = var23 = var20.rest();
        SubLObject var24 = (SubLObject)NIL;
        SubLObject var25 = (SubLObject)NIL;
        SubLObject var26 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)$ic78$);
        var24 = var23.first();
        var23 = var23.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)$ic78$);
        var25 = var23.first();
        var23 = var23.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)$ic78$);
        var26 = var23.first();
        var23 = var23.rest();
        SubLObject var27 = (SubLObject)NIL;
        SubLObject var28 = var23;
        SubLObject var29 = (SubLObject)NIL;
        SubLObject var88_89 = (SubLObject)NIL;
        while (NIL != var28) {
            cdestructuring_bind.destructuring_bind_must_consp(var28, var22, (SubLObject)$ic78$);
            var88_89 = var28.first();
            var28 = var28.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var28, var22, (SubLObject)$ic78$);
            if (NIL == conses_high.member(var88_89, (SubLObject)$ic79$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var29 = (SubLObject)T;
            }
            if (var88_89 == $ic38$) {
                var27 = var28.first();
            }
            var28 = var28.rest();
        }
        if (NIL != var29 && NIL == var27) {
            cdestructuring_bind.cdestructuring_bind_error(var22, (SubLObject)$ic78$);
        }
        final SubLObject var30 = cdestructuring_bind.property_list_member((SubLObject)$ic52$, var23);
        final SubLObject var31 = (SubLObject)((NIL != var30) ? conses_high.cadr(var30) : $ic53$);
        final SubLObject var32 = cdestructuring_bind.property_list_member((SubLObject)$ic54$, var23);
        final SubLObject var33 = (SubLObject)((NIL != var32) ? conses_high.cadr(var32) : NIL);
        final SubLObject var34 = cdestructuring_bind.property_list_member((SubLObject)$ic22$, var23);
        final SubLObject var35 = (SubLObject)((NIL != var34) ? conses_high.cadr(var34) : $ic39$);
        final SubLObject var36 = cdestructuring_bind.property_list_member((SubLObject)$ic23$, var23);
        final SubLObject var37 = (SubLObject)((NIL != var36) ? conses_high.cadr(var36) : NIL);
        return (SubLObject)ConsesLow.list((SubLObject)$ic80$, var24, var25, var33, var31, var26, var35, var37);
    }
    
    public static SubLObject f29354(final SubLObject var20, final SubLObject var21) {
        SubLObject var23;
        final SubLObject var22 = var23 = var20.rest();
        SubLObject var24 = (SubLObject)NIL;
        SubLObject var25 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)$ic82$);
        var24 = var23.first();
        var23 = var23.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)$ic82$);
        var25 = var23.first();
        var23 = var23.rest();
        SubLObject var26 = (SubLObject)NIL;
        SubLObject var27 = var23;
        SubLObject var28 = (SubLObject)NIL;
        SubLObject var99_100 = (SubLObject)NIL;
        while (NIL != var27) {
            cdestructuring_bind.destructuring_bind_must_consp(var27, var22, (SubLObject)$ic82$);
            var99_100 = var27.first();
            var27 = var27.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var27, var22, (SubLObject)$ic82$);
            if (NIL == conses_high.member(var99_100, (SubLObject)$ic83$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var28 = (SubLObject)T;
            }
            if (var99_100 == $ic38$) {
                var26 = var27.first();
            }
            var27 = var27.rest();
        }
        if (NIL != var28 && NIL == var26) {
            cdestructuring_bind.cdestructuring_bind_error(var22, (SubLObject)$ic82$);
        }
        final SubLObject var29 = cdestructuring_bind.property_list_member((SubLObject)$ic54$, var23);
        final SubLObject var30 = (NIL != var29) ? conses_high.cadr(var29) : $ic59$;
        final SubLObject var31 = cdestructuring_bind.property_list_member((SubLObject)$ic22$, var23);
        final SubLObject var32 = (SubLObject)((NIL != var31) ? conses_high.cadr(var31) : $ic39$);
        final SubLObject var33 = cdestructuring_bind.property_list_member((SubLObject)$ic23$, var23);
        final SubLObject var34 = (SubLObject)((NIL != var33) ? conses_high.cadr(var33) : NIL);
        final SubLObject var35 = cdestructuring_bind.property_list_member((SubLObject)$ic60$, var23);
        final SubLObject var36 = (SubLObject)((NIL != var35) ? conses_high.cadr(var35) : NIL);
        return (SubLObject)ConsesLow.list((SubLObject)$ic84$, var24, var25, var30, var32, var34, var36);
    }
    
    public static SubLObject f29355(final SubLObject var38, final SubLObject var25, final SubLObject var61, final SubLObject var58, SubLObject var26, final SubLObject var33, final SubLObject var35) {
        SubLObject var62 = (SubLObject)NIL;
        if (var58.eql((SubLObject)$ic65$)) {
            var26 = (SubLObject)ConsesLow.list($ic66$, (SubLObject)ConsesLow.list($ic67$, (SubLObject)ConsesLow.list((SubLObject)$ic68$, (SubLObject)ConsesLow.list((SubLObject)$ic69$, (SubLObject)ConsesLow.list((SubLObject)$ic70$, var26), (SubLObject)ConsesLow.list((SubLObject)$ic70$, var61)))));
        }
        else if (var58.eql((SubLObject)$ic73$)) {
            var62 = (SubLObject)ConsesLow.list($ic87$, (SubLObject)ConsesLow.list($ic74$, var26), (SubLObject)ConsesLow.list($ic74$, module0205.f13338(var26)));
        }
        else if (var58.eql((SubLObject)$ic88$)) {
            var62 = module0205.f13338(var26);
        }
        else {
            var62 = var26;
        }
        if (NIL != var61) {
            var62 = (SubLObject)ConsesLow.list($ic76$, var61, var62);
        }
        return f29348(var38, var25, var62, var33, var35);
    }
    
    public static SubLObject f29356(final SubLObject var38, final SubLObject var65, final SubLObject var61, final SubLObject var33, final SubLObject var35, final SubLObject var77) {
        assert NIL != module0173.f10955(var38) : var38;
        assert NIL != Types.integerp(var65) : var65;
        SubLObject var78 = (SubLObject)NIL;
        SubLObject var79 = (SubLObject)NIL;
        SubLObject var80 = (SubLObject)NIL;
        var78 = var77;
        var79 = var78.first();
        for (var80 = (SubLObject)ZERO_INTEGER; NIL != var78; var78 = var78.rest(), var79 = var78.first(), var80 = Numbers.add((SubLObject)ONE_INTEGER, var80)) {
            final SubLObject var81 = Numbers.add(var65, var80);
            SubLObject var83;
            final SubLObject var82 = var83 = var79;
            SubLObject var84 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var83, var82, (SubLObject)$ic89$);
            var84 = var83.first();
            var83 = var83.rest();
            final SubLObject var85 = (SubLObject)(var83.isCons() ? var83.first() : $ic90$);
            cdestructuring_bind.destructuring_bind_must_listp(var83, var82, (SubLObject)$ic89$);
            var83 = var83.rest();
            if (NIL == var83) {
                f29355(var38, var81, var61, var85, var84, var33, var35);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var82, (SubLObject)$ic89$);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29357(SubLObject var108, SubLObject var2, SubLObject var109, SubLObject var110) {
        if (var108 == UNPROVIDED) {
            var108 = (SubLObject)$ic91$;
        }
        if (var2 == UNPROVIDED) {
            var2 = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (var109 == UNPROVIDED) {
            var109 = module0029.$g835$.getDynamicValue();
        }
        if (var110 == UNPROVIDED) {
            var110 = (SubLObject)NIL;
        }
        assert NIL != module0029.f1474(var108) : var108;
        return module0029.f1577(var2, (SubLObject)$ic93$, (SubLObject)NIL, var108, var109, (SubLObject)NIL, var110, (SubLObject)$ic94$, (SubLObject)NIL, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f29358(final SubLObject var14, SubLObject var108, SubLObject var2, SubLObject var111) {
        if (var108 == UNPROVIDED) {
            var108 = (SubLObject)$ic91$;
        }
        if (var2 == UNPROVIDED) {
            var2 = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (var111 == UNPROVIDED) {
            var111 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var14) : var14;
        assert NIL != module0029.f1474(var108) : var108;
        SubLObject var112 = (SubLObject)NIL;
        SubLObject var113 = f29333(var14);
        SubLObject var114 = (SubLObject)NIL;
        var114 = var113.first();
        while (NIL != var113) {
            final SubLObject var115 = f29359(var114, var108, var2, var111);
            var112 = (SubLObject)ConsesLow.cons(var115, var112);
            var113 = var113.rest();
            var114 = var113.first();
        }
        return Sequences.nreverse(var112);
    }
    
    public static SubLObject f29360(final SubLObject var14, final SubLObject var25, SubLObject var108, SubLObject var2, SubLObject var111) {
        if (var108 == UNPROVIDED) {
            var108 = (SubLObject)$ic91$;
        }
        if (var2 == UNPROVIDED) {
            var2 = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (var111 == UNPROVIDED) {
            var111 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var14) : var14;
        assert NIL != Types.integerp(var25) : var25;
        SubLObject var112 = f29333(var14);
        SubLObject var113 = (SubLObject)NIL;
        var113 = var112.first();
        while (NIL != var112) {
            if (var25.numE(f29319(var113))) {
                return f29359(var113, var108, var2, var111);
            }
            var112 = var112.rest();
            var113 = var112.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29361(final SubLObject var14, final SubLObject var25, SubLObject var108, SubLObject var2) {
        if (var108 == UNPROVIDED) {
            var108 = (SubLObject)$ic91$;
        }
        if (var2 == UNPROVIDED) {
            var2 = StreamsLow.$standard_output$.getDynamicValue();
        }
        return f29360(var14, var25, var108, var2, (SubLObject)T);
    }
    
    public static SubLObject f29359(final SubLObject var16, SubLObject var108, SubLObject var2, SubLObject var111) {
        if (var108 == UNPROVIDED) {
            var108 = (SubLObject)$ic91$;
        }
        if (var2 == UNPROVIDED) {
            var2 = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (var111 == UNPROVIDED) {
            var111 = (SubLObject)NIL;
        }
        final SubLThread var112 = SubLProcess.currentSubLThread();
        assert NIL != f29317(var16) : var16;
        assert NIL != module0029.f1474(var108) : var108;
        final SubLObject var113 = f29335(var16);
        SubLObject var114 = (SubLObject)NIL;
        SubLObject var115 = (SubLObject)NIL;
        if (NIL == f29362(var16)) {
            var115 = (SubLObject)$ic95$;
        }
        else if (NIL != f29342(var16)) {
            var115 = (SubLObject)$ic96$;
        }
        else {
            final SubLObject var116 = f29320(var16);
            final SubLObject var117 = print_high.$print_pretty$.currentBinding(var112);
            try {
                print_high.$print_pretty$.bind((SubLObject)NIL, var112);
                f29363(var16, var108, var2);
                var112.resetMultipleValues();
                final SubLObject var118_119 = f29364(var116, var111);
                final SubLObject var120_121 = var112.secondMultipleValue();
                var112.resetMultipleValues();
                var115 = var118_119;
                var114 = var120_121;
                f29365(var16, var115, var114, var108, var2);
            }
            finally {
                print_high.$print_pretty$.rebind(var117, var112);
            }
        }
        final SubLObject var118 = module0029.f1535((SubLObject)$ic94$, var113, var115, var114);
        return var118;
    }
    
    public static SubLObject f29362(final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        final SubLObject var18 = f29321(var16);
        if (NIL == module0421.f29447(var18, module0029.$g835$.getDynamicValue(var17))) {
            return (SubLObject)NIL;
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f29364(final SubLObject var26, final SubLObject var111) {
        final SubLThread var112 = SubLProcess.currentSubLThread();
        SubLObject var113 = (SubLObject)$ic97$;
        SubLObject var114 = (SubLObject)NIL;
        SubLObject var115 = (SubLObject)NIL;
        try {
            var112.throwStack.push($ic98$);
            final SubLObject var116 = Errors.$error_handler$.currentBinding(var112);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)$ic99$), var112);
                try {
                    var112.resetMultipleValues();
                    final SubLObject var117 = f29366(var26, $ic59$);
                    final SubLObject var118 = var112.secondMultipleValue();
                    final SubLObject var119 = var112.thirdMultipleValue();
                    var112.resetMultipleValues();
                    var114 = var119;
                    if (NIL == var117) {
                        var113 = (SubLObject)$ic100$;
                    }
                    else {
                        var113 = (SubLObject)$ic101$;
                    }
                    if (NIL == var111) {
                        inference_datastructures_inference_oc.f25476(var118);
                    }
                }
                catch (Throwable var120) {
                    Errors.handleThrowable(var120, (SubLObject)NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var116, var112);
            }
        }
        catch (Throwable var121) {
            var115 = Errors.handleThrowable(var121, (SubLObject)$ic98$);
        }
        finally {
            var112.throwStack.pop();
        }
        return Values.values(var113, var114);
    }
    
    public static SubLObject f29366(SubLObject var26, SubLObject var61) {
        if (var61 == UNPROVIDED) {
            var61 = (SubLObject)NIL;
        }
        final SubLThread var62 = SubLProcess.currentSubLThread();
        var62.resetMultipleValues();
        final SubLObject var129_130 = module0279.f18576(var26, var61);
        final SubLObject var131_132 = var62.secondMultipleValue();
        var62.resetMultipleValues();
        var26 = var129_130;
        var61 = var131_132;
        final SubLObject var63 = module0408.f28423(var26);
        final SubLObject var64 = (SubLObject)ConsesLow.list((SubLObject)$ic102$, (SubLObject)NIL, (SubLObject)$ic103$, (SubLObject)T, (SubLObject)$ic104$, var63);
        SubLObject var65 = (SubLObject)NIL;
        SubLObject var66 = (SubLObject)NIL;
        SubLObject var67 = (SubLObject)NIL;
        SubLObject var68 = (SubLObject)NIL;
        final SubLObject var69 = Time.get_internal_real_time();
        var62.resetMultipleValues();
        final SubLObject var137_138 = module0409.f28506(var26, var61, var64);
        final SubLObject var139_140 = var62.secondMultipleValue();
        final SubLObject var141_142 = var62.thirdMultipleValue();
        var62.resetMultipleValues();
        var66 = var137_138;
        var67 = var139_140;
        var68 = var141_142;
        var65 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var69), time_high.$internal_time_units_per_second$.getGlobalValue());
        return Values.values(var66, var68, var65);
    }
    
    public static SubLObject f29363(final SubLObject var16, final SubLObject var108, final SubLObject var2) {
        if (var108.eql((SubLObject)$ic91$)) {
            final SubLObject var109 = f29318(var16);
            final SubLObject var110 = f29319(var16);
            PrintLow.format(var2, (SubLObject)$ic105$, var109, var110);
            streams_high.force_output(var2);
        }
        else if (!var108.eql((SubLObject)$ic106$)) {
            PrintLow.format(var2, (SubLObject)$ic107$, var108);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29365(final SubLObject var16, final SubLObject var58, final SubLObject var116, final SubLObject var108, final SubLObject var2) {
        if (var108.eql((SubLObject)$ic91$)) {
            PrintLow.format(var2, (SubLObject)$ic108$, var58, var116);
            streams_high.force_output(var2);
        }
        else if (var108.eql((SubLObject)$ic106$)) {
            final SubLObject var117 = f29318(var16);
            final SubLObject var118 = f29319(var16);
            final SubLObject var119 = f29322(var16);
            PrintLow.format(var2, (SubLObject)$ic109$, new SubLObject[] { var58, var117, var118, var116, var119 });
            streams_high.force_output(var2);
        }
        else {
            PrintLow.format(var2, (SubLObject)$ic107$, var108);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29367() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0419", "f29316", "S#32484", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0419", "f29317", "S#2626", 1, 0, false);
        new $f29317$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0419", "f29318", "S#32485", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0419", "f29319", "S#32483", 1, 0, false);
        new $f29319$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0419", "f29320", "S#32486", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0419", "f29321", "S#32487", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0419", "f29322", "S#32488", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0419", "f29323", "S#32489", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0419", "f29324", "S#32490", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0419", "f29325", "S#32491", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0419", "f29326", "S#32492", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0419", "f29327", "S#32493", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0419", "f29328", "S#32494", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0419", "f29329", "S#32495", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0419", "f29330", "S#32496", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0419", "f29331", "S#32497", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0419", "f29332", "S#32498", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0419", "f29333", "S#32499", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0419", "f29334", "S#32500", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0419", "f29335", "S#2633", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0419", "f29336", "S#2647", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0419", "f29337", "S#2661", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0419", "f29338", "S#32501", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0419", "f29339", "S#32502", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0419", "f29340", "S#2640", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0419", "f29341", "S#2654", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0419", "f29342", "S#2669", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0419", "f29343", "S#2676", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0419", "f29344", "S#32503", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0419", "f29345", "S#32504", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0419", "f29346", "DEFINE-EVALUATABLE-FUNCTION-TEST");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0419", "f29347", "DEFINE-EVALUATABLE-PREDICATE-TEST");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0419", "f29348", "S#32505", 5, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0419", "f29349", "S#32506");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0419", "f29350", "DEFINE-SIMPLE-EVALUATABLE-FUNCTION-TEST-BLOCK");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0419", "f29351", "S#32507", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0419", "f29352", "S#32508", 7, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0419", "f29353", "S#32509");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0419", "f29354", "DEFINE-SIMPLE-EVALUATABLE-PREDICATE-TEST-BLOCK");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0419", "f29355", "S#32510", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0419", "f29356", "S#32511", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0419", "f29357", "RUN-ALL-EVALUATABLE-RELATION-TESTS", 0, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0419", "f29358", "RUN-EVALUATABLE-RELATION-TESTS", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0419", "f29360", "S#32512", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0419", "f29361", "S#32513", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0419", "f29359", "S#9334", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0419", "f29362", "S#32514", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0419", "f29364", "S#32515", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0419", "f29366", "S#32516", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0419", "f29363", "S#32517", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0419", "f29365", "S#32518", 5, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29368() {
        $g3413$ = SubLFiles.defconstant("S#32519", (SubLObject)$ic0$);
        $g3414$ = SubLFiles.deflexical("S#32520", (NIL != Symbols.boundp((SubLObject)$ic30$)) ? $g3414$.getGlobalValue() : Hashtables.make_hash_table((SubLObject)$ic31$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29369() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g3413$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic7$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic8$);
        Structures.def_csetf((SubLObject)$ic9$, (SubLObject)$ic10$);
        Structures.def_csetf((SubLObject)$ic11$, (SubLObject)$ic12$);
        Structures.def_csetf((SubLObject)$ic13$, (SubLObject)$ic14$);
        Structures.def_csetf((SubLObject)$ic15$, (SubLObject)$ic16$);
        Structures.def_csetf((SubLObject)$ic17$, (SubLObject)$ic18$);
        Equality.identity((SubLObject)$ic0$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g3413$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic29$));
        module0003.f57((SubLObject)$ic30$);
        module0001.f5((SubLObject)$ic41$, (SubLObject)$ic42$);
        module0001.f5((SubLObject)$ic44$, (SubLObject)$ic45$);
        module0001.f5((SubLObject)$ic56$, (SubLObject)$ic42$);
        module0001.f5((SubLObject)$ic63$, (SubLObject)$ic64$);
        module0002.f50((SubLObject)$ic55$, (SubLObject)$ic56$);
        module0002.f50((SubLObject)$ic62$, (SubLObject)$ic63$);
        module0001.f5((SubLObject)$ic81$, (SubLObject)$ic45$);
        module0001.f5((SubLObject)$ic85$, (SubLObject)$ic86$);
        module0002.f50((SubLObject)$ic80$, (SubLObject)$ic81$);
        module0002.f50((SubLObject)$ic84$, (SubLObject)$ic85$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f29367();
    }
    
    public void initializeVariables() {
        f29368();
    }
    
    public void runTopLevelForms() {
        f29369();
    }
    
    static {
        me = (SubLFile)new module0419();
        $g3413$ = null;
        $g3414$ = null;
        $ic0$ = makeSymbol("S#32482", "CYC");
        $ic1$ = makeSymbol("S#2626", "CYC");
        $ic2$ = ConsesLow.list((SubLObject)makeSymbol("S#17572", "CYC"), (SubLObject)makeSymbol("S#1519", "CYC"), (SubLObject)makeSymbol("S#14349", "CYC"), (SubLObject)makeSymbol("S#2607", "CYC"), (SubLObject)makeSymbol("S#2605", "CYC"));
        $ic3$ = ConsesLow.list((SubLObject)makeKeyword("RELATION"), (SubLObject)makeKeyword("ID"), (SubLObject)makeKeyword("SENTENCE"), (SubLObject)makeKeyword("KB"), (SubLObject)makeKeyword("OWNER"));
        $ic4$ = ConsesLow.list((SubLObject)makeSymbol("S#32485", "CYC"), (SubLObject)makeSymbol("S#32483", "CYC"), (SubLObject)makeSymbol("S#32486", "CYC"), (SubLObject)makeSymbol("S#32487", "CYC"), (SubLObject)makeSymbol("S#32488", "CYC"));
        $ic5$ = ConsesLow.list((SubLObject)makeSymbol("S#32489", "CYC"), (SubLObject)makeSymbol("S#32490", "CYC"), (SubLObject)makeSymbol("S#32491", "CYC"), (SubLObject)makeSymbol("S#32492", "CYC"), (SubLObject)makeSymbol("S#32493", "CYC"));
        $ic6$ = makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $ic7$ = makeSymbol("S#32484", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#2626", "CYC"));
        $ic9$ = makeSymbol("S#32485", "CYC");
        $ic10$ = makeSymbol("S#32489", "CYC");
        $ic11$ = makeSymbol("S#32483", "CYC");
        $ic12$ = makeSymbol("S#32490", "CYC");
        $ic13$ = makeSymbol("S#32486", "CYC");
        $ic14$ = makeSymbol("S#32491", "CYC");
        $ic15$ = makeSymbol("S#32487", "CYC");
        $ic16$ = makeSymbol("S#32492", "CYC");
        $ic17$ = makeSymbol("S#32488", "CYC");
        $ic18$ = makeSymbol("S#32493", "CYC");
        $ic19$ = makeKeyword("RELATION");
        $ic20$ = makeKeyword("ID");
        $ic21$ = makeKeyword("SENTENCE");
        $ic22$ = makeKeyword("KB");
        $ic23$ = makeKeyword("OWNER");
        $ic24$ = makeString("Invalid slot ~S for construction function");
        $ic25$ = makeKeyword("BEGIN");
        $ic26$ = makeSymbol("S#32494", "CYC");
        $ic27$ = makeKeyword("SLOT");
        $ic28$ = makeKeyword("END");
        $ic29$ = makeSymbol("S#32496", "CYC");
        $ic30$ = makeSymbol("S#32520", "CYC");
        $ic31$ = makeInteger(100);
        $ic32$ = makeSymbol("FORT-P");
        $ic33$ = makeSymbol("<");
        $ic34$ = makeString("");
        $ic35$ = makeSymbol("S#2609", "CYC");
        $ic36$ = ConsesLow.list((SubLObject)makeSymbol("FUNCTION"), (SubLObject)makeSymbol("S#1519", "CYC"), (SubLObject)makeSymbol("S#14349", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#2607", "CYC"), (SubLObject)makeKeyword("FULL")), (SubLObject)makeSymbol("S#2605", "CYC"));
        $ic37$ = ConsesLow.list((SubLObject)makeKeyword("KB"), (SubLObject)makeKeyword("OWNER"));
        $ic38$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic39$ = makeKeyword("FULL");
        $ic40$ = makeSymbol("S#32505", "CYC");
        $ic41$ = makeSymbol("DEFINE-EVALUATABLE-FUNCTION-TEST");
        $ic42$ = ConsesLow.list((SubLObject)makeSymbol("FUNCTION"), (SubLObject)makeSymbol("S#1519", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic43$ = ConsesLow.list((SubLObject)makeSymbol("S#717", "CYC"), (SubLObject)makeSymbol("S#1519", "CYC"), (SubLObject)makeSymbol("S#14349", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#2607", "CYC"), (SubLObject)makeKeyword("FULL")), (SubLObject)makeSymbol("S#2605", "CYC"));
        $ic44$ = makeSymbol("DEFINE-EVALUATABLE-PREDICATE-TEST");
        $ic45$ = ConsesLow.list((SubLObject)makeSymbol("S#717", "CYC"), (SubLObject)makeSymbol("S#1519", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic46$ = makeSymbol("INTEGERP");
        $ic47$ = makeSymbol("S#13920", "CYC");
        $ic48$ = makeSymbol("S#2526", "CYC");
        $ic49$ = makeSymbol("S#32272", "CYC");
        $ic50$ = ConsesLow.list((SubLObject)makeSymbol("FUNCTION"), (SubLObject)makeSymbol("S#1519", "CYC"), (SubLObject)makeSymbol("S#63", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#3267", "CYC"), (SubLObject)makeKeyword("DONT-CARE")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#2607", "CYC"), (SubLObject)makeKeyword("FULL")), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#2605", "CYC"));
        $ic51$ = ConsesLow.list((SubLObject)makeKeyword("RESULT"), (SubLObject)makeKeyword("KB"), (SubLObject)makeKeyword("MT"), (SubLObject)makeKeyword("OWNER"));
        $ic52$ = makeKeyword("RESULT");
        $ic53$ = makeKeyword("DONT-CARE");
        $ic54$ = makeKeyword("MT");
        $ic55$ = makeSymbol("S#32507", "CYC");
        $ic56$ = makeSymbol("S#32506", "CYC");
        $ic57$ = ConsesLow.list((SubLObject)makeSymbol("FUNCTION"), (SubLObject)makeSymbol("S#32521", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11445", "CYC"), constant_handles_oc.f8479((SubLObject)makeString("InferencePSC"))), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#2607", "CYC"), (SubLObject)makeKeyword("FULL")), (SubLObject)makeSymbol("S#32522", "CYC"), (SubLObject)makeSymbol("S#2605", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#2608", "CYC"), (SubLObject)T));
        $ic58$ = ConsesLow.list((SubLObject)makeKeyword("MT"), (SubLObject)makeKeyword("KB"), (SubLObject)makeKeyword("TESTS"), (SubLObject)makeKeyword("OWNER"), (SubLObject)makeKeyword("WORKING?"));
        $ic59$ = constant_handles_oc.f8479((SubLObject)makeString("InferencePSC"));
        $ic60$ = makeKeyword("TESTS");
        $ic61$ = makeKeyword("WORKING?");
        $ic62$ = makeSymbol("S#32508", "CYC");
        $ic63$ = makeSymbol("DEFINE-SIMPLE-EVALUATABLE-FUNCTION-TEST-BLOCK");
        $ic64$ = ConsesLow.list((SubLObject)makeSymbol("FUNCTION"), (SubLObject)makeSymbol("S#32521", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic65$ = makeKeyword("ILL-FORMED");
        $ic66$ = constant_handles_oc.f8479((SubLObject)makeString("trueSubL"));
        $ic67$ = constant_handles_oc.f8479((SubLObject)makeString("SubLQuoteFn"));
        $ic68$ = makeSymbol("CNOT");
        $ic69$ = makeSymbol("EL-WFF?");
        $ic70$ = makeSymbol("QUOTE");
        $ic71$ = constant_handles_oc.f8479((SubLObject)makeString("evaluate"));
        $ic72$ = makeSymbol("?RESULT");
        $ic73$ = makeKeyword("UNEVALUATABLE");
        $ic74$ = constant_handles_oc.f8479((SubLObject)makeString("unknownSentence"));
        $ic75$ = constant_handles_oc.f8479((SubLObject)makeString("thereExists"));
        $ic76$ = constant_handles_oc.f8479((SubLObject)makeString("ist"));
        $ic77$ = ConsesLow.list((SubLObject)makeSymbol("S#63", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#3267", "CYC"), (SubLObject)makeKeyword("DONT-CARE")));
        $ic78$ = ConsesLow.list((SubLObject)makeSymbol("S#717", "CYC"), (SubLObject)makeSymbol("S#1519", "CYC"), (SubLObject)makeSymbol("S#14349", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#3267", "CYC"), (SubLObject)makeKeyword("DONT-CARE")), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#2607", "CYC"), (SubLObject)makeKeyword("FULL")), (SubLObject)makeSymbol("S#2605", "CYC"));
        $ic79$ = ConsesLow.list((SubLObject)makeKeyword("RESULT"), (SubLObject)makeKeyword("MT"), (SubLObject)makeKeyword("KB"), (SubLObject)makeKeyword("OWNER"));
        $ic80$ = makeSymbol("S#32510", "CYC");
        $ic81$ = makeSymbol("S#32509", "CYC");
        $ic82$ = ConsesLow.list((SubLObject)makeSymbol("S#717", "CYC"), (SubLObject)makeSymbol("S#32521", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11445", "CYC"), constant_handles_oc.f8479((SubLObject)makeString("InferencePSC"))), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#2607", "CYC"), (SubLObject)makeKeyword("FULL")), (SubLObject)makeSymbol("S#2605", "CYC"), (SubLObject)makeSymbol("S#32522", "CYC"));
        $ic83$ = ConsesLow.list((SubLObject)makeKeyword("MT"), (SubLObject)makeKeyword("KB"), (SubLObject)makeKeyword("OWNER"), (SubLObject)makeKeyword("TESTS"));
        $ic84$ = makeSymbol("S#32511", "CYC");
        $ic85$ = makeSymbol("DEFINE-SIMPLE-EVALUATABLE-PREDICATE-TEST-BLOCK");
        $ic86$ = ConsesLow.list((SubLObject)makeSymbol("S#717", "CYC"), (SubLObject)makeSymbol("S#32521", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic87$ = constant_handles_oc.f8479((SubLObject)makeString("and"));
        $ic88$ = makeKeyword("FALSE");
        $ic89$ = ConsesLow.list((SubLObject)makeSymbol("S#14349", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#3267", "CYC"), (SubLObject)makeKeyword("TRUE")));
        $ic90$ = makeKeyword("TRUE");
        $ic91$ = makeKeyword("STANDARD");
        $ic92$ = makeSymbol("S#2688", "CYC");
        $ic93$ = makeKeyword("TERSE");
        $ic94$ = makeKeyword("ERT");
        $ic95$ = makeKeyword("NOT-RUN");
        $ic96$ = makeKeyword("INVALID");
        $ic97$ = makeKeyword("ERROR");
        $ic98$ = makeKeyword("IGNORE-ERRORS-TARGET");
        $ic99$ = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $ic100$ = makeKeyword("FAILURE");
        $ic101$ = makeKeyword("SUCCESS");
        $ic102$ = makeKeyword("CACHE-INFERENCE-RESULTS?");
        $ic103$ = makeKeyword("BROWSABLE?");
        $ic104$ = makeKeyword("CONDITIONAL-SENTENCE?");
        $ic105$ = makeString("~&:ERT ~S ~S -> ");
        $ic106$ = makeKeyword("POST-BUILD");
        $ic107$ = makeString("Unknown output format ~A");
        $ic108$ = makeString(":ERT ~S (~,3f)~%");
        $ic109$ = makeString("~S :ERT (~S ~S) (~,3f) :OWNER ~S~%");
    }
    
    public static final class $sX32482_native extends SubLStructNative
    {
        public SubLObject $relation;
        public SubLObject $id;
        public SubLObject $sentence;
        public SubLObject $kb;
        public SubLObject $owner;
        public static final SubLStructDeclNative structDecl;
        
        public $sX32482_native() {
            this.$relation = (SubLObject)CommonSymbols.NIL;
            this.$id = (SubLObject)CommonSymbols.NIL;
            this.$sentence = (SubLObject)CommonSymbols.NIL;
            this.$kb = (SubLObject)CommonSymbols.NIL;
            this.$owner = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SstructDecl;
        }
        
        public SubLObject getField2() {
            return this.$relation;
        }
        
        public SubLObject getField3() {
            return this.$id;
        }
        
        public SubLObject getField4() {
            return this.$sentence;
        }
        
        public SubLObject getField5() {
            return this.$kb;
        }
        
        public SubLObject getField6() {
            return this.$owner;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$relation = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$id = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$sentence = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$kb = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$owner = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX32482_native.class, $ic0$, $ic1$, $ic2$, $ic3$, new String[] { "$relation", "$id", "$sentence", "$kb", "$owner" }, $ic4$, $ic5$, $ic6$);
        }
    }
    
    public static final class $f29317$UnaryFunction extends UnaryFunction
    {
        public $f29317$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#2626"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f29317(var3);
        }
    }
    
    public static final class $f29319$UnaryFunction extends UnaryFunction
    {
        public $f29319$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#32483"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f29319(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 347 ms
	
	Decompiled with Procyon 0.5.32.
*/
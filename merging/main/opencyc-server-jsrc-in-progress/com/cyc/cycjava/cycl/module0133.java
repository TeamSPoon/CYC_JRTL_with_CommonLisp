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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0133 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0133";
    public static final String myFingerPrint = "40c7abd69cdf1a1d71b89bd6de3c3bd9e875a311bba89a42f32c4c8b6855e3d7";
    public static SubLSymbol $g1578$;
    private static SubLSymbol $g1579$;
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
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLString $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLString $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLString $ic69$;
    private static final SubLString $ic70$;
    private static final SubLString $ic71$;
    private static final SubLString $ic72$;
    private static final SubLString $ic73$;
    private static final SubLString $ic74$;
    private static final SubLString $ic75$;
    private static final SubLString $ic76$;
    private static final SubLString $ic77$;
    private static final SubLString $ic78$;
    private static final SubLString $ic79$;
    private static final SubLString $ic80$;
    private static final SubLString $ic81$;
    private static final SubLString $ic82$;
    private static final SubLString $ic83$;
    private static final SubLString $ic84$;
    private static final SubLString $ic85$;
    private static final SubLString $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLList $ic94$;
    private static final SubLList $ic95$;
    private static final SubLList $ic96$;
    private static final SubLSymbol $ic97$;
    private static final SubLList $ic98$;
    private static final SubLSymbol $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLInteger $ic102$;
    private static final SubLSymbol $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLList $ic106$;
    private static final SubLList $ic107$;
    private static final SubLList $ic108$;
    private static final SubLList $ic109$;
    private static final SubLList $ic110$;
    private static final SubLSymbol $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLSymbol $ic113$;
    private static final SubLSymbol $ic114$;
    
    public static SubLObject f8609(final SubLObject var1, final SubLObject var2) {
        f8610(var1, var2, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8611(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX10762_native.class) ? T : NIL);
    }
    
    public static SubLObject f8612(final SubLObject var1) {
        assert NIL != f8611(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f8613(final SubLObject var1) {
        assert NIL != f8611(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f8614(final SubLObject var1) {
        assert NIL != f8611(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f8615(final SubLObject var1) {
        assert NIL != f8611(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f8616(final SubLObject var1) {
        assert NIL != f8611(var1) : var1;
        return var1.getField6();
    }
    
    public static SubLObject f8617(final SubLObject var1) {
        assert NIL != f8611(var1) : var1;
        return var1.getField7();
    }
    
    public static SubLObject f8618(final SubLObject var1) {
        assert NIL != f8611(var1) : var1;
        return var1.getField8();
    }
    
    public static SubLObject f8619(final SubLObject var1) {
        assert NIL != f8611(var1) : var1;
        return var1.getField9();
    }
    
    public static SubLObject f8620(final SubLObject var1) {
        assert NIL != f8611(var1) : var1;
        return var1.getField10();
    }
    
    public static SubLObject f8621(final SubLObject var1) {
        assert NIL != f8611(var1) : var1;
        return var1.getField11();
    }
    
    public static SubLObject f8622(final SubLObject var1) {
        assert NIL != f8611(var1) : var1;
        return var1.getField12();
    }
    
    public static SubLObject f8623(final SubLObject var1) {
        assert NIL != f8611(var1) : var1;
        return var1.getField13();
    }
    
    public static SubLObject f8624(final SubLObject var1) {
        assert NIL != f8611(var1) : var1;
        return var1.getField14();
    }
    
    public static SubLObject f8625(final SubLObject var1) {
        assert NIL != f8611(var1) : var1;
        return var1.getField15();
    }
    
    public static SubLObject f8626(final SubLObject var1) {
        assert NIL != f8611(var1) : var1;
        return var1.getField16();
    }
    
    public static SubLObject f8627(final SubLObject var1) {
        assert NIL != f8611(var1) : var1;
        return var1.getField17();
    }
    
    public static SubLObject f8628(final SubLObject var1) {
        assert NIL != f8611(var1) : var1;
        return var1.getField18();
    }
    
    public static SubLObject f8629(final SubLObject var1, final SubLObject var4) {
        assert NIL != f8611(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f8630(final SubLObject var1, final SubLObject var4) {
        assert NIL != f8611(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f8631(final SubLObject var1, final SubLObject var4) {
        assert NIL != f8611(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f8632(final SubLObject var1, final SubLObject var4) {
        assert NIL != f8611(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f8633(final SubLObject var1, final SubLObject var4) {
        assert NIL != f8611(var1) : var1;
        return var1.setField6(var4);
    }
    
    public static SubLObject f8634(final SubLObject var1, final SubLObject var4) {
        assert NIL != f8611(var1) : var1;
        return var1.setField7(var4);
    }
    
    public static SubLObject f8635(final SubLObject var1, final SubLObject var4) {
        assert NIL != f8611(var1) : var1;
        return var1.setField8(var4);
    }
    
    public static SubLObject f8636(final SubLObject var1, final SubLObject var4) {
        assert NIL != f8611(var1) : var1;
        return var1.setField9(var4);
    }
    
    public static SubLObject f8637(final SubLObject var1, final SubLObject var4) {
        assert NIL != f8611(var1) : var1;
        return var1.setField10(var4);
    }
    
    public static SubLObject f8638(final SubLObject var1, final SubLObject var4) {
        assert NIL != f8611(var1) : var1;
        return var1.setField11(var4);
    }
    
    public static SubLObject f8639(final SubLObject var1, final SubLObject var4) {
        assert NIL != f8611(var1) : var1;
        return var1.setField12(var4);
    }
    
    public static SubLObject f8640(final SubLObject var1, final SubLObject var4) {
        assert NIL != f8611(var1) : var1;
        return var1.setField13(var4);
    }
    
    public static SubLObject f8641(final SubLObject var1, final SubLObject var4) {
        assert NIL != f8611(var1) : var1;
        return var1.setField14(var4);
    }
    
    public static SubLObject f8642(final SubLObject var1, final SubLObject var4) {
        assert NIL != f8611(var1) : var1;
        return var1.setField15(var4);
    }
    
    public static SubLObject f8643(final SubLObject var1, final SubLObject var4) {
        assert NIL != f8611(var1) : var1;
        return var1.setField16(var4);
    }
    
    public static SubLObject f8644(final SubLObject var1, final SubLObject var4) {
        assert NIL != f8611(var1) : var1;
        return var1.setField17(var4);
    }
    
    public static SubLObject f8645(final SubLObject var1, final SubLObject var4) {
        assert NIL != f8611(var1) : var1;
        return var1.setField18(var4);
    }
    
    public static SubLObject f8646(SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX10762_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)NIL, var7 = var5; NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)$ic43$)) {
                f8629(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic44$)) {
                f8630(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic45$)) {
                f8631(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic46$)) {
                f8632(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic47$)) {
                f8633(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic48$)) {
                f8634(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic49$)) {
                f8635(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic50$)) {
                f8636(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic51$)) {
                f8637(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic52$)) {
                f8638(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic53$)) {
                f8639(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic54$)) {
                f8640(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic55$)) {
                f8641(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic56$)) {
                f8642(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic57$)) {
                f8643(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic58$)) {
                f8644(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic59$)) {
                f8645(var6, var9);
            }
            else {
                Errors.error((SubLObject)$ic60$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f8647(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)$ic61$, (SubLObject)$ic62$, (SubLObject)SEVENTEEN_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)$ic63$, (SubLObject)$ic43$, f8612(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic63$, (SubLObject)$ic44$, f8613(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic63$, (SubLObject)$ic45$, f8614(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic63$, (SubLObject)$ic46$, f8615(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic63$, (SubLObject)$ic47$, f8616(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic63$, (SubLObject)$ic48$, f8617(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic63$, (SubLObject)$ic49$, f8618(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic63$, (SubLObject)$ic50$, f8619(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic63$, (SubLObject)$ic51$, f8620(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic63$, (SubLObject)$ic52$, f8621(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic63$, (SubLObject)$ic53$, f8622(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic63$, (SubLObject)$ic54$, f8623(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic63$, (SubLObject)$ic55$, f8624(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic63$, (SubLObject)$ic56$, f8625(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic63$, (SubLObject)$ic57$, f8626(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic63$, (SubLObject)$ic58$, f8627(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic63$, (SubLObject)$ic59$, f8628(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic64$, (SubLObject)$ic62$, (SubLObject)SEVENTEEN_INTEGER);
        return var11;
    }
    
    public static SubLObject f8648(final SubLObject var11, final SubLObject var12) {
        return f8647(var11, var12);
    }
    
    public static SubLObject f8610(final SubLObject var13, final SubLObject var2, final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        if (NIL != print_high.$print_readably$.getDynamicValue(var15)) {
            print_high.print_not_readable(var13, var2);
        }
        else {
            streams_high.write_string((SubLObject)$ic66$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            PrintLow.write((SubLObject)Types.type_of(var13), new SubLObject[] { $ic67$, var2 });
            streams_high.write_char((SubLObject)Characters.CHAR_space, var2);
            PrintLow.write(Equality.pointer(var13), new SubLObject[] { $ic67$, var2, $ic68$, SIXTEEN_INTEGER });
            streams_high.write_char((SubLObject)Characters.CHAR_greater, var2);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8649(final SubLObject var13) {
        PrintLow.format((SubLObject)T, (SubLObject)$ic69$, var13);
        PrintLow.format((SubLObject)T, (SubLObject)$ic70$, f8612(var13));
        PrintLow.format((SubLObject)T, (SubLObject)$ic71$, f8613(var13));
        PrintLow.format((SubLObject)T, (SubLObject)$ic72$, f8614(var13));
        PrintLow.format((SubLObject)T, (SubLObject)$ic73$, f8615(var13));
        PrintLow.format((SubLObject)T, (SubLObject)$ic74$, f8616(var13));
        PrintLow.format((SubLObject)T, (SubLObject)$ic75$, f8617(var13));
        PrintLow.format((SubLObject)T, (SubLObject)$ic76$, f8618(var13));
        PrintLow.format((SubLObject)T, (SubLObject)$ic77$, f8619(var13));
        PrintLow.format((SubLObject)T, (SubLObject)$ic78$, f8620(var13));
        PrintLow.format((SubLObject)T, (SubLObject)$ic79$, f8621(var13));
        PrintLow.format((SubLObject)T, (SubLObject)$ic80$, f8622(var13));
        PrintLow.format((SubLObject)T, (SubLObject)$ic81$, f8623(var13));
        PrintLow.format((SubLObject)T, (SubLObject)$ic82$, f8624(var13));
        PrintLow.format((SubLObject)T, (SubLObject)$ic83$, f8625(var13));
        PrintLow.format((SubLObject)T, (SubLObject)$ic84$, f8626(var13));
        PrintLow.format((SubLObject)T, (SubLObject)$ic85$, f8627(var13));
        PrintLow.format((SubLObject)T, (SubLObject)$ic86$, f8628(var13));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8650(final SubLObject var20) {
        final SubLObject var21 = f8646((SubLObject)UNPROVIDED);
        SubLObject var22;
        SubLObject var23;
        SubLObject var24;
        for (var22 = (SubLObject)NIL, var22 = var20; NIL != var22; var22 = conses_high.cddr(var22)) {
            var23 = var22.first();
            var24 = conses_high.cadr(var22);
            f8651(var21, var23, var24);
        }
        f8652(var21);
        f8653(var21, (SubLObject)NIL);
        return var21;
    }
    
    public static SubLObject f8654(final SubLObject var25) {
        f8629(var25, (SubLObject)$ic87$);
        f8634(var25, (SubLObject)$ic87$);
        f8644(var25, (SubLObject)$ic87$);
        f8645(var25, (SubLObject)$ic87$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8655(final SubLObject var26) {
        return f8613(var26);
    }
    
    public static SubLObject f8656(final SubLObject var26) {
        return f8612(var26);
    }
    
    public static SubLObject f8657(final SubLObject var26) {
        return f8614(var26);
    }
    
    public static SubLObject f8658(final SubLObject var26) {
        return f8616(var26);
    }
    
    public static SubLObject f8659(final SubLObject var26) {
        return f8617(var26);
    }
    
    public static SubLObject f8660(final SubLObject var26) {
        return f8619(var26);
    }
    
    public static SubLObject f8661(final SubLObject var26) {
        return f8618(var26);
    }
    
    public static SubLObject f8662(final SubLObject var26) {
        return f8621(var26);
    }
    
    public static SubLObject f8663(final SubLObject var26) {
        return f8623(var26);
    }
    
    public static SubLObject f8664(final SubLObject var26) {
        return f8624(var26);
    }
    
    public static SubLObject f8665(final SubLObject var26) {
        return f8615(var26);
    }
    
    public static SubLObject f8666(final SubLObject var26) {
        return f8625(var26);
    }
    
    public static SubLObject f8667(final SubLObject var26) {
        return f8627(var26);
    }
    
    public static SubLObject f8668(final SubLObject var26) {
        return Equality.eq(f8657(var26), (SubLObject)$ic88$);
    }
    
    public static SubLObject f8669(final SubLObject var26) {
        return Equality.eq(f8657(var26), (SubLObject)$ic89$);
    }
    
    public static SubLObject f8670(final SubLObject var26) {
        return Equality.eq(f8657(var26), (SubLObject)$ic90$);
    }
    
    public static SubLObject f8671(final SubLObject var26) {
        return Equality.eq(f8658(var26), (SubLObject)$ic91$);
    }
    
    public static SubLObject f8672(final SubLObject var26) {
        return f8673(var26);
    }
    
    public static SubLObject f8674(final SubLObject var26) {
        return Equality.eq(f8666(var26), (SubLObject)$ic92$);
    }
    
    public static SubLObject f8675(final SubLObject var26) {
        return Equality.eq(f8666(var26), (SubLObject)$ic93$);
    }
    
    public static SubLObject f8673(final SubLObject var26) {
        return (SubLObject)makeBoolean(NIL != f8619(var26) || NIL != f8620(var26));
    }
    
    public static SubLObject f8676(final SubLObject var26) {
        return Types.atom(f8660(var26));
    }
    
    public static SubLObject f8677(final SubLObject var26) {
        return Types.listp(f8660(var26));
    }
    
    public static SubLObject f8678(final SubLObject var26) {
        return Types.function_spec_p(f8620(var26));
    }
    
    public static SubLObject f8679(final SubLObject var26) {
        return module0035.sublisp_boolean(f8663(var26));
    }
    
    public static SubLObject f8680(final SubLObject var26) {
        return f8615(var26);
    }
    
    public static SubLObject f8681(final SubLObject var26) {
        return module0035.sublisp_boolean(f8615(var26));
    }
    
    public static SubLObject f8682(final SubLObject var27) {
        return (SubLObject)makeBoolean(var27 == $ic88$ || var27 == $ic89$);
    }
    
    public static SubLObject f8683(final SubLObject var28) {
        return (SubLObject)makeBoolean(NIL == var28 || var28 == $ic50$);
    }
    
    public static SubLObject f8684(final SubLObject var29) {
        return module0004.f104(var29, (SubLObject)$ic94$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f8685(final SubLObject var30) {
        return module0004.f104(var30, (SubLObject)$ic95$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f8686(final SubLObject var31) {
        return Types.hash_table_p(var31);
    }
    
    public static SubLObject f8687(final SubLObject var32, final SubLObject var33) {
        SubLObject var35;
        final SubLObject var34 = var35 = var32.rest();
        SubLObject var36 = (SubLObject)NIL;
        SubLObject var37 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var35, var34, (SubLObject)$ic96$);
        var36 = var35.first();
        var35 = var35.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var35, var34, (SubLObject)$ic96$);
        var37 = var35.first();
        final SubLObject var38;
        var35 = (var38 = var35.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic97$, (SubLObject)ConsesLow.list(reader.bq_cons(var36, (SubLObject)$ic98$)), (SubLObject)ConsesLow.list((SubLObject)$ic99$, var36, var37), ConsesLow.append(var38, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic100$, var36))));
    }
    
    public static SubLObject f8688(final SubLObject var26, final SubLObject var20) {
        SubLObject var27;
        SubLObject var28;
        SubLObject var29;
        for (var27 = (SubLObject)NIL, var27 = var20; NIL != var27; var27 = conses_high.cddr(var27)) {
            var28 = var27.first();
            var29 = conses_high.cadr(var27);
            f8651(var26, var28, var29);
        }
        return var26;
    }
    
    public static SubLObject f8651(final SubLObject var26, final SubLObject var23, final SubLObject var24) {
        if (var23.eql((SubLObject)$ic43$)) {
            f8629(var26, var24);
        }
        else if (var23.eql((SubLObject)$ic44$)) {
            f8630(var26, var24);
        }
        else if (var23.eql((SubLObject)$ic45$)) {
            f8631(var26, var24);
        }
        else if (var23.eql((SubLObject)$ic46$)) {
            f8632(var26, var24);
        }
        else if (var23.eql((SubLObject)$ic47$)) {
            f8633(var26, var24);
        }
        else if (var23.eql((SubLObject)$ic48$)) {
            f8634(var26, var24);
        }
        else if (var23.eql((SubLObject)$ic50$)) {
            f8636(var26, var24);
        }
        else if (var23.eql((SubLObject)$ic51$)) {
            f8637(var26, var24);
        }
        else if (var23.eql((SubLObject)$ic49$)) {
            f8635(var26, var24);
        }
        else if (var23.eql((SubLObject)$ic53$)) {
            f8639(var26, var24);
        }
        else if (var23.eql((SubLObject)$ic54$)) {
            f8640(var26, var24);
        }
        else if (var23.eql((SubLObject)$ic55$)) {
            f8641(var26, var24);
        }
        else if (var23.eql((SubLObject)$ic56$)) {
            f8642(var26, var24);
        }
        else if (var23.eql((SubLObject)$ic57$)) {
            f8643(var26, var24);
        }
        return var26;
    }
    
    public static SubLObject f8689(final SubLObject var26, final SubLObject var40) {
        f8630(var26, var40);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8690(final SubLObject var26, final SubLObject var30) {
        f8629(var26, var30);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8691(final SubLObject var26, final SubLObject var27) {
        f8631(var26, var27);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8692(final SubLObject var26, final SubLObject var41) {
        f8632(var26, var41);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8693(final SubLObject var26, final SubLObject var29) {
        f8633(var26, var29);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8694(final SubLObject var26, final SubLObject var42) {
        f8634(var26, var42);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8695(final SubLObject var26, final SubLObject var43) {
        f8636(var26, var43);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8696(final SubLObject var26, final SubLObject var44) {
        f8637(var26, var44);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8697(final SubLObject var26, final SubLObject var45) {
        f8638(var26, var45);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8698(final SubLObject var26, final SubLObject var46) {
        f8635(var26, var46);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8699(final SubLObject var26, final SubLObject var47) {
        f8639(var26, var47);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8700(final SubLObject var26, final SubLObject var48) {
        f8640(var26, var48);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8701(final SubLObject var26, final SubLObject var49) {
        f8641(var26, var49);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8653(final SubLObject var26, final SubLObject var50) {
        f8644(var26, var50);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8702(final SubLObject var26, final SubLObject var51) {
        f8642(var26, var51);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8652(final SubLObject var26) {
        final SubLObject var27 = f8617(var26);
        if (NIL == var27) {
            f8634(var26, f8703());
        }
        return var26;
    }
    
    public static SubLObject f8704(final SubLObject var26) {
        f8634(var26, f8703());
        f8635(var26, f8703());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8705(final SubLObject var26, final SubLObject var53) {
        f8644(var26, (SubLObject)ConsesLow.cons(var53, f8627(var26)));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8706(final SubLObject var26, final SubLObject var54, SubLObject var55) {
        if (var55 == UNPROVIDED) {
            var55 = Symbols.symbol_function((SubLObject)EQ);
        }
        if (NIL == conses_high.member(var54, f8627(var26), var55, Symbols.symbol_function((SubLObject)IDENTITY))) {
            f8644(var26, (SubLObject)ConsesLow.cons(var54, f8627(var26)));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8707(final SubLObject var26, final SubLObject var54) {
        f8653(var26, ConsesLow.append(f8627(var26), var54));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8708(final SubLObject var26) {
        f8643(var26, (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8709(final SubLObject var26) {
        f8643(var26, (SubLObject)T);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8710(final SubLObject var26, final SubLObject var53) {
        if (NIL != f8676(var26)) {
            if (f8619(var26) == $ic53$) {
                return Functions.funcall(f8622(var26), var53);
            }
            return Equality.eq(var53, f8619(var26));
        }
        else {
            if (NIL != f8677(var26)) {
                return module0004.f104(var53, f8619(var26), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            return (SubLObject)NIL;
        }
    }
    
    public static SubLObject f8711() {
        return $g1579$.getGlobalValue();
    }
    
    public static SubLObject f8703() {
        return Hashtables.make_hash_table(f8711(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f8712() {
        return (SubLObject)$ic103$;
    }
    
    public static SubLObject f8713() {
        return (SubLObject)$ic104$;
    }
    
    public static SubLObject f8714(final SubLObject var30) {
        return Equality.eq(var30, (SubLObject)$ic103$);
    }
    
    public static SubLObject f8715(final SubLObject var57) {
        if (var57.eql((SubLObject)$ic105$)) {
            return (SubLObject)$ic106$;
        }
        if (var57.eql((SubLObject)$ic103$)) {
            return (SubLObject)$ic107$;
        }
        if (var57.eql((SubLObject)$ic104$)) {
            return (SubLObject)$ic108$;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8716(final SubLObject var32, final SubLObject var33) {
        SubLObject var35;
        final SubLObject var34 = var35 = var32.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var35, var34, (SubLObject)$ic109$);
        final SubLObject var36 = var35.rest();
        var35 = var35.first();
        SubLObject var37 = (SubLObject)NIL;
        SubLObject var38 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var35, var34, (SubLObject)$ic109$);
        var37 = var35.first();
        var35 = var35.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var35, var34, (SubLObject)$ic109$);
        var38 = var35.first();
        var35 = var35.rest();
        SubLObject var39 = (SubLObject)NIL;
        SubLObject var40 = var35;
        SubLObject var41 = (SubLObject)NIL;
        SubLObject var65_66 = (SubLObject)NIL;
        while (NIL != var40) {
            cdestructuring_bind.destructuring_bind_must_consp(var40, var34, (SubLObject)$ic109$);
            var65_66 = var40.first();
            var40 = var40.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var40, var34, (SubLObject)$ic109$);
            if (NIL == conses_high.member(var65_66, (SubLObject)$ic110$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var41 = (SubLObject)T;
            }
            if (var65_66 == $ic111$) {
                var39 = var40.first();
            }
            var40 = var40.rest();
        }
        if (NIL != var41 && NIL == var39) {
            cdestructuring_bind.cdestructuring_bind_error(var34, (SubLObject)$ic109$);
        }
        final SubLObject var42 = cdestructuring_bind.property_list_member((SubLObject)$ic112$, var35);
        final SubLObject var43 = (SubLObject)((NIL != var42) ? conses_high.cadr(var42) : NIL);
        final SubLObject var44;
        var35 = (var44 = var36);
        return (SubLObject)ConsesLow.listS((SubLObject)$ic113$, (SubLObject)ConsesLow.list(var37, (SubLObject)ConsesLow.list((SubLObject)$ic114$, var38), var43), ConsesLow.append(var44, (SubLObject)NIL));
    }
    
    public static SubLObject f8717(final SubLObject var30) {
        if (var30.eql((SubLObject)$ic103$)) {
            return (SubLObject)$ic104$;
        }
        if (var30.eql((SubLObject)$ic104$)) {
            return (SubLObject)$ic103$;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8718(final SubLObject var69) {
        return Equality.eq(var69, (SubLObject)$ic50$);
    }
    
    public static SubLObject f8719() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8609", "S#10764", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8611", "S#10763", 1, 0, false);
        new $f8611$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8612", "S#10765", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8613", "S#10766", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8614", "S#10767", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8615", "S#10768", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8616", "S#10769", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8617", "S#10770", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8618", "S#10771", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8619", "S#10772", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8620", "S#10773", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8621", "S#10774", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8622", "S#10775", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8623", "S#10776", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8624", "S#10777", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8625", "S#10778", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8626", "S#10779", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8627", "S#10780", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8628", "S#10781", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8629", "S#10782", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8630", "S#10783", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8631", "S#10784", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8632", "S#10785", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8633", "S#10786", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8634", "S#10787", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8635", "S#10788", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8636", "S#10789", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8637", "S#10790", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8638", "S#10791", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8639", "S#10792", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8640", "S#10793", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8641", "S#10794", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8642", "S#10795", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8643", "S#10796", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8644", "S#10797", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8645", "S#10798", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8646", "S#10799", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8647", "S#10800", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8648", "S#10801", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8610", "S#10802", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8649", "S#10803", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8650", "S#10804", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8654", "S#10805", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8655", "S#10806", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8656", "S#10807", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8657", "S#10808", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8658", "S#10809", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8659", "S#10810", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8660", "S#10811", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8661", "S#10812", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8662", "S#10813", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8663", "S#10814", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8664", "S#10815", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8665", "S#10816", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8666", "S#10817", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8667", "S#10818", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8668", "S#10819", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8669", "S#10820", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8670", "S#10821", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8671", "S#10822", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8672", "S#10823", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8674", "S#10824", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8675", "S#10825", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8673", "S#10826", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8676", "S#10827", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8677", "S#10828", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8678", "S#10829", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8679", "S#10830", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8680", "S#10831", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8681", "S#10832", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8682", "S#10833", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8683", "S#10834", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8684", "S#10835", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8685", "S#10836", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8686", "S#10837", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0133", "f8687", "S#10838");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8688", "S#10839", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8651", "S#10840", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8689", "S#10841", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8690", "S#10842", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8691", "S#10843", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8692", "S#10844", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8693", "S#10845", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8694", "S#10846", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8695", "S#10847", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8696", "S#10848", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8697", "S#10849", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8698", "S#10850", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8699", "S#10851", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8700", "S#10852", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8701", "S#10853", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8653", "S#10854", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8702", "S#10855", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8652", "S#10856", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8704", "S#10857", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8705", "S#10858", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8706", "S#10859", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8707", "S#10860", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8708", "S#10861", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8709", "S#10862", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8710", "S#10863", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8711", "S#10864", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8703", "S#10865", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8712", "S#10866", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8713", "S#10867", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8714", "S#10868", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8715", "S#10869", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0133", "f8716", "S#10870");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8717", "S#10871", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0133", "f8718", "S#10872", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8720() {
        $g1578$ = SubLFiles.defconstant("S#10873", (SubLObject)$ic0$);
        $g1579$ = SubLFiles.deflexical("S#10874", (SubLObject)$ic102$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8721() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g1578$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic7$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic8$);
        Structures.def_csetf((SubLObject)$ic9$, (SubLObject)$ic10$);
        Structures.def_csetf((SubLObject)$ic11$, (SubLObject)$ic12$);
        Structures.def_csetf((SubLObject)$ic13$, (SubLObject)$ic14$);
        Structures.def_csetf((SubLObject)$ic15$, (SubLObject)$ic16$);
        Structures.def_csetf((SubLObject)$ic17$, (SubLObject)$ic18$);
        Structures.def_csetf((SubLObject)$ic19$, (SubLObject)$ic20$);
        Structures.def_csetf((SubLObject)$ic21$, (SubLObject)$ic22$);
        Structures.def_csetf((SubLObject)$ic23$, (SubLObject)$ic24$);
        Structures.def_csetf((SubLObject)$ic25$, (SubLObject)$ic26$);
        Structures.def_csetf((SubLObject)$ic27$, (SubLObject)$ic28$);
        Structures.def_csetf((SubLObject)$ic29$, (SubLObject)$ic30$);
        Structures.def_csetf((SubLObject)$ic31$, (SubLObject)$ic32$);
        Structures.def_csetf((SubLObject)$ic33$, (SubLObject)$ic34$);
        Structures.def_csetf((SubLObject)$ic35$, (SubLObject)$ic36$);
        Structures.def_csetf((SubLObject)$ic37$, (SubLObject)$ic38$);
        Structures.def_csetf((SubLObject)$ic39$, (SubLObject)$ic40$);
        Structures.def_csetf((SubLObject)$ic41$, (SubLObject)$ic42$);
        Equality.identity((SubLObject)$ic0$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g1578$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic65$));
        module0002.f50((SubLObject)$ic99$, (SubLObject)$ic101$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f8719();
    }
    
    public void initializeVariables() {
        f8720();
    }
    
    public void runTopLevelForms() {
        f8721();
    }
    
    static {
        me = (SubLFile)new module0133();
        $g1578$ = null;
        $g1579$ = null;
        $ic0$ = makeSymbol("S#10762", "CYC");
        $ic1$ = makeSymbol("S#10763", "CYC");
        $ic2$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#5432", "CYC"), makeSymbol("TYPE"), makeSymbol("S#7779", "CYC"), makeSymbol("S#10875", "CYC"), makeSymbol("S#10876", "CYC"), makeSymbol("S#10877", "CYC"), makeSymbol("S#10878", "CYC"), makeSymbol("S#10879", "CYC"), makeSymbol("S#10880", "CYC"), makeSymbol("S#10881", "CYC"), makeSymbol("S#10882", "CYC"), makeSymbol("S#10883", "CYC"), makeSymbol("S#10884", "CYC"), makeSymbol("S#10885", "CYC"), makeSymbol("S#10886", "CYC"), makeSymbol("S#3267", "CYC"), makeSymbol("S#10129", "CYC") });
        $ic3$ = ConsesLow.list(new SubLObject[] { makeKeyword("DIRECTION"), makeKeyword("TYPE"), makeKeyword("ORDER"), makeKeyword("CUTOFF"), makeKeyword("MARKING"), makeKeyword("MARKING-SPACE"), makeKeyword("GOAL-SPACE"), makeKeyword("GOAL"), makeKeyword("GOAL-FN"), makeKeyword("GOAL-FOUND-P"), makeKeyword("SATISFY-FN"), makeKeyword("MAP-FN"), makeKeyword("JUSTIFY?"), makeKeyword("ADD-TO-RESULT?"), makeKeyword("UNWIND-FN-TOGGLE"), makeKeyword("RESULT"), makeKeyword("GRAPH") });
        $ic4$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#10765", "CYC"), makeSymbol("S#10766", "CYC"), makeSymbol("S#10767", "CYC"), makeSymbol("S#10768", "CYC"), makeSymbol("S#10769", "CYC"), makeSymbol("S#10770", "CYC"), makeSymbol("S#10771", "CYC"), makeSymbol("S#10772", "CYC"), makeSymbol("S#10773", "CYC"), makeSymbol("S#10774", "CYC"), makeSymbol("S#10775", "CYC"), makeSymbol("S#10776", "CYC"), makeSymbol("S#10777", "CYC"), makeSymbol("S#10778", "CYC"), makeSymbol("S#10779", "CYC"), makeSymbol("S#10780", "CYC"), makeSymbol("S#10781", "CYC") });
        $ic5$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#10782", "CYC"), makeSymbol("S#10783", "CYC"), makeSymbol("S#10784", "CYC"), makeSymbol("S#10785", "CYC"), makeSymbol("S#10786", "CYC"), makeSymbol("S#10787", "CYC"), makeSymbol("S#10788", "CYC"), makeSymbol("S#10789", "CYC"), makeSymbol("S#10790", "CYC"), makeSymbol("S#10791", "CYC"), makeSymbol("S#10792", "CYC"), makeSymbol("S#10793", "CYC"), makeSymbol("S#10794", "CYC"), makeSymbol("S#10795", "CYC"), makeSymbol("S#10796", "CYC"), makeSymbol("S#10797", "CYC"), makeSymbol("S#10798", "CYC") });
        $ic6$ = makeSymbol("S#10802", "CYC");
        $ic7$ = makeSymbol("S#10764", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#10763", "CYC"));
        $ic9$ = makeSymbol("S#10765", "CYC");
        $ic10$ = makeSymbol("S#10782", "CYC");
        $ic11$ = makeSymbol("S#10766", "CYC");
        $ic12$ = makeSymbol("S#10783", "CYC");
        $ic13$ = makeSymbol("S#10767", "CYC");
        $ic14$ = makeSymbol("S#10784", "CYC");
        $ic15$ = makeSymbol("S#10768", "CYC");
        $ic16$ = makeSymbol("S#10785", "CYC");
        $ic17$ = makeSymbol("S#10769", "CYC");
        $ic18$ = makeSymbol("S#10786", "CYC");
        $ic19$ = makeSymbol("S#10770", "CYC");
        $ic20$ = makeSymbol("S#10787", "CYC");
        $ic21$ = makeSymbol("S#10771", "CYC");
        $ic22$ = makeSymbol("S#10788", "CYC");
        $ic23$ = makeSymbol("S#10772", "CYC");
        $ic24$ = makeSymbol("S#10789", "CYC");
        $ic25$ = makeSymbol("S#10773", "CYC");
        $ic26$ = makeSymbol("S#10790", "CYC");
        $ic27$ = makeSymbol("S#10774", "CYC");
        $ic28$ = makeSymbol("S#10791", "CYC");
        $ic29$ = makeSymbol("S#10775", "CYC");
        $ic30$ = makeSymbol("S#10792", "CYC");
        $ic31$ = makeSymbol("S#10776", "CYC");
        $ic32$ = makeSymbol("S#10793", "CYC");
        $ic33$ = makeSymbol("S#10777", "CYC");
        $ic34$ = makeSymbol("S#10794", "CYC");
        $ic35$ = makeSymbol("S#10778", "CYC");
        $ic36$ = makeSymbol("S#10795", "CYC");
        $ic37$ = makeSymbol("S#10779", "CYC");
        $ic38$ = makeSymbol("S#10796", "CYC");
        $ic39$ = makeSymbol("S#10780", "CYC");
        $ic40$ = makeSymbol("S#10797", "CYC");
        $ic41$ = makeSymbol("S#10781", "CYC");
        $ic42$ = makeSymbol("S#10798", "CYC");
        $ic43$ = makeKeyword("DIRECTION");
        $ic44$ = makeKeyword("TYPE");
        $ic45$ = makeKeyword("ORDER");
        $ic46$ = makeKeyword("CUTOFF");
        $ic47$ = makeKeyword("MARKING");
        $ic48$ = makeKeyword("MARKING-SPACE");
        $ic49$ = makeKeyword("GOAL-SPACE");
        $ic50$ = makeKeyword("GOAL");
        $ic51$ = makeKeyword("GOAL-FN");
        $ic52$ = makeKeyword("GOAL-FOUND-P");
        $ic53$ = makeKeyword("SATISFY-FN");
        $ic54$ = makeKeyword("MAP-FN");
        $ic55$ = makeKeyword("JUSTIFY?");
        $ic56$ = makeKeyword("ADD-TO-RESULT?");
        $ic57$ = makeKeyword("UNWIND-FN-TOGGLE");
        $ic58$ = makeKeyword("RESULT");
        $ic59$ = makeKeyword("GRAPH");
        $ic60$ = makeString("Invalid slot ~S for construction function");
        $ic61$ = makeKeyword("BEGIN");
        $ic62$ = makeSymbol("S#10799", "CYC");
        $ic63$ = makeKeyword("SLOT");
        $ic64$ = makeKeyword("END");
        $ic65$ = makeSymbol("S#10801", "CYC");
        $ic66$ = makeString("#<");
        $ic67$ = makeKeyword("STREAM");
        $ic68$ = makeKeyword("BASE");
        $ic69$ = makeString("GraphL Search : ~a~%");
        $ic70$ = makeString("Direction : ~a~%");
        $ic71$ = makeString("Type : ~a~%");
        $ic72$ = makeString("Order : ~a~%");
        $ic73$ = makeString("Cutoff : ~a~%");
        $ic74$ = makeString("Marking : ~a~%");
        $ic75$ = makeString("Space : ~a~%");
        $ic76$ = makeString("Goal Space : ~a~%");
        $ic77$ = makeString("Goal : ~a~%");
        $ic78$ = makeString("Goal Fn : ~a~%");
        $ic79$ = makeString("Goal Found-P : ~a~%");
        $ic80$ = makeString("Satisfy Fn : ~a~%");
        $ic81$ = makeString("Map Fn : ~a~%");
        $ic82$ = makeString("Justify? : ~a~%");
        $ic83$ = makeString("Add to Result? : ~a~%");
        $ic84$ = makeString("Unwind Fn Toggle : ~a~%");
        $ic85$ = makeString("Result : ~a~%");
        $ic86$ = makeString("Graph : ~a~%");
        $ic87$ = makeKeyword("FREE");
        $ic88$ = makeKeyword("DEPTH-FIRST");
        $ic89$ = makeKeyword("BREADTH-FIRST");
        $ic90$ = makeKeyword("ITERATIVE-DEEPENING");
        $ic91$ = makeKeyword("DEPTH-MARKING");
        $ic92$ = makeKeyword("NODES-ON-WIND");
        $ic93$ = makeKeyword("EDGES-ON-UNWIND");
        $ic94$ = ConsesLow.list((SubLObject)makeKeyword("DEPTH-MARKING"), (SubLObject)makeKeyword("SIMPLE"));
        $ic95$ = ConsesLow.list((SubLObject)makeKeyword("ACCESSIBLE"), (SubLObject)makeKeyword("FORWARD"), (SubLObject)makeKeyword("BACKWARD"));
        $ic96$ = ConsesLow.list((SubLObject)makeSymbol("S#10887", "CYC"), (SubLObject)makeSymbol("S#138", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic97$ = makeSymbol("CLET");
        $ic98$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#10804", "CYC")));
        $ic99$ = makeSymbol("S#10839", "CYC");
        $ic100$ = makeSymbol("S#10805", "CYC");
        $ic101$ = makeSymbol("S#10838", "CYC");
        $ic102$ = makeInteger(200);
        $ic103$ = makeKeyword("FORWARD");
        $ic104$ = makeKeyword("BACKWARD");
        $ic105$ = makeKeyword("ACCESSIBLE");
        $ic106$ = ConsesLow.list((SubLObject)makeKeyword("FORWARD"), (SubLObject)makeKeyword("BACKWARD"));
        $ic107$ = ConsesLow.list((SubLObject)makeKeyword("FORWARD"));
        $ic108$ = ConsesLow.list((SubLObject)makeKeyword("BACKWARD"));
        $ic109$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#10888", "CYC"), (SubLObject)makeSymbol("S#5432", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#8587", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic110$ = ConsesLow.list((SubLObject)makeKeyword("DONE-VAR"));
        $ic111$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic112$ = makeKeyword("DONE-VAR");
        $ic113$ = makeSymbol("CSOME");
        $ic114$ = makeSymbol("S#10869", "CYC");
    }
    
    public static final class $sX10762_native extends SubLStructNative
    {
        public SubLObject $direction;
        public SubLObject $type;
        public SubLObject $order;
        public SubLObject $cutoff;
        public SubLObject $marking;
        public SubLObject $marking_space;
        public SubLObject $goal_space;
        public SubLObject $goal;
        public SubLObject $goal_fn;
        public SubLObject $goal_found_p;
        public SubLObject $satisfy_fn;
        public SubLObject $map_fn;
        public SubLObject $justifyP;
        public SubLObject $add_to_resultP;
        public SubLObject $unwind_fn_toggle;
        public SubLObject $result;
        public SubLObject $graph;
        public static final SubLStructDeclNative structDecl;
        
        public $sX10762_native() {
            this.$direction = (SubLObject)CommonSymbols.NIL;
            this.$type = (SubLObject)CommonSymbols.NIL;
            this.$order = (SubLObject)CommonSymbols.NIL;
            this.$cutoff = (SubLObject)CommonSymbols.NIL;
            this.$marking = (SubLObject)CommonSymbols.NIL;
            this.$marking_space = (SubLObject)CommonSymbols.NIL;
            this.$goal_space = (SubLObject)CommonSymbols.NIL;
            this.$goal = (SubLObject)CommonSymbols.NIL;
            this.$goal_fn = (SubLObject)CommonSymbols.NIL;
            this.$goal_found_p = (SubLObject)CommonSymbols.NIL;
            this.$satisfy_fn = (SubLObject)CommonSymbols.NIL;
            this.$map_fn = (SubLObject)CommonSymbols.NIL;
            this.$justifyP = (SubLObject)CommonSymbols.NIL;
            this.$add_to_resultP = (SubLObject)CommonSymbols.NIL;
            this.$unwind_fn_toggle = (SubLObject)CommonSymbols.NIL;
            this.$result = (SubLObject)CommonSymbols.NIL;
            this.$graph = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SstructDecl;
        }
        
        public SubLObject getField2() {
            return this.$direction;
        }
        
        public SubLObject getField3() {
            return this.$type;
        }
        
        public SubLObject getField4() {
            return this.$order;
        }
        
        public SubLObject getField5() {
            return this.$cutoff;
        }
        
        public SubLObject getField6() {
            return this.$marking;
        }
        
        public SubLObject getField7() {
            return this.$marking_space;
        }
        
        public SubLObject getField8() {
            return this.$goal_space;
        }
        
        public SubLObject getField9() {
            return this.$goal;
        }
        
        public SubLObject getField10() {
            return this.$goal_fn;
        }
        
        public SubLObject getField11() {
            return this.$goal_found_p;
        }
        
        public SubLObject getField12() {
            return this.$satisfy_fn;
        }
        
        public SubLObject getField13() {
            return this.$map_fn;
        }
        
        public SubLObject getField14() {
            return this.$justifyP;
        }
        
        public SubLObject getField15() {
            return this.$add_to_resultP;
        }
        
        public SubLObject getField16() {
            return this.$unwind_fn_toggle;
        }
        
        public SubLObject getField17() {
            return this.$result;
        }
        
        public SubLObject getField18() {
            return this.$graph;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$direction = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$type = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$order = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$cutoff = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$marking = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$marking_space = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$goal_space = value;
        }
        
        public SubLObject setField9(final SubLObject value) {
            return this.$goal = value;
        }
        
        public SubLObject setField10(final SubLObject value) {
            return this.$goal_fn = value;
        }
        
        public SubLObject setField11(final SubLObject value) {
            return this.$goal_found_p = value;
        }
        
        public SubLObject setField12(final SubLObject value) {
            return this.$satisfy_fn = value;
        }
        
        public SubLObject setField13(final SubLObject value) {
            return this.$map_fn = value;
        }
        
        public SubLObject setField14(final SubLObject value) {
            return this.$justifyP = value;
        }
        
        public SubLObject setField15(final SubLObject value) {
            return this.$add_to_resultP = value;
        }
        
        public SubLObject setField16(final SubLObject value) {
            return this.$unwind_fn_toggle = value;
        }
        
        public SubLObject setField17(final SubLObject value) {
            return this.$result = value;
        }
        
        public SubLObject setField18(final SubLObject value) {
            return this.$graph = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX10762_native.class, $ic0$, $ic1$, $ic2$, $ic3$, new String[] { "$direction", "$type", "$order", "$cutoff", "$marking", "$marking_space", "$goal_space", "$goal", "$goal_fn", "$goal_found_p", "$satisfy_fn", "$map_fn", "$justifyP", "$add_to_resultP", "$unwind_fn_toggle", "$result", "$graph" }, $ic4$, $ic5$, $ic6$);
        }
    }
    
    public static final class $f8611$UnaryFunction extends UnaryFunction
    {
        public $f8611$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#10763"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f8611(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 249 ms
	
	Decompiled with Procyon 0.5.32.
*/
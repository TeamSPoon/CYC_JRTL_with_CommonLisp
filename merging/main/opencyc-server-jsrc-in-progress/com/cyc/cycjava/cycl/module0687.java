package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0687 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0687";
    public static final String myFingerPrint = "3d8e80573d40656003f46dc8cf56a9bc4254f25339aa04cb83f178deffb1ccef";
    private static SubLSymbol $g5394$;
    private static SubLSymbol $g5395$;
    private static SubLSymbol $g5396$;
    private static SubLSymbol $g5397$;
    private static SubLSymbol $g5398$;
    public static SubLSymbol $g5399$;
    public static SubLSymbol $g5400$;
    public static SubLSymbol $g5401$;
    public static SubLSymbol $g5402$;
    public static SubLSymbol $g5403$;
    public static SubLSymbol $g5404$;
    public static SubLSymbol $g5405$;
    public static SubLSymbol $g5406$;
    public static SubLSymbol $g5407$;
    public static SubLSymbol $g5408$;
    public static SubLSymbol $g5409$;
    public static SubLSymbol $g5410$;
    public static SubLSymbol $g5411$;
    public static SubLSymbol $g5412$;
    public static SubLSymbol $g5413$;
    public static SubLSymbol $g5414$;
    public static SubLSymbol $g5415$;
    public static SubLSymbol $g5416$;
    public static SubLSymbol $g5417$;
    public static SubLSymbol $g5418$;
    public static SubLSymbol $g5419$;
    public static SubLSymbol $g5420$;
    public static SubLSymbol $g5421$;
    public static SubLSymbol $g5422$;
    public static SubLSymbol $g5423$;
    public static SubLSymbol $g5424$;
    public static SubLSymbol $g5425$;
    public static SubLSymbol $g5426$;
    public static SubLSymbol $g5427$;
    public static SubLSymbol $g5428$;
    public static SubLSymbol $g5429$;
    public static SubLSymbol $g5430$;
    public static SubLSymbol $g5431$;
    public static SubLSymbol $g5432$;
    public static SubLSymbol $g5433$;
    public static SubLSymbol $g5434$;
    public static SubLSymbol $g5435$;
    private static SubLSymbol $g5436$;
    private static final SubLList $ic0$;
    private static final SubLList $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLString $ic3$;
    private static final SubLString $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLString $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLString $ic8$;
    private static final SubLList $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLString $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLString $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLString $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLString $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLString $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLString $ic22$;
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
    private static final SubLInteger $ic41$;
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
    private static final SubLObject $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLString $ic61$;
    private static final SubLString $ic62$;
    private static final SubLString $ic63$;
    private static final SubLString $ic64$;
    private static final SubLString $ic65$;
    private static final SubLString $ic66$;
    private static final SubLString $ic67$;
    private static final SubLString $ic68$;
    private static final SubLString $ic69$;
    private static final SubLInteger $ic70$;
    private static final SubLString $ic71$;
    private static final SubLString $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLString $ic74$;
    private static final SubLString $ic75$;
    private static final SubLString $ic76$;
    private static final SubLString $ic77$;
    private static final SubLString $ic78$;
    private static final SubLObject $ic79$;
    private static final SubLString $ic80$;
    private static final SubLString $ic81$;
    private static final SubLString $ic82$;
    private static final SubLString $ic83$;
    private static final SubLString $ic84$;
    private static final SubLString $ic85$;
    private static final SubLObject $ic86$;
    private static final SubLString $ic87$;
    private static final SubLString $ic88$;
    private static final SubLString $ic89$;
    private static final SubLString $ic90$;
    private static final SubLString $ic91$;
    private static final SubLString $ic92$;
    private static final SubLString $ic93$;
    private static final SubLString $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLList $ic97$;
    private static final SubLString $ic98$;
    private static final SubLString $ic99$;
    private static final SubLString $ic100$;
    private static final SubLString $ic101$;
    private static final SubLString $ic102$;
    private static final SubLString $ic103$;
    private static final SubLString $ic104$;
    private static final SubLString $ic105$;
    private static final SubLString $ic106$;
    private static final SubLString $ic107$;
    private static final SubLString $ic108$;
    private static final SubLString $ic109$;
    private static final SubLString $ic110$;
    private static final SubLSymbol $ic111$;
    private static final SubLString $ic112$;
    private static final SubLString $ic113$;
    private static final SubLString $ic114$;
    private static final SubLString $ic115$;
    private static final SubLString $ic116$;
    private static final SubLString $ic117$;
    private static final SubLString $ic118$;
    private static final SubLString $ic119$;
    private static final SubLString $ic120$;
    private static final SubLString $ic121$;
    private static final SubLString $ic122$;
    private static final SubLString $ic123$;
    private static final SubLString $ic124$;
    private static final SubLString $ic125$;
    private static final SubLString $ic126$;
    private static final SubLString $ic127$;
    private static final SubLString $ic128$;
    private static final SubLString $ic129$;
    private static final SubLString $ic130$;
    private static final SubLString $ic131$;
    private static final SubLString $ic132$;
    private static final SubLString $ic133$;
    private static final SubLSymbol $ic134$;
    private static final SubLSymbol $ic135$;
    private static final SubLSymbol $ic136$;
    private static final SubLString $ic137$;
    private static final SubLString $ic138$;
    private static final SubLSymbol $ic139$;
    private static final SubLString $ic140$;
    private static final SubLString $ic141$;
    private static final SubLString $ic142$;
    private static final SubLString $ic143$;
    private static final SubLString $ic144$;
    private static final SubLString $ic145$;
    private static final SubLString $ic146$;
    private static final SubLSymbol $ic147$;
    private static final SubLString $ic148$;
    private static final SubLString $ic149$;
    private static final SubLString $ic150$;
    private static final SubLString $ic151$;
    private static final SubLSymbol $ic152$;
    private static final SubLString $ic153$;
    private static final SubLSymbol $ic154$;
    private static final SubLSymbol $ic155$;
    private static final SubLList $ic156$;
    private static final SubLSymbol $ic157$;
    private static final SubLSymbol $ic158$;
    private static final SubLString $ic159$;
    private static final SubLInteger $ic160$;
    private static final SubLSymbol $ic161$;
    private static final SubLObject $ic162$;
    private static final SubLSymbol $ic163$;
    private static final SubLSymbol $ic164$;
    private static final SubLString $ic165$;
    private static final SubLString $ic166$;
    private static final SubLString $ic167$;
    private static final SubLString $ic168$;
    private static final SubLSymbol $ic169$;
    private static final SubLSymbol $ic170$;
    private static final SubLSymbol $ic171$;
    private static final SubLString $ic172$;
    private static final SubLSymbol $ic173$;
    private static final SubLList $ic174$;
    private static final SubLString $ic175$;
    private static final SubLString $ic176$;
    private static final SubLSymbol $ic177$;
    private static final SubLString $ic178$;
    private static final SubLString $ic179$;
    private static final SubLString $ic180$;
    private static final SubLString $ic181$;
    private static final SubLString $ic182$;
    private static final SubLString $ic183$;
    private static final SubLString $ic184$;
    private static final SubLString $ic185$;
    private static final SubLSymbol $ic186$;
    private static final SubLSymbol $ic187$;
    private static final SubLSymbol $ic188$;
    private static final SubLString $ic189$;
    private static final SubLString $ic190$;
    private static final SubLString $ic191$;
    private static final SubLString $ic192$;
    private static final SubLString $ic193$;
    private static final SubLString $ic194$;
    private static final SubLString $ic195$;
    private static final SubLString $ic196$;
    private static final SubLString $ic197$;
    private static final SubLString $ic198$;
    private static final SubLSymbol $ic199$;
    private static final SubLSymbol $ic200$;
    private static final SubLSymbol $ic201$;
    private static final SubLObject $ic202$;
    private static final SubLSymbol $ic203$;
    private static final SubLSymbol $ic204$;
    private static final SubLSymbol $ic205$;
    private static final SubLSymbol $ic206$;
    private static final SubLSymbol $ic207$;
    private static final SubLSymbol $ic208$;
    private static final SubLSymbol $ic209$;
    private static final SubLSymbol $ic210$;
    private static final SubLSymbol $ic211$;
    private static final SubLSymbol $ic212$;
    private static final SubLSymbol $ic213$;
    private static final SubLSymbol $ic214$;
    private static final SubLObject $ic215$;
    private static final SubLString $ic216$;
    private static final SubLObject $ic217$;
    private static final SubLObject $ic218$;
    private static final SubLString $ic219$;
    private static final SubLString $ic220$;
    private static final SubLString $ic221$;
    private static final SubLObject $ic222$;
    private static final SubLString $ic223$;
    private static final SubLString $ic224$;
    private static final SubLString $ic225$;
    private static final SubLString $ic226$;
    private static final SubLInteger $ic227$;
    private static final SubLString $ic228$;
    private static final SubLSymbol $ic229$;
    private static final SubLString $ic230$;
    private static final SubLString $ic231$;
    private static final SubLSymbol $ic232$;
    private static final SubLString $ic233$;
    private static final SubLString $ic234$;
    private static final SubLString $ic235$;
    private static final SubLSymbol $ic236$;
    private static final SubLSymbol $ic237$;
    private static final SubLSymbol $ic238$;
    private static final SubLString $ic239$;
    private static final SubLString $ic240$;
    private static final SubLString $ic241$;
    private static final SubLString $ic242$;
    private static final SubLString $ic243$;
    private static final SubLString $ic244$;
    private static final SubLSymbol $ic245$;
    private static final SubLString $ic246$;
    private static final SubLString $ic247$;
    private static final SubLString $ic248$;
    private static final SubLString $ic249$;
    private static final SubLString $ic250$;
    private static final SubLString $ic251$;
    private static final SubLString $ic252$;
    private static final SubLString $ic253$;
    private static final SubLString $ic254$;
    private static final SubLSymbol $ic255$;
    private static final SubLString $ic256$;
    private static final SubLSymbol $ic257$;
    private static final SubLString $ic258$;
    private static final SubLSymbol $ic259$;
    private static final SubLSymbol $ic260$;
    private static final SubLString $ic261$;
    private static final SubLString $ic262$;
    private static final SubLList $ic263$;
    private static final SubLString $ic264$;
    private static final SubLSymbol $ic265$;
    private static final SubLList $ic266$;
    private static final SubLString $ic267$;
    private static final SubLSymbol $ic268$;
    private static final SubLSymbol $ic269$;
    
    public static SubLObject f42178(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)NIL;
        final SubLObject var4 = module0147.$g2094$.currentBinding(var2);
        final SubLObject var5 = module0147.$g2095$.currentBinding(var2);
        try {
            module0147.$g2094$.bind((SubLObject)$ic58$, var2);
            module0147.$g2095$.bind($ic59$, var2);
            final SubLObject var6 = module0259.f16840(var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (NIL == var3) {
                SubLObject var7;
                SubLObject var8;
                for (var7 = var6, var8 = (SubLObject)NIL, var8 = var7.first(); NIL == var3 && NIL != var7; var3 = conses_high.assoc(var8, $g5394$.getDynamicValue(var2), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var7 = var7.rest(), var8 = var7.first()) {}
            }
        }
        finally {
            module0147.$g2095$.rebind(var5, var2);
            module0147.$g2094$.rebind(var4, var2);
        }
        return var3;
    }
    
    public static SubLObject f42179(final SubLObject var9) {
        return (SubLObject)makeBoolean(NIL != module0173.f10955(var9) && NIL != module0035.sublisp_boolean(f42178(var9)));
    }
    
    public static SubLObject f42180() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (NIL == $g5399$.getDynamicValue(var2)) {
            $g5399$.setDynamicValue((SubLObject)$ic60$, var2);
        }
        return $g5399$.getDynamicValue(var2);
    }
    
    public static SubLObject f42181() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        $g5436$.setDynamicValue((SubLObject)T, var2);
        return $g5436$.getDynamicValue(var2);
    }
    
    public static SubLObject f42182() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        $g5436$.setDynamicValue((SubLObject)NIL, var2);
        return $g5436$.getDynamicValue(var2);
    }
    
    public static SubLObject f42183(SubLObject var10, SubLObject var11, SubLObject var12) {
        if (var10 == UNPROVIDED) {
            var10 = (SubLObject)NIL;
        }
        if (var11 == UNPROVIDED) {
            var11 = (SubLObject)NIL;
        }
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)NIL;
        }
        final SubLThread var13 = SubLProcess.currentSubLThread();
        final SubLObject var14 = (SubLObject)((NIL != module0038.f2653(var12)) ? var12 : ((NIL != module0038.f2653($g5433$.getDynamicValue(var13))) ? $g5433$.getDynamicValue(var13) : $ic61$));
        final SubLObject var15 = $g5432$.getDynamicValue(var13);
        if (NIL != module0038.f2653(var14)) {
            if (var10.isInteger()) {
                SubLObject var16;
                for (var16 = (SubLObject)NIL, var16 = (SubLObject)ZERO_INTEGER; var16.numL(var10); var16 = Numbers.add(var16, (SubLObject)ONE_INTEGER)) {
                    module0642.f39067();
                }
            }
            module0642.f39020(module0015.$g187$.getGlobalValue());
            module0642.f39020(module0015.$g234$.getGlobalValue());
            final SubLObject var17 = var15;
            module0642.f39020(module0015.$g219$.getGlobalValue());
            if (NIL != var17) {
                module0642.f39020(module0015.$g222$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39042(var17));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var18 = module0015.$g533$.currentBinding(var13);
            try {
                module0015.$g533$.bind((SubLObject)T, var13);
                PrintLow.format(module0015.$g131$.getDynamicValue(var13), var14);
            }
            finally {
                module0015.$g533$.rebind(var18, var13);
            }
            module0642.f39020(module0015.$g220$.getGlobalValue());
            module0642.f39020(module0015.$g235$.getGlobalValue());
            module0642.f39020(module0015.$g188$.getGlobalValue());
            if (var11.isInteger()) {
                SubLObject var16;
                for (var16 = (SubLObject)NIL, var16 = (SubLObject)ZERO_INTEGER; var16.numL(var11); var16 = Numbers.add(var16, (SubLObject)ONE_INTEGER)) {
                    module0642.f39067();
                }
            }
            $g5433$.setDynamicValue((SubLObject)NIL, var13);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42184(SubLObject var17) {
        if (var17 == UNPROVIDED) {
            var17 = (SubLObject)NIL;
        }
        final SubLThread var18 = SubLProcess.currentSubLThread();
        module0642.f39026((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g187$.getGlobalValue());
        module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39019((SubLObject)$ic62$);
        module0642.f39020(module0015.$g235$.getGlobalValue());
        module0642.f39026((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g209$.getGlobalValue());
        module0642.f39019((SubLObject)$ic63$);
        module0642.f39020(module0015.$g219$.getGlobalValue());
        module0642.f39020(module0015.$g221$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic64$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        SubLObject var19 = module0015.$g533$.currentBinding(var18);
        try {
            module0015.$g533$.bind((SubLObject)T, var18);
            if (NIL != module0173.f10955($g5409$.getDynamicValue(var18))) {
                module0656.f39804($g5409$.getDynamicValue(var18), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            else {
                module0642.f39019((SubLObject)$ic65$);
            }
        }
        finally {
            module0015.$g533$.rebind(var19, var18);
        }
        module0642.f39020(module0015.$g220$.getGlobalValue());
        module0642.f39020(module0015.$g210$.getGlobalValue());
        module0642.f39069((SubLObject)$ic66$, module0656.f39842($g5409$.getDynamicValue(var18)), (SubLObject)UNPROVIDED);
        module0642.f39032((SubLObject)FIVE_INTEGER);
        module0642.f39020(module0015.$g209$.getGlobalValue());
        module0642.f39019((SubLObject)$ic67$);
        module0642.f39020(module0015.$g210$.getGlobalValue());
        if (NIL != module0666.$g5237$.getDynamicValue(var18)) {
            module0666.f40467((SubLObject)$ic68$, (SubLObject)$ic69$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39032((SubLObject)UNPROVIDED);
        }
        module0642.f39075((SubLObject)$ic68$, (SubLObject)$ic61$, (SubLObject)$ic70$);
        module0642.f39026((SubLObject)UNPROVIDED);
        module0642.f39068((SubLObject)$ic71$, (SubLObject)$ic71$, $g5417$.getDynamicValue(var18), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0642.f39019((SubLObject)$ic72$);
        module0642.f39020(module0015.$g188$.getGlobalValue());
        module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39046(module0015.$g348$.getGlobalValue());
        module0642.f39020(module0015.$g352$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        var19 = module0015.$g533$.currentBinding(var18);
        try {
            module0015.$g533$.bind((SubLObject)T, var18);
            module0642.f39020(module0015.$g343$.getGlobalValue());
            module0642.f39020(module0015.$g345$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0642.f39049((SubLObject)$ic73$));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var4_18 = module0015.$g533$.currentBinding(var18);
            try {
                module0015.$g533$.bind((SubLObject)T, var18);
                module0642.f39020(module0015.$g234$.getGlobalValue());
                module0642.f39019((SubLObject)$ic74$);
                module0642.f39020(module0015.$g235$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var4_18, var18);
            }
            module0642.f39020(module0015.$g344$.getGlobalValue());
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var4_19 = module0015.$g533$.currentBinding(var18);
            try {
                module0015.$g533$.bind((SubLObject)T, var18);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic75$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic76$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_20 = module0015.$g533$.currentBinding(var18);
                try {
                    module0015.$g533$.bind((SubLObject)T, var18);
                    module0642.f39020(module0015.$g459$.getGlobalValue());
                    module0642.f39020(module0015.$g234$.getGlobalValue());
                    module0642.f39019((SubLObject)$ic77$);
                    module0642.f39020(module0015.$g235$.getGlobalValue());
                    module0642.f39020(module0015.$g460$.getGlobalValue());
                    module0642.f39026((SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g459$.getGlobalValue());
                    module0666.f40467((SubLObject)$ic78$, (SubLObject)$ic69$, $ic79$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    module0642.f39032((SubLObject)UNPROVIDED);
                    module0642.f39075((SubLObject)$ic78$, module0603.f36861($g5427$.getDynamicValue(var18)), (SubLObject)$ic70$);
                    module0642.f39020(module0015.$g460$.getGlobalValue());
                    module0642.f39026((SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g459$.getGlobalValue());
                    module0642.f39020(module0015.$g234$.getGlobalValue());
                    module0642.f39019((SubLObject)$ic80$);
                    module0642.f39020(module0015.$g235$.getGlobalValue());
                    module0642.f39020(module0015.$g460$.getGlobalValue());
                    module0642.f39026((SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g459$.getGlobalValue());
                    module0642.f39072((SubLObject)$ic81$, (SubLObject)ONE_INTEGER, Equality.equal($g5428$.getDynamicValue(var18), (SubLObject)ONE_INTEGER), (SubLObject)UNPROVIDED);
                    module0642.f39019((SubLObject)$ic82$);
                    module0642.f39032((SubLObject)THREE_INTEGER);
                    module0642.f39072((SubLObject)$ic81$, (SubLObject)TWO_INTEGER, (SubLObject)makeBoolean(!$g5428$.getDynamicValue(var18).equal((SubLObject)ONE_INTEGER)), (SubLObject)UNPROVIDED);
                    module0642.f39019((SubLObject)$ic83$);
                    module0642.f39020(module0015.$g460$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var4_20, var18);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_21 = module0015.$g533$.currentBinding(var18);
                try {
                    module0015.$g533$.bind((SubLObject)T, var18);
                    module0642.f39032((SubLObject)FIVE_INTEGER);
                }
                finally {
                    module0015.$g533$.rebind(var4_21, var18);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic75$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic76$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_22 = module0015.$g533$.currentBinding(var18);
                try {
                    module0015.$g533$.bind((SubLObject)T, var18);
                    module0642.f39020(module0015.$g234$.getGlobalValue());
                    module0642.f39019((SubLObject)$ic84$);
                    module0642.f39020(module0015.$g235$.getGlobalValue());
                    module0642.f39026((SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g459$.getGlobalValue());
                    module0666.f40467((SubLObject)$ic85$, (SubLObject)$ic69$, $ic86$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    module0642.f39032((SubLObject)UNPROVIDED);
                    module0642.f39075((SubLObject)$ic85$, module0603.f36861($g5426$.getDynamicValue(var18)), (SubLObject)$ic70$);
                    module0642.f39020(module0015.$g460$.getGlobalValue());
                    module0642.f39020(module0015.$g346$.getGlobalValue());
                    module0642.f39020(module0015.$g352$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)ZERO_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_23 = module0015.$g533$.currentBinding(var18);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var18);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var4_24 = module0015.$g533$.currentBinding(var18);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var18);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var4_25 = module0015.$g533$.currentBinding(var18);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var18);
                                module0642.f39068((SubLObject)$ic87$, (SubLObject)$ic87$, $g5430$.getDynamicValue(var18), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                module0642.f39019((SubLObject)$ic88$);
                            }
                            finally {
                                module0015.$g533$.rebind(var4_25, var18);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var4_24, var18);
                        }
                        module0642.f39020(module0015.$g365$.getGlobalValue());
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var4_26 = module0015.$g533$.currentBinding(var18);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var18);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var4_27 = module0015.$g533$.currentBinding(var18);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var18);
                                module0642.f39068((SubLObject)$ic89$, (SubLObject)$ic89$, Equality.eq($g5426$.getDynamicValue(var18), (SubLObject)$ic45$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                module0642.f39019((SubLObject)$ic90$);
                            }
                            finally {
                                module0015.$g533$.rebind(var4_27, var18);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var4_26, var18);
                        }
                        module0642.f39020(module0015.$g365$.getGlobalValue());
                        module0642.f39029((SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_23, var18);
                    }
                    module0642.f39020(module0015.$g347$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var4_22, var18);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var4_19, var18);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var4_28 = module0015.$g533$.currentBinding(var18);
            try {
                module0015.$g533$.bind((SubLObject)T, var18);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic75$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic76$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_29 = module0015.$g533$.currentBinding(var18);
                try {
                    module0015.$g533$.bind((SubLObject)T, var18);
                    module0642.f39067();
                    module0642.f39020(module0015.$g234$.getGlobalValue());
                    module0642.f39019((SubLObject)$ic91$);
                    module0642.f39020(module0015.$g235$.getGlobalValue());
                    module0642.f39067();
                    module0642.f39020(module0015.$g346$.getGlobalValue());
                    module0642.f39020(module0015.$g352$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)ZERO_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_30 = module0015.$g533$.currentBinding(var18);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var18);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var4_31 = module0015.$g533$.currentBinding(var18);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var18);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic92$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var4_32 = module0015.$g533$.currentBinding(var18);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var18);
                                module0642.f39019((SubLObject)$ic93$);
                            }
                            finally {
                                module0015.$g533$.rebind(var4_32, var18);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var4_33 = module0015.$g533$.currentBinding(var18);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var18);
                                module0642.f39020(module0015.$g318$.getGlobalValue());
                                final SubLObject var4_34 = module0015.$g533$.currentBinding(var18);
                                try {
                                    module0015.$g533$.bind((SubLObject)NIL, var18);
                                    module0642.f39020(module0015.$g320$.getGlobalValue());
                                    module0642.f39019((SubLObject)$ic94$);
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                    final SubLObject var4_35 = module0015.$g533$.currentBinding(var18);
                                    try {
                                        module0015.$g533$.bind((SubLObject)T, var18);
                                        SubLObject var20 = $g5422$.getDynamicValue(var18);
                                        if (NIL == var20) {
                                            var20 = (SubLObject)$ic95$;
                                        }
                                        else if (var20.equal((SubLObject)ZERO_INTEGER)) {
                                            var20 = (SubLObject)$ic96$;
                                        }
                                        SubLObject var21 = (SubLObject)$ic97$;
                                        SubLObject var22 = (SubLObject)NIL;
                                        var22 = var21.first();
                                        while (NIL != var21) {
                                            module0642.f39020(module0015.$g324$.getGlobalValue());
                                            final SubLObject var4_36 = module0015.$g533$.currentBinding(var18);
                                            try {
                                                module0015.$g533$.bind((SubLObject)NIL, var18);
                                                if (var22.equal(var20)) {
                                                    module0642.f39019(module0015.$g327$.getGlobalValue());
                                                }
                                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                                final SubLObject var4_37 = module0015.$g533$.currentBinding(var18);
                                                try {
                                                    module0015.$g533$.bind((SubLObject)T, var18);
                                                    module0642.f39019(var22);
                                                }
                                                finally {
                                                    module0015.$g533$.rebind(var4_37, var18);
                                                }
                                            }
                                            finally {
                                                module0015.$g533$.rebind(var4_36, var18);
                                            }
                                            module0642.f39020(module0015.$g325$.getGlobalValue());
                                            var21 = var21.rest();
                                            var22 = var21.first();
                                        }
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var4_35, var18);
                                    }
                                }
                                finally {
                                    module0015.$g533$.rebind(var4_34, var18);
                                }
                                module0642.f39020(module0015.$g319$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var4_33, var18);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var4_31, var18);
                        }
                        module0642.f39020(module0015.$g365$.getGlobalValue());
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var4_38 = module0015.$g533$.currentBinding(var18);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var18);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic92$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var4_39 = module0015.$g533$.currentBinding(var18);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var18);
                                module0642.f39019((SubLObject)$ic98$);
                            }
                            finally {
                                module0015.$g533$.rebind(var4_39, var18);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var4_40 = module0015.$g533$.currentBinding(var18);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var18);
                                module0642.f39020(module0015.$g318$.getGlobalValue());
                                final SubLObject var4_41 = module0015.$g533$.currentBinding(var18);
                                try {
                                    module0015.$g533$.bind((SubLObject)NIL, var18);
                                    module0642.f39020(module0015.$g320$.getGlobalValue());
                                    module0642.f39019((SubLObject)$ic99$);
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                    final SubLObject var4_42 = module0015.$g533$.currentBinding(var18);
                                    try {
                                        module0015.$g533$.bind((SubLObject)T, var18);
                                        SubLObject var20 = $g5421$.getDynamicValue(var18);
                                        if (NIL == var20) {
                                            var20 = (SubLObject)$ic95$;
                                        }
                                        else if (var20.equal((SubLObject)ZERO_INTEGER)) {
                                            var20 = (SubLObject)$ic96$;
                                        }
                                        SubLObject var21 = (SubLObject)$ic97$;
                                        SubLObject var22 = (SubLObject)NIL;
                                        var22 = var21.first();
                                        while (NIL != var21) {
                                            module0642.f39020(module0015.$g324$.getGlobalValue());
                                            final SubLObject var4_43 = module0015.$g533$.currentBinding(var18);
                                            try {
                                                module0015.$g533$.bind((SubLObject)NIL, var18);
                                                if (var22.equal(var20)) {
                                                    module0642.f39019(module0015.$g327$.getGlobalValue());
                                                }
                                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                                final SubLObject var4_44 = module0015.$g533$.currentBinding(var18);
                                                try {
                                                    module0015.$g533$.bind((SubLObject)T, var18);
                                                    module0642.f39019(var22);
                                                }
                                                finally {
                                                    module0015.$g533$.rebind(var4_44, var18);
                                                }
                                            }
                                            finally {
                                                module0015.$g533$.rebind(var4_43, var18);
                                            }
                                            module0642.f39020(module0015.$g325$.getGlobalValue());
                                            var21 = var21.rest();
                                            var22 = var21.first();
                                        }
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var4_42, var18);
                                    }
                                }
                                finally {
                                    module0015.$g533$.rebind(var4_41, var18);
                                }
                                module0642.f39020(module0015.$g319$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var4_40, var18);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var4_38, var18);
                        }
                        module0642.f39020(module0015.$g365$.getGlobalValue());
                        module0642.f39029((SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_30, var18);
                    }
                    module0642.f39020(module0015.$g347$.getGlobalValue());
                    module0642.f39019((SubLObject)$ic100$);
                    module0642.f39075((SubLObject)$ic101$, $g5423$.getDynamicValue(var18), (SubLObject)FOUR_INTEGER);
                }
                finally {
                    module0015.$g533$.rebind(var4_29, var18);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_45 = module0015.$g533$.currentBinding(var18);
                try {
                    module0015.$g533$.bind((SubLObject)T, var18);
                    module0642.f39032((SubLObject)FIVE_INTEGER);
                }
                finally {
                    module0015.$g533$.rebind(var4_45, var18);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic75$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic76$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_46 = module0015.$g533$.currentBinding(var18);
                try {
                    module0015.$g533$.bind((SubLObject)T, var18);
                    module0642.f39067();
                    module0642.f39020(module0015.$g234$.getGlobalValue());
                    module0642.f39019((SubLObject)$ic102$);
                    module0642.f39020(module0015.$g235$.getGlobalValue());
                    module0642.f39067();
                    module0642.f39020(module0015.$g346$.getGlobalValue());
                    module0642.f39020(module0015.$g352$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)ZERO_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_47 = module0015.$g533$.currentBinding(var18);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var18);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var4_48 = module0015.$g533$.currentBinding(var18);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var18);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var4_49 = module0015.$g533$.currentBinding(var18);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var18);
                                module0642.f39068((SubLObject)$ic103$, (SubLObject)$ic103$, $g5419$.getDynamicValue(var18), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                module0642.f39019((SubLObject)$ic104$);
                            }
                            finally {
                                module0015.$g533$.rebind(var4_49, var18);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var4_48, var18);
                        }
                        module0642.f39020(module0015.$g365$.getGlobalValue());
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var4_50 = module0015.$g533$.currentBinding(var18);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var18);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var4_51 = module0015.$g533$.currentBinding(var18);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var18);
                                module0642.f39068((SubLObject)$ic105$, (SubLObject)$ic105$, $g5424$.getDynamicValue(var18), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                module0642.f39019((SubLObject)$ic106$);
                            }
                            finally {
                                module0015.$g533$.rebind(var4_51, var18);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var4_50, var18);
                        }
                        module0642.f39020(module0015.$g365$.getGlobalValue());
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var4_52 = module0015.$g533$.currentBinding(var18);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var18);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var4_53 = module0015.$g533$.currentBinding(var18);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var18);
                                module0642.f39068((SubLObject)$ic107$, (SubLObject)$ic107$, $g5425$.getDynamicValue(var18), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                module0642.f39019((SubLObject)$ic108$);
                            }
                            finally {
                                module0015.$g533$.rebind(var4_53, var18);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var4_52, var18);
                        }
                        module0642.f39020(module0015.$g365$.getGlobalValue());
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var4_54 = module0015.$g533$.currentBinding(var18);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var18);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic75$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var4_55 = module0015.$g533$.currentBinding(var18);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var18);
                                module0642.f39019((SubLObject)$ic109$);
                                module0642.f39075((SubLObject)$ic110$, $g5413$.getDynamicValue(var18), (SubLObject)THREE_INTEGER);
                            }
                            finally {
                                module0015.$g533$.rebind(var4_55, var18);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var4_54, var18);
                        }
                        module0642.f39020(module0015.$g365$.getGlobalValue());
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var4_56 = module0015.$g533$.currentBinding(var18);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var18);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic75$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var4_57 = module0015.$g533$.currentBinding(var18);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var18);
                                module0667.f40571((SubLObject)$ic111$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            finally {
                                module0015.$g533$.rebind(var4_57, var18);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var4_56, var18);
                        }
                        module0642.f39020(module0015.$g365$.getGlobalValue());
                        module0642.f39029((SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_47, var18);
                    }
                    module0642.f39020(module0015.$g347$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var4_46, var18);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var4_28, var18);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var19, var18);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42185(SubLObject var17) {
        if (var17 == UNPROVIDED) {
            var17 = (SubLObject)NIL;
        }
        final SubLThread var18 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39046(module0015.$g348$.getGlobalValue());
        module0642.f39020(module0015.$g352$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var19 = module0015.$g533$.currentBinding(var18);
        try {
            module0015.$g533$.bind((SubLObject)T, var18);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var4_60 = module0015.$g533$.currentBinding(var18);
            try {
                module0015.$g533$.bind((SubLObject)T, var18);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic92$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_61 = module0015.$g533$.currentBinding(var18);
                try {
                    module0015.$g533$.bind((SubLObject)T, var18);
                    module0642.f39020(module0015.$g234$.getGlobalValue());
                    module0642.f39020(module0015.$g318$.getGlobalValue());
                    final SubLObject var4_62 = module0015.$g533$.currentBinding(var18);
                    try {
                        module0015.$g533$.bind((SubLObject)NIL, var18);
                        module0642.f39020(module0015.$g320$.getGlobalValue());
                        module0642.f39019((SubLObject)$ic112$);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var4_63 = module0015.$g533$.currentBinding(var18);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var18);
                            SubLObject var20 = module0646.$g5029$.getDynamicValue(var18);
                            SubLObject var21 = (SubLObject)NIL;
                            var21 = var20.first();
                            while (NIL != var20) {
                                module0642.f39020(module0015.$g324$.getGlobalValue());
                                final SubLObject var4_64 = module0015.$g533$.currentBinding(var18);
                                try {
                                    module0015.$g533$.bind((SubLObject)NIL, var18);
                                    if (var21.first().eql($g5431$.getDynamicValue(var18))) {
                                        module0642.f39019(module0015.$g327$.getGlobalValue());
                                    }
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                    final SubLObject var4_65 = module0015.$g533$.currentBinding(var18);
                                    try {
                                        module0015.$g533$.bind((SubLObject)T, var18);
                                        module0642.f39019(var21.rest());
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var4_65, var18);
                                    }
                                }
                                finally {
                                    module0015.$g533$.rebind(var4_64, var18);
                                }
                                module0642.f39020(module0015.$g325$.getGlobalValue());
                                var20 = var20.rest();
                                var21 = var20.first();
                            }
                        }
                        finally {
                            module0015.$g533$.rebind(var4_63, var18);
                        }
                    }
                    finally {
                        module0015.$g533$.rebind(var4_62, var18);
                    }
                    module0642.f39020(module0015.$g319$.getGlobalValue());
                    module0642.f39019((SubLObject)$ic113$);
                    module0642.f39020(module0015.$g235$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var4_61, var18);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_66 = module0015.$g533$.currentBinding(var18);
                try {
                    module0015.$g533$.bind((SubLObject)T, var18);
                    module0642.f39019((SubLObject)$ic114$);
                }
                finally {
                    module0015.$g533$.rebind(var4_66, var18);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var4_60, var18);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var4_67 = module0015.$g533$.currentBinding(var18);
            try {
                module0015.$g533$.bind((SubLObject)T, var18);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic92$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_68 = module0015.$g533$.currentBinding(var18);
                try {
                    module0015.$g533$.bind((SubLObject)T, var18);
                    module0642.f39020(module0015.$g234$.getGlobalValue());
                    module0642.f39020(module0015.$g318$.getGlobalValue());
                    final SubLObject var4_69 = module0015.$g533$.currentBinding(var18);
                    try {
                        module0015.$g533$.bind((SubLObject)NIL, var18);
                        module0642.f39020(module0015.$g320$.getGlobalValue());
                        module0642.f39019((SubLObject)$ic115$);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var4_70 = module0015.$g533$.currentBinding(var18);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var18);
                            SubLObject var20 = module0646.$g5029$.getDynamicValue(var18);
                            SubLObject var21 = (SubLObject)NIL;
                            var21 = var20.first();
                            while (NIL != var20) {
                                module0642.f39020(module0015.$g324$.getGlobalValue());
                                final SubLObject var4_71 = module0015.$g533$.currentBinding(var18);
                                try {
                                    module0015.$g533$.bind((SubLObject)NIL, var18);
                                    if (var21.first().eql($g5432$.getDynamicValue(var18))) {
                                        module0642.f39019(module0015.$g327$.getGlobalValue());
                                    }
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                    final SubLObject var4_72 = module0015.$g533$.currentBinding(var18);
                                    try {
                                        module0015.$g533$.bind((SubLObject)T, var18);
                                        module0642.f39019(var21.rest());
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var4_72, var18);
                                    }
                                }
                                finally {
                                    module0015.$g533$.rebind(var4_71, var18);
                                }
                                module0642.f39020(module0015.$g325$.getGlobalValue());
                                var20 = var20.rest();
                                var21 = var20.first();
                            }
                        }
                        finally {
                            module0015.$g533$.rebind(var4_70, var18);
                        }
                    }
                    finally {
                        module0015.$g533$.rebind(var4_69, var18);
                    }
                    module0642.f39020(module0015.$g319$.getGlobalValue());
                    module0642.f39019((SubLObject)$ic113$);
                    module0642.f39020(module0015.$g235$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var4_68, var18);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_73 = module0015.$g533$.currentBinding(var18);
                try {
                    module0015.$g533$.bind((SubLObject)T, var18);
                    module0642.f39019((SubLObject)$ic116$);
                }
                finally {
                    module0015.$g533$.rebind(var4_73, var18);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var4_67, var18);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var4_74 = module0015.$g533$.currentBinding(var18);
            try {
                module0015.$g533$.bind((SubLObject)T, var18);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic92$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_75 = module0015.$g533$.currentBinding(var18);
                try {
                    module0015.$g533$.bind((SubLObject)T, var18);
                    module0642.f39020(module0015.$g234$.getGlobalValue());
                    module0642.f39020(module0015.$g318$.getGlobalValue());
                    final SubLObject var4_76 = module0015.$g533$.currentBinding(var18);
                    try {
                        module0015.$g533$.bind((SubLObject)NIL, var18);
                        module0642.f39020(module0015.$g320$.getGlobalValue());
                        module0642.f39019((SubLObject)$ic117$);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var4_77 = module0015.$g533$.currentBinding(var18);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var18);
                            module0642.f39020(module0015.$g187$.getGlobalValue());
                            SubLObject var20 = $g5396$.getDynamicValue(var18);
                            SubLObject var22 = (SubLObject)NIL;
                            var22 = var20.first();
                            while (NIL != var20) {
                                module0642.f39020(module0015.$g324$.getGlobalValue());
                                final SubLObject var4_78 = module0015.$g533$.currentBinding(var18);
                                try {
                                    module0015.$g533$.bind((SubLObject)NIL, var18);
                                    if (var22.equal($g5399$.getDynamicValue(var18))) {
                                        module0642.f39019(module0015.$g327$.getGlobalValue());
                                    }
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                    final SubLObject var4_79 = module0015.$g533$.currentBinding(var18);
                                    try {
                                        module0015.$g533$.bind((SubLObject)T, var18);
                                        module0642.f39019(var22);
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var4_79, var18);
                                    }
                                }
                                finally {
                                    module0015.$g533$.rebind(var4_78, var18);
                                }
                                module0642.f39020(module0015.$g325$.getGlobalValue());
                                var20 = var20.rest();
                                var22 = var20.first();
                            }
                            module0642.f39020(module0015.$g188$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var4_77, var18);
                        }
                    }
                    finally {
                        module0015.$g533$.rebind(var4_76, var18);
                    }
                    module0642.f39020(module0015.$g319$.getGlobalValue());
                    module0642.f39019((SubLObject)$ic113$);
                    module0642.f39020(module0015.$g235$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var4_75, var18);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_80 = module0015.$g533$.currentBinding(var18);
                try {
                    module0015.$g533$.bind((SubLObject)T, var18);
                    module0642.f39019((SubLObject)$ic118$);
                    if ($g5399$.getDynamicValue(var18).equalp((SubLObject)$ic4$)) {
                        module0642.f39019((SubLObject)$ic4$);
                    }
                    else {
                        final SubLObject var23 = module0014.f697($g5399$.getDynamicValue(var18));
                        final SubLObject var24 = (SubLObject)$ic73$;
                        final SubLObject var25 = (SubLObject)$ic4$;
                        final SubLObject var26 = (SubLObject)ZERO_INTEGER;
                        module0642.f39020(module0015.$g431$.getGlobalValue());
                        module0642.f39020(module0015.$g440$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(var23);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        if (NIL != var25) {
                            module0642.f39020(module0015.$g437$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(var25);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        }
                        if (NIL != var24) {
                            module0642.f39020(module0015.$g438$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049(var24));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        }
                        if (NIL != var26) {
                            module0642.f39020(module0015.$g439$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(var26);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        }
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var4_81 = module0015.$g533$.currentBinding(var18);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var18);
                        }
                        finally {
                            module0015.$g533$.rebind(var4_81, var18);
                        }
                        module0642.f39020(module0015.$g432$.getGlobalValue());
                    }
                }
                finally {
                    module0015.$g533$.rebind(var4_80, var18);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var4_74, var18);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var4_82 = module0015.$g533$.currentBinding(var18);
            try {
                module0015.$g533$.bind((SubLObject)T, var18);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic92$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_83 = module0015.$g533$.currentBinding(var18);
                try {
                    module0015.$g533$.bind((SubLObject)T, var18);
                    module0642.f39068((SubLObject)$ic119$, (SubLObject)$ic119$, $g5400$.getDynamicValue(var18), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g234$.getGlobalValue());
                    module0642.f39019((SubLObject)$ic120$);
                    module0642.f39020(module0015.$g235$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var4_83, var18);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_84 = module0015.$g533$.currentBinding(var18);
                try {
                    module0015.$g533$.bind((SubLObject)T, var18);
                    module0642.f39019((SubLObject)$ic121$);
                }
                finally {
                    module0015.$g533$.rebind(var4_84, var18);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var4_82, var18);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var4_85 = module0015.$g533$.currentBinding(var18);
            try {
                module0015.$g533$.bind((SubLObject)T, var18);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic92$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_86 = module0015.$g533$.currentBinding(var18);
                try {
                    module0015.$g533$.bind((SubLObject)T, var18);
                    module0642.f39020(module0015.$g234$.getGlobalValue());
                    module0642.f39075((SubLObject)$ic122$, $g5401$.getDynamicValue(var18), (SubLObject)FOUR_INTEGER);
                    module0642.f39019((SubLObject)$ic123$);
                    module0642.f39019((SubLObject)$ic120$);
                    module0642.f39020(module0015.$g235$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var4_86, var18);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_87 = module0015.$g533$.currentBinding(var18);
                try {
                    module0015.$g533$.bind((SubLObject)T, var18);
                    module0642.f39019((SubLObject)$ic124$);
                }
                finally {
                    module0015.$g533$.rebind(var4_87, var18);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var4_85, var18);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var4_88 = module0015.$g533$.currentBinding(var18);
            try {
                module0015.$g533$.bind((SubLObject)T, var18);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic92$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_89 = module0015.$g533$.currentBinding(var18);
                try {
                    module0015.$g533$.bind((SubLObject)T, var18);
                    module0642.f39020(module0015.$g234$.getGlobalValue());
                    module0642.f39019((SubLObject)$ic125$);
                    module0642.f39075((SubLObject)$ic126$, $g5402$.getDynamicValue(var18), (SubLObject)FOUR_INTEGER);
                    module0642.f39019((SubLObject)$ic120$);
                    module0642.f39020(module0015.$g235$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var4_89, var18);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_90 = module0015.$g533$.currentBinding(var18);
                try {
                    module0015.$g533$.bind((SubLObject)T, var18);
                    module0642.f39019((SubLObject)$ic127$);
                }
                finally {
                    module0015.$g533$.rebind(var4_90, var18);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var4_88, var18);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var4_91 = module0015.$g533$.currentBinding(var18);
            try {
                module0015.$g533$.bind((SubLObject)T, var18);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic92$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_92 = module0015.$g533$.currentBinding(var18);
                try {
                    module0015.$g533$.bind((SubLObject)T, var18);
                    module0642.f39020(module0015.$g234$.getGlobalValue());
                    module0642.f39075((SubLObject)$ic128$, $g5403$.getDynamicValue(var18), (SubLObject)FOUR_INTEGER);
                    module0642.f39019((SubLObject)$ic123$);
                    module0642.f39019((SubLObject)$ic120$);
                    module0642.f39020(module0015.$g235$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var4_92, var18);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_93 = module0015.$g533$.currentBinding(var18);
                try {
                    module0015.$g533$.bind((SubLObject)T, var18);
                    module0642.f39019((SubLObject)$ic129$);
                }
                finally {
                    module0015.$g533$.rebind(var4_93, var18);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var4_91, var18);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var4_94 = module0015.$g533$.currentBinding(var18);
            try {
                module0015.$g533$.bind((SubLObject)T, var18);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic92$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_95 = module0015.$g533$.currentBinding(var18);
                try {
                    module0015.$g533$.bind((SubLObject)T, var18);
                    module0642.f39020(module0015.$g234$.getGlobalValue());
                    module0642.f39019((SubLObject)$ic125$);
                    module0642.f39075((SubLObject)$ic130$, $g5404$.getDynamicValue(var18), (SubLObject)FOUR_INTEGER);
                    module0642.f39019((SubLObject)$ic120$);
                    module0642.f39020(module0015.$g235$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var4_95, var18);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_96 = module0015.$g533$.currentBinding(var18);
                try {
                    module0015.$g533$.bind((SubLObject)T, var18);
                    module0642.f39019((SubLObject)$ic131$);
                }
                finally {
                    module0015.$g533$.rebind(var4_96, var18);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var4_94, var18);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var4_97 = module0015.$g533$.currentBinding(var18);
            try {
                module0015.$g533$.bind((SubLObject)T, var18);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic92$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_98 = module0015.$g533$.currentBinding(var18);
                try {
                    module0015.$g533$.bind((SubLObject)T, var18);
                    module0642.f39020(module0015.$g234$.getGlobalValue());
                    module0642.f39019((SubLObject)$ic125$);
                    module0642.f39075((SubLObject)$ic132$, $g5405$.getDynamicValue(var18), (SubLObject)TWELVE_INTEGER);
                    module0642.f39019((SubLObject)$ic120$);
                    module0642.f39020(module0015.$g235$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var4_98, var18);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_99 = module0015.$g533$.currentBinding(var18);
                try {
                    module0015.$g533$.bind((SubLObject)T, var18);
                    module0642.f39019((SubLObject)$ic133$);
                }
                finally {
                    module0015.$g533$.rebind(var4_99, var18);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var4_97, var18);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var19, var18);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42186(final SubLObject var106, SubLObject var107, SubLObject var108) {
        if (var107 == UNPROVIDED) {
            var107 = Symbols.symbol_function((SubLObject)$ic134$);
        }
        if (var108 == UNPROVIDED) {
            var108 = Symbols.symbol_function((SubLObject)$ic135$);
        }
        final SubLObject var109 = module0217.f14428(var106);
        final SubLObject var110 = Sort.sort(var109, var107, var108);
        return var110;
    }
    
    public static SubLObject f42187(SubLObject var17) {
        if (var17 == UNPROVIDED) {
            var17 = (SubLObject)NIL;
        }
        final SubLThread var18 = SubLProcess.currentSubLThread();
        final SubLObject var19 = $g5431$.getDynamicValue(var18);
        module0642.f39020((SubLObject)$ic138$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g155$.getGlobalValue());
        module0642.f39020(module0015.$g153$.getGlobalValue());
        module0015.f718();
        module0655.f39766();
        module0642.f39064(module0655.$g5143$.getDynamicValue(var18), module0655.$g5142$.getDynamicValue(var18));
        final SubLObject var20 = module0014.f672((SubLObject)$ic139$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g175$.getGlobalValue());
        module0642.f39020(module0015.$g176$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic140$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var20) {
            module0642.f39020(module0015.$g178$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var20);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39020(module0015.$g177$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic141$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g173$.getGlobalValue());
        module0642.f39019((SubLObject)$ic142$);
        module0642.f39020(module0015.$g174$.getGlobalValue());
        module0666.f40471();
        module0642.f39020(module0015.$g154$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        final SubLObject var21 = module0015.$g535$.currentBinding(var18);
        try {
            module0015.$g535$.bind((SubLObject)T, var18);
            module0642.f39020(module0015.$g133$.getGlobalValue());
            if (NIL != var19) {
                module0642.f39020(module0015.$g135$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39042(var19));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var4_112 = module0015.$g533$.currentBinding(var18);
            try {
                module0015.$g533$.bind((SubLObject)T, var18);
                module0642.f39020(module0015.$g187$.getGlobalValue());
                module0642.f39020(module0015.$g234$.getGlobalValue());
                module0642.f39019((SubLObject)$ic142$);
                module0642.f39020(module0015.$g235$.getGlobalValue());
                module0642.f39020(module0015.$g188$.getGlobalValue());
                f42183((SubLObject)ONE_INTEGER, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED);
                final SubLObject var22 = module0656.f39832((SubLObject)NIL);
                module0642.f39020(module0015.$g282$.getGlobalValue());
                module0642.f39020(module0015.$g284$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0110.$g570$.getDynamicValue(var18));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g285$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic143$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                if (NIL != var22) {
                    module0642.f39020(module0015.$g286$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var22);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_113 = module0015.$g533$.currentBinding(var18);
                final SubLObject var23 = module0015.$g541$.currentBinding(var18);
                final SubLObject var24 = module0015.$g539$.currentBinding(var18);
                try {
                    module0015.$g533$.bind((SubLObject)T, var18);
                    module0015.$g541$.bind((SubLObject)T, var18);
                    module0015.$g539$.bind(module0015.f797(), var18);
                    module0642.f39069((SubLObject)$ic144$, (SubLObject)T, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g187$.getGlobalValue());
                    module0656.f39870((SubLObject)$ic136$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    module0642.f39073((SubLObject)$ic145$);
                    module0642.f39032((SubLObject)TWO_INTEGER);
                    module0642.f39074((SubLObject)$ic146$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    module0642.f39067();
                    f42184((SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g188$.getGlobalValue());
                    module0015.f799(module0015.$g539$.getDynamicValue(var18));
                }
                finally {
                    module0015.$g539$.rebind(var24, var18);
                    module0015.$g541$.rebind(var23, var18);
                    module0015.$g533$.rebind(var4_113, var18);
                }
                module0642.f39020(module0015.$g283$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g533$.rebind(var4_112, var18);
            }
            module0642.f39020(module0015.$g134$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g535$.rebind(var21, var18);
        }
        module0642.f39020(module0015.$g156$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42188(SubLObject var17) {
        if (var17 == UNPROVIDED) {
            var17 = (SubLObject)NIL;
        }
        final SubLThread var18 = SubLProcess.currentSubLThread();
        final SubLObject var19 = $g5431$.getDynamicValue(var18);
        module0642.f39020((SubLObject)$ic138$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g155$.getGlobalValue());
        module0642.f39020(module0015.$g153$.getGlobalValue());
        module0015.f718();
        module0655.f39766();
        module0642.f39064(module0655.$g5143$.getDynamicValue(var18), module0655.$g5142$.getDynamicValue(var18));
        final SubLObject var20 = module0014.f672((SubLObject)$ic139$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g175$.getGlobalValue());
        module0642.f39020(module0015.$g176$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic140$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var20) {
            module0642.f39020(module0015.$g178$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var20);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39020(module0015.$g177$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic141$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g173$.getGlobalValue());
        module0642.f39019((SubLObject)$ic148$);
        module0642.f39020(module0015.$g174$.getGlobalValue());
        module0666.f40471();
        module0642.f39020(module0015.$g154$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        final SubLObject var21 = module0015.$g535$.currentBinding(var18);
        try {
            module0015.$g535$.bind((SubLObject)T, var18);
            module0642.f39020(module0015.$g133$.getGlobalValue());
            if (NIL != var19) {
                module0642.f39020(module0015.$g135$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39042(var19));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var4_116 = module0015.$g533$.currentBinding(var18);
            try {
                module0015.$g533$.bind((SubLObject)T, var18);
                module0642.f39020(module0015.$g187$.getGlobalValue());
                module0642.f39020(module0015.$g234$.getGlobalValue());
                module0642.f39019((SubLObject)$ic149$);
                module0642.f39020(module0015.$g235$.getGlobalValue());
                module0642.f39020(module0015.$g188$.getGlobalValue());
                f42183((SubLObject)ONE_INTEGER, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED);
                final SubLObject var22 = module0656.f39832((SubLObject)NIL);
                module0642.f39020(module0015.$g282$.getGlobalValue());
                module0642.f39020(module0015.$g284$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0110.$g570$.getDynamicValue(var18));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g285$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic143$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                if (NIL != var22) {
                    module0642.f39020(module0015.$g286$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var22);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_117 = module0015.$g533$.currentBinding(var18);
                final SubLObject var23 = module0015.$g541$.currentBinding(var18);
                final SubLObject var24 = module0015.$g539$.currentBinding(var18);
                try {
                    module0015.$g533$.bind((SubLObject)T, var18);
                    module0015.$g541$.bind((SubLObject)T, var18);
                    module0015.$g539$.bind(module0015.f797(), var18);
                    module0642.f39069((SubLObject)$ic150$, (SubLObject)T, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g187$.getGlobalValue());
                    module0656.f39790((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    module0642.f39032((SubLObject)TWO_INTEGER);
                    module0642.f39073((SubLObject)$ic145$);
                    module0642.f39032((SubLObject)TWO_INTEGER);
                    module0642.f39074((SubLObject)$ic151$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    module0642.f39067();
                    f42185((SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g188$.getGlobalValue());
                    module0015.f799(module0015.$g539$.getDynamicValue(var18));
                }
                finally {
                    module0015.$g539$.rebind(var24, var18);
                    module0015.$g541$.rebind(var23, var18);
                    module0015.$g533$.rebind(var4_117, var18);
                }
                module0642.f39020(module0015.$g283$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g533$.rebind(var4_116, var18);
            }
            module0642.f39020(module0015.$g134$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g535$.rebind(var21, var18);
        }
        module0642.f39020(module0015.$g156$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42189(final SubLObject var1) {
        return module0259.f16891(var1, $ic79$);
    }
    
    public static SubLObject f42190(final SubLObject var17) {
        final SubLThread var18 = SubLProcess.currentSubLThread();
        SubLObject var19 = (SubLObject)NIL;
        final SubLObject var20 = module0642.f39104((SubLObject)$ic66$, var17);
        final SubLObject var21 = module0642.f39104((SubLObject)$ic68$, var17);
        final SubLObject var22 = module0642.f39104((SubLObject)$ic153$, var17);
        SubLObject var23 = module0642.f39104((SubLObject)$ic71$, var17);
        SubLObject var24 = module0642.f39104((SubLObject)$ic85$, var17);
        SubLObject var25 = module0642.f39104((SubLObject)$ic87$, var17);
        SubLObject var26 = module0642.f39104((SubLObject)$ic89$, var17);
        SubLObject var27 = module0642.f39104((SubLObject)$ic78$, var17);
        SubLObject var28 = module0642.f39104((SubLObject)$ic81$, var17);
        SubLObject var29 = module0642.f39104((SubLObject)$ic103$, var17);
        SubLObject var30 = module0642.f39104((SubLObject)$ic105$, var17);
        SubLObject var31 = module0642.f39104((SubLObject)$ic107$, var17);
        SubLObject var32 = module0642.f39104((SubLObject)$ic94$, var17);
        SubLObject var33 = module0642.f39104((SubLObject)$ic99$, var17);
        SubLObject var34 = module0642.f39104((SubLObject)$ic101$, var17);
        SubLObject var35 = module0642.f39104((SubLObject)$ic110$, var17);
        final SubLObject var36 = module0038.f2661(module0051.f3552((SubLObject)UNPROVIDED), Symbols.symbol_function((SubLObject)$ic154$), (SubLObject)UNPROVIDED);
        final SubLObject var37 = conses_high.second(var36);
        final SubLObject var38 = var36.first();
        if (NIL != module0038.f2653(var21)) {
            var19 = module0660.f40150(var21, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (var19.isCons()) {
                var19 = module0035.delete_if_not(Symbols.symbol_function((SubLObject)$ic155$), var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            if (var19.isCons() && Sequences.length(var19).numE((SubLObject)ONE_INTEGER)) {
                var19 = var19.first();
            }
        }
        else if (NIL != var20) {
            var19 = module0656.f39943(var20, (SubLObject)UNPROVIDED);
        }
        else {
            var19 = module0660.f40150(var22, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        var23 = Equality.equalp(var23, (SubLObject)$ic71$);
        if (NIL != module0038.f2653(var24)) {
            if (NIL != Sequences.find(var24, (SubLObject)$ic156$, Symbols.symbol_function((SubLObject)EQUALP), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var24 = (SubLObject)$ic45$;
            }
            else {
                var24 = module0660.f40150(var24, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            if (var24.isCons()) {
                var24 = module0035.delete_if_not(Symbols.symbol_function((SubLObject)$ic157$), var24, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            if (var24.isCons() && Sequences.length(var24).numE((SubLObject)ONE_INTEGER)) {
                var24 = var24.first();
            }
        }
        var25 = Equality.equalp(var25, (SubLObject)$ic87$);
        var26 = (SubLObject)makeBoolean(var26.equalp((SubLObject)$ic89$) || var24 == $ic45$);
        if (NIL != module0038.f2653(var27)) {
            var27 = module0660.f40150(var27, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (var27.isCons()) {
                var27 = module0035.delete_if_not(Symbols.symbol_function((SubLObject)$ic158$), var27, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            if (var27.isCons() && Sequences.length(var27).numE((SubLObject)ONE_INTEGER)) {
                var27 = var27.first();
            }
        }
        var28 = (SubLObject)(var28.equalp((SubLObject)$ic159$) ? TWO_INTEGER : ONE_INTEGER);
        var29 = Equality.equalp(var29, (SubLObject)$ic103$);
        var30 = Equality.equalp(var30, (SubLObject)$ic105$);
        var31 = Equality.equalp(var31, (SubLObject)$ic107$);
        var32 = reader.read_from_string_ignoring_errors(var32, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (!var32.isInteger()) {
            if (var32.equal((SubLObject)$ic96$)) {
                var32 = (SubLObject)ZERO_INTEGER;
            }
            else if (var32.equal((SubLObject)$ic95$)) {
                var32 = (SubLObject)NIL;
            }
            else {
                var32 = (SubLObject)FOUR_INTEGER;
            }
        }
        var33 = reader.read_from_string_ignoring_errors(var33, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (!var33.isInteger()) {
            if (var33.equal((SubLObject)$ic96$)) {
                var33 = (SubLObject)ZERO_INTEGER;
            }
            else if (var33.equal((SubLObject)$ic95$)) {
                var33 = (SubLObject)NIL;
            }
            else {
                var33 = (SubLObject)FOUR_INTEGER;
            }
        }
        if (NIL != module0038.f2653(var34)) {
            var34 = reader.read_from_string_ignoring_errors(var34, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (!var34.isInteger() || !var34.numGE((SubLObject)ZERO_INTEGER)) {
            var34 = (SubLObject)$ic61$;
        }
        if (NIL != module0038.f2653(var35)) {
            var35 = reader.read_from_string_ignoring_errors(var35, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (!var35.isInteger() || !var35.numGE((SubLObject)ZERO_INTEGER) || !var35.numLE((SubLObject)$ic160$)) {
            var35 = (SubLObject)FOUR_INTEGER;
        }
        $g5417$.setDynamicValue(var23, var18);
        $g5430$.setDynamicValue(var25, var18);
        $g5428$.setDynamicValue(var28, var18);
        $g5429$.setDynamicValue((SubLObject)($g5428$.getDynamicValue(var18).numE((SubLObject)ONE_INTEGER) ? TWO_INTEGER : ONE_INTEGER), var18);
        $g5419$.setDynamicValue(var29, var18);
        $g5424$.setDynamicValue(var30, var18);
        $g5425$.setDynamicValue(var31, var18);
        $g5422$.setDynamicValue(var32, var18);
        $g5421$.setDynamicValue(var33, var18);
        $g5423$.setDynamicValue(var34, var18);
        $g5413$.setDynamicValue(var35, var18);
        SubLObject var39 = (SubLObject)NIL;
        SubLObject var40 = (SubLObject)NIL;
        if (NIL != module0173.f10969(var19)) {
            $g5409$.setDynamicValue(var19, var18);
            if (NIL != $g5417$.getDynamicValue(var18)) {
                f42191($g5409$.getDynamicValue(var18));
                return f42192((SubLObject)UNPROVIDED);
            }
            var39 = (SubLObject)ConsesLow.cons((SubLObject)$ic161$, var39);
        }
        if (NIL != module0173.f10969(var27) && NIL != module0259.f16891(var27, $ic162$)) {
            $g5427$.setDynamicValue(var27, var18);
            var39 = (SubLObject)ConsesLow.cons((SubLObject)$ic163$, var39);
        }
        if (NIL != var26 || (NIL != module0173.f10969(var24) && NIL != module0259.f16891(var24, $ic86$))) {
            $g5426$.setDynamicValue((SubLObject)((NIL != var26) ? $ic45$ : var24), var18);
            var39 = (SubLObject)ConsesLow.cons((SubLObject)$ic164$, var39);
        }
        if (NIL == Sequences.find((SubLObject)$ic161$, var39, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            if (!var19.isCons()) {
                $g5433$.setDynamicValue(PrintLow.format((SubLObject)NIL, (SubLObject)$ic165$, module0642.f39104((SubLObject)$ic68$, var17)), var18);
                return f42187((SubLObject)UNPROVIDED);
            }
            var40 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)$ic161$, var19), var40);
        }
        if (NIL == Sequences.find((SubLObject)$ic163$, var39, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            if (!var27.isCons()) {
                $g5433$.setDynamicValue(PrintLow.format((SubLObject)NIL, (SubLObject)$ic166$, module0642.f39104((SubLObject)$ic78$, var17)), var18);
                return f42187((SubLObject)UNPROVIDED);
            }
            var40 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)$ic163$, var27), var40);
        }
        if (NIL == Sequences.find((SubLObject)$ic164$, var39, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            if (!var24.isCons()) {
                $g5433$.setDynamicValue(PrintLow.format((SubLObject)NIL, (SubLObject)$ic167$, module0642.f39104((SubLObject)$ic85$, var17)), var18);
                return f42187((SubLObject)UNPROVIDED);
            }
            var40 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)$ic164$, var24), var40);
        }
        if (NIL != var40) {
            return f42193(var40);
        }
        if (NIL != $g5417$.getDynamicValue(var18)) {
            f42191($g5409$.getDynamicValue(var18));
        }
        $g5433$.setDynamicValue(PrintLow.format((SubLObject)NIL, (SubLObject)$ic168$, var37, var38), var18);
        return f42192((SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f42194(final SubLObject var17) {
        final SubLThread var18 = SubLProcess.currentSubLThread();
        SubLObject var19 = module0642.f39104((SubLObject)$ic112$, var17);
        SubLObject var20 = module0642.f39104((SubLObject)$ic115$, var17);
        SubLObject var21 = module0642.f39104((SubLObject)$ic117$, var17);
        SubLObject var22 = module0642.f39104((SubLObject)$ic119$, var17);
        SubLObject var23 = module0642.f39104((SubLObject)$ic122$, var17);
        SubLObject var24 = module0642.f39104((SubLObject)$ic126$, var17);
        SubLObject var25 = module0642.f39104((SubLObject)$ic128$, var17);
        SubLObject var26 = module0642.f39104((SubLObject)$ic130$, var17);
        SubLObject var27 = module0642.f39104((SubLObject)$ic132$, var17);
        final SubLObject var28 = module0038.f2661(module0051.f3552((SubLObject)UNPROVIDED), Symbols.symbol_function((SubLObject)$ic154$), (SubLObject)UNPROVIDED);
        final SubLObject var29 = conses_high.second(var28);
        final SubLObject var30 = var28.first();
        if (NIL != module0038.f2653(var19)) {
            var19 = conses_high.rassoc(var19, module0646.$g5029$.getDynamicValue(var18), Symbols.symbol_function((SubLObject)EQUALP), (SubLObject)UNPROVIDED).first();
        }
        else {
            var19 = (SubLObject)$ic170$;
        }
        if (NIL != module0038.f2653(var20)) {
            var20 = conses_high.rassoc(var20, module0646.$g5029$.getDynamicValue(var18), Symbols.symbol_function((SubLObject)EQUALP), (SubLObject)UNPROVIDED).first();
        }
        else {
            var20 = (SubLObject)$ic171$;
        }
        if (NIL != module0038.f2653(var21)) {
            var21 = module0038.f2965(var21);
        }
        else {
            var21 = (SubLObject)$ic4$;
        }
        if (NIL == module0038.f2653(var22)) {
            var22 = (SubLObject)NIL;
        }
        if (NIL == module0038.f2653(var23)) {
            var23 = (SubLObject)$ic61$;
        }
        if (NIL == module0038.f2653(var24)) {
            var24 = (SubLObject)$ic61$;
        }
        if (NIL == module0038.f2653(var25)) {
            var25 = (SubLObject)$ic61$;
        }
        if (NIL == module0038.f2653(var26)) {
            var26 = (SubLObject)$ic61$;
        }
        if (NIL == module0038.f2653(var27)) {
            var27 = (SubLObject)$ic61$;
        }
        $g5431$.setDynamicValue(var19, var18);
        $g5432$.setDynamicValue(var20, var18);
        $g5399$.setDynamicValue((SubLObject)((NIL != conses_high.member(var21, $g5396$.getDynamicValue(var18), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? var21 : $ic4$), var18);
        $g5400$.setDynamicValue((SubLObject)((NIL != var22 && $g5397$.getDynamicValue(var18).isKeyword()) ? $g5397$.getDynamicValue(var18) : NIL), var18);
        $g5401$.setDynamicValue(var23, var18);
        $g5402$.setDynamicValue(var24, var18);
        $g5403$.setDynamicValue(var25, var18);
        $g5404$.setDynamicValue(var26, var18);
        $g5405$.setDynamicValue(var27, var18);
        $g5433$.setDynamicValue(PrintLow.format((SubLObject)NIL, (SubLObject)$ic172$, var29, var30), var18);
        return f42187((SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f42191(final SubLObject var1) {
        if (NIL != module0212.f13762(var1)) {
            final SubLObject var2 = f42178(var1);
            if (NIL == var2) {
                $g5433$.setDynamicValue(PrintLow.format((SubLObject)NIL, (SubLObject)$ic176$, f42195(var1)));
                return f42187((SubLObject)UNPROVIDED);
            }
            SubLObject var4;
            final SubLObject var3 = var4 = var2;
            SubLObject var5 = (SubLObject)NIL;
            SubLObject var6 = (SubLObject)NIL;
            SubLObject var7 = (SubLObject)NIL;
            SubLObject var8 = (SubLObject)NIL;
            SubLObject var9 = (SubLObject)NIL;
            SubLObject var10 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic174$);
            var5 = var4.first();
            var4 = var4.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic174$);
            var6 = var4.first();
            var4 = var4.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic174$);
            var7 = var4.first();
            var4 = var4.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic174$);
            var8 = var4.first();
            var4 = var4.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic174$);
            var9 = var4.first();
            var4 = var4.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic174$);
            var10 = var4.first();
            var4 = var4.rest();
            if (NIL == var4) {
                $g5409$.setDynamicValue(var1);
                $g5427$.setDynamicValue(var6);
                $g5426$.setDynamicValue((SubLObject)$ic45$);
                $g5428$.setDynamicValue(var7);
                $g5429$.setDynamicValue(var8);
                $g5422$.setDynamicValue(var9);
                $g5421$.setDynamicValue(var10);
                $g5433$.setDynamicValue(PrintLow.format((SubLObject)NIL, (SubLObject)$ic175$, f42195(var5)));
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic174$);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42196(final SubLObject var139) {
        final SubLThread var140 = SubLProcess.currentSubLThread();
        final SubLObject var141 = $g5431$.getDynamicValue(var140);
        final SubLObject var142 = var139.first();
        final SubLObject var143 = var142.first();
        final SubLObject var144 = conses_high.second(var142);
        final SubLObject var145 = Sort.sort(var144, Symbols.symbol_function((SubLObject)$ic134$), Symbols.symbol_function((SubLObject)$ic177$));
        final SubLObject var146 = (SubLObject)((var143 == $ic161$) ? $ic153$ : ((var143 == $ic163$) ? $ic178$ : $ic179$));
        final SubLObject var147 = (SubLObject)(var146.equalp((SubLObject)$ic179$) ? $ic180$ : PrintLow.format((SubLObject)NIL, (SubLObject)$ic181$, var146));
        module0642.f39020((SubLObject)$ic138$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g155$.getGlobalValue());
        module0642.f39020(module0015.$g153$.getGlobalValue());
        module0015.f718();
        module0655.f39766();
        module0642.f39064(module0655.$g5143$.getDynamicValue(var140), module0655.$g5142$.getDynamicValue(var140));
        final SubLObject var148 = module0014.f672((SubLObject)$ic139$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g175$.getGlobalValue());
        module0642.f39020(module0015.$g176$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic140$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var148) {
            module0642.f39020(module0015.$g178$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var148);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39020(module0015.$g177$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic141$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g173$.getGlobalValue());
        module0642.f39019((SubLObject)$ic182$);
        module0642.f39020(module0015.$g174$.getGlobalValue());
        module0642.f39020(module0015.$g154$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        final SubLObject var149 = module0015.$g535$.currentBinding(var140);
        try {
            module0015.$g535$.bind((SubLObject)T, var140);
            module0642.f39020(module0015.$g133$.getGlobalValue());
            if (NIL != var141) {
                module0642.f39020(module0015.$g135$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39042(var141));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var4_159 = module0015.$g533$.currentBinding(var140);
            try {
                module0015.$g533$.bind((SubLObject)T, var140);
                module0642.f39020(module0015.$g187$.getGlobalValue());
                module0642.f39020(module0015.$g234$.getGlobalValue());
                PrintLow.format(module0015.$g131$.getDynamicValue(var140), (SubLObject)$ic183$, Strings.string_capitalize(var146, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                module0642.f39020(module0015.$g235$.getGlobalValue());
                module0642.f39067();
                module0642.f39067();
                module0642.f39020(module0015.$g224$.getGlobalValue());
                PrintLow.format(module0015.$g131$.getDynamicValue(var140), (SubLObject)$ic184$, var147);
                module0642.f39020(module0015.$g225$.getGlobalValue());
                module0642.f39067();
                module0642.f39067();
                module0642.f39020(module0015.$g346$.getGlobalValue());
                module0642.f39020(module0015.$g352$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)ZERO_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_160 = module0015.$g533$.currentBinding(var140);
                try {
                    module0015.$g533$.bind((SubLObject)T, var140);
                    SubLObject var150 = var145;
                    SubLObject var151 = (SubLObject)NIL;
                    var151 = var150.first();
                    while (NIL != var150) {
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var4_161 = module0015.$g533$.currentBinding(var140);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var140);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic185$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var4_162 = module0015.$g533$.currentBinding(var140);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var140);
                                module0667.f40571((SubLObject)$ic186$, (SubLObject)ConsesLow.list(module0656.f39842(var151), var146), (SubLObject)$ic187$, f42195(var151), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            finally {
                                module0015.$g533$.rebind(var4_162, var140);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var4_161, var140);
                        }
                        module0642.f39020(module0015.$g365$.getGlobalValue());
                        module0642.f39029((SubLObject)UNPROVIDED);
                        var150 = var150.rest();
                        var151 = var150.first();
                    }
                }
                finally {
                    module0015.$g533$.rebind(var4_160, var140);
                }
                module0642.f39020(module0015.$g347$.getGlobalValue());
                module0642.f39020(module0015.$g188$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g533$.rebind(var4_159, var140);
            }
            module0642.f39020(module0015.$g134$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g535$.rebind(var149, var140);
        }
        module0642.f39020(module0015.$g156$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42197(SubLObject var17) {
        if (var17 == UNPROVIDED) {
            var17 = (SubLObject)NIL;
        }
        final SubLThread var18 = SubLProcess.currentSubLThread();
        final SubLObject var19 = reader.read_from_string_ignoring_errors(var17.first(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var20 = module0656.f39943(var19, (SubLObject)UNPROVIDED);
        final SubLObject var21 = conses_high.second(var17);
        if (var21.equalp((SubLObject)$ic153$)) {
            $g5409$.setDynamicValue(var20, var18);
        }
        else if (var21.equalp((SubLObject)$ic178$)) {
            $g5427$.setDynamicValue(var20, var18);
        }
        else if (var21.equalp((SubLObject)$ic179$)) {
            $g5426$.setDynamicValue(var20, var18);
        }
        if (NIL != $g5417$.getDynamicValue(var18)) {
            f42191($g5409$.getDynamicValue(var18));
        }
        return f42192((SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f42193(final SubLObject var139) {
        if (Sequences.length(var139).numE((SubLObject)ONE_INTEGER)) {
            return f42196(var139);
        }
        return f42198(var139);
    }
    
    public static SubLObject f42198(SubLObject var139) {
        final SubLThread var140 = SubLProcess.currentSubLThread();
        var139 = Sequences.nreverse(var139);
        final SubLObject var141 = $g5431$.getDynamicValue(var140);
        module0642.f39020((SubLObject)$ic138$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g155$.getGlobalValue());
        module0642.f39020(module0015.$g153$.getGlobalValue());
        module0015.f718();
        module0655.f39766();
        module0642.f39064(module0655.$g5143$.getDynamicValue(var140), module0655.$g5142$.getDynamicValue(var140));
        final SubLObject var142 = module0014.f672((SubLObject)$ic139$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g175$.getGlobalValue());
        module0642.f39020(module0015.$g176$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic140$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var142) {
            module0642.f39020(module0015.$g178$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var142);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39020(module0015.$g177$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic141$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g173$.getGlobalValue());
        module0642.f39019((SubLObject)$ic189$);
        module0642.f39020(module0015.$g174$.getGlobalValue());
        module0642.f39020(module0015.$g154$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        final SubLObject var143 = module0015.$g535$.currentBinding(var140);
        try {
            module0015.$g535$.bind((SubLObject)T, var140);
            module0642.f39020(module0015.$g133$.getGlobalValue());
            if (NIL != var141) {
                module0642.f39020(module0015.$g135$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39042(var141));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var4_165 = module0015.$g533$.currentBinding(var140);
            try {
                module0015.$g533$.bind((SubLObject)T, var140);
                module0642.f39020(module0015.$g187$.getGlobalValue());
                module0642.f39020(module0015.$g234$.getGlobalValue());
                module0642.f39019((SubLObject)$ic190$);
                module0642.f39020(module0015.$g235$.getGlobalValue());
                module0642.f39020(module0015.$g188$.getGlobalValue());
                final SubLObject var144 = module0656.f39832((SubLObject)NIL);
                module0642.f39020(module0015.$g282$.getGlobalValue());
                module0642.f39020(module0015.$g284$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0110.$g570$.getDynamicValue(var140));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g285$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic143$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                if (NIL != var144) {
                    module0642.f39020(module0015.$g286$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var144);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_166 = module0015.$g533$.currentBinding(var140);
                final SubLObject var145 = module0015.$g541$.currentBinding(var140);
                final SubLObject var146 = module0015.$g539$.currentBinding(var140);
                try {
                    module0015.$g533$.bind((SubLObject)T, var140);
                    module0015.$g541$.bind((SubLObject)T, var140);
                    module0015.$g539$.bind(module0015.f797(), var140);
                    module0642.f39069((SubLObject)$ic191$, (SubLObject)T, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g187$.getGlobalValue());
                    module0642.f39074((SubLObject)$ic192$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    module0642.f39067();
                    module0642.f39067();
                    module0642.f39020(module0015.$g224$.getGlobalValue());
                    module0642.f39019((SubLObject)$ic193$);
                    module0642.f39020(module0015.$g225$.getGlobalValue());
                    module0642.f39067();
                    SubLObject var147 = var139;
                    SubLObject var148 = (SubLObject)NIL;
                    var148 = var147.first();
                    while (NIL != var147) {
                        module0642.f39067();
                        final SubLObject var149 = var148.first();
                        final SubLObject var150 = conses_high.second(var148);
                        final SubLObject var151 = var150.first();
                        final SubLObject var152 = (SubLObject)((var149 == $ic161$) ? $ic194$ : ((var149 == $ic163$) ? $ic195$ : $ic196$));
                        final SubLObject var153 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic197$, var149);
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        PrintLow.format(module0015.$g131$.getDynamicValue(var140), var152);
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                        module0642.f39020(module0015.$g346$.getGlobalValue());
                        module0642.f39020(module0015.$g352$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)ZERO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var4_167 = module0015.$g533$.currentBinding(var140);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var140);
                            SubLObject var37_171 = var150;
                            SubLObject var154 = (SubLObject)NIL;
                            var154 = var37_171.first();
                            while (NIL != var37_171) {
                                module0642.f39020(module0015.$g364$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var4_168 = module0015.$g533$.currentBinding(var140);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var140);
                                    module0642.f39020(module0015.$g360$.getGlobalValue());
                                    module0642.f39020(module0015.$g370$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020(module0642.f39049((SubLObject)$ic92$));
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                    final SubLObject var4_169 = module0015.$g533$.currentBinding(var140);
                                    try {
                                        module0015.$g533$.bind((SubLObject)T, var140);
                                        module0642.f39072(var153, module0656.f39842(var154), Equality.equal(var154, var151), (SubLObject)UNPROVIDED);
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var4_169, var140);
                                    }
                                    module0642.f39020(module0015.$g361$.getGlobalValue());
                                    module0642.f39020(module0015.$g360$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                    final SubLObject var4_170 = module0015.$g533$.currentBinding(var140);
                                    try {
                                        module0015.$g533$.bind((SubLObject)T, var140);
                                        module0642.f39019((SubLObject)$ic198$);
                                        f42199(var154, (SubLObject)UNPROVIDED);
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var4_170, var140);
                                    }
                                    module0642.f39020(module0015.$g361$.getGlobalValue());
                                }
                                finally {
                                    module0015.$g533$.rebind(var4_168, var140);
                                }
                                module0642.f39020(module0015.$g365$.getGlobalValue());
                                module0642.f39029((SubLObject)UNPROVIDED);
                                var37_171 = var37_171.rest();
                                var154 = var37_171.first();
                            }
                        }
                        finally {
                            module0015.$g533$.rebind(var4_167, var140);
                        }
                        module0642.f39020(module0015.$g347$.getGlobalValue());
                        var147 = var147.rest();
                        var148 = var147.first();
                    }
                    module0642.f39074((SubLObject)$ic192$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g188$.getGlobalValue());
                    module0015.f799(module0015.$g539$.getDynamicValue(var140));
                }
                finally {
                    module0015.$g539$.rebind(var146, var140);
                    module0015.$g541$.rebind(var145, var140);
                    module0015.$g533$.rebind(var4_166, var140);
                }
                module0642.f39020(module0015.$g283$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g533$.rebind(var4_165, var140);
            }
            module0642.f39020(module0015.$g134$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g535$.rebind(var143, var140);
        }
        module0642.f39020(module0015.$g156$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42200(SubLObject var17) {
        if (var17 == UNPROVIDED) {
            var17 = (SubLObject)NIL;
        }
        final SubLThread var18 = SubLProcess.currentSubLThread();
        final SubLObject var19 = module0642.f39104((SubLObject)$ic153$, var17);
        final SubLObject var20 = module0642.f39104((SubLObject)$ic78$, var17);
        final SubLObject var21 = module0642.f39104((SubLObject)$ic85$, var17);
        final SubLObject var22 = (SubLObject)((NIL != module0038.f2653(var19)) ? reader.read_from_string_ignoring_errors(var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) : NIL);
        final SubLObject var23 = (SubLObject)((NIL != module0038.f2653(var20)) ? reader.read_from_string_ignoring_errors(var20, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) : NIL);
        final SubLObject var24 = (SubLObject)((NIL != module0038.f2653(var21)) ? reader.read_from_string_ignoring_errors(var21, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) : NIL);
        if (var22.isFixnum()) {
            $g5409$.setDynamicValue(module0656.f39943(var22, (SubLObject)UNPROVIDED), var18);
        }
        if (var23.isFixnum()) {
            $g5427$.setDynamicValue(module0656.f39943(var23, (SubLObject)UNPROVIDED), var18);
        }
        if (var24.isFixnum()) {
            $g5426$.setDynamicValue(module0656.f39943(var24, (SubLObject)UNPROVIDED), var18);
        }
        if (NIL != $g5417$.getDynamicValue(var18)) {
            f42191($g5409$.getDynamicValue(var18));
        }
        return f42192((SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f42201(SubLObject var17) {
        if (var17 == UNPROVIDED) {
            var17 = (SubLObject)NIL;
        }
        final SubLObject var18 = (SubLObject)((NIL != module0038.f2653(var17)) ? var17 : (var17.isCons() ? var17.first() : (var17.isInteger() ? var17 : NIL)));
        final SubLObject var19 = module0656.f39943(var18, (SubLObject)UNPROVIDED);
        $g5409$.setDynamicValue(var19);
        f42192((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42202() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        $g5434$.setDynamicValue((SubLObject)ConsesLow.list($g5427$.getDynamicValue(var2), $g5428$.getDynamicValue(var2), $g5429$.getDynamicValue(var2)), var2);
        $g5435$.setDynamicValue((SubLObject)ConsesLow.list($g5427$.getDynamicValue(var2), $g5429$.getDynamicValue(var2), $g5428$.getDynamicValue(var2)), var2);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42203(final SubLObject var153) {
        final SubLThread var154 = SubLProcess.currentSubLThread();
        final SubLObject var155 = conses_high.second(conses_high.assoc(var153, $g5395$.getDynamicValue(var154), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        return (SubLObject)((NIL != module0173.f10969(var155)) ? var155 : NIL);
    }
    
    public static SubLObject f42204() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        $g5418$.setDynamicValue(f42203($g5427$.getDynamicValue(var2)), var2);
        return $g5418$.getDynamicValue(var2);
    }
    
    public static SubLObject f42205(final SubLObject var118, SubLObject var182) {
        if (var182 == UNPROVIDED) {
            var182 = (SubLObject)NIL;
        }
        final SubLThread var183 = SubLProcess.currentSubLThread();
        final SubLObject var184 = module0228.f15229(var118);
        final SubLObject var185 = $g5434$.getDynamicValue(var183).first();
        final SubLObject var186 = conses_high.second($g5434$.getDynamicValue(var183));
        final SubLObject var187 = conses_high.third($g5434$.getDynamicValue(var183));
        SubLObject var188 = (SubLObject)NIL;
        if (NIL != module0212.f13762(var184)) {
            if ($g5426$.getDynamicValue(var183) == $ic45$) {
                final SubLObject var189 = module0147.$g2094$.currentBinding(var183);
                final SubLObject var190 = module0147.$g2095$.currentBinding(var183);
                try {
                    module0147.$g2094$.bind((SubLObject)$ic58$, var183);
                    module0147.$g2095$.bind($ic59$, var183);
                    var188 = module0220.f14562(var184, var185, var186, var187, (SubLObject)UNPROVIDED);
                }
                finally {
                    module0147.$g2095$.rebind(var190, var183);
                    module0147.$g2094$.rebind(var189, var183);
                }
            }
            else if (NIL != $g5430$.getDynamicValue(var183)) {
                final SubLObject var191 = module0147.f9540($g5426$.getDynamicValue(var183));
                final SubLObject var192 = module0147.$g2095$.currentBinding(var183);
                final SubLObject var193 = module0147.$g2094$.currentBinding(var183);
                final SubLObject var194 = module0147.$g2096$.currentBinding(var183);
                try {
                    module0147.$g2095$.bind(module0147.f9545(var191), var183);
                    module0147.$g2094$.bind(module0147.f9546(var191), var183);
                    module0147.$g2096$.bind(module0147.f9549(var191), var183);
                    var188 = module0220.f14562(var184, var185, var186, var187, (SubLObject)UNPROVIDED);
                }
                finally {
                    module0147.$g2096$.rebind(var194, var183);
                    module0147.$g2094$.rebind(var193, var183);
                    module0147.$g2095$.rebind(var192, var183);
                }
            }
            else {
                final SubLObject var189 = module0147.$g2094$.currentBinding(var183);
                final SubLObject var190 = module0147.$g2095$.currentBinding(var183);
                try {
                    module0147.$g2094$.bind((SubLObject)$ic201$, var183);
                    module0147.$g2095$.bind($g5426$.getDynamicValue(var183), var183);
                    var188 = module0220.f14562(var184, var185, var186, var187, (SubLObject)UNPROVIDED);
                }
                finally {
                    module0147.$g2095$.rebind(var190, var183);
                    module0147.$g2094$.rebind(var189, var183);
                }
            }
            if (NIL == var182 && NIL != module0173.f10969($g5418$.getDynamicValue(var183))) {
                final SubLObject var189 = $g5434$.currentBinding(var183);
                try {
                    $g5434$.bind(conses_high.subst($g5418$.getDynamicValue(var183), var185, $g5434$.getDynamicValue(var183), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var183);
                    var188 = conses_high.union(var188, f42205(var118, (SubLObject)T), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
                }
                finally {
                    $g5434$.rebind(var189, var183);
                }
            }
        }
        return var188;
    }
    
    public static SubLObject f42206(final SubLObject var118) {
        final SubLThread var119 = SubLProcess.currentSubLThread();
        final SubLObject var120 = module0228.f15229(var118);
        final SubLObject var121 = $ic202$;
        SubLObject var122 = (SubLObject)NIL;
        SubLObject var123 = (SubLObject)NIL;
        if (NIL != module0212.f13762(var120) && NIL != var121) {
            if ($g5426$.getDynamicValue(var119) == $ic45$) {
                final SubLObject var124 = module0147.$g2094$.currentBinding(var119);
                final SubLObject var125 = module0147.$g2095$.currentBinding(var119);
                try {
                    module0147.$g2094$.bind((SubLObject)$ic58$, var119);
                    module0147.$g2095$.bind($ic59$, var119);
                    var122 = module0219.f14509(var120, (SubLObject)ONE_INTEGER, var121, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                finally {
                    module0147.$g2095$.rebind(var125, var119);
                    module0147.$g2094$.rebind(var124, var119);
                }
            }
            else if (NIL != $g5430$.getDynamicValue(var119)) {
                final SubLObject var126 = module0147.f9540($g5426$.getDynamicValue(var119));
                final SubLObject var127 = module0147.$g2095$.currentBinding(var119);
                final SubLObject var128 = module0147.$g2094$.currentBinding(var119);
                final SubLObject var129 = module0147.$g2096$.currentBinding(var119);
                try {
                    module0147.$g2095$.bind(module0147.f9545(var126), var119);
                    module0147.$g2094$.bind(module0147.f9546(var126), var119);
                    module0147.$g2096$.bind(module0147.f9549(var126), var119);
                    var122 = module0219.f14509(var120, (SubLObject)ONE_INTEGER, var121, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                finally {
                    module0147.$g2096$.rebind(var129, var119);
                    module0147.$g2094$.rebind(var128, var119);
                    module0147.$g2095$.rebind(var127, var119);
                }
            }
            else {
                final SubLObject var124 = module0147.$g2094$.currentBinding(var119);
                final SubLObject var125 = module0147.$g2095$.currentBinding(var119);
                try {
                    module0147.$g2094$.bind((SubLObject)$ic201$, var119);
                    module0147.$g2095$.bind($g5426$.getDynamicValue(var119), var119);
                    var122 = module0219.f14509(var120, (SubLObject)ONE_INTEGER, var121, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                finally {
                    module0147.$g2095$.rebind(var125, var119);
                    module0147.$g2094$.rebind(var124, var119);
                }
            }
            SubLObject var130 = var122;
            SubLObject var131 = (SubLObject)NIL;
            var131 = var130.first();
            while (NIL != var130) {
                final SubLObject var132 = module0603.f36838(var131);
                final SubLObject var133 = conses_high.third(var132);
                final SubLObject var134 = module0178.f11287(var131);
                var123 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var134, var133), var123);
                var130 = var130.rest();
                var131 = var130.first();
            }
            var123 = Sort.sort(var123, Symbols.symbol_function((SubLObject)$ic134$), Symbols.symbol_function((SubLObject)$ic203$));
        }
        return var123;
    }
    
    public static SubLObject f42207(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (NIL != $g5424$.getDynamicValue(var2)) {
            final SubLObject var3 = f42206(var1);
            if (NIL != var3) {
                module0642.f39067();
                module0642.f39020(module0015.$g346$.getGlobalValue());
                module0642.f39046(module0015.$g348$.getGlobalValue());
                module0642.f39020(module0015.$g352$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)ZERO_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)T, var2);
                    SubLObject var5 = var3;
                    SubLObject var6 = (SubLObject)NIL;
                    var6 = var5.first();
                    while (NIL != var5) {
                        module0642.f39067();
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var4_192 = module0015.$g533$.currentBinding(var2);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var2);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic92$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var4_193 = module0015.$g533$.currentBinding(var2);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var2);
                                final SubLObject var7 = $g5407$.getDynamicValue(var2);
                                module0642.f39020(module0015.$g219$.getGlobalValue());
                                if (NIL != var7) {
                                    module0642.f39020(module0015.$g221$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020(var7);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                }
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var4_194 = module0015.$g533$.currentBinding(var2);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var2);
                                    module0656.f39804(var6.first(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                    module0642.f39020(module0015.$g234$.getGlobalValue());
                                    module0642.f39019((SubLObject)$ic113$);
                                    module0642.f39020(module0015.$g235$.getGlobalValue());
                                }
                                finally {
                                    module0015.$g533$.rebind(var4_194, var2);
                                }
                                module0642.f39020(module0015.$g220$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var4_193, var2);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var4_195 = module0015.$g533$.currentBinding(var2);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var2);
                                final SubLObject var7 = $g5407$.getDynamicValue(var2);
                                module0642.f39020(module0015.$g219$.getGlobalValue());
                                if (NIL != var7) {
                                    module0642.f39020(module0015.$g221$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020(var7);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                }
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var4_196 = module0015.$g533$.currentBinding(var2);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var2);
                                    module0642.f39034(conses_high.second(var6), (SubLObject)UNPROVIDED);
                                }
                                finally {
                                    module0015.$g533$.rebind(var4_196, var2);
                                }
                                module0642.f39020(module0015.$g220$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var4_195, var2);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var4_192, var2);
                        }
                        module0642.f39020(module0015.$g365$.getGlobalValue());
                        module0642.f39029((SubLObject)UNPROVIDED);
                        var5 = var5.rest();
                        var6 = var5.first();
                    }
                }
                finally {
                    module0015.$g533$.rebind(var4, var2);
                }
                module0642.f39020(module0015.$g347$.getGlobalValue());
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42195(final SubLObject var1) {
        SubLObject var2 = (SubLObject)NIL;
        var2 = module0603.f36861(var1);
        return var2;
    }
    
    public static SubLObject f42199(final SubLObject var1, SubLObject var198) {
        if (var198 == UNPROVIDED) {
            var198 = (SubLObject)NIL;
        }
        final SubLThread var199 = SubLProcess.currentSubLThread();
        final SubLObject var200 = (SubLObject)((NIL != module0173.f10969(var1)) ? module0656.f39842(var1) : NIL);
        if (NIL != var200 && NIL != var198) {
            if ($g5399$.getDynamicValue(var199).equal((SubLObject)$ic4$)) {
                module0667.f40571((SubLObject)$ic204$, (SubLObject)ConsesLow.list(var200), (SubLObject)$ic187$, $g5399$.getDynamicValue(var199), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            else {
                module0667.f40571((SubLObject)$ic205$, (SubLObject)ConsesLow.list(var200), (SubLObject)$ic187$, (SubLObject)NIL, $g5399$.getDynamicValue(var199), (SubLObject)$ic4$, (SubLObject)$ic73$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
        }
        module0656.f39804(var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42208(final SubLObject var1, final SubLObject var123, SubLObject var108) {
        if (var108 == UNPROVIDED) {
            var108 = (SubLObject)$ic206$;
        }
        final SubLThread var124 = SubLProcess.currentSubLThread();
        final SubLObject var125 = module0259.f16891(var123, $ic86$);
        SubLObject var126 = (SubLObject)NIL;
        SubLObject var127 = (SubLObject)NIL;
        if (NIL != module0212.f13762(var1)) {
            final SubLObject var128 = var108;
            if (var128.eql((SubLObject)$ic206$)) {
                var126 = (SubLObject)$ic207$;
            }
            else if (var128.eql((SubLObject)$ic208$)) {
                var126 = (SubLObject)$ic209$;
            }
            else if (var128.eql((SubLObject)$ic210$)) {
                var126 = (SubLObject)$ic211$;
            }
            else if (var128.eql((SubLObject)$ic212$)) {
                var126 = (SubLObject)$ic213$;
            }
            else {
                var126 = (SubLObject)$ic214$;
            }
            if (var123 == $ic45$) {
                final SubLObject var129 = module0147.$g2094$.currentBinding(var124);
                final SubLObject var130 = module0147.$g2095$.currentBinding(var124);
                try {
                    module0147.$g2094$.bind((SubLObject)$ic58$, var124);
                    module0147.$g2095$.bind($ic59$, var124);
                    var127 = Functions.funcall(var126, var1);
                }
                finally {
                    module0147.$g2095$.rebind(var130, var124);
                    module0147.$g2094$.rebind(var129, var124);
                }
            }
            else if (NIL != $g5430$.getDynamicValue(var124) && NIL != var125) {
                final SubLObject var131 = module0147.f9540(var123);
                final SubLObject var132 = module0147.$g2095$.currentBinding(var124);
                final SubLObject var133 = module0147.$g2094$.currentBinding(var124);
                final SubLObject var134 = module0147.$g2096$.currentBinding(var124);
                try {
                    module0147.$g2095$.bind(module0147.f9545(var131), var124);
                    module0147.$g2094$.bind(module0147.f9546(var131), var124);
                    module0147.$g2096$.bind(module0147.f9549(var131), var124);
                    var127 = Functions.funcall(var126, var1);
                }
                finally {
                    module0147.$g2096$.rebind(var134, var124);
                    module0147.$g2094$.rebind(var133, var124);
                    module0147.$g2095$.rebind(var132, var124);
                }
            }
            else if (NIL != var125) {
                final SubLObject var129 = module0147.$g2094$.currentBinding(var124);
                final SubLObject var130 = module0147.$g2095$.currentBinding(var124);
                try {
                    module0147.$g2094$.bind((SubLObject)$ic201$, var124);
                    module0147.$g2095$.bind(var123, var124);
                    var127 = Functions.funcall(var126, var1);
                }
                finally {
                    module0147.$g2095$.rebind(var130, var124);
                    module0147.$g2094$.rebind(var129, var124);
                }
            }
            else {
                final SubLObject var129 = module0147.$g2094$.currentBinding(var124);
                final SubLObject var130 = module0147.$g2095$.currentBinding(var124);
                try {
                    module0147.$g2094$.bind((SubLObject)$ic58$, var124);
                    module0147.$g2095$.bind($ic59$, var124);
                    var127 = Functions.funcall(var126, var1);
                }
                finally {
                    module0147.$g2095$.rebind(var130, var124);
                    module0147.$g2094$.rebind(var129, var124);
                }
            }
        }
        return Sequences.remove_duplicates(var127, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f42209(SubLObject var17) {
        if (var17 == UNPROVIDED) {
            var17 = (SubLObject)NIL;
        }
        final SubLThread var18 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g187$.getGlobalValue());
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39046(module0015.$g348$.getGlobalValue());
        module0642.f39020(module0015.$g352$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var19 = module0015.$g533$.currentBinding(var18);
        try {
            module0015.$g533$.bind((SubLObject)T, var18);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var4_202 = module0015.$g533$.currentBinding(var18);
            try {
                module0015.$g533$.bind((SubLObject)T, var18);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic92$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_203 = module0015.$g533$.currentBinding(var18);
                try {
                    module0015.$g533$.bind((SubLObject)T, var18);
                    final SubLObject var20 = $g5407$.getDynamicValue(var18);
                    module0642.f39020(module0015.$g219$.getGlobalValue());
                    if (NIL != var20) {
                        module0642.f39020(module0015.$g221$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(var20);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_204 = module0015.$g533$.currentBinding(var18);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var18);
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0656.f39804($ic215$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic113$);
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                    }
                    finally {
                        module0015.$g533$.rebind(var4_204, var18);
                    }
                    module0642.f39020(module0015.$g220$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var4_203, var18);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_205 = module0015.$g533$.currentBinding(var18);
                try {
                    module0015.$g533$.bind((SubLObject)T, var18);
                    final SubLObject var20 = $g5407$.getDynamicValue(var18);
                    module0642.f39020(module0015.$g219$.getGlobalValue());
                    if (NIL != var20) {
                        module0642.f39020(module0015.$g221$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(var20);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_206 = module0015.$g533$.currentBinding(var18);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var18);
                        final SubLObject var21 = f42208($g5409$.getDynamicValue(var18), $g5426$.getDynamicValue(var18), (SubLObject)$ic206$);
                        final SubLObject var22 = Sort.sort(var21, Symbols.symbol_function((SubLObject)$ic134$), Symbols.symbol_function((SubLObject)$ic177$));
                        final SubLObject var23 = conses_high.last(var22, (SubLObject)UNPROVIDED).first();
                        if (NIL != var21) {
                            SubLObject var24 = var22;
                            SubLObject var25 = (SubLObject)NIL;
                            var25 = var24.first();
                            while (NIL != var24) {
                                f42199(var25, (SubLObject)UNPROVIDED);
                                if (!var25.equal(var23)) {
                                    module0642.f39019((SubLObject)$ic216$);
                                }
                                var24 = var24.rest();
                                var25 = var24.first();
                            }
                        }
                        else {
                            module0642.f39019((SubLObject)$ic65$);
                        }
                    }
                    finally {
                        module0015.$g533$.rebind(var4_206, var18);
                    }
                    module0642.f39020(module0015.$g220$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var4_205, var18);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var4_202, var18);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            if (NIL != Sequences.find($ic217$, f42208($g5409$.getDynamicValue(var18), $g5426$.getDynamicValue(var18), (SubLObject)$ic210$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                module0642.f39020(module0015.$g364$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_207 = module0015.$g533$.currentBinding(var18);
                try {
                    module0015.$g533$.bind((SubLObject)T, var18);
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g370$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic92$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_208 = module0015.$g533$.currentBinding(var18);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var18);
                        final SubLObject var20 = $g5407$.getDynamicValue(var18);
                        module0642.f39020(module0015.$g219$.getGlobalValue());
                        if (NIL != var20) {
                            module0642.f39020(module0015.$g221$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(var20);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        }
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var4_209 = module0015.$g533$.currentBinding(var18);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var18);
                            module0642.f39020(module0015.$g234$.getGlobalValue());
                            module0656.f39804($ic218$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            module0642.f39019((SubLObject)$ic113$);
                            module0642.f39020(module0015.$g235$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var4_209, var18);
                        }
                        module0642.f39020(module0015.$g220$.getGlobalValue());
                    }
                    finally {
                        module0015.$g533$.rebind(var4_208, var18);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_210 = module0015.$g533$.currentBinding(var18);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var18);
                        final SubLObject var20 = $g5407$.getDynamicValue(var18);
                        module0642.f39020(module0015.$g219$.getGlobalValue());
                        if (NIL != var20) {
                            module0642.f39020(module0015.$g221$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(var20);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        }
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var4_211 = module0015.$g533$.currentBinding(var18);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var18);
                            final SubLObject var26 = f42208($g5409$.getDynamicValue(var18), $g5426$.getDynamicValue(var18), (SubLObject)$ic208$);
                            final SubLObject var27 = Sort.sort(var26, Symbols.symbol_function((SubLObject)$ic134$), Symbols.symbol_function((SubLObject)$ic177$));
                            final SubLObject var23 = conses_high.last(var27, (SubLObject)UNPROVIDED).first();
                            if (NIL != var26) {
                                SubLObject var24 = var27;
                                SubLObject var28 = (SubLObject)NIL;
                                var28 = var24.first();
                                while (NIL != var24) {
                                    f42199(var28, (SubLObject)UNPROVIDED);
                                    if (!var28.equal(var23)) {
                                        module0642.f39019((SubLObject)$ic216$);
                                    }
                                    var24 = var24.rest();
                                    var28 = var24.first();
                                }
                            }
                            else {
                                module0642.f39019((SubLObject)$ic65$);
                            }
                        }
                        finally {
                            module0015.$g533$.rebind(var4_211, var18);
                        }
                        module0642.f39020(module0015.$g220$.getGlobalValue());
                    }
                    finally {
                        module0015.$g533$.rebind(var4_210, var18);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var4_207, var18);
                }
                module0642.f39020(module0015.$g365$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var4_212 = module0015.$g533$.currentBinding(var18);
            try {
                module0015.$g533$.bind((SubLObject)T, var18);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic92$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_213 = module0015.$g533$.currentBinding(var18);
                try {
                    module0015.$g533$.bind((SubLObject)T, var18);
                    final SubLObject var20 = $g5407$.getDynamicValue(var18);
                    module0642.f39020(module0015.$g219$.getGlobalValue());
                    if (NIL != var20) {
                        module0642.f39020(module0015.$g221$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(var20);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_214 = module0015.$g533$.currentBinding(var18);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var18);
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0642.f39019((SubLObject)$ic219$);
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                    }
                    finally {
                        module0015.$g533$.rebind(var4_214, var18);
                    }
                    module0642.f39020(module0015.$g220$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var4_213, var18);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_215 = module0015.$g533$.currentBinding(var18);
                try {
                    module0015.$g533$.bind((SubLObject)T, var18);
                    final SubLObject var20 = $g5407$.getDynamicValue(var18);
                    module0642.f39020(module0015.$g219$.getGlobalValue());
                    if (NIL != var20) {
                        module0642.f39020(module0015.$g221$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(var20);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_216 = module0015.$g533$.currentBinding(var18);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var18);
                        final SubLObject var29 = module0259.f16891($g5426$.getDynamicValue(var18), $ic86$);
                        if ($g5426$.getDynamicValue(var18) == $ic45$) {
                            module0642.f39019((SubLObject)$ic220$);
                        }
                        else if (NIL != $g5430$.getDynamicValue(var18) && NIL != var29) {
                            f42199($g5426$.getDynamicValue(var18), (SubLObject)UNPROVIDED);
                            module0642.f39019((SubLObject)$ic221$);
                            module0656.f39804($ic222$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            module0642.f39019((SubLObject)$ic223$);
                        }
                        else if (NIL != var29) {
                            f42199($g5426$.getDynamicValue(var18), (SubLObject)UNPROVIDED);
                        }
                        else {
                            module0642.f39019((SubLObject)$ic224$);
                        }
                    }
                    finally {
                        module0015.$g533$.rebind(var4_216, var18);
                    }
                    module0642.f39020(module0015.$g220$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var4_215, var18);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var4_212, var18);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var4_217 = module0015.$g533$.currentBinding(var18);
            try {
                module0015.$g533$.bind((SubLObject)T, var18);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic92$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_218 = module0015.$g533$.currentBinding(var18);
                try {
                    module0015.$g533$.bind((SubLObject)T, var18);
                    final SubLObject var20 = $g5407$.getDynamicValue(var18);
                    module0642.f39020(module0015.$g219$.getGlobalValue());
                    if (NIL != var20) {
                        module0642.f39020(module0015.$g221$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(var20);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_219 = module0015.$g533$.currentBinding(var18);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var18);
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0642.f39019((SubLObject)$ic225$);
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                    }
                    finally {
                        module0015.$g533$.rebind(var4_219, var18);
                    }
                    module0642.f39020(module0015.$g220$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var4_218, var18);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_220 = module0015.$g533$.currentBinding(var18);
                try {
                    module0015.$g533$.bind((SubLObject)T, var18);
                    final SubLObject var20 = $g5407$.getDynamicValue(var18);
                    module0642.f39020(module0015.$g219$.getGlobalValue());
                    if (NIL != var20) {
                        module0642.f39020(module0015.$g221$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(var20);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_221 = module0015.$g533$.currentBinding(var18);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var18);
                        f42199($g5427$.getDynamicValue(var18), (SubLObject)UNPROVIDED);
                        if (NIL != module0173.f10969($g5418$.getDynamicValue(var18))) {
                            module0642.f39019((SubLObject)$ic216$);
                            f42199($g5418$.getDynamicValue(var18), (SubLObject)UNPROVIDED);
                        }
                    }
                    finally {
                        module0015.$g533$.rebind(var4_221, var18);
                    }
                    module0642.f39020(module0015.$g220$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var4_220, var18);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var4_217, var18);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var4_222 = module0015.$g533$.currentBinding(var18);
            try {
                module0015.$g533$.bind((SubLObject)T, var18);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic92$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_223 = module0015.$g533$.currentBinding(var18);
                try {
                    module0015.$g533$.bind((SubLObject)T, var18);
                    final SubLObject var20 = $g5407$.getDynamicValue(var18);
                    module0642.f39020(module0015.$g219$.getGlobalValue());
                    if (NIL != var20) {
                        module0642.f39020(module0015.$g221$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(var20);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_224 = module0015.$g533$.currentBinding(var18);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var18);
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0642.f39019((SubLObject)$ic226$);
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                    }
                    finally {
                        module0015.$g533$.rebind(var4_224, var18);
                    }
                    module0642.f39020(module0015.$g220$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var4_223, var18);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_225 = module0015.$g533$.currentBinding(var18);
                try {
                    module0015.$g533$.bind((SubLObject)T, var18);
                    final SubLObject var20 = $g5407$.getDynamicValue(var18);
                    module0642.f39020(module0015.$g219$.getGlobalValue());
                    if (NIL != var20) {
                        module0642.f39020(module0015.$g221$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(var20);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_226 = module0015.$g533$.currentBinding(var18);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var18);
                        PrintLow.format(module0015.$g131$.getDynamicValue(var18), (SubLObject)$ic197$, $g5428$.getDynamicValue(var18));
                    }
                    finally {
                        module0015.$g533$.rebind(var4_226, var18);
                    }
                    module0642.f39020(module0015.$g220$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var4_225, var18);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var4_222, var18);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var19, var18);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        module0642.f39020(module0015.$g188$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42210() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (!$g5410$.getDynamicValue(var2).isHashtable()) {
            $g5410$.setDynamicValue(Hashtables.make_hash_table((SubLObject)$ic227$, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED), var2);
        }
        Hashtables.clrhash($g5410$.getDynamicValue(var2));
        return $g5410$.getDynamicValue(var2);
    }
    
    public static SubLObject f42211() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (!$g5412$.getDynamicValue(var2).isHashtable()) {
            $g5412$.setDynamicValue(Hashtables.make_hash_table((SubLObject)$ic227$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var2);
        }
        Hashtables.clrhash($g5412$.getDynamicValue(var2));
        return $g5412$.getDynamicValue(var2);
    }
    
    public static SubLObject f42212() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (!$g5411$.getDynamicValue(var2).isHashtable()) {
            $g5411$.setDynamicValue(Hashtables.make_hash_table((SubLObject)$ic227$, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED), var2);
        }
        final SubLObject var3 = $g5411$.getDynamicValue(var2);
        SubLObject var4 = (SubLObject)NIL;
        SubLObject var5 = (SubLObject)NIL;
        final Iterator var6 = Hashtables.getEntrySetIterator(var3);
        try {
            while (Hashtables.iteratorHasNext(var6)) {
                final Map.Entry var7 = Hashtables.iteratorNextEntry(var6);
                var4 = Hashtables.getEntryKey(var7);
                var5 = Hashtables.getEntryValue(var7);
                if (var5.isHashtable()) {
                    Hashtables.clrhash(var5);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var6);
        }
        return $g5411$.getDynamicValue(var2);
    }
    
    public static SubLObject f42213() {
        f42210();
        f42211();
        f42212();
        module0646.f39233();
        f42180();
        f42202();
        f42204();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42214(SubLObject var17) {
        if (var17 == UNPROVIDED) {
            var17 = (SubLObject)NIL;
        }
        final SubLThread var18 = SubLProcess.currentSubLThread();
        if (NIL != $g5400$.getDynamicValue(var18)) {
            final SubLObject var19 = module0014.f697($g5400$.getDynamicValue(var18));
            final SubLObject var20 = (SubLObject)$ic73$;
            final SubLObject var21 = (SubLObject)$ic228$;
            final SubLObject var22 = (SubLObject)ZERO_INTEGER;
            module0642.f39020(module0015.$g431$.getGlobalValue());
            module0642.f39020(module0015.$g440$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var19);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var21) {
                module0642.f39020(module0015.$g437$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var21);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            if (NIL != var20) {
                module0642.f39020(module0015.$g438$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049(var20));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            if (NIL != var22) {
                module0642.f39020(module0015.$g439$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var22);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var23 = module0015.$g533$.currentBinding(var18);
            try {
                module0015.$g533$.bind((SubLObject)T, var18);
            }
            finally {
                module0015.$g533$.rebind(var23, var18);
            }
            module0642.f39020(module0015.$g432$.getGlobalValue());
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42192(SubLObject var17) {
        if (var17 == UNPROVIDED) {
            var17 = (SubLObject)NIL;
        }
        final SubLThread var18 = SubLProcess.currentSubLThread();
        if (NIL != module0173.f10969($g5409$.getDynamicValue(var18))) {
            f42213();
            final SubLObject var19 = $g5431$.getDynamicValue(var18);
            module0642.f39020((SubLObject)$ic138$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var18), module0655.$g5142$.getDynamicValue(var18));
            final SubLObject var20 = module0014.f672((SubLObject)$ic139$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic140$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var20) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var20);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic141$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g173$.getGlobalValue());
            PrintLow.format(module0015.$g131$.getDynamicValue(var18), (SubLObject)$ic231$, f42195($g5409$.getDynamicValue(var18)));
            module0642.f39020(module0015.$g174$.getGlobalValue());
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            final SubLObject var21 = module0015.$g535$.currentBinding(var18);
            try {
                module0015.$g535$.bind((SubLObject)T, var18);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (NIL != var19) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39042(var19));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_236 = module0015.$g533$.currentBinding(var18);
                try {
                    module0015.$g533$.bind((SubLObject)T, var18);
                    module0669.f40609($g5409$.getDynamicValue(var18), (SubLObject)$ic232$);
                    final SubLObject var22 = module0656.f39832((SubLObject)NIL);
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var18));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g285$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic143$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    if (NIL != var22) {
                        module0642.f39020(module0015.$g286$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(var22);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_237 = module0015.$g533$.currentBinding(var18);
                    final SubLObject var23 = module0015.$g541$.currentBinding(var18);
                    final SubLObject var24 = module0015.$g539$.currentBinding(var18);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var18);
                        module0015.$g541$.bind((SubLObject)T, var18);
                        module0015.$g539$.bind(module0015.f797(), var18);
                        module0642.f39069((SubLObject)$ic233$, (SubLObject)T, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g346$.getGlobalValue());
                        module0642.f39046(module0015.$g348$.getGlobalValue());
                        module0642.f39020(module0015.$g352$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)ZERO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var4_238 = module0015.$g533$.currentBinding(var18);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var18);
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var4_239 = module0015.$g533$.currentBinding(var18);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var18);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var4_240 = module0015.$g533$.currentBinding(var18);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var18);
                                    module0642.f39019((SubLObject)$ic198$);
                                }
                                finally {
                                    module0015.$g533$.rebind(var4_240, var18);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var4_239, var18);
                            }
                            module0642.f39020(module0015.$g365$.getGlobalValue());
                            module0642.f39029((SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var4_241 = module0015.$g533$.currentBinding(var18);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var18);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var4_242 = module0015.$g533$.currentBinding(var18);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var18);
                                    module0642.f39019((SubLObject)$ic198$);
                                }
                                finally {
                                    module0015.$g533$.rebind(var4_242, var18);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var4_241, var18);
                            }
                            module0642.f39020(module0015.$g365$.getGlobalValue());
                            module0642.f39029((SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var4_243 = module0015.$g533$.currentBinding(var18);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var18);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)$ic75$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var4_244 = module0015.$g533$.currentBinding(var18);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var18);
                                    f42209((SubLObject)UNPROVIDED);
                                }
                                finally {
                                    module0015.$g533$.rebind(var4_244, var18);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var4_243, var18);
                            }
                            module0642.f39020(module0015.$g365$.getGlobalValue());
                            module0642.f39029((SubLObject)UNPROVIDED);
                            if (NIL != $g5433$.getDynamicValue(var18)) {
                                module0642.f39020(module0015.$g364$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var4_245 = module0015.$g533$.currentBinding(var18);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var18);
                                    module0642.f39020(module0015.$g360$.getGlobalValue());
                                    module0642.f39020(module0015.$g370$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020(module0642.f39049((SubLObject)$ic75$));
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                    final SubLObject var4_246 = module0015.$g533$.currentBinding(var18);
                                    try {
                                        module0015.$g533$.bind((SubLObject)T, var18);
                                        final SubLObject var25 = $g5407$.getDynamicValue(var18);
                                        module0642.f39020(module0015.$g219$.getGlobalValue());
                                        if (NIL != var25) {
                                            module0642.f39020(module0015.$g221$.getGlobalValue());
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                            module0642.f39020(var25);
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        }
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                        final SubLObject var4_247 = module0015.$g533$.currentBinding(var18);
                                        try {
                                            module0015.$g533$.bind((SubLObject)T, var18);
                                            f42183((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                        }
                                        finally {
                                            module0015.$g533$.rebind(var4_247, var18);
                                        }
                                        module0642.f39020(module0015.$g220$.getGlobalValue());
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var4_246, var18);
                                    }
                                    module0642.f39020(module0015.$g361$.getGlobalValue());
                                }
                                finally {
                                    module0015.$g533$.rebind(var4_245, var18);
                                }
                                module0642.f39020(module0015.$g365$.getGlobalValue());
                                module0642.f39029((SubLObject)UNPROVIDED);
                            }
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var4_248 = module0015.$g533$.currentBinding(var18);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var18);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var4_249 = module0015.$g533$.currentBinding(var18);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var18);
                                    module0642.f39019((SubLObject)$ic198$);
                                }
                                finally {
                                    module0015.$g533$.rebind(var4_249, var18);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var4_248, var18);
                            }
                            module0642.f39020(module0015.$g365$.getGlobalValue());
                            module0642.f39029((SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var4_250 = module0015.$g533$.currentBinding(var18);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var18);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var4_251 = module0015.$g533$.currentBinding(var18);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var18);
                                    module0642.f39019((SubLObject)$ic198$);
                                }
                                finally {
                                    module0015.$g533$.rebind(var4_251, var18);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var4_250, var18);
                            }
                            module0642.f39020(module0015.$g365$.getGlobalValue());
                            module0642.f39029((SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var4_252 = module0015.$g533$.currentBinding(var18);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var18);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)$ic75$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var4_253 = module0015.$g533$.currentBinding(var18);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var18);
                                    module0656.f39870((SubLObject)$ic229$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                    module0642.f39074((SubLObject)$ic234$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                }
                                finally {
                                    module0015.$g533$.rebind(var4_253, var18);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var4_252, var18);
                            }
                            module0642.f39020(module0015.$g365$.getGlobalValue());
                            module0642.f39029((SubLObject)UNPROVIDED);
                            if (NIL != $g5400$.getDynamicValue(var18)) {
                                module0642.f39020(module0015.$g364$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var4_254 = module0015.$g533$.currentBinding(var18);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var18);
                                    module0642.f39020(module0015.$g360$.getGlobalValue());
                                    module0642.f39020(module0015.$g370$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020(module0642.f39049((SubLObject)$ic75$));
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                    final SubLObject var4_255 = module0015.$g533$.currentBinding(var18);
                                    try {
                                        module0015.$g533$.bind((SubLObject)T, var18);
                                        f42214((SubLObject)UNPROVIDED);
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var4_255, var18);
                                    }
                                    module0642.f39020(module0015.$g361$.getGlobalValue());
                                }
                                finally {
                                    module0015.$g533$.rebind(var4_254, var18);
                                }
                                module0642.f39020(module0015.$g365$.getGlobalValue());
                                module0642.f39029((SubLObject)UNPROVIDED);
                            }
                        }
                        finally {
                            module0015.$g533$.rebind(var4_238, var18);
                        }
                        module0642.f39020(module0015.$g347$.getGlobalValue());
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var4_256 = module0015.$g533$.currentBinding(var18);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var18);
                            f42215($g5409$.getDynamicValue(var18));
                        }
                        finally {
                            module0015.$g533$.rebind(var4_256, var18);
                        }
                        module0642.f39020(module0015.$g361$.getGlobalValue());
                        module0015.f799(module0015.$g539$.getDynamicValue(var18));
                    }
                    finally {
                        module0015.$g539$.rebind(var24, var18);
                        module0015.$g541$.rebind(var23, var18);
                        module0015.$g533$.rebind(var4_237, var18);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var4_236, var18);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var21, var18);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        else {
            $g5433$.setDynamicValue(PrintLow.format((SubLObject)NIL, (SubLObject)$ic235$, $g5409$.getDynamicValue(var18)), var18);
            f42187((SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42216(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        f42212();
        f42210();
        if (NIL != module0212.f13762(var1)) {
            final SubLObject var3 = $g5434$.currentBinding(var2);
            try {
                $g5434$.bind($g5435$.getDynamicValue(var2), var2);
                f42217((SubLObject)ConsesLow.list(var1), $g5434$.getDynamicValue(var2), (SubLObject)ZERO_INTEGER);
            }
            finally {
                $g5434$.rebind(var3, var2);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42218() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)ZERO_INTEGER;
        if (!$g5411$.getDynamicValue(var2).isHashtable()) {
            $g5411$.setDynamicValue(Hashtables.make_hash_table((SubLObject)$ic160$, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED), var2);
        }
        final SubLObject var4 = $g5411$.getDynamicValue(var2);
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        final Iterator var7 = Hashtables.getEntrySetIterator(var4);
        try {
            while (Hashtables.iteratorHasNext(var7)) {
                final Map.Entry var8 = Hashtables.iteratorNextEntry(var7);
                var5 = Hashtables.getEntryKey(var8);
                var6 = Hashtables.getEntryValue(var8);
                if (var6.isHashtable() && Hashtables.hash_table_count(var6).numG((SubLObject)ZERO_INTEGER)) {
                    var3 = Numbers.add(var3, (SubLObject)ONE_INTEGER);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var7);
        }
        return var3;
    }
    
    public static SubLObject f42217(SubLObject var156, final SubLObject var258, SubLObject var259) {
        final SubLThread var260 = SubLProcess.currentSubLThread();
        final SubLObject var261 = var258.first();
        final SubLObject var262 = f42203(var261);
        final SubLObject var263 = conses_high.second(var258);
        final SubLObject var264 = conses_high.third(var258);
        SubLObject var265 = (SubLObject)NIL;
        for (SubLObject var266 = (SubLObject)NIL; NIL != var156 && (!$g5422$.getDynamicValue(var260).isInteger() || !var259.numGE($g5422$.getDynamicValue(var260))); var156 = var266, var266 = (SubLObject)NIL, var265 = (SubLObject)NIL, var259 = Numbers.add(var259, (SubLObject)ONE_INTEGER)) {
            SubLObject var267 = var156;
            SubLObject var268 = (SubLObject)NIL;
            var268 = var267.first();
            while (NIL != var267) {
                if (NIL != module0212.f13762(var268)) {
                    if ($g5426$.getDynamicValue(var260) == $ic45$) {
                        final SubLObject var269 = module0147.$g2094$.currentBinding(var260);
                        final SubLObject var270 = module0147.$g2095$.currentBinding(var260);
                        try {
                            module0147.$g2094$.bind((SubLObject)$ic58$, var260);
                            module0147.$g2095$.bind($ic59$, var260);
                            var265 = module0220.f14562(var268, var261, var263, var264, (SubLObject)UNPROVIDED);
                            if (NIL != module0173.f10969(var262)) {
                                var265 = conses_high.union(var265, module0220.f14562(var268, var262, var263, var264, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                        }
                        finally {
                            module0147.$g2095$.rebind(var270, var260);
                            module0147.$g2094$.rebind(var269, var260);
                        }
                    }
                    else if (NIL != $g5430$.getDynamicValue(var260)) {
                        final SubLObject var271 = module0147.f9540($g5426$.getDynamicValue(var260));
                        final SubLObject var272 = module0147.$g2095$.currentBinding(var260);
                        final SubLObject var273 = module0147.$g2094$.currentBinding(var260);
                        final SubLObject var274 = module0147.$g2096$.currentBinding(var260);
                        try {
                            module0147.$g2095$.bind(module0147.f9545(var271), var260);
                            module0147.$g2094$.bind(module0147.f9546(var271), var260);
                            module0147.$g2096$.bind(module0147.f9549(var271), var260);
                            var265 = module0220.f14562(var268, var261, var263, var264, (SubLObject)UNPROVIDED);
                            if (NIL != module0173.f10969(var262)) {
                                var265 = conses_high.union(var265, module0220.f14562(var268, var262, var263, var264, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                        }
                        finally {
                            module0147.$g2096$.rebind(var274, var260);
                            module0147.$g2094$.rebind(var273, var260);
                            module0147.$g2095$.rebind(var272, var260);
                        }
                    }
                    else {
                        final SubLObject var269 = module0147.$g2094$.currentBinding(var260);
                        final SubLObject var270 = module0147.$g2095$.currentBinding(var260);
                        try {
                            module0147.$g2094$.bind((SubLObject)$ic201$, var260);
                            module0147.$g2095$.bind($g5426$.getDynamicValue(var260), var260);
                            var265 = module0220.f14562(var268, var261, var263, var264, (SubLObject)UNPROVIDED);
                            if (NIL != module0173.f10969(var262)) {
                                var265 = conses_high.union(var265, module0220.f14562(var268, var262, var263, var264, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                        }
                        finally {
                            module0147.$g2095$.rebind(var270, var260);
                            module0147.$g2094$.rebind(var269, var260);
                        }
                    }
                }
                if (NIL != var265) {
                    SubLObject var275 = Hashtables.gethash(var259, $g5411$.getDynamicValue(var260), (SubLObject)UNPROVIDED);
                    if (!var275.isHashtable()) {
                        Hashtables.sethash(var259, $g5411$.getDynamicValue(var260), Hashtables.make_hash_table((SubLObject)$ic160$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                        var275 = Hashtables.gethash(var259, $g5411$.getDynamicValue(var260), (SubLObject)UNPROVIDED);
                    }
                    SubLObject var37_264 = var265;
                    SubLObject var276 = (SubLObject)NIL;
                    var276 = var37_264.first();
                    while (NIL != var37_264) {
                        if (NIL == Hashtables.gethash((SubLObject)ConsesLow.list(var268, var276), $g5410$.getDynamicValue(var260), (SubLObject)UNPROVIDED)) {
                            final SubLObject var277 = Hashtables.gethash(var276, var275, (SubLObject)UNPROVIDED);
                            Hashtables.sethash(var276, var275, conses_high.adjoin(var268, var277, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                            final SubLObject var278 = var276;
                            if (NIL == conses_high.member(var278, var266, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                                var266 = (SubLObject)ConsesLow.cons(var278, var266);
                            }
                            Hashtables.sethash((SubLObject)ConsesLow.list(var268, var276), $g5410$.getDynamicValue(var260), (SubLObject)T);
                        }
                        var37_264 = var37_264.rest();
                        var276 = var37_264.first();
                    }
                    var265 = (SubLObject)NIL;
                }
                var267 = var267.rest();
                var268 = var267.first();
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42219(final SubLObject var267, final SubLObject var268, SubLObject var269) {
        if (var269 == UNPROVIDED) {
            var269 = (SubLObject)$ic237$;
        }
        final SubLThread var270 = SubLProcess.currentSubLThread();
        SubLObject var271 = (SubLObject)NIL;
        SubLObject var272 = (SubLObject)NIL;
        if ((var269 == $ic237$ && $g5428$.getDynamicValue(var270).eql((SubLObject)ONE_INTEGER)) || (var269 == $ic238$ && $g5428$.getDynamicValue(var270).eql((SubLObject)TWO_INTEGER))) {
            var271 = var267;
            var272 = var268;
        }
        else if ((var269 == $ic237$ && $g5428$.getDynamicValue(var270).eql((SubLObject)TWO_INTEGER)) || (var269 == $ic238$ && $g5428$.getDynamicValue(var270).eql((SubLObject)ONE_INTEGER))) {
            var272 = var267;
            var271 = var268;
        }
        final SubLObject var273 = module0217.f14428((SubLObject)ConsesLow.list($g5427$.getDynamicValue(var270), var271, var272));
        final SubLObject var274 = (NIL != module0173.f10969($g5418$.getDynamicValue(var270))) ? conses_high.union(var273, module0217.f14428((SubLObject)ConsesLow.list($g5418$.getDynamicValue(var270), var271, var272)), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED) : var273;
        final SubLObject var275 = Sort.sort(var274, Symbols.symbol_function((SubLObject)$ic134$), Symbols.symbol_function((SubLObject)$ic135$));
        final SubLObject var276 = conses_high.last(var275, (SubLObject)UNPROVIDED).first();
        final SubLObject var277 = $g5407$.getDynamicValue(var270);
        module0642.f39020(module0015.$g219$.getGlobalValue());
        if (NIL != var277) {
            module0642.f39020(module0015.$g221$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var277);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var278 = module0015.$g533$.currentBinding(var270);
        try {
            module0015.$g533$.bind((SubLObject)T, var270);
            module0642.f39019((SubLObject)$ic239$);
            if (NIL != var275) {
                SubLObject var279 = var275;
                SubLObject var280 = (SubLObject)NIL;
                var280 = var279.first();
                while (NIL != var279) {
                    module0656.f39804(var280, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    if (!var280.equal(var276)) {
                        module0642.f39019((SubLObject)$ic216$);
                    }
                    var279 = var279.rest();
                    var280 = var279.first();
                }
            }
            else {
                module0642.f39019((SubLObject)$ic224$);
            }
            module0642.f39019((SubLObject)$ic240$);
        }
        finally {
            module0015.$g533$.rebind(var278, var270);
        }
        module0642.f39020(module0015.$g220$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42220(final SubLObject var267, final SubLObject var156, final SubLObject var273, SubLObject var274) {
        if (var274 == UNPROVIDED) {
            var274 = (SubLObject)$ic237$;
        }
        final SubLThread var275 = SubLProcess.currentSubLThread();
        f42210();
        SubLObject var276 = (SubLObject)NIL;
        SubLObject var277 = var156;
        SubLObject var278 = (SubLObject)NIL;
        var278 = var277.first();
        while (NIL != var277) {
            SubLObject var279 = (SubLObject)NIL;
            SubLObject var280 = (SubLObject)NIL;
            if ((var274 == $ic237$ && $g5428$.getDynamicValue(var275).eql((SubLObject)ONE_INTEGER)) || (var274 == $ic238$ && $g5428$.getDynamicValue(var275).eql((SubLObject)TWO_INTEGER))) {
                var279 = var267;
                var280 = var278;
            }
            else if ((var274 == $ic237$ && $g5428$.getDynamicValue(var275).eql((SubLObject)TWO_INTEGER)) || (var274 == $ic238$ && $g5428$.getDynamicValue(var275).eql((SubLObject)ONE_INTEGER))) {
                var280 = var267;
                var279 = var278;
            }
            SubLObject var281 = module0217.f14428((SubLObject)ConsesLow.list($g5427$.getDynamicValue(var275), var279, var280));
            if (NIL != module0173.f10969($g5418$.getDynamicValue(var275))) {
                var281 = conses_high.union(var281, module0217.f14428((SubLObject)ConsesLow.list($g5418$.getDynamicValue(var275), var279, var280)), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
            }
            SubLObject var37_276 = var281;
            SubLObject var282 = (SubLObject)NIL;
            var282 = var37_276.first();
            while (NIL != var37_276) {
                module0030.f1600(var282, var278, $g5410$.getDynamicValue(var275), (SubLObject)UNPROVIDED);
                final SubLObject var283 = var282;
                if (NIL == conses_high.member(var283, var276, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                    var276 = (SubLObject)ConsesLow.cons(var283, var276);
                }
                var37_276 = var37_276.rest();
                var282 = var37_276.first();
            }
            var277 = var277.rest();
            var278 = var277.first();
        }
        if (NIL != var276) {
            var277 = Sort.sort(var276, Symbols.symbol_function((SubLObject)$ic134$), Symbols.symbol_function((SubLObject)$ic135$));
            SubLObject var284 = (SubLObject)NIL;
            var284 = var277.first();
            while (NIL != var277) {
                final SubLObject var285 = Sort.sort(conses_high.copy_list(Hashtables.gethash(var284, $g5410$.getDynamicValue(var275), (SubLObject)UNPROVIDED)), Symbols.symbol_function((SubLObject)$ic134$), Symbols.symbol_function((SubLObject)$ic177$));
                final SubLObject var286 = conses_high.last(var285, (SubLObject)UNPROVIDED).first();
                module0642.f39026((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g459$.getGlobalValue());
                module0642.f39032(var273);
                final SubLObject var287 = $g5407$.getDynamicValue(var275);
                module0642.f39020(module0015.$g219$.getGlobalValue());
                if (NIL != var287) {
                    module0642.f39020(module0015.$g221$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var287);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var288 = module0015.$g533$.currentBinding(var275);
                try {
                    module0015.$g533$.bind((SubLObject)T, var275);
                    module0642.f39020(module0015.$g234$.getGlobalValue());
                    module0642.f39019((SubLObject)$ic241$);
                    module0656.f39804(var284, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    module0642.f39019((SubLObject)$ic242$);
                    SubLObject var37_277 = var285;
                    SubLObject var289 = (SubLObject)NIL;
                    var289 = var37_277.first();
                    while (NIL != var37_277) {
                        f42199(var289, (SubLObject)T);
                        if (!var289.equal(var286)) {
                            module0642.f39019((SubLObject)$ic216$);
                        }
                        var37_277 = var37_277.rest();
                        var289 = var37_277.first();
                    }
                    module0642.f39019((SubLObject)$ic243$);
                    module0642.f39020(module0015.$g235$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var288, var275);
                }
                module0642.f39020(module0015.$g220$.getGlobalValue());
                module0642.f39020(module0015.$g460$.getGlobalValue());
                var277 = var277.rest();
                var284 = var277.first();
            }
        }
        else {
            module0642.f39026((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g459$.getGlobalValue());
            module0642.f39032(var273);
            module0642.f39020(module0015.$g234$.getGlobalValue());
            module0642.f39019((SubLObject)$ic244$);
            module0642.f39020(module0015.$g235$.getGlobalValue());
            module0642.f39020(module0015.$g460$.getGlobalValue());
        }
        f42210();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42221() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        f42210();
        $g5414$.setDynamicValue((SubLObject)ZERO_INTEGER, var2);
        final SubLObject var3 = f42218();
        if (var3.numG((SubLObject)ZERO_INTEGER)) {
            SubLObject var4;
            SubLObject var5;
            SubLObject var7;
            SubLObject var6;
            SubLObject var8;
            for (var4 = (SubLObject)NIL, var4 = Numbers.subtract(var3, (SubLObject)ONE_INTEGER); !var4.numL((SubLObject)ZERO_INTEGER); var4 = Numbers.subtract(var4, (SubLObject)ONE_INTEGER)) {
                var5 = Hashtables.gethash(var4, $g5411$.getDynamicValue(var2), (SubLObject)UNPROVIDED);
                var6 = (var7 = Sort.sort(module0030.f1624(var5), Symbols.symbol_function((SubLObject)$ic245$), Symbols.symbol_function((SubLObject)$ic135$)));
                var8 = (SubLObject)NIL;
                var8 = var7.first();
                while (NIL != var7) {
                    f42222((SubLObject)NIL, var8, var5, var4, (SubLObject)ONE_INTEGER, (SubLObject)T);
                    var7 = var7.rest();
                    var8 = var7.first();
                }
            }
        }
        else if (NIL == $g5422$.getDynamicValue(var2) || $g5422$.getDynamicValue(var2).numG((SubLObject)ZERO_INTEGER)) {
            module0642.f39067();
            module0642.f39020(module0015.$g234$.getGlobalValue());
            module0642.f39019((SubLObject)$ic246$);
            module0642.f39020(module0015.$g235$.getGlobalValue());
            module0642.f39067();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42223(final SubLObject var273) {
        final SubLThread var274 = SubLProcess.currentSubLThread();
        if (!$g5414$.getDynamicValue(var274).numGE(var273)) {
            $g5414$.setDynamicValue(var273, var274);
        }
        return $g5414$.getDynamicValue(var274);
    }
    
    public static SubLObject f42222(final SubLObject var281, final SubLObject var161, final SubLObject var263, final SubLObject var259, final SubLObject var273, final SubLObject var282) {
        final SubLThread var283 = SubLProcess.currentSubLThread();
        final SubLObject var284 = Numbers.multiply(var273, $g5413$.getDynamicValue(var283));
        final SubLObject var285 = Sort.sort(Hashtables.gethash(var161, var263, (SubLObject)UNPROVIDED), Symbols.symbol_function((SubLObject)$ic245$), Symbols.symbol_function((SubLObject)$ic135$));
        final SubLObject var286 = Numbers.subtract(var259, (SubLObject)ONE_INTEGER);
        final SubLObject var287 = Hashtables.gethash(var286, $g5411$.getDynamicValue(var283), (SubLObject)UNPROVIDED);
        final SubLObject var288 = Numbers.add(var273, (SubLObject)ONE_INTEGER);
        final SubLObject var289 = $g5434$.currentBinding(var283);
        try {
            $g5434$.bind($g5435$.getDynamicValue(var283), var283);
            SubLObject var290 = (SubLObject)NIL;
            SubLObject var291 = (SubLObject)NIL;
            if (NIL == Hashtables.gethash((SubLObject)ConsesLow.list(var161, var259), $g5410$.getDynamicValue(var283), (SubLObject)UNPROVIDED) || NIL == var282) {
                var290 = (SubLObject)T;
                if (NIL != var282) {
                    final SubLObject var292 = (NIL != f42205(var161, (SubLObject)UNPROVIDED)) ? $g5403$.getDynamicValue(var283) : $g5401$.getDynamicValue(var283);
                    final SubLObject var293 = Sequences.length(var292);
                    module0642.f39026((SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g459$.getGlobalValue());
                    module0642.f39032(Numbers.subtract(var284, $g5413$.getDynamicValue(var283)));
                    module0642.f39020(module0015.$g234$.getGlobalValue());
                    PrintLow.format(module0015.$g131$.getDynamicValue(var283), var292);
                    module0642.f39020(module0015.$g235$.getGlobalValue());
                    module0642.f39020(module0015.$g460$.getGlobalValue());
                    module0642.f39020(module0015.$g459$.getGlobalValue());
                    module0642.f39032(Numbers.subtract(var284, var293));
                    f42199(var161, (SubLObject)T);
                    if (NIL == module0212.f13762(var161)) {
                        final SubLObject var294 = $g5407$.getDynamicValue(var283);
                        module0642.f39020(module0015.$g219$.getGlobalValue());
                        if (NIL != var294) {
                            module0642.f39020(module0015.$g221$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(var294);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        }
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var4_292 = module0015.$g533$.currentBinding(var283);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var283);
                            module0642.f39019((SubLObject)$ic247$);
                        }
                        finally {
                            module0015.$g533$.rebind(var4_292, var283);
                        }
                        module0642.f39020(module0015.$g220$.getGlobalValue());
                    }
                    module0642.f39020(module0015.$g460$.getGlobalValue());
                }
                else {
                    module0642.f39026((SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g459$.getGlobalValue());
                    module0642.f39032(var284);
                    f42199(var161, (SubLObject)T);
                    if (NIL == module0212.f13762(var161)) {
                        final SubLObject var295 = $g5407$.getDynamicValue(var283);
                        module0642.f39020(module0015.$g219$.getGlobalValue());
                        if (NIL != var295) {
                            module0642.f39020(module0015.$g221$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(var295);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        }
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var4_293 = module0015.$g533$.currentBinding(var283);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var283);
                            module0642.f39019((SubLObject)$ic247$);
                        }
                        finally {
                            module0015.$g533$.rebind(var4_293, var283);
                        }
                        module0642.f39020(module0015.$g220$.getGlobalValue());
                    }
                    module0642.f39020(module0015.$g460$.getGlobalValue());
                }
                $g5415$.setDynamicValue(Numbers.add($g5415$.getDynamicValue(var283), (SubLObject)ONE_INTEGER), var283);
                f42223(var273);
                if (NIL != $g5425$.getDynamicValue(var283) && NIL != var281) {
                    f42219(var161, var281, (SubLObject)$ic238$);
                }
            }
            Hashtables.sethash((SubLObject)ConsesLow.list(var161, var259), $g5410$.getDynamicValue(var283), (SubLObject)T);
            SubLObject var296 = var285;
            SubLObject var297 = (SubLObject)NIL;
            var297 = var296.first();
            while (NIL != var296) {
                module0030.f1615((SubLObject)ConsesLow.list(var161, var297), $g5410$.getDynamicValue(var283), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var298 = Hashtables.gethash((SubLObject)ConsesLow.list(var161, var297), $g5410$.getDynamicValue(var283), (SubLObject)UNPROVIDED);
                if (var298.numL((SubLObject)TWO_INTEGER)) {
                    f42207(var161);
                    if (var259.numG((SubLObject)ZERO_INTEGER)) {
                        f42222(var161, var297, var287, var286, var288, (SubLObject)NIL);
                    }
                }
                else if (var298.numGE((SubLObject)TWO_INTEGER) && NIL != var290 && var259.numG((SubLObject)ZERO_INTEGER) && NIL == var291) {
                    module0642.f39020(module0015.$g234$.getGlobalValue());
                    module0642.f39019($g5404$.getDynamicValue(var283));
                    module0642.f39020(module0015.$g235$.getGlobalValue());
                    final SubLObject var299 = $g5407$.getDynamicValue(var283);
                    module0642.f39020(module0015.$g219$.getGlobalValue());
                    if (NIL != var299) {
                        module0642.f39020(module0015.$g221$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(var299);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_294 = module0015.$g533$.currentBinding(var283);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var283);
                        module0642.f39019($g5405$.getDynamicValue(var283));
                    }
                    finally {
                        module0015.$g533$.rebind(var4_294, var283);
                    }
                    module0642.f39020(module0015.$g220$.getGlobalValue());
                    f42207(var161);
                    var291 = (SubLObject)T;
                }
                var296 = var296.rest();
                var297 = var296.first();
            }
        }
        finally {
            $g5434$.rebind(var289, var283);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42224(final SubLObject var1, final SubLObject var273) {
        final SubLThread var274 = SubLProcess.currentSubLThread();
        final SubLObject var275 = $g5434$.currentBinding(var274);
        try {
            $g5434$.bind($g5435$.getDynamicValue(var274), var274);
            final SubLObject var276 = f42205(var1, (SubLObject)UNPROVIDED);
            final SubLObject var277 = Numbers.multiply(var273, $g5413$.getDynamicValue(var274));
            module0642.f39026((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g459$.getGlobalValue());
            module0642.f39032(var277);
            final SubLObject var278 = $g5406$.getDynamicValue(var274);
            module0642.f39020(module0015.$g219$.getGlobalValue());
            if (NIL != var278) {
                module0642.f39020(module0015.$g221$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var278);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var4_297 = module0015.$g533$.currentBinding(var274);
            try {
                module0015.$g533$.bind((SubLObject)T, var274);
                module0642.f39020(module0015.$g234$.getGlobalValue());
                f42199(var1, (SubLObject)T);
                module0642.f39020(module0015.$g235$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var4_297, var274);
            }
            module0642.f39020(module0015.$g220$.getGlobalValue());
            module0642.f39020(module0015.$g460$.getGlobalValue());
            $g5415$.setDynamicValue(Numbers.add($g5415$.getDynamicValue(var274), (SubLObject)ONE_INTEGER), var274);
            if (NIL != $g5425$.getDynamicValue(var274) && NIL != var276) {
                f42220(var1, var276, var277, (SubLObject)$ic238$);
            }
            f42207(var1);
        }
        finally {
            $g5434$.rebind(var275, var274);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42225(final SubLObject var1, final SubLObject var298, final SubLObject var132) {
        final SubLThread var299 = SubLProcess.currentSubLThread();
        final SubLObject var300 = $g5398$.currentBinding(var299);
        try {
            $g5398$.bind((NIL != $g5398$.getDynamicValue(var299)) ? $g5398$.getDynamicValue(var299) : module0656.f39842($g5409$.getDynamicValue(var299)), var299);
            final SubLObject var301 = module0656.f39943($g5398$.getDynamicValue(var299), (SubLObject)UNPROVIDED);
            final SubLObject var302 = (SubLObject)((NIL != module0173.f10969(var1)) ? module0656.f39842(var1) : NIL);
            final SubLObject var303 = Hashtables.gethash(var302, $g5412$.getDynamicValue(var299), (SubLObject)UNPROVIDED);
            final SubLObject var304 = Numbers.multiply(var132, $g5413$.getDynamicValue(var299));
            final SubLObject var305 = f42205(var1, (SubLObject)UNPROVIDED);
            final SubLObject var306 = Sort.sort(var305, Symbols.symbol_function((SubLObject)$ic134$), Symbols.symbol_function((SubLObject)$ic177$));
            if (NIL != var302 && (NIL == var298 || var132.numL(var298))) {
                module0642.f39026((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g459$.getGlobalValue());
                module0642.f39032(var304);
                Hashtables.sethash(var302, $g5412$.getDynamicValue(var299), (SubLObject)T);
                f42199(var1, (SubLObject)T);
                $g5415$.setDynamicValue(Numbers.add($g5415$.getDynamicValue(var299), (SubLObject)ONE_INTEGER), var299);
                if (NIL != var301 && NIL != $g5425$.getDynamicValue(var299)) {
                    f42219(var1, var301, (SubLObject)$ic238$);
                }
                if (NIL != var303) {
                    if (NIL != var305) {
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0642.f39019($g5404$.getDynamicValue(var299));
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                        final SubLObject var307 = $g5407$.getDynamicValue(var299);
                        module0642.f39020(module0015.$g219$.getGlobalValue());
                        if (NIL != var307) {
                            module0642.f39020(module0015.$g221$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(var307);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        }
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var4_302 = module0015.$g533$.currentBinding(var299);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var299);
                            module0642.f39019($g5405$.getDynamicValue(var299));
                        }
                        finally {
                            module0015.$g533$.rebind(var4_302, var299);
                        }
                        module0642.f39020(module0015.$g220$.getGlobalValue());
                    }
                    else {
                        module0642.f39019($g5402$.getDynamicValue(var299));
                    }
                }
                else if (var298.isInteger() && var132.numLE(Numbers.subtract(var298, (SubLObject)ONE_INTEGER))) {
                    module0642.f39020(module0015.$g234$.getGlobalValue());
                    if (NIL != var305) {
                        if (var132.numE(Numbers.subtract(var298, (SubLObject)ONE_INTEGER))) {
                            module0642.f39019($g5404$.getDynamicValue(var299));
                        }
                    }
                    else {
                        module0642.f39019($g5402$.getDynamicValue(var299));
                    }
                    module0642.f39020(module0015.$g235$.getGlobalValue());
                }
                else if (NIL == var298 && NIL == var305) {
                    module0642.f39020(module0015.$g234$.getGlobalValue());
                    module0642.f39019($g5402$.getDynamicValue(var299));
                    module0642.f39020(module0015.$g235$.getGlobalValue());
                }
                module0642.f39020(module0015.$g460$.getGlobalValue());
                f42207(var1);
                if (NIL == var303) {
                    SubLObject var308 = var306;
                    SubLObject var309 = (SubLObject)NIL;
                    var309 = var308.first();
                    while (NIL != var308) {
                        final SubLObject var4_303 = $g5398$.currentBinding(var299);
                        try {
                            $g5398$.bind(var302, var299);
                            f42225(var309, var298, Numbers.add(var132, (SubLObject)ONE_INTEGER));
                        }
                        finally {
                            $g5398$.rebind(var4_303, var299);
                        }
                        var308 = var308.rest();
                        var309 = var308.first();
                    }
                }
            }
            else if (NIL == var298 || var132.numL(var298)) {
                module0642.f39026((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g459$.getGlobalValue());
                module0642.f39032(var304);
                module0656.f39804(var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var307 = $g5407$.getDynamicValue(var299);
                module0642.f39020(module0015.$g219$.getGlobalValue());
                if (NIL != var307) {
                    module0642.f39020(module0015.$g221$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var307);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_304 = module0015.$g533$.currentBinding(var299);
                try {
                    module0015.$g533$.bind((SubLObject)T, var299);
                    module0642.f39019((SubLObject)$ic247$);
                }
                finally {
                    module0015.$g533$.rebind(var4_304, var299);
                }
                module0642.f39020(module0015.$g220$.getGlobalValue());
                module0642.f39020(module0015.$g460$.getGlobalValue());
            }
        }
        finally {
            $g5398$.rebind(var300, var299);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42226(final SubLObject var1, final SubLObject var132, final SubLObject var273) {
        final SubLThread var274 = SubLProcess.currentSubLThread();
        f42211();
        if (!$g5421$.getDynamicValue(var274).equal((SubLObject)ZERO_INTEGER)) {
            final SubLObject var275 = module0656.f39842(var1);
            final SubLObject var276 = f42205(var1, (SubLObject)UNPROVIDED);
            final SubLObject var277 = Sort.sort(var276, Symbols.symbol_function((SubLObject)$ic134$), Symbols.symbol_function((SubLObject)$ic177$));
            final SubLObject var278 = (SubLObject)(var132.isInteger() ? Numbers.add(var273, var132) : NIL);
            if (NIL != var277 && !var132.equal((SubLObject)ZERO_INTEGER)) {
                SubLObject var279 = var277;
                SubLObject var280 = (SubLObject)NIL;
                var280 = var279.first();
                while (NIL != var279) {
                    final SubLObject var281 = $g5398$.currentBinding(var274);
                    try {
                        $g5398$.bind(var275, var274);
                        f42225(var280, var278, var273);
                        module0642.f39011();
                    }
                    finally {
                        $g5398$.rebind(var281, var274);
                    }
                    var279 = var279.rest();
                    var280 = var279.first();
                }
            }
            else {
                module0642.f39067();
                module0642.f39067();
                module0642.f39020(module0015.$g234$.getGlobalValue());
                module0642.f39019((SubLObject)$ic248$);
                module0642.f39020(module0015.$g235$.getGlobalValue());
            }
        }
        f42211();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42215(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (!$g5413$.getDynamicValue(var2).isInteger() || !$g5413$.getDynamicValue(var2).numGE((SubLObject)ZERO_INTEGER)) {
            $g5413$.setDynamicValue((SubLObject)TWO_INTEGER, var2);
        }
        f42227(var1);
        SubLObject var3 = (SubLObject)ONE_INTEGER;
        f42216(var1);
        f42221();
        var3 = Numbers.add($g5414$.getDynamicValue(var2), (SubLObject)ONE_INTEGER);
        f42224(var1, var3);
        var3 = Numbers.add(var3, (SubLObject)ONE_INTEGER);
        f42226(var1, $g5420$.getDynamicValue(var2), var3);
        if ($g5415$.getDynamicValue(var2).numG($g5416$.getDynamicValue(var2))) {
            module0642.f39067();
            module0642.f39067();
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g383$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_hash, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic76$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var4 = module0015.$g533$.currentBinding(var2);
            try {
                module0015.$g533$.bind((SubLObject)T, var2);
                module0642.f39019((SubLObject)$ic249$);
            }
            finally {
                module0015.$g533$.rebind(var4, var2);
            }
            module0642.f39020(module0015.$g382$.getGlobalValue());
        }
        $g5415$.setDynamicValue((SubLObject)ZERO_INTEGER, var2);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42227(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        $g5420$.setDynamicValue((SubLObject)ZERO_INTEGER, var2);
        if ($g5421$.getDynamicValue(var2).equal((SubLObject)ONE_INTEGER)) {
            $g5420$.setDynamicValue((SubLObject)ONE_INTEGER, var2);
        }
        else if (NIL == $g5421$.getDynamicValue(var2) && (!$g5423$.getDynamicValue(var2).isInteger() || !$g5423$.getDynamicValue(var2).numGE((SubLObject)ZERO_INTEGER))) {
            $g5420$.setDynamicValue((SubLObject)NIL, var2);
        }
        else if (NIL == $g5421$.getDynamicValue(var2)) {
            $g5420$.setDynamicValue($g5421$.getDynamicValue(var2), var2);
        }
        else {
            $g5415$.setDynamicValue((SubLObject)ZERO_INTEGER, var2);
            SubLObject var3 = (SubLObject)ZERO_INTEGER;
            SubLObject var4 = (SubLObject)ZERO_INTEGER;
            SubLObject var5 = (SubLObject)ConsesLow.list(var1);
            SubLObject var6 = (SubLObject)NIL;
            while (NIL != var5 && (!$g5423$.getDynamicValue(var2).isInteger() || !$g5415$.getDynamicValue(var2).numG($g5423$.getDynamicValue(var2)) || !var3.numG((SubLObject)ONE_INTEGER)) && (!$g5421$.getDynamicValue(var2).isInteger() || !var3.numG($g5421$.getDynamicValue(var2)))) {
                SubLObject var7 = (SubLObject)NIL;
                if (NIL == var7) {
                    SubLObject var8 = var5;
                    SubLObject var9 = (SubLObject)NIL;
                    var9 = var8.first();
                    while (NIL == var7 && NIL != var8) {
                        final SubLObject var10 = f42205(var9, (SubLObject)UNPROVIDED);
                        var6 = ConsesLow.append(var6, var10);
                        var4 = $g5415$.getDynamicValue(var2);
                        $g5415$.setDynamicValue(Numbers.add($g5415$.getDynamicValue(var2), Sequences.length(var10)), var2);
                        if ($g5423$.getDynamicValue(var2).isInteger() && $g5415$.getDynamicValue(var2).numG($g5423$.getDynamicValue(var2))) {
                            var7 = (SubLObject)T;
                        }
                        var8 = var8.rest();
                        var9 = var8.first();
                    }
                }
                var5 = var6;
                var6 = (SubLObject)NIL;
                var3 = Numbers.add(var3, (SubLObject)ONE_INTEGER);
                if (NIL != $g5436$.getDynamicValue(var2)) {
                    PrintLow.format((SubLObject)T, (SubLObject)$ic250$);
                    PrintLow.format((SubLObject)T, (SubLObject)$ic251$, var3);
                    PrintLow.format((SubLObject)T, (SubLObject)$ic252$);
                    PrintLow.format((SubLObject)T, (SubLObject)$ic253$, $g5415$.getDynamicValue(var2));
                }
            }
            $g5415$.setDynamicValue(var4, var2);
            $g5420$.setDynamicValue(Numbers.subtract(var3, (SubLObject)ONE_INTEGER), var2);
            if (NIL != $g5436$.getDynamicValue(var2)) {
                PrintLow.format((SubLObject)T, (SubLObject)$ic250$);
                PrintLow.format((SubLObject)T, (SubLObject)$ic254$, $g5420$.getDynamicValue(var2));
            }
        }
        $g5415$.setDynamicValue((SubLObject)ZERO_INTEGER, var2);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42228(SubLObject var17) {
        if (var17 == UNPROVIDED) {
            var17 = (SubLObject)NIL;
        }
        f42213();
        f42187((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42229(SubLObject var311) {
        if (var311 == UNPROVIDED) {
            var311 = (SubLObject)NIL;
        }
        final SubLThread var312 = SubLProcess.currentSubLThread();
        if (NIL == var311) {
            var311 = (SubLObject)$ic256$;
        }
        final SubLObject var313 = module0656.f39832((SubLObject)$ic257$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)$ic258$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var313) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var313);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var314 = module0015.$g533$.currentBinding(var312);
        try {
            module0015.$g533$.bind((SubLObject)T, var312);
            module0642.f39019(var311);
        }
        finally {
            module0015.$g533$.rebind(var314, var312);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42230(final SubLObject var17) {
        SubLObject var18 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var17, var17, (SubLObject)$ic263$);
        var18 = var17.first();
        final SubLObject var19 = var17.rest();
        if (NIL == var19) {
            SubLObject var20 = (SubLObject)NIL;
            var20 = module0656.f39943(var18, (SubLObject)UNPROVIDED);
            if (NIL == module0173.f10955(var20)) {
                return module0656.f39789((SubLObject)$ic264$, var18, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            f42231(var20);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var17, (SubLObject)$ic263$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42231(final SubLObject var1) {
        f42191(var1);
        return f42192((SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f42232(final SubLObject var17) {
        SubLObject var18 = (SubLObject)NIL;
        SubLObject var19 = (SubLObject)NIL;
        SubLObject var20 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var17, var17, (SubLObject)$ic266$);
        var18 = var17.first();
        SubLObject var21 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var21, var17, (SubLObject)$ic266$);
        var19 = var21.first();
        var21 = var21.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var21, var17, (SubLObject)$ic266$);
        var20 = var21.first();
        var21 = var21.rest();
        final SubLObject var22 = (SubLObject)(var21.isCons() ? var21.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var21, var17, (SubLObject)$ic266$);
        var21 = var21.rest();
        if (NIL == var21) {
            SubLObject var23 = (SubLObject)NIL;
            SubLObject var24 = (SubLObject)NIL;
            SubLObject var25 = (SubLObject)NIL;
            SubLObject var26 = (SubLObject)NIL;
            var23 = module0656.f39943(var18, (SubLObject)UNPROVIDED);
            if (NIL == module0173.f10955(var23)) {
                return module0656.f39789((SubLObject)$ic264$, var18, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            var24 = reader.read_from_string_ignoring_errors(var19, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (!var24.isFixnum()) {
                return module0656.f39789((SubLObject)$ic267$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            var25 = module0656.f39943(var20, (SubLObject)UNPROVIDED);
            if (NIL == module0173.f10955(var25)) {
                return module0656.f39789((SubLObject)$ic264$, var20, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            if (NIL != var22) {
                var26 = module0656.f39957(var22, (SubLObject)UNPROVIDED);
                if (NIL == module0161.f10481(var26)) {
                    return module0656.f39789((SubLObject)$ic264$, var22, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
            }
            f42233(var23, var24, var25, var26);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var17, (SubLObject)$ic266$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42233(final SubLObject var1, final SubLObject var321, final SubLObject var153, SubLObject var123) {
        if (var123 == UNPROVIDED) {
            var123 = (SubLObject)NIL;
        }
        final SubLThread var322 = SubLProcess.currentSubLThread();
        final SubLObject var323 = Sequences.find(var153, $g5394$.getDynamicValue(var322), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)$ic269$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        $g5409$.setDynamicValue(var1, var322);
        $g5427$.setDynamicValue(var153, var322);
        $g5426$.setDynamicValue((SubLObject)((NIL != var123) ? var123 : $ic45$), var322);
        if ($g5426$.getDynamicValue(var322) != $ic45$) {
            $g5430$.setDynamicValue((SubLObject)T, var322);
        }
        $g5428$.setDynamicValue((NIL != var323) ? conses_high.third(var323) : var321, var322);
        $g5429$.setDynamicValue((SubLObject)($g5428$.getDynamicValue(var322).numE((SubLObject)ONE_INTEGER) ? TWO_INTEGER : ONE_INTEGER), var322);
        $g5422$.setDynamicValue((SubLObject)TWO_INTEGER, var322);
        $g5421$.setDynamicValue((SubLObject)TWO_INTEGER, var322);
        return f42192((SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f42234() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0687", "f42178", "S#46164", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0687", "f42179", "S#44181", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0687", "f42180", "S#46165", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0687", "f42181", "S#46166", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0687", "f42182", "S#46167", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0687", "f42183", "S#46168", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0687", "f42184", "S#46169", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0687", "f42185", "S#46170", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0687", "f42186", "S#46171", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0687", "f42187", "HB-PARAMETERS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0687", "f42188", "HB-COLORS-AND-SYMBOLS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0687", "f42189", "S#46172", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0687", "f42190", "HB-HANDLE-PARAMETERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0687", "f42194", "HB-HANDLE-COLORS-AND-SYMBOLS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0687", "f42191", "S#46173", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0687", "f42196", "S#46174", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0687", "f42197", "HB-HANDLE-SIMPLE-CHOOSE-CONSTANTS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0687", "f42193", "S#46175", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0687", "f42198", "S#46176", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0687", "f42200", "HB-HANDLE-COMPLEX-CHOOSE-CONSTANTS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0687", "f42201", "HB-SELECT-NODE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0687", "f42202", "S#46177", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0687", "f42203", "S#46178", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0687", "f42204", "S#46179", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0687", "f42205", "S#46180", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0687", "f42206", "S#46181", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0687", "f42207", "S#46182", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0687", "f42195", "S#46183", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0687", "f42199", "S#46184", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0687", "f42208", "S#46185", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0687", "f42209", "S#46186", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0687", "f42210", "S#46187", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0687", "f42211", "S#46188", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0687", "f42212", "S#46189", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0687", "f42213", "S#46190", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0687", "f42214", "S#46191", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0687", "f42192", "HB-PRINT-NODES", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0687", "f42216", "S#46192", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0687", "f42218", "S#46193", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0687", "f42217", "S#46194", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0687", "f42219", "S#46195", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0687", "f42220", "S#46196", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0687", "f42221", "S#46197", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0687", "f42223", "S#46198", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0687", "f42222", "S#46199", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0687", "f42224", "S#46200", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0687", "f42225", "S#46201", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0687", "f42226", "S#46202", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0687", "f42215", "S#46203", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0687", "f42227", "S#46204", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0687", "f42228", "HB-START", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0687", "f42229", "S#46205", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0687", "f42230", "CB-HIER-DEFAULT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0687", "f42231", "S#46206", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0687", "f42232", "CB-HIER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0687", "f42233", "S#46207", 3, 1, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42235() {
        $g5394$ = SubLFiles.defparameter("S#46208", (SubLObject)$ic0$);
        $g5395$ = SubLFiles.defparameter("S#46209", (SubLObject)$ic1$);
        $g5396$ = SubLFiles.defparameter("S#46210", (SubLObject)$ic9$);
        $g5397$ = SubLFiles.defparameter("S#46211", (SubLObject)$ic10$);
        $g5398$ = SubLFiles.defparameter("S#46212", (SubLObject)NIL);
        $g5399$ = SubLFiles.defparameter("S#46213", (SubLObject)NIL);
        $g5400$ = SubLFiles.defparameter("S#46214", (SubLObject)NIL);
        $g5401$ = SubLFiles.defparameter("S#46215", (SubLObject)$ic14$);
        $g5402$ = SubLFiles.defparameter("S#46216", (SubLObject)$ic16$);
        $g5403$ = SubLFiles.defparameter("S#46217", (SubLObject)$ic18$);
        $g5404$ = SubLFiles.defparameter("S#46218", (SubLObject)$ic20$);
        $g5405$ = SubLFiles.defparameter("S#46219", (SubLObject)$ic22$);
        $g5406$ = SubLFiles.defparameter("S#46220", (SubLObject)FIVE_INTEGER);
        $g5407$ = SubLFiles.defparameter("S#46221", (SubLObject)TWO_INTEGER);
        $g5408$ = SubLFiles.defparameter("S#46222", (SubLObject)ONE_INTEGER);
        $g5409$ = SubLFiles.defparameter("S#46223", (SubLObject)NIL);
        $g5410$ = SubLFiles.defparameter("S#46224", (SubLObject)NIL);
        $g5411$ = SubLFiles.defparameter("S#46225", (SubLObject)NIL);
        $g5412$ = SubLFiles.defparameter("S#46226", (SubLObject)NIL);
        $g5413$ = SubLFiles.defparameter("S#46227", (SubLObject)THREE_INTEGER);
        $g5414$ = SubLFiles.defparameter("S#46228", (SubLObject)ZERO_INTEGER);
        $g5415$ = SubLFiles.defparameter("S#46229", (SubLObject)ZERO_INTEGER);
        $g5416$ = SubLFiles.defparameter("S#46230", (SubLObject)TEN_INTEGER);
        $g5417$ = SubLFiles.defparameter("S#46231", (SubLObject)NIL);
        $g5418$ = SubLFiles.defparameter("S#46232", (SubLObject)NIL);
        $g5419$ = SubLFiles.defparameter("S#46233", (SubLObject)NIL);
        $g5420$ = SubLFiles.defparameter("S#46234", (SubLObject)ZERO_INTEGER);
        $g5421$ = SubLFiles.defparameter("S#46235", (SubLObject)FOUR_INTEGER);
        $g5422$ = SubLFiles.defparameter("S#46236", (SubLObject)FOUR_INTEGER);
        $g5423$ = SubLFiles.defparameter("S#46237", (SubLObject)$ic41$);
        $g5424$ = SubLFiles.defparameter("S#46238", (SubLObject)NIL);
        $g5425$ = SubLFiles.defparameter("S#46239", (SubLObject)T);
        $g5426$ = SubLFiles.defparameter("S#46240", (SubLObject)$ic45$);
        $g5427$ = SubLFiles.defparameter("S#46241", (SubLObject)NIL);
        $g5428$ = SubLFiles.defparameter("S#46242", (SubLObject)TWO_INTEGER);
        $g5429$ = SubLFiles.defparameter("S#46243", (SubLObject)ONE_INTEGER);
        $g5430$ = SubLFiles.defparameter("S#46244", (SubLObject)NIL);
        $g5431$ = SubLFiles.defparameter("S#46245", (SubLObject)$ic51$);
        $g5432$ = SubLFiles.defparameter("S#46246", (SubLObject)$ic53$);
        $g5433$ = SubLFiles.defparameter("S#46247", (SubLObject)NIL);
        $g5434$ = SubLFiles.defparameter("S#46248", (SubLObject)NIL);
        $g5435$ = SubLFiles.defparameter("S#46249", (SubLObject)NIL);
        $g5436$ = SubLFiles.defparameter("S#46250", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42236() {
        Hashtables.sethash((SubLObject)$ic2$, module0014.$g128$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)$ic4$));
        Hashtables.sethash((SubLObject)$ic5$, module0014.$g128$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic6$, (SubLObject)$ic4$));
        Hashtables.sethash((SubLObject)$ic7$, module0014.$g128$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic8$, (SubLObject)$ic4$));
        Hashtables.sethash((SubLObject)$ic10$, module0014.$g128$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic11$, (SubLObject)NIL));
        module0012.f441((SubLObject)$ic12$);
        module0012.f444((SubLObject)$ic12$);
        module0012.f441((SubLObject)$ic13$);
        module0012.f444((SubLObject)$ic13$);
        module0012.f441((SubLObject)$ic15$);
        module0012.f444((SubLObject)$ic15$);
        module0012.f441((SubLObject)$ic17$);
        module0012.f444((SubLObject)$ic17$);
        module0012.f441((SubLObject)$ic19$);
        module0012.f444((SubLObject)$ic19$);
        module0012.f441((SubLObject)$ic21$);
        module0012.f444((SubLObject)$ic21$);
        module0012.f441((SubLObject)$ic23$);
        module0012.f444((SubLObject)$ic23$);
        module0012.f441((SubLObject)$ic24$);
        module0012.f441((SubLObject)$ic25$);
        module0012.f441((SubLObject)$ic26$);
        module0012.f441((SubLObject)$ic27$);
        module0012.f441((SubLObject)$ic28$);
        module0012.f441((SubLObject)$ic29$);
        module0012.f441((SubLObject)$ic30$);
        module0012.f441((SubLObject)$ic31$);
        module0012.f444((SubLObject)$ic31$);
        module0012.f441((SubLObject)$ic32$);
        module0012.f441((SubLObject)$ic33$);
        module0012.f441((SubLObject)$ic34$);
        module0012.f441((SubLObject)$ic35$);
        module0012.f441((SubLObject)$ic36$);
        module0012.f441((SubLObject)$ic37$);
        module0012.f444((SubLObject)$ic37$);
        module0012.f441((SubLObject)$ic38$);
        module0012.f441((SubLObject)$ic39$);
        module0012.f444((SubLObject)$ic39$);
        module0012.f441((SubLObject)$ic40$);
        module0012.f444((SubLObject)$ic40$);
        module0012.f441((SubLObject)$ic42$);
        module0012.f444((SubLObject)$ic42$);
        module0012.f441((SubLObject)$ic43$);
        module0012.f444((SubLObject)$ic43$);
        module0012.f441((SubLObject)$ic44$);
        module0012.f444((SubLObject)$ic44$);
        module0012.f441((SubLObject)$ic46$);
        module0012.f444((SubLObject)$ic46$);
        module0012.f441((SubLObject)$ic47$);
        module0012.f441((SubLObject)$ic48$);
        module0012.f444((SubLObject)$ic48$);
        module0012.f441((SubLObject)$ic49$);
        module0012.f441((SubLObject)$ic50$);
        module0012.f444((SubLObject)$ic50$);
        module0012.f441((SubLObject)$ic52$);
        module0012.f444((SubLObject)$ic52$);
        module0012.f441((SubLObject)$ic54$);
        module0012.f444((SubLObject)$ic54$);
        module0012.f441((SubLObject)$ic55$);
        module0012.f441((SubLObject)$ic56$);
        module0012.f441((SubLObject)$ic57$);
        Hashtables.sethash((SubLObject)$ic136$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic137$, (SubLObject)NIL));
        module0015.f873((SubLObject)$ic147$);
        module0015.f873((SubLObject)$ic152$);
        module0015.f873((SubLObject)$ic169$);
        module0015.f873((SubLObject)$ic173$);
        module0015.f873((SubLObject)$ic188$);
        module0015.f873((SubLObject)$ic199$);
        module0015.f873((SubLObject)$ic200$);
        Hashtables.sethash((SubLObject)$ic229$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic230$, (SubLObject)NIL));
        module0015.f873((SubLObject)$ic236$);
        module0015.f873((SubLObject)$ic255$);
        module0656.f39840((SubLObject)$ic259$, (SubLObject)$ic260$, (SubLObject)ONE_INTEGER);
        module0656.f39819((SubLObject)$ic259$, (SubLObject)$ic261$, (SubLObject)$ic256$, (SubLObject)$ic262$);
        module0015.f873((SubLObject)$ic265$);
        module0015.f873((SubLObject)$ic268$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f42234();
    }
    
    public void initializeVariables() {
        f42235();
    }
    
    public void runTopLevelForms() {
        f42236();
    }
    
    static {
        me = (SubLFile)new module0687();
        $g5394$ = null;
        $g5395$ = null;
        $g5396$ = null;
        $g5397$ = null;
        $g5398$ = null;
        $g5399$ = null;
        $g5400$ = null;
        $g5401$ = null;
        $g5402$ = null;
        $g5403$ = null;
        $g5404$ = null;
        $g5405$ = null;
        $g5406$ = null;
        $g5407$ = null;
        $g5408$ = null;
        $g5409$ = null;
        $g5410$ = null;
        $g5411$ = null;
        $g5412$ = null;
        $g5413$ = null;
        $g5414$ = null;
        $g5415$ = null;
        $g5416$ = null;
        $g5417$ = null;
        $g5418$ = null;
        $g5419$ = null;
        $g5420$ = null;
        $g5421$ = null;
        $g5422$ = null;
        $g5423$ = null;
        $g5424$ = null;
        $g5425$ = null;
        $g5426$ = null;
        $g5427$ = null;
        $g5428$ = null;
        $g5429$ = null;
        $g5430$ = null;
        $g5431$ = null;
        $g5432$ = null;
        $g5433$ = null;
        $g5434$ = null;
        $g5435$ = null;
        $g5436$ = null;
        $ic0$ = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Collection")), constant_handles_oc.f8479((SubLObject)makeString("genls")), (SubLObject)TWO_INTEGER, (SubLObject)ONE_INTEGER, (SubLObject)TWO_INTEGER, (SubLObject)TWO_INTEGER), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Predicate")), constant_handles_oc.f8479((SubLObject)makeString("genlPreds")), (SubLObject)TWO_INTEGER, (SubLObject)ONE_INTEGER, (SubLObject)FIVE_INTEGER, (SubLObject)FIVE_INTEGER), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Microtheory")), constant_handles_oc.f8479((SubLObject)makeString("genlMt")), (SubLObject)TWO_INTEGER, (SubLObject)ONE_INTEGER, (SubLObject)TWO_INTEGER, (SubLObject)TWO_INTEGER), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("GeographicalRegion")), constant_handles_oc.f8479((SubLObject)makeString("geographicalSubRegions")), (SubLObject)ONE_INTEGER, (SubLObject)TWO_INTEGER, (SubLObject)TWO_INTEGER, (SubLObject)TWO_INTEGER), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("CollectionDenotingFunction")), constant_handles_oc.f8479((SubLObject)makeString("genlFuncs")), (SubLObject)TWO_INTEGER, (SubLObject)ONE_INTEGER, (SubLObject)FIVE_INTEGER, (SubLObject)FIVE_INTEGER), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("ScientificFieldOfStudy")), constant_handles_oc.f8479((SubLObject)makeString("subFields")), (SubLObject)ONE_INTEGER, (SubLObject)TWO_INTEGER, (SubLObject)FIVE_INTEGER, (SubLObject)FIVE_INTEGER));
        $ic1$ = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("genlPreds")), constant_handles_oc.f8479((SubLObject)makeString("genlInverse"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("genlInverse")), constant_handles_oc.f8479((SubLObject)makeString("genlPreds"))));
        $ic2$ = makeKeyword("YELLOW-STAR");
        $ic3$ = makeString("star.gif");
        $ic4$ = makeString("*");
        $ic5$ = makeKeyword("GREEN-STAR");
        $ic6$ = makeString("grnstar.gif");
        $ic7$ = makeKeyword("CYAN-STAR");
        $ic8$ = makeString("cyanstar.gif");
        $ic9$ = ConsesLow.list((SubLObject)makeString("*"), (SubLObject)makeKeyword("RED-DIAMOND"), (SubLObject)makeKeyword("YELLOW-STAR"), (SubLObject)makeKeyword("GREEN-STAR"), (SubLObject)makeKeyword("CYAN-STAR"));
        $ic10$ = makeKeyword("CELTIC-BAR");
        $ic11$ = makeString("celtic_bar.gif");
        $ic12$ = makeSymbol("S#46213", "CYC");
        $ic13$ = makeSymbol("S#46214", "CYC");
        $ic14$ = makeString("-> ");
        $ic15$ = makeSymbol("S#46215", "CYC");
        $ic16$ = makeString(" <-");
        $ic17$ = makeSymbol("S#46216", "CYC");
        $ic18$ = makeString("... ");
        $ic19$ = makeSymbol("S#46217", "CYC");
        $ic20$ = makeString(" ...");
        $ic21$ = makeSymbol("S#46218", "CYC");
        $ic22$ = makeString(" *see above*");
        $ic23$ = makeSymbol("S#46219", "CYC");
        $ic24$ = makeSymbol("S#46220", "CYC");
        $ic25$ = makeSymbol("S#46221", "CYC");
        $ic26$ = makeSymbol("S#46222", "CYC");
        $ic27$ = makeSymbol("S#46223", "CYC");
        $ic28$ = makeSymbol("S#46224", "CYC");
        $ic29$ = makeSymbol("S#46225", "CYC");
        $ic30$ = makeSymbol("S#46226", "CYC");
        $ic31$ = makeSymbol("S#46227", "CYC");
        $ic32$ = makeSymbol("S#46228", "CYC");
        $ic33$ = makeSymbol("S#46229", "CYC");
        $ic34$ = makeSymbol("S#46230", "CYC");
        $ic35$ = makeSymbol("S#46231", "CYC");
        $ic36$ = makeSymbol("S#46232", "CYC");
        $ic37$ = makeSymbol("S#46233", "CYC");
        $ic38$ = makeSymbol("S#46234", "CYC");
        $ic39$ = makeSymbol("S#46235", "CYC");
        $ic40$ = makeSymbol("S#46236", "CYC");
        $ic41$ = makeInteger(200);
        $ic42$ = makeSymbol("S#46237", "CYC");
        $ic43$ = makeSymbol("S#46238", "CYC");
        $ic44$ = makeSymbol("S#46239", "CYC");
        $ic45$ = makeKeyword("ALL");
        $ic46$ = makeSymbol("S#46240", "CYC");
        $ic47$ = makeSymbol("S#46241", "CYC");
        $ic48$ = makeSymbol("S#46242", "CYC");
        $ic49$ = makeSymbol("S#46243", "CYC");
        $ic50$ = makeSymbol("S#46244", "CYC");
        $ic51$ = makeKeyword("LIGHT-GRAY");
        $ic52$ = makeSymbol("S#46245", "CYC");
        $ic53$ = makeKeyword("RED");
        $ic54$ = makeSymbol("S#46246", "CYC");
        $ic55$ = makeSymbol("S#46247", "CYC");
        $ic56$ = makeSymbol("S#46248", "CYC");
        $ic57$ = makeSymbol("S#46249", "CYC");
        $ic58$ = makeSymbol("S#12274", "CYC");
        $ic59$ = constant_handles_oc.f8479((SubLObject)makeString("EverythingPSC"));
        $ic60$ = makeKeyword("RED-DIAMOND");
        $ic61$ = makeString("");
        $ic62$ = makeString("Starting Term");
        $ic63$ = makeString("Current Term: ");
        $ic64$ = makeString("+2");
        $ic65$ = makeString("None");
        $ic66$ = makeString("cur-term");
        $ic67$ = makeString("Change Term: ");
        $ic68$ = makeString("new-term");
        $ic69$ = makeString("Complete");
        $ic70$ = makeInteger(25);
        $ic71$ = makeString("defaults-for-type");
        $ic72$ = makeString(" Use default settings for term");
        $ic73$ = makeKeyword("TOP");
        $ic74$ = makeString("Specify Non-Default Settings");
        $ic75$ = makeString("middle");
        $ic76$ = makeString("top");
        $ic77$ = makeString("Binary Predicate");
        $ic78$ = makeString("pred");
        $ic79$ = constant_handles_oc.f8479((SubLObject)makeString("BinaryPredicate"));
        $ic80$ = makeString("Index Argument");
        $ic81$ = makeString("index");
        $ic82$ = makeString(" 1");
        $ic83$ = makeString(" 2");
        $ic84$ = makeString("Microtheory");
        $ic85$ = makeString("mt");
        $ic86$ = constant_handles_oc.f8479((SubLObject)makeString("Microtheory"));
        $ic87$ = makeString("genl-mts");
        $ic88$ = makeString(" Use its genl mts too, if possible");
        $ic89$ = makeString("all-mts");
        $ic90$ = makeString(" Use all mts");
        $ic91$ = makeString("Height and Depth");
        $ic92$ = makeString("right");
        $ic93$ = makeString("Max height: ");
        $ic94$ = makeString("height");
        $ic95$ = makeSymbol("ALL");
        $ic96$ = makeSymbol("NONE");
        $ic97$ = ConsesLow.list(new SubLObject[] { makeSymbol("NONE"), ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER, SEVEN_INTEGER, EIGHT_INTEGER, NINE_INTEGER, makeSymbol("ALL") });
        $ic98$ = makeString("Max depth: ");
        $ic99$ = makeString("depth");
        $ic100$ = makeString("Max inferior terms: ");
        $ic101$ = makeString("inferior");
        $ic102$ = makeString("Extras");
        $ic103$ = makeString("lex");
        $ic104$ = makeString(" Use lexicon entries, if possible");
        $ic105$ = makeString("comments");
        $ic106$ = makeString(" Show comments for terms");
        $ic107$ = makeString("mts-after");
        $ic108$ = makeString(" Show assertion's mts after terms");
        $ic109$ = makeString("Indent quantum: ");
        $ic110$ = makeString("quantum");
        $ic111$ = makeKeyword("HB-COLORS-AND-SYMBOLS");
        $ic112$ = makeString("bg-color");
        $ic113$ = makeString(": ");
        $ic114$ = makeString("The background color for Hierarchy Browser pages");
        $ic115$ = makeString("msg-color");
        $ic116$ = makeString("The color for Hierarchy Browser alert messages");
        $ic117$ = makeString("hb-icon");
        $ic118$ = makeString("The hierarchical display link icon, currently ");
        $ic119$ = makeString("hb-bar");
        $ic120$ = makeString(" : ");
        $ic121$ = makeString("Use decorative separator bar");
        $ic122$ = makeString("hb-top-sign");
        $ic123$ = makeString(" <term>");
        $ic124$ = makeString("Indicates that <term> has no superiors");
        $ic125$ = makeString("<term> ");
        $ic126$ = makeString("hb-bottom-sign");
        $ic127$ = makeString("Indicates that <term> has no inferiors");
        $ic128$ = makeString("superiors-sign");
        $ic129$ = makeString("Indicates that <term> has more undisplayed superiors");
        $ic130$ = makeString("inferiors-sign");
        $ic131$ = makeString("Indicates that <term> has more undisplayed inferiors");
        $ic132$ = makeString("cycle-sign");
        $ic133$ = makeString("Indicates that a sequence of terms beginning with <term> has already been displayed");
        $ic134$ = makeSymbol("STRING-LESSP");
        $ic135$ = makeSymbol("S#16701", "CYC");
        $ic136$ = makeKeyword("HB-PARAMETERS");
        $ic137$ = makeString("hb-parameters.html");
        $ic138$ = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $ic139$ = makeKeyword("CB-CYC");
        $ic140$ = makeString("stylesheet");
        $ic141$ = makeString("text/css");
        $ic142$ = makeString("Cyc Hierarchy Browser");
        $ic143$ = makeString("post");
        $ic144$ = makeString("hb-handle-parameters");
        $ic145$ = makeString("Current Settings");
        $ic146$ = makeString("Display Hierarchy");
        $ic147$ = makeSymbol("HB-PARAMETERS");
        $ic148$ = makeString("HB Colors and Symbols");
        $ic149$ = makeString("Hierarchy Browser Colors and Symbols");
        $ic150$ = makeString("hb-handle-colors-and-symbols");
        $ic151$ = makeString("Update");
        $ic152$ = makeSymbol("HB-COLORS-AND-SYMBOLS");
        $ic153$ = makeString("term");
        $ic154$ = makeSymbol("S#4172", "CYC");
        $ic155$ = makeSymbol("S#11103", "CYC");
        $ic156$ = ConsesLow.list((SubLObject)makeString("all"), (SubLObject)makeString(":all"), (SubLObject)makeKeyword("ALL"), (SubLObject)makeSymbol("ALL"));
        $ic157$ = makeSymbol("S#13273", "CYC");
        $ic158$ = makeSymbol("S#46172", "CYC");
        $ic159$ = makeString("2");
        $ic160$ = makeInteger(50);
        $ic161$ = makeKeyword("TERM");
        $ic162$ = constant_handles_oc.f8479((SubLObject)makeString("Predicate"));
        $ic163$ = makeKeyword("PRED");
        $ic164$ = makeKeyword("MT");
        $ic165$ = makeString("The input ~s did not yield a valid constant.");
        $ic166$ = makeString("The input ~s did not yield a valid predicate.");
        $ic167$ = makeString("The input ~s did not yield a valid microtheory.");
        $ic168$ = makeString("Parameters updated at ~a on ~a");
        $ic169$ = makeSymbol("HB-HANDLE-PARAMETERS");
        $ic170$ = makeKeyword("DEFAULT");
        $ic171$ = makeKeyword("BLACK");
        $ic172$ = makeString("Colors and symbols updated at ~a on ~a");
        $ic173$ = makeSymbol("HB-HANDLE-COLORS-AND-SYMBOLS");
        $ic174$ = ConsesLow.list((SubLObject)makeSymbol("TYPE"), (SubLObject)makeSymbol("S#717", "CYC"), (SubLObject)makeSymbol("S#134", "CYC"), (SubLObject)makeSymbol("S#12098", "CYC"), (SubLObject)makeSymbol("S#895", "CYC"), (SubLObject)makeSymbol("S#25811", "CYC"));
        $ic175$ = makeString("Using default settings for instances of ~a.");
        $ic176$ = makeString("No default display parameters are defined for the term `~a'.");
        $ic177$ = makeSymbol("S#46183", "CYC");
        $ic178$ = makeString("predicate");
        $ic179$ = makeString("microtheory");
        $ic180$ = makeString("microtheories");
        $ic181$ = makeString("~as");
        $ic182$ = makeString("Choose Constants: Simple Version");
        $ic183$ = makeString("Choose a ~a");
        $ic184$ = makeString("Please choose one of the following ~a:");
        $ic185$ = makeString("left");
        $ic186$ = makeKeyword("HB-HANDLE-SIMPLE-CHOOSE-CONSTANTS");
        $ic187$ = makeKeyword("SELF");
        $ic188$ = makeSymbol("HB-HANDLE-SIMPLE-CHOOSE-CONSTANTS");
        $ic189$ = makeString("Choose Constants: Complex Version");
        $ic190$ = makeString("Resolve Ambiguous Input");
        $ic191$ = makeString("hb-handle-complex-choose-constants");
        $ic192$ = makeString("Go");
        $ic193$ = makeString("Please select one term from each category below:");
        $ic194$ = makeString("Terms");
        $ic195$ = makeString("Predicates");
        $ic196$ = makeString("Microtheories");
        $ic197$ = makeString("~a");
        $ic198$ = makeString(" ");
        $ic199$ = makeSymbol("HB-HANDLE-COMPLEX-CHOOSE-CONSTANTS");
        $ic200$ = makeSymbol("HB-SELECT-NODE");
        $ic201$ = makeSymbol("S#12276", "CYC");
        $ic202$ = constant_handles_oc.f8479((SubLObject)makeString("comment"));
        $ic203$ = makeSymbol("S#40640", "CYC");
        $ic204$ = makeKeyword("HB-SELECT-NODE-TEXT");
        $ic205$ = makeKeyword("HB-SELECT-NODE-IMAGE");
        $ic206$ = makeKeyword("ISA");
        $ic207$ = makeSymbol("MIN-ISA");
        $ic208$ = makeKeyword("GENLS");
        $ic209$ = makeSymbol("MIN-GENLS");
        $ic210$ = makeKeyword("ALL-ISA");
        $ic211$ = makeSymbol("ALL-ISA");
        $ic212$ = makeKeyword("ALL-GENLS");
        $ic213$ = makeSymbol("ALL-GENLS");
        $ic214$ = makeSymbol("LIST");
        $ic215$ = constant_handles_oc.f8479((SubLObject)makeString("isa"));
        $ic216$ = makeString(", ");
        $ic217$ = constant_handles_oc.f8479((SubLObject)makeString("Collection"));
        $ic218$ = constant_handles_oc.f8479((SubLObject)makeString("genls"));
        $ic219$ = makeString("Context: ");
        $ic220$ = makeString("Union of all contexts");
        $ic221$ = makeString(" and its ");
        $ic222$ = constant_handles_oc.f8479((SubLObject)makeString("genlMt"));
        $ic223$ = makeString("s");
        $ic224$ = makeString("Unknown!");
        $ic225$ = makeString("Predicate: ");
        $ic226$ = makeString("Index: ");
        $ic227$ = makeInteger(100);
        $ic228$ = makeString("----------");
        $ic229$ = makeKeyword("HB-PRINT-NODES");
        $ic230$ = makeString("hb-print-nodes.html");
        $ic231$ = makeString("Hierarchical Display: ~a");
        $ic232$ = makeSymbol("S#44161", "CYC");
        $ic233$ = makeString("hb-parameters");
        $ic234$ = makeString("Change Hierarchy Browser Settings");
        $ic235$ = makeString("~a is not a valid constant.");
        $ic236$ = makeSymbol("HB-PRINT-NODES");
        $ic237$ = makeKeyword("SUPERIOR");
        $ic238$ = makeKeyword("INFERIOR");
        $ic239$ = makeString(" [");
        $ic240$ = makeString("]");
        $ic241$ = makeString("[");
        $ic242$ = makeString(" -> (");
        $ic243$ = makeString(")]");
        $ic244$ = makeString("[Unknown!]");
        $ic245$ = makeSymbol("STRING<");
        $ic246$ = makeString("No superior terms");
        $ic247$ = makeString(" [not an indexed term]");
        $ic248$ = makeString("No inferior terms");
        $ic249$ = makeString("Go to Top");
        $ic250$ = makeString("~%~%");
        $ic251$ = makeString("    Level finished: ~s");
        $ic252$ = makeString("~%");
        $ic253$ = makeString("       Total count: ~s");
        $ic254$ = makeString("Computed max depth: ~s");
        $ic255$ = makeSymbol("HB-START");
        $ic256$ = makeString("Hier");
        $ic257$ = makeKeyword("MAIN");
        $ic258$ = makeString("hb-start");
        $ic259$ = makeKeyword("HIERARCHY-BROWSER");
        $ic260$ = makeSymbol("S#46205", "CYC");
        $ic261$ = makeString("Hierarchy Browser");
        $ic262$ = makeString("The Hierarchy Browser");
        $ic263$ = ConsesLow.list((SubLObject)makeSymbol("S#44996", "CYC"));
        $ic264$ = makeString("Could not determine a term from ~a");
        $ic265$ = makeSymbol("CB-HIER-DEFAULT");
        $ic266$ = ConsesLow.list((SubLObject)makeSymbol("S#44996", "CYC"), (SubLObject)makeSymbol("S#44449", "CYC"), (SubLObject)makeSymbol("S#13108", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#13109", "CYC"));
        $ic267$ = makeString("Could not determine an arg from ~a");
        $ic268$ = makeSymbol("CB-HIER");
        $ic269$ = makeSymbol("SECOND");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 3785 ms
	
	Decompiled with Procyon 0.5.32.
*/
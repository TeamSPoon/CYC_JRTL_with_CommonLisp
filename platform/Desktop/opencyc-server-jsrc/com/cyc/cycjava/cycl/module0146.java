package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0146 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0146";
    public static final String myFingerPrint = "6c7a5ebd09ecad8efbb96042efb0243659eb0846bb5faea60c8287ae16779f7a";
    public static SubLSymbol $g1958$;
    public static SubLSymbol $g1959$;
    public static SubLSymbol $g1960$;
    public static SubLSymbol $g1961$;
    public static SubLSymbol $g1962$;
    public static SubLSymbol $g1963$;
    public static SubLSymbol $g1964$;
    public static SubLSymbol $g1965$;
    public static SubLSymbol $g1966$;
    public static SubLSymbol $g1967$;
    public static SubLSymbol $g1968$;
    public static SubLSymbol $g1969$;
    public static SubLSymbol $g1970$;
    public static SubLSymbol $g1971$;
    public static SubLSymbol $g1972$;
    public static SubLSymbol $g1973$;
    public static SubLSymbol $g1974$;
    public static SubLSymbol $g1975$;
    public static SubLSymbol $g1976$;
    public static SubLSymbol $g1977$;
    public static SubLSymbol $g1978$;
    public static SubLSymbol $g1979$;
    public static SubLSymbol $g1980$;
    public static SubLSymbol $g1981$;
    public static SubLSymbol $g1982$;
    public static SubLSymbol $g1983$;
    public static SubLSymbol $g1984$;
    public static SubLSymbol $g1985$;
    public static SubLSymbol $g1986$;
    public static SubLSymbol $g1987$;
    public static SubLSymbol $g1988$;
    public static SubLSymbol $g1989$;
    public static SubLSymbol $g1990$;
    public static SubLSymbol $g1991$;
    public static SubLSymbol $g1992$;
    public static SubLSymbol $g1993$;
    public static SubLSymbol $g1994$;
    public static SubLSymbol $g1995$;
    public static SubLSymbol $g1996$;
    public static SubLSymbol $g1997$;
    public static SubLSymbol $g1998$;
    public static SubLSymbol $g1999$;
    public static SubLSymbol $g2000$;
    public static SubLSymbol $g2001$;
    public static SubLSymbol $g2002$;
    public static SubLSymbol $g2003$;
    public static SubLSymbol $g2004$;
    public static SubLSymbol $g2005$;
    public static SubLSymbol $g2006$;
    public static SubLSymbol $g2007$;
    public static SubLSymbol $g2008$;
    public static SubLSymbol $g2009$;
    public static SubLSymbol $g2010$;
    public static SubLSymbol $g2011$;
    public static SubLSymbol $g2012$;
    public static SubLSymbol $g2013$;
    public static SubLSymbol $g2014$;
    public static SubLSymbol $g2015$;
    public static SubLSymbol $g2016$;
    public static SubLSymbol $g2017$;
    public static SubLSymbol $g2018$;
    public static SubLSymbol $g2019$;
    public static SubLSymbol $g2020$;
    public static SubLSymbol $g2021$;
    public static SubLSymbol $g2022$;
    public static SubLSymbol $g2023$;
    public static SubLSymbol $g2024$;
    public static SubLSymbol $g2025$;
    public static SubLSymbol $g2026$;
    public static SubLSymbol $g2027$;
    public static SubLSymbol $g2028$;
    public static SubLSymbol $g2029$;
    public static SubLSymbol $g2030$;
    public static SubLSymbol $g2031$;
    public static SubLSymbol $g2032$;
    public static SubLSymbol $g2033$;
    public static SubLSymbol $g2034$;
    public static SubLSymbol $g2035$;
    public static SubLSymbol $g2036$;
    public static SubLSymbol $g2037$;
    public static SubLSymbol $g2038$;
    public static SubLSymbol $g2039$;
    public static SubLSymbol $g2040$;
    public static SubLSymbol $g2041$;
    public static SubLSymbol $g2042$;
    public static SubLSymbol $g2043$;
    public static SubLSymbol $g2044$;
    public static SubLSymbol $g2045$;
    public static SubLSymbol $g2046$;
    public static SubLSymbol $g2047$;
    public static SubLSymbol $g2048$;
    public static SubLSymbol $g2049$;
    public static SubLSymbol $g2050$;
    public static SubLSymbol $g2051$;
    public static SubLSymbol $g2052$;
    public static SubLSymbol $g2053$;
    public static SubLSymbol $g2054$;
    public static SubLSymbol $g2055$;
    public static SubLSymbol $g2056$;
    public static SubLSymbol $g2057$;
    public static SubLSymbol $g2058$;
    public static SubLSymbol $g2059$;
    public static SubLSymbol $g2060$;
    public static SubLSymbol $g2061$;
    public static SubLSymbol $g2062$;
    public static SubLSymbol $g2063$;
    public static SubLSymbol $g2064$;
    public static SubLSymbol $g2065$;
    public static SubLSymbol $g2066$;
    public static SubLSymbol $g2067$;
    public static SubLSymbol $g2068$;
    public static SubLSymbol $g2069$;
    public static SubLSymbol $g2070$;
    public static SubLSymbol $g2071$;
    public static SubLSymbol $g2072$;
    public static SubLSymbol $g2073$;
    public static SubLSymbol $g2074$;
    public static SubLSymbol $g2075$;
    public static SubLSymbol $g2076$;
    public static SubLSymbol $g2077$;
    public static SubLSymbol $g2078$;
    public static SubLSymbol $g2079$;
    public static SubLSymbol $g2080$;
    public static SubLSymbol $g2081$;
    public static SubLSymbol $g2082$;
    public static SubLSymbol $g2083$;
    public static SubLSymbol $g2084$;
    public static SubLSymbol $g2085$;
    public static SubLSymbol $g2086$;
    public static SubLSymbol $g2087$;
    public static SubLSymbol $g2088$;
    public static SubLSymbol $g2089$;
    public static SubLSymbol $g2090$;
    public static SubLSymbol $g2091$;
    public static SubLSymbol $g2092$;
    private static SubLSymbol $g2093$;
    private static final SubLList $ic0$;
    private static final SubLList $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLList $ic5$;
    private static final SubLList $ic6$;
    private static final SubLList $ic7$;
    private static final SubLList $ic8$;
    private static final SubLList $ic9$;
    private static final SubLList $ic10$;
    private static final SubLList $ic11$;
    private static final SubLList $ic12$;
    private static final SubLList $ic13$;
    private static final SubLList $ic14$;
    private static final SubLList $ic15$;
    private static final SubLList $ic16$;
    private static final SubLList $ic17$;
    private static final SubLObject $ic18$;
    private static final SubLObject $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLList $ic24$;
    private static final SubLList $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLInteger $ic27$;
    private static final SubLList $ic28$;
    private static final SubLList $ic29$;
    private static final SubLList $ic30$;
    private static final SubLList $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLString $ic34$;
    
    public static SubLObject f9483(final SubLObject var1) {
        return module0035.f2169(var1, $g2093$.getGlobalValue());
    }
    
    public static SubLObject f9484() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if ($g2092$.getDynamicValue(var2) != $ic22$) {
            return $g2092$.getDynamicValue(var2);
        }
        if (NIL != module0018.$g696$.getDynamicValue(var2)) {
            return (SubLObject)$ic32$;
        }
        if (NIL != module0018.$g698$.getDynamicValue(var2)) {
            return (SubLObject)$ic33$;
        }
        Errors.warn((SubLObject)$ic34$);
        return (SubLObject)$ic22$;
    }
    
    public static SubLObject f9485() {
        return Equality.eq(f9484(), (SubLObject)$ic32$);
    }
    
    public static SubLObject f9486() {
        return Equality.eq(f9484(), (SubLObject)$ic33$);
    }
    
    public static SubLObject f9487() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0146", "f9483", "S#12145", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0146", "f9484", "S#12146", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0146", "f9485", "S#12147", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0146", "f9486", "S#12148", 0, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9488() {
        $g1958$ = SubLFiles.defparameter("S#12149", (SubLObject)$ic0$);
        $g1959$ = SubLFiles.deflexical("S#12150", (SubLObject)$ic1$);
        $g1960$ = SubLFiles.defparameter("S#12151", (SubLObject)NIL);
        $g1961$ = SubLFiles.defparameter("S#12152", (SubLObject)NIL);
        $g1962$ = SubLFiles.defparameter("S#12153", (SubLObject)$ic2$);
        $g1963$ = SubLFiles.defparameter("S#12154", (SubLObject)$ic3$);
        $g1964$ = SubLFiles.defparameter("S#12155", (SubLObject)$ic4$);
        $g1965$ = SubLFiles.deflexical("S#12156", (SubLObject)$ic5$);
        $g1966$ = SubLFiles.deflexical("S#12157", (SubLObject)$ic6$);
        $g1967$ = SubLFiles.deflexical("S#12158", (SubLObject)$ic7$);
        $g1968$ = SubLFiles.deflexical("S#12159", (SubLObject)$ic8$);
        $g1969$ = SubLFiles.deflexical("S#12160", (SubLObject)$ic9$);
        $g1970$ = SubLFiles.deflexical("S#12161", (SubLObject)$ic10$);
        $g1971$ = SubLFiles.deflexical("S#12162", (SubLObject)$ic11$);
        $g1972$ = SubLFiles.deflexical("S#12163", (SubLObject)$ic12$);
        $g1973$ = SubLFiles.deflexical("S#12164", (SubLObject)$ic13$);
        $g1974$ = SubLFiles.deflexical("S#12165", (SubLObject)$ic14$);
        $g1975$ = SubLFiles.deflexical("S#12166", (SubLObject)$ic15$);
        $g1976$ = SubLFiles.deflexical("S#12167", (SubLObject)$ic16$);
        $g1977$ = SubLFiles.deflexical("S#12168", (SubLObject)$ic17$);
        $g1978$ = SubLFiles.deflexical("S#12169", $ic18$);
        $g1979$ = SubLFiles.deflexical("S#12170", $ic19$);
        $g1980$ = SubLFiles.defparameter("S#12171", (SubLObject)NIL);
        $g1981$ = SubLFiles.defparameter("*EL-SUPPORTS-DOT-SYNTAX?*", (SubLObject)T);
        $g1982$ = SubLFiles.deflexical("S#12172", (SubLObject)T);
        $g1983$ = SubLFiles.defparameter("*EL-SUPPORTS-CONTRACTIONS?*", (SubLObject)NIL);
        $g1984$ = SubLFiles.defvar("S#12173", (SubLObject)NIL);
        $g1985$ = SubLFiles.defparameter("S#12174", (SubLObject)NIL);
        $g1986$ = SubLFiles.defparameter("S#12175", (SubLObject)NIL);
        $g1987$ = SubLFiles.defparameter("S#12176", (SubLObject)NIL);
        $g1988$ = SubLFiles.defparameter("*MUST-ENFORCE-SEMANTICS?*", (SubLObject)NIL);
        $g1989$ = SubLFiles.defparameter("S#12177", (SubLObject)ZERO_INTEGER);
        $g1990$ = SubLFiles.defparameter("S#12178", (SubLObject)NIL);
        $g1991$ = SubLFiles.defparameter("S#12179", (SubLObject)$ic20$);
        $g1992$ = SubLFiles.defparameter("S#12180", (SubLObject)NIL);
        $g1993$ = SubLFiles.defparameter("S#12181", (SubLObject)T);
        $g1994$ = SubLFiles.defparameter("S#12182", (SubLObject)NIL);
        $g1995$ = SubLFiles.defparameter("S#12183", (SubLObject)NIL);
        $g1996$ = SubLFiles.defparameter("S#12184", (SubLObject)NIL);
        $g1997$ = SubLFiles.defparameter("S#12185", (SubLObject)NIL);
        $g1998$ = SubLFiles.defparameter("S#12186", (SubLObject)$ic21$);
        $g1999$ = SubLFiles.defparameter("S#12187", (SubLObject)NIL);
        $g2000$ = SubLFiles.defparameter("S#12188", (SubLObject)T);
        $g2001$ = SubLFiles.defparameter("S#12189", (SubLObject)$ic22$);
        $g2002$ = SubLFiles.defparameter("S#12190", (SubLObject)$ic23$);
        $g2003$ = SubLFiles.defparameter("*STANDARDIZE-VARIABLES-MEMORY*", (SubLObject)NIL);
        $g2004$ = SubLFiles.defparameter("S#12191", (SubLObject)NIL);
        $g2005$ = SubLFiles.defparameter("S#12192", (SubLObject)T);
        $g2006$ = SubLFiles.defparameter("S#12193", (SubLObject)T);
        $g2007$ = SubLFiles.defparameter("S#12194", (SubLObject)T);
        $g2008$ = SubLFiles.defparameter("S#12195", (SubLObject)NIL);
        $g2009$ = SubLFiles.defparameter("S#12196", (SubLObject)$ic22$);
        $g2010$ = SubLFiles.defparameter("S#12197", (SubLObject)NIL);
        $g2011$ = SubLFiles.defparameter("S#12198", (SubLObject)NIL);
        $g2012$ = SubLFiles.defparameter("S#12199", (SubLObject)NIL);
        $g2013$ = SubLFiles.defparameter("S#12200", (SubLObject)T);
        $g2014$ = SubLFiles.defparameter("*CANONICALIZE-ALL-SENTENCE-ARGS?*", (SubLObject)NIL);
        $g2015$ = SubLFiles.defparameter("S#12201", (SubLObject)T);
        $g2016$ = SubLFiles.defparameter("S#12202", (SubLObject)T);
        $g2017$ = SubLFiles.defparameter("S#12203", (SubLObject)T);
        $g2018$ = SubLFiles.defparameter("S#12204", (SubLObject)T);
        $g2019$ = SubLFiles.defparameter("S#12205", (SubLObject)NIL);
        $g2020$ = SubLFiles.defparameter("S#12206", (SubLObject)T);
        $g2021$ = SubLFiles.defparameter("S#12207", (SubLObject)T);
        $g2022$ = SubLFiles.defparameter("S#12208", (SubLObject)T);
        $g2023$ = SubLFiles.defparameter("S#12209", (SubLObject)NIL);
        $g2024$ = SubLFiles.defparameter("S#12210", (SubLObject)T);
        $g2025$ = SubLFiles.defparameter("*IMPLICITIFY-UNIVERSALS?*", (SubLObject)T);
        $g2026$ = SubLFiles.defparameter("S#12211", (SubLObject)NIL);
        $g2027$ = SubLFiles.defparameter("S#12212", (SubLObject)T);
        $g2028$ = SubLFiles.defparameter("*ENCAPSULATE-INTENSIONAL-FORMULA?*", (SubLObject)T);
        $g2029$ = SubLFiles.defparameter("S#12213", (SubLObject)TEN_INTEGER);
        $g2030$ = SubLFiles.defparameter("S#12214", (SubLObject)NIL);
        $g2031$ = SubLFiles.defparameter("S#12215", (SubLObject)NIL);
        $g2032$ = SubLFiles.defparameter("S#12216", (SubLObject)NIL);
        $g2033$ = SubLFiles.deflexical("S#12217", (SubLObject)$ic24$);
        $g2034$ = SubLFiles.defparameter("*CONTROL?*", (SubLObject)NIL);
        $g2035$ = SubLFiles.defparameter("*CONTROL-1*", (SubLObject)NIL);
        $g2036$ = SubLFiles.defparameter("*CONTROL-2*", (SubLObject)NIL);
        $g2037$ = SubLFiles.defparameter("*CONTROL-3*", (SubLObject)NIL);
        $g2038$ = SubLFiles.defparameter("*CONTROL-4*", (SubLObject)NIL);
        $g2039$ = SubLFiles.defparameter("*CONTROL-5*", (SubLObject)NIL);
        $g2040$ = SubLFiles.defparameter("*CONTROL-6*", (SubLObject)NIL);
        $g2041$ = SubLFiles.defparameter("S#12218", (SubLObject)NIL);
        $g2042$ = SubLFiles.defparameter("S#12219", (SubLObject)NIL);
        $g2043$ = SubLFiles.defparameter("S#12220", (SubLObject)T);
        $g2044$ = SubLFiles.defparameter("S#12221", (SubLObject)T);
        $g2045$ = SubLFiles.deflexical("S#12222", (SubLObject)$ic25$);
        $g2046$ = SubLFiles.defparameter("S#12223", (SubLObject)NIL);
        $g2047$ = SubLFiles.defparameter("S#12224", (SubLObject)NIL);
        $g2048$ = SubLFiles.defparameter("S#12225", (SubLObject)T);
        $g2049$ = SubLFiles.defparameter("S#12226", (SubLObject)T);
        $g2050$ = SubLFiles.defparameter("S#12227", (SubLObject)NIL);
        $g2051$ = SubLFiles.defparameter("S#12228", (SubLObject)NIL);
        $g2052$ = SubLFiles.defparameter("S#12229", (SubLObject)NIL);
        $g2053$ = SubLFiles.defparameter("S#12230", (SubLObject)NIL);
        $g2054$ = SubLFiles.defparameter("*SIMPLIFY-SENTENCE?*", (SubLObject)T);
        $g2055$ = SubLFiles.defparameter("S#12231", (SubLObject)T);
        $g2056$ = SubLFiles.defparameter("S#12232", (SubLObject)T);
        $g2057$ = SubLFiles.defparameter("S#12233", (SubLObject)T);
        $g2058$ = SubLFiles.defparameter("S#12234", (SubLObject)T);
        $g2059$ = SubLFiles.defparameter("S#12235", (SubLObject)NIL);
        $g2060$ = SubLFiles.defparameter("S#12236", (SubLObject)T);
        $g2061$ = SubLFiles.defparameter("S#12237", (SubLObject)NIL);
        $g2062$ = SubLFiles.defparameter("S#12238", (SubLObject)NIL);
        $g2063$ = SubLFiles.defparameter("*SIMPLIFY-SEQUENCE-VARS-USING-KB-ARITY?*", (SubLObject)T);
        $g2064$ = SubLFiles.defparameter("S#12239", (SubLObject)FIVE_INTEGER);
        $g2065$ = SubLFiles.defparameter("S#12240", (SubLObject)NIL);
        $g2066$ = SubLFiles.defparameter("S#12241", (SubLObject)NIL);
        $g2067$ = SubLFiles.deflexical("*SKOLEM-AXIOM-TABLE*", (NIL != Symbols.boundp((SubLObject)$ic26$)) ? $g2067$.getGlobalValue() : Hashtables.make_hash_table((SubLObject)$ic27$, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED));
        $g2068$ = SubLFiles.defparameter("S#12242", (SubLObject)T);
        $g2069$ = SubLFiles.defparameter("S#12243", (SubLObject)NIL);
        $g2070$ = SubLFiles.defparameter("S#12244", (SubLObject)NIL);
        $g2071$ = SubLFiles.defparameter("S#12245", (SubLObject)$ic28$);
        $g2072$ = SubLFiles.deflexical("S#12246", ConsesLow.append(new SubLObject[] { $ic29$, $g1968$.getGlobalValue(), $g1969$.getGlobalValue(), $g1972$.getGlobalValue(), $g1973$.getGlobalValue(), $ic30$ }));
        $g2073$ = SubLFiles.defparameter("S#12247", (SubLObject)NIL);
        $g2074$ = SubLFiles.defparameter("S#12248", (SubLObject)NIL);
        $g2075$ = SubLFiles.defparameter("*EXPRESS-AS-RULE-MACRO?*", (SubLObject)NIL);
        $g2076$ = SubLFiles.defparameter("*EXPRESS-AS-GENLS?*", (SubLObject)NIL);
        $g2077$ = SubLFiles.defparameter("S#12249", (SubLObject)NIL);
        $g2078$ = SubLFiles.defparameter("S#12250", (SubLObject)NIL);
        $g2079$ = SubLFiles.defparameter("S#12251", (SubLObject)NIL);
        $g2080$ = SubLFiles.defparameter("S#12252", (SubLObject)NIL);
        $g2081$ = SubLFiles.defparameter("S#12253", (SubLObject)NIL);
        $g2082$ = SubLFiles.defparameter("*EXPRESS-AS-DISJOINT-WITH?*", (SubLObject)NIL);
        $g2083$ = SubLFiles.defparameter("*EXPRESS-AS-NEGATION-PREDICATES?*", (SubLObject)NIL);
        $g2084$ = SubLFiles.defparameter("*EXPRESS-AS-NEGATION-INVERSE?*", (SubLObject)NIL);
        $g2085$ = SubLFiles.defparameter("*EXPRESS-AS-REFLEXIVE?*", (SubLObject)NIL);
        $g2086$ = SubLFiles.defparameter("*EXPRESS-AS-SYMMETRIC?*", (SubLObject)NIL);
        $g2087$ = SubLFiles.defparameter("*EXPRESS-AS-TRANSITIVE?*", (SubLObject)NIL);
        $g2088$ = SubLFiles.defparameter("*EXPRESS-AS-IRREFLEXIVE?*", (SubLObject)NIL);
        $g2089$ = SubLFiles.defparameter("*EXPRESS-AS-ASYMMETRIC?*", (SubLObject)NIL);
        $g2090$ = SubLFiles.defparameter("*EXPRESS-AS-RELATION-TYPE?*", (SubLObject)NIL);
        $g2091$ = SubLFiles.defparameter("S#12254", (SubLObject)NIL);
        $g2092$ = SubLFiles.defparameter("S#12255", (SubLObject)$ic22$);
        $g2093$ = SubLFiles.deflexical("S#12256", (SubLObject)$ic31$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9489() {
        module0003.f57((SubLObject)$ic26$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f9487();
    }
    
    public void initializeVariables() {
        f9488();
    }
    
    public void runTopLevelForms() {
        f9489();
    }
    
    static {
        me = (SubLFile)new module0146();
        $g1958$ = null;
        $g1959$ = null;
        $g1960$ = null;
        $g1961$ = null;
        $g1962$ = null;
        $g1963$ = null;
        $g1964$ = null;
        $g1965$ = null;
        $g1966$ = null;
        $g1967$ = null;
        $g1968$ = null;
        $g1969$ = null;
        $g1970$ = null;
        $g1971$ = null;
        $g1972$ = null;
        $g1973$ = null;
        $g1974$ = null;
        $g1975$ = null;
        $g1976$ = null;
        $g1977$ = null;
        $g1978$ = null;
        $g1979$ = null;
        $g1980$ = null;
        $g1981$ = null;
        $g1982$ = null;
        $g1983$ = null;
        $g1984$ = null;
        $g1985$ = null;
        $g1986$ = null;
        $g1987$ = null;
        $g1988$ = null;
        $g1989$ = null;
        $g1990$ = null;
        $g1991$ = null;
        $g1992$ = null;
        $g1993$ = null;
        $g1994$ = null;
        $g1995$ = null;
        $g1996$ = null;
        $g1997$ = null;
        $g1998$ = null;
        $g1999$ = null;
        $g2000$ = null;
        $g2001$ = null;
        $g2002$ = null;
        $g2003$ = null;
        $g2004$ = null;
        $g2005$ = null;
        $g2006$ = null;
        $g2007$ = null;
        $g2008$ = null;
        $g2009$ = null;
        $g2010$ = null;
        $g2011$ = null;
        $g2012$ = null;
        $g2013$ = null;
        $g2014$ = null;
        $g2015$ = null;
        $g2016$ = null;
        $g2017$ = null;
        $g2018$ = null;
        $g2019$ = null;
        $g2020$ = null;
        $g2021$ = null;
        $g2022$ = null;
        $g2023$ = null;
        $g2024$ = null;
        $g2025$ = null;
        $g2026$ = null;
        $g2027$ = null;
        $g2028$ = null;
        $g2029$ = null;
        $g2030$ = null;
        $g2031$ = null;
        $g2032$ = null;
        $g2033$ = null;
        $g2034$ = null;
        $g2035$ = null;
        $g2036$ = null;
        $g2037$ = null;
        $g2038$ = null;
        $g2039$ = null;
        $g2040$ = null;
        $g2041$ = null;
        $g2042$ = null;
        $g2043$ = null;
        $g2044$ = null;
        $g2045$ = null;
        $g2046$ = null;
        $g2047$ = null;
        $g2048$ = null;
        $g2049$ = null;
        $g2050$ = null;
        $g2051$ = null;
        $g2052$ = null;
        $g2053$ = null;
        $g2054$ = null;
        $g2055$ = null;
        $g2056$ = null;
        $g2057$ = null;
        $g2058$ = null;
        $g2059$ = null;
        $g2060$ = null;
        $g2061$ = null;
        $g2062$ = null;
        $g2063$ = null;
        $g2064$ = null;
        $g2065$ = null;
        $g2066$ = null;
        $g2067$ = null;
        $g2068$ = null;
        $g2069$ = null;
        $g2070$ = null;
        $g2071$ = null;
        $g2072$ = null;
        $g2073$ = null;
        $g2074$ = null;
        $g2075$ = null;
        $g2076$ = null;
        $g2077$ = null;
        $g2078$ = null;
        $g2079$ = null;
        $g2080$ = null;
        $g2081$ = null;
        $g2082$ = null;
        $g2083$ = null;
        $g2084$ = null;
        $g2085$ = null;
        $g2086$ = null;
        $g2087$ = null;
        $g2088$ = null;
        $g2089$ = null;
        $g2090$ = null;
        $g2091$ = null;
        $g2092$ = null;
        $g2093$ = null;
        $ic0$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("requiredArg1Pred")), constant_handles_oc.f8479((SubLObject)makeString("requiredArg2Pred")));
        $ic1$ = ConsesLow.list((SubLObject)ONE_INTEGER, (SubLObject)TWO_INTEGER, (SubLObject)THREE_INTEGER, (SubLObject)FOUR_INTEGER, (SubLObject)FIVE_INTEGER);
        $ic2$ = makeSymbol("ASSERTION-FORMULA");
        $ic3$ = makeSymbol("NART-HL-FORMULA");
        $ic4$ = makeSymbol("S#12257", "CYC");
        $ic5$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("implies")));
        $ic6$ = ConsesLow.list(new SubLObject[] { constant_handles_oc.f8479((SubLObject)makeString("not")), constant_handles_oc.f8479((SubLObject)makeString("or")), constant_handles_oc.f8479((SubLObject)makeString("xor")), constant_handles_oc.f8479((SubLObject)makeString("and")), constant_handles_oc.f8479((SubLObject)makeString("equiv")), constant_handles_oc.f8479((SubLObject)makeString("implies")), constant_handles_oc.f8479((SubLObject)makeString("exceptFor")), constant_handles_oc.f8479((SubLObject)makeString("exceptWhen")), constant_handles_oc.f8479((SubLObject)makeString("forAll")), constant_handles_oc.f8479((SubLObject)makeString("thereExists")), constant_handles_oc.f8479((SubLObject)makeString("thereExistExactly")), constant_handles_oc.f8479((SubLObject)makeString("thereExistAtLeast")), constant_handles_oc.f8479((SubLObject)makeString("thereExistAtMost")) });
        $ic7$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("SkolemFunctionFn")), constant_handles_oc.f8479((SubLObject)makeString("SkolemFuncNFn")));
        $ic8$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("arg1Isa")), constant_handles_oc.f8479((SubLObject)makeString("arg2Isa")), constant_handles_oc.f8479((SubLObject)makeString("arg3Isa")), constant_handles_oc.f8479((SubLObject)makeString("arg4Isa")), constant_handles_oc.f8479((SubLObject)makeString("arg5Isa")), constant_handles_oc.f8479((SubLObject)makeString("arg6Isa")), constant_handles_oc.f8479((SubLObject)makeString("argsIsa")));
        $ic9$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("argIsa")), constant_handles_oc.f8479((SubLObject)makeString("argAndRestIsa")));
        $ic10$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("arg1NotIsa")), constant_handles_oc.f8479((SubLObject)makeString("arg2NotIsa")), constant_handles_oc.f8479((SubLObject)makeString("arg3NotIsa")), constant_handles_oc.f8479((SubLObject)makeString("arg4NotIsa")), constant_handles_oc.f8479((SubLObject)makeString("arg5NotIsa")), constant_handles_oc.f8479((SubLObject)makeString("arg6NotIsa")), constant_handles_oc.f8479((SubLObject)makeString("argsNotIsa")));
        $ic11$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("argNotIsa")));
        $ic12$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("arg1QuotedIsa")), constant_handles_oc.f8479((SubLObject)makeString("arg2QuotedIsa")), constant_handles_oc.f8479((SubLObject)makeString("arg3QuotedIsa")), constant_handles_oc.f8479((SubLObject)makeString("arg4QuotedIsa")), constant_handles_oc.f8479((SubLObject)makeString("arg5QuotedIsa")), constant_handles_oc.f8479((SubLObject)makeString("arg6QuotedIsa")), constant_handles_oc.f8479((SubLObject)makeString("argsQuotedIsa")));
        $ic13$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("argQuotedIsa")), constant_handles_oc.f8479((SubLObject)makeString("argAndRestQuotedIsa")));
        $ic14$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("arg1Genl")), constant_handles_oc.f8479((SubLObject)makeString("arg2Genl")), constant_handles_oc.f8479((SubLObject)makeString("argsGenl")), constant_handles_oc.f8479((SubLObject)makeString("arg3Genl")), constant_handles_oc.f8479((SubLObject)makeString("arg4Genl")), constant_handles_oc.f8479((SubLObject)makeString("arg5Genl")), constant_handles_oc.f8479((SubLObject)makeString("arg6Genl")));
        $ic15$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("argGenl")), constant_handles_oc.f8479((SubLObject)makeString("argAndRestGenl")));
        $ic16$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("arg1Format")), constant_handles_oc.f8479((SubLObject)makeString("arg2Format")), constant_handles_oc.f8479((SubLObject)makeString("arg3Format")), constant_handles_oc.f8479((SubLObject)makeString("arg4Format")), constant_handles_oc.f8479((SubLObject)makeString("arg5Format")), constant_handles_oc.f8479((SubLObject)makeString("arg6Format")));
        $ic17$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("argFormat")));
        $ic18$ = constant_handles_oc.f8479((SubLObject)makeString("CycLAssertion"));
        $ic19$ = constant_handles_oc.f8479((SubLObject)makeString("CycLIndexedTerm"));
        $ic20$ = makeSymbol("EL-VAR?");
        $ic21$ = makeKeyword("ASSERT-ONLY");
        $ic22$ = makeKeyword("DEFAULT");
        $ic23$ = makeKeyword("KB-VAR");
        $ic24$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), constant_handles_oc.f8479((SubLObject)makeString("genls")));
        $ic25$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("canonicalizerDirectiveForArg")), constant_handles_oc.f8479((SubLObject)makeString("canonicalizerDirectiveForAllArgs")), constant_handles_oc.f8479((SubLObject)makeString("canonicalizerDirectiveForArgAndRest")));
        $ic26$ = makeSymbol("*SKOLEM-AXIOM-TABLE*");
        $ic27$ = makeInteger(2048);
        $ic28$ = ConsesLow.list(new SubLObject[] { constant_handles_oc.f8479((SubLObject)makeString("isa")), constant_handles_oc.f8479((SubLObject)makeString("arity")), constant_handles_oc.f8479((SubLObject)makeString("arityMin")), constant_handles_oc.f8479((SubLObject)makeString("arityMax")), constant_handles_oc.f8479((SubLObject)makeString("resultIsa")), constant_handles_oc.f8479((SubLObject)makeString("resultGenl")), constant_handles_oc.f8479((SubLObject)makeString("resultIsaArg")), constant_handles_oc.f8479((SubLObject)makeString("resultGenlArg")), constant_handles_oc.f8479((SubLObject)makeString("arg1Isa")), constant_handles_oc.f8479((SubLObject)makeString("arg2Isa")), constant_handles_oc.f8479((SubLObject)makeString("arg3Isa")), constant_handles_oc.f8479((SubLObject)makeString("arg4Isa")), constant_handles_oc.f8479((SubLObject)makeString("arg5Isa")), constant_handles_oc.f8479((SubLObject)makeString("arg6Isa")) });
        $ic29$ = ConsesLow.list(new SubLObject[] { constant_handles_oc.f8479((SubLObject)makeString("isa")), constant_handles_oc.f8479((SubLObject)makeString("arity")), constant_handles_oc.f8479((SubLObject)makeString("arityMin")), constant_handles_oc.f8479((SubLObject)makeString("arityMax")), constant_handles_oc.f8479((SubLObject)makeString("resultIsa")), constant_handles_oc.f8479((SubLObject)makeString("resultGenl")), constant_handles_oc.f8479((SubLObject)makeString("resultIsaArg")), constant_handles_oc.f8479((SubLObject)makeString("resultGenlArg")), constant_handles_oc.f8479((SubLObject)makeString("resultQuotedIsa")), constant_handles_oc.f8479((SubLObject)makeString("evaluationResultQuotedIsa")) });
        $ic30$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("myCreator")), constant_handles_oc.f8479((SubLObject)makeString("myCreationTime")), constant_handles_oc.f8479((SubLObject)makeString("myCreationSecond")), constant_handles_oc.f8479((SubLObject)makeString("comment")), constant_handles_oc.f8479((SubLObject)makeString("sharedNotes")), constant_handles_oc.f8479((SubLObject)makeString("skolemizeForward")));
        $ic31$ = ConsesLow.list((SubLObject)makeKeyword("DEFAULT"), (SubLObject)makeKeyword("QUERY"), (SubLObject)makeKeyword("ASSERT"));
        $ic32$ = makeKeyword("ASSERT");
        $ic33$ = makeKeyword("QUERY");
        $ic34$ = makeString("Canonicalizer tense mode not set.");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 116 ms
	
	Decompiled with Procyon 0.5.32.
*/
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.indexed_term_p;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.util.SubLFiles.*;

import java.util.Iterator;
import java.util.Map;

import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class pph_types extends SubLTranslatedFile {
    public static final SubLFile me = new pph_types();

    public static final String myName = "com.cyc.cycjava.cycl.pph_types";

    public static final String myFingerPrint = "20deafdb4a765f1cb63f22b8925f2364e0cc5285fecef51d0dfeb1f26b05ae57";

    // deflexical
    // Definitions
    private static final SubLSymbol $pph_type_tree$ = makeSymbol("*PPH-TYPE-TREE*");

    // deflexical
    private static final SubLSymbol $paraphrase_tests$ = makeSymbol("*PARAPHRASE-TESTS*");



    // deflexical
    // List of valid quality descriptors for paraphrase methods.
    private static final SubLSymbol $pph_valid_method_qualities$ = makeSymbol("*PPH-VALID-METHOD-QUALITIES*");

    // deflexical
    private static final SubLSymbol $pph_date_denoting_functions$ = makeSymbol("*PPH-DATE-DENOTING-FUNCTIONS*");

    // defparameter
    private static final SubLSymbol $pph_subcol_fns$ = makeSymbol("*PPH-SUBCOL-FNS*");

    // Internal Constants
    public static final SubLList $list0 = list(new SubLObject[]{ list(makeKeyword("OBJECT"), makeSymbol("->"), list(makeKeyword("LIST"), cons(makeKeyword("ASSERTION"), THREE_INTEGER), cons(makeKeyword("CONSTANT"), THREE_INTEGER), cons(makeKeyword("NART"), THREE_INTEGER), makeKeyword("STRING"), makeKeyword("NUMBER"), makeKeyword("SYMBOL"))), list(makeKeyword("LIST"), makeSymbol("->"), list(cons(makeKeyword("NAUT"), THREE_INTEGER), cons(makeKeyword("CYCL-SENTENCE"), THREE_INTEGER), makeKeyword("ROP-EXPRESSION"))), list(makeKeyword("SYMBOL"), makeSymbol("->"), list(makeKeyword("VARIABLE"), makeKeyword("KEYWORD"), makeKeyword("CYCL-SYMBOL"), makeKeyword("NON-CYCL-SYMBOL"))), list(makeKeyword("VARIABLE"), makeSymbol("->"), list(cons(makeKeyword("LEXIFIED-VARIABLE"), THREE_INTEGER))), list(makeKeyword("CYCL-SENTENCE"), makeSymbol("->"), list(makeKeyword("ATOMIC-SENTENCE"), makeKeyword("NEGATION"), makeKeyword("IMPLICATION"), cons(makeKeyword("EXISTENTIAL"), THREE_INTEGER), makeKeyword("UNIVERSAL"), makeKeyword("COORDINATION"), makeKeyword("CFF-EXPR"), makeKeyword("CF-IMPLICATION"))), list(makeKeyword("NEGATION"), makeSymbol("->"), list(makeKeyword("SIMPLE-NEGATION"))), list(makeKeyword("ATOMIC-SENTENCE"), makeSymbol("->"), list(makeKeyword("ISA-EXPR"), makeKeyword("SCRIPT-EXPANSION"), makeKeyword("RMP-SENTENCE"), makeKeyword("ABNORMAL"), makeKeyword("EXCEPTION"), makeKeyword("NTH-EXPR"))), list(makeKeyword("COORDINATION"), makeSymbol("->"), list(makeKeyword("CONJUNCTION"), makeKeyword("DISJUNCTION"))), list(makeKeyword("RMP-SENTENCE"), makeSymbol("->"), list(makeKeyword("SPECIFIED-SCOPE-SENTENCE"))), list(makeKeyword("EXISTENTIAL"), makeSymbol("->"), list(makeKeyword("VERB-SEMTRANS-MATCHER"))), list(makeKeyword("CONSTANT"), makeSymbol("->"), list(makeKeyword("TRUE"), makeKeyword("FALSE"), makeKeyword("HYPOTHETICAL"), makeKeyword("LEXICAL-WORD"), makeKeyword("DISCOURSE-PARTICIPANT"), makeKeyword("GEOPOLITICAL-ENTITY"))), list(makeKeyword("NART"), makeSymbol("->"), list(cons(makeKeyword("LEXIFIED-NART"), ONE_INTEGER), makeKeyword("SKOLEM-TERM"), makeKeyword("THE-COLLECTION-OF-NAT"), makeKeyword("GEOPOLITICAL-ENTITY"))), list(makeKeyword("NAUT"), makeSymbol("->"), list(new SubLObject[]{ makeKeyword("PHRASE-DENOTING-NAUT"), makeKeyword("DATE-NAUT"), makeKeyword("IMAGE-URL"), makeKeyword("COLLECTION-DENOTING-NAT"), cons(makeKeyword("SKSI-SUPPORTED-EXTERNAL-TERM"), THREE_INTEGER), cons(makeKeyword("RESOURCE-WITH-URI"), THREE_INTEGER), makeKeyword("SET-NAUT"), makeKeyword("EXPONENT-NAUT"), makeKeyword("UNICODE-NAUT"), makeKeyword("FN-TO-ARG-0"), makeKeyword("KAPPA-EXPR"), makeKeyword("SKOLEM-TERM") })), list(makeKeyword("DATE-NAUT"), makeSymbol("->"), list(makeKeyword("YEAR-NAUT"), makeKeyword("MONTH-NAUT"), makeKeyword("DAY-NAUT"))), list(makeKeyword("COLLECTION-DENOTING-NAT"), makeSymbol("->"), list(makeKeyword("SUBCOLLECTION-RELATION-NAUT"), makeKeyword("THE-COLLECTION-OF-NAT"), makeKeyword("NL-TAGGED-TERM"))), list(makeKeyword("SUBCOLLECTION-RELATION-NAUT"), makeSymbol("->"), list(makeKeyword("RELATIONAL-NOUN-SUBCOLLECTION-NAUT"))), list(makeKeyword("NUMBER"), makeSymbol("->"), list(makeKeyword("UNIVERSAL-DATE"), makeKeyword("UNIVERSAL-SECOND"), makeKeyword("FLOAT"))) });

    public static final SubLList $list1 = list(new SubLObject[]{ cons(makeKeyword("OBJECT"), makeSymbol("TRUE")), cons(makeKeyword("ASSERTION"), makeSymbol("ASSERTION-P")), cons(makeKeyword("LIST"), makeSymbol("LISTP")), cons(makeKeyword("SYMBOL"), makeSymbol("SYMBOLP")), cons(makeKeyword("NON-CYCL-SYMBOL"), makeSymbol("PPH-NON-CYCL-SYMBOL?")), cons(makeKeyword("SCRIPT-EXPANSION"), makeSymbol("PPH-SCRIPT-EXP?")), cons(makeKeyword("NTH-EXPR"), makeSymbol("PPH-NTH-EXPR?")), cons(makeKeyword("VARIABLE"), makeSymbol("EL-VAR?")), cons(makeKeyword("LEXIFIED-VARIABLE"), makeSymbol("PPH-VAR-PREVIOUSLY-LEXIFIED?")), cons(makeKeyword("NAUT"), makeSymbol("PPH-NAUT?")), cons(makeKeyword("SKSI-SUPPORTED-EXTERNAL-TERM"), makeSymbol("SKSI-SUPPORTED-EXTERNAL-TERM?")), cons(makeKeyword("RESOURCE-WITH-URI"), makeSymbol("PPH-RESOURCE-WITH-URI?")), cons(makeKeyword("DATE-NAUT"), makeSymbol("PPH-DATE-P")), cons(makeKeyword("YEAR-NAUT"), makeSymbol("PPH-YEAR-P")), cons(makeKeyword("MONTH-NAUT"), makeSymbol("PPH-MONTH-P")), cons(makeKeyword("DAY-NAUT"), makeSymbol("PPH-DAY-P")), cons(makeKeyword("IMAGE-URL"), makeSymbol("PPH-IMAGE-URL?")), cons(makeKeyword("SET-NAUT"), makeSymbol("PPH-SET-NAUT?")), cons(makeKeyword("EXPONENT-NAUT"), makeSymbol("PPH-EXPONENT-NAUT?")), cons(makeKeyword("UNICODE-NAUT"), makeSymbol("PPH-UNICODE-NAUT-P")), cons(makeKeyword("PHRASE-DENOTING-NAUT"), makeSymbol("PPH-PHRASE-NAUT?")), cons(makeKeyword("SUBCOLLECTION-RELATION-NAUT"), makeSymbol("PPH-SUBCOLLECTION-RELATION-NAUT?")), cons(makeKeyword("THE-COLLECTION-OF-NAT"), makeSymbol("PPH-THE-COLLECTION-OF-NAT?")), cons(makeKeyword("RELATIONAL-NOUN-SUBCOLLECTION-NAUT"), makeSymbol("PPH-SUBCOLLECTION-RELATION-NAUT-HAS-RELATIONAL-NOUN?")), cons(makeKeyword("NUMBER"), makeSymbol("NUMBERP")), cons(makeKeyword("UNIVERSAL-DATE"), makeSymbol("PPH-UNIVERSAL-DATE?")), cons(makeKeyword("UNIVERSAL-SECOND"), makeSymbol("PPH-UNIVERSAL-SECOND?")), cons(makeKeyword("FLOAT"), makeSymbol("FLOATP")), cons(makeKeyword("STRING"), makeSymbol("STRINGP")), cons(makeKeyword("CONSTANT"), makeSymbol("CONSTANT-P")), cons(makeKeyword("CYCL-SENTENCE"), makeSymbol("PPH-CYCL-SENTENCE?")), cons(makeKeyword("ROP-EXPRESSION"), makeSymbol("PPH-ROP-EXPRESSION?")), cons(makeKeyword("REL-VARIABLE"), makeSymbol("PPH-REL-VARIABLE?")), cons(makeKeyword("SKOLEM-TERM"), makeSymbol("PPH-SKOLEM-TERM?")), cons(makeKeyword("GEOPOLITICAL-ENTITY"), makeSymbol("PPH-GPE?")), cons(makeKeyword("CITY"), makeSymbol("PPH-CITY?")), cons(makeKeyword("US-CITY"), makeSymbol("PPH-US-CITY?")), cons(makeKeyword("NON-US-CITY"), makeSymbol("PPH-NON-US-CITY?")), cons(makeKeyword("KEYWORD"), makeSymbol("KEYWORDP")), cons(makeKeyword("CYCL-SYMBOL"), makeSymbol("PPH-CYCL-SYMBOL?")), cons(makeKeyword("ATOMIC-SENTENCE"), makeSymbol("PPH-ATOMIC-SENTENCE?")), cons(makeKeyword("NEGATION"), makeSymbol("EL-NEGATION-P")), cons(makeKeyword("SIMPLE-NEGATION"), makeSymbol("PPH-SIMPLE-NEGATION-P")), cons(makeKeyword("RMP-SENTENCE"), makeSymbol("PPH-RMP-SENTENCE?")), cons(makeKeyword("SPECIFIED-SCOPE-SENTENCE"), makeSymbol("PPH-SPECIFIED-SCOPE-SENTENCE?")), cons(makeKeyword("IMPLICATION"), makeSymbol("EL-IMPLICATION-P")), cons(makeKeyword("EXISTENTIAL"), makeSymbol("EL-EXISTENTIAL-P")), cons(makeKeyword("UNIVERSAL"), makeSymbol("PPH-SYNTACTIC-UNIVERSAL-P")), cons(makeKeyword("COORDINATION"), makeSymbol("PPH-COORDINATION-P")), cons(makeKeyword("CONJUNCTION"), makeSymbol("EL-CONJUNCTION-P")), cons(makeKeyword("DISJUNCTION"), makeSymbol("EL-DISJUNCTION-P")), cons(makeKeyword("VERB-SEMTRANS-MATCHER"), makeSymbol("PPH-VERB-SEMTRANS-MATCHER?")), cons(makeKeyword("NART"), makeSymbol("NART-P")), cons(makeKeyword("LEXIFIED-NART"), makeSymbol("PPH-LEXIFIED-NART?")), cons(makeKeyword("TRUE"), makeSymbol("CYC-CONST-TRUE?")), cons(makeKeyword("FALSE"), makeSymbol("CYC-CONST-FALSE?")), cons(makeKeyword("HYPOTHETICAL"), makeSymbol("PPH-HYPOTHETICAL?")), cons(makeKeyword("LEXICAL-WORD"), makeSymbol("PPH-LEXICAL-WORD?")), cons(makeKeyword("DISCOURSE-PARTICIPANT"), makeSymbol("PPH-DISCOURSE-PARTICIPANT-P")), cons(makeKeyword("OTHER-CONSTANT"), makeSymbol("VALID-CONSTANT?")), cons(makeKeyword("COLLECTION-DENOTING-NAT"), makeSymbol("PPH-COLLECTION-DENOTING-NAT?")), cons(makeKeyword("NL-TAGGED-TERM"), makeSymbol("PPH-NL-TAGGED-TERM?")), cons(makeKeyword("DB-FIELD"), makeSymbol("PPH-DB-FIELD?")), cons(makeKeyword("GROUND-DB-FIELD"), makeSymbol("PPH-GROUND-DB-FIELD?")), cons(makeKeyword("OPEN-DB-FIELD"), makeSymbol("PPH-OPEN-DB-FIELD?")), cons(makeKeyword("KAPPA-EXPR"), makeSymbol("PPH-KAPPA-EXPR?")), cons(makeKeyword("FN-TO-ARG-0"), makeSymbol("PPH-FN-TO-ARG-0?")), cons(makeKeyword("ABNORMAL"), makeSymbol("EL-ABNORMAL-P")), cons(makeKeyword("EXCEPTION"), makeSymbol("EL-EXCEPTION-P")), cons(makeKeyword("CFF-EXPR"), makeSymbol("PPH-CFF-EXPR?")), cons(makeKeyword("CF-IMPLICATION"), makeSymbol("PPH-CF-IMPLICATION?")), cons(makeKeyword("DB-ENTRY-FN"), makeSymbol("PPH-DB-ENTRY-FN?")) });

    public static final SubLSymbol $pph_type_method_hash$ = makeSymbol("*PPH-TYPE-METHOD-HASH*");



    public static final SubLList $list4 = list(makeKeyword("FALLBACK"), makeKeyword("DECENT"), makeKeyword("BEST"));

    public static final SubLString $str5$__Found__D_methods_for__S___S___ = makeString("~&Found ~D methods for ~S: ~S.~%");

    public static final SubLString $str6$__Found_no_methods_for__S___ = makeString("~&Found no methods for ~S.~%");

    public static final SubLList $list7 = list(makeSymbol("METHOD-SYMBOL"), makeSymbol("METHOD-QUALITY"));

    public static final SubLString $str8$__Found_paraphrase_methods_for__S = makeString("~&Found paraphrase methods for ~S:~% ~S~%");

    public static final SubLString $str9$__No_paraphrase_methods_found_for = makeString("~&No paraphrase methods found for ~S.~%");

    public static final SubLString $str10$_PPH_error_level_ = makeString("(PPH error level ");

    public static final SubLString $str11$__ = makeString(") ");

    public static final SubLString $str12$___S_is_not_a_valid_paraphrase_ty = makeString("~&~S is not a valid paraphrase type.~%");

    public static final SubLString $str13$___S_is_not_a_symbol___ = makeString("~&~S is not a symbol.~%");

    public static final SubLString $str14$___S_is_not_a_valid_paraphrase_me = makeString("~&~S is not a valid paraphrase method quality.~%Must be in ~S.~%");



    public static final SubLString $str16$___S_is_not_a_registered_method_f = makeString("~&~S is not a registered method for ~S.~%");

    public static final SubLSymbol PPH_METHOD_INFO = makeSymbol("PPH-METHOD-INFO");

    public static final SubLSymbol SUSPENDING_PARAPHRASE_METHOD = makeSymbol("SUSPENDING-PARAPHRASE-METHOD");

    public static final SubLList $list19 = list(makeSymbol("SYMBOL"), makeSymbol("QUALITY"));

    public static final SubLSymbol PPH_REGISTER_METHOD_INFO = makeSymbol("PPH-REGISTER-METHOD-INFO");

    public static final SubLList $list21 = list(makeSymbol("TYPE"), makeSymbol("QUALITY"));

    public static final SubLSymbol PPH_DEREGISTER_METHOD_INFO = makeSymbol("PPH-DEREGISTER-METHOD-INFO");



    public static final SubLSymbol $sym24$PPH_HIGHER_METHOD_QUALITY_ = makeSymbol("PPH-HIGHER-METHOD-QUALITY?");



    public static final SubLSymbol $sym26$_ = makeSymbol("<");

    private static final SubLList $list27 = list(makeKeyword("OBJECT"));

    private static final SubLList $list28 = cons(makeSymbol("TYPE"), makeSymbol("MORE-TYPES"));

    private static final SubLString $str29$___S___passed_test__S_for_termina = makeString("~&~S~% passed test ~S for terminal type ~S.~%");

    private static final SubLString $str30$___S___passed_test__S_for_non_ter = makeString("~&~S~% passed test ~S for non-terminal type ~S.~%");

    private static final SubLString $str31$___S___failed_test__S_for_non_fin = makeString("~&~S~% failed test ~S for non-final type ~S.~%");

    private static final SubLString $str32$___S___failed_test__S_for_final_t = makeString("~&~S~% failed test ~S for final type ~S.~%");

    private static final SubLString $str33$___S___judged_to_be_non_terminal_ = makeString("~&~S~% judged to be non-terminal type ~S.~%");

    private static final SubLString $str34$___S___does_not_pass_top_level_te = makeString("~&~S~% does not pass top-level test ~S.~%");

    private static final SubLObject $$CollectionDenotingFunction = reader_make_constant_shell(makeString("CollectionDenotingFunction"));

    private static final SubLObject $$TheSetOf = reader_make_constant_shell(makeString("TheSetOf"));

    private static final SubLList $list37 = list(reader_make_constant_shell(makeString("ExponentFn")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"));

    private static final SubLList $list38 = list(new SubLObject[]{ reader_make_constant_shell(makeString("CenturyFn")), reader_make_constant_shell(makeString("DecadeFn")), reader_make_constant_shell(makeString("YearFn")), reader_make_constant_shell(makeString("QuarterFn")), reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("DayFn")), reader_make_constant_shell(makeString("HourFn")), reader_make_constant_shell(makeString("MinuteFn")), reader_make_constant_shell(makeString("SecondFn")), reader_make_constant_shell(makeString("MilliSecondFn")) });

    public static final SubLList $list39 = list(reader_make_constant_shell(makeString("YearFn")), list(makeKeyword("TEST"), makeSymbol("POSITIVE-INTEGER-P")));

    public static final SubLList $list40 = list(reader_make_constant_shell(makeString("MonthFn")), makeKeyword("FORT"), list(makeKeyword("TEST"), makeSymbol("PPH-YEAR-P")));

    public static final SubLList $list41 = list(reader_make_constant_shell(makeString("DayFn")), list(makeKeyword("TEST"), makeSymbol("POSITIVE-INTEGER-P")), list(makeKeyword("TEST"), makeSymbol("PPH-MONTH-P")));

    private static final SubLObject $$Function_Denotational = reader_make_constant_shell(makeString("Function-Denotational"));

    private static final SubLList $list43 = list(reader_make_constant_shell(makeString("SchemaObjectFn")), reader_make_constant_shell(makeString("CCF-SDB-Bnode-CMLS")), makeKeyword("STRING"));

    private static final SubLObject $$TruthFunction = reader_make_constant_shell(makeString("TruthFunction"));

    private static final SubLObject $$rewriteOf = reader_make_constant_shell(makeString("rewriteOf"));



    private static final SubLObject $$True = reader_make_constant_shell(makeString("True"));

    private static final SubLObject $$False = reader_make_constant_shell(makeString("False"));

    private static final SubLObject $$expansion = reader_make_constant_shell(makeString("expansion"));

    private static final SubLObject $$cfImplies = reader_make_constant_shell(makeString("cfImplies"));

    private static final SubLObject $$compositeFieldFormat = reader_make_constant_shell(makeString("compositeFieldFormat"));

    private static final SubLObject $$ScriptPredicate = reader_make_constant_shell(makeString("ScriptPredicate"));

    private static final SubLList $list53 = list(reader_make_constant_shell(makeString("nthLargestElement")), reader_make_constant_shell(makeString("nthSmallestElement")));

    private static final SubLObject $$Collection = reader_make_constant_shell(makeString("Collection"));

    private static final SubLObject $$GeopoliticalEntity = reader_make_constant_shell(makeString("GeopoliticalEntity"));

    private static final SubLObject $$InferencePSC = reader_make_constant_shell(makeString("InferencePSC"));

    private static final SubLObject $$City = reader_make_constant_shell(makeString("City"));

    private static final SubLObject $$USCity = reader_make_constant_shell(makeString("USCity"));

    private static final SubLObject $$hypotheticalTerm = reader_make_constant_shell(makeString("hypotheticalTerm"));







    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    private static final SubLObject $$TruthValue = reader_make_constant_shell(makeString("TruthValue"));

    private static final SubLObject $$TheResultOfParsing = reader_make_constant_shell(makeString("TheResultOfParsing"));

    private static final SubLObject $$TheCollectionOf = reader_make_constant_shell(makeString("TheCollectionOf"));

    private static final SubLObject $$SubcollectionRelationFunction = reader_make_constant_shell(makeString("SubcollectionRelationFunction"));

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));











    private static final SubLString $str74$_A_is_not_a__A = makeString("~A is not a ~A");





    private static final SubLString $$$continue_anyway = makeString("continue anyway");



    private static final SubLString $str79$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    private static final SubLString $str80$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");

    private static final SubLString $str81$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    private static final SubLList $list82 = list(makeUninternedSymbol("LINK-NODE"), makeUninternedSymbol("MT"), makeUninternedSymbol("TV"));

    private static final SubLString $str83$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

    private static final SubLObject $$CollectionSubsetFn = reader_make_constant_shell(makeString("CollectionSubsetFn"));



    private static final SubLList $list86 = list(list(makeKeyword("OR"), reader_make_constant_shell(makeString("SubcollectionOfWithRelationFromTypeFn")), reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("SubcollectionOfWithRelationFromFn")), reader_make_constant_shell(makeString("SubcollectionOfWithRelationToFn"))), list(makeKeyword("BIND"), makeSymbol("GENL")), list(makeKeyword("BIND"), makeSymbol("BIN-PRED")), list(makeKeyword("BIND"), makeSymbol("VALUE")));









    private static final SubLSymbol $sym91$PPH_TERM_HAS_EXPANSION_ = makeSymbol("PPH-TERM-HAS-EXPANSION?");



    private static final SubLSymbol PPH_MATCHING_VERB_SEMTRANS_ASSERTIONS = makeSymbol("PPH-MATCHING-VERB-SEMTRANS-ASSERTIONS");



    private static final SubLList $list95 = list(reader_make_constant_shell(makeString("isa")), list(makeKeyword("BIND"), makeSymbol("ARG1")), list(makeKeyword("BIND"), makeSymbol("ARG2")));





    private static final SubLString $str98$Found_head_binding_conjunct_____S = makeString("Found head-binding conjunct:~% ~S");

    private static final SubLObject $$verbSemTrans_Canonical = reader_make_constant_shell(makeString("verbSemTrans-Canonical"));



    private static final SubLString $str101$Found_matching_vST_Canonical_____ = makeString("Found matching vST-Canonical:~% ~S");

    private static final SubLSymbol $sym102$PPH_FRAME_ARITY__ = makeSymbol("PPH-FRAME-ARITY->");

    private static final SubLSymbol GAF_ARG3 = makeSymbol("GAF-ARG3");

    private static final SubLInteger $int$24 = makeInteger(24);

    private static final SubLObject $$FunctionToArg = reader_make_constant_shell(makeString("FunctionToArg"));

    private static final SubLObject $$Kappa = reader_make_constant_shell(makeString("Kappa"));

    private static final SubLSymbol $sym107$EL_VAR_ = makeSymbol("EL-VAR?");

    private static final SubLObject $$fieldCodes = reader_make_constant_shell(makeString("fieldCodes"));

    private static final SubLList $list109 = list(reader_make_constant_shell(makeString("SchemaLF")), reader_make_constant_shell(makeString("SchemaPF")));

    private static final SubLObject $$DBEntryFn = reader_make_constant_shell(makeString("DBEntryFn"));

    private static final SubLList $list111 = list(reader_make_constant_shell(makeString("ImageURLFn")), makeKeyword("ANYTHING"));

    public static SubLObject get_paraphrase_methods(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject types = pph_identify_type(v_object);
        SubLObject v_methods = NIL;
        SubLObject sub_type = NIL;
        SubLObject type_demerits = ZERO_INTEGER;
        SubLObject cdolist_list_var = types;
        SubLObject type = NIL;
        type = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject type_methods = pph_methods_for_type(type);
            final SubLObject transition_demerits = pph_type_transition_demerits(type, sub_type);
            type_demerits = add(type_demerits, transition_demerits);
            if (NIL != type_methods) {
                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(THREE_INTEGER)) {
                    format_nil.force_format(T, $str5$__Found__D_methods_for__S___S___, length(type_methods), type, type_methods, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            } else
                if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
                    Errors.warn($str6$__Found_no_methods_for__S___, type);
                    force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                }

            SubLObject cdolist_list_var_$1 = type_methods;
            SubLObject method = NIL;
            method = cdolist_list_var_$1.first();
            while (NIL != cdolist_list_var_$1) {
                SubLObject current;
                final SubLObject datum = current = method;
                SubLObject method_symbol = NIL;
                SubLObject method_quality = NIL;
                destructuring_bind_must_consp(current, datum, $list7);
                method_symbol = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list7);
                method_quality = current.first();
                current = current.rest();
                if (NIL == current) {
                    final SubLObject quality_demerits = pph_method_quality_demerits(method_quality);
                    final SubLObject method_demerits = add(type_demerits, quality_demerits);
                    final SubLObject item_var = list(method_symbol, method_demerits);
                    if (NIL == member(item_var, v_methods, symbol_function(EQL), symbol_function(IDENTITY))) {
                        v_methods = cons(item_var, v_methods);
                    }
                } else {
                    cdestructuring_bind_error(datum, $list7);
                }
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                method = cdolist_list_var_$1.first();
            } 
            sub_type = type;
            cdolist_list_var = cdolist_list_var.rest();
            type = cdolist_list_var.first();
        } 
        v_methods = pph_sort_methods_by_demerits(nreverse(v_methods));
        if (NIL != v_methods) {
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                format_nil.force_format(T, $str8$__Found_paraphrase_methods_for__S, v_object, v_methods, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        } else
            if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
                Errors.warn($str9$__No_paraphrase_methods_found_for, v_object);
                force_output(StreamsLow.$error_output$.getDynamicValue(thread));
            }

        return v_methods;
    }

    public static SubLObject pph_register_method(final SubLObject symbol, final SubLObject type, final SubLObject quality) {
        if (NIL == pph_valid_typeP(type)) {
            final SubLObject new_format_string = cconcatenate($str10$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(TWO_INTEGER), $str11$__, format_nil.format_nil_a_no_copy($str12$___S_is_not_a_valid_paraphrase_ty) });
            pph_error.pph_handle_error(new_format_string, list(type));
            return NIL;
        }
        if (!symbol.isSymbol()) {
            final SubLObject new_format_string = cconcatenate($str10$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(TWO_INTEGER), $str11$__, format_nil.format_nil_a_no_copy($str13$___S_is_not_a_symbol___) });
            pph_error.pph_handle_error(new_format_string, list(symbol));
            return NIL;
        }
        if (NIL == pph_valid_method_qualityP(quality)) {
            final SubLObject new_format_string = cconcatenate($str10$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(TWO_INTEGER), $str11$__, format_nil.format_nil_a_no_copy($str14$___S_is_not_a_valid_paraphrase_me) });
            pph_error.pph_handle_error(new_format_string, list(type, $pph_valid_method_qualities$.getGlobalValue()));
            return NIL;
        }
        final SubLObject existing = pph_type_entries(type);
        final SubLObject new_pair = list(symbol, quality);
        final SubLObject new_value = pph_sort_methods(cons(new_pair, remove(symbol, existing, symbol_function(EQ), symbol_function(FIRST), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        sethash(type, $pph_type_method_hash$.getGlobalValue(), new_value);
        return pph_type_entries(type);
    }

    public static SubLObject pph_deregister_method(final SubLObject symbol, final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == pph_valid_typeP(type)) {
            final SubLObject new_format_string = cconcatenate($str10$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(TWO_INTEGER), $str11$__, format_nil.format_nil_a_no_copy($str12$___S_is_not_a_valid_paraphrase_ty) });
            pph_error.pph_handle_error(new_format_string, list(type));
            return NIL;
        }
        if (!symbol.isSymbol()) {
            final SubLObject new_format_string = cconcatenate($str10$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(TWO_INTEGER), $str11$__, format_nil.format_nil_a_no_copy($str13$___S_is_not_a_symbol___) });
            pph_error.pph_handle_error(new_format_string, list(symbol));
            return NIL;
        }
        final SubLObject entries = pph_type_entries(type);
        final SubLObject entry = assoc(symbol, entries, UNPROVIDED, UNPROVIDED);
        if (NIL == entry) {
            if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(THREE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
                Errors.warn($str16$___S_is_not_a_registered_method_f, symbol, type);
                force_output(StreamsLow.$error_output$.getDynamicValue(thread));
            }
        } else {
            sethash(type, $pph_type_method_hash$.getGlobalValue(), remove(entry, entries, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        }
        return pph_type_entries(type);
    }

    public static SubLObject pph_method_info(final SubLObject method_symbol, final SubLObject object_type) {
        SubLObject ans = NIL;
        if (NIL != object_type) {
            SubLObject cdolist_list_var = pph_type_entries(object_type);
            SubLObject pair = NIL;
            pair = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = pair;
                SubLObject symbol = NIL;
                SubLObject quality = NIL;
                destructuring_bind_must_consp(current, datum, $list19);
                symbol = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list19);
                quality = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (symbol.eql(method_symbol)) {
                        ans = cons(list(object_type, quality), ans);
                    }
                } else {
                    cdestructuring_bind_error(datum, $list19);
                }
                cdolist_list_var = cdolist_list_var.rest();
                pair = cdolist_list_var.first();
            } 
        } else {
            SubLObject type = NIL;
            SubLObject pairs = NIL;
            final Iterator cdohash_iterator = getEntrySetIterator($pph_type_method_hash$.getGlobalValue());
            try {
                while (iteratorHasNext(cdohash_iterator)) {
                    final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                    type = getEntryKey(cdohash_entry);
                    SubLObject cdolist_list_var2;
                    pairs = cdolist_list_var2 = getEntryValue(cdohash_entry);
                    SubLObject pair2 = NIL;
                    pair2 = cdolist_list_var2.first();
                    while (NIL != cdolist_list_var2) {
                        SubLObject current2;
                        final SubLObject datum2 = current2 = pair2;
                        SubLObject symbol2 = NIL;
                        SubLObject quality2 = NIL;
                        destructuring_bind_must_consp(current2, datum2, $list19);
                        symbol2 = current2.first();
                        current2 = current2.rest();
                        destructuring_bind_must_consp(current2, datum2, $list19);
                        quality2 = current2.first();
                        current2 = current2.rest();
                        if (NIL == current2) {
                            if (symbol2.eql(method_symbol)) {
                                ans = cons(list(type, quality2), ans);
                            }
                        } else {
                            cdestructuring_bind_error(datum2, $list19);
                        }
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        pair2 = cdolist_list_var2.first();
                    } 
                } 
            } finally {
                releaseEntrySetIterator(cdohash_iterator);
            }
        }
        return ans;
    }

    public static SubLObject pph_register_method_info(final SubLObject method_symbol, final SubLObject info) {
        SubLObject cdolist_list_var = info;
        SubLObject pair = NIL;
        pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = pair;
            SubLObject type = NIL;
            SubLObject quality = NIL;
            destructuring_bind_must_consp(current, datum, $list21);
            type = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list21);
            quality = current.first();
            current = current.rest();
            if (NIL == current) {
                pph_register_method(method_symbol, type, quality);
            } else {
                cdestructuring_bind_error(datum, $list21);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject pph_deregister_method_info(final SubLObject method_symbol, final SubLObject info) {
        SubLObject cdolist_list_var = info;
        SubLObject pair = NIL;
        pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = pair;
            SubLObject type = NIL;
            SubLObject quality = NIL;
            destructuring_bind_must_consp(current, datum, $list21);
            type = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list21);
            quality = current.first();
            current = current.rest();
            if (NIL == current) {
                pph_deregister_method(method_symbol, type);
            } else {
                cdestructuring_bind_error(datum, $list21);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject pph_type_entries(final SubLObject type) {
        return gethash(type, $pph_type_method_hash$.getGlobalValue(), UNPROVIDED);
    }

    public static SubLObject pph_subtypes(final SubLObject super_type) {
        return second(list_utilities.alist_lookup($pph_type_tree$.getGlobalValue(), super_type, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject pph_type_transition_demerits(final SubLObject super_type, final SubLObject sub_type) {
        final SubLObject subtypes = list_utilities.remove_if_not(symbol_function(LISTP), pph_subtypes(super_type), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return list_utilities.alist_lookup(subtypes, sub_type, symbol_function(EQ), ZERO_INTEGER);
    }

    public static SubLObject pph_sort_methods(final SubLObject v_methods) {
        return Sort.stable_sort(copy_list(v_methods), symbol_function($sym24$PPH_HIGHER_METHOD_QUALITY_), symbol_function(SECOND));
    }

    public static SubLObject pph_sort_methods_by_demerits(final SubLObject v_methods) {
        return Sort.stable_sort(copy_list(v_methods), symbol_function($sym26$_), symbol_function(SECOND));
    }

    public static SubLObject pph_higher_method_qualityP(final SubLObject q1, final SubLObject q2) {
        final SubLObject q1_value = pph_method_quality_score(q1);
        final SubLObject q2_value = pph_method_quality_score(q2);
        return makeBoolean(((NIL != q1_value) && (NIL != q2_value)) && q1_value.numG(q2_value));
    }

    public static SubLObject pph_method_quality_score(final SubLObject quality) {
        return position(quality, $pph_valid_method_qualities$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject pph_method_quality_demerits(final SubLObject quality) {
        final SubLObject score = pph_method_quality_score(quality);
        return score.isInteger() ? subtract(length($pph_valid_method_qualities$.getGlobalValue()), number_utilities.f_1X(score)) : NIL;
    }

    public static SubLObject pph_valid_typeP(final SubLObject v_object) {
        return list_utilities.sublisp_boolean(list_utilities.tree_find(v_object, $pph_type_tree$.getGlobalValue(), UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject pph_valid_method_qualityP(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, $pph_valid_method_qualities$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject paraphrase_test(final SubLObject type_key) {
        return list_utilities.alist_lookup($paraphrase_tests$.getGlobalValue(), type_key, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject pph_methods_for_type(final SubLObject type) {
        return pph_type_entries(type);
    }

    public static SubLObject pph_identify_type(final SubLObject v_object) {
        return pph_identify_type_int(v_object, $list27, NIL);
    }

    public static SubLObject pph_identify_type_int(final SubLObject v_object, final SubLObject untried_types, SubLObject identified_types) {
        if (NIL == untried_types) {
            return identified_types;
        }
        SubLObject type = NIL;
        SubLObject more_types = NIL;
        destructuring_bind_must_consp(untried_types, untried_types, $list28);
        type = untried_types.first();
        final SubLObject current = more_types = untried_types.rest();
        if ((type.isCons() && type.first().isSymbol()) && type.rest().isInteger()) {
            type = type.first();
        }
        final SubLObject test = paraphrase_test(type);
        final SubLObject object_passes_testP = pph_object_has_typeP(v_object, type);
        final SubLObject sub_types = (NIL != object_passes_testP) ? pph_subtypes(type) : NIL;
        if (NIL != object_passes_testP) {
            identified_types = cons(type, identified_types);
        }
        if (NIL != object_passes_testP) {
            if (NIL == sub_types) {
                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                    format_nil.force_format(T, $str29$___S___passed_test__S_for_termina, v_object, test, type, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            } else
                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(THREE_INTEGER)) {
                    format_nil.force_format(T, $str30$___S___passed_test__S_for_non_ter, v_object, test, type, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }

            return pph_identify_type_int(v_object, sub_types, identified_types);
        }
        if (NIL != more_types) {
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(THREE_INTEGER)) {
                format_nil.force_format(T, $str31$___S___failed_test__S_for_non_fin, v_object, test, type, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            return pph_identify_type_int(v_object, more_types, identified_types);
        }
        if (NIL != identified_types) {
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(THREE_INTEGER)) {
                format_nil.force_format(T, $str32$___S___failed_test__S_for_final_t, v_object, test, type, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                format_nil.force_format(T, $str33$___S___judged_to_be_non_terminal_, v_object, identified_types.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            return identified_types;
        }
        final SubLObject new_format_string = cconcatenate($str10$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str11$__, format_nil.format_nil_a_no_copy($str34$___S___does_not_pass_top_level_te) });
        pph_error.pph_handle_error(new_format_string, list(v_object, test));
        return NIL;
    }

    public static SubLObject pph_object_has_typeP(final SubLObject v_object, final SubLObject type) {
        final SubLObject test = paraphrase_test(type);
        return NIL != fboundp(test) ? funcall(test, v_object) : NIL;
    }

    public static SubLObject pph_paraphrasable_objectP(final SubLObject v_object) {
        return makeBoolean(((NIL != cycl_grammar.cycl_term_p(v_object)) || v_object.isList()) || v_object.isAtom());
    }

    public static SubLObject pph_collection_denoting_natP(final SubLObject naut) {
        final SubLObject fn = cycl_utilities.nat_functor(naut);
        return pph_utilities.pph_isaP(fn, $$CollectionDenotingFunction, UNPROVIDED);
    }

    public static SubLObject pph_nl_tagged_termP(final SubLObject naut) {
        return parsing_utilities.nl_tagged_termP(naut);
    }

    public static SubLObject pph_set_nautP(final SubLObject naut) {
        return makeBoolean(cycl_utilities.nat_functor(naut).eql($$TheSetOf) && (NIL != el_formula_p(cycl_utilities.nat_arg2(naut, UNPROVIDED))));
    }

    public static SubLObject pph_exponent_nautP(final SubLObject naut) {
        return formula_pattern_match.formula_matches_pattern(naut, $list37);
    }

    public static SubLObject pph_unicode_naut_p(final SubLObject naut) {
        return unicode_nauts.unicode_naut_p(naut, UNPROVIDED);
    }

    public static SubLObject pph_date_p(final SubLObject naut) {
        return subl_promotions.memberP(cycl_utilities.nat_functor(naut), $pph_date_denoting_functions$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject pph_year_p(final SubLObject naut) {
        return formula_pattern_match.formula_matches_pattern(naut, $list39);
    }

    public static SubLObject pph_month_p(final SubLObject naut) {
        return formula_pattern_match.formula_matches_pattern(naut, $list40);
    }

    public static SubLObject pph_day_p(final SubLObject naut) {
        return formula_pattern_match.formula_matches_pattern(naut, $list41);
    }

    public static SubLObject pph_time_p(final SubLObject naut) {
        return date_utilities.time_p(naut);
    }

    public static SubLObject pph_universal_with_atomic_scopeP(final SubLObject obj) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(pph_vars.$pph_domain_mt$.getDynamicValue(thread));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            ans = makeBoolean((NIL != pph_syntactic_universal_p(obj)) && (NIL != cycl_grammar.cycl_atomic_sentence_p(cycl_utilities.formula_arg2(obj, UNPROVIDED))));
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject pph_nautP(final SubLObject obj) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg0 = obj.first();
        final SubLObject ans = makeBoolean((NIL != el_formula_p(obj)) && (NIL != (NIL != forts.fort_p(arg0) ? fort_types_interface.non_predicate_functionP(arg0) : pph_utilities.pph_isaP(arg0, $$Function_Denotational, pph_vars.$pph_domain_mt$.getDynamicValue(thread)))));
        return ans;
    }

    public static SubLObject ccf_bnode_p(final SubLObject v_object) {
        return makeBoolean((NIL != el_formula_p(v_object)) && (NIL != formula_pattern_match.formula_matches_pattern(v_object, $list43)));
    }

    public static SubLObject pph_cycl_sentenceP(final SubLObject obj) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg0 = obj.first();
        final SubLObject ans = makeBoolean((NIL != el_formula_p(obj)) && (((NIL != fort_types_interface.predicateP(arg0)) || (NIL != cycl_variables.el_varP(arg0))) || (NIL != (NIL != forts.fort_p(arg0) ? fort_types_interface.sentential_relation_p(arg0) : pph_utilities.pph_isaP(arg0, $$TruthFunction, pph_vars.$pph_domain_mt$.getDynamicValue(thread))))));
        return ans;
    }

    public static SubLObject pph_coordination_p(final SubLObject obj) {
        return makeBoolean((NIL != el_conjunction_p(obj)) || (NIL != el_disjunction_p(obj)));
    }

    public static SubLObject pph_syntactic_universal_p(final SubLObject obj) {
        return makeBoolean((NIL != el_universal_p(obj)) && (NIL != cycl_variables.el_varP(cycl_utilities.formula_arg1(obj, UNPROVIDED))));
    }

    public static SubLObject pph_atomic_sentenceP(final SubLObject obj) {
        return fort_types_interface.predicateP(obj.first());
    }

    public static SubLObject pph_cycl_symbolP(final SubLObject obj) {
        return makeBoolean(obj.isSymbol() && (NIL != fboundp(obj)));
    }

    public static SubLObject pph_lexified_nartP(final SubLObject obj) {
        if (NIL == nart_handles.nart_p(obj)) {
            return NIL;
        }
        if (NIL != lexification_utilities.lexifiedP(obj, NIL)) {
            return T;
        }
        SubLObject cdolist_list_var = kb_mapping_utilities.pred_values(obj, $$rewriteOf, TWO_INTEGER, ONE_INTEGER, $TRUE);
        SubLObject rewrite = NIL;
        rewrite = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != lexification_utilities.lexifiedP(rewrite, NIL)) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            rewrite = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject pph_non_cycl_symbolP(final SubLObject obj) {
        return makeBoolean(obj.isSymbol() && (NIL == fboundp(obj)));
    }

    public static SubLObject cyc_const_trueP(final SubLObject v_object) {
        return eq(v_object, $$True);
    }

    public static SubLObject cyc_const_falseP(final SubLObject v_object) {
        return eq(v_object, $$False);
    }

    public static SubLObject pph_rel_variableP(final SubLObject v_object) {
        return makeBoolean(v_object.isCons() && (NIL != cycl_variables.el_varP(v_object.first())));
    }

    public static SubLObject pph_simple_negation_p(final SubLObject v_object) {
        return makeBoolean((NIL != el_negation_p(v_object)) && (NIL != groundP(cycl_utilities.formula_arg1(v_object, UNPROVIDED), UNPROVIDED)));
    }

    public static SubLObject pph_rmp_sentenceP(final SubLObject asent) {
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        return pph_reln_has_expansionP(pred, UNPROVIDED);
    }

    public static SubLObject pph_reln_has_expansionP(final SubLObject reln, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        if (NIL != indexed_term_p(reln)) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                ans = kb_mapping_utilities.some_pred_value(reln, $$expansion, UNPROVIDED, UNPROVIDED);
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return ans;
    }

    public static SubLObject pph_specified_scope_sentenceP(final SubLObject formula) {
        return makeBoolean((((NIL != el_formula_p(formula)) && (NIL != formula_arityE(formula, THREE_INTEGER, UNPROVIDED))) && (NIL != indexed_term_p(cycl_utilities.formula_arg1(formula, UNPROVIDED)))) && (NIL != pph_methods_formulas.specified_wide_scope_argnum(cycl_utilities.formula_operator(formula))));
    }

    public static SubLObject pph_cf_implicationP(final SubLObject v_object) {
        return makeBoolean((NIL != valid_constantP($$cfImplies, UNPROVIDED)) && (NIL != el_formula_with_operator_p(v_object, $$cfImplies)));
    }

    public static SubLObject pph_cff_exprP(final SubLObject v_object) {
        return el_formula_with_operator_p(v_object, $$compositeFieldFormat);
    }

    public static SubLObject pph_script_expP(final SubLObject v_object) {
        return makeBoolean(((NIL != valid_constantP($$ScriptPredicate, UNPROVIDED)) && (NIL != el_formula_with_operator_p(v_object, $$expansion))) && (NIL != pph_utilities.pph_isaP(cycl_utilities.formula_arg1(v_object, UNPROVIDED), $$ScriptPredicate, UNPROVIDED)));
    }

    public static SubLObject pph_nth_exprP(final SubLObject v_object) {
        return makeBoolean((NIL != pph_formulaP(v_object)) && (NIL != member(v_object.first(), $list53, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject pph_skolem_termP(final SubLObject obj) {
        return term.fast_skolem_natP(obj);
    }

    public static SubLObject pph_gpeP(final SubLObject fort) {
        return makeBoolean((NIL == pph_utilities.pph_isaP(fort, $$Collection, UNPROVIDED)) && (NIL != pph_utilities.pph_isaP(fort, $$GeopoliticalEntity, $$InferencePSC)));
    }

    public static SubLObject pph_cityP(final SubLObject fort) {
        return pph_utilities.pph_isaP(fort, $$City, $$InferencePSC);
    }

    public static SubLObject pph_us_cityP(final SubLObject fort) {
        return pph_utilities.pph_isaP(fort, $$USCity, $$InferencePSC);
    }

    public static SubLObject pph_non_us_cityP(final SubLObject city) {
        return makeBoolean(NIL == pph_us_cityP(city));
    }

    public static SubLObject pph_hypotheticalP(final SubLObject constant) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != pph_vars.$pph_handle_hypotheticalsP$.getDynamicValue(thread)) && (NIL != pph_utilities.pph_removal_ask_boolean(list($$hypotheticalTerm, constant), $$InferencePSC)));
    }

    public static SubLObject pph_lexical_wordP(final SubLObject v_object) {
        return lexicon_accessors.quick_lexical_wordP(v_object, UNPROVIDED);
    }

    public static SubLObject pph_universal_dateP(final SubLObject obj) {
        return makeBoolean((NIL != pph_utilities.pph_environment_search($UNIVERSAL_DATE)) && (NIL != numeric_date_utilities.universal_date_p(obj)));
    }

    public static SubLObject pph_universal_secondP(final SubLObject obj) {
        return makeBoolean((NIL != pph_utilities.pph_environment_search($UNIVERSAL_SECOND)) && (NIL != numeric_date_utilities.universal_second_p(obj)));
    }

    public static SubLObject pph_formulaP(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            ans = makeBoolean(((NIL != el_formulaP(v_object)) || (NIL != term.nautP(v_object, UNPROVIDED))) || (NIL != pph_utilities.pph_isaP(v_object, $$TruthValue, UNPROVIDED)));
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject pph_rop_expressionP(final SubLObject v_object) {
        return pph_rop_natP(v_object.first());
    }

    public static SubLObject pph_rop_natP(final SubLObject cycl) {
        return makeBoolean((NIL != collection_defns.cycl_formulaP(cycl)) && cycl_utilities.formula_operator(cycl).eql($$TheResultOfParsing));
    }

    public static SubLObject pph_subcollection_relation_nautP(final SubLObject naut) {
        return pph_subcol_fnP(cycl_utilities.nat_function(naut));
    }

    public static SubLObject pph_the_collection_of_natP(final SubLObject nat) {
        return eql(cycl_utilities.nat_functor(nat), $$TheCollectionOf);
    }

    public static SubLObject initialize_pph_subcol_fns() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        set.clear_set($pph_subcol_fns$.getDynamicValue(thread));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject node_var = $$SubcollectionRelationFunction;
            final SubLObject _prev_bind_0_$2 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
            final SubLObject _prev_bind_1_$3 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
            try {
                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$isa), thread);
                sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    SubLObject node_var_$4 = node_var;
                    final SubLObject deck_type = $STACK;
                    final SubLObject recur_deck = deck.create_deck(deck_type);
                    final SubLObject _prev_bind_0_$3 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            final SubLObject tv_var = NIL;
                            final SubLObject _prev_bind_0_$4 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$4 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                    final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                    if (pcase_var.eql($ERROR)) {
                                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str74$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if (pcase_var.eql($CERROR)) {
                                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str74$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } else
                                            if (pcase_var.eql($WARN)) {
                                                Errors.warn($str74$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                            } else {
                                                Errors.warn($str79$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                Errors.cerror($$$continue_anyway, $str74$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                            }


                                }
                                final SubLObject _prev_bind_0_$5 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$5 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                    if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                        final SubLObject _prev_bind_0_$6 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$6 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_2_$12 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$4, UNPROVIDED);
                                            while (NIL != node_var_$4) {
                                                final SubLObject tt_node_var = node_var_$4;
                                                SubLObject cdolist_list_var;
                                                final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$isa));
                                                SubLObject module_var = NIL;
                                                module_var = cdolist_list_var.first();
                                                while (NIL != cdolist_list_var) {
                                                    final SubLObject _prev_bind_0_$7 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$7 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                        final SubLObject node = function_terms.naut_to_nart(tt_node_var);
                                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != d_link) {
                                                                final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != mt_links) {
                                                                    SubLObject iteration_state;
                                                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        final SubLObject tv_links = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                            final SubLObject _prev_bind_0_$8 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                SubLObject iteration_state_$16;
                                                                                for (iteration_state_$16 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$16); iteration_state_$16 = dictionary_contents.do_dictionary_contents_next(iteration_state_$16)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$16);
                                                                                    final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                        final SubLObject _prev_bind_0_$9 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                            final SubLObject sol = link_nodes;
                                                                                            if (NIL != set.set_p(sol)) {
                                                                                                final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                SubLObject basis_object;
                                                                                                SubLObject state;
                                                                                                SubLObject fn;
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    fn = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state, fn)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(fn, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(fn, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        set.set_add(fn, $pph_subcol_fns$.getDynamicValue(thread));
                                                                                                    }
                                                                                                }
                                                                                            } else
                                                                                                if (sol.isList()) {
                                                                                                    SubLObject csome_list_var = sol;
                                                                                                    SubLObject fn2 = NIL;
                                                                                                    fn2 = csome_list_var.first();
                                                                                                    while (NIL != csome_list_var) {
                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(fn2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(fn2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                            set.set_add(fn2, $pph_subcol_fns$.getDynamicValue(thread));
                                                                                                        }
                                                                                                        csome_list_var = csome_list_var.rest();
                                                                                                        fn2 = csome_list_var.first();
                                                                                                    } 
                                                                                                } else {
                                                                                                    Errors.error($str80$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                }

                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$9, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$16);
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$8, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                }
                                                            } else {
                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str81$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            }
                                                            if (NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED))) {
                                                                SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                                SubLObject instance_tuple = NIL;
                                                                instance_tuple = csome_list_var2.first();
                                                                while (NIL != csome_list_var2) {
                                                                    SubLObject current;
                                                                    final SubLObject datum = current = instance_tuple;
                                                                    SubLObject link_node = NIL;
                                                                    SubLObject mt2 = NIL;
                                                                    SubLObject tv2 = NIL;
                                                                    destructuring_bind_must_consp(current, datum, $list82);
                                                                    link_node = current.first();
                                                                    current = current.rest();
                                                                    destructuring_bind_must_consp(current, datum, $list82);
                                                                    mt2 = current.first();
                                                                    current = current.rest();
                                                                    destructuring_bind_must_consp(current, datum, $list82);
                                                                    tv2 = current.first();
                                                                    current = current.rest();
                                                                    if (NIL == current) {
                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                                            final SubLObject _prev_bind_0_$10 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                    final SubLObject _prev_bind_0_$11 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                        final SubLObject sol;
                                                                                        final SubLObject link_nodes2 = sol = list(link_node);
                                                                                        if (NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject fn;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                fn = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state, fn)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(fn, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(fn, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    set.set_add(fn, $pph_subcol_fns$.getDynamicValue(thread));
                                                                                                }
                                                                                            }
                                                                                        } else
                                                                                            if (sol.isList()) {
                                                                                                SubLObject csome_list_var_$20 = sol;
                                                                                                SubLObject fn2 = NIL;
                                                                                                fn2 = csome_list_var_$20.first();
                                                                                                while (NIL != csome_list_var_$20) {
                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(fn2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(fn2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        set.set_add(fn2, $pph_subcol_fns$.getDynamicValue(thread));
                                                                                                    }
                                                                                                    csome_list_var_$20 = csome_list_var_$20.rest();
                                                                                                    fn2 = csome_list_var_$20.first();
                                                                                                } 
                                                                                            } else {
                                                                                                Errors.error($str80$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }

                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$11, thread);
                                                                                    }
                                                                                }
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$10, thread);
                                                                            }
                                                                        }
                                                                    } else {
                                                                        cdestructuring_bind_error(datum, $list82);
                                                                    }
                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                    instance_tuple = csome_list_var2.first();
                                                                } 
                                                            }
                                                        } else
                                                            if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                SubLObject cdolist_list_var_$21;
                                                                final SubLObject new_list = cdolist_list_var_$21 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                SubLObject generating_fn = NIL;
                                                                generating_fn = cdolist_list_var_$21.first();
                                                                while (NIL != cdolist_list_var_$21) {
                                                                    final SubLObject _prev_bind_0_$12 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                        final SubLObject sol2;
                                                                        final SubLObject link_nodes3 = sol2 = funcall(generating_fn, node);
                                                                        if (NIL != set.set_p(sol2)) {
                                                                            final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                            SubLObject basis_object2;
                                                                            SubLObject state2;
                                                                            SubLObject fn3;
                                                                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                fn3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state2, fn3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(fn3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(fn3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                    set.set_add(fn3, $pph_subcol_fns$.getDynamicValue(thread));
                                                                                }
                                                                            }
                                                                        } else
                                                                            if (sol2.isList()) {
                                                                                SubLObject csome_list_var3 = sol2;
                                                                                SubLObject fn4 = NIL;
                                                                                fn4 = csome_list_var3.first();
                                                                                while (NIL != csome_list_var3) {
                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(fn4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(fn4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                        set.set_add(fn4, $pph_subcol_fns$.getDynamicValue(thread));
                                                                                    }
                                                                                    csome_list_var3 = csome_list_var3.rest();
                                                                                    fn4 = csome_list_var3.first();
                                                                                } 
                                                                            } else {
                                                                                Errors.error($str80$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                            }

                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$12, thread);
                                                                    }
                                                                    cdolist_list_var_$21 = cdolist_list_var_$21.rest();
                                                                    generating_fn = cdolist_list_var_$21.first();
                                                                } 
                                                            }

                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$7, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$7, thread);
                                                    }
                                                    cdolist_list_var = cdolist_list_var.rest();
                                                    module_var = cdolist_list_var.first();
                                                } 
                                                SubLObject cdolist_list_var2;
                                                final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)));
                                                SubLObject module_var2 = NIL;
                                                module_var2 = cdolist_list_var2.first();
                                                while (NIL != cdolist_list_var2) {
                                                    final SubLObject _prev_bind_0_$13 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$8 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                        final SubLObject node2 = function_terms.naut_to_nart(node_var_$4);
                                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                            final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != d_link2) {
                                                                final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != mt_links2) {
                                                                    SubLObject iteration_state2;
                                                                    for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject mt3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                        final SubLObject tv_links2 = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt3)) {
                                                                            final SubLObject _prev_bind_0_$14 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt3, thread);
                                                                                SubLObject iteration_state_$17;
                                                                                for (iteration_state_$17 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$17); iteration_state_$17 = dictionary_contents.do_dictionary_contents_next(iteration_state_$17)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$17);
                                                                                    final SubLObject link_nodes4 = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                        final SubLObject _prev_bind_0_$15 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                            final SubLObject sol3 = link_nodes4;
                                                                                            if (NIL != set.set_p(sol3)) {
                                                                                                final SubLObject set_contents_var3 = set.do_set_internal(sol3);
                                                                                                SubLObject basis_object3;
                                                                                                SubLObject state3;
                                                                                                SubLObject node_vars_link_node;
                                                                                                for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                                    node_vars_link_node = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                    }
                                                                                                }
                                                                                            } else
                                                                                                if (sol3.isList()) {
                                                                                                    SubLObject csome_list_var4 = sol3;
                                                                                                    SubLObject node_vars_link_node2 = NIL;
                                                                                                    node_vars_link_node2 = csome_list_var4.first();
                                                                                                    while (NIL != csome_list_var4) {
                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                            deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                        }
                                                                                                        csome_list_var4 = csome_list_var4.rest();
                                                                                                        node_vars_link_node2 = csome_list_var4.first();
                                                                                                    } 
                                                                                                } else {
                                                                                                    Errors.error($str80$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                                }

                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$15, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$17);
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$14, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                                }
                                                            } else {
                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str81$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            }
                                                        } else
                                                            if (NIL != obsolete.cnat_p(node2, UNPROVIDED)) {
                                                                SubLObject cdolist_list_var_$22;
                                                                final SubLObject new_list2 = cdolist_list_var_$22 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                SubLObject generating_fn2 = NIL;
                                                                generating_fn2 = cdolist_list_var_$22.first();
                                                                while (NIL != cdolist_list_var_$22) {
                                                                    final SubLObject _prev_bind_0_$16 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                        final SubLObject sol4;
                                                                        final SubLObject link_nodes5 = sol4 = funcall(generating_fn2, node2);
                                                                        if (NIL != set.set_p(sol4)) {
                                                                            final SubLObject set_contents_var4 = set.do_set_internal(sol4);
                                                                            SubLObject basis_object4;
                                                                            SubLObject state4;
                                                                            SubLObject node_vars_link_node3;
                                                                            for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                                node_vars_link_node3 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                    deck.deck_push(node_vars_link_node3, recur_deck);
                                                                                }
                                                                            }
                                                                        } else
                                                                            if (sol4.isList()) {
                                                                                SubLObject csome_list_var5 = sol4;
                                                                                SubLObject node_vars_link_node4 = NIL;
                                                                                node_vars_link_node4 = csome_list_var5.first();
                                                                                while (NIL != csome_list_var5) {
                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                        deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                    }
                                                                                    csome_list_var5 = csome_list_var5.rest();
                                                                                    node_vars_link_node4 = csome_list_var5.first();
                                                                                } 
                                                                            } else {
                                                                                Errors.error($str80$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                            }

                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$16, thread);
                                                                    }
                                                                    cdolist_list_var_$22 = cdolist_list_var_$22.rest();
                                                                    generating_fn2 = cdolist_list_var_$22.first();
                                                                } 
                                                            }

                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$8, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$13, thread);
                                                    }
                                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                                    module_var2 = cdolist_list_var2.first();
                                                } 
                                                node_var_$4 = deck.deck_pop(recur_deck);
                                            } 
                                        } finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$12, thread);
                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$6, thread);
                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$6, thread);
                                        }
                                    } else {
                                        sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str83$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }
                                } finally {
                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$5, thread);
                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$5, thread);
                                }
                            } finally {
                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$4, thread);
                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$4, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$17 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$17, thread);
                            }
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$3, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$18 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$18, thread);
                    }
                }
            } finally {
                sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_1_$3, thread);
                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$2, thread);
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        set.set_add($$CollectionSubsetFn, $pph_subcol_fns$.getDynamicValue(thread));
        return $INITIALIZED;
    }

    public static SubLObject pph_subcol_fnP(final SubLObject fn) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != set.set_emptyP($pph_subcol_fns$.getDynamicValue(thread))) {
            initialize_pph_subcol_fns();
        }
        return set.set_memberP(fn, $pph_subcol_fns$.getDynamicValue(thread));
    }

    public static SubLObject pph_subcollection_relation_naut_has_relational_nounP(final SubLObject subcol_naut) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        thread.resetMultipleValues();
        final SubLObject success = formula_pattern_match.formula_matches_pattern(subcol_naut, $list86);
        final SubLObject v_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != success) {
            final SubLObject value = list_utilities.alist_lookup_without_values(v_bindings, VALUE, UNPROVIDED, UNPROVIDED);
            final SubLObject bin_pred = list_utilities.alist_lookup_without_values(v_bindings, BIN_PRED, UNPROVIDED, UNPROVIDED);
            final SubLObject genl = list_utilities.alist_lookup_without_values(v_bindings, GENL, UNPROVIDED, UNPROVIDED);
            final SubLObject fn = list_utilities.alist_lookup_without_values(v_bindings, FN, UNPROVIDED, UNPROVIDED);
            if (NIL != indexed_term_p(bin_pred)) {
                final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(pph_vars.$pph_language_mt$.getDynamicValue(thread));
                final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    if (NIL == ans) {
                        SubLObject csome_list_var = pph_methods_lexicon.pph_arg_in_reln_preds(UNPROVIDED);
                        SubLObject arg_in_reln_pred = NIL;
                        arg_in_reln_pred = csome_list_var.first();
                        while ((NIL == ans) && (NIL != csome_list_var)) {
                            final SubLObject denot_arg = lexicon_utilities.denotatum_arg_of_pred_cached(arg_in_reln_pred);
                            if (denot_arg.isInteger() && (NIL != kb_mapping_utilities.some_pred_value(bin_pred, arg_in_reln_pred, denot_arg, $TRUE))) {
                                ans = T;
                            }
                            csome_list_var = csome_list_var.rest();
                            arg_in_reln_pred = csome_list_var.first();
                        } 
                    }
                } finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                }
            }
        }
        return ans;
    }

    public static SubLObject pph_phrase_nautP(final SubLObject naut) {
        return pph_functions.pph_phrase_fnP(cycl_utilities.nat_function(naut), UNPROVIDED);
    }

    public static SubLObject pph_expandible_phrase_nautP(final SubLObject naut, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        return makeBoolean((NIL != pph_phrase_nautP(naut)) && (NIL != pph_term_has_expansionP(cycl_utilities.nat_functor(naut), mt)));
    }

    public static SubLObject pph_term_has_expansionP_internal(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $ANY;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (mt == $ANY) {
            return kb_mapping_utilities.some_pred_value_in_any_mt(v_term, $$expansion, UNPROVIDED, UNPROVIDED);
        }
        SubLObject ans = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            ans = kb_mapping_utilities.some_pred_value_in_relevant_mts(v_term, $$expansion, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject pph_term_has_expansionP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $ANY;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return pph_term_has_expansionP_internal(v_term, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym91$PPH_TERM_HAS_EXPANSION_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym91$PPH_TERM_HAS_EXPANSION_, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym91$PPH_TERM_HAS_EXPANSION_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(v_term, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (v_term.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(pph_term_has_expansionP_internal(v_term, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(v_term, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject pph_phrase_naut_for_string(final SubLObject string) {
        return make_unary_formula(pph_functions.bestnlphraseofstringfn(), string.isString() ? unicode_nauts.utf8_string_to_cycl_safe_string(string) : string);
    }

    public static SubLObject pph_verb_semtrans_matcherP(final SubLObject cycl, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        return list_utilities.sublisp_boolean(pph_matching_verb_semtrans_assertions(cycl, mt));
    }

    public static SubLObject pph_matching_verb_semtrans_assertions_internal(final SubLObject cycl, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ans = set.new_set(UNPROVIDED, UNPROVIDED);
        final SubLObject existential_vars = set.new_set(UNPROVIDED, UNPROVIDED);
        SubLObject core_cycl;
        for (core_cycl = cycl; NIL != el_existential_p(core_cycl); core_cycl = cycl_utilities.formula_arg2(core_cycl, UNPROVIDED)) {
            set.set_add(cycl_utilities.formula_arg1(core_cycl, UNPROVIDED), existential_vars);
        }
        if (NIL != pph_potential_verb_semtrans_matcherP(core_cycl, mt)) {
            SubLObject cdolist_list_var;
            final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(core_cycl, $IGNORE);
            SubLObject conjunct = NIL;
            conjunct = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                thread.resetMultipleValues();
                final SubLObject success = formula_pattern_match.formula_matches_pattern(conjunct, $list95);
                final SubLObject v_bindings = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != success) {
                    final SubLObject arg2 = list_utilities.alist_lookup_without_values(v_bindings, ARG2, UNPROVIDED, UNPROVIDED);
                    final SubLObject arg3 = list_utilities.alist_lookup_without_values(v_bindings, ARG1, UNPROVIDED, UNPROVIDED);
                    if (NIL != set.set_memberP(arg3, existential_vars)) {
                        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                            format_nil.force_format(T, $str98$Found_head_binding_conjunct_____S, conjunct, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                            final SubLObject pred_var = $$verbSemTrans_Canonical;
                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(arg2, FOUR_INTEGER, pred_var)) {
                                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(arg2, FOUR_INTEGER, pred_var);
                                SubLObject done_var = NIL;
                                final SubLObject token_var = NIL;
                                while (NIL == done_var) {
                                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                    if (NIL != valid) {
                                        SubLObject final_index_iterator = NIL;
                                        try {
                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                            SubLObject done_var_$32 = NIL;
                                            final SubLObject token_var_$33 = NIL;
                                            while (NIL == done_var_$32) {
                                                final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$33);
                                                final SubLObject valid_$34 = makeBoolean(!token_var_$33.eql(gaf));
                                                if (NIL != valid_$34) {
                                                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                                        format_nil.force_format(T, $str101$Found_matching_vST_Canonical_____, gaf, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    }
                                                    set.set_add(gaf, ans);
                                                }
                                                done_var_$32 = makeBoolean(NIL == valid_$34);
                                            } 
                                        } finally {
                                            final SubLObject _prev_bind_0_$35 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                final SubLObject _values = getValuesAsVector();
                                                if (NIL != final_index_iterator) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                }
                                                restoreValuesFromVector(_values);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$35, thread);
                                            }
                                        }
                                    }
                                    done_var = makeBoolean(NIL == valid);
                                } 
                            }
                        } finally {
                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                conjunct = cdolist_list_var.first();
            } 
        }
        return pph_utilities.pph_stable_sort_assertions(Sort.sort(set.set_element_list(ans), $sym102$PPH_FRAME_ARITY__, GAF_ARG3), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject pph_matching_verb_semtrans_assertions(final SubLObject cycl, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return pph_matching_verb_semtrans_assertions_internal(cycl, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PPH_MATCHING_VERB_SEMTRANS_ASSERTIONS, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PPH_MATCHING_VERB_SEMTRANS_ASSERTIONS, TWO_INTEGER, $int$24, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, PPH_MATCHING_VERB_SEMTRANS_ASSERTIONS, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(cycl, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (cycl.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(pph_matching_verb_semtrans_assertions_internal(cycl, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(cycl, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject pph_potential_verb_semtrans_matcherP(final SubLObject cycl, final SubLObject mt) {
        return el_conjunction_p(cycl);
    }

    public static SubLObject pph_frame_arity_G(final SubLObject frame1, final SubLObject frame2) {
        return numG(lexicon_accessors.subcat_frame_arity(frame1), lexicon_accessors.subcat_frame_arity(frame2));
    }

    public static SubLObject pph_fn_to_argP(final SubLObject v_object) {
        return makeBoolean(((v_object.isList() && v_object.first().eql($$FunctionToArg)) && second(v_object).isInteger()) && (NIL != fort_types_interface.predicateP(third(v_object))));
    }

    public static SubLObject pph_fn_to_arg_0P(final SubLObject v_object) {
        return makeBoolean(v_object.isCons() && (NIL != pph_fn_to_argP(v_object.first())));
    }

    public static SubLObject pph_kappa_exprP(final SubLObject v_object) {
        if (v_object.isList() && v_object.first().eql($$Kappa)) {
            final SubLObject vars = second(v_object);
            final SubLObject formula = third(v_object);
            return makeBoolean(((NIL != vars) && (NIL == list_utilities.find_if_not(symbol_function($sym107$EL_VAR_), vars, UNPROVIDED, UNPROVIDED, UNPROVIDED))) && (NIL != pph_formulaP(formula)));
        }
        return NIL;
    }

    public static SubLObject pph_open_db_fieldP(final SubLObject v_object) {
        return makeBoolean((NIL != pph_db_fieldP(v_object)) && (NIL != list_utilities.cons_tree_find_if(symbol_function($sym107$EL_VAR_), v_object, UNPROVIDED)));
    }

    public static SubLObject pph_ground_db_fieldP(final SubLObject v_object) {
        return makeBoolean((NIL != pph_db_fieldP(v_object)) && (NIL == list_utilities.cons_tree_find_if(symbol_function($sym107$EL_VAR_), v_object, UNPROVIDED)));
    }

    public static SubLObject pph_db_fieldP(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            ans = makeBoolean(((NIL != indexed_term_p(v_object)) && (NIL != kb_mapping_utilities.some_pred_value(v_object, $$fieldCodes, UNPROVIDED, UNPROVIDED))) || (NIL != member(cycl_utilities.formula_operator(v_object), $list109, UNPROVIDED, UNPROVIDED)));
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject pph_db_entry_fnP(final SubLObject v_object) {
        final SubLObject lispy_form = function_terms.nart_to_naut(v_object);
        return el_formula_with_operator_p(lispy_form, $$DBEntryFn);
    }

    public static SubLObject pph_image_urlP(final SubLObject v_object, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return formula_pattern_match.formula_matches_pattern(v_object, $list111);
    }

    public static SubLObject declare_pph_types_file() {
        declareFunction(me, "get_paraphrase_methods", "GET-PARAPHRASE-METHODS", 1, 0, false);
        declareFunction(me, "pph_register_method", "PPH-REGISTER-METHOD", 3, 0, false);
        declareFunction(me, "pph_deregister_method", "PPH-DEREGISTER-METHOD", 2, 0, false);
        declareFunction(me, "pph_method_info", "PPH-METHOD-INFO", 2, 0, false);
        declareFunction(me, "pph_register_method_info", "PPH-REGISTER-METHOD-INFO", 2, 0, false);
        declareFunction(me, "pph_deregister_method_info", "PPH-DEREGISTER-METHOD-INFO", 2, 0, false);
        declareFunction(me, "pph_type_entries", "PPH-TYPE-ENTRIES", 1, 0, false);
        declareFunction(me, "pph_subtypes", "PPH-SUBTYPES", 1, 0, false);
        declareFunction(me, "pph_type_transition_demerits", "PPH-TYPE-TRANSITION-DEMERITS", 2, 0, false);
        declareFunction(me, "pph_sort_methods", "PPH-SORT-METHODS", 1, 0, false);
        declareFunction(me, "pph_sort_methods_by_demerits", "PPH-SORT-METHODS-BY-DEMERITS", 1, 0, false);
        declareFunction(me, "pph_higher_method_qualityP", "PPH-HIGHER-METHOD-QUALITY?", 2, 0, false);
        declareFunction(me, "pph_method_quality_score", "PPH-METHOD-QUALITY-SCORE", 1, 0, false);
        declareFunction(me, "pph_method_quality_demerits", "PPH-METHOD-QUALITY-DEMERITS", 1, 0, false);
        declareFunction(me, "pph_valid_typeP", "PPH-VALID-TYPE?", 1, 0, false);
        declareFunction(me, "pph_valid_method_qualityP", "PPH-VALID-METHOD-QUALITY?", 1, 0, false);
        declareFunction(me, "paraphrase_test", "PARAPHRASE-TEST", 1, 0, false);
        declareFunction(me, "pph_methods_for_type", "PPH-METHODS-FOR-TYPE", 1, 0, false);
        declareFunction(me, "pph_identify_type", "PPH-IDENTIFY-TYPE", 1, 0, false);
        declareFunction(me, "pph_identify_type_int", "PPH-IDENTIFY-TYPE-INT", 3, 0, false);
        declareFunction(me, "pph_object_has_typeP", "PPH-OBJECT-HAS-TYPE?", 2, 0, false);
        declareFunction(me, "pph_paraphrasable_objectP", "PPH-PARAPHRASABLE-OBJECT?", 1, 0, false);
        declareFunction(me, "pph_collection_denoting_natP", "PPH-COLLECTION-DENOTING-NAT?", 1, 0, false);
        declareFunction(me, "pph_nl_tagged_termP", "PPH-NL-TAGGED-TERM?", 1, 0, false);
        declareFunction(me, "pph_set_nautP", "PPH-SET-NAUT?", 1, 0, false);
        declareFunction(me, "pph_exponent_nautP", "PPH-EXPONENT-NAUT?", 1, 0, false);
        declareFunction(me, "pph_unicode_naut_p", "PPH-UNICODE-NAUT-P", 1, 0, false);
        declareFunction(me, "pph_date_p", "PPH-DATE-P", 1, 0, false);
        declareFunction(me, "pph_year_p", "PPH-YEAR-P", 1, 0, false);
        declareFunction(me, "pph_month_p", "PPH-MONTH-P", 1, 0, false);
        declareFunction(me, "pph_day_p", "PPH-DAY-P", 1, 0, false);
        declareFunction(me, "pph_time_p", "PPH-TIME-P", 1, 0, false);
        declareFunction(me, "pph_universal_with_atomic_scopeP", "PPH-UNIVERSAL-WITH-ATOMIC-SCOPE?", 1, 0, false);
        declareFunction(me, "pph_nautP", "PPH-NAUT?", 1, 0, false);
        new pph_types.$pph_nautP$UnaryFunction();
        declareFunction(me, "ccf_bnode_p", "CCF-BNODE-P", 1, 0, false);
        declareFunction(me, "pph_cycl_sentenceP", "PPH-CYCL-SENTENCE?", 1, 0, false);
        declareFunction(me, "pph_coordination_p", "PPH-COORDINATION-P", 1, 0, false);
        declareFunction(me, "pph_syntactic_universal_p", "PPH-SYNTACTIC-UNIVERSAL-P", 1, 0, false);
        declareFunction(me, "pph_atomic_sentenceP", "PPH-ATOMIC-SENTENCE?", 1, 0, false);
        declareFunction(me, "pph_cycl_symbolP", "PPH-CYCL-SYMBOL?", 1, 0, false);
        declareFunction(me, "pph_lexified_nartP", "PPH-LEXIFIED-NART?", 1, 0, false);
        declareFunction(me, "pph_non_cycl_symbolP", "PPH-NON-CYCL-SYMBOL?", 1, 0, false);
        declareFunction(me, "cyc_const_trueP", "CYC-CONST-TRUE?", 1, 0, false);
        declareFunction(me, "cyc_const_falseP", "CYC-CONST-FALSE?", 1, 0, false);
        declareFunction(me, "pph_rel_variableP", "PPH-REL-VARIABLE?", 1, 0, false);
        declareFunction(me, "pph_simple_negation_p", "PPH-SIMPLE-NEGATION-P", 1, 0, false);
        declareFunction(me, "pph_rmp_sentenceP", "PPH-RMP-SENTENCE?", 1, 0, false);
        declareFunction(me, "pph_reln_has_expansionP", "PPH-RELN-HAS-EXPANSION?", 1, 1, false);
        declareFunction(me, "pph_specified_scope_sentenceP", "PPH-SPECIFIED-SCOPE-SENTENCE?", 1, 0, false);
        declareFunction(me, "pph_cf_implicationP", "PPH-CF-IMPLICATION?", 1, 0, false);
        declareFunction(me, "pph_cff_exprP", "PPH-CFF-EXPR?", 1, 0, false);
        declareFunction(me, "pph_script_expP", "PPH-SCRIPT-EXP?", 1, 0, false);
        declareFunction(me, "pph_nth_exprP", "PPH-NTH-EXPR?", 1, 0, false);
        declareFunction(me, "pph_skolem_termP", "PPH-SKOLEM-TERM?", 1, 0, false);
        declareFunction(me, "pph_gpeP", "PPH-GPE?", 1, 0, false);
        new pph_types.$pph_gpeP$UnaryFunction();
        declareFunction(me, "pph_cityP", "PPH-CITY?", 1, 0, false);
        declareFunction(me, "pph_us_cityP", "PPH-US-CITY?", 1, 0, false);
        declareFunction(me, "pph_non_us_cityP", "PPH-NON-US-CITY?", 1, 0, false);
        declareFunction(me, "pph_hypotheticalP", "PPH-HYPOTHETICAL?", 1, 0, false);
        new pph_types.$pph_hypotheticalP$UnaryFunction();
        declareFunction(me, "pph_lexical_wordP", "PPH-LEXICAL-WORD?", 1, 0, false);
        new pph_types.$pph_lexical_wordP$UnaryFunction();
        declareFunction(me, "pph_universal_dateP", "PPH-UNIVERSAL-DATE?", 1, 0, false);
        declareFunction(me, "pph_universal_secondP", "PPH-UNIVERSAL-SECOND?", 1, 0, false);
        declareFunction(me, "pph_formulaP", "PPH-FORMULA?", 1, 0, false);
        declareFunction(me, "pph_rop_expressionP", "PPH-ROP-EXPRESSION?", 1, 0, false);
        declareFunction(me, "pph_rop_natP", "PPH-ROP-NAT?", 1, 0, false);
        declareFunction(me, "pph_subcollection_relation_nautP", "PPH-SUBCOLLECTION-RELATION-NAUT?", 1, 0, false);
        declareFunction(me, "pph_the_collection_of_natP", "PPH-THE-COLLECTION-OF-NAT?", 1, 0, false);
        declareFunction(me, "initialize_pph_subcol_fns", "INITIALIZE-PPH-SUBCOL-FNS", 0, 0, false);
        declareFunction(me, "pph_subcol_fnP", "PPH-SUBCOL-FN?", 1, 0, false);
        declareFunction(me, "pph_subcollection_relation_naut_has_relational_nounP", "PPH-SUBCOLLECTION-RELATION-NAUT-HAS-RELATIONAL-NOUN?", 1, 0, false);
        declareFunction(me, "pph_phrase_nautP", "PPH-PHRASE-NAUT?", 1, 0, false);
        declareFunction(me, "pph_expandible_phrase_nautP", "PPH-EXPANDIBLE-PHRASE-NAUT?", 1, 1, false);
        declareFunction(me, "pph_term_has_expansionP_internal", "PPH-TERM-HAS-EXPANSION?-INTERNAL", 1, 1, false);
        declareFunction(me, "pph_term_has_expansionP", "PPH-TERM-HAS-EXPANSION?", 1, 1, false);
        declareFunction(me, "pph_phrase_naut_for_string", "PPH-PHRASE-NAUT-FOR-STRING", 1, 0, false);
        declareFunction(me, "pph_verb_semtrans_matcherP", "PPH-VERB-SEMTRANS-MATCHER?", 1, 1, false);
        declareFunction(me, "pph_matching_verb_semtrans_assertions_internal", "PPH-MATCHING-VERB-SEMTRANS-ASSERTIONS-INTERNAL", 2, 0, false);
        declareFunction(me, "pph_matching_verb_semtrans_assertions", "PPH-MATCHING-VERB-SEMTRANS-ASSERTIONS", 2, 0, false);
        declareFunction(me, "pph_potential_verb_semtrans_matcherP", "PPH-POTENTIAL-VERB-SEMTRANS-MATCHER?", 2, 0, false);
        declareFunction(me, "pph_frame_arity_G", "PPH-FRAME-ARITY->", 2, 0, false);
        declareFunction(me, "pph_fn_to_argP", "PPH-FN-TO-ARG?", 1, 0, false);
        declareFunction(me, "pph_fn_to_arg_0P", "PPH-FN-TO-ARG-0?", 1, 0, false);
        declareFunction(me, "pph_kappa_exprP", "PPH-KAPPA-EXPR?", 1, 0, false);
        declareFunction(me, "pph_open_db_fieldP", "PPH-OPEN-DB-FIELD?", 1, 0, false);
        declareFunction(me, "pph_ground_db_fieldP", "PPH-GROUND-DB-FIELD?", 1, 0, false);
        declareFunction(me, "pph_db_fieldP", "PPH-DB-FIELD?", 1, 0, false);
        declareFunction(me, "pph_db_entry_fnP", "PPH-DB-ENTRY-FN?", 1, 0, false);
        declareFunction(me, "pph_image_urlP", "PPH-IMAGE-URL?", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_pph_types_file() {
        deflexical("*PPH-TYPE-TREE*", $list0);
        deflexical("*PARAPHRASE-TESTS*", $list1);
        deflexical("*PPH-TYPE-METHOD-HASH*", SubLTrampolineFile.maybeDefault($pph_type_method_hash$, $pph_type_method_hash$, () -> make_hash_table($int$256, symbol_function(EQ), UNPROVIDED)));
        deflexical("*PPH-VALID-METHOD-QUALITIES*", $list4);
        deflexical("*PPH-DATE-DENOTING-FUNCTIONS*", $list38);
        defparameter("*PPH-SUBCOL-FNS*", set.new_set(symbol_function(EQUAL), UNPROVIDED));
        return NIL;
    }

    public static SubLObject setup_pph_types_file() {
        declare_defglobal($pph_type_method_hash$);
        register_macro_helper(PPH_METHOD_INFO, SUSPENDING_PARAPHRASE_METHOD);
        register_macro_helper(PPH_REGISTER_METHOD_INFO, SUSPENDING_PARAPHRASE_METHOD);
        register_macro_helper(PPH_DEREGISTER_METHOD_INFO, SUSPENDING_PARAPHRASE_METHOD);
        memoization_state.note_memoized_function($sym91$PPH_TERM_HAS_EXPANSION_);
        memoization_state.note_memoized_function(PPH_MATCHING_VERB_SEMTRANS_ASSERTIONS);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_pph_types_file();
    }

    @Override
    public void initializeVariables() {
        init_pph_types_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_pph_types_file();
    }

    

    public static final class $pph_nautP$UnaryFunction extends UnaryFunction {
        public $pph_nautP$UnaryFunction() {
            super(extractFunctionNamed("PPH-NAUT?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return pph_nautP(arg1);
        }
    }

    public static final class $pph_gpeP$UnaryFunction extends UnaryFunction {
        public $pph_gpeP$UnaryFunction() {
            super(extractFunctionNamed("PPH-GPE?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return pph_gpeP(arg1);
        }
    }

    public static final class $pph_hypotheticalP$UnaryFunction extends UnaryFunction {
        public $pph_hypotheticalP$UnaryFunction() {
            super(extractFunctionNamed("PPH-HYPOTHETICAL?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return pph_hypotheticalP(arg1);
        }
    }

    public static final class $pph_lexical_wordP$UnaryFunction extends UnaryFunction {
        public $pph_lexical_wordP$UnaryFunction() {
            super(extractFunctionNamed("PPH-LEXICAL-WORD?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return pph_lexical_wordP(arg1);
        }
    }
}

/**
 * Total time: 1253 ms
 */

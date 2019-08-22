package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.indexed_term_p;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
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
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class pph_methods_lexicon extends SubLTranslatedFile {
    public static final SubLFile me = new pph_methods_lexicon();

    public static final String myName = "com.cyc.cycjava.cycl.pph_methods_lexicon";

    public static final String myFingerPrint = "0ec7f0b80e94498fd1d38df2b4fd9fbddbe9adcb207923089a353d13d7887c2c";







    private static final SubLObject $$genPhrase = reader_make_constant_shell(makeString("genPhrase"));

    public static final SubLSymbol PGU_ASSERTIONS_FOR_TERM = makeSymbol("PGU-ASSERTIONS-FOR-TERM");

    private static final SubLObject $$preferredGenUnit = reader_make_constant_shell(makeString("preferredGenUnit"));



    private static final SubLString $str5$__PREFERRED_LEXIFICATION_METHOD_f = makeString("~&PREFERRED-LEXIFICATION-METHOD found no preferred lexifications for~% ~S");

    private static final SubLString $str6$__GENERATE_PHRASE_FROM_LEXIFICATI = makeString("~&GENERATE-PHRASE-FROM-LEXIFICATION-SENTENCES found these results:~% ~S.~%");

    private static final SubLString $str7$_PPH_error_level_ = makeString("(PPH error level ");

    private static final SubLString $str8$__ = makeString(") ");

    private static final SubLString $str9$Bad_NL_PREDS___S = makeString("Bad NL-PREDS: ~S");

    private static final SubLString $str10$_S_is_a_forbidden_paraphrase_for_ = makeString("~S is a forbidden paraphrase for ~S");

    private static final SubLString $str11$__GENERATE_PHRASE_FROM_ASSERTIONS = makeString("~&GENERATE-PHRASE-FROM-ASSERTIONS found these results:~% ~S.~%");

    private static final SubLString $str12$__Checking_output_item___S___ = makeString("~&Checking output-item: ~S.~%");

    private static final SubLObject $$nounStrings = reader_make_constant_shell(makeString("nounStrings"));

    private static final SubLSymbol $sym14$PPH_PREFER_STRING_ = makeSymbol("PPH-PREFER-STRING?");

    private static final SubLSymbol PPH_PHRASE_OUTPUT_ITEM_STRING = makeSymbol("PPH-PHRASE-OUTPUT-ITEM-STRING");

    private static final SubLSymbol GENERATE_PHRASES_FROM_AS = makeSymbol("GENERATE-PHRASES-FROM-AS");



    private static final SubLSymbol GENERATE_PHRASE_FROM_AS = makeSymbol("GENERATE-PHRASE-FROM-AS");

    private static final SubLObject $$chemicalFormulaString = reader_make_constant_shell(makeString("chemicalFormulaString"));

    private static final SubLList $list20 = list(makeSymbol("SUBSTANCE-TYPE"), makeSymbol("FORMULA-STRING"));

    private static final SubLObject $$conventionalFormulaSymbolHTML = reader_make_constant_shell(makeString("conventionalFormulaSymbolHTML"));

    private static final SubLSymbol $sym22$_EXIT = makeSymbol("%EXIT");

    private static final SubLSymbol GENERATE_PHRASE_FROM_LEXIFICATION_SENTENCE_MEMOIZED = makeSymbol("GENERATE-PHRASE-FROM-LEXIFICATION-SENTENCE-MEMOIZED");



    private static final SubLList $list25 = list(makeSymbol("DENOT"), makeSymbol("POS"), makeSymbol("WU"));

    private static final SubLList $list26 = list(makeSymbol("DENOT"), makeSymbol("STRING"));

    private static final SubLObject $$termPhrases = reader_make_constant_shell(makeString("termPhrases"));

    public static final SubLList $list28 = list(makeSymbol("DENOT"), makeSymbol("CONSTRAINT"), makeSymbol("STRING"));



    private static final SubLObject $$Adjective = reader_make_constant_shell(makeString("Adjective"));

    private static final SubLList $list31 = list(reader_make_constant_shell(makeString("nonGradableAdjectiveForm")), reader_make_constant_shell(makeString("regularDegree")));

    private static final SubLObject $$Adverb = reader_make_constant_shell(makeString("Adverb"));

    public static final SubLList $list33 = list(reader_make_constant_shell(makeString("regularAdverb")));

    private static final SubLObject $$Determiner = reader_make_constant_shell(makeString("Determiner"));

    private static final SubLObject $$Verb = reader_make_constant_shell(makeString("Verb"));

    private static final SubLList $list36 = list(reader_make_constant_shell(makeString("verbStrings")), reader_make_constant_shell(makeString("gerund")));

    private static final SubLString $str37$Filtered_V_bar_preds_to__S__ = makeString("Filtered V-bar preds to ~S~%");

    private static final SubLSymbol $sym38$SPEC_POS_PRED_ = makeSymbol("SPEC-POS-PRED?");

    private static final SubLObject $$hyphenString = reader_make_constant_shell(makeString("hyphenString"));

    private static final SubLObject $$Hyphen_TheSymbol = reader_make_constant_shell(makeString("Hyphen-TheSymbol"));

    private static final SubLObject $$Collection = reader_make_constant_shell(makeString("Collection"));

    private static final SubLList $list42 = list(reader_make_constant_shell(makeString("nounStrings")));

    private static final SubLList $list43 = list(reader_make_constant_shell(makeString("regularDegree")));

    private static final SubLList $list44 = list(makeSymbol("ADJ-STRING"), makeSymbol("ADJ-PRED"), makeSymbol("&OPTIONAL"), list(makeSymbol("DEMERITS"), ZERO_INTEGER), makeSymbol("JUSTIFICATION"));

    private static final SubLObject $$Thing = reader_make_constant_shell(makeString("Thing"));

    public static final SubLList $list46 = list(makeSymbol("THING-STRING"), makeSymbol("THING-PRED"), makeSymbol("&OPTIONAL"), list(makeSymbol("THING-DEMERITS"), ZERO_INTEGER), makeSymbol("THING-JUSTIFICATION"));

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLList $list48 = cons(makeSymbol("BEST-PAIR"), makeSymbol("OTHER-PAIRS"));

    private static final SubLString $str49$__PASSED_PREDS_SUCCEED_METHOD__PP = makeString("~&PASSED-PREDS-SUCCEED-METHOD: PPH-STRING-FOR-TERM returned ~S.~%");

    private static final SubLString $str50$Broadening__PPH_LANGUAGE_MT__to__ = makeString("Broadening *PPH-LANGUAGE-MT* to ~S");

    public static final SubLList $list51 = list(makeSymbol("PREFERRED-GEN-UNIT-METHOD"), makeSymbol("ANY-GEN-PHRASE-METHOD"), makeSymbol("PREFERRED-LEXIFICATION-METHOD"), makeSymbol("PASSED-PREDS-SUCCEED-METHOD"));





    private static final SubLSymbol $sym54$SPEECH_PART_PRED_ = makeSymbol("SPEECH-PART-PRED?");





    private static final SubLString $str57$Skipping_forbidden_lexical_assert = makeString("Skipping forbidden lexical assertion:~% ~S");



    private static final SubLSymbol PPH_LEXIFICATION_PREDS = makeSymbol("PPH-LEXIFICATION-PREDS");

    private static final SubLObject $$multiWordString_Speculative = reader_make_constant_shell(makeString("multiWordString-Speculative"));

    private static final SubLObject $$denotation = reader_make_constant_shell(makeString("denotation"));

    private static final SubLSymbol $pph_lexification_preds_caching_state$ = makeSymbol("*PPH-LEXIFICATION-PREDS-CACHING-STATE*");

    private static final SubLSymbol PPH_ARG_IN_RELN_PREDS = makeSymbol("PPH-ARG-IN-RELN-PREDS");

    private static final SubLObject $$DenotesArgInRelnPredicate = reader_make_constant_shell(makeString("DenotesArgInRelnPredicate"));

    private static final SubLSymbol $pph_arg_in_reln_preds_caching_state$ = makeSymbol("*PPH-ARG-IN-RELN-PREDS-CACHING-STATE*");



    private static final SubLList $list67 = list(makeKeyword("ACRONYMS"), makeKeyword("ABBREVS"));

    private static final SubLSymbol $PPH_HL_SUPPORTS_FOUND = makeKeyword("PPH-HL-SUPPORTS-FOUND");





    private static final SubLObject $const71$CollectionLexificationPredicate_R = reader_make_constant_shell(makeString("CollectionLexificationPredicate-Required"));

    private static final SubLString $str72$ALL_PHRASES_FOR_TERM_doesn_t_know = makeString("ALL-PHRASES-FOR-TERM doesn't know what to do with filters like ~S. Ignoring it.");

    private static final SubLObject $$MtUnionFn = reader_make_constant_shell(makeString("MtUnionFn"));



    private static final SubLObject $$scientificName = reader_make_constant_shell(makeString("scientificName"));

    private static final SubLSymbol $sym76$PPH_NAME_STRING_PRED_ = makeSymbol("PPH-NAME-STRING-PRED?");



    private static final SubLObject $$acronymString = reader_make_constant_shell(makeString("acronymString"));

    private static final SubLSymbol $sym79$PPH_SPEC_PREDICATE_ = makeSymbol("PPH-SPEC-PREDICATE?");

    private static final SubLObject $$abbreviationString_PN = reader_make_constant_shell(makeString("abbreviationString-PN"));

    private static final SubLObject $const81$rdfs_label = reader_make_constant_shell(makeString("rdfs:label"));

    private static final SubLInteger $int$30 = makeInteger(30);

    private static final SubLString $str83$__Done_with__S_All_strings___S__ = makeString("~&Done with ~S All strings: ~S~%");

    private static final SubLObject $$resultNamedByArg = reader_make_constant_shell(makeString("resultNamedByArg"));

    private static final SubLSymbol $sym85$_ARG = makeSymbol("?ARG");

    private static final SubLList $list86 = list(makeSymbol("?ARG"), makeSymbol("?PRED"));



    private static final SubLString $str88$___Top_level_CycL___S = makeString("~% Top-level CycL: ~S");

    private static final SubLSymbol $sym89$PPH_STRING_EQUAL_ = makeSymbol("PPH-STRING-EQUAL?");

    private static final SubLSymbol PPH_STRING_IF_NON_NULL_TO_OUTPUT_FORMAT = makeSymbol("PPH-STRING-IF-NON-NULL-TO-OUTPUT-FORMAT");



    public static final SubLSymbol $sym92$ISA_MT_ = makeSymbol("ISA-MT?");



    private static final SubLObject $$termStrings = reader_make_constant_shell(makeString("termStrings"));







    private static final SubLObject $$True_JustificationTruth = reader_make_constant_shell(makeString("True-JustificationTruth"));





    private static final SubLString $str101$_A_is_not_a__A = makeString("~A is not a ~A");





    private static final SubLString $$$continue_anyway = makeString("continue anyway");



    private static final SubLString $str106$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    private static final SubLObject $$genlPreds = reader_make_constant_shell(makeString("genlPreds"));

    private static final SubLString $str108$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");

    private static final SubLString $str109$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    private static final SubLString $str110$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");



    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    private static final SubLObject $$GeneralEnglishMt = reader_make_constant_shell(makeString("GeneralEnglishMt"));

    private static final SubLSymbol PRAGMATIC_ATTRIBUTE_OF_DENOTATION = makeSymbol("PRAGMATIC-ATTRIBUTE-OF-DENOTATION");

    private static final SubLList $list115 = list(reader_make_constant_shell(makeString("VulgarSpeech")), reader_make_constant_shell(makeString("RudeSpeech")));

    private static final SubLList $list116 = list(reader_make_constant_shell(makeString("InformalSpeech")), reader_make_constant_shell(makeString("ArchaicSpeech")), reader_make_constant_shell(makeString("BabyTalk")));

    private static final SubLString $$$Empty_NL_preds_list = makeString("Empty NL preds list");



    private static final SubLList $list119 = list(reader_make_constant_shell(makeString("wordStrings")));

    private static final SubLSymbol $sym120$PPH_GENL_PREDICATE_ = makeSymbol("PPH-GENL-PREDICATE?");

    private static final SubLSymbol $sym121$PPH_PREFER_POS_PRED_ = makeSymbol("PPH-PREFER-POS-PRED?");

    private static final SubLSymbol $sym122$PPH_FIRST_STRING_OF_WORD_PRED = makeSymbol("PPH-FIRST-STRING-OF-WORD&PRED");

    private static final SubLSymbol $sym123$PPH_GENL_POS_PRED_ = makeSymbol("PPH-GENL-POS-PRED?");

    private static final SubLString $str124$Bad_pred___S = makeString("Bad pred: ~S");

    private static final SubLString $str125$__Found_alternative___S__S__ = makeString("~&Found alternative: ~S ~S~%");

    private static final SubLSymbol NON_ASCII_STRING_P = makeSymbol("NON-ASCII-STRING-P");

    private static final SubLSymbol PPH_STRING_FROM_UTF8_STRING = makeSymbol("PPH-STRING-FROM-UTF8-STRING");



    private static final SubLSymbol $sym129$PPH_FIRST_COERCED_STRING_OF_WORD_PRED = makeSymbol("PPH-FIRST-COERCED-STRING-OF-WORD&PRED");

    private static final SubLString $str130$Coercing__S_form_of__S__ = makeString("Coercing ~S form of ~S~%");

    private static final SubLList $list131 = list(makeSymbol("SOURCE-PRED"), makeSymbol("COERCED-PRED"), makeSymbol("SUFFIX"));

    private static final SubLObject $$properNounStrings = reader_make_constant_shell(makeString("properNounStrings"));

    private static final SubLInteger $int$500 = makeInteger(500);

    private static final SubLSymbol PPH_COERCED_PREDS_FOR_PRED = makeSymbol("PPH-COERCED-PREDS-FOR-PRED");



    private static final SubLString $str136$paraphraseCoercionSometimesAllowe = makeString("paraphraseCoercionSometimesAllowedFrom");

    private static final SubLString $$$paraphraseCoercionAllowedFrom = makeString("paraphraseCoercionAllowedFrom");

    private static final SubLString $str138$paraphraseCoercionAlwaysAllowedFr = makeString("paraphraseCoercionAlwaysAllowedFrom");

    private static final SubLObject $$paraphraseCoercionAllowedFrom = reader_make_constant_shell(makeString("paraphraseCoercionAllowedFrom"));

    private static final SubLSymbol LESSER_LENGTH_P = makeSymbol("LESSER-LENGTH-P");



    private static final SubLList $list142 = list(makeSymbol("ASSERTED-FROM-PRED"), makeSymbol("SUFFIX"));

    private static final SubLObject $$regularSuffix = reader_make_constant_shell(makeString("regularSuffix"));

    public static final SubLList $list144 = list(TWO_INTEGER, THREE_INTEGER);

    private static final SubLObject $$NLPersonAttribute = reader_make_constant_shell(makeString("NLPersonAttribute"));

    private static final SubLObject $$NLNumberAttribute = reader_make_constant_shell(makeString("NLNumberAttribute"));

    private static final SubLObject $$NLGenderAttribute = reader_make_constant_shell(makeString("NLGenderAttribute"));

    private static final SubLObject $$Singular_NLAttr = reader_make_constant_shell(makeString("Singular-NLAttr"));

    private static final SubLObject $$ThirdPerson_NLAttr = reader_make_constant_shell(makeString("ThirdPerson-NLAttr"));

    private static final SubLObject $$Ungendered_NLAttr = reader_make_constant_shell(makeString("Ungendered-NLAttr"));

    private static final SubLString $str151$Couldn_t_generate_pronoun_agr_for = makeString("Couldn't generate pronoun agr for ~S");



    private static final SubLSymbol PPH_GENERATE_PRONOUN = makeSymbol("PPH-GENERATE-PRONOUN");





    private static final SubLList $list156 = list(reader_make_constant_shell(makeString("pronounStrings")), reader_make_constant_shell(makeString("nounStrings")), reader_make_constant_shell(makeString("properNameStrings")));

    private static final SubLObject $$PhraseFn = reader_make_constant_shell(makeString("PhraseFn"));

    private static final SubLObject $$ReflexivePronoun = reader_make_constant_shell(makeString("ReflexivePronoun"));



    private static final SubLString $str160$Generated__S_for__S = makeString("Generated ~S for ~S");

    private static final SubLString $str161$Unable_to_find_a_pronoun_for__S__ = makeString("Unable to find a pronoun for ~S.~%");

    private static final SubLSymbol $sym162$PRONOUN_SPEC_ = makeSymbol("PRONOUN-SPEC?");

    private static final SubLObject $$Pronoun = reader_make_constant_shell(makeString("Pronoun"));

    private static final SubLObject $$singular_Generic = reader_make_constant_shell(makeString("singular-Generic"));

    private static final SubLObject $$plural_Generic = reader_make_constant_shell(makeString("plural-Generic"));

    private static final SubLList $list166 = list(reader_make_constant_shell(makeString("That-TheWord")), reader_make_constant_shell(makeString("This-TheWord")), reader_make_constant_shell(makeString("Those-TheWord")), reader_make_constant_shell(makeString("These-TheWord")));

    private static final SubLSymbol $sym167$QUICK_LEXICAL_WORD_ = makeSymbol("QUICK-LEXICAL-WORD?");

    private static final SubLString $str168$Couldn_t_find_a_word_unit_for____ = makeString("Couldn't find a word unit for:~% ~S");

    private static final SubLString $str169$Found__S_for_____S___Using__S = makeString("Found ~S for:~% ~S~% Using ~S");

    private static final SubLList $list170 = list(makeSymbol("PERSON"), makeSymbol("NUMBER"), makeSymbol("GENDER"));

    private static final SubLObject $$Neuter_NLAttr = reader_make_constant_shell(makeString("Neuter-NLAttr"));

    private static final SubLObject $$SecondPerson_NLAttr = reader_make_constant_shell(makeString("SecondPerson-NLAttr"));

    private static final SubLObject $$PronounFn = reader_make_constant_shell(makeString("PronounFn"));

    private static final SubLObject $$SubjectPronoun = reader_make_constant_shell(makeString("SubjectPronoun"));



    private static final SubLObject $$PossessivePronoun_Pre = reader_make_constant_shell(makeString("PossessivePronoun-Pre"));

    private static final SubLObject $$ObjectPronoun = reader_make_constant_shell(makeString("ObjectPronoun"));

    private static final SubLString $str178$__Looking_up_value_for__S_with_ag = makeString("~&Looking up value for ~S with agr-preds ~S.");

    private static final SubLString $str179$__Unable_to_find_string_matching_ = makeString("~&Unable to find string matching ~S for ~S");

    private static final SubLString $str180$Done__S_alternatives_of__S = makeString("Done ~S alternatives of ~S");

    private static final SubLList $list181 = list(makeSymbol("ALTERNATIVE-STRING"), makeSymbol("ALTERNATIVE-STRING-PRED"), makeSymbol("&OPTIONAL"), list(makeSymbol("DEMERITS"), ZERO_INTEGER), makeSymbol("JUSTIFICATION"));

    private static final SubLSymbol $sym182$PPH_FIRST_STRING_OF_WORD_SPEECH_PART = makeSymbol("PPH-FIRST-STRING-OF-WORD&SPEECH-PART");

    private static final SubLString $str183$__Found_answer_pair___S__S__ = makeString("~&Found answer pair (~S ~S).");

    private static final SubLList $list184 = list(reader_make_constant_shell(makeString("determinerStrings")));

    private static final SubLSymbol ALL_PHRASES_FOR_TERM = makeSymbol("ALL-PHRASES-FOR-TERM");



    private static final SubLSymbol ALL_PHRASES_TEST = makeSymbol("ALL-PHRASES-TEST");





    private static final SubLList $list190 = list(makeSymbol("PPH-TEST-CASE-TABLES"));







    public static final SubLList $list194 = list(new SubLObject[]{ list(list(reader_make_constant_shell(makeString("GeorgeWBush")), list(reader_make_constant_shell(makeString("givenNames")))), makeString("George")), list(list(SIX_INTEGER), makeString("six")), list(list(SIX_INTEGER), makeString("6")), list(list(reader_make_constant_shell(makeString("Cancer")), list(reader_make_constant_shell(makeString("nameString")), reader_make_constant_shell(makeString("singular-Generic")))), makeString("case of cancer")), list(list(reader_make_constant_shell(makeString("Cancer")), list(reader_make_constant_shell(makeString("nameString")), reader_make_constant_shell(makeString("singular-Generic")))), makeString("cancer")), list(list(reader_make_constant_shell(makeString("RandonneursUSA")), list(reader_make_constant_shell(makeString("nameString"))), list(makeKeyword("ACRONYMS"))), makeString("RUSA")), list(list(reader_make_constant_shell(makeString("Dog")), list(reader_make_constant_shell(makeString("plural")))), makeString("dogs")), list(list(list(reader_make_constant_shell(makeString("suppliers")), reader_make_constant_shell(makeString("Cher")), reader_make_constant_shell(makeString("IBMInc"))), list(reader_make_constant_shell(makeString("pastTense-Generic"))), NIL, makeKeyword("TEXT"), NIL, NIL), makeString("Cher supplied goods or services to IBM")), list(list(reader_make_constant_shell(makeString("UnionOfSovietSocialistRepublics")), list(reader_make_constant_shell(makeString("nameString"))), list(makeKeyword("ABBREVS"))), makeString("USSR")), list(list(list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("January")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1983))), makeKeyword("ALL"), NIL, makeKeyword("TEXT"), NIL, NIL), makeString("January 1983")), list(list(reader_make_constant_shell(makeString("MiddleEast-Region")), makeKeyword("ALL"), NIL, makeKeyword("TEXT"), NIL, NIL, list(makeString("the"))), makeString("the Middle East")), list(list(reader_make_constant_shell(makeString("MiddleEast-Region")), makeKeyword("ALL"), NIL, makeKeyword("TEXT"), NIL, NIL, list(makeString("the"))), makeString("Middle East")), list(list(list(reader_make_constant_shell(makeString("likesAsFriend")), reader_make_constant_shell(makeString("Cher")), reader_make_constant_shell(makeString("Yanni")))), makeString("Cher likes Yanni")), list(list(list(reader_make_constant_shell(makeString("likesAsFriend")), reader_make_constant_shell(makeString("Cher")), reader_make_constant_shell(makeString("Yanni")))), makeString("Yanni is liked by Cher")), list(list(list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("likesAsFriend")), reader_make_constant_shell(makeString("Cher")), reader_make_constant_shell(makeString("Yanni"))))), makeString("Cher likes Yanni")), list(list(list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("likesAsFriend")), reader_make_constant_shell(makeString("Cher")), reader_make_constant_shell(makeString("Yanni"))))), makeString("Yanni is liked by Cher")), list(list(list(reader_make_constant_shell(makeString("likesAsFriend")), reader_make_constant_shell(makeString("Cher")), reader_make_constant_shell(makeString("Cyc")))), makeString("Cher likes Cyc")), list(list(reader_make_constant_shell(makeString("MilesPerHour")), makeKeyword("ALL"), list(makeKeyword("ACRONYMS"))), makeString("mph")), list(list(list(reader_make_constant_shell(makeString("likesAsFriend")), reader_make_constant_shell(makeString("Cher")), reader_make_constant_shell(makeString("Cyc")))), makeString("Cyc is liked by Cher")), list(list(list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("likesAsFriend")), reader_make_constant_shell(makeString("Cher")), reader_make_constant_shell(makeString("Cyc"))))), makeString("Cher likes Cyc")), list(list(list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("likesAsFriend")), reader_make_constant_shell(makeString("Cher")), reader_make_constant_shell(makeString("Cyc"))))), makeString("Cyc is liked by Cher")) });

    private static final SubLSymbol ALL_PHRASES_FOR_TERM_NEG = makeSymbol("ALL-PHRASES-FOR-TERM-NEG");

    private static final SubLSymbol ALL_PHRASES_NEG_TEST = makeSymbol("ALL-PHRASES-NEG-TEST");

    private static final SubLList $list197 = list(new SubLObject[]{ list(list(reader_make_constant_shell(makeString("GeorgeWBush")), list(reader_make_constant_shell(makeString("givenNames")))), makeString("George W. Bush")), list(list(reader_make_constant_shell(makeString("Cancer")), list(reader_make_constant_shell(makeString("nameString")), reader_make_constant_shell(makeString("singular-Generic")))), makeString("cancers")), list(list(reader_make_constant_shell(makeString("Cancer")), list(reader_make_constant_shell(makeString("nameString")))), makeString("case of cancer")), list(list(list(reader_make_constant_shell(makeString("suppliers")), reader_make_constant_shell(makeString("Cher")), reader_make_constant_shell(makeString("IBMInc"))), list(reader_make_constant_shell(makeString("pastTense-Generic"))), NIL, makeKeyword("TEXT"), NIL, NIL), makeString("IBM supplies goods or services to Cher")), list(list(reader_make_constant_shell(makeString("RandonneursUSA")), list(reader_make_constant_shell(makeString("nameString")))), makeString("RUSA")), list(list(reader_make_constant_shell(makeString("RandonneursUSA"))), makeString("RUSA")), list(list(reader_make_constant_shell(makeString("Dog")), list(reader_make_constant_shell(makeString("plural")))), makeString("dog")), list(list(reader_make_constant_shell(makeString("UnionOfSovietSocialistRepublics")), list(reader_make_constant_shell(makeString("nameString")))), makeString("USSR")), list(list(reader_make_constant_shell(makeString("UnionOfSovietSocialistRepublics"))), makeString("USSR")), list(list(list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("January")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1983))), makeKeyword("ALL"), NIL, makeKeyword("TEXT"), NIL, T), makeString("January, 1983")) });

    public static final SubLObject $list198 = _constant_198_initializer();

    private static final SubLSymbol TEST_GENERATE_PHRASE_FROM_LEXIFICATION_SENTENCE = makeSymbol("TEST-GENERATE-PHRASE-FROM-LEXIFICATION-SENTENCE");

    private static final SubLList $list200 = list(list(list(list(reader_make_constant_shell(makeString("denotation")), reader_make_constant_shell(makeString("Thing-TheWord")), reader_make_constant_shell(makeString("CountNoun")), ZERO_INTEGER, reader_make_constant_shell(makeString("Thing"))), list(reader_make_constant_shell(makeString("pronounStrings")))), NIL), list(list(list(reader_make_constant_shell(makeString("denotation")), reader_make_constant_shell(makeString("Who-TheWord")), reader_make_constant_shell(makeString("WHPronoun")), ZERO_INTEGER, reader_make_constant_shell(makeString("Thing"))), list(reader_make_constant_shell(makeString("pronounStrings")))), makeString("who"), reader_make_constant_shell(makeString("pronounStrings"))), list(list(list(reader_make_constant_shell(makeString("compoundString")), reader_make_constant_shell(makeString("Do-TheWord")), list(reader_make_constant_shell(makeString("TheList")), makeString("math")), reader_make_constant_shell(makeString("Verb")), reader_make_constant_shell(makeString("DoingMath"))), list(reader_make_constant_shell(makeString("nonPlural-Generic")))), makeString("doing math"), reader_make_constant_shell(makeString("gerund"))));

    public static SubLObject gen_phrase_method(final SubLObject v_term, SubLObject nl_preds) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = $ANY;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject string = NIL;
        SubLObject pred = NIL;
        if (NIL != indexed_term_p(v_term)) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(pph_vars.$pph_language_mt$.getDynamicValue(thread));
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                final SubLObject assertions = kb_mapping.gather_gaf_arg_index_with_predicate(v_term, ONE_INTEGER, $$genPhrase, UNPROVIDED, UNPROVIDED);
                final SubLObject found_preds = kb_mapping_utilities.pred_values(v_term, $$genPhrase, ONE_INTEGER, THREE_INTEGER, UNPROVIDED);
                if (NIL != assertions) {
                    final SubLObject pcase_var = nl_preds;
                    if (pcase_var.eql($ANY)) {
                        final SubLObject as = assertions.first();
                        pred = assertions_high.gaf_arg3(as);
                        string = assertions_high.gaf_arg4(as);
                    } else {
                        final SubLObject nl_preds_to_use = list_utilities.ordered_intersection(pph_utilities.pph_expand_nl_preds(nl_preds), found_preds, symbol_function(EQL), UNPROVIDED);
                        if (NIL == pred) {
                            SubLObject csome_list_var = nl_preds_to_use;
                            SubLObject nl_pred = NIL;
                            nl_pred = csome_list_var.first();
                            while ((NIL == pred) && (NIL != csome_list_var)) {
                                if (NIL == pred) {
                                    SubLObject csome_list_var_$1 = assertions;
                                    SubLObject ass = NIL;
                                    ass = csome_list_var_$1.first();
                                    while ((NIL == pred) && (NIL != csome_list_var_$1)) {
                                        if (nl_pred.eql(assertions_high.gaf_arg3(ass))) {
                                            string = assertions_high.gaf_arg4(ass);
                                            pred = nl_pred;
                                        }
                                        csome_list_var_$1 = csome_list_var_$1.rest();
                                        ass = csome_list_var_$1.first();
                                    } 
                                }
                                csome_list_var = csome_list_var.rest();
                                nl_pred = csome_list_var.first();
                            } 
                        }
                    }
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return list(string, pred);
    }

    public static SubLObject any_gen_phrase_method(final SubLObject v_term, SubLObject nl_preds) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = NIL;
        }
        return gen_phrase_method(v_term, UNPROVIDED);
    }

    public static SubLObject preferred_gen_unit_method(final SubLObject v_term, SubLObject nl_preds) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = $ANY;
        }
        final SubLObject pgu_assertions = pgu_assertions_for_term(v_term, UNPROVIDED);
        final SubLObject result = generate_phrase_from_assertions(pgu_assertions, v_term, nl_preds, UNPROVIDED);
        if (NIL != pph_data_structures.pph_phrase_output_item_loose_p(result)) {
            pph_data_structures.pph_phrase_output_item_set_cycl(result, v_term);
        }
        return result;
    }

    public static SubLObject pgu_assertions_for_term_internal(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject pgu_assertions = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            pgu_assertions = kb_mapping.gather_gaf_arg_index_with_predicate(v_term, ONE_INTEGER, $$preferredGenUnit, UNPROVIDED, UNPROVIDED);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return pgu_assertions;
    }

    public static SubLObject pgu_assertions_for_term(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return pgu_assertions_for_term_internal(v_term, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PGU_ASSERTIONS_FOR_TERM, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PGU_ASSERTIONS_FOR_TERM, TWO_INTEGER, $int$32, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, PGU_ASSERTIONS_FOR_TERM, caching_state);
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
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(pgu_assertions_for_term_internal(v_term, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(v_term, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject gen_string_assertion_precise_method(final SubLObject v_term, SubLObject nl_preds) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = $ANY;
        }
        return preferred_lexification_method(v_term, nl_preds, T);
    }

    public static SubLObject preferred_lexification_method(final SubLObject v_term, SubLObject nl_preds, SubLObject precise_onlyP) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = $ANY;
        }
        if (precise_onlyP == UNPROVIDED) {
            precise_onlyP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == nl_preds) {
            nl_preds = $ANY;
        }
        if (((NIL == forts.fort_p(v_term)) || (NIL != lexicon_accessors.quick_lexical_wordP(v_term, UNPROVIDED))) || (NIL != fort_types_interface.function_in_any_mtP(v_term))) {
            return NIL;
        }
        final SubLObject preferred_lexifications = lexicon_utilities.preferred_lexifications_for_term(v_term, pph_vars.$pph_language_mt$.getDynamicValue(thread), precise_onlyP, nl_preds);
        if (NIL == preferred_lexifications) {
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                format_nil.force_format(T, $str5$__PREFERRED_LEXIFICATION_METHOD_f, v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            return NIL;
        }
        final SubLObject output_item = generate_phrase_from_lexification_sentences(preferred_lexifications, v_term, nl_preds, UNPROVIDED);
        if (NIL != pph_data_structures.pph_phrase_output_item_loose_p(output_item)) {
            pph_data_structures.pph_phrase_output_item_set_cycl(output_item, v_term);
        }
        return output_item;
    }

    public static SubLObject generate_phrase_from_lexification_sentences(final SubLObject lexification_sentences, final SubLObject v_term, SubLObject nl_preds, SubLObject politenessP) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = $ANY;
        }
        if (politenessP == UNPROVIDED) {
            politenessP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject output_items = NIL;
        SubLObject ans = NIL;
        SubLObject done_lexification_sentences = NIL;
        if (NIL == ans) {
            SubLObject csome_list_var = lexification_sentences;
            SubLObject lex_sent = NIL;
            lex_sent = csome_list_var.first();
            while ((NIL == ans) && (NIL != csome_list_var)) {
                thread.resetMultipleValues();
                final SubLObject possible_output_item = try_generate_phrase_from_lexification_sentence(lex_sent, v_term, nl_preds, politenessP, NIL);
                final SubLObject use_as_ansP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != use_as_ansP) {
                    ans = possible_output_item;
                } else
                    if (NIL != possible_output_item) {
                        output_items = cons(possible_output_item, output_items);
                        done_lexification_sentences = cons(lex_sent, done_lexification_sentences);
                    }

                csome_list_var = csome_list_var.rest();
                lex_sent = csome_list_var.first();
            } 
        }
        if (NIL == ans) {
            SubLObject csome_list_var = lexification_sentences;
            SubLObject lex_sent = NIL;
            lex_sent = csome_list_var.first();
            while ((NIL == ans) && (NIL != csome_list_var)) {
                if (NIL == subl_promotions.memberP(lex_sent, done_lexification_sentences, UNPROVIDED, UNPROVIDED)) {
                    thread.resetMultipleValues();
                    final SubLObject possible_output_item = try_generate_phrase_from_lexification_sentence(lex_sent, v_term, nl_preds, politenessP, T);
                    final SubLObject use_as_ansP = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != use_as_ansP) {
                        ans = possible_output_item;
                    } else
                        if (NIL != possible_output_item) {
                            output_items = cons(possible_output_item, output_items);
                        }

                }
                csome_list_var = csome_list_var.rest();
                lex_sent = csome_list_var.first();
            } 
        }
        if (NIL == pph_data_structures.pph_phrase_output_item_loose_p(ans)) {
            output_items = nreverse(output_items);
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                format_nil.force_format(T, $str6$__GENERATE_PHRASE_FROM_LEXIFICATI, output_items, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            if (NIL != output_items) {
                if (nl_preds == $ANY) {
                    return output_items.first();
                }
                if (nl_preds.isList()) {
                    if (NIL == ans) {
                        SubLObject csome_list_var = nl_preds;
                        SubLObject nl_pred = NIL;
                        nl_pred = csome_list_var.first();
                        while ((NIL == ans) && (NIL != csome_list_var)) {
                            if (NIL == ans) {
                                SubLObject csome_list_var_$2 = output_items;
                                SubLObject output_item = NIL;
                                output_item = csome_list_var_$2.first();
                                while ((NIL == ans) && (NIL != csome_list_var_$2)) {
                                    if (NIL != pph_output_item_ok_for_predP(output_item, nl_pred)) {
                                        ans = output_item;
                                    }
                                    csome_list_var_$2 = csome_list_var_$2.rest();
                                    output_item = csome_list_var_$2.first();
                                } 
                            }
                            csome_list_var = csome_list_var.rest();
                            nl_pred = csome_list_var.first();
                        } 
                    }
                } else {
                    final SubLObject new_format_string = cconcatenate($str7$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str8$__, format_nil.format_nil_a_no_copy($str9$Bad_NL_PREDS___S) });
                    pph_error.pph_handle_error(new_format_string, list(nl_preds));
                }
            }
        }
        return ans;
    }

    public static SubLObject try_generate_phrase_from_lexification_sentence(final SubLObject lex_sent, final SubLObject v_term, final SubLObject nl_preds, final SubLObject politenessP, final SubLObject coerceP) {
        final SubLObject output_item = generate_phrase_from_lexification_sentence(lex_sent, nl_preds, politenessP, coerceP);
        return handle_pph_output_item(output_item, v_term, nl_preds);
    }

    public static SubLObject try_generate_phrase_from_as(final SubLObject lex_as, final SubLObject v_term, final SubLObject nl_preds, final SubLObject politenessP, final SubLObject coerceP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject output_item = generate_phrase_from_as(lex_as, v_term, nl_preds, politenessP, coerceP, UNPROVIDED);
        SubLObject alternative_items = thread.secondMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        SubLObject possibly_output_item = handle_pph_output_item(output_item, v_term, nl_preds);
        SubLObject use_as_ansP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        while ((NIL != alternative_items) && (NIL == possibly_output_item)) {
            thread.resetMultipleValues();
            final SubLObject possibly_output_item_$3 = handle_pph_output_item(alternative_items.first(), v_term, nl_preds);
            final SubLObject use_as_ansP_$4 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            possibly_output_item = possibly_output_item_$3;
            use_as_ansP = use_as_ansP_$4;
            alternative_items = alternative_items.rest();
        } 
        return values(possibly_output_item, use_as_ansP, alternative_items);
    }

    public static SubLObject handle_pph_output_item(SubLObject output_item, final SubLObject v_term, final SubLObject nl_preds) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject use_as_ansP = NIL;
        if (NIL != output_item) {
            if (((NIL != pph_vars.pph_blacklist_active_p()) && (NIL != pph_phrase.pph_known_cycl_p(v_term))) && (NIL != pph_vars.pph_forbidden_string_for_termP(v_term, pph_data_structures.pph_phrase_output_item_string(output_item)))) {
                if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
                    Errors.warn($str10$_S_is_a_forbidden_paraphrase_for_, pph_data_structures.pph_phrase_output_item_string(output_item), v_term);
                    force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                }
                output_item = NIL;
            } else
                if (NIL == pph_vars.$pph_use_online_string_frequenciesP$.getDynamicValue(thread)) {
                    if (NIL != pph_output_item_okP(output_item, nl_preds.isList() ? list(nl_preds.first()) : nl_preds)) {
                        use_as_ansP = T;
                    } else
                        if (nl_preds.isList() && (NIL == pph_output_item_okP(output_item, nl_preds))) {
                            output_item = NIL;
                        }

                }

        }
        return values(output_item, use_as_ansP);
    }

    public static SubLObject generate_phrase_from_assertions(final SubLObject assertions, final SubLObject v_term, SubLObject nl_preds, SubLObject politenessP) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = $ANY;
        }
        if (politenessP == UNPROVIDED) {
            politenessP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject output_items = NIL;
        SubLObject ans = NIL;
        SubLObject alternative_items = NIL;
        SubLObject doneP = NIL;
        SubLObject done_assertions = NIL;
        if (NIL == doneP) {
            SubLObject csome_list_var = assertions;
            SubLObject lex_as = NIL;
            lex_as = csome_list_var.first();
            while ((NIL == doneP) && (NIL != csome_list_var)) {
                thread.resetMultipleValues();
                final SubLObject possible_output_item = try_generate_phrase_from_as(lex_as, v_term, nl_preds, politenessP, NIL);
                final SubLObject use_as_ansP = thread.secondMultipleValue();
                final SubLObject as_alternative_items = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if ((NIL != use_as_ansP) && (NIL == ans)) {
                    ans = possible_output_item;
                    doneP = makeBoolean(NIL == pph_vars.pph_generate_alternative_phrasesP());
                } else
                    if (NIL != possible_output_item) {
                        output_items = cons(possible_output_item, output_items);
                        done_assertions = cons(lex_as, done_assertions);
                    }

                SubLObject cdolist_list_var = as_alternative_items;
                SubLObject item = NIL;
                item = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    output_items = cons(item, output_items);
                    cdolist_list_var = cdolist_list_var.rest();
                    item = cdolist_list_var.first();
                } 
                csome_list_var = csome_list_var.rest();
                lex_as = csome_list_var.first();
            } 
        }
        if ((NIL != pph_vars.$pph_allow_word_form_coercionP$.getDynamicValue(thread)) && (NIL == ans)) {
            SubLObject csome_list_var = assertions;
            SubLObject lex_as = NIL;
            lex_as = csome_list_var.first();
            while ((NIL == ans) && (NIL != csome_list_var)) {
                if (NIL == subl_promotions.memberP(lex_as, done_assertions, UNPROVIDED, UNPROVIDED)) {
                    thread.resetMultipleValues();
                    final SubLObject possible_output_item = try_generate_phrase_from_as(lex_as, v_term, nl_preds, politenessP, T);
                    final SubLObject use_as_ansP = thread.secondMultipleValue();
                    final SubLObject as_alternative_items = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if ((NIL != use_as_ansP) && (NIL == ans)) {
                        ans = possible_output_item;
                    } else
                        if (NIL != possible_output_item) {
                            output_items = cons(possible_output_item, output_items);
                        }

                    SubLObject cdolist_list_var = as_alternative_items;
                    SubLObject item = NIL;
                    item = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        output_items = cons(item, output_items);
                        cdolist_list_var = cdolist_list_var.rest();
                        item = cdolist_list_var.first();
                    } 
                }
                csome_list_var = csome_list_var.rest();
                lex_as = csome_list_var.first();
            } 
        }
        if (NIL == doneP) {
            output_items = nreverse(output_items);
            output_items = pph_sort_output_items(output_items);
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                format_nil.force_format(T, $str11$__GENERATE_PHRASE_FROM_ASSERTIONS, output_items, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            if (NIL != output_items) {
                if (nl_preds == $ANY) {
                    if (NIL == ans) {
                        ans = output_items.first();
                        output_items = output_items.rest();
                    }
                    alternative_items = output_items;
                } else
                    if (nl_preds.isList()) {
                        SubLObject cdolist_list_var2 = nl_preds;
                        SubLObject nl_pred = NIL;
                        nl_pred = cdolist_list_var2.first();
                        while (NIL != cdolist_list_var2) {
                            SubLObject cdolist_list_var_$5 = output_items;
                            SubLObject output_item = NIL;
                            output_item = cdolist_list_var_$5.first();
                            while (NIL != cdolist_list_var_$5) {
                                if (NIL != pph_output_item_ok_for_predP(output_item, nl_pred)) {
                                    if (NIL != ans) {
                                        final SubLObject item_var = output_item;
                                        if (NIL == member(item_var, alternative_items, symbol_function(EQUALP), symbol_function(IDENTITY))) {
                                            alternative_items = cons(item_var, alternative_items);
                                        }
                                    } else {
                                        ans = output_item;
                                    }
                                }
                                cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                                output_item = cdolist_list_var_$5.first();
                            } 
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            nl_pred = cdolist_list_var2.first();
                        } 
                        alternative_items = nreverse(alternative_items);
                    } else {
                        final SubLObject new_format_string = cconcatenate($str7$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str8$__, format_nil.format_nil_a_no_copy($str9$Bad_NL_PREDS___S) });
                        pph_error.pph_handle_error(new_format_string, list(nl_preds));
                    }

            }
        }
        return values(ans, remove(ans, delete_duplicates(alternative_items, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED), symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject pph_output_item_okP(final SubLObject output_item, final SubLObject nl_preds) {
        if ((NIL == pph_disambiguation.pph_parenthetical_disambiguations_allowed_for_string_for_termP(pph_data_structures.pph_phrase_output_item_string(output_item), pph_data_structures.pph_phrase_output_item_cycl(output_item))) && (NIL != pph_disambiguation.pph_output_item_ambiguous_p(output_item))) {
            return NIL;
        }
        if ($ANY == nl_preds) {
            return T;
        }
        if (nl_preds.isList()) {
            SubLObject okP = NIL;
            if (NIL == okP) {
                SubLObject csome_list_var;
                SubLObject nl_pred;
                for (csome_list_var = nl_preds, nl_pred = NIL, nl_pred = csome_list_var.first(); (NIL == okP) && (NIL != csome_list_var); okP = pph_output_item_ok_for_predP(output_item, nl_pred) , csome_list_var = csome_list_var.rest() , nl_pred = csome_list_var.first()) {
                }
            }
            return okP;
        }
        final SubLObject new_format_string = cconcatenate($str7$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str8$__, format_nil.format_nil_a_no_copy($str9$Bad_NL_PREDS___S) });
        pph_error.pph_handle_error(new_format_string, list(nl_preds));
        return NIL;
    }

    public static SubLObject pph_output_item_ok_for_predP(final SubLObject output_item, final SubLObject nl_pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject okP = NIL;
        if (NIL != indexed_term_p(nl_pred)) {
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(THREE_INTEGER)) {
                format_nil.force_format(T, $str12$__Checking_output_item___S___, output_item, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            final SubLObject found_pred = pph_data_structures.pph_phrase_output_item_agr_pred(output_item);
            if ((NIL != forts.fort_p(found_pred)) && ((NIL != pph_utilities.pph_genl_pos_predP(found_pred, nl_pred, pph_vars.$pph_language_mt$.getDynamicValue(thread))) || ((NIL != pph_utilities.pph_name_string_predP(found_pred)) && (NIL != pph_output_name_ok_for_predP(output_item, nl_pred))))) {
                okP = T;
            }
        }
        return okP;
    }

    public static SubLObject pph_output_name_ok_for_predP(final SubLObject output_item, final SubLObject nl_pred) {
        final SubLObject name_pred = pph_data_structures.pph_phrase_output_item_agr_pred(output_item);
        final SubLObject name = pph_data_structures.pph_phrase_output_item_string(output_item);
        final SubLObject denot = pph_data_structures.pph_phrase_output_item_cycl(output_item);
        return pph_name_ok_for_pred_and_cyclP(name, denot, name_pred, nl_pred);
    }

    public static SubLObject pph_name_ok_for_pred_and_cyclP(final SubLObject name, final SubLObject denot, final SubLObject name_pred, final SubLObject nl_pred) {
        if (NIL != pph_methods.pph_genl_lexicon_predicateP(name_pred, nl_pred)) {
            return T;
        }
        if (NIL == pph_utilities.pph_genl_pos_predP(nl_pred, $$nounStrings, UNPROVIDED)) {
            return NIL;
        }
        return T;
    }

    public static SubLObject pph_sort_output_items(final SubLObject output_items) {
        return Sort.stable_sort(output_items, $sym14$PPH_PREFER_STRING_, PPH_PHRASE_OUTPUT_ITEM_STRING);
    }

    public static SubLObject generate_phrases_from_as_internal(final SubLObject lex_as, SubLObject v_term, SubLObject nl_preds, SubLObject politenessP, SubLObject mode) {
        if (v_term == UNPROVIDED) {
            v_term = pph_phrase.pph_unknown_cycl();
        }
        if (nl_preds == UNPROVIDED) {
            nl_preds = $ANY;
        }
        if (politenessP == UNPROVIDED) {
            politenessP = T;
        }
        if (mode == UNPROVIDED) {
            mode = $TEXT;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (nl_preds != $ANY) {
        }
        final SubLObject pred = assertions_high.gaf_arg0(lex_as);
        final SubLObject pos_arg = lexicon_utilities.pos_arg_of_pred_cached(pred);
        final SubLObject pos = (pos_arg.isInteger()) ? assertions_high.gaf_arg(lex_as, pos_arg) : NIL;
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = pph_vars.$paraphrase_mode$.currentBinding(thread);
        try {
            pph_vars.$paraphrase_mode$.bind(mode, thread);
            if (nl_preds.isList()) {
                SubLObject cdolist_list_var = nl_preds;
                SubLObject nl_pred = NIL;
                nl_pred = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject result = generate_phrase_from_as(lex_as, v_term, list(nl_pred), politenessP, UNPROVIDED, UNPROVIDED);
                    if (NIL != pph_data_structures.pph_phrase_output_item_loose_p(result)) {
                        final SubLObject item_var = pph_phrase.pph_phrase_output_item_get_string(result, T);
                        if (NIL == member(item_var, ans, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                            ans = cons(item_var, ans);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    nl_pred = cdolist_list_var.first();
                } 
            } else
                if (NIL != pph_utilities.pph_name_string_predP(pred)) {
                    final SubLObject result2 = generate_phrase_from_as(lex_as, $ANY, politenessP, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    if (NIL != pph_data_structures.pph_phrase_output_item_loose_p(result2)) {
                        final SubLObject item_var2 = pph_data_structures.pph_phrase_output_item_string(result2);
                        if (NIL == member(item_var2, ans, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                            ans = cons(item_var2, ans);
                        }
                    }
                } else
                    if (NIL != lexicon_accessors.speech_partP(pos, UNPROVIDED)) {
                        thread.resetMultipleValues();
                        final SubLObject leading_strings = lexicon_utilities.parse_denot_formula(assertions_high.gaf_formula(lex_as));
                        final SubLObject word = thread.secondMultipleValue();
                        final SubLObject following_strings = thread.thirdMultipleValue();
                        final SubLObject pos_$6 = thread.fourthMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != word) {
                            final SubLObject temp_preds = (nl_preds == $ANY) ? lexicon_utilities.preds_of_pos(pos_$6, UNPROVIDED) : pph_utilities.pph_filter_preds(nl_preds, lexicon_utilities.preds_of_pos(pos_$6, UNPROVIDED), UNPROVIDED);
                            SubLObject cdolist_list_var2;
                            final SubLObject results = cdolist_list_var2 = lexicon_cache.strings_of_word_unit(word, temp_preds, UNPROVIDED, UNPROVIDED);
                            SubLObject head_string = NIL;
                            head_string = cdolist_list_var2.first();
                            while (NIL != cdolist_list_var2) {
                                final SubLObject item_var3;
                                final SubLObject new_string = item_var3 = lexicon_utilities.assemble_denot_strings(leading_strings, head_string, following_strings);
                                if (NIL == member(item_var3, ans, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                    ans = cons(item_var3, ans);
                                }
                                cdolist_list_var2 = cdolist_list_var2.rest();
                                head_string = cdolist_list_var2.first();
                            } 
                        } else {
                            SubLObject cdolist_list_var3 = pph_utilities.pph_filter_preds(nl_preds, lexicon_utilities.preds_of_pos(pos_$6, UNPROVIDED), UNPROVIDED);
                            SubLObject nl_pred2 = NIL;
                            nl_pred2 = cdolist_list_var3.first();
                            while (NIL != cdolist_list_var3) {
                                final SubLObject result3 = generate_phrase_from_as(lex_as, list(nl_pred2), politenessP, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                if (NIL != pph_data_structures.pph_phrase_output_item_loose_p(result3)) {
                                    final SubLObject item_var4 = pph_data_structures.pph_phrase_output_item_string(result3);
                                    if (NIL == member(item_var4, ans, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                        ans = cons(item_var4, ans);
                                    }
                                }
                                cdolist_list_var3 = cdolist_list_var3.rest();
                                nl_pred2 = cdolist_list_var3.first();
                            } 
                        }
                    } else {
                        final SubLObject result2 = generate_phrase_from_as(lex_as, nl_preds, politenessP, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        if (NIL != pph_data_structures.pph_phrase_output_item_loose_p(result2)) {
                            final SubLObject item_var2 = pph_data_structures.pph_phrase_output_item_string(result2);
                            if (NIL == member(item_var2, ans, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                ans = cons(item_var2, ans);
                            }
                        }
                    }


        } finally {
            pph_vars.$paraphrase_mode$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject generate_phrases_from_as(final SubLObject lex_as, SubLObject v_term, SubLObject nl_preds, SubLObject politenessP, SubLObject mode) {
        if (v_term == UNPROVIDED) {
            v_term = pph_phrase.pph_unknown_cycl();
        }
        if (nl_preds == UNPROVIDED) {
            nl_preds = $ANY;
        }
        if (politenessP == UNPROVIDED) {
            politenessP = T;
        }
        if (mode == UNPROVIDED) {
            mode = $TEXT;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return generate_phrases_from_as_internal(lex_as, v_term, nl_preds, politenessP, mode);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, GENERATE_PHRASES_FROM_AS, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), GENERATE_PHRASES_FROM_AS, FIVE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, GENERATE_PHRASES_FROM_AS, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_5(lex_as, v_term, nl_preds, politenessP, mode);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (lex_as.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (v_term.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (nl_preds.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (politenessP.equal(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (((NIL != cached_args) && (NIL == cached_args.rest())) && mode.equal(cached_args.first())) {
                                    return memoization_state.caching_results(results2);
                                }
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(generate_phrases_from_as_internal(lex_as, v_term, nl_preds, politenessP, mode)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(lex_as, v_term, nl_preds, politenessP, mode));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject generate_phrase_from_as_internal(final SubLObject lex_as, SubLObject v_term, SubLObject nl_preds, SubLObject politenessP, SubLObject allow_coercionP, SubLObject mode) {
        if (v_term == UNPROVIDED) {
            v_term = pph_phrase.pph_unknown_cycl();
        }
        if (nl_preds == UNPROVIDED) {
            nl_preds = $ANY;
        }
        if (politenessP == UNPROVIDED) {
            politenessP = T;
        }
        if (allow_coercionP == UNPROVIDED) {
            allow_coercionP = pph_vars.$pph_allow_word_form_coercionP$.getDynamicValue();
        }
        if (mode == UNPROVIDED) {
            mode = pph_vars.$paraphrase_mode$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = pph_vars.$paraphrase_mode$.currentBinding(thread);
        try {
            pph_vars.$paraphrase_mode$.bind(mode, thread);
            SubLObject best_item = NIL;
            SubLObject alternative_items = NIL;
            if ($$chemicalFormulaString.eql(assertions_high.gaf_arg0(lex_as))) {
                SubLObject current;
                final SubLObject datum = current = assertions_high.gaf_args(lex_as);
                SubLObject substance_type = NIL;
                SubLObject formula_string = NIL;
                destructuring_bind_must_consp(current, datum, $list20);
                substance_type = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list20);
                formula_string = current.first();
                current = current.rest();
                if (NIL == current) {
                    best_item = pph_methods.generate_chemical_substance_type_from_formula_string(substance_type, formula_string).first();
                } else {
                    cdestructuring_bind_error(datum, $list20);
                }
            } else {
                if ($$conventionalFormulaSymbolHTML.eql(assertions_high.gaf_arg0(lex_as))) {
                    return pph_output_item_for_formula_symbol(assertions_high.gaf_arg1(lex_as), assertions_high.gaf_arg2(lex_as));
                }
                final SubLObject _prev_bind_0_$7 = pph_macros.$new_pph_phrases$.currentBinding(thread);
                final SubLObject _prev_bind_2 = pph_macros.$new_pph_phrase_count$.currentBinding(thread);
                final SubLObject _prev_bind_3 = pph_macros.$destroy_new_pph_phrasesP$.currentBinding(thread);
                try {
                    pph_macros.$new_pph_phrases$.bind(stacks.create_stack(), thread);
                    pph_macros.$new_pph_phrase_count$.bind(pph_macros.get_new_pph_phrase_count(), thread);
                    pph_macros.$destroy_new_pph_phrasesP$.bind(T, thread);
                    try {
                        final SubLObject phrase = pph_phrase_from_lexical_as(lex_as, nl_preds, politenessP, allow_coercionP);
                        if ((NIL != pph_phrase.pph_phrase_p(phrase, UNPROVIDED)) && (NIL == pph_phrase.pph_phrase_impossible_p(phrase, T))) {
                            final SubLObject _prev_bind_0_$8 = pph_vars.$pph_allow_word_form_coercionP$.currentBinding(thread);
                            try {
                                pph_vars.$pph_allow_word_form_coercionP$.bind(allow_coercionP, thread);
                                pph_main.pph_phrase_generate(phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } finally {
                                pph_vars.$pph_allow_word_form_coercionP$.rebind(_prev_bind_0_$8, thread);
                            }
                            if (NIL != pph_phrase.pph_phrase_doneP(phrase)) {
                                pph_phrase.pph_phrase_set_cycl(phrase, v_term);
                                pph_phrase.pph_phrase_add_justification(phrase, lex_as);
                                pph_phrase_resolution.pph_phrase_maybe_throw_hl_supports(phrase);
                                pph_phrase.pph_phrase_consolidate_output_list(phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                best_item = pph_phrase.pph_phrase_output_list(phrase).first();
                            }
                            SubLObject cdolist_list_var = pph_phrase.pph_phrase_all_output_items(phrase);
                            SubLObject item = NIL;
                            item = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                if (!item.equal(best_item)) {
                                    final SubLObject item_var = item;
                                    if (NIL == member(item_var, alternative_items, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                        alternative_items = cons(item_var, alternative_items);
                                    }
                                }
                                cdolist_list_var = cdolist_list_var.rest();
                                item = cdolist_list_var.first();
                            } 
                            alternative_items = nreverse(alternative_items);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$9 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            pph_macros.destroy_new_pph_phrases();
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
                        }
                    }
                } finally {
                    pph_macros.$destroy_new_pph_phrasesP$.rebind(_prev_bind_3, thread);
                    pph_macros.$new_pph_phrase_count$.rebind(_prev_bind_2, thread);
                    pph_macros.$new_pph_phrases$.rebind(_prev_bind_0_$7, thread);
                }
            }
            return values(best_item, alternative_items);
        } finally {
            pph_vars.$paraphrase_mode$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject generate_phrase_from_as(final SubLObject lex_as, SubLObject v_term, SubLObject nl_preds, SubLObject politenessP, SubLObject allow_coercionP, SubLObject mode) {
        if (v_term == UNPROVIDED) {
            v_term = pph_phrase.pph_unknown_cycl();
        }
        if (nl_preds == UNPROVIDED) {
            nl_preds = $ANY;
        }
        if (politenessP == UNPROVIDED) {
            politenessP = T;
        }
        if (allow_coercionP == UNPROVIDED) {
            allow_coercionP = pph_vars.$pph_allow_word_form_coercionP$.getDynamicValue();
        }
        if (mode == UNPROVIDED) {
            mode = pph_vars.$paraphrase_mode$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return generate_phrase_from_as_internal(lex_as, v_term, nl_preds, politenessP, allow_coercionP, mode);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, GENERATE_PHRASE_FROM_AS, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), GENERATE_PHRASE_FROM_AS, SIX_INTEGER, $int$32, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, GENERATE_PHRASE_FROM_AS, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_6(lex_as, v_term, nl_preds, politenessP, allow_coercionP, mode);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (lex_as.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (v_term.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (nl_preds.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (politenessP.equal(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (allow_coercionP.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mode.equal(cached_args.first())) {
                                        return memoization_state.caching_results(results2);
                                    }
                                }
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(generate_phrase_from_as_internal(lex_as, v_term, nl_preds, politenessP, allow_coercionP, mode)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(lex_as, v_term, nl_preds, politenessP, allow_coercionP, mode));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject pph_output_item_for_formula_symbol(final SubLObject v_term, final SubLObject html_string) {
        final SubLObject item = pph_utilities.pph_html_string_to_output_item(html_string);
        pph_data_structures.pph_phrase_output_item_set_cycl(item, v_term);
        return item;
    }

    public static SubLObject pph_phrase_from_lexical_as(final SubLObject lex_as, SubLObject nl_preds, SubLObject politenessP, SubLObject allow_coercionP) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = $ANY;
        }
        if (politenessP == UNPROVIDED) {
            politenessP = T;
        }
        if (allow_coercionP == UNPROVIDED) {
            allow_coercionP = NIL;
        }
        final SubLObject formula = assertions_high.assertion_formula(lex_as);
        return pph_phrase_from_lexification_sentence(formula, nl_preds, politenessP, allow_coercionP);
    }

    public static SubLObject generate_phrase_from_lexification_sentence(final SubLObject lex_sent, SubLObject nl_preds, SubLObject politenessP, SubLObject allow_coercionP) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = $ANY;
        }
        if (politenessP == UNPROVIDED) {
            politenessP = T;
        }
        if (allow_coercionP == UNPROVIDED) {
            allow_coercionP = T;
        }
        final SubLObject memoized_result = generate_phrase_from_lexification_sentence_memoized(lex_sent, nl_preds, politenessP, allow_coercionP);
        return NIL != pph_data_structures.pph_phrase_output_item_loose_p(memoized_result) ? pph_data_structures.pph_phrase_output_item_copy(memoized_result) : NIL;
    }

    public static SubLObject generate_phrase_from_lexification_sentence_memoized_internal(final SubLObject lex_sent, final SubLObject nl_preds, final SubLObject politenessP, final SubLObject allow_coercionP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($$chemicalFormulaString.eql(cycl_utilities.atomic_sentence_predicate(lex_sent))) {
            SubLObject current;
            final SubLObject datum = current = cycl_utilities.atomic_sentence_args(lex_sent, UNPROVIDED);
            SubLObject substance_type = NIL;
            SubLObject formula_string = NIL;
            destructuring_bind_must_consp(current, datum, $list20);
            substance_type = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list20);
            formula_string = current.first();
            current = current.rest();
            if (NIL == current) {
                return pph_methods.generate_chemical_substance_type_from_formula_string(substance_type, formula_string).first();
            }
            cdestructuring_bind_error(datum, $list20);
        } else {
            final SubLObject phrase = pph_phrase_from_lexification_sentence(lex_sent, nl_preds, politenessP, allow_coercionP);
            if ((NIL != pph_phrase.pph_phrase_p(phrase, UNPROVIDED)) && (NIL == pph_phrase.pph_phrase_impossible_p(phrase, T))) {
                final SubLObject _prev_bind_0 = pph_vars.$pph_allow_word_form_coercionP$.currentBinding(thread);
                try {
                    pph_vars.$pph_allow_word_form_coercionP$.bind(allow_coercionP, thread);
                    pph_phrase_resolution.pph_phrase_get_string(phrase, UNPROVIDED, UNPROVIDED);
                } finally {
                    pph_vars.$pph_allow_word_form_coercionP$.rebind(_prev_bind_0, thread);
                }
                return (NIL != pph_phrase.pph_phrase_doneP(phrase)) && (NIL != list_utilities.singletonP(pph_phrase.pph_phrase_output_list(phrase))) ? pph_phrase.pph_phrase_output_list(phrase).first() : NIL;
            }
        }
        return NIL;
    }

    public static SubLObject generate_phrase_from_lexification_sentence_memoized(final SubLObject lex_sent, final SubLObject nl_preds, final SubLObject politenessP, final SubLObject allow_coercionP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return generate_phrase_from_lexification_sentence_memoized_internal(lex_sent, nl_preds, politenessP, allow_coercionP);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, GENERATE_PHRASE_FROM_LEXIFICATION_SENTENCE_MEMOIZED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), GENERATE_PHRASE_FROM_LEXIFICATION_SENTENCE_MEMOIZED, FOUR_INTEGER, $int$256, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, GENERATE_PHRASE_FROM_LEXIFICATION_SENTENCE_MEMOIZED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(lex_sent, nl_preds, politenessP, allow_coercionP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (lex_sent.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (nl_preds.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (politenessP.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && allow_coercionP.equal(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(generate_phrase_from_lexification_sentence_memoized_internal(lex_sent, nl_preds, politenessP, allow_coercionP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(lex_sent, nl_preds, politenessP, allow_coercionP));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject pph_phrase_from_lexification_sentence(final SubLObject lexification_sentence, SubLObject nl_preds, SubLObject politenessP, SubLObject allow_coercionP) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = $ANY;
        }
        if (politenessP == UNPROVIDED) {
            politenessP = T;
        }
        if (allow_coercionP == UNPROVIDED) {
            allow_coercionP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pred = cycl_utilities.formula_operator(lexification_sentence);
        SubLObject ans = NIL;
        if ($$preferredGenUnit.eql(pred)) {
            SubLObject current;
            final SubLObject datum = current = cycl_utilities.formula_args(lexification_sentence, UNPROVIDED);
            SubLObject denot = NIL;
            SubLObject pos = NIL;
            SubLObject wu = NIL;
            destructuring_bind_must_consp(current, datum, $list25);
            denot = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list25);
            pos = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list25);
            wu = current.first();
            current = current.rest();
            if (NIL == current) {
                ans = pph_templates.pph_phrasify_phrase_naut(make_binary_formula(pph_functions.bestnlwordformoflexemefn_constrained(), pos, wu), UNPROVIDED);
                pph_phrase.pph_phrase_set_output_list_cycl(ans, denot);
            } else {
                cdestructuring_bind_error(datum, $list25);
            }
            if (nl_preds.isList()) {
                pph_phrase.pph_phrase_set_agr_preds(ans, nl_preds, UNPROVIDED);
            }
        } else
            if (NIL != pph_utilities.pph_name_string_predP(pred)) {
                SubLObject current;
                final SubLObject datum = current = cycl_utilities.atomic_sentence_args(lexification_sentence, UNPROVIDED);
                SubLObject denot = NIL;
                SubLObject string = NIL;
                destructuring_bind_must_consp(current, datum, $list26);
                denot = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list26);
                string = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL != pph_utilities.pph_string_ok_for_termP(string, denot)) {
                        ans = pph_templates.pph_phrasify_phrase_naut(pph_types.pph_phrase_naut_for_string(string), UNPROVIDED);
                        pph_phrase.pph_phrase_set_agr_pred(ans, pred, UNPROVIDED);
                    }
                } else {
                    cdestructuring_bind_error(datum, $list26);
                }
            } else
                if (NIL != pph_utilities.pph_genl_predicateP(pred, $$termPhrases, UNPROVIDED)) {
                    SubLObject current;
                    final SubLObject datum = current = cycl_utilities.formula_args(lexification_sentence, UNPROVIDED);
                    SubLObject denot = NIL;
                    SubLObject constraint = NIL;
                    SubLObject string2 = NIL;
                    destructuring_bind_must_consp(current, datum, $list28);
                    denot = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list28);
                    constraint = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list28);
                    string2 = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        if (NIL != lexicon_utilities.term_phrases_constraint_compatible_with_nl_predsP(constraint, nl_preds)) {
                            final SubLObject pos2 = (NIL != pph_utilities.pph_speech_partP(constraint)) ? constraint : NIL;
                            final SubLObject leading_strings = NIL;
                            final SubLObject wu2 = NIL;
                            final SubLObject following_strings = NIL;
                            final SubLObject _prev_bind_0 = pph_vars.$pph_current_arg0$.currentBinding(thread);
                            try {
                                pph_vars.$pph_current_arg0$.bind($UNSPECIFIED, thread);
                                ans = pph_phrase_from_denot_info(leading_strings, wu2, following_strings, pos2, nl_preds, denot, allow_coercionP, pred);
                                if ((NIL != pph_utilities.pph_speech_part_predP(constraint)) || (NIL != pph_utilities.pph_name_string_predP(constraint))) {
                                    pph_phrase.pph_phrase_set_agr_pred(ans, constraint, UNPROVIDED);
                                }
                                pph_phrase.pph_phrase_set_string(ans, string2);
                            } finally {
                                pph_vars.$pph_current_arg0$.rebind(_prev_bind_0, thread);
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list28);
                    }
                } else
                    if (((NIL != lexicon_utilities.wu_arg_of_pred_cached(pred)) && ((NIL != lexicon_utilities.denotatum_arg_of_pred_cached(pred)) || (NIL != lexicon_utilities.semtrans_arg_of_pred_cached(pred)))) && (NIL == pph_utilities.pph_nl_generation_predP(pred, UNPROVIDED))) {
                        thread.resetMultipleValues();
                        final SubLObject leading_strings2 = lexicon_utilities.parse_denot_formula(lexification_sentence);
                        final SubLObject wu3 = thread.secondMultipleValue();
                        final SubLObject following_strings2 = thread.thirdMultipleValue();
                        final SubLObject pos = thread.fourthMultipleValue();
                        final SubLObject denot2 = thread.fifthMultipleValue();
                        thread.resetMultipleValues();
                        if (((NIL != pph_types.pph_lexical_wordP(wu3)) && (NIL != indexed_term_p(pos))) && ((NIL == politenessP) || (NIL == inappropriate_word_for_conceptP(wu3, pos, denot2, UNPROVIDED)))) {
                            final SubLObject _prev_bind_2 = pph_vars.$pph_current_arg0$.currentBinding(thread);
                            try {
                                pph_vars.$pph_current_arg0$.bind($UNSPECIFIED, thread);
                                ans = pph_phrase_from_denot_info(leading_strings2, wu3, following_strings2, pos, nl_preds, denot2, allow_coercionP, pred);
                            } finally {
                                pph_vars.$pph_current_arg0$.rebind(_prev_bind_2, thread);
                            }
                        }
                    }



        return ans;
    }

    public static SubLObject pph_phrase_from_denot_info(final SubLObject leading_strings, final SubLObject wu, final SubLObject following_strings, final SubLObject pos, final SubLObject nl_preds, final SubLObject denot, SubLObject allow_coercionP, SubLObject pred) {
        if (allow_coercionP == UNPROVIDED) {
            allow_coercionP = NIL;
        }
        if (pred == UNPROVIDED) {
            pred = NIL;
        }
        final SubLObject phrase = pph_templates.pph_phrasify_phrase_naut(pph_phrase_naut_from_denot_info(leading_strings, wu, following_strings, pred), UNPROVIDED);
        pph_phrase.pph_phrase_set_arg_position(phrase, pph_utilities.pph_unknown_arg_position());
        pph_phrase.pph_phrase_set_arg_position_map(phrase, pph_utilities.pph_new_empty_map());
        pph_phrase.pph_phrase_set_output_list_cycl(phrase, denot);
        return pph_phrase_from_denot_info_set_agr_preds(phrase, leading_strings, wu, following_strings, pos, nl_preds, allow_coercionP);
    }

    public static SubLObject pph_phrase_from_denot_info_set_agr_preds(SubLObject phrase, final SubLObject leading_strings, final SubLObject wu, final SubLObject following_strings, final SubLObject pos, SubLObject nl_preds, SubLObject allow_coercionP) {
        if (allow_coercionP == UNPROVIDED) {
            allow_coercionP = NIL;
        }
        final SubLObject head_dtr = pph_phrase.pph_phrase_lexical_head_dtr(phrase);
        if (NIL != pph_phrase.pph_phrase_p(head_dtr, UNPROVIDED)) {
            if ((NIL != leading_strings) && (NIL != pph_utilities.pph_genl_posP(pos, $$Adjective, UNPROVIDED))) {
                nl_preds = $list31;
                pph_phrase.pph_phrase_set_agr_preds(head_dtr, nl_preds, UNPROVIDED);
            } else
                if ((NIL != leading_strings) && (NIL != pph_utilities.pph_genl_posP(pos, $$Adverb, UNPROVIDED))) {
                    nl_preds = $list33;
                    pph_phrase.pph_phrase_set_agr_preds(head_dtr, nl_preds, UNPROVIDED);
                } else
                    if ((NIL != pos) && (NIL == pph_utilities.pph_genl_posP(pos, $$Determiner, UNPROVIDED))) {
                        final SubLObject pos_preds = (NIL != allow_coercionP) ? $ANY : append(lexicon_accessors.max_preds_of_pos(pos), pph_preds_derivable_from_pos(pos));
                        SubLObject filtered_nl_preds = pph_utilities.pph_filter_ordered_preds(nl_preds, pos_preds, UNPROVIDED);
                        if ((NIL != following_strings) && (NIL != pph_utilities.pph_genl_posP(pos, $$Verb, UNPROVIDED))) {
                            filtered_nl_preds = pph_utilities.pph_filter_ordered_preds(filtered_nl_preds, $list36, UNPROVIDED);
                            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                format_nil.force_format(T, $str37$Filtered_V_bar_preds_to__S__, filtered_nl_preds, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                        }
                        pph_phrase.pph_phrase_set_agr_preds(head_dtr, filtered_nl_preds, UNPROVIDED);
                        pph_phrase_resolution.pph_phrase_set_source_pos(head_dtr, pos);
                    } else
                        if (NIL != wu) {
                            if (!nl_preds.isList()) {
                                pph_phrase.pph_phrase_set_string(head_dtr, pph_first_string_of_wordXspeech_part(wu, pos, UNPROVIDED, UNPROVIDED));
                                pph_phrase.pph_phrase_set_agr_preds(head_dtr, lexicon_accessors.agreement_lookup(wu), UNPROVIDED);
                            } else
                                if (NIL != pph_utilities.pph_filter_preds(nl_preds, lexicon_accessors.agreement_lookup(wu), UNPROVIDED)) {
                                    pph_phrase.pph_phrase_set_string(head_dtr, pph_first_string_of_wordXspeech_part(wu, pos, UNPROVIDED, UNPROVIDED));
                                    pph_phrase.pph_phrase_set_agr_preds(head_dtr, pph_utilities.pph_filter_preds(nl_preds, lexicon_accessors.agreement_lookup(wu), UNPROVIDED), UNPROVIDED);
                                } else {
                                    phrase = NIL;
                                }

                        }



        }
        return phrase;
    }

    public static SubLObject pph_preds_derivable_from_pos(final SubLObject pos) {
        SubLObject preds = NIL;
        final SubLObject test = $sym38$SPEC_POS_PRED_;
        SubLObject cdolist_list_var = lexicon_utilities.preds_of_pos(pos, UNPROVIDED);
        SubLObject pred = NIL;
        pred = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject item_var = pred;
            if (NIL == member(item_var, preds, symbol_function(EQL), symbol_function(IDENTITY))) {
                preds = cons(item_var, preds);
            }
            SubLObject cdolist_list_var_$10 = lexicon_utilities.preds_derivable_from_pred(pred);
            SubLObject new_pred = NIL;
            new_pred = cdolist_list_var_$10.first();
            while (NIL != cdolist_list_var_$10) {
                final SubLObject item_var2 = new_pred;
                if (NIL == member(item_var2, preds, symbol_function(EQL), symbol_function(IDENTITY))) {
                    preds = cons(item_var2, preds);
                }
                cdolist_list_var_$10 = cdolist_list_var_$10.rest();
                new_pred = cdolist_list_var_$10.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            pred = cdolist_list_var.first();
        } 
        return list_utilities.remove_subsumed_items(preds, test, UNPROVIDED);
    }

    public static SubLObject pph_phrase_naut_from_denot_info(final SubLObject leading_strings, final SubLObject wu, final SubLObject following_strings, final SubLObject pred) {
        SubLObject phrase_nauts = NIL;
        SubLObject cdolist_list_var = leading_strings;
        SubLObject leading_string = NIL;
        leading_string = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject phrase_naut = pph_types.pph_phrase_naut_for_string(leading_string);
            phrase_nauts = cons(phrase_naut, phrase_nauts);
            cdolist_list_var = cdolist_list_var.rest();
            leading_string = cdolist_list_var.first();
        } 
        SubLObject wu_phrase_naut = make_unary_formula(pph_functions.bestnlwordformoflexemefn(), wu);
        if ((NIL != leading_strings) || (NIL != following_strings)) {
            wu_phrase_naut = make_unary_formula(pph_functions.headwordofphrasefn(), wu_phrase_naut);
        }
        phrase_nauts = cons(wu_phrase_naut, phrase_nauts);
        cdolist_list_var = following_strings;
        SubLObject following_string = NIL;
        following_string = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject phrase_naut = pph_types.pph_phrase_naut_for_string(following_string);
            phrase_nauts = cons(phrase_naut, phrase_nauts);
            cdolist_list_var = cdolist_list_var.rest();
            following_string = cdolist_list_var.first();
        } 
        if (NIL != list_utilities.singletonP(phrase_nauts)) {
            return list_utilities.only_one(phrase_nauts);
        }
        if (pred.eql($$hyphenString)) {
            SubLObject hyphenated_phrase_nauts = NIL;
            SubLObject cdolist_list_var2 = phrase_nauts;
            SubLObject phrase_naut = NIL;
            phrase_naut = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                hyphenated_phrase_nauts = cons(phrase_naut, hyphenated_phrase_nauts);
                hyphenated_phrase_nauts = cons(make_unary_formula(pph_functions.bestsymbolphrasefn(), $$Hyphen_TheSymbol), hyphenated_phrase_nauts);
                cdolist_list_var2 = cdolist_list_var2.rest();
                phrase_naut = cdolist_list_var2.first();
            } 
            hyphenated_phrase_nauts = hyphenated_phrase_nauts.rest();
            return make_el_formula(pph_functions.concatenatephrasesfn_nospaces(), hyphenated_phrase_nauts, UNPROVIDED);
        }
        return make_el_formula(pph_functions.concatenatephrasesfn(), nreverse(phrase_nauts), UNPROVIDED);
    }

    public static SubLObject noun_from_adjective_method(final SubLObject v_term, SubLObject nl_preds) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = $ANY;
        }
        SubLObject ans = list(NIL, NIL);
        if ((NIL != pph_utilities.pph_isaP(v_term, $$Collection, UNPROVIDED)) && (NIL != pph_utilities.pph_filter_preds(nl_preds, $list42, UNPROVIDED))) {
            final SubLObject adj_answer = passed_preds_succeed_method(v_term, $list43);
            SubLObject current;
            final SubLObject datum = current = adj_answer;
            SubLObject adj_string = NIL;
            SubLObject adj_pred = NIL;
            destructuring_bind_must_consp(current, datum, $list44);
            adj_string = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list44);
            adj_pred = current.first();
            current = current.rest();
            final SubLObject demerits = (current.isCons()) ? current.first() : ZERO_INTEGER;
            destructuring_bind_must_listp(current, datum, $list44);
            current = current.rest();
            final SubLObject justification = (current.isCons()) ? current.first() : NIL;
            destructuring_bind_must_listp(current, datum, $list44);
            current = current.rest();
            if (NIL == current) {
                if (adj_string.isString()) {
                    final SubLObject pairs = pph_string_pred_pairs_for_term($$Thing, nl_preds, UNPROVIDED, UNPROVIDED);
                    if (NIL != list_utilities.non_empty_list_p(pairs)) {
                        SubLObject current_$12;
                        final SubLObject datum_$11 = current_$12 = pairs.first();
                        SubLObject thing_string = NIL;
                        SubLObject thing_pred = NIL;
                        destructuring_bind_must_consp(current_$12, datum_$11, $list46);
                        thing_string = current_$12.first();
                        current_$12 = current_$12.rest();
                        destructuring_bind_must_consp(current_$12, datum_$11, $list46);
                        thing_pred = current_$12.first();
                        current_$12 = current_$12.rest();
                        final SubLObject thing_demerits = (current_$12.isCons()) ? current_$12.first() : ZERO_INTEGER;
                        destructuring_bind_must_listp(current_$12, datum_$11, $list46);
                        current_$12 = current_$12.rest();
                        final SubLObject thing_justification = (current_$12.isCons()) ? current_$12.first() : NIL;
                        destructuring_bind_must_listp(current_$12, datum_$11, $list46);
                        current_$12 = current_$12.rest();
                        if (NIL == current_$12) {
                            if (thing_string.isString()) {
                                final SubLObject noun_string = cconcatenate(adj_string, new SubLObject[]{ $$$_, thing_string });
                                ans = list(noun_string, thing_pred, add(demerits, thing_demerits), append(justification, thing_justification));
                            }
                        } else {
                            cdestructuring_bind_error(datum_$11, $list46);
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list44);
            }
        }
        return ans;
    }

    public static SubLObject passed_preds_succeed_method(final SubLObject v_term, SubLObject nl_preds) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = $ANY;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == nl_preds) || (NIL == indexed_term_p(v_term))) {
            return list(NIL, NIL);
        }
        SubLObject ans = list(NIL, NIL);
        SubLObject alternative_pairs = NIL;
        SubLObject broadenP = pph_vars.$allow_pph_language_mt_broadeningP$.getDynamicValue(thread);
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(pph_vars.$pph_language_mt$.getDynamicValue(thread));
        SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject result = pph_string_pred_pairs_for_term(v_term, nl_preds, UNPROVIDED, UNPROVIDED);
            if (NIL != result) {
                SubLObject current;
                final SubLObject datum = current = result;
                SubLObject best_pair = NIL;
                SubLObject other_pairs = NIL;
                destructuring_bind_must_consp(current, datum, $list48);
                best_pair = current.first();
                current = other_pairs = current.rest();
                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(THREE_INTEGER)) {
                    format_nil.force_format(T, $str49$__PASSED_PREDS_SUCCEED_METHOD__PP, best_pair, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                if (NIL != pph_utilities.pph_pred_licensed_by_predsP(second(best_pair), nl_preds)) {
                    ans = best_pair;
                    alternative_pairs = other_pairs;
                    broadenP = NIL;
                }
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        if (NIL != broadenP) {
            final SubLObject broadened_language_mt = pph_methods.pph_broaden_language_mt();
            if (NIL == hlmt.hlmt_equalP(broadened_language_mt, pph_vars.$pph_language_mt$.getDynamicValue(thread))) {
                _prev_bind_0 = pph_vars.$pph_language_mt$.currentBinding(thread);
                try {
                    pph_vars.$pph_language_mt$.bind(broadened_language_mt, thread);
                    if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
                        Errors.warn($str50$Broadening__PPH_LANGUAGE_MT__to__, pph_vars.$pph_language_mt$.getDynamicValue(thread));
                        force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                    }
                    final SubLObject mt_var2 = mt_relevance_macros.with_inference_mt_relevance_validate(pph_vars.$pph_language_mt$.getDynamicValue(thread));
                    final SubLObject _prev_bind_0_$13 = mt_relevance_macros.$mt$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var2), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var2), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var2), thread);
                        final SubLObject result2 = pph_string_pred_pairs_for_term(v_term, nl_preds, UNPROVIDED, UNPROVIDED);
                        if (NIL != result2) {
                            SubLObject current2;
                            final SubLObject datum2 = current2 = result2;
                            SubLObject best_pair2 = NIL;
                            SubLObject other_pairs2 = NIL;
                            destructuring_bind_must_consp(current2, datum2, $list48);
                            best_pair2 = current2.first();
                            current2 = other_pairs2 = current2.rest();
                            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(THREE_INTEGER)) {
                                format_nil.force_format(T, $str49$__PASSED_PREDS_SUCCEED_METHOD__PP, best_pair2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                            if (NIL != pph_utilities.pph_pred_licensed_by_predsP(second(best_pair2), nl_preds)) {
                                ans = best_pair2;
                                alternative_pairs = other_pairs2;
                                broadenP = NIL;
                            }
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_5, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_4, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0_$13, thread);
                    }
                } finally {
                    pph_vars.$pph_language_mt$.rebind(_prev_bind_0, thread);
                }
            }
        }
        return values(ans, alternative_pairs);
    }

    public static SubLObject any_preds_succeed_method(final SubLObject v_term, SubLObject nl_preds) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject fns = $list51;
        final SubLObject default_nl_preds = pph_utilities.pph_default_nl_preds_for_term(v_term);
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = pph_vars.$use_parenthetical_disambiguationsP$.currentBinding(thread);
        try {
            pph_vars.$use_parenthetical_disambiguationsP$.bind($NEVER, thread);
            if (NIL == ans) {
                SubLObject csome_list_var;
                SubLObject fn;
                for (csome_list_var = fns, fn = NIL, fn = csome_list_var.first(); (NIL == ans) && (NIL != csome_list_var); ans = pph_methods.pph_try_method(fn, v_term, default_nl_preds, $ANY, $ANY) , csome_list_var = csome_list_var.rest() , fn = csome_list_var.first()) {
                }
            }
            if (NIL == ans) {
                SubLObject csome_list_var;
                SubLObject fn;
                for (csome_list_var = fns, fn = NIL, fn = csome_list_var.first(); (NIL == ans) && (NIL != csome_list_var); ans = pph_methods.pph_try_method(fn, v_term, $ANY, $ANY, $ANY) , csome_list_var = csome_list_var.rest() , fn = csome_list_var.first()) {
                }
            }
        } finally {
            pph_vars.$use_parenthetical_disambiguationsP$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject pph_string_for_term(final SubLObject v_term, SubLObject nl_preds, SubLObject exceptions, SubLObject politenessP) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = $DEFAULT;
        }
        if (exceptions == UNPROVIDED) {
            exceptions = NIL;
        }
        if (politenessP == UNPROVIDED) {
            politenessP = T;
        }
        return pph_string_pred_pairs_for_term(v_term, nl_preds, exceptions, politenessP).first().first();
    }

    public static SubLObject pph_string_pred_pairs_for_term(final SubLObject v_term, SubLObject nl_preds, SubLObject exceptions, SubLObject politenessP) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = $ANY;
        }
        if (exceptions == UNPROVIDED) {
            exceptions = NIL;
        }
        if (politenessP == UNPROVIDED) {
            politenessP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject string_pred_pairs = NIL;
        if (NIL != indexed_term_p(v_term)) {
            if (nl_preds.isList()) {
                nl_preds = list_utilities.remove_if_not($sym54$SPEECH_PART_PRED_, nl_preds, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL != exceptions) {
                    nl_preds = set_difference(nl_preds, exceptions, UNPROVIDED, UNPROVIDED);
                }
            }
            if (NIL != nl_preds) {
                final SubLObject lexical_assertions = pph_lexifications_for_term(v_term, UNPROVIDED, UNPROVIDED);
                SubLObject result_string = NIL;
                SubLObject result_pred = NIL;
                thread.resetMultipleValues();
                final SubLObject best_item = generate_phrase_from_assertions(lexical_assertions, v_term, nl_preds, politenessP);
                final SubLObject alternative_items = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != pph_data_structures.pph_phrase_output_item_loose_p(best_item)) {
                    result_string = pph_data_structures.pph_phrase_output_item_string(best_item);
                    result_pred = pph_data_structures.pph_phrase_output_item_agr_pred(best_item);
                }
                if (NIL != result_string) {
                    string_pred_pairs = cons(list(result_string, result_pred, pph_data_structures.pph_phrase_output_item_demerits(best_item), pph_data_structures.pph_phrase_output_item_justification(best_item)), string_pred_pairs);
                    SubLObject cdolist_list_var = alternative_items;
                    SubLObject alternative_item = NIL;
                    alternative_item = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        string_pred_pairs = cons(list(pph_data_structures.pph_phrase_output_item_string(alternative_item), pph_data_structures.pph_phrase_output_item_agr_pred(alternative_item), pph_data_structures.pph_phrase_output_item_demerits(alternative_item), pph_data_structures.pph_phrase_output_item_justification(alternative_item)), string_pred_pairs);
                        cdolist_list_var = cdolist_list_var.rest();
                        alternative_item = cdolist_list_var.first();
                    } 
                    string_pred_pairs = nreverse(string_pred_pairs);
                }
            }
        }
        return string_pred_pairs;
    }

    public static SubLObject pph_lexifications_for_term(final SubLObject v_term, SubLObject lex_preds, SubLObject allow_domain_mt_for_namesP) {
        if (lex_preds == UNPROVIDED) {
            lex_preds = pph_lexification_preds();
        }
        if (allow_domain_mt_for_namesP == UNPROVIDED) {
            allow_domain_mt_for_namesP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject lexifications = NIL;
        SubLObject cdolist_list_var = lex_preds;
        SubLObject lex_pred = NIL;
        lex_pred = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject denotatum_arg = lexicon_utilities.denotatum_arg_of_pred_cached(lex_pred);
            if ((NIL != denotatum_arg) && (NIL != somewhere_cache.maybe_some_pred_assertion_somewhereP(lex_pred, v_term, denotatum_arg, T))) {
                final SubLObject mt_to_use = ((NIL != allow_domain_mt_for_namesP) && (NIL != pph_utilities.pph_name_string_predP(lex_pred))) ? pph_methods.pph_enhanced_domain_mt(pph_vars.$pph_language_mt$.getDynamicValue(thread), UNPROVIDED) : pph_vars.$pph_language_mt$.getDynamicValue(thread);
                final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt_to_use);
                final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    final SubLObject pred_var = lex_pred;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, denotatum_arg, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, denotatum_arg, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                    SubLObject done_var_$14 = NIL;
                                    final SubLObject token_var_$15 = NIL;
                                    while (NIL == done_var_$14) {
                                        final SubLObject lex_as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$15);
                                        final SubLObject valid_$16 = makeBoolean(!token_var_$15.eql(lex_as));
                                        if (NIL != valid_$16) {
                                            if (NIL != pph_vars.pph_forbidden_lexical_assertionP(lex_as)) {
                                                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                                    format_nil.force_format(T, $str57$Skipping_forbidden_lexical_assert, lex_as, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                }
                                            } else {
                                                lexifications = cons(lex_as, lexifications);
                                            }
                                        }
                                        done_var_$14 = makeBoolean(NIL == valid_$16);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$17 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$17, thread);
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
            cdolist_list_var = cdolist_list_var.rest();
            lex_pred = cdolist_list_var.first();
        } 
        if ($RANDOM == pph_vars.$pph_ceteris_paribus_choice_method$.getDynamicValue(thread)) {
            lexifications = list_utilities.randomize_list(lexifications);
        }
        lexifications = pph_utilities.pph_stable_sort_assertions(lexifications, UNPROVIDED, UNPROVIDED);
        return lexifications;
    }

    public static SubLObject clear_pph_lexification_preds() {
        final SubLObject cs = $pph_lexification_preds_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_pph_lexification_preds() {
        return memoization_state.caching_state_remove_function_results_with_args($pph_lexification_preds_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject pph_lexification_preds_internal() {
        return append(genl_predicates.all_spec_preds($$termPhrases, UNPROVIDED, UNPROVIDED), remove($$multiWordString_Speculative, cons($$denotation, lexicon_vars.multi_word_preds()), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject pph_lexification_preds() {
        SubLObject caching_state = $pph_lexification_preds_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(PPH_LEXIFICATION_PREDS, $pph_lexification_preds_caching_state$, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(pph_lexification_preds_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject clear_pph_arg_in_reln_preds() {
        final SubLObject cs = $pph_arg_in_reln_preds_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_pph_arg_in_reln_preds(SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args($pph_arg_in_reln_preds_caching_state$.getGlobalValue(), list(mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject pph_arg_in_reln_preds_internal(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            ans = isa.all_fort_instances($$DenotesArgInRelnPredicate, UNPROVIDED, UNPROVIDED);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject pph_arg_in_reln_preds(SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        SubLObject caching_state = $pph_arg_in_reln_preds_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(PPH_ARG_IN_RELN_PREDS, $pph_arg_in_reln_preds_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, mt, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(pph_arg_in_reln_preds_internal(mt)));
            memoization_state.caching_state_put(caching_state, mt, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject strip_initial_word(final SubLObject phrases, final SubLObject initial_word) {
        SubLObject results = NIL;
        SubLObject cdolist_list_var = phrases;
        SubLObject phrase = NIL;
        phrase = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != string_utilities.starts_with(phrase, initial_word)) {
                results = cons(string_utilities.trim_whitespace(subseq(phrase, length(initial_word), UNPROVIDED)), results);
            }
            cdolist_list_var = cdolist_list_var.rest();
            phrase = cdolist_list_var.first();
        } 
        return results;
    }

    public static SubLObject inference_strings_for_term_int(final SubLObject v_term, SubLObject nl_preds, SubLObject lexical_onlyP, SubLObject allow_rdfP) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = $ALL;
        }
        if (lexical_onlyP == UNPROVIDED) {
            lexical_onlyP = NIL;
        }
        if (allow_rdfP == UNPROVIDED) {
            allow_rdfP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = pph_vars.$pph_alternative_phrase_generation_level$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_vars.$pph_use_rdfP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = pph_vars.$pph_allow_word_form_coercionP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
        final SubLObject _prev_bind_5 = pph_vars.$pph_language_mt$.currentBinding(thread);
        final SubLObject _prev_bind_6 = pph_vars.$pph_domain_mt$.currentBinding(thread);
        final SubLObject _prev_bind_7 = pph_vars.$pph_demerit_cutoff$.currentBinding(thread);
        try {
            pph_vars.$pph_alternative_phrase_generation_level$.bind($ALL, thread);
            pph_vars.$pph_use_rdfP$.bind(allow_rdfP, thread);
            pph_vars.$pph_allow_word_form_coercionP$.bind(NIL, thread);
            lexicon_vars.$lexicon_lookup_mt$.bind(mt_relevance_macros.$mt$.getDynamicValue(thread), thread);
            pph_vars.$pph_language_mt$.bind(mt_relevance_macros.$mt$.getDynamicValue(thread), thread);
            pph_vars.$pph_domain_mt$.bind(mt_relevance_macros.$mt$.getDynamicValue(thread), thread);
            pph_vars.$pph_demerit_cutoff$.bind(ZERO_INTEGER, thread);
            return all_phrases_for_term(v_term, nl_preds, $list67, $TEXT, NIL, lexical_onlyP, UNPROVIDED, UNPROVIDED);
        } finally {
            pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_7, thread);
            pph_vars.$pph_domain_mt$.rebind(_prev_bind_6, thread);
            pph_vars.$pph_language_mt$.rebind(_prev_bind_5, thread);
            lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_4, thread);
            pph_vars.$pph_allow_word_form_coercionP$.rebind(_prev_bind_3, thread);
            pph_vars.$pph_use_rdfP$.rebind(_prev_bind_2, thread);
            pph_vars.$pph_alternative_phrase_generation_level$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject hl_justify_string_for_term(final SubLObject v_term, final SubLObject string, SubLObject nl_preds, SubLObject lexical_onlyP) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = $ALL;
        }
        if (lexical_onlyP == UNPROVIDED) {
            lexical_onlyP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = pph_vars.$pph_paraphrase_to_justify$.currentBinding(thread);
        try {
            pph_vars.$pph_paraphrase_to_justify$.bind(list(v_term, string, nl_preds == $ALL ? $ANY : nl_preds), thread);
            try {
                thread.throwStack.push($PPH_HL_SUPPORTS_FOUND);
                inference_strings_for_term_int(v_term, nl_preds, lexical_onlyP, UNPROVIDED);
            } catch (final Throwable ccatch_env_var) {
                result = Errors.handleThrowable(ccatch_env_var, $PPH_HL_SUPPORTS_FOUND);
            } finally {
                thread.throwStack.pop();
            }
        } finally {
            pph_vars.$pph_paraphrase_to_justify$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject all_phrases_for_term(SubLObject v_term, SubLObject include_preds, SubLObject abbrev_types, SubLObject mode, SubLObject the_filter, SubLObject asserted_onlyP, SubLObject strip_initial_words, SubLObject max_number) {
        if (include_preds == UNPROVIDED) {
            include_preds = $ALL;
        }
        if (abbrev_types == UNPROVIDED) {
            abbrev_types = NIL;
        }
        if (mode == UNPROVIDED) {
            mode = $TEXT;
        }
        if (the_filter == UNPROVIDED) {
            the_filter = NIL;
        }
        if (asserted_onlyP == UNPROVIDED) {
            asserted_onlyP = NIL;
        }
        if (strip_initial_words == UNPROVIDED) {
            strip_initial_words = NIL;
        }
        if (max_number == UNPROVIDED) {
            max_number = number_utilities.positive_infinity();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (include_preds != $ALL) {
            final SubLObject list_var = include_preds;
            assert NIL != list_utilities.non_dotted_list_p(list_var) : "list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) " + list_var;
            SubLObject cdolist_list_var = list_var;
            SubLObject elem = NIL;
            elem = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                assert NIL != forts.fort_p(elem) : "forts.fort_p(elem) " + "CommonSymbols.NIL != forts.fort_p(elem) " + elem;
                cdolist_list_var = cdolist_list_var.rest();
                elem = cdolist_list_var.first();
            } 
        }
        v_term = narts_high.nart_substitute(v_term);
        SubLObject ans = NIL;
        SubLObject must_genlP = NIL;
        SubLObject must_genlpredsP = NIL;
        SubLObject error_message = NIL;
        SubLObject _prev_bind_0 = Errors.$continue_cerrorP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_error.$pph_error_handling_onP$.currentBinding(thread);
        try {
            Errors.$continue_cerrorP$.bind(NIL, thread);
            pph_error.$pph_error_handling_onP$.bind(T, thread);
            if (NIL != pph_error.pph_break_on_errorP()) {
                if (NIL != pph_utilities.pph_speech_partP(the_filter)) {
                    must_genlP = T;
                } else
                    if ((NIL != the_filter) && (NIL != pph_utilities.pph_isaP(the_filter, $const71$CollectionLexificationPredicate_R, UNPROVIDED))) {
                        must_genlpredsP = T;
                    } else
                        if (NIL != the_filter) {
                            if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ZERO_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
                                Errors.warn($str72$ALL_PHRASES_FOR_TERM_doesn_t_know, the_filter);
                                force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                            }
                            the_filter = NIL;
                        }


                final SubLObject nl_preds = (include_preds.isList()) ? include_preds : $ANY;
                final SubLObject _prev_bind_0_$18 = pph_vars.$pph_language_mt$.currentBinding(thread);
                try {
                    pph_vars.$pph_language_mt$.bind(pph_utilities.pph_canonicalize_hlmt(list($$MtUnionFn, pph_vars.$pph_language_mt$.getDynamicValue(thread), lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread))), thread);
                    if (NIL != indexed_term_p(v_term)) {
                        final SubLObject _prev_bind_0_$19 = lexicon_vars.$use_lexical_abbreviationsP$.currentBinding(thread);
                        try {
                            lexicon_vars.$use_lexical_abbreviationsP$.bind(find($ABBREVS, abbrev_types, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                            final SubLObject all_namestring_preds = cons($$scientificName, cconcatenate(pph_methods.pph_term_string_preds(UNPROVIDED), pph_methods.pph_name_string_preds(UNPROVIDED)));
                            SubLObject lex_preds = (include_preds == $ALL) ? cconcatenate(pph_lexification_preds(), all_namestring_preds) : cconcatenate(pph_lexification_preds(), list_utilities.remove_if_not($sym76$PPH_NAME_STRING_PRED_, nl_preds, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                            if (NIL != find($ACRONYMS, abbrev_types, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                final SubLObject items_var = genl_predicates.all_spec_preds($$acronymString, UNPROVIDED, UNPROVIDED);
                                if (items_var.isVector()) {
                                    final SubLObject vector_var = items_var;
                                    final SubLObject backwardP_var = NIL;
                                    SubLObject length;
                                    SubLObject v_iteration;
                                    SubLObject element_num;
                                    SubLObject item;
                                    for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                        element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                        item = aref(vector_var, element_num);
                                        lex_preds = cons(item, lex_preds);
                                    }
                                } else {
                                    SubLObject cdolist_list_var2 = items_var;
                                    SubLObject item2 = NIL;
                                    item2 = cdolist_list_var2.first();
                                    while (NIL != cdolist_list_var2) {
                                        lex_preds = cons(item2, lex_preds);
                                        cdolist_list_var2 = cdolist_list_var2.rest();
                                        item2 = cdolist_list_var2.first();
                                    } 
                                }
                            } else {
                                lex_preds = delete($$acronymString, lex_preds, $sym79$PPH_SPEC_PREDICATE_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                            if (NIL != find($ABBREVS, abbrev_types, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                lex_preds = cons($$abbreviationString_PN, lex_preds);
                            } else {
                                lex_preds = delete($$abbreviationString_PN, lex_preds, $sym79$PPH_SPEC_PREDICATE_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                            SubLObject cdolist_list_var3 = pph_lexifications_for_term(v_term, lex_preds, UNPROVIDED);
                            SubLObject lexical_assertion = NIL;
                            lexical_assertion = cdolist_list_var3.first();
                            while (NIL != cdolist_list_var3) {
                                if (((((NIL == must_genlP) || (NIL != pph_utilities.pph_pos_of_denotationP(assertions_high.assertion_formula(lexical_assertion), the_filter))) && ((NIL == must_genlpredsP) || cycl_utilities.formula_arg0(assertions_high.assertion_formula(lexical_assertion)).equalp(the_filter))) && ((NIL != find($ACRONYMS, abbrev_types, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) || (NIL == pph_utilities.pph_genl_predicateP(cycl_utilities.formula_arg0(assertions_high.assertion_formula(lexical_assertion)), $$acronymString, UNPROVIDED)))) && ((NIL != find($ABBREVS, abbrev_types, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) || (NIL == pph_utilities.pph_genl_predicateP(cycl_utilities.formula_arg0(assertions_high.assertion_formula(lexical_assertion)), $$abbreviationString_PN, UNPROVIDED)))) {
                                    SubLObject cdolist_list_var_$20 = generate_phrases_from_as(lexical_assertion, v_term, nl_preds, NIL, mode);
                                    SubLObject string = NIL;
                                    string = cdolist_list_var_$20.first();
                                    while (NIL != cdolist_list_var_$20) {
                                        final SubLObject item_var = string;
                                        if (NIL == member(item_var, ans, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                            ans = cons(item_var, ans);
                                        }
                                        cdolist_list_var_$20 = cdolist_list_var_$20.rest();
                                        string = cdolist_list_var_$20.first();
                                    } 
                                }
                                cdolist_list_var3 = cdolist_list_var3.rest();
                                lexical_assertion = cdolist_list_var3.first();
                            } 
                            if ((NIL != pph_methods_rdf.pph_use_rdfP()) && (NIL != member($const81$rdfs_label, lex_preds, UNPROVIDED, UNPROVIDED))) {
                                cdolist_list_var3 = pph_methods_rdf.pph_rdf_labels_for_term(v_term, UNPROVIDED);
                                SubLObject label = NIL;
                                label = cdolist_list_var3.first();
                                while (NIL != cdolist_list_var3) {
                                    if (label.isString()) {
                                        final SubLObject item_var2 = label;
                                        if (NIL == member(item_var2, ans, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                            ans = cons(item_var2, ans);
                                        }
                                    }
                                    cdolist_list_var3 = cdolist_list_var3.rest();
                                    label = cdolist_list_var3.first();
                                } 
                            }
                        } finally {
                            lexicon_vars.$use_lexical_abbreviationsP$.rebind(_prev_bind_0_$19, thread);
                        }
                    }
                    if (NIL == asserted_onlyP) {
                        final SubLObject _prev_bind_0_$20 = pph_vars.$pph_demerit_cutoff$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$22 = pph_vars.$pph_language_mt$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = pph_vars.$paraphrase_mode$.currentBinding(thread);
                        try {
                            pph_vars.$pph_demerit_cutoff$.bind(pph_macros.compute_new_pph_demerit_cutoff(TWO_INTEGER), thread);
                            pph_vars.$pph_language_mt$.bind(pph_utilities.pph_canonicalize_hlmt(list($$MtUnionFn, pph_vars.$pph_language_mt$.getDynamicValue(thread), lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread))), thread);
                            pph_vars.$paraphrase_mode$.bind(mode, thread);
                            final SubLObject nl_preds_$23 = (include_preds.isList()) ? include_preds : $ANY;
                            final SubLObject old_grace_period = delayed_processor.delayed_processor_get_delay_seconds(pph_phrase.pph_phrase_destroyer());
                            pph_phrase.set_pph_phrase_destruction_grace_period(max(old_grace_period, $int$30));
                            final SubLObject _prev_bind_0_$21 = pph_vars.$bypass_pph_phrase_destroyerP$.currentBinding(thread);
                            try {
                                pph_vars.$bypass_pph_phrase_destroyerP$.bind(NIL, thread);
                                thread.resetMultipleValues();
                                final SubLObject generated_phrase = pph_main.generate_phrase_no_checks(v_term, nl_preds_$23, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                final SubLObject pred = thread.secondMultipleValue();
                                final SubLObject just = thread.thirdMultipleValue();
                                final SubLObject olist = thread.fourthMultipleValue();
                                final SubLObject demerits = thread.fifthMultipleValue();
                                final SubLObject phrase = thread.sixthMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                    format_nil.force_format(T, $str83$__Done_with__S_All_strings___S__, phrase, pph_phrase.pph_phrase_all_strings(phrase, T), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                                if ((generated_phrase.isString() && ((NIL != find($ACRONYMS, abbrev_types, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) || (NIL == pph_utilities.pph_genl_predicateP(pred, $$acronymString, UNPROVIDED)))) && ((NIL != find($ABBREVS, abbrev_types, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) || (NIL == pph_utilities.pph_genl_predicateP(pred, $$abbreviationString_PN, UNPROVIDED)))) {
                                    ans = cons(generated_phrase, remove(generated_phrase, ans, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                                    if (NIL != phrase) {
                                        SubLObject cdolist_list_var4 = pph_phrase.pph_phrase_all_strings(phrase, T);
                                        SubLObject alt_string = NIL;
                                        alt_string = cdolist_list_var4.first();
                                        while (NIL != cdolist_list_var4) {
                                            if (NIL == subl_promotions.memberP(alt_string, ans, symbol_function(EQUAL), UNPROVIDED)) {
                                                ans = list_utilities.add_to_end(alt_string, ans);
                                            }
                                            cdolist_list_var4 = cdolist_list_var4.rest();
                                            alt_string = cdolist_list_var4.first();
                                        } 
                                    }
                                }
                            } finally {
                                pph_vars.$bypass_pph_phrase_destroyerP$.rebind(_prev_bind_0_$21, thread);
                            }
                            pph_phrase.set_pph_phrase_destruction_grace_period(old_grace_period);
                        } finally {
                            pph_vars.$paraphrase_mode$.rebind(_prev_bind_3, thread);
                            pph_vars.$pph_language_mt$.rebind(_prev_bind_1_$22, thread);
                            pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_0_$20, thread);
                        }
                    }
                    if ((NIL == asserted_onlyP) && (NIL != cycl_grammar.cycl_nat_p(v_term))) {
                        final SubLObject fn = cycl_utilities.nat_functor(v_term);
                        if ((NIL != fn) && (NIL != valid_constantP($$resultNamedByArg, UNPROVIDED))) {
                            SubLObject cdolist_list_var5 = pph_utilities.pph_ask_variable_new($sym85$_ARG, listS($$resultNamedByArg, fn, $list86), UNPROVIDED, UNPROVIDED);
                            SubLObject arg = NIL;
                            arg = cdolist_list_var5.first();
                            while (NIL != cdolist_list_var5) {
                                final SubLObject name = cycl_utilities.nat_arg(v_term, arg, UNPROVIDED);
                                if (name.isString()) {
                                    final SubLObject item_var3 = name;
                                    if (NIL == member(item_var3, ans, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                        ans = cons(item_var3, ans);
                                    }
                                }
                                cdolist_list_var5 = cdolist_list_var5.rest();
                                arg = cdolist_list_var5.first();
                            } 
                        }
                    }
                    if (NIL != strip_initial_words) {
                        SubLObject stripped_phrases = NIL;
                        SubLObject cdolist_list_var5 = strip_initial_words;
                        SubLObject initial_word = NIL;
                        initial_word = cdolist_list_var5.first();
                        while (NIL != cdolist_list_var5) {
                            stripped_phrases = nunion(stripped_phrases, strip_initial_word(ans, initial_word), UNPROVIDED, UNPROVIDED);
                            cdolist_list_var5 = cdolist_list_var5.rest();
                            initial_word = cdolist_list_var5.first();
                        } 
                        ans = nunion(ans, stripped_phrases, UNPROVIDED, UNPROVIDED);
                    }
                    if ((NIL == asserted_onlyP) && (NIL != el_formula_p(cycl_utilities.hl_to_el(v_term)))) {
                        final SubLObject _prev_bind_0_$22 = pph_vars.$paraphrase_mode$.currentBinding(thread);
                        try {
                            pph_vars.$paraphrase_mode$.bind(mode, thread);
                            SubLObject cdolist_list_var5 = all_phrases_for_formula(cycl_utilities.hl_to_el(v_term), pph_vars.$pph_language_mt$.getDynamicValue(thread), nl_preds, pph_vars.pph_generate_morphological_alternativesP(), max_number);
                            SubLObject phrase2 = NIL;
                            phrase2 = cdolist_list_var5.first();
                            while (NIL != cdolist_list_var5) {
                                final SubLObject item_var4 = phrase2;
                                if (NIL == member(item_var4, ans, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                    ans = cons(item_var4, ans);
                                }
                                cdolist_list_var5 = cdolist_list_var5.rest();
                                phrase2 = cdolist_list_var5.first();
                            } 
                        } finally {
                            pph_vars.$paraphrase_mode$.rebind(_prev_bind_0_$22, thread);
                        }
                    }
                } finally {
                    pph_vars.$pph_language_mt$.rebind(_prev_bind_0_$18, thread);
                }
            } else {
                try {
                    thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0_$23 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            if (NIL != pph_utilities.pph_speech_partP(the_filter)) {
                                must_genlP = T;
                            } else
                                if ((NIL != the_filter) && (NIL != pph_utilities.pph_isaP(the_filter, $const71$CollectionLexificationPredicate_R, UNPROVIDED))) {
                                    must_genlpredsP = T;
                                } else
                                    if (NIL != the_filter) {
                                        if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ZERO_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
                                            Errors.warn($str72$ALL_PHRASES_FOR_TERM_doesn_t_know, the_filter);
                                            force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                                        }
                                        the_filter = NIL;
                                    }


                            final SubLObject nl_preds2 = (include_preds.isList()) ? include_preds : $ANY;
                            final SubLObject _prev_bind_0_$24 = pph_vars.$pph_language_mt$.currentBinding(thread);
                            try {
                                pph_vars.$pph_language_mt$.bind(pph_utilities.pph_canonicalize_hlmt(list($$MtUnionFn, pph_vars.$pph_language_mt$.getDynamicValue(thread), lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread))), thread);
                                if (NIL != indexed_term_p(v_term)) {
                                    final SubLObject _prev_bind_0_$25 = lexicon_vars.$use_lexical_abbreviationsP$.currentBinding(thread);
                                    try {
                                        lexicon_vars.$use_lexical_abbreviationsP$.bind(find($ABBREVS, abbrev_types, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                                        final SubLObject all_namestring_preds2 = cons($$scientificName, cconcatenate(pph_methods.pph_term_string_preds(UNPROVIDED), pph_methods.pph_name_string_preds(UNPROVIDED)));
                                        SubLObject lex_preds2 = (include_preds == $ALL) ? cconcatenate(pph_lexification_preds(), all_namestring_preds2) : cconcatenate(pph_lexification_preds(), list_utilities.remove_if_not($sym76$PPH_NAME_STRING_PRED_, nl_preds2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                                        if (NIL != find($ACRONYMS, abbrev_types, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                            final SubLObject items_var2 = genl_predicates.all_spec_preds($$acronymString, UNPROVIDED, UNPROVIDED);
                                            if (items_var2.isVector()) {
                                                final SubLObject vector_var2 = items_var2;
                                                final SubLObject backwardP_var2 = NIL;
                                                SubLObject length2;
                                                SubLObject v_iteration2;
                                                SubLObject element_num2;
                                                SubLObject item3;
                                                for (length2 = length(vector_var2), v_iteration2 = NIL, v_iteration2 = ZERO_INTEGER; v_iteration2.numL(length2); v_iteration2 = add(v_iteration2, ONE_INTEGER)) {
                                                    element_num2 = (NIL != backwardP_var2) ? subtract(length2, v_iteration2, ONE_INTEGER) : v_iteration2;
                                                    item3 = aref(vector_var2, element_num2);
                                                    lex_preds2 = cons(item3, lex_preds2);
                                                }
                                            } else {
                                                SubLObject cdolist_list_var6 = items_var2;
                                                SubLObject item4 = NIL;
                                                item4 = cdolist_list_var6.first();
                                                while (NIL != cdolist_list_var6) {
                                                    lex_preds2 = cons(item4, lex_preds2);
                                                    cdolist_list_var6 = cdolist_list_var6.rest();
                                                    item4 = cdolist_list_var6.first();
                                                } 
                                            }
                                        } else {
                                            lex_preds2 = delete($$acronymString, lex_preds2, $sym79$PPH_SPEC_PREDICATE_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        }
                                        if (NIL != find($ABBREVS, abbrev_types, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                            lex_preds2 = cons($$abbreviationString_PN, lex_preds2);
                                        } else {
                                            lex_preds2 = delete($$abbreviationString_PN, lex_preds2, $sym79$PPH_SPEC_PREDICATE_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        }
                                        SubLObject cdolist_list_var2 = pph_lexifications_for_term(v_term, lex_preds2, UNPROVIDED);
                                        SubLObject lexical_assertion2 = NIL;
                                        lexical_assertion2 = cdolist_list_var2.first();
                                        while (NIL != cdolist_list_var2) {
                                            if (((((NIL == must_genlP) || (NIL != pph_utilities.pph_pos_of_denotationP(assertions_high.assertion_formula(lexical_assertion2), the_filter))) && ((NIL == must_genlpredsP) || cycl_utilities.formula_arg0(assertions_high.assertion_formula(lexical_assertion2)).equalp(the_filter))) && ((NIL != find($ACRONYMS, abbrev_types, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) || (NIL == pph_utilities.pph_genl_predicateP(cycl_utilities.formula_arg0(assertions_high.assertion_formula(lexical_assertion2)), $$acronymString, UNPROVIDED)))) && ((NIL != find($ABBREVS, abbrev_types, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) || (NIL == pph_utilities.pph_genl_predicateP(cycl_utilities.formula_arg0(assertions_high.assertion_formula(lexical_assertion2)), $$abbreviationString_PN, UNPROVIDED)))) {
                                                SubLObject cdolist_list_var_$21 = generate_phrases_from_as(lexical_assertion2, v_term, nl_preds2, NIL, mode);
                                                SubLObject string2 = NIL;
                                                string2 = cdolist_list_var_$21.first();
                                                while (NIL != cdolist_list_var_$21) {
                                                    final SubLObject item_var5 = string2;
                                                    if (NIL == member(item_var5, ans, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                        ans = cons(item_var5, ans);
                                                    }
                                                    cdolist_list_var_$21 = cdolist_list_var_$21.rest();
                                                    string2 = cdolist_list_var_$21.first();
                                                } 
                                            }
                                            cdolist_list_var2 = cdolist_list_var2.rest();
                                            lexical_assertion2 = cdolist_list_var2.first();
                                        } 
                                        if ((NIL != pph_methods_rdf.pph_use_rdfP()) && (NIL != member($const81$rdfs_label, lex_preds2, UNPROVIDED, UNPROVIDED))) {
                                            cdolist_list_var2 = pph_methods_rdf.pph_rdf_labels_for_term(v_term, UNPROVIDED);
                                            SubLObject label2 = NIL;
                                            label2 = cdolist_list_var2.first();
                                            while (NIL != cdolist_list_var2) {
                                                if (label2.isString()) {
                                                    final SubLObject item_var6 = label2;
                                                    if (NIL == member(item_var6, ans, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                        ans = cons(item_var6, ans);
                                                    }
                                                }
                                                cdolist_list_var2 = cdolist_list_var2.rest();
                                                label2 = cdolist_list_var2.first();
                                            } 
                                        }
                                    } finally {
                                        lexicon_vars.$use_lexical_abbreviationsP$.rebind(_prev_bind_0_$25, thread);
                                    }
                                }
                                if (NIL == asserted_onlyP) {
                                    final SubLObject _prev_bind_0_$26 = pph_vars.$pph_demerit_cutoff$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$23 = pph_vars.$pph_language_mt$.currentBinding(thread);
                                    final SubLObject _prev_bind_4 = pph_vars.$paraphrase_mode$.currentBinding(thread);
                                    try {
                                        pph_vars.$pph_demerit_cutoff$.bind(pph_macros.compute_new_pph_demerit_cutoff(TWO_INTEGER), thread);
                                        pph_vars.$pph_language_mt$.bind(pph_utilities.pph_canonicalize_hlmt(list($$MtUnionFn, pph_vars.$pph_language_mt$.getDynamicValue(thread), lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread))), thread);
                                        pph_vars.$paraphrase_mode$.bind(mode, thread);
                                        final SubLObject nl_preds_$24 = (include_preds.isList()) ? include_preds : $ANY;
                                        final SubLObject old_grace_period2 = delayed_processor.delayed_processor_get_delay_seconds(pph_phrase.pph_phrase_destroyer());
                                        pph_phrase.set_pph_phrase_destruction_grace_period(max(old_grace_period2, $int$30));
                                        final SubLObject _prev_bind_0_$27 = pph_vars.$bypass_pph_phrase_destroyerP$.currentBinding(thread);
                                        try {
                                            pph_vars.$bypass_pph_phrase_destroyerP$.bind(NIL, thread);
                                            thread.resetMultipleValues();
                                            final SubLObject generated_phrase2 = pph_main.generate_phrase_no_checks(v_term, nl_preds_$24, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            final SubLObject pred2 = thread.secondMultipleValue();
                                            final SubLObject just2 = thread.thirdMultipleValue();
                                            final SubLObject olist2 = thread.fourthMultipleValue();
                                            final SubLObject demerits2 = thread.fifthMultipleValue();
                                            final SubLObject phrase3 = thread.sixthMultipleValue();
                                            thread.resetMultipleValues();
                                            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                                format_nil.force_format(T, $str83$__Done_with__S_All_strings___S__, phrase3, pph_phrase.pph_phrase_all_strings(phrase3, T), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            }
                                            if ((generated_phrase2.isString() && ((NIL != find($ACRONYMS, abbrev_types, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) || (NIL == pph_utilities.pph_genl_predicateP(pred2, $$acronymString, UNPROVIDED)))) && ((NIL != find($ABBREVS, abbrev_types, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) || (NIL == pph_utilities.pph_genl_predicateP(pred2, $$abbreviationString_PN, UNPROVIDED)))) {
                                                ans = cons(generated_phrase2, remove(generated_phrase2, ans, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                                                if (NIL != phrase3) {
                                                    SubLObject cdolist_list_var7 = pph_phrase.pph_phrase_all_strings(phrase3, T);
                                                    SubLObject alt_string2 = NIL;
                                                    alt_string2 = cdolist_list_var7.first();
                                                    while (NIL != cdolist_list_var7) {
                                                        if (NIL == subl_promotions.memberP(alt_string2, ans, symbol_function(EQUAL), UNPROVIDED)) {
                                                            ans = list_utilities.add_to_end(alt_string2, ans);
                                                        }
                                                        cdolist_list_var7 = cdolist_list_var7.rest();
                                                        alt_string2 = cdolist_list_var7.first();
                                                    } 
                                                }
                                            }
                                        } finally {
                                            pph_vars.$bypass_pph_phrase_destroyerP$.rebind(_prev_bind_0_$27, thread);
                                        }
                                        pph_phrase.set_pph_phrase_destruction_grace_period(old_grace_period2);
                                    } finally {
                                        pph_vars.$paraphrase_mode$.rebind(_prev_bind_4, thread);
                                        pph_vars.$pph_language_mt$.rebind(_prev_bind_1_$23, thread);
                                        pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_0_$26, thread);
                                    }
                                }
                                if ((NIL == asserted_onlyP) && (NIL != cycl_grammar.cycl_nat_p(v_term))) {
                                    final SubLObject fn2 = cycl_utilities.nat_functor(v_term);
                                    if ((NIL != fn2) && (NIL != valid_constantP($$resultNamedByArg, UNPROVIDED))) {
                                        SubLObject cdolist_list_var8 = pph_utilities.pph_ask_variable_new($sym85$_ARG, listS($$resultNamedByArg, fn2, $list86), UNPROVIDED, UNPROVIDED);
                                        SubLObject arg2 = NIL;
                                        arg2 = cdolist_list_var8.first();
                                        while (NIL != cdolist_list_var8) {
                                            final SubLObject name2 = cycl_utilities.nat_arg(v_term, arg2, UNPROVIDED);
                                            if (name2.isString()) {
                                                final SubLObject item_var2 = name2;
                                                if (NIL == member(item_var2, ans, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                    ans = cons(item_var2, ans);
                                                }
                                            }
                                            cdolist_list_var8 = cdolist_list_var8.rest();
                                            arg2 = cdolist_list_var8.first();
                                        } 
                                    }
                                }
                                if (NIL != strip_initial_words) {
                                    SubLObject stripped_phrases2 = NIL;
                                    SubLObject cdolist_list_var8 = strip_initial_words;
                                    SubLObject initial_word2 = NIL;
                                    initial_word2 = cdolist_list_var8.first();
                                    while (NIL != cdolist_list_var8) {
                                        stripped_phrases2 = nunion(stripped_phrases2, strip_initial_word(ans, initial_word2), UNPROVIDED, UNPROVIDED);
                                        cdolist_list_var8 = cdolist_list_var8.rest();
                                        initial_word2 = cdolist_list_var8.first();
                                    } 
                                    ans = nunion(ans, stripped_phrases2, UNPROVIDED, UNPROVIDED);
                                }
                                if ((NIL == asserted_onlyP) && (NIL != el_formula_p(cycl_utilities.hl_to_el(v_term)))) {
                                    final SubLObject _prev_bind_0_$28 = pph_vars.$paraphrase_mode$.currentBinding(thread);
                                    try {
                                        pph_vars.$paraphrase_mode$.bind(mode, thread);
                                        SubLObject cdolist_list_var8 = all_phrases_for_formula(cycl_utilities.hl_to_el(v_term), pph_vars.$pph_language_mt$.getDynamicValue(thread), nl_preds2, pph_vars.pph_generate_morphological_alternativesP(), max_number);
                                        SubLObject phrase4 = NIL;
                                        phrase4 = cdolist_list_var8.first();
                                        while (NIL != cdolist_list_var8) {
                                            final SubLObject item_var3 = phrase4;
                                            if (NIL == member(item_var3, ans, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                ans = cons(item_var3, ans);
                                            }
                                            cdolist_list_var8 = cdolist_list_var8.rest();
                                            phrase4 = cdolist_list_var8.first();
                                        } 
                                    } finally {
                                        pph_vars.$paraphrase_mode$.rebind(_prev_bind_0_$28, thread);
                                    }
                                }
                            } finally {
                                pph_vars.$pph_language_mt$.rebind(_prev_bind_0_$24, thread);
                            }
                        } catch (final Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        Errors.$error_handler$.rebind(_prev_bind_0_$23, thread);
                    }
                } catch (final Throwable ccatch_env_var) {
                    error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                } finally {
                    thread.throwStack.pop();
                }
                if (error_message.isString() && (NIL == pph_error.suppress_pph_warningsP())) {
                    Errors.warn(cconcatenate(pph_error_message_truncator.truncate_pph_error_message(error_message), $str88$___Top_level_CycL___S), pph_vars.pph_top_level_cycl());
                }
            }
        } finally {
            pph_error.$pph_error_handling_onP$.rebind(_prev_bind_2, thread);
            Errors.$continue_cerrorP$.rebind(_prev_bind_0, thread);
        }
        _prev_bind_0 = pph_vars.$paraphrase_mode$.currentBinding(thread);
        try {
            pph_vars.$paraphrase_mode$.bind(mode, thread);
            final SubLObject non_dupes = delete_duplicates(ans, symbol_function($sym89$PPH_STRING_EQUAL_), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject first_n = (max_number.isInteger()) ? list_utilities.first_n(max_number, non_dupes) : non_dupes;
            return Mapping.mapcar(PPH_STRING_IF_NON_NULL_TO_OUTPUT_FORMAT, first_n);
        } finally {
            pph_vars.$paraphrase_mode$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject all_phrases_for_formula(final SubLObject formula, SubLObject mt, SubLObject agr_preds, SubLObject allow_morphological_variantsP, SubLObject max_number) {
        if (mt == UNPROVIDED) {
            mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        if (agr_preds == UNPROVIDED) {
            agr_preds = $ANY;
        }
        if (allow_morphological_variantsP == UNPROVIDED) {
            allow_morphological_variantsP = pph_vars.pph_generate_morphological_alternativesP();
        }
        if (max_number == UNPROVIDED) {
            max_number = number_utilities.positive_infinity();
        }
        assert NIL != el_formula_p(formula) : "el_utilities.el_formula_p(formula) " + "CommonSymbols.NIL != el_utilities.el_formula_p(formula) " + formula;
        assert NIL != fort_types_interface.isa_mtP(mt, UNPROVIDED) : "fort_types_interface.isa_mtP(mt, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != fort_types_interface.isa_mtP(mt, CommonSymbols.UNPROVIDED) " + mt;
        return all_phrases_for_formula_int(formula, mt, agr_preds, allow_morphological_variantsP, max_number);
    }

    public static SubLObject all_phrases_for_formula_int(final SubLObject formula, final SubLObject mt, final SubLObject agr_preds, final SubLObject allow_morphological_variantsP, final SubLObject max_number) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = pph_vars.$pph_demerit_cutoff$.currentBinding(thread);
        try {
            pph_vars.$pph_demerit_cutoff$.bind(pph_macros.compute_new_pph_demerit_cutoff(TWO_INTEGER), thread);
            final SubLObject exploded = pph_string_combo.explode_pph_string_combo(pph_main.generate_pph_string_combo_for_term(formula, agr_preds, mt, mt, allow_morphological_variantsP, T, $NONE), max_number);
            return max_number.isInteger() ? list_utilities.first_n(max_number, exploded) : exploded;
        } finally {
            pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject names_for_term(final SubLObject v_term, SubLObject string_pred, SubLObject lookup_mt, SubLObject first_onlyP) {
        if (string_pred == UNPROVIDED) {
            string_pred = $$termStrings;
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (first_onlyP == UNPROVIDED) {
            first_onlyP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != misc_kb_utilities.instance_named_fn_expression_p(v_term)) {
            return list(cycl_utilities.formula_arg1(v_term, UNPROVIDED));
        }
        SubLObject names = NIL;
        SubLObject preds = NIL;
        SubLObject doneP = NIL;
        if (NIL != lexicon_vars.name_or_term_strings_predP(string_pred)) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(lookup_mt);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                if (NIL == doneP) {
                    final SubLObject node_var = string_pred;
                    final SubLObject deck_type = $QUEUE;
                    final SubLObject recur_deck = deck.create_deck(deck_type);
                    SubLObject node_and_predicate_mode = NIL;
                    final SubLObject _prev_bind_0_$35 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            final SubLObject mt_var_$36 = lookup_mt;
                            final SubLObject _prev_bind_0_$36 = mt_relevance_macros.$mt$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$38 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$39 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var_$36), thread);
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var_$36), thread);
                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var_$36), thread);
                                final SubLObject tv_var = $$True_JustificationTruth;
                                final SubLObject _prev_bind_0_$37 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$39 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                    if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                        if (pcase_var.eql($ERROR)) {
                                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str101$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } else
                                            if (pcase_var.eql($CERROR)) {
                                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str101$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            } else
                                                if (pcase_var.eql($WARN)) {
                                                    Errors.warn($str101$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                } else {
                                                    Errors.warn($str106$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                    Errors.cerror($$$continue_anyway, $str101$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                }


                                    }
                                    final SubLObject _prev_bind_0_$38 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$40 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$40 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                    final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                        if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(string_pred, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                            final SubLObject _prev_bind_0_$39 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$41 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                            final SubLObject _prev_bind_2_$41 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                                for (node_and_predicate_mode = list(string_pred, sbhl_search_vars.genl_inverse_mode_p()); (NIL != node_and_predicate_mode) && (NIL == doneP); node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                                    final SubLObject node_var_$48 = node_and_predicate_mode.first();
                                                    final SubLObject predicate_mode = second(node_and_predicate_mode);
                                                    final SubLObject spec_string_pred = node_var_$48;
                                                    final SubLObject _prev_bind_0_$40 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                        if ((NIL != sbhl_search_utilities.apply_sbhl_add_node_test(sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_$48)) && (NIL == doneP)) {
                                                            SubLObject csome_list_var = kb_mapping_utilities.pred_values(v_term, spec_string_pred, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            SubLObject name = NIL;
                                                            name = csome_list_var.first();
                                                            while ((NIL == doneP) && (NIL != csome_list_var)) {
                                                                doneP = first_onlyP;
                                                                final SubLObject name_position = position(name, names, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                if (NIL != name_position) {
                                                                    set_nth(name_position, preds, cons(spec_string_pred, nth(name_position, preds)));
                                                                } else {
                                                                    names = cons(name, names);
                                                                    preds = cons(list(spec_string_pred), preds);
                                                                }
                                                                csome_list_var = csome_list_var.rest();
                                                                name = csome_list_var.first();
                                                            } 
                                                        }
                                                        final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlPreds));
                                                        SubLObject rest;
                                                        SubLObject module_var;
                                                        SubLObject _prev_bind_0_$41;
                                                        SubLObject _prev_bind_1_$42;
                                                        SubLObject node;
                                                        SubLObject d_link;
                                                        SubLObject mt_links;
                                                        SubLObject iteration_state;
                                                        SubLObject mt;
                                                        SubLObject tv_links;
                                                        SubLObject _prev_bind_0_$42;
                                                        SubLObject iteration_state_$53;
                                                        SubLObject tv;
                                                        SubLObject link_nodes;
                                                        SubLObject _prev_bind_0_$43;
                                                        SubLObject sol;
                                                        SubLObject set_contents_var;
                                                        SubLObject basis_object;
                                                        SubLObject state;
                                                        SubLObject node_vars_link_node;
                                                        SubLObject csome_list_var2;
                                                        SubLObject node_vars_link_node2;
                                                        SubLObject new_list;
                                                        SubLObject rest_$55;
                                                        SubLObject generating_fn;
                                                        SubLObject _prev_bind_0_$44;
                                                        SubLObject sol2;
                                                        SubLObject link_nodes2;
                                                        SubLObject set_contents_var2;
                                                        SubLObject basis_object2;
                                                        SubLObject state2;
                                                        SubLObject node_vars_link_node3;
                                                        SubLObject csome_list_var3;
                                                        SubLObject node_vars_link_node4;
                                                        for (rest = NIL, rest = accessible_modules; (NIL == doneP) && (NIL != rest); rest = rest.rest()) {
                                                            module_var = rest.first();
                                                            _prev_bind_0_$41 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                            _prev_bind_1_$42 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                            try {
                                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                node = function_terms.naut_to_nart(node_var_$48);
                                                                if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                    d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    if (NIL != d_link) {
                                                                        mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                        if (NIL != mt_links) {
                                                                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); (NIL == doneP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                                thread.resetMultipleValues();
                                                                                mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                tv_links = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                    _prev_bind_0_$42 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                        for (iteration_state_$53 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); (NIL == doneP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$53)); iteration_state_$53 = dictionary_contents.do_dictionary_contents_next(iteration_state_$53)) {
                                                                                            thread.resetMultipleValues();
                                                                                            tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$53);
                                                                                            link_nodes = thread.secondMultipleValue();
                                                                                            thread.resetMultipleValues();
                                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                _prev_bind_0_$43 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                try {
                                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                    sol = link_nodes;
                                                                                                    if (NIL != set.set_p(sol)) {
                                                                                                        set_contents_var = set.do_set_internal(sol);
                                                                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == doneP) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                            node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                            }
                                                                                                        }
                                                                                                    } else
                                                                                                        if (sol.isList()) {
                                                                                                            if (NIL == doneP) {
                                                                                                                csome_list_var2 = sol;
                                                                                                                node_vars_link_node2 = NIL;
                                                                                                                node_vars_link_node2 = csome_list_var2.first();
                                                                                                                while ((NIL == doneP) && (NIL != csome_list_var2)) {
                                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                                        deck.deck_push(list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                                    }
                                                                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                                                                    node_vars_link_node2 = csome_list_var2.first();
                                                                                                                } 
                                                                                                            }
                                                                                                        } else {
                                                                                                            Errors.error($str108$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                        }

                                                                                                } finally {
                                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$43, thread);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$53);
                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$42, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                        }
                                                                    } else {
                                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str109$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    }
                                                                } else
                                                                    if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                        new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                        for (rest_$55 = NIL, rest_$55 = new_list; (NIL == doneP) && (NIL != rest_$55); rest_$55 = rest_$55.rest()) {
                                                                            generating_fn = rest_$55.first();
                                                                            _prev_bind_0_$44 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                                if (NIL != set.set_p(sol2)) {
                                                                                    set_contents_var2 = set.do_set_internal(sol2);
                                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); (NIL == doneP) && (NIL == set_contents.do_set_contents_doneP(basis_object2, state2)); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                        node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                            deck.deck_push(list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                        }
                                                                                    }
                                                                                } else
                                                                                    if (sol2.isList()) {
                                                                                        if (NIL == doneP) {
                                                                                            csome_list_var3 = sol2;
                                                                                            node_vars_link_node4 = NIL;
                                                                                            node_vars_link_node4 = csome_list_var3.first();
                                                                                            while ((NIL == doneP) && (NIL != csome_list_var3)) {
                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                                    deck.deck_push(list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                }
                                                                                                csome_list_var3 = csome_list_var3.rest();
                                                                                                node_vars_link_node4 = csome_list_var3.first();
                                                                                            } 
                                                                                        }
                                                                                    } else {
                                                                                        Errors.error($str108$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                                    }

                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$44, thread);
                                                                            }
                                                                        }
                                                                    }

                                                            } finally {
                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$42, thread);
                                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$41, thread);
                                                            }
                                                        }
                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$40, thread);
                                                    }
                                                }
                                            } finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$41, thread);
                                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$41, thread);
                                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$39, thread);
                                            }
                                        } else {
                                            sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str110$Node__a_does_not_pass_sbhl_type_t, string_pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        }
                                    } finally {
                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$40, thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$40, thread);
                                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$38, thread);
                                    }
                                } finally {
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$39, thread);
                                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$37, thread);
                                }
                            } finally {
                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_$39, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$38, thread);
                                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$36, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$45 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$45, thread);
                            }
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$35, thread);
                    }
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return values(names, preds);
    }

    public static SubLObject some_name_for_term(final SubLObject v_term, SubLObject string_pred, SubLObject lookup_mt) {
        if (string_pred == UNPROVIDED) {
            string_pred = $$termStrings;
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        return names_for_term(v_term, string_pred, lookup_mt, T).first();
    }

    public static SubLObject pragmatic_attribute_of_denotation(final SubLObject pred, final SubLObject word, final SubLObject pos, final SubLObject sense) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject politeness = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(word, ONE_INTEGER, pred)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(word, ONE_INTEGER, pred);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                            SubLObject done_var_$58 = NIL;
                            final SubLObject token_var_$59 = NIL;
                            while (NIL == done_var_$58) {
                                final SubLObject polite_assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$59);
                                final SubLObject valid_$60 = makeBoolean(!token_var_$59.eql(polite_assertion));
                                if (((NIL != valid_$60) && pos.equal(assertions_high.gaf_arg2(polite_assertion))) && sense.equal(assertions_high.gaf_arg3(polite_assertion))) {
                                    politeness = assertions_high.gaf_arg4(polite_assertion);
                                }
                                done_var_$58 = makeBoolean(NIL == valid_$60);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$61 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$61, thread);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return politeness;
    }

    public static SubLObject inappropriate_word_for_conceptP(final SubLObject word, final SubLObject pos, final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$GeneralEnglishMt;
        }
        if (NIL != lexicon_accessors.vulgar_wordP(word)) {
            return T;
        }
        if (((NIL != indexed_term_p(word)) && (NIL != indexed_term_p(v_term))) && (NIL != kb_mapping_utilities.pred_u_v_holds_in_mt($$denotation, word, v_term, mt, ONE_INTEGER, FOUR_INTEGER, UNPROVIDED))) {
            SubLObject word_senses = NIL;
            SubLObject inappropriateP = NIL;
            word_senses = kb_mapping_utilities.pred_arg_values_in_mt(word, $$denotation, v_term, mt, ONE_INTEGER, FOUR_INTEGER, THREE_INTEGER, UNPROVIDED);
            if (NIL == inappropriateP) {
                SubLObject csome_list_var;
                SubLObject sense;
                for (csome_list_var = word_senses, sense = NIL, sense = csome_list_var.first(); (NIL == inappropriateP) && (NIL != csome_list_var); inappropriateP = makeBoolean((NIL != find(list(PRAGMATIC_ATTRIBUTE_OF_DENOTATION, lexicon_accessors.politeness_of_ws_pred(), word, pos, sense), $list115, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) || (NIL != find(list(PRAGMATIC_ATTRIBUTE_OF_DENOTATION, lexicon_accessors.formality_of_ws_pred(), word, pos, sense), $list116, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) , csome_list_var = csome_list_var.rest() , sense = csome_list_var.first()) {
                }
            }
            return inappropriateP;
        }
        return NIL;
    }

    public static SubLObject preferred_words_for_term(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject fort = function_terms.naut_to_nart(v_term);
        SubLObject ans = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(pph_vars.$pph_language_mt$.getDynamicValue(thread));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject cdolist_list_var;
            final SubLObject assertions = cdolist_list_var = kb_mapping.gather_gaf_arg_index_with_predicate(fort, ONE_INTEGER, $$preferredGenUnit, UNPROVIDED, UNPROVIDED);
            SubLObject ass = NIL;
            ass = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                ans = cons(list(assertions_high.gaf_arg2(ass), assertions_high.gaf_arg3(ass)), ans);
                cdolist_list_var = cdolist_list_var.rest();
                ass = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject pph_first_string_of_wordXspeech_part(final SubLObject word, final SubLObject pos, SubLObject nl_preds, SubLObject mt) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = $ANY;
        }
        if (mt == UNPROVIDED) {
            mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pos != $ANY) {
        }
        if (nl_preds != $ANY) {
        }
        if (NIL == nl_preds) {
            if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
                Errors.warn($$$Empty_NL_preds_list);
                force_output(StreamsLow.$error_output$.getDynamicValue(thread));
            }
            nl_preds = $ANY;
        }
        SubLObject ans_string = NIL;
        SubLObject ans_pred = NIL;
        SubLObject alternative_pairs = NIL;
        SubLObject doneP = NIL;
        final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
        try {
            lexicon_vars.$lexicon_lookup_mt$.bind(mt, thread);
            SubLObject ok_source_preds = (NIL != lexicon_accessors.speech_partP(pos, UNPROVIDED)) ? lexicon_accessors.max_preds_of_pos(pos) : NIL;
            if (NIL == ok_source_preds) {
                ok_source_preds = lexicon_accessors.top_level_nl_preds();
            }
            if (nl_preds.isList()) {
                nl_preds = list_utilities.remove_if_not($sym54$SPEECH_PART_PRED_, remove_duplicates(nl_preds, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL == nl_preds) {
                    nl_preds = ok_source_preds;
                }
                final SubLObject use_liberal_coercionP = NIL;
                if (NIL == doneP) {
                    SubLObject csome_list_var = nl_preds;
                    SubLObject pred = NIL;
                    pred = csome_list_var.first();
                    while ((NIL == doneP) && (NIL != csome_list_var)) {
                        thread.resetMultipleValues();
                        final SubLObject this_string = pph_first_string_of_wordXpred(word, pred, ok_source_preds, mt, use_liberal_coercionP, UNPROVIDED);
                        final SubLObject this_pred = thread.secondMultipleValue();
                        final SubLObject coercion_usedP = thread.thirdMultipleValue();
                        final SubLObject this_alternative_pairs = thread.fourthMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != this_string) {
                            if (!ans_string.isString()) {
                                ans_string = this_string;
                                ans_pred = this_pred;
                                alternative_pairs = this_alternative_pairs;
                                doneP = makeBoolean(NIL == pph_vars.pph_generate_morphological_alternativesP());
                            } else {
                                alternative_pairs = cons(list(this_string, this_pred), append(alternative_pairs, this_alternative_pairs));
                            }
                        }
                        csome_list_var = csome_list_var.rest();
                        pred = csome_list_var.first();
                    } 
                }
                if (!ans_string.isString()) {
                    ok_source_preds = (NIL != lexicon_accessors.speech_partP(pos, UNPROVIDED)) ? lexicon_accessors.max_preds_of_pos(pos) : lexicon_accessors.top_level_nl_preds();
                    if (NIL == ans_string) {
                        SubLObject csome_list_var2 = nl_preds;
                        SubLObject pred2 = NIL;
                        pred2 = csome_list_var2.first();
                        while ((NIL == ans_string) && (NIL != csome_list_var2)) {
                            thread.resetMultipleValues();
                            final SubLObject ans_string_$62 = pph_first_string_of_wordXpred(word, pred2, ok_source_preds, mt, UNPROVIDED, UNPROVIDED);
                            final SubLObject ans_pred_$63 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            ans_string = ans_string_$62;
                            ans_pred = ans_pred_$63;
                            csome_list_var2 = csome_list_var2.rest();
                            pred2 = csome_list_var2.first();
                        } 
                    }
                }
            } else
                if (NIL != lexicon_accessors.speech_partP(pos, UNPROVIDED)) {
                    if (NIL == doneP) {
                        SubLObject csome_list_var2 = pph_get_strings_of_type(word, pos);
                        SubLObject word_string = NIL;
                        word_string = csome_list_var2.first();
                        while ((NIL == doneP) && (NIL != csome_list_var2)) {
                            final SubLObject _prev_bind_0_$64 = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.currentBinding(thread);
                            try {
                                lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.bind($ON, thread);
                                final SubLObject string_preds = (NIL != lexicon_utilities.preds_of_pos(pos, UNPROVIDED)) ? pph_preds_of_stringXword(word_string, word) : $list119;
                                SubLObject ok_string_preds = NIL;
                                SubLObject this_pred2 = NIL;
                                SubLObject this_string2 = NIL;
                                SubLObject cdolist_list_var = string_preds;
                                SubLObject string_pred = NIL;
                                string_pred = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    if (NIL != pph_utilities.pph_filter_preds(list(string_pred), ok_source_preds, UNPROVIDED)) {
                                        ok_string_preds = cons(string_pred, ok_string_preds);
                                    }
                                    cdolist_list_var = cdolist_list_var.rest();
                                    string_pred = cdolist_list_var.first();
                                } 
                                this_pred2 = list_utilities.extremal(list_utilities.delete_subsumed_items(ok_string_preds, $sym120$PPH_GENL_PREDICATE_, UNPROVIDED), $sym121$PPH_PREFER_POS_PRED_, UNPROVIDED);
                                if (NIL != this_pred2) {
                                    this_string2 = word_string;
                                }
                                if ((NIL != this_string2) && (NIL == ans_string)) {
                                    ans_pred = this_pred2;
                                    ans_string = this_string2;
                                    doneP = makeBoolean(NIL == pph_vars.pph_generate_morphological_alternativesP());
                                } else
                                    if (NIL != this_string2) {
                                        final SubLObject item_var = list(this_string2, this_pred2);
                                        if (NIL == member(item_var, alternative_pairs, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                            alternative_pairs = cons(item_var, alternative_pairs);
                                        }
                                    }

                            } finally {
                                lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.rebind(_prev_bind_0_$64, thread);
                            }
                            csome_list_var2 = csome_list_var2.rest();
                            word_string = csome_list_var2.first();
                        } 
                    }
                } else {
                    final SubLObject local_state = pph_macros.find_or_create_pph_external_memoization_state();
                    final SubLObject _prev_bind_0_$65 = memoization_state.$memoization_state$.currentBinding(thread);
                    try {
                        memoization_state.$memoization_state$.bind(local_state, thread);
                        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                        try {
                            thread.resetMultipleValues();
                            final SubLObject ans_string_$63 = lexicon_cache.first_string_of_word_unit(word, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            final SubLObject ans_pred_$64 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            ans_string = ans_string_$63;
                            ans_pred = ans_pred_$64;
                        } finally {
                            final SubLObject _prev_bind_0_$66 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$66, thread);
                            }
                        }
                    } finally {
                        memoization_state.$memoization_state$.rebind(_prev_bind_0_$65, thread);
                    }
                }

        } finally {
            lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
        }
        return values(ans_string, ans_pred, alternative_pairs);
    }

    public static SubLObject pph_prefer_pos_predP(final SubLObject pred1, final SubLObject pred2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject local_state = pph_macros.find_or_create_pph_external_memoization_state();
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                ans = lexicon_cache.prefer_pos_predP(pred1, pred2, pph_vars.$pph_language_mt$.getDynamicValue(thread));
            } finally {
                final SubLObject _prev_bind_0_$69 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$69, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject pph_get_strings_of_type(final SubLObject word, final SubLObject pos) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject strings = NIL;
        final SubLObject local_state = pph_macros.find_or_create_pph_external_memoization_state();
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                strings = lexicon_accessors.get_strings_of_type(word, pos, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } finally {
                final SubLObject _prev_bind_0_$70 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$70, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return strings;
    }

    public static SubLObject pph_preds_of_stringXword(final SubLObject word_string, final SubLObject word) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject preds = NIL;
        final SubLObject local_state = pph_macros.find_or_create_pph_external_memoization_state();
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                preds = lexicon_accessors.preds_of_stringXword(word_string, word, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } finally {
                final SubLObject _prev_bind_0_$71 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$71, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return preds;
    }

    public static SubLObject pph_first_string_of_wordXpred_internal(final SubLObject word, final SubLObject pred, final SubLObject ok_source_preds, SubLObject mt, SubLObject use_liberal_coercionP, SubLObject morph_alternativesP) {
        if (mt == UNPROVIDED) {
            mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        if (use_liberal_coercionP == UNPROVIDED) {
            use_liberal_coercionP = pph_vars.$pph_allow_word_form_coercionP$.getDynamicValue();
        }
        if (morph_alternativesP == UNPROVIDED) {
            morph_alternativesP = pph_vars.pph_generate_morphological_alternativesP();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans_string = NIL;
        SubLObject ans_pred = NIL;
        SubLObject coercedP = NIL;
        SubLObject alternative_pairs = NIL;
        SubLObject doneP = NIL;
        final SubLObject preds_to_try = pph_utilities.pph_filter_preds(list(pred), ok_source_preds, UNPROVIDED);
        if (NIL == doneP) {
            SubLObject csome_list_var = preds_to_try;
            SubLObject pred_to_try = NIL;
            pred_to_try = csome_list_var.first();
            while ((NIL == doneP) && (NIL != csome_list_var)) {
                if (NIL != morph_alternativesP) {
                    thread.resetMultipleValues();
                    final SubLObject strings = lexicon_cache.strings_of_wordXpred(word, pred_to_try, UNPROVIDED);
                    final SubLObject preds = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    SubLObject string = NIL;
                    SubLObject string_$72 = NIL;
                    SubLObject pred_$73 = NIL;
                    SubLObject pred_$74 = NIL;
                    string = strings;
                    string_$72 = string.first();
                    pred_$73 = preds;
                    pred_$74 = pred_$73.first();
                    while ((NIL != pred_$73) || (NIL != string)) {
                        if ((NIL != pred_$74) && (NIL == subl_promotions.memberP(pred_$74, ok_source_preds, $sym123$PPH_GENL_POS_PRED_, UNPROVIDED))) {
                            if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
                                Errors.warn($str124$Bad_pred___S, pred_$74);
                                force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                            }
                        } else
                            if (ans_string.isString()) {
                                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                    format_nil.force_format(T, $str125$__Found_alternative___S__S__, string_$72, pred_$74, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                                alternative_pairs = cons(list(string_$72, pred_$74), alternative_pairs);
                            } else {
                                ans_string = string_$72;
                                ans_pred = pred_$74;
                            }

                        string = string.rest();
                        string_$72 = string.first();
                        pred_$73 = pred_$73.rest();
                        pred_$74 = pred_$73.first();
                    } 
                } else {
                    final SubLObject local_state = pph_macros.find_or_create_pph_external_memoization_state();
                    final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
                    try {
                        memoization_state.$memoization_state$.bind(local_state, thread);
                        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                        try {
                            thread.resetMultipleValues();
                            final SubLObject ans_string_$75 = lexicon_cache.first_string_of_wordXpred(word, pred_to_try, mt);
                            final SubLObject ans_pred_$76 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            ans_string = ans_string_$75;
                            ans_pred = ans_pred_$76;
                        } finally {
                            final SubLObject _prev_bind_0_$77 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$77, thread);
                            }
                        }
                    } finally {
                        memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
                    }
                    if ((NIL != ans_pred) && (NIL == member(ans_pred, ok_source_preds, $sym123$PPH_GENL_POS_PRED_, UNPROVIDED))) {
                        ans_string = NIL;
                        ans_pred = NIL;
                    }
                    doneP = stringp(ans_string);
                }
                csome_list_var = csome_list_var.rest();
                pred_to_try = csome_list_var.first();
            } 
        }
        if (NIL == ans_string) {
            thread.resetMultipleValues();
            final SubLObject ans_string_$76 = pph_first_coerced_string_of_wordXpred(word, pred, ok_source_preds, mt, use_liberal_coercionP);
            final SubLObject ans_pred_$77 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            ans_string = ans_string_$76;
            ans_pred = ans_pred_$77;
            if (ans_string.isString()) {
                coercedP = T;
            }
        }
        if (NIL != unicode_strings.non_ascii_string_p(ans_string)) {
            ans_string = pph_string.pph_string_from_utf8_string(ans_string);
        }
        alternative_pairs = transform_list_utilities.transform(alternative_pairs, NON_ASCII_STRING_P, PPH_STRING_FROM_UTF8_STRING, UNPROVIDED);
        return values(ans_string, ans_pred, coercedP, alternative_pairs);
    }

    public static SubLObject pph_first_string_of_wordXpred(final SubLObject word, final SubLObject pred, final SubLObject ok_source_preds, SubLObject mt, SubLObject use_liberal_coercionP, SubLObject morph_alternativesP) {
        if (mt == UNPROVIDED) {
            mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        if (use_liberal_coercionP == UNPROVIDED) {
            use_liberal_coercionP = pph_vars.$pph_allow_word_form_coercionP$.getDynamicValue();
        }
        if (morph_alternativesP == UNPROVIDED) {
            morph_alternativesP = pph_vars.pph_generate_morphological_alternativesP();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return pph_first_string_of_wordXpred_internal(word, pred, ok_source_preds, mt, use_liberal_coercionP, morph_alternativesP);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym122$PPH_FIRST_STRING_OF_WORD_PRED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym122$PPH_FIRST_STRING_OF_WORD_PRED, SIX_INTEGER, $int$1000, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym122$PPH_FIRST_STRING_OF_WORD_PRED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_6(word, pred, ok_source_preds, mt, use_liberal_coercionP, morph_alternativesP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (word.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (pred.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (ok_source_preds.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (mt.equal(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (use_liberal_coercionP.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && morph_alternativesP.equal(cached_args.first())) {
                                        return memoization_state.caching_results(results2);
                                    }
                                }
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(pph_first_string_of_wordXpred_internal(word, pred, ok_source_preds, mt, use_liberal_coercionP, morph_alternativesP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(word, pred, ok_source_preds, mt, use_liberal_coercionP, morph_alternativesP));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject pph_first_coerced_string_of_wordXpred_internal(final SubLObject word, final SubLObject target_pred, final SubLObject ok_source_preds, SubLObject mt, SubLObject use_liberal_coercionP) {
        if (mt == UNPROVIDED) {
            mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        if (use_liberal_coercionP == UNPROVIDED) {
            use_liberal_coercionP = pph_vars.$pph_allow_word_form_coercionP$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
            format_nil.force_format(T, $str130$Coercing__S_form_of__S__, target_pred, word, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        SubLObject ans_string = NIL;
        SubLObject ans_pred = NIL;
        if (NIL == ans_string) {
            SubLObject csome_list_var = pph_coerced_preds_for_pred(target_pred, mt, use_liberal_coercionP);
            SubLObject triple = NIL;
            triple = csome_list_var.first();
            while ((NIL == ans_string) && (NIL != csome_list_var)) {
                SubLObject current;
                final SubLObject datum = current = triple;
                SubLObject source_pred = NIL;
                SubLObject coerced_pred = NIL;
                SubLObject suffix = NIL;
                destructuring_bind_must_consp(current, datum, $list131);
                source_pred = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list131);
                coerced_pred = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list131);
                suffix = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL == ans_string) {
                        SubLObject csome_list_var_$80 = pph_utilities.pph_filter_preds(list(source_pred), ok_source_preds, UNPROVIDED);
                        SubLObject ok_source_pred = NIL;
                        ok_source_pred = csome_list_var_$80.first();
                        while ((NIL == ans_string) && (NIL != csome_list_var_$80)) {
                            SubLObject generated_string = NIL;
                            SubLObject generated_pred = NIL;
                            final SubLObject local_state = pph_macros.find_or_create_pph_external_memoization_state();
                            final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
                            try {
                                memoization_state.$memoization_state$.bind(local_state, thread);
                                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                                try {
                                    thread.resetMultipleValues();
                                    final SubLObject generated_string_$81 = lexicon_cache.first_string_of_wordXpred(word, ok_source_pred, mt);
                                    final SubLObject generated_pred_$82 = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    generated_string = generated_string_$81;
                                    generated_pred = generated_pred_$82;
                                } finally {
                                    final SubLObject _prev_bind_0_$83 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$83, thread);
                                    }
                                }
                            } finally {
                                memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
                            }
                            if (NIL != generated_string) {
                                if ((NIL != pph_utilities.pph_english_contextP(UNPROVIDED)) && (NIL != pph_utilities.pph_genl_pos_predP(coerced_pred, $$properNounStrings, UNPROVIDED))) {
                                    generated_string = string_utilities.upcase_leading(generated_string);
                                }
                                ans_pred = coerced_pred;
                                ans_string = (NIL != pph_utilities.pph_english_contextP(UNPROVIDED)) ? morphology.add_english_suffix(generated_string, suffix) : cconcatenate(generated_string, suffix);
                            }
                            csome_list_var_$80 = csome_list_var_$80.rest();
                            ok_source_pred = csome_list_var_$80.first();
                        } 
                    }
                } else {
                    cdestructuring_bind_error(datum, $list131);
                }
                csome_list_var = csome_list_var.rest();
                triple = csome_list_var.first();
            } 
        }
        return values(ans_string, ans_pred);
    }

    public static SubLObject pph_first_coerced_string_of_wordXpred(final SubLObject word, final SubLObject target_pred, final SubLObject ok_source_preds, SubLObject mt, SubLObject use_liberal_coercionP) {
        if (mt == UNPROVIDED) {
            mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        if (use_liberal_coercionP == UNPROVIDED) {
            use_liberal_coercionP = pph_vars.$pph_allow_word_form_coercionP$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return pph_first_coerced_string_of_wordXpred_internal(word, target_pred, ok_source_preds, mt, use_liberal_coercionP);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym129$PPH_FIRST_COERCED_STRING_OF_WORD_PRED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym129$PPH_FIRST_COERCED_STRING_OF_WORD_PRED, FIVE_INTEGER, $int$500, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym129$PPH_FIRST_COERCED_STRING_OF_WORD_PRED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_5(word, target_pred, ok_source_preds, mt, use_liberal_coercionP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (word.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (target_pred.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (ok_source_preds.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (mt.equal(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (((NIL != cached_args) && (NIL == cached_args.rest())) && use_liberal_coercionP.equal(cached_args.first())) {
                                    return memoization_state.caching_results(results2);
                                }
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(pph_first_coerced_string_of_wordXpred_internal(word, target_pred, ok_source_preds, mt, use_liberal_coercionP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(word, target_pred, ok_source_preds, mt, use_liberal_coercionP));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject pph_coerced_preds_for_pred_internal(final SubLObject pred, SubLObject mt, SubLObject use_liberal_coercionP) {
        if (mt == UNPROVIDED) {
            mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        if (use_liberal_coercionP == UNPROVIDED) {
            use_liberal_coercionP = pph_vars.$pph_allow_word_form_coercionP$.getDynamicValue();
        }
        return preds_coercible_to_pred(pred, mt, use_liberal_coercionP);
    }

    public static SubLObject pph_coerced_preds_for_pred(final SubLObject pred, SubLObject mt, SubLObject use_liberal_coercionP) {
        if (mt == UNPROVIDED) {
            mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        if (use_liberal_coercionP == UNPROVIDED) {
            use_liberal_coercionP = pph_vars.$pph_allow_word_form_coercionP$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return pph_coerced_preds_for_pred_internal(pred, mt, use_liberal_coercionP);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PPH_COERCED_PREDS_FOR_PRED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PPH_COERCED_PREDS_FOR_PRED, THREE_INTEGER, $int$64, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, PPH_COERCED_PREDS_FOR_PRED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(pred, mt, use_liberal_coercionP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (pred.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (mt.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && use_liberal_coercionP.eql(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(pph_coerced_preds_for_pred_internal(pred, mt, use_liberal_coercionP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(pred, mt, use_liberal_coercionP));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject preds_coercible_to_pred(final SubLObject pred, SubLObject mt, SubLObject use_liberal_coercionP) {
        if (mt == UNPROVIDED) {
            mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        if (use_liberal_coercionP == UNPROVIDED) {
            use_liberal_coercionP = pph_vars.$pph_allow_word_form_coercionP$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject coercible_preds = NIL;
        final SubLObject licensing_pred = ((NIL != constants_high.find_constant($str136$paraphraseCoercionSometimesAllowe)) && (NIL != use_liberal_coercionP)) ? constants_high.find_constant($str136$paraphraseCoercionSometimesAllowe) : (NIL != constants_high.find_constant($$$paraphraseCoercionAllowedFrom)) && (NIL != use_liberal_coercionP) ? constants_high.find_constant($$$paraphraseCoercionAllowedFrom) : NIL != constants_high.find_constant($str138$paraphraseCoercionAlwaysAllowedFr) ? constants_high.find_constant($str138$paraphraseCoercionAlwaysAllowedFr) : $$paraphraseCoercionAllowedFrom;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject deck_type = $QUEUE;
            final SubLObject recur_deck = deck.create_deck(deck_type);
            SubLObject node_and_predicate_mode = NIL;
            final SubLObject _prev_bind_0_$84 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    final SubLObject tv_var = NIL;
                    final SubLObject _prev_bind_0_$85 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$86 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                        if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                            if (pcase_var.eql($ERROR)) {
                                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str101$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else
                                if (pcase_var.eql($CERROR)) {
                                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str101$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else
                                    if (pcase_var.eql($WARN)) {
                                        Errors.warn($str101$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                    } else {
                                        Errors.warn($str106$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                        Errors.cerror($$$continue_anyway, $str101$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                    }


                        }
                        final SubLObject _prev_bind_0_$86 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$87 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$89 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                            if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(pred, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                final SubLObject _prev_bind_0_$87 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$88 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$90 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                    sbhl_marking_utilities.sbhl_mark_node_marked(pred, UNPROVIDED);
                                    for (node_and_predicate_mode = list(pred, sbhl_search_vars.genl_inverse_mode_p()); NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                        final SubLObject node_var_$93 = node_and_predicate_mode.first();
                                        final SubLObject predicate_mode = second(node_and_predicate_mode);
                                        final SubLObject spec_pred = node_var_$93;
                                        final SubLObject _prev_bind_0_$88 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                            if (NIL != sbhl_search_utilities.apply_sbhl_add_node_test(sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_$93)) {
                                                final SubLObject node_var_$94 = licensing_pred;
                                                final SubLObject deck_type_$96 = $QUEUE;
                                                final SubLObject recur_deck_$97 = deck.create_deck(deck_type_$96);
                                                SubLObject node_and_predicate_mode_$98 = NIL;
                                                final SubLObject _prev_bind_0_$89 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                                try {
                                                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                                    try {
                                                        final SubLObject tv_var_$100 = NIL;
                                                        final SubLObject _prev_bind_0_$90 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$89 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                                        try {
                                                            sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var_$100 ? tv_var_$100 : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var_$100 ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                            if (((NIL != tv_var_$100) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var_$100))) {
                                                                final SubLObject pcase_var2 = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                                if (pcase_var2.eql($ERROR)) {
                                                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str101$_A_is_not_a__A, tv_var_$100, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                } else
                                                                    if (pcase_var2.eql($CERROR)) {
                                                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str101$_A_is_not_a__A, tv_var_$100, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    } else
                                                                        if (pcase_var2.eql($WARN)) {
                                                                            Errors.warn($str101$_A_is_not_a__A, tv_var_$100, SBHL_TRUE_TV_P);
                                                                        } else {
                                                                            Errors.warn($str106$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                            Errors.cerror($$$continue_anyway, $str101$_A_is_not_a__A, tv_var_$100, SBHL_TRUE_TV_P);
                                                                        }


                                                            }
                                                            final SubLObject _prev_bind_0_$91 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                            final SubLObject _prev_bind_1_$90 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                            final SubLObject _prev_bind_2_$91 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                            final SubLObject _prev_bind_3_$106 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                            final SubLObject _prev_bind_4_$107 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                            try {
                                                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                                                if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(licensing_pred, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                                    final SubLObject _prev_bind_0_$92 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                                    final SubLObject _prev_bind_1_$91 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                                    final SubLObject _prev_bind_2_$92 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$94, UNPROVIDED);
                                                                        for (node_and_predicate_mode_$98 = list(licensing_pred, sbhl_search_vars.genl_inverse_mode_p()); NIL != node_and_predicate_mode_$98; node_and_predicate_mode_$98 = deck.deck_pop(recur_deck_$97)) {
                                                                            final SubLObject node_var_$95 = node_and_predicate_mode_$98.first();
                                                                            final SubLObject predicate_mode_$112 = second(node_and_predicate_mode_$98);
                                                                            final SubLObject spec_licensing_pred = node_var_$95;
                                                                            final SubLObject _prev_bind_0_$93 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode_$112, thread);
                                                                                if (NIL != sbhl_search_utilities.apply_sbhl_add_node_test(sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_$95)) {
                                                                                    SubLObject cdolist_list_var = kb_mapping_utilities.pred_values(spec_pred, spec_licensing_pred, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                    SubLObject coercible_pred = NIL;
                                                                                    coercible_pred = cdolist_list_var.first();
                                                                                    while (NIL != cdolist_list_var) {
                                                                                        SubLObject cdolist_list_var_$114 = derivational_suffixes_from_pred_to_pred(coercible_pred, spec_pred, mt);
                                                                                        SubLObject suffix = NIL;
                                                                                        suffix = cdolist_list_var_$114.first();
                                                                                        while (NIL != cdolist_list_var_$114) {
                                                                                            coercible_preds = cons(list(coercible_pred, spec_pred, suffix), coercible_preds);
                                                                                            cdolist_list_var_$114 = cdolist_list_var_$114.rest();
                                                                                            suffix = cdolist_list_var_$114.first();
                                                                                        } 
                                                                                        cdolist_list_var = cdolist_list_var.rest();
                                                                                        coercible_pred = cdolist_list_var.first();
                                                                                    } 
                                                                                }
                                                                                SubLObject cdolist_list_var2;
                                                                                final SubLObject accessible_modules = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlPreds));
                                                                                SubLObject module_var = NIL;
                                                                                module_var = cdolist_list_var2.first();
                                                                                while (NIL != cdolist_list_var2) {
                                                                                    final SubLObject _prev_bind_0_$94 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                    final SubLObject _prev_bind_1_$92 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                        final SubLObject node = function_terms.naut_to_nart(node_var_$95);
                                                                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                                            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                            if (NIL != d_link) {
                                                                                                final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                if (NIL != mt_links) {
                                                                                                    SubLObject iteration_state;
                                                                                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                                                        thread.resetMultipleValues();
                                                                                                        final SubLObject mt_$117 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                        final SubLObject tv_links = thread.secondMultipleValue();
                                                                                                        thread.resetMultipleValues();
                                                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt_$117)) {
                                                                                                            final SubLObject _prev_bind_0_$95 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                            try {
                                                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt_$117, thread);
                                                                                                                SubLObject iteration_state_$119;
                                                                                                                for (iteration_state_$119 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$119); iteration_state_$119 = dictionary_contents.do_dictionary_contents_next(iteration_state_$119)) {
                                                                                                                    thread.resetMultipleValues();
                                                                                                                    final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$119);
                                                                                                                    final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                    thread.resetMultipleValues();
                                                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                        final SubLObject _prev_bind_0_$96 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                        try {
                                                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                            final SubLObject sol = link_nodes;
                                                                                                                            if (NIL != set.set_p(sol)) {
                                                                                                                                final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                                                SubLObject basis_object;
                                                                                                                                SubLObject state;
                                                                                                                                SubLObject node_vars_link_node;
                                                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                                                    node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                        deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck_$97);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            } else
                                                                                                                                if (sol.isList()) {
                                                                                                                                    SubLObject csome_list_var = sol;
                                                                                                                                    SubLObject node_vars_link_node2 = NIL;
                                                                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                                                                    while (NIL != csome_list_var) {
                                                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                                                            deck.deck_push(list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck_$97);
                                                                                                                                        }
                                                                                                                                        csome_list_var = csome_list_var.rest();
                                                                                                                                        node_vars_link_node2 = csome_list_var.first();
                                                                                                                                    } 
                                                                                                                                } else {
                                                                                                                                    Errors.error($str108$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                                                }

                                                                                                                        } finally {
                                                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$96, thread);
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$119);
                                                                                                            } finally {
                                                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$95, thread);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                                }
                                                                                            } else {
                                                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str109$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                            }
                                                                                        } else
                                                                                            if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                SubLObject cdolist_list_var_$115;
                                                                                                final SubLObject new_list = cdolist_list_var_$115 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                SubLObject generating_fn = NIL;
                                                                                                generating_fn = cdolist_list_var_$115.first();
                                                                                                while (NIL != cdolist_list_var_$115) {
                                                                                                    final SubLObject _prev_bind_0_$97 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                    try {
                                                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                        final SubLObject sol2;
                                                                                                        final SubLObject link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                                                        if (NIL != set.set_p(sol2)) {
                                                                                                            final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                                                            SubLObject basis_object2;
                                                                                                            SubLObject state2;
                                                                                                            SubLObject node_vars_link_node3;
                                                                                                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                                                node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                                                    deck.deck_push(list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck_$97);
                                                                                                                }
                                                                                                            }
                                                                                                        } else
                                                                                                            if (sol2.isList()) {
                                                                                                                SubLObject csome_list_var2 = sol2;
                                                                                                                SubLObject node_vars_link_node4 = NIL;
                                                                                                                node_vars_link_node4 = csome_list_var2.first();
                                                                                                                while (NIL != csome_list_var2) {
                                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                                                        deck.deck_push(list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck_$97);
                                                                                                                    }
                                                                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                                                                } 
                                                                                                            } else {
                                                                                                                Errors.error($str108$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                                                            }

                                                                                                    } finally {
                                                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$97, thread);
                                                                                                    }
                                                                                                    cdolist_list_var_$115 = cdolist_list_var_$115.rest();
                                                                                                    generating_fn = cdolist_list_var_$115.first();
                                                                                                } 
                                                                                            }

                                                                                    } finally {
                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$92, thread);
                                                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$94, thread);
                                                                                    }
                                                                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                                                                    module_var = cdolist_list_var2.first();
                                                                                } 
                                                                            } finally {
                                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$93, thread);
                                                                            }
                                                                        }
                                                                    } finally {
                                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$92, thread);
                                                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$91, thread);
                                                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$92, thread);
                                                                    }
                                                                } else {
                                                                    sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str110$Node__a_does_not_pass_sbhl_type_t, licensing_pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                }
                                                            } finally {
                                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4_$107, thread);
                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3_$106, thread);
                                                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$91, thread);
                                                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$90, thread);
                                                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$91, thread);
                                                            }
                                                        } finally {
                                                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$89, thread);
                                                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$90, thread);
                                                        }
                                                    } finally {
                                                        final SubLObject _prev_bind_0_$98 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            final SubLObject _values = getValuesAsVector();
                                                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                                            restoreValuesFromVector(_values);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$98, thread);
                                                        }
                                                    }
                                                } finally {
                                                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$89, thread);
                                                }
                                            }
                                            SubLObject cdolist_list_var3;
                                            final SubLObject accessible_modules2 = cdolist_list_var3 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlPreds));
                                            SubLObject module_var2 = NIL;
                                            module_var2 = cdolist_list_var3.first();
                                            while (NIL != cdolist_list_var3) {
                                                final SubLObject _prev_bind_0_$99 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$93 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                    final SubLObject node2 = function_terms.naut_to_nart(node_var_$93);
                                                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                        final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != d_link2) {
                                                            final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != mt_links2) {
                                                                SubLObject iteration_state2;
                                                                for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt_$118 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                    final SubLObject tv_links2 = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt_$118)) {
                                                                        final SubLObject _prev_bind_0_$100 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt_$118, thread);
                                                                            SubLObject iteration_state_$120;
                                                                            for (iteration_state_$120 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$120); iteration_state_$120 = dictionary_contents.do_dictionary_contents_next(iteration_state_$120)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$120);
                                                                                final SubLObject link_nodes3 = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                    final SubLObject _prev_bind_0_$101 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                        final SubLObject sol3 = link_nodes3;
                                                                                        if (NIL != set.set_p(sol3)) {
                                                                                            final SubLObject set_contents_var3 = set.do_set_internal(sol3);
                                                                                            SubLObject basis_object3;
                                                                                            SubLObject state3;
                                                                                            SubLObject node_vars_link_node5;
                                                                                            for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                                node_vars_link_node5 = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node5)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node5, UNPROVIDED))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node5, UNPROVIDED);
                                                                                                    deck.deck_push(list(node_vars_link_node5, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                }
                                                                                            }
                                                                                        } else
                                                                                            if (sol3.isList()) {
                                                                                                SubLObject csome_list_var3 = sol3;
                                                                                                SubLObject node_vars_link_node6 = NIL;
                                                                                                node_vars_link_node6 = csome_list_var3.first();
                                                                                                while (NIL != csome_list_var3) {
                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node6, UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node6, UNPROVIDED);
                                                                                                        deck.deck_push(list(node_vars_link_node6, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                    }
                                                                                                    csome_list_var3 = csome_list_var3.rest();
                                                                                                    node_vars_link_node6 = csome_list_var3.first();
                                                                                                } 
                                                                                            } else {
                                                                                                Errors.error($str108$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                            }

                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$101, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$120);
                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$100, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str109$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } else
                                                        if (NIL != obsolete.cnat_p(node2, UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$116;
                                                            final SubLObject new_list2 = cdolist_list_var_$116 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            SubLObject generating_fn2 = NIL;
                                                            generating_fn2 = cdolist_list_var_$116.first();
                                                            while (NIL != cdolist_list_var_$116) {
                                                                final SubLObject _prev_bind_0_$102 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                    final SubLObject sol4;
                                                                    final SubLObject link_nodes4 = sol4 = funcall(generating_fn2, node2);
                                                                    if (NIL != set.set_p(sol4)) {
                                                                        final SubLObject set_contents_var4 = set.do_set_internal(sol4);
                                                                        SubLObject basis_object4;
                                                                        SubLObject state4;
                                                                        SubLObject node_vars_link_node7;
                                                                        for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                            node_vars_link_node7 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node7)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node7, UNPROVIDED))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node7, UNPROVIDED);
                                                                                deck.deck_push(list(node_vars_link_node7, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                            }
                                                                        }
                                                                    } else
                                                                        if (sol4.isList()) {
                                                                            SubLObject csome_list_var4 = sol4;
                                                                            SubLObject node_vars_link_node8 = NIL;
                                                                            node_vars_link_node8 = csome_list_var4.first();
                                                                            while (NIL != csome_list_var4) {
                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node8, UNPROVIDED)) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node8, UNPROVIDED);
                                                                                    deck.deck_push(list(node_vars_link_node8, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                }
                                                                                csome_list_var4 = csome_list_var4.rest();
                                                                                node_vars_link_node8 = csome_list_var4.first();
                                                                            } 
                                                                        } else {
                                                                            Errors.error($str108$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                        }

                                                                } finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$102, thread);
                                                                }
                                                                cdolist_list_var_$116 = cdolist_list_var_$116.rest();
                                                                generating_fn2 = cdolist_list_var_$116.first();
                                                            } 
                                                        }

                                                } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$93, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$99, thread);
                                                }
                                                cdolist_list_var3 = cdolist_list_var3.rest();
                                                module_var2 = cdolist_list_var3.first();
                                            } 
                                        } finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$88, thread);
                                        }
                                    }
                                } finally {
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$90, thread);
                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$88, thread);
                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$87, thread);
                                }
                            } else {
                                sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str110$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                        } finally {
                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$89, thread);
                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$87, thread);
                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$86, thread);
                        }
                    } finally {
                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$86, thread);
                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$85, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$103 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$103, thread);
                    }
                }
            } finally {
                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$84, thread);
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return Sort.sort(coercible_preds, LESSER_LENGTH_P, symbol_function(THIRD));
    }

    public static SubLObject derivational_suffixes_from_pred_to_pred(final SubLObject from_pred, final SubLObject to_pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject suffixes = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject csome_list_var = morphology.suffix_rules_for_pred(to_pred);
            SubLObject rule = NIL;
            rule = csome_list_var.first();
            while (NIL != csome_list_var) {
                SubLObject current;
                final SubLObject datum = current = assertions_high.gaf_args(rule).rest();
                SubLObject asserted_from_pred = NIL;
                SubLObject suffix = NIL;
                destructuring_bind_must_consp(current, datum, $list142);
                asserted_from_pred = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list142);
                suffix = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL != pph_utilities.pph_genl_pos_predP(from_pred, asserted_from_pred, UNPROVIDED)) {
                        suffixes = cons(suffix, suffixes);
                    }
                } else {
                    cdestructuring_bind_error(datum, $list142);
                }
                csome_list_var = csome_list_var.rest();
                rule = csome_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        if (NIL == suffixes) {
            suffixes = cons(string_utilities.$empty_string$.getGlobalValue(), suffixes);
        }
        return suffixes;
    }

    public static SubLObject preds_derivable_to_pred(final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject derivable_preds = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject deck_type = $QUEUE;
            final SubLObject recur_deck = deck.create_deck(deck_type);
            SubLObject node_and_predicate_mode = NIL;
            final SubLObject _prev_bind_0_$133 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    final SubLObject tv_var = NIL;
                    final SubLObject _prev_bind_0_$134 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$135 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                        if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                            if (pcase_var.eql($ERROR)) {
                                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str101$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else
                                if (pcase_var.eql($CERROR)) {
                                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str101$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else
                                    if (pcase_var.eql($WARN)) {
                                        Errors.warn($str101$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                    } else {
                                        Errors.warn($str106$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                        Errors.cerror($$$continue_anyway, $str101$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                    }


                        }
                        final SubLObject _prev_bind_0_$135 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$136 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$138 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                            if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(pred, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                final SubLObject _prev_bind_0_$136 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$137 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$139 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                    sbhl_marking_utilities.sbhl_mark_node_marked(pred, UNPROVIDED);
                                    for (node_and_predicate_mode = list(pred, sbhl_search_vars.genl_inverse_mode_p()); NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                        final SubLObject node_var_$142 = node_and_predicate_mode.first();
                                        final SubLObject predicate_mode = second(node_and_predicate_mode);
                                        final SubLObject genl_pred = node_var_$142;
                                        final SubLObject _prev_bind_0_$137 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                            if (NIL != sbhl_search_utilities.apply_sbhl_add_node_test(sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_$142)) {
                                                derivable_preds = nconc(derivable_preds, kb_mapping_utilities.pred_value_tuples(genl_pred, $$regularSuffix, ONE_INTEGER, $list144, UNPROVIDED));
                                            }
                                            SubLObject cdolist_list_var;
                                            final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlPreds));
                                            SubLObject module_var = NIL;
                                            module_var = cdolist_list_var.first();
                                            while (NIL != cdolist_list_var) {
                                                final SubLObject _prev_bind_0_$138 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$138 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                    final SubLObject node = function_terms.naut_to_nart(node_var_$142);
                                                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != d_link) {
                                                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != mt_links) {
                                                                SubLObject iteration_state;
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt_$146 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    final SubLObject tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt_$146)) {
                                                                        final SubLObject _prev_bind_0_$139 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt_$146, thread);
                                                                            SubLObject iteration_state_$148;
                                                                            for (iteration_state_$148 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$148); iteration_state_$148 = dictionary_contents.do_dictionary_contents_next(iteration_state_$148)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$148);
                                                                                final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                    final SubLObject _prev_bind_0_$140 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                        final SubLObject sol = link_nodes;
                                                                                        if (NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject node_vars_link_node;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                    deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                }
                                                                                            }
                                                                                        } else
                                                                                            if (sol.isList()) {
                                                                                                SubLObject csome_list_var = sol;
                                                                                                SubLObject node_vars_link_node2 = NIL;
                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                                while (NIL != csome_list_var) {
                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                        deck.deck_push(list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                    }
                                                                                                    csome_list_var = csome_list_var.rest();
                                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                                } 
                                                                                            } else {
                                                                                                Errors.error($str108$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }

                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$140, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$148);
                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$139, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str109$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } else
                                                        if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$150;
                                                            final SubLObject new_list = cdolist_list_var_$150 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            SubLObject generating_fn = NIL;
                                                            generating_fn = cdolist_list_var_$150.first();
                                                            while (NIL != cdolist_list_var_$150) {
                                                                final SubLObject _prev_bind_0_$141 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    final SubLObject sol2;
                                                                    final SubLObject link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                    if (NIL != set.set_p(sol2)) {
                                                                        final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                        SubLObject basis_object2;
                                                                        SubLObject state2;
                                                                        SubLObject node_vars_link_node3;
                                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                            node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                deck.deck_push(list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                            }
                                                                        }
                                                                    } else
                                                                        if (sol2.isList()) {
                                                                            SubLObject csome_list_var2 = sol2;
                                                                            SubLObject node_vars_link_node4 = NIL;
                                                                            node_vars_link_node4 = csome_list_var2.first();
                                                                            while (NIL != csome_list_var2) {
                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                    deck.deck_push(list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                }
                                                                                csome_list_var2 = csome_list_var2.rest();
                                                                                node_vars_link_node4 = csome_list_var2.first();
                                                                            } 
                                                                        } else {
                                                                            Errors.error($str108$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                        }

                                                                } finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$141, thread);
                                                                }
                                                                cdolist_list_var_$150 = cdolist_list_var_$150.rest();
                                                                generating_fn = cdolist_list_var_$150.first();
                                                            } 
                                                        }

                                                } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$138, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$138, thread);
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                module_var = cdolist_list_var.first();
                                            } 
                                        } finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$137, thread);
                                        }
                                    }
                                } finally {
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$139, thread);
                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$137, thread);
                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$136, thread);
                                }
                            } else {
                                sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str110$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                        } finally {
                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$138, thread);
                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$136, thread);
                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$135, thread);
                        }
                    } finally {
                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$135, thread);
                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$134, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$142 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$142, thread);
                    }
                }
            } finally {
                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$133, thread);
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return derivable_preds;
    }

    public static SubLObject pph_pronoun_agr_p(final SubLObject obj) {
        return makeBoolean(obj.isList() && (NIL != list_utilities.lengthE(obj, THREE_INTEGER, UNPROVIDED)));
    }

    public static SubLObject pph_pronoun_agr_personP(final SubLObject obj) {
        return makeBoolean((NIL == obj) || (NIL != pph_known_pronoun_agr_personP(obj)));
    }

    public static SubLObject pph_known_pronoun_agr_personP(final SubLObject obj) {
        return pph_utilities.pph_isaP(obj, $$NLPersonAttribute, UNPROVIDED);
    }

    public static SubLObject pph_pronoun_agr_numberP(final SubLObject obj) {
        return makeBoolean((NIL == obj) || (NIL != pph_known_pronoun_agr_numberP(obj)));
    }

    public static SubLObject pph_known_pronoun_agr_numberP(final SubLObject obj) {
        return pph_utilities.pph_isaP(obj, $$NLNumberAttribute, UNPROVIDED);
    }

    public static SubLObject pph_pronoun_agr_genderP(final SubLObject obj) {
        return makeBoolean((NIL == obj) || (NIL != pph_known_pronoun_agr_genderP(obj)));
    }

    public static SubLObject pph_known_pronoun_agr_genderP(final SubLObject obj) {
        return pph_utilities.pph_isaP(obj, $$NLGenderAttribute, UNPROVIDED);
    }

    public static SubLObject new_unspecified_pph_pronoun_agr() {
        return new_pph_pronoun_agr(NIL, NIL, NIL);
    }

    public static SubLObject new_pph_pronoun_agr(final SubLObject person, final SubLObject number, final SubLObject gender) {
        return list(person, number, gender);
    }

    public static SubLObject pph_pronoun_agr_person(final SubLObject pronoun_agr) {
        return pronoun_agr.first();
    }

    public static SubLObject pph_pronoun_agr_number(final SubLObject pronoun_agr) {
        return second(pronoun_agr);
    }

    public static SubLObject pph_pronoun_agr_gender(final SubLObject pronoun_agr) {
        return third(pronoun_agr);
    }

    public static SubLObject pph_pronoun_agr_set_person(final SubLObject pronoun_agr, final SubLObject person) {
        return set_nth(ZERO_INTEGER, pronoun_agr, person);
    }

    public static SubLObject pph_pronoun_agr_set_number(final SubLObject pronoun_agr, final SubLObject number) {
        return set_nth(ONE_INTEGER, pronoun_agr, number);
    }

    public static SubLObject pph_pronoun_agr_set_gender(final SubLObject pronoun_agr, final SubLObject gender) {
        return set_nth(TWO_INTEGER, pronoun_agr, gender);
    }

    public static SubLObject pph_pronoun_agr_for_cycl(final SubLObject cycl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject person = pph_methods.pph_person(cycl);
        final SubLObject number = pph_methods.pph_number(cycl);
        final SubLObject gender = ((NIL != pph_utilities.pph_english_contextP(UNPROVIDED)) && ((!number.eql($$Singular_NLAttr)) || (!person.eql($$ThirdPerson_NLAttr)))) ? $$Ungendered_NLAttr : pph_methods.pph_gender(cycl);
        if (((NIL == person) || (NIL == number)) || (NIL == gender)) {
            if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
                Errors.warn($str151$Couldn_t_generate_pronoun_agr_for, cycl);
                force_output(StreamsLow.$error_output$.getDynamicValue(thread));
            }
            return $UNDETERMINED;
        }
        return new_pph_pronoun_agr(person, number, gender);
    }

    public static SubLObject pph_genders_compatibleP(final SubLObject gender1, final SubLObject gender2) {
        if (gender1.eql(gender2)) {
            return T;
        }
        if (gender1.eql($$Ungendered_NLAttr)) {
            return T;
        }
        if (gender2.eql($$Ungendered_NLAttr)) {
            return T;
        }
        return NIL;
    }

    public static SubLObject pph_generate_pronoun(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject prontype = pph_pronoun_type(pph_phrase.pph_phrase_case(phrase));
        final SubLObject cycl = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
        final SubLObject agr_preds = pph_phrase.pph_phrase_agr_preds(phrase, UNPROVIDED);
        if (((NIL != pph_vars.$pph_introduce_anaphorsP$.getDynamicValue(thread)) || (NIL != pph_speech_act.pph_discourse_participant_p(cycl))) && (NIL != pph_utilities.pph_filter_preds(agr_preds, $list156, UNPROVIDED))) {
            thread.resetMultipleValues();
            final SubLObject pronoun_string = pph_generate_anaphor(cycl, prontype);
            final SubLObject pronoun_pred = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (pronoun_string.isString()) {
                pph_phrase.pph_phrase_set_agr_pred(phrase, pronoun_pred, UNPROVIDED);
                pph_phrase.pph_phrase_set_category(phrase, czer_main.canonicalize_term(make_unary_formula($$PhraseFn, prontype), UNPROVIDED), UNPROVIDED);
                pph_phrase.pph_phrase_set_string(phrase, pronoun_string);
            }
            pph_phrase.pph_phrase_maybe_add_anchor_tags(phrase);
        }
        return pph_phrase.pph_phrase_output_list(phrase);
    }

    public static SubLObject pph_introduce_reflexive(final SubLObject arg) {
        return pph_generate_anaphor(arg, $$ReflexivePronoun);
    }

    public static SubLObject pph_subjectP(final SubLObject phrase) {
        return eq(pph_phrase.pph_phrase_case(phrase), $NOMINATIVE);
    }

    public static SubLObject pph_maybe_ambiguous_pronounP(final SubLObject cycl) {
        return pph_drs.any_competing_pph_rmP(cycl, UNPROVIDED);
    }

    public static SubLObject pph_generate_anaphor(final SubLObject cycl, final SubLObject pronoun_type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pronoun_agr = pph_pronoun_agr_for_cycl(cycl);
        SubLObject ans = NIL;
        SubLObject ans_pred = NIL;
        if (NIL != pph_pronoun_agr_p(pronoun_agr)) {
            thread.resetMultipleValues();
            final SubLObject ans_$153 = pph_resolve_pronoun(pronoun_agr, pronoun_type);
            final SubLObject ans_pred_$154 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            ans = ans_$153;
            ans_pred = ans_pred_$154;
        }
        if ((NIL != ans) && (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER))) {
            format_nil.force_format(T, $str160$Generated__S_for__S, ans, cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return values(ans, ans_pred);
    }

    public static SubLObject pph_resolve_pronoun(final SubLObject pronoun_agr, final SubLObject pronoun_type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pronoun_nart = pph_pronoun_nart(pronoun_agr, pronoun_type);
        final SubLObject wu = pph_pronoun_wu(pronoun_nart);
        final SubLObject pronoun_string = (NIL != wu) ? pph_first_string_of_wordXspeech_part(wu, pronoun_type, UNPROVIDED, UNPROVIDED) : NIL;
        final SubLObject pronoun_pred = (NIL != pronoun_string) ? agr_pred_from_pronoun_agr(pronoun_agr) : NIL;
        if (NIL == pronoun_string) {
            final SubLObject cdolist_list_var = pronoun_proper_genls(pronoun_type, UNPROVIDED);
            SubLObject genl = NIL;
            genl = cdolist_list_var.first();
            if (NIL != cdolist_list_var) {
                return pph_resolve_pronoun(pronoun_agr, genl);
            }
        }
        if (((NIL == pronoun_string) && (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER))) && (NIL == pph_error.suppress_pph_warningsP())) {
            Errors.warn($str161$Unable_to_find_a_pronoun_for__S__, pronoun_nart);
            force_output(StreamsLow.$error_output$.getDynamicValue(thread));
        }
        return values(pronoun_string, pronoun_pred);
    }

    public static SubLObject pronoun_proper_genls(final SubLObject pronoun_type, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLObject v_genls = genls.all_genls_if($sym162$PRONOUN_SPEC_, pronoun_type, mt, UNPROVIDED);
        return remove(pronoun_type, v_genls, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject pronoun_specP(final SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return genls.genlsP(col, $$Pronoun, mt, UNPROVIDED);
    }

    public static SubLObject agr_pred_from_pronoun_agr(final SubLObject pronoun_agr) {
        final SubLObject pcase_var;
        final SubLObject number = pcase_var = pph_pronoun_agr_number(pronoun_agr);
        if (pcase_var.eql($$Singular_NLAttr)) {
            return $$singular_Generic;
        }
        return $$plural_Generic;
    }

    public static SubLObject pph_pronoun_wu(final SubLObject pronoun_nart) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject candidates = NIL;
        final SubLObject deictics = $list166;
        SubLObject wu = NIL;
        if (NIL != indexed_term_p(pronoun_nart)) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(pph_vars.$pph_language_mt$.getDynamicValue(thread));
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                candidates = list_utilities.remove_if_not($sym167$QUICK_LEXICAL_WORD_, set_difference(kb_mapping_utilities.pred_values(pronoun_nart, $$denotation, FOUR_INTEGER, ONE_INTEGER, UNPROVIDED), deictics, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        final SubLObject pcase_var = length(candidates);
        if (pcase_var.eql(ZERO_INTEGER)) {
            if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
                Errors.warn($str168$Couldn_t_find_a_word_unit_for____, pronoun_nart);
                force_output(StreamsLow.$error_output$.getDynamicValue(thread));
            }
        } else
            if (pcase_var.eql(ONE_INTEGER)) {
                wu = list_utilities.only_one(candidates);
            } else {
                if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
                    Errors.warn($str169$Found__S_for_____S___Using__S, candidates, pronoun_nart, candidates.first());
                    force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                }
                wu = candidates.first();
            }

        return wu;
    }

    public static SubLObject case_is_irrelevantP(final SubLObject pronoun_agr) {
        if (NIL == pph_utilities.pph_english_contextP(UNPROVIDED)) {
            return NIL;
        }
        SubLObject person = NIL;
        SubLObject number = NIL;
        SubLObject gender = NIL;
        destructuring_bind_must_consp(pronoun_agr, pronoun_agr, $list170);
        person = pronoun_agr.first();
        SubLObject current = pronoun_agr.rest();
        destructuring_bind_must_consp(current, pronoun_agr, $list170);
        number = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, pronoun_agr, $list170);
        gender = current.first();
        current = current.rest();
        if (NIL == current) {
            return makeBoolean(((gender.eql($$Neuter_NLAttr) && number.eql($$Singular_NLAttr)) && person.eql($$ThirdPerson_NLAttr)) || person.eql($$SecondPerson_NLAttr));
        }
        cdestructuring_bind_error(pronoun_agr, $list170);
        return NIL;
    }

    public static SubLObject pph_pronoun_nart(final SubLObject pronoun_agr, final SubLObject prontype) {
        if ((NIL == pph_pronoun_agr_p(pronoun_agr)) || (NIL == prontype)) {
            return NIL;
        }
        SubLObject person = NIL;
        SubLObject number = NIL;
        SubLObject gender = NIL;
        destructuring_bind_must_consp(pronoun_agr, pronoun_agr, $list170);
        person = pronoun_agr.first();
        SubLObject current = pronoun_agr.rest();
        destructuring_bind_must_consp(current, pronoun_agr, $list170);
        number = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, pronoun_agr, $list170);
        gender = current.first();
        current = current.rest();
        if (NIL == current) {
            return function_terms.naut_to_nart(list($$PronounFn, person, number, gender, prontype));
        }
        cdestructuring_bind_error(pronoun_agr, $list170);
        return NIL;
    }

    public static SubLObject pph_pronoun_type(final SubLObject v_case) {
        if (v_case.eql($NOMINATIVE)) {
            return $$SubjectPronoun;
        }
        if (v_case.eql($GENITIVE)) {
            return $$PossessivePronoun_Pre;
        }
        return $$ObjectPronoun;
    }

    public static SubLObject pph_phrase_resolve_string_from_word(final SubLObject phrase, SubLObject done_alternatives) {
        if (done_alternatives == UNPROVIDED) {
            done_alternatives = set.new_set(symbol_function(EQUAL), UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject agr_preds = pph_phrase.pph_phrase_agr_preds(phrase, UNPROVIDED);
        final SubLObject wu = pph_phrase.pph_phrase_wu(phrase, UNPROVIDED);
        final SubLObject category = pph_phrase.pph_phrase_category(phrase, UNPROVIDED);
        final SubLObject agr_target = pph_phrase_resolution.pph_phrase_relative_agr_target(phrase);
        final SubLObject source_pos = pph_phrase_resolution.pph_phrase_source_pos(phrase, NIL);
        final SubLObject input_phrase = (NIL != pph_vars.pph_generate_morphological_alternativesP()) ? pph_phrase.pph_phrase_copy(phrase, NIL, NIL) : NIL;
        final SubLObject pos = (NIL != source_pos) ? source_pos : NIL != pph_utilities.pph_speech_partP(category) ? category : $ANY;
        if ((NIL != list_utilities.proper_list_p(agr_preds)) && (NIL != pph_utilities.pph_genl_posP(category, $$Determiner, UNPROVIDED))) {
            agr_preds = pph_determiner_preds(wu, agr_preds);
        }
        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
            format_nil.force_format(T, $str178$__Looking_up_value_for__S_with_ag, wu, agr_preds, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        thread.resetMultipleValues();
        SubLObject string = pph_first_string_of_wordXspeech_part(wu, pos, agr_preds, UNPROVIDED);
        SubLObject pred = thread.secondMultipleValue();
        final SubLObject alternative_pairs = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (NIL == pph_utilities.pph_speech_part_predP(pred)) {
            pred = pph_utilities.$pph_default_np_agr_pred$.getGlobalValue();
        }
        if (NIL != pph_utilities.pph_pred_licensed_by_predsP(pred, agr_preds)) {
            set.set_add(list(agr_target, string, pred), done_alternatives);
            pph_phrase_update_with_stringXpred_from_word(phrase, string, pred);
        } else {
            string = NIL;
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                format_nil.force_format(T, $str179$__Unable_to_find_string_matching_, agr_preds, wu, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
        if (NIL != pph_vars.pph_generate_morphological_alternativesP()) {
            pph_phrase_resolve_lexical_alternatives(phrase, alternative_pairs, agr_preds, input_phrase, agr_target, done_alternatives);
        }
        return pph_phrase.pph_phrase_output_list(phrase);
    }

    public static SubLObject pph_phrase_resolve_lexical_alternatives(final SubLObject phrase, final SubLObject alternative_pairs, final SubLObject agr_preds, final SubLObject input_phrase, final SubLObject agr_target, final SubLObject done_alternatives) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject queue = queues.create_queue(UNPROVIDED);
        SubLObject done_count = ZERO_INTEGER;
        queues.enqueue(phrase, queue);
        while (NIL == queues.queue_empty_p(queue)) {
            final SubLObject direct_alternative_of = queues.dequeue(queue);
            SubLObject cdolist_list_var = pph_phrase.pph_phrase_local_alternatives(direct_alternative_of);
            SubLObject alternative = NIL;
            alternative = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                pph_phrase_resolve_string_from_word(alternative, done_alternatives);
                if (NIL == pph_phrase.pph_phrase_doneP(alternative)) {
                    pph_phrase.pph_phrase_remove_alternative(direct_alternative_of, alternative);
                }
                done_count = add(done_count, ONE_INTEGER);
                if (done_count.numGE(pph_phrase.$pph_do_alternatives_max$.getDynamicValue(thread))) {
                    final SubLObject new_format_string = cconcatenate($str7$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str8$__, format_nil.format_nil_a_no_copy($str180$Done__S_alternatives_of__S) });
                    pph_error.pph_handle_error(new_format_string, list(done_count, phrase));
                }
                queues.enqueue(alternative, queue);
                cdolist_list_var = cdolist_list_var.rest();
                alternative = cdolist_list_var.first();
            } 
        } 
        SubLObject cdolist_list_var2 = alternative_pairs;
        SubLObject pair = NIL;
        pair = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            SubLObject current;
            final SubLObject datum = current = pair;
            SubLObject alternative_string = NIL;
            SubLObject alternative_string_pred = NIL;
            destructuring_bind_must_consp(current, datum, $list181);
            alternative_string = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list181);
            alternative_string_pred = current.first();
            current = current.rest();
            final SubLObject demerits = (current.isCons()) ? current.first() : ZERO_INTEGER;
            destructuring_bind_must_listp(current, datum, $list181);
            current = current.rest();
            final SubLObject justification = (current.isCons()) ? current.first() : NIL;
            destructuring_bind_must_listp(current, datum, $list181);
            current = current.rest();
            if (NIL == current) {
                final SubLObject key = cons(agr_target, pair);
                if (NIL == set.set_memberP(key, done_alternatives)) {
                    if (NIL != pph_utilities.pph_pred_licensed_by_predsP(alternative_string_pred, agr_preds)) {
                        set.set_add(key, done_alternatives);
                        final SubLObject alternative_phrase = pph_phrase.pph_phrase_copy(input_phrase, NIL, NIL);
                        pph_phrase.pph_phrase_set_top_level_demerits(alternative_phrase, demerits, $sym182$PPH_FIRST_STRING_OF_WORD_SPEECH_PART);
                        pph_phrase.pph_phrase_set_justification(alternative_phrase, justification);
                        pph_phrase_update_with_stringXpred_from_word(alternative_phrase, alternative_string, alternative_string_pred);
                        if (NIL != pph_phrase.pph_phrase_doneP(alternative_phrase)) {
                            if (NIL != pph_phrase.pph_phrase_p(agr_target, UNPROVIDED)) {
                                pph_phrase.pph_phrase_set_relative_agr_target(alternative_phrase, agr_target);
                            }
                            pph_phrase.pph_phrase_add_alternative(phrase, alternative_phrase);
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list181);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            pair = cdolist_list_var2.first();
        } 
        return phrase;
    }

    public static SubLObject pph_phrase_update_with_stringXpred_from_word(final SubLObject phrase, final SubLObject string, final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == pph_forbidden_string_for_phraseP(phrase, string)) {
            pph_phrase.pph_phrase_set_string(phrase, string);
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                format_nil.force_format(T, $str183$__Found_answer_pair___S__S__, string, pred, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            pph_phrase.pph_phrase_set_agr_pred(phrase, pred, UNPROVIDED);
            final SubLObject cycl = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
            final SubLObject word = pph_phrase.pph_phrase_wu(phrase, UNPROVIDED);
            if (NIL != pph_types.pph_lexical_wordP(word)) {
                final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(pph_vars.$pph_language_mt$.getDynamicValue(thread));
                final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    pph_phrase.pph_phrase_add_justification(phrase, removal_modules_lexicon.make_word_strings_support(make_binary_formula(pred, word, string)));
                } finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                }
            }
            if ((NIL != cycl_variables.el_varP(cycl)) && (NIL == pph_variable_handling.pph_var_registered_as_defaultP(cycl))) {
                final SubLObject var = cycl;
                final SubLObject type = pph_variable_handling.pph_var_type(var);
                final SubLObject type_map = pph_variable_handling.pph_type_arg_position_map(var);
                pph_variable_handling.pph_register_var(cycl, type, type_map);
                pph_phrase.pph_phrase_set_arg_position_map(phrase, type_map);
                pph_phrase.pph_phrase_set_cycl(phrase, type);
                pph_phrase.pph_phrase_set_output_list_cycl(phrase, type);
            }
            pph_phrase.pph_phrase_maybe_add_anchor_tags(phrase);
        }
        return phrase;
    }

    public static SubLObject pph_forbidden_string_for_phraseP(final SubLObject phrase, final SubLObject string) {
        SubLObject forbidden_stringP = NIL;
        if (NIL != pph_vars.pph_blacklist_active_p()) {
            final SubLObject denot = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
            forbidden_stringP = makeBoolean((NIL != pph_phrase.pph_known_cycl_p(denot)) && (NIL != pph_vars.pph_forbidden_string_for_termP(denot, string)));
        }
        return forbidden_stringP;
    }

    public static SubLObject pph_determiner_preds(final SubLObject wu, final SubLObject nl_preds) {
        final SubLObject agr_preds = lexicon_accessors.agreement_lookup(wu);
        if (NIL != pph_utilities.pph_filter_preds(agr_preds, nl_preds, UNPROVIDED)) {
            return $list184;
        }
        return NIL;
    }

    public static SubLObject all_phrases_neg_test(final SubLObject return_list, final SubLObject item) {
        return makeBoolean(NIL == list_utilities.member_equalpP(item, return_list));
    }

    public static SubLObject all_phrases_test(final SubLObject return_list, final SubLObject item) {
        return list_utilities.member_equalpP(item, return_list);
    }

    public static SubLObject all_phrases_for_term_neg(final SubLObject v_term, SubLObject include, SubLObject abbrev_types, SubLObject mode, SubLObject the_filter, SubLObject asserted_onlyP) {
        if (include == UNPROVIDED) {
            include = $ALL;
        }
        if (abbrev_types == UNPROVIDED) {
            abbrev_types = NIL;
        }
        if (mode == UNPROVIDED) {
            mode = $TEXT;
        }
        if (the_filter == UNPROVIDED) {
            the_filter = NIL;
        }
        if (asserted_onlyP == UNPROVIDED) {
            asserted_onlyP = NIL;
        }
        return all_phrases_for_term(v_term, include, abbrev_types, mode, the_filter, asserted_onlyP, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject test_generate_phrase_from_lexification_sentence(final SubLObject sentence, final SubLObject preds) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject string = NIL;
        SubLObject pred = NIL;
        final SubLObject _prev_bind_0 = pph_macros.$new_pph_phrases$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_macros.$new_pph_phrase_count$.currentBinding(thread);
        final SubLObject _prev_bind_3 = pph_macros.$destroy_new_pph_phrasesP$.currentBinding(thread);
        try {
            pph_macros.$new_pph_phrases$.bind(stacks.create_stack(), thread);
            pph_macros.$new_pph_phrase_count$.bind(pph_macros.get_new_pph_phrase_count(), thread);
            pph_macros.$destroy_new_pph_phrasesP$.bind(T, thread);
            try {
                final SubLObject item = generate_phrase_from_lexification_sentence(sentence, preds, UNPROVIDED, UNPROVIDED);
                if (NIL != item) {
                    string = pph_string.pph_string_if_non_null_to_output_format(pph_data_structures.pph_phrase_output_item_string(item), $TEXT);
                    pred = pph_data_structures.pph_phrase_output_item_agr_pred(item);
                }
            } finally {
                final SubLObject _prev_bind_0_$155 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    pph_macros.destroy_new_pph_phrases();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$155, thread);
                }
            }
        } finally {
            pph_macros.$destroy_new_pph_phrasesP$.rebind(_prev_bind_3, thread);
            pph_macros.$new_pph_phrase_count$.rebind(_prev_bind_2, thread);
            pph_macros.$new_pph_phrases$.rebind(_prev_bind_0, thread);
        }
        return values(string, pred);
    }

    public static SubLObject declare_pph_methods_lexicon_file() {
        declareFunction(me, "gen_phrase_method", "GEN-PHRASE-METHOD", 1, 1, false);
        declareFunction(me, "any_gen_phrase_method", "ANY-GEN-PHRASE-METHOD", 1, 1, false);
        declareFunction(me, "preferred_gen_unit_method", "PREFERRED-GEN-UNIT-METHOD", 1, 1, false);
        new pph_methods_lexicon.$preferred_gen_unit_method$UnaryFunction();
        new pph_methods_lexicon.$preferred_gen_unit_method$BinaryFunction();
        declareFunction(me, "pgu_assertions_for_term_internal", "PGU-ASSERTIONS-FOR-TERM-INTERNAL", 1, 1, false);
        declareFunction(me, "pgu_assertions_for_term", "PGU-ASSERTIONS-FOR-TERM", 1, 1, false);
        declareFunction(me, "gen_string_assertion_precise_method", "GEN-STRING-ASSERTION-PRECISE-METHOD", 1, 1, false);
        declareFunction(me, "preferred_lexification_method", "PREFERRED-LEXIFICATION-METHOD", 1, 2, false);
        new pph_methods_lexicon.$preferred_lexification_method$UnaryFunction();
        new pph_methods_lexicon.$preferred_lexification_method$BinaryFunction();
        declareFunction(me, "generate_phrase_from_lexification_sentences", "GENERATE-PHRASE-FROM-LEXIFICATION-SENTENCES", 2, 2, false);
        declareFunction(me, "try_generate_phrase_from_lexification_sentence", "TRY-GENERATE-PHRASE-FROM-LEXIFICATION-SENTENCE", 5, 0, false);
        declareFunction(me, "try_generate_phrase_from_as", "TRY-GENERATE-PHRASE-FROM-AS", 5, 0, false);
        declareFunction(me, "handle_pph_output_item", "HANDLE-PPH-OUTPUT-ITEM", 3, 0, false);
        declareFunction(me, "generate_phrase_from_assertions", "GENERATE-PHRASE-FROM-ASSERTIONS", 2, 2, false);
        declareFunction(me, "pph_output_item_okP", "PPH-OUTPUT-ITEM-OK?", 2, 0, false);
        declareFunction(me, "pph_output_item_ok_for_predP", "PPH-OUTPUT-ITEM-OK-FOR-PRED?", 2, 0, false);
        declareFunction(me, "pph_output_name_ok_for_predP", "PPH-OUTPUT-NAME-OK-FOR-PRED?", 2, 0, false);
        declareFunction(me, "pph_name_ok_for_pred_and_cyclP", "PPH-NAME-OK-FOR-PRED-AND-CYCL?", 4, 0, false);
        declareFunction(me, "pph_sort_output_items", "PPH-SORT-OUTPUT-ITEMS", 1, 0, false);
        declareFunction(me, "generate_phrases_from_as_internal", "GENERATE-PHRASES-FROM-AS-INTERNAL", 1, 4, false);
        declareFunction(me, "generate_phrases_from_as", "GENERATE-PHRASES-FROM-AS", 1, 4, false);
        declareFunction(me, "generate_phrase_from_as_internal", "GENERATE-PHRASE-FROM-AS-INTERNAL", 1, 5, false);
        declareFunction(me, "generate_phrase_from_as", "GENERATE-PHRASE-FROM-AS", 1, 5, false);
        declareFunction(me, "pph_output_item_for_formula_symbol", "PPH-OUTPUT-ITEM-FOR-FORMULA-SYMBOL", 2, 0, false);
        declareFunction(me, "pph_phrase_from_lexical_as", "PPH-PHRASE-FROM-LEXICAL-AS", 1, 3, false);
        declareFunction(me, "generate_phrase_from_lexification_sentence", "GENERATE-PHRASE-FROM-LEXIFICATION-SENTENCE", 1, 3, false);
        declareFunction(me, "generate_phrase_from_lexification_sentence_memoized_internal", "GENERATE-PHRASE-FROM-LEXIFICATION-SENTENCE-MEMOIZED-INTERNAL", 4, 0, false);
        declareFunction(me, "generate_phrase_from_lexification_sentence_memoized", "GENERATE-PHRASE-FROM-LEXIFICATION-SENTENCE-MEMOIZED", 4, 0, false);
        declareFunction(me, "pph_phrase_from_lexification_sentence", "PPH-PHRASE-FROM-LEXIFICATION-SENTENCE", 1, 3, false);
        declareFunction(me, "pph_phrase_from_denot_info", "PPH-PHRASE-FROM-DENOT-INFO", 6, 2, false);
        declareFunction(me, "pph_phrase_from_denot_info_set_agr_preds", "PPH-PHRASE-FROM-DENOT-INFO-SET-AGR-PREDS", 6, 1, false);
        declareFunction(me, "pph_preds_derivable_from_pos", "PPH-PREDS-DERIVABLE-FROM-POS", 1, 0, false);
        declareFunction(me, "pph_phrase_naut_from_denot_info", "PPH-PHRASE-NAUT-FROM-DENOT-INFO", 4, 0, false);
        declareFunction(me, "noun_from_adjective_method", "NOUN-FROM-ADJECTIVE-METHOD", 1, 1, false);
        declareFunction(me, "passed_preds_succeed_method", "PASSED-PREDS-SUCCEED-METHOD", 1, 1, false);
        declareFunction(me, "any_preds_succeed_method", "ANY-PREDS-SUCCEED-METHOD", 1, 1, false);
        declareFunction(me, "pph_string_for_term", "PPH-STRING-FOR-TERM", 1, 3, false);
        declareFunction(me, "pph_string_pred_pairs_for_term", "PPH-STRING-PRED-PAIRS-FOR-TERM", 1, 3, false);
        declareFunction(me, "pph_lexifications_for_term", "PPH-LEXIFICATIONS-FOR-TERM", 1, 2, false);
        declareFunction(me, "clear_pph_lexification_preds", "CLEAR-PPH-LEXIFICATION-PREDS", 0, 0, false);
        declareFunction(me, "remove_pph_lexification_preds", "REMOVE-PPH-LEXIFICATION-PREDS", 0, 0, false);
        declareFunction(me, "pph_lexification_preds_internal", "PPH-LEXIFICATION-PREDS-INTERNAL", 0, 0, false);
        declareFunction(me, "pph_lexification_preds", "PPH-LEXIFICATION-PREDS", 0, 0, false);
        declareFunction(me, "clear_pph_arg_in_reln_preds", "CLEAR-PPH-ARG-IN-RELN-PREDS", 0, 0, false);
        declareFunction(me, "remove_pph_arg_in_reln_preds", "REMOVE-PPH-ARG-IN-RELN-PREDS", 0, 1, false);
        declareFunction(me, "pph_arg_in_reln_preds_internal", "PPH-ARG-IN-RELN-PREDS-INTERNAL", 1, 0, false);
        declareFunction(me, "pph_arg_in_reln_preds", "PPH-ARG-IN-RELN-PREDS", 0, 1, false);
        declareFunction(me, "strip_initial_word", "STRIP-INITIAL-WORD", 2, 0, false);
        declareFunction(me, "inference_strings_for_term_int", "INFERENCE-STRINGS-FOR-TERM-INT", 1, 3, false);
        declareFunction(me, "hl_justify_string_for_term", "HL-JUSTIFY-STRING-FOR-TERM", 2, 2, false);
        declareFunction(me, "all_phrases_for_term", "ALL-PHRASES-FOR-TERM", 1, 7, false);
        declareFunction(me, "all_phrases_for_formula", "ALL-PHRASES-FOR-FORMULA", 1, 4, false);
        declareFunction(me, "all_phrases_for_formula_int", "ALL-PHRASES-FOR-FORMULA-INT", 5, 0, false);
        declareFunction(me, "names_for_term", "NAMES-FOR-TERM", 1, 3, false);
        declareFunction(me, "some_name_for_term", "SOME-NAME-FOR-TERM", 1, 2, false);
        declareFunction(me, "pragmatic_attribute_of_denotation", "PRAGMATIC-ATTRIBUTE-OF-DENOTATION", 4, 0, false);
        declareFunction(me, "inappropriate_word_for_conceptP", "INAPPROPRIATE-WORD-FOR-CONCEPT?", 3, 1, false);
        declareFunction(me, "preferred_words_for_term", "PREFERRED-WORDS-FOR-TERM", 1, 0, false);
        declareFunction(me, "pph_first_string_of_wordXspeech_part", "PPH-FIRST-STRING-OF-WORD&SPEECH-PART", 2, 2, false);
        declareFunction(me, "pph_prefer_pos_predP", "PPH-PREFER-POS-PRED?", 2, 0, false);
        declareFunction(me, "pph_get_strings_of_type", "PPH-GET-STRINGS-OF-TYPE", 2, 0, false);
        declareFunction(me, "pph_preds_of_stringXword", "PPH-PREDS-OF-STRING&WORD", 2, 0, false);
        declareFunction(me, "pph_first_string_of_wordXpred_internal", "PPH-FIRST-STRING-OF-WORD&PRED-INTERNAL", 3, 3, false);
        declareFunction(me, "pph_first_string_of_wordXpred", "PPH-FIRST-STRING-OF-WORD&PRED", 3, 3, false);
        declareFunction(me, "pph_first_coerced_string_of_wordXpred_internal", "PPH-FIRST-COERCED-STRING-OF-WORD&PRED-INTERNAL", 3, 2, false);
        declareFunction(me, "pph_first_coerced_string_of_wordXpred", "PPH-FIRST-COERCED-STRING-OF-WORD&PRED", 3, 2, false);
        declareFunction(me, "pph_coerced_preds_for_pred_internal", "PPH-COERCED-PREDS-FOR-PRED-INTERNAL", 1, 2, false);
        declareFunction(me, "pph_coerced_preds_for_pred", "PPH-COERCED-PREDS-FOR-PRED", 1, 2, false);
        declareFunction(me, "preds_coercible_to_pred", "PREDS-COERCIBLE-TO-PRED", 1, 2, false);
        declareFunction(me, "derivational_suffixes_from_pred_to_pred", "DERIVATIONAL-SUFFIXES-FROM-PRED-TO-PRED", 2, 1, false);
        declareFunction(me, "preds_derivable_to_pred", "PREDS-DERIVABLE-TO-PRED", 1, 1, false);
        declareFunction(me, "pph_pronoun_agr_p", "PPH-PRONOUN-AGR-P", 1, 0, false);
        declareFunction(me, "pph_pronoun_agr_personP", "PPH-PRONOUN-AGR-PERSON?", 1, 0, false);
        declareFunction(me, "pph_known_pronoun_agr_personP", "PPH-KNOWN-PRONOUN-AGR-PERSON?", 1, 0, false);
        declareFunction(me, "pph_pronoun_agr_numberP", "PPH-PRONOUN-AGR-NUMBER?", 1, 0, false);
        declareFunction(me, "pph_known_pronoun_agr_numberP", "PPH-KNOWN-PRONOUN-AGR-NUMBER?", 1, 0, false);
        declareFunction(me, "pph_pronoun_agr_genderP", "PPH-PRONOUN-AGR-GENDER?", 1, 0, false);
        declareFunction(me, "pph_known_pronoun_agr_genderP", "PPH-KNOWN-PRONOUN-AGR-GENDER?", 1, 0, false);
        declareFunction(me, "new_unspecified_pph_pronoun_agr", "NEW-UNSPECIFIED-PPH-PRONOUN-AGR", 0, 0, false);
        declareFunction(me, "new_pph_pronoun_agr", "NEW-PPH-PRONOUN-AGR", 3, 0, false);
        declareFunction(me, "pph_pronoun_agr_person", "PPH-PRONOUN-AGR-PERSON", 1, 0, false);
        declareFunction(me, "pph_pronoun_agr_number", "PPH-PRONOUN-AGR-NUMBER", 1, 0, false);
        declareFunction(me, "pph_pronoun_agr_gender", "PPH-PRONOUN-AGR-GENDER", 1, 0, false);
        declareFunction(me, "pph_pronoun_agr_set_person", "PPH-PRONOUN-AGR-SET-PERSON", 2, 0, false);
        declareFunction(me, "pph_pronoun_agr_set_number", "PPH-PRONOUN-AGR-SET-NUMBER", 2, 0, false);
        declareFunction(me, "pph_pronoun_agr_set_gender", "PPH-PRONOUN-AGR-SET-GENDER", 2, 0, false);
        declareFunction(me, "pph_pronoun_agr_for_cycl", "PPH-PRONOUN-AGR-FOR-CYCL", 1, 0, false);
        declareFunction(me, "pph_genders_compatibleP", "PPH-GENDERS-COMPATIBLE?", 2, 0, false);
        declareFunction(me, "pph_generate_pronoun", "PPH-GENERATE-PRONOUN", 1, 0, false);
        declareFunction(me, "pph_introduce_reflexive", "PPH-INTRODUCE-REFLEXIVE", 1, 0, false);
        declareFunction(me, "pph_subjectP", "PPH-SUBJECT?", 1, 0, false);
        declareFunction(me, "pph_maybe_ambiguous_pronounP", "PPH-MAYBE-AMBIGUOUS-PRONOUN?", 1, 0, false);
        declareFunction(me, "pph_generate_anaphor", "PPH-GENERATE-ANAPHOR", 2, 0, false);
        declareFunction(me, "pph_resolve_pronoun", "PPH-RESOLVE-PRONOUN", 2, 0, false);
        declareFunction(me, "pronoun_proper_genls", "PRONOUN-PROPER-GENLS", 1, 1, false);
        declareFunction(me, "pronoun_specP", "PRONOUN-SPEC?", 1, 1, false);
        declareFunction(me, "agr_pred_from_pronoun_agr", "AGR-PRED-FROM-PRONOUN-AGR", 1, 0, false);
        declareFunction(me, "pph_pronoun_wu", "PPH-PRONOUN-WU", 1, 0, false);
        declareFunction(me, "case_is_irrelevantP", "CASE-IS-IRRELEVANT?", 1, 0, false);
        declareFunction(me, "pph_pronoun_nart", "PPH-PRONOUN-NART", 2, 0, false);
        declareFunction(me, "pph_pronoun_type", "PPH-PRONOUN-TYPE", 1, 0, false);
        declareFunction(me, "pph_phrase_resolve_string_from_word", "PPH-PHRASE-RESOLVE-STRING-FROM-WORD", 1, 1, false);
        declareFunction(me, "pph_phrase_resolve_lexical_alternatives", "PPH-PHRASE-RESOLVE-LEXICAL-ALTERNATIVES", 6, 0, false);
        declareFunction(me, "pph_phrase_update_with_stringXpred_from_word", "PPH-PHRASE-UPDATE-WITH-STRING&PRED-FROM-WORD", 3, 0, false);
        declareFunction(me, "pph_forbidden_string_for_phraseP", "PPH-FORBIDDEN-STRING-FOR-PHRASE?", 2, 0, false);
        declareFunction(me, "pph_determiner_preds", "PPH-DETERMINER-PREDS", 2, 0, false);
        declareFunction(me, "all_phrases_neg_test", "ALL-PHRASES-NEG-TEST", 2, 0, false);
        declareFunction(me, "all_phrases_test", "ALL-PHRASES-TEST", 2, 0, false);
        declareFunction(me, "all_phrases_for_term_neg", "ALL-PHRASES-FOR-TERM-NEG", 1, 5, false);
        declareFunction(me, "test_generate_phrase_from_lexification_sentence", "TEST-GENERATE-PHRASE-FROM-LEXIFICATION-SENTENCE", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_pph_methods_lexicon_file() {
        deflexical("*PPH-LEXIFICATION-PREDS-CACHING-STATE*", NIL);
        deflexical("*PPH-ARG-IN-RELN-PREDS-CACHING-STATE*", NIL);
        return NIL;
    }

    public static SubLObject setup_pph_methods_lexicon_file() {
        memoization_state.note_memoized_function(PGU_ASSERTIONS_FOR_TERM);
        memoization_state.note_memoized_function(GENERATE_PHRASES_FROM_AS);
        memoization_state.note_memoized_function(GENERATE_PHRASE_FROM_AS);
        memoization_state.note_memoized_function(GENERATE_PHRASE_FROM_LEXIFICATION_SENTENCE_MEMOIZED);
        memoization_state.note_globally_cached_function(PPH_LEXIFICATION_PREDS);
        memoization_state.note_globally_cached_function(PPH_ARG_IN_RELN_PREDS);
        memoization_state.note_memoized_function($sym122$PPH_FIRST_STRING_OF_WORD_PRED);
        memoization_state.note_memoized_function($sym129$PPH_FIRST_COERCED_STRING_OF_WORD_PRED);
        memoization_state.note_memoized_function(PPH_COERCED_PREDS_FOR_PRED);
        pph_types.pph_register_method(PPH_GENERATE_PRONOUN, $DISCOURSE_PARTICIPANT, $BEST);
        define_test_case_table_int(ALL_PHRASES_FOR_TERM, list(new SubLObject[]{ $TEST, ALL_PHRASES_TEST, $OWNER, NIL, $CLASSES, $list190, $KB, $FULL, $WORKING_, T }), $list194);
        define_test_case_table_int(ALL_PHRASES_FOR_TERM_NEG, list(new SubLObject[]{ $TEST, ALL_PHRASES_NEG_TEST, $OWNER, NIL, $CLASSES, $list190, $KB, $FULL, $WORKING_, T }), $list197);
        define_test_case_table_int($sym182$PPH_FIRST_STRING_OF_WORD_SPEECH_PART, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, $list190, $KB, $FULL, $WORKING_, T }), $list198);
        define_test_case_table_int(TEST_GENERATE_PHRASE_FROM_LEXIFICATION_SENTENCE, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, $list190, $KB, $FULL, $WORKING_, T }), $list200);
        return NIL;
    }

    private static SubLObject _constant_198_initializer() {
        return list(new SubLObject[]{ list(list(reader_make_constant_shell(makeString("Yes-TheWord")), reader_make_constant_shell(makeString("Interjection-SpeechPart")), makeKeyword("ANY"), reader_make_constant_shell(makeString("CyclishParaphraseMt"))), makeString("yes"), reader_make_constant_shell(makeString("wordStrings"))), list(list(reader_make_constant_shell(makeString("Great-TheWord")), reader_make_constant_shell(makeString("Adjective")), list(reader_make_constant_shell(makeString("comparativeDegree"))), reader_make_constant_shell(makeString("CyclishParaphraseMt"))), makeString("greater"), reader_make_constant_shell(makeString("comparativeDegree"))), list(list(reader_make_constant_shell(makeString("Slow-TheWord")), reader_make_constant_shell(makeString("Adverb")), list(reader_make_constant_shell(makeString("comparativeAdverb"))), reader_make_constant_shell(makeString("CyclishParaphraseMt"))), makeString("slower"), reader_make_constant_shell(makeString("comparativeAdverb"))), list(list(reader_make_constant_shell(makeString("Time-TheWord")), reader_make_constant_shell(makeString("CountNoun")), list(reader_make_constant_shell(makeString("massNumber"))), reader_make_constant_shell(makeString("CyclishParaphraseMt"))), makeString("time"), reader_make_constant_shell(makeString("massNumber"))), list(list(reader_make_constant_shell(makeString("Time-TheWord")), reader_make_constant_shell(makeString("CountNoun")), list(reader_make_constant_shell(makeString("massNumber-Generic"))), reader_make_constant_shell(makeString("CyclishParaphraseMt"))), makeString("time"), reader_make_constant_shell(makeString("massNumber"))), list(list(reader_make_constant_shell(makeString("Time-TheWord")), reader_make_constant_shell(makeString("CountNoun")), list(reader_make_constant_shell(makeString("pnSingular"))), reader_make_constant_shell(makeString("CyclishParaphraseMt"))), makeString("Time"), reader_make_constant_shell(makeString("pnSingular"))), list(list(reader_make_constant_shell(makeString("Time-TheWord")), reader_make_constant_shell(makeString("CountNoun")), list(reader_make_constant_shell(makeString("pnPlural"))), reader_make_constant_shell(makeString("CyclishParaphraseMt"))), makeString("Times"), reader_make_constant_shell(makeString("pnPlural"))), list(list(reader_make_constant_shell(makeString("Time-TheWord")), reader_make_constant_shell(makeString("CountNoun")), list(reader_make_constant_shell(makeString("pnNonPlural-Generic"))), reader_make_constant_shell(makeString("CyclishParaphraseMt"))), makeString("Time"), reader_make_constant_shell(makeString("pnSingular"))), list(list(reader_make_constant_shell(makeString("Time-TheWord")), reader_make_constant_shell(makeString("CountNoun")), list(reader_make_constant_shell(makeString("properNounStrings"))), reader_make_constant_shell(makeString("CyclishParaphraseMt"))), makeString("Time"), reader_make_constant_shell(makeString("pnSingular"))), list(list(reader_make_constant_shell(makeString("Call-TheWord")), reader_make_constant_shell(makeString("Verb")), list(reader_make_constant_shell(makeString("nonSingular-Generic"))), reader_make_constant_shell(makeString("CyclishParaphraseMt"))), makeString("calling"), reader_make_constant_shell(makeString("gerund"))), list(list(reader_make_constant_shell(makeString("Get-TheWord")), reader_make_constant_shell(makeString("Verb")), list(reader_make_constant_shell(makeString("thirdPersonSg-Present"))), reader_make_constant_shell(makeString("CyclishParaphraseMt"))), makeString("gets"), reader_make_constant_shell(makeString("thirdPersonSg-Present"))), list(list(reader_make_constant_shell(makeString("Play-TheWord")), reader_make_constant_shell(makeString("AgentiveNoun")), list(reader_make_constant_shell(makeString("nonPlural-Generic"))), reader_make_constant_shell(makeString("CyclishParaphraseMt"))), makeString("player"), reader_make_constant_shell(makeString("agentive-Sg"))), list(list(reader_make_constant_shell(makeString("Their-TheWord")), reader_make_constant_shell(makeString("PossessivePronoun")), makeKeyword("ANY"), reader_make_constant_shell(makeString("CyclishParaphraseMt"))), makeString("their"), reader_make_constant_shell(makeString("pronounStrings"))), list(list(reader_make_constant_shell(makeString("Their-TheWord")), reader_make_constant_shell(makeString("Determiner-Definite")), makeKeyword("ANY"), reader_make_constant_shell(makeString("CyclishParaphraseMt"))), makeString("their"), reader_make_constant_shell(makeString("determinerStrings"))), list(list(reader_make_constant_shell(makeString("Group-TheWord")), reader_make_constant_shell(makeString("CountNoun")), list(reader_make_constant_shell(makeString("singular"))), reader_make_constant_shell(makeString("CyclishParaphraseMt"))), makeString("group"), reader_make_constant_shell(makeString("singular"))), list(list(reader_make_constant_shell(makeString("Child-TheWord")), reader_make_constant_shell(makeString("CountNoun")), list(reader_make_constant_shell(makeString("singular"))), reader_make_constant_shell(makeString("CyclishParaphraseMt"))), makeString("child"), reader_make_constant_shell(makeString("singular"))), list(list(reader_make_constant_shell(makeString("Increase-TheWord")), reader_make_constant_shell(makeString("CountNoun")), list(reader_make_constant_shell(makeString("singular"))), reader_make_constant_shell(makeString("CyclishParaphraseMt"))), makeString("increase"), reader_make_constant_shell(makeString("singular"))), list(list(reader_make_constant_shell(makeString("Process-TheWord")), reader_make_constant_shell(makeString("CountNoun")), list(reader_make_constant_shell(makeString("simpleNounStrings"))), reader_make_constant_shell(makeString("CyclishParaphraseMt"))), makeString("process"), reader_make_constant_shell(makeString("singular"))), list(list(reader_make_constant_shell(makeString("Cyclist-TheWord")), reader_make_constant_shell(makeString("CountNoun")), list(reader_make_constant_shell(makeString("singular"))), reader_make_constant_shell(makeString("CyclishParaphraseMt"))), makeString("cyclist"), reader_make_constant_shell(makeString("singular"))), list(list(reader_make_constant_shell(makeString("Enter-TheWord")), reader_make_constant_shell(makeString("AgentiveNoun")), list(reader_make_constant_shell(makeString("agentiveNounStrings")), reader_make_constant_shell(makeString("nonPlural-Generic"))), reader_make_constant_shell(makeString("CyclishParaphraseMt"))), makeString("enterer"), reader_make_constant_shell(makeString("agentive-Sg"))), list(list(reader_make_constant_shell(makeString("Every-TheWord")), reader_make_constant_shell(makeString("Determiner")), makeKeyword("ANY"), reader_make_constant_shell(makeString("CyclishParaphraseMt"))), makeString("every"), reader_make_constant_shell(makeString("determinerStrings"))), list(list(reader_make_constant_shell(makeString("Fox-TheWord")), reader_make_constant_shell(makeString("CountNoun")), list(reader_make_constant_shell(makeString("plural"))), reader_make_constant_shell(makeString("CyclishParaphraseMt"))), makeString("foxes"), reader_make_constant_shell(makeString("plural"))), list(list(reader_make_constant_shell(makeString("Color-TheWord")), reader_make_constant_shell(makeString("CountNoun")), list(reader_make_constant_shell(makeString("singular"))), reader_make_constant_shell(makeString("CyclishParaphraseMt"))), makeString("color"), reader_make_constant_shell(makeString("singular"))), list(list(reader_make_constant_shell(makeString("Blue-TheWord")), reader_make_constant_shell(makeString("Adjective")), list(reader_make_constant_shell(makeString("regularDegree"))), reader_make_constant_shell(makeString("CyclishParaphraseMt"))), makeString("blue"), reader_make_constant_shell(makeString("regularDegree"))), list(list(reader_make_constant_shell(makeString("Blue-TheWord")), reader_make_constant_shell(makeString("Adjective")), makeKeyword("ANY"), reader_make_constant_shell(makeString("CyclishParaphraseMt"))), makeString("blue"), reader_make_constant_shell(makeString("regularDegree"))), list(list(reader_make_constant_shell(makeString("Fox-TheWord")), reader_make_constant_shell(makeString("CountNoun")), list(reader_make_constant_shell(makeString("singular"))), reader_make_constant_shell(makeString("CyclishParaphraseMt"))), makeString("fox"), reader_make_constant_shell(makeString("singular"))), list(list(reader_make_constant_shell(makeString("Fox-TheWord")), reader_make_constant_shell(makeString("CountNoun")), list(reader_make_constant_shell(makeString("simpleNounStrings"))), reader_make_constant_shell(makeString("CyclishParaphraseMt"))), makeString("fox"), reader_make_constant_shell(makeString("singular"))), list(list(reader_make_constant_shell(makeString("Do-TheWord")), makeKeyword("ANY"), list(reader_make_constant_shell(makeString("pluralVerb-Present"))), reader_make_constant_shell(makeString("CyclishParaphraseMt"))), makeString("do"), reader_make_constant_shell(makeString("pluralVerb-Present"))), list(list(reader_make_constant_shell(makeString("Fungus-TheWord")), reader_make_constant_shell(makeString("MassNoun")), list(reader_make_constant_shell(makeString("massNumber"))), reader_make_constant_shell(makeString("CyclishParaphraseMt"))), makeString("fungus"), reader_make_constant_shell(makeString("massNumber"))), list(list(reader_make_constant_shell(makeString("Eat-TheWord")), reader_make_constant_shell(makeString("Verb")), list(reader_make_constant_shell(makeString("infinitive"))), reader_make_constant_shell(makeString("CyclishParaphraseMt"))), makeString("eat"), reader_make_constant_shell(makeString("infinitive"))), list(list(reader_make_constant_shell(makeString("Number-TheWord")), reader_make_constant_shell(makeString("Determiner")), makeKeyword("ANY"), reader_make_constant_shell(makeString("CyclishParaphraseMt"))), makeString("numerous"), reader_make_constant_shell(makeString("determinerStrings"))), list(list(reader_make_constant_shell(makeString("Many-TheWord")), reader_make_constant_shell(makeString("Determiner")), makeKeyword("ANY"), reader_make_constant_shell(makeString("CyclishParaphraseMt"))), makeString("many"), reader_make_constant_shell(makeString("determinerStrings"))), list(list(reader_make_constant_shell(makeString("Child-TheWord")), reader_make_constant_shell(makeString("CountNoun")), list(reader_make_constant_shell(makeString("plural"))), reader_make_constant_shell(makeString("CyclishParaphraseMt"))), makeString("children"), reader_make_constant_shell(makeString("plural"))), list(list(reader_make_constant_shell(makeString("Speak-TheWord")), reader_make_constant_shell(makeString("Verb")), list(reader_make_constant_shell(makeString("infinitive"))), reader_make_constant_shell(makeString("CyclishParaphraseMt"))), makeString("speak"), reader_make_constant_shell(makeString("infinitive"))), list(list(reader_make_constant_shell(makeString("Do-TheWord")), makeKeyword("ANY"), list(reader_make_constant_shell(makeString("thirdPersonSg-Present"))), reader_make_constant_shell(makeString("CyclishParaphraseMt"))), makeString("does"), reader_make_constant_shell(makeString("thirdPersonSg-Present"))), list(list(reader_make_constant_shell(makeString("Like-TheWord")), reader_make_constant_shell(makeString("Verb")), list(reader_make_constant_shell(makeString("infinitive"))), reader_make_constant_shell(makeString("CyclishParaphraseMt"))), makeString("like"), reader_make_constant_shell(makeString("infinitive"))), list(list(reader_make_constant_shell(makeString("Year-TheWord")), reader_make_constant_shell(makeString("CountNoun")), list(reader_make_constant_shell(makeString("simpleNounStrings"))), reader_make_constant_shell(makeString("CyclishParaphraseMt"))), makeString("year"), reader_make_constant_shell(makeString("singular"))), list(list(reader_make_constant_shell(makeString("Day-TheWord")), reader_make_constant_shell(makeString("CountNoun")), list(reader_make_constant_shell(makeString("singular"))), reader_make_constant_shell(makeString("CyclishParaphraseMt"))), makeString("day"), reader_make_constant_shell(makeString("singular"))), list(list(reader_make_constant_shell(makeString("Dog-TheWord")), reader_make_constant_shell(makeString("CountNoun")), list(reader_make_constant_shell(makeString("singular"))), reader_make_constant_shell(makeString("CyclishParaphraseMt"))), makeString("dog"), reader_make_constant_shell(makeString("singular"))), list(list(reader_make_constant_shell(makeString("No-TheWord")), reader_make_constant_shell(makeString("Determiner")), makeKeyword("ANY"), reader_make_constant_shell(makeString("CyclishParaphraseMt"))), makeString("no"), reader_make_constant_shell(makeString("determinerStrings"))), list(list(reader_make_constant_shell(makeString("Emu-TheWord")), reader_make_constant_shell(makeString("CountNoun")), list(reader_make_constant_shell(makeString("singular"))), reader_make_constant_shell(makeString("CyclishParaphraseMt"))), makeString("emu"), reader_make_constant_shell(makeString("singular"))), list(list(reader_make_constant_shell(makeString("Include-TheWord")), reader_make_constant_shell(makeString("Verb")), list(reader_make_constant_shell(makeString("thirdPersonSg-Present"))), reader_make_constant_shell(makeString("CyclishParaphraseMt"))), makeString("includes"), reader_make_constant_shell(makeString("thirdPersonSg-Present"))), list(list(reader_make_constant_shell(makeString("Mile-TheWord")), reader_make_constant_shell(makeString("CountNoun")), list(reader_make_constant_shell(makeString("plural"))), reader_make_constant_shell(makeString("CyclishParaphraseMt"))), makeString("miles"), reader_make_constant_shell(makeString("plural"))), list(list(reader_make_constant_shell(makeString("Mile-TheWord")), reader_make_constant_shell(makeString("CountNoun")), list(reader_make_constant_shell(makeString("singular"))), reader_make_constant_shell(makeString("CyclishParaphraseMt"))), makeString("mile"), reader_make_constant_shell(makeString("singular"))), list(list(reader_make_constant_shell(makeString("Meter-TheWord")), reader_make_constant_shell(makeString("CountNoun")), list(reader_make_constant_shell(makeString("singular"))), reader_make_constant_shell(makeString("CyclishParaphraseMt"))), makeString("meter"), reader_make_constant_shell(makeString("singular"))), list(list(reader_make_constant_shell(makeString("Minute-TheWord")), reader_make_constant_shell(makeString("CountNoun")), list(reader_make_constant_shell(makeString("singular"))), reader_make_constant_shell(makeString("CyclishParaphraseMt"))), makeString("minute"), reader_make_constant_shell(makeString("singular"))), list(list(reader_make_constant_shell(makeString("Meter-TheWord")), reader_make_constant_shell(makeString("CountNoun")), list(reader_make_constant_shell(makeString("plural"))), reader_make_constant_shell(makeString("CyclishParaphraseMt"))), makeString("meters"), reader_make_constant_shell(makeString("plural"))), list(list(reader_make_constant_shell(makeString("Concept-TheWord")), reader_make_constant_shell(makeString("CountNoun")), list(reader_make_constant_shell(makeString("singular"))), reader_make_constant_shell(makeString("CyclishParaphraseMt"))), makeString("concept"), reader_make_constant_shell(makeString("singular"))), list(list(reader_make_constant_shell(makeString("Set-TheWord")), reader_make_constant_shell(makeString("CountNoun")), list(reader_make_constant_shell(makeString("singular"))), reader_make_constant_shell(makeString("CyclishParaphraseMt"))), makeString("set"), reader_make_constant_shell(makeString("singular"))), list(list(reader_make_constant_shell(makeString("Number-TheWord")), reader_make_constant_shell(makeString("CountNoun")), list(reader_make_constant_shell(makeString("singular"))), reader_make_constant_shell(makeString("CyclishParaphraseMt"))), makeString("number"), reader_make_constant_shell(makeString("singular"))), list(list(reader_make_constant_shell(makeString("Integer-TheWord")), reader_make_constant_shell(makeString("CountNoun")), list(reader_make_constant_shell(makeString("singular"))), reader_make_constant_shell(makeString("CyclishParaphraseMt"))), makeString("integer"), reader_make_constant_shell(makeString("singular"))), list(list(reader_make_constant_shell(makeString("Integer-TheWord")), reader_make_constant_shell(makeString("CountNoun")), list(reader_make_constant_shell(makeString("plural"))), reader_make_constant_shell(makeString("CyclishParaphraseMt"))), makeString("integers"), reader_make_constant_shell(makeString("plural"))), list(list(reader_make_constant_shell(makeString("Value-TheWord")), reader_make_constant_shell(makeString("CountNoun")), list(reader_make_constant_shell(makeString("simpleNounStrings"))), reader_make_constant_shell(makeString("CyclishParaphraseMt"))), makeString("value"), reader_make_constant_shell(makeString("singular"))), list(list(reader_make_constant_shell(makeString("Be-TheWord")), reader_make_constant_shell(makeString("Verb")), list(reader_make_constant_shell(makeString("pluralVerb-Present"))), reader_make_constant_shell(makeString("CyclishParaphraseMt"))), makeString("are"), reader_make_constant_shell(makeString("pluralVerb-Present"))), list(list(reader_make_constant_shell(makeString("Be-TheWord")), reader_make_constant_shell(makeString("Verb")), list(reader_make_constant_shell(makeString("futureTense-Generic"))), list(reader_make_constant_shell(makeString("MtUnionFn")), reader_make_constant_shell(makeString("CyclishParaphraseMt")))), makeString("will be"), reader_make_constant_shell(makeString("simpleFuture-Generic"))), list(list(reader_make_constant_shell(makeString("Thing-TheWord")), reader_make_constant_shell(makeString("CountNoun")), list(reader_make_constant_shell(makeString("plural"))), reader_make_constant_shell(makeString("CyclishParaphraseMt"))), makeString("things"), reader_make_constant_shell(makeString("plural"))), list(list(reader_make_constant_shell(makeString("Some-TheWord")), reader_make_constant_shell(makeString("Determiner")), makeKeyword("ANY"), reader_make_constant_shell(makeString("CyclishParaphraseMt"))), makeString("some"), reader_make_constant_shell(makeString("determinerStrings"))), list(list(reader_make_constant_shell(makeString("Kind-TheWord")), reader_make_constant_shell(makeString("CountNoun")), list(reader_make_constant_shell(makeString("singular"))), reader_make_constant_shell(makeString("CyclishParaphraseMt"))), makeString("kind"), reader_make_constant_shell(makeString("singular"))), list(list(reader_make_constant_shell(makeString("Instance-TheWord")), reader_make_constant_shell(makeString("CountNoun-Generic")), list(reader_make_constant_shell(makeString("singular")), reader_make_constant_shell(makeString("singular-Generic"))), reader_make_constant_shell(makeString("CyclishParaphraseMt"))), makeString("instance"), reader_make_constant_shell(makeString("singular"))), list(list(reader_make_constant_shell(makeString("Predicate-TheWord")), reader_make_constant_shell(makeString("CountNoun")), list(reader_make_constant_shell(makeString("singular"))), reader_make_constant_shell(makeString("CyclishParaphraseMt"))), makeString("predicate"), reader_make_constant_shell(makeString("singular"))), list(list(reader_make_constant_shell(makeString("Be-TheWord")), reader_make_constant_shell(makeString("Verb")), list(reader_make_constant_shell(makeString("thirdPersonSg-Present"))), reader_make_constant_shell(makeString("CyclishParaphraseMt"))), makeString("is"), reader_make_constant_shell(makeString("thirdPersonSg-Present"))), list(list(reader_make_constant_shell(makeString("The-TheWord")), reader_make_constant_shell(makeString("Determiner-Definite")), makeKeyword("ANY"), reader_make_constant_shell(makeString("CyclishParaphraseMt"))), makeString("the"), reader_make_constant_shell(makeString("determinerStrings"))), list(list(reader_make_constant_shell(makeString("Thing-TheWord")), reader_make_constant_shell(makeString("CountNoun")), list(reader_make_constant_shell(makeString("singular"))), reader_make_constant_shell(makeString("CyclishParaphraseMt"))), makeString("thing"), reader_make_constant_shell(makeString("singular"))), list(list(reader_make_constant_shell(makeString("False-TheWord")), reader_make_constant_shell(makeString("Adjective")), list(reader_make_constant_shell(makeString("adjStrings"))), reader_make_constant_shell(makeString("CyclishParaphraseMt"))), makeString("false"), reader_make_constant_shell(makeString("regularDegree"))), list(list(reader_make_constant_shell(makeString("True-TheWord")), reader_make_constant_shell(makeString("Adjective")), list(reader_make_constant_shell(makeString("adjStrings"))), reader_make_constant_shell(makeString("CyclishParaphraseMt"))), makeString("true"), reader_make_constant_shell(makeString("regularDegree"))), list(list(reader_make_constant_shell(makeString("Know-TheWord")), reader_make_constant_shell(makeString("MassNoun")), list(reader_make_constant_shell(makeString("massNumber"))), reader_make_constant_shell(makeString("CyclishParaphraseMt"))), makeString("knowledge"), reader_make_constant_shell(makeString("massNumber"))), list(list(reader_make_constant_shell(makeString("Type-TheWord")), reader_make_constant_shell(makeString("CountNoun")), list(reader_make_constant_shell(makeString("simpleNounStrings"))), reader_make_constant_shell(makeString("CyclishParaphraseMt"))), makeString("type"), reader_make_constant_shell(makeString("singular"))) });
    }

    @Override
    public void declareFunctions() {
        declare_pph_methods_lexicon_file();
    }

    @Override
    public void initializeVariables() {
        init_pph_methods_lexicon_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_pph_methods_lexicon_file();
    }

    

    public static final class $preferred_gen_unit_method$UnaryFunction extends UnaryFunction {
        public $preferred_gen_unit_method$UnaryFunction() {
            super(extractFunctionNamed("PREFERRED-GEN-UNIT-METHOD"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return preferred_gen_unit_method(arg1, pph_methods_lexicon.$preferred_gen_unit_method$UnaryFunction.UNPROVIDED);
        }
    }

    public static final class $preferred_gen_unit_method$BinaryFunction extends BinaryFunction {
        public $preferred_gen_unit_method$BinaryFunction() {
            super(extractFunctionNamed("PREFERRED-GEN-UNIT-METHOD"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return preferred_gen_unit_method(arg1, arg2);
        }
    }

    public static final class $preferred_lexification_method$UnaryFunction extends UnaryFunction {
        public $preferred_lexification_method$UnaryFunction() {
            super(extractFunctionNamed("PREFERRED-LEXIFICATION-METHOD"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return preferred_lexification_method(arg1, pph_methods_lexicon.$preferred_lexification_method$UnaryFunction.UNPROVIDED, pph_methods_lexicon.$preferred_lexification_method$UnaryFunction.UNPROVIDED);
        }
    }

    public static final class $preferred_lexification_method$BinaryFunction extends BinaryFunction {
        public $preferred_lexification_method$BinaryFunction() {
            super(extractFunctionNamed("PREFERRED-LEXIFICATION-METHOD"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return preferred_lexification_method(arg1, arg2, pph_methods_lexicon.$preferred_lexification_method$BinaryFunction.UNPROVIDED);
        }
    }
}

/**
 * Total time: 4091 ms
 */

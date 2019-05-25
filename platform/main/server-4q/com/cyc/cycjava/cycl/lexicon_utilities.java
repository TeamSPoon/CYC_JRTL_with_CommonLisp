package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_methods;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class lexicon_utilities
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.lexicon_utilities";
  public static final String myFingerPrint = "d190f1a27c78baecc0beba2164417f24bac7a115259053bc0cf85e867bded98a";
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 2661L)
  private static SubLSymbol $nonstandard_nominal_preds$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 10924L)
  private static SubLSymbol $preds_of_pos_cached_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 13031L)
  private static SubLSymbol $preds_licensed_by_pos_cached_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 16373L)
  private static SubLSymbol $spp_more_basicP_cached_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 20658L)
  private static SubLSymbol $det_denot_is_scalar_intervalP_cached_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 21452L)
  private static SubLSymbol $bar_level_cached_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 22206L)
  private static SubLSymbol $pos_of_cat_cached_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 25399L)
  private static SubLSymbol $denotatum_arg_of_pred_cached_int_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 25792L)
  private static SubLSymbol $semtrans_arg_of_pred_cached_int_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 26357L)
  private static SubLSymbol $preds_to_pos_args$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 27730L)
  private static SubLSymbol $get_pos_arg_of_pred_int_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 28369L)
  private static SubLSymbol $frame_arg_of_pred_cached_int_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 29162L)
  private static SubLSymbol $wu_arg_of_pred_cached_int_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 29751L)
  private static SubLSymbol $sense_arg_of_pred_cached_int_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 30424L)
  private static SubLSymbol $stringlist_args_of_pred_cached_int_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 36820L)
  private static SubLSymbol $proper_to_common_pred_map$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 57787L)
  private static SubLSymbol $non_categorizing_nl_pred_types$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 61073L)
  private static SubLSymbol $lexification_pred_types$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 62347L)
  private static SubLSymbol $cached_lexifications_for_term_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 93748L)
  private static SubLSymbol $stop_word_closed_class_exceptions$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 93886L)
  private static SubLSymbol $stop_word_closed_class_exception_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 94391L)
  private static SubLSymbol $semtrans_frame_keywords$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 97003L)
  private static SubLSymbol $lexicons_to_languages$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 99335L)
  private static SubLSymbol $lexical_mt_for_language_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 99553L)
  private static SubLSymbol $get_language_for_code_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 99757L)
  private static SubLSymbol $get_code_for_language_caching_state$;
  private static final SubLList $list0;
  private static final SubLString $str1$MWW;
  private static final SubLSymbol $sym2$CYCL_DENOTATIONAL_TERM_P;
  private static final SubLSymbol $sym3$FORT_P;
  private static final SubLSymbol $sym4$CAR;
  private static final SubLSymbol $kw5$ANY;
  private static final SubLSymbol $sym6$STRINGP;
  private static final SubLString $str7$_MWW;
  private static final SubLString $str8$_TheWord;
  private static final SubLObject $const9$GeneralEnglishMt;
  private static final SubLSymbol $kw10$MONOTONIC;
  private static final SubLSymbol $kw11$DENOT;
  private static final SubLString $str12$;
  private static final SubLSymbol $kw13$RELATED;
  private static final SubLObject $const14$denotation;
  private static final SubLObject $const15$subcatFrame;
  private static final SubLSymbol $sym16$PREDS_OF_POS_CACHED;
  private static final SubLSymbol $sym17$_PREDS_OF_POS_CACHED_CACHING_STATE_;
  private static final SubLObject $const18$speechPartPreds;
  private static final SubLObject $const19$CountNoun;
  private static final SubLObject $const20$MassNoun;
  private static final SubLObject $const21$AgentiveNoun;
  private static final SubLObject $const22$ProperMassNoun;
  private static final SubLObject $const23$ProperCountNoun;
  private static final SubLObject $const24$Verb;
  private static final SubLObject $const25$Adjective;
  private static final SubLObject $const26$Adverb;
  private static final SubLSymbol $sym27$PREDS_LICENSED_BY_POS_CACHED;
  private static final SubLObject $const28$gerund;
  private static final SubLSymbol $sym29$SPP_MORE_BASIC_;
  private static final SubLSymbol $sym30$_PREDS_LICENSED_BY_POS_CACHED_CACHING_STATE_;
  private static final SubLInteger $int31$32;
  private static final SubLSymbol $sym32$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const33$EverythingPSC;
  private static final SubLSymbol $kw34$DEPTH;
  private static final SubLSymbol $kw35$STACK;
  private static final SubLSymbol $kw36$QUEUE;
  private static final SubLSymbol $sym37$RELEVANT_SBHL_TV_IS_GENERAL_TV;
  private static final SubLSymbol $kw38$ERROR;
  private static final SubLString $str39$_A_is_not_a__A;
  private static final SubLSymbol $sym40$SBHL_TRUE_TV_P;
  private static final SubLSymbol $kw41$CERROR;
  private static final SubLString $str42$continue_anyway;
  private static final SubLSymbol $kw43$WARN;
  private static final SubLString $str44$_A_is_not_a_valid__sbhl_type_erro;
  private static final SubLObject $const45$genlPreds;
  private static final SubLObject $const46$paraphraseCoercionAllowedFrom;
  private static final SubLString $str47$_A_is_neither_SET_P_nor_LISTP_;
  private static final SubLString $str48$attempting_to_bind_direction_link;
  private static final SubLString $str49$Node__a_does_not_pass_sbhl_type_t;
  private static final SubLObject $const50$regularSuffix;
  private static final SubLSymbol $sym51$SPEC_POS_PRED_;
  private static final SubLSymbol $sym52$KBEQ;
  private static final SubLObject $const53$termStrings;
  private static final SubLObject $const54$plural_Generic;
  private static final SubLObject $const55$nounStrings;
  private static final SubLSymbol $sym56$SPP_MORE_BASIC__CACHED;
  private static final SubLSymbol $sym57$_SPP_MORE_BASIC__CACHED_CACHING_STATE_;
  private static final SubLInteger $int58$64;
  private static final SubLList $list59;
  private static final SubLObject $const60$Determiner_Definite;
  private static final SubLObject $const61$Definite_NLAttr;
  private static final SubLObject $const62$PossessiveMarker;
  private static final SubLObject $const63$Determiner_Indefinite;
  private static final SubLObject $const64$Indefinite_NLAttr;
  private static final SubLObject $const65$BareForm_NLAttr;
  private static final SubLObject $const66$Determiner;
  private static final SubLObject $const67$NumericalQuant_NLAttrFn;
  private static final SubLSymbol $sym68$DET_DENOT_IS_SCALAR_INTERVAL__CACHED;
  private static final SubLObject $const69$ScalarInterval;
  private static final SubLSymbol $sym70$_DET_DENOT_IS_SCALAR_INTERVAL__CACHED_CACHING_STATE_;
  private static final SubLInteger $int71$128;
  private static final SubLSymbol $sym72$BAR_LEVEL_CACHED;
  private static final SubLObject $const73$PhraseFn_Bar1;
  private static final SubLObject $const74$PhraseFn;
  private static final SubLString $str75$barLevelOfPhraseType;
  private static final SubLSymbol $sym76$RELEVANT_PRED_IS_EVERYTHING;
  private static final SubLSymbol $sym77$_LEVEL;
  private static final SubLObject $const78$barLevelOfPhraseType;
  private static final SubLList $list79;
  private static final SubLString $str80$Couldn_t_determine_bar_level_for_;
  private static final SubLSymbol $sym81$_BAR_LEVEL_CACHED_CACHING_STATE_;
  private static final SubLSymbol $sym82$POS_OF_CAT_CACHED;
  private static final SubLList $list83;
  private static final SubLObject $const84$NounPhrase;
  private static final SubLObject $const85$Noun;
  private static final SubLObject $const86$PrepositionalPhrase;
  private static final SubLObject $const87$Preposition;
  private static final SubLObject $const88$PossessivePhrase;
  private static final SubLObject $const89$NLSentence;
  private static final SubLObject $const90$NLPhrase;
  private static final SubLObject $const91$NLWordForm;
  private static final SubLSymbol $sym92$_POS;
  private static final SubLObject $const93$posOfPhraseType;
  private static final SubLList $list94;
  private static final SubLSymbol $sym95$_POS_OF_CAT_CACHED_CACHING_STATE_;
  private static final SubLSymbol $kw96$GAF;
  private static final SubLSymbol $kw97$CLEARED;
  private static final SubLSymbol $sym98$DENOTATUM_ARG_OF_PRED_CACHED_INT;
  private static final SubLObject $const99$denotatumArg;
  private static final SubLSymbol $sym100$_DENOTATUM_ARG_OF_PRED_CACHED_INT_CACHING_STATE_;
  private static final SubLSymbol $sym101$SEMTRANS_ARG_OF_PRED_CACHED_INT;
  private static final SubLObject $const102$semTransArg;
  private static final SubLSymbol $sym103$_SEMTRANS_ARG_OF_PRED_CACHED_INT_CACHING_STATE_;
  private static final SubLList $list104;
  private static final SubLList $list105;
  private static final SubLList $list106;
  private static final SubLObject $const107$InferencePSC;
  private static final SubLSymbol $sym108$GET_POS_ARG_OF_PRED_INT;
  private static final SubLSymbol $sym109$_GET_POS_ARG_OF_PRED_INT_CACHING_STATE_;
  private static final SubLSymbol $sym110$FRAME_ARG_OF_PRED_CACHED_INT;
  private static final SubLObject $const111$SubcategorizationFrame;
  private static final SubLSymbol $sym112$SPEC_;
  private static final SubLSymbol $sym113$_FRAME_ARG_OF_PRED_CACHED_INT_CACHING_STATE_;
  private static final SubLObject $const114$partOfSpeech;
  private static final SubLSymbol $sym115$WU_ARG_OF_PRED_CACHED_INT;
  private static final SubLObject $const116$LexicalWord;
  private static final SubLSymbol $sym117$_WU_ARG_OF_PRED_CACHED_INT_CACHING_STATE_;
  private static final SubLSymbol $sym118$SENSE_ARG_OF_PRED_CACHED_INT;
  private static final SubLObject $const119$Integer;
  private static final SubLSymbol $sym120$_SENSE_ARG_OF_PRED_CACHED_INT_CACHING_STATE_;
  private static final SubLSymbol $sym121$STRINGLIST_ARGS_OF_PRED_CACHED_INT;
  private static final SubLList $list122;
  private static final SubLList $list123;
  private static final SubLList $list124;
  private static final SubLObject $const125$argIsa;
  private static final SubLList $list126;
  private static final SubLSymbol $sym127$_;
  private static final SubLSymbol $sym128$_STRINGLIST_ARGS_OF_PRED_CACHED_INT_CACHING_STATE_;
  private static final SubLSymbol $sym129$_;
  private static final SubLSymbol $sym130$DENOT_FORMULA_P;
  private static final SubLSymbol $sym131$EL_FORMULA_P;
  private static final SubLSymbol $kw132$POS;
  private static final SubLSymbol $kw133$PRED;
  private static final SubLSymbol $kw134$WU;
  private static final SubLSymbol $sym135$STRING_;
  private static final SubLString $str136$_;
  private static final SubLList $list137;
  private static final SubLObject $const138$ProperNoun;
  private static final SubLObject $const139$CommonNoun;
  private static final SubLObject $const140$SimpleNoun;
  private static final SubLObject $const141$singular;
  private static final SubLObject $const142$plural;
  private static final SubLObject $const143$massNumber;
  private static final SubLObject $const144$pnSingular;
  private static final SubLObject $const145$pnPlural;
  private static final SubLObject $const146$pnMassNumber;
  private static final SubLObject $const147$agentive_Sg;
  private static final SubLObject $const148$agentive_Pl;
  private static final SubLObject $const149$agentive_Mass;
  private static final SubLObject $const150$infinitive;
  private static final SubLString $str151$thirdPersonSg_Present;
  private static final SubLString $str152$thirdPersonSg_Generic;
  private static final SubLString $str153$pastTense_Universal;
  private static final SubLObject $const154$perfect;
  private static final SubLObject $const155$presentParticiple;
  private static final SubLObject $const156$regularDegree;
  private static final SubLObject $const157$comparativeDegree;
  private static final SubLObject $const158$superlativeDegree;
  private static final SubLObject $const159$nonGradableAdjectiveForm;
  private static final SubLObject $const160$regularAdverb;
  private static final SubLObject $const161$comparativeAdverb;
  private static final SubLObject $const162$superlativeAdverb;
  private static final SubLSymbol $kw163$STRING;
  private static final SubLSymbol $kw164$GREEDY;
  private static final SubLSymbol $sym165$LISTP;
  private static final SubLSymbol $sym166$FUNCTIONP;
  private static final SubLSymbol $kw167$DILIGENT;
  private static final SubLString $str168$_s_is_not_a_valid_mode_argument;
  private static final SubLSymbol $kw169$INTERVAL;
  private static final SubLString $str170$_s_is_not_a_valid_output_argument;
  private static final SubLList $list171;
  private static final SubLObject $const172$EnglishWord;
  private static final SubLSymbol $sym173$DERIVED_PRED_;
  private static final SubLString $str174$______NL_statistics______CycL__A_;
  private static final SubLSymbol $kw175$OUTPUT;
  private static final SubLString $str176$Unable_to_open__S;
  private static final SubLString $str177$__Instances_of___EnglishWord____6;
  private static final SubLString $str178$__Number_of_root_forms__________6;
  private static final SubLString $str179$____Grand_total____D____;
  private static final SubLString $str180$____Grand_total____D;
  private static final SubLString $str181$Output_in__S;
  private static final SubLString $str182$_cyc_departments_nl_doc_stats_kb;
  private static final SubLString $str183$_;
  private static final SubLString $str184$_;
  private static final SubLString $str185$_stats;
  private static final SubLObject $const186$NLPredicate;
  private static final SubLList $list187;
  private static final SubLString $str188$____Instances_of__S_;
  private static final SubLInteger $int189$40;
  private static final SubLString $str190$___A;
  private static final SubLString $str191$___6___D;
  private static final SubLString $str192$__Total_for__S___D;
  private static final SubLList $list193;
  private static final SubLObject $const194$genls;
  private static final SubLObject $const195$isa;
  private static final SubLSymbol $kw196$BREADTH;
  private static final SubLList $list197;
  private static final SubLSymbol $sym198$NUM_PREDICATE_EXTENT_INDEX;
  private static final SubLObject $const199$ProperNamePredicate_Loose;
  private static final SubLString $str200$mapping_Cyc_FORTs;
  private static final SubLSymbol $kw201$SKIP;
  private static final SubLString $str202$__LOOSE___S___D_so_far___;
  private static final SubLString $str203$__S;
  private static final SubLSymbol $sym204$THIRD;
  private static final SubLSymbol $sym205$ASSERTION_FORMULA;
  private static final SubLString $str206$____Forts_with_real_lexification_;
  private static final SubLString $str207$____Forts_with_loose_lexification;
  private static final SubLString $str208$____Forts_with_NO_lexification___;
  private static final SubLObject $const209$ParseTemplatePredicate_Reln;
  private static final SubLList $list210;
  private static final SubLSymbol $sym211$VALID_ASSERTION;
  private static final SubLSymbol $sym212$CACHED_LEXIFICATIONS_FOR_TERM;
  private static final SubLObject $const213$NLPragmaticPredicate;
  private static final SubLSymbol $sym214$_CACHED_LEXIFICATIONS_FOR_TERM_CACHING_STATE_;
  private static final SubLInteger $int215$1024;
  private static final SubLSymbol $sym216$CLEAR_CACHED_LEXIFICATIONS_FOR_TERM;
  private static final SubLObject $const217$genTemplate_QuerySentence;
  private static final SubLSymbol $kw218$TOO_MANY_TO_CHECK;
  private static final SubLSymbol $sym219$FORMULA_ARG0;
  private static final SubLObject $const220$NLSyntacticPredicate;
  private static final SubLObject $const221$LinguisticObjectType;
  private static final SubLObject $const222$CycLExpressionType;
  private static final SubLSymbol $kw223$TRUE;
  private static final SubLString $str224$genStringAssertion_Terse;
  private static final SubLObject $const225$genStringAssertion;
  private static final SubLObject $const226$genStringAssertion_Precise;
  private static final SubLObject $const227$genStringAssertion_Terse;
  private static final SubLSymbol $sym228$LEXIFICATION_SENTENCE_FROM_PREFERRED_LEXIFICATION_ASSERTION;
  private static final SubLSymbol $sym229$GAF_ARG2;
  private static final SubLSymbol $sym230$PREFER_LEXICAL_ASSERTION_;
  private static final SubLSymbol $sym231$ATOMIC_SENTENCE_;
  private static final SubLSymbol $sym232$APPEND;
  private static final SubLObject $const233$genStringAssertion_Constrained;
  private static final SubLList $list234;
  private static final SubLObject $const235$preferredNameString;
  private static final SubLSymbol $sym236$PREFER_LEXIFICATION_;
  private static final SubLSymbol $sym237$SPEC_POS_;
  private static final SubLObject $const238$Pronoun;
  private static final SubLObject $const239$QuantifyingIndexical;
  private static final SubLObject $const240$Complementizer;
  private static final SubLSymbol $sym241$UPPER_CASE_P;
  private static final SubLObject $const242$nameString;
  private static final SubLObject $const243$ProperNamePredicate_Stub;
  private static final SubLSymbol $sym244$GAF_ARG1;
  private static final SubLObject $const245$TheTerm;
  private static final SubLObject $const246$StubTerm;
  private static final SubLObject $const247$CycNounLearnerMt;
  private static final SubLObject $const248$TestingConstant;
  private static final SubLObject $const249$verbSemTrans;
  private static final SubLList $list250;
  private static final SubLString $str251$___S_in__S__;
  private static final SubLObject $const252$posForms;
  private static final SubLSymbol $kw253$APPEND;
  private static final SubLObject $const254$multiWordString;
  private static final SubLObject $const255$compoundString;
  private static final SubLString $str256$____a_has__a_denotations_in__a;
  private static final SubLString $str257$___without_appropriate___posForms;
  private static final SubLString $str258$_ke_assert____a__a___a____a__DEFA;
  private static final SubLList $list259;
  private static final SubLObject $const260$StringIndexingSlot;
  private static final SubLString $str261$___S_in__S____;
  private static final SubLSymbol $sym262$CONTROL_CHAR_P;
  private static final SubLString $str263$___S__;
  private static final SubLString $str264$__fort_type__lex_asserts__;
  private static final SubLString $str265$_s__s__s__;
  private static final SubLObject $const266$NLGenerationPredicate;
  private static final SubLObject $const267$True_JustificationTruth;
  private static final SubLSymbol $sym268$PARSE_MORPHOLOGICALLY_OPTION_P;
  private static final SubLSymbol $kw269$NOUN;
  private static final SubLSymbol $sym270$KEYWORDP;
  private static final SubLString $str271$Determiner_Central;
  private static final SubLSymbol $kw272$NEVER;
  private static final SubLObject $const273$WHWord;
  private static final SubLObject $const274$nameSpelling;
  private static final SubLSymbol $sym275$_NAME;
  private static final SubLObject $const276$NameLexicalMt;
  private static final SubLObject $const277$commonNickname;
  private static final SubLSymbol $sym278$HUMAN_MALE_GIVEN_NAME_P;
  private static final SubLSymbol $sym279$HUMAN_FEMALE_GIVEN_NAME_P;
  private static final SubLSymbol $kw280$BOTH;
  private static final SubLSymbol $kw281$MASC;
  private static final SubLSymbol $kw282$FEM;
  private static final SubLSymbol $kw283$UNKNOWN;
  private static final SubLObject $const284$HumanMaleGivenName;
  private static final SubLObject $const285$HumanFemaleGivenName;
  private static final SubLSymbol $kw286$PREFIX;
  private static final SubLSymbol $kw287$SUFFIX;
  private static final SubLObject $const288$WordWithPrefixFn;
  private static final SubLObject $const289$WordWithSuffixFn;
  private static final SubLObject $const290$AllLexicalMicrotheoryPSC;
  private static final SubLSymbol $sym291$DERIVED_WORD_;
  private static final SubLSymbol $sym292$DERIVED_WORD_AFFIX_MEMOIZED;
  private static final SubLSymbol $sym293$_AFFIX;
  private static final SubLObject $const294$derivedUsingAffix;
  private static final SubLList $list295;
  private static final SubLObject $const296$LexicalPrefix;
  private static final SubLSymbol $sym297$STOP_WORD_CLOSED_CLASS_EXCEPTION;
  private static final SubLSymbol $sym298$_STOP_WORD_CLOSED_CLASS_EXCEPTION_CACHING_STATE_;
  private static final SubLInteger $int299$100;
  private static final SubLList $list300;
  private static final SubLSymbol $kw301$IGNORE;
  private static final SubLList $list302;
  private static final SubLSymbol $kw303$FORT;
  private static final SubLList $list304;
  private static final SubLSymbol $sym305$CYCL_REPRESENTED_TERM_P;
  private static final SubLSymbol $kw306$UNINITIALIZED;
  private static final SubLSymbol $sym307$CLEAR_LEXICONS_TO_LANGUAGES;
  private static final SubLList $list308;
  private static final SubLList $list309;
  private static final SubLList $list310;
  private static final SubLList $list311;
  private static final SubLSymbol $sym312$LEXICAL_MT_FOR_LANGUAGE;
  private static final SubLSymbol $kw313$MT;
  private static final SubLObject $const314$languageHasRootLexicon;
  private static final SubLList $list315;
  private static final SubLSymbol $sym316$_LEXICAL_MT_FOR_LANGUAGE_CACHING_STATE_;
  private static final SubLInteger $int317$256;
  private static final SubLSymbol $sym318$CLEAR_LEXICAL_MT_FOR_LANGUAGE;
  private static final SubLSymbol $sym319$GET_LANGUAGE_FOR_CODE;
  private static final SubLSymbol $kw320$LANG;
  private static final SubLObject $const321$languageCodeDigraph;
  private static final SubLObject $const322$CrossLinguisticLexicalMt;
  private static final SubLSymbol $sym323$_GET_LANGUAGE_FOR_CODE_CACHING_STATE_;
  private static final SubLSymbol $sym324$GET_CODE_FOR_LANGUAGE;
  private static final SubLSymbol $kw325$CODE;
  private static final SubLList $list326;
  private static final SubLSymbol $sym327$_GET_CODE_FOR_LANGUAGE_CACHING_STATE_;

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 2948L)
  public static SubLObject mwwP(final SubLObject v_object)
  {
    return makeBoolean( NIL != constant_handles.constant_p( v_object ) && NIL == nart_handles.nart_p( v_object ) && NIL != string_utilities.ends_with( constants_high.constant_name( v_object ), $str1$MWW, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 3231L)
  public static SubLObject next_available_ws(final SubLObject word_unit, final SubLObject pos, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLObject senses = lexicon_accessors.senses_of_wuXpos( word_unit, pos, mt );
    return lowest_not_in_list( ZERO_INTEGER, senses );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 3599L)
  public static SubLObject unique_ws(final SubLObject wu, final SubLObject pos, SubLObject denot)
  {
    assert NIL != cycl_grammar.cycl_denotational_term_p( wu ) : wu;
    assert NIL != forts.fort_p( pos ) : pos;
    if( NIL == forts.fort_p( denot ) && NIL != el_utilities.possibly_naut_p( denot ) )
    {
      denot = czer_main.cyc_find_or_create_nart( denot, UNPROVIDED );
    }
    assert NIL != forts.fort_p( denot ) : denot;
    SubLObject cdolist_list_var;
    final SubLObject existing_senses = cdolist_list_var = lexicon_accessors.senses_of_wuXpos( wu, pos, UNPROVIDED );
    SubLObject sense = NIL;
    sense = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject existing_denots = Mapping.mapcar( Symbols.symbol_function( $sym4$CAR ), lexicon_accessors.denots_of_sense_by_mt( wu, pos, sense, $kw5$ANY ) );
      if( NIL != subl_promotions.memberP( denot, existing_denots, UNPROVIDED, UNPROVIDED ) )
      {
        return sense;
      }
      cdolist_list_var = cdolist_list_var.rest();
      sense = cdolist_list_var.first();
    }
    SubLObject sense2;
    for( sense2 = NIL, sense2 = ZERO_INTEGER; NIL != subl_promotions.memberP( sense2, existing_senses, UNPROVIDED, UNPROVIDED ); sense2 = Numbers.add( ONE_INTEGER, sense2 ) )
    {
    }
    return sense2;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 4636L)
  public static SubLObject ws_availableP(final SubLObject word_unit, final SubLObject pos, final SubLObject v_int, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return makeBoolean( NIL == subl_promotions.memberP( v_int, lexicon_accessors.senses_of_wuXpos( word_unit, pos, mt ), UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 4872L)
  public static SubLObject lowest_not_in_list(final SubLObject n, final SubLObject ints)
  {
    if( NIL != subl_promotions.memberP( n, ints, UNPROVIDED, UNPROVIDED ) )
    {
      return lowest_not_in_list( Numbers.add( ONE_INTEGER, n ), ints );
    }
    return n;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 4997L)
  public static SubLObject suggest_word_unit(final SubLObject string)
  {
    assert NIL != Types.stringp( string ) : string;
    final SubLObject word_unit_root = string_utilities.make_valid_constant_name( string, T );
    final SubLObject multi_wordP = Sequences.find( Characters.CHAR_space, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != multi_wordP )
    {
      return Sequences.cconcatenate( word_unit_root, $str7$_MWW );
    }
    return Sequences.cconcatenate( word_unit_root, $str8$_TheWord );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 5360L)
  public static SubLObject word_prop(final SubLObject word_unit, final SubLObject predicate, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const9$GeneralEnglishMt;
    }
    return kb_mapping_utilities.fpred_value_in_mt( word_unit, predicate, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 5553L)
  public static SubLObject set_word_prop(final SubLObject word_unit, final SubLObject predicate, final SubLObject string, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const9$GeneralEnglishMt;
    }
    final SubLObject existing = word_prop( word_unit, predicate, UNPROVIDED );
    if( NIL != existing && ( NIL == string || NIL == Strings.string_equal( existing, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) )
    {
      ke.ke_unassert( ConsesLow.list( predicate, word_unit, existing ), mt );
    }
    if( NIL != string )
    {
      misc_kb_utilities.try_assert( ConsesLow.list( predicate, word_unit, string ), mt, $kw10$MONOTONIC, UNPROVIDED );
    }
    return string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 6136L)
  public static SubLObject check_denot(final SubLObject word_unit, final SubLObject pos, final SubLObject sense, final SubLObject unit, SubLObject mt, SubLObject denot_type)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const9$GeneralEnglishMt;
    }
    if( denot_type == UNPROVIDED )
    {
      denot_type = $kw11$DENOT;
    }
    final SubLObject predicate = lexicon_accessors.determine_denotation_pred( denot_type );
    final SubLObject formula = el_utilities.make_quaternary_formula( predicate, word_unit, pos, sense, unit );
    if( NIL == wff.el_wffP( formula, mt, UNPROVIDED ) )
    {
      return Values.values( NIL, wff.explanation_of_why_not_wff( formula, mt, UNPROVIDED ) );
    }
    return Values.values( T, $str12$ );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 7209L)
  public static SubLObject set_denot(final SubLObject word_unit, final SubLObject pos, final SubLObject sense, final SubLObject unit, SubLObject mt, SubLObject denot_type)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const9$GeneralEnglishMt;
    }
    if( denot_type == UNPROVIDED )
    {
      denot_type = $kw11$DENOT;
    }
    final SubLObject predicate = lexicon_accessors.determine_denotation_pred( denot_type );
    final SubLObject other_denot_type = ( denot_type == $kw11$DENOT ) ? $kw13$RELATED : $kw11$DENOT;
    final SubLObject other_predicate = lexicon_accessors.determine_denotation_pred( other_denot_type );
    SubLObject result = NIL;
    misc_kb_utilities.try_unassert( el_utilities.make_quaternary_formula( other_predicate, word_unit, pos, sense, unit ), mt );
    if( NIL != kb_utilities.kbeq( predicate, $const14$denotation ) )
    {
      SubLObject cdolist_list_var = lexicon_accessors.denots_of_sense( word_unit, pos, sense, UNPROVIDED );
      SubLObject existing_unit = NIL;
      existing_unit = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL == kb_utilities.kbeq( existing_unit, unit ) )
        {
          misc_kb_utilities.try_unassert( el_utilities.make_quaternary_formula( $const14$denotation, word_unit, pos, sense, existing_unit ), mt );
        }
        cdolist_list_var = cdolist_list_var.rest();
        existing_unit = cdolist_list_var.first();
      }
    }
    if( NIL != unit )
    {
      result = misc_kb_utilities.try_assert( el_utilities.make_quaternary_formula( predicate, word_unit, pos, sense, unit ), mt, $kw10$MONOTONIC, UNPROVIDED );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 9232L)
  public static SubLObject add_frame(final SubLObject word_unit, final SubLObject pos, final SubLObject v_int, final SubLObject unit, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const9$GeneralEnglishMt;
    }
    if( NIL != forts.fort_p( unit ) )
    {
      ke.ke_assert( ConsesLow.list( $const15$subcatFrame, word_unit, pos, v_int, unit ), mt, $kw10$MONOTONIC, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 9525L)
  public static SubLObject remove_frame(final SubLObject word_unit, final SubLObject pos, final SubLObject v_int, final SubLObject unit, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const9$GeneralEnglishMt;
    }
    if( NIL != forts.fort_p( unit ) )
    {
      ke.ke_unassert( ConsesLow.list( $const15$subcatFrame, word_unit, pos, v_int, unit ), mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 9831L)
  public static SubLObject set_frames(final SubLObject word_unit, final SubLObject pos, final SubLObject v_int, final SubLObject frame_list, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const9$GeneralEnglishMt;
    }
    final SubLObject existing = lexicon_accessors.frames_of_sense( word_unit, pos, v_int, UNPROVIDED );
    final SubLObject to_removes = conses_high.set_difference( existing, frame_list, UNPROVIDED, UNPROVIDED );
    final SubLObject to_adds = conses_high.set_difference( frame_list, existing, UNPROVIDED, UNPROVIDED );
    SubLObject cdolist_list_var = to_removes;
    SubLObject to_remove = NIL;
    to_remove = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      remove_frame( word_unit, pos, v_int, to_remove, mt );
      cdolist_list_var = cdolist_list_var.rest();
      to_remove = cdolist_list_var.first();
    }
    cdolist_list_var = to_adds;
    SubLObject to_add = NIL;
    to_add = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      add_frame( word_unit, pos, v_int, to_add, mt );
      cdolist_list_var = cdolist_list_var.rest();
      to_add = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 10373L)
  public static SubLObject frame_lookup(final SubLObject string, final SubLObject word_unit, final SubLObject speech_part)
  {
    return lexicon_accessors.frames_of_wordXpos( word_unit, speech_part );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 10496L)
  public static SubLObject preds_of_pos(final SubLObject pos, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    return ( NIL != control_vars.kb_loaded() ) ? conses_high.copy_list( preds_of_pos_cached( pos, mt ) ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 10846L)
  public static SubLObject clear_preds_of_pos()
  {
    return clear_preds_of_pos_cached();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 10924L)
  public static SubLObject clear_preds_of_pos_cached()
  {
    final SubLObject cs = $preds_of_pos_cached_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 10924L)
  public static SubLObject remove_preds_of_pos_cached(final SubLObject pos, final SubLObject mt)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $preds_of_pos_cached_caching_state$.getGlobalValue(), ConsesLow.list( pos, mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 10924L)
  public static SubLObject preds_of_pos_cached_internal(final SubLObject pos, final SubLObject mt)
  {
    return preds_of_pos_int( pos, mt, set.new_set( UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 10924L)
  public static SubLObject preds_of_pos_cached(final SubLObject pos, final SubLObject mt)
  {
    SubLObject caching_state = $preds_of_pos_cached_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym16$PREDS_OF_POS_CACHED, $sym17$_PREDS_OF_POS_CACHED_CACHING_STATE_, NIL, EQUAL, TWO_INTEGER, ZERO_INTEGER );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( pos, mt );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( pos.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && mt.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( preds_of_pos_cached_internal( pos, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( pos, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 11053L)
  public static SubLObject preds_of_pos_int(final SubLObject pos, final SubLObject mt, SubLObject done)
  {
    if( done == UNPROVIDED )
    {
      done = set.new_set( UNPROVIDED, UNPROVIDED );
    }
    SubLObject preds = preds_of_pos_lookup( pos );
    if( NIL == preds )
    {
      SubLObject cdolist_list_var = genls.genls( pos, mt, UNPROVIDED );
      SubLObject genl_pos = NIL;
      genl_pos = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != lexicon_accessors.speech_partP( genl_pos, mt ) && NIL == set.set_memberP( genl_pos, done ) )
        {
          set.set_add( genl_pos, done );
          preds = ConsesLow.append( preds, preds_of_pos_int( genl_pos, mt, done ) );
        }
        cdolist_list_var = cdolist_list_var.rest();
        genl_pos = cdolist_list_var.first();
      }
    }
    return Sequences.delete_duplicates( preds, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 11452L)
  public static SubLObject preds_of_pos_lookup(final SubLObject pos)
  {
    return kb_mapping_utilities.pred_values_in_any_mt( pos, $const18$speechPartPreds, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 11550L)
  public static SubLObject ordered_lexification_preds_of_pos(final SubLObject pos)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( pos.eql( $const19$CountNoun ) )
    {
      return lexicon_vars.$noun_predicates$.getDynamicValue( thread );
    }
    if( pos.eql( $const20$MassNoun ) )
    {
      return lexicon_vars.$mass_predicates$.getDynamicValue( thread );
    }
    if( pos.eql( $const21$AgentiveNoun ) )
    {
      return lexicon_vars.$agentive_preds$.getDynamicValue( thread );
    }
    if( pos.eql( $const22$ProperMassNoun ) )
    {
      return lexicon_vars.$pn_mass_predicates$.getDynamicValue( thread );
    }
    if( pos.eql( $const23$ProperCountNoun ) )
    {
      return lexicon_vars.$pn_count_predicates$.getDynamicValue( thread );
    }
    if( pos.eql( $const24$Verb ) )
    {
      return lexicon_vars.$verb_predicates$.getDynamicValue( thread );
    }
    if( pos.eql( $const25$Adjective ) )
    {
      return lexicon_vars.$adjective_predicates$.getDynamicValue( thread );
    }
    if( pos.eql( $const26$Adverb ) )
    {
      return lexicon_vars.$adverb_predicates$.getDynamicValue( thread );
    }
    return kb_mapping_utilities.pred_values_in_any_mt( pos, $const18$speechPartPreds, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 12370L)
  public static SubLObject ordered_preds_of_pos(final SubLObject pos)
  {
    return ordered_lexification_preds_of_pos( pos );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 12538L)
  public static SubLObject preds_licensed_by_pos(final SubLObject pos)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return ( NIL != control_vars.kb_loaded() ) ? conses_high.copy_list( preds_licensed_by_pos_cached( pos, lexicon_vars.$lexicon_lookup_mt$.getDynamicValue( thread ) ) ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 12935L)
  public static SubLObject clear_preds_licensed_by_pos()
  {
    return clear_preds_licensed_by_pos_cached();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 13031L)
  public static SubLObject clear_preds_licensed_by_pos_cached()
  {
    final SubLObject cs = $preds_licensed_by_pos_cached_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 13031L)
  public static SubLObject remove_preds_licensed_by_pos_cached(final SubLObject pos, final SubLObject mt)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $preds_licensed_by_pos_cached_caching_state$.getGlobalValue(), ConsesLow.list( pos, mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 13031L)
  public static SubLObject preds_licensed_by_pos_cached_internal(final SubLObject pos, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject preds = preds_of_pos( pos, mt );
    if( NIL != lexicon_accessors.genl_posP( $const24$Verb, pos, mt ) )
    {
      final SubLObject item_var = $const28$gerund;
      if( NIL == conses_high.member( item_var, preds, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
      {
        preds = ConsesLow.cons( item_var, preds );
      }
    }
    else if( NIL != lexicon_accessors.genl_posP( $const19$CountNoun, pos, mt ) )
    {
      preds = ConsesLow.append( preds, preds_of_pos( $const23$ProperCountNoun, mt ) );
    }
    SubLObject cdolist_list_var = conses_high.copy_list( preds );
    SubLObject pred = NIL;
    pred = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$1 = preds_coercible_from_pred( pred );
      SubLObject coercible_pred = NIL;
      coercible_pred = cdolist_list_var_$1.first();
      while ( NIL != cdolist_list_var_$1)
      {
        final SubLObject item_var2 = coercible_pred;
        if( NIL == conses_high.member( item_var2, preds, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          preds = ConsesLow.cons( item_var2, preds );
        }
        cdolist_list_var_$1 = cdolist_list_var_$1.rest();
        coercible_pred = cdolist_list_var_$1.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      pred = cdolist_list_var.first();
    }
    final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding( thread );
    try
    {
      lexicon_vars.$lexicon_lookup_mt$.bind( mt, thread );
      preds = Sort.sort( preds, $sym29$SPP_MORE_BASIC_, UNPROVIDED );
    }
    finally
    {
      lexicon_vars.$lexicon_lookup_mt$.rebind( _prev_bind_0, thread );
    }
    return preds;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 13031L)
  public static SubLObject preds_licensed_by_pos_cached(final SubLObject pos, final SubLObject mt)
  {
    SubLObject caching_state = $preds_licensed_by_pos_cached_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym27$PREDS_LICENSED_BY_POS_CACHED, $sym30$_PREDS_LICENSED_BY_POS_CACHED_CACHING_STATE_, NIL, EQUAL, TWO_INTEGER, $int31$32 );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( pos, mt );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( pos.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && mt.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( preds_licensed_by_pos_cached_internal( pos, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( pos, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 13597L)
  public static SubLObject preds_coercible_from_pred(final SubLObject pred)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject coercible_preds = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym32$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const33$EverythingPSC, thread );
      final SubLObject deck_type = $kw36$QUEUE;
      final SubLObject recur_deck = deck.create_deck( deck_type );
      SubLObject node_and_predicate_mode = NIL;
      final SubLObject _prev_bind_0_$2 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
      try
      {
        sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
        try
        {
          final SubLObject tv_var = NIL;
          final SubLObject _prev_bind_0_$3 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
          final SubLObject _prev_bind_1_$4 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
          try
          {
            sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
            sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym37$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
            if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
            {
              final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
              if( pcase_var.eql( $kw38$ERROR ) )
              {
                sbhl_paranoia.sbhl_error( ONE_INTEGER, $str39$_A_is_not_a__A, tv_var, $sym40$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
              else if( pcase_var.eql( $kw41$CERROR ) )
              {
                sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str42$continue_anyway, $str39$_A_is_not_a__A, tv_var, $sym40$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
              else if( pcase_var.eql( $kw43$WARN ) )
              {
                Errors.warn( $str39$_A_is_not_a__A, tv_var, $sym40$SBHL_TRUE_TV_P );
              }
              else
              {
                Errors.warn( $str44$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                Errors.cerror( $str42$continue_anyway, $str39$_A_is_not_a__A, tv_var, $sym40$SBHL_TRUE_TV_P );
              }
            }
            final SubLObject _prev_bind_0_$4 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
            final SubLObject _prev_bind_1_$5 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
            final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
            try
            {
              sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const45$genlPreds ), thread );
              sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const45$genlPreds ) ), thread );
              sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const45$genlPreds ) ), thread );
              sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
              sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const45$genlPreds ), thread );
              if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( pred, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
              {
                final SubLObject _prev_bind_0_$5 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                final SubLObject _prev_bind_1_$6 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                final SubLObject _prev_bind_2_$9 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                try
                {
                  sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_forward_search_direction(), thread );
                  sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module(
                      $const45$genlPreds ) ), thread );
                  sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                  sbhl_marking_utilities.sbhl_mark_node_marked( pred, UNPROVIDED );
                  for( node_and_predicate_mode = ConsesLow.list( pred, sbhl_search_vars.genl_inverse_mode_p() ); NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop( recur_deck ) )
                  {
                    final SubLObject node_var_$10 = node_and_predicate_mode.first();
                    final SubLObject predicate_mode = conses_high.second( node_and_predicate_mode );
                    final SubLObject genl_pred = node_var_$10;
                    final SubLObject _prev_bind_0_$6 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                    try
                    {
                      sbhl_search_vars.$genl_inverse_mode_p$.bind( predicate_mode, thread );
                      if( NIL != sbhl_search_utilities.apply_sbhl_add_node_test( sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_$10 ) )
                      {
                        SubLObject cdolist_list_var = kb_mapping_utilities.pred_values( genl_pred, $const46$paraphraseCoercionAllowedFrom, TWO_INTEGER, ONE_INTEGER, UNPROVIDED );
                        SubLObject coercible_pred = NIL;
                        coercible_pred = cdolist_list_var.first();
                        while ( NIL != cdolist_list_var)
                        {
                          final SubLObject item_var = coercible_pred;
                          if( NIL == conses_high.member( item_var, coercible_preds, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
                          {
                            coercible_preds = ConsesLow.cons( item_var, coercible_preds );
                          }
                          SubLObject cdolist_list_var_$12 = preds_derivable_from_pred( coercible_pred );
                          SubLObject derivable_pred = NIL;
                          derivable_pred = cdolist_list_var_$12.first();
                          while ( NIL != cdolist_list_var_$12)
                          {
                            final SubLObject item_var2 = derivable_pred;
                            if( NIL == conses_high.member( item_var2, coercible_preds, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
                            {
                              coercible_preds = ConsesLow.cons( item_var2, coercible_preds );
                            }
                            cdolist_list_var_$12 = cdolist_list_var_$12.rest();
                            derivable_pred = cdolist_list_var_$12.first();
                          }
                          cdolist_list_var = cdolist_list_var.rest();
                          coercible_pred = cdolist_list_var.first();
                        }
                      }
                      SubLObject cdolist_list_var2;
                      final SubLObject accessible_modules = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const45$genlPreds ) );
                      SubLObject module_var = NIL;
                      module_var = cdolist_list_var2.first();
                      while ( NIL != cdolist_list_var2)
                      {
                        final SubLObject _prev_bind_0_$7 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                        final SubLObject _prev_bind_1_$7 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                        try
                        {
                          sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                          sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                              .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                          final SubLObject node = function_terms.naut_to_nart( node_var_$10 );
                          if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                          {
                            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                            if( NIL != d_link )
                            {
                              final SubLObject mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                              if( NIL != mt_links )
                              {
                                SubLObject iteration_state;
                                for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                    iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                                {
                                  thread.resetMultipleValues();
                                  final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                  final SubLObject tv_links = thread.secondMultipleValue();
                                  thread.resetMultipleValues();
                                  if( NIL != mt_relevance_macros.relevant_mtP( mt ) )
                                  {
                                    final SubLObject _prev_bind_0_$8 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                    try
                                    {
                                      sbhl_link_vars.$sbhl_link_mt$.bind( mt, thread );
                                      SubLObject iteration_state_$16;
                                      for( iteration_state_$16 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                          iteration_state_$16 ); iteration_state_$16 = dictionary_contents.do_dictionary_contents_next( iteration_state_$16 ) )
                                      {
                                        thread.resetMultipleValues();
                                        final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$16 );
                                        final SubLObject link_nodes = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                        {
                                          final SubLObject _prev_bind_0_$9 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                          try
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                            final SubLObject sol = link_nodes;
                                            if( NIL != set.set_p( sol ) )
                                            {
                                              final SubLObject set_contents_var = set.do_set_internal( sol );
                                              SubLObject basis_object;
                                              SubLObject state;
                                              SubLObject node_vars_link_node;
                                              for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                  set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                              {
                                                node_vars_link_node = set_contents.do_set_contents_next( basis_object, state );
                                                if( NIL != set_contents.do_set_contents_element_validP( state, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node,
                                                    UNPROVIDED ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                  deck.deck_push( ConsesLow.list( node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                                }
                                              }
                                            }
                                            else if( sol.isList() )
                                            {
                                              SubLObject csome_list_var = sol;
                                              SubLObject node_vars_link_node2 = NIL;
                                              node_vars_link_node2 = csome_list_var.first();
                                              while ( NIL != csome_list_var)
                                              {
                                                if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                  deck.deck_push( ConsesLow.list( node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                                }
                                                csome_list_var = csome_list_var.rest();
                                                node_vars_link_node2 = csome_list_var.first();
                                              }
                                            }
                                            else
                                            {
                                              Errors.error( $str47$_A_is_neither_SET_P_nor_LISTP_, sol );
                                            }
                                          }
                                          finally
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$9, thread );
                                          }
                                        }
                                      }
                                      dictionary_contents.do_dictionary_contents_finalize( iteration_state_$16 );
                                    }
                                    finally
                                    {
                                      sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$8, thread );
                                    }
                                  }
                                }
                                dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                              }
                            }
                            else
                            {
                              sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str48$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                            }
                          }
                          else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                          {
                            SubLObject cdolist_list_var_$13;
                            final SubLObject new_list = cdolist_list_var_$13 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                    UNPROVIDED ) ) )
                                : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                    .get_sbhl_module( UNPROVIDED ) ) );
                            SubLObject generating_fn = NIL;
                            generating_fn = cdolist_list_var_$13.first();
                            while ( NIL != cdolist_list_var_$13)
                            {
                              final SubLObject _prev_bind_0_$10 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                              try
                              {
                                sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                                final SubLObject sol2;
                                final SubLObject link_nodes2 = sol2 = Functions.funcall( generating_fn, node );
                                if( NIL != set.set_p( sol2 ) )
                                {
                                  final SubLObject set_contents_var2 = set.do_set_internal( sol2 );
                                  SubLObject basis_object2;
                                  SubLObject state2;
                                  SubLObject node_vars_link_node3;
                                  for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                      set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                  {
                                    node_vars_link_node3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                    if( NIL != set_contents.do_set_contents_element_validP( state2, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                        UNPROVIDED ) )
                                    {
                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                      deck.deck_push( ConsesLow.list( node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                    }
                                  }
                                }
                                else if( sol2.isList() )
                                {
                                  SubLObject csome_list_var2 = sol2;
                                  SubLObject node_vars_link_node4 = NIL;
                                  node_vars_link_node4 = csome_list_var2.first();
                                  while ( NIL != csome_list_var2)
                                  {
                                    if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                    {
                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                      deck.deck_push( ConsesLow.list( node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                    }
                                    csome_list_var2 = csome_list_var2.rest();
                                    node_vars_link_node4 = csome_list_var2.first();
                                  }
                                }
                                else
                                {
                                  Errors.error( $str47$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                }
                              }
                              finally
                              {
                                sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$10, thread );
                              }
                              cdolist_list_var_$13 = cdolist_list_var_$13.rest();
                              generating_fn = cdolist_list_var_$13.first();
                            }
                          }
                        }
                        finally
                        {
                          sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$7, thread );
                          sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$7, thread );
                        }
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        module_var = cdolist_list_var2.first();
                      }
                    }
                    finally
                    {
                      sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_0_$6, thread );
                    }
                  }
                }
                finally
                {
                  sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$9, thread );
                  sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$6, thread );
                  sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$5, thread );
                }
              }
              else
              {
                sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str49$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED, UNPROVIDED,
                    UNPROVIDED );
              }
            }
            finally
            {
              sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
              sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
              sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_3, thread );
              sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$5, thread );
              sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$4, thread );
            }
          }
          finally
          {
            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$4, thread );
            sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$3, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$11 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$11, thread );
          }
        }
      }
      finally
      {
        sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$2, thread );
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return coercible_preds;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 14084L)
  public static SubLObject preds_derivable_from_pred(final SubLObject pred)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject derivable_preds = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym32$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const33$EverythingPSC, thread );
      final SubLObject deck_type = $kw36$QUEUE;
      final SubLObject recur_deck = deck.create_deck( deck_type );
      SubLObject node_and_predicate_mode = NIL;
      final SubLObject _prev_bind_0_$21 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
      try
      {
        sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
        try
        {
          final SubLObject tv_var = NIL;
          final SubLObject _prev_bind_0_$22 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
          final SubLObject _prev_bind_1_$23 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
          try
          {
            sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
            sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym37$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
            if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
            {
              final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
              if( pcase_var.eql( $kw38$ERROR ) )
              {
                sbhl_paranoia.sbhl_error( ONE_INTEGER, $str39$_A_is_not_a__A, tv_var, $sym40$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
              else if( pcase_var.eql( $kw41$CERROR ) )
              {
                sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str42$continue_anyway, $str39$_A_is_not_a__A, tv_var, $sym40$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
              else if( pcase_var.eql( $kw43$WARN ) )
              {
                Errors.warn( $str39$_A_is_not_a__A, tv_var, $sym40$SBHL_TRUE_TV_P );
              }
              else
              {
                Errors.warn( $str44$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                Errors.cerror( $str42$continue_anyway, $str39$_A_is_not_a__A, tv_var, $sym40$SBHL_TRUE_TV_P );
              }
            }
            final SubLObject _prev_bind_0_$23 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
            final SubLObject _prev_bind_1_$24 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
            final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
            try
            {
              sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const45$genlPreds ), thread );
              sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const45$genlPreds ) ), thread );
              sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const45$genlPreds ) ), thread );
              sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
              sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const45$genlPreds ), thread );
              if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( pred, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
              {
                final SubLObject _prev_bind_0_$24 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                final SubLObject _prev_bind_1_$25 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                final SubLObject _prev_bind_2_$28 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                try
                {
                  sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_forward_search_direction(), thread );
                  sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module(
                      $const45$genlPreds ) ), thread );
                  sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                  sbhl_marking_utilities.sbhl_mark_node_marked( pred, UNPROVIDED );
                  for( node_and_predicate_mode = ConsesLow.list( pred, sbhl_search_vars.genl_inverse_mode_p() ); NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop( recur_deck ) )
                  {
                    final SubLObject node_var_$29 = node_and_predicate_mode.first();
                    final SubLObject predicate_mode = conses_high.second( node_and_predicate_mode );
                    final SubLObject genl_pred = node_var_$29;
                    final SubLObject _prev_bind_0_$25 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                    try
                    {
                      sbhl_search_vars.$genl_inverse_mode_p$.bind( predicate_mode, thread );
                      if( NIL != sbhl_search_utilities.apply_sbhl_add_node_test( sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_$29 ) )
                      {
                        derivable_preds = ConsesLow.nconc( derivable_preds, kb_mapping_utilities.pred_values( genl_pred, $const50$regularSuffix, TWO_INTEGER, ONE_INTEGER, UNPROVIDED ) );
                      }
                      SubLObject cdolist_list_var;
                      final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const45$genlPreds ) );
                      SubLObject module_var = NIL;
                      module_var = cdolist_list_var.first();
                      while ( NIL != cdolist_list_var)
                      {
                        final SubLObject _prev_bind_0_$26 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                        final SubLObject _prev_bind_1_$26 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                        try
                        {
                          sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                          sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                              .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                          final SubLObject node = function_terms.naut_to_nart( node_var_$29 );
                          if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                          {
                            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                            if( NIL != d_link )
                            {
                              final SubLObject mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                              if( NIL != mt_links )
                              {
                                SubLObject iteration_state;
                                for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                    iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                                {
                                  thread.resetMultipleValues();
                                  final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                  final SubLObject tv_links = thread.secondMultipleValue();
                                  thread.resetMultipleValues();
                                  if( NIL != mt_relevance_macros.relevant_mtP( mt ) )
                                  {
                                    final SubLObject _prev_bind_0_$27 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                    try
                                    {
                                      sbhl_link_vars.$sbhl_link_mt$.bind( mt, thread );
                                      SubLObject iteration_state_$34;
                                      for( iteration_state_$34 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                          iteration_state_$34 ); iteration_state_$34 = dictionary_contents.do_dictionary_contents_next( iteration_state_$34 ) )
                                      {
                                        thread.resetMultipleValues();
                                        final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$34 );
                                        final SubLObject link_nodes = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                        {
                                          final SubLObject _prev_bind_0_$28 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                          try
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                            final SubLObject sol = link_nodes;
                                            if( NIL != set.set_p( sol ) )
                                            {
                                              final SubLObject set_contents_var = set.do_set_internal( sol );
                                              SubLObject basis_object;
                                              SubLObject state;
                                              SubLObject node_vars_link_node;
                                              for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                  set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                              {
                                                node_vars_link_node = set_contents.do_set_contents_next( basis_object, state );
                                                if( NIL != set_contents.do_set_contents_element_validP( state, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node,
                                                    UNPROVIDED ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                  deck.deck_push( ConsesLow.list( node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                                }
                                              }
                                            }
                                            else if( sol.isList() )
                                            {
                                              SubLObject csome_list_var = sol;
                                              SubLObject node_vars_link_node2 = NIL;
                                              node_vars_link_node2 = csome_list_var.first();
                                              while ( NIL != csome_list_var)
                                              {
                                                if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                  deck.deck_push( ConsesLow.list( node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                                }
                                                csome_list_var = csome_list_var.rest();
                                                node_vars_link_node2 = csome_list_var.first();
                                              }
                                            }
                                            else
                                            {
                                              Errors.error( $str47$_A_is_neither_SET_P_nor_LISTP_, sol );
                                            }
                                          }
                                          finally
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$28, thread );
                                          }
                                        }
                                      }
                                      dictionary_contents.do_dictionary_contents_finalize( iteration_state_$34 );
                                    }
                                    finally
                                    {
                                      sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$27, thread );
                                    }
                                  }
                                }
                                dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                              }
                            }
                            else
                            {
                              sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str48$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                            }
                          }
                          else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                          {
                            SubLObject cdolist_list_var_$36;
                            final SubLObject new_list = cdolist_list_var_$36 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                    UNPROVIDED ) ) )
                                : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                    .get_sbhl_module( UNPROVIDED ) ) );
                            SubLObject generating_fn = NIL;
                            generating_fn = cdolist_list_var_$36.first();
                            while ( NIL != cdolist_list_var_$36)
                            {
                              final SubLObject _prev_bind_0_$29 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                              try
                              {
                                sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                                final SubLObject sol2;
                                final SubLObject link_nodes2 = sol2 = Functions.funcall( generating_fn, node );
                                if( NIL != set.set_p( sol2 ) )
                                {
                                  final SubLObject set_contents_var2 = set.do_set_internal( sol2 );
                                  SubLObject basis_object2;
                                  SubLObject state2;
                                  SubLObject node_vars_link_node3;
                                  for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                      set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                  {
                                    node_vars_link_node3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                    if( NIL != set_contents.do_set_contents_element_validP( state2, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                        UNPROVIDED ) )
                                    {
                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                      deck.deck_push( ConsesLow.list( node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                    }
                                  }
                                }
                                else if( sol2.isList() )
                                {
                                  SubLObject csome_list_var2 = sol2;
                                  SubLObject node_vars_link_node4 = NIL;
                                  node_vars_link_node4 = csome_list_var2.first();
                                  while ( NIL != csome_list_var2)
                                  {
                                    if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                    {
                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                      deck.deck_push( ConsesLow.list( node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                    }
                                    csome_list_var2 = csome_list_var2.rest();
                                    node_vars_link_node4 = csome_list_var2.first();
                                  }
                                }
                                else
                                {
                                  Errors.error( $str47$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                }
                              }
                              finally
                              {
                                sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$29, thread );
                              }
                              cdolist_list_var_$36 = cdolist_list_var_$36.rest();
                              generating_fn = cdolist_list_var_$36.first();
                            }
                          }
                        }
                        finally
                        {
                          sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$26, thread );
                          sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$26, thread );
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        module_var = cdolist_list_var.first();
                      }
                    }
                    finally
                    {
                      sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_0_$25, thread );
                    }
                  }
                }
                finally
                {
                  sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$28, thread );
                  sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$25, thread );
                  sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$24, thread );
                }
              }
              else
              {
                sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str49$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED, UNPROVIDED,
                    UNPROVIDED );
              }
            }
            finally
            {
              sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
              sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
              sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_3, thread );
              sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$24, thread );
              sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$23, thread );
            }
          }
          finally
          {
            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$23, thread );
            sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$22, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$30 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$30, thread );
          }
        }
      }
      finally
      {
        sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$21, thread );
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return derivable_preds;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 14430L)
  public static SubLObject filter_lexicon_preds(final SubLObject preds1, final SubLObject preds2, SubLObject mt, SubLObject remove_subsumed_itemsP)
  {
    if( mt == UNPROVIDED )
    {
      mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    if( remove_subsumed_itemsP == UNPROVIDED )
    {
      remove_subsumed_itemsP = T;
    }
    SubLObject filtered_preds = NIL;
    SubLObject cdolist_list_var = preds1;
    SubLObject pred1 = NIL;
    pred1 = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$39 = preds2;
      SubLObject pred2 = NIL;
      pred2 = cdolist_list_var_$39.first();
      while ( NIL != cdolist_list_var_$39)
      {
        SubLObject cdolist_list_var_$40 = filter_two_lexicon_preds( pred1, pred2, mt );
        SubLObject filtered = NIL;
        filtered = cdolist_list_var_$40.first();
        while ( NIL != cdolist_list_var_$40)
        {
          final SubLObject item_var = filtered;
          if( NIL == conses_high.member( item_var, filtered_preds, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
          {
            filtered_preds = ConsesLow.cons( item_var, filtered_preds );
          }
          cdolist_list_var_$40 = cdolist_list_var_$40.rest();
          filtered = cdolist_list_var_$40.first();
        }
        cdolist_list_var_$39 = cdolist_list_var_$39.rest();
        pred2 = cdolist_list_var_$39.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      pred1 = cdolist_list_var.first();
    }
    if( NIL != remove_subsumed_itemsP )
    {
      filtered_preds = list_utilities.remove_subsumed_items( filtered_preds, $sym51$SPEC_POS_PRED_, UNPROVIDED );
    }
    else
    {
      filtered_preds = list_utilities.remove_duplicates_from_end( filtered_preds, Symbols.symbol_function( $sym52$KBEQ ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    filtered_preds = Sequences.nreverse( filtered_preds );
    return filtered_preds;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 15199L)
  public static SubLObject filter_two_lexicon_preds(final SubLObject pred1, final SubLObject pred2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    if( NIL != kb_utilities.kbeq( pred1, pred2 ) )
    {
      return ConsesLow.list( pred1 );
    }
    if( NIL != kb_utilities.kbeq( pred1, $const53$termStrings ) )
    {
      return ConsesLow.list( pred2 );
    }
    if( NIL != kb_utilities.kbeq( pred2, $const53$termStrings ) )
    {
      return ConsesLow.list( pred1 );
    }
    if( NIL != lexicon_vars.name_string_predP( pred1 ) && NIL == lexicon_accessors.genl_pos_predP( pred2, $const54$plural_Generic, UNPROVIDED ) && NIL != lexicon_accessors.genl_pos_predP( pred2, $const55$nounStrings,
        UNPROVIDED ) )
    {
      return ConsesLow.list( pred1 );
    }
    if( NIL != lexicon_vars.name_string_predP( pred2 ) && NIL == lexicon_accessors.genl_pos_predP( pred1, $const54$plural_Generic, UNPROVIDED ) && NIL != lexicon_accessors.genl_pos_predP( pred1, $const55$nounStrings,
        UNPROVIDED ) )
    {
      return ConsesLow.list( pred2 );
    }
    if( NIL != pph_utilities.pph_speech_part_predP( pred1 ) && NIL != pph_utilities.pph_speech_part_predP( pred2 ) )
    {
      return pph_utilities.pph_max_spec_speech_part_preds( ConsesLow.list( pred1, pred2 ), mt, UNPROVIDED );
    }
    return genl_predicates.max_floor_predicates( ConsesLow.list( pred1, pred2 ), NIL, mt, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 16154L)
  public static SubLObject spp_more_basicP(final SubLObject spp1, final SubLObject spp2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    return ( NIL != control_vars.kb_loaded() ) ? spp_more_basicP_cached( spp1, spp2, mt ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 16373L)
  public static SubLObject clear_spp_more_basicP_cached()
  {
    final SubLObject cs = $spp_more_basicP_cached_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 16373L)
  public static SubLObject remove_spp_more_basicP_cached(final SubLObject spp1, final SubLObject spp2, final SubLObject mt)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $spp_more_basicP_cached_caching_state$.getGlobalValue(), ConsesLow.list( spp1, spp2, mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 16373L)
  public static SubLObject spp_more_basicP_cached_internal(final SubLObject spp1, final SubLObject spp2, final SubLObject mt)
  {
    if( NIL != kb_utilities.kbeq( spp1, spp2 ) )
    {
      return NIL;
    }
    if( NIL != lexicon_accessors.genl_pos_predP( spp1, spp2, mt ) )
    {
      return T;
    }
    if( NIL != kb_utilities.kbeq( spp1, common_noun_form_of_pred( spp2 ) ) )
    {
      return T;
    }
    if( NIL == lexicon_accessors.derived_predP( spp1, UNPROVIDED ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 16373L)
  public static SubLObject spp_more_basicP_cached(final SubLObject spp1, final SubLObject spp2, final SubLObject mt)
  {
    SubLObject caching_state = $spp_more_basicP_cached_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym56$SPP_MORE_BASIC__CACHED, $sym57$_SPP_MORE_BASIC__CACHED_CACHING_STATE_, NIL, EQL, THREE_INTEGER, $int58$64 );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_3( spp1, spp2, mt );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( spp1.eql( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( spp2.eql( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( NIL != cached_args && NIL == cached_args.rest() && mt.eql( cached_args.first() ) )
            {
              return memoization_state.caching_results( results2 );
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( spp_more_basicP_cached_internal( spp1, spp2, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( spp1, spp2, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 16678L)
  public static SubLObject spp_assertion_string(final SubLObject ass)
  {
    return cycl_string.cycl_string_to_utf8_string( assertions_high.gaf_arg2( ass ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 16860L)
  public static SubLObject preds_for_keyword(final SubLObject pos_keyword)
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var = lexicon_accessors.pos_for_keyword( pos_keyword, UNPROVIDED );
    SubLObject pos = NIL;
    pos = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$41 = preds_of_pos( pos, UNPROVIDED );
      SubLObject pred = NIL;
      pred = cdolist_list_var_$41.first();
      while ( NIL != cdolist_list_var_$41)
      {
        final SubLObject item_var = pred;
        if( NIL == conses_high.member( item_var, result, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          result = ConsesLow.cons( item_var, result );
        }
        cdolist_list_var_$41 = cdolist_list_var_$41.rest();
        pred = cdolist_list_var_$41.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      pos = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 17320L)
  public static SubLObject ordered_lexification_preds_for_keyword(final SubLObject pos_keyword)
  {
    final SubLObject ordered_preds = ConsesLow.append( $list59, lexicon_vars.all_lexicon_string_predicates() );
    return list_utilities.ordered_intersection( ordered_preds, preds_for_keyword( pos_keyword ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 17808L)
  public static SubLObject ordered_preds_for_keyword(final SubLObject pos_keyword)
  {
    return ordered_lexification_preds_for_keyword( pos_keyword );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 18004L)
  public static SubLObject nl_def_attributes_for_string(final SubLObject string, SubLObject denots)
  {
    if( denots == UNPROVIDED )
    {
      denots = NIL;
    }
    SubLObject attr = NIL;
    SubLObject cdolist_list_var = lexicon_accessors.pos_of_string( string, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject pos = NIL;
    pos = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject var = nl_def_attributes_for_pos( pos, denots );
      if( NIL != var )
      {
        final SubLObject item_var = var;
        if( NIL == conses_high.member( item_var, attr, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          attr = ConsesLow.cons( item_var, attr );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      pos = cdolist_list_var.first();
    }
    return attr;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 18316L)
  public static SubLObject nl_def_attributes_for_pos(final SubLObject pos, SubLObject denots)
  {
    if( denots == UNPROVIDED )
    {
      denots = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject attr = NIL;
    if( NIL != genls.genl_ofP( $const60$Determiner_Definite, pos, lexicon_vars.$lexicon_lookup_mt$.getDynamicValue( thread ), UNPROVIDED ) )
    {
      attr = ConsesLow.cons( $const61$Definite_NLAttr, attr );
    }
    else if( NIL != genls.genl_ofP( $const62$PossessiveMarker, pos, lexicon_vars.$lexicon_lookup_mt$.getDynamicValue( thread ), UNPROVIDED ) )
    {
      attr = nl_def_attributes_for_possessive_denots( denots );
    }
    else if( NIL != genls.genl_ofP( $const63$Determiner_Indefinite, pos, lexicon_vars.$lexicon_lookup_mt$.getDynamicValue( thread ), UNPROVIDED ) )
    {
      attr = ConsesLow.cons( $const64$Indefinite_NLAttr, attr );
    }
    return attr;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 18896L)
  public static SubLObject nl_def_attributes_for_possessive_denots(final SubLObject denots)
  {
    SubLObject attr = NIL;
    SubLObject cdolist_list_var = denots;
    SubLObject denot = NIL;
    denot = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != cycl_utilities.expression_find( $const64$Indefinite_NLAttr, denot, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        final SubLObject item_var = $const64$Indefinite_NLAttr;
        if( NIL == conses_high.member( item_var, attr, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          attr = ConsesLow.cons( item_var, attr );
        }
      }
      if( NIL != cycl_utilities.expression_find( $const61$Definite_NLAttr, denot, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        final SubLObject item_var = $const61$Definite_NLAttr;
        if( NIL == conses_high.member( item_var, attr, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          attr = ConsesLow.cons( item_var, attr );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      denot = cdolist_list_var.first();
    }
    if( NIL == attr )
    {
      attr = ConsesLow.cons( $const61$Definite_NLAttr, attr );
    }
    return attr;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 19401L)
  public static SubLObject nl_quant_attributes_for_string(final SubLObject string, SubLObject denots)
  {
    if( denots == UNPROVIDED )
    {
      denots = NIL;
    }
    if( NIL != Strings.stringE( string, $str12$, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return ConsesLow.list( $const65$BareForm_NLAttr );
    }
    if( NIL == denots )
    {
      denots = lexicon_accessors.denots_of_stringXspeech_part( string, $const66$Determiner, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return nl_quant_attributes_for_denots( denots );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 19801L)
  public static SubLObject nl_quant_attributes_for_denots(final SubLObject det_denots)
  {
    SubLObject nlqas = NIL;
    SubLObject cdolist_list_var = det_denots;
    SubLObject det_denot = NIL;
    det_denot = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != fort_types_interface.nl_quant_attributeP( det_denot ) )
      {
        nlqas = ConsesLow.cons( det_denot, nlqas );
      }
      else if( NIL == fort_types_interface.nl_definiteness_attributeP( det_denot ) )
      {
        final SubLObject var = nl_numerical_quant_for_denot( det_denot );
        if( NIL != var )
        {
          nlqas = ConsesLow.cons( var, nlqas );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      det_denot = cdolist_list_var.first();
    }
    return nlqas;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 20245L)
  public static SubLObject nl_numerical_quant_for_denot(final SubLObject denot)
  {
    if( denot.isNumber() || NIL != det_denot_is_scalar_intervalP( denot ) )
    {
      return ConsesLow.list( $const67$NumericalQuant_NLAttrFn, denot );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 20519L)
  public static SubLObject det_denot_is_scalar_intervalP(final SubLObject det_denot)
  {
    return ( NIL != control_vars.kb_loaded() ) ? det_denot_is_scalar_intervalP_cached( det_denot ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 20658L)
  public static SubLObject clear_det_denot_is_scalar_intervalP_cached()
  {
    final SubLObject cs = $det_denot_is_scalar_intervalP_cached_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 20658L)
  public static SubLObject remove_det_denot_is_scalar_intervalP_cached(final SubLObject det_denot)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $det_denot_is_scalar_intervalP_cached_caching_state$.getGlobalValue(), ConsesLow.list( det_denot ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 20658L)
  public static SubLObject det_denot_is_scalar_intervalP_cached_internal(final SubLObject det_denot)
  {
    return at_defns.quiet_has_typeP( det_denot, $const69$ScalarInterval, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 20658L)
  public static SubLObject det_denot_is_scalar_intervalP_cached(final SubLObject det_denot)
  {
    SubLObject caching_state = $det_denot_is_scalar_intervalP_cached_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym68$DET_DENOT_IS_SCALAR_INTERVAL__CACHED, $sym70$_DET_DENOT_IS_SCALAR_INTERVAL__CACHED_CACHING_STATE_, NIL, EQUAL, ONE_INTEGER,
          $int71$128 );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, det_denot, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( det_denot_is_scalar_intervalP_cached_internal( det_denot ) ) );
      memoization_state.caching_state_put( caching_state, det_denot, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 20809L)
  public static SubLObject maximal_bar_level(final SubLObject cat1, final SubLObject cat2)
  {
    final SubLObject level1 = bar_level( cat1, UNPROVIDED );
    final SubLObject level2 = bar_level( cat2, UNPROVIDED );
    if( !level1.isInteger() )
    {
      return level2;
    }
    if( !level2.isInteger() )
    {
      return level1;
    }
    return number_utilities.maximum( ConsesLow.list( level1, level2 ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 21168L)
  public static SubLObject bar_level(final SubLObject cat, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    return ( NIL != control_vars.kb_loaded() ) ? bar_level_cached( cat, mt ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 21293L)
  public static SubLObject clear_bar_level()
  {
    return clear_bar_level_cached();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 21365L)
  public static SubLObject remove_bar_level(final SubLObject cat, final SubLObject mt)
  {
    return remove_bar_level_cached( cat, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 21452L)
  public static SubLObject clear_bar_level_cached()
  {
    final SubLObject cs = $bar_level_cached_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 21452L)
  public static SubLObject remove_bar_level_cached(final SubLObject cat, final SubLObject mt)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $bar_level_cached_caching_state$.getGlobalValue(), ConsesLow.list( cat, mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 21452L)
  public static SubLObject bar_level_cached_internal(final SubLObject cat, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != lexicon_accessors.speech_partP( cat, UNPROVIDED ) )
    {
      return ZERO_INTEGER;
    }
    if( NIL != kb_utilities.kbeq( cycl_utilities.nat_functor( cat ), $const73$PhraseFn_Bar1 ) )
    {
      return ONE_INTEGER;
    }
    if( NIL != kb_utilities.kbeq( cycl_utilities.nat_functor( cat ), $const74$PhraseFn ) )
    {
      return TWO_INTEGER;
    }
    if( NIL == constant_handles.valid_constantP( constants_high.find_constant( $str75$barLevelOfPhraseType ), UNPROVIDED ) )
    {
      return NIL;
    }
    SubLObject query_result = NIL;
    final SubLObject _prev_bind_0 = pred_relevance_macros.$relevant_pred_function$.currentBinding( thread );
    try
    {
      pred_relevance_macros.$relevant_pred_function$.bind( $sym76$RELEVANT_PRED_IS_EVERYTHING, thread );
      query_result = ask_utilities.ask_variable( $sym77$_LEVEL, ConsesLow.listS( $const78$barLevelOfPhraseType, cat, $list79 ), mt, ONE_INTEGER, ONE_INTEGER, UNPROVIDED, UNPROVIDED ).first();
    }
    finally
    {
      pred_relevance_macros.$relevant_pred_function$.rebind( _prev_bind_0, thread );
    }
    if( NIL != query_result )
    {
      return query_result;
    }
    Errors.warn( $str80$Couldn_t_determine_bar_level_for_, cat, mt );
    remove_bar_level( cat, mt );
    return ONE_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 21452L)
  public static SubLObject bar_level_cached(final SubLObject cat, final SubLObject mt)
  {
    SubLObject caching_state = $bar_level_cached_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym72$BAR_LEVEL_CACHED, $sym81$_BAR_LEVEL_CACHED_CACHING_STATE_, NIL, EQUAL, TWO_INTEGER, ZERO_INTEGER );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( cat, mt );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( cat.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && mt.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( bar_level_cached_internal( cat, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( cat, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 22079L)
  public static SubLObject pos_of_cat(final SubLObject cat, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    return ( NIL != control_vars.kb_loaded() ) ? pos_of_cat_cached( cat, mt ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 22206L)
  public static SubLObject clear_pos_of_cat_cached()
  {
    final SubLObject cs = $pos_of_cat_cached_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 22206L)
  public static SubLObject remove_pos_of_cat_cached(final SubLObject cat, final SubLObject mt)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $pos_of_cat_cached_caching_state$.getGlobalValue(), ConsesLow.list( cat, mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 22206L)
  public static SubLObject pos_of_cat_cached_internal(final SubLObject cat, final SubLObject mt)
  {
    if( NIL != lexicon_accessors.speech_partP( cat, UNPROVIDED ) )
    {
      return cat;
    }
    if( NIL != conses_high.member( cycl_utilities.nat_functor( cat ), $list83, UNPROVIDED, UNPROVIDED ) )
    {
      return cycl_utilities.nat_arg1( cat, UNPROVIDED );
    }
    if( NIL != kb_utilities.kbeq( cat, $const84$NounPhrase ) )
    {
      return $const85$Noun;
    }
    if( NIL != kb_utilities.kbeq( cat, $const86$PrepositionalPhrase ) )
    {
      return $const87$Preposition;
    }
    if( NIL != kb_utilities.kbeq( cat, $const88$PossessivePhrase ) )
    {
      return $const66$Determiner;
    }
    if( NIL == cat )
    {
      return NIL;
    }
    if( NIL != kb_utilities.kbeq( cat, $const89$NLSentence ) )
    {
      return $const24$Verb;
    }
    if( NIL != kb_utilities.kbeq( cat, $const90$NLPhrase ) )
    {
      return $const91$NLWordForm;
    }
    return ask_utilities.ask_variable( $sym92$_POS, ConsesLow.listS( $const93$posOfPhraseType, cat, $list94 ), mt, ONE_INTEGER, ONE_INTEGER, UNPROVIDED, UNPROVIDED ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 22206L)
  public static SubLObject pos_of_cat_cached(final SubLObject cat, final SubLObject mt)
  {
    SubLObject caching_state = $pos_of_cat_cached_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym82$POS_OF_CAT_CACHED, $sym95$_POS_OF_CAT_CACHED_CACHING_STATE_, NIL, EQUAL, TWO_INTEGER, ZERO_INTEGER );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( cat, mt );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( cat.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && mt.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( pos_of_cat_cached_internal( cat, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( cat, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 22776L)
  public static SubLObject make_cat_with_bar_level(final SubLObject head_cat, final SubLObject bar_level)
  {
    if( NIL == lexicon_accessors.speech_partP( head_cat, UNPROVIDED ) )
    {
      return head_cat;
    }
    if( bar_level.eql( ONE_INTEGER ) )
    {
      return function_terms.naut_to_nart( el_utilities.make_unary_formula( $const73$PhraseFn_Bar1, head_cat ) );
    }
    if( bar_level.eql( TWO_INTEGER ) )
    {
      return function_terms.naut_to_nart( el_utilities.make_unary_formula( $const74$PhraseFn, head_cat ) );
    }
    return head_cat;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 23090L)
  public static SubLObject clear_cached_lexical_functions()
  {
    lexicon_accessors.clear_cached_lexical_access_functions();
    lexicon_vars.clear_cached_lexical_vars();
    lexicon_accessors.clear_speech_part_pred_caches();
    return clear_cached_lexical_arg_types();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 23880L)
  public static SubLObject clear_lexical_info_caches(SubLObject v_term)
  {
    if( v_term == UNPROVIDED )
    {
      v_term = NIL;
    }
    if( NIL != kb_indexing_datastructures.indexed_term_p( v_term ) )
    {
      if( NIL != forts.fort_p( v_term ) )
      {
        nl_generation_fort_cache.nl_generation_cache_clear( v_term );
      }
      if( NIL != fort_types_interface.functor_p( v_term ) && NIL != kb_mapping_macros.do_function_extent_index_key_validator( v_term ) )
      {
        final SubLObject final_index_spec = kb_mapping_macros.function_extent_final_index_spec( v_term );
        SubLObject final_index_iterator = NIL;
        try
        {
          final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw96$GAF, NIL, NIL );
          SubLObject done_var = NIL;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject tou = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( tou ) );
            if( NIL != valid )
            {
              final SubLObject nart = assertions_high.gaf_arg1( tou );
              if( NIL != nart_handles.nart_p( nart ) )
              {
                nl_generation_fort_cache.nl_generation_cache_clear( nart );
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
          try
          {
            Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
            final SubLObject _values = Values.getValuesAsVector();
            if( NIL != final_index_iterator )
            {
              kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
            }
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
          }
        }
      }
    }
    clear_cached_lexifications_for_term();
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 24258L)
  public static SubLObject clear_cached_lexical_arg_types()
  {
    clear_denotatum_arg_of_pred_cached();
    clear_semtrans_arg_of_pred_cached();
    clear_pos_arg_of_pred_cached();
    clear_frame_arg_of_pred_cached();
    clear_sense_arg_of_pred_cached();
    clear_wu_arg_of_pred_cached();
    clear_stringlist_args_of_pred_cached();
    return $kw97$CLEARED;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 24661L)
  public static SubLObject clear_denotatum_arg_of_pred_cached()
  {
    return clear_denotatum_arg_of_pred_cached_int();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 24768L)
  public static SubLObject clear_stringlist_args_of_pred_cached()
  {
    return clear_stringlist_args_of_pred_cached_int();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 24879L)
  public static SubLObject clear_wu_arg_of_pred_cached()
  {
    return clear_wu_arg_of_pred_cached_int();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 24972L)
  public static SubLObject clear_sense_arg_of_pred_cached()
  {
    return clear_sense_arg_of_pred_cached_int();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 25071L)
  public static SubLObject clear_frame_arg_of_pred_cached()
  {
    return clear_frame_arg_of_pred_cached_int();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 25170L)
  public static SubLObject clear_semtrans_arg_of_pred_cached()
  {
    return clear_semtrans_arg_of_pred_cached_int();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 25275L)
  public static SubLObject denotatum_arg_of_pred_cached(final SubLObject pred)
  {
    return ( NIL != control_vars.kb_loaded() ) ? denotatum_arg_of_pred_cached_int( pred ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 25399L)
  public static SubLObject clear_denotatum_arg_of_pred_cached_int()
  {
    final SubLObject cs = $denotatum_arg_of_pred_cached_int_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 25399L)
  public static SubLObject remove_denotatum_arg_of_pred_cached_int(final SubLObject pred)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $denotatum_arg_of_pred_cached_int_caching_state$.getGlobalValue(), ConsesLow.list( pred ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 25399L)
  public static SubLObject denotatum_arg_of_pred_cached_int_internal(final SubLObject pred)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject arg = NIL;
    final SubLObject deck_type = $kw36$QUEUE;
    final SubLObject recur_deck = deck.create_deck( deck_type );
    SubLObject node_and_predicate_mode = NIL;
    final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
    try
    {
      sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
      try
      {
        final SubLObject tv_var = NIL;
        final SubLObject _prev_bind_0_$42 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
        final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
        try
        {
          sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
          sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym37$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
          if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
          {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
            if( pcase_var.eql( $kw38$ERROR ) )
            {
              sbhl_paranoia.sbhl_error( ONE_INTEGER, $str39$_A_is_not_a__A, tv_var, $sym40$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
            else if( pcase_var.eql( $kw41$CERROR ) )
            {
              sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str42$continue_anyway, $str39$_A_is_not_a__A, tv_var, $sym40$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
            else if( pcase_var.eql( $kw43$WARN ) )
            {
              Errors.warn( $str39$_A_is_not_a__A, tv_var, $sym40$SBHL_TRUE_TV_P );
            }
            else
            {
              Errors.warn( $str44$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
              Errors.cerror( $str42$continue_anyway, $str39$_A_is_not_a__A, tv_var, $sym40$SBHL_TRUE_TV_P );
            }
          }
          final SubLObject _prev_bind_0_$43 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
          final SubLObject _prev_bind_1_$44 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
          final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
          final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
          final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
          try
          {
            sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const45$genlPreds ), thread );
            sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const45$genlPreds ) ), thread );
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const45$genlPreds ) ), thread );
            sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
            sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const45$genlPreds ), thread );
            if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( pred, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
            {
              final SubLObject _prev_bind_0_$44 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
              final SubLObject _prev_bind_1_$45 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
              final SubLObject _prev_bind_2_$47 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
              try
              {
                sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_forward_search_direction(), thread );
                sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module(
                    $const45$genlPreds ) ), thread );
                sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                sbhl_marking_utilities.sbhl_mark_node_marked( pred, UNPROVIDED );
                for( node_and_predicate_mode = ConsesLow.list( pred, sbhl_search_vars.genl_inverse_mode_p() ); NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop( recur_deck ) )
                {
                  final SubLObject node_var_$48 = node_and_predicate_mode.first();
                  final SubLObject predicate_mode = conses_high.second( node_and_predicate_mode );
                  final SubLObject genl_pred = node_var_$48;
                  final SubLObject _prev_bind_0_$45 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                  try
                  {
                    sbhl_search_vars.$genl_inverse_mode_p$.bind( predicate_mode, thread );
                    if( NIL != sbhl_search_utilities.apply_sbhl_add_node_test( sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_$48 ) )
                    {
                      final SubLObject value = kb_mapping_utilities.fpred_value_in_any_mt( genl_pred, $const99$denotatumArg, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                      if( NIL != value )
                      {
                        arg = value;
                      }
                    }
                    SubLObject cdolist_list_var;
                    final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const45$genlPreds ) );
                    SubLObject module_var = NIL;
                    module_var = cdolist_list_var.first();
                    while ( NIL != cdolist_list_var)
                    {
                      final SubLObject _prev_bind_0_$46 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                      final SubLObject _prev_bind_1_$46 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                      try
                      {
                        sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                        sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                            .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                        final SubLObject node = function_terms.naut_to_nart( node_var_$48 );
                        if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                        {
                          final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                          if( NIL != d_link )
                          {
                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                            if( NIL != mt_links )
                            {
                              SubLObject iteration_state;
                              for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                  iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                              {
                                thread.resetMultipleValues();
                                final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                final SubLObject tv_links = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if( NIL != mt_relevance_macros.relevant_mtP( mt ) )
                                {
                                  final SubLObject _prev_bind_0_$47 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                  try
                                  {
                                    sbhl_link_vars.$sbhl_link_mt$.bind( mt, thread );
                                    SubLObject iteration_state_$53;
                                    for( iteration_state_$53 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                        iteration_state_$53 ); iteration_state_$53 = dictionary_contents.do_dictionary_contents_next( iteration_state_$53 ) )
                                    {
                                      thread.resetMultipleValues();
                                      final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$53 );
                                      final SubLObject link_nodes = thread.secondMultipleValue();
                                      thread.resetMultipleValues();
                                      if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                      {
                                        final SubLObject _prev_bind_0_$48 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                        try
                                        {
                                          sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                          final SubLObject sol = link_nodes;
                                          if( NIL != set.set_p( sol ) )
                                          {
                                            final SubLObject set_contents_var = set.do_set_internal( sol );
                                            SubLObject basis_object;
                                            SubLObject state;
                                            SubLObject node_vars_link_node;
                                            for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                            {
                                              node_vars_link_node = set_contents.do_set_contents_next( basis_object, state );
                                              if( NIL != set_contents.do_set_contents_element_validP( state, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node,
                                                  UNPROVIDED ) )
                                              {
                                                sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                deck.deck_push( ConsesLow.list( node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                              }
                                            }
                                          }
                                          else if( sol.isList() )
                                          {
                                            SubLObject csome_list_var = sol;
                                            SubLObject node_vars_link_node2 = NIL;
                                            node_vars_link_node2 = csome_list_var.first();
                                            while ( NIL != csome_list_var)
                                            {
                                              if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                              {
                                                sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                deck.deck_push( ConsesLow.list( node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                              }
                                              csome_list_var = csome_list_var.rest();
                                              node_vars_link_node2 = csome_list_var.first();
                                            }
                                          }
                                          else
                                          {
                                            Errors.error( $str47$_A_is_neither_SET_P_nor_LISTP_, sol );
                                          }
                                        }
                                        finally
                                        {
                                          sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$48, thread );
                                        }
                                      }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize( iteration_state_$53 );
                                  }
                                  finally
                                  {
                                    sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$47, thread );
                                  }
                                }
                              }
                              dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                            }
                          }
                          else
                          {
                            sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str48$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                          }
                        }
                        else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                        {
                          SubLObject cdolist_list_var_$55;
                          final SubLObject new_list = cdolist_list_var_$55 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                              .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                  UNPROVIDED ) ) )
                              : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                  .get_sbhl_module( UNPROVIDED ) ) );
                          SubLObject generating_fn = NIL;
                          generating_fn = cdolist_list_var_$55.first();
                          while ( NIL != cdolist_list_var_$55)
                          {
                            final SubLObject _prev_bind_0_$49 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                            try
                            {
                              sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                              final SubLObject sol2;
                              final SubLObject link_nodes2 = sol2 = Functions.funcall( generating_fn, node );
                              if( NIL != set.set_p( sol2 ) )
                              {
                                final SubLObject set_contents_var2 = set.do_set_internal( sol2 );
                                SubLObject basis_object2;
                                SubLObject state2;
                                SubLObject node_vars_link_node3;
                                for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                    set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                {
                                  node_vars_link_node3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                  if( NIL != set_contents.do_set_contents_element_validP( state2, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                      UNPROVIDED ) )
                                  {
                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                    deck.deck_push( ConsesLow.list( node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                  }
                                }
                              }
                              else if( sol2.isList() )
                              {
                                SubLObject csome_list_var2 = sol2;
                                SubLObject node_vars_link_node4 = NIL;
                                node_vars_link_node4 = csome_list_var2.first();
                                while ( NIL != csome_list_var2)
                                {
                                  if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                  {
                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                    deck.deck_push( ConsesLow.list( node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                  }
                                  csome_list_var2 = csome_list_var2.rest();
                                  node_vars_link_node4 = csome_list_var2.first();
                                }
                              }
                              else
                              {
                                Errors.error( $str47$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                              }
                            }
                            finally
                            {
                              sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$49, thread );
                            }
                            cdolist_list_var_$55 = cdolist_list_var_$55.rest();
                            generating_fn = cdolist_list_var_$55.first();
                          }
                        }
                      }
                      finally
                      {
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$46, thread );
                        sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$46, thread );
                      }
                      cdolist_list_var = cdolist_list_var.rest();
                      module_var = cdolist_list_var.first();
                    }
                  }
                  finally
                  {
                    sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_0_$45, thread );
                  }
                }
              }
              finally
              {
                sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$47, thread );
                sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$45, thread );
                sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$44, thread );
              }
            }
            else
            {
              sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str49$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED, UNPROVIDED,
                  UNPROVIDED );
            }
          }
          finally
          {
            sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
            sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_3, thread );
            sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$44, thread );
            sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$43, thread );
          }
        }
        finally
        {
          sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_2, thread );
          sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$42, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$50 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$50, thread );
        }
      }
    }
    finally
    {
      sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0, thread );
    }
    return arg;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 25399L)
  public static SubLObject denotatum_arg_of_pred_cached_int(final SubLObject pred)
  {
    SubLObject caching_state = $denotatum_arg_of_pred_cached_int_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym98$DENOTATUM_ARG_OF_PRED_CACHED_INT, $sym100$_DENOTATUM_ARG_OF_PRED_CACHED_INT_CACHING_STATE_, NIL, EQL, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, pred, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( denotatum_arg_of_pred_cached_int_internal( pred ) ) );
      memoization_state.caching_state_put( caching_state, pred, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 25670L)
  public static SubLObject semtrans_arg_of_pred_cached(final SubLObject pred)
  {
    return ( NIL != control_vars.kb_loaded() ) ? semtrans_arg_of_pred_cached_int( pred ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 25792L)
  public static SubLObject clear_semtrans_arg_of_pred_cached_int()
  {
    final SubLObject cs = $semtrans_arg_of_pred_cached_int_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 25792L)
  public static SubLObject remove_semtrans_arg_of_pred_cached_int(final SubLObject pred)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $semtrans_arg_of_pred_cached_int_caching_state$.getGlobalValue(), ConsesLow.list( pred ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 25792L)
  public static SubLObject semtrans_arg_of_pred_cached_int_internal(final SubLObject pred)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject arg = NIL;
    final SubLObject deck_type = $kw36$QUEUE;
    final SubLObject recur_deck = deck.create_deck( deck_type );
    SubLObject node_and_predicate_mode = NIL;
    final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
    try
    {
      sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
      try
      {
        final SubLObject tv_var = NIL;
        final SubLObject _prev_bind_0_$58 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
        final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
        try
        {
          sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
          sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym37$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
          if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
          {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
            if( pcase_var.eql( $kw38$ERROR ) )
            {
              sbhl_paranoia.sbhl_error( ONE_INTEGER, $str39$_A_is_not_a__A, tv_var, $sym40$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
            else if( pcase_var.eql( $kw41$CERROR ) )
            {
              sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str42$continue_anyway, $str39$_A_is_not_a__A, tv_var, $sym40$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
            else if( pcase_var.eql( $kw43$WARN ) )
            {
              Errors.warn( $str39$_A_is_not_a__A, tv_var, $sym40$SBHL_TRUE_TV_P );
            }
            else
            {
              Errors.warn( $str44$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
              Errors.cerror( $str42$continue_anyway, $str39$_A_is_not_a__A, tv_var, $sym40$SBHL_TRUE_TV_P );
            }
          }
          final SubLObject _prev_bind_0_$59 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
          final SubLObject _prev_bind_1_$60 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
          final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
          final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
          final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
          try
          {
            sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const45$genlPreds ), thread );
            sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const45$genlPreds ) ), thread );
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const45$genlPreds ) ), thread );
            sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
            sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const45$genlPreds ), thread );
            if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( pred, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
            {
              final SubLObject _prev_bind_0_$60 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
              final SubLObject _prev_bind_1_$61 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
              final SubLObject _prev_bind_2_$63 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
              try
              {
                sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_forward_search_direction(), thread );
                sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module(
                    $const45$genlPreds ) ), thread );
                sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                sbhl_marking_utilities.sbhl_mark_node_marked( pred, UNPROVIDED );
                for( node_and_predicate_mode = ConsesLow.list( pred, sbhl_search_vars.genl_inverse_mode_p() ); NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop( recur_deck ) )
                {
                  final SubLObject node_var_$64 = node_and_predicate_mode.first();
                  final SubLObject predicate_mode = conses_high.second( node_and_predicate_mode );
                  final SubLObject genl_pred = node_var_$64;
                  final SubLObject _prev_bind_0_$61 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                  try
                  {
                    sbhl_search_vars.$genl_inverse_mode_p$.bind( predicate_mode, thread );
                    if( NIL != sbhl_search_utilities.apply_sbhl_add_node_test( sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_$64 ) )
                    {
                      final SubLObject value = kb_mapping_utilities.fpred_value_in_any_mt( genl_pred, $const102$semTransArg, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                      if( NIL != value )
                      {
                        arg = value;
                      }
                    }
                    SubLObject cdolist_list_var;
                    final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const45$genlPreds ) );
                    SubLObject module_var = NIL;
                    module_var = cdolist_list_var.first();
                    while ( NIL != cdolist_list_var)
                    {
                      final SubLObject _prev_bind_0_$62 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                      final SubLObject _prev_bind_1_$62 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                      try
                      {
                        sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                        sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                            .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                        final SubLObject node = function_terms.naut_to_nart( node_var_$64 );
                        if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                        {
                          final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                          if( NIL != d_link )
                          {
                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                            if( NIL != mt_links )
                            {
                              SubLObject iteration_state;
                              for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                  iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                              {
                                thread.resetMultipleValues();
                                final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                final SubLObject tv_links = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if( NIL != mt_relevance_macros.relevant_mtP( mt ) )
                                {
                                  final SubLObject _prev_bind_0_$63 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                  try
                                  {
                                    sbhl_link_vars.$sbhl_link_mt$.bind( mt, thread );
                                    SubLObject iteration_state_$69;
                                    for( iteration_state_$69 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                        iteration_state_$69 ); iteration_state_$69 = dictionary_contents.do_dictionary_contents_next( iteration_state_$69 ) )
                                    {
                                      thread.resetMultipleValues();
                                      final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$69 );
                                      final SubLObject link_nodes = thread.secondMultipleValue();
                                      thread.resetMultipleValues();
                                      if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                      {
                                        final SubLObject _prev_bind_0_$64 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                        try
                                        {
                                          sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                          final SubLObject sol = link_nodes;
                                          if( NIL != set.set_p( sol ) )
                                          {
                                            final SubLObject set_contents_var = set.do_set_internal( sol );
                                            SubLObject basis_object;
                                            SubLObject state;
                                            SubLObject node_vars_link_node;
                                            for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                            {
                                              node_vars_link_node = set_contents.do_set_contents_next( basis_object, state );
                                              if( NIL != set_contents.do_set_contents_element_validP( state, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node,
                                                  UNPROVIDED ) )
                                              {
                                                sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                deck.deck_push( ConsesLow.list( node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                              }
                                            }
                                          }
                                          else if( sol.isList() )
                                          {
                                            SubLObject csome_list_var = sol;
                                            SubLObject node_vars_link_node2 = NIL;
                                            node_vars_link_node2 = csome_list_var.first();
                                            while ( NIL != csome_list_var)
                                            {
                                              if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                              {
                                                sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                deck.deck_push( ConsesLow.list( node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                              }
                                              csome_list_var = csome_list_var.rest();
                                              node_vars_link_node2 = csome_list_var.first();
                                            }
                                          }
                                          else
                                          {
                                            Errors.error( $str47$_A_is_neither_SET_P_nor_LISTP_, sol );
                                          }
                                        }
                                        finally
                                        {
                                          sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$64, thread );
                                        }
                                      }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize( iteration_state_$69 );
                                  }
                                  finally
                                  {
                                    sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$63, thread );
                                  }
                                }
                              }
                              dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                            }
                          }
                          else
                          {
                            sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str48$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                          }
                        }
                        else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                        {
                          SubLObject cdolist_list_var_$71;
                          final SubLObject new_list = cdolist_list_var_$71 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                              .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                  UNPROVIDED ) ) )
                              : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                  .get_sbhl_module( UNPROVIDED ) ) );
                          SubLObject generating_fn = NIL;
                          generating_fn = cdolist_list_var_$71.first();
                          while ( NIL != cdolist_list_var_$71)
                          {
                            final SubLObject _prev_bind_0_$65 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                            try
                            {
                              sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                              final SubLObject sol2;
                              final SubLObject link_nodes2 = sol2 = Functions.funcall( generating_fn, node );
                              if( NIL != set.set_p( sol2 ) )
                              {
                                final SubLObject set_contents_var2 = set.do_set_internal( sol2 );
                                SubLObject basis_object2;
                                SubLObject state2;
                                SubLObject node_vars_link_node3;
                                for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                    set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                {
                                  node_vars_link_node3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                  if( NIL != set_contents.do_set_contents_element_validP( state2, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                      UNPROVIDED ) )
                                  {
                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                    deck.deck_push( ConsesLow.list( node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                  }
                                }
                              }
                              else if( sol2.isList() )
                              {
                                SubLObject csome_list_var2 = sol2;
                                SubLObject node_vars_link_node4 = NIL;
                                node_vars_link_node4 = csome_list_var2.first();
                                while ( NIL != csome_list_var2)
                                {
                                  if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                  {
                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                    deck.deck_push( ConsesLow.list( node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                  }
                                  csome_list_var2 = csome_list_var2.rest();
                                  node_vars_link_node4 = csome_list_var2.first();
                                }
                              }
                              else
                              {
                                Errors.error( $str47$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                              }
                            }
                            finally
                            {
                              sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$65, thread );
                            }
                            cdolist_list_var_$71 = cdolist_list_var_$71.rest();
                            generating_fn = cdolist_list_var_$71.first();
                          }
                        }
                      }
                      finally
                      {
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$62, thread );
                        sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$62, thread );
                      }
                      cdolist_list_var = cdolist_list_var.rest();
                      module_var = cdolist_list_var.first();
                    }
                  }
                  finally
                  {
                    sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_0_$61, thread );
                  }
                }
              }
              finally
              {
                sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$63, thread );
                sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$61, thread );
                sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$60, thread );
              }
            }
            else
            {
              sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str49$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED, UNPROVIDED,
                  UNPROVIDED );
            }
          }
          finally
          {
            sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
            sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_3, thread );
            sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$60, thread );
            sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$59, thread );
          }
        }
        finally
        {
          sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_2, thread );
          sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$58, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$66 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$66, thread );
        }
      }
    }
    finally
    {
      sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0, thread );
    }
    return arg;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 25792L)
  public static SubLObject semtrans_arg_of_pred_cached_int(final SubLObject pred)
  {
    SubLObject caching_state = $semtrans_arg_of_pred_cached_int_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym101$SEMTRANS_ARG_OF_PRED_CACHED_INT, $sym103$_SEMTRANS_ARG_OF_PRED_CACHED_INT_CACHING_STATE_, NIL, EQL, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, pred, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( semtrans_arg_of_pred_cached_int_internal( pred ) ) );
      memoization_state.caching_state_put( caching_state, pred, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 26061L)
  public static SubLObject term_from_nl_assertion(final SubLObject assertion)
  {
    if( NIL != assertions_high.gaf_assertionP( assertion ) )
    {
      final SubLObject pred = assertions_high.gaf_arg0( assertion );
      final SubLObject denotatum_arg = denotatum_arg_of_pred_cached( pred );
      final SubLObject denot = ( NIL != el_utilities.valid_argnum_p( denotatum_arg ) ) ? assertions_high.gaf_arg( assertion, denotatum_arg ) : NIL;
      return denot;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 26415L)
  public static SubLObject clear_pos_arg_of_pred_cached()
  {
    $preds_to_pos_args$.setGlobalValue( misc_utilities.uninitialized() );
    return $preds_to_pos_args$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 26541L)
  public static SubLObject preds_to_pos_args()
  {
    if( NIL != misc_utilities.uninitialized_p( $preds_to_pos_args$.getGlobalValue() ) )
    {
      final SubLObject template = $list104;
      final SubLObject sentence = $list105;
      final SubLObject v_properties = $list106;
      final SubLObject alist = ask_utilities.query_template( template, sentence, $const107$InferencePSC, v_properties );
      $preds_to_pos_args$.setGlobalValue( dictionary_utilities.new_dictionary_from_alist( alist, Symbols.symbol_function( EQUAL ) ) );
    }
    return $preds_to_pos_args$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 27104L)
  public static SubLObject pos_arg_of_pred_cached(final SubLObject pred)
  {
    return get_pos_arg_of_pred( pred );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 27278L)
  public static SubLObject get_pos_arg_of_pred(final SubLObject pred)
  {
    return ( NIL != control_vars.kb_loaded() ) ? get_pos_arg_of_pred_int( pred ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 27730L)
  public static SubLObject clear_get_pos_arg_of_pred_int()
  {
    final SubLObject cs = $get_pos_arg_of_pred_int_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 27730L)
  public static SubLObject remove_get_pos_arg_of_pred_int(final SubLObject pred)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $get_pos_arg_of_pred_int_caching_state$.getGlobalValue(), ConsesLow.list( pred ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 27730L)
  public static SubLObject get_pos_arg_of_pred_int_internal(final SubLObject pred)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_arity = arity.arity( pred );
    SubLObject pos_arg = NIL;
    if( v_arity.isInteger() && NIL == pos_arg )
    {
      SubLObject end_var;
      SubLObject i;
      SubLObject _prev_bind_0;
      SubLObject _prev_bind_2;
      SubLObject deck_type;
      SubLObject recur_deck;
      SubLObject node_and_predicate_mode;
      SubLObject _prev_bind_0_$74;
      SubLObject tv_var;
      SubLObject _prev_bind_0_$75;
      SubLObject _prev_bind_1_$76;
      SubLObject pcase_var;
      SubLObject _prev_bind_0_$76;
      SubLObject _prev_bind_1_$77;
      SubLObject _prev_bind_3;
      SubLObject _prev_bind_4;
      SubLObject _prev_bind_5;
      SubLObject _prev_bind_0_$77;
      SubLObject _prev_bind_1_$78;
      SubLObject _prev_bind_2_$81;
      SubLObject node_var_$82;
      SubLObject predicate_mode;
      SubLObject genl_pred;
      SubLObject _prev_bind_0_$78;
      SubLObject cdolist_list_var;
      SubLObject accessible_modules;
      SubLObject module_var;
      SubLObject _prev_bind_0_$79;
      SubLObject _prev_bind_1_$79;
      SubLObject node;
      SubLObject d_link;
      SubLObject mt_links;
      SubLObject iteration_state;
      SubLObject mt;
      SubLObject tv_links;
      SubLObject _prev_bind_0_$80;
      SubLObject iteration_state_$87;
      SubLObject tv;
      SubLObject link_nodes;
      SubLObject _prev_bind_0_$81;
      SubLObject sol;
      SubLObject set_contents_var;
      SubLObject basis_object;
      SubLObject state;
      SubLObject node_vars_link_node;
      SubLObject csome_list_var;
      SubLObject node_vars_link_node2;
      SubLObject cdolist_list_var_$89;
      SubLObject new_list;
      SubLObject generating_fn;
      SubLObject _prev_bind_0_$82;
      SubLObject sol2;
      SubLObject link_nodes2;
      SubLObject set_contents_var2;
      SubLObject basis_object2;
      SubLObject state2;
      SubLObject node_vars_link_node3;
      SubLObject csome_list_var2;
      SubLObject node_vars_link_node4;
      SubLObject _prev_bind_0_$83;
      SubLObject _values;
      for( end_var = number_utilities.f_1X( v_arity ), i = NIL, i = ONE_INTEGER; NIL == pos_arg && !i.numGE( end_var ); i = number_utilities.f_1X( i ) )
      {
        _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$relevant_mt_function$.bind( $sym32$RELEVANT_MT_IS_EVERYTHING, thread );
          mt_relevance_macros.$mt$.bind( $const33$EverythingPSC, thread );
          deck_type = $kw36$QUEUE;
          recur_deck = deck.create_deck( deck_type );
          node_and_predicate_mode = NIL;
          _prev_bind_0_$74 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
          try
          {
            sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
            try
            {
              tv_var = NIL;
              _prev_bind_0_$75 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
              _prev_bind_1_$76 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
              try
              {
                sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
                sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym37$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
                if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
                {
                  pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
                  if( pcase_var.eql( $kw38$ERROR ) )
                  {
                    sbhl_paranoia.sbhl_error( ONE_INTEGER, $str39$_A_is_not_a__A, tv_var, $sym40$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                  }
                  else if( pcase_var.eql( $kw41$CERROR ) )
                  {
                    sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str42$continue_anyway, $str39$_A_is_not_a__A, tv_var, $sym40$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                  }
                  else if( pcase_var.eql( $kw43$WARN ) )
                  {
                    Errors.warn( $str39$_A_is_not_a__A, tv_var, $sym40$SBHL_TRUE_TV_P );
                  }
                  else
                  {
                    Errors.warn( $str44$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                    Errors.cerror( $str42$continue_anyway, $str39$_A_is_not_a__A, tv_var, $sym40$SBHL_TRUE_TV_P );
                  }
                }
                _prev_bind_0_$76 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
                _prev_bind_1_$77 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
                _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
                _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                try
                {
                  sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const45$genlPreds ), thread );
                  sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const45$genlPreds ) ), thread );
                  sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const45$genlPreds ) ), thread );
                  sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                  sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const45$genlPreds ), thread );
                  if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( pred, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                  {
                    _prev_bind_0_$77 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                    _prev_bind_1_$78 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                    _prev_bind_2_$81 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                    try
                    {
                      sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_forward_search_direction(), thread );
                      sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module(
                          $const45$genlPreds ) ), thread );
                      sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                      sbhl_marking_utilities.sbhl_mark_node_marked( pred, UNPROVIDED );
                      for( node_and_predicate_mode = ConsesLow.list( pred, sbhl_search_vars.genl_inverse_mode_p() ); NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop( recur_deck ) )
                      {
                        node_var_$82 = node_and_predicate_mode.first();
                        predicate_mode = conses_high.second( node_and_predicate_mode );
                        genl_pred = node_var_$82;
                        _prev_bind_0_$78 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                        try
                        {
                          sbhl_search_vars.$genl_inverse_mode_p$.bind( predicate_mode, thread );
                          if( NIL != sbhl_search_utilities.apply_sbhl_add_node_test( sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_$82 ) && NIL != lexicon_accessors.argn_is_speech_partP( genl_pred, i ) )
                          {
                            pos_arg = i;
                          }
                          accessible_modules = ( cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const45$genlPreds ) ) );
                          module_var = NIL;
                          module_var = cdolist_list_var.first();
                          while ( NIL != cdolist_list_var)
                          {
                            _prev_bind_0_$79 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                            _prev_bind_1_$79 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                            try
                            {
                              sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                              sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                                  .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                              node = function_terms.naut_to_nart( node_var_$82 );
                              if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                              {
                                d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                if( NIL != d_link )
                                {
                                  mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                  if( NIL != mt_links )
                                  {
                                    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                                    {
                                      thread.resetMultipleValues();
                                      mt = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                      tv_links = thread.secondMultipleValue();
                                      thread.resetMultipleValues();
                                      if( NIL != mt_relevance_macros.relevant_mtP( mt ) )
                                      {
                                        _prev_bind_0_$80 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                        try
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.bind( mt, thread );
                                          for( iteration_state_$87 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents
                                              .do_dictionary_contents_doneP( iteration_state_$87 ); iteration_state_$87 = dictionary_contents.do_dictionary_contents_next( iteration_state_$87 ) )
                                          {
                                            thread.resetMultipleValues();
                                            tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$87 );
                                            link_nodes = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                            {
                                              _prev_bind_0_$81 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                              try
                                              {
                                                sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                                sol = link_nodes;
                                                if( NIL != set.set_p( sol ) )
                                                {
                                                  set_contents_var = set.do_set_internal( sol );
                                                  for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                      set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                                  {
                                                    node_vars_link_node = set_contents.do_set_contents_next( basis_object, state );
                                                    if( NIL != set_contents.do_set_contents_element_validP( state, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(
                                                        node_vars_link_node, UNPROVIDED ) )
                                                    {
                                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                      deck.deck_push( ConsesLow.list( node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                                    }
                                                  }
                                                }
                                                else if( sol.isList() )
                                                {
                                                  csome_list_var = sol;
                                                  node_vars_link_node2 = NIL;
                                                  node_vars_link_node2 = csome_list_var.first();
                                                  while ( NIL != csome_list_var)
                                                  {
                                                    if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                                    {
                                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                      deck.deck_push( ConsesLow.list( node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                                    }
                                                    csome_list_var = csome_list_var.rest();
                                                    node_vars_link_node2 = csome_list_var.first();
                                                  }
                                                }
                                                else
                                                {
                                                  Errors.error( $str47$_A_is_neither_SET_P_nor_LISTP_, sol );
                                                }
                                              }
                                              finally
                                              {
                                                sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$81, thread );
                                              }
                                            }
                                          }
                                          dictionary_contents.do_dictionary_contents_finalize( iteration_state_$87 );
                                        }
                                        finally
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$80, thread );
                                        }
                                      }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                                  }
                                }
                                else
                                {
                                  sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str48$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                }
                              }
                              else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                              {
                                new_list = ( cdolist_list_var_$89 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                    .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                        UNPROVIDED ) ) )
                                    : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                        .get_sbhl_module( UNPROVIDED ) ) ) );
                                generating_fn = NIL;
                                generating_fn = cdolist_list_var_$89.first();
                                while ( NIL != cdolist_list_var_$89)
                                {
                                  _prev_bind_0_$82 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                  try
                                  {
                                    sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                                    link_nodes2 = ( sol2 = Functions.funcall( generating_fn, node ) );
                                    if( NIL != set.set_p( sol2 ) )
                                    {
                                      set_contents_var2 = set.do_set_internal( sol2 );
                                      for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                          set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                      {
                                        node_vars_link_node3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                        if( NIL != set_contents.do_set_contents_element_validP( state2, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                            UNPROVIDED ) )
                                        {
                                          sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                          deck.deck_push( ConsesLow.list( node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                        }
                                      }
                                    }
                                    else if( sol2.isList() )
                                    {
                                      csome_list_var2 = sol2;
                                      node_vars_link_node4 = NIL;
                                      node_vars_link_node4 = csome_list_var2.first();
                                      while ( NIL != csome_list_var2)
                                      {
                                        if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                        {
                                          sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                          deck.deck_push( ConsesLow.list( node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                        }
                                        csome_list_var2 = csome_list_var2.rest();
                                        node_vars_link_node4 = csome_list_var2.first();
                                      }
                                    }
                                    else
                                    {
                                      Errors.error( $str47$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                    }
                                  }
                                  finally
                                  {
                                    sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$82, thread );
                                  }
                                  cdolist_list_var_$89 = cdolist_list_var_$89.rest();
                                  generating_fn = cdolist_list_var_$89.first();
                                }
                              }
                            }
                            finally
                            {
                              sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$79, thread );
                              sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$79, thread );
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            module_var = cdolist_list_var.first();
                          }
                        }
                        finally
                        {
                          sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_0_$78, thread );
                        }
                      }
                    }
                    finally
                    {
                      sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$81, thread );
                      sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$78, thread );
                      sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$77, thread );
                    }
                  }
                  else
                  {
                    sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str49$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED,
                        UNPROVIDED, UNPROVIDED );
                  }
                }
                finally
                {
                  sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
                  sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
                  sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_3, thread );
                  sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$77, thread );
                  sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$76, thread );
                }
              }
              finally
              {
                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$76, thread );
                sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$75, thread );
              }
            }
            finally
            {
              _prev_bind_0_$83 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                _values = Values.getValuesAsVector();
                sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$83, thread );
              }
            }
          }
          finally
          {
            sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$74, thread );
          }
        }
        finally
        {
          mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
        }
      }
    }
    return pos_arg;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 27730L)
  public static SubLObject get_pos_arg_of_pred_int(final SubLObject pred)
  {
    SubLObject caching_state = $get_pos_arg_of_pred_int_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym108$GET_POS_ARG_OF_PRED_INT, $sym109$_GET_POS_ARG_OF_PRED_INT_CACHING_STATE_, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, pred, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( get_pos_arg_of_pred_int_internal( pred ) ) );
      memoization_state.caching_state_put( caching_state, pred, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 28114L)
  public static SubLObject frame_arg_of_pred_cached(final SubLObject pred, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    return ( NIL != control_vars.kb_loaded() ) ? frame_arg_of_pred_cached_int( pred, mt ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 28369L)
  public static SubLObject clear_frame_arg_of_pred_cached_int()
  {
    final SubLObject cs = $frame_arg_of_pred_cached_int_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 28369L)
  public static SubLObject remove_frame_arg_of_pred_cached_int(final SubLObject pred, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    return memoization_state.caching_state_remove_function_results_with_args( $frame_arg_of_pred_cached_int_caching_state$.getGlobalValue(), ConsesLow.list( pred, mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 28369L)
  public static SubLObject frame_arg_of_pred_cached_int_internal(final SubLObject pred, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_arity = arity.arity( pred );
    SubLObject pos_arg = NIL;
    if( v_arity.isInteger() && NIL == pos_arg )
    {
      SubLObject end_var;
      SubLObject i;
      SubLObject mt_var;
      SubLObject _prev_bind_0;
      SubLObject _prev_bind_2;
      SubLObject _prev_bind_3;
      SubLObject deck_type;
      SubLObject recur_deck;
      SubLObject node_and_predicate_mode;
      SubLObject _prev_bind_0_$92;
      SubLObject tv_var;
      SubLObject _prev_bind_0_$93;
      SubLObject _prev_bind_1_$94;
      SubLObject pcase_var;
      SubLObject _prev_bind_0_$94;
      SubLObject _prev_bind_1_$95;
      SubLObject _prev_bind_2_$97;
      SubLObject _prev_bind_4;
      SubLObject _prev_bind_5;
      SubLObject _prev_bind_0_$95;
      SubLObject _prev_bind_1_$96;
      SubLObject _prev_bind_2_$98;
      SubLObject node_var_$101;
      SubLObject predicate_mode;
      SubLObject genl_pred;
      SubLObject _prev_bind_0_$96;
      SubLObject cdolist_list_var;
      SubLObject accessible_modules;
      SubLObject module_var;
      SubLObject _prev_bind_0_$97;
      SubLObject _prev_bind_1_$97;
      SubLObject node;
      SubLObject d_link;
      SubLObject mt_links;
      SubLObject iteration_state;
      SubLObject mt_$105;
      SubLObject tv_links;
      SubLObject _prev_bind_0_$98;
      SubLObject iteration_state_$107;
      SubLObject tv;
      SubLObject link_nodes;
      SubLObject _prev_bind_0_$99;
      SubLObject sol;
      SubLObject set_contents_var;
      SubLObject basis_object;
      SubLObject state;
      SubLObject node_vars_link_node;
      SubLObject csome_list_var;
      SubLObject node_vars_link_node2;
      SubLObject cdolist_list_var_$109;
      SubLObject new_list;
      SubLObject generating_fn;
      SubLObject _prev_bind_0_$100;
      SubLObject sol2;
      SubLObject link_nodes2;
      SubLObject set_contents_var2;
      SubLObject basis_object2;
      SubLObject state2;
      SubLObject node_vars_link_node3;
      SubLObject csome_list_var2;
      SubLObject node_vars_link_node4;
      SubLObject _prev_bind_0_$101;
      SubLObject _values;
      for( end_var = number_utilities.f_1X( v_arity ), i = NIL, i = ONE_INTEGER; NIL == pos_arg && !i.numGE( end_var ); i = number_utilities.f_1X( i ) )
      {
        mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
        _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
        _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
          mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
          mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
          deck_type = $kw36$QUEUE;
          recur_deck = deck.create_deck( deck_type );
          node_and_predicate_mode = NIL;
          _prev_bind_0_$92 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
          try
          {
            sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
            try
            {
              tv_var = NIL;
              _prev_bind_0_$93 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
              _prev_bind_1_$94 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
              try
              {
                sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
                sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym37$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
                if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
                {
                  pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
                  if( pcase_var.eql( $kw38$ERROR ) )
                  {
                    sbhl_paranoia.sbhl_error( ONE_INTEGER, $str39$_A_is_not_a__A, tv_var, $sym40$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                  }
                  else if( pcase_var.eql( $kw41$CERROR ) )
                  {
                    sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str42$continue_anyway, $str39$_A_is_not_a__A, tv_var, $sym40$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                  }
                  else if( pcase_var.eql( $kw43$WARN ) )
                  {
                    Errors.warn( $str39$_A_is_not_a__A, tv_var, $sym40$SBHL_TRUE_TV_P );
                  }
                  else
                  {
                    Errors.warn( $str44$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                    Errors.cerror( $str42$continue_anyway, $str39$_A_is_not_a__A, tv_var, $sym40$SBHL_TRUE_TV_P );
                  }
                }
                _prev_bind_0_$94 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
                _prev_bind_1_$95 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
                _prev_bind_2_$97 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
                _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                try
                {
                  sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const45$genlPreds ), thread );
                  sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const45$genlPreds ) ), thread );
                  sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const45$genlPreds ) ), thread );
                  sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                  sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const45$genlPreds ), thread );
                  if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( pred, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                  {
                    _prev_bind_0_$95 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                    _prev_bind_1_$96 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                    _prev_bind_2_$98 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                    try
                    {
                      sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_forward_search_direction(), thread );
                      sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module(
                          $const45$genlPreds ) ), thread );
                      sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                      sbhl_marking_utilities.sbhl_mark_node_marked( pred, UNPROVIDED );
                      for( node_and_predicate_mode = ConsesLow.list( pred, sbhl_search_vars.genl_inverse_mode_p() ); NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop( recur_deck ) )
                      {
                        node_var_$101 = node_and_predicate_mode.first();
                        predicate_mode = conses_high.second( node_and_predicate_mode );
                        genl_pred = node_var_$101;
                        _prev_bind_0_$96 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                        try
                        {
                          sbhl_search_vars.$genl_inverse_mode_p$.bind( predicate_mode, thread );
                          if( NIL != sbhl_search_utilities.apply_sbhl_add_node_test( sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_$101 ) && NIL != subl_promotions.memberP( $const111$SubcategorizationFrame,
                              kb_accessors.argn_isa( genl_pred, i, mt ), $sym112$SPEC_, UNPROVIDED ) )
                          {
                            pos_arg = i;
                          }
                          accessible_modules = ( cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const45$genlPreds ) ) );
                          module_var = NIL;
                          module_var = cdolist_list_var.first();
                          while ( NIL != cdolist_list_var)
                          {
                            _prev_bind_0_$97 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                            _prev_bind_1_$97 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                            try
                            {
                              sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                              sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                                  .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                              node = function_terms.naut_to_nart( node_var_$101 );
                              if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                              {
                                d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                if( NIL != d_link )
                                {
                                  mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                  if( NIL != mt_links )
                                  {
                                    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                                    {
                                      thread.resetMultipleValues();
                                      mt_$105 = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                      tv_links = thread.secondMultipleValue();
                                      thread.resetMultipleValues();
                                      if( NIL != mt_relevance_macros.relevant_mtP( mt_$105 ) )
                                      {
                                        _prev_bind_0_$98 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                        try
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.bind( mt_$105, thread );
                                          for( iteration_state_$107 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents
                                              .do_dictionary_contents_doneP( iteration_state_$107 ); iteration_state_$107 = dictionary_contents.do_dictionary_contents_next( iteration_state_$107 ) )
                                          {
                                            thread.resetMultipleValues();
                                            tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$107 );
                                            link_nodes = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                            {
                                              _prev_bind_0_$99 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                              try
                                              {
                                                sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                                sol = link_nodes;
                                                if( NIL != set.set_p( sol ) )
                                                {
                                                  set_contents_var = set.do_set_internal( sol );
                                                  for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                      set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                                  {
                                                    node_vars_link_node = set_contents.do_set_contents_next( basis_object, state );
                                                    if( NIL != set_contents.do_set_contents_element_validP( state, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(
                                                        node_vars_link_node, UNPROVIDED ) )
                                                    {
                                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                      deck.deck_push( ConsesLow.list( node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                                    }
                                                  }
                                                }
                                                else if( sol.isList() )
                                                {
                                                  csome_list_var = sol;
                                                  node_vars_link_node2 = NIL;
                                                  node_vars_link_node2 = csome_list_var.first();
                                                  while ( NIL != csome_list_var)
                                                  {
                                                    if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                                    {
                                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                      deck.deck_push( ConsesLow.list( node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                                    }
                                                    csome_list_var = csome_list_var.rest();
                                                    node_vars_link_node2 = csome_list_var.first();
                                                  }
                                                }
                                                else
                                                {
                                                  Errors.error( $str47$_A_is_neither_SET_P_nor_LISTP_, sol );
                                                }
                                              }
                                              finally
                                              {
                                                sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$99, thread );
                                              }
                                            }
                                          }
                                          dictionary_contents.do_dictionary_contents_finalize( iteration_state_$107 );
                                        }
                                        finally
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$98, thread );
                                        }
                                      }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                                  }
                                }
                                else
                                {
                                  sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str48$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                }
                              }
                              else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                              {
                                new_list = ( cdolist_list_var_$109 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                    .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                        UNPROVIDED ) ) )
                                    : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                        .get_sbhl_module( UNPROVIDED ) ) ) );
                                generating_fn = NIL;
                                generating_fn = cdolist_list_var_$109.first();
                                while ( NIL != cdolist_list_var_$109)
                                {
                                  _prev_bind_0_$100 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                  try
                                  {
                                    sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                                    link_nodes2 = ( sol2 = Functions.funcall( generating_fn, node ) );
                                    if( NIL != set.set_p( sol2 ) )
                                    {
                                      set_contents_var2 = set.do_set_internal( sol2 );
                                      for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                          set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                      {
                                        node_vars_link_node3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                        if( NIL != set_contents.do_set_contents_element_validP( state2, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                            UNPROVIDED ) )
                                        {
                                          sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                          deck.deck_push( ConsesLow.list( node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                        }
                                      }
                                    }
                                    else if( sol2.isList() )
                                    {
                                      csome_list_var2 = sol2;
                                      node_vars_link_node4 = NIL;
                                      node_vars_link_node4 = csome_list_var2.first();
                                      while ( NIL != csome_list_var2)
                                      {
                                        if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                        {
                                          sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                          deck.deck_push( ConsesLow.list( node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                        }
                                        csome_list_var2 = csome_list_var2.rest();
                                        node_vars_link_node4 = csome_list_var2.first();
                                      }
                                    }
                                    else
                                    {
                                      Errors.error( $str47$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                    }
                                  }
                                  finally
                                  {
                                    sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$100, thread );
                                  }
                                  cdolist_list_var_$109 = cdolist_list_var_$109.rest();
                                  generating_fn = cdolist_list_var_$109.first();
                                }
                              }
                            }
                            finally
                            {
                              sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$97, thread );
                              sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$97, thread );
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            module_var = cdolist_list_var.first();
                          }
                        }
                        finally
                        {
                          sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_0_$96, thread );
                        }
                      }
                    }
                    finally
                    {
                      sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$98, thread );
                      sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$96, thread );
                      sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$95, thread );
                    }
                  }
                  else
                  {
                    sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str49$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED,
                        UNPROVIDED, UNPROVIDED );
                  }
                }
                finally
                {
                  sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
                  sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
                  sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_2_$97, thread );
                  sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$95, thread );
                  sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$94, thread );
                }
              }
              finally
              {
                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$94, thread );
                sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$93, thread );
              }
            }
            finally
            {
              _prev_bind_0_$101 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                _values = Values.getValuesAsVector();
                sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$101, thread );
              }
            }
          }
          finally
          {
            sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$92, thread );
          }
        }
        finally
        {
          mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
          mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
        }
      }
    }
    return pos_arg;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 28369L)
  public static SubLObject frame_arg_of_pred_cached_int(final SubLObject pred, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    SubLObject caching_state = $frame_arg_of_pred_cached_int_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym110$FRAME_ARG_OF_PRED_CACHED_INT, $sym113$_FRAME_ARG_OF_PRED_CACHED_INT_CACHING_STATE_, NIL, EQL, TWO_INTEGER, ZERO_INTEGER );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( pred, mt );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( pred.eql( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && mt.eql( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( frame_arg_of_pred_cached_int_internal( pred, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( pred, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 28831L)
  public static SubLObject wu_arg_of_pred_cached(final SubLObject pred)
  {
    if( NIL != kb_utilities.kbeq( pred, $const114$partOfSpeech ) )
    {
      return ONE_INTEGER;
    }
    if( NIL != control_vars.kb_loaded() )
    {
      return wu_arg_of_pred_cached_int( pred );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 29162L)
  public static SubLObject clear_wu_arg_of_pred_cached_int()
  {
    final SubLObject cs = $wu_arg_of_pred_cached_int_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 29162L)
  public static SubLObject remove_wu_arg_of_pred_cached_int(final SubLObject pred)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $wu_arg_of_pred_cached_int_caching_state$.getGlobalValue(), ConsesLow.list( pred ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 29162L)
  public static SubLObject wu_arg_of_pred_cached_int_internal(final SubLObject pred)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_arity = arity.arity( pred );
    SubLObject wu_arg = NIL;
    if( v_arity.isInteger() && NIL == wu_arg )
    {
      SubLObject end_var;
      SubLObject i;
      SubLObject _prev_bind_0;
      SubLObject _prev_bind_2;
      SubLObject deck_type;
      SubLObject recur_deck;
      SubLObject node_and_predicate_mode;
      SubLObject _prev_bind_0_$112;
      SubLObject tv_var;
      SubLObject _prev_bind_0_$113;
      SubLObject _prev_bind_1_$114;
      SubLObject pcase_var;
      SubLObject _prev_bind_0_$114;
      SubLObject _prev_bind_1_$115;
      SubLObject _prev_bind_3;
      SubLObject _prev_bind_4;
      SubLObject _prev_bind_5;
      SubLObject _prev_bind_0_$115;
      SubLObject _prev_bind_1_$116;
      SubLObject _prev_bind_2_$119;
      SubLObject node_var_$120;
      SubLObject predicate_mode;
      SubLObject genl_pred;
      SubLObject _prev_bind_0_$116;
      SubLObject csome_list_var;
      SubLObject fort;
      SubLObject cdolist_list_var;
      SubLObject accessible_modules;
      SubLObject module_var;
      SubLObject _prev_bind_0_$117;
      SubLObject _prev_bind_1_$117;
      SubLObject node;
      SubLObject d_link;
      SubLObject mt_links;
      SubLObject iteration_state;
      SubLObject mt;
      SubLObject tv_links;
      SubLObject _prev_bind_0_$118;
      SubLObject iteration_state_$125;
      SubLObject tv;
      SubLObject link_nodes;
      SubLObject _prev_bind_0_$119;
      SubLObject sol;
      SubLObject set_contents_var;
      SubLObject basis_object;
      SubLObject state;
      SubLObject node_vars_link_node;
      SubLObject csome_list_var2;
      SubLObject node_vars_link_node2;
      SubLObject cdolist_list_var_$127;
      SubLObject new_list;
      SubLObject generating_fn;
      SubLObject _prev_bind_0_$120;
      SubLObject sol2;
      SubLObject link_nodes2;
      SubLObject set_contents_var2;
      SubLObject basis_object2;
      SubLObject state2;
      SubLObject node_vars_link_node3;
      SubLObject csome_list_var3;
      SubLObject node_vars_link_node4;
      SubLObject _prev_bind_0_$121;
      SubLObject _values;
      for( end_var = number_utilities.f_1X( v_arity ), i = NIL, i = ONE_INTEGER; NIL == wu_arg && !i.numGE( end_var ); i = number_utilities.f_1X( i ) )
      {
        _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$relevant_mt_function$.bind( $sym32$RELEVANT_MT_IS_EVERYTHING, thread );
          mt_relevance_macros.$mt$.bind( $const33$EverythingPSC, thread );
          deck_type = $kw36$QUEUE;
          recur_deck = deck.create_deck( deck_type );
          node_and_predicate_mode = NIL;
          _prev_bind_0_$112 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
          try
          {
            sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
            try
            {
              tv_var = NIL;
              _prev_bind_0_$113 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
              _prev_bind_1_$114 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
              try
              {
                sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
                sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym37$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
                if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
                {
                  pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
                  if( pcase_var.eql( $kw38$ERROR ) )
                  {
                    sbhl_paranoia.sbhl_error( ONE_INTEGER, $str39$_A_is_not_a__A, tv_var, $sym40$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                  }
                  else if( pcase_var.eql( $kw41$CERROR ) )
                  {
                    sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str42$continue_anyway, $str39$_A_is_not_a__A, tv_var, $sym40$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                  }
                  else if( pcase_var.eql( $kw43$WARN ) )
                  {
                    Errors.warn( $str39$_A_is_not_a__A, tv_var, $sym40$SBHL_TRUE_TV_P );
                  }
                  else
                  {
                    Errors.warn( $str44$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                    Errors.cerror( $str42$continue_anyway, $str39$_A_is_not_a__A, tv_var, $sym40$SBHL_TRUE_TV_P );
                  }
                }
                _prev_bind_0_$114 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
                _prev_bind_1_$115 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
                _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
                _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                try
                {
                  sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const45$genlPreds ), thread );
                  sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const45$genlPreds ) ), thread );
                  sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const45$genlPreds ) ), thread );
                  sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                  sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const45$genlPreds ), thread );
                  if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( pred, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                  {
                    _prev_bind_0_$115 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                    _prev_bind_1_$116 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                    _prev_bind_2_$119 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                    try
                    {
                      sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_forward_search_direction(), thread );
                      sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module(
                          $const45$genlPreds ) ), thread );
                      sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                      sbhl_marking_utilities.sbhl_mark_node_marked( pred, UNPROVIDED );
                      for( node_and_predicate_mode = ConsesLow.list( pred, sbhl_search_vars.genl_inverse_mode_p() ); NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop( recur_deck ) )
                      {
                        node_var_$120 = node_and_predicate_mode.first();
                        predicate_mode = conses_high.second( node_and_predicate_mode );
                        genl_pred = node_var_$120;
                        _prev_bind_0_$116 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                        try
                        {
                          sbhl_search_vars.$genl_inverse_mode_p$.bind( predicate_mode, thread );
                          if( NIL != sbhl_search_utilities.apply_sbhl_add_node_test( sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_$120 ) && NIL == wu_arg )
                          {
                            csome_list_var = kb_accessors.argn_isa( genl_pred, i, UNPROVIDED );
                            fort = NIL;
                            fort = csome_list_var.first();
                            while ( NIL == wu_arg && NIL != csome_list_var)
                            {
                              if( NIL != genls.genlP( fort, $const116$LexicalWord, UNPROVIDED, UNPROVIDED ) )
                              {
                                wu_arg = i;
                              }
                              csome_list_var = csome_list_var.rest();
                              fort = csome_list_var.first();
                            }
                          }
                          accessible_modules = ( cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const45$genlPreds ) ) );
                          module_var = NIL;
                          module_var = cdolist_list_var.first();
                          while ( NIL != cdolist_list_var)
                          {
                            _prev_bind_0_$117 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                            _prev_bind_1_$117 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                            try
                            {
                              sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                              sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                                  .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                              node = function_terms.naut_to_nart( node_var_$120 );
                              if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                              {
                                d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                if( NIL != d_link )
                                {
                                  mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                  if( NIL != mt_links )
                                  {
                                    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                                    {
                                      thread.resetMultipleValues();
                                      mt = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                      tv_links = thread.secondMultipleValue();
                                      thread.resetMultipleValues();
                                      if( NIL != mt_relevance_macros.relevant_mtP( mt ) )
                                      {
                                        _prev_bind_0_$118 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                        try
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.bind( mt, thread );
                                          for( iteration_state_$125 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents
                                              .do_dictionary_contents_doneP( iteration_state_$125 ); iteration_state_$125 = dictionary_contents.do_dictionary_contents_next( iteration_state_$125 ) )
                                          {
                                            thread.resetMultipleValues();
                                            tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$125 );
                                            link_nodes = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                            {
                                              _prev_bind_0_$119 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                              try
                                              {
                                                sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                                sol = link_nodes;
                                                if( NIL != set.set_p( sol ) )
                                                {
                                                  set_contents_var = set.do_set_internal( sol );
                                                  for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                      set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                                  {
                                                    node_vars_link_node = set_contents.do_set_contents_next( basis_object, state );
                                                    if( NIL != set_contents.do_set_contents_element_validP( state, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(
                                                        node_vars_link_node, UNPROVIDED ) )
                                                    {
                                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                      deck.deck_push( ConsesLow.list( node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                                    }
                                                  }
                                                }
                                                else if( sol.isList() )
                                                {
                                                  csome_list_var2 = sol;
                                                  node_vars_link_node2 = NIL;
                                                  node_vars_link_node2 = csome_list_var2.first();
                                                  while ( NIL != csome_list_var2)
                                                  {
                                                    if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                                    {
                                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                      deck.deck_push( ConsesLow.list( node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                                    }
                                                    csome_list_var2 = csome_list_var2.rest();
                                                    node_vars_link_node2 = csome_list_var2.first();
                                                  }
                                                }
                                                else
                                                {
                                                  Errors.error( $str47$_A_is_neither_SET_P_nor_LISTP_, sol );
                                                }
                                              }
                                              finally
                                              {
                                                sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$119, thread );
                                              }
                                            }
                                          }
                                          dictionary_contents.do_dictionary_contents_finalize( iteration_state_$125 );
                                        }
                                        finally
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$118, thread );
                                        }
                                      }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                                  }
                                }
                                else
                                {
                                  sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str48$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                }
                              }
                              else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                              {
                                new_list = ( cdolist_list_var_$127 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                    .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                        UNPROVIDED ) ) )
                                    : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                        .get_sbhl_module( UNPROVIDED ) ) ) );
                                generating_fn = NIL;
                                generating_fn = cdolist_list_var_$127.first();
                                while ( NIL != cdolist_list_var_$127)
                                {
                                  _prev_bind_0_$120 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                  try
                                  {
                                    sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                                    link_nodes2 = ( sol2 = Functions.funcall( generating_fn, node ) );
                                    if( NIL != set.set_p( sol2 ) )
                                    {
                                      set_contents_var2 = set.do_set_internal( sol2 );
                                      for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                          set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                      {
                                        node_vars_link_node3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                        if( NIL != set_contents.do_set_contents_element_validP( state2, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                            UNPROVIDED ) )
                                        {
                                          sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                          deck.deck_push( ConsesLow.list( node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                        }
                                      }
                                    }
                                    else if( sol2.isList() )
                                    {
                                      csome_list_var3 = sol2;
                                      node_vars_link_node4 = NIL;
                                      node_vars_link_node4 = csome_list_var3.first();
                                      while ( NIL != csome_list_var3)
                                      {
                                        if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                        {
                                          sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                          deck.deck_push( ConsesLow.list( node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                        }
                                        csome_list_var3 = csome_list_var3.rest();
                                        node_vars_link_node4 = csome_list_var3.first();
                                      }
                                    }
                                    else
                                    {
                                      Errors.error( $str47$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                    }
                                  }
                                  finally
                                  {
                                    sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$120, thread );
                                  }
                                  cdolist_list_var_$127 = cdolist_list_var_$127.rest();
                                  generating_fn = cdolist_list_var_$127.first();
                                }
                              }
                            }
                            finally
                            {
                              sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$117, thread );
                              sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$117, thread );
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            module_var = cdolist_list_var.first();
                          }
                        }
                        finally
                        {
                          sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_0_$116, thread );
                        }
                      }
                    }
                    finally
                    {
                      sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$119, thread );
                      sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$116, thread );
                      sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$115, thread );
                    }
                  }
                  else
                  {
                    sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str49$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED,
                        UNPROVIDED, UNPROVIDED );
                  }
                }
                finally
                {
                  sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
                  sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
                  sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_3, thread );
                  sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$115, thread );
                  sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$114, thread );
                }
              }
              finally
              {
                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$114, thread );
                sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$113, thread );
              }
            }
            finally
            {
              _prev_bind_0_$121 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                _values = Values.getValuesAsVector();
                sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$121, thread );
              }
            }
          }
          finally
          {
            sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$112, thread );
          }
        }
        finally
        {
          mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
        }
      }
    }
    return wu_arg;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 29162L)
  public static SubLObject wu_arg_of_pred_cached_int(final SubLObject pred)
  {
    SubLObject caching_state = $wu_arg_of_pred_cached_int_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym115$WU_ARG_OF_PRED_CACHED_INT, $sym117$_WU_ARG_OF_PRED_CACHED_INT_CACHING_STATE_, NIL, EQL, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, pred, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( wu_arg_of_pred_cached_int_internal( pred ) ) );
      memoization_state.caching_state_put( caching_state, pred, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 29557L)
  public static SubLObject sense_arg_of_pred_cached(final SubLObject pred)
  {
    return ( NIL != control_vars.kb_loaded() ) ? sense_arg_of_pred_cached_int( pred ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 29751L)
  public static SubLObject clear_sense_arg_of_pred_cached_int()
  {
    final SubLObject cs = $sense_arg_of_pred_cached_int_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 29751L)
  public static SubLObject remove_sense_arg_of_pred_cached_int(final SubLObject pred)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $sense_arg_of_pred_cached_int_caching_state$.getGlobalValue(), ConsesLow.list( pred ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 29751L)
  public static SubLObject sense_arg_of_pred_cached_int_internal(final SubLObject pred)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_arity = arity.arity( pred );
    SubLObject sense_arg = NIL;
    if( v_arity.isInteger() && NIL == sense_arg )
    {
      SubLObject end_var;
      SubLObject i;
      SubLObject _prev_bind_0;
      SubLObject _prev_bind_2;
      SubLObject deck_type;
      SubLObject recur_deck;
      SubLObject node_and_predicate_mode;
      SubLObject _prev_bind_0_$130;
      SubLObject tv_var;
      SubLObject _prev_bind_0_$131;
      SubLObject _prev_bind_1_$132;
      SubLObject pcase_var;
      SubLObject _prev_bind_0_$132;
      SubLObject _prev_bind_1_$133;
      SubLObject _prev_bind_3;
      SubLObject _prev_bind_4;
      SubLObject _prev_bind_5;
      SubLObject _prev_bind_0_$133;
      SubLObject _prev_bind_1_$134;
      SubLObject _prev_bind_2_$137;
      SubLObject node_var_$138;
      SubLObject predicate_mode;
      SubLObject genl_pred;
      SubLObject _prev_bind_0_$134;
      SubLObject csome_list_var;
      SubLObject fort;
      SubLObject cdolist_list_var;
      SubLObject accessible_modules;
      SubLObject module_var;
      SubLObject _prev_bind_0_$135;
      SubLObject _prev_bind_1_$135;
      SubLObject node;
      SubLObject d_link;
      SubLObject mt_links;
      SubLObject iteration_state;
      SubLObject mt;
      SubLObject tv_links;
      SubLObject _prev_bind_0_$136;
      SubLObject iteration_state_$143;
      SubLObject tv;
      SubLObject link_nodes;
      SubLObject _prev_bind_0_$137;
      SubLObject sol;
      SubLObject set_contents_var;
      SubLObject basis_object;
      SubLObject state;
      SubLObject node_vars_link_node;
      SubLObject csome_list_var2;
      SubLObject node_vars_link_node2;
      SubLObject cdolist_list_var_$145;
      SubLObject new_list;
      SubLObject generating_fn;
      SubLObject _prev_bind_0_$138;
      SubLObject sol2;
      SubLObject link_nodes2;
      SubLObject set_contents_var2;
      SubLObject basis_object2;
      SubLObject state2;
      SubLObject node_vars_link_node3;
      SubLObject csome_list_var3;
      SubLObject node_vars_link_node4;
      SubLObject _prev_bind_0_$139;
      SubLObject _values;
      for( end_var = number_utilities.f_1X( v_arity ), i = NIL, i = ONE_INTEGER; NIL == sense_arg && !i.numGE( end_var ); i = number_utilities.f_1X( i ) )
      {
        _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$relevant_mt_function$.bind( $sym32$RELEVANT_MT_IS_EVERYTHING, thread );
          mt_relevance_macros.$mt$.bind( $const33$EverythingPSC, thread );
          deck_type = $kw36$QUEUE;
          recur_deck = deck.create_deck( deck_type );
          node_and_predicate_mode = NIL;
          _prev_bind_0_$130 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
          try
          {
            sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
            try
            {
              tv_var = NIL;
              _prev_bind_0_$131 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
              _prev_bind_1_$132 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
              try
              {
                sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
                sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym37$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
                if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
                {
                  pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
                  if( pcase_var.eql( $kw38$ERROR ) )
                  {
                    sbhl_paranoia.sbhl_error( ONE_INTEGER, $str39$_A_is_not_a__A, tv_var, $sym40$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                  }
                  else if( pcase_var.eql( $kw41$CERROR ) )
                  {
                    sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str42$continue_anyway, $str39$_A_is_not_a__A, tv_var, $sym40$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                  }
                  else if( pcase_var.eql( $kw43$WARN ) )
                  {
                    Errors.warn( $str39$_A_is_not_a__A, tv_var, $sym40$SBHL_TRUE_TV_P );
                  }
                  else
                  {
                    Errors.warn( $str44$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                    Errors.cerror( $str42$continue_anyway, $str39$_A_is_not_a__A, tv_var, $sym40$SBHL_TRUE_TV_P );
                  }
                }
                _prev_bind_0_$132 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
                _prev_bind_1_$133 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
                _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
                _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                try
                {
                  sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const45$genlPreds ), thread );
                  sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const45$genlPreds ) ), thread );
                  sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const45$genlPreds ) ), thread );
                  sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                  sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const45$genlPreds ), thread );
                  if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( pred, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                  {
                    _prev_bind_0_$133 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                    _prev_bind_1_$134 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                    _prev_bind_2_$137 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                    try
                    {
                      sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_forward_search_direction(), thread );
                      sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module(
                          $const45$genlPreds ) ), thread );
                      sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                      sbhl_marking_utilities.sbhl_mark_node_marked( pred, UNPROVIDED );
                      for( node_and_predicate_mode = ConsesLow.list( pred, sbhl_search_vars.genl_inverse_mode_p() ); NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop( recur_deck ) )
                      {
                        node_var_$138 = node_and_predicate_mode.first();
                        predicate_mode = conses_high.second( node_and_predicate_mode );
                        genl_pred = node_var_$138;
                        _prev_bind_0_$134 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                        try
                        {
                          sbhl_search_vars.$genl_inverse_mode_p$.bind( predicate_mode, thread );
                          if( NIL != sbhl_search_utilities.apply_sbhl_add_node_test( sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_$138 ) && NIL == sense_arg )
                          {
                            csome_list_var = kb_accessors.argn_isa( genl_pred, i, UNPROVIDED );
                            fort = NIL;
                            fort = csome_list_var.first();
                            while ( NIL == sense_arg && NIL != csome_list_var)
                            {
                              if( NIL != genls.genlP( fort, $const119$Integer, UNPROVIDED, UNPROVIDED ) )
                              {
                                sense_arg = i;
                              }
                              csome_list_var = csome_list_var.rest();
                              fort = csome_list_var.first();
                            }
                          }
                          accessible_modules = ( cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const45$genlPreds ) ) );
                          module_var = NIL;
                          module_var = cdolist_list_var.first();
                          while ( NIL != cdolist_list_var)
                          {
                            _prev_bind_0_$135 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                            _prev_bind_1_$135 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                            try
                            {
                              sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                              sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                                  .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                              node = function_terms.naut_to_nart( node_var_$138 );
                              if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                              {
                                d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                if( NIL != d_link )
                                {
                                  mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                  if( NIL != mt_links )
                                  {
                                    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                                    {
                                      thread.resetMultipleValues();
                                      mt = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                      tv_links = thread.secondMultipleValue();
                                      thread.resetMultipleValues();
                                      if( NIL != mt_relevance_macros.relevant_mtP( mt ) )
                                      {
                                        _prev_bind_0_$136 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                        try
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.bind( mt, thread );
                                          for( iteration_state_$143 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents
                                              .do_dictionary_contents_doneP( iteration_state_$143 ); iteration_state_$143 = dictionary_contents.do_dictionary_contents_next( iteration_state_$143 ) )
                                          {
                                            thread.resetMultipleValues();
                                            tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$143 );
                                            link_nodes = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                            {
                                              _prev_bind_0_$137 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                              try
                                              {
                                                sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                                sol = link_nodes;
                                                if( NIL != set.set_p( sol ) )
                                                {
                                                  set_contents_var = set.do_set_internal( sol );
                                                  for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                      set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                                  {
                                                    node_vars_link_node = set_contents.do_set_contents_next( basis_object, state );
                                                    if( NIL != set_contents.do_set_contents_element_validP( state, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(
                                                        node_vars_link_node, UNPROVIDED ) )
                                                    {
                                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                      deck.deck_push( ConsesLow.list( node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                                    }
                                                  }
                                                }
                                                else if( sol.isList() )
                                                {
                                                  csome_list_var2 = sol;
                                                  node_vars_link_node2 = NIL;
                                                  node_vars_link_node2 = csome_list_var2.first();
                                                  while ( NIL != csome_list_var2)
                                                  {
                                                    if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                                    {
                                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                      deck.deck_push( ConsesLow.list( node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                                    }
                                                    csome_list_var2 = csome_list_var2.rest();
                                                    node_vars_link_node2 = csome_list_var2.first();
                                                  }
                                                }
                                                else
                                                {
                                                  Errors.error( $str47$_A_is_neither_SET_P_nor_LISTP_, sol );
                                                }
                                              }
                                              finally
                                              {
                                                sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$137, thread );
                                              }
                                            }
                                          }
                                          dictionary_contents.do_dictionary_contents_finalize( iteration_state_$143 );
                                        }
                                        finally
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$136, thread );
                                        }
                                      }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                                  }
                                }
                                else
                                {
                                  sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str48$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                }
                              }
                              else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                              {
                                new_list = ( cdolist_list_var_$145 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                    .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                        UNPROVIDED ) ) )
                                    : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                        .get_sbhl_module( UNPROVIDED ) ) ) );
                                generating_fn = NIL;
                                generating_fn = cdolist_list_var_$145.first();
                                while ( NIL != cdolist_list_var_$145)
                                {
                                  _prev_bind_0_$138 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                  try
                                  {
                                    sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                                    link_nodes2 = ( sol2 = Functions.funcall( generating_fn, node ) );
                                    if( NIL != set.set_p( sol2 ) )
                                    {
                                      set_contents_var2 = set.do_set_internal( sol2 );
                                      for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                          set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                      {
                                        node_vars_link_node3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                        if( NIL != set_contents.do_set_contents_element_validP( state2, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                            UNPROVIDED ) )
                                        {
                                          sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                          deck.deck_push( ConsesLow.list( node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                        }
                                      }
                                    }
                                    else if( sol2.isList() )
                                    {
                                      csome_list_var3 = sol2;
                                      node_vars_link_node4 = NIL;
                                      node_vars_link_node4 = csome_list_var3.first();
                                      while ( NIL != csome_list_var3)
                                      {
                                        if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                        {
                                          sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                          deck.deck_push( ConsesLow.list( node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                        }
                                        csome_list_var3 = csome_list_var3.rest();
                                        node_vars_link_node4 = csome_list_var3.first();
                                      }
                                    }
                                    else
                                    {
                                      Errors.error( $str47$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                    }
                                  }
                                  finally
                                  {
                                    sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$138, thread );
                                  }
                                  cdolist_list_var_$145 = cdolist_list_var_$145.rest();
                                  generating_fn = cdolist_list_var_$145.first();
                                }
                              }
                            }
                            finally
                            {
                              sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$135, thread );
                              sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$135, thread );
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            module_var = cdolist_list_var.first();
                          }
                        }
                        finally
                        {
                          sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_0_$134, thread );
                        }
                      }
                    }
                    finally
                    {
                      sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$137, thread );
                      sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$134, thread );
                      sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$133, thread );
                    }
                  }
                  else
                  {
                    sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str49$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED,
                        UNPROVIDED, UNPROVIDED );
                  }
                }
                finally
                {
                  sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
                  sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
                  sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_3, thread );
                  sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$133, thread );
                  sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$132, thread );
                }
              }
              finally
              {
                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$132, thread );
                sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$131, thread );
              }
            }
            finally
            {
              _prev_bind_0_$139 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                _values = Values.getValuesAsVector();
                sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$139, thread );
              }
            }
          }
          finally
          {
            sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$130, thread );
          }
        }
        finally
        {
          mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
        }
      }
    }
    return sense_arg;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 29751L)
  public static SubLObject sense_arg_of_pred_cached_int(final SubLObject pred)
  {
    SubLObject caching_state = $sense_arg_of_pred_cached_int_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym118$SENSE_ARG_OF_PRED_CACHED_INT, $sym120$_SENSE_ARG_OF_PRED_CACHED_INT_CACHING_STATE_, NIL, EQL, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, pred, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( sense_arg_of_pred_cached_int_internal( pred ) ) );
      memoization_state.caching_state_put( caching_state, pred, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 30160L)
  public static SubLObject stringlist_args_of_pred_cached(final SubLObject pred)
  {
    return ( NIL != control_vars.kb_loaded() && NIL != kb_indexing_datastructures.indexed_term_p( pred ) ) ? stringlist_args_of_pred_cached_int( pred ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 30424L)
  public static SubLObject clear_stringlist_args_of_pred_cached_int()
  {
    final SubLObject cs = $stringlist_args_of_pred_cached_int_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 30424L)
  public static SubLObject remove_stringlist_args_of_pred_cached_int(final SubLObject pred)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $stringlist_args_of_pred_cached_int_caching_state$.getGlobalValue(), ConsesLow.list( pred ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 30424L)
  public static SubLObject stringlist_args_of_pred_cached_int_internal(final SubLObject pred)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject stringlist_args = NIL;
    SubLObject cdolist_list_var;
    final SubLObject list_types = cdolist_list_var = ConsesLow.list( narts_high.find_nart( $list122 ), narts_high.find_nart( $list123 ) );
    SubLObject list_type = NIL;
    list_type = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym32$RELEVANT_MT_IS_EVERYTHING, thread );
        mt_relevance_macros.$mt$.bind( $const33$EverythingPSC, thread );
        final SubLObject deck_type = $kw36$QUEUE;
        final SubLObject recur_deck = deck.create_deck( deck_type );
        SubLObject node_and_predicate_mode = NIL;
        final SubLObject _prev_bind_0_$148 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
        try
        {
          sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
          try
          {
            final SubLObject tv_var = NIL;
            final SubLObject _prev_bind_0_$149 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
            final SubLObject _prev_bind_1_$150 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
            try
            {
              sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
              sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym37$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
              if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
              {
                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
                if( pcase_var.eql( $kw38$ERROR ) )
                {
                  sbhl_paranoia.sbhl_error( ONE_INTEGER, $str39$_A_is_not_a__A, tv_var, $sym40$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
                else if( pcase_var.eql( $kw41$CERROR ) )
                {
                  sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str42$continue_anyway, $str39$_A_is_not_a__A, tv_var, $sym40$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
                else if( pcase_var.eql( $kw43$WARN ) )
                {
                  Errors.warn( $str39$_A_is_not_a__A, tv_var, $sym40$SBHL_TRUE_TV_P );
                }
                else
                {
                  Errors.warn( $str44$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                  Errors.cerror( $str42$continue_anyway, $str39$_A_is_not_a__A, tv_var, $sym40$SBHL_TRUE_TV_P );
                }
              }
              final SubLObject _prev_bind_0_$150 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
              final SubLObject _prev_bind_1_$151 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
              final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
              final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
              final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
              try
              {
                sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const45$genlPreds ), thread );
                sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const45$genlPreds ) ), thread );
                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const45$genlPreds ) ), thread );
                sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const45$genlPreds ), thread );
                if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( pred, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                {
                  final SubLObject _prev_bind_0_$151 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                  final SubLObject _prev_bind_1_$152 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                  final SubLObject _prev_bind_2_$155 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                  try
                  {
                    sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_forward_search_direction(), thread );
                    sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module(
                        $const45$genlPreds ) ), thread );
                    sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                    sbhl_marking_utilities.sbhl_mark_node_marked( pred, UNPROVIDED );
                    for( node_and_predicate_mode = ConsesLow.list( pred, sbhl_search_vars.genl_inverse_mode_p() ); NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop( recur_deck ) )
                    {
                      final SubLObject node_var_$156 = node_and_predicate_mode.first();
                      final SubLObject predicate_mode = conses_high.second( node_and_predicate_mode );
                      final SubLObject genl_pred = node_var_$156;
                      final SubLObject _prev_bind_0_$152 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                      try
                      {
                        sbhl_search_vars.$genl_inverse_mode_p$.bind( predicate_mode, thread );
                        if( NIL != sbhl_search_utilities.apply_sbhl_add_node_test( sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_$156 ) )
                        {
                          SubLObject cdolist_list_var_$158 = Sequences.remove_duplicates( kb_mapping_utilities.pred_value_tuples( genl_pred, $const125$argIsa, ONE_INTEGER, $list126, UNPROVIDED ), Symbols.symbol_function(
                              EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
                          SubLObject pair = NIL;
                          pair = cdolist_list_var_$158.first();
                          while ( NIL != cdolist_list_var_$158)
                          {
                            SubLObject current;
                            final SubLObject datum = current = pair;
                            SubLObject argnum = NIL;
                            SubLObject col = NIL;
                            cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list124 );
                            argnum = current.first();
                            current = current.rest();
                            cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list124 );
                            col = current.first();
                            current = current.rest();
                            if( NIL == current )
                            {
                              if( NIL != genls.genlP( col, list_type, UNPROVIDED, UNPROVIDED ) )
                              {
                                final SubLObject item_var = argnum;
                                if( NIL == conses_high.member( item_var, stringlist_args, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
                                {
                                  stringlist_args = ConsesLow.cons( item_var, stringlist_args );
                                }
                              }
                            }
                            else
                            {
                              cdestructuring_bind.cdestructuring_bind_error( datum, $list124 );
                            }
                            cdolist_list_var_$158 = cdolist_list_var_$158.rest();
                            pair = cdolist_list_var_$158.first();
                          }
                        }
                        SubLObject cdolist_list_var_$159;
                        final SubLObject accessible_modules = cdolist_list_var_$159 = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const45$genlPreds ) );
                        SubLObject module_var = NIL;
                        module_var = cdolist_list_var_$159.first();
                        while ( NIL != cdolist_list_var_$159)
                        {
                          final SubLObject _prev_bind_0_$153 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                          final SubLObject _prev_bind_1_$153 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                          try
                          {
                            sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                            sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                                .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                            final SubLObject node = function_terms.naut_to_nart( node_var_$156 );
                            if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                            {
                              final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                              if( NIL != d_link )
                              {
                                final SubLObject mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                if( NIL != mt_links )
                                {
                                  SubLObject iteration_state;
                                  for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                      iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                                  {
                                    thread.resetMultipleValues();
                                    final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                    final SubLObject tv_links = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if( NIL != mt_relevance_macros.relevant_mtP( mt ) )
                                    {
                                      final SubLObject _prev_bind_0_$154 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                      try
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.bind( mt, thread );
                                        SubLObject iteration_state_$163;
                                        for( iteration_state_$163 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                            iteration_state_$163 ); iteration_state_$163 = dictionary_contents.do_dictionary_contents_next( iteration_state_$163 ) )
                                        {
                                          thread.resetMultipleValues();
                                          final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$163 );
                                          final SubLObject link_nodes = thread.secondMultipleValue();
                                          thread.resetMultipleValues();
                                          if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                          {
                                            final SubLObject _prev_bind_0_$155 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                            try
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                              final SubLObject sol = link_nodes;
                                              if( NIL != set.set_p( sol ) )
                                              {
                                                final SubLObject set_contents_var = set.do_set_internal( sol );
                                                SubLObject basis_object;
                                                SubLObject state;
                                                SubLObject node_vars_link_node;
                                                for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                    set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                                {
                                                  node_vars_link_node = set_contents.do_set_contents_next( basis_object, state );
                                                  if( NIL != set_contents.do_set_contents_element_validP( state, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node,
                                                      UNPROVIDED ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                    deck.deck_push( ConsesLow.list( node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                                  }
                                                }
                                              }
                                              else if( sol.isList() )
                                              {
                                                SubLObject csome_list_var = sol;
                                                SubLObject node_vars_link_node2 = NIL;
                                                node_vars_link_node2 = csome_list_var.first();
                                                while ( NIL != csome_list_var)
                                                {
                                                  if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                    deck.deck_push( ConsesLow.list( node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                                  }
                                                  csome_list_var = csome_list_var.rest();
                                                  node_vars_link_node2 = csome_list_var.first();
                                                }
                                              }
                                              else
                                              {
                                                Errors.error( $str47$_A_is_neither_SET_P_nor_LISTP_, sol );
                                              }
                                            }
                                            finally
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$155, thread );
                                            }
                                          }
                                        }
                                        dictionary_contents.do_dictionary_contents_finalize( iteration_state_$163 );
                                      }
                                      finally
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$154, thread );
                                      }
                                    }
                                  }
                                  dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                                }
                              }
                              else
                              {
                                sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str48$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                              }
                            }
                            else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                            {
                              SubLObject cdolist_list_var_$160;
                              final SubLObject new_list = cdolist_list_var_$160 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                  .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                      UNPROVIDED ) ) )
                                  : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                      .get_sbhl_module( UNPROVIDED ) ) );
                              SubLObject generating_fn = NIL;
                              generating_fn = cdolist_list_var_$160.first();
                              while ( NIL != cdolist_list_var_$160)
                              {
                                final SubLObject _prev_bind_0_$156 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                try
                                {
                                  sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                                  final SubLObject sol2;
                                  final SubLObject link_nodes2 = sol2 = Functions.funcall( generating_fn, node );
                                  if( NIL != set.set_p( sol2 ) )
                                  {
                                    final SubLObject set_contents_var2 = set.do_set_internal( sol2 );
                                    SubLObject basis_object2;
                                    SubLObject state2;
                                    SubLObject node_vars_link_node3;
                                    for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                        set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                    {
                                      node_vars_link_node3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                      if( NIL != set_contents.do_set_contents_element_validP( state2, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                          UNPROVIDED ) )
                                      {
                                        sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                        deck.deck_push( ConsesLow.list( node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                      }
                                    }
                                  }
                                  else if( sol2.isList() )
                                  {
                                    SubLObject csome_list_var2 = sol2;
                                    SubLObject node_vars_link_node4 = NIL;
                                    node_vars_link_node4 = csome_list_var2.first();
                                    while ( NIL != csome_list_var2)
                                    {
                                      if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                      {
                                        sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                        deck.deck_push( ConsesLow.list( node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                      }
                                      csome_list_var2 = csome_list_var2.rest();
                                      node_vars_link_node4 = csome_list_var2.first();
                                    }
                                  }
                                  else
                                  {
                                    Errors.error( $str47$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                  }
                                }
                                finally
                                {
                                  sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$156, thread );
                                }
                                cdolist_list_var_$160 = cdolist_list_var_$160.rest();
                                generating_fn = cdolist_list_var_$160.first();
                              }
                            }
                          }
                          finally
                          {
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$153, thread );
                            sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$153, thread );
                          }
                          cdolist_list_var_$159 = cdolist_list_var_$159.rest();
                          module_var = cdolist_list_var_$159.first();
                        }
                      }
                      finally
                      {
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_0_$152, thread );
                      }
                    }
                  }
                  finally
                  {
                    sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$155, thread );
                    sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$152, thread );
                    sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$151, thread );
                  }
                }
                else
                {
                  sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str49$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED, UNPROVIDED,
                      UNPROVIDED );
                }
              }
              finally
              {
                sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
                sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_3, thread );
                sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$151, thread );
                sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$150, thread );
              }
            }
            finally
            {
              sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$150, thread );
              sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$149, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$157 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values = Values.getValuesAsVector();
              sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$157, thread );
            }
          }
        }
        finally
        {
          sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$148, thread );
        }
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
      cdolist_list_var = cdolist_list_var.rest();
      list_type = cdolist_list_var.first();
    }
    return Sort.sort( stringlist_args, Symbols.symbol_function( $sym127$_ ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 30424L)
  public static SubLObject stringlist_args_of_pred_cached_int(final SubLObject pred)
  {
    SubLObject caching_state = $stringlist_args_of_pred_cached_int_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym121$STRINGLIST_ARGS_OF_PRED_CACHED_INT, $sym128$_STRINGLIST_ARGS_OF_PRED_CACHED_INT_CACHING_STATE_, NIL, EQL, ONE_INTEGER, $int58$64 );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, pred, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( stringlist_args_of_pred_cached_int_internal( pred ) ) );
      memoization_state.caching_state_put( caching_state, pred, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 31109L)
  public static SubLObject get_string_list_from_formula(final SubLObject formula, final SubLObject arg_pos)
  {
    final SubLObject string_list = unicode_nauts.convert_unicode_nauts_to_utf8_strings( cycl_utilities.formula_arg( formula, arg_pos, UNPROVIDED ) );
    if( NIL != el_utilities.el_list_p( string_list ) )
    {
      return el_utilities.el_list_items( string_list );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 31352L)
  public static SubLObject get_leading_strings_and_following_strings_argnums(final SubLObject formula)
  {
    final SubLObject pred = cycl_utilities.formula_operator( formula );
    final SubLObject wu_arg = wu_arg_of_pred_cached( pred );
    final SubLObject stringlist_args = stringlist_args_of_pred_cached( pred );
    final SubLObject leading_strings_arg = ( NIL != wu_arg ) ? Sequences.find( wu_arg, stringlist_args, $sym129$_, UNPROVIDED, UNPROVIDED, UNPROVIDED ) : NIL;
    final SubLObject following_strings_arg = ( NIL != wu_arg ) ? Sequences.find( wu_arg, stringlist_args, $sym127$_, UNPROVIDED, UNPROVIDED, UNPROVIDED ) : NIL;
    return Values.values( leading_strings_arg, following_strings_arg );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 31780L)
  public static SubLObject get_leading_strings_from_formula(final SubLObject formula)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject leading_string_arg = get_leading_strings_and_following_strings_argnums( formula );
    final SubLObject following_string_arg = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != leading_string_arg )
    {
      return get_string_list_from_formula( formula, leading_string_arg );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 32111L)
  public static SubLObject get_following_strings_from_formula(final SubLObject formula)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject leading_string_arg = get_leading_strings_and_following_strings_argnums( formula );
    final SubLObject following_string_arg = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != following_string_arg )
    {
      return get_string_list_from_formula( formula, following_string_arg );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 32446L)
  public static SubLObject get_leading_strings_and_following_strings(final SubLObject formula)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject leading_strings = NIL;
    SubLObject following_strings = NIL;
    thread.resetMultipleValues();
    final SubLObject leading_string_arg = get_leading_strings_and_following_strings_argnums( formula );
    final SubLObject following_string_arg = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != leading_string_arg )
    {
      leading_strings = get_string_list_from_formula( formula, leading_string_arg );
    }
    if( NIL != following_string_arg )
    {
      following_strings = get_string_list_from_formula( formula, following_string_arg );
    }
    return Values.values( leading_strings, following_strings );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 32993L)
  public static SubLObject parse_denot_formula(final SubLObject formula)
  {
    assert NIL != denot_formula_p( formula ) : formula;
    return parse_lexical_semantic_formula( formula, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 33210L)
  public static SubLObject denot_formula_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != el_utilities.el_formula_p( v_object ) && denotatum_arg_of_pred_cached( cycl_utilities.formula_arg0( v_object ) ).isInteger() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 33362L)
  public static SubLObject parse_lexical_semantic_formula(final SubLObject formula, SubLObject just_this)
  {
    if( just_this == UNPROVIDED )
    {
      just_this = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != el_utilities.el_formula_p( formula ) : formula;
    final SubLObject formula_terms = cycl_utilities.formula_terms( formula, UNPROVIDED );
    final SubLObject pred = ConsesLow.nth( ZERO_INTEGER, formula_terms );
    SubLObject denot = NIL;
    SubLObject wu = NIL;
    SubLObject leading_strings = NIL;
    SubLObject following_strings = NIL;
    SubLObject pos = NIL;
    final SubLObject denot_arg = denotatum_arg_of_pred_cached( pred );
    final SubLObject pos_arg = pos_arg_of_pred_cached( pred );
    final SubLObject wu_arg = wu_arg_of_pred_cached( pred );
    if( wu_arg.isInteger() )
    {
      if( denot_arg.isInteger() )
      {
        denot = ConsesLow.nth( denot_arg, formula_terms );
      }
      pos = ( ( NIL != pos_arg ) ? ConsesLow.nth( pos_arg, formula_terms ) : lexicon_accessors.semtrans_pred_to_pos( pred, UNPROVIDED ) );
      wu = ConsesLow.nth( wu_arg, formula_terms );
      thread.resetMultipleValues();
      final SubLObject leading_strings_$168 = get_leading_strings_and_following_strings( formula );
      final SubLObject following_strings_$169 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      leading_strings = leading_strings_$168;
      following_strings = following_strings_$169;
    }
    if( just_this.eql( $kw132$POS ) )
    {
      return pos;
    }
    if( just_this.eql( $kw11$DENOT ) )
    {
      return denot;
    }
    if( just_this.eql( $kw133$PRED ) )
    {
      return pred;
    }
    if( just_this.eql( $kw134$WU ) )
    {
      return wu;
    }
    return Values.values( leading_strings, wu, following_strings, pos, denot, pred );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 34470L)
  public static SubLObject lexical_semantic_formula_genl_posP(final SubLObject formula, final SubLObject pos, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return lexicon_accessors.genl_posP( parse_lexical_semantic_formula( formula, $kw132$POS ), pos, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 34625L)
  public static SubLObject lexical_semantic_formula_matches_head_stringXposP(final SubLObject formula, final SubLObject string, final SubLObject target_pos, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    thread.resetMultipleValues();
    final SubLObject lead = parse_lexical_semantic_formula( formula, UNPROVIDED );
    final SubLObject head_wu = thread.secondMultipleValue();
    final SubLObject follow = thread.thirdMultipleValue();
    final SubLObject formula_pos = thread.fourthMultipleValue();
    final SubLObject denot = thread.fifthMultipleValue();
    final SubLObject pred = thread.sixthMultipleValue();
    thread.resetMultipleValues();
    if( NIL != subl_promotions.memberP( string, lexicon_cache.strings_of_word_unit( head_wu, ConsesLow.list( $const55$nounStrings ), UNPROVIDED, UNPROVIDED ), $sym135$STRING_, UNPROVIDED ) )
    {
      ans = lexicon_accessors.genl_posP( formula_pos, target_pos, mt );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 35059L)
  public static SubLObject assemble_denot_strings(final SubLObject leading_strings, final SubLObject wu_string, final SubLObject following_strings)
  {
    if( NIL == leading_strings && NIL == following_strings )
    {
      return wu_string;
    }
    if( NIL == leading_strings )
    {
      return Sequences.cconcatenate( wu_string, new SubLObject[] { $str136$_, string_utilities.bunge( following_strings, Characters.CHAR_space )
      } );
    }
    if( NIL == following_strings )
    {
      return Sequences.cconcatenate( string_utilities.bunge( leading_strings, Characters.CHAR_space ), new SubLObject[] { $str136$_, wu_string
      } );
    }
    return Sequences.cconcatenate( string_utilities.bunge( leading_strings, UNPROVIDED ), new SubLObject[] { $str136$_, wu_string, $str136$_, string_utilities.bunge( following_strings, UNPROVIDED )
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 35671L)
  public static SubLObject proper_noun_form_of_pred(final SubLObject pred)
  {
    return list_utilities.alist_reverse_lookup_without_values( proper_to_common_pred_map(), pred, Symbols.symbol_function( EQL ), pred );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 36276L)
  public static SubLObject common_noun_form_of_pred(final SubLObject pred)
  {
    return list_utilities.alist_lookup_without_values( proper_to_common_pred_map(), pred, Symbols.symbol_function( EQL ), pred );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 37075L)
  public static SubLObject proper_to_common_pred_map()
  {
    return $proper_to_common_pred_map$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 37158L)
  public static SubLObject common_noun_form_of_pos(final SubLObject pos)
  {
    if( pos.eql( $const138$ProperNoun ) )
    {
      return $const139$CommonNoun;
    }
    if( pos.eql( $const23$ProperCountNoun ) )
    {
      return $const140$SimpleNoun;
    }
    if( pos.eql( $const22$ProperMassNoun ) )
    {
      return $const20$MassNoun;
    }
    return pos;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 37383L)
  public static SubLObject noun_form_singular(final SubLObject word_unit, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const9$GeneralEnglishMt;
    }
    return word_prop( word_unit, $const141$singular, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 37691L)
  public static SubLObject set_noun_form_singular(final SubLObject word_unit, final SubLObject string, final SubLObject mt)
  {
    return set_word_prop( word_unit, $const141$singular, string, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 37886L)
  public static SubLObject noun_form_plural(final SubLObject word_unit, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const9$GeneralEnglishMt;
    }
    return word_prop( word_unit, $const142$plural, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 38053L)
  public static SubLObject set_noun_form_plural(final SubLObject word_unit, final SubLObject string, final SubLObject mt)
  {
    return set_word_prop( word_unit, $const142$plural, string, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 38242L)
  public static SubLObject noun_form_mass(final SubLObject word_unit, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const9$GeneralEnglishMt;
    }
    return word_prop( word_unit, $const143$massNumber, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 38409L)
  public static SubLObject set_noun_form_mass(final SubLObject word_unit, final SubLObject string, final SubLObject mt)
  {
    return set_word_prop( word_unit, $const143$massNumber, string, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 38604L)
  public static SubLObject proper_noun_form_singular(final SubLObject word_unit, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const9$GeneralEnglishMt;
    }
    return word_prop( word_unit, $const144$pnSingular, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 38850L)
  public static SubLObject set_proper_noun_form_singular(final SubLObject word_unit, final SubLObject string, final SubLObject mt)
  {
    return set_word_prop( word_unit, $const144$pnSingular, string, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 39056L)
  public static SubLObject proper_noun_form_plural(final SubLObject word_unit, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const9$GeneralEnglishMt;
    }
    return word_prop( word_unit, $const145$pnPlural, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 39239L)
  public static SubLObject set_proper_noun_form_plural(final SubLObject word_unit, final SubLObject string, final SubLObject mt)
  {
    return set_word_prop( word_unit, $const145$pnPlural, string, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 39439L)
  public static SubLObject proper_noun_form_mass(final SubLObject word_unit, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const9$GeneralEnglishMt;
    }
    return word_prop( word_unit, $const146$pnMassNumber, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 39622L)
  public static SubLObject set_proper_noun_form_mass(final SubLObject word_unit, final SubLObject string, final SubLObject mt)
  {
    return set_word_prop( word_unit, $const146$pnMassNumber, string, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 39828L)
  public static SubLObject ag_noun_form_singular(final SubLObject word_unit, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const9$GeneralEnglishMt;
    }
    return word_prop( word_unit, $const147$agentive_Sg, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 40066L)
  public static SubLObject set_ag_noun_form_singular(final SubLObject word_unit, final SubLObject string, final SubLObject mt)
  {
    return set_word_prop( word_unit, $const147$agentive_Sg, string, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 40270L)
  public static SubLObject ag_noun_form_plural(final SubLObject word_unit, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const9$GeneralEnglishMt;
    }
    return word_prop( word_unit, $const148$agentive_Pl, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 40454L)
  public static SubLObject set_ag_noun_form_plural(final SubLObject word_unit, final SubLObject string, final SubLObject mt)
  {
    return set_word_prop( word_unit, $const148$agentive_Pl, string, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 40656L)
  public static SubLObject ag_noun_form_mass(final SubLObject word_unit, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const9$GeneralEnglishMt;
    }
    return word_prop( word_unit, $const149$agentive_Mass, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 40838L)
  public static SubLObject set_ag_noun_form_mass(final SubLObject word_unit, final SubLObject string, final SubLObject mt)
  {
    return set_word_prop( word_unit, $const149$agentive_Mass, string, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 41042L)
  public static SubLObject verb_form_infinitive(final SubLObject word_unit, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const9$GeneralEnglishMt;
    }
    return word_prop( word_unit, $const150$infinitive, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 41273L)
  public static SubLObject set_verb_form_infinitive(final SubLObject word_unit, final SubLObject string, final SubLObject mt)
  {
    return set_word_prop( word_unit, $const150$infinitive, string, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 41474L)
  public static SubLObject verb_form_third_sing(final SubLObject word_unit, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const9$GeneralEnglishMt;
    }
    return word_prop( word_unit, constants_high.find_constant( $str151$thirdPersonSg_Present ), mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 41689L)
  public static SubLObject set_verb_form_third_sing(final SubLObject word_unit, final SubLObject string, final SubLObject mt)
  {
    return set_word_prop( word_unit, constants_high.find_constant( $str152$thirdPersonSg_Generic ), string, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 41920L)
  public static SubLObject verb_form_progressive(final SubLObject word_unit, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const9$GeneralEnglishMt;
    }
    return word_prop( word_unit, $const28$gerund, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 42095L)
  public static SubLObject set_verb_form_progressive(final SubLObject word_unit, final SubLObject string, final SubLObject mt)
  {
    return set_word_prop( word_unit, $const28$gerund, string, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 42289L)
  public static SubLObject verb_form_past(final SubLObject word_unit, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const9$GeneralEnglishMt;
    }
    return word_prop( word_unit, constants_high.find_constant( $str153$pastTense_Universal ), mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 42485L)
  public static SubLObject set_verb_form_past(final SubLObject word_unit, final SubLObject string, final SubLObject mt)
  {
    return set_word_prop( word_unit, constants_high.find_constant( $str153$pastTense_Universal ), string, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 42714L)
  public static SubLObject verb_form_perfect(final SubLObject word_unit, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const9$GeneralEnglishMt;
    }
    return word_prop( word_unit, $const154$perfect, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 42882L)
  public static SubLObject set_verb_form_perfect(final SubLObject word_unit, final SubLObject string, final SubLObject mt)
  {
    return set_word_prop( word_unit, $const154$perfect, string, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 43074L)
  public static SubLObject verb_form_pres_participle(final SubLObject word_unit, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const9$GeneralEnglishMt;
    }
    return word_prop( word_unit, $const155$presentParticiple, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 43260L)
  public static SubLObject set_verb_form_pres_participle(final SubLObject word_unit, final SubLObject string, final SubLObject mt)
  {
    return set_word_prop( word_unit, $const155$presentParticiple, string, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 43480L)
  public static SubLObject adjective_form_regular(final SubLObject word_unit, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const9$GeneralEnglishMt;
    }
    return word_prop( word_unit, $const156$regularDegree, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 43729L)
  public static SubLObject set_adjective_form_regular(final SubLObject word_unit, final SubLObject string, final SubLObject mt)
  {
    return set_word_prop( word_unit, $const156$regularDegree, string, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 43938L)
  public static SubLObject adjective_form_comparative(final SubLObject word_unit, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const9$GeneralEnglishMt;
    }
    return word_prop( word_unit, $const157$comparativeDegree, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 44141L)
  public static SubLObject set_adjective_form_comparative(final SubLObject word_unit, final SubLObject string, final SubLObject mt)
  {
    return set_word_prop( word_unit, $const157$comparativeDegree, string, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 44362L)
  public static SubLObject adjective_form_superlative(final SubLObject word_unit, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const9$GeneralEnglishMt;
    }
    return word_prop( word_unit, $const158$superlativeDegree, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 44565L)
  public static SubLObject set_adjective_form_superlative(final SubLObject word_unit, final SubLObject string, final SubLObject mt)
  {
    return set_word_prop( word_unit, $const158$superlativeDegree, string, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 44786L)
  public static SubLObject adjective_form_nongradable(final SubLObject word_unit, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const9$GeneralEnglishMt;
    }
    return word_prop( word_unit, $const159$nonGradableAdjectiveForm, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 44988L)
  public static SubLObject set_adjective_form_nongradable(final SubLObject word_unit, final SubLObject string, final SubLObject mt)
  {
    return set_word_prop( word_unit, $const159$nonGradableAdjectiveForm, string, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 45223L)
  public static SubLObject adverb_form_regular(final SubLObject word_unit, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const9$GeneralEnglishMt;
    }
    return word_prop( word_unit, $const160$regularAdverb, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 45456L)
  public static SubLObject set_adverb_form_regular(final SubLObject word_unit, final SubLObject string, final SubLObject mt)
  {
    return set_word_prop( word_unit, $const160$regularAdverb, string, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 45662L)
  public static SubLObject adverb_form_comparative(final SubLObject word_unit, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const9$GeneralEnglishMt;
    }
    return word_prop( word_unit, $const161$comparativeAdverb, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 45859L)
  public static SubLObject set_adverb_form_comparative(final SubLObject word_unit, final SubLObject string, final SubLObject mt)
  {
    return set_word_prop( word_unit, $const161$comparativeAdverb, string, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 46077L)
  public static SubLObject adverb_form_superlative(final SubLObject word_unit, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const9$GeneralEnglishMt;
    }
    return word_prop( word_unit, $const162$superlativeAdverb, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 46274L)
  public static SubLObject set_adverb_form_superlative(final SubLObject word_unit, final SubLObject string, final SubLObject mt)
  {
    return set_word_prop( word_unit, $const162$superlativeAdverb, string, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 46492L)
  public static SubLObject sentence_tokenize(final SubLObject words, final SubLObject v_strie, SubLObject output, SubLObject mode, SubLObject token_data, SubLObject starting_index)
  {
    if( output == UNPROVIDED )
    {
      output = $kw163$STRING;
    }
    if( mode == UNPROVIDED )
    {
      mode = $kw164$GREEDY;
    }
    if( token_data == UNPROVIDED )
    {
      token_data = Symbols.symbol_function( IDENTITY );
    }
    if( starting_index == UNPROVIDED )
    {
      starting_index = ZERO_INTEGER;
    }
    assert NIL != Types.listp( words ) : words;
    assert NIL != Types.functionp( token_data ) : token_data;
    SubLObject prefix_length = ZERO_INTEGER;
    SubLObject interval_tokens = NIL;
    SubLObject pcase_var = mode;
    if( pcase_var.eql( $kw164$GREEDY ) )
    {
      SubLObject index = NIL;
      SubLObject tokens = NIL;
      SubLObject prefix = NIL;
      index = starting_index;
      tokens = words;
      prefix = strie.strie_prefixes( v_strie, tokens ).first();
      while ( NIL != tokens)
      {
        if( NIL == prefix )
        {
          prefix = ConsesLow.cons( ConsesLow.list( tokens.first() ), NIL );
        }
        prefix_length = Sequences.length( prefix.first() );
        interval_tokens = ConsesLow.cons( standard_tokenization.new_interval_token( index, Numbers.add( index, prefix_length ), Functions.funcall( token_data, ConsesLow.cons( string_utilities.bunge( Sequences.subseq(
            tokens, ZERO_INTEGER, prefix_length ), UNPROVIDED ), prefix.rest() ) ) ), interval_tokens );
        index = Numbers.add( index, prefix_length );
        tokens = conses_high.nthcdr( prefix_length, tokens );
        prefix = strie.strie_prefixes( v_strie, tokens ).first();
      }
    }
    else if( pcase_var.eql( $kw167$DILIGENT ) )
    {
      SubLObject index = NIL;
      SubLObject tokens = NIL;
      SubLObject prefixes = NIL;
      index = starting_index;
      tokens = words;
      prefixes = strie.strie_prefixes( v_strie, tokens );
      while ( NIL != tokens)
      {
        prefix_length = ZERO_INTEGER;
        SubLObject cdolist_list_var = prefixes;
        SubLObject prefix2 = NIL;
        prefix2 = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          prefix_length = Sequences.length( prefix2.first() );
          interval_tokens = ConsesLow.cons( standard_tokenization.new_interval_token( index, Numbers.add( index, prefix_length ), Functions.funcall( token_data, ConsesLow.cons( string_utilities.bunge( prefix2.first(),
              UNPROVIDED ), prefix2.rest() ) ) ), interval_tokens );
          cdolist_list_var = cdolist_list_var.rest();
          prefix2 = cdolist_list_var.first();
        }
        if( !prefix_length.numE( ONE_INTEGER ) )
        {
          interval_tokens = ConsesLow.cons( standard_tokenization.new_interval_token( index, Numbers.add( index, ONE_INTEGER ), Functions.funcall( token_data, ConsesLow.cons( tokens.first(), NIL ) ) ), interval_tokens );
        }
        index = Numbers.add( index, ONE_INTEGER );
        tokens = strie.sequence_slice( tokens, ONE_INTEGER, UNPROVIDED );
        prefixes = strie.strie_prefixes( v_strie, tokens );
      }
    }
    else
    {
      Errors.error( $str168$_s_is_not_a_valid_mode_argument, mode );
    }
    pcase_var = output;
    if( pcase_var.eql( $kw169$INTERVAL ) )
    {
      return Sequences.reverse( interval_tokens );
    }
    if( pcase_var.eql( $kw163$STRING ) )
    {
      return interval_tokens_sequentialize( Sequences.reverse( interval_tokens ), Vectors.make_vector( Numbers.add( standard_tokenization.interval_token_end( interval_tokens.first() ), ONE_INTEGER ), UNPROVIDED ) );
    }
    Errors.error( $str170$_s_is_not_a_valid_output_argument, output );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 51145L)
  public static SubLObject interval_tokens_sequentialize(final SubLObject interval_tokens, final SubLObject sequence_cache)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != conses_high.endp( interval_tokens ) )
    {
      return $list171;
    }
    if( NIL != list_utilities.singletonP( interval_tokens ) )
    {
      return ConsesLow.list( ConsesLow.list( standard_tokenization.interval_token_value( interval_tokens.first() ) ) );
    }
    SubLObject continuations = NIL;
    SubLObject end_index = NIL;
    final SubLObject start = Numbers.add( standard_tokenization.interval_token_start( interval_tokens.first() ), ONE_INTEGER );
    SubLObject token_sequences = NIL;
    thread.resetMultipleValues();
    final SubLObject starting_tokens = interval_tokens_split( interval_tokens, start );
    final SubLObject remaining_tokens = thread.secondMultipleValue();
    thread.resetMultipleValues();
    SubLObject cdolist_list_var = starting_tokens;
    SubLObject starting_token = NIL;
    starting_token = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      end_index = standard_tokenization.interval_token_end( starting_token );
      continuations = Vectors.aref( sequence_cache, end_index );
      if( NIL == continuations )
      {
        thread.resetMultipleValues();
        final SubLObject before = interval_tokens_split( remaining_tokens, end_index );
        final SubLObject after = thread.secondMultipleValue();
        thread.resetMultipleValues();
        continuations = interval_tokens_sequentialize( after, sequence_cache );
        Vectors.set_aref( sequence_cache, end_index, continuations );
      }
      SubLObject cdolist_list_var_$170 = continuations;
      SubLObject continuation = NIL;
      continuation = cdolist_list_var_$170.first();
      while ( NIL != cdolist_list_var_$170)
      {
        token_sequences = ConsesLow.cons( ConsesLow.cons( standard_tokenization.interval_token_value( starting_token ), continuation ), token_sequences );
        cdolist_list_var_$170 = cdolist_list_var_$170.rest();
        continuation = cdolist_list_var_$170.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      starting_token = cdolist_list_var.first();
    }
    return token_sequences;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 53221L)
  public static SubLObject interval_tokens_split(final SubLObject interval_tokens, final SubLObject index)
  {
    SubLObject before = NIL;
    SubLObject itokens = interval_tokens;
    for( SubLObject interval_token = interval_tokens.first(); interval_token.isVector() && standard_tokenization.interval_token_start( interval_token ).numL( index ); interval_token = itokens.first() )
    {
      before = ConsesLow.cons( interval_token, before );
      itokens = itokens.rest();
    }
    return Values.values( Sequences.reverse( before ), itokens );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 53906L)
  public static SubLObject word_count()
  {
    return Sequences.length( isa.all_fort_instances_in_all_mts( $const172$EnglishWord ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 54138L)
  public static SubLObject full_word_count()
  {
    SubLObject ans = ZERO_INTEGER;
    final SubLObject root_preds = Sequences.remove_if( Symbols.symbol_function( $sym173$DERIVED_PRED_ ), lexicon_vars.$root_form_speech_parts$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject cdolist_list_var = ConsesLow.cons( $const114$partOfSpeech, root_preds );
    SubLObject pred = NIL;
    pred = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject count = kb_indexing.num_predicate_extent_index( pred, UNPROVIDED );
      ans = Numbers.add( ans, count );
      cdolist_list_var = cdolist_list_var.rest();
      pred = cdolist_list_var.first();
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 54498L)
  public static SubLObject denotation_count()
  {
    return kb_indexing.num_predicate_extent_index( $const14$denotation, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 54672L)
  public static SubLObject nl_pred_count(final SubLObject predicate)
  {
    return kb_indexing.num_predicate_extent_index( predicate, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 54878L)
  public static SubLObject nl_statistics(SubLObject verboseP, SubLObject output_file)
  {
    if( verboseP == UNPROVIDED )
    {
      verboseP = NIL;
    }
    if( output_file == UNPROVIDED )
    {
      output_file = nl_stats_file_path();
    }
    PrintLow.format( T, $str174$______NL_statistics______CycL__A_, new SubLObject[] { system_info.cyc_revision_string(), control_vars.kb_loaded(), operation_communication.kb_op_number()
    } );
    SubLObject stream = NIL;
    try
    {
      stream = compatibility.open_text( output_file, $kw175$OUTPUT );
      if( !stream.isStream() )
      {
        Errors.error( $str176$Unable_to_open__S, output_file );
      }
      final SubLObject stream_$171 = stream;
      PrintLow.format( stream_$171, $str174$______NL_statistics______CycL__A_, new SubLObject[] { system_info.cyc_revision_string(), control_vars.kb_loaded(), operation_communication.kb_op_number()
      } );
      PrintLow.format( T, $str177$__Instances_of___EnglishWord____6, word_count() );
      PrintLow.format( T, $str178$__Number_of_root_forms__________6, full_word_count() );
      PrintLow.format( stream_$171, $str177$__Instances_of___EnglishWord____6, word_count() );
      PrintLow.format( stream_$171, $str178$__Number_of_root_forms__________6, full_word_count() );
      final SubLObject grand_total = count_and_print_nl_preds( stream_$171, verboseP, UNPROVIDED );
      PrintLow.format( T, $str179$____Grand_total____D____, grand_total );
      PrintLow.format( stream_$171, $str180$____Grand_total____D, grand_total );
    }
    finally
    {
      final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values = Values.getValuesAsVector();
        if( stream.isStream() )
        {
          streams_high.close( stream, UNPROVIDED );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
      }
    }
    PrintLow.format( T, $str181$Output_in__S, output_file );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 55857L)
  public static SubLObject nl_stats_file_path()
  {
    return Sequences.cconcatenate( $str182$_cyc_departments_nl_doc_stats_kb, new SubLObject[] { string_utilities.str( control_vars.kb_loaded() ), operation_communication.kb_op_number().isPositive() ? Sequences
        .cconcatenate( $str183$_, string_utilities.str( operation_communication.kb_op_number() ) ) : $str12$, $str184$_, string_utilities.str( numeric_date_utilities.get_universal_date( UNPROVIDED, UNPROVIDED ) ),
      $str185$_stats
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 56109L)
  public static SubLObject count_and_print_nl_preds(final SubLObject stream, final SubLObject verboseP, SubLObject root_category)
  {
    if( root_category == UNPROVIDED )
    {
      root_category = $const186$NLPredicate;
    }
    final SubLObject pred_tree = categorize_nl_preds( root_category, UNPROVIDED, UNPROVIDED );
    final SubLObject grand_total = ZERO_INTEGER;
    final SubLObject counted_preds = NIL;
    return count_and_print_nl_preds_int( stream, verboseP, pred_tree, grand_total, counted_preds );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 56409L)
  public static SubLObject count_and_print_nl_preds_int(final SubLObject stream, final SubLObject verboseP, final SubLObject pred_tree, SubLObject grand_total, SubLObject counted_preds)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject pred_type = NIL;
    SubLObject v_instances = NIL;
    SubLObject subtrees = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( pred_tree, pred_tree, $list187 );
    pred_type = pred_tree.first();
    SubLObject current = pred_tree.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, pred_tree, $list187 );
    v_instances = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, pred_tree, $list187 );
    subtrees = current.first();
    current = current.rest();
    if( NIL == current )
    {
      if( NIL != v_instances )
      {
        PrintLow.format( stream, $str188$____Instances_of__S_, pred_type );
        if( NIL != verboseP )
        {
          PrintLow.format( T, $str188$____Instances_of__S_, pred_type );
        }
        SubLObject pred_type_total = ZERO_INTEGER;
        SubLObject cdolist_list_var = v_instances;
        SubLObject predicate = NIL;
        predicate = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL == subl_promotions.memberP( predicate, counted_preds, UNPROVIDED, UNPROVIDED ) )
          {
            counted_preds = ConsesLow.cons( predicate, counted_preds );
            final SubLObject field_width = $int189$40;
            final SubLObject name = kb_paths.fort_name( predicate );
            final SubLObject tally = nl_pred_count( predicate );
            if( tally.isPositive() )
            {
              PrintLow.format( stream, $str190$___A, name );
              SubLObject cdotimes_end_var;
              SubLObject i;
              for( cdotimes_end_var = Numbers.max( ZERO_INTEGER, Numbers.subtract( field_width, Sequences.length( name ) ) ), i = NIL, i = ZERO_INTEGER; i.numL( cdotimes_end_var ); i = Numbers.add( i, ONE_INTEGER ) )
              {
                print_high.princ( $str136$_, stream );
              }
              PrintLow.format( stream, $str191$___6___D, tally );
              if( NIL != verboseP )
              {
                PrintLow.format( T, $str190$___A, name );
                for( cdotimes_end_var = Numbers.max( ZERO_INTEGER, Numbers.subtract( field_width, Sequences.length( name ) ) ), i = NIL, i = ZERO_INTEGER; i.numL( cdotimes_end_var ); i = Numbers.add( i, ONE_INTEGER ) )
                {
                  print_high.princ( $str136$_, T );
                }
                PrintLow.format( T, $str191$___6___D, tally );
              }
              pred_type_total = Numbers.add( pred_type_total, tally );
            }
          }
          cdolist_list_var = cdolist_list_var.rest();
          predicate = cdolist_list_var.first();
        }
        if( pred_type_total.isPositive() )
        {
          PrintLow.format( T, $str192$__Total_for__S___D, pred_type, pred_type_total );
          PrintLow.format( stream, $str192$__Total_for__S___D, pred_type, pred_type_total );
          grand_total = Numbers.add( grand_total, pred_type_total );
        }
      }
      SubLObject cdolist_list_var2 = subtrees;
      SubLObject subtree = NIL;
      subtree = cdolist_list_var2.first();
      while ( NIL != cdolist_list_var2)
      {
        thread.resetMultipleValues();
        final SubLObject grand_total_$172 = count_and_print_nl_preds_int( stream, verboseP, subtree, grand_total, counted_preds );
        final SubLObject counted_preds_$173 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        grand_total = grand_total_$172;
        counted_preds = counted_preds_$173;
        cdolist_list_var2 = cdolist_list_var2.rest();
        subtree = cdolist_list_var2.first();
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( pred_tree, $list187 );
    }
    return Values.values( grand_total, counted_preds );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 57870L)
  public static SubLObject categorize_nl_preds(SubLObject root_category, SubLObject done_categories, SubLObject siblings)
  {
    if( root_category == UNPROVIDED )
    {
      root_category = $const186$NLPredicate;
    }
    if( done_categories == UNPROVIDED )
    {
      done_categories = NIL;
    }
    if( siblings == UNPROVIDED )
    {
      siblings = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject pred_tree = NIL;
    if( NIL == subl_promotions.memberP( root_category, $non_categorizing_nl_pred_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED ) && NIL == conses_high.member( root_category, done_categories, UNPROVIDED, UNPROVIDED ) )
    {
      done_categories = ConsesLow.cons( root_category, done_categories );
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym32$RELEVANT_MT_IS_EVERYTHING, thread );
        mt_relevance_macros.$mt$.bind( $const33$EverythingPSC, thread );
        SubLObject sub_trees = NIL;
        SubLObject cdolist_list_var = kb_mapping_utilities.pred_values( root_category, $const194$genls, TWO_INTEGER, ONE_INTEGER, UNPROVIDED );
        SubLObject spec = NIL;
        spec = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL == list_utilities.tree_find( spec, done_categories, UNPROVIDED, UNPROVIDED ) && NIL == list_utilities.tree_find( spec, siblings, UNPROVIDED, UNPROVIDED ) && NIL == list_utilities.tree_find( spec,
              sub_trees, UNPROVIDED, UNPROVIDED ) )
          {
            final SubLObject sub_tree = categorize_nl_preds( spec, done_categories, ConsesLow.cons( sub_trees, siblings ) );
            final SubLObject spec_instances = conses_high.second( sub_tree );
            if( NIL != list_utilities.lengthL( spec_instances, FIVE_INTEGER, UNPROVIDED ) )
            {
              SubLObject cdolist_list_var_$174 = conses_high.third( sub_tree );
              SubLObject sub_sub_tree = NIL;
              sub_sub_tree = cdolist_list_var_$174.first();
              while ( NIL != cdolist_list_var_$174)
              {
                sub_trees = ConsesLow.cons( sub_sub_tree, sub_trees );
                cdolist_list_var_$174 = cdolist_list_var_$174.rest();
                sub_sub_tree = cdolist_list_var_$174.first();
              }
            }
            else
            {
              sub_trees = ConsesLow.cons( sub_tree, sub_trees );
            }
            done_categories = ConsesLow.cons( spec, done_categories );
          }
          cdolist_list_var = cdolist_list_var.rest();
          spec = cdolist_list_var.first();
        }
        pred_tree = ConsesLow.cons( sub_trees, pred_tree );
        SubLObject v_instances = NIL;
        final SubLObject node_var = root_category;
        final SubLObject _prev_bind_0_$175 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
        final SubLObject _prev_bind_1_$176 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding( thread );
        try
        {
          sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const195$isa ), thread );
          sbhl_marking_vars.$sbhl_gather_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
          try
          {
            SubLObject node_var_$177 = node_var;
            final SubLObject deck_type = $kw35$STACK;
            final SubLObject recur_deck = deck.create_deck( deck_type );
            final SubLObject _prev_bind_0_$176 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
            try
            {
              sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
              try
              {
                final SubLObject tv_var = NIL;
                final SubLObject _prev_bind_0_$177 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
                final SubLObject _prev_bind_1_$177 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
                try
                {
                  sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
                  sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym37$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
                  if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
                  {
                    final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
                    if( pcase_var.eql( $kw38$ERROR ) )
                    {
                      sbhl_paranoia.sbhl_error( ONE_INTEGER, $str39$_A_is_not_a__A, tv_var, $sym40$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                    }
                    else if( pcase_var.eql( $kw41$CERROR ) )
                    {
                      sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str42$continue_anyway, $str39$_A_is_not_a__A, tv_var, $sym40$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                    }
                    else if( pcase_var.eql( $kw43$WARN ) )
                    {
                      Errors.warn( $str39$_A_is_not_a__A, tv_var, $sym40$SBHL_TRUE_TV_P );
                    }
                    else
                    {
                      Errors.warn( $str44$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                      Errors.cerror( $str42$continue_anyway, $str39$_A_is_not_a__A, tv_var, $sym40$SBHL_TRUE_TV_P );
                    }
                  }
                  final SubLObject _prev_bind_0_$178 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
                  final SubLObject _prev_bind_1_$178 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
                  final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
                  final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                  final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                  try
                  {
                    sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const195$isa ) ), thread );
                    sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module(
                        $const195$isa ) ) ), thread );
                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module(
                        $const195$isa ) ) ), thread );
                    sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                    sbhl_module_vars.$sbhl_module$.bind( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const195$isa ) ), thread );
                    if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( node_var, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                    {
                      final SubLObject _prev_bind_0_$179 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                      final SubLObject _prev_bind_1_$179 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                      final SubLObject _prev_bind_2_$185 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                      try
                      {
                        sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_backward_search_direction(), thread );
                        sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities
                            .get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const195$isa ) ) ), thread );
                        sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                        sbhl_marking_utilities.sbhl_mark_node_marked( node_var_$177, UNPROVIDED );
                        while ( NIL != node_var_$177)
                        {
                          final SubLObject tt_node_var = node_var_$177;
                          SubLObject cdolist_list_var2;
                          final SubLObject accessible_modules = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const195$isa ) );
                          SubLObject module_var = NIL;
                          module_var = cdolist_list_var2.first();
                          while ( NIL != cdolist_list_var2)
                          {
                            final SubLObject _prev_bind_0_$180 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                            final SubLObject _prev_bind_1_$180 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                            try
                            {
                              sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                              sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                                  .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                              final SubLObject node = function_terms.naut_to_nart( tt_node_var );
                              if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                              {
                                final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                if( NIL != d_link )
                                {
                                  final SubLObject mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const195$isa ) ),
                                      sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                  if( NIL != mt_links )
                                  {
                                    SubLObject iteration_state;
                                    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                                    {
                                      thread.resetMultipleValues();
                                      final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                      final SubLObject tv_links = thread.secondMultipleValue();
                                      thread.resetMultipleValues();
                                      if( NIL != mt_relevance_macros.relevant_mtP( mt ) )
                                      {
                                        final SubLObject _prev_bind_0_$181 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                        try
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.bind( mt, thread );
                                          SubLObject iteration_state_$189;
                                          for( iteration_state_$189 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents
                                              .do_dictionary_contents_doneP( iteration_state_$189 ); iteration_state_$189 = dictionary_contents.do_dictionary_contents_next( iteration_state_$189 ) )
                                          {
                                            thread.resetMultipleValues();
                                            final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$189 );
                                            final SubLObject link_nodes = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                            {
                                              final SubLObject _prev_bind_0_$182 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                              try
                                              {
                                                sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                                final SubLObject sol = link_nodes;
                                                if( NIL != set.set_p( sol ) )
                                                {
                                                  final SubLObject set_contents_var = set.do_set_internal( sol );
                                                  SubLObject basis_object;
                                                  SubLObject state;
                                                  SubLObject pred;
                                                  for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                      set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                                  {
                                                    pred = set_contents.do_set_contents_next( basis_object, state );
                                                    if( NIL != set_contents.do_set_contents_element_validP( state, pred ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( pred,
                                                        sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                    {
                                                      sbhl_marking_utilities.sbhl_mark_node_marked( pred, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                      if( NIL != forts.fort_p( pred ) && !kb_indexing.num_predicate_extent_index( pred, UNPROVIDED ).isZero() && NIL == list_utilities.tree_find( pred, pred_tree,
                                                          UNPROVIDED, UNPROVIDED ) && NIL == list_utilities.tree_find( pred, siblings, UNPROVIDED, UNPROVIDED ) )
                                                      {
                                                        v_instances = ConsesLow.cons( pred, v_instances );
                                                      }
                                                    }
                                                  }
                                                }
                                                else if( sol.isList() )
                                                {
                                                  SubLObject csome_list_var = sol;
                                                  SubLObject pred2 = NIL;
                                                  pred2 = csome_list_var.first();
                                                  while ( NIL != csome_list_var)
                                                  {
                                                    if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( pred2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                    {
                                                      sbhl_marking_utilities.sbhl_mark_node_marked( pred2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                      if( NIL != forts.fort_p( pred2 ) && !kb_indexing.num_predicate_extent_index( pred2, UNPROVIDED ).isZero() && NIL == list_utilities.tree_find( pred2, pred_tree,
                                                          UNPROVIDED, UNPROVIDED ) && NIL == list_utilities.tree_find( pred2, siblings, UNPROVIDED, UNPROVIDED ) )
                                                      {
                                                        v_instances = ConsesLow.cons( pred2, v_instances );
                                                      }
                                                    }
                                                    csome_list_var = csome_list_var.rest();
                                                    pred2 = csome_list_var.first();
                                                  }
                                                }
                                                else
                                                {
                                                  Errors.error( $str47$_A_is_neither_SET_P_nor_LISTP_, sol );
                                                }
                                              }
                                              finally
                                              {
                                                sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$182, thread );
                                              }
                                            }
                                          }
                                          dictionary_contents.do_dictionary_contents_finalize( iteration_state_$189 );
                                        }
                                        finally
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$181, thread );
                                        }
                                      }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                                  }
                                }
                                else
                                {
                                  sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str48$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                }
                                if( NIL != sbhl_macros.do_sbhl_non_fort_linksP( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                                {
                                  SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup( node );
                                  SubLObject instance_tuple = NIL;
                                  instance_tuple = csome_list_var2.first();
                                  while ( NIL != csome_list_var2)
                                  {
                                    SubLObject current;
                                    final SubLObject datum = current = instance_tuple;
                                    SubLObject link_node = NIL;
                                    SubLObject mt2 = NIL;
                                    SubLObject tv2 = NIL;
                                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list197 );
                                    link_node = current.first();
                                    current = current.rest();
                                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list197 );
                                    mt2 = current.first();
                                    current = current.rest();
                                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list197 );
                                    tv2 = current.first();
                                    current = current.rest();
                                    if( NIL == current )
                                    {
                                      if( NIL != mt_relevance_macros.relevant_mtP( mt2 ) )
                                      {
                                        final SubLObject _prev_bind_0_$183 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                        try
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.bind( mt2, thread );
                                          if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv2 ) )
                                          {
                                            final SubLObject _prev_bind_0_$184 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                            try
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.bind( tv2, thread );
                                              final SubLObject sol;
                                              final SubLObject link_nodes2 = sol = ConsesLow.list( link_node );
                                              if( NIL != set.set_p( sol ) )
                                              {
                                                final SubLObject set_contents_var = set.do_set_internal( sol );
                                                SubLObject basis_object;
                                                SubLObject state;
                                                SubLObject pred;
                                                for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                    set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                                {
                                                  pred = set_contents.do_set_contents_next( basis_object, state );
                                                  if( NIL != set_contents.do_set_contents_element_validP( state, pred ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( pred,
                                                      sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( pred, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                    if( NIL != forts.fort_p( pred ) && !kb_indexing.num_predicate_extent_index( pred, UNPROVIDED ).isZero() && NIL == list_utilities.tree_find( pred, pred_tree, UNPROVIDED,
                                                        UNPROVIDED ) && NIL == list_utilities.tree_find( pred, siblings, UNPROVIDED, UNPROVIDED ) )
                                                    {
                                                      v_instances = ConsesLow.cons( pred, v_instances );
                                                    }
                                                  }
                                                }
                                              }
                                              else if( sol.isList() )
                                              {
                                                SubLObject csome_list_var_$193 = sol;
                                                SubLObject pred2 = NIL;
                                                pred2 = csome_list_var_$193.first();
                                                while ( NIL != csome_list_var_$193)
                                                {
                                                  if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( pred2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( pred2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                    if( NIL != forts.fort_p( pred2 ) && !kb_indexing.num_predicate_extent_index( pred2, UNPROVIDED ).isZero() && NIL == list_utilities.tree_find( pred2, pred_tree,
                                                        UNPROVIDED, UNPROVIDED ) && NIL == list_utilities.tree_find( pred2, siblings, UNPROVIDED, UNPROVIDED ) )
                                                    {
                                                      v_instances = ConsesLow.cons( pred2, v_instances );
                                                    }
                                                  }
                                                  csome_list_var_$193 = csome_list_var_$193.rest();
                                                  pred2 = csome_list_var_$193.first();
                                                }
                                              }
                                              else
                                              {
                                                Errors.error( $str47$_A_is_neither_SET_P_nor_LISTP_, sol );
                                              }
                                            }
                                            finally
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$184, thread );
                                            }
                                          }
                                        }
                                        finally
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$183, thread );
                                        }
                                      }
                                    }
                                    else
                                    {
                                      cdestructuring_bind.cdestructuring_bind_error( datum, $list197 );
                                    }
                                    csome_list_var2 = csome_list_var2.rest();
                                    instance_tuple = csome_list_var2.first();
                                  }
                                }
                              }
                              else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                              {
                                SubLObject cdolist_list_var_$175;
                                final SubLObject new_list = cdolist_list_var_$175 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                    .get_sbhl_module_relevant_naut_link_generators( sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const195$isa ) ),
                                        sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                                    : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const195$isa ) ),
                                        sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) );
                                SubLObject generating_fn = NIL;
                                generating_fn = cdolist_list_var_$175.first();
                                while ( NIL != cdolist_list_var_$175)
                                {
                                  final SubLObject _prev_bind_0_$185 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                  try
                                  {
                                    sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                                    final SubLObject sol2;
                                    final SubLObject link_nodes3 = sol2 = Functions.funcall( generating_fn, node );
                                    if( NIL != set.set_p( sol2 ) )
                                    {
                                      final SubLObject set_contents_var2 = set.do_set_internal( sol2 );
                                      SubLObject basis_object2;
                                      SubLObject state2;
                                      SubLObject pred3;
                                      for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                          set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                      {
                                        pred3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                        if( NIL != set_contents.do_set_contents_element_validP( state2, pred3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( pred3,
                                            sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                        {
                                          sbhl_marking_utilities.sbhl_mark_node_marked( pred3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                          if( NIL != forts.fort_p( pred3 ) && !kb_indexing.num_predicate_extent_index( pred3, UNPROVIDED ).isZero() && NIL == list_utilities.tree_find( pred3, pred_tree, UNPROVIDED,
                                              UNPROVIDED ) && NIL == list_utilities.tree_find( pred3, siblings, UNPROVIDED, UNPROVIDED ) )
                                          {
                                            v_instances = ConsesLow.cons( pred3, v_instances );
                                          }
                                        }
                                      }
                                    }
                                    else if( sol2.isList() )
                                    {
                                      SubLObject csome_list_var3 = sol2;
                                      SubLObject pred4 = NIL;
                                      pred4 = csome_list_var3.first();
                                      while ( NIL != csome_list_var3)
                                      {
                                        if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( pred4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                        {
                                          sbhl_marking_utilities.sbhl_mark_node_marked( pred4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                          if( NIL != forts.fort_p( pred4 ) && !kb_indexing.num_predicate_extent_index( pred4, UNPROVIDED ).isZero() && NIL == list_utilities.tree_find( pred4, pred_tree, UNPROVIDED,
                                              UNPROVIDED ) && NIL == list_utilities.tree_find( pred4, siblings, UNPROVIDED, UNPROVIDED ) )
                                          {
                                            v_instances = ConsesLow.cons( pred4, v_instances );
                                          }
                                        }
                                        csome_list_var3 = csome_list_var3.rest();
                                        pred4 = csome_list_var3.first();
                                      }
                                    }
                                    else
                                    {
                                      Errors.error( $str47$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                    }
                                  }
                                  finally
                                  {
                                    sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$185, thread );
                                  }
                                  cdolist_list_var_$175 = cdolist_list_var_$175.rest();
                                  generating_fn = cdolist_list_var_$175.first();
                                }
                              }
                            }
                            finally
                            {
                              sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$180, thread );
                              sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$180, thread );
                            }
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            module_var = cdolist_list_var2.first();
                          }
                          SubLObject cdolist_list_var3;
                          final SubLObject accessible_modules2 = cdolist_list_var3 = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module(
                              $const195$isa ) ) );
                          SubLObject module_var2 = NIL;
                          module_var2 = cdolist_list_var3.first();
                          while ( NIL != cdolist_list_var3)
                          {
                            final SubLObject _prev_bind_0_$186 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                            final SubLObject _prev_bind_1_$181 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                            try
                            {
                              sbhl_module_vars.$sbhl_module$.bind( module_var2, thread );
                              sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                                  .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                              final SubLObject node2 = function_terms.naut_to_nart( node_var_$177 );
                              if( NIL != sbhl_link_vars.sbhl_node_object_p( node2 ) )
                              {
                                final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link( node2, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                if( NIL != d_link2 )
                                {
                                  final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links( d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                  if( NIL != mt_links2 )
                                  {
                                    SubLObject iteration_state2;
                                    for( iteration_state2 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links2 ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                        iteration_state2 ); iteration_state2 = dictionary_contents.do_dictionary_contents_next( iteration_state2 ) )
                                    {
                                      thread.resetMultipleValues();
                                      final SubLObject mt3 = dictionary_contents.do_dictionary_contents_key_value( iteration_state2 );
                                      final SubLObject tv_links2 = thread.secondMultipleValue();
                                      thread.resetMultipleValues();
                                      if( NIL != mt_relevance_macros.relevant_mtP( mt3 ) )
                                      {
                                        final SubLObject _prev_bind_0_$187 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                        try
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.bind( mt3, thread );
                                          SubLObject iteration_state_$190;
                                          for( iteration_state_$190 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links2 ) ); NIL == dictionary_contents
                                              .do_dictionary_contents_doneP( iteration_state_$190 ); iteration_state_$190 = dictionary_contents.do_dictionary_contents_next( iteration_state_$190 ) )
                                          {
                                            thread.resetMultipleValues();
                                            final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$190 );
                                            final SubLObject link_nodes4 = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv2 ) )
                                            {
                                              final SubLObject _prev_bind_0_$188 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                              try
                                              {
                                                sbhl_link_vars.$sbhl_link_tv$.bind( tv2, thread );
                                                final SubLObject sol3 = link_nodes4;
                                                if( NIL != set.set_p( sol3 ) )
                                                {
                                                  final SubLObject set_contents_var3 = set.do_set_internal( sol3 );
                                                  SubLObject basis_object3;
                                                  SubLObject state3;
                                                  SubLObject node_vars_link_node;
                                                  for( basis_object3 = set_contents.do_set_contents_basis_object( set_contents_var3 ), state3 = NIL, state3 = set_contents.do_set_contents_initial_state( basis_object3,
                                                      set_contents_var3 ); NIL == set_contents.do_set_contents_doneP( basis_object3, state3 ); state3 = set_contents.do_set_contents_update_state( state3 ) )
                                                  {
                                                    node_vars_link_node = set_contents.do_set_contents_next( basis_object3, state3 );
                                                    if( NIL != set_contents.do_set_contents_element_validP( state3, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(
                                                        node_vars_link_node, UNPROVIDED ) )
                                                    {
                                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                      deck.deck_push( node_vars_link_node, recur_deck );
                                                    }
                                                  }
                                                }
                                                else if( sol3.isList() )
                                                {
                                                  SubLObject csome_list_var4 = sol3;
                                                  SubLObject node_vars_link_node2 = NIL;
                                                  node_vars_link_node2 = csome_list_var4.first();
                                                  while ( NIL != csome_list_var4)
                                                  {
                                                    if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                                    {
                                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                      deck.deck_push( node_vars_link_node2, recur_deck );
                                                    }
                                                    csome_list_var4 = csome_list_var4.rest();
                                                    node_vars_link_node2 = csome_list_var4.first();
                                                  }
                                                }
                                                else
                                                {
                                                  Errors.error( $str47$_A_is_neither_SET_P_nor_LISTP_, sol3 );
                                                }
                                              }
                                              finally
                                              {
                                                sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$188, thread );
                                              }
                                            }
                                          }
                                          dictionary_contents.do_dictionary_contents_finalize( iteration_state_$190 );
                                        }
                                        finally
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$187, thread );
                                        }
                                      }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize( iteration_state2 );
                                  }
                                }
                                else
                                {
                                  sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str48$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                }
                              }
                              else if( NIL != obsolete.cnat_p( node2, UNPROVIDED ) )
                              {
                                SubLObject cdolist_list_var_$176;
                                final SubLObject new_list2 = cdolist_list_var_$176 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                    .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                        UNPROVIDED ) ) )
                                    : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                        .get_sbhl_module( UNPROVIDED ) ) );
                                SubLObject generating_fn2 = NIL;
                                generating_fn2 = cdolist_list_var_$176.first();
                                while ( NIL != cdolist_list_var_$176)
                                {
                                  final SubLObject _prev_bind_0_$189 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                  try
                                  {
                                    sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn2, thread );
                                    final SubLObject sol4;
                                    final SubLObject link_nodes5 = sol4 = Functions.funcall( generating_fn2, node2 );
                                    if( NIL != set.set_p( sol4 ) )
                                    {
                                      final SubLObject set_contents_var4 = set.do_set_internal( sol4 );
                                      SubLObject basis_object4;
                                      SubLObject state4;
                                      SubLObject node_vars_link_node3;
                                      for( basis_object4 = set_contents.do_set_contents_basis_object( set_contents_var4 ), state4 = NIL, state4 = set_contents.do_set_contents_initial_state( basis_object4,
                                          set_contents_var4 ); NIL == set_contents.do_set_contents_doneP( basis_object4, state4 ); state4 = set_contents.do_set_contents_update_state( state4 ) )
                                      {
                                        node_vars_link_node3 = set_contents.do_set_contents_next( basis_object4, state4 );
                                        if( NIL != set_contents.do_set_contents_element_validP( state4, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                            UNPROVIDED ) )
                                        {
                                          sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                          deck.deck_push( node_vars_link_node3, recur_deck );
                                        }
                                      }
                                    }
                                    else if( sol4.isList() )
                                    {
                                      SubLObject csome_list_var5 = sol4;
                                      SubLObject node_vars_link_node4 = NIL;
                                      node_vars_link_node4 = csome_list_var5.first();
                                      while ( NIL != csome_list_var5)
                                      {
                                        if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                        {
                                          sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                          deck.deck_push( node_vars_link_node4, recur_deck );
                                        }
                                        csome_list_var5 = csome_list_var5.rest();
                                        node_vars_link_node4 = csome_list_var5.first();
                                      }
                                    }
                                    else
                                    {
                                      Errors.error( $str47$_A_is_neither_SET_P_nor_LISTP_, sol4 );
                                    }
                                  }
                                  finally
                                  {
                                    sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$189, thread );
                                  }
                                  cdolist_list_var_$176 = cdolist_list_var_$176.rest();
                                  generating_fn2 = cdolist_list_var_$176.first();
                                }
                              }
                            }
                            finally
                            {
                              sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$181, thread );
                              sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$186, thread );
                            }
                            cdolist_list_var3 = cdolist_list_var3.rest();
                            module_var2 = cdolist_list_var3.first();
                          }
                          node_var_$177 = deck.deck_pop( recur_deck );
                        }
                      }
                      finally
                      {
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$185, thread );
                        sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$179, thread );
                        sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$179, thread );
                      }
                    }
                    else
                    {
                      sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str49$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED,
                          UNPROVIDED, UNPROVIDED );
                    }
                  }
                  finally
                  {
                    sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
                    sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_3, thread );
                    sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$178, thread );
                    sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$178, thread );
                  }
                }
                finally
                {
                  sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$177, thread );
                  sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$177, thread );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$190 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values = Values.getValuesAsVector();
                  sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$190, thread );
                }
              }
            }
            finally
            {
              sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$176, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$191 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values2 = Values.getValuesAsVector();
              sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
              Values.restoreValuesFromVector( _values2 );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$191, thread );
            }
          }
        }
        finally
        {
          sbhl_marking_vars.$sbhl_gather_space$.rebind( _prev_bind_1_$176, thread );
          sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$175, thread );
        }
        v_instances = Sort.sort( v_instances, Symbols.symbol_function( $sym129$_ ), $sym198$NUM_PREDICATE_EXTENT_INDEX );
        pred_tree = ConsesLow.cons( v_instances, pred_tree );
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
      if( NIL != pred_tree )
      {
        pred_tree = ConsesLow.cons( root_category, pred_tree );
      }
    }
    return pred_tree;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 59309L)
  public static SubLObject fort_lexification_extent()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject loose_preds = isa.all_fort_instances( $const199$ProperNamePredicate_Loose, UNPROVIDED, UNPROVIDED );
    SubLObject real = ZERO_INTEGER;
    SubLObject none = NIL;
    SubLObject loose = NIL;
    final SubLObject message = $str200$mapping_Cyc_FORTs;
    final SubLObject total = forts.fort_count();
    SubLObject sofar = ZERO_INTEGER;
    final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( message );
        SubLObject cdolist_list_var = forts.do_forts_tables();
        SubLObject table_var = NIL;
        table_var = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject idx = table_var;
          if( NIL == id_index.id_index_objects_empty_p( idx, $kw201$SKIP ) )
          {
            final SubLObject idx_$205 = idx;
            if( NIL == id_index.id_index_dense_objects_empty_p( idx_$205, $kw201$SKIP ) )
            {
              final SubLObject vector_var = id_index.id_index_dense_objects( idx_$205 );
              final SubLObject backwardP_var = NIL;
              SubLObject length;
              SubLObject v_iteration;
              SubLObject id;
              SubLObject fort;
              SubLObject lex_assertions;
              SubLObject real_lexP;
              SubLObject cdolist_list_var_$206;
              SubLObject as;
              for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
              {
                id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
                fort = Vectors.aref( vector_var, id );
                if( NIL == id_index.id_index_tombstone_p( fort ) || NIL == id_index.id_index_skip_tombstones_p( $kw201$SKIP ) )
                {
                  if( NIL != id_index.id_index_tombstone_p( fort ) )
                  {
                    fort = $kw201$SKIP;
                  }
                  sofar = Numbers.add( sofar, ONE_INTEGER );
                  utilities_macros.note_percent_progress( sofar, total );
                  lex_assertions = all_lexifications_for_term( fort );
                  real_lexP = NIL;
                  if( NIL != lex_assertions )
                  {
                    cdolist_list_var_$206 = lex_assertions;
                    as = NIL;
                    as = cdolist_list_var_$206.first();
                    while ( NIL != cdolist_list_var_$206)
                    {
                      if( NIL == subl_promotions.memberP( assertions_high.assertion_formula( as ).first(), loose_preds, UNPROVIDED, UNPROVIDED ) )
                      {
                        real_lexP = T;
                      }
                      cdolist_list_var_$206 = cdolist_list_var_$206.rest();
                      as = cdolist_list_var_$206.first();
                    }
                    if( NIL != real_lexP )
                    {
                      real = Numbers.add( real, ONE_INTEGER );
                    }
                    else
                    {
                      loose = ConsesLow.cons( fort, loose );
                      PrintLow.format( T, $str202$__LOOSE___S___D_so_far___, fort, Sequences.length( loose ) );
                      PrintLow.format( T, $str203$__S, Mapping.mapcar( Symbols.symbol_function( $sym204$THIRD ), Mapping.mapcar( Symbols.symbol_function( $sym205$ASSERTION_FORMULA ), lex_assertions ) ) );
                    }
                  }
                  else
                  {
                    none = ConsesLow.cons( fort, none );
                  }
                }
              }
            }
            final SubLObject idx_$206 = idx;
            if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$206 ) || NIL == id_index.id_index_skip_tombstones_p( $kw201$SKIP ) )
            {
              final SubLObject sparse = id_index.id_index_sparse_objects( idx_$206 );
              SubLObject id2 = id_index.id_index_sparse_id_threshold( idx_$206 );
              final SubLObject end_id = id_index.id_index_next_id( idx_$206 );
              final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw201$SKIP ) ) ? NIL : $kw201$SKIP;
              while ( id2.numL( end_id ))
              {
                final SubLObject fort2 = Hashtables.gethash_without_values( id2, sparse, v_default );
                if( NIL == id_index.id_index_skip_tombstones_p( $kw201$SKIP ) || NIL == id_index.id_index_tombstone_p( fort2 ) )
                {
                  sofar = Numbers.add( sofar, ONE_INTEGER );
                  utilities_macros.note_percent_progress( sofar, total );
                  final SubLObject lex_assertions2 = all_lexifications_for_term( fort2 );
                  SubLObject real_lexP2 = NIL;
                  if( NIL != lex_assertions2 )
                  {
                    SubLObject cdolist_list_var_$207 = lex_assertions2;
                    SubLObject as2 = NIL;
                    as2 = cdolist_list_var_$207.first();
                    while ( NIL != cdolist_list_var_$207)
                    {
                      if( NIL == subl_promotions.memberP( assertions_high.assertion_formula( as2 ).first(), loose_preds, UNPROVIDED, UNPROVIDED ) )
                      {
                        real_lexP2 = T;
                      }
                      cdolist_list_var_$207 = cdolist_list_var_$207.rest();
                      as2 = cdolist_list_var_$207.first();
                    }
                    if( NIL != real_lexP2 )
                    {
                      real = Numbers.add( real, ONE_INTEGER );
                    }
                    else
                    {
                      loose = ConsesLow.cons( fort2, loose );
                      PrintLow.format( T, $str202$__LOOSE___S___D_so_far___, fort2, Sequences.length( loose ) );
                      PrintLow.format( T, $str203$__S, Mapping.mapcar( Symbols.symbol_function( $sym204$THIRD ), Mapping.mapcar( Symbols.symbol_function( $sym205$ASSERTION_FORMULA ), lex_assertions2 ) ) );
                    }
                  }
                  else
                  {
                    none = ConsesLow.cons( fort2, none );
                  }
                }
                id2 = Numbers.add( id2, ONE_INTEGER );
              }
            }
          }
          cdolist_list_var = cdolist_list_var.rest();
          table_var = cdolist_list_var.first();
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$209 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$209, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
    }
    PrintLow.format( T, $str206$____Forts_with_real_lexification_, real );
    PrintLow.format( T, $str207$____Forts_with_loose_lexification, Sequences.length( loose ) );
    PrintLow.format( T, $str208$____Forts_with_NO_lexification___, Sequences.length( none ) );
    return real;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 60381L)
  public static SubLObject unit_with_no_nlP(final SubLObject fort, SubLObject use_termstringsP)
  {
    if( use_termstringsP == UNPROVIDED )
    {
      use_termstringsP = T;
    }
    return makeBoolean( NIL == lexifications_for_term( fort, use_termstringsP, ONE_INTEGER, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 60782L)
  public static SubLObject parse_templates_for_term(final SubLObject fort)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject templates = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym32$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const33$EverythingPSC, thread );
      SubLObject cdolist_list_var = isa.all_fort_instances( $const209$ParseTemplatePredicate_Reln, UNPROVIDED, UNPROVIDED );
      SubLObject template_pred = NIL;
      template_pred = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cdolist_list_var_$210 = kb_mapping.gather_gaf_arg_index( fort, TWO_INTEGER, template_pred, UNPROVIDED, UNPROVIDED );
        SubLObject template = NIL;
        template = cdolist_list_var_$210.first();
        while ( NIL != cdolist_list_var_$210)
        {
          templates = ConsesLow.cons( template, templates );
          cdolist_list_var_$210 = cdolist_list_var_$210.rest();
          template = cdolist_list_var_$210.first();
        }
        cdolist_list_var = cdolist_list_var.rest();
        template_pred = cdolist_list_var.first();
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return templates;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 61212L)
  public static SubLObject all_lexifications_for_term(final SubLObject fort)
  {
    return lexifications_for_term( fort, T, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 61372L)
  public static SubLObject proper_lexifications_for_term(final SubLObject fort)
  {
    return ( NIL != fort ) ? lexifications_for_term( fort, NIL, UNPROVIDED, UNPROVIDED ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 61550L)
  public static SubLObject lexifications_for_term(final SubLObject fort, SubLObject use_termstringsP, SubLObject max_answers, SubLObject index_limit)
  {
    if( use_termstringsP == UNPROVIDED )
    {
      use_termstringsP = T;
    }
    if( max_answers == UNPROVIDED )
    {
      max_answers = NIL;
    }
    if( index_limit == UNPROVIDED )
    {
      index_limit = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    SubLObject assertions = ( NIL != control_vars.kb_loaded() ) ? cached_lexifications_for_term( fort, use_termstringsP, max_answers, $lexification_pred_types$.getGlobalValue(), index_limit ) : NIL;
    SubLObject incompleteP = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != list_utilities.find_if_not( $sym211$VALID_ASSERTION, assertions, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      remove_cached_lexifications_for_term( fort, use_termstringsP, max_answers, UNPROVIDED, UNPROVIDED );
      thread.resetMultipleValues();
      final SubLObject assertions_$211 = cached_lexifications_for_term( fort, use_termstringsP, max_answers, $lexification_pred_types$.getGlobalValue(), index_limit );
      final SubLObject incompleteP_$212 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      assertions = assertions_$211;
      incompleteP = incompleteP_$212;
      return Values.values( list_utilities.remove_if_not( $sym211$VALID_ASSERTION, assertions, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), incompleteP );
    }
    return Values.values( assertions, incompleteP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 62347L)
  public static SubLObject clear_cached_lexifications_for_term()
  {
    final SubLObject cs = $cached_lexifications_for_term_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 62347L)
  public static SubLObject remove_cached_lexifications_for_term(final SubLObject fort, SubLObject use_termstringsP, SubLObject max_answers, SubLObject pred_types, SubLObject index_limit)
  {
    if( use_termstringsP == UNPROVIDED )
    {
      use_termstringsP = T;
    }
    if( max_answers == UNPROVIDED )
    {
      max_answers = NIL;
    }
    if( pred_types == UNPROVIDED )
    {
      pred_types = $lexification_pred_types$.getGlobalValue();
    }
    if( index_limit == UNPROVIDED )
    {
      index_limit = NIL;
    }
    return memoization_state.caching_state_remove_function_results_with_args( $cached_lexifications_for_term_caching_state$.getGlobalValue(), ConsesLow.list( fort, use_termstringsP, max_answers, pred_types,
        index_limit ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 62347L)
  public static SubLObject cached_lexifications_for_term_internal(final SubLObject fort, final SubLObject use_termstringsP, final SubLObject max_answers, final SubLObject pred_types, final SubLObject index_limit)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != common_term_in_lexificationsP( fort ) )
    {
      return lexifications_of_common_lexification_term( fort, max_answers );
    }
    SubLObject ans = NIL;
    final SubLObject limit_numberP = Types.numberp( max_answers );
    SubLObject enoughP = NIL;
    SubLObject incompleteP = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym32$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const33$EverythingPSC, thread );
      final SubLObject filter_preds = ( NIL != use_termstringsP ) ? NIL : isa.all_fort_instances( $const199$ProperNamePredicate_Loose, UNPROVIDED, UNPROVIDED );
      if( NIL == enoughP )
      {
        SubLObject csome_list_var = pred_types;
        SubLObject pred_type = NIL;
        pred_type = csome_list_var.first();
        while ( NIL == enoughP && NIL != csome_list_var)
        {
          final SubLObject node_var = pred_type;
          final SubLObject _prev_bind_0_$213 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
          final SubLObject _prev_bind_1_$214 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding( thread );
          try
          {
            sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const195$isa ), thread );
            sbhl_marking_vars.$sbhl_gather_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
            try
            {
              if( NIL == enoughP )
              {
                SubLObject node_var_$215 = node_var;
                final SubLObject deck_type = $kw35$STACK;
                final SubLObject recur_deck = deck.create_deck( deck_type );
                final SubLObject _prev_bind_0_$214 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
                try
                {
                  sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
                  try
                  {
                    final SubLObject tv_var = NIL;
                    final SubLObject _prev_bind_0_$215 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
                    final SubLObject _prev_bind_1_$215 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
                    try
                    {
                      sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
                      sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym37$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
                      if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
                      {
                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
                        if( pcase_var.eql( $kw38$ERROR ) )
                        {
                          sbhl_paranoia.sbhl_error( ONE_INTEGER, $str39$_A_is_not_a__A, tv_var, $sym40$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                        }
                        else if( pcase_var.eql( $kw41$CERROR ) )
                        {
                          sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str42$continue_anyway, $str39$_A_is_not_a__A, tv_var, $sym40$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                        }
                        else if( pcase_var.eql( $kw43$WARN ) )
                        {
                          Errors.warn( $str39$_A_is_not_a__A, tv_var, $sym40$SBHL_TRUE_TV_P );
                        }
                        else
                        {
                          Errors.warn( $str44$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                          Errors.cerror( $str42$continue_anyway, $str39$_A_is_not_a__A, tv_var, $sym40$SBHL_TRUE_TV_P );
                        }
                      }
                      final SubLObject _prev_bind_0_$216 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
                      final SubLObject _prev_bind_1_$216 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
                      final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
                      final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                      final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                      try
                      {
                        sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const195$isa ) ), thread );
                        sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module(
                            $const195$isa ) ) ), thread );
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars
                            .get_sbhl_module( $const195$isa ) ) ), thread );
                        sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                        sbhl_module_vars.$sbhl_module$.bind( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const195$isa ) ), thread );
                        if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( node_var, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                        {
                          final SubLObject _prev_bind_0_$217 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                          final SubLObject _prev_bind_1_$217 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                          final SubLObject _prev_bind_2_$223 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                          try
                          {
                            sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_backward_search_direction(), thread );
                            sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities
                                .get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const195$isa ) ) ), thread );
                            sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                            sbhl_marking_utilities.sbhl_mark_node_marked( node_var_$215, UNPROVIDED );
                            while ( NIL != node_var_$215 && NIL == enoughP)
                            {
                              final SubLObject tt_node_var = node_var_$215;
                              final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const195$isa ) );
                              SubLObject rest;
                              SubLObject module_var;
                              SubLObject _prev_bind_0_$218;
                              SubLObject _prev_bind_1_$218;
                              SubLObject node;
                              SubLObject d_link;
                              SubLObject mt_links;
                              SubLObject iteration_state;
                              SubLObject mt;
                              SubLObject tv_links;
                              SubLObject _prev_bind_0_$219;
                              SubLObject iteration_state_$227;
                              SubLObject tv;
                              SubLObject link_nodes;
                              SubLObject _prev_bind_0_$220;
                              SubLObject sol;
                              SubLObject set_contents_var;
                              SubLObject basis_object;
                              SubLObject state;
                              SubLObject pred_var;
                              SubLObject pred_var_$229;
                              SubLObject iterator_var;
                              SubLObject done_var;
                              SubLObject token_var;
                              SubLObject final_index_spec;
                              SubLObject valid;
                              SubLObject final_index_iterator;
                              SubLObject done_var_$230;
                              SubLObject token_var_$231;
                              SubLObject as;
                              SubLObject valid_$232;
                              SubLObject item_var;
                              SubLObject cdolist_list_var;
                              SubLObject meta;
                              SubLObject item_var2;
                              SubLObject _prev_bind_0_$221;
                              SubLObject _values;
                              SubLObject csome_list_var_$234;
                              SubLObject pred_var2;
                              SubLObject pred_var_$230;
                              SubLObject iterator_var2;
                              SubLObject done_var2;
                              SubLObject token_var2;
                              SubLObject final_index_spec2;
                              SubLObject valid2;
                              SubLObject final_index_iterator2;
                              SubLObject done_var_$231;
                              SubLObject token_var_$232;
                              SubLObject as2;
                              SubLObject valid_$233;
                              SubLObject item_var3;
                              SubLObject cdolist_list_var2;
                              SubLObject meta2;
                              SubLObject _prev_bind_0_$222;
                              SubLObject _values2;
                              SubLObject csome_list_var_$235;
                              SubLObject instance_tuple;
                              SubLObject current;
                              SubLObject datum;
                              SubLObject link_node;
                              SubLObject mt2;
                              SubLObject tv2;
                              SubLObject _prev_bind_0_$223;
                              SubLObject _prev_bind_0_$224;
                              SubLObject link_nodes2;
                              SubLObject pred_var_$231;
                              SubLObject done_var_$232;
                              SubLObject token_var_$233;
                              SubLObject valid_$234;
                              SubLObject _prev_bind_0_$225;
                              SubLObject _values3;
                              SubLObject csome_list_var_$236;
                              SubLObject pred_var_$232;
                              SubLObject done_var_$233;
                              SubLObject token_var_$234;
                              SubLObject valid_$235;
                              SubLObject _prev_bind_0_$226;
                              SubLObject _values4;
                              SubLObject new_list;
                              SubLObject rest_$254;
                              SubLObject generating_fn;
                              SubLObject _prev_bind_0_$227;
                              SubLObject sol2;
                              SubLObject link_nodes3;
                              SubLObject set_contents_var2;
                              SubLObject basis_object2;
                              SubLObject state2;
                              SubLObject pred_var3;
                              SubLObject pred_var_$233;
                              SubLObject iterator_var3;
                              SubLObject done_var3;
                              SubLObject token_var3;
                              SubLObject final_index_spec3;
                              SubLObject valid3;
                              SubLObject final_index_iterator3;
                              SubLObject done_var_$234;
                              SubLObject token_var_$235;
                              SubLObject as3;
                              SubLObject valid_$236;
                              SubLObject item_var4;
                              SubLObject cdolist_list_var3;
                              SubLObject meta3;
                              SubLObject item_var5;
                              SubLObject _prev_bind_0_$228;
                              SubLObject _values5;
                              SubLObject csome_list_var_$237;
                              SubLObject pred_var4;
                              SubLObject pred_var_$234;
                              SubLObject iterator_var4;
                              SubLObject done_var4;
                              SubLObject token_var4;
                              SubLObject final_index_spec4;
                              SubLObject valid4;
                              SubLObject final_index_iterator4;
                              SubLObject done_var_$235;
                              SubLObject token_var_$236;
                              SubLObject as4;
                              SubLObject valid_$237;
                              SubLObject item_var6;
                              SubLObject cdolist_list_var4;
                              SubLObject meta4;
                              SubLObject _prev_bind_0_$229;
                              SubLObject _values6;
                              for( rest = NIL, rest = accessible_modules; NIL == enoughP && NIL != rest; rest = rest.rest() )
                              {
                                module_var = rest.first();
                                _prev_bind_0_$218 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                                _prev_bind_1_$218 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                                try
                                {
                                  sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                                  sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                                      .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                                  node = function_terms.naut_to_nart( tt_node_var );
                                  if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                                  {
                                    d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                    if( NIL != d_link )
                                    {
                                      mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const195$isa ) ), sbhl_module_vars
                                          .get_sbhl_module( UNPROVIDED ) );
                                      if( NIL != mt_links )
                                      {
                                        for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == enoughP && NIL == dictionary_contents
                                            .do_dictionary_contents_doneP( iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                                        {
                                          thread.resetMultipleValues();
                                          mt = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                          tv_links = thread.secondMultipleValue();
                                          thread.resetMultipleValues();
                                          if( NIL != mt_relevance_macros.relevant_mtP( mt ) )
                                          {
                                            _prev_bind_0_$219 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                            try
                                            {
                                              sbhl_link_vars.$sbhl_link_mt$.bind( mt, thread );
                                              for( iteration_state_$227 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == enoughP && NIL == dictionary_contents
                                                  .do_dictionary_contents_doneP( iteration_state_$227 ); iteration_state_$227 = dictionary_contents.do_dictionary_contents_next( iteration_state_$227 ) )
                                              {
                                                thread.resetMultipleValues();
                                                tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$227 );
                                                link_nodes = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                                {
                                                  _prev_bind_0_$220 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                                  try
                                                  {
                                                    sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                                    sol = link_nodes;
                                                    if( NIL != set.set_p( sol ) )
                                                    {
                                                      set_contents_var = set.do_set_internal( sol );
                                                      for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                          set_contents_var ); NIL == enoughP && NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state(
                                                              state ) )
                                                      {
                                                        pred_var = set_contents.do_set_contents_next( basis_object, state );
                                                        if( NIL != set_contents.do_set_contents_element_validP( state, pred_var ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( pred_var,
                                                            sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                        {
                                                          sbhl_marking_utilities.sbhl_mark_node_marked( pred_var, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                          if( NIL != forts.fort_p( pred_var ) )
                                                          {
                                                            pred_var_$229 = pred_var;
                                                            if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( fort, NIL, pred_var_$229 ) )
                                                            {
                                                              iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( fort, NIL, pred_var_$229 );
                                                              done_var = enoughP;
                                                              token_var = NIL;
                                                              while ( NIL == done_var)
                                                              {
                                                                final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
                                                                valid = makeBoolean( !token_var.eql( final_index_spec ) );
                                                                if( NIL != valid )
                                                                {
                                                                  final_index_iterator = NIL;
                                                                  try
                                                                  {
                                                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw96$GAF, NIL, NIL );
                                                                    done_var_$230 = enoughP;
                                                                    token_var_$231 = NIL;
                                                                    while ( NIL == done_var_$230)
                                                                    {
                                                                      as = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$231 );
                                                                      valid_$232 = makeBoolean( !token_var_$231.eql( as ) );
                                                                      if( NIL != valid_$232 && NIL != subl_promotions.memberP( fort, assertions_high.gaf_args( as ), UNPROVIDED, UNPROVIDED ) && NIL == conses_high.member(
                                                                          assertions_high.gaf_arg0( as ), filter_preds, UNPROVIDED, UNPROVIDED ) )
                                                                      {
                                                                        item_var = as;
                                                                        if( NIL == conses_high.member( item_var, ans, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
                                                                        {
                                                                          ans = ConsesLow.cons( item_var, ans );
                                                                        }
                                                                        cdolist_list_var = assertion_utilities.all_meta_assertions( as );
                                                                        meta = NIL;
                                                                        meta = cdolist_list_var.first();
                                                                        while ( NIL != cdolist_list_var)
                                                                        {
                                                                          if( NIL != isa.isaP( cycl_utilities.formula_arg0( meta ), $const213$NLPragmaticPredicate, UNPROVIDED, UNPROVIDED ) )
                                                                          {
                                                                            item_var2 = meta;
                                                                            if( NIL == conses_high.member( item_var2, ans, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
                                                                            {
                                                                              ans = ConsesLow.cons( item_var2, ans );
                                                                            }
                                                                          }
                                                                          cdolist_list_var = cdolist_list_var.rest();
                                                                          meta = cdolist_list_var.first();
                                                                        }
                                                                        if( NIL != limit_numberP && NIL != list_utilities.lengthGE( ans, max_answers, UNPROVIDED ) )
                                                                        {
                                                                          enoughP = T;
                                                                        }
                                                                      }
                                                                      done_var_$230 = makeBoolean( NIL == valid_$232 || NIL != enoughP );
                                                                    }
                                                                  }
                                                                  finally
                                                                  {
                                                                    _prev_bind_0_$221 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                                                    try
                                                                    {
                                                                      Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                                                      _values = Values.getValuesAsVector();
                                                                      if( NIL != final_index_iterator )
                                                                      {
                                                                        kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                                                                      }
                                                                      Values.restoreValuesFromVector( _values );
                                                                    }
                                                                    finally
                                                                    {
                                                                      Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$221, thread );
                                                                    }
                                                                  }
                                                                }
                                                                done_var = makeBoolean( NIL == valid || NIL != enoughP );
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                    else if( sol.isList() )
                                                    {
                                                      if( NIL == enoughP )
                                                      {
                                                        csome_list_var_$234 = sol;
                                                        pred_var2 = NIL;
                                                        pred_var2 = csome_list_var_$234.first();
                                                        while ( NIL == enoughP && NIL != csome_list_var_$234)
                                                        {
                                                          if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( pred_var2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                          {
                                                            sbhl_marking_utilities.sbhl_mark_node_marked( pred_var2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                            if( NIL != forts.fort_p( pred_var2 ) )
                                                            {
                                                              pred_var_$230 = pred_var2;
                                                              if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( fort, NIL, pred_var_$230 ) )
                                                              {
                                                                iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( fort, NIL, pred_var_$230 );
                                                                done_var2 = enoughP;
                                                                token_var2 = NIL;
                                                                while ( NIL == done_var2)
                                                                {
                                                                  final_index_spec2 = iteration.iteration_next_without_values_macro_helper( iterator_var2, token_var2 );
                                                                  valid2 = makeBoolean( !token_var2.eql( final_index_spec2 ) );
                                                                  if( NIL != valid2 )
                                                                  {
                                                                    final_index_iterator2 = NIL;
                                                                    try
                                                                    {
                                                                      final_index_iterator2 = kb_mapping_macros.new_final_index_iterator( final_index_spec2, $kw96$GAF, NIL, NIL );
                                                                      done_var_$231 = enoughP;
                                                                      token_var_$232 = NIL;
                                                                      while ( NIL == done_var_$231)
                                                                      {
                                                                        as2 = iteration.iteration_next_without_values_macro_helper( final_index_iterator2, token_var_$232 );
                                                                        valid_$233 = makeBoolean( !token_var_$232.eql( as2 ) );
                                                                        if( NIL != valid_$233 && NIL != subl_promotions.memberP( fort, assertions_high.gaf_args( as2 ), UNPROVIDED, UNPROVIDED ) && NIL == conses_high
                                                                            .member( assertions_high.gaf_arg0( as2 ), filter_preds, UNPROVIDED, UNPROVIDED ) )
                                                                        {
                                                                          item_var3 = as2;
                                                                          if( NIL == conses_high.member( item_var3, ans, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
                                                                          {
                                                                            ans = ConsesLow.cons( item_var3, ans );
                                                                          }
                                                                          cdolist_list_var2 = assertion_utilities.all_meta_assertions( as2 );
                                                                          meta2 = NIL;
                                                                          meta2 = cdolist_list_var2.first();
                                                                          while ( NIL != cdolist_list_var2)
                                                                          {
                                                                            if( NIL != isa.isaP( cycl_utilities.formula_arg0( meta2 ), $const213$NLPragmaticPredicate, UNPROVIDED, UNPROVIDED ) )
                                                                            {
                                                                              item_var = meta2;
                                                                              if( NIL == conses_high.member( item_var, ans, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
                                                                              {
                                                                                ans = ConsesLow.cons( item_var, ans );
                                                                              }
                                                                            }
                                                                            cdolist_list_var2 = cdolist_list_var2.rest();
                                                                            meta2 = cdolist_list_var2.first();
                                                                          }
                                                                          if( NIL != limit_numberP && NIL != list_utilities.lengthGE( ans, max_answers, UNPROVIDED ) )
                                                                          {
                                                                            enoughP = T;
                                                                          }
                                                                        }
                                                                        done_var_$231 = makeBoolean( NIL == valid_$233 || NIL != enoughP );
                                                                      }
                                                                    }
                                                                    finally
                                                                    {
                                                                      _prev_bind_0_$222 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                                                      try
                                                                      {
                                                                        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                                                        _values2 = Values.getValuesAsVector();
                                                                        if( NIL != final_index_iterator2 )
                                                                        {
                                                                          kb_mapping_macros.destroy_final_index_iterator( final_index_iterator2 );
                                                                        }
                                                                        Values.restoreValuesFromVector( _values2 );
                                                                      }
                                                                      finally
                                                                      {
                                                                        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$222, thread );
                                                                      }
                                                                    }
                                                                  }
                                                                  done_var2 = makeBoolean( NIL == valid2 || NIL != enoughP );
                                                                }
                                                              }
                                                            }
                                                          }
                                                          csome_list_var_$234 = csome_list_var_$234.rest();
                                                          pred_var2 = csome_list_var_$234.first();
                                                        }
                                                      }
                                                    }
                                                    else
                                                    {
                                                      Errors.error( $str47$_A_is_neither_SET_P_nor_LISTP_, sol );
                                                    }
                                                  }
                                                  finally
                                                  {
                                                    sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$220, thread );
                                                  }
                                                }
                                              }
                                              dictionary_contents.do_dictionary_contents_finalize( iteration_state_$227 );
                                            }
                                            finally
                                            {
                                              sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$219, thread );
                                            }
                                          }
                                        }
                                        dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                                      }
                                    }
                                    else
                                    {
                                      sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str48$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                    }
                                    if( NIL != sbhl_macros.do_sbhl_non_fort_linksP( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) && NIL == enoughP )
                                    {
                                      csome_list_var_$235 = sbhl_link_methods.non_fort_instance_table_lookup( node );
                                      instance_tuple = NIL;
                                      instance_tuple = csome_list_var_$235.first();
                                      while ( NIL == enoughP && NIL != csome_list_var_$235)
                                      {
                                        datum = ( current = instance_tuple );
                                        link_node = NIL;
                                        mt2 = NIL;
                                        tv2 = NIL;
                                        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list197 );
                                        link_node = current.first();
                                        current = current.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list197 );
                                        mt2 = current.first();
                                        current = current.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list197 );
                                        tv2 = current.first();
                                        current = current.rest();
                                        if( NIL == current )
                                        {
                                          if( NIL != mt_relevance_macros.relevant_mtP( mt2 ) )
                                          {
                                            _prev_bind_0_$223 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                            try
                                            {
                                              sbhl_link_vars.$sbhl_link_mt$.bind( mt2, thread );
                                              if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv2 ) )
                                              {
                                                _prev_bind_0_$224 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                                try
                                                {
                                                  sbhl_link_vars.$sbhl_link_tv$.bind( tv2, thread );
                                                  link_nodes2 = ( sol = ConsesLow.list( link_node ) );
                                                  if( NIL != set.set_p( sol ) )
                                                  {
                                                    set_contents_var = set.do_set_internal( sol );
                                                    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                        set_contents_var ); NIL == enoughP && NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                                    {
                                                      pred_var = set_contents.do_set_contents_next( basis_object, state );
                                                      if( NIL != set_contents.do_set_contents_element_validP( state, pred_var ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( pred_var,
                                                          sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                      {
                                                        sbhl_marking_utilities.sbhl_mark_node_marked( pred_var, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                        if( NIL != forts.fort_p( pred_var ) )
                                                        {
                                                          pred_var_$231 = pred_var;
                                                          if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( fort, NIL, pred_var_$231 ) )
                                                          {
                                                            iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( fort, NIL, pred_var_$231 );
                                                            done_var = enoughP;
                                                            token_var = NIL;
                                                            while ( NIL == done_var)
                                                            {
                                                              final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
                                                              valid = makeBoolean( !token_var.eql( final_index_spec ) );
                                                              if( NIL != valid )
                                                              {
                                                                final_index_iterator = NIL;
                                                                try
                                                                {
                                                                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw96$GAF, NIL, NIL );
                                                                  done_var_$232 = enoughP;
                                                                  token_var_$233 = NIL;
                                                                  while ( NIL == done_var_$232)
                                                                  {
                                                                    as = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$233 );
                                                                    valid_$234 = makeBoolean( !token_var_$233.eql( as ) );
                                                                    if( NIL != valid_$234 && NIL != subl_promotions.memberP( fort, assertions_high.gaf_args( as ), UNPROVIDED, UNPROVIDED ) && NIL == conses_high.member(
                                                                        assertions_high.gaf_arg0( as ), filter_preds, UNPROVIDED, UNPROVIDED ) )
                                                                    {
                                                                      item_var = as;
                                                                      if( NIL == conses_high.member( item_var, ans, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
                                                                      {
                                                                        ans = ConsesLow.cons( item_var, ans );
                                                                      }
                                                                      cdolist_list_var = assertion_utilities.all_meta_assertions( as );
                                                                      meta = NIL;
                                                                      meta = cdolist_list_var.first();
                                                                      while ( NIL != cdolist_list_var)
                                                                      {
                                                                        if( NIL != isa.isaP( cycl_utilities.formula_arg0( meta ), $const213$NLPragmaticPredicate, UNPROVIDED, UNPROVIDED ) )
                                                                        {
                                                                          item_var2 = meta;
                                                                          if( NIL == conses_high.member( item_var2, ans, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
                                                                          {
                                                                            ans = ConsesLow.cons( item_var2, ans );
                                                                          }
                                                                        }
                                                                        cdolist_list_var = cdolist_list_var.rest();
                                                                        meta = cdolist_list_var.first();
                                                                      }
                                                                      if( NIL != limit_numberP && NIL != list_utilities.lengthGE( ans, max_answers, UNPROVIDED ) )
                                                                      {
                                                                        enoughP = T;
                                                                      }
                                                                    }
                                                                    done_var_$232 = makeBoolean( NIL == valid_$234 || NIL != enoughP );
                                                                  }
                                                                }
                                                                finally
                                                                {
                                                                  _prev_bind_0_$225 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                                                  try
                                                                  {
                                                                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                                                    _values3 = Values.getValuesAsVector();
                                                                    if( NIL != final_index_iterator )
                                                                    {
                                                                      kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                                                                    }
                                                                    Values.restoreValuesFromVector( _values3 );
                                                                  }
                                                                  finally
                                                                  {
                                                                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$225, thread );
                                                                  }
                                                                }
                                                              }
                                                              done_var = makeBoolean( NIL == valid || NIL != enoughP );
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                  else if( sol.isList() )
                                                  {
                                                    if( NIL == enoughP )
                                                    {
                                                      csome_list_var_$236 = sol;
                                                      pred_var2 = NIL;
                                                      pred_var2 = csome_list_var_$236.first();
                                                      while ( NIL == enoughP && NIL != csome_list_var_$236)
                                                      {
                                                        if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( pred_var2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                        {
                                                          sbhl_marking_utilities.sbhl_mark_node_marked( pred_var2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                          if( NIL != forts.fort_p( pred_var2 ) )
                                                          {
                                                            pred_var_$232 = pred_var2;
                                                            if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( fort, NIL, pred_var_$232 ) )
                                                            {
                                                              iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( fort, NIL, pred_var_$232 );
                                                              done_var2 = enoughP;
                                                              token_var2 = NIL;
                                                              while ( NIL == done_var2)
                                                              {
                                                                final_index_spec2 = iteration.iteration_next_without_values_macro_helper( iterator_var2, token_var2 );
                                                                valid2 = makeBoolean( !token_var2.eql( final_index_spec2 ) );
                                                                if( NIL != valid2 )
                                                                {
                                                                  final_index_iterator2 = NIL;
                                                                  try
                                                                  {
                                                                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator( final_index_spec2, $kw96$GAF, NIL, NIL );
                                                                    done_var_$233 = enoughP;
                                                                    token_var_$234 = NIL;
                                                                    while ( NIL == done_var_$233)
                                                                    {
                                                                      as2 = iteration.iteration_next_without_values_macro_helper( final_index_iterator2, token_var_$234 );
                                                                      valid_$235 = makeBoolean( !token_var_$234.eql( as2 ) );
                                                                      if( NIL != valid_$235 && NIL != subl_promotions.memberP( fort, assertions_high.gaf_args( as2 ), UNPROVIDED, UNPROVIDED ) && NIL == conses_high.member(
                                                                          assertions_high.gaf_arg0( as2 ), filter_preds, UNPROVIDED, UNPROVIDED ) )
                                                                      {
                                                                        item_var3 = as2;
                                                                        if( NIL == conses_high.member( item_var3, ans, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
                                                                        {
                                                                          ans = ConsesLow.cons( item_var3, ans );
                                                                        }
                                                                        cdolist_list_var2 = assertion_utilities.all_meta_assertions( as2 );
                                                                        meta2 = NIL;
                                                                        meta2 = cdolist_list_var2.first();
                                                                        while ( NIL != cdolist_list_var2)
                                                                        {
                                                                          if( NIL != isa.isaP( cycl_utilities.formula_arg0( meta2 ), $const213$NLPragmaticPredicate, UNPROVIDED, UNPROVIDED ) )
                                                                          {
                                                                            item_var = meta2;
                                                                            if( NIL == conses_high.member( item_var, ans, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
                                                                            {
                                                                              ans = ConsesLow.cons( item_var, ans );
                                                                            }
                                                                          }
                                                                          cdolist_list_var2 = cdolist_list_var2.rest();
                                                                          meta2 = cdolist_list_var2.first();
                                                                        }
                                                                        if( NIL != limit_numberP && NIL != list_utilities.lengthGE( ans, max_answers, UNPROVIDED ) )
                                                                        {
                                                                          enoughP = T;
                                                                        }
                                                                      }
                                                                      done_var_$233 = makeBoolean( NIL == valid_$235 || NIL != enoughP );
                                                                    }
                                                                  }
                                                                  finally
                                                                  {
                                                                    _prev_bind_0_$226 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                                                    try
                                                                    {
                                                                      Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                                                      _values4 = Values.getValuesAsVector();
                                                                      if( NIL != final_index_iterator2 )
                                                                      {
                                                                        kb_mapping_macros.destroy_final_index_iterator( final_index_iterator2 );
                                                                      }
                                                                      Values.restoreValuesFromVector( _values4 );
                                                                    }
                                                                    finally
                                                                    {
                                                                      Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$226, thread );
                                                                    }
                                                                  }
                                                                }
                                                                done_var2 = makeBoolean( NIL == valid2 || NIL != enoughP );
                                                              }
                                                            }
                                                          }
                                                        }
                                                        csome_list_var_$236 = csome_list_var_$236.rest();
                                                        pred_var2 = csome_list_var_$236.first();
                                                      }
                                                    }
                                                  }
                                                  else
                                                  {
                                                    Errors.error( $str47$_A_is_neither_SET_P_nor_LISTP_, sol );
                                                  }
                                                }
                                                finally
                                                {
                                                  sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$224, thread );
                                                }
                                              }
                                            }
                                            finally
                                            {
                                              sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$223, thread );
                                            }
                                          }
                                        }
                                        else
                                        {
                                          cdestructuring_bind.cdestructuring_bind_error( datum, $list197 );
                                        }
                                        csome_list_var_$235 = csome_list_var_$235.rest();
                                        instance_tuple = csome_list_var_$235.first();
                                      }
                                    }
                                  }
                                  else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                                  {
                                    new_list = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(
                                        sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const195$isa ) ), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ),
                                        sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                                        : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module(
                                            $const195$isa ) ), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) );
                                    for( rest_$254 = NIL, rest_$254 = new_list; NIL == enoughP && NIL != rest_$254; rest_$254 = rest_$254.rest() )
                                    {
                                      generating_fn = rest_$254.first();
                                      _prev_bind_0_$227 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                      try
                                      {
                                        sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                                        link_nodes3 = ( sol2 = Functions.funcall( generating_fn, node ) );
                                        if( NIL != set.set_p( sol2 ) )
                                        {
                                          set_contents_var2 = set.do_set_internal( sol2 );
                                          for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                              set_contents_var2 ); NIL == enoughP && NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                          {
                                            pred_var3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                            if( NIL != set_contents.do_set_contents_element_validP( state2, pred_var3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( pred_var3,
                                                sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                            {
                                              sbhl_marking_utilities.sbhl_mark_node_marked( pred_var3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                              if( NIL != forts.fort_p( pred_var3 ) )
                                              {
                                                pred_var_$233 = pred_var3;
                                                if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( fort, NIL, pred_var_$233 ) )
                                                {
                                                  iterator_var3 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( fort, NIL, pred_var_$233 );
                                                  done_var3 = enoughP;
                                                  token_var3 = NIL;
                                                  while ( NIL == done_var3)
                                                  {
                                                    final_index_spec3 = iteration.iteration_next_without_values_macro_helper( iterator_var3, token_var3 );
                                                    valid3 = makeBoolean( !token_var3.eql( final_index_spec3 ) );
                                                    if( NIL != valid3 )
                                                    {
                                                      final_index_iterator3 = NIL;
                                                      try
                                                      {
                                                        final_index_iterator3 = kb_mapping_macros.new_final_index_iterator( final_index_spec3, $kw96$GAF, NIL, NIL );
                                                        done_var_$234 = enoughP;
                                                        token_var_$235 = NIL;
                                                        while ( NIL == done_var_$234)
                                                        {
                                                          as3 = iteration.iteration_next_without_values_macro_helper( final_index_iterator3, token_var_$235 );
                                                          valid_$236 = makeBoolean( !token_var_$235.eql( as3 ) );
                                                          if( NIL != valid_$236 && NIL != subl_promotions.memberP( fort, assertions_high.gaf_args( as3 ), UNPROVIDED, UNPROVIDED ) && NIL == conses_high.member(
                                                              assertions_high.gaf_arg0( as3 ), filter_preds, UNPROVIDED, UNPROVIDED ) )
                                                          {
                                                            item_var4 = as3;
                                                            if( NIL == conses_high.member( item_var4, ans, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
                                                            {
                                                              ans = ConsesLow.cons( item_var4, ans );
                                                            }
                                                            cdolist_list_var3 = assertion_utilities.all_meta_assertions( as3 );
                                                            meta3 = NIL;
                                                            meta3 = cdolist_list_var3.first();
                                                            while ( NIL != cdolist_list_var3)
                                                            {
                                                              if( NIL != isa.isaP( cycl_utilities.formula_arg0( meta3 ), $const213$NLPragmaticPredicate, UNPROVIDED, UNPROVIDED ) )
                                                              {
                                                                item_var5 = meta3;
                                                                if( NIL == conses_high.member( item_var5, ans, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
                                                                {
                                                                  ans = ConsesLow.cons( item_var5, ans );
                                                                }
                                                              }
                                                              cdolist_list_var3 = cdolist_list_var3.rest();
                                                              meta3 = cdolist_list_var3.first();
                                                            }
                                                            if( NIL != limit_numberP && NIL != list_utilities.lengthGE( ans, max_answers, UNPROVIDED ) )
                                                            {
                                                              enoughP = T;
                                                            }
                                                          }
                                                          done_var_$234 = makeBoolean( NIL == valid_$236 || NIL != enoughP );
                                                        }
                                                      }
                                                      finally
                                                      {
                                                        _prev_bind_0_$228 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                                        try
                                                        {
                                                          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                                          _values5 = Values.getValuesAsVector();
                                                          if( NIL != final_index_iterator3 )
                                                          {
                                                            kb_mapping_macros.destroy_final_index_iterator( final_index_iterator3 );
                                                          }
                                                          Values.restoreValuesFromVector( _values5 );
                                                        }
                                                        finally
                                                        {
                                                          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$228, thread );
                                                        }
                                                      }
                                                    }
                                                    done_var3 = makeBoolean( NIL == valid3 || NIL != enoughP );
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                        else if( sol2.isList() )
                                        {
                                          if( NIL == enoughP )
                                          {
                                            csome_list_var_$237 = sol2;
                                            pred_var4 = NIL;
                                            pred_var4 = csome_list_var_$237.first();
                                            while ( NIL == enoughP && NIL != csome_list_var_$237)
                                            {
                                              if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( pred_var4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                              {
                                                sbhl_marking_utilities.sbhl_mark_node_marked( pred_var4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                if( NIL != forts.fort_p( pred_var4 ) )
                                                {
                                                  pred_var_$234 = pred_var4;
                                                  if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( fort, NIL, pred_var_$234 ) )
                                                  {
                                                    iterator_var4 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( fort, NIL, pred_var_$234 );
                                                    done_var4 = enoughP;
                                                    token_var4 = NIL;
                                                    while ( NIL == done_var4)
                                                    {
                                                      final_index_spec4 = iteration.iteration_next_without_values_macro_helper( iterator_var4, token_var4 );
                                                      valid4 = makeBoolean( !token_var4.eql( final_index_spec4 ) );
                                                      if( NIL != valid4 )
                                                      {
                                                        final_index_iterator4 = NIL;
                                                        try
                                                        {
                                                          final_index_iterator4 = kb_mapping_macros.new_final_index_iterator( final_index_spec4, $kw96$GAF, NIL, NIL );
                                                          done_var_$235 = enoughP;
                                                          token_var_$236 = NIL;
                                                          while ( NIL == done_var_$235)
                                                          {
                                                            as4 = iteration.iteration_next_without_values_macro_helper( final_index_iterator4, token_var_$236 );
                                                            valid_$237 = makeBoolean( !token_var_$236.eql( as4 ) );
                                                            if( NIL != valid_$237 && NIL != subl_promotions.memberP( fort, assertions_high.gaf_args( as4 ), UNPROVIDED, UNPROVIDED ) && NIL == conses_high.member(
                                                                assertions_high.gaf_arg0( as4 ), filter_preds, UNPROVIDED, UNPROVIDED ) )
                                                            {
                                                              item_var6 = as4;
                                                              if( NIL == conses_high.member( item_var6, ans, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
                                                              {
                                                                ans = ConsesLow.cons( item_var6, ans );
                                                              }
                                                              cdolist_list_var4 = assertion_utilities.all_meta_assertions( as4 );
                                                              meta4 = NIL;
                                                              meta4 = cdolist_list_var4.first();
                                                              while ( NIL != cdolist_list_var4)
                                                              {
                                                                if( NIL != isa.isaP( cycl_utilities.formula_arg0( meta4 ), $const213$NLPragmaticPredicate, UNPROVIDED, UNPROVIDED ) )
                                                                {
                                                                  item_var4 = meta4;
                                                                  if( NIL == conses_high.member( item_var4, ans, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
                                                                  {
                                                                    ans = ConsesLow.cons( item_var4, ans );
                                                                  }
                                                                }
                                                                cdolist_list_var4 = cdolist_list_var4.rest();
                                                                meta4 = cdolist_list_var4.first();
                                                              }
                                                              if( NIL != limit_numberP && NIL != list_utilities.lengthGE( ans, max_answers, UNPROVIDED ) )
                                                              {
                                                                enoughP = T;
                                                              }
                                                            }
                                                            done_var_$235 = makeBoolean( NIL == valid_$237 || NIL != enoughP );
                                                          }
                                                        }
                                                        finally
                                                        {
                                                          _prev_bind_0_$229 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                                          try
                                                          {
                                                            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                                            _values6 = Values.getValuesAsVector();
                                                            if( NIL != final_index_iterator4 )
                                                            {
                                                              kb_mapping_macros.destroy_final_index_iterator( final_index_iterator4 );
                                                            }
                                                            Values.restoreValuesFromVector( _values6 );
                                                          }
                                                          finally
                                                          {
                                                            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$229, thread );
                                                          }
                                                        }
                                                      }
                                                      done_var4 = makeBoolean( NIL == valid4 || NIL != enoughP );
                                                    }
                                                  }
                                                }
                                              }
                                              csome_list_var_$237 = csome_list_var_$237.rest();
                                              pred_var4 = csome_list_var_$237.first();
                                            }
                                          }
                                        }
                                        else
                                        {
                                          Errors.error( $str47$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                        }
                                      }
                                      finally
                                      {
                                        sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$227, thread );
                                      }
                                    }
                                  }
                                }
                                finally
                                {
                                  sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$218, thread );
                                  sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$218, thread );
                                }
                              }
                              final SubLObject accessible_modules2 = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module(
                                  $const195$isa ) ) );
                              SubLObject rest2;
                              SubLObject module_var2;
                              SubLObject _prev_bind_0_$230;
                              SubLObject _prev_bind_1_$219;
                              SubLObject node2;
                              SubLObject d_link2;
                              SubLObject mt_links2;
                              SubLObject iteration_state2;
                              SubLObject mt3;
                              SubLObject tv_links2;
                              SubLObject _prev_bind_0_$231;
                              SubLObject iteration_state_$228;
                              SubLObject link_nodes4;
                              SubLObject _prev_bind_0_$232;
                              SubLObject sol3;
                              SubLObject set_contents_var3;
                              SubLObject basis_object3;
                              SubLObject state3;
                              SubLObject node_vars_link_node;
                              SubLObject csome_list_var_$238;
                              SubLObject node_vars_link_node2;
                              SubLObject new_list2;
                              SubLObject rest_$255;
                              SubLObject generating_fn2;
                              SubLObject _prev_bind_0_$233;
                              SubLObject sol4;
                              SubLObject link_nodes5;
                              SubLObject set_contents_var4;
                              SubLObject basis_object4;
                              SubLObject state4;
                              SubLObject node_vars_link_node3;
                              SubLObject csome_list_var_$239;
                              SubLObject node_vars_link_node4;
                              for( rest2 = NIL, rest2 = accessible_modules2; NIL == enoughP && NIL != rest2; rest2 = rest2.rest() )
                              {
                                module_var2 = rest2.first();
                                _prev_bind_0_$230 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                                _prev_bind_1_$219 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                                try
                                {
                                  sbhl_module_vars.$sbhl_module$.bind( module_var2, thread );
                                  sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                                      .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                                  node2 = function_terms.naut_to_nart( node_var_$215 );
                                  if( NIL != sbhl_link_vars.sbhl_node_object_p( node2 ) )
                                  {
                                    d_link2 = sbhl_graphs.get_sbhl_graph_link( node2, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                    if( NIL != d_link2 )
                                    {
                                      mt_links2 = sbhl_links.get_sbhl_mt_links( d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                      if( NIL != mt_links2 )
                                      {
                                        for( iteration_state2 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links2 ) ); NIL == enoughP && NIL == dictionary_contents
                                            .do_dictionary_contents_doneP( iteration_state2 ); iteration_state2 = dictionary_contents.do_dictionary_contents_next( iteration_state2 ) )
                                        {
                                          thread.resetMultipleValues();
                                          mt3 = dictionary_contents.do_dictionary_contents_key_value( iteration_state2 );
                                          tv_links2 = thread.secondMultipleValue();
                                          thread.resetMultipleValues();
                                          if( NIL != mt_relevance_macros.relevant_mtP( mt3 ) )
                                          {
                                            _prev_bind_0_$231 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                            try
                                            {
                                              sbhl_link_vars.$sbhl_link_mt$.bind( mt3, thread );
                                              for( iteration_state_$228 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links2 ) ); NIL == enoughP && NIL == dictionary_contents
                                                  .do_dictionary_contents_doneP( iteration_state_$228 ); iteration_state_$228 = dictionary_contents.do_dictionary_contents_next( iteration_state_$228 ) )
                                              {
                                                thread.resetMultipleValues();
                                                tv2 = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$228 );
                                                link_nodes4 = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv2 ) )
                                                {
                                                  _prev_bind_0_$232 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                                  try
                                                  {
                                                    sbhl_link_vars.$sbhl_link_tv$.bind( tv2, thread );
                                                    sol3 = link_nodes4;
                                                    if( NIL != set.set_p( sol3 ) )
                                                    {
                                                      set_contents_var3 = set.do_set_internal( sol3 );
                                                      for( basis_object3 = set_contents.do_set_contents_basis_object( set_contents_var3 ), state3 = NIL, state3 = set_contents.do_set_contents_initial_state( basis_object3,
                                                          set_contents_var3 ); NIL == enoughP && NIL == set_contents.do_set_contents_doneP( basis_object3, state3 ); state3 = set_contents.do_set_contents_update_state(
                                                              state3 ) )
                                                      {
                                                        node_vars_link_node = set_contents.do_set_contents_next( basis_object3, state3 );
                                                        if( NIL != set_contents.do_set_contents_element_validP( state3, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(
                                                            node_vars_link_node, UNPROVIDED ) )
                                                        {
                                                          sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                          deck.deck_push( node_vars_link_node, recur_deck );
                                                        }
                                                      }
                                                    }
                                                    else if( sol3.isList() )
                                                    {
                                                      if( NIL == enoughP )
                                                      {
                                                        csome_list_var_$238 = sol3;
                                                        node_vars_link_node2 = NIL;
                                                        node_vars_link_node2 = csome_list_var_$238.first();
                                                        while ( NIL == enoughP && NIL != csome_list_var_$238)
                                                        {
                                                          if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                                          {
                                                            sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                            deck.deck_push( node_vars_link_node2, recur_deck );
                                                          }
                                                          csome_list_var_$238 = csome_list_var_$238.rest();
                                                          node_vars_link_node2 = csome_list_var_$238.first();
                                                        }
                                                      }
                                                    }
                                                    else
                                                    {
                                                      Errors.error( $str47$_A_is_neither_SET_P_nor_LISTP_, sol3 );
                                                    }
                                                  }
                                                  finally
                                                  {
                                                    sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$232, thread );
                                                  }
                                                }
                                              }
                                              dictionary_contents.do_dictionary_contents_finalize( iteration_state_$228 );
                                            }
                                            finally
                                            {
                                              sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$231, thread );
                                            }
                                          }
                                        }
                                        dictionary_contents.do_dictionary_contents_finalize( iteration_state2 );
                                      }
                                    }
                                    else
                                    {
                                      sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str48$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                    }
                                  }
                                  else if( NIL != obsolete.cnat_p( node2, UNPROVIDED ) )
                                  {
                                    new_list2 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars
                                        .get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                                        : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ),
                                            sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) );
                                    for( rest_$255 = NIL, rest_$255 = new_list2; NIL == enoughP && NIL != rest_$255; rest_$255 = rest_$255.rest() )
                                    {
                                      generating_fn2 = rest_$255.first();
                                      _prev_bind_0_$233 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                      try
                                      {
                                        sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn2, thread );
                                        link_nodes5 = ( sol4 = Functions.funcall( generating_fn2, node2 ) );
                                        if( NIL != set.set_p( sol4 ) )
                                        {
                                          set_contents_var4 = set.do_set_internal( sol4 );
                                          for( basis_object4 = set_contents.do_set_contents_basis_object( set_contents_var4 ), state4 = NIL, state4 = set_contents.do_set_contents_initial_state( basis_object4,
                                              set_contents_var4 ); NIL == enoughP && NIL == set_contents.do_set_contents_doneP( basis_object4, state4 ); state4 = set_contents.do_set_contents_update_state( state4 ) )
                                          {
                                            node_vars_link_node3 = set_contents.do_set_contents_next( basis_object4, state4 );
                                            if( NIL != set_contents.do_set_contents_element_validP( state4, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                                UNPROVIDED ) )
                                            {
                                              sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                              deck.deck_push( node_vars_link_node3, recur_deck );
                                            }
                                          }
                                        }
                                        else if( sol4.isList() )
                                        {
                                          if( NIL == enoughP )
                                          {
                                            csome_list_var_$239 = sol4;
                                            node_vars_link_node4 = NIL;
                                            node_vars_link_node4 = csome_list_var_$239.first();
                                            while ( NIL == enoughP && NIL != csome_list_var_$239)
                                            {
                                              if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                              {
                                                sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                                deck.deck_push( node_vars_link_node4, recur_deck );
                                              }
                                              csome_list_var_$239 = csome_list_var_$239.rest();
                                              node_vars_link_node4 = csome_list_var_$239.first();
                                            }
                                          }
                                        }
                                        else
                                        {
                                          Errors.error( $str47$_A_is_neither_SET_P_nor_LISTP_, sol4 );
                                        }
                                      }
                                      finally
                                      {
                                        sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$233, thread );
                                      }
                                    }
                                  }
                                }
                                finally
                                {
                                  sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$219, thread );
                                  sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$230, thread );
                                }
                              }
                              node_var_$215 = deck.deck_pop( recur_deck );
                            }
                          }
                          finally
                          {
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$223, thread );
                            sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$217, thread );
                            sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$217, thread );
                          }
                        }
                        else
                        {
                          sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str49$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED,
                              UNPROVIDED, UNPROVIDED );
                        }
                      }
                      finally
                      {
                        sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_3, thread );
                        sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$216, thread );
                        sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$216, thread );
                      }
                    }
                    finally
                    {
                      sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$215, thread );
                      sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$215, thread );
                    }
                  }
                  finally
                  {
                    final SubLObject _prev_bind_0_$234 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                    try
                    {
                      Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                      final SubLObject _values7 = Values.getValuesAsVector();
                      sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
                      Values.restoreValuesFromVector( _values7 );
                    }
                    finally
                    {
                      Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$234, thread );
                    }
                  }
                }
                finally
                {
                  sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$214, thread );
                }
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$235 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values8 = Values.getValuesAsVector();
                sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                Values.restoreValuesFromVector( _values8 );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$235, thread );
              }
            }
          }
          finally
          {
            sbhl_marking_vars.$sbhl_gather_space$.rebind( _prev_bind_1_$214, thread );
            sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$213, thread );
          }
          csome_list_var = csome_list_var.rest();
          pred_type = csome_list_var.first();
        }
      }
      final SubLObject gtqs = set.new_set( Symbols.symbol_function( EQL ), UNPROVIDED );
      incompleteP = list_utilities.sublisp_boolean( gtqs_lexifications( fort, gtqs, limit_numberP, max_answers, index_limit ) );
      final SubLObject set_contents_var5 = set.do_set_internal( gtqs );
      SubLObject basis_object5;
      SubLObject state5;
      SubLObject gtqs_as;
      SubLObject item_var7;
      for( basis_object5 = set_contents.do_set_contents_basis_object( set_contents_var5 ), state5 = NIL, state5 = set_contents.do_set_contents_initial_state( basis_object5, set_contents_var5 ); NIL == set_contents
          .do_set_contents_doneP( basis_object5, state5 ); state5 = set_contents.do_set_contents_update_state( state5 ) )
      {
        gtqs_as = set_contents.do_set_contents_next( basis_object5, state5 );
        if( NIL != set_contents.do_set_contents_element_validP( state5, gtqs_as ) )
        {
          item_var7 = gtqs_as;
          if( NIL == conses_high.member( item_var7, ans, $sym52$KBEQ, Symbols.symbol_function( IDENTITY ) ) )
          {
            ans = ConsesLow.cons( item_var7, ans );
          }
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return Values.values( ans, incompleteP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 62347L)
  public static SubLObject cached_lexifications_for_term(final SubLObject fort, SubLObject use_termstringsP, SubLObject max_answers, SubLObject pred_types, SubLObject index_limit)
  {
    if( use_termstringsP == UNPROVIDED )
    {
      use_termstringsP = T;
    }
    if( max_answers == UNPROVIDED )
    {
      max_answers = NIL;
    }
    if( pred_types == UNPROVIDED )
    {
      pred_types = $lexification_pred_types$.getGlobalValue();
    }
    if( index_limit == UNPROVIDED )
    {
      index_limit = NIL;
    }
    SubLObject caching_state = $cached_lexifications_for_term_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym212$CACHED_LEXIFICATIONS_FOR_TERM, $sym214$_CACHED_LEXIFICATIONS_FOR_TERM_CACHING_STATE_, NIL, EQL, FIVE_INTEGER, $int215$1024 );
      memoization_state.register_hl_store_cache_clear_callback( $sym216$CLEAR_CACHED_LEXIFICATIONS_FOR_TERM );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_5( fort, use_termstringsP, max_answers, pred_types, index_limit );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( fort.eql( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( use_termstringsP.eql( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( max_answers.eql( cached_args.first() ) )
            {
              cached_args = cached_args.rest();
              if( pred_types.eql( cached_args.first() ) )
              {
                cached_args = cached_args.rest();
                if( NIL != cached_args && NIL == cached_args.rest() && index_limit.eql( cached_args.first() ) )
                {
                  return memoization_state.caching_results( results2 );
                }
              }
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( cached_lexifications_for_term_internal( fort, use_termstringsP, max_answers, pred_types, index_limit ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( fort, use_termstringsP, max_answers, pred_types, index_limit ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 63967L)
  public static SubLObject gtqs_lexifications(final SubLObject fort, final SubLObject ans, final SubLObject limit_numberP, final SubLObject max_answers, SubLObject index_limit)
  {
    if( index_limit == UNPROVIDED )
    {
      index_limit = NIL;
    }
    SubLObject enoughP = NIL;
    final SubLObject overlapping_terms = ConsesLow.list( fort, $const217$genTemplate_QuerySentence );
    if( NIL == fort_types_interface.predicate_p( fort ) )
    {
      return NIL;
    }
    if( index_limit.isNumber() && virtual_indexing.estimated_num_overlap_index( overlapping_terms, UNPROVIDED ).numG( index_limit ) )
    {
      return $kw218$TOO_MANY_TO_CHECK;
    }
    if( NIL == enoughP )
    {
      SubLObject csome_list_var = virtual_indexing.assertions_mentioning_terms( overlapping_terms, UNPROVIDED );
      SubLObject as = NIL;
      as = csome_list_var.first();
      while ( NIL == enoughP && NIL != csome_list_var)
      {
        if( NIL != kb_utilities.kbeq( cycl_utilities.formula_arg0( as ), $const217$genTemplate_QuerySentence ) && NIL != cycl_utilities.expression_find( fort, as, T, Symbols.symbol_function( $sym52$KBEQ ),
            $sym219$FORMULA_ARG0 ) )
        {
          set.set_add( as, ans );
          if( NIL != limit_numberP && set.set_size( ans ).numGE( max_answers ) )
          {
            enoughP = T;
          }
        }
        csome_list_var = csome_list_var.rest();
        as = csome_list_var.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 64749L)
  public static SubLObject common_term_in_lexificationsP(final SubLObject fort)
  {
    return makeBoolean( NIL != isa.isa_in_any_mtP( fort, $const116$LexicalWord ) || NIL != isa.isa_in_any_mtP( fort, $const220$NLSyntacticPredicate ) || ( NIL != isa.isa_in_any_mtP( fort, $const221$LinguisticObjectType )
        && NIL == isa.isa_in_any_mtP( fort, $const222$CycLExpressionType ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 65088L)
  public static SubLObject lexifications_of_common_lexification_term(final SubLObject fort, SubLObject max_answers)
  {
    if( max_answers == UNPROVIDED )
    {
      max_answers = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    SubLObject enoughP = NIL;
    final SubLObject limit_numberP = max_answers;
    if( NIL == enoughP )
    {
      SubLObject csome_list_var = $lexification_pred_types$.getGlobalValue();
      SubLObject pred_type = NIL;
      pred_type = csome_list_var.first();
      while ( NIL == enoughP && NIL != csome_list_var)
      {
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$relevant_mt_function$.bind( $sym32$RELEVANT_MT_IS_EVERYTHING, thread );
          mt_relevance_macros.$mt$.bind( $const33$EverythingPSC, thread );
          if( NIL == enoughP )
          {
            SubLObject csome_list_var_$278 = isa.all_fort_instances( pred_type, UNPROVIDED, UNPROVIDED );
            SubLObject pred = NIL;
            pred = csome_list_var_$278.first();
            while ( NIL == enoughP && NIL != csome_list_var_$278)
            {
              final SubLObject denot_arg = denotatum_arg_of_pred_cached( pred );
              if( NIL != denot_arg && NIL == enoughP )
              {
                SubLObject csome_list_var_$279 = kb_mapping.gather_gaf_arg_index( fort, denot_arg, pred, UNPROVIDED, UNPROVIDED );
                SubLObject as = NIL;
                as = csome_list_var_$279.first();
                while ( NIL == enoughP && NIL != csome_list_var_$279)
                {
                  final SubLObject item_var = as;
                  if( NIL == conses_high.member( item_var, ans, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
                  {
                    ans = ConsesLow.cons( item_var, ans );
                  }
                  if( NIL != limit_numberP && Sequences.length( ans ).numGE( max_answers ) )
                  {
                    enoughP = T;
                  }
                  csome_list_var_$279 = csome_list_var_$279.rest();
                  as = csome_list_var_$279.first();
                }
              }
              csome_list_var_$278 = csome_list_var_$278.rest();
              pred = csome_list_var_$278.first();
            }
          }
          if( NIL != kb_mapping_macros.do_other_index_key_validator( fort, $kw96$GAF ) )
          {
            final SubLObject final_index_spec = kb_mapping_macros.other_final_index_spec( fort );
            SubLObject final_index_iterator = NIL;
            try
            {
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw96$GAF, $kw223$TRUE, NIL );
              SubLObject done_var = NIL;
              final SubLObject token_var = NIL;
              while ( NIL == done_var)
              {
                final SubLObject as = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var );
                final SubLObject valid = makeBoolean( !token_var.eql( as ) );
                if( NIL != valid && NIL != kb_mapping_macros.do_other_index_assertion_match_p( as ) && NIL != kb_utilities.kbeq( assertions_high.gaf_arg0( as ), $const217$genTemplate_QuerySentence )
                    && NIL != cycl_utilities.expression_find( fort, as, T, Symbols.symbol_function( $sym52$KBEQ ), $sym219$FORMULA_ARG0 ) )
                {
                  final SubLObject item_var2 = as;
                  if( NIL == conses_high.member( item_var2, ans, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
                  {
                    ans = ConsesLow.cons( item_var2, ans );
                  }
                }
                done_var = makeBoolean( NIL == valid );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$280 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                if( NIL != final_index_iterator )
                {
                  kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                }
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$280, thread );
              }
            }
          }
        }
        finally
        {
          mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
        }
        csome_list_var = csome_list_var.rest();
        pred_type = csome_list_var.first();
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 67588L)
  public static SubLObject gen_string_assertions_for_term(final SubLObject v_term, SubLObject mt, SubLObject precise_onlyP)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( precise_onlyP == UNPROVIDED )
    {
      precise_onlyP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == forts.fort_p( v_term ) )
    {
      return NIL;
    }
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym32$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const33$EverythingPSC, thread );
      final SubLObject mt_var = mt;
      final SubLObject _prev_bind_0_$281 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_1_$282 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
        if( NIL == precise_onlyP )
        {
          final SubLObject terse_pred = constants_high.find_constant( $str224$genStringAssertion_Terse );
          if( NIL != constant_handles.valid_constantP( terse_pred, UNPROVIDED ) )
          {
            ans = kb_mapping.gather_gaf_arg_index( v_term, ONE_INTEGER, terse_pred, UNPROVIDED, UNPROVIDED );
          }
          SubLObject cdolist_list_var = kb_mapping.gather_gaf_arg_index( v_term, ONE_INTEGER, $const225$genStringAssertion, UNPROVIDED, UNPROVIDED );
          SubLObject as = NIL;
          as = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            ans = ConsesLow.cons( as, ans );
            cdolist_list_var = cdolist_list_var.rest();
            as = cdolist_list_var.first();
          }
        }
        if( NIL != precise_onlyP || NIL != pph_utilities.pph_top_level_preciseP() )
        {
          SubLObject cdolist_list_var = kb_mapping.gather_gaf_arg_index( v_term, ONE_INTEGER, $const226$genStringAssertion_Precise, UNPROVIDED, UNPROVIDED );
          SubLObject as = NIL;
          as = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            ans = ConsesLow.cons( as, ans );
            cdolist_list_var = cdolist_list_var.rest();
            as = cdolist_list_var.first();
          }
        }
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_1_$282, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0_$281, thread );
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    if( NIL != pph_utilities.pph_terse_mode_p() )
    {
      ans = Sequences.nreverse( ans );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 68809L)
  public static SubLObject preferred_lexifications_for_term(final SubLObject v_term, SubLObject mt, SubLObject precise_onlyP, SubLObject nl_preds)
  {
    if( mt == UNPROVIDED )
    {
      mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    if( precise_onlyP == UNPROVIDED )
    {
      precise_onlyP = NIL;
    }
    if( nl_preds == UNPROVIDED )
    {
      nl_preds = $kw5$ANY;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == forts.fort_p( v_term ) )
    {
      return NIL;
    }
    SubLObject lexification_lists = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym32$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const33$EverythingPSC, thread );
      final SubLObject mt_var = mt;
      final SubLObject _prev_bind_0_$283 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_1_$284 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
        if( NIL == precise_onlyP )
        {
          final SubLObject terse_pred = $const227$genStringAssertion_Terse;
          if( NIL != constant_handles.valid_constantP( terse_pred, UNPROVIDED ) )
          {
            lexification_lists = ConsesLow.cons( Mapping.mapcar( $sym228$LEXIFICATION_SENTENCE_FROM_PREFERRED_LEXIFICATION_ASSERTION, Sort.sort( Mapping.mapcar( $sym229$GAF_ARG2, kb_mapping.gather_gaf_arg_index( v_term,
                ONE_INTEGER, terse_pred, UNPROVIDED, UNPROVIDED ) ), $sym230$PREFER_LEXICAL_ASSERTION_, UNPROVIDED ) ), lexification_lists );
          }
          lexification_lists = ConsesLow.cons( get_preferred_lexifications_via_indexing( v_term, nl_preds ), lexification_lists );
        }
        if( NIL != precise_onlyP || NIL != pph_utilities.pph_top_level_preciseP() )
        {
          final SubLObject assertions = Sort.sort( kb_mapping.gather_gaf_arg_index( v_term, ONE_INTEGER, $const226$genStringAssertion_Precise, UNPROVIDED, UNPROVIDED ), $sym230$PREFER_LEXICAL_ASSERTION_, UNPROVIDED );
          final SubLObject sentences = Mapping.mapcar( $sym228$LEXIFICATION_SENTENCE_FROM_PREFERRED_LEXIFICATION_ASSERTION, assertions );
          lexification_lists = ConsesLow.cons( sentences, lexification_lists );
        }
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_1_$284, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0_$283, thread );
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    if( NIL != pph_utilities.pph_terse_mode_p() )
    {
      lexification_lists = Sequences.nreverse( lexification_lists );
    }
    return list_utilities.delete_if_not( $sym231$ATOMIC_SENTENCE_, Functions.apply( Symbols.symbol_function( $sym232$APPEND ), lexification_lists ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 70367L)
  public static SubLObject get_preferred_lexifications_via_indexing(final SubLObject v_term, final SubLObject nl_preds)
  {
    SubLObject lexification_gafs = NIL;
    SubLObject cdolist_list_var = $list234;
    SubLObject pred = NIL;
    pred = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject constrainedP = kb_utilities.kbeq( pred, $const233$genStringAssertion_Constrained );
      if( NIL != constant_handles.valid_constantP( pred, UNPROVIDED ) )
      {
        SubLObject cdolist_list_var_$285 = kb_mapping.gather_gaf_arg_index( v_term, ONE_INTEGER, pred, UNPROVIDED, UNPROVIDED );
        SubLObject lex = NIL;
        lex = cdolist_list_var_$285.first();
        while ( NIL != cdolist_list_var_$285)
        {
          if( NIL == constrainedP || NIL != term_phrases_constraint_implied_by_nl_predsP( assertions_high.gaf_arg2( lex ), nl_preds ) )
          {
            lexification_gafs = ConsesLow.cons( ( NIL != constrainedP ) ? assertions_high.gaf_arg3( lex ) : assertions_high.gaf_arg2( lex ), lexification_gafs );
          }
          cdolist_list_var_$285 = cdolist_list_var_$285.rest();
          lex = cdolist_list_var_$285.first();
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      pred = cdolist_list_var.first();
    }
    final SubLObject pred_var = $const235$preferredNameString;
    if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, NIL, pred_var ) )
    {
      final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, NIL, pred_var );
      SubLObject done_var = NIL;
      final SubLObject token_var = NIL;
      while ( NIL == done_var)
      {
        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
        final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
        if( NIL != valid )
        {
          SubLObject final_index_iterator = NIL;
          try
          {
            final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw96$GAF, $kw223$TRUE, NIL );
            SubLObject done_var_$286 = NIL;
            final SubLObject token_var_$287 = NIL;
            while ( NIL == done_var_$286)
            {
              final SubLObject gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$287 );
              final SubLObject valid_$288 = makeBoolean( !token_var_$287.eql( gaf ) );
              if( NIL != valid_$288 )
              {
                lexification_gafs = ConsesLow.cons( gaf, lexification_gafs );
              }
              done_var_$286 = makeBoolean( NIL == valid_$288 );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
            try
            {
              Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
              final SubLObject _values = Values.getValuesAsVector();
              if( NIL != final_index_iterator )
              {
                kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
              }
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
            }
          }
        }
        done_var = makeBoolean( NIL == valid );
      }
    }
    return Mapping.mapcar( $sym228$LEXIFICATION_SENTENCE_FROM_PREFERRED_LEXIFICATION_ASSERTION, Sort.stable_sort( lexification_gafs, $sym236$PREFER_LEXIFICATION_, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 71317L)
  public static SubLObject prefer_lexificationP(final SubLObject lex1, final SubLObject lex2)
  {
    return makeBoolean( NIL != assertion_handles.assertion_p( lex1 ) && NIL != assertion_handles.assertion_p( lex2 ) && NIL != lexicon_cache.prefer_lexical_assertionP( lex1, lex2, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 71465L)
  public static SubLObject smart_to_capitalizeP(final SubLObject word)
  {
    if( NIL != Sequences.find( $const24$Verb, lexicon_accessors.pos_of_string( word, UNPROVIDED, UNPROVIDED, UNPROVIDED ), Symbols.symbol_function( $sym237$SPEC_POS_ ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return T;
    }
    if( NIL != Sequences.find( $const238$Pronoun, lexicon_accessors.pos_of_string( word, UNPROVIDED, UNPROVIDED, UNPROVIDED ), Symbols.symbol_function( $sym237$SPEC_POS_ ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return T;
    }
    if( NIL != Sequences.find( $const239$QuantifyingIndexical, lexicon_accessors.pos_of_string( word, UNPROVIDED, UNPROVIDED, UNPROVIDED ), Symbols.symbol_function( $sym237$SPEC_POS_ ), UNPROVIDED, UNPROVIDED,
        UNPROVIDED ) )
    {
      return T;
    }
    if( NIL != lexicon_accessors.non_pronominal_closed_lexical_class_stringP( word, UNPROVIDED ) )
    {
      return NIL;
    }
    if( NIL != Sequences.find( $const240$Complementizer, lexicon_accessors.pos_of_string( word, UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return NIL;
    }
    if( NIL != Sequences.find_if( $sym241$UPPER_CASE_P, word, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return NIL;
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 71961L)
  public static SubLObject term_phrases_constraint_compatible_with_nl_predsP(final SubLObject constraint, final SubLObject nl_preds)
  {
    if( $kw5$ANY.eql( nl_preds ) )
    {
      return T;
    }
    if( NIL != list_utilities.empty_list_p( nl_preds ) )
    {
      return NIL;
    }
    if( NIL != lexicon_accessors.speech_partP( constraint, UNPROVIDED ) )
    {
      return list_utilities.non_empty_list_p( pph_utilities.pph_filter_preds( nl_preds, preds_of_pos( constraint, UNPROVIDED ), UNPROVIDED ) );
    }
    return list_utilities.non_empty_list_p( pph_utilities.pph_filter_preds( nl_preds, ConsesLow.list( constraint ), UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 72339L)
  public static SubLObject term_phrases_constraint_implied_by_nl_predsP(final SubLObject constraint, final SubLObject nl_preds)
  {
    if( $kw5$ANY.eql( nl_preds ) )
    {
      return NIL;
    }
    if( NIL != list_utilities.empty_list_p( nl_preds ) )
    {
      return NIL;
    }
    if( NIL != lexicon_accessors.speech_partP( constraint, UNPROVIDED ) )
    {
      return Equality.equal( nl_preds, pph_utilities.pph_filter_preds( nl_preds, preds_of_pos( constraint, UNPROVIDED ), UNPROVIDED ) );
    }
    return Equality.equal( nl_preds, pph_utilities.pph_filter_preds( nl_preds, ConsesLow.list( constraint ), UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 72710L)
  public static SubLObject lexification_sentence_from_preferred_lexification_assertion(final SubLObject assertion)
  {
    if( NIL != assertions_high.gaf_assertionP( assertion ) && NIL != kb_utilities.kbeq( assertions_high.gaf_arg0( assertion ), $const235$preferredNameString ) )
    {
      return el_utilities.make_el_formula( $const242$nameString, assertions_high.gaf_args( assertion ), UNPROVIDED );
    }
    if( NIL != el_utilities.ist_sentence_p( assertion, UNPROVIDED ) )
    {
      return cycl_utilities.formula_arg2( assertion, UNPROVIDED );
    }
    return cycl_utilities.hl_to_el( assertion );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 73073L)
  public static SubLObject loose_lexifications_for_term(final SubLObject fort)
  {
    final SubLObject lex_assertions = all_lexifications_for_term( fort );
    SubLObject ans = NIL;
    if( NIL != lex_assertions )
    {
      SubLObject cdolist_list_var = lex_assertions;
      SubLObject as = NIL;
      as = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != subl_promotions.memberP( assertions_high.assertion_formula( as ).first(), isa.all_fort_instances( $const199$ProperNamePredicate_Loose, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED ) )
        {
          ans = ConsesLow.cons( as, ans );
        }
        cdolist_list_var = cdolist_list_var.rest();
        as = cdolist_list_var.first();
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 73474L)
  public static SubLObject stub_lexifications_for_term(final SubLObject fort)
  {
    final SubLObject lex_assertions = all_lexifications_for_term( fort );
    SubLObject ans = NIL;
    if( NIL != lex_assertions )
    {
      SubLObject cdolist_list_var = lex_assertions;
      SubLObject as = NIL;
      as = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != subl_promotions.memberP( assertions_high.assertion_formula( as ).first(), isa.all_fort_instances( $const243$ProperNamePredicate_Stub, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED ) )
        {
          ans = ConsesLow.cons( as, ans );
        }
        cdolist_list_var = cdolist_list_var.rest();
        as = cdolist_list_var.first();
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 73872L)
  public static SubLObject first_termstring_phrase(final SubLObject v_term)
  {
    final SubLObject termstring_assertion = loose_lexifications_for_term( v_term ).first();
    SubLObject phrase = NIL;
    if( NIL != assertions_high.gaf_assertionP( termstring_assertion ) )
    {
      phrase = assertions_high.gaf_arg2( termstring_assertion );
    }
    return phrase;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 74296L)
  public static SubLObject denotation_lexifications_for_term(final SubLObject fort, SubLObject use_termstringsP)
  {
    if( use_termstringsP == UNPROVIDED )
    {
      use_termstringsP = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject preds = NIL;
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym32$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const33$EverythingPSC, thread );
      preds = Sequences.remove_duplicates( Mapping.mapcar( Symbols.symbol_function( $sym244$GAF_ARG1 ), kb_mapping.gather_predicate_extent_index( $const99$denotatumArg, UNPROVIDED, UNPROVIDED ) ), UNPROVIDED, UNPROVIDED,
          UNPROVIDED, UNPROVIDED );
      if( NIL == use_termstringsP )
      {
        preds = conses_high.set_difference( preds, isa.all_fort_instances( $const199$ProperNamePredicate_Loose, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
      }
      SubLObject cdolist_list_var = preds;
      SubLObject pred = NIL;
      pred = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject arg = denotatum_arg_of_pred_cached( pred );
        if( NIL != kb_mapping_utilities.pred_values( fort, pred, arg, UNPROVIDED, UNPROVIDED ) )
        {
          ans = ConsesLow.append( ans, kb_mapping.gather_gaf_arg_index( fort, arg, pred, UNPROVIDED, UNPROVIDED ) );
        }
        cdolist_list_var = cdolist_list_var.rest();
        pred = cdolist_list_var.first();
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 74909L)
  public static SubLObject semtrans_lexifications_for_term(final SubLObject fort)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject preds = NIL;
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym32$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const33$EverythingPSC, thread );
      SubLObject cdolist_list_var;
      preds = ( cdolist_list_var = Mapping.mapcar( Symbols.symbol_function( $sym244$GAF_ARG1 ), kb_mapping.gather_predicate_extent_index( $const102$semTransArg, UNPROVIDED, UNPROVIDED ) ) );
      SubLObject pred = NIL;
      pred = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cdolist_list_var_$289;
        final SubLObject ass = cdolist_list_var_$289 = virtual_indexing.assertions_mentioning_terms( ConsesLow.list( fort, pred ), T );
        SubLObject as = NIL;
        as = cdolist_list_var_$289.first();
        while ( NIL != cdolist_list_var_$289)
        {
          if( NIL != kb_utilities.kbeq( cycl_utilities.formula_operator( assertions_high.assertion_formula( as ) ), pred ) )
          {
            ans = ConsesLow.cons( as, ans );
          }
          cdolist_list_var_$289 = cdolist_list_var_$289.rest();
          as = cdolist_list_var_$289.first();
        }
        cdolist_list_var = cdolist_list_var.rest();
        pred = cdolist_list_var.first();
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return Sequences.remove_duplicates( ans, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 75353L)
  public static SubLObject units_with_no_nl(final SubLObject fort, SubLObject use_termstringsP)
  {
    if( use_termstringsP == UNPROVIDED )
    {
      use_termstringsP = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_forts = NIL;
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym32$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const33$EverythingPSC, thread );
      v_forts = conses_high.union( genls.all_specs( fort, UNPROVIDED, UNPROVIDED ), isa.all_fort_instances( fort, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    SubLObject cdolist_list_var = v_forts;
    SubLObject item = NIL;
    item = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != unit_with_no_nlP( item, use_termstringsP ) && NIL == isa.quoted_isaP( item, $const245$TheTerm, UNPROVIDED, UNPROVIDED ) && NIL == isa.quoted_isaP( item, $const246$StubTerm, $const247$CycNounLearnerMt,
          UNPROVIDED ) && NIL == isa.quoted_isaP( item, $const248$TestingConstant, UNPROVIDED, UNPROVIDED ) )
      {
        ans = ConsesLow.cons( item, ans );
      }
      cdolist_list_var = cdolist_list_var.rest();
      item = cdolist_list_var.first();
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 75815L)
  public static SubLObject verbs_need_st()
  {
    SubLObject verbs = NIL;
    SubLObject ans = NIL;
    SubLObject cdolist_list_var;
    verbs = ( cdolist_list_var = kb_mapping_utilities.pred_values_in_mt( $const24$Verb, $const14$denotation, $const9$GeneralEnglishMt, TWO_INTEGER, ONE_INTEGER, UNPROVIDED ) );
    SubLObject verb = NIL;
    verb = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == kb_mapping_utilities.pred_values_in_mt( verb, $const249$verbSemTrans, $const9$GeneralEnglishMt, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        final SubLObject item_var = verb;
        if( NIL == conses_high.member( item_var, ans, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          ans = ConsesLow.cons( item_var, ans );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      verb = cdolist_list_var.first();
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 76087L)
  public static SubLObject verbs_need_sf()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject count = ZERO_INTEGER;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym32$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const33$EverythingPSC, thread );
      final SubLObject pred_var = $const14$denotation;
      if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( $const24$Verb, TWO_INTEGER, pred_var ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( $const24$Verb, TWO_INTEGER, pred_var );
        SubLObject done_var = NIL;
        final SubLObject token_var = NIL;
        while ( NIL == done_var)
        {
          final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
          final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
          if( NIL != valid )
          {
            SubLObject final_index_iterator = NIL;
            try
            {
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw96$GAF, NIL, NIL );
              SubLObject done_var_$290 = NIL;
              final SubLObject token_var_$291 = NIL;
              while ( NIL == done_var_$290)
              {
                final SubLObject as = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$291 );
                final SubLObject valid_$292 = makeBoolean( !token_var_$291.eql( as ) );
                if( NIL != valid_$292 )
                {
                  final SubLObject wu = assertions_high.gaf_arg1( as );
                  final SubLObject sense = assertions_high.gaf_arg3( as );
                  final SubLObject triples = kb_mapping_utilities.pred_value_tuples_in_any_mt( wu, $const15$subcatFrame, ONE_INTEGER, $list250, UNPROVIDED );
                  SubLObject found_somethingP = NIL;
                  if( NIL == found_somethingP )
                  {
                    SubLObject csome_list_var = triples;
                    SubLObject triple = NIL;
                    triple = csome_list_var.first();
                    while ( NIL == found_somethingP && NIL != csome_list_var)
                    {
                      if( NIL != kb_utilities.kbeq( conses_high.second( triple ), sense ) && NIL != kb_utilities.kbeq( triple.first(), $const24$Verb ) )
                      {
                        found_somethingP = T;
                      }
                      csome_list_var = csome_list_var.rest();
                      triple = csome_list_var.first();
                    }
                  }
                  if( NIL == found_somethingP )
                  {
                    count = Numbers.add( count, ONE_INTEGER );
                    PrintLow.format( T, $str251$___S_in__S__, assertions_high.assertion_formula( as ), assertions_high.assertion_mt( as ) );
                  }
                }
                done_var_$290 = makeBoolean( NIL == valid_$292 );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$293 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                if( NIL != final_index_iterator )
                {
                  kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                }
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$293, thread );
              }
            }
          }
          done_var = makeBoolean( NIL == valid );
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 76740L)
  public static SubLObject which_words_will_my_rule_affectP(final SubLObject denot, SubLObject pos)
  {
    if( pos == UNPROVIDED )
    {
      pos = $const24$Verb;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject specs = NIL;
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym32$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const33$EverythingPSC, thread );
      specs = genls.all_specs( denot, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    SubLObject cdolist_list_var = specs;
    SubLObject spec = NIL;
    spec = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$294;
      final SubLObject assns = cdolist_list_var_$294 = kb_mapping.gather_gaf_arg_index( spec, FOUR_INTEGER, $const14$denotation, $const9$GeneralEnglishMt, UNPROVIDED );
      SubLObject assn = NIL;
      assn = cdolist_list_var_$294.first();
      while ( NIL != cdolist_list_var_$294)
      {
        if( NIL != kb_utilities.kbeq( assertions_high.gaf_arg2( assn ), pos ) )
        {
          ans = ConsesLow.cons( assertions_high.gaf_arg1( assn ), ans );
        }
        cdolist_list_var_$294 = cdolist_list_var_$294.rest();
        assn = cdolist_list_var_$294.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      spec = cdolist_list_var.first();
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 77118L)
  public static SubLObject find_missing_lexicon_strings(final SubLObject pos)
  {
    final SubLObject words = kb_mapping_utilities.pred_values_in_mt( pos, $const14$denotation, $const9$GeneralEnglishMt, TWO_INTEGER, ONE_INTEGER, UNPROVIDED );
    SubLObject ans = NIL;
    SubLObject cdolist_list_var = words;
    SubLObject word = NIL;
    word = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject pos_assertion = kb_mapping.gather_gaf_arg_index( word, ONE_INTEGER, $const252$posForms, $const9$GeneralEnglishMt, UNPROVIDED );
      if( NIL == pos_assertion )
      {
        final SubLObject item_var = word;
        if( NIL == conses_high.member( item_var, ans, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          ans = ConsesLow.cons( item_var, ans );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      word = cdolist_list_var.first();
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 78931L)
  public static SubLObject find_missing_pos_forms(final SubLObject filename, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const9$GeneralEnglishMt;
    }
    if( NIL != filename )
    {
      SubLObject stream = NIL;
      try
      {
        stream = compatibility.open_text( filename, $kw253$APPEND );
        if( !stream.isStream() )
        {
          Errors.error( $str176$Unable_to_open__S, filename );
        }
        final SubLObject stream_$295 = stream;
        SubLObject cdolist_list_var = $list259;
        SubLObject pos = NIL;
        pos = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject words = ConsesLow.append( kb_mapping_utilities.pred_values_in_mt( pos, $const14$denotation, mt, TWO_INTEGER, ONE_INTEGER, UNPROVIDED ), kb_mapping_utilities.pred_values_in_mt( pos,
              $const254$multiWordString, mt, THREE_INTEGER, TWO_INTEGER, UNPROVIDED ), kb_mapping_utilities.pred_values_in_mt( pos, $const255$compoundString, mt, THREE_INTEGER, ONE_INTEGER, UNPROVIDED ) );
          SubLObject cdolist_list_var_$296 = Sequences.remove_duplicates( words, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          SubLObject word = NIL;
          word = cdolist_list_var_$296.first();
          while ( NIL != cdolist_list_var_$296)
          {
            if( NIL == kb_mapping_utilities.pred_u_v_holds_in_mt( $const252$posForms, word, pos, $const9$GeneralEnglishMt, UNPROVIDED, UNPROVIDED, UNPROVIDED ) && ( NIL != kb_utilities.kbeq( mt,
                $const9$GeneralEnglishMt ) || NIL == kb_mapping_utilities.pred_u_v_holds_in_mt( $const252$posForms, word, pos, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) )
            {
              PrintLow.format( stream_$295, $str256$____a_has__a_denotations_in__a, new SubLObject[] { word, pos, mt
              } );
              streams_high.terpri( stream_$295 );
              print_high.princ( $str257$___without_appropriate___posForms, stream_$295 );
              streams_high.terpri( stream_$295 );
              streams_high.terpri( stream_$295 );
              final SubLObject pred = preds_of_pos( pos, UNPROVIDED ).first();
              final SubLObject form = Strings.string_downcase( string_utilities.split_string( kb_paths.fort_name( word ), $str184$_ ).first(), UNPROVIDED, UNPROVIDED );
              final SubLObject assertion_mt = ( NIL != kb_mapping_utilities.some_pred_value_in_mt( word, $const252$posForms, mt, UNPROVIDED, UNPROVIDED ) ) ? mt : $const9$GeneralEnglishMt;
              PrintLow.format( stream_$295, $str258$_ke_assert____a__a___a____a__DEFA, new SubLObject[] { pred, word, form, assertion_mt
              } );
              streams_high.terpri( stream_$295 );
              streams_high.terpri( stream_$295 );
            }
            cdolist_list_var_$296 = cdolist_list_var_$296.rest();
            word = cdolist_list_var_$296.first();
          }
          cdolist_list_var = cdolist_list_var.rest();
          pos = cdolist_list_var.first();
        }
      }
      finally
      {
        final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
        try
        {
          Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
          final SubLObject _values = Values.getValuesAsVector();
          if( stream.isStream() )
          {
            streams_high.close( stream, UNPROVIDED );
          }
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 80268L)
  public static SubLObject find_equalp_names()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    final SubLObject message = $str200$mapping_Cyc_FORTs;
    final SubLObject total = forts.fort_count();
    SubLObject sofar = ZERO_INTEGER;
    final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( message );
        SubLObject cdolist_list_var = forts.do_forts_tables();
        SubLObject table_var = NIL;
        table_var = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject idx = table_var;
          if( NIL == id_index.id_index_objects_empty_p( idx, $kw201$SKIP ) )
          {
            final SubLObject idx_$297 = idx;
            if( NIL == id_index.id_index_dense_objects_empty_p( idx_$297, $kw201$SKIP ) )
            {
              final SubLObject vector_var = id_index.id_index_dense_objects( idx_$297 );
              final SubLObject backwardP_var = NIL;
              SubLObject length;
              SubLObject v_iteration;
              SubLObject id;
              SubLObject fort;
              SubLObject _prev_bind_0_$298;
              SubLObject _prev_bind_1_$299;
              SubLObject as_list;
              SubLObject cdolist_list_var_$300;
              SubLObject as;
              SubLObject string;
              SubLObject cdolist_list_var_$301;
              SubLObject comp_as;
              SubLObject comp_string;
              for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
              {
                id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
                fort = Vectors.aref( vector_var, id );
                if( NIL == id_index.id_index_tombstone_p( fort ) || NIL == id_index.id_index_skip_tombstones_p( $kw201$SKIP ) )
                {
                  if( NIL != id_index.id_index_tombstone_p( fort ) )
                  {
                    fort = $kw201$SKIP;
                  }
                  sofar = Numbers.add( sofar, ONE_INTEGER );
                  utilities_macros.note_percent_progress( sofar, total );
                  _prev_bind_0_$298 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
                  _prev_bind_1_$299 = mt_relevance_macros.$mt$.currentBinding( thread );
                  try
                  {
                    mt_relevance_macros.$relevant_mt_function$.bind( $sym32$RELEVANT_MT_IS_EVERYTHING, thread );
                    mt_relevance_macros.$mt$.bind( $const33$EverythingPSC, thread );
                    as_list = kb_accessors.term_gafs_wrt_pred_type( fort, $const260$StringIndexingSlot, UNPROVIDED, UNPROVIDED );
                    if( Sequences.length( as_list ).numG( ONE_INTEGER ) )
                    {
                      cdolist_list_var_$300 = as_list;
                      as = NIL;
                      as = cdolist_list_var_$300.first();
                      while ( NIL != cdolist_list_var_$300)
                      {
                        string = assertions_high.gaf_arg2( as );
                        cdolist_list_var_$301 = Sequences.remove( as, as_list, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                        comp_as = NIL;
                        comp_as = cdolist_list_var_$301.first();
                        while ( NIL != cdolist_list_var_$301)
                        {
                          comp_string = assertions_high.gaf_arg2( comp_as );
                          if( string.isString() && comp_string.isString() && string.equalp( comp_string ) && NIL != Strings.stringL( string, comp_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
                          {
                            PrintLow.format( T, $str251$___S_in__S__, assertions_high.assertion_formula( as ), assertions_high.assertion_mt( as ) );
                            PrintLow.format( T, $str261$___S_in__S____, assertions_high.assertion_formula( comp_as ), assertions_high.assertion_mt( comp_as ) );
                            ans = ConsesLow.cons( ConsesLow.list( as, comp_as ), ans );
                          }
                          cdolist_list_var_$301 = cdolist_list_var_$301.rest();
                          comp_as = cdolist_list_var_$301.first();
                        }
                        cdolist_list_var_$300 = cdolist_list_var_$300.rest();
                        as = cdolist_list_var_$300.first();
                      }
                    }
                  }
                  finally
                  {
                    mt_relevance_macros.$mt$.rebind( _prev_bind_1_$299, thread );
                    mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$298, thread );
                  }
                }
              }
            }
            final SubLObject idx_$298 = idx;
            if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$298 ) || NIL == id_index.id_index_skip_tombstones_p( $kw201$SKIP ) )
            {
              final SubLObject sparse = id_index.id_index_sparse_objects( idx_$298 );
              SubLObject id2 = id_index.id_index_sparse_id_threshold( idx_$298 );
              final SubLObject end_id = id_index.id_index_next_id( idx_$298 );
              final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw201$SKIP ) ) ? NIL : $kw201$SKIP;
              while ( id2.numL( end_id ))
              {
                final SubLObject fort2 = Hashtables.gethash_without_values( id2, sparse, v_default );
                if( NIL == id_index.id_index_skip_tombstones_p( $kw201$SKIP ) || NIL == id_index.id_index_tombstone_p( fort2 ) )
                {
                  sofar = Numbers.add( sofar, ONE_INTEGER );
                  utilities_macros.note_percent_progress( sofar, total );
                  final SubLObject _prev_bind_0_$299 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
                  final SubLObject _prev_bind_1_$300 = mt_relevance_macros.$mt$.currentBinding( thread );
                  try
                  {
                    mt_relevance_macros.$relevant_mt_function$.bind( $sym32$RELEVANT_MT_IS_EVERYTHING, thread );
                    mt_relevance_macros.$mt$.bind( $const33$EverythingPSC, thread );
                    final SubLObject as_list2 = kb_accessors.term_gafs_wrt_pred_type( fort2, $const260$StringIndexingSlot, UNPROVIDED, UNPROVIDED );
                    if( Sequences.length( as_list2 ).numG( ONE_INTEGER ) )
                    {
                      SubLObject cdolist_list_var_$302 = as_list2;
                      SubLObject as2 = NIL;
                      as2 = cdolist_list_var_$302.first();
                      while ( NIL != cdolist_list_var_$302)
                      {
                        final SubLObject string2 = assertions_high.gaf_arg2( as2 );
                        SubLObject cdolist_list_var_$303 = Sequences.remove( as2, as_list2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                        SubLObject comp_as2 = NIL;
                        comp_as2 = cdolist_list_var_$303.first();
                        while ( NIL != cdolist_list_var_$303)
                        {
                          final SubLObject comp_string2 = assertions_high.gaf_arg2( comp_as2 );
                          if( string2.isString() && comp_string2.isString() && string2.equalp( comp_string2 ) && NIL != Strings.stringL( string2, comp_string2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
                          {
                            PrintLow.format( T, $str251$___S_in__S__, assertions_high.assertion_formula( as2 ), assertions_high.assertion_mt( as2 ) );
                            PrintLow.format( T, $str261$___S_in__S____, assertions_high.assertion_formula( comp_as2 ), assertions_high.assertion_mt( comp_as2 ) );
                            ans = ConsesLow.cons( ConsesLow.list( as2, comp_as2 ), ans );
                          }
                          cdolist_list_var_$303 = cdolist_list_var_$303.rest();
                          comp_as2 = cdolist_list_var_$303.first();
                        }
                        cdolist_list_var_$302 = cdolist_list_var_$302.rest();
                        as2 = cdolist_list_var_$302.first();
                      }
                    }
                  }
                  finally
                  {
                    mt_relevance_macros.$mt$.rebind( _prev_bind_1_$300, thread );
                    mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$299, thread );
                  }
                }
                id2 = Numbers.add( id2, ONE_INTEGER );
              }
            }
          }
          cdolist_list_var = cdolist_list_var.rest();
          table_var = cdolist_list_var.first();
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$300 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$300, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 81044L)
  public static SubLObject find_control_chars_in_names()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    final SubLObject message = $str200$mapping_Cyc_FORTs;
    final SubLObject total = forts.fort_count();
    SubLObject sofar = ZERO_INTEGER;
    final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( message );
        SubLObject cdolist_list_var = forts.do_forts_tables();
        SubLObject table_var = NIL;
        table_var = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject idx = table_var;
          if( NIL == id_index.id_index_objects_empty_p( idx, $kw201$SKIP ) )
          {
            final SubLObject idx_$308 = idx;
            if( NIL == id_index.id_index_dense_objects_empty_p( idx_$308, $kw201$SKIP ) )
            {
              final SubLObject vector_var = id_index.id_index_dense_objects( idx_$308 );
              final SubLObject backwardP_var = NIL;
              SubLObject length;
              SubLObject v_iteration;
              SubLObject id;
              SubLObject fort;
              SubLObject _prev_bind_0_$309;
              SubLObject _prev_bind_1_$310;
              SubLObject cdolist_list_var_$311;
              SubLObject as_list;
              SubLObject as;
              SubLObject string;
              for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
              {
                id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
                fort = Vectors.aref( vector_var, id );
                if( NIL == id_index.id_index_tombstone_p( fort ) || NIL == id_index.id_index_skip_tombstones_p( $kw201$SKIP ) )
                {
                  if( NIL != id_index.id_index_tombstone_p( fort ) )
                  {
                    fort = $kw201$SKIP;
                  }
                  sofar = Numbers.add( sofar, ONE_INTEGER );
                  utilities_macros.note_percent_progress( sofar, total );
                  _prev_bind_0_$309 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
                  _prev_bind_1_$310 = mt_relevance_macros.$mt$.currentBinding( thread );
                  try
                  {
                    mt_relevance_macros.$relevant_mt_function$.bind( $sym32$RELEVANT_MT_IS_EVERYTHING, thread );
                    mt_relevance_macros.$mt$.bind( $const33$EverythingPSC, thread );
                    as_list = ( cdolist_list_var_$311 = kb_accessors.term_gafs_wrt_pred_type( fort, $const260$StringIndexingSlot, UNPROVIDED, UNPROVIDED ) );
                    as = NIL;
                    as = cdolist_list_var_$311.first();
                    while ( NIL != cdolist_list_var_$311)
                    {
                      string = assertions_high.gaf_arg2( as );
                      if( string.isString() && NIL != Sequences.find_if( Symbols.symbol_function( $sym262$CONTROL_CHAR_P ), string, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
                      {
                        ans = ConsesLow.cons( as, ans );
                        PrintLow.format( T, $str263$___S__, assertions_high.assertion_formula( as ) );
                      }
                      cdolist_list_var_$311 = cdolist_list_var_$311.rest();
                      as = cdolist_list_var_$311.first();
                    }
                  }
                  finally
                  {
                    mt_relevance_macros.$mt$.rebind( _prev_bind_1_$310, thread );
                    mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$309, thread );
                  }
                }
              }
            }
            final SubLObject idx_$309 = idx;
            if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$309 ) || NIL == id_index.id_index_skip_tombstones_p( $kw201$SKIP ) )
            {
              final SubLObject sparse = id_index.id_index_sparse_objects( idx_$309 );
              SubLObject id2 = id_index.id_index_sparse_id_threshold( idx_$309 );
              final SubLObject end_id = id_index.id_index_next_id( idx_$309 );
              final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw201$SKIP ) ) ? NIL : $kw201$SKIP;
              while ( id2.numL( end_id ))
              {
                final SubLObject fort2 = Hashtables.gethash_without_values( id2, sparse, v_default );
                if( NIL == id_index.id_index_skip_tombstones_p( $kw201$SKIP ) || NIL == id_index.id_index_tombstone_p( fort2 ) )
                {
                  sofar = Numbers.add( sofar, ONE_INTEGER );
                  utilities_macros.note_percent_progress( sofar, total );
                  final SubLObject _prev_bind_0_$310 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
                  final SubLObject _prev_bind_1_$311 = mt_relevance_macros.$mt$.currentBinding( thread );
                  try
                  {
                    mt_relevance_macros.$relevant_mt_function$.bind( $sym32$RELEVANT_MT_IS_EVERYTHING, thread );
                    mt_relevance_macros.$mt$.bind( $const33$EverythingPSC, thread );
                    SubLObject cdolist_list_var_$312;
                    final SubLObject as_list2 = cdolist_list_var_$312 = kb_accessors.term_gafs_wrt_pred_type( fort2, $const260$StringIndexingSlot, UNPROVIDED, UNPROVIDED );
                    SubLObject as2 = NIL;
                    as2 = cdolist_list_var_$312.first();
                    while ( NIL != cdolist_list_var_$312)
                    {
                      final SubLObject string2 = assertions_high.gaf_arg2( as2 );
                      if( string2.isString() && NIL != Sequences.find_if( Symbols.symbol_function( $sym262$CONTROL_CHAR_P ), string2, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
                      {
                        ans = ConsesLow.cons( as2, ans );
                        PrintLow.format( T, $str263$___S__, assertions_high.assertion_formula( as2 ) );
                      }
                      cdolist_list_var_$312 = cdolist_list_var_$312.rest();
                      as2 = cdolist_list_var_$312.first();
                    }
                  }
                  finally
                  {
                    mt_relevance_macros.$mt$.rebind( _prev_bind_1_$311, thread );
                    mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$310, thread );
                  }
                }
                id2 = Numbers.add( id2, ONE_INTEGER );
              }
            }
          }
          cdolist_list_var = cdolist_list_var.rest();
          table_var = cdolist_list_var.first();
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$311 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$311, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 81496L)
  public static SubLObject show_terms_missing_generation_assertions(SubLObject stream, SubLObject skip_generic_forts)
  {
    if( stream == UNPROVIDED )
    {
      stream = T;
    }
    if( skip_generic_forts == UNPROVIDED )
    {
      skip_generic_forts = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    PrintLow.format( stream, $str264$__fort_type__lex_asserts__ );
    final SubLObject message = $str200$mapping_Cyc_FORTs;
    final SubLObject total = forts.fort_count();
    SubLObject sofar = ZERO_INTEGER;
    final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( message );
        SubLObject cdolist_list_var = forts.do_forts_tables();
        SubLObject table_var = NIL;
        table_var = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject idx = table_var;
          if( NIL == id_index.id_index_objects_empty_p( idx, $kw201$SKIP ) )
          {
            final SubLObject idx_$317 = idx;
            if( NIL == id_index.id_index_dense_objects_empty_p( idx_$317, $kw201$SKIP ) )
            {
              final SubLObject vector_var = id_index.id_index_dense_objects( idx_$317 );
              final SubLObject backwardP_var = NIL;
              SubLObject length;
              SubLObject v_iteration;
              SubLObject id;
              SubLObject v_term;
              for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
              {
                id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
                v_term = Vectors.aref( vector_var, id );
                if( NIL == id_index.id_index_tombstone_p( v_term ) || NIL == id_index.id_index_skip_tombstones_p( $kw201$SKIP ) )
                {
                  if( NIL != id_index.id_index_tombstone_p( v_term ) )
                  {
                    v_term = $kw201$SKIP;
                  }
                  sofar = Numbers.add( sofar, ONE_INTEGER );
                  utilities_macros.note_percent_progress( sofar, total );
                  if( ( NIL == skip_generic_forts || NIL == fort_types_interface.genericP( v_term ) ) && NIL != missing_generation_assertion( v_term ) )
                  {
                    PrintLow.format( stream, $str265$_s__s__s__, new SubLObject[] { v_term, fort_types_interface.definitional_fort_type( v_term, UNPROVIDED ), Sequences.length( all_lexifications_for_term( v_term ) )
                    } );
                  }
                }
              }
            }
            final SubLObject idx_$318 = idx;
            if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$318 ) || NIL == id_index.id_index_skip_tombstones_p( $kw201$SKIP ) )
            {
              final SubLObject sparse = id_index.id_index_sparse_objects( idx_$318 );
              SubLObject id2 = id_index.id_index_sparse_id_threshold( idx_$318 );
              final SubLObject end_id = id_index.id_index_next_id( idx_$318 );
              final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw201$SKIP ) ) ? NIL : $kw201$SKIP;
              while ( id2.numL( end_id ))
              {
                final SubLObject v_term2 = Hashtables.gethash_without_values( id2, sparse, v_default );
                if( NIL == id_index.id_index_skip_tombstones_p( $kw201$SKIP ) || NIL == id_index.id_index_tombstone_p( v_term2 ) )
                {
                  sofar = Numbers.add( sofar, ONE_INTEGER );
                  utilities_macros.note_percent_progress( sofar, total );
                  if( ( NIL == skip_generic_forts || NIL == fort_types_interface.genericP( v_term2 ) ) && NIL != missing_generation_assertion( v_term2 ) )
                  {
                    PrintLow.format( stream, $str265$_s__s__s__, new SubLObject[] { v_term2, fort_types_interface.definitional_fort_type( v_term2, UNPROVIDED ), Sequences.length( all_lexifications_for_term( v_term2 ) )
                    } );
                  }
                }
                id2 = Numbers.add( id2, ONE_INTEGER );
              }
            }
          }
          cdolist_list_var = cdolist_list_var.rest();
          table_var = cdolist_list_var.first();
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$319 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$319, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 82571L)
  public static SubLObject missing_generation_assertion(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject foundP = NIL;
    final SubLObject node_var = $const266$NLGenerationPredicate;
    final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
    final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding( thread );
    try
    {
      sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const195$isa ), thread );
      sbhl_marking_vars.$sbhl_gather_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
      try
      {
        if( NIL == foundP )
        {
          SubLObject node_var_$320 = node_var;
          final SubLObject deck_type = $kw35$STACK;
          final SubLObject recur_deck = deck.create_deck( deck_type );
          final SubLObject _prev_bind_0_$321 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
          try
          {
            sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
            try
            {
              final SubLObject mt_var = pph_vars.$pph_language_mt$.getDynamicValue( thread );
              final SubLObject _prev_bind_0_$322 = mt_relevance_macros.$mt$.currentBinding( thread );
              final SubLObject _prev_bind_1_$323 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
              final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
              try
              {
                mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
                mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
                mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
                final SubLObject tv_var = $const267$True_JustificationTruth;
                final SubLObject _prev_bind_0_$323 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
                final SubLObject _prev_bind_1_$324 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
                try
                {
                  sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
                  sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym37$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
                  if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
                  {
                    final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
                    if( pcase_var.eql( $kw38$ERROR ) )
                    {
                      sbhl_paranoia.sbhl_error( ONE_INTEGER, $str39$_A_is_not_a__A, tv_var, $sym40$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                    }
                    else if( pcase_var.eql( $kw41$CERROR ) )
                    {
                      sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str42$continue_anyway, $str39$_A_is_not_a__A, tv_var, $sym40$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                    }
                    else if( pcase_var.eql( $kw43$WARN ) )
                    {
                      Errors.warn( $str39$_A_is_not_a__A, tv_var, $sym40$SBHL_TRUE_TV_P );
                    }
                    else
                    {
                      Errors.warn( $str44$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                      Errors.cerror( $str42$continue_anyway, $str39$_A_is_not_a__A, tv_var, $sym40$SBHL_TRUE_TV_P );
                    }
                  }
                  final SubLObject _prev_bind_0_$324 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
                  final SubLObject _prev_bind_1_$325 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
                  final SubLObject _prev_bind_2_$328 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
                  final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                  final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                  try
                  {
                    sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const195$isa ) ), thread );
                    sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module(
                        $const195$isa ) ) ), thread );
                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module(
                        $const195$isa ) ) ), thread );
                    sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                    sbhl_module_vars.$sbhl_module$.bind( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const195$isa ) ), thread );
                    if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( node_var, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                    {
                      final SubLObject _prev_bind_0_$325 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                      final SubLObject _prev_bind_1_$326 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                      final SubLObject _prev_bind_2_$329 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                      try
                      {
                        sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_backward_search_direction(), thread );
                        sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities
                            .get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const195$isa ) ) ), thread );
                        sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                        sbhl_marking_utilities.sbhl_mark_node_marked( node_var_$320, UNPROVIDED );
                        while ( NIL != node_var_$320 && NIL == foundP)
                        {
                          final SubLObject tt_node_var = node_var_$320;
                          final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const195$isa ) );
                          SubLObject rest;
                          SubLObject module_var;
                          SubLObject _prev_bind_0_$326;
                          SubLObject _prev_bind_1_$327;
                          SubLObject node;
                          SubLObject d_link;
                          SubLObject mt_links;
                          SubLObject iteration_state;
                          SubLObject mt;
                          SubLObject tv_links;
                          SubLObject _prev_bind_0_$327;
                          SubLObject iteration_state_$335;
                          SubLObject tv;
                          SubLObject link_nodes;
                          SubLObject _prev_bind_0_$328;
                          SubLObject sol;
                          SubLObject set_contents_var;
                          SubLObject basis_object;
                          SubLObject state;
                          SubLObject genpred;
                          SubLObject csome_list_var;
                          SubLObject genpred2;
                          SubLObject csome_list_var2;
                          SubLObject instance_tuple;
                          SubLObject current;
                          SubLObject datum;
                          SubLObject link_node;
                          SubLObject mt2;
                          SubLObject tv2;
                          SubLObject _prev_bind_0_$329;
                          SubLObject _prev_bind_0_$330;
                          SubLObject link_nodes2;
                          SubLObject csome_list_var_$339;
                          SubLObject new_list;
                          SubLObject rest_$340;
                          SubLObject generating_fn;
                          SubLObject _prev_bind_0_$331;
                          SubLObject sol2;
                          SubLObject link_nodes3;
                          SubLObject set_contents_var2;
                          SubLObject basis_object2;
                          SubLObject state2;
                          SubLObject genpred3;
                          SubLObject csome_list_var3;
                          SubLObject genpred4;
                          for( rest = NIL, rest = accessible_modules; NIL == foundP && NIL != rest; rest = rest.rest() )
                          {
                            module_var = rest.first();
                            _prev_bind_0_$326 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                            _prev_bind_1_$327 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                            try
                            {
                              sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                              sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                                  .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                              node = function_terms.naut_to_nart( tt_node_var );
                              if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                              {
                                d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                if( NIL != d_link )
                                {
                                  mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const195$isa ) ), sbhl_module_vars
                                      .get_sbhl_module( UNPROVIDED ) );
                                  if( NIL != mt_links )
                                  {
                                    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == foundP && NIL == dictionary_contents
                                        .do_dictionary_contents_doneP( iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                                    {
                                      thread.resetMultipleValues();
                                      mt = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                      tv_links = thread.secondMultipleValue();
                                      thread.resetMultipleValues();
                                      if( NIL != mt_relevance_macros.relevant_mtP( mt ) )
                                      {
                                        _prev_bind_0_$327 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                        try
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.bind( mt, thread );
                                          for( iteration_state_$335 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == foundP && NIL == dictionary_contents
                                              .do_dictionary_contents_doneP( iteration_state_$335 ); iteration_state_$335 = dictionary_contents.do_dictionary_contents_next( iteration_state_$335 ) )
                                          {
                                            thread.resetMultipleValues();
                                            tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$335 );
                                            link_nodes = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                            {
                                              _prev_bind_0_$328 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                              try
                                              {
                                                sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                                sol = link_nodes;
                                                if( NIL != set.set_p( sol ) )
                                                {
                                                  set_contents_var = set.do_set_internal( sol );
                                                  for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                      set_contents_var ); NIL == foundP && NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                                  {
                                                    genpred = set_contents.do_set_contents_next( basis_object, state );
                                                    if( NIL != set_contents.do_set_contents_element_validP( state, genpred ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( genpred,
                                                        sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                    {
                                                      sbhl_marking_utilities.sbhl_mark_node_marked( genpred, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                      if( NIL != forts.fort_p( genpred ) && NIL != kb_mapping_utilities.pred_values_in_any_mt( v_term, genpred, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
                                                      {
                                                        foundP = T;
                                                      }
                                                    }
                                                  }
                                                }
                                                else if( sol.isList() )
                                                {
                                                  if( NIL == foundP )
                                                  {
                                                    csome_list_var = sol;
                                                    genpred2 = NIL;
                                                    genpred2 = csome_list_var.first();
                                                    while ( NIL == foundP && NIL != csome_list_var)
                                                    {
                                                      if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( genpred2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                      {
                                                        sbhl_marking_utilities.sbhl_mark_node_marked( genpred2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                        if( NIL != forts.fort_p( genpred2 ) && NIL != kb_mapping_utilities.pred_values_in_any_mt( v_term, genpred2, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
                                                        {
                                                          foundP = T;
                                                        }
                                                      }
                                                      csome_list_var = csome_list_var.rest();
                                                      genpred2 = csome_list_var.first();
                                                    }
                                                  }
                                                }
                                                else
                                                {
                                                  Errors.error( $str47$_A_is_neither_SET_P_nor_LISTP_, sol );
                                                }
                                              }
                                              finally
                                              {
                                                sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$328, thread );
                                              }
                                            }
                                          }
                                          dictionary_contents.do_dictionary_contents_finalize( iteration_state_$335 );
                                        }
                                        finally
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$327, thread );
                                        }
                                      }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                                  }
                                }
                                else
                                {
                                  sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str48$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                }
                                if( NIL != sbhl_macros.do_sbhl_non_fort_linksP( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) && NIL == foundP )
                                {
                                  csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup( node );
                                  instance_tuple = NIL;
                                  instance_tuple = csome_list_var2.first();
                                  while ( NIL == foundP && NIL != csome_list_var2)
                                  {
                                    datum = ( current = instance_tuple );
                                    link_node = NIL;
                                    mt2 = NIL;
                                    tv2 = NIL;
                                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list197 );
                                    link_node = current.first();
                                    current = current.rest();
                                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list197 );
                                    mt2 = current.first();
                                    current = current.rest();
                                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list197 );
                                    tv2 = current.first();
                                    current = current.rest();
                                    if( NIL == current )
                                    {
                                      if( NIL != mt_relevance_macros.relevant_mtP( mt2 ) )
                                      {
                                        _prev_bind_0_$329 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                        try
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.bind( mt2, thread );
                                          if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv2 ) )
                                          {
                                            _prev_bind_0_$330 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                            try
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.bind( tv2, thread );
                                              link_nodes2 = ( sol = ConsesLow.list( link_node ) );
                                              if( NIL != set.set_p( sol ) )
                                              {
                                                set_contents_var = set.do_set_internal( sol );
                                                for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                    set_contents_var ); NIL == foundP && NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                                {
                                                  genpred = set_contents.do_set_contents_next( basis_object, state );
                                                  if( NIL != set_contents.do_set_contents_element_validP( state, genpred ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( genpred,
                                                      sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( genpred, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                    if( NIL != forts.fort_p( genpred ) && NIL != kb_mapping_utilities.pred_values_in_any_mt( v_term, genpred, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
                                                    {
                                                      foundP = T;
                                                    }
                                                  }
                                                }
                                              }
                                              else if( sol.isList() )
                                              {
                                                if( NIL == foundP )
                                                {
                                                  csome_list_var_$339 = sol;
                                                  genpred2 = NIL;
                                                  genpred2 = csome_list_var_$339.first();
                                                  while ( NIL == foundP && NIL != csome_list_var_$339)
                                                  {
                                                    if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( genpred2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                    {
                                                      sbhl_marking_utilities.sbhl_mark_node_marked( genpred2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                      if( NIL != forts.fort_p( genpred2 ) && NIL != kb_mapping_utilities.pred_values_in_any_mt( v_term, genpred2, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
                                                      {
                                                        foundP = T;
                                                      }
                                                    }
                                                    csome_list_var_$339 = csome_list_var_$339.rest();
                                                    genpred2 = csome_list_var_$339.first();
                                                  }
                                                }
                                              }
                                              else
                                              {
                                                Errors.error( $str47$_A_is_neither_SET_P_nor_LISTP_, sol );
                                              }
                                            }
                                            finally
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$330, thread );
                                            }
                                          }
                                        }
                                        finally
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$329, thread );
                                        }
                                      }
                                    }
                                    else
                                    {
                                      cdestructuring_bind.cdestructuring_bind_error( datum, $list197 );
                                    }
                                    csome_list_var2 = csome_list_var2.rest();
                                    instance_tuple = csome_list_var2.first();
                                  }
                                }
                              }
                              else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                              {
                                new_list = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_module_utilities
                                    .get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const195$isa ) ), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                        UNPROVIDED ) ) )
                                    : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const195$isa ) ),
                                        sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) );
                                for( rest_$340 = NIL, rest_$340 = new_list; NIL == foundP && NIL != rest_$340; rest_$340 = rest_$340.rest() )
                                {
                                  generating_fn = rest_$340.first();
                                  _prev_bind_0_$331 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                  try
                                  {
                                    sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                                    link_nodes3 = ( sol2 = Functions.funcall( generating_fn, node ) );
                                    if( NIL != set.set_p( sol2 ) )
                                    {
                                      set_contents_var2 = set.do_set_internal( sol2 );
                                      for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                          set_contents_var2 ); NIL == foundP && NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                      {
                                        genpred3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                        if( NIL != set_contents.do_set_contents_element_validP( state2, genpred3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( genpred3,
                                            sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                        {
                                          sbhl_marking_utilities.sbhl_mark_node_marked( genpred3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                          if( NIL != forts.fort_p( genpred3 ) && NIL != kb_mapping_utilities.pred_values_in_any_mt( v_term, genpred3, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
                                          {
                                            foundP = T;
                                          }
                                        }
                                      }
                                    }
                                    else if( sol2.isList() )
                                    {
                                      if( NIL == foundP )
                                      {
                                        csome_list_var3 = sol2;
                                        genpred4 = NIL;
                                        genpred4 = csome_list_var3.first();
                                        while ( NIL == foundP && NIL != csome_list_var3)
                                        {
                                          if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( genpred4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                          {
                                            sbhl_marking_utilities.sbhl_mark_node_marked( genpred4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                            if( NIL != forts.fort_p( genpred4 ) && NIL != kb_mapping_utilities.pred_values_in_any_mt( v_term, genpred4, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
                                            {
                                              foundP = T;
                                            }
                                          }
                                          csome_list_var3 = csome_list_var3.rest();
                                          genpred4 = csome_list_var3.first();
                                        }
                                      }
                                    }
                                    else
                                    {
                                      Errors.error( $str47$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                    }
                                  }
                                  finally
                                  {
                                    sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$331, thread );
                                  }
                                }
                              }
                            }
                            finally
                            {
                              sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$327, thread );
                              sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$326, thread );
                            }
                          }
                          final SubLObject accessible_modules2 = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const195$isa ) ) );
                          SubLObject rest2;
                          SubLObject module_var2;
                          SubLObject _prev_bind_0_$332;
                          SubLObject _prev_bind_1_$328;
                          SubLObject node2;
                          SubLObject d_link2;
                          SubLObject mt_links2;
                          SubLObject iteration_state2;
                          SubLObject mt3;
                          SubLObject tv_links2;
                          SubLObject _prev_bind_0_$333;
                          SubLObject iteration_state_$336;
                          SubLObject link_nodes4;
                          SubLObject _prev_bind_0_$334;
                          SubLObject sol3;
                          SubLObject set_contents_var3;
                          SubLObject basis_object3;
                          SubLObject state3;
                          SubLObject node_vars_link_node;
                          SubLObject csome_list_var4;
                          SubLObject node_vars_link_node2;
                          SubLObject new_list2;
                          SubLObject rest_$341;
                          SubLObject generating_fn2;
                          SubLObject _prev_bind_0_$335;
                          SubLObject sol4;
                          SubLObject link_nodes5;
                          SubLObject set_contents_var4;
                          SubLObject basis_object4;
                          SubLObject state4;
                          SubLObject node_vars_link_node3;
                          SubLObject csome_list_var5;
                          SubLObject node_vars_link_node4;
                          for( rest2 = NIL, rest2 = accessible_modules2; NIL == foundP && NIL != rest2; rest2 = rest2.rest() )
                          {
                            module_var2 = rest2.first();
                            _prev_bind_0_$332 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                            _prev_bind_1_$328 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                            try
                            {
                              sbhl_module_vars.$sbhl_module$.bind( module_var2, thread );
                              sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                                  .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                              node2 = function_terms.naut_to_nart( node_var_$320 );
                              if( NIL != sbhl_link_vars.sbhl_node_object_p( node2 ) )
                              {
                                d_link2 = sbhl_graphs.get_sbhl_graph_link( node2, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                if( NIL != d_link2 )
                                {
                                  mt_links2 = sbhl_links.get_sbhl_mt_links( d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                  if( NIL != mt_links2 )
                                  {
                                    for( iteration_state2 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links2 ) ); NIL == foundP && NIL == dictionary_contents
                                        .do_dictionary_contents_doneP( iteration_state2 ); iteration_state2 = dictionary_contents.do_dictionary_contents_next( iteration_state2 ) )
                                    {
                                      thread.resetMultipleValues();
                                      mt3 = dictionary_contents.do_dictionary_contents_key_value( iteration_state2 );
                                      tv_links2 = thread.secondMultipleValue();
                                      thread.resetMultipleValues();
                                      if( NIL != mt_relevance_macros.relevant_mtP( mt3 ) )
                                      {
                                        _prev_bind_0_$333 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                        try
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.bind( mt3, thread );
                                          for( iteration_state_$336 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links2 ) ); NIL == foundP && NIL == dictionary_contents
                                              .do_dictionary_contents_doneP( iteration_state_$336 ); iteration_state_$336 = dictionary_contents.do_dictionary_contents_next( iteration_state_$336 ) )
                                          {
                                            thread.resetMultipleValues();
                                            tv2 = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$336 );
                                            link_nodes4 = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv2 ) )
                                            {
                                              _prev_bind_0_$334 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                              try
                                              {
                                                sbhl_link_vars.$sbhl_link_tv$.bind( tv2, thread );
                                                sol3 = link_nodes4;
                                                if( NIL != set.set_p( sol3 ) )
                                                {
                                                  set_contents_var3 = set.do_set_internal( sol3 );
                                                  for( basis_object3 = set_contents.do_set_contents_basis_object( set_contents_var3 ), state3 = NIL, state3 = set_contents.do_set_contents_initial_state( basis_object3,
                                                      set_contents_var3 ); NIL == foundP && NIL == set_contents.do_set_contents_doneP( basis_object3, state3 ); state3 = set_contents.do_set_contents_update_state(
                                                          state3 ) )
                                                  {
                                                    node_vars_link_node = set_contents.do_set_contents_next( basis_object3, state3 );
                                                    if( NIL != set_contents.do_set_contents_element_validP( state3, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(
                                                        node_vars_link_node, UNPROVIDED ) )
                                                    {
                                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                      deck.deck_push( node_vars_link_node, recur_deck );
                                                    }
                                                  }
                                                }
                                                else if( sol3.isList() )
                                                {
                                                  if( NIL == foundP )
                                                  {
                                                    csome_list_var4 = sol3;
                                                    node_vars_link_node2 = NIL;
                                                    node_vars_link_node2 = csome_list_var4.first();
                                                    while ( NIL == foundP && NIL != csome_list_var4)
                                                    {
                                                      if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                                      {
                                                        sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                        deck.deck_push( node_vars_link_node2, recur_deck );
                                                      }
                                                      csome_list_var4 = csome_list_var4.rest();
                                                      node_vars_link_node2 = csome_list_var4.first();
                                                    }
                                                  }
                                                }
                                                else
                                                {
                                                  Errors.error( $str47$_A_is_neither_SET_P_nor_LISTP_, sol3 );
                                                }
                                              }
                                              finally
                                              {
                                                sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$334, thread );
                                              }
                                            }
                                          }
                                          dictionary_contents.do_dictionary_contents_finalize( iteration_state_$336 );
                                        }
                                        finally
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$333, thread );
                                        }
                                      }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize( iteration_state2 );
                                  }
                                }
                                else
                                {
                                  sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str48$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                }
                              }
                              else if( NIL != obsolete.cnat_p( node2, UNPROVIDED ) )
                              {
                                new_list2 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars
                                    .get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                                    : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                        .get_sbhl_module( UNPROVIDED ) ) );
                                for( rest_$341 = NIL, rest_$341 = new_list2; NIL == foundP && NIL != rest_$341; rest_$341 = rest_$341.rest() )
                                {
                                  generating_fn2 = rest_$341.first();
                                  _prev_bind_0_$335 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                  try
                                  {
                                    sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn2, thread );
                                    link_nodes5 = ( sol4 = Functions.funcall( generating_fn2, node2 ) );
                                    if( NIL != set.set_p( sol4 ) )
                                    {
                                      set_contents_var4 = set.do_set_internal( sol4 );
                                      for( basis_object4 = set_contents.do_set_contents_basis_object( set_contents_var4 ), state4 = NIL, state4 = set_contents.do_set_contents_initial_state( basis_object4,
                                          set_contents_var4 ); NIL == foundP && NIL == set_contents.do_set_contents_doneP( basis_object4, state4 ); state4 = set_contents.do_set_contents_update_state( state4 ) )
                                      {
                                        node_vars_link_node3 = set_contents.do_set_contents_next( basis_object4, state4 );
                                        if( NIL != set_contents.do_set_contents_element_validP( state4, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                            UNPROVIDED ) )
                                        {
                                          sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                          deck.deck_push( node_vars_link_node3, recur_deck );
                                        }
                                      }
                                    }
                                    else if( sol4.isList() )
                                    {
                                      if( NIL == foundP )
                                      {
                                        csome_list_var5 = sol4;
                                        node_vars_link_node4 = NIL;
                                        node_vars_link_node4 = csome_list_var5.first();
                                        while ( NIL == foundP && NIL != csome_list_var5)
                                        {
                                          if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                          {
                                            sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                            deck.deck_push( node_vars_link_node4, recur_deck );
                                          }
                                          csome_list_var5 = csome_list_var5.rest();
                                          node_vars_link_node4 = csome_list_var5.first();
                                        }
                                      }
                                    }
                                    else
                                    {
                                      Errors.error( $str47$_A_is_neither_SET_P_nor_LISTP_, sol4 );
                                    }
                                  }
                                  finally
                                  {
                                    sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$335, thread );
                                  }
                                }
                              }
                            }
                            finally
                            {
                              sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$328, thread );
                              sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$332, thread );
                            }
                          }
                          node_var_$320 = deck.deck_pop( recur_deck );
                        }
                      }
                      finally
                      {
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$329, thread );
                        sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$326, thread );
                        sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$325, thread );
                      }
                    }
                    else
                    {
                      sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str49$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED,
                          UNPROVIDED, UNPROVIDED );
                    }
                  }
                  finally
                  {
                    sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
                    sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_2_$328, thread );
                    sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$325, thread );
                    sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$324, thread );
                  }
                }
                finally
                {
                  sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$324, thread );
                  sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$323, thread );
                }
              }
              finally
              {
                mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
                mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_1_$323, thread );
                mt_relevance_macros.$mt$.rebind( _prev_bind_0_$322, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$336 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$336, thread );
              }
            }
          }
          finally
          {
            sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$321, thread );
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$337 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values2 = Values.getValuesAsVector();
          sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
          Values.restoreValuesFromVector( _values2 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$337, thread );
        }
      }
    }
    finally
    {
      sbhl_marking_vars.$sbhl_gather_space$.rebind( _prev_bind_2, thread );
      sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0, thread );
    }
    if( NIL == foundP )
    {
      thread.resetMultipleValues();
      final SubLObject string = pph_methods.select_string_for_term( v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      final SubLObject pred = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( !pred.eql( NIL ) && NIL == conses_high.member( pred, isa.all_fort_instances( $const199$ProperNamePredicate_Loose, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED ) )
      {
        foundP = T;
      }
    }
    return makeBoolean( NIL == foundP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 83486L)
  public static SubLObject preds_of_string(final SubLObject string, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject parse_morphologically)
  {
    if( misspellingsP == UNPROVIDED )
    {
      misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
    }
    if( lookup_mt == UNPROVIDED )
    {
      lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    if( parse_morphologically == UNPROVIDED )
    {
      parse_morphologically = lexicon_vars.$parse_morphologically$.getDynamicValue();
    }
    assert NIL != Types.stringp( string ) : string;
    assert NIL != lexicon_vars.parse_morphologically_option_p( parse_morphologically ) : parse_morphologically;
    SubLObject result = nl_trie_accessors.nl_trie_preds_of_string( string, misspellingsP, lookup_mt, UNPROVIDED );
    if( NIL != lexicon_accessors.proceed_with_morphological_parsingP( result, parse_morphologically ) )
    {
      result = Sequences.delete_duplicates( ConsesLow.append( result, morphological_word_parser.preds_of_complex_word_string( string ) ), Symbols.symbol_function( $sym52$KBEQ ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 84463L)
  public static SubLObject namestring_preds_of_string(final SubLObject string, SubLObject misspellingsP, SubLObject lookup_mt)
  {
    if( misspellingsP == UNPROVIDED )
    {
      misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
    }
    if( lookup_mt == UNPROVIDED )
    {
      lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    assert NIL != Types.stringp( string ) : string;
    final SubLObject result = nl_trie_accessors.nl_trie_namestring_preds_of_string( string, misspellingsP, lookup_mt, UNPROVIDED );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 84825L)
  public static SubLObject ordered_lexification_preds_of_string(final SubLObject string, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject parse_morphologically)
  {
    if( misspellingsP == UNPROVIDED )
    {
      misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
    }
    if( lookup_mt == UNPROVIDED )
    {
      lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    if( parse_morphologically == UNPROVIDED )
    {
      parse_morphologically = lexicon_vars.$parse_morphologically$.getDynamicValue();
    }
    assert NIL != lexicon_vars.parse_morphologically_option_p( parse_morphologically ) : parse_morphologically;
    final SubLObject ordered_preds = ConsesLow.append( $list59, lexicon_vars.all_lexicon_string_predicates() );
    return list_utilities.ordered_intersection( ordered_preds, preds_of_string( string, misspellingsP, lookup_mt, parse_morphologically ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 85711L)
  public static SubLObject ordered_preds_of_string(final SubLObject string, SubLObject misspellingsP, SubLObject lookup_mt)
  {
    if( misspellingsP == UNPROVIDED )
    {
      misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
    }
    if( lookup_mt == UNPROVIDED )
    {
      lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    return ordered_lexification_preds_of_string( string, misspellingsP, lookup_mt, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 86001L)
  public static SubLObject word_variants(final SubLObject wordform, SubLObject pos_keyword, SubLObject strict, SubLObject misspellingsP, SubLObject lookup_mt)
  {
    if( pos_keyword == UNPROVIDED )
    {
      pos_keyword = NIL;
    }
    if( strict == UNPROVIDED )
    {
      strict = NIL;
    }
    if( misspellingsP == UNPROVIDED )
    {
      misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
    }
    if( lookup_mt == UNPROVIDED )
    {
      lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    SubLObject preds = ( NIL != pos_keyword ) ? ordered_lexification_preds_for_keyword( pos_keyword ) : ordered_lexification_preds_of_string( wordform, misspellingsP, lookup_mt, UNPROVIDED );
    final SubLObject word_units = ( NIL != pos_keyword ) ? lexicon_accessors.words_of_stringXpos( wordform, pos_keyword, misspellingsP, lookup_mt, UNPROVIDED )
        : lexicon_cache.words_of_string( wordform, misspellingsP, lookup_mt, UNPROVIDED );
    SubLObject variants = NIL;
    if( NIL != strict && pos_keyword == $kw269$NOUN )
    {
      preds = list_utilities.ordered_set_difference( preds, $nonstandard_nominal_preds$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
    }
    SubLObject cdolist_list_var = word_units;
    SubLObject word_unit = NIL;
    word_unit = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$351 = lexicon_cache.ordered_strings_of_word_unit( word_unit, preds, NIL, lookup_mt );
      SubLObject variant = NIL;
      variant = cdolist_list_var_$351.first();
      while ( NIL != cdolist_list_var_$351)
      {
        final SubLObject item_var = variant;
        if( NIL == conses_high.member( item_var, variants, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          variants = ConsesLow.cons( item_var, variants );
        }
        cdolist_list_var_$351 = cdolist_list_var_$351.rest();
        variant = cdolist_list_var_$351.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      word_unit = cdolist_list_var.first();
    }
    return variants;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 87420L)
  public static SubLObject ordered_word_variants(final SubLObject wordform, SubLObject pos_keyword, SubLObject strict, SubLObject misspellingsP, SubLObject lookup_mt)
  {
    if( pos_keyword == UNPROVIDED )
    {
      pos_keyword = NIL;
    }
    if( strict == UNPROVIDED )
    {
      strict = NIL;
    }
    if( misspellingsP == UNPROVIDED )
    {
      misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
    }
    if( lookup_mt == UNPROVIDED )
    {
      lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    return Sequences.reverse( word_variants( wordform, pos_keyword, strict, misspellingsP, lookup_mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 88002L)
  public static SubLObject find_word_root(final SubLObject wordform, SubLObject pos_keyword, SubLObject strict, SubLObject misspellingsP, SubLObject lookup_mt)
  {
    if( pos_keyword == UNPROVIDED )
    {
      pos_keyword = NIL;
    }
    if( strict == UNPROVIDED )
    {
      strict = NIL;
    }
    if( misspellingsP == UNPROVIDED )
    {
      misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
    }
    if( lookup_mt == UNPROVIDED )
    {
      lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    final SubLObject variants = ordered_word_variants( wordform, pos_keyword, strict, misspellingsP, lookup_mt );
    return ( NIL != variants ) ? variants.first() : wordform;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 88549L)
  public static SubLObject word_has_part_of_speechP(final SubLObject wordform, final SubLObject pos_keyword, SubLObject lookup_mt)
  {
    if( lookup_mt == UNPROVIDED )
    {
      lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    assert NIL != Types.keywordp( pos_keyword ) : pos_keyword;
    return list_utilities.sublisp_boolean( lexicon_accessors.words_of_stringXpos( wordform, pos_keyword, NIL, lookup_mt, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 89024L)
  public static SubLObject word_has_speech_partP(final SubLObject wordform, final SubLObject speech_part, SubLObject lookup_mt, SubLObject parse_morphologically)
  {
    if( lookup_mt == UNPROVIDED )
    {
      lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    if( parse_morphologically == UNPROVIDED )
    {
      parse_morphologically = lexicon_vars.$parse_morphologically$.getDynamicValue();
    }
    return list_utilities.sublisp_boolean( lexicon_accessors.words_of_stringXspeech_part( wordform, speech_part, NIL, lookup_mt, parse_morphologically ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 89447L)
  public static SubLObject is_determinerP(final SubLObject wordform, SubLObject lookup_mt, SubLObject all_determinersP)
  {
    if( lookup_mt == UNPROVIDED )
    {
      lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    if( all_determinersP == UNPROVIDED )
    {
      all_determinersP = NIL;
    }
    final SubLObject determiner_central = misc_kb_utilities.resolve_constant( $str271$Determiner_Central, $const66$Determiner );
    final SubLObject determiner_pred = ( NIL != all_determinersP ) ? $const66$Determiner : determiner_central;
    return word_has_speech_partP( wordform, determiner_pred, lookup_mt, $kw272$NEVER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 90188L)
  public static SubLObject strip_determiner(SubLObject phrase, SubLObject all_determiner_typesP)
  {
    if( all_determiner_typesP == UNPROVIDED )
    {
      all_determiner_typesP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject tokens = string_utilities.string_tokenize( phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != is_determinerP( tokens.first(), lexicon_vars.$lexicon_lookup_mt$.getDynamicValue( thread ), all_determiner_typesP ) )
    {
      phrase = lexification_utilities.join_words( tokens.rest() );
    }
    return phrase;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 90758L)
  public static SubLObject wh_wordP(final SubLObject string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( NIL != lexicon_accessors.closed_lexical_class_string_case_insensitiveP( string, UNPROVIDED ) && NIL != lexicon_accessors.string_is_posP( string, $const273$WHWord, NIL,
        lexicon_vars.$lexicon_lookup_mt$.getDynamicValue( thread ), $kw272$NEVER ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 90933L)
  public static SubLObject first_name_p(final SubLObject string)
  {
    return makeBoolean( NIL != cyc_kernel.cyc_query( ConsesLow.list( $const274$nameSpelling, $sym275$_NAME, string ), $const276$NameLexicalMt, UNPROVIDED ) || NIL != cyc_kernel.cyc_query( ConsesLow.list(
        $const277$commonNickname, $sym275$_NAME, string ), $const276$NameLexicalMt, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 91185L)
  public static SubLObject first_name_gender(final SubLObject string)
  {
    final SubLObject names = ConsesLow.append( ask_utilities.ask_variable( $sym275$_NAME, ConsesLow.list( $const274$nameSpelling, $sym275$_NAME, string ), $const276$NameLexicalMt, UNPROVIDED, UNPROVIDED, UNPROVIDED,
        UNPROVIDED ), ask_utilities.ask_variable( $sym275$_NAME, ConsesLow.list( $const277$commonNickname, $sym275$_NAME, string ), $const276$NameLexicalMt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    if( NIL == names )
    {
      return NIL;
    }
    if( NIL != Sequences.find_if( Symbols.symbol_function( $sym278$HUMAN_MALE_GIVEN_NAME_P ), names, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      if( NIL != Sequences.find_if( Symbols.symbol_function( $sym279$HUMAN_FEMALE_GIVEN_NAME_P ), names, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        return $kw280$BOTH;
      }
      return $kw281$MASC;
    }
    else
    {
      if( NIL != Sequences.find_if( Symbols.symbol_function( $sym279$HUMAN_FEMALE_GIVEN_NAME_P ), names, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        return $kw282$FEM;
      }
      return $kw283$UNKNOWN;
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 92134L)
  public static SubLObject human_male_given_name_p(final SubLObject v_object)
  {
    return isa.isa_in_any_mtP( v_object, $const284$HumanMaleGivenName );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 92237L)
  public static SubLObject human_female_given_name_p(final SubLObject v_object)
  {
    return isa.isa_in_any_mtP( v_object, $const285$HumanFemaleGivenName );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 92344L)
  public static SubLObject construct_word_unit(final SubLObject base_word_unit, final SubLObject affix, SubLObject affix_type)
  {
    if( affix_type == UNPROVIDED )
    {
      affix_type = $kw283$UNKNOWN;
    }
    if( $kw283$UNKNOWN == affix_type )
    {
      affix_type = ( NIL != prefix_unit_p( affix ) ) ? $kw286$PREFIX : $kw287$SUFFIX;
    }
    final SubLObject pcase_var = affix_type;
    if( pcase_var.eql( $kw286$PREFIX ) )
    {
      return el_utilities.make_binary_formula( $const288$WordWithPrefixFn, affix, base_word_unit );
    }
    return el_utilities.make_binary_formula( $const289$WordWithSuffixFn, base_word_unit, affix );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 92742L)
  public static SubLObject derived_word_affix(final SubLObject derived_word, SubLObject query_mt)
  {
    if( query_mt == UNPROVIDED )
    {
      query_mt = $const290$AllLexicalMicrotheoryPSC;
    }
    assert NIL != lexicon_accessors.derived_wordP( derived_word ) : derived_word;
    return derived_word_affix_memoized( derived_word, query_mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 92943L)
  public static SubLObject derived_word_affix_memoized_internal(final SubLObject derived_word, final SubLObject query_mt)
  {
    final SubLObject var = $sym293$_AFFIX;
    final SubLObject query_sentence = el_utilities.make_binary_formula( $const294$derivedUsingAffix, derived_word, var );
    final SubLObject query_properties = $list295;
    return ask_utilities.query_variable( var, query_sentence, query_mt, query_properties ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 92943L)
  public static SubLObject derived_word_affix_memoized(final SubLObject derived_word, final SubLObject query_mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return derived_word_affix_memoized_internal( derived_word, query_mt );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym292$DERIVED_WORD_AFFIX_MEMOIZED, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym292$DERIVED_WORD_AFFIX_MEMOIZED, TWO_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym292$DERIVED_WORD_AFFIX_MEMOIZED, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( derived_word, query_mt );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( derived_word.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && query_mt.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( derived_word_affix_memoized_internal( derived_word, query_mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( derived_word, query_mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 93285L)
  public static SubLObject prefix_unit_p(final SubLObject v_object)
  {
    return isa.isa_in_any_mtP( v_object, $const296$LexicalPrefix );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 93373L)
  public static SubLObject denots_of_string_stop_word(final SubLObject token)
  {
    return makeBoolean( NIL != lexicon_accessors.closed_lexical_class_stringP( token, UNPROVIDED ) && NIL == stop_word_closed_class_exception( token, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 93886L)
  public static SubLObject clear_stop_word_closed_class_exception()
  {
    final SubLObject cs = $stop_word_closed_class_exception_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 93886L)
  public static SubLObject remove_stop_word_closed_class_exception(final SubLObject token, SubLObject lexicon_lookup_mt)
  {
    if( lexicon_lookup_mt == UNPROVIDED )
    {
      lexicon_lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    return memoization_state.caching_state_remove_function_results_with_args( $stop_word_closed_class_exception_caching_state$.getGlobalValue(), ConsesLow.list( token, lexicon_lookup_mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 93886L)
  public static SubLObject stop_word_closed_class_exception_internal(final SubLObject token, final SubLObject lexicon_lookup_mt)
  {
    final SubLObject closed_class_exceptions = conses_high.copy_list( $stop_word_closed_class_exceptions$.getGlobalValue() );
    if( NIL != numeral_parser.string_to_interval( token ) )
    {
      return T;
    }
    SubLObject cdolist_list_var = closed_class_exceptions;
    SubLObject pos = NIL;
    pos = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != lexicon_accessors.string_is_posP( token, pos, NIL, lexicon_lookup_mt, $kw272$NEVER ) )
      {
        return T;
      }
      cdolist_list_var = cdolist_list_var.rest();
      pos = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 93886L)
  public static SubLObject stop_word_closed_class_exception(final SubLObject token, SubLObject lexicon_lookup_mt)
  {
    if( lexicon_lookup_mt == UNPROVIDED )
    {
      lexicon_lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    SubLObject caching_state = $stop_word_closed_class_exception_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym297$STOP_WORD_CLOSED_CLASS_EXCEPTION, $sym298$_STOP_WORD_CLOSED_CLASS_EXCEPTION_CACHING_STATE_, $int299$100, EQUAL, TWO_INTEGER,
          ZERO_INTEGER );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( token, lexicon_lookup_mt );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( token.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && lexicon_lookup_mt.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( stop_word_closed_class_exception_internal( token, lexicon_lookup_mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( token, lexicon_lookup_mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 94620L)
  public static SubLObject head_keyword_for_frame(final SubLObject frame)
  {
    return list_utilities.alist_lookup( $semtrans_frame_keywords$.getGlobalValue(), frame, Symbols.symbol_function( EQL ), NIL ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 94744L)
  public static SubLObject argument_keywords_for_frame(final SubLObject frame)
  {
    return conses_high.copy_list( list_utilities.alist_lookup( $semtrans_frame_keywords$.getGlobalValue(), frame, Symbols.symbol_function( EQL ), NIL ).rest() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 94884L)
  public static SubLObject extract_head_type_and_argument_roles_from_semtrans_template(final SubLObject semtrans_template, final SubLObject frame)
  {
    if( NIL != el_utilities.el_conjunction_p( semtrans_template ) )
    {
      final SubLObject head = head_keyword_for_frame( frame );
      SubLObject unmatched_argument_keywords = argument_keywords_for_frame( frame );
      SubLObject head_type = NIL;
      SubLObject roles = NIL;
      SubLObject head_conjunct = NIL;
      SubLObject non_matcher = NIL;
      SubLObject args = cycl_utilities.formula_args( semtrans_template, $kw301$IGNORE );
      SubLObject rest;
      SubLObject conjunct;
      for( rest = NIL, rest = args; NIL == head_conjunct && NIL != rest; rest = rest.rest() )
      {
        conjunct = rest.first();
        if( NIL != formula_pattern_match.formula_matches_pattern( conjunct, $list302 ) )
        {
          head_conjunct = conjunct;
        }
      }
      if( NIL != head_conjunct )
      {
        head_type = cycl_utilities.formula_arg2( head_conjunct, UNPROVIDED );
        args = cycl_utilities.formula_args( semtrans_template, $kw301$IGNORE );
        SubLObject this_key;
        for( rest = NIL, rest = args; NIL == non_matcher && NIL != rest; rest = rest.rest() )
        {
          conjunct = rest.first();
          if( !conjunct.equal( head_conjunct ) )
          {
            if( NIL != formula_pattern_match.formula_matches_pattern( conjunct, ConsesLow.listS( $kw303$FORT, head, $list304 ) ) )
            {
              this_key = cycl_utilities.formula_arg2( conjunct, UNPROVIDED );
              if( NIL != subl_promotions.memberP( this_key, unmatched_argument_keywords, UNPROVIDED, UNPROVIDED ) )
              {
                unmatched_argument_keywords = Sequences.delete( this_key, unmatched_argument_keywords, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                roles = list_utilities.alist_enter( roles, this_key, cycl_utilities.formula_arg0( conjunct ), UNPROVIDED );
              }
              else
              {
                non_matcher = conjunct;
              }
            }
            else
            {
              non_matcher = conjunct;
            }
          }
        }
        if( NIL != non_matcher || NIL != unmatched_argument_keywords )
        {
          head_type = NIL;
          roles = NIL;
        }
      }
      return Values.values( head_type, roles, non_matcher );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 96225L)
  public static SubLObject construct_semtrans_template_from_head_type_and_argument_roles(final SubLObject frame, final SubLObject head_type, final SubLObject roles)
  {
    assert NIL != forts.fort_p( frame ) : frame;
    assert NIL != cycl_grammar.cycl_represented_term_p( head_type ) : head_type;
    final SubLObject head_keyword = head_keyword_for_frame( frame );
    final SubLObject argument_keywords = argument_keywords_for_frame( frame );
    SubLObject ans = NIL;
    if( NIL != head_keyword && NIL != argument_keywords )
    {
      final SubLObject head_conjunct = ConsesLow.list( $const195$isa, head_keyword, head_type );
      SubLObject conjuncts = ConsesLow.list( head_conjunct );
      SubLObject argument_keyword = NIL;
      SubLObject argument_keyword_$352 = NIL;
      SubLObject role = NIL;
      SubLObject role_$353 = NIL;
      argument_keyword = argument_keywords;
      argument_keyword_$352 = argument_keyword.first();
      role = roles;
      role_$353 = role.first();
      while ( NIL != role || NIL != argument_keyword)
      {
        assert NIL != cycl_grammar.cycl_represented_term_p( role_$353 ) : role_$353;
        conjuncts = ConsesLow.cons( el_utilities.make_binary_formula( role_$353, head_keyword, argument_keyword_$352 ), conjuncts );
        argument_keyword = argument_keyword.rest();
        argument_keyword_$352 = argument_keyword.first();
        role = role.rest();
        role_$353 = role.first();
      }
      ans = el_utilities.make_conjunction( Sequences.nreverse( conjuncts ) );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 97134L)
  public static SubLObject language_of_lexicon(final SubLObject mt)
  {
    maybe_initialize_lexicons_to_languages();
    SubLObject language = dictionary.dictionary_lookup_without_values( $lexicons_to_languages$.getGlobalValue(), mt, UNPROVIDED );
    if( NIL == language )
    {
      language = language_of_lexicon_internal( mt );
      if( NIL != language )
      {
        dictionary.dictionary_enter( $lexicons_to_languages$.getGlobalValue(), mt, language );
      }
    }
    return language;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 97480L)
  public static SubLObject language_of_lexicon_internal(final SubLObject mt)
  {
    if( !hlmt.hlmt_monad_mt( mt ).equal( mt ) )
    {
      return language_of_lexicon( hlmt.hlmt_monad_mt( mt ) );
    }
    if( NIL != hlmt.mt_union_naut_p( mt ) )
    {
      final SubLObject mts = hlmt.mt_union_mts( mt );
      SubLObject first_language = NIL;
      SubLObject different_languageP = NIL;
      if( NIL == different_languageP )
      {
        SubLObject csome_list_var = mts;
        SubLObject component_mt = NIL;
        component_mt = csome_list_var.first();
        while ( NIL == different_languageP && NIL != csome_list_var)
        {
          final SubLObject this_language = language_of_lexicon( component_mt );
          if( NIL != this_language )
          {
            if( NIL == first_language )
            {
              first_language = this_language;
            }
            else if( !this_language.equal( first_language ) )
            {
              different_languageP = T;
            }
          }
          csome_list_var = csome_list_var.rest();
          component_mt = csome_list_var.first();
        }
      }
      return ( NIL != different_languageP ) ? NIL : first_language;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 98144L)
  public static SubLObject clear_lexicons_to_languages()
  {
    if( NIL != dictionary.dictionary_p( $lexicons_to_languages$.getGlobalValue() ) )
    {
      dictionary.clear_dictionary( $lexicons_to_languages$.getGlobalValue() );
    }
    return $lexicons_to_languages$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 98329L)
  public static SubLObject initialize_lexicons_to_languages()
  {
    if( NIL != dictionary.dictionary_p( $lexicons_to_languages$.getGlobalValue() ) )
    {
      clear_lexicons_to_languages();
    }
    else
    {
      $lexicons_to_languages$.setGlobalValue( dictionary.new_dictionary( Symbols.symbol_function( EQUAL ), UNPROVIDED ) );
    }
    SubLObject cdolist_list_var = ask_utilities.query_template( $list309, $list310, $const107$InferencePSC, $list311 );
    SubLObject pair = NIL;
    pair = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = pair;
      SubLObject mt = NIL;
      SubLObject language = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list308 );
      mt = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list308 );
      language = current.first();
      current = current.rest();
      if( NIL == current )
      {
        dictionary.dictionary_enter( $lexicons_to_languages$.getGlobalValue(), mt, language );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list308 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      pair = cdolist_list_var.first();
    }
    return $lexicons_to_languages$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 98796L)
  public static SubLObject maybe_initialize_lexicons_to_languages()
  {
    if( NIL == dictionary.dictionary_p( $lexicons_to_languages$.getGlobalValue() ) )
    {
      initialize_lexicons_to_languages();
    }
    return $lexicons_to_languages$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 98978L)
  public static SubLObject lexical_assertion_of_lexiconP(final SubLObject lexicon, final SubLObject assertion, final SubLObject assertion_mt)
  {
    return lexicon_accessors.genl_lexicon_mtP( assertion_mt, lexicon );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 99335L)
  public static SubLObject clear_lexical_mt_for_language()
  {
    final SubLObject cs = $lexical_mt_for_language_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 99335L)
  public static SubLObject remove_lexical_mt_for_language(final SubLObject language)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $lexical_mt_for_language_caching_state$.getGlobalValue(), ConsesLow.list( language ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 99335L)
  public static SubLObject lexical_mt_for_language_internal(final SubLObject language)
  {
    return ask_utilities.query_variable( $kw313$MT, ConsesLow.listS( $const314$languageHasRootLexicon, language, $list315 ), $const107$InferencePSC, UNPROVIDED ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 99335L)
  public static SubLObject lexical_mt_for_language(final SubLObject language)
  {
    SubLObject caching_state = $lexical_mt_for_language_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym312$LEXICAL_MT_FOR_LANGUAGE, $sym316$_LEXICAL_MT_FOR_LANGUAGE_CACHING_STATE_, $int317$256, EQL, ONE_INTEGER, ZERO_INTEGER );
      memoization_state.register_hl_store_cache_clear_callback( $sym318$CLEAR_LEXICAL_MT_FOR_LANGUAGE );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, language, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( lexical_mt_for_language_internal( language ) ) );
      memoization_state.caching_state_put( caching_state, language, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 99553L)
  public static SubLObject clear_get_language_for_code()
  {
    final SubLObject cs = $get_language_for_code_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 99553L)
  public static SubLObject remove_get_language_for_code(final SubLObject code_string)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $get_language_for_code_caching_state$.getGlobalValue(), ConsesLow.list( code_string ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 99553L)
  public static SubLObject get_language_for_code_internal(final SubLObject code_string)
  {
    return ask_utilities.query_variable( $kw320$LANG, ConsesLow.list( $const321$languageCodeDigraph, $kw320$LANG, code_string ), $const322$CrossLinguisticLexicalMt, UNPROVIDED ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 99553L)
  public static SubLObject get_language_for_code(final SubLObject code_string)
  {
    SubLObject caching_state = $get_language_for_code_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym319$GET_LANGUAGE_FOR_CODE, $sym323$_GET_LANGUAGE_FOR_CODE_CACHING_STATE_, $int317$256, EQL, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, code_string, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( get_language_for_code_internal( code_string ) ) );
      memoization_state.caching_state_put( caching_state, code_string, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 99757L)
  public static SubLObject clear_get_code_for_language()
  {
    final SubLObject cs = $get_code_for_language_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 99757L)
  public static SubLObject remove_get_code_for_language(final SubLObject language)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $get_code_for_language_caching_state$.getGlobalValue(), ConsesLow.list( language ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 99757L)
  public static SubLObject get_code_for_language_internal(final SubLObject language)
  {
    return ask_utilities.query_variable( $kw325$CODE, ConsesLow.listS( $const321$languageCodeDigraph, language, $list326 ), $const322$CrossLinguisticLexicalMt, UNPROVIDED ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-utilities.lisp", position = 99757L)
  public static SubLObject get_code_for_language(final SubLObject language)
  {
    SubLObject caching_state = $get_code_for_language_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym324$GET_CODE_FOR_LANGUAGE, $sym327$_GET_CODE_FOR_LANGUAGE_CACHING_STATE_, $int317$256, EQL, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, language, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( get_code_for_language_internal( language ) ) );
      memoization_state.caching_state_put( caching_state, language, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  public static SubLObject declare_lexicon_utilities_file()
  {
    SubLFiles.declareFunction( me, "mwwP", "MWW?", 1, 0, false );
    SubLFiles.declareFunction( me, "next_available_ws", "NEXT-AVAILABLE-WS", 2, 1, false );
    SubLFiles.declareFunction( me, "unique_ws", "UNIQUE-WS", 3, 0, false );
    SubLFiles.declareFunction( me, "ws_availableP", "WS-AVAILABLE?", 3, 1, false );
    SubLFiles.declareFunction( me, "lowest_not_in_list", "LOWEST-NOT-IN-LIST", 2, 0, false );
    SubLFiles.declareFunction( me, "suggest_word_unit", "SUGGEST-WORD-UNIT", 1, 0, false );
    SubLFiles.declareFunction( me, "word_prop", "WORD-PROP", 2, 1, false );
    SubLFiles.declareFunction( me, "set_word_prop", "SET-WORD-PROP", 3, 1, false );
    SubLFiles.declareFunction( me, "check_denot", "CHECK-DENOT", 4, 2, false );
    SubLFiles.declareFunction( me, "set_denot", "SET-DENOT", 4, 2, false );
    SubLFiles.declareFunction( me, "add_frame", "ADD-FRAME", 4, 1, false );
    SubLFiles.declareFunction( me, "remove_frame", "REMOVE-FRAME", 4, 1, false );
    SubLFiles.declareFunction( me, "set_frames", "SET-FRAMES", 4, 1, false );
    SubLFiles.declareFunction( me, "frame_lookup", "FRAME-LOOKUP", 3, 0, false );
    SubLFiles.declareFunction( me, "preds_of_pos", "PREDS-OF-POS", 1, 1, false );
    SubLFiles.declareFunction( me, "clear_preds_of_pos", "CLEAR-PREDS-OF-POS", 0, 0, false );
    SubLFiles.declareFunction( me, "clear_preds_of_pos_cached", "CLEAR-PREDS-OF-POS-CACHED", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_preds_of_pos_cached", "REMOVE-PREDS-OF-POS-CACHED", 2, 0, false );
    SubLFiles.declareFunction( me, "preds_of_pos_cached_internal", "PREDS-OF-POS-CACHED-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "preds_of_pos_cached", "PREDS-OF-POS-CACHED", 2, 0, false );
    SubLFiles.declareFunction( me, "preds_of_pos_int", "PREDS-OF-POS-INT", 2, 1, false );
    SubLFiles.declareFunction( me, "preds_of_pos_lookup", "PREDS-OF-POS-LOOKUP", 1, 0, false );
    SubLFiles.declareFunction( me, "ordered_lexification_preds_of_pos", "ORDERED-LEXIFICATION-PREDS-OF-POS", 1, 0, false );
    SubLFiles.declareFunction( me, "ordered_preds_of_pos", "ORDERED-PREDS-OF-POS", 1, 0, false );
    SubLFiles.declareFunction( me, "preds_licensed_by_pos", "PREDS-LICENSED-BY-POS", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_preds_licensed_by_pos", "CLEAR-PREDS-LICENSED-BY-POS", 0, 0, false );
    SubLFiles.declareFunction( me, "clear_preds_licensed_by_pos_cached", "CLEAR-PREDS-LICENSED-BY-POS-CACHED", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_preds_licensed_by_pos_cached", "REMOVE-PREDS-LICENSED-BY-POS-CACHED", 2, 0, false );
    SubLFiles.declareFunction( me, "preds_licensed_by_pos_cached_internal", "PREDS-LICENSED-BY-POS-CACHED-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "preds_licensed_by_pos_cached", "PREDS-LICENSED-BY-POS-CACHED", 2, 0, false );
    SubLFiles.declareFunction( me, "preds_coercible_from_pred", "PREDS-COERCIBLE-FROM-PRED", 1, 0, false );
    SubLFiles.declareFunction( me, "preds_derivable_from_pred", "PREDS-DERIVABLE-FROM-PRED", 1, 0, false );
    SubLFiles.declareFunction( me, "filter_lexicon_preds", "FILTER-LEXICON-PREDS", 2, 2, false );
    SubLFiles.declareFunction( me, "filter_two_lexicon_preds", "FILTER-TWO-LEXICON-PREDS", 2, 1, false );
    SubLFiles.declareFunction( me, "spp_more_basicP", "SPP-MORE-BASIC?", 2, 1, false );
    SubLFiles.declareFunction( me, "clear_spp_more_basicP_cached", "CLEAR-SPP-MORE-BASIC?-CACHED", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_spp_more_basicP_cached", "REMOVE-SPP-MORE-BASIC?-CACHED", 3, 0, false );
    SubLFiles.declareFunction( me, "spp_more_basicP_cached_internal", "SPP-MORE-BASIC?-CACHED-INTERNAL", 3, 0, false );
    SubLFiles.declareFunction( me, "spp_more_basicP_cached", "SPP-MORE-BASIC?-CACHED", 3, 0, false );
    SubLFiles.declareFunction( me, "spp_assertion_string", "SPP-ASSERTION-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "preds_for_keyword", "PREDS-FOR-KEYWORD", 1, 0, false );
    SubLFiles.declareFunction( me, "ordered_lexification_preds_for_keyword", "ORDERED-LEXIFICATION-PREDS-FOR-KEYWORD", 1, 0, false );
    SubLFiles.declareFunction( me, "ordered_preds_for_keyword", "ORDERED-PREDS-FOR-KEYWORD", 1, 0, false );
    SubLFiles.declareFunction( me, "nl_def_attributes_for_string", "NL-DEF-ATTRIBUTES-FOR-STRING", 1, 1, false );
    SubLFiles.declareFunction( me, "nl_def_attributes_for_pos", "NL-DEF-ATTRIBUTES-FOR-POS", 1, 1, false );
    SubLFiles.declareFunction( me, "nl_def_attributes_for_possessive_denots", "NL-DEF-ATTRIBUTES-FOR-POSSESSIVE-DENOTS", 1, 0, false );
    SubLFiles.declareFunction( me, "nl_quant_attributes_for_string", "NL-QUANT-ATTRIBUTES-FOR-STRING", 1, 1, false );
    SubLFiles.declareFunction( me, "nl_quant_attributes_for_denots", "NL-QUANT-ATTRIBUTES-FOR-DENOTS", 1, 0, false );
    SubLFiles.declareFunction( me, "nl_numerical_quant_for_denot", "NL-NUMERICAL-QUANT-FOR-DENOT", 1, 0, false );
    SubLFiles.declareFunction( me, "det_denot_is_scalar_intervalP", "DET-DENOT-IS-SCALAR-INTERVAL?", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_det_denot_is_scalar_intervalP_cached", "CLEAR-DET-DENOT-IS-SCALAR-INTERVAL?-CACHED", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_det_denot_is_scalar_intervalP_cached", "REMOVE-DET-DENOT-IS-SCALAR-INTERVAL?-CACHED", 1, 0, false );
    SubLFiles.declareFunction( me, "det_denot_is_scalar_intervalP_cached_internal", "DET-DENOT-IS-SCALAR-INTERVAL?-CACHED-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "det_denot_is_scalar_intervalP_cached", "DET-DENOT-IS-SCALAR-INTERVAL?-CACHED", 1, 0, false );
    SubLFiles.declareFunction( me, "maximal_bar_level", "MAXIMAL-BAR-LEVEL", 2, 0, false );
    SubLFiles.declareFunction( me, "bar_level", "BAR-LEVEL", 1, 1, false );
    SubLFiles.declareFunction( me, "clear_bar_level", "CLEAR-BAR-LEVEL", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_bar_level", "REMOVE-BAR-LEVEL", 2, 0, false );
    SubLFiles.declareFunction( me, "clear_bar_level_cached", "CLEAR-BAR-LEVEL-CACHED", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_bar_level_cached", "REMOVE-BAR-LEVEL-CACHED", 2, 0, false );
    SubLFiles.declareFunction( me, "bar_level_cached_internal", "BAR-LEVEL-CACHED-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "bar_level_cached", "BAR-LEVEL-CACHED", 2, 0, false );
    SubLFiles.declareFunction( me, "pos_of_cat", "POS-OF-CAT", 1, 1, false );
    SubLFiles.declareFunction( me, "clear_pos_of_cat_cached", "CLEAR-POS-OF-CAT-CACHED", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_pos_of_cat_cached", "REMOVE-POS-OF-CAT-CACHED", 2, 0, false );
    SubLFiles.declareFunction( me, "pos_of_cat_cached_internal", "POS-OF-CAT-CACHED-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "pos_of_cat_cached", "POS-OF-CAT-CACHED", 2, 0, false );
    SubLFiles.declareFunction( me, "make_cat_with_bar_level", "MAKE-CAT-WITH-BAR-LEVEL", 2, 0, false );
    SubLFiles.declareFunction( me, "clear_cached_lexical_functions", "CLEAR-CACHED-LEXICAL-FUNCTIONS", 0, 0, false );
    SubLFiles.declareFunction( me, "clear_lexical_info_caches", "CLEAR-LEXICAL-INFO-CACHES", 0, 1, false );
    SubLFiles.declareFunction( me, "clear_cached_lexical_arg_types", "CLEAR-CACHED-LEXICAL-ARG-TYPES", 0, 0, false );
    SubLFiles.declareFunction( me, "clear_denotatum_arg_of_pred_cached", "CLEAR-DENOTATUM-ARG-OF-PRED-CACHED", 0, 0, false );
    SubLFiles.declareFunction( me, "clear_stringlist_args_of_pred_cached", "CLEAR-STRINGLIST-ARGS-OF-PRED-CACHED", 0, 0, false );
    SubLFiles.declareFunction( me, "clear_wu_arg_of_pred_cached", "CLEAR-WU-ARG-OF-PRED-CACHED", 0, 0, false );
    SubLFiles.declareFunction( me, "clear_sense_arg_of_pred_cached", "CLEAR-SENSE-ARG-OF-PRED-CACHED", 0, 0, false );
    SubLFiles.declareFunction( me, "clear_frame_arg_of_pred_cached", "CLEAR-FRAME-ARG-OF-PRED-CACHED", 0, 0, false );
    SubLFiles.declareFunction( me, "clear_semtrans_arg_of_pred_cached", "CLEAR-SEMTRANS-ARG-OF-PRED-CACHED", 0, 0, false );
    SubLFiles.declareFunction( me, "denotatum_arg_of_pred_cached", "DENOTATUM-ARG-OF-PRED-CACHED", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_denotatum_arg_of_pred_cached_int", "CLEAR-DENOTATUM-ARG-OF-PRED-CACHED-INT", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_denotatum_arg_of_pred_cached_int", "REMOVE-DENOTATUM-ARG-OF-PRED-CACHED-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "denotatum_arg_of_pred_cached_int_internal", "DENOTATUM-ARG-OF-PRED-CACHED-INT-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "denotatum_arg_of_pred_cached_int", "DENOTATUM-ARG-OF-PRED-CACHED-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "semtrans_arg_of_pred_cached", "SEMTRANS-ARG-OF-PRED-CACHED", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_semtrans_arg_of_pred_cached_int", "CLEAR-SEMTRANS-ARG-OF-PRED-CACHED-INT", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_semtrans_arg_of_pred_cached_int", "REMOVE-SEMTRANS-ARG-OF-PRED-CACHED-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "semtrans_arg_of_pred_cached_int_internal", "SEMTRANS-ARG-OF-PRED-CACHED-INT-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "semtrans_arg_of_pred_cached_int", "SEMTRANS-ARG-OF-PRED-CACHED-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "term_from_nl_assertion", "TERM-FROM-NL-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_pos_arg_of_pred_cached", "CLEAR-POS-ARG-OF-PRED-CACHED", 0, 0, false );
    SubLFiles.declareFunction( me, "preds_to_pos_args", "PREDS-TO-POS-ARGS", 0, 0, false );
    SubLFiles.declareFunction( me, "pos_arg_of_pred_cached", "POS-ARG-OF-PRED-CACHED", 1, 0, false );
    SubLFiles.declareFunction( me, "get_pos_arg_of_pred", "GET-POS-ARG-OF-PRED", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_get_pos_arg_of_pred_int", "CLEAR-GET-POS-ARG-OF-PRED-INT", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_get_pos_arg_of_pred_int", "REMOVE-GET-POS-ARG-OF-PRED-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "get_pos_arg_of_pred_int_internal", "GET-POS-ARG-OF-PRED-INT-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "get_pos_arg_of_pred_int", "GET-POS-ARG-OF-PRED-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "frame_arg_of_pred_cached", "FRAME-ARG-OF-PRED-CACHED", 1, 1, false );
    SubLFiles.declareFunction( me, "clear_frame_arg_of_pred_cached_int", "CLEAR-FRAME-ARG-OF-PRED-CACHED-INT", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_frame_arg_of_pred_cached_int", "REMOVE-FRAME-ARG-OF-PRED-CACHED-INT", 1, 1, false );
    SubLFiles.declareFunction( me, "frame_arg_of_pred_cached_int_internal", "FRAME-ARG-OF-PRED-CACHED-INT-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "frame_arg_of_pred_cached_int", "FRAME-ARG-OF-PRED-CACHED-INT", 1, 1, false );
    SubLFiles.declareFunction( me, "wu_arg_of_pred_cached", "WU-ARG-OF-PRED-CACHED", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_wu_arg_of_pred_cached_int", "CLEAR-WU-ARG-OF-PRED-CACHED-INT", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_wu_arg_of_pred_cached_int", "REMOVE-WU-ARG-OF-PRED-CACHED-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "wu_arg_of_pred_cached_int_internal", "WU-ARG-OF-PRED-CACHED-INT-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "wu_arg_of_pred_cached_int", "WU-ARG-OF-PRED-CACHED-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "sense_arg_of_pred_cached", "SENSE-ARG-OF-PRED-CACHED", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_sense_arg_of_pred_cached_int", "CLEAR-SENSE-ARG-OF-PRED-CACHED-INT", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_sense_arg_of_pred_cached_int", "REMOVE-SENSE-ARG-OF-PRED-CACHED-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "sense_arg_of_pred_cached_int_internal", "SENSE-ARG-OF-PRED-CACHED-INT-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "sense_arg_of_pred_cached_int", "SENSE-ARG-OF-PRED-CACHED-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "stringlist_args_of_pred_cached", "STRINGLIST-ARGS-OF-PRED-CACHED", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_stringlist_args_of_pred_cached_int", "CLEAR-STRINGLIST-ARGS-OF-PRED-CACHED-INT", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_stringlist_args_of_pred_cached_int", "REMOVE-STRINGLIST-ARGS-OF-PRED-CACHED-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "stringlist_args_of_pred_cached_int_internal", "STRINGLIST-ARGS-OF-PRED-CACHED-INT-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "stringlist_args_of_pred_cached_int", "STRINGLIST-ARGS-OF-PRED-CACHED-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "get_string_list_from_formula", "GET-STRING-LIST-FROM-FORMULA", 2, 0, false );
    SubLFiles.declareFunction( me, "get_leading_strings_and_following_strings_argnums", "GET-LEADING-STRINGS-AND-FOLLOWING-STRINGS-ARGNUMS", 1, 0, false );
    SubLFiles.declareFunction( me, "get_leading_strings_from_formula", "GET-LEADING-STRINGS-FROM-FORMULA", 1, 0, false );
    SubLFiles.declareFunction( me, "get_following_strings_from_formula", "GET-FOLLOWING-STRINGS-FROM-FORMULA", 1, 0, false );
    SubLFiles.declareFunction( me, "get_leading_strings_and_following_strings", "GET-LEADING-STRINGS-AND-FOLLOWING-STRINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "parse_denot_formula", "PARSE-DENOT-FORMULA", 1, 0, false );
    SubLFiles.declareFunction( me, "denot_formula_p", "DENOT-FORMULA-P", 1, 0, false );
    SubLFiles.declareFunction( me, "parse_lexical_semantic_formula", "PARSE-LEXICAL-SEMANTIC-FORMULA", 1, 1, false );
    SubLFiles.declareFunction( me, "lexical_semantic_formula_genl_posP", "LEXICAL-SEMANTIC-FORMULA-GENL-POS?", 2, 1, false );
    SubLFiles.declareFunction( me, "lexical_semantic_formula_matches_head_stringXposP", "LEXICAL-SEMANTIC-FORMULA-MATCHES-HEAD-STRING&POS?", 3, 1, false );
    SubLFiles.declareFunction( me, "assemble_denot_strings", "ASSEMBLE-DENOT-STRINGS", 3, 0, false );
    SubLFiles.declareFunction( me, "proper_noun_form_of_pred", "PROPER-NOUN-FORM-OF-PRED", 1, 0, false );
    SubLFiles.declareFunction( me, "common_noun_form_of_pred", "COMMON-NOUN-FORM-OF-PRED", 1, 0, false );
    SubLFiles.declareFunction( me, "proper_to_common_pred_map", "PROPER-TO-COMMON-PRED-MAP", 0, 0, false );
    SubLFiles.declareFunction( me, "common_noun_form_of_pos", "COMMON-NOUN-FORM-OF-POS", 1, 0, false );
    SubLFiles.declareFunction( me, "noun_form_singular", "NOUN-FORM-SINGULAR", 1, 1, false );
    SubLFiles.declareFunction( me, "set_noun_form_singular", "SET-NOUN-FORM-SINGULAR", 3, 0, false );
    SubLFiles.declareFunction( me, "noun_form_plural", "NOUN-FORM-PLURAL", 1, 1, false );
    SubLFiles.declareFunction( me, "set_noun_form_plural", "SET-NOUN-FORM-PLURAL", 3, 0, false );
    SubLFiles.declareFunction( me, "noun_form_mass", "NOUN-FORM-MASS", 1, 1, false );
    SubLFiles.declareFunction( me, "set_noun_form_mass", "SET-NOUN-FORM-MASS", 3, 0, false );
    SubLFiles.declareFunction( me, "proper_noun_form_singular", "PROPER-NOUN-FORM-SINGULAR", 1, 1, false );
    SubLFiles.declareFunction( me, "set_proper_noun_form_singular", "SET-PROPER-NOUN-FORM-SINGULAR", 3, 0, false );
    SubLFiles.declareFunction( me, "proper_noun_form_plural", "PROPER-NOUN-FORM-PLURAL", 1, 1, false );
    SubLFiles.declareFunction( me, "set_proper_noun_form_plural", "SET-PROPER-NOUN-FORM-PLURAL", 3, 0, false );
    SubLFiles.declareFunction( me, "proper_noun_form_mass", "PROPER-NOUN-FORM-MASS", 1, 1, false );
    SubLFiles.declareFunction( me, "set_proper_noun_form_mass", "SET-PROPER-NOUN-FORM-MASS", 3, 0, false );
    SubLFiles.declareFunction( me, "ag_noun_form_singular", "AG-NOUN-FORM-SINGULAR", 1, 1, false );
    SubLFiles.declareFunction( me, "set_ag_noun_form_singular", "SET-AG-NOUN-FORM-SINGULAR", 3, 0, false );
    SubLFiles.declareFunction( me, "ag_noun_form_plural", "AG-NOUN-FORM-PLURAL", 1, 1, false );
    SubLFiles.declareFunction( me, "set_ag_noun_form_plural", "SET-AG-NOUN-FORM-PLURAL", 3, 0, false );
    SubLFiles.declareFunction( me, "ag_noun_form_mass", "AG-NOUN-FORM-MASS", 1, 1, false );
    SubLFiles.declareFunction( me, "set_ag_noun_form_mass", "SET-AG-NOUN-FORM-MASS", 3, 0, false );
    SubLFiles.declareFunction( me, "verb_form_infinitive", "VERB-FORM-INFINITIVE", 1, 1, false );
    SubLFiles.declareFunction( me, "set_verb_form_infinitive", "SET-VERB-FORM-INFINITIVE", 3, 0, false );
    SubLFiles.declareFunction( me, "verb_form_third_sing", "VERB-FORM-THIRD-SING", 1, 1, false );
    SubLFiles.declareFunction( me, "set_verb_form_third_sing", "SET-VERB-FORM-THIRD-SING", 3, 0, false );
    SubLFiles.declareFunction( me, "verb_form_progressive", "VERB-FORM-PROGRESSIVE", 1, 1, false );
    SubLFiles.declareFunction( me, "set_verb_form_progressive", "SET-VERB-FORM-PROGRESSIVE", 3, 0, false );
    SubLFiles.declareFunction( me, "verb_form_past", "VERB-FORM-PAST", 1, 1, false );
    SubLFiles.declareFunction( me, "set_verb_form_past", "SET-VERB-FORM-PAST", 3, 0, false );
    SubLFiles.declareFunction( me, "verb_form_perfect", "VERB-FORM-PERFECT", 1, 1, false );
    SubLFiles.declareFunction( me, "set_verb_form_perfect", "SET-VERB-FORM-PERFECT", 3, 0, false );
    SubLFiles.declareFunction( me, "verb_form_pres_participle", "VERB-FORM-PRES-PARTICIPLE", 1, 1, false );
    SubLFiles.declareFunction( me, "set_verb_form_pres_participle", "SET-VERB-FORM-PRES-PARTICIPLE", 3, 0, false );
    SubLFiles.declareFunction( me, "adjective_form_regular", "ADJECTIVE-FORM-REGULAR", 1, 1, false );
    SubLFiles.declareFunction( me, "set_adjective_form_regular", "SET-ADJECTIVE-FORM-REGULAR", 3, 0, false );
    SubLFiles.declareFunction( me, "adjective_form_comparative", "ADJECTIVE-FORM-COMPARATIVE", 1, 1, false );
    SubLFiles.declareFunction( me, "set_adjective_form_comparative", "SET-ADJECTIVE-FORM-COMPARATIVE", 3, 0, false );
    SubLFiles.declareFunction( me, "adjective_form_superlative", "ADJECTIVE-FORM-SUPERLATIVE", 1, 1, false );
    SubLFiles.declareFunction( me, "set_adjective_form_superlative", "SET-ADJECTIVE-FORM-SUPERLATIVE", 3, 0, false );
    SubLFiles.declareFunction( me, "adjective_form_nongradable", "ADJECTIVE-FORM-NONGRADABLE", 1, 1, false );
    SubLFiles.declareFunction( me, "set_adjective_form_nongradable", "SET-ADJECTIVE-FORM-NONGRADABLE", 3, 0, false );
    SubLFiles.declareFunction( me, "adverb_form_regular", "ADVERB-FORM-REGULAR", 1, 1, false );
    SubLFiles.declareFunction( me, "set_adverb_form_regular", "SET-ADVERB-FORM-REGULAR", 3, 0, false );
    SubLFiles.declareFunction( me, "adverb_form_comparative", "ADVERB-FORM-COMPARATIVE", 1, 1, false );
    SubLFiles.declareFunction( me, "set_adverb_form_comparative", "SET-ADVERB-FORM-COMPARATIVE", 3, 0, false );
    SubLFiles.declareFunction( me, "adverb_form_superlative", "ADVERB-FORM-SUPERLATIVE", 1, 1, false );
    SubLFiles.declareFunction( me, "set_adverb_form_superlative", "SET-ADVERB-FORM-SUPERLATIVE", 3, 0, false );
    SubLFiles.declareFunction( me, "sentence_tokenize", "SENTENCE-TOKENIZE", 2, 4, false );
    SubLFiles.declareFunction( me, "interval_tokens_sequentialize", "INTERVAL-TOKENS-SEQUENTIALIZE", 2, 0, false );
    SubLFiles.declareFunction( me, "interval_tokens_split", "INTERVAL-TOKENS-SPLIT", 2, 0, false );
    SubLFiles.declareFunction( me, "word_count", "WORD-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "full_word_count", "FULL-WORD-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "denotation_count", "DENOTATION-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "nl_pred_count", "NL-PRED-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "nl_statistics", "NL-STATISTICS", 0, 2, false );
    SubLFiles.declareFunction( me, "nl_stats_file_path", "NL-STATS-FILE-PATH", 0, 0, false );
    SubLFiles.declareFunction( me, "count_and_print_nl_preds", "COUNT-AND-PRINT-NL-PREDS", 2, 1, false );
    SubLFiles.declareFunction( me, "count_and_print_nl_preds_int", "COUNT-AND-PRINT-NL-PREDS-INT", 5, 0, false );
    SubLFiles.declareFunction( me, "categorize_nl_preds", "CATEGORIZE-NL-PREDS", 0, 3, false );
    SubLFiles.declareFunction( me, "fort_lexification_extent", "FORT-LEXIFICATION-EXTENT", 0, 0, false );
    SubLFiles.declareFunction( me, "unit_with_no_nlP", "UNIT-WITH-NO-NL?", 1, 1, false );
    SubLFiles.declareFunction( me, "parse_templates_for_term", "PARSE-TEMPLATES-FOR-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "all_lexifications_for_term", "ALL-LEXIFICATIONS-FOR-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "proper_lexifications_for_term", "PROPER-LEXIFICATIONS-FOR-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "lexifications_for_term", "LEXIFICATIONS-FOR-TERM", 1, 3, false );
    SubLFiles.declareFunction( me, "clear_cached_lexifications_for_term", "CLEAR-CACHED-LEXIFICATIONS-FOR-TERM", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_cached_lexifications_for_term", "REMOVE-CACHED-LEXIFICATIONS-FOR-TERM", 1, 4, false );
    SubLFiles.declareFunction( me, "cached_lexifications_for_term_internal", "CACHED-LEXIFICATIONS-FOR-TERM-INTERNAL", 5, 0, false );
    SubLFiles.declareFunction( me, "cached_lexifications_for_term", "CACHED-LEXIFICATIONS-FOR-TERM", 1, 4, false );
    SubLFiles.declareFunction( me, "gtqs_lexifications", "GTQS-LEXIFICATIONS", 4, 1, false );
    SubLFiles.declareFunction( me, "common_term_in_lexificationsP", "COMMON-TERM-IN-LEXIFICATIONS?", 1, 0, false );
    SubLFiles.declareFunction( me, "lexifications_of_common_lexification_term", "LEXIFICATIONS-OF-COMMON-LEXIFICATION-TERM", 1, 1, false );
    SubLFiles.declareFunction( me, "gen_string_assertions_for_term", "GEN-STRING-ASSERTIONS-FOR-TERM", 1, 2, false );
    SubLFiles.declareFunction( me, "preferred_lexifications_for_term", "PREFERRED-LEXIFICATIONS-FOR-TERM", 1, 3, false );
    SubLFiles.declareFunction( me, "get_preferred_lexifications_via_indexing", "GET-PREFERRED-LEXIFICATIONS-VIA-INDEXING", 2, 0, false );
    SubLFiles.declareFunction( me, "prefer_lexificationP", "PREFER-LEXIFICATION?", 2, 0, false );
    SubLFiles.declareFunction( me, "smart_to_capitalizeP", "SMART-TO-CAPITALIZE?", 1, 0, false );
    SubLFiles.declareFunction( me, "term_phrases_constraint_compatible_with_nl_predsP", "TERM-PHRASES-CONSTRAINT-COMPATIBLE-WITH-NL-PREDS?", 2, 0, false );
    SubLFiles.declareFunction( me, "term_phrases_constraint_implied_by_nl_predsP", "TERM-PHRASES-CONSTRAINT-IMPLIED-BY-NL-PREDS?", 2, 0, false );
    SubLFiles.declareFunction( me, "lexification_sentence_from_preferred_lexification_assertion", "LEXIFICATION-SENTENCE-FROM-PREFERRED-LEXIFICATION-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( me, "loose_lexifications_for_term", "LOOSE-LEXIFICATIONS-FOR-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "stub_lexifications_for_term", "STUB-LEXIFICATIONS-FOR-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "first_termstring_phrase", "FIRST-TERMSTRING-PHRASE", 1, 0, false );
    SubLFiles.declareFunction( me, "denotation_lexifications_for_term", "DENOTATION-LEXIFICATIONS-FOR-TERM", 1, 1, false );
    SubLFiles.declareFunction( me, "semtrans_lexifications_for_term", "SEMTRANS-LEXIFICATIONS-FOR-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "units_with_no_nl", "UNITS-WITH-NO-NL", 1, 1, false );
    SubLFiles.declareFunction( me, "verbs_need_st", "VERBS-NEED-ST", 0, 0, false );
    SubLFiles.declareFunction( me, "verbs_need_sf", "VERBS-NEED-SF", 0, 0, false );
    SubLFiles.declareFunction( me, "which_words_will_my_rule_affectP", "WHICH-WORDS-WILL-MY-RULE-AFFECT?", 1, 1, false );
    SubLFiles.declareFunction( me, "find_missing_lexicon_strings", "FIND-MISSING-LEXICON-STRINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "find_missing_pos_forms", "FIND-MISSING-POS-FORMS", 1, 1, false );
    SubLFiles.declareFunction( me, "find_equalp_names", "FIND-EQUALP-NAMES", 0, 0, false );
    SubLFiles.declareFunction( me, "find_control_chars_in_names", "FIND-CONTROL-CHARS-IN-NAMES", 0, 0, false );
    SubLFiles.declareFunction( me, "show_terms_missing_generation_assertions", "SHOW-TERMS-MISSING-GENERATION-ASSERTIONS", 0, 2, false );
    SubLFiles.declareFunction( me, "missing_generation_assertion", "MISSING-GENERATION-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( me, "preds_of_string", "PREDS-OF-STRING", 1, 3, false );
    SubLFiles.declareFunction( me, "namestring_preds_of_string", "NAMESTRING-PREDS-OF-STRING", 1, 2, false );
    SubLFiles.declareFunction( me, "ordered_lexification_preds_of_string", "ORDERED-LEXIFICATION-PREDS-OF-STRING", 1, 3, false );
    SubLFiles.declareFunction( me, "ordered_preds_of_string", "ORDERED-PREDS-OF-STRING", 1, 2, false );
    SubLFiles.declareFunction( me, "word_variants", "WORD-VARIANTS", 1, 4, false );
    SubLFiles.declareFunction( me, "ordered_word_variants", "ORDERED-WORD-VARIANTS", 1, 4, false );
    SubLFiles.declareFunction( me, "find_word_root", "FIND-WORD-ROOT", 1, 4, false );
    SubLFiles.declareFunction( me, "word_has_part_of_speechP", "WORD-HAS-PART-OF-SPEECH?", 2, 1, false );
    SubLFiles.declareFunction( me, "word_has_speech_partP", "WORD-HAS-SPEECH-PART?", 2, 2, false );
    SubLFiles.declareFunction( me, "is_determinerP", "IS-DETERMINER?", 1, 2, false );
    SubLFiles.declareFunction( me, "strip_determiner", "STRIP-DETERMINER", 1, 1, false );
    SubLFiles.declareFunction( me, "wh_wordP", "WH-WORD?", 1, 0, false );
    SubLFiles.declareFunction( me, "first_name_p", "FIRST-NAME-P", 1, 0, false );
    SubLFiles.declareFunction( me, "first_name_gender", "FIRST-NAME-GENDER", 1, 0, false );
    SubLFiles.declareFunction( me, "human_male_given_name_p", "HUMAN-MALE-GIVEN-NAME-P", 1, 0, false );
    SubLFiles.declareFunction( me, "human_female_given_name_p", "HUMAN-FEMALE-GIVEN-NAME-P", 1, 0, false );
    SubLFiles.declareFunction( me, "construct_word_unit", "CONSTRUCT-WORD-UNIT", 2, 1, false );
    SubLFiles.declareFunction( me, "derived_word_affix", "DERIVED-WORD-AFFIX", 1, 1, false );
    SubLFiles.declareFunction( me, "derived_word_affix_memoized_internal", "DERIVED-WORD-AFFIX-MEMOIZED-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "derived_word_affix_memoized", "DERIVED-WORD-AFFIX-MEMOIZED", 2, 0, false );
    SubLFiles.declareFunction( me, "prefix_unit_p", "PREFIX-UNIT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "denots_of_string_stop_word", "DENOTS-OF-STRING-STOP-WORD", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_stop_word_closed_class_exception", "CLEAR-STOP-WORD-CLOSED-CLASS-EXCEPTION", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_stop_word_closed_class_exception", "REMOVE-STOP-WORD-CLOSED-CLASS-EXCEPTION", 1, 1, false );
    SubLFiles.declareFunction( me, "stop_word_closed_class_exception_internal", "STOP-WORD-CLOSED-CLASS-EXCEPTION-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "stop_word_closed_class_exception", "STOP-WORD-CLOSED-CLASS-EXCEPTION", 1, 1, false );
    SubLFiles.declareFunction( me, "head_keyword_for_frame", "HEAD-KEYWORD-FOR-FRAME", 1, 0, false );
    SubLFiles.declareFunction( me, "argument_keywords_for_frame", "ARGUMENT-KEYWORDS-FOR-FRAME", 1, 0, false );
    SubLFiles.declareFunction( me, "extract_head_type_and_argument_roles_from_semtrans_template", "EXTRACT-HEAD-TYPE-AND-ARGUMENT-ROLES-FROM-SEMTRANS-TEMPLATE", 2, 0, false );
    SubLFiles.declareFunction( me, "construct_semtrans_template_from_head_type_and_argument_roles", "CONSTRUCT-SEMTRANS-TEMPLATE-FROM-HEAD-TYPE-AND-ARGUMENT-ROLES", 3, 0, false );
    SubLFiles.declareFunction( me, "language_of_lexicon", "LANGUAGE-OF-LEXICON", 1, 0, false );
    SubLFiles.declareFunction( me, "language_of_lexicon_internal", "LANGUAGE-OF-LEXICON-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_lexicons_to_languages", "CLEAR-LEXICONS-TO-LANGUAGES", 0, 0, false );
    SubLFiles.declareFunction( me, "initialize_lexicons_to_languages", "INITIALIZE-LEXICONS-TO-LANGUAGES", 0, 0, false );
    SubLFiles.declareFunction( me, "maybe_initialize_lexicons_to_languages", "MAYBE-INITIALIZE-LEXICONS-TO-LANGUAGES", 0, 0, false );
    SubLFiles.declareFunction( me, "lexical_assertion_of_lexiconP", "LEXICAL-ASSERTION-OF-LEXICON?", 3, 0, false );
    SubLFiles.declareFunction( me, "clear_lexical_mt_for_language", "CLEAR-LEXICAL-MT-FOR-LANGUAGE", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_lexical_mt_for_language", "REMOVE-LEXICAL-MT-FOR-LANGUAGE", 1, 0, false );
    SubLFiles.declareFunction( me, "lexical_mt_for_language_internal", "LEXICAL-MT-FOR-LANGUAGE-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "lexical_mt_for_language", "LEXICAL-MT-FOR-LANGUAGE", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_get_language_for_code", "CLEAR-GET-LANGUAGE-FOR-CODE", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_get_language_for_code", "REMOVE-GET-LANGUAGE-FOR-CODE", 1, 0, false );
    SubLFiles.declareFunction( me, "get_language_for_code_internal", "GET-LANGUAGE-FOR-CODE-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "get_language_for_code", "GET-LANGUAGE-FOR-CODE", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_get_code_for_language", "CLEAR-GET-CODE-FOR-LANGUAGE", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_get_code_for_language", "REMOVE-GET-CODE-FOR-LANGUAGE", 1, 0, false );
    SubLFiles.declareFunction( me, "get_code_for_language_internal", "GET-CODE-FOR-LANGUAGE-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "get_code_for_language", "GET-CODE-FOR-LANGUAGE", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_lexicon_utilities_file()
  {
    $nonstandard_nominal_preds$ = SubLFiles.deflexical( "*NONSTANDARD-NOMINAL-PREDS*", $list0 );
    $preds_of_pos_cached_caching_state$ = SubLFiles.deflexical( "*PREDS-OF-POS-CACHED-CACHING-STATE*", NIL );
    $preds_licensed_by_pos_cached_caching_state$ = SubLFiles.deflexical( "*PREDS-LICENSED-BY-POS-CACHED-CACHING-STATE*", NIL );
    $spp_more_basicP_cached_caching_state$ = SubLFiles.deflexical( "*SPP-MORE-BASIC?-CACHED-CACHING-STATE*", NIL );
    $det_denot_is_scalar_intervalP_cached_caching_state$ = SubLFiles.deflexical( "*DET-DENOT-IS-SCALAR-INTERVAL?-CACHED-CACHING-STATE*", NIL );
    $bar_level_cached_caching_state$ = SubLFiles.deflexical( "*BAR-LEVEL-CACHED-CACHING-STATE*", NIL );
    $pos_of_cat_cached_caching_state$ = SubLFiles.deflexical( "*POS-OF-CAT-CACHED-CACHING-STATE*", NIL );
    $denotatum_arg_of_pred_cached_int_caching_state$ = SubLFiles.deflexical( "*DENOTATUM-ARG-OF-PRED-CACHED-INT-CACHING-STATE*", NIL );
    $semtrans_arg_of_pred_cached_int_caching_state$ = SubLFiles.deflexical( "*SEMTRANS-ARG-OF-PRED-CACHED-INT-CACHING-STATE*", NIL );
    $preds_to_pos_args$ = SubLFiles.deflexical( "*PREDS-TO-POS-ARGS*", misc_utilities.uninitialized() );
    $get_pos_arg_of_pred_int_caching_state$ = SubLFiles.deflexical( "*GET-POS-ARG-OF-PRED-INT-CACHING-STATE*", NIL );
    $frame_arg_of_pred_cached_int_caching_state$ = SubLFiles.deflexical( "*FRAME-ARG-OF-PRED-CACHED-INT-CACHING-STATE*", NIL );
    $wu_arg_of_pred_cached_int_caching_state$ = SubLFiles.deflexical( "*WU-ARG-OF-PRED-CACHED-INT-CACHING-STATE*", NIL );
    $sense_arg_of_pred_cached_int_caching_state$ = SubLFiles.deflexical( "*SENSE-ARG-OF-PRED-CACHED-INT-CACHING-STATE*", NIL );
    $stringlist_args_of_pred_cached_int_caching_state$ = SubLFiles.deflexical( "*STRINGLIST-ARGS-OF-PRED-CACHED-INT-CACHING-STATE*", NIL );
    $proper_to_common_pred_map$ = SubLFiles.deflexical( "*PROPER-TO-COMMON-PRED-MAP*", $list137 );
    $non_categorizing_nl_pred_types$ = SubLFiles.deflexical( "*NON-CATEGORIZING-NL-PRED-TYPES*", $list193 );
    $lexification_pred_types$ = SubLFiles.defconstant( "*LEXIFICATION-PRED-TYPES*", $list210 );
    $cached_lexifications_for_term_caching_state$ = SubLFiles.deflexical( "*CACHED-LEXIFICATIONS-FOR-TERM-CACHING-STATE*", NIL );
    $stop_word_closed_class_exceptions$ = SubLFiles.deflexical( "*STOP-WORD-CLOSED-CLASS-EXCEPTIONS*", NIL );
    $stop_word_closed_class_exception_caching_state$ = SubLFiles.deflexical( "*STOP-WORD-CLOSED-CLASS-EXCEPTION-CACHING-STATE*", NIL );
    $semtrans_frame_keywords$ = SubLFiles.deflexical( "*SEMTRANS-FRAME-KEYWORDS*", $list300 );
    $lexicons_to_languages$ = SubLFiles.deflexical( "*LEXICONS-TO-LANGUAGES*", $kw306$UNINITIALIZED );
    $lexical_mt_for_language_caching_state$ = SubLFiles.deflexical( "*LEXICAL-MT-FOR-LANGUAGE-CACHING-STATE*", NIL );
    $get_language_for_code_caching_state$ = SubLFiles.deflexical( "*GET-LANGUAGE-FOR-CODE-CACHING-STATE*", NIL );
    $get_code_for_language_caching_state$ = SubLFiles.deflexical( "*GET-CODE-FOR-LANGUAGE-CACHING-STATE*", NIL );
    return NIL;
  }

  public static SubLObject setup_lexicon_utilities_file()
  {
    memoization_state.note_globally_cached_function( $sym16$PREDS_OF_POS_CACHED );
    memoization_state.note_globally_cached_function( $sym27$PREDS_LICENSED_BY_POS_CACHED );
    memoization_state.note_globally_cached_function( $sym56$SPP_MORE_BASIC__CACHED );
    memoization_state.note_globally_cached_function( $sym68$DET_DENOT_IS_SCALAR_INTERVAL__CACHED );
    memoization_state.note_globally_cached_function( $sym72$BAR_LEVEL_CACHED );
    memoization_state.note_globally_cached_function( $sym82$POS_OF_CAT_CACHED );
    memoization_state.note_globally_cached_function( $sym98$DENOTATUM_ARG_OF_PRED_CACHED_INT );
    memoization_state.note_globally_cached_function( $sym101$SEMTRANS_ARG_OF_PRED_CACHED_INT );
    memoization_state.note_globally_cached_function( $sym108$GET_POS_ARG_OF_PRED_INT );
    memoization_state.note_globally_cached_function( $sym110$FRAME_ARG_OF_PRED_CACHED_INT );
    memoization_state.note_globally_cached_function( $sym115$WU_ARG_OF_PRED_CACHED_INT );
    memoization_state.note_globally_cached_function( $sym118$SENSE_ARG_OF_PRED_CACHED_INT );
    memoization_state.note_globally_cached_function( $sym121$STRINGLIST_ARGS_OF_PRED_CACHED_INT );
    memoization_state.note_globally_cached_function( $sym212$CACHED_LEXIFICATIONS_FOR_TERM );
    memoization_state.note_memoized_function( $sym292$DERIVED_WORD_AFFIX_MEMOIZED );
    memoization_state.note_globally_cached_function( $sym297$STOP_WORD_CLOSED_CLASS_EXCEPTION );
    utilities_macros.note_funcall_helper_function( $sym307$CLEAR_LEXICONS_TO_LANGUAGES );
    memoization_state.note_globally_cached_function( $sym312$LEXICAL_MT_FOR_LANGUAGE );
    access_macros.register_external_symbol( $sym312$LEXICAL_MT_FOR_LANGUAGE );
    memoization_state.note_globally_cached_function( $sym319$GET_LANGUAGE_FOR_CODE );
    access_macros.register_external_symbol( $sym319$GET_LANGUAGE_FOR_CODE );
    memoization_state.note_globally_cached_function( $sym324$GET_CODE_FOR_LANGUAGE );
    access_macros.register_external_symbol( $sym324$GET_CODE_FOR_LANGUAGE );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_lexicon_utilities_file();
  }

  @Override
  public void initializeVariables()
  {
    init_lexicon_utilities_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_lexicon_utilities_file();
  }
  static
  {
    me = new lexicon_utilities();
    $nonstandard_nominal_preds$ = null;
    $preds_of_pos_cached_caching_state$ = null;
    $preds_licensed_by_pos_cached_caching_state$ = null;
    $spp_more_basicP_cached_caching_state$ = null;
    $det_denot_is_scalar_intervalP_cached_caching_state$ = null;
    $bar_level_cached_caching_state$ = null;
    $pos_of_cat_cached_caching_state$ = null;
    $denotatum_arg_of_pred_cached_int_caching_state$ = null;
    $semtrans_arg_of_pred_cached_int_caching_state$ = null;
    $preds_to_pos_args$ = null;
    $get_pos_arg_of_pred_int_caching_state$ = null;
    $frame_arg_of_pred_cached_int_caching_state$ = null;
    $wu_arg_of_pred_cached_int_caching_state$ = null;
    $sense_arg_of_pred_cached_int_caching_state$ = null;
    $stringlist_args_of_pred_cached_int_caching_state$ = null;
    $proper_to_common_pred_map$ = null;
    $non_categorizing_nl_pred_types$ = null;
    $lexification_pred_types$ = null;
    $cached_lexifications_for_term_caching_state$ = null;
    $stop_word_closed_class_exceptions$ = null;
    $stop_word_closed_class_exception_caching_state$ = null;
    $semtrans_frame_keywords$ = null;
    $lexicons_to_languages$ = null;
    $lexical_mt_for_language_caching_state$ = null;
    $get_language_for_code_caching_state$ = null;
    $get_code_for_language_caching_state$ = null;
    $list0 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "agentive-Mass" ) ), constant_handles.reader_make_constant_shell( makeString( "agentive-Pl" ) ), constant_handles
        .reader_make_constant_shell( makeString( "agentive-Sg" ) ), constant_handles.reader_make_constant_shell( makeString( "gerund" ) ) );
    $str1$MWW = makeString( "MWW" );
    $sym2$CYCL_DENOTATIONAL_TERM_P = makeSymbol( "CYCL-DENOTATIONAL-TERM-P" );
    $sym3$FORT_P = makeSymbol( "FORT-P" );
    $sym4$CAR = makeSymbol( "CAR" );
    $kw5$ANY = makeKeyword( "ANY" );
    $sym6$STRINGP = makeSymbol( "STRINGP" );
    $str7$_MWW = makeString( "-MWW" );
    $str8$_TheWord = makeString( "-TheWord" );
    $const9$GeneralEnglishMt = constant_handles.reader_make_constant_shell( makeString( "GeneralEnglishMt" ) );
    $kw10$MONOTONIC = makeKeyword( "MONOTONIC" );
    $kw11$DENOT = makeKeyword( "DENOT" );
    $str12$ = makeString( "" );
    $kw13$RELATED = makeKeyword( "RELATED" );
    $const14$denotation = constant_handles.reader_make_constant_shell( makeString( "denotation" ) );
    $const15$subcatFrame = constant_handles.reader_make_constant_shell( makeString( "subcatFrame" ) );
    $sym16$PREDS_OF_POS_CACHED = makeSymbol( "PREDS-OF-POS-CACHED" );
    $sym17$_PREDS_OF_POS_CACHED_CACHING_STATE_ = makeSymbol( "*PREDS-OF-POS-CACHED-CACHING-STATE*" );
    $const18$speechPartPreds = constant_handles.reader_make_constant_shell( makeString( "speechPartPreds" ) );
    $const19$CountNoun = constant_handles.reader_make_constant_shell( makeString( "CountNoun" ) );
    $const20$MassNoun = constant_handles.reader_make_constant_shell( makeString( "MassNoun" ) );
    $const21$AgentiveNoun = constant_handles.reader_make_constant_shell( makeString( "AgentiveNoun" ) );
    $const22$ProperMassNoun = constant_handles.reader_make_constant_shell( makeString( "ProperMassNoun" ) );
    $const23$ProperCountNoun = constant_handles.reader_make_constant_shell( makeString( "ProperCountNoun" ) );
    $const24$Verb = constant_handles.reader_make_constant_shell( makeString( "Verb" ) );
    $const25$Adjective = constant_handles.reader_make_constant_shell( makeString( "Adjective" ) );
    $const26$Adverb = constant_handles.reader_make_constant_shell( makeString( "Adverb" ) );
    $sym27$PREDS_LICENSED_BY_POS_CACHED = makeSymbol( "PREDS-LICENSED-BY-POS-CACHED" );
    $const28$gerund = constant_handles.reader_make_constant_shell( makeString( "gerund" ) );
    $sym29$SPP_MORE_BASIC_ = makeSymbol( "SPP-MORE-BASIC?" );
    $sym30$_PREDS_LICENSED_BY_POS_CACHED_CACHING_STATE_ = makeSymbol( "*PREDS-LICENSED-BY-POS-CACHED-CACHING-STATE*" );
    $int31$32 = makeInteger( 32 );
    $sym32$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const33$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $kw34$DEPTH = makeKeyword( "DEPTH" );
    $kw35$STACK = makeKeyword( "STACK" );
    $kw36$QUEUE = makeKeyword( "QUEUE" );
    $sym37$RELEVANT_SBHL_TV_IS_GENERAL_TV = makeSymbol( "RELEVANT-SBHL-TV-IS-GENERAL-TV" );
    $kw38$ERROR = makeKeyword( "ERROR" );
    $str39$_A_is_not_a__A = makeString( "~A is not a ~A" );
    $sym40$SBHL_TRUE_TV_P = makeSymbol( "SBHL-TRUE-TV-P" );
    $kw41$CERROR = makeKeyword( "CERROR" );
    $str42$continue_anyway = makeString( "continue anyway" );
    $kw43$WARN = makeKeyword( "WARN" );
    $str44$_A_is_not_a_valid__sbhl_type_erro = makeString( "~A is not a valid *sbhl-type-error-action* value" );
    $const45$genlPreds = constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) );
    $const46$paraphraseCoercionAllowedFrom = constant_handles.reader_make_constant_shell( makeString( "paraphraseCoercionAllowedFrom" ) );
    $str47$_A_is_neither_SET_P_nor_LISTP_ = makeString( "~A is neither SET-P nor LISTP." );
    $str48$attempting_to_bind_direction_link = makeString( "attempting to bind direction link variable, to NIL. macro body not executed." );
    $str49$Node__a_does_not_pass_sbhl_type_t = makeString( "Node ~a does not pass sbhl-type-test ~a~%" );
    $const50$regularSuffix = constant_handles.reader_make_constant_shell( makeString( "regularSuffix" ) );
    $sym51$SPEC_POS_PRED_ = makeSymbol( "SPEC-POS-PRED?" );
    $sym52$KBEQ = makeSymbol( "KBEQ" );
    $const53$termStrings = constant_handles.reader_make_constant_shell( makeString( "termStrings" ) );
    $const54$plural_Generic = constant_handles.reader_make_constant_shell( makeString( "plural-Generic" ) );
    $const55$nounStrings = constant_handles.reader_make_constant_shell( makeString( "nounStrings" ) );
    $sym56$SPP_MORE_BASIC__CACHED = makeSymbol( "SPP-MORE-BASIC?-CACHED" );
    $sym57$_SPP_MORE_BASIC__CACHED_CACHING_STATE_ = makeSymbol( "*SPP-MORE-BASIC?-CACHED-CACHING-STATE*" );
    $int58$64 = makeInteger( 64 );
    $list59 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "singular" ) ), constant_handles.reader_make_constant_shell( makeString( "infinitive" ) ) );
    $const60$Determiner_Definite = constant_handles.reader_make_constant_shell( makeString( "Determiner-Definite" ) );
    $const61$Definite_NLAttr = constant_handles.reader_make_constant_shell( makeString( "Definite-NLAttr" ) );
    $const62$PossessiveMarker = constant_handles.reader_make_constant_shell( makeString( "PossessiveMarker" ) );
    $const63$Determiner_Indefinite = constant_handles.reader_make_constant_shell( makeString( "Determiner-Indefinite" ) );
    $const64$Indefinite_NLAttr = constant_handles.reader_make_constant_shell( makeString( "Indefinite-NLAttr" ) );
    $const65$BareForm_NLAttr = constant_handles.reader_make_constant_shell( makeString( "BareForm-NLAttr" ) );
    $const66$Determiner = constant_handles.reader_make_constant_shell( makeString( "Determiner" ) );
    $const67$NumericalQuant_NLAttrFn = constant_handles.reader_make_constant_shell( makeString( "NumericalQuant-NLAttrFn" ) );
    $sym68$DET_DENOT_IS_SCALAR_INTERVAL__CACHED = makeSymbol( "DET-DENOT-IS-SCALAR-INTERVAL?-CACHED" );
    $const69$ScalarInterval = constant_handles.reader_make_constant_shell( makeString( "ScalarInterval" ) );
    $sym70$_DET_DENOT_IS_SCALAR_INTERVAL__CACHED_CACHING_STATE_ = makeSymbol( "*DET-DENOT-IS-SCALAR-INTERVAL?-CACHED-CACHING-STATE*" );
    $int71$128 = makeInteger( 128 );
    $sym72$BAR_LEVEL_CACHED = makeSymbol( "BAR-LEVEL-CACHED" );
    $const73$PhraseFn_Bar1 = constant_handles.reader_make_constant_shell( makeString( "PhraseFn-Bar1" ) );
    $const74$PhraseFn = constant_handles.reader_make_constant_shell( makeString( "PhraseFn" ) );
    $str75$barLevelOfPhraseType = makeString( "barLevelOfPhraseType" );
    $sym76$RELEVANT_PRED_IS_EVERYTHING = makeSymbol( "RELEVANT-PRED-IS-EVERYTHING" );
    $sym77$_LEVEL = makeSymbol( "?LEVEL" );
    $const78$barLevelOfPhraseType = constant_handles.reader_make_constant_shell( makeString( "barLevelOfPhraseType" ) );
    $list79 = ConsesLow.list( makeSymbol( "?LEVEL" ) );
    $str80$Couldn_t_determine_bar_level_for_ = makeString( "Couldn't determine bar-level for ~S in ~S. Using 1.~%" );
    $sym81$_BAR_LEVEL_CACHED_CACHING_STATE_ = makeSymbol( "*BAR-LEVEL-CACHED-CACHING-STATE*" );
    $sym82$POS_OF_CAT_CACHED = makeSymbol( "POS-OF-CAT-CACHED" );
    $list83 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "PhraseFn-Bar1" ) ), constant_handles.reader_make_constant_shell( makeString( "PhraseFn" ) ) );
    $const84$NounPhrase = constant_handles.reader_make_constant_shell( makeString( "NounPhrase" ) );
    $const85$Noun = constant_handles.reader_make_constant_shell( makeString( "Noun" ) );
    $const86$PrepositionalPhrase = constant_handles.reader_make_constant_shell( makeString( "PrepositionalPhrase" ) );
    $const87$Preposition = constant_handles.reader_make_constant_shell( makeString( "Preposition" ) );
    $const88$PossessivePhrase = constant_handles.reader_make_constant_shell( makeString( "PossessivePhrase" ) );
    $const89$NLSentence = constant_handles.reader_make_constant_shell( makeString( "NLSentence" ) );
    $const90$NLPhrase = constant_handles.reader_make_constant_shell( makeString( "NLPhrase" ) );
    $const91$NLWordForm = constant_handles.reader_make_constant_shell( makeString( "NLWordForm" ) );
    $sym92$_POS = makeSymbol( "?POS" );
    $const93$posOfPhraseType = constant_handles.reader_make_constant_shell( makeString( "posOfPhraseType" ) );
    $list94 = ConsesLow.list( makeSymbol( "?POS" ) );
    $sym95$_POS_OF_CAT_CACHED_CACHING_STATE_ = makeSymbol( "*POS-OF-CAT-CACHED-CACHING-STATE*" );
    $kw96$GAF = makeKeyword( "GAF" );
    $kw97$CLEARED = makeKeyword( "CLEARED" );
    $sym98$DENOTATUM_ARG_OF_PRED_CACHED_INT = makeSymbol( "DENOTATUM-ARG-OF-PRED-CACHED-INT" );
    $const99$denotatumArg = constant_handles.reader_make_constant_shell( makeString( "denotatumArg" ) );
    $sym100$_DENOTATUM_ARG_OF_PRED_CACHED_INT_CACHING_STATE_ = makeSymbol( "*DENOTATUM-ARG-OF-PRED-CACHED-INT-CACHING-STATE*" );
    $sym101$SEMTRANS_ARG_OF_PRED_CACHED_INT = makeSymbol( "SEMTRANS-ARG-OF-PRED-CACHED-INT" );
    $const102$semTransArg = constant_handles.reader_make_constant_shell( makeString( "semTransArg" ) );
    $sym103$_SEMTRANS_ARG_OF_PRED_CACHED_INT_CACHING_STATE_ = makeSymbol( "*SEMTRANS-ARG-OF-PRED-CACHED-INT-CACHING-STATE*" );
    $list104 = ConsesLow.cons( makeSymbol( "?PRED" ), makeSymbol( "?N" ) );
    $list105 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?PRED" ),
        constant_handles.reader_make_constant_shell( makeString( "NLSemanticPredicate" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) ), makeSymbol( "?PRED" ), makeSymbol(
            "?GENL-PRED" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "argIsa" ) ), makeSymbol( "?GENL-PRED" ), makeSymbol( "?N" ), constant_handles.reader_make_constant_shell(
                makeString( "SpeechPart" ) ) ) );
    $list106 = ConsesLow.list( makeKeyword( "INFERENCE-MODE" ), makeKeyword( "MINIMAL" ), makeKeyword( "ALLOW-INDETERMINATE-RESULTS?" ), NIL, makeKeyword( "ANSWER-LANGUAGE" ), makeKeyword( "HL" ) );
    $const107$InferencePSC = constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) );
    $sym108$GET_POS_ARG_OF_PRED_INT = makeSymbol( "GET-POS-ARG-OF-PRED-INT" );
    $sym109$_GET_POS_ARG_OF_PRED_INT_CACHING_STATE_ = makeSymbol( "*GET-POS-ARG-OF-PRED-INT-CACHING-STATE*" );
    $sym110$FRAME_ARG_OF_PRED_CACHED_INT = makeSymbol( "FRAME-ARG-OF-PRED-CACHED-INT" );
    $const111$SubcategorizationFrame = constant_handles.reader_make_constant_shell( makeString( "SubcategorizationFrame" ) );
    $sym112$SPEC_ = makeSymbol( "SPEC?" );
    $sym113$_FRAME_ARG_OF_PRED_CACHED_INT_CACHING_STATE_ = makeSymbol( "*FRAME-ARG-OF-PRED-CACHED-INT-CACHING-STATE*" );
    $const114$partOfSpeech = constant_handles.reader_make_constant_shell( makeString( "partOfSpeech" ) );
    $sym115$WU_ARG_OF_PRED_CACHED_INT = makeSymbol( "WU-ARG-OF-PRED-CACHED-INT" );
    $const116$LexicalWord = constant_handles.reader_make_constant_shell( makeString( "LexicalWord" ) );
    $sym117$_WU_ARG_OF_PRED_CACHED_INT_CACHING_STATE_ = makeSymbol( "*WU-ARG-OF-PRED-CACHED-INT-CACHING-STATE*" );
    $sym118$SENSE_ARG_OF_PRED_CACHED_INT = makeSymbol( "SENSE-ARG-OF-PRED-CACHED-INT" );
    $const119$Integer = constant_handles.reader_make_constant_shell( makeString( "Integer" ) );
    $sym120$_SENSE_ARG_OF_PRED_CACHED_INT_CACHING_STATE_ = makeSymbol( "*SENSE-ARG-OF-PRED-CACHED-INT-CACHING-STATE*" );
    $sym121$STRINGLIST_ARGS_OF_PRED_CACHED_INT = makeSymbol( "STRINGLIST-ARGS-OF-PRED-CACHED-INT" );
    $list122 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ListOfTypeFn" ) ), constant_handles.reader_make_constant_shell( makeString( "SubLString" ) ) );
    $list123 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ListOfTypeFn" ) ), constant_handles.reader_make_constant_shell( makeString( "ControlCharacterFreeString" ) ) );
    $list124 = ConsesLow.list( makeSymbol( "ARGNUM" ), makeSymbol( "COL" ) );
    $const125$argIsa = constant_handles.reader_make_constant_shell( makeString( "argIsa" ) );
    $list126 = ConsesLow.list( TWO_INTEGER, THREE_INTEGER );
    $sym127$_ = makeSymbol( "<" );
    $sym128$_STRINGLIST_ARGS_OF_PRED_CACHED_INT_CACHING_STATE_ = makeSymbol( "*STRINGLIST-ARGS-OF-PRED-CACHED-INT-CACHING-STATE*" );
    $sym129$_ = makeSymbol( ">" );
    $sym130$DENOT_FORMULA_P = makeSymbol( "DENOT-FORMULA-P" );
    $sym131$EL_FORMULA_P = makeSymbol( "EL-FORMULA-P" );
    $kw132$POS = makeKeyword( "POS" );
    $kw133$PRED = makeKeyword( "PRED" );
    $kw134$WU = makeKeyword( "WU" );
    $sym135$STRING_ = makeSymbol( "STRING=" );
    $str136$_ = makeString( " " );
    $list137 = ConsesLow.list( ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "pnSingular" ) ), constant_handles.reader_make_constant_shell( makeString( "singular" ) ) ), ConsesLow.cons(
        constant_handles.reader_make_constant_shell( makeString( "pnPlural" ) ), constant_handles.reader_make_constant_shell( makeString( "plural" ) ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell(
            makeString( "pnMassNumber" ) ), constant_handles.reader_make_constant_shell( makeString( "massNumber" ) ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "pnNonPlural-Generic" ) ),
                constant_handles.reader_make_constant_shell( makeString( "nonPlural-Generic" ) ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "properNounStrings" ) ), constant_handles
                    .reader_make_constant_shell( makeString( "commonNounStrings" ) ) ) );
    $const138$ProperNoun = constant_handles.reader_make_constant_shell( makeString( "ProperNoun" ) );
    $const139$CommonNoun = constant_handles.reader_make_constant_shell( makeString( "CommonNoun" ) );
    $const140$SimpleNoun = constant_handles.reader_make_constant_shell( makeString( "SimpleNoun" ) );
    $const141$singular = constant_handles.reader_make_constant_shell( makeString( "singular" ) );
    $const142$plural = constant_handles.reader_make_constant_shell( makeString( "plural" ) );
    $const143$massNumber = constant_handles.reader_make_constant_shell( makeString( "massNumber" ) );
    $const144$pnSingular = constant_handles.reader_make_constant_shell( makeString( "pnSingular" ) );
    $const145$pnPlural = constant_handles.reader_make_constant_shell( makeString( "pnPlural" ) );
    $const146$pnMassNumber = constant_handles.reader_make_constant_shell( makeString( "pnMassNumber" ) );
    $const147$agentive_Sg = constant_handles.reader_make_constant_shell( makeString( "agentive-Sg" ) );
    $const148$agentive_Pl = constant_handles.reader_make_constant_shell( makeString( "agentive-Pl" ) );
    $const149$agentive_Mass = constant_handles.reader_make_constant_shell( makeString( "agentive-Mass" ) );
    $const150$infinitive = constant_handles.reader_make_constant_shell( makeString( "infinitive" ) );
    $str151$thirdPersonSg_Present = makeString( "thirdPersonSg-Present" );
    $str152$thirdPersonSg_Generic = makeString( "thirdPersonSg-Generic" );
    $str153$pastTense_Universal = makeString( "pastTense-Universal" );
    $const154$perfect = constant_handles.reader_make_constant_shell( makeString( "perfect" ) );
    $const155$presentParticiple = constant_handles.reader_make_constant_shell( makeString( "presentParticiple" ) );
    $const156$regularDegree = constant_handles.reader_make_constant_shell( makeString( "regularDegree" ) );
    $const157$comparativeDegree = constant_handles.reader_make_constant_shell( makeString( "comparativeDegree" ) );
    $const158$superlativeDegree = constant_handles.reader_make_constant_shell( makeString( "superlativeDegree" ) );
    $const159$nonGradableAdjectiveForm = constant_handles.reader_make_constant_shell( makeString( "nonGradableAdjectiveForm" ) );
    $const160$regularAdverb = constant_handles.reader_make_constant_shell( makeString( "regularAdverb" ) );
    $const161$comparativeAdverb = constant_handles.reader_make_constant_shell( makeString( "comparativeAdverb" ) );
    $const162$superlativeAdverb = constant_handles.reader_make_constant_shell( makeString( "superlativeAdverb" ) );
    $kw163$STRING = makeKeyword( "STRING" );
    $kw164$GREEDY = makeKeyword( "GREEDY" );
    $sym165$LISTP = makeSymbol( "LISTP" );
    $sym166$FUNCTIONP = makeSymbol( "FUNCTIONP" );
    $kw167$DILIGENT = makeKeyword( "DILIGENT" );
    $str168$_s_is_not_a_valid_mode_argument = makeString( "~s is not a valid mode argument" );
    $kw169$INTERVAL = makeKeyword( "INTERVAL" );
    $str170$_s_is_not_a_valid_output_argument = makeString( "~s is not a valid output argument" );
    $list171 = ConsesLow.list( NIL );
    $const172$EnglishWord = constant_handles.reader_make_constant_shell( makeString( "EnglishWord" ) );
    $sym173$DERIVED_PRED_ = makeSymbol( "DERIVED-PRED?" );
    $str174$______NL_statistics______CycL__A_ = makeString( "~%;;; NL statistics~%;;; CycL ~A, KB ~S.~D~%" );
    $kw175$OUTPUT = makeKeyword( "OUTPUT" );
    $str176$Unable_to_open__S = makeString( "Unable to open ~S" );
    $str177$__Instances_of___EnglishWord____6 = makeString( "~%Instances of #$EnglishWord : ~6,' D" );
    $str178$__Number_of_root_forms__________6 = makeString( "~%Number of root forms       : ~6,' D~%" );
    $str179$____Grand_total____D____ = makeString( "~%~%Grand total : ~D~%~%" );
    $str180$____Grand_total____D = makeString( "~%~%Grand total : ~D" );
    $str181$Output_in__S = makeString( "Output in ~S" );
    $str182$_cyc_departments_nl_doc_stats_kb = makeString( "/cyc/departments/nl/doc/stats/kb" );
    $str183$_ = makeString( "." );
    $str184$_ = makeString( "-" );
    $str185$_stats = makeString( ".stats" );
    $const186$NLPredicate = constant_handles.reader_make_constant_shell( makeString( "NLPredicate" ) );
    $list187 = ConsesLow.list( makeSymbol( "PRED-TYPE" ), makeSymbol( "INSTANCES" ), makeSymbol( "SUBTREES" ) );
    $str188$____Instances_of__S_ = makeString( "~%~%Instances of ~S:" );
    $int189$40 = makeInteger( 40 );
    $str190$___A = makeString( "~%~A" );
    $str191$___6___D = makeString( ": ~6,' D" );
    $str192$__Total_for__S___D = makeString( "~%Total for ~S: ~D" );
    $list193 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "OpenCycNLPredicate" ) ) );
    $const194$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $const195$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $kw196$BREADTH = makeKeyword( "BREADTH" );
    $list197 = ConsesLow.list( makeUninternedSymbol( "LINK-NODE" ), makeUninternedSymbol( "MT" ), makeUninternedSymbol( "TV" ) );
    $sym198$NUM_PREDICATE_EXTENT_INDEX = makeSymbol( "NUM-PREDICATE-EXTENT-INDEX" );
    $const199$ProperNamePredicate_Loose = constant_handles.reader_make_constant_shell( makeString( "ProperNamePredicate-Loose" ) );
    $str200$mapping_Cyc_FORTs = makeString( "mapping Cyc FORTs" );
    $kw201$SKIP = makeKeyword( "SKIP" );
    $str202$__LOOSE___S___D_so_far___ = makeString( "~&LOOSE: ~S (~D so far)~%" );
    $str203$__S = makeString( " ~S" );
    $sym204$THIRD = makeSymbol( "THIRD" );
    $sym205$ASSERTION_FORMULA = makeSymbol( "ASSERTION-FORMULA" );
    $str206$____Forts_with_real_lexification_ = makeString( "~%~%Forts with real lexification:  ~6,' D~%" );
    $str207$____Forts_with_loose_lexification = makeString( "~%~%Forts with loose lexification: ~6,' D~%" );
    $str208$____Forts_with_NO_lexification___ = makeString( "~%~%Forts with NO lexification:    ~6,' D~%" );
    $const209$ParseTemplatePredicate_Reln = constant_handles.reader_make_constant_shell( makeString( "ParseTemplatePredicate-Reln" ) );
    $list210 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "NLSemanticPredicate" ) ), constant_handles.reader_make_constant_shell( makeString( "NLGenerationPredicate" ) ), constant_handles
        .reader_make_constant_shell( makeString( "NLPragmaticPredicate" ) ) );
    $sym211$VALID_ASSERTION = makeSymbol( "VALID-ASSERTION" );
    $sym212$CACHED_LEXIFICATIONS_FOR_TERM = makeSymbol( "CACHED-LEXIFICATIONS-FOR-TERM" );
    $const213$NLPragmaticPredicate = constant_handles.reader_make_constant_shell( makeString( "NLPragmaticPredicate" ) );
    $sym214$_CACHED_LEXIFICATIONS_FOR_TERM_CACHING_STATE_ = makeSymbol( "*CACHED-LEXIFICATIONS-FOR-TERM-CACHING-STATE*" );
    $int215$1024 = makeInteger( 1024 );
    $sym216$CLEAR_CACHED_LEXIFICATIONS_FOR_TERM = makeSymbol( "CLEAR-CACHED-LEXIFICATIONS-FOR-TERM" );
    $const217$genTemplate_QuerySentence = constant_handles.reader_make_constant_shell( makeString( "genTemplate-QuerySentence" ) );
    $kw218$TOO_MANY_TO_CHECK = makeKeyword( "TOO-MANY-TO-CHECK" );
    $sym219$FORMULA_ARG0 = makeSymbol( "FORMULA-ARG0" );
    $const220$NLSyntacticPredicate = constant_handles.reader_make_constant_shell( makeString( "NLSyntacticPredicate" ) );
    $const221$LinguisticObjectType = constant_handles.reader_make_constant_shell( makeString( "LinguisticObjectType" ) );
    $const222$CycLExpressionType = constant_handles.reader_make_constant_shell( makeString( "CycLExpressionType" ) );
    $kw223$TRUE = makeKeyword( "TRUE" );
    $str224$genStringAssertion_Terse = makeString( "genStringAssertion-Terse" );
    $const225$genStringAssertion = constant_handles.reader_make_constant_shell( makeString( "genStringAssertion" ) );
    $const226$genStringAssertion_Precise = constant_handles.reader_make_constant_shell( makeString( "genStringAssertion-Precise" ) );
    $const227$genStringAssertion_Terse = constant_handles.reader_make_constant_shell( makeString( "genStringAssertion-Terse" ) );
    $sym228$LEXIFICATION_SENTENCE_FROM_PREFERRED_LEXIFICATION_ASSERTION = makeSymbol( "LEXIFICATION-SENTENCE-FROM-PREFERRED-LEXIFICATION-ASSERTION" );
    $sym229$GAF_ARG2 = makeSymbol( "GAF-ARG2" );
    $sym230$PREFER_LEXICAL_ASSERTION_ = makeSymbol( "PREFER-LEXICAL-ASSERTION?" );
    $sym231$ATOMIC_SENTENCE_ = makeSymbol( "ATOMIC-SENTENCE?" );
    $sym232$APPEND = makeSymbol( "APPEND" );
    $const233$genStringAssertion_Constrained = constant_handles.reader_make_constant_shell( makeString( "genStringAssertion-Constrained" ) );
    $list234 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "preferredLexification" ) ), constant_handles.reader_make_constant_shell( makeString( "genStringAssertion" ) ), constant_handles
        .reader_make_constant_shell( makeString( "genStringAssertion-Constrained" ) ) );
    $const235$preferredNameString = constant_handles.reader_make_constant_shell( makeString( "preferredNameString" ) );
    $sym236$PREFER_LEXIFICATION_ = makeSymbol( "PREFER-LEXIFICATION?" );
    $sym237$SPEC_POS_ = makeSymbol( "SPEC-POS?" );
    $const238$Pronoun = constant_handles.reader_make_constant_shell( makeString( "Pronoun" ) );
    $const239$QuantifyingIndexical = constant_handles.reader_make_constant_shell( makeString( "QuantifyingIndexical" ) );
    $const240$Complementizer = constant_handles.reader_make_constant_shell( makeString( "Complementizer" ) );
    $sym241$UPPER_CASE_P = makeSymbol( "UPPER-CASE-P" );
    $const242$nameString = constant_handles.reader_make_constant_shell( makeString( "nameString" ) );
    $const243$ProperNamePredicate_Stub = constant_handles.reader_make_constant_shell( makeString( "ProperNamePredicate-Stub" ) );
    $sym244$GAF_ARG1 = makeSymbol( "GAF-ARG1" );
    $const245$TheTerm = constant_handles.reader_make_constant_shell( makeString( "TheTerm" ) );
    $const246$StubTerm = constant_handles.reader_make_constant_shell( makeString( "StubTerm" ) );
    $const247$CycNounLearnerMt = constant_handles.reader_make_constant_shell( makeString( "CycNounLearnerMt" ) );
    $const248$TestingConstant = constant_handles.reader_make_constant_shell( makeString( "TestingConstant" ) );
    $const249$verbSemTrans = constant_handles.reader_make_constant_shell( makeString( "verbSemTrans" ) );
    $list250 = ConsesLow.list( TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER );
    $str251$___S_in__S__ = makeString( "~&~S in ~S~%" );
    $const252$posForms = constant_handles.reader_make_constant_shell( makeString( "posForms" ) );
    $kw253$APPEND = makeKeyword( "APPEND" );
    $const254$multiWordString = constant_handles.reader_make_constant_shell( makeString( "multiWordString" ) );
    $const255$compoundString = constant_handles.reader_make_constant_shell( makeString( "compoundString" ) );
    $str256$____a_has__a_denotations_in__a = makeString( ";; ~a has ~a denotations in ~a" );
    $str257$___without_appropriate___posForms = makeString( ";; without appropriate #$posForms in #$GeneralEnglishMt or elsewhere" );
    $str258$_ke_assert____a__a___a____a__DEFA = makeString( "(ke-assert '(~a ~a \"~a\") ~a :DEFAULT :FORWARD)" );
    $list259 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CountNoun" ) ), constant_handles.reader_make_constant_shell( makeString( "MassNoun" ) ), constant_handles
        .reader_make_constant_shell( makeString( "ProperMassNoun" ) ), constant_handles.reader_make_constant_shell( makeString( "ProperCountNoun" ) ), constant_handles.reader_make_constant_shell( makeString(
            "AgentiveNoun" ) ), constant_handles.reader_make_constant_shell( makeString( "Verb" ) ), constant_handles.reader_make_constant_shell( makeString( "Adjective" ) ), constant_handles.reader_make_constant_shell(
                makeString( "Adverb" ) ) );
    $const260$StringIndexingSlot = constant_handles.reader_make_constant_shell( makeString( "StringIndexingSlot" ) );
    $str261$___S_in__S____ = makeString( "~&~S in ~S~%~%" );
    $sym262$CONTROL_CHAR_P = makeSymbol( "CONTROL-CHAR-P" );
    $str263$___S__ = makeString( "~&~S~%" );
    $str264$__fort_type__lex_asserts__ = makeString( "; fort\ttype\t#lex-asserts~%" );
    $str265$_s__s__s__ = makeString( "~s\t~s\t~s~%" );
    $const266$NLGenerationPredicate = constant_handles.reader_make_constant_shell( makeString( "NLGenerationPredicate" ) );
    $const267$True_JustificationTruth = constant_handles.reader_make_constant_shell( makeString( "True-JustificationTruth" ) );
    $sym268$PARSE_MORPHOLOGICALLY_OPTION_P = makeSymbol( "PARSE-MORPHOLOGICALLY-OPTION-P" );
    $kw269$NOUN = makeKeyword( "NOUN" );
    $sym270$KEYWORDP = makeSymbol( "KEYWORDP" );
    $str271$Determiner_Central = makeString( "Determiner-Central" );
    $kw272$NEVER = makeKeyword( "NEVER" );
    $const273$WHWord = constant_handles.reader_make_constant_shell( makeString( "WHWord" ) );
    $const274$nameSpelling = constant_handles.reader_make_constant_shell( makeString( "nameSpelling" ) );
    $sym275$_NAME = makeSymbol( "?NAME" );
    $const276$NameLexicalMt = constant_handles.reader_make_constant_shell( makeString( "NameLexicalMt" ) );
    $const277$commonNickname = constant_handles.reader_make_constant_shell( makeString( "commonNickname" ) );
    $sym278$HUMAN_MALE_GIVEN_NAME_P = makeSymbol( "HUMAN-MALE-GIVEN-NAME-P" );
    $sym279$HUMAN_FEMALE_GIVEN_NAME_P = makeSymbol( "HUMAN-FEMALE-GIVEN-NAME-P" );
    $kw280$BOTH = makeKeyword( "BOTH" );
    $kw281$MASC = makeKeyword( "MASC" );
    $kw282$FEM = makeKeyword( "FEM" );
    $kw283$UNKNOWN = makeKeyword( "UNKNOWN" );
    $const284$HumanMaleGivenName = constant_handles.reader_make_constant_shell( makeString( "HumanMaleGivenName" ) );
    $const285$HumanFemaleGivenName = constant_handles.reader_make_constant_shell( makeString( "HumanFemaleGivenName" ) );
    $kw286$PREFIX = makeKeyword( "PREFIX" );
    $kw287$SUFFIX = makeKeyword( "SUFFIX" );
    $const288$WordWithPrefixFn = constant_handles.reader_make_constant_shell( makeString( "WordWithPrefixFn" ) );
    $const289$WordWithSuffixFn = constant_handles.reader_make_constant_shell( makeString( "WordWithSuffixFn" ) );
    $const290$AllLexicalMicrotheoryPSC = constant_handles.reader_make_constant_shell( makeString( "AllLexicalMicrotheoryPSC" ) );
    $sym291$DERIVED_WORD_ = makeSymbol( "DERIVED-WORD?" );
    $sym292$DERIVED_WORD_AFFIX_MEMOIZED = makeSymbol( "DERIVED-WORD-AFFIX-MEMOIZED" );
    $sym293$_AFFIX = makeSymbol( "?AFFIX" );
    $const294$derivedUsingAffix = constant_handles.reader_make_constant_shell( makeString( "derivedUsingAffix" ) );
    $list295 = ConsesLow.list( makeKeyword( "MAX-TRANSFORMATION-DEPTH" ), ONE_INTEGER, makeKeyword( "MAX-NUMBER" ), ONE_INTEGER );
    $const296$LexicalPrefix = constant_handles.reader_make_constant_shell( makeString( "LexicalPrefix" ) );
    $sym297$STOP_WORD_CLOSED_CLASS_EXCEPTION = makeSymbol( "STOP-WORD-CLOSED-CLASS-EXCEPTION" );
    $sym298$_STOP_WORD_CLOSED_CLASS_EXCEPTION_CACHING_STATE_ = makeSymbol( "*STOP-WORD-CLOSED-CLASS-EXCEPTION-CACHING-STATE*" );
    $int299$100 = makeInteger( 100 );
    $list300 = ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TransitiveNPFrame" ) ), makeKeyword( "ACTION" ), makeKeyword( "SUBJECT" ), makeKeyword( "OBJECT" ) ), ConsesLow
        .list( constant_handles.reader_make_constant_shell( makeString( "IntransitiveVerbFrame" ) ), makeKeyword( "ACTION" ), makeKeyword( "SUBJECT" ) ) );
    $kw301$IGNORE = makeKeyword( "IGNORE" );
    $list302 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "KEYWORDP" ) ), makeKeyword( "FORT" ) );
    $kw303$FORT = makeKeyword( "FORT" );
    $list304 = ConsesLow.list( ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "KEYWORDP" ) ) );
    $sym305$CYCL_REPRESENTED_TERM_P = makeSymbol( "CYCL-REPRESENTED-TERM-P" );
    $kw306$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $sym307$CLEAR_LEXICONS_TO_LANGUAGES = makeSymbol( "CLEAR-LEXICONS-TO-LANGUAGES" );
    $list308 = ConsesLow.list( makeSymbol( "MT" ), makeSymbol( "LANGUAGE" ) );
    $list309 = ConsesLow.list( makeSymbol( "?MT" ), makeSymbol( "?LANGUAGE" ) );
    $list310 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "mtLanguage" ) ), makeSymbol( "?MT" ), makeSymbol( "?LANGUAGE" ) );
    $list311 = ConsesLow.list( makeKeyword( "ANSWER-LANGUAGE" ), makeKeyword( "HL" ) );
    $sym312$LEXICAL_MT_FOR_LANGUAGE = makeSymbol( "LEXICAL-MT-FOR-LANGUAGE" );
    $kw313$MT = makeKeyword( "MT" );
    $const314$languageHasRootLexicon = constant_handles.reader_make_constant_shell( makeString( "languageHasRootLexicon" ) );
    $list315 = ConsesLow.list( makeKeyword( "MT" ) );
    $sym316$_LEXICAL_MT_FOR_LANGUAGE_CACHING_STATE_ = makeSymbol( "*LEXICAL-MT-FOR-LANGUAGE-CACHING-STATE*" );
    $int317$256 = makeInteger( 256 );
    $sym318$CLEAR_LEXICAL_MT_FOR_LANGUAGE = makeSymbol( "CLEAR-LEXICAL-MT-FOR-LANGUAGE" );
    $sym319$GET_LANGUAGE_FOR_CODE = makeSymbol( "GET-LANGUAGE-FOR-CODE" );
    $kw320$LANG = makeKeyword( "LANG" );
    $const321$languageCodeDigraph = constant_handles.reader_make_constant_shell( makeString( "languageCodeDigraph" ) );
    $const322$CrossLinguisticLexicalMt = constant_handles.reader_make_constant_shell( makeString( "CrossLinguisticLexicalMt" ) );
    $sym323$_GET_LANGUAGE_FOR_CODE_CACHING_STATE_ = makeSymbol( "*GET-LANGUAGE-FOR-CODE-CACHING-STATE*" );
    $sym324$GET_CODE_FOR_LANGUAGE = makeSymbol( "GET-CODE-FOR-LANGUAGE" );
    $kw325$CODE = makeKeyword( "CODE" );
    $list326 = ConsesLow.list( makeKeyword( "CODE" ) );
    $sym327$_GET_CODE_FOR_LANGUAGE_CACHING_STATE_ = makeSymbol( "*GET-CODE-FOR-LANGUAGE-CACHING-STATE*" );
  }
}
/*
 * 
 * Total time: 10962 ms
 * 
 */
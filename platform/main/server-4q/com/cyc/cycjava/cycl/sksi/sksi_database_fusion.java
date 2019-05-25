package com.cyc.cycjava.cycl.sksi;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.czer_utilities;
import com.cyc.cycjava.cycl.keyhash_utilities;
import com.cyc.cycjava.cycl.transform_list_utilities;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.set;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.cyc_kernel;
import com.cyc.cycjava.cycl.constant_completion_high;
import com.cyc.cycjava.cycl.assertion_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.ke;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_accessors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.kb_paths;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.cycjava.cycl.integer_sequence_generator;
import com.cyc.cycjava.cycl.genl_mts;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.simplifier;
import com.cyc.cycjava.cycl.czer_main;
import com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.sdbc;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_debugging;
import com.cyc.cycjava.cycl.sksi.create_sks.sksi_create_sks;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sksi_database_fusion
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.sksi.sksi_database_fusion";
  public static final String myFingerPrint = "3173e658d108a70f8f9bba595707195dd704b226d40a97091c9fae7104af4d80";
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 1396L)
  private static SubLSymbol $within_sksi_database_fusionP$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 1546L)
  private static SubLSymbol $sksi_database_fusion_debugP$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 1687L)
  private static SubLSymbol $sksi_database_fusion_table_info_isg$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 2579L)
  public static SubLSymbol $dtp_db_info$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 9907L)
  public static SubLSymbol $dtp_table_info$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 20330L)
  private static SubLSymbol $last_db_info$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 26689L)
  private static SubLSymbol $current_table_info_variable_count$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 26753L)
  private static SubLSymbol $table_info_lfi_variable_dict$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 35021L)
  private static SubLSymbol $table_infoify_expression_table_kb_index$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 47966L)
  private static SubLSymbol $kbify_expression_kb_table_index$;
  private static final SubLSymbol $sym0$_SKSI_DATABASE_FUSION_TABLE_INFO_ISG_;
  private static final SubLSymbol $sym1$DB_INFO;
  private static final SubLSymbol $sym2$DB_INFO_P;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLList $list6;
  private static final SubLSymbol $sym7$PRINT_DB_INFO;
  private static final SubLSymbol $sym8$DB_INFO_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list9;
  private static final SubLSymbol $sym10$DBNFO_CONSTANT_BASE_NAME;
  private static final SubLSymbol $sym11$_CSETF_DBNFO_CONSTANT_BASE_NAME;
  private static final SubLSymbol $sym12$DBNFO_DB_NAME;
  private static final SubLSymbol $sym13$_CSETF_DBNFO_DB_NAME;
  private static final SubLSymbol $sym14$DBNFO_TABLE_INFOS;
  private static final SubLSymbol $sym15$_CSETF_DBNFO_TABLE_INFOS;
  private static final SubLSymbol $sym16$DBNFO_TABLE_INFO_INDEX;
  private static final SubLSymbol $sym17$_CSETF_DBNFO_TABLE_INFO_INDEX;
  private static final SubLSymbol $sym18$DBNFO_SERVER;
  private static final SubLSymbol $sym19$_CSETF_DBNFO_SERVER;
  private static final SubLSymbol $sym20$DBNFO_PORT;
  private static final SubLSymbol $sym21$_CSETF_DBNFO_PORT;
  private static final SubLSymbol $sym22$DBNFO_PROXY_HOST;
  private static final SubLSymbol $sym23$_CSETF_DBNFO_PROXY_HOST;
  private static final SubLSymbol $sym24$DBNFO_PROXY_PORT;
  private static final SubLSymbol $sym25$_CSETF_DBNFO_PROXY_PORT;
  private static final SubLSymbol $sym26$DBNFO_USER;
  private static final SubLSymbol $sym27$_CSETF_DBNFO_USER;
  private static final SubLSymbol $sym28$DBNFO_PASS;
  private static final SubLSymbol $sym29$_CSETF_DBNFO_PASS;
  private static final SubLSymbol $sym30$DBNFO_SUBPROTOCOL;
  private static final SubLSymbol $sym31$_CSETF_DBNFO_SUBPROTOCOL;
  private static final SubLSymbol $sym32$DBNFO_SQL_FLAVOR;
  private static final SubLSymbol $sym33$_CSETF_DBNFO_SQL_FLAVOR;
  private static final SubLSymbol $sym34$DBNFO_QUOTED_ISAS;
  private static final SubLSymbol $sym35$_CSETF_DBNFO_QUOTED_ISAS;
  private static final SubLSymbol $sym36$DBNFO_INPUT_MT;
  private static final SubLSymbol $sym37$_CSETF_DBNFO_INPUT_MT;
  private static final SubLSymbol $sym38$DBNFO_CONTENT_GENL_MTS;
  private static final SubLSymbol $sym39$_CSETF_DBNFO_CONTENT_GENL_MTS;
  private static final SubLSymbol $kw40$CONSTANT_BASE_NAME;
  private static final SubLSymbol $kw41$DB_NAME;
  private static final SubLSymbol $kw42$TABLE_INFOS;
  private static final SubLSymbol $kw43$TABLE_INFO_INDEX;
  private static final SubLSymbol $kw44$SERVER;
  private static final SubLSymbol $kw45$PORT;
  private static final SubLSymbol $kw46$PROXY_HOST;
  private static final SubLSymbol $kw47$PROXY_PORT;
  private static final SubLSymbol $kw48$USER;
  private static final SubLSymbol $kw49$PASS;
  private static final SubLSymbol $kw50$SUBPROTOCOL;
  private static final SubLSymbol $kw51$SQL_FLAVOR;
  private static final SubLSymbol $kw52$QUOTED_ISAS;
  private static final SubLSymbol $kw53$INPUT_MT;
  private static final SubLSymbol $kw54$CONTENT_GENL_MTS;
  private static final SubLString $str55$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw56$BEGIN;
  private static final SubLSymbol $sym57$MAKE_DB_INFO;
  private static final SubLSymbol $kw58$SLOT;
  private static final SubLSymbol $kw59$END;
  private static final SubLSymbol $sym60$VISIT_DEFSTRUCT_OBJECT_DB_INFO_METHOD;
  private static final SubLString $str61$_DB_INFO__a_;
  private static final SubLSymbol $sym62$STRINGP;
  private static final SubLSymbol $sym63$NON_NEGATIVE_INTEGER_P;
  private static final SubLSymbol $sym64$FORT_P;
  private static final SubLSymbol $sym65$NON_DOTTED_LIST_P;
  private static final SubLSymbol $sym66$COLLECTION_P;
  private static final SubLSymbol $sym67$HLMT_P;
  private static final SubLSymbol $sym68$TABLE_INFO_P;
  private static final SubLString $str69$_KS;
  private static final SubLString $str70$_s__;
  private static final SubLString $str71$db_name___s__;
  private static final SubLString $str72$server___s__;
  private static final SubLString $str73$port___s__;
  private static final SubLString $str74$proxy_host___s__;
  private static final SubLString $str75$proxy_port___s__;
  private static final SubLString $str76$user___s__;
  private static final SubLString $str77$pass___s__;
  private static final SubLString $str78$subprotocol___s__;
  private static final SubLString $str79$sql_flavor___s__;
  private static final SubLString $str80$quoted_isas___s__;
  private static final SubLString $str81$input_mt___s__;
  private static final SubLString $str82$content_genl_mts___s__;
  private static final SubLSymbol $sym83$TABLE_INFO;
  private static final SubLList $list84;
  private static final SubLList $list85;
  private static final SubLList $list86;
  private static final SubLList $list87;
  private static final SubLSymbol $sym88$PRINT_TABLE_INFO;
  private static final SubLSymbol $sym89$TABLE_INFO_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list90;
  private static final SubLSymbol $sym91$TBLNFO_ID;
  private static final SubLSymbol $sym92$_CSETF_TBLNFO_ID;
  private static final SubLSymbol $sym93$TBLNFO_CONSTANT_BASE_NAME;
  private static final SubLSymbol $sym94$_CSETF_TBLNFO_CONSTANT_BASE_NAME;
  private static final SubLSymbol $sym95$TBLNFO_TABLE_NAME;
  private static final SubLSymbol $sym96$_CSETF_TBLNFO_TABLE_NAME;
  private static final SubLSymbol $sym97$TBLNFO_ISAS;
  private static final SubLSymbol $sym98$_CSETF_TBLNFO_ISAS;
  private static final SubLSymbol $sym99$TBLNFO_LF_TYPES;
  private static final SubLSymbol $sym100$_CSETF_TBLNFO_LF_TYPES;
  private static final SubLSymbol $sym101$TBLNFO_FIELD_MAPPINGS;
  private static final SubLSymbol $sym102$_CSETF_TBLNFO_FIELD_MAPPINGS;
  private static final SubLSymbol $sym103$TBLNFO_MEANING_SENTENCES;
  private static final SubLSymbol $sym104$_CSETF_TBLNFO_MEANING_SENTENCES;
  private static final SubLSymbol $sym105$TBLNFO_ENUMERABLE_;
  private static final SubLSymbol $sym106$_CSETF_TBLNFO_ENUMERABLE_;
  private static final SubLSymbol $sym107$TBLNFO_FIELD_NAMES;
  private static final SubLSymbol $sym108$_CSETF_TBLNFO_FIELD_NAMES;
  private static final SubLSymbol $sym109$TBLNFO_FIELD_TYPES;
  private static final SubLSymbol $sym110$_CSETF_TBLNFO_FIELD_TYPES;
  private static final SubLSymbol $sym111$TBLNFO_PRIMARY_KEY;
  private static final SubLSymbol $sym112$_CSETF_TBLNFO_PRIMARY_KEY;
  private static final SubLSymbol $sym113$TBLNFO_INDEXES;
  private static final SubLSymbol $sym114$_CSETF_TBLNFO_INDEXES;
  private static final SubLSymbol $sym115$TBLNFO_FIELD_ENCODINGS;
  private static final SubLSymbol $sym116$_CSETF_TBLNFO_FIELD_ENCODINGS;
  private static final SubLSymbol $sym117$TBLNFO_FIELD_DECODINGS;
  private static final SubLSymbol $sym118$_CSETF_TBLNFO_FIELD_DECODINGS;
  private static final SubLSymbol $sym119$TBLNFO_FOREIGN_KEY_MAPS;
  private static final SubLSymbol $sym120$_CSETF_TBLNFO_FOREIGN_KEY_MAPS;
  private static final SubLSymbol $sym121$TBLNFO_NON_NULL_FIELD_LIST;
  private static final SubLSymbol $sym122$_CSETF_TBLNFO_NON_NULL_FIELD_LIST;
  private static final SubLSymbol $sym123$TBLNFO_UNIQUE_FIELD_TUPLES;
  private static final SubLSymbol $sym124$_CSETF_TBLNFO_UNIQUE_FIELD_TUPLES;
  private static final SubLSymbol $kw125$ID;
  private static final SubLSymbol $kw126$TABLE_NAME;
  private static final SubLSymbol $kw127$ISAS;
  private static final SubLSymbol $kw128$LF_TYPES;
  private static final SubLSymbol $kw129$FIELD_MAPPINGS;
  private static final SubLSymbol $kw130$MEANING_SENTENCES;
  private static final SubLSymbol $kw131$ENUMERABLE_;
  private static final SubLSymbol $kw132$FIELD_NAMES;
  private static final SubLSymbol $kw133$FIELD_TYPES;
  private static final SubLSymbol $kw134$PRIMARY_KEY;
  private static final SubLSymbol $kw135$INDEXES;
  private static final SubLSymbol $kw136$FIELD_ENCODINGS;
  private static final SubLSymbol $kw137$FIELD_DECODINGS;
  private static final SubLSymbol $kw138$FOREIGN_KEY_MAPS;
  private static final SubLSymbol $kw139$NON_NULL_FIELD_LIST;
  private static final SubLSymbol $kw140$UNIQUE_FIELD_TUPLES;
  private static final SubLSymbol $sym141$MAKE_TABLE_INFO;
  private static final SubLSymbol $sym142$VISIT_DEFSTRUCT_OBJECT_TABLE_INFO_METHOD;
  private static final SubLString $str143$_TABLE_INFO__a___a_;
  private static final SubLSymbol $sym144$TABLE_INFO_ID_P;
  private static final SubLSymbol $sym145$TABLE_INFO_FIELD_MAPPING_P;
  private static final SubLSymbol $sym146$CYCL_SENTENCE_P;
  private static final SubLSymbol $sym147$BOOLEANP;
  private static final SubLSymbol $sym148$TABLE_INFO_FIELD_ENCODING_P;
  private static final SubLSymbol $sym149$TABLE_INFO_FIELD_DECODING_P;
  private static final SubLSymbol $sym150$TABLE_INFO_FOREIGN_KEY_MAP_P;
  private static final SubLString $str151$_LS;
  private static final SubLString $str152$_PS;
  private static final SubLString $str153$table_name__s__;
  private static final SubLString $str154$isas___s__;
  private static final SubLString $str155$LF_types___s__;
  private static final SubLString $str156$field_mappings__s__;
  private static final SubLString $str157$meaning_sentences___s__;
  private static final SubLString $str158$enumerable___s__;
  private static final SubLString $str159$field_names__s__;
  private static final SubLString $str160$field_types__s__;
  private static final SubLString $str161$primary_key__s__;
  private static final SubLString $str162$indexes__s__;
  private static final SubLString $str163$field_encodings__s__;
  private static final SubLString $str164$field_decodings__s__;
  private static final SubLString $str165$foreign_key_maps__s__;
  private static final SubLString $str166$non_null_field_list__s__;
  private static final SubLString $str167$unique_field_tuples__s__;
  private static final SubLSymbol $kw168$LFI;
  private static final SubLSymbol $kw169$LF;
  private static final SubLSymbol $kw170$PFI;
  private static final SubLSymbol $kw171$PF;
  private static final SubLSymbol $kw172$KS;
  private static final SubLSymbol $kw173$LS;
  private static final SubLSymbol $kw174$PS;
  private static final SubLSymbol $sym175$_LAST_DB_INFO_;
  private static final SubLSymbol $kw176$WARN;
  private static final SubLSymbol $sym177$VALID_SKSI_ERROR_HANDLING_MODE_P;
  private static final SubLObject $const178$cloneOfSKS;
  private static final SubLSymbol $kw179$BREAK;
  private static final SubLObject $const180$SKSIMt;
  private static final SubLString $str181$_Cloned;
  private static final SubLString $str182$_cloned;
  private static final SubLString $str183$;
  private static final SubLString $str184$_;
  private static final SubLObject $const185$ContentMtFn;
  private static final SubLObject $const186$sksiSaturateRule;
  private static final SubLObject $const187$implies;
  private static final SubLObject $const188$UniversalVocabularyMt;
  private static final SubLSymbol $sym189$TABLE_INFO_LOGICAL_FIELD_INDEXICAL_P;
  private static final SubLSymbol $sym190$VARIABLIZE_TABLE_INFO_LFI;
  private static final SubLString $str191$_Fused;
  private static final SubLString $str192$1;
  private static final SubLString $str193$2;
  private static final SubLObject $const194$BookkeepingMt;
  private static final SubLString $str195$_s_misindexed_under__s_instead_of;
  private static final SubLSymbol $sym196$PHYSICAL_FIELD_NAME;
  private static final SubLSymbol $sym197$PHYSICAL_FIELD_DATA_TYPE;
  private static final SubLSymbol $sym198$MAPCAR_PHYSICAL_FIELD_NAME;
  private static final SubLList $list199;
  private static final SubLString $str200$Can_t_handle_fieldEncoding_for__s;
  private static final SubLSymbol $sym201$TABLE_INFOIFIABLE_P;
  private static final SubLSymbol $sym202$TABLE_INFOIFY_OBJECT;
  private static final SubLString $str203$Can_t_table_infoify__s;
  private static final SubLList $list204;
  private static final SubLString $str205$Can_t_handle_fieldDecoding_for__s;
  private static final SubLList $list206;
  private static final SubLString $str207$Got_physical_schema__s__expected_;
  private static final SubLString $str208$Fused_;
  private static final SubLList $list209;
  private static final SubLObject $const210$sksRepresentationComplete;
  private static final SubLObject $const211$termDependsOn;
  private static final SubLObject $const212$Database_Physical;
  private static final SubLObject $const213$isa;
  private static final SubLList $list214;
  private static final SubLObject $const215$quotedIsa;
  private static final SubLObject $const216$mappingMt;
  private static final SubLString $str217$Could_not_find_the_content_mt_hea;
  private static final SubLObject $const218$genlMt;
  private static final SubLObject $const219$userNameForSKS;
  private static final SubLObject $const220$passwordForSKS;
  private static final SubLObject $const221$serverOfSKS;
  private static final SubLObject $const222$portNumberForSKS;
  private static final SubLObject $const223$sksProxyHost;
  private static final SubLObject $const224$sksProxyPort;
  private static final SubLObject $const225$subProtocolForSKS;
  private static final SubLObject $const226$sqlProgramForSKS;
  private static final SubLObject $const227$ObjectDefiningSchema;
  private static final SubLObject $const228$LogicalSchema;
  private static final SubLObject $const229$logicalSchemaSourceMap;
  private static final SubLObject $const230$logicalSchemaFieldTypeList;
  private static final SubLList $list231;
  private static final SubLObject $const232$logicalFieldMapping;
  private static final SubLObject $const233$schemaIsa;
  private static final SubLObject $const234$meaningSentenceOfSchema;
  private static final SubLString $str235$Can_t_kbify__s;
  private static final SubLList $list236;
  private static final SubLList $list237;
  private static final SubLList $list238;
  private static final SubLSymbol $sym239$KBIFIABLE_P;
  private static final SubLSymbol $sym240$KBIFY_OBJECT;
  private static final SubLList $list241;
  private static final SubLObject $const242$TheLogicalFieldValueFn;
  private static final SubLList $list243;
  private static final SubLObject $const244$LogicalFieldFn;
  private static final SubLList $list245;
  private static final SubLObject $const246$ThePhysicalFieldValueFn;
  private static final SubLList $list247;
  private static final SubLObject $const248$physicalSchemaSourceMap;
  private static final SubLObject $const249$logicalPhysicalSchemaMap;
  private static final SubLObject $const250$enumerableSchema;
  private static final SubLObject $const251$schemaFieldNameList;
  private static final SubLObject $const252$fieldDataType;
  private static final SubLObject $const253$primaryKey;
  private static final SubLObject $const254$indexedFields;
  private static final SubLList $list255;
  private static final SubLObject $const256$fieldEncoding;
  private static final SubLList $list257;
  private static final SubLObject $const258$fieldDecoding;
  private static final SubLObject $const259$nonNullFieldList;
  private static final SubLObject $const260$uniqueFieldList;
  private static final SubLString $str261$Error_getting_physical_field__s_i;
  private static final SubLString $str262$Error_getting_indexical_for_physi;
  private static final SubLString $str263$cdolist;
  private static final SubLString $str264$Cloned;
  private static final SubLString $str265$BLN;
  private static final SubLSymbol $kw266$X;
  private static final SubLObject $const267$sksFusionSources;
  private static final SubLSymbol $sym268$SK_SOURCE_MAPPING_MT;
  private static final SubLObject $const269$MtUnionFn;
  private static final SubLString $str270$Name_conflict_in__s__two_tables_n;
  private static final SubLString $str271$_fused;
  private static final SubLSymbol $sym272$ANONYMIZE_TABLE_INFO_OBJECT;
  private static final SubLString $str273$Can_t_yet_handle_duplicate_LFI_ty;
  private static final SubLList $list274;
  private static final SubLObject $const275$sksiSentence;
  private static final SubLString $str276$Fused;

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 1455L)
  public static SubLObject within_sksi_database_fusionP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $within_sksi_database_fusionP$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 1598L)
  public static SubLObject sksi_database_fusion_debugP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $sksi_database_fusion_debugP$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 2579L)
  public static SubLObject db_info_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_db_info( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 2579L)
  public static SubLObject db_info_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $db_info_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 2579L)
  public static SubLObject dbnfo_constant_base_name(final SubLObject v_object)
  {
    assert NIL != db_info_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 2579L)
  public static SubLObject dbnfo_db_name(final SubLObject v_object)
  {
    assert NIL != db_info_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 2579L)
  public static SubLObject dbnfo_table_infos(final SubLObject v_object)
  {
    assert NIL != db_info_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 2579L)
  public static SubLObject dbnfo_table_info_index(final SubLObject v_object)
  {
    assert NIL != db_info_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 2579L)
  public static SubLObject dbnfo_server(final SubLObject v_object)
  {
    assert NIL != db_info_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 2579L)
  public static SubLObject dbnfo_port(final SubLObject v_object)
  {
    assert NIL != db_info_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 2579L)
  public static SubLObject dbnfo_proxy_host(final SubLObject v_object)
  {
    assert NIL != db_info_p( v_object ) : v_object;
    return v_object.getField8();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 2579L)
  public static SubLObject dbnfo_proxy_port(final SubLObject v_object)
  {
    assert NIL != db_info_p( v_object ) : v_object;
    return v_object.getField9();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 2579L)
  public static SubLObject dbnfo_user(final SubLObject v_object)
  {
    assert NIL != db_info_p( v_object ) : v_object;
    return v_object.getField10();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 2579L)
  public static SubLObject dbnfo_pass(final SubLObject v_object)
  {
    assert NIL != db_info_p( v_object ) : v_object;
    return v_object.getField11();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 2579L)
  public static SubLObject dbnfo_subprotocol(final SubLObject v_object)
  {
    assert NIL != db_info_p( v_object ) : v_object;
    return v_object.getField12();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 2579L)
  public static SubLObject dbnfo_sql_flavor(final SubLObject v_object)
  {
    assert NIL != db_info_p( v_object ) : v_object;
    return v_object.getField13();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 2579L)
  public static SubLObject dbnfo_quoted_isas(final SubLObject v_object)
  {
    assert NIL != db_info_p( v_object ) : v_object;
    return v_object.getField14();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 2579L)
  public static SubLObject dbnfo_input_mt(final SubLObject v_object)
  {
    assert NIL != db_info_p( v_object ) : v_object;
    return v_object.getField15();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 2579L)
  public static SubLObject dbnfo_content_genl_mts(final SubLObject v_object)
  {
    assert NIL != db_info_p( v_object ) : v_object;
    return v_object.getField16();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 2579L)
  public static SubLObject _csetf_dbnfo_constant_base_name(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != db_info_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 2579L)
  public static SubLObject _csetf_dbnfo_db_name(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != db_info_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 2579L)
  public static SubLObject _csetf_dbnfo_table_infos(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != db_info_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 2579L)
  public static SubLObject _csetf_dbnfo_table_info_index(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != db_info_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 2579L)
  public static SubLObject _csetf_dbnfo_server(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != db_info_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 2579L)
  public static SubLObject _csetf_dbnfo_port(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != db_info_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 2579L)
  public static SubLObject _csetf_dbnfo_proxy_host(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != db_info_p( v_object ) : v_object;
    return v_object.setField8( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 2579L)
  public static SubLObject _csetf_dbnfo_proxy_port(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != db_info_p( v_object ) : v_object;
    return v_object.setField9( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 2579L)
  public static SubLObject _csetf_dbnfo_user(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != db_info_p( v_object ) : v_object;
    return v_object.setField10( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 2579L)
  public static SubLObject _csetf_dbnfo_pass(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != db_info_p( v_object ) : v_object;
    return v_object.setField11( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 2579L)
  public static SubLObject _csetf_dbnfo_subprotocol(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != db_info_p( v_object ) : v_object;
    return v_object.setField12( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 2579L)
  public static SubLObject _csetf_dbnfo_sql_flavor(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != db_info_p( v_object ) : v_object;
    return v_object.setField13( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 2579L)
  public static SubLObject _csetf_dbnfo_quoted_isas(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != db_info_p( v_object ) : v_object;
    return v_object.setField14( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 2579L)
  public static SubLObject _csetf_dbnfo_input_mt(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != db_info_p( v_object ) : v_object;
    return v_object.setField15( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 2579L)
  public static SubLObject _csetf_dbnfo_content_genl_mts(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != db_info_p( v_object ) : v_object;
    return v_object.setField16( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 2579L)
  public static SubLObject make_db_info(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $db_info_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw40$CONSTANT_BASE_NAME ) )
      {
        _csetf_dbnfo_constant_base_name( v_new, current_value );
      }
      else if( pcase_var.eql( $kw41$DB_NAME ) )
      {
        _csetf_dbnfo_db_name( v_new, current_value );
      }
      else if( pcase_var.eql( $kw42$TABLE_INFOS ) )
      {
        _csetf_dbnfo_table_infos( v_new, current_value );
      }
      else if( pcase_var.eql( $kw43$TABLE_INFO_INDEX ) )
      {
        _csetf_dbnfo_table_info_index( v_new, current_value );
      }
      else if( pcase_var.eql( $kw44$SERVER ) )
      {
        _csetf_dbnfo_server( v_new, current_value );
      }
      else if( pcase_var.eql( $kw45$PORT ) )
      {
        _csetf_dbnfo_port( v_new, current_value );
      }
      else if( pcase_var.eql( $kw46$PROXY_HOST ) )
      {
        _csetf_dbnfo_proxy_host( v_new, current_value );
      }
      else if( pcase_var.eql( $kw47$PROXY_PORT ) )
      {
        _csetf_dbnfo_proxy_port( v_new, current_value );
      }
      else if( pcase_var.eql( $kw48$USER ) )
      {
        _csetf_dbnfo_user( v_new, current_value );
      }
      else if( pcase_var.eql( $kw49$PASS ) )
      {
        _csetf_dbnfo_pass( v_new, current_value );
      }
      else if( pcase_var.eql( $kw50$SUBPROTOCOL ) )
      {
        _csetf_dbnfo_subprotocol( v_new, current_value );
      }
      else if( pcase_var.eql( $kw51$SQL_FLAVOR ) )
      {
        _csetf_dbnfo_sql_flavor( v_new, current_value );
      }
      else if( pcase_var.eql( $kw52$QUOTED_ISAS ) )
      {
        _csetf_dbnfo_quoted_isas( v_new, current_value );
      }
      else if( pcase_var.eql( $kw53$INPUT_MT ) )
      {
        _csetf_dbnfo_input_mt( v_new, current_value );
      }
      else if( pcase_var.eql( $kw54$CONTENT_GENL_MTS ) )
      {
        _csetf_dbnfo_content_genl_mts( v_new, current_value );
      }
      else
      {
        Errors.error( $str55$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 2579L)
  public static SubLObject visit_defstruct_db_info(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw56$BEGIN, $sym57$MAKE_DB_INFO, FIFTEEN_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw58$SLOT, $kw40$CONSTANT_BASE_NAME, dbnfo_constant_base_name( obj ) );
    Functions.funcall( visitor_fn, obj, $kw58$SLOT, $kw41$DB_NAME, dbnfo_db_name( obj ) );
    Functions.funcall( visitor_fn, obj, $kw58$SLOT, $kw42$TABLE_INFOS, dbnfo_table_infos( obj ) );
    Functions.funcall( visitor_fn, obj, $kw58$SLOT, $kw43$TABLE_INFO_INDEX, dbnfo_table_info_index( obj ) );
    Functions.funcall( visitor_fn, obj, $kw58$SLOT, $kw44$SERVER, dbnfo_server( obj ) );
    Functions.funcall( visitor_fn, obj, $kw58$SLOT, $kw45$PORT, dbnfo_port( obj ) );
    Functions.funcall( visitor_fn, obj, $kw58$SLOT, $kw46$PROXY_HOST, dbnfo_proxy_host( obj ) );
    Functions.funcall( visitor_fn, obj, $kw58$SLOT, $kw47$PROXY_PORT, dbnfo_proxy_port( obj ) );
    Functions.funcall( visitor_fn, obj, $kw58$SLOT, $kw48$USER, dbnfo_user( obj ) );
    Functions.funcall( visitor_fn, obj, $kw58$SLOT, $kw49$PASS, dbnfo_pass( obj ) );
    Functions.funcall( visitor_fn, obj, $kw58$SLOT, $kw50$SUBPROTOCOL, dbnfo_subprotocol( obj ) );
    Functions.funcall( visitor_fn, obj, $kw58$SLOT, $kw51$SQL_FLAVOR, dbnfo_sql_flavor( obj ) );
    Functions.funcall( visitor_fn, obj, $kw58$SLOT, $kw52$QUOTED_ISAS, dbnfo_quoted_isas( obj ) );
    Functions.funcall( visitor_fn, obj, $kw58$SLOT, $kw53$INPUT_MT, dbnfo_input_mt( obj ) );
    Functions.funcall( visitor_fn, obj, $kw58$SLOT, $kw54$CONTENT_GENL_MTS, dbnfo_content_genl_mts( obj ) );
    Functions.funcall( visitor_fn, obj, $kw59$END, $sym57$MAKE_DB_INFO, FIFTEEN_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 2579L)
  public static SubLObject visit_defstruct_object_db_info_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_db_info( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 2927L)
  public static SubLObject print_db_info(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    PrintLow.format( stream, $str61$_DB_INFO__a_, dbnfo_constant_base_name( v_object ) );
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 3088L)
  public static SubLObject new_db_info(final SubLObject constant_base_name, final SubLObject db_name, final SubLObject server, final SubLObject port, final SubLObject proxy_host, final SubLObject proxy_port,
      final SubLObject user, final SubLObject pass, final SubLObject subprotocol, final SubLObject sql_flavor, final SubLObject quoted_isas, final SubLObject input_mt, final SubLObject content_genl_mts)
  {
    assert NIL != Types.stringp( constant_base_name ) : constant_base_name;
    assert NIL != Types.stringp( db_name ) : db_name;
    assert NIL != Types.stringp( server ) : server;
    if( NIL != port && !assertionsDisabledInClass && NIL == subl_promotions.non_negative_integer_p( port ) )
    {
      throw new AssertionError( port );
    }
    assert NIL != Types.stringp( proxy_host ) : proxy_host;
    assert NIL != subl_promotions.non_negative_integer_p( proxy_port ) : proxy_port;
    assert NIL != Types.stringp( user ) : user;
    assert NIL != Types.stringp( pass ) : pass;
    assert NIL != Types.stringp( subprotocol ) : subprotocol;
    assert NIL != forts.fort_p( sql_flavor ) : sql_flavor;
    assert NIL != list_utilities.non_dotted_list_p( quoted_isas ) : quoted_isas;
    SubLObject cdolist_list_var = quoted_isas;
    SubLObject elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != fort_types_interface.collection_p( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    assert NIL != hlmt.hlmt_p( input_mt ) : input_mt;
    assert NIL != list_utilities.non_dotted_list_p( content_genl_mts ) : content_genl_mts;
    cdolist_list_var = content_genl_mts;
    elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != hlmt.hlmt_p( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    final SubLObject db_info = make_db_info( UNPROVIDED );
    _csetf_dbnfo_constant_base_name( db_info, constant_base_name );
    _csetf_dbnfo_db_name( db_info, db_name );
    _csetf_dbnfo_table_info_index( db_info, dictionary.new_dictionary( UNPROVIDED, UNPROVIDED ) );
    _csetf_dbnfo_server( db_info, server );
    _csetf_dbnfo_port( db_info, port );
    _csetf_dbnfo_proxy_host( db_info, proxy_host );
    _csetf_dbnfo_proxy_port( db_info, proxy_port );
    _csetf_dbnfo_user( db_info, user );
    _csetf_dbnfo_pass( db_info, pass );
    _csetf_dbnfo_subprotocol( db_info, subprotocol );
    _csetf_dbnfo_sql_flavor( db_info, sql_flavor );
    _csetf_dbnfo_quoted_isas( db_info, quoted_isas );
    _csetf_dbnfo_input_mt( db_info, input_mt );
    _csetf_dbnfo_content_genl_mts( db_info, content_genl_mts );
    return db_info;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 4497L)
  public static SubLObject db_info_constant_base_name(final SubLObject db_info)
  {
    assert NIL != db_info_p( db_info ) : db_info;
    return dbnfo_constant_base_name( db_info );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 4642L)
  public static SubLObject db_info_db_name(final SubLObject db_info)
  {
    assert NIL != db_info_p( db_info ) : db_info;
    return dbnfo_db_name( db_info );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 4751L)
  public static SubLObject db_info_table_infos(final SubLObject db_info)
  {
    assert NIL != db_info_p( db_info ) : db_info;
    return dbnfo_table_infos( db_info );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 4868L)
  public static SubLObject db_info_table_info_index(final SubLObject db_info)
  {
    assert NIL != db_info_p( db_info ) : db_info;
    return dbnfo_table_info_index( db_info );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 4995L)
  public static SubLObject db_info_server(final SubLObject db_info)
  {
    assert NIL != db_info_p( db_info ) : db_info;
    return dbnfo_server( db_info );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 5102L)
  public static SubLObject db_info_port(final SubLObject db_info)
  {
    assert NIL != db_info_p( db_info ) : db_info;
    return dbnfo_port( db_info );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 5205L)
  public static SubLObject db_info_proxy_host(final SubLObject db_info)
  {
    assert NIL != db_info_p( db_info ) : db_info;
    return dbnfo_proxy_host( db_info );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 5320L)
  public static SubLObject db_info_proxy_port(final SubLObject db_info)
  {
    assert NIL != db_info_p( db_info ) : db_info;
    return dbnfo_proxy_port( db_info );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 5435L)
  public static SubLObject db_info_user(final SubLObject db_info)
  {
    assert NIL != db_info_p( db_info ) : db_info;
    return dbnfo_user( db_info );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 5538L)
  public static SubLObject db_info_pass(final SubLObject db_info)
  {
    assert NIL != db_info_p( db_info ) : db_info;
    return dbnfo_pass( db_info );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 5641L)
  public static SubLObject db_info_subprotocol(final SubLObject db_info)
  {
    assert NIL != db_info_p( db_info ) : db_info;
    return dbnfo_subprotocol( db_info );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 5758L)
  public static SubLObject db_info_sql_flavor(final SubLObject db_info)
  {
    assert NIL != db_info_p( db_info ) : db_info;
    return dbnfo_sql_flavor( db_info );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 5873L)
  public static SubLObject db_info_quoted_isas(final SubLObject db_info)
  {
    assert NIL != db_info_p( db_info ) : db_info;
    return dbnfo_quoted_isas( db_info );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 5990L)
  public static SubLObject db_info_input_mt(final SubLObject db_info)
  {
    assert NIL != db_info_p( db_info ) : db_info;
    return dbnfo_input_mt( db_info );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 6101L)
  public static SubLObject db_info_content_genl_mts(final SubLObject db_info)
  {
    assert NIL != db_info_p( db_info ) : db_info;
    return dbnfo_content_genl_mts( db_info );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 6228L)
  public static SubLObject set_db_info_constant_base_name(final SubLObject db_info, final SubLObject constant_base_name)
  {
    assert NIL != db_info_p( db_info ) : db_info;
    assert NIL != Types.stringp( constant_base_name ) : constant_base_name;
    _csetf_dbnfo_constant_base_name( db_info, constant_base_name );
    return db_info;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 6473L)
  public static SubLObject set_db_info_table_infos(final SubLObject db_info, final SubLObject table_infos)
  {
    assert NIL != db_info_p( db_info ) : db_info;
    assert NIL != list_utilities.non_dotted_list_p( table_infos ) : table_infos;
    SubLObject cdolist_list_var = table_infos;
    SubLObject elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != table_info_p( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    _csetf_dbnfo_table_infos( db_info, table_infos );
    reindex_db_info_table_infos( db_info );
    return db_info;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 6721L)
  public static SubLObject set_db_info_db_name(final SubLObject db_info, final SubLObject db_name)
  {
    assert NIL != db_info_p( db_info ) : db_info;
    assert NIL != Types.stringp( db_name ) : db_name;
    _csetf_dbnfo_db_name( db_info, db_name );
    return db_info;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 6899L)
  public static SubLObject set_db_info_quoted_isas(final SubLObject db_info, final SubLObject quoted_isas)
  {
    assert NIL != db_info_p( db_info ) : db_info;
    assert NIL != list_utilities.non_dotted_list_p( quoted_isas ) : quoted_isas;
    SubLObject cdolist_list_var = quoted_isas;
    SubLObject elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != forts.fort_p( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    _csetf_dbnfo_quoted_isas( db_info, quoted_isas );
    return db_info;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 7101L)
  public static SubLObject set_db_info_input_mt(final SubLObject db_info, final SubLObject input_mt)
  {
    assert NIL != db_info_p( db_info ) : db_info;
    assert NIL != hlmt.hlmt_p( input_mt ) : input_mt;
    _csetf_dbnfo_input_mt( db_info, input_mt );
    return db_info;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 7283L)
  public static SubLObject set_db_info_content_genl_mts(final SubLObject db_info, final SubLObject content_genl_mts)
  {
    assert NIL != db_info_p( db_info ) : db_info;
    assert NIL != list_utilities.non_dotted_list_p( content_genl_mts ) : content_genl_mts;
    SubLObject cdolist_list_var = content_genl_mts;
    SubLObject elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != hlmt.hlmt_p( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    _csetf_dbnfo_content_genl_mts( db_info, content_genl_mts );
    return db_info;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 7510L)
  public static SubLObject db_info_ks_name(final SubLObject db_info)
  {
    assert NIL != db_info_p( db_info ) : db_info;
    return Sequences.cconcatenate( db_info_constant_base_name( db_info ), $str69$_KS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 7667L)
  public static SubLObject db_info_table_info(final SubLObject db_info, final SubLObject id)
  {
    final SubLObject dict = db_info_table_info_index( db_info );
    return dictionary.dictionary_lookup( dict, id, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 7808L)
  public static SubLObject print_db_info_contents(final SubLObject db_info)
  {
    PrintLow.format( T, $str70$_s__, db_info );
    PrintLow.format( T, $str71$db_name___s__, db_info_db_name( db_info ) );
    PrintLow.format( T, $str72$server___s__, db_info_server( db_info ) );
    PrintLow.format( T, $str73$port___s__, db_info_port( db_info ) );
    PrintLow.format( T, $str74$proxy_host___s__, db_info_proxy_host( db_info ) );
    PrintLow.format( T, $str75$proxy_port___s__, db_info_proxy_port( db_info ) );
    PrintLow.format( T, $str76$user___s__, db_info_user( db_info ) );
    PrintLow.format( T, $str77$pass___s__, db_info_pass( db_info ) );
    PrintLow.format( T, $str78$subprotocol___s__, db_info_subprotocol( db_info ) );
    PrintLow.format( T, $str79$sql_flavor___s__, db_info_sql_flavor( db_info ) );
    PrintLow.format( T, $str80$quoted_isas___s__, db_info_quoted_isas( db_info ) );
    PrintLow.format( T, $str81$input_mt___s__, db_info_input_mt( db_info ) );
    PrintLow.format( T, $str82$content_genl_mts___s__, db_info_content_genl_mts( db_info ) );
    SubLObject cdolist_list_var = db_info_table_infos( db_info );
    SubLObject table_info = NIL;
    table_info = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      streams_high.terpri( UNPROVIDED );
      print_table_info_contents( table_info );
      cdolist_list_var = cdolist_list_var.rest();
      table_info = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 8718L)
  public static SubLObject reindex_db_info_table_infos(final SubLObject db_info)
  {
    final SubLObject dict = db_info_table_info_index( db_info );
    dictionary.clear_dictionary( dict );
    SubLObject cdolist_list_var = db_info_table_infos( db_info );
    SubLObject table_info = NIL;
    table_info = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject id = table_info_id( table_info );
      dictionary.dictionary_enter( dict, id, table_info );
      cdolist_list_var = cdolist_list_var.rest();
      table_info = cdolist_list_var.first();
    }
    return dict;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 9907L)
  public static SubLObject table_info_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_table_info( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 9907L)
  public static SubLObject table_info_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $table_info_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 9907L)
  public static SubLObject tblnfo_id(final SubLObject v_object)
  {
    assert NIL != table_info_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 9907L)
  public static SubLObject tblnfo_constant_base_name(final SubLObject v_object)
  {
    assert NIL != table_info_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 9907L)
  public static SubLObject tblnfo_table_name(final SubLObject v_object)
  {
    assert NIL != table_info_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 9907L)
  public static SubLObject tblnfo_isas(final SubLObject v_object)
  {
    assert NIL != table_info_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 9907L)
  public static SubLObject tblnfo_lf_types(final SubLObject v_object)
  {
    assert NIL != table_info_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 9907L)
  public static SubLObject tblnfo_field_mappings(final SubLObject v_object)
  {
    assert NIL != table_info_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 9907L)
  public static SubLObject tblnfo_meaning_sentences(final SubLObject v_object)
  {
    assert NIL != table_info_p( v_object ) : v_object;
    return v_object.getField8();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 9907L)
  public static SubLObject tblnfo_enumerableP(final SubLObject v_object)
  {
    assert NIL != table_info_p( v_object ) : v_object;
    return v_object.getField9();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 9907L)
  public static SubLObject tblnfo_field_names(final SubLObject v_object)
  {
    assert NIL != table_info_p( v_object ) : v_object;
    return v_object.getField10();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 9907L)
  public static SubLObject tblnfo_field_types(final SubLObject v_object)
  {
    assert NIL != table_info_p( v_object ) : v_object;
    return v_object.getField11();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 9907L)
  public static SubLObject tblnfo_primary_key(final SubLObject v_object)
  {
    assert NIL != table_info_p( v_object ) : v_object;
    return v_object.getField12();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 9907L)
  public static SubLObject tblnfo_indexes(final SubLObject v_object)
  {
    assert NIL != table_info_p( v_object ) : v_object;
    return v_object.getField13();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 9907L)
  public static SubLObject tblnfo_field_encodings(final SubLObject v_object)
  {
    assert NIL != table_info_p( v_object ) : v_object;
    return v_object.getField14();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 9907L)
  public static SubLObject tblnfo_field_decodings(final SubLObject v_object)
  {
    assert NIL != table_info_p( v_object ) : v_object;
    return v_object.getField15();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 9907L)
  public static SubLObject tblnfo_foreign_key_maps(final SubLObject v_object)
  {
    assert NIL != table_info_p( v_object ) : v_object;
    return v_object.getField16();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 9907L)
  public static SubLObject tblnfo_non_null_field_list(final SubLObject v_object)
  {
    assert NIL != table_info_p( v_object ) : v_object;
    return v_object.getField17();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 9907L)
  public static SubLObject tblnfo_unique_field_tuples(final SubLObject v_object)
  {
    assert NIL != table_info_p( v_object ) : v_object;
    return v_object.getField18();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 9907L)
  public static SubLObject _csetf_tblnfo_id(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != table_info_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 9907L)
  public static SubLObject _csetf_tblnfo_constant_base_name(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != table_info_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 9907L)
  public static SubLObject _csetf_tblnfo_table_name(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != table_info_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 9907L)
  public static SubLObject _csetf_tblnfo_isas(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != table_info_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 9907L)
  public static SubLObject _csetf_tblnfo_lf_types(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != table_info_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 9907L)
  public static SubLObject _csetf_tblnfo_field_mappings(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != table_info_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 9907L)
  public static SubLObject _csetf_tblnfo_meaning_sentences(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != table_info_p( v_object ) : v_object;
    return v_object.setField8( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 9907L)
  public static SubLObject _csetf_tblnfo_enumerableP(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != table_info_p( v_object ) : v_object;
    return v_object.setField9( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 9907L)
  public static SubLObject _csetf_tblnfo_field_names(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != table_info_p( v_object ) : v_object;
    return v_object.setField10( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 9907L)
  public static SubLObject _csetf_tblnfo_field_types(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != table_info_p( v_object ) : v_object;
    return v_object.setField11( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 9907L)
  public static SubLObject _csetf_tblnfo_primary_key(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != table_info_p( v_object ) : v_object;
    return v_object.setField12( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 9907L)
  public static SubLObject _csetf_tblnfo_indexes(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != table_info_p( v_object ) : v_object;
    return v_object.setField13( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 9907L)
  public static SubLObject _csetf_tblnfo_field_encodings(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != table_info_p( v_object ) : v_object;
    return v_object.setField14( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 9907L)
  public static SubLObject _csetf_tblnfo_field_decodings(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != table_info_p( v_object ) : v_object;
    return v_object.setField15( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 9907L)
  public static SubLObject _csetf_tblnfo_foreign_key_maps(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != table_info_p( v_object ) : v_object;
    return v_object.setField16( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 9907L)
  public static SubLObject _csetf_tblnfo_non_null_field_list(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != table_info_p( v_object ) : v_object;
    return v_object.setField17( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 9907L)
  public static SubLObject _csetf_tblnfo_unique_field_tuples(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != table_info_p( v_object ) : v_object;
    return v_object.setField18( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 9907L)
  public static SubLObject make_table_info(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $table_info_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw125$ID ) )
      {
        _csetf_tblnfo_id( v_new, current_value );
      }
      else if( pcase_var.eql( $kw40$CONSTANT_BASE_NAME ) )
      {
        _csetf_tblnfo_constant_base_name( v_new, current_value );
      }
      else if( pcase_var.eql( $kw126$TABLE_NAME ) )
      {
        _csetf_tblnfo_table_name( v_new, current_value );
      }
      else if( pcase_var.eql( $kw127$ISAS ) )
      {
        _csetf_tblnfo_isas( v_new, current_value );
      }
      else if( pcase_var.eql( $kw128$LF_TYPES ) )
      {
        _csetf_tblnfo_lf_types( v_new, current_value );
      }
      else if( pcase_var.eql( $kw129$FIELD_MAPPINGS ) )
      {
        _csetf_tblnfo_field_mappings( v_new, current_value );
      }
      else if( pcase_var.eql( $kw130$MEANING_SENTENCES ) )
      {
        _csetf_tblnfo_meaning_sentences( v_new, current_value );
      }
      else if( pcase_var.eql( $kw131$ENUMERABLE_ ) )
      {
        _csetf_tblnfo_enumerableP( v_new, current_value );
      }
      else if( pcase_var.eql( $kw132$FIELD_NAMES ) )
      {
        _csetf_tblnfo_field_names( v_new, current_value );
      }
      else if( pcase_var.eql( $kw133$FIELD_TYPES ) )
      {
        _csetf_tblnfo_field_types( v_new, current_value );
      }
      else if( pcase_var.eql( $kw134$PRIMARY_KEY ) )
      {
        _csetf_tblnfo_primary_key( v_new, current_value );
      }
      else if( pcase_var.eql( $kw135$INDEXES ) )
      {
        _csetf_tblnfo_indexes( v_new, current_value );
      }
      else if( pcase_var.eql( $kw136$FIELD_ENCODINGS ) )
      {
        _csetf_tblnfo_field_encodings( v_new, current_value );
      }
      else if( pcase_var.eql( $kw137$FIELD_DECODINGS ) )
      {
        _csetf_tblnfo_field_decodings( v_new, current_value );
      }
      else if( pcase_var.eql( $kw138$FOREIGN_KEY_MAPS ) )
      {
        _csetf_tblnfo_foreign_key_maps( v_new, current_value );
      }
      else if( pcase_var.eql( $kw139$NON_NULL_FIELD_LIST ) )
      {
        _csetf_tblnfo_non_null_field_list( v_new, current_value );
      }
      else if( pcase_var.eql( $kw140$UNIQUE_FIELD_TUPLES ) )
      {
        _csetf_tblnfo_unique_field_tuples( v_new, current_value );
      }
      else
      {
        Errors.error( $str55$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 9907L)
  public static SubLObject visit_defstruct_table_info(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw56$BEGIN, $sym141$MAKE_TABLE_INFO, SEVENTEEN_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw58$SLOT, $kw125$ID, tblnfo_id( obj ) );
    Functions.funcall( visitor_fn, obj, $kw58$SLOT, $kw40$CONSTANT_BASE_NAME, tblnfo_constant_base_name( obj ) );
    Functions.funcall( visitor_fn, obj, $kw58$SLOT, $kw126$TABLE_NAME, tblnfo_table_name( obj ) );
    Functions.funcall( visitor_fn, obj, $kw58$SLOT, $kw127$ISAS, tblnfo_isas( obj ) );
    Functions.funcall( visitor_fn, obj, $kw58$SLOT, $kw128$LF_TYPES, tblnfo_lf_types( obj ) );
    Functions.funcall( visitor_fn, obj, $kw58$SLOT, $kw129$FIELD_MAPPINGS, tblnfo_field_mappings( obj ) );
    Functions.funcall( visitor_fn, obj, $kw58$SLOT, $kw130$MEANING_SENTENCES, tblnfo_meaning_sentences( obj ) );
    Functions.funcall( visitor_fn, obj, $kw58$SLOT, $kw131$ENUMERABLE_, tblnfo_enumerableP( obj ) );
    Functions.funcall( visitor_fn, obj, $kw58$SLOT, $kw132$FIELD_NAMES, tblnfo_field_names( obj ) );
    Functions.funcall( visitor_fn, obj, $kw58$SLOT, $kw133$FIELD_TYPES, tblnfo_field_types( obj ) );
    Functions.funcall( visitor_fn, obj, $kw58$SLOT, $kw134$PRIMARY_KEY, tblnfo_primary_key( obj ) );
    Functions.funcall( visitor_fn, obj, $kw58$SLOT, $kw135$INDEXES, tblnfo_indexes( obj ) );
    Functions.funcall( visitor_fn, obj, $kw58$SLOT, $kw136$FIELD_ENCODINGS, tblnfo_field_encodings( obj ) );
    Functions.funcall( visitor_fn, obj, $kw58$SLOT, $kw137$FIELD_DECODINGS, tblnfo_field_decodings( obj ) );
    Functions.funcall( visitor_fn, obj, $kw58$SLOT, $kw138$FOREIGN_KEY_MAPS, tblnfo_foreign_key_maps( obj ) );
    Functions.funcall( visitor_fn, obj, $kw58$SLOT, $kw139$NON_NULL_FIELD_LIST, tblnfo_non_null_field_list( obj ) );
    Functions.funcall( visitor_fn, obj, $kw58$SLOT, $kw140$UNIQUE_FIELD_TUPLES, tblnfo_unique_field_tuples( obj ) );
    Functions.funcall( visitor_fn, obj, $kw59$END, $sym141$MAKE_TABLE_INFO, SEVENTEEN_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 9907L)
  public static SubLObject visit_defstruct_object_table_info_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_table_info( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 10517L)
  public static SubLObject print_table_info(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    PrintLow.format( stream, $str143$_TABLE_INFO__a___a_, tblnfo_id( v_object ), tblnfo_constant_base_name( v_object ) );
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 10708L)
  public static SubLObject new_table_info(final SubLObject id, final SubLObject constant_base_name, final SubLObject isas, final SubLObject lf_types, final SubLObject field_mappings, final SubLObject meaning_sentences,
      final SubLObject enumerableP, final SubLObject table_name, final SubLObject field_names, final SubLObject field_types, final SubLObject primary_key, final SubLObject indexes, final SubLObject field_encodings,
      final SubLObject field_decodings, final SubLObject foreign_key_maps, final SubLObject non_null_field_list, final SubLObject unique_field_tuples)
  {
    assert NIL != table_info_id_p( id ) : id;
    assert NIL != Types.stringp( constant_base_name ) : constant_base_name;
    assert NIL != list_utilities.non_dotted_list_p( isas ) : isas;
    SubLObject cdolist_list_var = isas;
    SubLObject elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != fort_types_interface.collection_p( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    assert NIL != list_utilities.non_dotted_list_p( lf_types ) : lf_types;
    cdolist_list_var = lf_types;
    elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != fort_types_interface.collection_p( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    assert NIL != list_utilities.non_dotted_list_p( field_mappings ) : field_mappings;
    cdolist_list_var = field_mappings;
    elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != table_info_field_mapping_p( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    assert NIL != list_utilities.non_dotted_list_p( meaning_sentences ) : meaning_sentences;
    cdolist_list_var = meaning_sentences;
    elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != cycl_grammar.cycl_sentence_p( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    assert NIL != Types.booleanp( enumerableP ) : enumerableP;
    assert NIL != Types.stringp( table_name ) : table_name;
    assert NIL != list_utilities.non_dotted_list_p( field_names ) : field_names;
    cdolist_list_var = field_names;
    elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != Types.stringp( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    assert NIL != list_utilities.non_dotted_list_p( field_types ) : field_types;
    cdolist_list_var = field_types;
    elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != forts.fort_p( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    assert NIL != list_utilities.non_dotted_list_p( primary_key ) : primary_key;
    cdolist_list_var = primary_key;
    elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != Types.stringp( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    SubLObject cdolist_list_var2 = indexes;
    SubLObject index = NIL;
    index = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      final SubLObject list_var = index;
      assert NIL != list_utilities.non_dotted_list_p( list_var ) : list_var;
      SubLObject cdolist_list_var_$1 = list_var;
      SubLObject elem2 = NIL;
      elem2 = cdolist_list_var_$1.first();
      while ( NIL != cdolist_list_var_$1)
      {
        assert NIL != Types.stringp( elem2 ) : elem2;
        cdolist_list_var_$1 = cdolist_list_var_$1.rest();
        elem2 = cdolist_list_var_$1.first();
      }
      cdolist_list_var2 = cdolist_list_var2.rest();
      index = cdolist_list_var2.first();
    }
    assert NIL != list_utilities.non_dotted_list_p( field_encodings ) : field_encodings;
    cdolist_list_var = field_encodings;
    elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != table_info_field_encoding_p( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    assert NIL != list_utilities.non_dotted_list_p( field_decodings ) : field_decodings;
    cdolist_list_var = field_decodings;
    elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != table_info_field_decoding_p( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    assert NIL != list_utilities.non_dotted_list_p( foreign_key_maps ) : foreign_key_maps;
    cdolist_list_var = foreign_key_maps;
    elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != table_info_foreign_key_map_p( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    assert NIL != list_utilities.non_dotted_list_p( non_null_field_list ) : non_null_field_list;
    cdolist_list_var = non_null_field_list;
    elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != Types.stringp( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    cdolist_list_var2 = unique_field_tuples;
    SubLObject unique_field_list = NIL;
    unique_field_list = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      final SubLObject list_var = unique_field_list;
      assert NIL != list_utilities.non_dotted_list_p( list_var ) : list_var;
      SubLObject cdolist_list_var_$2 = list_var;
      SubLObject elem2 = NIL;
      elem2 = cdolist_list_var_$2.first();
      while ( NIL != cdolist_list_var_$2)
      {
        assert NIL != Types.stringp( elem2 ) : elem2;
        cdolist_list_var_$2 = cdolist_list_var_$2.rest();
        elem2 = cdolist_list_var_$2.first();
      }
      cdolist_list_var2 = cdolist_list_var2.rest();
      unique_field_list = cdolist_list_var2.first();
    }
    final SubLObject table_info = make_table_info( UNPROVIDED );
    _csetf_tblnfo_id( table_info, id );
    _csetf_tblnfo_constant_base_name( table_info, constant_base_name );
    _csetf_tblnfo_isas( table_info, isas );
    _csetf_tblnfo_lf_types( table_info, lf_types );
    _csetf_tblnfo_field_mappings( table_info, field_mappings );
    _csetf_tblnfo_meaning_sentences( table_info, meaning_sentences );
    _csetf_tblnfo_enumerableP( table_info, enumerableP );
    _csetf_tblnfo_table_name( table_info, table_name );
    _csetf_tblnfo_field_names( table_info, field_names );
    _csetf_tblnfo_field_types( table_info, field_types );
    _csetf_tblnfo_primary_key( table_info, primary_key );
    _csetf_tblnfo_indexes( table_info, indexes );
    _csetf_tblnfo_field_encodings( table_info, field_encodings );
    _csetf_tblnfo_field_decodings( table_info, field_decodings );
    _csetf_tblnfo_foreign_key_maps( table_info, foreign_key_maps );
    _csetf_tblnfo_non_null_field_list( table_info, non_null_field_list );
    _csetf_tblnfo_unique_field_tuples( table_info, unique_field_tuples );
    return table_info;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 12913L)
  public static SubLObject table_info_id(final SubLObject table_info)
  {
    assert NIL != table_info_p( table_info ) : table_info;
    return tblnfo_id( table_info );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 13040L)
  public static SubLObject table_info_constant_base_name(final SubLObject table_info)
  {
    assert NIL != table_info_p( table_info ) : table_info;
    return tblnfo_constant_base_name( table_info );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 13187L)
  public static SubLObject table_info_isas(final SubLObject table_info)
  {
    assert NIL != table_info_p( table_info ) : table_info;
    return tblnfo_isas( table_info );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 13306L)
  public static SubLObject table_info_lf_types(final SubLObject table_info)
  {
    assert NIL != table_info_p( table_info ) : table_info;
    return tblnfo_lf_types( table_info );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 13433L)
  public static SubLObject table_info_field_mappings(final SubLObject table_info)
  {
    assert NIL != table_info_p( table_info ) : table_info;
    return tblnfo_field_mappings( table_info );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 13572L)
  public static SubLObject table_info_meaning_sentences(final SubLObject table_info)
  {
    assert NIL != table_info_p( table_info ) : table_info;
    return tblnfo_meaning_sentences( table_info );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 13717L)
  public static SubLObject table_info_enumerableP(final SubLObject table_info)
  {
    assert NIL != table_info_p( table_info ) : table_info;
    return tblnfo_enumerableP( table_info );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 13850L)
  public static SubLObject table_info_table_name(final SubLObject table_info)
  {
    assert NIL != table_info_p( table_info ) : table_info;
    return tblnfo_table_name( table_info );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 13981L)
  public static SubLObject table_info_field_names(final SubLObject table_info)
  {
    assert NIL != table_info_p( table_info ) : table_info;
    return tblnfo_field_names( table_info );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 14114L)
  public static SubLObject table_info_field_types(final SubLObject table_info)
  {
    assert NIL != table_info_p( table_info ) : table_info;
    return tblnfo_field_types( table_info );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 14247L)
  public static SubLObject table_info_primary_key(final SubLObject table_info)
  {
    assert NIL != table_info_p( table_info ) : table_info;
    return tblnfo_primary_key( table_info );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 14380L)
  public static SubLObject table_info_indexes(final SubLObject table_info)
  {
    assert NIL != table_info_p( table_info ) : table_info;
    return tblnfo_indexes( table_info );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 14505L)
  public static SubLObject table_info_field_encodings(final SubLObject table_info)
  {
    assert NIL != table_info_p( table_info ) : table_info;
    return tblnfo_field_encodings( table_info );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 14646L)
  public static SubLObject table_info_field_decodings(final SubLObject table_info)
  {
    assert NIL != table_info_p( table_info ) : table_info;
    return tblnfo_field_decodings( table_info );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 14787L)
  public static SubLObject table_info_foreign_key_maps(final SubLObject table_info)
  {
    assert NIL != table_info_p( table_info ) : table_info;
    return tblnfo_foreign_key_maps( table_info );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 14930L)
  public static SubLObject table_info_non_null_field_list(final SubLObject table_info)
  {
    assert NIL != table_info_p( table_info ) : table_info;
    return tblnfo_non_null_field_list( table_info );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 15079L)
  public static SubLObject table_info_unique_field_tuples(final SubLObject table_info)
  {
    assert NIL != table_info_p( table_info ) : table_info;
    return tblnfo_unique_field_tuples( table_info );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 15228L)
  public static SubLObject set_table_info_constant_base_name(final SubLObject table_info, final SubLObject constant_base_name)
  {
    assert NIL != table_info_p( table_info ) : table_info;
    assert NIL != Types.stringp( constant_base_name ) : constant_base_name;
    _csetf_tblnfo_constant_base_name( table_info, constant_base_name );
    return table_info;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 15492L)
  public static SubLObject set_table_info_lf_types(final SubLObject table_info, final SubLObject lf_types)
  {
    assert NIL != table_info_p( table_info ) : table_info;
    assert NIL != list_utilities.non_dotted_list_p( lf_types ) : lf_types;
    SubLObject cdolist_list_var = lf_types;
    SubLObject elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != fort_types_interface.collection_p( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    _csetf_tblnfo_lf_types( table_info, lf_types );
    return table_info;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 15704L)
  public static SubLObject set_table_info_meaning_sentences(final SubLObject table_info, final SubLObject meaning_sentences)
  {
    assert NIL != table_info_p( table_info ) : table_info;
    assert NIL != list_utilities.non_dotted_list_p( meaning_sentences ) : meaning_sentences;
    SubLObject cdolist_list_var = meaning_sentences;
    SubLObject elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != fort_types_interface.collection_p( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    _csetf_tblnfo_meaning_sentences( table_info, meaning_sentences );
    return table_info;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 15961L)
  public static SubLObject set_table_info_table_name(final SubLObject table_info, final SubLObject table_name)
  {
    assert NIL != table_info_p( table_info ) : table_info;
    assert NIL != Types.stringp( table_name ) : table_name;
    _csetf_tblnfo_table_name( table_info, table_name );
    return table_info;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 16173L)
  public static SubLObject table_info_ks_name(final SubLObject table_info)
  {
    assert NIL != table_info_p( table_info ) : table_info;
    return Sequences.cconcatenate( table_info_constant_base_name( table_info ), $str69$_KS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 16348L)
  public static SubLObject table_info_ls_name(final SubLObject table_info)
  {
    assert NIL != table_info_p( table_info ) : table_info;
    return Sequences.cconcatenate( table_info_constant_base_name( table_info ), $str151$_LS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 16509L)
  public static SubLObject table_info_ps_name(final SubLObject table_info)
  {
    assert NIL != table_info_p( table_info ) : table_info;
    return Sequences.cconcatenate( table_info_constant_base_name( table_info ), $str152$_PS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 16670L)
  public static SubLObject print_table_info_contents(final SubLObject table_info)
  {
    PrintLow.format( T, $str70$_s__, table_info );
    PrintLow.format( T, $str153$table_name__s__, table_info_table_name( table_info ) );
    PrintLow.format( T, $str154$isas___s__, table_info_isas( table_info ) );
    PrintLow.format( T, $str155$LF_types___s__, table_info_lf_types( table_info ) );
    PrintLow.format( T, $str156$field_mappings__s__, table_info_field_mappings( table_info ) );
    PrintLow.format( T, $str157$meaning_sentences___s__, table_info_meaning_sentences( table_info ) );
    PrintLow.format( T, $str158$enumerable___s__, table_info_enumerableP( table_info ) );
    PrintLow.format( T, $str159$field_names__s__, table_info_field_names( table_info ) );
    PrintLow.format( T, $str160$field_types__s__, table_info_field_types( table_info ) );
    PrintLow.format( T, $str161$primary_key__s__, table_info_primary_key( table_info ) );
    PrintLow.format( T, $str162$indexes__s__, table_info_indexes( table_info ) );
    PrintLow.format( T, $str163$field_encodings__s__, table_info_field_encodings( table_info ) );
    PrintLow.format( T, $str164$field_decodings__s__, table_info_field_decodings( table_info ) );
    PrintLow.format( T, $str165$foreign_key_maps__s__, table_info_foreign_key_maps( table_info ) );
    PrintLow.format( T, $str166$non_null_field_list__s__, table_info_non_null_field_list( table_info ) );
    PrintLow.format( T, $str167$unique_field_tuples__s__, table_info_unique_field_tuples( table_info ) );
    return table_info;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 17860L)
  public static SubLObject table_info_id_p(final SubLObject v_object)
  {
    return Types.integerp( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 17948L)
  public static SubLObject table_info_field_encoding_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isCons() && NIL != list_utilities.lengthE( v_object, TWO_INTEGER, UNPROVIDED ) && v_object.first().isString() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 18089L)
  public static SubLObject table_info_field_decoding_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isCons() && NIL != list_utilities.lengthE( v_object, TWO_INTEGER, UNPROVIDED ) && NIL != table_info_logical_field_indexical_p( v_object.first() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 18259L)
  public static SubLObject table_info_foreign_key_map_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isCons() && NIL != list_utilities.lengthE( v_object, THREE_INTEGER, UNPROVIDED ) && NIL != list_utilities.list_of_type_p( $sym62$STRINGP, v_object.first() ) && NIL != table_info_id_p(
        conses_high.second( v_object ) ) && NIL != list_utilities.list_of_type_p( $sym62$STRINGP, conses_high.third( v_object ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 18504L)
  public static SubLObject table_info_field_mapping_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isCons() && NIL != list_utilities.lengthE( v_object, TWO_INTEGER, UNPROVIDED ) && NIL != table_info_logical_field_p( v_object.first() ) && NIL != forts.fort_p( conses_high.second(
        v_object ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 18694L)
  public static SubLObject table_info_logical_field_indexical_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isCons() && NIL != list_utilities.lengthE( v_object, FOUR_INTEGER, UNPROVIDED ) && $kw168$LFI == v_object.first() && NIL != table_info_id_p( conses_high.second( v_object ) )
        && NIL != forts.fort_p( conses_high.third( v_object ) ) && conses_high.fourth( v_object ).isInteger() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 19119L)
  public static SubLObject table_info_logical_field_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isCons() && NIL != list_utilities.lengthE( v_object, FOUR_INTEGER, UNPROVIDED ) && $kw169$LF == v_object.first() && NIL != table_info_id_p( conses_high.second( v_object ) )
        && NIL != forts.fort_p( conses_high.third( v_object ) ) && conses_high.fourth( v_object ).isInteger() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 19361L)
  public static SubLObject table_info_physical_field_indexical_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isCons() && NIL != list_utilities.lengthE( v_object, THREE_INTEGER, UNPROVIDED ) && $kw170$PFI == v_object.first() && NIL != table_info_id_p( conses_high.second( v_object ) )
        && conses_high.third( v_object ).isString() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 19583L)
  public static SubLObject table_info_physical_field_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isCons() && NIL != list_utilities.lengthE( v_object, THREE_INTEGER, UNPROVIDED ) && $kw171$PF == v_object.first() && NIL != table_info_id_p( conses_high.second( v_object ) )
        && conses_high.third( v_object ).isString() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 19794L)
  public static SubLObject table_info_sk_source_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isCons() && NIL != list_utilities.lengthE( v_object, TWO_INTEGER, UNPROVIDED ) && $kw172$KS == v_object.first() && NIL != table_info_id_p( conses_high.second( v_object ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 19969L)
  public static SubLObject table_info_logical_schema_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isCons() && NIL != list_utilities.lengthE( v_object, TWO_INTEGER, UNPROVIDED ) && $kw173$LS == v_object.first() && NIL != table_info_id_p( conses_high.second( v_object ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 20149L)
  public static SubLObject table_info_physical_schema_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isCons() && NIL != list_utilities.lengthE( v_object, TWO_INTEGER, UNPROVIDED ) && $kw174$PS == v_object.first() && NIL != table_info_id_p( conses_high.second( v_object ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 20561L)
  public static SubLObject clone_database(final SubLObject input_sk_source, SubLObject kill_old_clonesP)
  {
    if( kill_old_clonesP == UNPROVIDED )
    {
      kill_old_clonesP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject cloned_ks = NIL;
    final SubLObject _prev_bind_0 = $within_sksi_database_fusionP$.currentBinding( thread );
    try
    {
      $within_sksi_database_fusionP$.bind( T, thread );
      if( NIL != kill_old_clonesP )
      {
        kill_all_cloned_databases( input_sk_source );
      }
      final SubLObject db_info = compute_and_clone_db_info( input_sk_source );
      cloned_ks = reify_cloned_db_info( db_info, input_sk_source );
      sksi_create_sks.sksi_create_structured_knowledge_source( cloned_ks, UNPROVIDED );
      sksi_populate_cloned_ks( db_info, input_sk_source, cloned_ks );
    }
    finally
    {
      $within_sksi_database_fusionP$.rebind( _prev_bind_0, thread );
    }
    return cloned_ks;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 21477L)
  public static SubLObject kill_all_cloned_databases(final SubLObject ks)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject successP = T;
    assert NIL != sksi_debugging.valid_sksi_error_handling_mode_p( $kw176$WARN ) : $kw176$WARN;
    final SubLObject _prev_bind_0 = sksi_debugging.$sksi_error_handling_mode$.currentBinding( thread );
    try
    {
      sksi_debugging.$sksi_error_handling_mode$.bind( $kw176$WARN, thread );
      SubLObject cdolist_list_var = kb_mapping_utilities.pred_values( ks, $const178$cloneOfSKS, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      SubLObject cloned_ks = NIL;
      cloned_ks = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL == sksi_create_sks.sksi_destroy_structured_knowledge_source( cloned_ks, UNPROVIDED ) )
        {
          successP = NIL;
        }
        cdolist_list_var = cdolist_list_var.rest();
        cloned_ks = cdolist_list_var.first();
      }
    }
    finally
    {
      sksi_debugging.$sksi_error_handling_mode$.rebind( _prev_bind_0, thread );
    }
    return successP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 21746L)
  public static SubLObject compute_and_clone_db_info(final SubLObject input_sk_source)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject mt = sksi_kb_accessors.sk_source_mapping_mt( input_sk_source );
    assert NIL != hlmt.hlmt_p( mt ) : mt;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      final SubLObject db_info = compute_initial_db_info( input_sk_source );
      clone_db_info_constant_names( db_info );
      clone_db_info_db_name( db_info );
      if( NIL != sksi_database_fusion_debugP() )
      {
        print_db_info_contents( db_info );
      }
      result = db_info;
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    $last_db_info$.setGlobalValue( result );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 22246L)
  public static SubLObject reify_cloned_db_info(final SubLObject db_info, final SubLObject input_sk_source)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject cloned_ks = NIL;
    final SubLObject _prev_bind_0 = control_vars.$inference_debugP$.currentBinding( thread );
    try
    {
      control_vars.$inference_debugP$.bind( T, thread );
      assert NIL != sksi_debugging.valid_sksi_error_handling_mode_p( $kw179$BREAK ) : $kw179$BREAK;
      final SubLObject _prev_bind_0_$3 = sksi_debugging.$sksi_error_handling_mode$.currentBinding( thread );
      try
      {
        sksi_debugging.$sksi_error_handling_mode$.bind( $kw179$BREAK, thread );
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( sksi_kb_accessors.sk_source_mapping_mt( input_sk_source ) );
        final SubLObject _prev_bind_0_$4 = mt_relevance_macros.$mt$.currentBinding( thread );
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
          mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
          mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
          cloned_ks = start_reifying_new_top_level_ks( db_info );
          sksi_kb_accessors.sksi_assert_if_new( ConsesLow.list( $const178$cloneOfSKS, input_sk_source, cloned_ks ), $const180$SKSIMt );
          finish_reifying_db_info( cloned_ks, db_info );
        }
        finally
        {
          mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
          mt_relevance_macros.$mt$.rebind( _prev_bind_0_$4, thread );
        }
      }
      finally
      {
        sksi_debugging.$sksi_error_handling_mode$.rebind( _prev_bind_0_$3, thread );
      }
    }
    finally
    {
      control_vars.$inference_debugP$.rebind( _prev_bind_0, thread );
    }
    return cloned_ks;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 22640L)
  public static SubLObject clone_db_info_constant_names(final SubLObject db_info)
  {
    final SubLObject new_constant_base_name = clone_constant_base_name( db_info_constant_base_name( db_info ) );
    set_db_info_constant_base_name( db_info, new_constant_base_name );
    SubLObject cdolist_list_var = db_info_table_infos( db_info );
    SubLObject table_info = NIL;
    table_info = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject new_constant_base_name2 = clone_constant_base_name( table_info_constant_base_name( table_info ) );
      set_table_info_constant_base_name( table_info, new_constant_base_name2 );
      cdolist_list_var = cdolist_list_var.rest();
      table_info = cdolist_list_var.first();
    }
    return db_info;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 23120L)
  public static SubLObject clone_constant_base_name(final SubLObject original_constant_base_name)
  {
    return Sequences.cconcatenate( original_constant_base_name, $str181$_Cloned );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 23254L)
  public static SubLObject clone_db_info_db_name(final SubLObject db_info)
  {
    final SubLObject original_db_name = db_info_db_name( db_info );
    final SubLObject cloned_db_name = clone_db_name( original_db_name );
    return uniquify_db_info_db_name( cloned_db_name, db_info );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 23686L)
  public static SubLObject clone_db_name(final SubLObject original_db_name)
  {
    return Sequences.cconcatenate( original_db_name, $str182$_cloned );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 23787L)
  public static SubLObject uniquify_db_info_db_name(final SubLObject db_name, final SubLObject db_info)
  {
    SubLObject uniqueP = NIL;
    SubLObject uniquifying_integer = ONE_INTEGER;
    SubLObject uniquifying_suffix = $str183$;
    while ( NIL == uniqueP)
    {
      final SubLObject new_db_name = Sequences.cconcatenate( db_name, uniquifying_suffix );
      set_db_info_db_name( db_info, new_db_name );
      uniqueP = makeBoolean( NIL == db_info_existsP( db_info ) );
      if( NIL == uniqueP )
      {
        uniquifying_integer = Numbers.add( uniquifying_integer, ONE_INTEGER );
        uniquifying_suffix = Sequences.cconcatenate( $str184$_, string_utilities.str( uniquifying_integer ) );
      }
    }
    return db_info;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 24255L)
  public static SubLObject db_info_existsP(final SubLObject db_info)
  {
    SubLObject existsP = NIL;
    SubLObject connection = NIL;
    try
    {
      connection = sksi_sks_interaction.open_sql_source( db_info_access_path( db_info ), ONE_INTEGER, UNPROVIDED );
      if( NIL != sdbc.sql_open_connection_p( connection ) )
      {
        existsP = T;
      }
    }
    finally
    {
      final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values = Values.getValuesAsVector();
        if( NIL != sdbc.sql_open_connection_p( connection ) )
        {
          sdbc.sqlc_close( connection );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
      }
    }
    return existsP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 24696L)
  public static SubLObject db_info_access_path(final SubLObject db_info)
  {
    final SubLObject db_name = db_info_db_name( db_info );
    final SubLObject user = db_info_user( db_info );
    final SubLObject pass = db_info_pass( db_info );
    final SubLObject server = db_info_server( db_info );
    final SubLObject port = db_info_port( db_info );
    final SubLObject proxy_host = db_info_proxy_host( db_info );
    final SubLObject proxy_port = db_info_proxy_port( db_info );
    final SubLObject subprotocol = db_info_subprotocol( db_info );
    final SubLObject sql_flavor = db_info_sql_flavor( db_info );
    return sksi_access_path.new_db_access_path( NIL, db_name, user, pass, server, port, proxy_host, proxy_port, subprotocol, sql_flavor, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 25215L)
  public static SubLObject sksi_populate_cloned_ks(final SubLObject db_info, final SubLObject input_ks, final SubLObject cloned_ks)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = $within_sksi_database_fusionP$.currentBinding( thread );
    try
    {
      $within_sksi_database_fusionP$.bind( T, thread );
      try
      {
        sksi_sks_manager.register_sksi_removal_modules_for_skses( ConsesLow.list( input_ks, cloned_ks ) );
        result = sksi_populate_cloned_ks_int( db_info, cloned_ks );
      }
      finally
      {
        final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          sksi_sks_manager.deregister_sksi_removal_modules_for_skses( ConsesLow.list( input_ks, cloned_ks ) );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$5, thread );
        }
      }
    }
    finally
    {
      $within_sksi_database_fusionP$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 25650L)
  public static SubLObject sksi_populate_cloned_ks_int(final SubLObject db_info, final SubLObject output_ks)
  {
    SubLObject successP = T;
    final SubLObject input_mt = db_info_input_mt( db_info );
    final SubLObject output_mt = czer_main.cyc_find_or_create_nart( ConsesLow.list( $const185$ContentMtFn, output_ks ), UNPROVIDED );
    SubLObject cdolist_list_var = db_info_table_infos( db_info );
    SubLObject table_info = NIL;
    table_info = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == sksi_populate_sub_ks( input_mt, output_mt, table_info ) )
      {
        successP = NIL;
      }
      cdolist_list_var = cdolist_list_var.rest();
      table_info = cdolist_list_var.first();
    }
    return successP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 26037L)
  public static SubLObject sksi_populate_sub_ks(final SubLObject input_mt, final SubLObject output_mt, final SubLObject table_info)
  {
    final SubLObject meaning_sentences = table_info_meaning_sentences( table_info );
    final SubLObject consequent;
    final SubLObject antecedent = consequent = sksi_saturate_rule_variablize_antecedent( simplifier.simplify_cycl_conjunction( simplifier.conjoin( meaning_sentences, T ), UNPROVIDED ) );
    final SubLObject sksi_saturate_rule = ConsesLow.list( $const186$sksiSaturateRule, ConsesLow.list( $const187$implies, antecedent, consequent ), input_mt, output_mt );
    return inference_kernel.new_cyc_query( sksi_saturate_rule, $const188$UniversalVocabularyMt, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 26811L)
  public static SubLObject sksi_saturate_rule_variablize_antecedent(final SubLObject antecedent)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = $current_table_info_variable_count$.currentBinding( thread );
    final SubLObject _prev_bind_2 = $table_info_lfi_variable_dict$.currentBinding( thread );
    try
    {
      $current_table_info_variable_count$.bind( ZERO_INTEGER, thread );
      $table_info_lfi_variable_dict$.bind( dictionary.new_dictionary( Symbols.symbol_function( EQUAL ), UNPROVIDED ), thread );
      result = cycl_utilities.expression_transform( antecedent, $sym189$TABLE_INFO_LOGICAL_FIELD_INDEXICAL_P, $sym190$VARIABLIZE_TABLE_INFO_LFI, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      $table_info_lfi_variable_dict$.rebind( _prev_bind_2, thread );
      $current_table_info_variable_count$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 27153L)
  public static SubLObject variablize_table_info_lfi(final SubLObject table_info_lfi)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject existing_var = dictionary.dictionary_lookup( $table_info_lfi_variable_dict$.getDynamicValue( thread ), table_info_lfi, UNPROVIDED );
    if( NIL != existing_var )
    {
      return existing_var;
    }
    final SubLObject new_var = variables.find_variable_by_id( $current_table_info_variable_count$.getDynamicValue( thread ) );
    dictionary.dictionary_enter( $table_info_lfi_variable_dict$.getDynamicValue( thread ), table_info_lfi, new_var );
    $current_table_info_variable_count$.setDynamicValue( Numbers.add( $current_table_info_variable_count$.getDynamicValue( thread ), ONE_INTEGER ), thread );
    return new_var;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 27571L)
  public static SubLObject sksi_database_fusion_clones_or_fusionsP(final SubLObject constant1, final SubLObject constant2)
  {
    return makeBoolean( NIL != sksi_database_fusion_clonesP( constant1, constant2 ) || NIL != sksi_database_fusion_fusionsP( constant1, constant2 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 27849L)
  public static SubLObject sksi_database_fusion_clonesP(final SubLObject constant1, final SubLObject constant2)
  {
    if( NIL != constant_handles.constant_p( constant1 ) && NIL != constant_handles.constant_p( constant2 ) )
    {
      return makeBoolean( NIL != sksi_database_fusion_clones_intP( constant1, constant2 ) || NIL != sksi_database_fusion_clones_intP( constant2, constant1 ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 28114L)
  public static SubLObject sksi_database_fusion_clones_intP(final SubLObject constant, final SubLObject cloned_constant)
  {
    final SubLObject name = constants_high.constant_name( constant );
    final SubLObject cloned_name = constants_high.constant_name( cloned_constant );
    final SubLObject cloned_pos = Sequences.search( $str181$_Cloned, cloned_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != cloned_pos && NIL != list_utilities.lengthGE( name, cloned_pos, UNPROVIDED ) )
    {
      final SubLObject cloned_header = string_utilities.substring( cloned_name, ZERO_INTEGER, cloned_pos );
      final SubLObject header = string_utilities.substring( name, ZERO_INTEGER, cloned_pos );
      if( header.equalp( cloned_header ) )
      {
        return T;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 28591L)
  public static SubLObject sksi_database_fusion_fusionsP(final SubLObject constant1, final SubLObject constant2)
  {
    if( NIL != constant_handles.constant_p( constant1 ) && NIL != constant_handles.constant_p( constant2 ) )
    {
      return makeBoolean( NIL != sksi_database_fusion_fusions_intP( constant1, constant2 ) || NIL != sksi_database_fusion_fusions_intP( constant2, constant1 ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 28859L)
  public static SubLObject sksi_database_fusion_fusions_intP(final SubLObject constant, final SubLObject fused_constant)
  {
    final SubLObject name = constants_high.constant_name( constant );
    final SubLObject fused_name = constants_high.constant_name( fused_constant );
    final SubLObject fused_pos = Sequences.search( $str191$_Fused, fused_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != fused_pos && NIL != list_utilities.lengthGE( name, fused_pos, UNPROVIDED ) )
    {
      final SubLObject fused_header = string_utilities.string_subst( $str192$1, $str193$2, string_utilities.substring( fused_name, ZERO_INTEGER, fused_pos ), UNPROVIDED );
      final SubLObject header = string_utilities.string_subst( $str192$1, $str193$2, string_utilities.substring( name, ZERO_INTEGER, fused_pos ), UNPROVIDED );
      if( header.equalp( fused_header ) )
      {
        return T;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 29367L)
  public static SubLObject compute_initial_db_info(final SubLObject sk_source)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject db_info = NIL;
    final SubLObject mapping_mt = sksi_kb_accessors.sk_source_mapping_mt( sk_source );
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mapping_mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      final SubLObject constant_base_name = compute_constant_base_name( sk_source );
      final SubLObject access_path = sksi_access_path.sksi_determine_access_path( sk_source, UNPROVIDED, UNPROVIDED );
      final SubLObject db_name = sksi_access_path.access_path_db( access_path );
      final SubLObject server = sksi_access_path.access_path_server( access_path );
      final SubLObject port = sksi_access_path.access_path_port( access_path );
      final SubLObject proxy_host = sksi_access_path.access_path_proxy_server( access_path );
      final SubLObject proxy_port = sksi_access_path.access_path_proxy_port( access_path );
      final SubLObject user = sksi_access_path.access_path_user( access_path );
      final SubLObject pass = sksi_access_path.access_path_password( access_path );
      final SubLObject subprotocol = sksi_access_path.access_path_subprotocol( access_path );
      final SubLObject sql_flavor = sksi_access_path.access_path_sql_flavor( access_path );
      final SubLObject quoted_isas = isa.quoted_isa( sk_source, $const194$BookkeepingMt, UNPROVIDED );
      final SubLObject input_mt = sksi_kb_accessors.sk_source_content_mt( sk_source );
      final SubLObject head_mt = sksi_kb_accessors.sk_source_content_mt_head( sk_source );
      final SubLObject content_genl_mts = genl_mts.genl_mts_from_asserted_assertions( head_mt );
      db_info = new_db_info( constant_base_name, db_name, server, port, proxy_host, proxy_port, user, pass, subprotocol, sql_flavor, quoted_isas, input_mt, content_genl_mts );
      final SubLObject table_infos = compute_initial_table_infos_for_source( sk_source );
      set_db_info_table_infos( db_info, table_infos );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return db_info;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 30738L)
  public static SubLObject compute_initial_table_infos_for_source(final SubLObject input_sk_source)
  {
    SubLObject table_infos = NIL;
    final SubLObject input_sub_sk_sources = sksi_kb_accessors.sk_source_sub_ks_closure( input_sk_source );
    final SubLObject table_kb_index = dictionary.new_dictionary( Symbols.symbol_function( EQ ), UNPROVIDED );
    SubLObject cdolist_list_var = input_sub_sk_sources;
    SubLObject input_sub_sk_source = NIL;
    input_sub_sk_source = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject new_id = integer_sequence_generator.integer_sequence_generator_next( $sksi_database_fusion_table_info_isg$.getGlobalValue() );
      dictionary.dictionary_enter( table_kb_index, input_sub_sk_source, new_id );
      final SubLObject logical_schemata = sksi_kb_accessors.sk_source_logical_schemata( input_sub_sk_source );
      if( NIL != logical_schemata )
      {
        final SubLObject ls = list_utilities.only_one( logical_schemata );
        final SubLObject ps = list_utilities.only_one( sksi_kb_accessors.logical_schema_physical_schemata( ls ) );
        dictionary.dictionary_enter( table_kb_index, ls, new_id );
        dictionary.dictionary_enter( table_kb_index, ps, new_id );
      }
      cdolist_list_var = cdolist_list_var.rest();
      input_sub_sk_source = cdolist_list_var.first();
    }
    cdolist_list_var = input_sub_sk_sources;
    input_sub_sk_source = NIL;
    input_sub_sk_source = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject id = dictionary.dictionary_lookup( table_kb_index, input_sub_sk_source, UNPROVIDED );
      final SubLObject var;
      final SubLObject table_info = var = compute_initial_table_info( input_sub_sk_source, id, table_kb_index );
      if( NIL != var )
      {
        table_infos = ConsesLow.cons( var, table_infos );
      }
      cdolist_list_var = cdolist_list_var.rest();
      input_sub_sk_source = cdolist_list_var.first();
    }
    return Sequences.nreverse( table_infos );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 31890L)
  public static SubLObject compute_initial_table_info(final SubLObject input_sub_sk_source, final SubLObject id, final SubLObject table_kb_index)
  {
    final SubLObject logical_schemata = sksi_kb_accessors.sk_source_logical_schemata( input_sub_sk_source );
    if( NIL != logical_schemata )
    {
      return new_table_info_from_sk_source( input_sub_sk_source, logical_schemata, id, table_kb_index );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 32182L)
  public static SubLObject new_table_info_from_sk_source(final SubLObject input_sub_sk_source, final SubLObject logical_schemata, final SubLObject id, final SubLObject table_kb_index)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject table_name = sksi_kb_accessors.sk_source_name( input_sub_sk_source );
    final SubLObject ls = list_utilities.only_one( logical_schemata );
    final SubLObject ps = list_utilities.only_one( sksi_kb_accessors.logical_schema_physical_schemata( ls ) );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !id.eql( dictionary.dictionary_lookup( table_kb_index, ls, UNPROVIDED ) ) )
    {
      Errors.error( $str195$_s_misindexed_under__s_instead_of, ls, dictionary.dictionary_lookup( ls, table_kb_index, UNPROVIDED ), id );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !id.eql( dictionary.dictionary_lookup( table_kb_index, ps, UNPROVIDED ) ) )
    {
      Errors.error( $str195$_s_misindexed_under__s_instead_of, ps, dictionary.dictionary_lookup( ps, table_kb_index, UNPROVIDED ), id );
    }
    final SubLObject enumerableP = sksi_kb_accessors.physical_schema_enumerableP( ps );
    final SubLObject field_names = Mapping.mapcar( $sym196$PHYSICAL_FIELD_NAME, sksi_kb_accessors.physical_schema_ordered_field_list( ps ) );
    final SubLObject field_types = Mapping.mapcar( $sym197$PHYSICAL_FIELD_DATA_TYPE, sksi_kb_accessors.physical_schema_ordered_field_list( ps ) );
    final SubLObject primary_key = Mapping.mapcar( $sym196$PHYSICAL_FIELD_NAME, sksi_kb_accessors.physical_schema_primary_key( ps ) );
    final SubLObject indexes = Mapping.mapcar( $sym198$MAPCAR_PHYSICAL_FIELD_NAME, sksi_kb_accessors.physical_schema_indexed_fields( ps ) );
    final SubLObject raw_field_encodings = sksi_kb_accessors.physical_schema_field_encodings( ps );
    final SubLObject field_encodings = process_field_encodings_for_table_info( raw_field_encodings, ls, table_kb_index );
    final SubLObject raw_field_decodings = sksi_kb_accessors.logical_schema_field_decodings( ls );
    final SubLObject field_decodings = process_field_decodings_for_table_info( raw_field_decodings, ps, table_kb_index );
    final SubLObject raw_foreign_key_maps = sksi_kb_accessors.physical_schema_foreign_keys( ps );
    final SubLObject foreign_key_maps = process_foreign_key_maps_for_table_info( raw_foreign_key_maps, ps, table_kb_index );
    final SubLObject non_null_field_list = Mapping.mapcar( $sym196$PHYSICAL_FIELD_NAME, sksi_kb_accessors.not_null_physical_fields_for_ps( ps, UNPROVIDED ) );
    final SubLObject unique_field_tuples = Mapping.mapcar( $sym198$MAPCAR_PHYSICAL_FIELD_NAME, sksi_kb_accessors.physical_schema_unique_fields_tuples( ps ) );
    final SubLObject constant_base_name = compute_constant_base_name( input_sub_sk_source );
    final SubLObject isas = sksi_kb_accessors.schema_isa( ls, UNPROVIDED );
    final SubLObject lf_types = sksi_kb_accessors.logical_field_type_list( ls );
    final SubLObject field_mappings = extract_field_mappings_for_table_info( ls, table_kb_index );
    final SubLObject meaning_sentences = process_meaning_sentences_for_table_info( sksi_meaning_sentence_utilities.logical_schema_meaning_sentences( ls, UNPROVIDED, UNPROVIDED, UNPROVIDED ), table_kb_index );
    final SubLObject table_info = new_table_info( id, constant_base_name, isas, lf_types, field_mappings, meaning_sentences, enumerableP, table_name, field_names, field_types, primary_key, indexes, field_encodings,
        field_decodings, foreign_key_maps, non_null_field_list, unique_field_tuples );
    return table_info;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 34464L)
  public static SubLObject compute_constant_base_name(final SubLObject sk_source)
  {
    return string_utilities.post_remove( string_utilities.make_valid_constant_name( kb_paths.fort_name( sk_source ), UNPROVIDED ), $str69$_KS, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 34598L)
  public static SubLObject mapcar_physical_field_name(final SubLObject list)
  {
    return Mapping.mapcar( $sym196$PHYSICAL_FIELD_NAME, list );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 34693L)
  public static SubLObject process_field_encodings_for_table_info(final SubLObject raw_field_encodings, final SubLObject ls, final SubLObject table_kb_index)
  {
    SubLObject field_encodings = NIL;
    SubLObject cdolist_list_var = raw_field_encodings;
    SubLObject raw_field_encoding = NIL;
    raw_field_encoding = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      field_encodings = ConsesLow.cons( process_field_encoding_for_table_info( raw_field_encoding, ls, table_kb_index ), field_encodings );
      cdolist_list_var = cdolist_list_var.rest();
      raw_field_encoding = cdolist_list_var.first();
    }
    return Sequences.nreverse( field_encodings );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 35091L)
  public static SubLObject process_field_encoding_for_table_info(final SubLObject raw_field_encoding, final SubLObject expected_ls, final SubLObject table_kb_index)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    SubLObject pf = NIL;
    SubLObject ls = NIL;
    SubLObject recipe = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( raw_field_encoding, raw_field_encoding, $list199 );
    pf = raw_field_encoding.first();
    SubLObject current = raw_field_encoding.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, raw_field_encoding, $list199 );
    ls = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, raw_field_encoding, $list199 );
    recipe = current.first();
    current = current.rest();
    if( NIL == current )
    {
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !ls.eql( expected_ls ) )
      {
        Errors.error( $str200$Can_t_handle_fieldEncoding_for__s, expected_ls, ls );
      }
      final SubLObject _prev_bind_0 = $table_infoify_expression_table_kb_index$.currentBinding( thread );
      try
      {
        $table_infoify_expression_table_kb_index$.bind( table_kb_index, thread );
        final SubLObject table_info_recipe = cycl_utilities.expression_transform( recipe, $sym201$TABLE_INFOIFIABLE_P, $sym202$TABLE_INFOIFY_OBJECT, UNPROVIDED, UNPROVIDED );
        result = ConsesLow.list( sksi_kb_accessors.physical_field_name( pf ), table_info_recipe );
      }
      finally
      {
        $table_infoify_expression_table_kb_index$.rebind( _prev_bind_0, thread );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( raw_field_encoding, $list199 );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 35644L)
  public static SubLObject table_infoifiable_p(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != sksi_kb_accessors.logical_field_p( v_object ) || NIL != sksi_kb_accessors.logical_field_indexical_p( v_object ) || NIL != sksi_kb_accessors.physical_field_indexical_p( v_object ) )
    {
      return T;
    }
    final SubLObject id = dictionary.dictionary_lookup( $table_infoify_expression_table_kb_index$.getDynamicValue( thread ), v_object, UNPROVIDED );
    if( NIL != id )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 35955L)
  public static SubLObject table_infoify_object(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != sksi_kb_accessors.logical_field_p( v_object ) )
    {
      return table_infoify_logical_field( v_object, $table_infoify_expression_table_kb_index$.getDynamicValue( thread ) );
    }
    if( NIL != sksi_kb_accessors.logical_field_indexical_p( v_object ) )
    {
      return table_infoify_logical_field_indexical( v_object );
    }
    if( NIL != sksi_kb_accessors.physical_field_indexical_p( v_object ) )
    {
      return table_infoify_physical_field_indexical( v_object );
    }
    if( NIL != sksi_kb_accessors.sk_source_p( v_object ) )
    {
      return table_infoify_sk_source( v_object );
    }
    if( NIL != sksi_kb_accessors.isa_logical_schemaP( v_object ) )
    {
      return table_infoify_logical_schema( v_object );
    }
    if( NIL != sksi_kb_accessors.isa_physical_schemaP( v_object ) )
    {
      return table_infoify_physical_schema( v_object );
    }
    return Errors.error( $str203$Can_t_table_infoify__s, v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 36672L)
  public static SubLObject table_infoify_sk_source(final SubLObject ks)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject ks_id = dictionary.dictionary_lookup( $table_infoify_expression_table_kb_index$.getDynamicValue( thread ), ks, UNPROVIDED );
    assert NIL != table_info_id_p( ks_id ) : ks_id;
    return ConsesLow.list( $kw172$KS, ks_id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 36866L)
  public static SubLObject table_infoify_logical_schema(final SubLObject ls)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject ls_id = dictionary.dictionary_lookup( $table_infoify_expression_table_kb_index$.getDynamicValue( thread ), ls, UNPROVIDED );
    assert NIL != table_info_id_p( ls_id ) : ls_id;
    return ConsesLow.list( $kw173$LS, ls_id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 37065L)
  public static SubLObject table_infoify_physical_schema(final SubLObject ps)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject ps_id = dictionary.dictionary_lookup( $table_infoify_expression_table_kb_index$.getDynamicValue( thread ), ps, UNPROVIDED );
    assert NIL != table_info_id_p( ps_id ) : ps_id;
    return ConsesLow.list( $kw174$PS, ps_id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 37265L)
  public static SubLObject table_infoify_logical_field_indexical(final SubLObject lfi)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject ls = cycl_utilities.nat_arg1( lfi, UNPROVIDED );
    final SubLObject ls_id = dictionary.dictionary_lookup( $table_infoify_expression_table_kb_index$.getDynamicValue( thread ), ls, UNPROVIDED );
    final SubLObject col = cycl_utilities.nat_arg2( lfi, UNPROVIDED );
    final SubLObject i = cycl_utilities.nat_arg3( lfi, UNPROVIDED );
    assert NIL != table_info_id_p( ls_id ) : ls_id;
    return ConsesLow.list( $kw168$LFI, ls_id, col, i );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 37558L)
  public static SubLObject process_field_decodings_for_table_info(final SubLObject raw_field_decodings, final SubLObject ps, final SubLObject table_kb_index)
  {
    SubLObject field_decodings = NIL;
    SubLObject cdolist_list_var = raw_field_decodings;
    SubLObject raw_field_decoding = NIL;
    raw_field_decoding = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      field_decodings = ConsesLow.cons( process_field_decoding_for_table_info( raw_field_decoding, ps, table_kb_index ), field_decodings );
      cdolist_list_var = cdolist_list_var.rest();
      raw_field_decoding = cdolist_list_var.first();
    }
    return Sequences.nreverse( field_decodings );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 37886L)
  public static SubLObject process_field_decoding_for_table_info(final SubLObject raw_field_decoding, final SubLObject expected_ps, final SubLObject table_kb_index)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    SubLObject lfi = NIL;
    SubLObject ps = NIL;
    SubLObject recipe = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( raw_field_decoding, raw_field_decoding, $list204 );
    lfi = raw_field_decoding.first();
    SubLObject current = raw_field_decoding.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, raw_field_decoding, $list204 );
    ps = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, raw_field_decoding, $list204 );
    recipe = current.first();
    current = current.rest();
    if( NIL == current )
    {
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !ps.eql( expected_ps ) )
      {
        Errors.error( $str205$Can_t_handle_fieldDecoding_for__s, expected_ps, ps );
      }
      final SubLObject _prev_bind_0 = $table_infoify_expression_table_kb_index$.currentBinding( thread );
      try
      {
        $table_infoify_expression_table_kb_index$.bind( table_kb_index, thread );
        final SubLObject table_info_recipe = cycl_utilities.expression_transform( recipe, $sym201$TABLE_INFOIFIABLE_P, $sym202$TABLE_INFOIFY_OBJECT, UNPROVIDED, UNPROVIDED );
        result = ConsesLow.list( table_infoify_logical_field_indexical( lfi ), table_info_recipe );
      }
      finally
      {
        $table_infoify_expression_table_kb_index$.rebind( _prev_bind_0, thread );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( raw_field_decoding, $list204 );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 38459L)
  public static SubLObject table_infoify_physical_field_indexical(final SubLObject pfi)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject ps = cycl_utilities.nat_arg1( pfi, UNPROVIDED );
    final SubLObject ps_id = dictionary.dictionary_lookup( $table_infoify_expression_table_kb_index$.getDynamicValue( thread ), ps, UNPROVIDED );
    final SubLObject field_name = cycl_utilities.nat_arg2( pfi, UNPROVIDED );
    assert NIL != table_info_id_p( ps_id ) : ps_id;
    return ConsesLow.list( $kw170$PFI, ps_id, field_name );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 38747L)
  public static SubLObject process_foreign_key_maps_for_table_info(final SubLObject raw_foreign_key_maps, final SubLObject ps, final SubLObject table_kb_index)
  {
    SubLObject foreign_key_maps = NIL;
    SubLObject cdolist_list_var = raw_foreign_key_maps;
    SubLObject raw_foreign_key_map = NIL;
    raw_foreign_key_map = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      foreign_key_maps = ConsesLow.cons( process_foreign_key_map_for_table_info( raw_foreign_key_map, ps, table_kb_index ), foreign_key_maps );
      cdolist_list_var = cdolist_list_var.rest();
      raw_foreign_key_map = cdolist_list_var.first();
    }
    return Sequences.nreverse( foreign_key_maps );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 39081L)
  public static SubLObject process_foreign_key_map_for_table_info(final SubLObject raw_map, final SubLObject expected_ps, final SubLObject table_kb_index)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject pfs = NIL;
    SubLObject foreign_ps = NIL;
    SubLObject foreign_pfs = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( raw_map, raw_map, $list206 );
    pfs = raw_map.first();
    SubLObject current = raw_map.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, raw_map, $list206 );
    foreign_ps = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, raw_map, $list206 );
    foreign_pfs = current.first();
    current = current.rest();
    if( NIL == current )
    {
      SubLObject cdolist_list_var = pfs;
      SubLObject pf = NIL;
      pf = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !sksi_kb_accessors.physical_field_schema( pf ).eql( expected_ps ) )
        {
          Errors.error( $str207$Got_physical_schema__s__expected_, sksi_kb_accessors.physical_field_schema( pf ), expected_ps );
        }
        cdolist_list_var = cdolist_list_var.rest();
        pf = cdolist_list_var.first();
      }
      final SubLObject foreign_ps_id = dictionary.dictionary_lookup( table_kb_index, foreign_ps, UNPROVIDED );
      return ConsesLow.list( Mapping.mapcar( $sym196$PHYSICAL_FIELD_NAME, pfs ), foreign_ps_id, Mapping.mapcar( $sym196$PHYSICAL_FIELD_NAME, foreign_pfs ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( raw_map, $list206 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 39577L)
  public static SubLObject fused_sk_source_name(final SubLObject sk_source)
  {
    return Sequences.cconcatenate( $str208$Fused_, string_utilities.make_valid_constant_name( kb_paths.fort_name( sk_source ), UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 39709L)
  public static SubLObject fused_ls_name(final SubLObject ls)
  {
    return Sequences.cconcatenate( $str208$Fused_, string_utilities.make_valid_constant_name( kb_paths.fort_name( ls ), UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 39820L)
  public static SubLObject extract_field_mappings_for_table_info(final SubLObject ls, final SubLObject table_kb_index)
  {
    SubLObject table_info_mappings = NIL;
    SubLObject cdolist_list_var = sksi_kb_accessors.logical_schema_fields( ls );
    SubLObject lf = NIL;
    lf = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$6;
      final SubLObject maps = cdolist_list_var_$6 = sksi_kb_accessors.logical_field_mappings( lf );
      SubLObject map = NIL;
      map = cdolist_list_var_$6.first();
      while ( NIL != cdolist_list_var_$6)
      {
        final SubLObject table_info_mapping = ConsesLow.list( table_infoify_logical_field( lf, table_kb_index ), map );
        table_info_mappings = ConsesLow.cons( table_info_mapping, table_info_mappings );
        cdolist_list_var_$6 = cdolist_list_var_$6.rest();
        map = cdolist_list_var_$6.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      lf = cdolist_list_var.first();
    }
    return Sequences.nreverse( table_info_mappings );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 40235L)
  public static SubLObject table_infoify_logical_field(final SubLObject lf, final SubLObject table_kb_index)
  {
    final SubLObject ls = cycl_utilities.nat_arg1( lf, UNPROVIDED );
    final SubLObject ls_id = dictionary.dictionary_lookup( table_kb_index, ls, UNPROVIDED );
    final SubLObject col = cycl_utilities.nat_arg2( lf, UNPROVIDED );
    final SubLObject i = cycl_utilities.nat_arg3( lf, UNPROVIDED );
    assert NIL != table_info_id_p( ls_id ) : ls_id;
    return ConsesLow.list( $kw169$LF, ls_id, col, i );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 40501L)
  public static SubLObject process_meaning_sentences_for_table_info(final SubLObject raw_meaning_sentences, final SubLObject table_kb_index)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = $table_infoify_expression_table_kb_index$.currentBinding( thread );
    try
    {
      $table_infoify_expression_table_kb_index$.bind( table_kb_index, thread );
      result = cycl_utilities.hl_to_el( cycl_utilities.expression_transform( raw_meaning_sentences, $sym201$TABLE_INFOIFIABLE_P, $sym202$TABLE_INFOIFY_OBJECT, UNPROVIDED, UNPROVIDED ) );
    }
    finally
    {
      $table_infoify_expression_table_kb_index$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 40826L)
  public static SubLObject reify_db_info(final SubLObject db_info)
  {
    final SubLObject top_level_ks = start_reifying_new_top_level_ks( db_info );
    return finish_reifying_db_info( top_level_ks, db_info );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 41017L)
  public static SubLObject finish_reifying_db_info(final SubLObject top_level_ks, final SubLObject db_info)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject mapping_mt = sksi_kb_accessors.sk_source_mapping_mt( top_level_ks );
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mapping_mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      finish_reifying_new_top_level_ks( top_level_ks, db_info );
      final SubLObject kb_table_index = dictionary.new_dictionary( UNPROVIDED, UNPROVIDED );
      SubLObject cdolist_list_var = db_info_table_infos( db_info );
      SubLObject table_info = NIL;
      table_info = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject constants = start_reifying_table_info( table_info, top_level_ks, mapping_mt );
        dictionary.dictionary_enter( kb_table_index, table_info_id( table_info ), constants );
        cdolist_list_var = cdolist_list_var.rest();
        table_info = cdolist_list_var.first();
      }
      cdolist_list_var = db_info_table_infos( db_info );
      table_info = NIL;
      table_info = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject constants = dictionary.dictionary_lookup( kb_table_index, table_info_id( table_info ), UNPROVIDED );
        SubLObject current;
        final SubLObject datum = current = constants;
        SubLObject ks = NIL;
        SubLObject ls = NIL;
        SubLObject ps = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list209 );
        ks = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list209 );
        ls = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list209 );
        ps = current.first();
        current = current.rest();
        if( NIL == current )
        {
          finish_reifying_table_info( table_info, ks, ls, ps, kb_table_index, mapping_mt );
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list209 );
        }
        cdolist_list_var = cdolist_list_var.rest();
        table_info = cdolist_list_var.first();
      }
      sksi_kb_accessors.sksi_assert_if_new( ConsesLow.list( $const210$sksRepresentationComplete, top_level_ks ), mapping_mt );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return top_level_ks;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 42061L)
  public static SubLObject start_reifying_table_info(final SubLObject table_info, final SubLObject top_level_ks, final SubLObject mapping_mt)
  {
    final SubLObject ks = reify_new_sk_source( table_info, top_level_ks, mapping_mt );
    final SubLObject ls = start_reifying_new_logical_schema( table_info_ls_name( table_info ), mapping_mt );
    final SubLObject ps = start_reifying_new_physical_schema( table_info_ps_name( table_info ), mapping_mt );
    sksi_kb_accessors.sksi_assert_if_new( ConsesLow.list( $const211$termDependsOn, ls, ks ), mapping_mt );
    sksi_kb_accessors.sksi_assert_if_new( ConsesLow.list( $const211$termDependsOn, ps, ks ), mapping_mt );
    sksi_kb_accessors.sksi_assert_if_new( ConsesLow.list( $const211$termDependsOn, ks, top_level_ks ), mapping_mt );
    return ConsesLow.list( ks, ls, ps );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 42631L)
  public static SubLObject finish_reifying_table_info(final SubLObject table_info, final SubLObject ks, final SubLObject ls, final SubLObject ps, final SubLObject kb_table_index, final SubLObject mapping_mt)
  {
    finish_reifying_new_logical_schema( ls, ks, table_info_lf_types( table_info ), table_info_field_mappings( table_info ), table_info_meaning_sentences( table_info ), table_info_isas( table_info ), kb_table_index,
        mapping_mt );
    finish_reifying_new_physical_schema( ps, ks, ls, table_info_enumerableP( table_info ), table_info_field_names( table_info ), table_info_field_types( table_info ), table_info_primary_key( table_info ),
        table_info_indexes( table_info ), table_info_field_encodings( table_info ), table_info_field_decodings( table_info ), table_info_foreign_key_maps( table_info ), table_info_non_null_field_list( table_info ),
        table_info_unique_field_tuples( table_info ), kb_table_index, mapping_mt );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 43634L)
  public static SubLObject reify_new_top_level_ks(final SubLObject db_info)
  {
    final SubLObject ks = start_reifying_new_top_level_ks( db_info );
    finish_reifying_new_top_level_ks( ks, db_info );
    return ks;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 44026L)
  public static SubLObject start_reifying_new_top_level_ks(final SubLObject db_info)
  {
    final SubLObject db_name = db_info_db_name( db_info );
    final SubLObject ks = sksi_sks_accessors.new_sks_complex( db_name, NIL, NIL, $const212$Database_Physical );
    final SubLObject ks_name = db_info_ks_name( db_info );
    ke.ke_rename_now( ks, ks_name );
    sksi_kb_accessors.sksi_assert_if_new( ConsesLow.listS( $const213$isa, ks, $list214 ), $const188$UniversalVocabularyMt );
    return ks;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 44392L)
  public static SubLObject finish_reifying_new_top_level_ks(final SubLObject ks, final SubLObject db_info)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject mapping_mt = sksi_kb_accessors.sk_source_mapping_mt( ks );
    assert NIL != hlmt.hlmt_p( mapping_mt ) : mapping_mt;
    reify_access_path( db_info, ks, mapping_mt );
    SubLObject cdolist_list_var = db_info_quoted_isas( db_info );
    SubLObject col = NIL;
    col = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      sksi_kb_accessors.sksi_assert_if_new( ConsesLow.list( $const215$quotedIsa, ks, col ), $const194$BookkeepingMt );
      cdolist_list_var = cdolist_list_var.rest();
      col = cdolist_list_var.first();
    }
    sksi_kb_accessors.sksi_assert_if_new( ConsesLow.list( $const216$mappingMt, ks, mapping_mt ), $const188$UniversalVocabularyMt );
    final SubLObject content_genl_mts = db_info_content_genl_mts( db_info );
    if( NIL != content_genl_mts )
    {
      final SubLObject content_mt_head = sksi_kb_accessors.sk_source_content_mt_head( ks );
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == hlmt.hlmt_p( content_mt_head ) )
      {
        Errors.error( $str217$Could_not_find_the_content_mt_hea, ks );
      }
      SubLObject cdolist_list_var2 = content_genl_mts;
      SubLObject genl_mt = NIL;
      genl_mt = cdolist_list_var2.first();
      while ( NIL != cdolist_list_var2)
      {
        sksi_kb_accessors.sksi_assert_if_new( ConsesLow.list( $const218$genlMt, content_mt_head, genl_mt ), $const188$UniversalVocabularyMt );
        cdolist_list_var2 = cdolist_list_var2.rest();
        genl_mt = cdolist_list_var2.first();
      }
    }
    return ks;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 45162L)
  public static SubLObject reify_access_path(final SubLObject db_info, final SubLObject ks, final SubLObject mapping_mt)
  {
    final SubLObject user = db_info_user( db_info );
    sksi_kb_accessors.sksi_assert_if_new( ConsesLow.list( $const219$userNameForSKS, ks, user ), mapping_mt );
    final SubLObject pass = db_info_pass( db_info );
    sksi_kb_accessors.sksi_assert_if_new( ConsesLow.list( $const220$passwordForSKS, ks, pass ), mapping_mt );
    final SubLObject server = db_info_server( db_info );
    sksi_kb_accessors.sksi_assert_if_new( ConsesLow.list( $const221$serverOfSKS, ks, server ), mapping_mt );
    final SubLObject port = db_info_port( db_info );
    if( NIL != port )
    {
      sksi_kb_accessors.sksi_assert_if_new( ConsesLow.list( $const222$portNumberForSKS, ks, port ), mapping_mt );
    }
    final SubLObject proxy_host = db_info_proxy_host( db_info );
    sksi_kb_accessors.sksi_assert_if_new( ConsesLow.list( $const223$sksProxyHost, ks, proxy_host ), mapping_mt );
    final SubLObject proxy_port = db_info_proxy_port( db_info );
    sksi_kb_accessors.sksi_assert_if_new( ConsesLow.list( $const224$sksProxyPort, ks, proxy_port ), mapping_mt );
    final SubLObject subprotocol = db_info_subprotocol( db_info );
    sksi_kb_accessors.sksi_assert_if_new( ConsesLow.list( $const225$subProtocolForSKS, ks, subprotocol ), mapping_mt );
    final SubLObject sql_flavor = db_info_sql_flavor( db_info );
    sksi_kb_accessors.sksi_assert_if_new( ConsesLow.list( $const226$sqlProgramForSKS, ks, sql_flavor ), mapping_mt );
    return ks;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 46189L)
  public static SubLObject reify_new_sk_source(final SubLObject table_info, final SubLObject top_level_sks, final SubLObject mt)
  {
    final SubLObject table_name = table_info_table_name( table_info );
    final SubLObject ks_name = table_info_ks_name( table_info );
    final SubLObject ks = sksi_sks_accessors.new_sks_atomic( table_name, top_level_sks, mt );
    ke.ke_rename_now( ks, ks_name );
    assert NIL != forts.fort_p( ks ) : ks;
    return ks;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 46499L)
  public static SubLObject start_reifying_new_logical_schema(final SubLObject name, final SubLObject mapping_mt)
  {
    final SubLObject ls = ( NIL != sksi_database_fusion_debugP() ) ? sksi_kb_accessors.sksi_find_or_create( name ) : sksi_kb_accessors.sksi_create( name );
    assert NIL != forts.fort_p( ls ) : ls;
    sksi_kb_accessors.sksi_assert_if_new( el_utilities.make_binary_formula( $const213$isa, ls, $const227$ObjectDefiningSchema ), $const188$UniversalVocabularyMt );
    sksi_kb_accessors.sksi_assert_if_new( el_utilities.make_binary_formula( $const213$isa, ls, $const228$LogicalSchema ), $const188$UniversalVocabularyMt );
    return ls;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 47062L)
  public static SubLObject finish_reifying_new_logical_schema(final SubLObject ls, final SubLObject sks, final SubLObject lf_types, final SubLObject field_mappings, final SubLObject meaning_sentences,
      final SubLObject isas, final SubLObject kb_table_index, final SubLObject mapping_mt)
  {
    sksi_kb_accessors.sksi_assert_if_new( el_utilities.make_binary_formula( $const229$logicalSchemaSourceMap, ls, sks ), mapping_mt );
    sksi_kb_accessors.sksi_assert_if_new( el_utilities.make_binary_formula( $const230$logicalSchemaFieldTypeList, ls, el_utilities.make_el_list( lf_types, UNPROVIDED ) ), mapping_mt );
    SubLObject cdolist_list_var = field_mappings;
    SubLObject mapping = NIL;
    mapping = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = mapping;
      SubLObject table_info_lf = NIL;
      SubLObject map = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list231 );
      table_info_lf = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list231 );
      map = current.first();
      current = current.rest();
      if( NIL == current )
      {
        final SubLObject lf = kbify_logical_field( table_info_lf, kb_table_index );
        sksi_kb_accessors.sksi_assert_if_new( ConsesLow.list( $const232$logicalFieldMapping, lf, map ), mapping_mt );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list231 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      mapping = cdolist_list_var.first();
    }
    cdolist_list_var = isas;
    SubLObject v_isa = NIL;
    v_isa = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      sksi_kb_accessors.sksi_assert_if_new( ConsesLow.list( $const233$schemaIsa, ls, v_isa ), $const188$UniversalVocabularyMt );
      cdolist_list_var = cdolist_list_var.rest();
      v_isa = cdolist_list_var.first();
    }
    cdolist_list_var = meaning_sentences;
    SubLObject meaning_sentence = NIL;
    meaning_sentence = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject kb_meaning_sentence = kbify_meaning_sentence( meaning_sentence, kb_table_index );
      sksi_kb_accessors.sksi_assert_if_new( ConsesLow.list( $const234$meaningSentenceOfSchema, ls, kb_meaning_sentence ), mapping_mt );
      cdolist_list_var = cdolist_list_var.rest();
      meaning_sentence = cdolist_list_var.first();
    }
    return ls;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 48045L)
  public static SubLObject kbifiable_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != table_info_logical_field_p( v_object ) || NIL != table_info_logical_field_indexical_p( v_object ) || NIL != table_info_physical_field_indexical_p( v_object )
        || NIL != table_info_sk_source_p( v_object ) || NIL != table_info_logical_schema_p( v_object ) || NIL != table_info_physical_schema_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 48359L)
  public static SubLObject kbify_object(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != table_info_logical_field_p( v_object ) )
    {
      return kbify_logical_field( v_object, $kbify_expression_kb_table_index$.getDynamicValue( thread ) );
    }
    if( NIL != table_info_logical_field_indexical_p( v_object ) )
    {
      return kbify_logical_field_indexical( v_object );
    }
    if( NIL != table_info_physical_field_indexical_p( v_object ) )
    {
      return kbify_physical_field_indexical( v_object );
    }
    if( NIL != table_info_sk_source_p( v_object ) )
    {
      return kbify_sk_source( v_object );
    }
    if( NIL != table_info_logical_schema_p( v_object ) )
    {
      return kbify_logical_schema( v_object );
    }
    if( NIL != table_info_physical_schema_p( v_object ) )
    {
      return kbify_physical_schema( v_object );
    }
    return Errors.error( $str235$Can_t_kbify__s, v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 49051L)
  public static SubLObject kbify_sk_source(final SubLObject table_info_sk_source)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ks_token = NIL;
    SubLObject table_info_id = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( table_info_sk_source, table_info_sk_source, $list236 );
    ks_token = table_info_sk_source.first();
    SubLObject current = table_info_sk_source.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, table_info_sk_source, $list236 );
    table_info_id = current.first();
    current = current.rest();
    if( NIL == current )
    {
      SubLObject current_$8;
      final SubLObject datum_$7 = current_$8 = dictionary.dictionary_lookup( $kbify_expression_kb_table_index$.getDynamicValue( thread ), table_info_id, UNPROVIDED );
      SubLObject ks = NIL;
      SubLObject ls = NIL;
      SubLObject ps = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current_$8, datum_$7, $list209 );
      ks = current_$8.first();
      current_$8 = current_$8.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current_$8, datum_$7, $list209 );
      ls = current_$8.first();
      current_$8 = current_$8.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current_$8, datum_$7, $list209 );
      ps = current_$8.first();
      current_$8 = current_$8.rest();
      if( NIL == current_$8 )
      {
        assert NIL != forts.fort_p( ks ) : ks;
        return ks;
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum_$7, $list209 );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( table_info_sk_source, $list236 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 49370L)
  public static SubLObject kbify_logical_schema(final SubLObject table_info_logical_schema)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ls_token = NIL;
    SubLObject table_info_id = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( table_info_logical_schema, table_info_logical_schema, $list237 );
    ls_token = table_info_logical_schema.first();
    SubLObject current = table_info_logical_schema.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, table_info_logical_schema, $list237 );
    table_info_id = current.first();
    current = current.rest();
    if( NIL == current )
    {
      SubLObject current_$10;
      final SubLObject datum_$9 = current_$10 = dictionary.dictionary_lookup( $kbify_expression_kb_table_index$.getDynamicValue( thread ), table_info_id, UNPROVIDED );
      SubLObject ks = NIL;
      SubLObject ls = NIL;
      SubLObject ps = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current_$10, datum_$9, $list209 );
      ks = current_$10.first();
      current_$10 = current_$10.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current_$10, datum_$9, $list209 );
      ls = current_$10.first();
      current_$10 = current_$10.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current_$10, datum_$9, $list209 );
      ps = current_$10.first();
      current_$10 = current_$10.rest();
      if( NIL == current_$10 )
      {
        assert NIL != forts.fort_p( ls ) : ls;
        return ls;
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum_$9, $list209 );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( table_info_logical_schema, $list237 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 49704L)
  public static SubLObject kbify_physical_schema(final SubLObject table_info_physical_schema)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ps_token = NIL;
    SubLObject table_info_id = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( table_info_physical_schema, table_info_physical_schema, $list238 );
    ps_token = table_info_physical_schema.first();
    SubLObject current = table_info_physical_schema.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, table_info_physical_schema, $list238 );
    table_info_id = current.first();
    current = current.rest();
    if( NIL == current )
    {
      SubLObject current_$12;
      final SubLObject datum_$11 = current_$12 = dictionary.dictionary_lookup( $kbify_expression_kb_table_index$.getDynamicValue( thread ), table_info_id, UNPROVIDED );
      SubLObject ks = NIL;
      SubLObject ls = NIL;
      SubLObject ps = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current_$12, datum_$11, $list209 );
      ks = current_$12.first();
      current_$12 = current_$12.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current_$12, datum_$11, $list209 );
      ls = current_$12.first();
      current_$12 = current_$12.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current_$12, datum_$11, $list209 );
      ps = current_$12.first();
      current_$12 = current_$12.rest();
      if( NIL == current_$12 )
      {
        assert NIL != forts.fort_p( ps ) : ps;
        return ps;
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum_$11, $list209 );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( table_info_physical_schema, $list238 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 50041L)
  public static SubLObject kbify_meaning_sentence(final SubLObject meaning_sentence, final SubLObject kb_table_index)
  {
    return kbify_logical_field_indexicals( meaning_sentence, kb_table_index );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 50189L)
  public static SubLObject kbify_logical_field_indexicals(final SubLObject expression, final SubLObject kb_table_index)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = $kbify_expression_kb_table_index$.currentBinding( thread );
    try
    {
      $kbify_expression_kb_table_index$.bind( kb_table_index, thread );
      result = cycl_utilities.expression_transform( expression, $sym239$KBIFIABLE_P, $sym240$KBIFY_OBJECT, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      $kbify_expression_kb_table_index$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 50447L)
  public static SubLObject kbify_logical_field_indexical(final SubLObject table_info_lfi)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject lfi = NIL;
    SubLObject table_info_id = NIL;
    SubLObject col = NIL;
    SubLObject i = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( table_info_lfi, table_info_lfi, $list241 );
    lfi = table_info_lfi.first();
    SubLObject current = table_info_lfi.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, table_info_lfi, $list241 );
    table_info_id = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, table_info_lfi, $list241 );
    col = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, table_info_lfi, $list241 );
    i = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject constants = dictionary.dictionary_lookup( $kbify_expression_kb_table_index$.getDynamicValue( thread ), table_info_id, UNPROVIDED );
      SubLObject current_$14;
      final SubLObject datum_$13 = current_$14 = constants;
      SubLObject ks = NIL;
      SubLObject ls = NIL;
      SubLObject ps = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current_$14, datum_$13, $list209 );
      ks = current_$14.first();
      current_$14 = current_$14.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current_$14, datum_$13, $list209 );
      ls = current_$14.first();
      current_$14 = current_$14.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current_$14, datum_$13, $list209 );
      ps = current_$14.first();
      current_$14 = current_$14.rest();
      if( NIL == current_$14 )
      {
        return ConsesLow.list( $const242$TheLogicalFieldValueFn, ls, col, i );
      }
      cdestructuring_bind.cdestructuring_bind_error( datum_$13, $list209 );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( table_info_lfi, $list241 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 50799L)
  public static SubLObject kbify_logical_field(final SubLObject table_info_lf, final SubLObject kb_table_index)
  {
    SubLObject lf = NIL;
    SubLObject table_info_id = NIL;
    SubLObject col = NIL;
    SubLObject i = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( table_info_lf, table_info_lf, $list243 );
    lf = table_info_lf.first();
    SubLObject current = table_info_lf.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, table_info_lf, $list243 );
    table_info_id = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, table_info_lf, $list243 );
    col = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, table_info_lf, $list243 );
    i = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject constants = dictionary.dictionary_lookup( kb_table_index, table_info_id, UNPROVIDED );
      SubLObject current_$16;
      final SubLObject datum_$15 = current_$16 = constants;
      SubLObject ks = NIL;
      SubLObject ls = NIL;
      SubLObject ps = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current_$16, datum_$15, $list209 );
      ks = current_$16.first();
      current_$16 = current_$16.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current_$16, datum_$15, $list209 );
      ls = current_$16.first();
      current_$16 = current_$16.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current_$16, datum_$15, $list209 );
      ps = current_$16.first();
      current_$16 = current_$16.rest();
      if( NIL == current_$16 )
      {
        return ConsesLow.list( $const244$LogicalFieldFn, ls, col, i );
      }
      cdestructuring_bind.cdestructuring_bind_error( datum_$15, $list209 );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( table_info_lf, $list243 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 51125L)
  public static SubLObject kbify_physical_field_indexicals(final SubLObject expression, final SubLObject kb_table_index)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = $kbify_expression_kb_table_index$.currentBinding( thread );
    try
    {
      $kbify_expression_kb_table_index$.bind( kb_table_index, thread );
      result = cycl_utilities.expression_transform( expression, $sym239$KBIFIABLE_P, $sym240$KBIFY_OBJECT, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      $kbify_expression_kb_table_index$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 51384L)
  public static SubLObject kbify_physical_field_indexical(final SubLObject table_info_pfi)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject pfi = NIL;
    SubLObject table_info_id = NIL;
    SubLObject field_name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( table_info_pfi, table_info_pfi, $list245 );
    pfi = table_info_pfi.first();
    SubLObject current = table_info_pfi.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, table_info_pfi, $list245 );
    table_info_id = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, table_info_pfi, $list245 );
    field_name = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject constants = dictionary.dictionary_lookup( $kbify_expression_kb_table_index$.getDynamicValue( thread ), table_info_id, UNPROVIDED );
      SubLObject current_$18;
      final SubLObject datum_$17 = current_$18 = constants;
      SubLObject ks = NIL;
      SubLObject ls = NIL;
      SubLObject ps = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current_$18, datum_$17, $list209 );
      ks = current_$18.first();
      current_$18 = current_$18.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current_$18, datum_$17, $list209 );
      ls = current_$18.first();
      current_$18 = current_$18.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current_$18, datum_$17, $list209 );
      ps = current_$18.first();
      current_$18 = current_$18.rest();
      if( NIL == current_$18 )
      {
        return ConsesLow.list( $const246$ThePhysicalFieldValueFn, ps, field_name );
      }
      cdestructuring_bind.cdestructuring_bind_error( datum_$17, $list209 );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( table_info_pfi, $list245 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 51747L)
  public static SubLObject anonymize_table_info_object(final SubLObject v_object)
  {
    if( NIL != table_info_logical_field_p( v_object ) )
    {
      return anonymize_table_info_logical_field( v_object );
    }
    if( NIL != table_info_logical_field_indexical_p( v_object ) )
    {
      return anonymize_table_info_logical_field_indexical( v_object );
    }
    if( NIL != table_info_physical_field_indexical_p( v_object ) )
    {
      return anonymize_table_info_physical_field_indexical( v_object );
    }
    if( NIL != table_info_sk_source_p( v_object ) )
    {
      return anonymize_table_info_sk_source( v_object );
    }
    if( NIL != table_info_logical_schema_p( v_object ) )
    {
      return anonymize_table_info_logical_schema( v_object );
    }
    if( NIL != table_info_physical_schema_p( v_object ) )
    {
      return anonymize_table_info_physical_schema( v_object );
    }
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 52586L)
  public static SubLObject anonymize_table_info_logical_field(final SubLObject table_info_lf)
  {
    SubLObject lf = NIL;
    SubLObject table_info_id = NIL;
    SubLObject col = NIL;
    SubLObject i = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( table_info_lf, table_info_lf, $list243 );
    lf = table_info_lf.first();
    SubLObject current = table_info_lf.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, table_info_lf, $list243 );
    table_info_id = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, table_info_lf, $list243 );
    col = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, table_info_lf, $list243 );
    i = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( lf, MINUS_ONE_INTEGER, col, MINUS_ONE_INTEGER );
    }
    cdestructuring_bind.cdestructuring_bind_error( table_info_lf, $list243 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 52777L)
  public static SubLObject anonymize_table_info_logical_field_indexical(final SubLObject table_info_lfi)
  {
    SubLObject lfi = NIL;
    SubLObject table_info_id = NIL;
    SubLObject col = NIL;
    SubLObject i = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( table_info_lfi, table_info_lfi, $list241 );
    lfi = table_info_lfi.first();
    SubLObject current = table_info_lfi.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, table_info_lfi, $list241 );
    table_info_id = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, table_info_lfi, $list241 );
    col = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, table_info_lfi, $list241 );
    i = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( lfi, MINUS_ONE_INTEGER, col, MINUS_ONE_INTEGER );
    }
    cdestructuring_bind.cdestructuring_bind_error( table_info_lfi, $list241 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 52982L)
  public static SubLObject anonymize_table_info_physical_field_indexical(final SubLObject table_info_pfi)
  {
    SubLObject pfi = NIL;
    SubLObject table_info_id = NIL;
    SubLObject field_name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( table_info_pfi, table_info_pfi, $list245 );
    pfi = table_info_pfi.first();
    SubLObject current = table_info_pfi.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, table_info_pfi, $list245 );
    table_info_id = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, table_info_pfi, $list245 );
    field_name = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( pfi, MINUS_ONE_INTEGER, field_name );
    }
    cdestructuring_bind.cdestructuring_bind_error( table_info_pfi, $list245 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 53195L)
  public static SubLObject anonymize_table_info_sk_source(final SubLObject table_info_ks)
  {
    SubLObject ks_token = NIL;
    SubLObject table_info_id = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( table_info_ks, table_info_ks, $list236 );
    ks_token = table_info_ks.first();
    SubLObject current = table_info_ks.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, table_info_ks, $list236 );
    table_info_id = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( ks_token, MINUS_ONE_INTEGER );
    }
    cdestructuring_bind.cdestructuring_bind_error( table_info_ks, $list236 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 53379L)
  public static SubLObject anonymize_table_info_logical_schema(final SubLObject table_info_ls)
  {
    SubLObject ls_token = NIL;
    SubLObject table_info_id = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( table_info_ls, table_info_ls, $list237 );
    ls_token = table_info_ls.first();
    SubLObject current = table_info_ls.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, table_info_ls, $list237 );
    table_info_id = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( ls_token, MINUS_ONE_INTEGER );
    }
    cdestructuring_bind.cdestructuring_bind_error( table_info_ls, $list237 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 53568L)
  public static SubLObject anonymize_table_info_physical_schema(final SubLObject table_info_ps)
  {
    SubLObject ps_token = NIL;
    SubLObject table_info_id = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( table_info_ps, table_info_ps, $list238 );
    ps_token = table_info_ps.first();
    SubLObject current = table_info_ps.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, table_info_ps, $list238 );
    table_info_id = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( ps_token, MINUS_ONE_INTEGER );
    }
    cdestructuring_bind.cdestructuring_bind_error( table_info_ps, $list238 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 53758L)
  public static SubLObject start_reifying_new_physical_schema(final SubLObject ps_name, final SubLObject mapping_mt)
  {
    final SubLObject ps = ( NIL != sksi_database_fusion_debugP() ) ? sksi_kb_accessors.sksi_find_or_create( ps_name ) : sksi_kb_accessors.sksi_create( ps_name );
    sksi_kb_accessors.sksi_assert_if_new( ConsesLow.listS( $const213$isa, ps, $list247 ), mapping_mt );
    return ps;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 54172L)
  public static SubLObject finish_reifying_new_physical_schema(final SubLObject ps, final SubLObject ks, final SubLObject ls, final SubLObject enumerableP, final SubLObject field_names, final SubLObject field_types,
      final SubLObject primary_key, final SubLObject indexes, final SubLObject field_encodings, final SubLObject field_decodings, final SubLObject foreign_key_maps, final SubLObject non_null_field_list,
      final SubLObject unique_field_tuples, final SubLObject kb_table_index, final SubLObject mapping_mt)
  {
    sksi_kb_accessors.sksi_assert_if_new( ConsesLow.list( $const248$physicalSchemaSourceMap, ps, ks ), mapping_mt );
    sksi_kb_accessors.sksi_assert_if_new( ConsesLow.list( $const249$logicalPhysicalSchemaMap, ls, ps ), mapping_mt );
    if( NIL != enumerableP )
    {
      sksi_kb_accessors.sksi_assert_if_new( ConsesLow.list( $const250$enumerableSchema, ps ), mapping_mt );
    }
    sksi_kb_accessors.sksi_assert_if_new( ConsesLow.list( $const251$schemaFieldNameList, ps, el_utilities.make_el_list( field_names, UNPROVIDED ) ), mapping_mt );
    SubLObject field_name = NIL;
    SubLObject field_name_$19 = NIL;
    SubLObject field_type = NIL;
    SubLObject field_type_$20 = NIL;
    field_name = field_names;
    field_name_$19 = field_name.first();
    field_type = field_types;
    field_type_$20 = field_type.first();
    while ( NIL != field_type || NIL != field_name)
    {
      final SubLObject pf = table_info_field_name_to_physical_field( field_name_$19, ps );
      sksi_kb_accessors.sksi_assert_if_new( ConsesLow.list( $const252$fieldDataType, pf, field_type_$20 ), mapping_mt );
      field_name = field_name.rest();
      field_name_$19 = field_name.first();
      field_type = field_type.rest();
      field_type_$20 = field_type.first();
    }
    if( NIL != primary_key )
    {
      final SubLObject pfs = table_info_field_names_to_physical_fields( primary_key, ps );
      sksi_kb_accessors.sksi_assert_if_new( ConsesLow.list( $const253$primaryKey, ps, el_utilities.make_el_list( pfs, UNPROVIDED ) ), mapping_mt );
    }
    SubLObject cdolist_list_var = indexes;
    SubLObject indexed_field_list = NIL;
    indexed_field_list = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject pfs2 = table_info_field_names_to_physical_fields( indexed_field_list, ps );
      sksi_kb_accessors.sksi_assert_if_new( ConsesLow.list( $const254$indexedFields, ps, el_utilities.make_el_list( pfs2, UNPROVIDED ) ), mapping_mt );
      cdolist_list_var = cdolist_list_var.rest();
      indexed_field_list = cdolist_list_var.first();
    }
    cdolist_list_var = field_encodings;
    SubLObject field_encoding = NIL;
    field_encoding = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = field_encoding;
      SubLObject field_name2 = NIL;
      SubLObject encoding = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list255 );
      field_name2 = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list255 );
      encoding = current.first();
      current = current.rest();
      if( NIL == current )
      {
        final SubLObject pfi = table_info_field_name_to_physical_field_indexical( field_name2, ps );
        final SubLObject kb_encoding = kbify_field_encoding( encoding, kb_table_index );
        sksi_kb_accessors.sksi_assert_if_new( ConsesLow.list( $const256$fieldEncoding, ps, pfi, ls, kb_encoding ), mapping_mt );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list255 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      field_encoding = cdolist_list_var.first();
    }
    cdolist_list_var = field_decodings;
    SubLObject field_decoding = NIL;
    field_decoding = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = field_decoding;
      SubLObject table_info_lfi = NIL;
      SubLObject decoding = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list257 );
      table_info_lfi = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list257 );
      decoding = current.first();
      current = current.rest();
      if( NIL == current )
      {
        final SubLObject lfi = kbify_logical_field_indexicals( table_info_lfi, kb_table_index );
        final SubLObject kb_decoding = kbify_field_decoding( decoding, kb_table_index );
        sksi_kb_accessors.sksi_assert_if_new( ConsesLow.list( $const258$fieldDecoding, ls, lfi, ps, kb_decoding ), mapping_mt );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list257 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      field_decoding = cdolist_list_var.first();
    }
    final SubLObject non_null_pfs = table_info_field_names_to_physical_fields( non_null_field_list, ps );
    sksi_kb_accessors.sksi_assert_if_new( ConsesLow.list( $const259$nonNullFieldList, ps, el_utilities.make_el_list( non_null_pfs, UNPROVIDED ) ), mapping_mt );
    cdolist_list_var = unique_field_tuples;
    SubLObject unique_field_list = NIL;
    unique_field_list = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject unique_pfs = table_info_field_names_to_physical_fields( unique_field_list, ps );
      sksi_kb_accessors.sksi_assert_if_new( ConsesLow.list( $const260$uniqueFieldList, ps, el_utilities.make_el_list( unique_pfs, UNPROVIDED ) ), mapping_mt );
      cdolist_list_var = cdolist_list_var.rest();
      unique_field_list = cdolist_list_var.first();
    }
    assert NIL != forts.fort_p( ps ) : ps;
    return ps;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 57303L)
  public static SubLObject table_info_field_names_to_physical_fields(final SubLObject field_names, final SubLObject ps)
  {
    SubLObject pfs = NIL;
    SubLObject cdolist_list_var = field_names;
    SubLObject field_name = NIL;
    field_name = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      pfs = ConsesLow.cons( table_info_field_name_to_physical_field( field_name, ps ), pfs );
      cdolist_list_var = cdolist_list_var.rest();
      field_name = cdolist_list_var.first();
    }
    return Sequences.nreverse( pfs );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 57538L)
  public static SubLObject table_info_field_name_to_physical_field(final SubLObject field_name, final SubLObject ps)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject pf = sksi_kb_accessors.physical_field_for_schema_and_name( ps, field_name );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == forts.fort_p( pf ) )
    {
      Errors.error( $str261$Error_getting_physical_field__s_i, field_name, ps );
    }
    return pf;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 57769L)
  public static SubLObject table_info_field_name_to_physical_field_indexical(final SubLObject field_name, final SubLObject ps)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject pfi = sksi_kb_accessors.indexical_for_physical_field( sksi_kb_accessors.physical_field_for_schema_and_name( ps, field_name ) );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == forts.fort_p( pfi ) )
    {
      Errors.error( $str262$Error_getting_indexical_for_physi, field_name, ps );
    }
    return pfi;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 58058L)
  public static SubLObject kbify_field_encoding(final SubLObject encoding, final SubLObject kb_table_index)
  {
    return kbify_logical_field_indexicals( encoding, kb_table_index );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 58188L)
  public static SubLObject kbify_field_decoding(final SubLObject decoding, final SubLObject kb_table_index)
  {
    return kbify_physical_field_indexicals( decoding, kb_table_index );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 58319L)
  public static SubLObject compute_db_clone_forward_inference_allowed_rules(final SubLObject input_ks_list)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    kill_all_cloned_bln_terms();
    SubLObject rules = NIL;
    SubLObject cdolist_list_var = input_ks_list;
    SubLObject input_ks = NIL;
    input_ks = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      clone_database( input_ks, T );
      cdolist_list_var = cdolist_list_var.rest();
      input_ks = cdolist_list_var.first();
    }
    final SubLObject list_var = all_cloned_bln_terms();
    final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
    final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$progress_note$.bind( $str263$cdolist, thread );
      utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
      utilities_macros.$progress_total$.bind( Sequences.length( list_var ), thread );
      utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
        SubLObject csome_list_var = list_var;
        SubLObject v_const = NIL;
        v_const = csome_list_var.first();
        while ( NIL != csome_list_var)
        {
          rules = ConsesLow.append( rules, assertion_utilities.all_forward_rules_relevant_to_term( v_const ) );
          utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
          utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
          csome_list_var = csome_list_var.rest();
          v_const = csome_list_var.first();
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$21 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$21, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
      utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
      utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
      utilities_macros.$progress_start_time$.rebind( _prev_bind_2, thread );
      utilities_macros.$progress_note$.rebind( _prev_bind_0, thread );
    }
    return list_utilities.fast_delete_duplicates( rules, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 58725L)
  public static SubLObject all_cloned_bln_terms()
  {
    SubLObject terms = NIL;
    SubLObject cdolist_list_var = constant_completion_high.constant_complete( $str265$BLN, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject v_const = NIL;
    v_const = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != string_utilities.substringP( $str264$Cloned, constants_high.constant_name( v_const ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        terms = ConsesLow.cons( v_const, terms );
      }
      cdolist_list_var = cdolist_list_var.rest();
      v_const = cdolist_list_var.first();
    }
    return Sequences.nreverse( terms );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 59111L)
  public static SubLObject kill_all_cloned_bln_terms()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject count = ZERO_INTEGER;
    final SubLObject list_var = all_cloned_bln_terms();
    final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
    final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$progress_note$.bind( $str263$cdolist, thread );
      utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
      utilities_macros.$progress_total$.bind( Sequences.length( list_var ), thread );
      utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
        SubLObject csome_list_var = list_var;
        SubLObject v_const = NIL;
        v_const = csome_list_var.first();
        while ( NIL != csome_list_var)
        {
          if( NIL != cyc_kernel.cyc_kill( v_const ) )
          {
            count = Numbers.add( count, ONE_INTEGER );
          }
          utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
          utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
          csome_list_var = csome_list_var.rest();
          v_const = csome_list_var.first();
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$22 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$22, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
      utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
      utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
      utilities_macros.$progress_start_time$.rebind( _prev_bind_2, thread );
      utilities_macros.$progress_note$.rebind( _prev_bind_0, thread );
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 59298L)
  public static SubLObject fuse_databases(final SubLObject input_sk_sources, SubLObject kill_old_fused_databasesP)
  {
    if( kill_old_fused_databasesP == UNPROVIDED )
    {
      kill_old_fused_databasesP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject fused_ks = NIL;
    final SubLObject _prev_bind_0 = $within_sksi_database_fusionP$.currentBinding( thread );
    try
    {
      $within_sksi_database_fusionP$.bind( T, thread );
      if( NIL != kill_old_fused_databasesP )
      {
        kill_all_fused_databases( input_sk_sources );
      }
      final SubLObject db_info = compute_and_fuse_db_info( input_sk_sources );
      fused_ks = reify_fused_db_info( db_info, input_sk_sources );
      sksi_create_sks.sksi_create_structured_knowledge_source( fused_ks, UNPROVIDED );
      sksi_populate_fused_ks( db_info, input_sk_sources, fused_ks );
    }
    finally
    {
      $within_sksi_database_fusionP$.rebind( _prev_bind_0, thread );
    }
    return fused_ks;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 60056L)
  public static SubLObject kill_all_fused_databases(final SubLObject ks_list)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject successP = T;
    assert NIL != sksi_debugging.valid_sksi_error_handling_mode_p( $kw176$WARN ) : $kw176$WARN;
    final SubLObject _prev_bind_0 = sksi_debugging.$sksi_error_handling_mode$.currentBinding( thread );
    try
    {
      sksi_debugging.$sksi_error_handling_mode$.bind( $kw176$WARN, thread );
      final SubLObject el_ks_list = czer_main.canonicalize_term( el_utilities.make_el_list( ks_list, UNPROVIDED ), UNPROVIDED );
      SubLObject cdolist_list_var = ask_utilities.query_variable( $kw266$X, ConsesLow.list( $const267$sksFusionSources, $kw266$X, el_ks_list ), $const180$SKSIMt, UNPROVIDED );
      SubLObject fused_ks = NIL;
      fused_ks = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL == sksi_create_sks.sksi_destroy_structured_knowledge_source( fused_ks, UNPROVIDED ) )
        {
          successP = NIL;
        }
        cdolist_list_var = cdolist_list_var.rest();
        fused_ks = cdolist_list_var.first();
      }
    }
    finally
    {
      sksi_debugging.$sksi_error_handling_mode$.rebind( _prev_bind_0, thread );
    }
    return successP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 60433L)
  public static SubLObject reify_fused_db_info(final SubLObject db_info, final SubLObject input_sk_sources)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject fused_ks = NIL;
    final SubLObject _prev_bind_0 = control_vars.$inference_debugP$.currentBinding( thread );
    try
    {
      control_vars.$inference_debugP$.bind( T, thread );
      assert NIL != sksi_debugging.valid_sksi_error_handling_mode_p( $kw179$BREAK ) : $kw179$BREAK;
      final SubLObject _prev_bind_0_$23 = sksi_debugging.$sksi_error_handling_mode$.currentBinding( thread );
      try
      {
        sksi_debugging.$sksi_error_handling_mode$.bind( $kw179$BREAK, thread );
        final SubLObject mt = compute_db_fusion_mt( input_sk_sources );
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
        final SubLObject _prev_bind_0_$24 = mt_relevance_macros.$mt$.currentBinding( thread );
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
          mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
          mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
          fused_ks = start_reifying_new_top_level_ks( db_info );
          sksi_kb_accessors.sksi_assert_if_new( ConsesLow.list( $const267$sksFusionSources, fused_ks, el_utilities.make_el_list( input_sk_sources, UNPROVIDED ) ), $const180$SKSIMt );
          finish_reifying_db_info( fused_ks, db_info );
        }
        finally
        {
          mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
          mt_relevance_macros.$mt$.rebind( _prev_bind_0_$24, thread );
        }
      }
      finally
      {
        sksi_debugging.$sksi_error_handling_mode$.rebind( _prev_bind_0_$23, thread );
      }
    }
    finally
    {
      control_vars.$inference_debugP$.rebind( _prev_bind_0, thread );
    }
    return fused_ks;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 60899L)
  public static SubLObject sksi_populate_fused_ks(final SubLObject db_info, final SubLObject input_sk_sources, final SubLObject fused_ks)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = $within_sksi_database_fusionP$.currentBinding( thread );
    try
    {
      $within_sksi_database_fusionP$.bind( T, thread );
      try
      {
        sksi_sks_manager.register_sksi_removal_modules_for_skses( ConsesLow.cons( fused_ks, input_sk_sources ) );
        result = sksi_populate_fused_ks_int( db_info, fused_ks );
      }
      finally
      {
        final SubLObject _prev_bind_0_$25 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          sksi_sks_manager.deregister_sksi_removal_modules_for_skses( ConsesLow.cons( fused_ks, input_sk_sources ) );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$25, thread );
        }
      }
    }
    finally
    {
      $within_sksi_database_fusionP$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 61354L)
  public static SubLObject sksi_populate_fused_ks_int(final SubLObject db_info, final SubLObject output_ks)
  {
    SubLObject successP = T;
    final SubLObject input_mt = db_info_input_mt( db_info );
    final SubLObject output_mt = czer_main.cyc_find_or_create_nart( ConsesLow.list( $const185$ContentMtFn, output_ks ), UNPROVIDED );
    SubLObject cdolist_list_var = db_info_table_infos( db_info );
    SubLObject table_info = NIL;
    table_info = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == sksi_populate_sub_ks( input_mt, output_mt, table_info ) )
      {
        successP = NIL;
      }
      cdolist_list_var = cdolist_list_var.rest();
      table_info = cdolist_list_var.first();
    }
    return successP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 61777L)
  public static SubLObject compute_and_fuse_db_info(final SubLObject input_sk_sources)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject fused_db_info = NIL;
    final SubLObject _prev_bind_0 = $within_sksi_database_fusionP$.currentBinding( thread );
    try
    {
      $within_sksi_database_fusionP$.bind( T, thread );
      final SubLObject mt = compute_db_fusion_mt( input_sk_sources );
      final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
      final SubLObject _prev_bind_0_$26 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
        SubLObject db_infos = NIL;
        SubLObject cdolist_list_var = input_sk_sources;
        SubLObject input_ks = NIL;
        input_ks = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          db_infos = ConsesLow.cons( compute_initial_db_info( input_ks ), db_infos );
          cdolist_list_var = cdolist_list_var.rest();
          input_ks = cdolist_list_var.first();
        }
        db_infos = Sequences.nreverse( db_infos );
        final SubLObject trivially_fused_db_info = trivially_fuse_db_infos( db_infos );
        fused_db_info = fuse_db_info( trivially_fused_db_info );
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0_$26, thread );
      }
    }
    finally
    {
      $within_sksi_database_fusionP$.rebind( _prev_bind_0, thread );
    }
    $last_db_info$.setGlobalValue( fused_db_info );
    return fused_db_info;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 62472L)
  public static SubLObject compute_db_fusion_mt(final SubLObject sk_sources)
  {
    final SubLObject list_var;
    final SubLObject mts = list_var = Mapping.mapcar( $sym268$SK_SOURCE_MAPPING_MT, sk_sources );
    assert NIL != list_utilities.non_dotted_list_p( list_var ) : list_var;
    SubLObject cdolist_list_var = list_var;
    SubLObject elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != hlmt.hlmt_p( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    final SubLObject mt = hlmt.reduce_hlmt( reader.bq_cons( $const269$MtUnionFn, ConsesLow.append( mts, NIL ) ), T );
    return mt;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 62808L)
  public static SubLObject trivially_fuse_db_infos(final SubLObject db_infos)
  {
    if( NIL != sksi_database_fusion_debugP() )
    {
      SubLObject cdolist_list_var = db_infos;
      SubLObject db_info = NIL;
      db_info = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        streams_high.terpri( UNPROVIDED );
        streams_high.terpri( UNPROVIDED );
        print_db_info_contents( db_info );
        cdolist_list_var = cdolist_list_var.rest();
        db_info = cdolist_list_var.first();
      }
    }
    final SubLObject primary_db_info = db_infos.first();
    final SubLObject other_db_infos = db_infos.rest();
    fuse_db_info_table_infos( primary_db_info, other_db_infos );
    fuse_db_info_constant_names( primary_db_info );
    fuse_db_info_db_names( primary_db_info );
    fuse_db_info_quoted_isas( primary_db_info, other_db_infos );
    fuse_db_info_input_mt( primary_db_info, other_db_infos );
    fuse_db_info_content_genl_mts( primary_db_info, other_db_infos );
    return primary_db_info;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 63813L)
  public static SubLObject fuse_db_info_table_infos(final SubLObject primary_db_info, final SubLObject other_db_infos)
  {
    final SubLObject table_name_set = set.new_set( Symbols.symbol_function( EQUALP ), UNPROVIDED );
    SubLObject cdolist_list_var = db_info_table_infos( primary_db_info );
    SubLObject primary_table_info = NIL;
    primary_table_info = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject table_name = table_info_table_name( primary_table_info );
      if( NIL != set.set_memberP( table_name, table_name_set ) )
      {
        Errors.error( $str270$Name_conflict_in__s__two_tables_n, primary_db_info, table_name );
      }
      else
      {
        set.set_add( table_name, table_name_set );
      }
      cdolist_list_var = cdolist_list_var.rest();
      primary_table_info = cdolist_list_var.first();
    }
    cdolist_list_var = other_db_infos;
    SubLObject db_info = NIL;
    db_info = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$27;
      final SubLObject table_infos = cdolist_list_var_$27 = db_info_table_infos( db_info );
      SubLObject table_info = NIL;
      table_info = cdolist_list_var_$27.first();
      while ( NIL != cdolist_list_var_$27)
      {
        final SubLObject original_table_name = table_info_table_name( table_info );
        SubLObject uniqueP = NIL;
        SubLObject uniquifying_integer = ONE_INTEGER;
        SubLObject uniquifying_suffix = $str183$;
        while ( NIL == uniqueP)
        {
          final SubLObject new_table_name = Sequences.cconcatenate( original_table_name, uniquifying_suffix );
          uniqueP = makeBoolean( NIL == set.set_memberP( new_table_name, table_name_set ) );
          if( NIL != uniqueP )
          {
            set_table_info_table_name( table_info, new_table_name );
          }
          else
          {
            uniquifying_integer = Numbers.add( uniquifying_integer, ONE_INTEGER );
            uniquifying_suffix = Sequences.cconcatenate( $str184$_, string_utilities.str( uniquifying_integer ) );
          }
        }
        cdolist_list_var_$27 = cdolist_list_var_$27.rest();
        table_info = cdolist_list_var_$27.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      db_info = cdolist_list_var.first();
    }
    return merge_db_info_table_infos( primary_db_info, other_db_infos );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 65199L)
  public static SubLObject merge_db_info_table_infos(final SubLObject primary_db_info, final SubLObject other_db_infos)
  {
    SubLObject merged_table_infos = db_info_table_infos( primary_db_info );
    SubLObject cdolist_list_var = other_db_infos;
    SubLObject db_info = NIL;
    db_info = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject table_infos = db_info_table_infos( db_info );
      merged_table_infos = ConsesLow.append( merged_table_infos, table_infos );
      cdolist_list_var = cdolist_list_var.rest();
      db_info = cdolist_list_var.first();
    }
    set_db_info_table_infos( primary_db_info, merged_table_infos );
    return primary_db_info;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 65601L)
  public static SubLObject fuse_db_info_constant_names(final SubLObject primary_db_info)
  {
    final SubLObject primary_constant_base_name = db_info_constant_base_name( primary_db_info );
    final SubLObject fused_constant_base_name = fuse_constant_base_name( primary_constant_base_name );
    set_db_info_constant_base_name( primary_db_info, fused_constant_base_name );
    SubLObject cdolist_list_var = db_info_table_infos( primary_db_info );
    SubLObject table_info = NIL;
    table_info = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject new_constant_base_name = fuse_constant_base_name( table_info_constant_base_name( table_info ) );
      set_table_info_constant_base_name( table_info, new_constant_base_name );
      cdolist_list_var = cdolist_list_var.rest();
      table_info = cdolist_list_var.first();
    }
    return primary_db_info;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 66219L)
  public static SubLObject fuse_constant_base_name(final SubLObject original_constant_base_name)
  {
    return Sequences.cconcatenate( original_constant_base_name, $str191$_Fused );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 66351L)
  public static SubLObject fuse_db_info_db_names(final SubLObject primary_db_info)
  {
    final SubLObject primary_db_name = db_info_db_name( primary_db_info );
    final SubLObject fused_db_name = Sequences.cconcatenate( primary_db_name, $str271$_fused );
    return uniquify_db_info_db_name( fused_db_name, primary_db_info );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 66601L)
  public static SubLObject fuse_db_info_quoted_isas(final SubLObject primary_db_info, final SubLObject other_db_infos)
  {
    SubLObject merged_quoted_isas = db_info_quoted_isas( primary_db_info );
    SubLObject cdolist_list_var = other_db_infos;
    SubLObject db_info = NIL;
    db_info = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject quoted_isas = db_info_quoted_isas( db_info );
      merged_quoted_isas = ConsesLow.append( quoted_isas, merged_quoted_isas );
      cdolist_list_var = cdolist_list_var.rest();
      db_info = cdolist_list_var.first();
    }
    set_db_info_quoted_isas( primary_db_info, genls.min_cols( merged_quoted_isas, $const194$BookkeepingMt, UNPROVIDED ) );
    return primary_db_info;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 67031L)
  public static SubLObject fuse_db_info_input_mt(final SubLObject primary_db_info, final SubLObject other_db_infos)
  {
    SubLObject input_mts = ConsesLow.list( db_info_input_mt( primary_db_info ) );
    SubLObject cdolist_list_var = other_db_infos;
    SubLObject db_info = NIL;
    db_info = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject input_mt = db_info_input_mt( db_info );
      input_mts = ConsesLow.cons( input_mt, input_mts );
      cdolist_list_var = cdolist_list_var.rest();
      db_info = cdolist_list_var.first();
    }
    set_db_info_input_mt( primary_db_info, hlmt.reduce_hlmt( reader.bq_cons( $const269$MtUnionFn, ConsesLow.append( input_mts, NIL ) ), T ) );
    return primary_db_info;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 67401L)
  public static SubLObject fuse_db_info_content_genl_mts(final SubLObject primary_db_info, final SubLObject other_db_infos)
  {
    SubLObject merged_content_genl_mts = db_info_content_genl_mts( primary_db_info );
    SubLObject cdolist_list_var = other_db_infos;
    SubLObject db_info = NIL;
    db_info = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject content_genl_mts = db_info_content_genl_mts( db_info );
      merged_content_genl_mts = ConsesLow.append( content_genl_mts, merged_content_genl_mts );
      cdolist_list_var = cdolist_list_var.rest();
      db_info = cdolist_list_var.first();
    }
    set_db_info_content_genl_mts( primary_db_info, genl_mts.min_mts( merged_content_genl_mts, UNPROVIDED ) );
    return primary_db_info;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 67868L)
  public static SubLObject fuse_db_info(final SubLObject db_info)
  {
    SubLObject current_db_info = db_info;
    SubLObject new_db_info = NIL;
    SubLObject doneP = NIL;
    while ( NIL == doneP)
    {
      new_db_info = fuse_db_info_do_one_step( current_db_info );
      if( NIL != new_db_info )
      {
        current_db_info = new_db_info;
      }
      else
      {
        doneP = T;
      }
    }
    return current_db_info;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 68189L)
  public static SubLObject fuse_db_info_do_one_step(final SubLObject db_info)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 68411L)
  public static SubLObject merge_two_db_info_tables(final SubLObject db_info)
  {
    final SubLObject merge_dict = dictionary.new_dictionary( Symbols.symbol_function( EQUAL ), UNPROVIDED );
    SubLObject cdolist_list_var = db_info_table_infos( db_info );
    SubLObject table_info = NIL;
    table_info = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject isas = kb_utilities.sort_forts( genls.min_cols( table_info_isas( table_info ), UNPROVIDED, UNPROVIDED ) );
      if( NIL != isas )
      {
        final SubLObject table_info_to_merge = dictionary.dictionary_lookup( merge_dict, isas, UNPROVIDED );
        if( NIL != table_info_to_merge )
        {
          return merge_two_db_info_tables_int( db_info, table_info_to_merge, table_info );
        }
        dictionary.dictionary_enter( merge_dict, isas, table_info );
      }
      cdolist_list_var = cdolist_list_var.rest();
      table_info = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 69041L)
  public static SubLObject merge_two_db_info_tables_int(final SubLObject db_info, final SubLObject keep_table_info, final SubLObject kill_table_info)
  {
    final SubLObject keep_sentences = list_utilities.fast_delete_duplicates( transform_list_utilities.quiescent_transform( table_info_meaning_sentences( keep_table_info ), $sym239$KBIFIABLE_P,
        $sym272$ANONYMIZE_TABLE_INFO_OBJECT, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject kill_sentences = list_utilities.fast_delete_duplicates( transform_list_utilities.quiescent_transform( table_info_meaning_sentences( kill_table_info ), $sym239$KBIFIABLE_P,
        $sym272$ANONYMIZE_TABLE_INFO_OBJECT, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject shared_sentences = keyhash_utilities.fast_intersection( kill_sentences, keep_sentences, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject sentences_to_copy = conses_high.set_difference( kill_sentences, shared_sentences, UNPROVIDED, UNPROVIDED );
    SubLObject cdolist_list_var = shared_sentences;
    SubLObject shared_sentence = NIL;
    shared_sentence = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      merge_two_db_info_meaning_sentences( db_info, shared_sentence, keep_table_info, kill_table_info );
      cdolist_list_var = cdolist_list_var.rest();
      shared_sentence = cdolist_list_var.first();
    }
    return db_info;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 70126L)
  public static SubLObject merge_two_db_info_meaning_sentences(final SubLObject db_info, final SubLObject shared_sentence, final SubLObject keep_table_info, final SubLObject kill_table_info)
  {
    final SubLObject lfi_merge_pairs = compute_lfi_merge_pairs( shared_sentence, keep_table_info, kill_table_info );
    final SubLObject id_merge_pairs = compute_id_merge_pairs( db_info, shared_sentence, lfi_merge_pairs, keep_table_info, kill_table_info );
    return db_info;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 70515L)
  public static SubLObject compute_lfi_merge_pairs(final SubLObject shared_sentence, final SubLObject keep_table_info, final SubLObject kill_table_info)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject keep_lfis = list_utilities.fast_delete_duplicates( cycl_utilities.expression_gather( table_info_meaning_sentences( keep_table_info ), $sym189$TABLE_INFO_LOGICAL_FIELD_INDEXICAL_P, UNPROVIDED,
        UNPROVIDED, UNPROVIDED, UNPROVIDED ), Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject kill_lfis = list_utilities.fast_delete_duplicates( cycl_utilities.expression_gather( table_info_meaning_sentences( kill_table_info ), $sym189$TABLE_INFO_LOGICAL_FIELD_INDEXICAL_P, UNPROVIDED,
        UNPROVIDED, UNPROVIDED, UNPROVIDED ), Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject shared_lfis = list_utilities.fast_delete_duplicates( cycl_utilities.expression_gather( shared_sentence, $sym189$TABLE_INFO_LOGICAL_FIELD_INDEXICAL_P, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ),
        Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject keep_lfis_to_merge = NIL;
    SubLObject kill_lfis_to_merge = NIL;
    SubLObject cdolist_list_var = keep_lfis;
    SubLObject keep_lfi = NIL;
    keep_lfi = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != list_utilities.member_equalP( anonymize_table_info_object( keep_lfi ), shared_lfis ) )
      {
        keep_lfis_to_merge = ConsesLow.cons( keep_lfi, keep_lfis_to_merge );
      }
      cdolist_list_var = cdolist_list_var.rest();
      keep_lfi = cdolist_list_var.first();
    }
    cdolist_list_var = kill_lfis;
    SubLObject kill_lfi = NIL;
    kill_lfi = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != list_utilities.member_equalP( anonymize_table_info_object( kill_lfi ), shared_lfis ) )
      {
        kill_lfis_to_merge = ConsesLow.cons( kill_lfi, kill_lfis_to_merge );
      }
      cdolist_list_var = cdolist_list_var.rest();
      kill_lfi = cdolist_list_var.first();
    }
    SubLObject lfi_merge_pairs = NIL;
    SubLObject cdolist_list_var2 = keep_lfis_to_merge;
    SubLObject keep_lfi_to_merge = NIL;
    keep_lfi_to_merge = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      SubLObject count = ZERO_INTEGER;
      SubLObject cdolist_list_var_$28 = kill_lfis_to_merge;
      SubLObject kill_lfi_to_merge = NIL;
      kill_lfi_to_merge = cdolist_list_var_$28.first();
      while ( NIL != cdolist_list_var_$28)
      {
        if( anonymize_table_info_object( keep_lfi_to_merge ).equal( anonymize_table_info_object( kill_lfi_to_merge ) ) )
        {
          count = Numbers.add( count, ONE_INTEGER );
          lfi_merge_pairs = ConsesLow.cons( ConsesLow.list( keep_lfi_to_merge, kill_lfi_to_merge ), lfi_merge_pairs );
        }
        cdolist_list_var_$28 = cdolist_list_var_$28.rest();
        kill_lfi_to_merge = cdolist_list_var_$28.first();
      }
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !count.numLE( ONE_INTEGER ) )
      {
        Errors.error( $str273$Can_t_yet_handle_duplicate_LFI_ty, lfi_merge_pairs );
      }
      cdolist_list_var2 = cdolist_list_var2.rest();
      keep_lfi_to_merge = cdolist_list_var2.first();
    }
    return lfi_merge_pairs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 71891L)
  public static SubLObject compute_id_merge_pairs(final SubLObject db_info, final SubLObject shared_sentence, final SubLObject lfi_merge_pairs, final SubLObject keep_table_info, final SubLObject kill_table_info)
  {
    final SubLObject isas = list_utilities.fast_delete_duplicates( ConsesLow.append( table_info_isas( keep_table_info ), table_info_isas( kill_table_info ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject object_vars = NIL;
    SubLObject query_sentence = el_utilities.copy_expression( shared_sentence );
    SubLObject cdolist_list_var = lfi_merge_pairs;
    SubLObject pair = NIL;
    pair = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = pair;
      SubLObject keep_lfi = NIL;
      SubLObject kill_lfi = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list274 );
      keep_lfi = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list274 );
      kill_lfi = current.first();
      current = current.rest();
      if( NIL == current )
      {
        final SubLObject anonymized_lfi = anonymize_table_info_object( keep_lfi );
        final SubLObject new_var = czer_utilities.unique_el_var_wrt_expression( query_sentence, UNPROVIDED );
        if( NIL != list_utilities.member_eqP( conses_high.third( anonymized_lfi ), isas ) )
        {
          object_vars = ConsesLow.cons( new_var, object_vars );
        }
        query_sentence = cycl_utilities.expression_nsubst( new_var, anonymized_lfi, query_sentence, Symbols.symbol_function( EQUAL ), UNPROVIDED );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list274 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      pair = cdolist_list_var.first();
    }
    query_sentence = ConsesLow.list( $const275$sksiSentence, query_sentence );
    final SubLObject binding_lists = inference_kernel.new_cyc_query( query_sentence, db_info_input_mt( db_info ), UNPROVIDED );
    format_nil.print_one_per_line( binding_lists, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 72884L)
  public static SubLObject all_fused_bln_terms()
  {
    SubLObject terms = NIL;
    SubLObject cdolist_list_var = constant_completion_high.constant_complete( $str265$BLN, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject v_const = NIL;
    v_const = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != string_utilities.substringP( $str276$Fused, constants_high.constant_name( v_const ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        terms = ConsesLow.cons( v_const, terms );
      }
      cdolist_list_var = cdolist_list_var.rest();
      v_const = cdolist_list_var.first();
    }
    return Sequences.nreverse( terms );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-database-fusion.lisp", position = 73130L)
  public static SubLObject kill_all_fused_bln_terms()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject count = ZERO_INTEGER;
    final SubLObject list_var = all_fused_bln_terms();
    final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
    final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$progress_note$.bind( $str263$cdolist, thread );
      utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
      utilities_macros.$progress_total$.bind( Sequences.length( list_var ), thread );
      utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
        SubLObject csome_list_var = list_var;
        SubLObject v_const = NIL;
        v_const = csome_list_var.first();
        while ( NIL != csome_list_var)
        {
          if( NIL != cyc_kernel.cyc_kill( v_const ) )
          {
            count = Numbers.add( count, ONE_INTEGER );
          }
          utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
          utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
          csome_list_var = csome_list_var.rest();
          v_const = csome_list_var.first();
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$29 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$29, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
      utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
      utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
      utilities_macros.$progress_start_time$.rebind( _prev_bind_2, thread );
      utilities_macros.$progress_note$.rebind( _prev_bind_0, thread );
    }
    return count;
  }

  public static SubLObject declare_sksi_database_fusion_file()
  {
    SubLFiles.declareFunction( me, "within_sksi_database_fusionP", "WITHIN-SKSI-DATABASE-FUSION?", 0, 0, false );
    SubLFiles.declareFunction( me, "sksi_database_fusion_debugP", "SKSI-DATABASE-FUSION-DEBUG?", 0, 0, false );
    SubLFiles.declareFunction( me, "db_info_print_function_trampoline", "DB-INFO-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "db_info_p", "DB-INFO-P", 1, 0, false );
    new $db_info_p$UnaryFunction();
    SubLFiles.declareFunction( me, "dbnfo_constant_base_name", "DBNFO-CONSTANT-BASE-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "dbnfo_db_name", "DBNFO-DB-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "dbnfo_table_infos", "DBNFO-TABLE-INFOS", 1, 0, false );
    SubLFiles.declareFunction( me, "dbnfo_table_info_index", "DBNFO-TABLE-INFO-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "dbnfo_server", "DBNFO-SERVER", 1, 0, false );
    SubLFiles.declareFunction( me, "dbnfo_port", "DBNFO-PORT", 1, 0, false );
    SubLFiles.declareFunction( me, "dbnfo_proxy_host", "DBNFO-PROXY-HOST", 1, 0, false );
    SubLFiles.declareFunction( me, "dbnfo_proxy_port", "DBNFO-PROXY-PORT", 1, 0, false );
    SubLFiles.declareFunction( me, "dbnfo_user", "DBNFO-USER", 1, 0, false );
    SubLFiles.declareFunction( me, "dbnfo_pass", "DBNFO-PASS", 1, 0, false );
    SubLFiles.declareFunction( me, "dbnfo_subprotocol", "DBNFO-SUBPROTOCOL", 1, 0, false );
    SubLFiles.declareFunction( me, "dbnfo_sql_flavor", "DBNFO-SQL-FLAVOR", 1, 0, false );
    SubLFiles.declareFunction( me, "dbnfo_quoted_isas", "DBNFO-QUOTED-ISAS", 1, 0, false );
    SubLFiles.declareFunction( me, "dbnfo_input_mt", "DBNFO-INPUT-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "dbnfo_content_genl_mts", "DBNFO-CONTENT-GENL-MTS", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_dbnfo_constant_base_name", "_CSETF-DBNFO-CONSTANT-BASE-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_dbnfo_db_name", "_CSETF-DBNFO-DB-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_dbnfo_table_infos", "_CSETF-DBNFO-TABLE-INFOS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_dbnfo_table_info_index", "_CSETF-DBNFO-TABLE-INFO-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_dbnfo_server", "_CSETF-DBNFO-SERVER", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_dbnfo_port", "_CSETF-DBNFO-PORT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_dbnfo_proxy_host", "_CSETF-DBNFO-PROXY-HOST", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_dbnfo_proxy_port", "_CSETF-DBNFO-PROXY-PORT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_dbnfo_user", "_CSETF-DBNFO-USER", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_dbnfo_pass", "_CSETF-DBNFO-PASS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_dbnfo_subprotocol", "_CSETF-DBNFO-SUBPROTOCOL", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_dbnfo_sql_flavor", "_CSETF-DBNFO-SQL-FLAVOR", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_dbnfo_quoted_isas", "_CSETF-DBNFO-QUOTED-ISAS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_dbnfo_input_mt", "_CSETF-DBNFO-INPUT-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_dbnfo_content_genl_mts", "_CSETF-DBNFO-CONTENT-GENL-MTS", 2, 0, false );
    SubLFiles.declareFunction( me, "make_db_info", "MAKE-DB-INFO", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_db_info", "VISIT-DEFSTRUCT-DB-INFO", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_db_info_method", "VISIT-DEFSTRUCT-OBJECT-DB-INFO-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "print_db_info", "PRINT-DB-INFO", 3, 0, false );
    SubLFiles.declareFunction( me, "new_db_info", "NEW-DB-INFO", 13, 0, false );
    SubLFiles.declareFunction( me, "db_info_constant_base_name", "DB-INFO-CONSTANT-BASE-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "db_info_db_name", "DB-INFO-DB-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "db_info_table_infos", "DB-INFO-TABLE-INFOS", 1, 0, false );
    SubLFiles.declareFunction( me, "db_info_table_info_index", "DB-INFO-TABLE-INFO-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "db_info_server", "DB-INFO-SERVER", 1, 0, false );
    SubLFiles.declareFunction( me, "db_info_port", "DB-INFO-PORT", 1, 0, false );
    SubLFiles.declareFunction( me, "db_info_proxy_host", "DB-INFO-PROXY-HOST", 1, 0, false );
    SubLFiles.declareFunction( me, "db_info_proxy_port", "DB-INFO-PROXY-PORT", 1, 0, false );
    SubLFiles.declareFunction( me, "db_info_user", "DB-INFO-USER", 1, 0, false );
    SubLFiles.declareFunction( me, "db_info_pass", "DB-INFO-PASS", 1, 0, false );
    SubLFiles.declareFunction( me, "db_info_subprotocol", "DB-INFO-SUBPROTOCOL", 1, 0, false );
    SubLFiles.declareFunction( me, "db_info_sql_flavor", "DB-INFO-SQL-FLAVOR", 1, 0, false );
    SubLFiles.declareFunction( me, "db_info_quoted_isas", "DB-INFO-QUOTED-ISAS", 1, 0, false );
    SubLFiles.declareFunction( me, "db_info_input_mt", "DB-INFO-INPUT-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "db_info_content_genl_mts", "DB-INFO-CONTENT-GENL-MTS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_db_info_constant_base_name", "SET-DB-INFO-CONSTANT-BASE-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "set_db_info_table_infos", "SET-DB-INFO-TABLE-INFOS", 2, 0, false );
    SubLFiles.declareFunction( me, "set_db_info_db_name", "SET-DB-INFO-DB-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "set_db_info_quoted_isas", "SET-DB-INFO-QUOTED-ISAS", 2, 0, false );
    SubLFiles.declareFunction( me, "set_db_info_input_mt", "SET-DB-INFO-INPUT-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "set_db_info_content_genl_mts", "SET-DB-INFO-CONTENT-GENL-MTS", 2, 0, false );
    SubLFiles.declareFunction( me, "db_info_ks_name", "DB-INFO-KS-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "db_info_table_info", "DB-INFO-TABLE-INFO", 2, 0, false );
    SubLFiles.declareFunction( me, "print_db_info_contents", "PRINT-DB-INFO-CONTENTS", 1, 0, false );
    SubLFiles.declareFunction( me, "reindex_db_info_table_infos", "REINDEX-DB-INFO-TABLE-INFOS", 1, 0, false );
    SubLFiles.declareFunction( me, "table_info_print_function_trampoline", "TABLE-INFO-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "table_info_p", "TABLE-INFO-P", 1, 0, false );
    new $table_info_p$UnaryFunction();
    SubLFiles.declareFunction( me, "tblnfo_id", "TBLNFO-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "tblnfo_constant_base_name", "TBLNFO-CONSTANT-BASE-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "tblnfo_table_name", "TBLNFO-TABLE-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "tblnfo_isas", "TBLNFO-ISAS", 1, 0, false );
    SubLFiles.declareFunction( me, "tblnfo_lf_types", "TBLNFO-LF-TYPES", 1, 0, false );
    SubLFiles.declareFunction( me, "tblnfo_field_mappings", "TBLNFO-FIELD-MAPPINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "tblnfo_meaning_sentences", "TBLNFO-MEANING-SENTENCES", 1, 0, false );
    SubLFiles.declareFunction( me, "tblnfo_enumerableP", "TBLNFO-ENUMERABLE?", 1, 0, false );
    SubLFiles.declareFunction( me, "tblnfo_field_names", "TBLNFO-FIELD-NAMES", 1, 0, false );
    SubLFiles.declareFunction( me, "tblnfo_field_types", "TBLNFO-FIELD-TYPES", 1, 0, false );
    SubLFiles.declareFunction( me, "tblnfo_primary_key", "TBLNFO-PRIMARY-KEY", 1, 0, false );
    SubLFiles.declareFunction( me, "tblnfo_indexes", "TBLNFO-INDEXES", 1, 0, false );
    SubLFiles.declareFunction( me, "tblnfo_field_encodings", "TBLNFO-FIELD-ENCODINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "tblnfo_field_decodings", "TBLNFO-FIELD-DECODINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "tblnfo_foreign_key_maps", "TBLNFO-FOREIGN-KEY-MAPS", 1, 0, false );
    SubLFiles.declareFunction( me, "tblnfo_non_null_field_list", "TBLNFO-NON-NULL-FIELD-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "tblnfo_unique_field_tuples", "TBLNFO-UNIQUE-FIELD-TUPLES", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_tblnfo_id", "_CSETF-TBLNFO-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_tblnfo_constant_base_name", "_CSETF-TBLNFO-CONSTANT-BASE-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_tblnfo_table_name", "_CSETF-TBLNFO-TABLE-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_tblnfo_isas", "_CSETF-TBLNFO-ISAS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_tblnfo_lf_types", "_CSETF-TBLNFO-LF-TYPES", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_tblnfo_field_mappings", "_CSETF-TBLNFO-FIELD-MAPPINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_tblnfo_meaning_sentences", "_CSETF-TBLNFO-MEANING-SENTENCES", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_tblnfo_enumerableP", "_CSETF-TBLNFO-ENUMERABLE?", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_tblnfo_field_names", "_CSETF-TBLNFO-FIELD-NAMES", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_tblnfo_field_types", "_CSETF-TBLNFO-FIELD-TYPES", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_tblnfo_primary_key", "_CSETF-TBLNFO-PRIMARY-KEY", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_tblnfo_indexes", "_CSETF-TBLNFO-INDEXES", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_tblnfo_field_encodings", "_CSETF-TBLNFO-FIELD-ENCODINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_tblnfo_field_decodings", "_CSETF-TBLNFO-FIELD-DECODINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_tblnfo_foreign_key_maps", "_CSETF-TBLNFO-FOREIGN-KEY-MAPS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_tblnfo_non_null_field_list", "_CSETF-TBLNFO-NON-NULL-FIELD-LIST", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_tblnfo_unique_field_tuples", "_CSETF-TBLNFO-UNIQUE-FIELD-TUPLES", 2, 0, false );
    SubLFiles.declareFunction( me, "make_table_info", "MAKE-TABLE-INFO", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_table_info", "VISIT-DEFSTRUCT-TABLE-INFO", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_table_info_method", "VISIT-DEFSTRUCT-OBJECT-TABLE-INFO-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "print_table_info", "PRINT-TABLE-INFO", 3, 0, false );
    SubLFiles.declareFunction( me, "new_table_info", "NEW-TABLE-INFO", 17, 0, false );
    SubLFiles.declareFunction( me, "table_info_id", "TABLE-INFO-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "table_info_constant_base_name", "TABLE-INFO-CONSTANT-BASE-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "table_info_isas", "TABLE-INFO-ISAS", 1, 0, false );
    SubLFiles.declareFunction( me, "table_info_lf_types", "TABLE-INFO-LF-TYPES", 1, 0, false );
    SubLFiles.declareFunction( me, "table_info_field_mappings", "TABLE-INFO-FIELD-MAPPINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "table_info_meaning_sentences", "TABLE-INFO-MEANING-SENTENCES", 1, 0, false );
    SubLFiles.declareFunction( me, "table_info_enumerableP", "TABLE-INFO-ENUMERABLE?", 1, 0, false );
    SubLFiles.declareFunction( me, "table_info_table_name", "TABLE-INFO-TABLE-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "table_info_field_names", "TABLE-INFO-FIELD-NAMES", 1, 0, false );
    SubLFiles.declareFunction( me, "table_info_field_types", "TABLE-INFO-FIELD-TYPES", 1, 0, false );
    SubLFiles.declareFunction( me, "table_info_primary_key", "TABLE-INFO-PRIMARY-KEY", 1, 0, false );
    SubLFiles.declareFunction( me, "table_info_indexes", "TABLE-INFO-INDEXES", 1, 0, false );
    SubLFiles.declareFunction( me, "table_info_field_encodings", "TABLE-INFO-FIELD-ENCODINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "table_info_field_decodings", "TABLE-INFO-FIELD-DECODINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "table_info_foreign_key_maps", "TABLE-INFO-FOREIGN-KEY-MAPS", 1, 0, false );
    SubLFiles.declareFunction( me, "table_info_non_null_field_list", "TABLE-INFO-NON-NULL-FIELD-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "table_info_unique_field_tuples", "TABLE-INFO-UNIQUE-FIELD-TUPLES", 1, 0, false );
    SubLFiles.declareFunction( me, "set_table_info_constant_base_name", "SET-TABLE-INFO-CONSTANT-BASE-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "set_table_info_lf_types", "SET-TABLE-INFO-LF-TYPES", 2, 0, false );
    SubLFiles.declareFunction( me, "set_table_info_meaning_sentences", "SET-TABLE-INFO-MEANING-SENTENCES", 2, 0, false );
    SubLFiles.declareFunction( me, "set_table_info_table_name", "SET-TABLE-INFO-TABLE-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "table_info_ks_name", "TABLE-INFO-KS-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "table_info_ls_name", "TABLE-INFO-LS-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "table_info_ps_name", "TABLE-INFO-PS-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "print_table_info_contents", "PRINT-TABLE-INFO-CONTENTS", 1, 0, false );
    SubLFiles.declareFunction( me, "table_info_id_p", "TABLE-INFO-ID-P", 1, 0, false );
    SubLFiles.declareFunction( me, "table_info_field_encoding_p", "TABLE-INFO-FIELD-ENCODING-P", 1, 0, false );
    SubLFiles.declareFunction( me, "table_info_field_decoding_p", "TABLE-INFO-FIELD-DECODING-P", 1, 0, false );
    SubLFiles.declareFunction( me, "table_info_foreign_key_map_p", "TABLE-INFO-FOREIGN-KEY-MAP-P", 1, 0, false );
    SubLFiles.declareFunction( me, "table_info_field_mapping_p", "TABLE-INFO-FIELD-MAPPING-P", 1, 0, false );
    SubLFiles.declareFunction( me, "table_info_logical_field_indexical_p", "TABLE-INFO-LOGICAL-FIELD-INDEXICAL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "table_info_logical_field_p", "TABLE-INFO-LOGICAL-FIELD-P", 1, 0, false );
    SubLFiles.declareFunction( me, "table_info_physical_field_indexical_p", "TABLE-INFO-PHYSICAL-FIELD-INDEXICAL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "table_info_physical_field_p", "TABLE-INFO-PHYSICAL-FIELD-P", 1, 0, false );
    SubLFiles.declareFunction( me, "table_info_sk_source_p", "TABLE-INFO-SK-SOURCE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "table_info_logical_schema_p", "TABLE-INFO-LOGICAL-SCHEMA-P", 1, 0, false );
    SubLFiles.declareFunction( me, "table_info_physical_schema_p", "TABLE-INFO-PHYSICAL-SCHEMA-P", 1, 0, false );
    SubLFiles.declareFunction( me, "clone_database", "CLONE-DATABASE", 1, 1, false );
    SubLFiles.declareFunction( me, "kill_all_cloned_databases", "KILL-ALL-CLONED-DATABASES", 1, 0, false );
    SubLFiles.declareFunction( me, "compute_and_clone_db_info", "COMPUTE-AND-CLONE-DB-INFO", 1, 0, false );
    SubLFiles.declareFunction( me, "reify_cloned_db_info", "REIFY-CLONED-DB-INFO", 2, 0, false );
    SubLFiles.declareFunction( me, "clone_db_info_constant_names", "CLONE-DB-INFO-CONSTANT-NAMES", 1, 0, false );
    SubLFiles.declareFunction( me, "clone_constant_base_name", "CLONE-CONSTANT-BASE-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "clone_db_info_db_name", "CLONE-DB-INFO-DB-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "clone_db_name", "CLONE-DB-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "uniquify_db_info_db_name", "UNIQUIFY-DB-INFO-DB-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "db_info_existsP", "DB-INFO-EXISTS?", 1, 0, false );
    SubLFiles.declareFunction( me, "db_info_access_path", "DB-INFO-ACCESS-PATH", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_populate_cloned_ks", "SKSI-POPULATE-CLONED-KS", 3, 0, false );
    SubLFiles.declareFunction( me, "sksi_populate_cloned_ks_int", "SKSI-POPULATE-CLONED-KS-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "sksi_populate_sub_ks", "SKSI-POPULATE-SUB-KS", 3, 0, false );
    SubLFiles.declareFunction( me, "sksi_saturate_rule_variablize_antecedent", "SKSI-SATURATE-RULE-VARIABLIZE-ANTECEDENT", 1, 0, false );
    SubLFiles.declareFunction( me, "variablize_table_info_lfi", "VARIABLIZE-TABLE-INFO-LFI", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_database_fusion_clones_or_fusionsP", "SKSI-DATABASE-FUSION-CLONES-OR-FUSIONS?", 2, 0, false );
    SubLFiles.declareFunction( me, "sksi_database_fusion_clonesP", "SKSI-DATABASE-FUSION-CLONES?", 2, 0, false );
    SubLFiles.declareFunction( me, "sksi_database_fusion_clones_intP", "SKSI-DATABASE-FUSION-CLONES-INT?", 2, 0, false );
    SubLFiles.declareFunction( me, "sksi_database_fusion_fusionsP", "SKSI-DATABASE-FUSION-FUSIONS?", 2, 0, false );
    SubLFiles.declareFunction( me, "sksi_database_fusion_fusions_intP", "SKSI-DATABASE-FUSION-FUSIONS-INT?", 2, 0, false );
    SubLFiles.declareFunction( me, "compute_initial_db_info", "COMPUTE-INITIAL-DB-INFO", 1, 0, false );
    SubLFiles.declareFunction( me, "compute_initial_table_infos_for_source", "COMPUTE-INITIAL-TABLE-INFOS-FOR-SOURCE", 1, 0, false );
    SubLFiles.declareFunction( me, "compute_initial_table_info", "COMPUTE-INITIAL-TABLE-INFO", 3, 0, false );
    SubLFiles.declareFunction( me, "new_table_info_from_sk_source", "NEW-TABLE-INFO-FROM-SK-SOURCE", 4, 0, false );
    SubLFiles.declareFunction( me, "compute_constant_base_name", "COMPUTE-CONSTANT-BASE-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "mapcar_physical_field_name", "MAPCAR-PHYSICAL-FIELD-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "process_field_encodings_for_table_info", "PROCESS-FIELD-ENCODINGS-FOR-TABLE-INFO", 3, 0, false );
    SubLFiles.declareFunction( me, "process_field_encoding_for_table_info", "PROCESS-FIELD-ENCODING-FOR-TABLE-INFO", 3, 0, false );
    SubLFiles.declareFunction( me, "table_infoifiable_p", "TABLE-INFOIFIABLE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "table_infoify_object", "TABLE-INFOIFY-OBJECT", 1, 0, false );
    SubLFiles.declareFunction( me, "table_infoify_sk_source", "TABLE-INFOIFY-SK-SOURCE", 1, 0, false );
    SubLFiles.declareFunction( me, "table_infoify_logical_schema", "TABLE-INFOIFY-LOGICAL-SCHEMA", 1, 0, false );
    SubLFiles.declareFunction( me, "table_infoify_physical_schema", "TABLE-INFOIFY-PHYSICAL-SCHEMA", 1, 0, false );
    SubLFiles.declareFunction( me, "table_infoify_logical_field_indexical", "TABLE-INFOIFY-LOGICAL-FIELD-INDEXICAL", 1, 0, false );
    SubLFiles.declareFunction( me, "process_field_decodings_for_table_info", "PROCESS-FIELD-DECODINGS-FOR-TABLE-INFO", 3, 0, false );
    SubLFiles.declareFunction( me, "process_field_decoding_for_table_info", "PROCESS-FIELD-DECODING-FOR-TABLE-INFO", 3, 0, false );
    SubLFiles.declareFunction( me, "table_infoify_physical_field_indexical", "TABLE-INFOIFY-PHYSICAL-FIELD-INDEXICAL", 1, 0, false );
    SubLFiles.declareFunction( me, "process_foreign_key_maps_for_table_info", "PROCESS-FOREIGN-KEY-MAPS-FOR-TABLE-INFO", 3, 0, false );
    SubLFiles.declareFunction( me, "process_foreign_key_map_for_table_info", "PROCESS-FOREIGN-KEY-MAP-FOR-TABLE-INFO", 3, 0, false );
    SubLFiles.declareFunction( me, "fused_sk_source_name", "FUSED-SK-SOURCE-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "fused_ls_name", "FUSED-LS-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "extract_field_mappings_for_table_info", "EXTRACT-FIELD-MAPPINGS-FOR-TABLE-INFO", 2, 0, false );
    SubLFiles.declareFunction( me, "table_infoify_logical_field", "TABLE-INFOIFY-LOGICAL-FIELD", 2, 0, false );
    SubLFiles.declareFunction( me, "process_meaning_sentences_for_table_info", "PROCESS-MEANING-SENTENCES-FOR-TABLE-INFO", 2, 0, false );
    SubLFiles.declareFunction( me, "reify_db_info", "REIFY-DB-INFO", 1, 0, false );
    SubLFiles.declareFunction( me, "finish_reifying_db_info", "FINISH-REIFYING-DB-INFO", 2, 0, false );
    SubLFiles.declareFunction( me, "start_reifying_table_info", "START-REIFYING-TABLE-INFO", 3, 0, false );
    SubLFiles.declareFunction( me, "finish_reifying_table_info", "FINISH-REIFYING-TABLE-INFO", 6, 0, false );
    SubLFiles.declareFunction( me, "reify_new_top_level_ks", "REIFY-NEW-TOP-LEVEL-KS", 1, 0, false );
    SubLFiles.declareFunction( me, "start_reifying_new_top_level_ks", "START-REIFYING-NEW-TOP-LEVEL-KS", 1, 0, false );
    SubLFiles.declareFunction( me, "finish_reifying_new_top_level_ks", "FINISH-REIFYING-NEW-TOP-LEVEL-KS", 2, 0, false );
    SubLFiles.declareFunction( me, "reify_access_path", "REIFY-ACCESS-PATH", 3, 0, false );
    SubLFiles.declareFunction( me, "reify_new_sk_source", "REIFY-NEW-SK-SOURCE", 3, 0, false );
    SubLFiles.declareFunction( me, "start_reifying_new_logical_schema", "START-REIFYING-NEW-LOGICAL-SCHEMA", 2, 0, false );
    SubLFiles.declareFunction( me, "finish_reifying_new_logical_schema", "FINISH-REIFYING-NEW-LOGICAL-SCHEMA", 8, 0, false );
    SubLFiles.declareFunction( me, "kbifiable_p", "KBIFIABLE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "kbify_object", "KBIFY-OBJECT", 1, 0, false );
    SubLFiles.declareFunction( me, "kbify_sk_source", "KBIFY-SK-SOURCE", 1, 0, false );
    SubLFiles.declareFunction( me, "kbify_logical_schema", "KBIFY-LOGICAL-SCHEMA", 1, 0, false );
    SubLFiles.declareFunction( me, "kbify_physical_schema", "KBIFY-PHYSICAL-SCHEMA", 1, 0, false );
    SubLFiles.declareFunction( me, "kbify_meaning_sentence", "KBIFY-MEANING-SENTENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "kbify_logical_field_indexicals", "KBIFY-LOGICAL-FIELD-INDEXICALS", 2, 0, false );
    SubLFiles.declareFunction( me, "kbify_logical_field_indexical", "KBIFY-LOGICAL-FIELD-INDEXICAL", 1, 0, false );
    SubLFiles.declareFunction( me, "kbify_logical_field", "KBIFY-LOGICAL-FIELD", 2, 0, false );
    SubLFiles.declareFunction( me, "kbify_physical_field_indexicals", "KBIFY-PHYSICAL-FIELD-INDEXICALS", 2, 0, false );
    SubLFiles.declareFunction( me, "kbify_physical_field_indexical", "KBIFY-PHYSICAL-FIELD-INDEXICAL", 1, 0, false );
    SubLFiles.declareFunction( me, "anonymize_table_info_object", "ANONYMIZE-TABLE-INFO-OBJECT", 1, 0, false );
    SubLFiles.declareFunction( me, "anonymize_table_info_logical_field", "ANONYMIZE-TABLE-INFO-LOGICAL-FIELD", 1, 0, false );
    SubLFiles.declareFunction( me, "anonymize_table_info_logical_field_indexical", "ANONYMIZE-TABLE-INFO-LOGICAL-FIELD-INDEXICAL", 1, 0, false );
    SubLFiles.declareFunction( me, "anonymize_table_info_physical_field_indexical", "ANONYMIZE-TABLE-INFO-PHYSICAL-FIELD-INDEXICAL", 1, 0, false );
    SubLFiles.declareFunction( me, "anonymize_table_info_sk_source", "ANONYMIZE-TABLE-INFO-SK-SOURCE", 1, 0, false );
    SubLFiles.declareFunction( me, "anonymize_table_info_logical_schema", "ANONYMIZE-TABLE-INFO-LOGICAL-SCHEMA", 1, 0, false );
    SubLFiles.declareFunction( me, "anonymize_table_info_physical_schema", "ANONYMIZE-TABLE-INFO-PHYSICAL-SCHEMA", 1, 0, false );
    SubLFiles.declareFunction( me, "start_reifying_new_physical_schema", "START-REIFYING-NEW-PHYSICAL-SCHEMA", 2, 0, false );
    SubLFiles.declareFunction( me, "finish_reifying_new_physical_schema", "FINISH-REIFYING-NEW-PHYSICAL-SCHEMA", 15, 0, false );
    SubLFiles.declareFunction( me, "table_info_field_names_to_physical_fields", "TABLE-INFO-FIELD-NAMES-TO-PHYSICAL-FIELDS", 2, 0, false );
    SubLFiles.declareFunction( me, "table_info_field_name_to_physical_field", "TABLE-INFO-FIELD-NAME-TO-PHYSICAL-FIELD", 2, 0, false );
    SubLFiles.declareFunction( me, "table_info_field_name_to_physical_field_indexical", "TABLE-INFO-FIELD-NAME-TO-PHYSICAL-FIELD-INDEXICAL", 2, 0, false );
    SubLFiles.declareFunction( me, "kbify_field_encoding", "KBIFY-FIELD-ENCODING", 2, 0, false );
    SubLFiles.declareFunction( me, "kbify_field_decoding", "KBIFY-FIELD-DECODING", 2, 0, false );
    SubLFiles.declareFunction( me, "compute_db_clone_forward_inference_allowed_rules", "COMPUTE-DB-CLONE-FORWARD-INFERENCE-ALLOWED-RULES", 1, 0, false );
    SubLFiles.declareFunction( me, "all_cloned_bln_terms", "ALL-CLONED-BLN-TERMS", 0, 0, false );
    SubLFiles.declareFunction( me, "kill_all_cloned_bln_terms", "KILL-ALL-CLONED-BLN-TERMS", 0, 0, false );
    SubLFiles.declareFunction( me, "fuse_databases", "FUSE-DATABASES", 1, 1, false );
    SubLFiles.declareFunction( me, "kill_all_fused_databases", "KILL-ALL-FUSED-DATABASES", 1, 0, false );
    SubLFiles.declareFunction( me, "reify_fused_db_info", "REIFY-FUSED-DB-INFO", 2, 0, false );
    SubLFiles.declareFunction( me, "sksi_populate_fused_ks", "SKSI-POPULATE-FUSED-KS", 3, 0, false );
    SubLFiles.declareFunction( me, "sksi_populate_fused_ks_int", "SKSI-POPULATE-FUSED-KS-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "compute_and_fuse_db_info", "COMPUTE-AND-FUSE-DB-INFO", 1, 0, false );
    SubLFiles.declareFunction( me, "compute_db_fusion_mt", "COMPUTE-DB-FUSION-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "trivially_fuse_db_infos", "TRIVIALLY-FUSE-DB-INFOS", 1, 0, false );
    SubLFiles.declareFunction( me, "fuse_db_info_table_infos", "FUSE-DB-INFO-TABLE-INFOS", 2, 0, false );
    SubLFiles.declareFunction( me, "merge_db_info_table_infos", "MERGE-DB-INFO-TABLE-INFOS", 2, 0, false );
    SubLFiles.declareFunction( me, "fuse_db_info_constant_names", "FUSE-DB-INFO-CONSTANT-NAMES", 1, 0, false );
    SubLFiles.declareFunction( me, "fuse_constant_base_name", "FUSE-CONSTANT-BASE-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "fuse_db_info_db_names", "FUSE-DB-INFO-DB-NAMES", 1, 0, false );
    SubLFiles.declareFunction( me, "fuse_db_info_quoted_isas", "FUSE-DB-INFO-QUOTED-ISAS", 2, 0, false );
    SubLFiles.declareFunction( me, "fuse_db_info_input_mt", "FUSE-DB-INFO-INPUT-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "fuse_db_info_content_genl_mts", "FUSE-DB-INFO-CONTENT-GENL-MTS", 2, 0, false );
    SubLFiles.declareFunction( me, "fuse_db_info", "FUSE-DB-INFO", 1, 0, false );
    SubLFiles.declareFunction( me, "fuse_db_info_do_one_step", "FUSE-DB-INFO-DO-ONE-STEP", 1, 0, false );
    SubLFiles.declareFunction( me, "merge_two_db_info_tables", "MERGE-TWO-DB-INFO-TABLES", 1, 0, false );
    SubLFiles.declareFunction( me, "merge_two_db_info_tables_int", "MERGE-TWO-DB-INFO-TABLES-INT", 3, 0, false );
    SubLFiles.declareFunction( me, "merge_two_db_info_meaning_sentences", "MERGE-TWO-DB-INFO-MEANING-SENTENCES", 4, 0, false );
    SubLFiles.declareFunction( me, "compute_lfi_merge_pairs", "COMPUTE-LFI-MERGE-PAIRS", 3, 0, false );
    SubLFiles.declareFunction( me, "compute_id_merge_pairs", "COMPUTE-ID-MERGE-PAIRS", 5, 0, false );
    SubLFiles.declareFunction( me, "all_fused_bln_terms", "ALL-FUSED-BLN-TERMS", 0, 0, false );
    SubLFiles.declareFunction( me, "kill_all_fused_bln_terms", "KILL-ALL-FUSED-BLN-TERMS", 0, 0, false );
    return NIL;
  }

  public static SubLObject init_sksi_database_fusion_file()
  {
    $within_sksi_database_fusionP$ = SubLFiles.defparameter( "*WITHIN-SKSI-DATABASE-FUSION?*", NIL );
    $sksi_database_fusion_debugP$ = SubLFiles.defvar( "*SKSI-DATABASE-FUSION-DEBUG?*", NIL );
    $sksi_database_fusion_table_info_isg$ = SubLFiles.deflexical( "*SKSI-DATABASE-FUSION-TABLE-INFO-ISG*", maybeDefault( $sym0$_SKSI_DATABASE_FUSION_TABLE_INFO_ISG_, $sksi_database_fusion_table_info_isg$,
        () -> ( integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) ) );
    $dtp_db_info$ = SubLFiles.defconstant( "*DTP-DB-INFO*", $sym1$DB_INFO );
    $dtp_table_info$ = SubLFiles.defconstant( "*DTP-TABLE-INFO*", $sym83$TABLE_INFO );
    $last_db_info$ = SubLFiles.deflexical( "*LAST-DB-INFO*", ( maybeDefault( $sym175$_LAST_DB_INFO_, $last_db_info$, NIL ) ) );
    $current_table_info_variable_count$ = SubLFiles.defparameter( "*CURRENT-TABLE-INFO-VARIABLE-COUNT*", NIL );
    $table_info_lfi_variable_dict$ = SubLFiles.defparameter( "*TABLE-INFO-LFI-VARIABLE-DICT*", NIL );
    $table_infoify_expression_table_kb_index$ = SubLFiles.defparameter( "*TABLE-INFOIFY-EXPRESSION-TABLE-KB-INDEX*", NIL );
    $kbify_expression_kb_table_index$ = SubLFiles.defparameter( "*KBIFY-EXPRESSION-KB-TABLE-INDEX*", NIL );
    return NIL;
  }

  public static SubLObject setup_sksi_database_fusion_file()
  {
    subl_macro_promotions.declare_defglobal( $sym0$_SKSI_DATABASE_FUSION_TABLE_INFO_ISG_ );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_db_info$.getGlobalValue(), Symbols.symbol_function( $sym8$DB_INFO_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list9 );
    Structures.def_csetf( $sym10$DBNFO_CONSTANT_BASE_NAME, $sym11$_CSETF_DBNFO_CONSTANT_BASE_NAME );
    Structures.def_csetf( $sym12$DBNFO_DB_NAME, $sym13$_CSETF_DBNFO_DB_NAME );
    Structures.def_csetf( $sym14$DBNFO_TABLE_INFOS, $sym15$_CSETF_DBNFO_TABLE_INFOS );
    Structures.def_csetf( $sym16$DBNFO_TABLE_INFO_INDEX, $sym17$_CSETF_DBNFO_TABLE_INFO_INDEX );
    Structures.def_csetf( $sym18$DBNFO_SERVER, $sym19$_CSETF_DBNFO_SERVER );
    Structures.def_csetf( $sym20$DBNFO_PORT, $sym21$_CSETF_DBNFO_PORT );
    Structures.def_csetf( $sym22$DBNFO_PROXY_HOST, $sym23$_CSETF_DBNFO_PROXY_HOST );
    Structures.def_csetf( $sym24$DBNFO_PROXY_PORT, $sym25$_CSETF_DBNFO_PROXY_PORT );
    Structures.def_csetf( $sym26$DBNFO_USER, $sym27$_CSETF_DBNFO_USER );
    Structures.def_csetf( $sym28$DBNFO_PASS, $sym29$_CSETF_DBNFO_PASS );
    Structures.def_csetf( $sym30$DBNFO_SUBPROTOCOL, $sym31$_CSETF_DBNFO_SUBPROTOCOL );
    Structures.def_csetf( $sym32$DBNFO_SQL_FLAVOR, $sym33$_CSETF_DBNFO_SQL_FLAVOR );
    Structures.def_csetf( $sym34$DBNFO_QUOTED_ISAS, $sym35$_CSETF_DBNFO_QUOTED_ISAS );
    Structures.def_csetf( $sym36$DBNFO_INPUT_MT, $sym37$_CSETF_DBNFO_INPUT_MT );
    Structures.def_csetf( $sym38$DBNFO_CONTENT_GENL_MTS, $sym39$_CSETF_DBNFO_CONTENT_GENL_MTS );
    Equality.identity( $sym1$DB_INFO );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_db_info$.getGlobalValue(), Symbols.symbol_function( $sym60$VISIT_DEFSTRUCT_OBJECT_DB_INFO_METHOD ) );
    utilities_macros.note_funcall_helper_function( $sym7$PRINT_DB_INFO );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_table_info$.getGlobalValue(), Symbols.symbol_function( $sym89$TABLE_INFO_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list90 );
    Structures.def_csetf( $sym91$TBLNFO_ID, $sym92$_CSETF_TBLNFO_ID );
    Structures.def_csetf( $sym93$TBLNFO_CONSTANT_BASE_NAME, $sym94$_CSETF_TBLNFO_CONSTANT_BASE_NAME );
    Structures.def_csetf( $sym95$TBLNFO_TABLE_NAME, $sym96$_CSETF_TBLNFO_TABLE_NAME );
    Structures.def_csetf( $sym97$TBLNFO_ISAS, $sym98$_CSETF_TBLNFO_ISAS );
    Structures.def_csetf( $sym99$TBLNFO_LF_TYPES, $sym100$_CSETF_TBLNFO_LF_TYPES );
    Structures.def_csetf( $sym101$TBLNFO_FIELD_MAPPINGS, $sym102$_CSETF_TBLNFO_FIELD_MAPPINGS );
    Structures.def_csetf( $sym103$TBLNFO_MEANING_SENTENCES, $sym104$_CSETF_TBLNFO_MEANING_SENTENCES );
    Structures.def_csetf( $sym105$TBLNFO_ENUMERABLE_, $sym106$_CSETF_TBLNFO_ENUMERABLE_ );
    Structures.def_csetf( $sym107$TBLNFO_FIELD_NAMES, $sym108$_CSETF_TBLNFO_FIELD_NAMES );
    Structures.def_csetf( $sym109$TBLNFO_FIELD_TYPES, $sym110$_CSETF_TBLNFO_FIELD_TYPES );
    Structures.def_csetf( $sym111$TBLNFO_PRIMARY_KEY, $sym112$_CSETF_TBLNFO_PRIMARY_KEY );
    Structures.def_csetf( $sym113$TBLNFO_INDEXES, $sym114$_CSETF_TBLNFO_INDEXES );
    Structures.def_csetf( $sym115$TBLNFO_FIELD_ENCODINGS, $sym116$_CSETF_TBLNFO_FIELD_ENCODINGS );
    Structures.def_csetf( $sym117$TBLNFO_FIELD_DECODINGS, $sym118$_CSETF_TBLNFO_FIELD_DECODINGS );
    Structures.def_csetf( $sym119$TBLNFO_FOREIGN_KEY_MAPS, $sym120$_CSETF_TBLNFO_FOREIGN_KEY_MAPS );
    Structures.def_csetf( $sym121$TBLNFO_NON_NULL_FIELD_LIST, $sym122$_CSETF_TBLNFO_NON_NULL_FIELD_LIST );
    Structures.def_csetf( $sym123$TBLNFO_UNIQUE_FIELD_TUPLES, $sym124$_CSETF_TBLNFO_UNIQUE_FIELD_TUPLES );
    Equality.identity( $sym83$TABLE_INFO );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_table_info$.getGlobalValue(), Symbols.symbol_function( $sym142$VISIT_DEFSTRUCT_OBJECT_TABLE_INFO_METHOD ) );
    utilities_macros.note_funcall_helper_function( $sym88$PRINT_TABLE_INFO );
    subl_macro_promotions.declare_defglobal( $sym175$_LAST_DB_INFO_ );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_sksi_database_fusion_file();
  }

  @Override
  public void initializeVariables()
  {
    init_sksi_database_fusion_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_sksi_database_fusion_file();
  }
  static
  {
    me = new sksi_database_fusion();
    $within_sksi_database_fusionP$ = null;
    $sksi_database_fusion_debugP$ = null;
    $sksi_database_fusion_table_info_isg$ = null;
    $dtp_db_info$ = null;
    $dtp_table_info$ = null;
    $last_db_info$ = null;
    $current_table_info_variable_count$ = null;
    $table_info_lfi_variable_dict$ = null;
    $table_infoify_expression_table_kb_index$ = null;
    $kbify_expression_kb_table_index$ = null;
    $sym0$_SKSI_DATABASE_FUSION_TABLE_INFO_ISG_ = makeSymbol( "*SKSI-DATABASE-FUSION-TABLE-INFO-ISG*" );
    $sym1$DB_INFO = makeSymbol( "DB-INFO" );
    $sym2$DB_INFO_P = makeSymbol( "DB-INFO-P" );
    $list3 = ConsesLow.list( new SubLObject[] { makeSymbol( "CONSTANT-BASE-NAME" ), makeSymbol( "DB-NAME" ), makeSymbol( "TABLE-INFOS" ), makeSymbol( "TABLE-INFO-INDEX" ), makeSymbol( "SERVER" ), makeSymbol( "PORT" ),
      makeSymbol( "PROXY-HOST" ), makeSymbol( "PROXY-PORT" ), makeSymbol( "USER" ), makeSymbol( "PASS" ), makeSymbol( "SUBPROTOCOL" ), makeSymbol( "SQL-FLAVOR" ), makeSymbol( "QUOTED-ISAS" ), makeSymbol( "INPUT-MT" ),
      makeSymbol( "CONTENT-GENL-MTS" )
    } );
    $list4 = ConsesLow.list( new SubLObject[] { makeKeyword( "CONSTANT-BASE-NAME" ), makeKeyword( "DB-NAME" ), makeKeyword( "TABLE-INFOS" ), makeKeyword( "TABLE-INFO-INDEX" ), makeKeyword( "SERVER" ), makeKeyword(
        "PORT" ), makeKeyword( "PROXY-HOST" ), makeKeyword( "PROXY-PORT" ), makeKeyword( "USER" ), makeKeyword( "PASS" ), makeKeyword( "SUBPROTOCOL" ), makeKeyword( "SQL-FLAVOR" ), makeKeyword( "QUOTED-ISAS" ),
      makeKeyword( "INPUT-MT" ), makeKeyword( "CONTENT-GENL-MTS" )
    } );
    $list5 = ConsesLow.list( new SubLObject[] { makeSymbol( "DBNFO-CONSTANT-BASE-NAME" ), makeSymbol( "DBNFO-DB-NAME" ), makeSymbol( "DBNFO-TABLE-INFOS" ), makeSymbol( "DBNFO-TABLE-INFO-INDEX" ), makeSymbol(
        "DBNFO-SERVER" ), makeSymbol( "DBNFO-PORT" ), makeSymbol( "DBNFO-PROXY-HOST" ), makeSymbol( "DBNFO-PROXY-PORT" ), makeSymbol( "DBNFO-USER" ), makeSymbol( "DBNFO-PASS" ), makeSymbol( "DBNFO-SUBPROTOCOL" ),
      makeSymbol( "DBNFO-SQL-FLAVOR" ), makeSymbol( "DBNFO-QUOTED-ISAS" ), makeSymbol( "DBNFO-INPUT-MT" ), makeSymbol( "DBNFO-CONTENT-GENL-MTS" )
    } );
    $list6 = ConsesLow.list( new SubLObject[] { makeSymbol( "_CSETF-DBNFO-CONSTANT-BASE-NAME" ), makeSymbol( "_CSETF-DBNFO-DB-NAME" ), makeSymbol( "_CSETF-DBNFO-TABLE-INFOS" ), makeSymbol(
        "_CSETF-DBNFO-TABLE-INFO-INDEX" ), makeSymbol( "_CSETF-DBNFO-SERVER" ), makeSymbol( "_CSETF-DBNFO-PORT" ), makeSymbol( "_CSETF-DBNFO-PROXY-HOST" ), makeSymbol( "_CSETF-DBNFO-PROXY-PORT" ), makeSymbol(
            "_CSETF-DBNFO-USER" ), makeSymbol( "_CSETF-DBNFO-PASS" ), makeSymbol( "_CSETF-DBNFO-SUBPROTOCOL" ), makeSymbol( "_CSETF-DBNFO-SQL-FLAVOR" ), makeSymbol( "_CSETF-DBNFO-QUOTED-ISAS" ), makeSymbol(
                "_CSETF-DBNFO-INPUT-MT" ), makeSymbol( "_CSETF-DBNFO-CONTENT-GENL-MTS" )
    } );
    $sym7$PRINT_DB_INFO = makeSymbol( "PRINT-DB-INFO" );
    $sym8$DB_INFO_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "DB-INFO-PRINT-FUNCTION-TRAMPOLINE" );
    $list9 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "DB-INFO-P" ) );
    $sym10$DBNFO_CONSTANT_BASE_NAME = makeSymbol( "DBNFO-CONSTANT-BASE-NAME" );
    $sym11$_CSETF_DBNFO_CONSTANT_BASE_NAME = makeSymbol( "_CSETF-DBNFO-CONSTANT-BASE-NAME" );
    $sym12$DBNFO_DB_NAME = makeSymbol( "DBNFO-DB-NAME" );
    $sym13$_CSETF_DBNFO_DB_NAME = makeSymbol( "_CSETF-DBNFO-DB-NAME" );
    $sym14$DBNFO_TABLE_INFOS = makeSymbol( "DBNFO-TABLE-INFOS" );
    $sym15$_CSETF_DBNFO_TABLE_INFOS = makeSymbol( "_CSETF-DBNFO-TABLE-INFOS" );
    $sym16$DBNFO_TABLE_INFO_INDEX = makeSymbol( "DBNFO-TABLE-INFO-INDEX" );
    $sym17$_CSETF_DBNFO_TABLE_INFO_INDEX = makeSymbol( "_CSETF-DBNFO-TABLE-INFO-INDEX" );
    $sym18$DBNFO_SERVER = makeSymbol( "DBNFO-SERVER" );
    $sym19$_CSETF_DBNFO_SERVER = makeSymbol( "_CSETF-DBNFO-SERVER" );
    $sym20$DBNFO_PORT = makeSymbol( "DBNFO-PORT" );
    $sym21$_CSETF_DBNFO_PORT = makeSymbol( "_CSETF-DBNFO-PORT" );
    $sym22$DBNFO_PROXY_HOST = makeSymbol( "DBNFO-PROXY-HOST" );
    $sym23$_CSETF_DBNFO_PROXY_HOST = makeSymbol( "_CSETF-DBNFO-PROXY-HOST" );
    $sym24$DBNFO_PROXY_PORT = makeSymbol( "DBNFO-PROXY-PORT" );
    $sym25$_CSETF_DBNFO_PROXY_PORT = makeSymbol( "_CSETF-DBNFO-PROXY-PORT" );
    $sym26$DBNFO_USER = makeSymbol( "DBNFO-USER" );
    $sym27$_CSETF_DBNFO_USER = makeSymbol( "_CSETF-DBNFO-USER" );
    $sym28$DBNFO_PASS = makeSymbol( "DBNFO-PASS" );
    $sym29$_CSETF_DBNFO_PASS = makeSymbol( "_CSETF-DBNFO-PASS" );
    $sym30$DBNFO_SUBPROTOCOL = makeSymbol( "DBNFO-SUBPROTOCOL" );
    $sym31$_CSETF_DBNFO_SUBPROTOCOL = makeSymbol( "_CSETF-DBNFO-SUBPROTOCOL" );
    $sym32$DBNFO_SQL_FLAVOR = makeSymbol( "DBNFO-SQL-FLAVOR" );
    $sym33$_CSETF_DBNFO_SQL_FLAVOR = makeSymbol( "_CSETF-DBNFO-SQL-FLAVOR" );
    $sym34$DBNFO_QUOTED_ISAS = makeSymbol( "DBNFO-QUOTED-ISAS" );
    $sym35$_CSETF_DBNFO_QUOTED_ISAS = makeSymbol( "_CSETF-DBNFO-QUOTED-ISAS" );
    $sym36$DBNFO_INPUT_MT = makeSymbol( "DBNFO-INPUT-MT" );
    $sym37$_CSETF_DBNFO_INPUT_MT = makeSymbol( "_CSETF-DBNFO-INPUT-MT" );
    $sym38$DBNFO_CONTENT_GENL_MTS = makeSymbol( "DBNFO-CONTENT-GENL-MTS" );
    $sym39$_CSETF_DBNFO_CONTENT_GENL_MTS = makeSymbol( "_CSETF-DBNFO-CONTENT-GENL-MTS" );
    $kw40$CONSTANT_BASE_NAME = makeKeyword( "CONSTANT-BASE-NAME" );
    $kw41$DB_NAME = makeKeyword( "DB-NAME" );
    $kw42$TABLE_INFOS = makeKeyword( "TABLE-INFOS" );
    $kw43$TABLE_INFO_INDEX = makeKeyword( "TABLE-INFO-INDEX" );
    $kw44$SERVER = makeKeyword( "SERVER" );
    $kw45$PORT = makeKeyword( "PORT" );
    $kw46$PROXY_HOST = makeKeyword( "PROXY-HOST" );
    $kw47$PROXY_PORT = makeKeyword( "PROXY-PORT" );
    $kw48$USER = makeKeyword( "USER" );
    $kw49$PASS = makeKeyword( "PASS" );
    $kw50$SUBPROTOCOL = makeKeyword( "SUBPROTOCOL" );
    $kw51$SQL_FLAVOR = makeKeyword( "SQL-FLAVOR" );
    $kw52$QUOTED_ISAS = makeKeyword( "QUOTED-ISAS" );
    $kw53$INPUT_MT = makeKeyword( "INPUT-MT" );
    $kw54$CONTENT_GENL_MTS = makeKeyword( "CONTENT-GENL-MTS" );
    $str55$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw56$BEGIN = makeKeyword( "BEGIN" );
    $sym57$MAKE_DB_INFO = makeSymbol( "MAKE-DB-INFO" );
    $kw58$SLOT = makeKeyword( "SLOT" );
    $kw59$END = makeKeyword( "END" );
    $sym60$VISIT_DEFSTRUCT_OBJECT_DB_INFO_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-DB-INFO-METHOD" );
    $str61$_DB_INFO__a_ = makeString( "<DB-INFO ~a>" );
    $sym62$STRINGP = makeSymbol( "STRINGP" );
    $sym63$NON_NEGATIVE_INTEGER_P = makeSymbol( "NON-NEGATIVE-INTEGER-P" );
    $sym64$FORT_P = makeSymbol( "FORT-P" );
    $sym65$NON_DOTTED_LIST_P = makeSymbol( "NON-DOTTED-LIST-P" );
    $sym66$COLLECTION_P = makeSymbol( "COLLECTION-P" );
    $sym67$HLMT_P = makeSymbol( "HLMT-P" );
    $sym68$TABLE_INFO_P = makeSymbol( "TABLE-INFO-P" );
    $str69$_KS = makeString( "-KS" );
    $str70$_s__ = makeString( "~s~%" );
    $str71$db_name___s__ = makeString( "db-name: ~s~%" );
    $str72$server___s__ = makeString( "server: ~s~%" );
    $str73$port___s__ = makeString( "port: ~s~%" );
    $str74$proxy_host___s__ = makeString( "proxy-host: ~s~%" );
    $str75$proxy_port___s__ = makeString( "proxy-port: ~s~%" );
    $str76$user___s__ = makeString( "user: ~s~%" );
    $str77$pass___s__ = makeString( "pass: ~s~%" );
    $str78$subprotocol___s__ = makeString( "subprotocol: ~s~%" );
    $str79$sql_flavor___s__ = makeString( "sql-flavor: ~s~%" );
    $str80$quoted_isas___s__ = makeString( "quoted-isas: ~s~%" );
    $str81$input_mt___s__ = makeString( "input-mt: ~s~%" );
    $str82$content_genl_mts___s__ = makeString( "content-genl-mts: ~s~%" );
    $sym83$TABLE_INFO = makeSymbol( "TABLE-INFO" );
    $list84 = ConsesLow.list( new SubLObject[] { makeSymbol( "ID" ), makeSymbol( "CONSTANT-BASE-NAME" ), makeSymbol( "TABLE-NAME" ), makeSymbol( "ISAS" ), makeSymbol( "LF-TYPES" ), makeSymbol( "FIELD-MAPPINGS" ),
      makeSymbol( "MEANING-SENTENCES" ), makeSymbol( "ENUMERABLE?" ), makeSymbol( "FIELD-NAMES" ), makeSymbol( "FIELD-TYPES" ), makeSymbol( "PRIMARY-KEY" ), makeSymbol( "INDEXES" ), makeSymbol( "FIELD-ENCODINGS" ),
      makeSymbol( "FIELD-DECODINGS" ), makeSymbol( "FOREIGN-KEY-MAPS" ), makeSymbol( "NON-NULL-FIELD-LIST" ), makeSymbol( "UNIQUE-FIELD-TUPLES" )
    } );
    $list85 = ConsesLow.list( new SubLObject[] { makeKeyword( "ID" ), makeKeyword( "CONSTANT-BASE-NAME" ), makeKeyword( "TABLE-NAME" ), makeKeyword( "ISAS" ), makeKeyword( "LF-TYPES" ), makeKeyword( "FIELD-MAPPINGS" ),
      makeKeyword( "MEANING-SENTENCES" ), makeKeyword( "ENUMERABLE?" ), makeKeyword( "FIELD-NAMES" ), makeKeyword( "FIELD-TYPES" ), makeKeyword( "PRIMARY-KEY" ), makeKeyword( "INDEXES" ), makeKeyword(
          "FIELD-ENCODINGS" ), makeKeyword( "FIELD-DECODINGS" ), makeKeyword( "FOREIGN-KEY-MAPS" ), makeKeyword( "NON-NULL-FIELD-LIST" ), makeKeyword( "UNIQUE-FIELD-TUPLES" )
    } );
    $list86 = ConsesLow.list( new SubLObject[] { makeSymbol( "TBLNFO-ID" ), makeSymbol( "TBLNFO-CONSTANT-BASE-NAME" ), makeSymbol( "TBLNFO-TABLE-NAME" ), makeSymbol( "TBLNFO-ISAS" ), makeSymbol( "TBLNFO-LF-TYPES" ),
      makeSymbol( "TBLNFO-FIELD-MAPPINGS" ), makeSymbol( "TBLNFO-MEANING-SENTENCES" ), makeSymbol( "TBLNFO-ENUMERABLE?" ), makeSymbol( "TBLNFO-FIELD-NAMES" ), makeSymbol( "TBLNFO-FIELD-TYPES" ), makeSymbol(
          "TBLNFO-PRIMARY-KEY" ), makeSymbol( "TBLNFO-INDEXES" ), makeSymbol( "TBLNFO-FIELD-ENCODINGS" ), makeSymbol( "TBLNFO-FIELD-DECODINGS" ), makeSymbol( "TBLNFO-FOREIGN-KEY-MAPS" ), makeSymbol(
              "TBLNFO-NON-NULL-FIELD-LIST" ), makeSymbol( "TBLNFO-UNIQUE-FIELD-TUPLES" )
    } );
    $list87 = ConsesLow.list( new SubLObject[] { makeSymbol( "_CSETF-TBLNFO-ID" ), makeSymbol( "_CSETF-TBLNFO-CONSTANT-BASE-NAME" ), makeSymbol( "_CSETF-TBLNFO-TABLE-NAME" ), makeSymbol( "_CSETF-TBLNFO-ISAS" ),
      makeSymbol( "_CSETF-TBLNFO-LF-TYPES" ), makeSymbol( "_CSETF-TBLNFO-FIELD-MAPPINGS" ), makeSymbol( "_CSETF-TBLNFO-MEANING-SENTENCES" ), makeSymbol( "_CSETF-TBLNFO-ENUMERABLE?" ), makeSymbol(
          "_CSETF-TBLNFO-FIELD-NAMES" ), makeSymbol( "_CSETF-TBLNFO-FIELD-TYPES" ), makeSymbol( "_CSETF-TBLNFO-PRIMARY-KEY" ), makeSymbol( "_CSETF-TBLNFO-INDEXES" ), makeSymbol( "_CSETF-TBLNFO-FIELD-ENCODINGS" ),
      makeSymbol( "_CSETF-TBLNFO-FIELD-DECODINGS" ), makeSymbol( "_CSETF-TBLNFO-FOREIGN-KEY-MAPS" ), makeSymbol( "_CSETF-TBLNFO-NON-NULL-FIELD-LIST" ), makeSymbol( "_CSETF-TBLNFO-UNIQUE-FIELD-TUPLES" )
    } );
    $sym88$PRINT_TABLE_INFO = makeSymbol( "PRINT-TABLE-INFO" );
    $sym89$TABLE_INFO_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "TABLE-INFO-PRINT-FUNCTION-TRAMPOLINE" );
    $list90 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "TABLE-INFO-P" ) );
    $sym91$TBLNFO_ID = makeSymbol( "TBLNFO-ID" );
    $sym92$_CSETF_TBLNFO_ID = makeSymbol( "_CSETF-TBLNFO-ID" );
    $sym93$TBLNFO_CONSTANT_BASE_NAME = makeSymbol( "TBLNFO-CONSTANT-BASE-NAME" );
    $sym94$_CSETF_TBLNFO_CONSTANT_BASE_NAME = makeSymbol( "_CSETF-TBLNFO-CONSTANT-BASE-NAME" );
    $sym95$TBLNFO_TABLE_NAME = makeSymbol( "TBLNFO-TABLE-NAME" );
    $sym96$_CSETF_TBLNFO_TABLE_NAME = makeSymbol( "_CSETF-TBLNFO-TABLE-NAME" );
    $sym97$TBLNFO_ISAS = makeSymbol( "TBLNFO-ISAS" );
    $sym98$_CSETF_TBLNFO_ISAS = makeSymbol( "_CSETF-TBLNFO-ISAS" );
    $sym99$TBLNFO_LF_TYPES = makeSymbol( "TBLNFO-LF-TYPES" );
    $sym100$_CSETF_TBLNFO_LF_TYPES = makeSymbol( "_CSETF-TBLNFO-LF-TYPES" );
    $sym101$TBLNFO_FIELD_MAPPINGS = makeSymbol( "TBLNFO-FIELD-MAPPINGS" );
    $sym102$_CSETF_TBLNFO_FIELD_MAPPINGS = makeSymbol( "_CSETF-TBLNFO-FIELD-MAPPINGS" );
    $sym103$TBLNFO_MEANING_SENTENCES = makeSymbol( "TBLNFO-MEANING-SENTENCES" );
    $sym104$_CSETF_TBLNFO_MEANING_SENTENCES = makeSymbol( "_CSETF-TBLNFO-MEANING-SENTENCES" );
    $sym105$TBLNFO_ENUMERABLE_ = makeSymbol( "TBLNFO-ENUMERABLE?" );
    $sym106$_CSETF_TBLNFO_ENUMERABLE_ = makeSymbol( "_CSETF-TBLNFO-ENUMERABLE?" );
    $sym107$TBLNFO_FIELD_NAMES = makeSymbol( "TBLNFO-FIELD-NAMES" );
    $sym108$_CSETF_TBLNFO_FIELD_NAMES = makeSymbol( "_CSETF-TBLNFO-FIELD-NAMES" );
    $sym109$TBLNFO_FIELD_TYPES = makeSymbol( "TBLNFO-FIELD-TYPES" );
    $sym110$_CSETF_TBLNFO_FIELD_TYPES = makeSymbol( "_CSETF-TBLNFO-FIELD-TYPES" );
    $sym111$TBLNFO_PRIMARY_KEY = makeSymbol( "TBLNFO-PRIMARY-KEY" );
    $sym112$_CSETF_TBLNFO_PRIMARY_KEY = makeSymbol( "_CSETF-TBLNFO-PRIMARY-KEY" );
    $sym113$TBLNFO_INDEXES = makeSymbol( "TBLNFO-INDEXES" );
    $sym114$_CSETF_TBLNFO_INDEXES = makeSymbol( "_CSETF-TBLNFO-INDEXES" );
    $sym115$TBLNFO_FIELD_ENCODINGS = makeSymbol( "TBLNFO-FIELD-ENCODINGS" );
    $sym116$_CSETF_TBLNFO_FIELD_ENCODINGS = makeSymbol( "_CSETF-TBLNFO-FIELD-ENCODINGS" );
    $sym117$TBLNFO_FIELD_DECODINGS = makeSymbol( "TBLNFO-FIELD-DECODINGS" );
    $sym118$_CSETF_TBLNFO_FIELD_DECODINGS = makeSymbol( "_CSETF-TBLNFO-FIELD-DECODINGS" );
    $sym119$TBLNFO_FOREIGN_KEY_MAPS = makeSymbol( "TBLNFO-FOREIGN-KEY-MAPS" );
    $sym120$_CSETF_TBLNFO_FOREIGN_KEY_MAPS = makeSymbol( "_CSETF-TBLNFO-FOREIGN-KEY-MAPS" );
    $sym121$TBLNFO_NON_NULL_FIELD_LIST = makeSymbol( "TBLNFO-NON-NULL-FIELD-LIST" );
    $sym122$_CSETF_TBLNFO_NON_NULL_FIELD_LIST = makeSymbol( "_CSETF-TBLNFO-NON-NULL-FIELD-LIST" );
    $sym123$TBLNFO_UNIQUE_FIELD_TUPLES = makeSymbol( "TBLNFO-UNIQUE-FIELD-TUPLES" );
    $sym124$_CSETF_TBLNFO_UNIQUE_FIELD_TUPLES = makeSymbol( "_CSETF-TBLNFO-UNIQUE-FIELD-TUPLES" );
    $kw125$ID = makeKeyword( "ID" );
    $kw126$TABLE_NAME = makeKeyword( "TABLE-NAME" );
    $kw127$ISAS = makeKeyword( "ISAS" );
    $kw128$LF_TYPES = makeKeyword( "LF-TYPES" );
    $kw129$FIELD_MAPPINGS = makeKeyword( "FIELD-MAPPINGS" );
    $kw130$MEANING_SENTENCES = makeKeyword( "MEANING-SENTENCES" );
    $kw131$ENUMERABLE_ = makeKeyword( "ENUMERABLE?" );
    $kw132$FIELD_NAMES = makeKeyword( "FIELD-NAMES" );
    $kw133$FIELD_TYPES = makeKeyword( "FIELD-TYPES" );
    $kw134$PRIMARY_KEY = makeKeyword( "PRIMARY-KEY" );
    $kw135$INDEXES = makeKeyword( "INDEXES" );
    $kw136$FIELD_ENCODINGS = makeKeyword( "FIELD-ENCODINGS" );
    $kw137$FIELD_DECODINGS = makeKeyword( "FIELD-DECODINGS" );
    $kw138$FOREIGN_KEY_MAPS = makeKeyword( "FOREIGN-KEY-MAPS" );
    $kw139$NON_NULL_FIELD_LIST = makeKeyword( "NON-NULL-FIELD-LIST" );
    $kw140$UNIQUE_FIELD_TUPLES = makeKeyword( "UNIQUE-FIELD-TUPLES" );
    $sym141$MAKE_TABLE_INFO = makeSymbol( "MAKE-TABLE-INFO" );
    $sym142$VISIT_DEFSTRUCT_OBJECT_TABLE_INFO_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-TABLE-INFO-METHOD" );
    $str143$_TABLE_INFO__a___a_ = makeString( "<TABLE-INFO ~a: ~a>" );
    $sym144$TABLE_INFO_ID_P = makeSymbol( "TABLE-INFO-ID-P" );
    $sym145$TABLE_INFO_FIELD_MAPPING_P = makeSymbol( "TABLE-INFO-FIELD-MAPPING-P" );
    $sym146$CYCL_SENTENCE_P = makeSymbol( "CYCL-SENTENCE-P" );
    $sym147$BOOLEANP = makeSymbol( "BOOLEANP" );
    $sym148$TABLE_INFO_FIELD_ENCODING_P = makeSymbol( "TABLE-INFO-FIELD-ENCODING-P" );
    $sym149$TABLE_INFO_FIELD_DECODING_P = makeSymbol( "TABLE-INFO-FIELD-DECODING-P" );
    $sym150$TABLE_INFO_FOREIGN_KEY_MAP_P = makeSymbol( "TABLE-INFO-FOREIGN-KEY-MAP-P" );
    $str151$_LS = makeString( "-LS" );
    $str152$_PS = makeString( "-PS" );
    $str153$table_name__s__ = makeString( "table-name ~s~%" );
    $str154$isas___s__ = makeString( "isas: ~s~%" );
    $str155$LF_types___s__ = makeString( "LF types: ~s~%" );
    $str156$field_mappings__s__ = makeString( "field-mappings ~s~%" );
    $str157$meaning_sentences___s__ = makeString( "meaning sentences: ~s~%" );
    $str158$enumerable___s__ = makeString( "enumerable? ~s~%" );
    $str159$field_names__s__ = makeString( "field-names ~s~%" );
    $str160$field_types__s__ = makeString( "field-types ~s~%" );
    $str161$primary_key__s__ = makeString( "primary-key ~s~%" );
    $str162$indexes__s__ = makeString( "indexes ~s~%" );
    $str163$field_encodings__s__ = makeString( "field-encodings ~s~%" );
    $str164$field_decodings__s__ = makeString( "field-decodings ~s~%" );
    $str165$foreign_key_maps__s__ = makeString( "foreign-key-maps ~s~%" );
    $str166$non_null_field_list__s__ = makeString( "non-null-field-list ~s~%" );
    $str167$unique_field_tuples__s__ = makeString( "unique-field-tuples ~s~%" );
    $kw168$LFI = makeKeyword( "LFI" );
    $kw169$LF = makeKeyword( "LF" );
    $kw170$PFI = makeKeyword( "PFI" );
    $kw171$PF = makeKeyword( "PF" );
    $kw172$KS = makeKeyword( "KS" );
    $kw173$LS = makeKeyword( "LS" );
    $kw174$PS = makeKeyword( "PS" );
    $sym175$_LAST_DB_INFO_ = makeSymbol( "*LAST-DB-INFO*" );
    $kw176$WARN = makeKeyword( "WARN" );
    $sym177$VALID_SKSI_ERROR_HANDLING_MODE_P = makeSymbol( "VALID-SKSI-ERROR-HANDLING-MODE-P" );
    $const178$cloneOfSKS = constant_handles.reader_make_constant_shell( makeString( "cloneOfSKS" ) );
    $kw179$BREAK = makeKeyword( "BREAK" );
    $const180$SKSIMt = constant_handles.reader_make_constant_shell( makeString( "SKSIMt" ) );
    $str181$_Cloned = makeString( "-Cloned" );
    $str182$_cloned = makeString( "_cloned" );
    $str183$ = makeString( "" );
    $str184$_ = makeString( "_" );
    $const185$ContentMtFn = constant_handles.reader_make_constant_shell( makeString( "ContentMtFn" ) );
    $const186$sksiSaturateRule = constant_handles.reader_make_constant_shell( makeString( "sksiSaturateRule" ) );
    $const187$implies = constant_handles.reader_make_constant_shell( makeString( "implies" ) );
    $const188$UniversalVocabularyMt = constant_handles.reader_make_constant_shell( makeString( "UniversalVocabularyMt" ) );
    $sym189$TABLE_INFO_LOGICAL_FIELD_INDEXICAL_P = makeSymbol( "TABLE-INFO-LOGICAL-FIELD-INDEXICAL-P" );
    $sym190$VARIABLIZE_TABLE_INFO_LFI = makeSymbol( "VARIABLIZE-TABLE-INFO-LFI" );
    $str191$_Fused = makeString( "-Fused" );
    $str192$1 = makeString( "1" );
    $str193$2 = makeString( "2" );
    $const194$BookkeepingMt = constant_handles.reader_make_constant_shell( makeString( "BookkeepingMt" ) );
    $str195$_s_misindexed_under__s_instead_of = makeString( "~s misindexed under ~s instead of ~s" );
    $sym196$PHYSICAL_FIELD_NAME = makeSymbol( "PHYSICAL-FIELD-NAME" );
    $sym197$PHYSICAL_FIELD_DATA_TYPE = makeSymbol( "PHYSICAL-FIELD-DATA-TYPE" );
    $sym198$MAPCAR_PHYSICAL_FIELD_NAME = makeSymbol( "MAPCAR-PHYSICAL-FIELD-NAME" );
    $list199 = ConsesLow.list( makeSymbol( "PF" ), makeSymbol( "LS" ), makeSymbol( "RECIPE" ) );
    $str200$Can_t_handle_fieldEncoding_for__s = makeString( "Can't handle fieldEncoding for ~s that cross-references ~s" );
    $sym201$TABLE_INFOIFIABLE_P = makeSymbol( "TABLE-INFOIFIABLE-P" );
    $sym202$TABLE_INFOIFY_OBJECT = makeSymbol( "TABLE-INFOIFY-OBJECT" );
    $str203$Can_t_table_infoify__s = makeString( "Can't table-infoify ~s" );
    $list204 = ConsesLow.list( makeSymbol( "LFI" ), makeSymbol( "PS" ), makeSymbol( "RECIPE" ) );
    $str205$Can_t_handle_fieldDecoding_for__s = makeString( "Can't handle fieldDecoding for ~s that cross-references ~s" );
    $list206 = ConsesLow.list( makeSymbol( "PFS" ), makeSymbol( "FOREIGN-PS" ), makeSymbol( "FOREIGN-PFS" ) );
    $str207$Got_physical_schema__s__expected_ = makeString( "Got physical schema ~s, expected ~s" );
    $str208$Fused_ = makeString( "Fused-" );
    $list209 = ConsesLow.list( makeSymbol( "KS" ), makeSymbol( "LS" ), makeSymbol( "PS" ) );
    $const210$sksRepresentationComplete = constant_handles.reader_make_constant_shell( makeString( "sksRepresentationComplete" ) );
    $const211$termDependsOn = constant_handles.reader_make_constant_shell( makeString( "termDependsOn" ) );
    $const212$Database_Physical = constant_handles.reader_make_constant_shell( makeString( "Database-Physical" ) );
    $const213$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $list214 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "StructuredKnowledgeSource-TopLevel" ) ) );
    $const215$quotedIsa = constant_handles.reader_make_constant_shell( makeString( "quotedIsa" ) );
    $const216$mappingMt = constant_handles.reader_make_constant_shell( makeString( "mappingMt" ) );
    $str217$Could_not_find_the_content_mt_hea = makeString( "Could not find the content mt head for ~s" );
    $const218$genlMt = constant_handles.reader_make_constant_shell( makeString( "genlMt" ) );
    $const219$userNameForSKS = constant_handles.reader_make_constant_shell( makeString( "userNameForSKS" ) );
    $const220$passwordForSKS = constant_handles.reader_make_constant_shell( makeString( "passwordForSKS" ) );
    $const221$serverOfSKS = constant_handles.reader_make_constant_shell( makeString( "serverOfSKS" ) );
    $const222$portNumberForSKS = constant_handles.reader_make_constant_shell( makeString( "portNumberForSKS" ) );
    $const223$sksProxyHost = constant_handles.reader_make_constant_shell( makeString( "sksProxyHost" ) );
    $const224$sksProxyPort = constant_handles.reader_make_constant_shell( makeString( "sksProxyPort" ) );
    $const225$subProtocolForSKS = constant_handles.reader_make_constant_shell( makeString( "subProtocolForSKS" ) );
    $const226$sqlProgramForSKS = constant_handles.reader_make_constant_shell( makeString( "sqlProgramForSKS" ) );
    $const227$ObjectDefiningSchema = constant_handles.reader_make_constant_shell( makeString( "ObjectDefiningSchema" ) );
    $const228$LogicalSchema = constant_handles.reader_make_constant_shell( makeString( "LogicalSchema" ) );
    $const229$logicalSchemaSourceMap = constant_handles.reader_make_constant_shell( makeString( "logicalSchemaSourceMap" ) );
    $const230$logicalSchemaFieldTypeList = constant_handles.reader_make_constant_shell( makeString( "logicalSchemaFieldTypeList" ) );
    $list231 = ConsesLow.list( makeSymbol( "TABLE-INFO-LF" ), makeSymbol( "MAP" ) );
    $const232$logicalFieldMapping = constant_handles.reader_make_constant_shell( makeString( "logicalFieldMapping" ) );
    $const233$schemaIsa = constant_handles.reader_make_constant_shell( makeString( "schemaIsa" ) );
    $const234$meaningSentenceOfSchema = constant_handles.reader_make_constant_shell( makeString( "meaningSentenceOfSchema" ) );
    $str235$Can_t_kbify__s = makeString( "Can't kbify ~s" );
    $list236 = ConsesLow.list( makeSymbol( "KS-TOKEN" ), makeSymbol( "TABLE-INFO-ID" ) );
    $list237 = ConsesLow.list( makeSymbol( "LS-TOKEN" ), makeSymbol( "TABLE-INFO-ID" ) );
    $list238 = ConsesLow.list( makeSymbol( "PS-TOKEN" ), makeSymbol( "TABLE-INFO-ID" ) );
    $sym239$KBIFIABLE_P = makeSymbol( "KBIFIABLE-P" );
    $sym240$KBIFY_OBJECT = makeSymbol( "KBIFY-OBJECT" );
    $list241 = ConsesLow.list( makeSymbol( "LFI" ), makeSymbol( "TABLE-INFO-ID" ), makeSymbol( "COL" ), makeSymbol( "I" ) );
    $const242$TheLogicalFieldValueFn = constant_handles.reader_make_constant_shell( makeString( "TheLogicalFieldValueFn" ) );
    $list243 = ConsesLow.list( makeSymbol( "LF" ), makeSymbol( "TABLE-INFO-ID" ), makeSymbol( "COL" ), makeSymbol( "I" ) );
    $const244$LogicalFieldFn = constant_handles.reader_make_constant_shell( makeString( "LogicalFieldFn" ) );
    $list245 = ConsesLow.list( makeSymbol( "PFI" ), makeSymbol( "TABLE-INFO-ID" ), makeSymbol( "FIELD-NAME" ) );
    $const246$ThePhysicalFieldValueFn = constant_handles.reader_make_constant_shell( makeString( "ThePhysicalFieldValueFn" ) );
    $list247 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "PhysicalSchema" ) ) );
    $const248$physicalSchemaSourceMap = constant_handles.reader_make_constant_shell( makeString( "physicalSchemaSourceMap" ) );
    $const249$logicalPhysicalSchemaMap = constant_handles.reader_make_constant_shell( makeString( "logicalPhysicalSchemaMap" ) );
    $const250$enumerableSchema = constant_handles.reader_make_constant_shell( makeString( "enumerableSchema" ) );
    $const251$schemaFieldNameList = constant_handles.reader_make_constant_shell( makeString( "schemaFieldNameList" ) );
    $const252$fieldDataType = constant_handles.reader_make_constant_shell( makeString( "fieldDataType" ) );
    $const253$primaryKey = constant_handles.reader_make_constant_shell( makeString( "primaryKey" ) );
    $const254$indexedFields = constant_handles.reader_make_constant_shell( makeString( "indexedFields" ) );
    $list255 = ConsesLow.list( makeSymbol( "FIELD-NAME" ), makeSymbol( "ENCODING" ) );
    $const256$fieldEncoding = constant_handles.reader_make_constant_shell( makeString( "fieldEncoding" ) );
    $list257 = ConsesLow.list( makeSymbol( "TABLE-INFO-LFI" ), makeSymbol( "DECODING" ) );
    $const258$fieldDecoding = constant_handles.reader_make_constant_shell( makeString( "fieldDecoding" ) );
    $const259$nonNullFieldList = constant_handles.reader_make_constant_shell( makeString( "nonNullFieldList" ) );
    $const260$uniqueFieldList = constant_handles.reader_make_constant_shell( makeString( "uniqueFieldList" ) );
    $str261$Error_getting_physical_field__s_i = makeString( "Error getting physical field ~s in ~s" );
    $str262$Error_getting_indexical_for_physi = makeString( "Error getting indexical for physical field ~s in ~s" );
    $str263$cdolist = makeString( "cdolist" );
    $str264$Cloned = makeString( "Cloned" );
    $str265$BLN = makeString( "BLN" );
    $kw266$X = makeKeyword( "X" );
    $const267$sksFusionSources = constant_handles.reader_make_constant_shell( makeString( "sksFusionSources" ) );
    $sym268$SK_SOURCE_MAPPING_MT = makeSymbol( "SK-SOURCE-MAPPING-MT" );
    $const269$MtUnionFn = constant_handles.reader_make_constant_shell( makeString( "MtUnionFn" ) );
    $str270$Name_conflict_in__s__two_tables_n = makeString( "Name conflict in ~s: two tables named ~s" );
    $str271$_fused = makeString( "_fused" );
    $sym272$ANONYMIZE_TABLE_INFO_OBJECT = makeSymbol( "ANONYMIZE-TABLE-INFO-OBJECT" );
    $str273$Can_t_yet_handle_duplicate_LFI_ty = makeString( "Can't yet handle duplicate LFI types, got ~s" );
    $list274 = ConsesLow.list( makeSymbol( "KEEP-LFI" ), makeSymbol( "KILL-LFI" ) );
    $const275$sksiSentence = constant_handles.reader_make_constant_shell( makeString( "sksiSentence" ) );
    $str276$Fused = makeString( "Fused" );
  }

  public static final class $db_info_native
      extends
        SubLStructNative
  {
    public SubLObject $constant_base_name;
    public SubLObject $db_name;
    public SubLObject $table_infos;
    public SubLObject $table_info_index;
    public SubLObject $server;
    public SubLObject $port;
    public SubLObject $proxy_host;
    public SubLObject $proxy_port;
    public SubLObject $user;
    public SubLObject $pass;
    public SubLObject $subprotocol;
    public SubLObject $sql_flavor;
    public SubLObject $quoted_isas;
    public SubLObject $input_mt;
    public SubLObject $content_genl_mts;
    private static final SubLStructDeclNative structDecl;

    public $db_info_native()
    {
      this.$constant_base_name = CommonSymbols.NIL;
      this.$db_name = CommonSymbols.NIL;
      this.$table_infos = CommonSymbols.NIL;
      this.$table_info_index = CommonSymbols.NIL;
      this.$server = CommonSymbols.NIL;
      this.$port = CommonSymbols.NIL;
      this.$proxy_host = CommonSymbols.NIL;
      this.$proxy_port = CommonSymbols.NIL;
      this.$user = CommonSymbols.NIL;
      this.$pass = CommonSymbols.NIL;
      this.$subprotocol = CommonSymbols.NIL;
      this.$sql_flavor = CommonSymbols.NIL;
      this.$quoted_isas = CommonSymbols.NIL;
      this.$input_mt = CommonSymbols.NIL;
      this.$content_genl_mts = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $db_info_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$constant_base_name;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$db_name;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$table_infos;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$table_info_index;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$server;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$port;
    }

    @Override
    public SubLObject getField8()
    {
      return this.$proxy_host;
    }

    @Override
    public SubLObject getField9()
    {
      return this.$proxy_port;
    }

    @Override
    public SubLObject getField10()
    {
      return this.$user;
    }

    @Override
    public SubLObject getField11()
    {
      return this.$pass;
    }

    @Override
    public SubLObject getField12()
    {
      return this.$subprotocol;
    }

    @Override
    public SubLObject getField13()
    {
      return this.$sql_flavor;
    }

    @Override
    public SubLObject getField14()
    {
      return this.$quoted_isas;
    }

    @Override
    public SubLObject getField15()
    {
      return this.$input_mt;
    }

    @Override
    public SubLObject getField16()
    {
      return this.$content_genl_mts;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$constant_base_name = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$db_name = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$table_infos = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$table_info_index = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$server = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$port = value;
    }

    @Override
    public SubLObject setField8(final SubLObject value)
    {
      return this.$proxy_host = value;
    }

    @Override
    public SubLObject setField9(final SubLObject value)
    {
      return this.$proxy_port = value;
    }

    @Override
    public SubLObject setField10(final SubLObject value)
    {
      return this.$user = value;
    }

    @Override
    public SubLObject setField11(final SubLObject value)
    {
      return this.$pass = value;
    }

    @Override
    public SubLObject setField12(final SubLObject value)
    {
      return this.$subprotocol = value;
    }

    @Override
    public SubLObject setField13(final SubLObject value)
    {
      return this.$sql_flavor = value;
    }

    @Override
    public SubLObject setField14(final SubLObject value)
    {
      return this.$quoted_isas = value;
    }

    @Override
    public SubLObject setField15(final SubLObject value)
    {
      return this.$input_mt = value;
    }

    @Override
    public SubLObject setField16(final SubLObject value)
    {
      return this.$content_genl_mts = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $db_info_native.class, $sym1$DB_INFO, $sym2$DB_INFO_P, $list3, $list4, new String[] { "$constant_base_name", "$db_name", "$table_infos", "$table_info_index", "$server",
        "$port", "$proxy_host", "$proxy_port", "$user", "$pass", "$subprotocol", "$sql_flavor", "$quoted_isas", "$input_mt", "$content_genl_mts"
      }, $list5, $list6, $sym7$PRINT_DB_INFO );
    }
  }

  public static final class $db_info_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $db_info_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "DB-INFO-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return db_info_p( arg1 );
    }
  }

  public static final class $table_info_native
      extends
        SubLStructNative
  {
    public SubLObject $id;
    public SubLObject $constant_base_name;
    public SubLObject $table_name;
    public SubLObject $isas;
    public SubLObject $lf_types;
    public SubLObject $field_mappings;
    public SubLObject $meaning_sentences;
    public SubLObject $enumerableP;
    public SubLObject $field_names;
    public SubLObject $field_types;
    public SubLObject $primary_key;
    public SubLObject $indexes;
    public SubLObject $field_encodings;
    public SubLObject $field_decodings;
    public SubLObject $foreign_key_maps;
    public SubLObject $non_null_field_list;
    public SubLObject $unique_field_tuples;
    private static final SubLStructDeclNative structDecl;

    public $table_info_native()
    {
      this.$id = CommonSymbols.NIL;
      this.$constant_base_name = CommonSymbols.NIL;
      this.$table_name = CommonSymbols.NIL;
      this.$isas = CommonSymbols.NIL;
      this.$lf_types = CommonSymbols.NIL;
      this.$field_mappings = CommonSymbols.NIL;
      this.$meaning_sentences = CommonSymbols.NIL;
      this.$enumerableP = CommonSymbols.NIL;
      this.$field_names = CommonSymbols.NIL;
      this.$field_types = CommonSymbols.NIL;
      this.$primary_key = CommonSymbols.NIL;
      this.$indexes = CommonSymbols.NIL;
      this.$field_encodings = CommonSymbols.NIL;
      this.$field_decodings = CommonSymbols.NIL;
      this.$foreign_key_maps = CommonSymbols.NIL;
      this.$non_null_field_list = CommonSymbols.NIL;
      this.$unique_field_tuples = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $table_info_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$id;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$constant_base_name;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$table_name;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$isas;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$lf_types;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$field_mappings;
    }

    @Override
    public SubLObject getField8()
    {
      return this.$meaning_sentences;
    }

    @Override
    public SubLObject getField9()
    {
      return this.$enumerableP;
    }

    @Override
    public SubLObject getField10()
    {
      return this.$field_names;
    }

    @Override
    public SubLObject getField11()
    {
      return this.$field_types;
    }

    @Override
    public SubLObject getField12()
    {
      return this.$primary_key;
    }

    @Override
    public SubLObject getField13()
    {
      return this.$indexes;
    }

    @Override
    public SubLObject getField14()
    {
      return this.$field_encodings;
    }

    @Override
    public SubLObject getField15()
    {
      return this.$field_decodings;
    }

    @Override
    public SubLObject getField16()
    {
      return this.$foreign_key_maps;
    }

    @Override
    public SubLObject getField17()
    {
      return this.$non_null_field_list;
    }

    @Override
    public SubLObject getField18()
    {
      return this.$unique_field_tuples;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$id = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$constant_base_name = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$table_name = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$isas = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$lf_types = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$field_mappings = value;
    }

    @Override
    public SubLObject setField8(final SubLObject value)
    {
      return this.$meaning_sentences = value;
    }

    @Override
    public SubLObject setField9(final SubLObject value)
    {
      return this.$enumerableP = value;
    }

    @Override
    public SubLObject setField10(final SubLObject value)
    {
      return this.$field_names = value;
    }

    @Override
    public SubLObject setField11(final SubLObject value)
    {
      return this.$field_types = value;
    }

    @Override
    public SubLObject setField12(final SubLObject value)
    {
      return this.$primary_key = value;
    }

    @Override
    public SubLObject setField13(final SubLObject value)
    {
      return this.$indexes = value;
    }

    @Override
    public SubLObject setField14(final SubLObject value)
    {
      return this.$field_encodings = value;
    }

    @Override
    public SubLObject setField15(final SubLObject value)
    {
      return this.$field_decodings = value;
    }

    @Override
    public SubLObject setField16(final SubLObject value)
    {
      return this.$foreign_key_maps = value;
    }

    @Override
    public SubLObject setField17(final SubLObject value)
    {
      return this.$non_null_field_list = value;
    }

    @Override
    public SubLObject setField18(final SubLObject value)
    {
      return this.$unique_field_tuples = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $table_info_native.class, $sym83$TABLE_INFO, $sym68$TABLE_INFO_P, $list84, $list85, new String[] { "$id", "$constant_base_name", "$table_name", "$isas", "$lf_types",
        "$field_mappings", "$meaning_sentences", "$enumerableP", "$field_names", "$field_types", "$primary_key", "$indexes", "$field_encodings", "$field_decodings", "$foreign_key_maps", "$non_null_field_list",
        "$unique_field_tuples"
      }, $list86, $list87, $sym88$PRINT_TABLE_INFO );
    }
  }

  public static final class $table_info_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $table_info_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "TABLE-INFO-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return table_info_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 1454 ms synthetic
 */
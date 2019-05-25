package com.cyc.cycjava.cycl.owl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.access_macros;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.rdf.rdf_blank_node;
import com.cyc.cycjava.cycl.wff;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.rdf.rdf_triple;
import com.cyc.cycjava.cycl.rdf.rdf_literal;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.integer_sequence_generator;
import com.cyc.cycjava.cycl.ke;
import com.cyc.cycjava.cycl.api_control_vars;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.set;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ReadWriteLocks;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.cycjava.cycl.operation_communication;
import com.cyc.cycjava.cycl.isa;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.cycjava.cycl.cb_utilities;
import com.cyc.cycjava.cycl.html_macros;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.czer_main;
import com.cyc.cycjava.cycl.forts;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.rdf.rdf_parser;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.cycjava.cycl.web_utilities;
import com.cyc.cycjava.cycl.rdf.rdf_uri;
import com.cyc.cycjava.cycl.rdf.rdf_graph;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.file_utilities;
import com.cyc.cycjava.cycl.rdf.rdf_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class owl_importer2
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.owl.owl_importer2";
  public static final String myFingerPrint = "f58ca04a65b568edb67a43422fee14511f719fd188baa00e0edd546c92341fc3";
  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 1198L)
  private static SubLSymbol $owl_importer2_valid_options$;
  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 15079L)
  private static SubLSymbol $owl_importer2_version_number$;
  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 19082L)
  public static SubLSymbol $dtp_owl_importer2$;
  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 22438L)
  private static SubLSymbol $owl_importer2_id_isg$;
  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 22623L)
  private static SubLSymbol $owl_importer2_id_map$;
  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 28498L)
  private static SubLSymbol $owl_importer2_subject_stack$;
  private static final SubLList $list0;
  private static final SubLString $str1$OWL_Importer_usages___;
  private static final SubLString $str2$_owl_import_uri__uri__optional_im;
  private static final SubLString $str3$_owl_import_file__filename__optio;
  private static final SubLString $str4$_owl_import_uri_from_file__uri_fi;
  private static final SubLSymbol $sym5$OWL_IMPORT_URI;
  private static final SubLString $str6$owl_import_uri;
  private static final SubLList $list7;
  private static final SubLString $str8$Download_of_URI__S_to_temp_file_f;
  private static final SubLSymbol $kw9$SYNONYMOUS_CONCEPT_PREFIX;
  private static final SubLString $str10$;
  private static final SubLSymbol $kw11$ONTOLOGY_URI;
  private static final SubLSymbol $kw12$CYCLIST;
  private static final SubLSymbol $kw13$PROGRESS_STREAM;
  private static final SubLSymbol $sym14$OWL_IMPORT_FILE;
  private static final SubLString $str15$owl_import_file;
  private static final SubLList $list16;
  private static final SubLSymbol $kw17$VERBOSE_;
  private static final SubLSymbol $sym18$OWL_IMPORT_URI_FROM_FILE;
  private static final SubLString $str19$owl_import_uri_from_file;
  private static final SubLList $list20;
  private static final SubLSymbol $kw21$TEST_MODE;
  private static final SubLSymbol $kw22$GRAPH_ONLY;
  private static final SubLSymbol $sym23$OWL_IMPORT_XML_GRAPH_FROM_FILE;
  private static final SubLString $str24$Importing_XML___;
  private static final SubLSymbol $kw25$URI_PREFIX;
  private static final SubLString $str26$__Using_local_URI_part_for___syno;
  private static final SubLString $str27$__Using_URI_prefix___A__for___syn;
  private static final SubLString $str28$__Using_full_URIs_for___synonymou;
  private static final SubLString $str29$__Note_that_synonymous_concept_pr;
  private static final SubLSymbol $kw30$CONSTANT_PREFIX;
  private static final SubLSymbol $kw31$CONSTANT_SUFFIX;
  private static final SubLString $str32$_;
  private static final SubLSymbol $sym33$VALID_CONSTANT_NAME_CHAR_P;
  private static final SubLString $str34$Changing_constant_prefix_from__S_;
  private static final SubLString $str35$__Using_prefix___A__for_new_const;
  private static final SubLString $str36$__Using_suffix___A__for_new_const;
  private static final SubLString $str37$__Using___ResourceWithURIFn_NARTs;
  private static final SubLSymbol $kw38$ONTOLOGY_TERM;
  private static final SubLSymbol $kw39$ONTOLOGY_MT;
  private static final SubLObject $const40$retainTerm;
  private static final SubLObject $const41$OWLOntologyFn;
  private static final SubLObject $const42$BaseKB;
  private static final SubLObject $const43$ContextOfPCWFn;
  private static final SubLString $str44$__Using_ontology_term_;
  private static final SubLString $str45$__Using_ontology_mt_;
  private static final SubLString $str46$__Using_ontology_term__S__;
  private static final SubLString $str47$__Using_ontology_mt__S__;
  private static final SubLList $list48;
  private static final SubLString $str49$xml_base;
  private static final SubLObject $const50$baseNamespaceForSKS;
  private static final SubLObject $const51$URIFn;
  private static final SubLObject $const52$nameSpacePrefixForSKS;
  private static final SubLSymbol $sym53$FUNCTION_SPEC_P;
  private static final SubLSymbol $kw54$GRAPH_TRANSLATION_FUNCTIONS;
  private static final SubLSymbol $kw55$NODE_COUNT;
  private static final SubLSymbol $kw56$TRIPLE_COUNT;
  private static final SubLString $str57$_A_triples__;
  private static final SubLString $str58$_A_nodes__;
  private static final SubLSymbol $sym59$CAR;
  private static final SubLSymbol $sym60$SUPERSTRING_;
  private static final SubLSymbol $sym61$CDR;
  private static final SubLSymbol $sym62$_;
  private static final SubLSymbol $sym63$LENGTH;
  private static final SubLSymbol $sym64$STRING_;
  private static final SubLSymbol $kw65$URI;
  private static final SubLString $str66$_A__URI__S_is_not_valid__;
  private static final SubLSymbol $kw67$FILENAME;
  private static final SubLString $str68$_A__FILENAME__S_does_not_exist__;
  private static final SubLSymbol $kw69$IMPORTER_OPTIONS;
  private static final SubLString $str70$_A__IMPORTER_OPTIONS__S_is_not_a_;
  private static final SubLObject $const71$Cyclist;
  private static final SubLString $str72$_A__IMPORTER_OPTIONS__cyclist__A_;
  private static final SubLObject $const73$Guest;
  private static final SubLString $str74$_A__Please_log_in_with__set_the_c;
  private static final SubLString $str75$_A__IMPORTER_OPTIONS_has_invalid_;
  private static final SubLString $str76$Errors_found__aborting_import___;
  private static final SubLSymbol $sym77$_OWL_IMPORTER2_VERSION_NUMBER_;
  private static final SubLString $str78$_revision__1_2__;
  private static final SubLSymbol $sym79$DIGIT_CHAR_P;
  private static final SubLString $str80$2;
  private static final SubLObject $const81$SoftwareVersion;
  private static final SubLObject $const82$OWLImporter_Cyc;
  private static final SubLObject $const83$UserOfProgramFn;
  private static final SubLSymbol $kw84$NODES_DONE;
  private static final SubLSymbol $kw85$TRIPLES_DONE;
  private static final SubLSymbol $kw86$TERMS_CREATED;
  private static final SubLSymbol $kw87$ASSERTIONS_CREATED;
  private static final SubLString $str88$type;
  private static final SubLString $str89$Ontology;
  private static final SubLSymbol $sym90$OWL_IMPORTER2;
  private static final SubLSymbol $sym91$OWL_IMPORTER2_P;
  private static final SubLList $list92;
  private static final SubLList $list93;
  private static final SubLList $list94;
  private static final SubLList $list95;
  private static final SubLSymbol $sym96$PRINT_OWL_IMPORTER2;
  private static final SubLSymbol $sym97$OWL_IMPORTER2_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list98;
  private static final SubLSymbol $sym99$OWL_IMP2_ID;
  private static final SubLSymbol $sym100$_CSETF_OWL_IMP2_ID;
  private static final SubLSymbol $sym101$OWL_IMP2_URI;
  private static final SubLSymbol $sym102$_CSETF_OWL_IMP2_URI;
  private static final SubLSymbol $sym103$OWL_IMP2_FILE;
  private static final SubLSymbol $sym104$_CSETF_OWL_IMP2_FILE;
  private static final SubLSymbol $sym105$OWL_IMP2_GRAPH;
  private static final SubLSymbol $sym106$_CSETF_OWL_IMP2_GRAPH;
  private static final SubLSymbol $sym107$OWL_IMP2_CYCLIST;
  private static final SubLSymbol $sym108$_CSETF_OWL_IMP2_CYCLIST;
  private static final SubLSymbol $sym109$OWL_IMP2_IMPORT;
  private static final SubLSymbol $sym110$_CSETF_OWL_IMP2_IMPORT;
  private static final SubLSymbol $sym111$OWL_IMP2_ONTOLOGIES;
  private static final SubLSymbol $sym112$_CSETF_OWL_IMP2_ONTOLOGIES;
  private static final SubLSymbol $sym113$OWL_IMP2_TERMS;
  private static final SubLSymbol $sym114$_CSETF_OWL_IMP2_TERMS;
  private static final SubLSymbol $sym115$OWL_IMP2_SENTENCES;
  private static final SubLSymbol $sym116$_CSETF_OWL_IMP2_SENTENCES;
  private static final SubLSymbol $sym117$OWL_IMP2_STATS;
  private static final SubLSymbol $sym118$_CSETF_OWL_IMP2_STATS;
  private static final SubLSymbol $sym119$OWL_IMP2_OPTIONS;
  private static final SubLSymbol $sym120$_CSETF_OWL_IMP2_OPTIONS;
  private static final SubLSymbol $sym121$OWL_IMP2_THREAD;
  private static final SubLSymbol $sym122$_CSETF_OWL_IMP2_THREAD;
  private static final SubLSymbol $kw123$ID;
  private static final SubLSymbol $kw124$FILE;
  private static final SubLSymbol $kw125$GRAPH;
  private static final SubLSymbol $kw126$IMPORT;
  private static final SubLSymbol $kw127$ONTOLOGIES;
  private static final SubLSymbol $kw128$TERMS;
  private static final SubLSymbol $kw129$SENTENCES;
  private static final SubLSymbol $kw130$STATS;
  private static final SubLSymbol $kw131$OPTIONS;
  private static final SubLSymbol $kw132$THREAD;
  private static final SubLString $str133$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw134$BEGIN;
  private static final SubLSymbol $sym135$MAKE_OWL_IMPORTER2;
  private static final SubLSymbol $kw136$SLOT;
  private static final SubLSymbol $kw137$END;
  private static final SubLSymbol $sym138$VISIT_DEFSTRUCT_OBJECT_OWL_IMPORTER2_METHOD;
  private static final SubLString $str139$_OWL_IMPORTER__D_for__A_;
  private static final SubLSymbol $sym140$URL_P;
  private static final SubLSymbol $sym141$FILE_EXISTS_;
  private static final SubLSymbol $sym142$FORT_P;
  private static final SubLSymbol $sym143$PROPERTY_LIST_P;
  private static final SubLSymbol $sym144$RDF_GRAPH_P;
  private static final SubLString $str145$No_import_owl_Ontology_URI_found_;
  private static final SubLObject $const146$SoftwareVersionFn;
  private static final SubLSymbol $sym147$_OWL_IMPORTER2_ID_ISG_;
  private static final SubLSymbol $sym148$_OWL_IMPORTER2_ID_MAP_;
  private static final SubLSymbol $sym149$NON_DOTTED_LIST_P;
  private static final SubLSymbol $sym150$RDF_URI_P;
  private static final SubLSymbol $sym151$PROCESSP;
  private static final SubLSymbol $sym152$SXHASH_OWL_IMPORTER2_METHOD;
  private static final SubLString $str153$Importing_;
  private static final SubLString $str154$_triples___;
  private static final SubLString $str155$node_count___A__;
  private static final SubLString $str156$real_node_count___A__;
  private static final SubLString $str157$triple_count___A__;
  private static final SubLString $str158$real_triple_count___A__;
  private static final SubLInteger $int159$40;
  private static final SubLString $str160$Assert_nesting_depth___D;
  private static final SubLObject $const161$isa;
  private static final SubLList $list162;
  private static final SubLString $str163$Failed_to_assert__S_in__S;
  private static final SubLString $str164$__;
  private static final SubLString $str165$_S_is_not_a_list_node_;
  private static final SubLString $str166$nil;
  private static final SubLObject $const167$TheEmptyList;
  private static final SubLObject $const168$TheList;
  private static final SubLString $str169$first;
  private static final SubLSymbol $sym170$RDF_TRIPLE_PREDICATE;
  private static final SubLString $str171$rest;
  private static final SubLString $str172$Can_t_find_or_create_term_for__S;
  private static final SubLSymbol $kw173$USE_GENLS_FOR_RDFS_SUBCLASS_;
  private static final SubLString $str174$rdfs_subClassOf;
  private static final SubLObject $const175$genls;
  private static final SubLString $str176$Could_not_find_Cyc_term_for_URI__;
  private static final SubLSymbol $kw177$USE_NAMESPACE_PREFIXES_AS_CONSTANT_PREFIXES;
  private static final SubLObject $const178$quotedIsa;
  private static final SubLObject $const179$TermFromOntologyFn;
  private static final SubLObject $const180$BookkeepingMt;
  private static final SubLObject $const181$synonymousExternalConcept;
  private static final SubLObject $const182$rdfURI;
  private static final SubLSymbol $kw183$USE_RDFS_LABEL_FOR_CONSTANT_NAME_;
  private static final SubLString $str184$rdfs_label;
  private static final SubLString $str185$rdf_type;
  private static final SubLString $str186$owl_Class;
  private static final SubLSymbol $sym187$CYC_URI_P;
  private static final SubLString $str188$intersectionOf;
  private static final SubLObject $const189$CollectionIntersectionFn;
  private static final SubLObject $const190$TheSet;
  private static final SubLString $str191$unionOf;
  private static final SubLObject $const192$CollectionUnionFn;
  private static final SubLString $str193$complementOf;
  private static final SubLObject $const194$CollectionDifferenceFn;
  private static final SubLObject $const195$Thing;
  private static final SubLString $str196$onProperty;
  private static final SubLString $str197$allValuesFrom;
  private static final SubLString $str198$hasValue;
  private static final SubLString $str199$someValuesFrom;
  private static final SubLString $str200$valuesFrom;
  private static final SubLString $str201$subClassOf;
  private static final SubLString $str202$cardinality;
  private static final SubLString $str203$minCardinality;
  private static final SubLString $str204$maxCardinality;
  private static final SubLSymbol $kw205$ONLY_ASSERT_RESTRICTIONS_AS_RMP_GAFS_;
  private static final SubLObject $const206$relationAllOnly;
  private static final SubLObject $const207$CollectionSubsetFn;
  private static final SubLObject $const208$TheSetOf;
  private static final SubLSymbol $sym209$_X;
  private static final SubLObject $const210$relationInstanceOnly;
  private static final SubLObject $const211$relationAllExists;
  private static final SubLObject $const212$relationInstanceExists;
  private static final SubLObject $const213$relationAllInstance;
  private static final SubLObject $const214$relationAllExistsMax;
  private static final SubLObject $const215$relationInstanceExistsMax;
  private static final SubLObject $const216$relationAllExistsMin;
  private static final SubLObject $const217$relationInstanceExistsMin;
  private static final SubLObject $const218$relationAllExistsCount;
  private static final SubLObject $const219$relationInstanceExistsCount;
  private static final SubLString $str220$restriction_not_handled_yet___A__;
  private static final SubLString $str221$oneOf;
  private static final SubLObject $const222$TheCollection;
  private static final SubLString $str223$AnonymousOWLTerm;
  private static final SubLObject $const224$UniversalVocabularyMt;
  private static final SubLObject $const225$IndeterminateTerm;
  private static final SubLSymbol $sym226$RDF_TRIPLE_SUBJECT;
  private static final SubLString $str227$___A_was_not_the_object_of_any_rd;
  private static final SubLString $str228$Eliminating_blank_nodes___;
  private static final SubLString $str229$cdolist;
  private static final SubLString $str230$rdfs_domain;
  private static final SubLString $str231$owl_Thing;
  private static final SubLString $str232$rdfs_range;
  private static final SubLSymbol $sym233$RDF_TRIPLE_OBJECT;
  private static final SubLString $str234$rdf_Property;

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 1697L)
  public static SubLObject show_owl_import_usages()
  {
    format_nil.force_format( T, $str1$OWL_Importer_usages___, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    format_nil.force_format( T, $str2$_owl_import_uri__uri__optional_im, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    format_nil.force_format( T, $str3$_owl_import_file__filename__optio, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    format_nil.force_format( T, $str4$_owl_import_uri_from_file__uri_fi, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 2151L)
  public static SubLObject owl_import_uri(final SubLObject uri, SubLObject importer_options)
  {
    if( importer_options == UNPROVIDED )
    {
      importer_options = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    importer_options = conses_high.copy_list( importer_options );
    validate_owl_import_parameters( $str6$owl_import_uri, list_utilities.make_plist( $list7, ConsesLow.list( uri, importer_options ) ) );
    final SubLObject filename = rdf_utilities.download_rdf_url( uri, UNPROVIDED );
    if( NIL == file_utilities.file_existsP( filename ) )
    {
      Errors.error( $str8$Download_of_URI__S_to_temp_file_f, uri );
    }
    final SubLObject cyclist = owl_importer_dwim_a_cyclist( importer_options );
    final SubLObject importer = get_owl_importer2_for_file( filename, cyclist, uri );
    owl_importer2_set_options( importer, importer_options );
    owl_importer2_set_option_if_not_set( importer, $kw9$SYNONYMOUS_CONCEPT_PREFIX, $str10$ );
    owl_importer2_set_option_if_not_set( importer, $kw11$ONTOLOGY_URI, uri );
    owl_importer2_set_option_if_not_set( importer, $kw12$CYCLIST, cyclist );
    owl_importer2_set_option_if_not_set( importer, $kw13$PROGRESS_STREAM, StreamsLow.$standard_output$.getDynamicValue( thread ) );
    return owl_import_with_importer( importer );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 3157L)
  public static SubLObject owl_import_file(final SubLObject filename, SubLObject importer_options)
  {
    if( importer_options == UNPROVIDED )
    {
      importer_options = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    importer_options = conses_high.copy_list( importer_options );
    validate_owl_import_parameters( $str15$owl_import_file, list_utilities.make_plist( $list16, ConsesLow.list( filename, importer_options ) ) );
    SubLObject v_graph = NIL;
    final SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding( thread );
    try
    {
      utilities_macros.$silent_progressP$.bind( makeBoolean( NIL == conses_high.getf( importer_options, $kw17$VERBOSE_, UNPROVIDED ) ), thread );
      v_graph = owl_import_xml_graph_from_file( filename );
    }
    finally
    {
      utilities_macros.$silent_progressP$.rebind( _prev_bind_0, thread );
    }
    final SubLObject cyclist = owl_importer_dwim_a_cyclist( importer_options );
    final SubLObject importer = new_owl_importer2_for_graph( v_graph, cyclist, importer_options );
    final SubLObject graph_topic = rdf_graph.rdf_graph_topic( v_graph );
    final SubLObject uri = ( NIL != rdf_uri.rdf_uri_p( graph_topic ) ) ? dwim_rdf_uri_string( graph_topic ) : NIL;
    owl_importer2_set_options( importer, importer_options );
    owl_importer2_set_option_if_not_set( importer, $kw9$SYNONYMOUS_CONCEPT_PREFIX, $str10$ );
    if( NIL != web_utilities.url_p( uri ) )
    {
      owl_importer2_set_option_if_not_set( importer, $kw11$ONTOLOGY_URI, uri );
    }
    owl_importer2_set_option_if_not_set( importer, $kw12$CYCLIST, cyclist );
    owl_importer2_set_option_if_not_set( importer, $kw13$PROGRESS_STREAM, StreamsLow.$standard_output$.getDynamicValue( thread ) );
    return owl_import_with_importer( importer );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 4440L)
  public static SubLObject owl_import_uri_from_file(final SubLObject uri, final SubLObject filename, SubLObject importer_options)
  {
    if( importer_options == UNPROVIDED )
    {
      importer_options = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    importer_options = conses_high.copy_list( importer_options );
    validate_owl_import_parameters( $str19$owl_import_uri_from_file, list_utilities.make_plist( $list20, ConsesLow.list( uri, filename, importer_options ) ) );
    final SubLObject cyclist = owl_importer_dwim_a_cyclist( importer_options );
    final SubLObject importer = get_owl_importer2_for_file( filename, cyclist, uri );
    owl_importer2_set_options( importer, importer_options );
    owl_importer2_set_option_if_not_set( importer, $kw9$SYNONYMOUS_CONCEPT_PREFIX, $str10$ );
    owl_importer2_set_option_if_not_set( importer, $kw11$ONTOLOGY_URI, uri );
    owl_importer2_set_option_if_not_set( importer, $kw12$CYCLIST, cyclist );
    owl_importer2_set_option_if_not_set( importer, $kw13$PROGRESS_STREAM, StreamsLow.$standard_output$.getDynamicValue( thread ) );
    return owl_import_with_importer( importer );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 5397L)
  public static SubLObject owl_import_file_to_graph_only(final SubLObject filename, SubLObject importer_options)
  {
    if( importer_options == UNPROVIDED )
    {
      importer_options = NIL;
    }
    importer_options = conses_high.putf( importer_options, $kw21$TEST_MODE, $kw22$GRAPH_ONLY );
    return owl_import_file( filename, importer_options );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 5590L)
  public static SubLObject owl_import_xml_graph_from_file(final SubLObject filename)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_graph = NIL;
    final SubLObject str = $str24$Importing_XML___;
    final SubLObject _prev_bind_0 = utilities_macros.$progress_start_time$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding( thread );
    final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding( thread );
    final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding( thread );
    final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding( thread );
    final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding( thread );
    try
    {
      utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
      utilities_macros.$progress_last_pacification_time$.bind( utilities_macros.$progress_start_time$.getDynamicValue( thread ), thread );
      utilities_macros.$progress_elapsed_seconds_for_notification$.bind( utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue( thread ), thread );
      utilities_macros.$progress_notification_count$.bind( ZERO_INTEGER, thread );
      utilities_macros.$progress_pacifications_since_last_nl$.bind( ZERO_INTEGER, thread );
      utilities_macros.$progress_count$.bind( ZERO_INTEGER, thread );
      utilities_macros.$is_noting_progressP$.bind( T, thread );
      utilities_macros.$silent_progressP$.bind( ( NIL != str ) ? utilities_macros.$silent_progressP$.getDynamicValue( thread ) : T, thread );
      utilities_macros.noting_progress_preamble( str );
      v_graph = rdf_parser.parse_rdfXxml_file_with_detail( filename );
      utilities_macros.noting_progress_postamble();
    }
    finally
    {
      utilities_macros.$silent_progressP$.rebind( _prev_bind_8, thread );
      utilities_macros.$is_noting_progressP$.rebind( _prev_bind_7, thread );
      utilities_macros.$progress_count$.rebind( _prev_bind_6, thread );
      utilities_macros.$progress_pacifications_since_last_nl$.rebind( _prev_bind_5, thread );
      utilities_macros.$progress_notification_count$.rebind( _prev_bind_4, thread );
      utilities_macros.$progress_elapsed_seconds_for_notification$.rebind( _prev_bind_3, thread );
      utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_2, thread );
      utilities_macros.$progress_start_time$.rebind( _prev_bind_0, thread );
    }
    return v_graph;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 5909L)
  public static SubLObject owl_import_with_importer(final SubLObject importer)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject verboseP = owl_importer2_get_option( importer, $kw17$VERBOSE_, UNPROVIDED );
    if( NIL != verboseP )
    {
      owl_utilities.owl_debug_show_options( owl_importer2_options( importer ) );
    }
    if( $kw22$GRAPH_ONLY == owl_importer2_get_option( importer, $kw21$TEST_MODE, UNPROVIDED ) )
    {
      return importer;
    }
    final SubLObject ontology_uri = owl_importer2_get_option( importer, $kw11$ONTOLOGY_URI, UNPROVIDED );
    SubLObject uri_prefix = owl_importer2_get_option( importer, $kw25$URI_PREFIX, UNPROVIDED );
    final SubLObject synonymous_concept_prefix = owl_importer2_get_option( importer, $kw9$SYNONYMOUS_CONCEPT_PREFIX, UNPROVIDED );
    if( NIL == uri_prefix )
    {
      uri_prefix = determine_uri_prefix_from_prefix_map( ontology_uri, rdf_graph.rdf_graph_prefix_map( owl_importer2_graph( importer ) ) );
      if( NIL != string_utilities.non_empty_string_p( uri_prefix ) )
      {
        owl_importer2_set_option( importer, $kw25$URI_PREFIX, uri_prefix );
      }
      else
      {
        uri_prefix = $str10$;
        owl_importer2_set_option( importer, $kw25$URI_PREFIX, $str10$ );
      }
    }
    if( NIL != string_utilities.empty_string_p( synonymous_concept_prefix ) )
    {
      if( NIL != verboseP )
      {
        format_nil.force_format( owl_importer2_get_option( importer, $kw13$PROGRESS_STREAM, UNPROVIDED ), $str26$__Using_local_URI_part_for___syno, synonymous_concept_prefix, ontology_uri, UNPROVIDED, UNPROVIDED,
            UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
    }
    else if( NIL != string_utilities.non_empty_string_p( synonymous_concept_prefix ) )
    {
      if( NIL != verboseP )
      {
        format_nil.force_format( owl_importer2_get_option( importer, $kw13$PROGRESS_STREAM, UNPROVIDED ), $str27$__Using_URI_prefix___A__for___syn, synonymous_concept_prefix, ontology_uri, UNPROVIDED, UNPROVIDED,
            UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
    }
    else if( NIL != verboseP )
    {
      format_nil.force_format( owl_importer2_get_option( importer, $kw13$PROGRESS_STREAM, UNPROVIDED ), $str28$__Using_full_URIs_for___synonymou, synonymous_concept_prefix, ontology_uri, UNPROVIDED, UNPROVIDED,
          UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    if( NIL != string_utilities.non_empty_string_p( synonymous_concept_prefix ) && NIL == Strings.stringE( uri_prefix, synonymous_concept_prefix, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) && NIL != verboseP )
    {
      format_nil.force_format( owl_importer2_get_option( importer, $kw13$PROGRESS_STREAM, UNPROVIDED ), $str29$__Note_that_synonymous_concept_pr, synonymous_concept_prefix, uri_prefix, UNPROVIDED, UNPROVIDED, UNPROVIDED,
          UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    SubLObject constant_prefix = owl_importer2_get_option( importer, $kw30$CONSTANT_PREFIX, UNPROVIDED );
    final SubLObject constant_suffix = owl_importer2_get_option( importer, $kw31$CONSTANT_SUFFIX, UNPROVIDED );
    if( ( NIL == string_utilities.non_empty_string_p( constant_prefix ) || ( NIL != constant_suffix && NIL == string_utilities.non_empty_string_p( constant_suffix ) ) ) && NIL != string_utilities.non_empty_string_p(
        uri_prefix ) )
    {
      constant_prefix = Sequences.cconcatenate( uri_prefix, $str32$_ );
    }
    if( NIL != string_utilities.non_empty_string_p( constant_prefix ) )
    {
      final SubLObject valid_prefix = list_utilities.remove_if_not( $sym33$VALID_CONSTANT_NAME_CHAR_P, constant_prefix, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      if( NIL == Strings.stringE( constant_prefix, valid_prefix, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        if( NIL != verboseP )
        {
          format_nil.force_format( owl_importer2_get_option( importer, $kw13$PROGRESS_STREAM, UNPROVIDED ), $str34$Changing_constant_prefix_from__S_, constant_prefix, valid_prefix, UNPROVIDED, UNPROVIDED, UNPROVIDED,
              UNPROVIDED, UNPROVIDED, UNPROVIDED );
        }
        constant_prefix = valid_prefix;
      }
    }
    owl_importer2_set_option( importer, $kw30$CONSTANT_PREFIX, constant_prefix );
    owl_importer2_set_option( importer, $kw31$CONSTANT_SUFFIX, constant_suffix );
    if( NIL != verboseP )
    {
      if( NIL != string_utilities.non_empty_string_p( constant_prefix ) )
      {
        if( NIL == string_utilities.ends_with( constant_prefix, $str32$_, UNPROVIDED ) )
        {
          constant_prefix = Sequences.cconcatenate( constant_prefix, $str32$_ );
        }
        format_nil.force_format( owl_importer2_get_option( importer, $kw13$PROGRESS_STREAM, UNPROVIDED ), $str35$__Using_prefix___A__for_new_const, constant_prefix, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED,
            UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      if( NIL != string_utilities.non_empty_string_p( constant_suffix ) )
      {
        format_nil.force_format( owl_importer2_get_option( importer, $kw13$PROGRESS_STREAM, UNPROVIDED ), $str36$__Using_suffix___A__for_new_const, constant_suffix, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED,
            UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      if( NIL != string_utilities.empty_string_p( constant_prefix ) && NIL != string_utilities.empty_string_p( constant_suffix ) )
      {
        format_nil.force_format( owl_importer2_get_option( importer, $kw13$PROGRESS_STREAM, UNPROVIDED ), $str37$__Using___ResourceWithURIFn_NARTs, uri_prefix, ontology_uri, UNPROVIDED, UNPROVIDED, UNPROVIDED,
            UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
    }
    SubLObject ontology_term = owl_importer2_get_option( importer, $kw38$ONTOLOGY_TERM, UNPROVIDED );
    SubLObject ontology_mt = owl_importer2_get_option( importer, $kw39$ONTOLOGY_MT, UNPROVIDED );
    final SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding( thread );
    try
    {
      utilities_macros.$silent_progressP$.bind( makeBoolean( NIL == verboseP ), thread );
      if( NIL == forts.fort_p( ontology_term ) )
      {
        owl_utilities.owl_assert_wff( ConsesLow.list( $const40$retainTerm, ConsesLow.list( $const41$OWLOntologyFn, ontology_uri ) ), $const42$BaseKB, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        ontology_term = czer_main.cyc_find_or_create_nart( ConsesLow.list( $const41$OWLOntologyFn, ontology_uri ), UNPROVIDED );
        owl_importer2_set_option( importer, $kw38$ONTOLOGY_TERM, ontology_term );
      }
      if( NIL == hlmt.hlmt_p( ontology_mt ) )
      {
        ontology_mt = czer_main.cyc_find_or_create_nart( ConsesLow.list( $const43$ContextOfPCWFn, ontology_term ), UNPROVIDED );
        owl_importer2_set_option( importer, $kw39$ONTOLOGY_MT, ontology_mt );
      }
      if( NIL != verboseP )
      {
        if( html_macros.$html_stream$.getDynamicValue( thread ).equal( owl_importer2_get_option( importer, $kw13$PROGRESS_STREAM, UNPROVIDED ) ) )
        {
          format_nil.force_format( owl_importer2_get_option( importer, $kw13$PROGRESS_STREAM, UNPROVIDED ), $str44$__Using_ontology_term_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED,
              UNPROVIDED, UNPROVIDED );
          cb_utilities.cb_form( ontology_term, UNPROVIDED, UNPROVIDED );
          streams_high.terpri( UNPROVIDED );
          format_nil.force_format( owl_importer2_get_option( importer, $kw13$PROGRESS_STREAM, UNPROVIDED ), $str45$__Using_ontology_mt_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED,
              UNPROVIDED );
          cb_utilities.cb_form( ontology_mt, UNPROVIDED, UNPROVIDED );
          streams_high.terpri( UNPROVIDED );
        }
        else
        {
          format_nil.force_format( owl_importer2_get_option( importer, $kw13$PROGRESS_STREAM, UNPROVIDED ), $str46$__Using_ontology_term__S__, narts_high.nart_expand( ontology_term ), UNPROVIDED, UNPROVIDED, UNPROVIDED,
              UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          format_nil.force_format( owl_importer2_get_option( importer, $kw13$PROGRESS_STREAM, UNPROVIDED ), $str47$__Using_ontology_mt__S__, narts_high.nart_expand( ontology_mt ), UNPROVIDED, UNPROVIDED, UNPROVIDED,
              UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        }
      }
      SubLObject cdolist_list_var = rdf_graph.rdf_graph_prefix_map( owl_importer2_graph( importer ) );
      SubLObject prefix_uri_pair = NIL;
      prefix_uri_pair = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject current;
        final SubLObject datum = current = prefix_uri_pair;
        SubLObject prefix = NIL;
        SubLObject uri_string = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list48 );
        prefix = current.first();
        current = ( uri_string = current.rest() );
        if( NIL != web_utilities.url_p( uri_string ) )
        {
          if( NIL != Strings.stringE( prefix, $str49$xml_base, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
          {
            owl_utilities.owl_assert_wff( ConsesLow.list( $const50$baseNamespaceForSKS, ontology_term, ConsesLow.list( $const51$URIFn, uri_string ) ), ontology_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          }
          else
          {
            owl_utilities.owl_assert_wff( ConsesLow.list( $const52$nameSpacePrefixForSKS, ontology_term, prefix, ConsesLow.list( $const51$URIFn, uri_string ) ), ontology_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        prefix_uri_pair = cdolist_list_var.first();
      }
      final SubLObject translation_functions = list_utilities.remove_if_not( $sym53$FUNCTION_SPEC_P, owl_importer2_get_option( importer, $kw54$GRAPH_TRANSLATION_FUNCTIONS, UNPROVIDED ), UNPROVIDED, UNPROVIDED,
          UNPROVIDED, UNPROVIDED );
      if( NIL != translation_functions )
      {
        final SubLObject v_graph = owl_importer2_graph( importer );
        SubLObject cdolist_list_var2 = translation_functions;
        SubLObject translation_function = NIL;
        translation_function = cdolist_list_var2.first();
        while ( NIL != cdolist_list_var2)
        {
          Functions.funcall( translation_function, v_graph, verboseP );
          cdolist_list_var2 = cdolist_list_var2.rest();
          translation_function = cdolist_list_var2.first();
        }
        owl_importer2_note_stat( importer, $kw55$NODE_COUNT, rdf_graph.rdf_graph_node_count( v_graph ) );
        owl_importer2_note_stat( importer, $kw56$TRIPLE_COUNT, rdf_graph.rdf_graph_triple_count( v_graph ) );
      }
      if( NIL != verboseP )
      {
        format_nil.force_format( owl_importer2_get_option( importer, $kw13$PROGRESS_STREAM, UNPROVIDED ), $str57$_A_triples__, rdf_graph.rdf_graph_triple_count( owl_importer2_graph( importer ) ), UNPROVIDED, UNPROVIDED,
            UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        format_nil.force_format( owl_importer2_get_option( importer, $kw13$PROGRESS_STREAM, UNPROVIDED ), $str58$_A_nodes__, rdf_graph.rdf_graph_node_count( owl_importer2_graph( importer ) ), UNPROVIDED, UNPROVIDED,
            UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      owl_importer2_assert_triples( importer );
    }
    finally
    {
      utilities_macros.$silent_progressP$.rebind( _prev_bind_0, thread );
    }
    return importer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 12757L)
  public static SubLObject determine_uri_prefix_from_prefix_map(final SubLObject uri, final SubLObject prefix_map)
  {
    return Sort.sort( Mapping.mapcar( $sym59$CAR, list_utilities.find_all( uri, prefix_map, $sym60$SUPERSTRING_, $sym61$CDR ) ), $sym62$_, $sym63$LENGTH ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 12922L)
  public static SubLObject determine_base_uri_from_prefix_map(final SubLObject prefix_map)
  {
    return Sort.sort( Mapping.mapcar( $sym61$CDR, list_utilities.find_all( $str10$, prefix_map, $sym64$STRING_, $sym59$CAR ) ), $sym62$_, $sym63$LENGTH ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 13075L)
  public static SubLObject validate_owl_import_parameters(final SubLObject function_name, final SubLObject importer_parameters)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject errorsP = NIL;
    if( NIL != list_utilities.plist_has_keyP( importer_parameters, $kw65$URI ) && NIL == web_utilities.url_p( conses_high.getf( importer_parameters, $kw65$URI, UNPROVIDED ) ) )
    {
      format_nil.force_format( T, $str66$_A__URI__S_is_not_valid__, function_name, conses_high.getf( importer_parameters, $kw65$URI, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      errorsP = T;
    }
    if( NIL != list_utilities.plist_has_keyP( importer_parameters, $kw67$FILENAME ) && NIL == file_utilities.file_existsP( conses_high.getf( importer_parameters, $kw67$FILENAME, UNPROVIDED ) ) )
    {
      format_nil.force_format( T, $str68$_A__FILENAME__S_does_not_exist__, function_name, conses_high.getf( importer_parameters, $kw67$FILENAME, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED,
          UNPROVIDED );
      errorsP = T;
    }
    final SubLObject options = conses_high.getf( importer_parameters, $kw69$IMPORTER_OPTIONS, UNPROVIDED );
    if( NIL == list_utilities.property_list_p( options ) )
    {
      format_nil.force_format( T, $str70$_A__IMPORTER_OPTIONS__S_is_not_a_, function_name, conses_high.getf( importer_parameters, $kw69$IMPORTER_OPTIONS, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED,
          UNPROVIDED, UNPROVIDED );
      errorsP = T;
    }
    final SubLObject cyclist = conses_high.getf( options, $kw12$CYCLIST, UNPROVIDED );
    if( NIL != cyclist )
    {
      if( NIL == isa.isa_in_any_mtP( cyclist, $const71$Cyclist ) )
      {
        format_nil.force_format( T, $str72$_A__IMPORTER_OPTIONS__cyclist__A_, function_name, options, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        errorsP = T;
      }
    }
    else if( NIL == isa.isa_in_any_mtP( operation_communication.the_cyclist(), $const71$Cyclist ) || $const73$Guest.eql( operation_communication.the_cyclist() ) )
    {
      format_nil.force_format( T, $str74$_A__Please_log_in_with__set_the_c, function_name, options, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      errorsP = T;
    }
    final SubLObject invalid_options = conses_high.set_difference( list_utilities.plist_keys( options ), $owl_importer2_valid_options$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
    if( NIL != invalid_options )
    {
      format_nil.force_format( T, $str75$_A__IMPORTER_OPTIONS_has_invalid_, function_name, invalid_options, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      errorsP = T;
    }
    if( NIL != errorsP )
    {
      show_owl_import_usages();
      Errors.error( $str76$Errors_found__aborting_import___ );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 14875L)
  public static SubLObject owl_importer_dwim_a_cyclist(final SubLObject importer_options)
  {
    SubLObject cyclist = conses_high.getf( importer_options, $kw12$CYCLIST, UNPROVIDED );
    if( NIL == forts.fort_p( cyclist ) )
    {
      cyclist = operation_communication.the_cyclist();
    }
    return cyclist;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 15311L)
  public static SubLObject owl_importer_v2_version_number()
  {
    final SubLObject start = Sequences.position_if( $sym79$DIGIT_CHAR_P, $owl_importer2_version_number$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject version_string = string_utilities.remove_last_char( string_utilities.substring( $owl_importer2_version_number$.getGlobalValue(), start, UNPROVIDED ), TWO_INTEGER );
    string_utilities.set_nth_char( ZERO_INTEGER, version_string, Characters.CHAR_2, UNPROVIDED );
    return version_string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 15604L)
  public static SubLObject import_owl_ontology_from_url(final SubLObject url, final SubLObject mapping_mt, SubLObject cyclist)
  {
    if( cyclist == UNPROVIDED )
    {
      cyclist = operation_communication.the_cyclist();
    }
    final SubLObject source_file = rdf_utilities.download_rdf_url( url, UNPROVIDED );
    return import_owl_ontology_from_file( source_file, mapping_mt, cyclist, url );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 15873L)
  public static SubLObject import_owl_ontology_from_file(final SubLObject file, final SubLObject mapping_mt, SubLObject cyclist, SubLObject base_uri)
  {
    if( cyclist == UNPROVIDED )
    {
      cyclist = operation_communication.the_cyclist();
    }
    if( base_uri == UNPROVIDED )
    {
      base_uri = NIL;
    }
    final SubLObject importer = get_owl_importer2_for_file( file, cyclist, base_uri );
    owl_importer2_assert_triples( importer );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 16132L)
  public static SubLObject get_owl_importer2_for_url(final SubLObject url, SubLObject cyclist)
  {
    if( cyclist == UNPROVIDED )
    {
      cyclist = operation_communication.the_cyclist();
    }
    final SubLObject source_file = rdf_utilities.download_rdf_url( url, UNPROVIDED );
    return get_owl_importer2_for_file( source_file, cyclist, url );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 16326L)
  public static SubLObject get_owl_importer2_for_file(final SubLObject file, SubLObject cyclist, SubLObject base_uri)
  {
    if( cyclist == UNPROVIDED )
    {
      cyclist = operation_communication.the_cyclist();
    }
    if( base_uri == UNPROVIDED )
    {
      base_uri = NIL;
    }
    final SubLObject importer = new_owl_importer2( base_uri, file, cyclist, UNPROVIDED );
    owl_importer2_load_graph( importer, base_uri );
    return importer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 16552L)
  public static SubLObject find_owl_importer2_by_id(final SubLObject id)
  {
    return dictionary.dictionary_lookup_without_values( owl_importer2_id_map(), id, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 16668L)
  public static SubLObject owl_importer2_version_number()
  {
    final SubLObject start = Sequences.position( Characters.CHAR_period, $owl_importer2_version_number$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return Sequences.cconcatenate( $str80$2, string_utilities.remove_last_char( string_utilities.substring( $owl_importer2_version_number$.getGlobalValue(), start, UNPROVIDED ), TWO_INTEGER ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 17003L)
  public static SubLObject import_owl_triples_from_rdf_graph(final SubLObject v_graph, final SubLObject mapping_mt, SubLObject cyclist)
  {
    if( cyclist == UNPROVIDED )
    {
      cyclist = operation_communication.the_cyclist();
    }
    final SubLObject importer = new_owl_importer2_for_graph( v_graph, cyclist, UNPROVIDED );
    owl_importer2_assert_triples( importer );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 17251L)
  public static SubLObject cyclist_using_owl_importer2(final SubLObject cyclist)
  {
    final SubLObject version_string = owl_importer2_version_number();
    final SubLObject versioned_tool_nat = el_utilities.make_binary_formula( $const81$SoftwareVersion, $const82$OWLImporter_Cyc, version_string );
    return czer_main.cyc_find_or_create_nart( el_utilities.make_binary_formula( $const83$UserOfProgramFn, versioned_tool_nat, cyclist ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 17589L)
  public static SubLObject owl_importer2_load_graph(final SubLObject importer, SubLObject base_uri)
  {
    if( base_uri == UNPROVIDED )
    {
      base_uri = NIL;
    }
    final SubLObject v_graph = rdf_parser.parse_rdfXxml_file( owl_importer2_file( importer ), base_uri );
    return owl_importer2_load_graph_internal( importer, v_graph );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 17805L)
  public static SubLObject owl_importer2_load_graph_internal(final SubLObject importer, final SubLObject v_graph)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    owl_importer2_set_graph( importer, v_graph );
    final SubLObject rw_lock_var = rdf_graph.get_rdf_graph_lock( v_graph );
    SubLObject needs_to_releaseP = NIL;
    try
    {
      needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock( rw_lock_var );
      final SubLObject iterator_var = rdf_graph.rdf_graph_node_iterator( v_graph );
      SubLObject valid;
      for( SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean( NIL == valid ) )
      {
        thread.resetMultipleValues();
        final SubLObject node = iteration.iteration_next( iterator_var );
        valid = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL != valid )
        {
          dictionary.dictionary_enter( owl_importer2_terms( importer ), node, NIL );
        }
      }
    }
    finally
    {
      if( NIL != needs_to_releaseP )
      {
        ReadWriteLocks.rw_lock_release_read_lock( rw_lock_var );
      }
    }
    owl_importer2_note_stat( importer, $kw55$NODE_COUNT, rdf_graph.rdf_graph_node_count( v_graph ) );
    owl_importer2_note_stat( importer, $kw56$TRIPLE_COUNT, rdf_graph.rdf_graph_triple_count( v_graph ) );
    owl_importer2_note_stat( importer, $kw84$NODES_DONE, ZERO_INTEGER );
    owl_importer2_note_stat( importer, $kw85$TRIPLES_DONE, ZERO_INTEGER );
    owl_importer2_note_stat( importer, $kw86$TERMS_CREATED, ZERO_INTEGER );
    owl_importer2_note_stat( importer, $kw87$ASSERTIONS_CREATED, ZERO_INTEGER );
    final SubLObject ontologies = rdf_graph.rdf_graph_find_subjects( v_graph, rdf_utilities.rdf_expanded_name( $str88$type ), owl_utilities.owl_expanded_name( $str89$Ontology ) );
    owl_importer2_set_ontologies( importer, ontologies );
    return v_graph;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 19082L)
  public static SubLObject owl_importer2_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_owl_importer2( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 19082L)
  public static SubLObject owl_importer2_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $owl_importer2_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 19082L)
  public static SubLObject owl_imp2_id(final SubLObject v_object)
  {
    assert NIL != owl_importer2_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 19082L)
  public static SubLObject owl_imp2_uri(final SubLObject v_object)
  {
    assert NIL != owl_importer2_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 19082L)
  public static SubLObject owl_imp2_file(final SubLObject v_object)
  {
    assert NIL != owl_importer2_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 19082L)
  public static SubLObject owl_imp2_graph(final SubLObject v_object)
  {
    assert NIL != owl_importer2_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 19082L)
  public static SubLObject owl_imp2_cyclist(final SubLObject v_object)
  {
    assert NIL != owl_importer2_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 19082L)
  public static SubLObject owl_imp2_import(final SubLObject v_object)
  {
    assert NIL != owl_importer2_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 19082L)
  public static SubLObject owl_imp2_ontologies(final SubLObject v_object)
  {
    assert NIL != owl_importer2_p( v_object ) : v_object;
    return v_object.getField8();
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 19082L)
  public static SubLObject owl_imp2_terms(final SubLObject v_object)
  {
    assert NIL != owl_importer2_p( v_object ) : v_object;
    return v_object.getField9();
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 19082L)
  public static SubLObject owl_imp2_sentences(final SubLObject v_object)
  {
    assert NIL != owl_importer2_p( v_object ) : v_object;
    return v_object.getField10();
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 19082L)
  public static SubLObject owl_imp2_stats(final SubLObject v_object)
  {
    assert NIL != owl_importer2_p( v_object ) : v_object;
    return v_object.getField11();
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 19082L)
  public static SubLObject owl_imp2_options(final SubLObject v_object)
  {
    assert NIL != owl_importer2_p( v_object ) : v_object;
    return v_object.getField12();
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 19082L)
  public static SubLObject owl_imp2_thread(final SubLObject v_object)
  {
    assert NIL != owl_importer2_p( v_object ) : v_object;
    return v_object.getField13();
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 19082L)
  public static SubLObject _csetf_owl_imp2_id(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != owl_importer2_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 19082L)
  public static SubLObject _csetf_owl_imp2_uri(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != owl_importer2_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 19082L)
  public static SubLObject _csetf_owl_imp2_file(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != owl_importer2_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 19082L)
  public static SubLObject _csetf_owl_imp2_graph(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != owl_importer2_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 19082L)
  public static SubLObject _csetf_owl_imp2_cyclist(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != owl_importer2_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 19082L)
  public static SubLObject _csetf_owl_imp2_import(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != owl_importer2_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 19082L)
  public static SubLObject _csetf_owl_imp2_ontologies(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != owl_importer2_p( v_object ) : v_object;
    return v_object.setField8( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 19082L)
  public static SubLObject _csetf_owl_imp2_terms(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != owl_importer2_p( v_object ) : v_object;
    return v_object.setField9( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 19082L)
  public static SubLObject _csetf_owl_imp2_sentences(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != owl_importer2_p( v_object ) : v_object;
    return v_object.setField10( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 19082L)
  public static SubLObject _csetf_owl_imp2_stats(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != owl_importer2_p( v_object ) : v_object;
    return v_object.setField11( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 19082L)
  public static SubLObject _csetf_owl_imp2_options(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != owl_importer2_p( v_object ) : v_object;
    return v_object.setField12( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 19082L)
  public static SubLObject _csetf_owl_imp2_thread(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != owl_importer2_p( v_object ) : v_object;
    return v_object.setField13( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 19082L)
  public static SubLObject make_owl_importer2(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $owl_importer2_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw123$ID ) )
      {
        _csetf_owl_imp2_id( v_new, current_value );
      }
      else if( pcase_var.eql( $kw65$URI ) )
      {
        _csetf_owl_imp2_uri( v_new, current_value );
      }
      else if( pcase_var.eql( $kw124$FILE ) )
      {
        _csetf_owl_imp2_file( v_new, current_value );
      }
      else if( pcase_var.eql( $kw125$GRAPH ) )
      {
        _csetf_owl_imp2_graph( v_new, current_value );
      }
      else if( pcase_var.eql( $kw12$CYCLIST ) )
      {
        _csetf_owl_imp2_cyclist( v_new, current_value );
      }
      else if( pcase_var.eql( $kw126$IMPORT ) )
      {
        _csetf_owl_imp2_import( v_new, current_value );
      }
      else if( pcase_var.eql( $kw127$ONTOLOGIES ) )
      {
        _csetf_owl_imp2_ontologies( v_new, current_value );
      }
      else if( pcase_var.eql( $kw128$TERMS ) )
      {
        _csetf_owl_imp2_terms( v_new, current_value );
      }
      else if( pcase_var.eql( $kw129$SENTENCES ) )
      {
        _csetf_owl_imp2_sentences( v_new, current_value );
      }
      else if( pcase_var.eql( $kw130$STATS ) )
      {
        _csetf_owl_imp2_stats( v_new, current_value );
      }
      else if( pcase_var.eql( $kw131$OPTIONS ) )
      {
        _csetf_owl_imp2_options( v_new, current_value );
      }
      else if( pcase_var.eql( $kw132$THREAD ) )
      {
        _csetf_owl_imp2_thread( v_new, current_value );
      }
      else
      {
        Errors.error( $str133$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 19082L)
  public static SubLObject visit_defstruct_owl_importer2(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw134$BEGIN, $sym135$MAKE_OWL_IMPORTER2, TWELVE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw136$SLOT, $kw123$ID, owl_imp2_id( obj ) );
    Functions.funcall( visitor_fn, obj, $kw136$SLOT, $kw65$URI, owl_imp2_uri( obj ) );
    Functions.funcall( visitor_fn, obj, $kw136$SLOT, $kw124$FILE, owl_imp2_file( obj ) );
    Functions.funcall( visitor_fn, obj, $kw136$SLOT, $kw125$GRAPH, owl_imp2_graph( obj ) );
    Functions.funcall( visitor_fn, obj, $kw136$SLOT, $kw12$CYCLIST, owl_imp2_cyclist( obj ) );
    Functions.funcall( visitor_fn, obj, $kw136$SLOT, $kw126$IMPORT, owl_imp2_import( obj ) );
    Functions.funcall( visitor_fn, obj, $kw136$SLOT, $kw127$ONTOLOGIES, owl_imp2_ontologies( obj ) );
    Functions.funcall( visitor_fn, obj, $kw136$SLOT, $kw128$TERMS, owl_imp2_terms( obj ) );
    Functions.funcall( visitor_fn, obj, $kw136$SLOT, $kw129$SENTENCES, owl_imp2_sentences( obj ) );
    Functions.funcall( visitor_fn, obj, $kw136$SLOT, $kw130$STATS, owl_imp2_stats( obj ) );
    Functions.funcall( visitor_fn, obj, $kw136$SLOT, $kw131$OPTIONS, owl_imp2_options( obj ) );
    Functions.funcall( visitor_fn, obj, $kw136$SLOT, $kw132$THREAD, owl_imp2_thread( obj ) );
    Functions.funcall( visitor_fn, obj, $kw137$END, $sym135$MAKE_OWL_IMPORTER2, TWELVE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 19082L)
  public static SubLObject visit_defstruct_object_owl_importer2_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_owl_importer2( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 20052L)
  public static SubLObject print_owl_importer2(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    PrintLow.format( stream, $str139$_OWL_IMPORTER__D_for__A_, owl_imp2_id( v_object ), owl_imp2_uri( v_object ) );
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 20240L)
  public static SubLObject new_owl_importer2(final SubLObject uri, final SubLObject file, SubLObject cyclist, SubLObject options)
  {
    if( cyclist == UNPROVIDED )
    {
      cyclist = operation_communication.the_cyclist();
    }
    if( options == UNPROVIDED )
    {
      options = NIL;
    }
    assert NIL != web_utilities.url_p( uri ) : uri;
    assert NIL != file_utilities.file_existsP( file ) : file;
    assert NIL != forts.fort_p( cyclist ) : cyclist;
    assert NIL != list_utilities.property_list_p( options ) : options;
    final SubLObject importer = make_owl_importer2( UNPROVIDED );
    _csetf_owl_imp2_id( importer, next_owl_importer2_id() );
    _csetf_owl_imp2_uri( importer, uri );
    _csetf_owl_imp2_file( importer, file );
    _csetf_owl_imp2_cyclist( importer, cyclist );
    _csetf_owl_imp2_terms( importer, dictionary.new_dictionary( Symbols.symbol_function( EQL ), UNPROVIDED ) );
    _csetf_owl_imp2_sentences( importer, set.new_set( Symbols.symbol_function( EQUAL ), UNPROVIDED ) );
    _csetf_owl_imp2_stats( importer, dictionary.new_dictionary( Symbols.symbol_function( EQL ), UNPROVIDED ) );
    _csetf_owl_imp2_options( importer, options );
    return importer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 21034L)
  public static SubLObject new_owl_importer2_for_graph(final SubLObject v_graph, SubLObject cyclist, SubLObject options)
  {
    if( cyclist == UNPROVIDED )
    {
      cyclist = operation_communication.the_cyclist();
    }
    if( options == UNPROVIDED )
    {
      options = NIL;
    }
    assert NIL != rdf_graph.rdf_graph_p( v_graph ) : v_graph;
    assert NIL != forts.fort_p( cyclist ) : cyclist;
    if( NIL == rdf_uri.rdf_uri_p( rdf_graph.rdf_graph_topic( v_graph ) ) )
    {
      Errors.error( $str145$No_import_owl_Ontology_URI_found_ );
    }
    final SubLObject importer = make_owl_importer2( UNPROVIDED );
    _csetf_owl_imp2_id( importer, next_owl_importer2_id() );
    _csetf_owl_imp2_uri( importer, rdf_uri.rdf_uri_utf8_string( rdf_graph.rdf_graph_topic( v_graph ) ) );
    _csetf_owl_imp2_cyclist( importer, cyclist );
    _csetf_owl_imp2_terms( importer, dictionary.new_dictionary( Symbols.symbol_function( EQL ), UNPROVIDED ) );
    _csetf_owl_imp2_sentences( importer, set.new_set( Symbols.symbol_function( EQUAL ), UNPROVIDED ) );
    _csetf_owl_imp2_stats( importer, dictionary.new_dictionary( Symbols.symbol_function( EQL ), UNPROVIDED ) );
    _csetf_owl_imp2_options( importer, options );
    owl_importer2_load_graph_internal( importer, v_graph );
    return importer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 21911L)
  public static SubLObject cyclist_using_owl_importer_v2(final SubLObject cyclist)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject version_string = owl_importer_v2_version_number();
    final SubLObject versioned_tool_nat = el_utilities.make_binary_formula( $const146$SoftwareVersionFn, $const82$OWLImporter_Cyc, version_string );
    final SubLObject cyclist_using_tool_naut = el_utilities.make_binary_formula( $const83$UserOfProgramFn, versioned_tool_nat, cyclist );
    if( NIL == kb_accessors.cyclistP( narts_high.find_nart( cyclist_using_tool_naut ) ) )
    {
      final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding( thread );
      try
      {
        api_control_vars.$the_cyclist$.bind( NIL, thread );
        operation_communication.set_the_cyclist( cyclist );
        ke.ke_assert_now( ConsesLow.list( $const40$retainTerm, cyclist_using_tool_naut ), $const42$BaseKB, UNPROVIDED, UNPROVIDED );
      }
      finally
      {
        api_control_vars.$the_cyclist$.rebind( _prev_bind_0, thread );
      }
    }
    return narts_high.find_nart( cyclist_using_tool_naut );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 22515L)
  public static SubLObject next_owl_importer2_id()
  {
    return integer_sequence_generator.integer_sequence_generator_next( $owl_importer2_id_isg$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 22690L)
  public static SubLObject owl_importer2_id_map()
  {
    return $owl_importer2_id_map$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 22763L)
  public static SubLObject note_owl_importer2_id(final SubLObject importer, final SubLObject id)
  {
    return dictionary.dictionary_enter( $owl_importer2_id_map$.getGlobalValue(), id, importer );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 22879L)
  public static SubLObject owl_importer2_id(final SubLObject importer)
  {
    assert NIL != owl_importer2_p( importer ) : importer;
    return owl_imp2_id( importer );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 23008L)
  public static SubLObject owl_importer2_uri(final SubLObject importer)
  {
    assert NIL != owl_importer2_p( importer ) : importer;
    return owl_imp2_uri( importer );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 23127L)
  public static SubLObject owl_importer2_file(final SubLObject importer)
  {
    assert NIL != owl_importer2_p( importer ) : importer;
    return owl_imp2_file( importer );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 23248L)
  public static SubLObject owl_importer2_graph(final SubLObject importer)
  {
    assert NIL != owl_importer2_p( importer ) : importer;
    return owl_imp2_graph( importer );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 23373L)
  public static SubLObject owl_importer2_set_graph(final SubLObject importer, final SubLObject v_graph)
  {
    assert NIL != owl_importer2_p( importer ) : importer;
    assert NIL != rdf_graph.rdf_graph_p( v_graph ) : v_graph;
    _csetf_owl_imp2_graph( importer, v_graph );
    return v_graph;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 23561L)
  public static SubLObject owl_importer2_cyclist(final SubLObject importer)
  {
    assert NIL != owl_importer2_p( importer ) : importer;
    return owl_imp2_cyclist( importer );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 23688L)
  public static SubLObject owl_importer2_import(final SubLObject importer)
  {
    assert NIL != owl_importer2_p( importer ) : importer;
    return owl_imp2_import( importer );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 23813L)
  public static SubLObject owl_importer2_ontologies(final SubLObject importer)
  {
    assert NIL != owl_importer2_p( importer ) : importer;
    return owl_imp2_ontologies( importer );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 23946L)
  public static SubLObject owl_importer2_set_ontologies(final SubLObject importer, final SubLObject ontologies)
  {
    assert NIL != owl_importer2_p( importer ) : importer;
    assert NIL != list_utilities.non_dotted_list_p( ontologies ) : ontologies;
    SubLObject cdolist_list_var = ontologies;
    SubLObject elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != rdf_uri.rdf_uri_p( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    _csetf_owl_imp2_ontologies( importer, ontologies );
    return ontologies;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 24167L)
  public static SubLObject owl_importer2_terms(final SubLObject importer)
  {
    assert NIL != owl_importer2_p( importer ) : importer;
    return owl_imp2_terms( importer );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 24290L)
  public static SubLObject owl_importer2_sentences(final SubLObject importer)
  {
    assert NIL != owl_importer2_p( importer ) : importer;
    return owl_imp2_sentences( importer );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 24421L)
  public static SubLObject owl_importer2_stats(final SubLObject importer)
  {
    assert NIL != owl_importer2_p( importer ) : importer;
    return owl_imp2_stats( importer );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 24544L)
  public static SubLObject owl_importer2_note_stat(final SubLObject importer, final SubLObject stat, final SubLObject value)
  {
    return dictionary.dictionary_enter( owl_importer2_stats( importer ), stat, value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 24677L)
  public static SubLObject owl_importer2_lookup_stat(final SubLObject importer, final SubLObject stat)
  {
    return dictionary.dictionary_lookup_without_values( owl_importer2_stats( importer ), stat, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 24816L)
  public static SubLObject owl_importer2_triple_count(final SubLObject importer)
  {
    return owl_importer2_lookup_stat( importer, $kw56$TRIPLE_COUNT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 24931L)
  public static SubLObject owl_importer2_triples_done(final SubLObject importer)
  {
    return owl_importer2_lookup_stat( importer, $kw85$TRIPLES_DONE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 25046L)
  public static SubLObject owl_importer2_nodes_done(final SubLObject importer)
  {
    return owl_importer2_lookup_stat( importer, $kw84$NODES_DONE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 25157L)
  public static SubLObject owl_importer2_increment_triples_done(final SubLObject importer)
  {
    return owl_importer2_note_stat( importer, $kw85$TRIPLES_DONE, number_utilities.f_1X( owl_importer2_triples_done( importer ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 25323L)
  public static SubLObject owl_importer2_increment_nodes_done(final SubLObject importer)
  {
    return owl_importer2_note_stat( importer, $kw84$NODES_DONE, number_utilities.f_1X( owl_importer2_nodes_done( importer ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 25483L)
  public static SubLObject owl_importer2_set_options(final SubLObject importer, final SubLObject options)
  {
    assert NIL != owl_importer2_p( importer ) : importer;
    if( NIL != options && !assertionsDisabledInClass && NIL == list_utilities.property_list_p( options ) )
    {
      throw new AssertionError( options );
    }
    _csetf_owl_imp2_options( importer, options );
    return options;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 25698L)
  public static SubLObject owl_importer2_set_option(final SubLObject importer, final SubLObject key, final SubLObject value)
  {
    assert NIL != owl_importer2_p( importer ) : importer;
    SubLObject options = owl_imp2_options( importer );
    options = conses_high.putf( options, key, value );
    _csetf_owl_imp2_options( importer, options );
    return options;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 25962L)
  public static SubLObject owl_importer2_set_option_if_not_set(final SubLObject importer, final SubLObject key, final SubLObject value)
  {
    assert NIL != owl_importer2_p( importer ) : importer;
    SubLObject options = owl_imp2_options( importer );
    if( NIL == list_utilities.plist_has_keyP( options, key ) )
    {
      options = conses_high.putf( options, key, value );
      _csetf_owl_imp2_options( importer, options );
    }
    return options;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 26284L)
  public static SubLObject owl_importer2_get_option(final SubLObject importer, final SubLObject key, SubLObject v_default)
  {
    if( v_default == UNPROVIDED )
    {
      v_default = NIL;
    }
    assert NIL != owl_importer2_p( importer ) : importer;
    return conses_high.getf( owl_imp2_options( importer ), key, v_default );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 26457L)
  public static SubLObject owl_importer2_options(final SubLObject importer)
  {
    assert NIL != owl_importer2_p( importer ) : importer;
    return owl_imp2_options( importer );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 26584L)
  public static SubLObject owl_importer2_note_thread(final SubLObject importer, final SubLObject thread)
  {
    assert NIL != owl_importer2_p( importer ) : importer;
    assert NIL != Types.processp( thread ) : thread;
    _csetf_owl_imp2_thread( importer, thread );
    return owl_imp2_thread( importer );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 26796L)
  public static SubLObject owl_importer2_thread(final SubLObject importer)
  {
    assert NIL != owl_importer2_p( importer ) : importer;
    return owl_imp2_thread( importer );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 26921L)
  public static SubLObject sxhash_owl_importer2_method(final SubLObject v_object)
  {
    return sxhash_owl_importer2( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 27027L)
  public static SubLObject sxhash_owl_importer2(final SubLObject importer)
  {
    return Sxhash.sxhash( owl_imp2_id( importer ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 27129L)
  public static SubLObject owl_importer2_assert_triples(final SubLObject importer)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    owl_importer2_note_thread( importer, Threads.current_process() );
    final SubLObject v_graph = owl_importer2_graph( importer );
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
        utilities_macros.noting_percent_progress_preamble( Sequences.cconcatenate( $str153$Importing_, new SubLObject[] { format_nil.format_nil_d_no_copy( owl_importer2_triple_count( importer ) ), $str154$_triples___
        } ) );
        if( NIL != owl_importer2_get_option( importer, $kw17$VERBOSE_, UNPROVIDED ) )
        {
          SubLObject node_count = ZERO_INTEGER;
          SubLObject real_node_count = ZERO_INTEGER;
          SubLObject triple_count = ZERO_INTEGER;
          SubLObject real_triple_count = ZERO_INTEGER;
          final SubLObject rw_lock_var = rdf_graph.get_rdf_graph_lock( v_graph );
          SubLObject needs_to_releaseP = NIL;
          try
          {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock( rw_lock_var );
            final SubLObject iterator_var = rdf_graph.rdf_graph_node_iterator( v_graph );
            SubLObject valid;
            for( SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean( NIL == valid ) )
            {
              thread.resetMultipleValues();
              final SubLObject node = iteration.iteration_next( iterator_var );
              valid = thread.secondMultipleValue();
              thread.resetMultipleValues();
              if( NIL != valid )
              {
                node_count = Numbers.add( node_count, ONE_INTEGER );
                if( NIL != rdf_uri.rdf_uri_p( node ) || NIL != rdf_literal.rdf_literal_p( node ) )
                {
                  real_node_count = Numbers.add( real_node_count, ONE_INTEGER );
                }
              }
            }
          }
          finally
          {
            if( NIL != needs_to_releaseP )
            {
              ReadWriteLocks.rw_lock_release_read_lock( rw_lock_var );
            }
          }
          final SubLObject iterator_var = rdf_graph.rdf_graph_triples_iterator( v_graph );
          SubLObject valid;
          for( SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean( NIL == valid ) )
          {
            thread.resetMultipleValues();
            final SubLObject triple = iteration.iteration_next( iterator_var );
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if( NIL != valid )
            {
              triple_count = Numbers.add( triple_count, ONE_INTEGER );
              if( NIL != rdf_triple.rdf_triple_p( triple, UNPROVIDED ) )
              {
                real_triple_count = Numbers.add( real_triple_count, ONE_INTEGER );
              }
            }
          }
          format_nil.force_format( StreamsLow.$standard_output$.getDynamicValue( thread ), $str155$node_count___A__, node_count, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          format_nil.force_format( StreamsLow.$standard_output$.getDynamicValue( thread ), $str156$real_node_count___A__, real_node_count, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED,
              UNPROVIDED );
          format_nil.force_format( StreamsLow.$standard_output$.getDynamicValue( thread ), $str157$triple_count___A__, triple_count, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          format_nil.force_format( StreamsLow.$standard_output$.getDynamicValue( thread ), $str158$real_triple_count___A__, real_triple_count, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED,
              UNPROVIDED );
        }
        final SubLObject rw_lock_var2 = rdf_graph.get_rdf_graph_lock( v_graph );
        SubLObject needs_to_releaseP2 = NIL;
        try
        {
          needs_to_releaseP2 = ReadWriteLocks.rw_lock_seize_read_lock( rw_lock_var2 );
          final SubLObject iterator_var2 = rdf_graph.rdf_graph_node_iterator( v_graph );
          SubLObject valid2;
          for( SubLObject done_var2 = NIL; NIL == done_var2; done_var2 = makeBoolean( NIL == valid2 ) )
          {
            thread.resetMultipleValues();
            final SubLObject node2 = iteration.iteration_next( iterator_var2 );
            valid2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if( NIL != valid2 )
            {
              owl_importer2_assert_subject_triples( importer, node2 );
              owl_importer2_increment_nodes_done( importer );
            }
          }
        }
        finally
        {
          if( NIL != needs_to_releaseP2 )
          {
            ReadWriteLocks.rw_lock_release_read_lock( rw_lock_var2 );
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$1 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$1, thread );
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
    return owl_importer2_nodes_done( importer );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 28555L)
  public static SubLObject owl_importer2_assert_subject_triples(final SubLObject importer, final SubLObject node)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == subl_promotions.memberP( node, $owl_importer2_subject_stack$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ) )
    {
      final SubLObject v_graph = owl_importer2_graph( importer );
      final SubLObject _prev_bind_0 = $owl_importer2_subject_stack$.currentBinding( thread );
      try
      {
        $owl_importer2_subject_stack$.bind( ConsesLow.cons( node, $owl_importer2_subject_stack$.getDynamicValue( thread ) ), thread );
        if( NIL != rdf_graph.valid_rdf_subject_p( node ) && NIL == rdf_utilities.rdf_list_p( node, v_graph ) )
        {
          if( NIL != list_utilities.lengthG( $owl_importer2_subject_stack$.getDynamicValue( thread ), $int159$40, UNPROVIDED ) )
          {
            Errors.sublisp_break( $str160$Assert_nesting_depth___D, new SubLObject[] { Sequences.length( $owl_importer2_subject_stack$.getDynamicValue( thread ) )
            } );
          }
          SubLObject cdolist_list_var = rdf_graph.rdf_graph_find_subject_triples( v_graph, node, UNPROVIDED );
          SubLObject triple = NIL;
          triple = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            owl_importer2_assert_triple( importer, triple );
            cdolist_list_var = cdolist_list_var.rest();
            triple = cdolist_list_var.first();
          }
        }
      }
      finally
      {
        $owl_importer2_subject_stack$.rebind( _prev_bind_0, thread );
      }
    }
    return node;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 29152L)
  public static SubLObject owl_importer2_assert_triple(final SubLObject importer, final SubLObject triple)
  {
    final SubLObject sentence = owl_importer2_sentence_for_triple( importer, triple );
    final SubLObject predicate = cycl_utilities.atomic_sentence_predicate( sentence );
    final SubLObject import_term = owl_importer2_import( importer );
    final SubLObject cyclist = owl_importer2_cyclist( importer );
    final SubLObject assert_mt = owl_importer2_get_option( importer, $kw39$ONTOLOGY_MT, UNPROVIDED );
    if( NIL == kb_accessors.binary_predicateP( predicate ) )
    {
      owl_utilities.owl_assert_wff( ConsesLow.listS( $const161$isa, predicate, $list162 ), assert_mt, import_term, cyclist, UNPROVIDED );
    }
    if( NIL != sentence )
    {
      final SubLObject successP = makeBoolean( NIL != owl_importer2_sentence_doneP( importer, sentence ) || NIL != owl_utilities.owl_assert_wff( sentence, assert_mt, import_term, cyclist, UNPROVIDED ) );
      if( NIL == successP )
      {
        Errors.warn( $str163$Failed_to_assert__S_in__S, sentence, assert_mt );
        wff.explain_why_not_wff_assert( narts_high.nart_expand( sentence ), assert_mt, UNPROVIDED );
        format_nil.force_format( owl_importer2_get_option( importer, $kw13$PROGRESS_STREAM, UNPROVIDED ), $str164$__, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
    }
    owl_importer2_note_sentence_done( importer, sentence );
    utilities_macros.note_percent_progress( owl_importer2_triples_done( importer ), owl_importer2_triple_count( importer ) );
    return triple;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 30198L)
  public static SubLObject owl_importer2_sentence_doneP(final SubLObject importer, final SubLObject sentence)
  {
    return set.set_memberP( sentence, owl_importer2_sentences( importer ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 30331L)
  public static SubLObject owl_importer2_note_sentence_done(final SubLObject importer, final SubLObject sentence)
  {
    owl_importer2_increment_triples_done( importer );
    return set.set_add( sentence, owl_importer2_sentences( importer ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 30514L)
  public static SubLObject owl_importer2_sentence_for_triple(final SubLObject importer, final SubLObject triple)
  {
    final SubLObject predicate = owl_importer2_find_or_create_term( importer, rdf_triple.rdf_triple_predicate( triple ), UNPROVIDED );
    final SubLObject subject = owl_importer2_find_or_create_term( importer, rdf_triple.rdf_triple_subject( triple ), T );
    final SubLObject v_object = owl_importer2_find_or_create_term( importer, rdf_triple.rdf_triple_object( triple ), rdf_graph.rdf_node_symmetric_predicateP( rdf_triple.rdf_triple_predicate( triple ) ) );
    if( NIL != predicate && NIL != subject && NIL != v_object )
    {
      return el_utilities.make_binary_formula( predicate, subject, v_object );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 31056L)
  public static SubLObject owl_importer2_find_or_create_term_for_list_node(final SubLObject importer, final SubLObject list_node)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_graph = owl_importer2_graph( importer );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == rdf_utilities.rdf_list_p( list_node, v_graph ) )
    {
      Errors.error( $str165$_S_is_not_a_list_node_, list_node );
    }
    if( NIL != rdf_uri.rdf_uri_p( list_node ) && NIL != rdf_uri.rdf_uri_matchesP( list_node, rdf_utilities.rdf_expanded_name( $str166$nil ) ) )
    {
      return $const167$TheEmptyList;
    }
    return czer_main.canonicalize_term( el_utilities.make_el_formula( $const168$TheList, owl_importer2_list_node_terms( importer, list_node ), UNPROVIDED ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 31502L)
  public static SubLObject owl_importer2_list_node_terms(final SubLObject importer, final SubLObject node)
  {
    if( NIL != rdf_uri.rdf_uri_p( node ) && NIL != rdf_uri.rdf_uri_matchesP( node, rdf_utilities.rdf_expanded_name( $str166$nil ) ) )
    {
      return NIL;
    }
    final SubLObject v_graph = owl_importer2_graph( importer );
    final SubLObject triples = rdf_graph.rdf_graph_find_subject_triples( v_graph, node, UNPROVIDED );
    final SubLObject first_triple = Sequences.find( rdf_graph.rdf_graph_get_uri( v_graph, rdf_utilities.rdf_expanded_name( $str169$first ), UNPROVIDED, UNPROVIDED ), triples, EQ, $sym170$RDF_TRIPLE_PREDICATE, UNPROVIDED,
        UNPROVIDED );
    final SubLObject first_term = owl_importer2_find_or_create_term( importer, rdf_triple.rdf_triple_object( first_triple ), UNPROVIDED );
    final SubLObject rest_triple = Sequences.find( rdf_graph.rdf_graph_get_uri( v_graph, rdf_utilities.rdf_expanded_name( $str171$rest ), UNPROVIDED, UNPROVIDED ), triples, EQ, $sym170$RDF_TRIPLE_PREDICATE, UNPROVIDED,
        UNPROVIDED );
    final SubLObject rest_terms = owl_importer2_list_node_terms( importer, rdf_triple.rdf_triple_object( rest_triple ) );
    return ConsesLow.cons( first_term, rest_terms );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 32224L)
  public static SubLObject owl_importer2_find_or_create_term(final SubLObject importer, final SubLObject rdf_node, SubLObject mark_term_in_ontologyP)
  {
    if( mark_term_in_ontologyP == UNPROVIDED )
    {
      mark_term_in_ontologyP = NIL;
    }
    SubLObject v_term = dictionary.dictionary_lookup_without_values( owl_importer2_terms( importer ), rdf_node, UNPROVIDED );
    if( NIL != v_term )
    {
      return v_term;
    }
    if( NIL != rdf_uri.rdf_uri_p( rdf_node ) )
    {
      v_term = owl_importer2_find_or_create_term_for_uri( importer, rdf_node, mark_term_in_ontologyP );
    }
    else if( NIL != rdf_literal.rdf_literal_p( rdf_node ) )
    {
      v_term = rdf_utilities.rdf_find_or_create_term_for_literal( rdf_node );
    }
    else if( NIL != rdf_blank_node.rdf_blank_node_p( rdf_node ) )
    {
      v_term = owl_find_or_create_term_for_blank_node( rdf_node, importer );
      owl_importer2_mark_term_in_ontology( importer, v_term, UNPROVIDED );
      mark_term_in_ontologyP = NIL;
    }
    else
    {
      Errors.error( $str172$Can_t_find_or_create_term_for__S, rdf_node );
    }
    if( NIL != mark_term_in_ontologyP )
    {
      owl_importer2_mark_term_in_ontology( importer, v_term, UNPROVIDED );
    }
    if( NIL == rdf_utilities.rdf_list_p( rdf_node, owl_importer2_graph( importer ) ) )
    {
      owl_importer2_assert_subject_triples( importer, rdf_node );
    }
    dictionary.dictionary_enter( owl_importer2_terms( importer ), rdf_node, v_term );
    return v_term;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 33267L)
  public static SubLObject owl_importer2_find_or_create_term_for_uri(final SubLObject importer, final SubLObject uri, SubLObject mark_term_in_ontologyP)
  {
    if( mark_term_in_ontologyP == UNPROVIDED )
    {
      mark_term_in_ontologyP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != rdf_uri.rdf_uri_p( uri ) : uri;
    final SubLObject ontology_uri_string = owl_importer2_get_option( importer, $kw11$ONTOLOGY_URI, UNPROVIDED );
    SubLObject v_term = NIL;
    if( NIL != owl_importer2_get_option( importer, $kw173$USE_GENLS_FOR_RDFS_SUBCLASS_, UNPROVIDED ) && NIL != rdf_graph.rdf_nodes_equalP( uri, rdf_graph.get_known_uri( $str174$rdfs_subClassOf ) ) )
    {
      return $const175$genls;
    }
    if( NIL != owl_utilities.implementation_uriP( uri ) )
    {
      return rdf_utilities.rdf_find_or_create_term_for_uri( uri );
    }
    if( NIL != owl_cycl_to_xml.cyc_uri_p( uri ) )
    {
      v_term = cyc_uri_to_term( uri );
      if( NIL == forts.fort_p( v_term ) )
      {
        Errors.warn( $str176$Could_not_find_Cyc_term_for_URI__, dwim_rdf_uri_string( uri ) );
      }
    }
    if( NIL == forts.fort_p( v_term ) && NIL != string_utilities.starts_with( rdf_uri.rdf_uri_utf8_string( uri ), ontology_uri_string ) )
    {
      v_term = owl_importer2_find_or_create_uri_term( importer, uri, UNPROVIDED, UNPROVIDED );
    }
    if( NIL == forts.fort_p( v_term ) && NIL != owl_importer2_get_option( importer, $kw177$USE_NAMESPACE_PREFIXES_AS_CONSTANT_PREFIXES, UNPROVIDED ) )
    {
      thread.resetMultipleValues();
      final SubLObject found_prefix = owl_utilities.rdf_abbrev_prefix_and_name_for_uri( rdf_graph.rdf_graph_prefix_map( owl_importer2_graph( importer ) ), uri );
      final SubLObject found_name = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != string_utilities.non_empty_string_p( found_prefix ) && NIL != string_utilities.non_empty_string_p( found_name ) )
      {
        v_term = owl_importer2_find_or_create_uri_term( importer, uri, found_prefix, found_name );
      }
    }
    if( NIL != mark_term_in_ontologyP && NIL != forts.fort_p( v_term ) )
    {
      owl_importer2_mark_term_in_ontology( importer, v_term, uri );
    }
    if( NIL == forts.fort_p( v_term ) )
    {
      v_term = rdf_utilities.rdf_find_or_create_term_for_uri( uri );
    }
    return v_term;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 35122L)
  public static SubLObject owl_importer2_mark_term_in_ontology(final SubLObject importer, final SubLObject v_term, SubLObject uri)
  {
    if( uri == UNPROVIDED )
    {
      uri = NIL;
    }
    assert NIL != owl_importer2_p( importer ) : importer;
    if( NIL != uri && !assertionsDisabledInClass && NIL == rdf_uri.rdf_uri_p( uri ) )
    {
      throw new AssertionError( uri );
    }
    final SubLObject ontology_term = owl_importer2_get_option( importer, $kw38$ONTOLOGY_TERM, UNPROVIDED );
    final SubLObject ontology_mt = owl_importer2_get_option( importer, $kw39$ONTOLOGY_MT, UNPROVIDED );
    final SubLObject possibly_abbreviated_uri_string = ( NIL != uri ) ? owl_importer2_possibly_abbreviate_uri( importer, uri ) : NIL;
    owl_utilities.owl_assert_wff( ConsesLow.list( $const178$quotedIsa, v_term, ConsesLow.list( $const179$TermFromOntologyFn, ontology_term ) ), $const180$BookkeepingMt, v_term, UNPROVIDED, UNPROVIDED );
    if( NIL != string_utilities.non_empty_string_p( possibly_abbreviated_uri_string ) )
    {
      owl_utilities.owl_assert_wff( ConsesLow.list( $const181$synonymousExternalConcept, v_term, ontology_term, possibly_abbreviated_uri_string ), ontology_mt, v_term, UNPROVIDED, UNPROVIDED );
    }
    return v_term;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 35943L)
  public static SubLObject owl_importer2_find_or_create_uri_term(final SubLObject importer, final SubLObject uri, SubLObject prefix, SubLObject name)
  {
    if( prefix == UNPROVIDED )
    {
      prefix = NIL;
    }
    if( name == UNPROVIDED )
    {
      name = NIL;
    }
    assert NIL != owl_importer2_p( importer ) : importer;
    assert NIL != rdf_uri.rdf_uri_p( uri ) : uri;
    final SubLObject uri_string = dwim_rdf_uri_string( uri );
    final SubLObject ontology_term = owl_importer2_get_option( importer, $kw38$ONTOLOGY_TERM, UNPROVIDED );
    final SubLObject ontology_mt = owl_importer2_get_option( importer, $kw39$ONTOLOGY_MT, UNPROVIDED );
    SubLObject v_term = kb_mapping_utilities.fpred_value_in_any_mt( uri_string, $const182$rdfURI, TWO_INTEGER, ONE_INTEGER, UNPROVIDED );
    if( NIL == forts.fort_p( v_term ) )
    {
      final SubLObject rdf_uri_local_part = rdf_uri.rdf_uri_local_part( uri );
      if( NIL != string_utilities.empty_string_p( rdf_uri_local_part ) )
      {
        return ontology_term;
      }
      SubLObject suffix = owl_importer2_get_option( importer, $kw31$CONSTANT_SUFFIX, UNPROVIDED );
      if( NIL == string_utilities.non_empty_string_p( prefix ) )
      {
        prefix = owl_importer2_get_option( importer, $kw30$CONSTANT_PREFIX, UNPROVIDED );
      }
      if( NIL != string_utilities.non_empty_string_p( prefix ) && NIL == string_utilities.ends_with( prefix, $str32$_, UNPROVIDED ) )
      {
        prefix = Sequences.cconcatenate( prefix, $str32$_ );
      }
      if( !prefix.isString() )
      {
        prefix = $str10$;
      }
      if( !suffix.isString() )
      {
        suffix = $str10$;
      }
      if( NIL == string_utilities.non_empty_string_p( name ) )
      {
        name = rdf_uri_local_part;
      }
      if( NIL != owl_importer2_get_option( importer, $kw183$USE_RDFS_LABEL_FOR_CONSTANT_NAME_, UNPROVIDED ) )
      {
        final SubLObject v_graph = owl_importer2_graph( importer );
        final SubLObject label_triple = rdf_graph.rdf_graph_find_subject_triples( v_graph, uri, rdf_graph.get_known_uri( $str184$rdfs_label ) ).first();
        final SubLObject label_node = ( NIL != rdf_triple.rdf_triple_p( label_triple, UNPROVIDED ) ) ? rdf_triple.rdf_triple_object( label_triple ) : NIL;
        final SubLObject label_string = ( NIL != rdf_literal.rdf_literal_p( label_node ) ) ? rdf_literal.rdf_literal_utf8_lexical_form( label_node ) : NIL;
        if( NIL != string_utilities.non_empty_string_p( label_string ) )
        {
          name = string_utilities.make_valid_constant_name( label_string, rdf_graph.rdf_graph_find_triple( v_graph, uri, rdf_graph.get_known_uri( $str185$rdf_type ), rdf_graph.get_known_uri( $str186$owl_Class ) ) );
        }
      }
      if( NIL != string_utilities.non_empty_string_p( suffix ) )
      {
        name = Sequences.cconcatenate( name, suffix );
      }
      if( NIL != string_utilities.empty_string_p( prefix ) && NIL != string_utilities.empty_string_p( suffix ) )
      {
        v_term = rdf_utilities.rdf_find_or_create_term_for_uri( uri );
      }
      else
      {
        v_term = owl_utilities.owl_create_wff( name, NIL, ontology_mt, prefix, NIL, UNPROVIDED );
      }
      if( NIL != forts.fort_p( v_term ) )
      {
        owl_utilities.owl_assert_wff( ConsesLow.list( $const182$rdfURI, v_term, dwim_rdf_uri_string( uri ) ), ontology_mt, v_term, UNPROVIDED, UNPROVIDED );
      }
    }
    return ( NIL != narts_high.naut_p( v_term ) ) ? narts_high.find_nart( v_term ) : v_term;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 38467L)
  public static SubLObject owl_importer2_possibly_abbreviate_uri(final SubLObject importer, final SubLObject uri)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != owl_importer2_p( importer ) : importer;
    assert NIL != rdf_uri.rdf_uri_p( uri ) : uri;
    final SubLObject ontology_uri = owl_importer2_get_option( importer, $kw11$ONTOLOGY_URI, UNPROVIDED );
    final SubLObject synonymous_concept_prefix = owl_importer2_get_option( importer, $kw9$SYNONYMOUS_CONCEPT_PREFIX, UNPROVIDED );
    if( NIL != string_utilities.substringP( rdf_uri.rdf_uri_base_uri( uri ), ontology_uri, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      if( NIL != string_utilities.empty_string_p( synonymous_concept_prefix ) )
      {
        return rdf_uri.rdf_uri_local_part( uri );
      }
      if( NIL != string_utilities.non_empty_string_p( synonymous_concept_prefix ) )
      {
        return Sequences.cconcatenate( synonymous_concept_prefix, new SubLObject[] { $str32$_, rdf_uri.rdf_uri_local_part( uri )
        } );
      }
      return rdf_uri.rdf_uri_utf8_string( uri );
    }
    else
    {
      if( NIL != owl_cycl_to_xml.cyc_uri_p( uri ) )
      {
        return rdf_uri.rdf_uri_utf8_string( uri );
      }
      if( T != owl_importer2_get_option( importer, $kw9$SYNONYMOUS_CONCEPT_PREFIX, UNPROVIDED ) )
      {
        thread.resetMultipleValues();
        final SubLObject found_prefix = owl_utilities.rdf_abbrev_prefix_and_name_for_uri( rdf_graph.rdf_graph_prefix_map( owl_importer2_graph( importer ) ), uri );
        final SubLObject found_name = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL != string_utilities.non_empty_string_p( found_prefix ) && NIL != string_utilities.non_empty_string_p( found_name ) )
        {
          return Sequences.cconcatenate( found_prefix, new SubLObject[] { $str32$_, found_name
          } );
        }
      }
      return rdf_uri.rdf_uri_utf8_string( uri );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 39751L)
  public static SubLObject cyc_uri_to_term(final SubLObject uri)
  {
    assert NIL != owl_cycl_to_xml.cyc_uri_p( uri ) : uri;
    final SubLObject term_id_string = ( NIL != rdf_uri.rdf_uri_p( uri ) ) ? rdf_uri.rdf_uri_local_part( uri ) : rdf_uri.rdf_uri_local_part( rdf_uri.get_rdf_uri( uri, UNPROVIDED, UNPROVIDED ) );
    SubLObject v_term = NIL;
    v_term = kb_utilities.maybe_find_object_by_compact_hl_external_id_string( term_id_string );
    if( NIL != forts.fort_p( v_term ) )
    {
      return v_term;
    }
    v_term = constants_high.find_constant( term_id_string );
    if( NIL != forts.fort_p( v_term ) )
    {
      return v_term;
    }
    v_term = constants_high.find_constant( string_utilities.char_subst( Characters.CHAR_underbar, Characters.CHAR_hyphen, term_id_string ) );
    if( NIL != forts.fort_p( v_term ) )
    {
      return v_term;
    }
    v_term = constants_high.find_constant( string_utilities.char_subst( Characters.CHAR_hyphen, Characters.CHAR_underbar, term_id_string ) );
    if( NIL != forts.fort_p( v_term ) )
    {
      return v_term;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 40549L)
  public static SubLObject dwim_rdf_uri_string(final SubLObject uri)
  {
    return uri.isString() ? uri : ( ( NIL != rdf_uri.rdf_uri_p( uri ) ) ? rdf_uri.rdf_uri_utf8_string( uri ) : $str10$ );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 40749L)
  public static SubLObject owl_find_or_create_term_for_blank_node(final SubLObject node, final SubLObject importer)
  {
    final SubLObject v_graph = owl_importer2_graph( importer );
    final SubLObject cyclist = owl_importer2_cyclist( importer );
    SubLObject result = NIL;
    if( NIL != rdf_utilities.rdf_list_p( node, v_graph ) )
    {
      final SubLObject v_term = owl_importer2_find_or_create_term_for_list_node( importer, node );
      SubLObject cdolist_list_var = rdf_utilities.rdf_list_nodes( node, v_graph );
      SubLObject item = NIL;
      item = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        owl_importer2_assert_subject_triples( importer, item );
        cdolist_list_var = cdolist_list_var.rest();
        item = cdolist_list_var.first();
      }
      result = v_term;
    }
    else if( NIL != owl_utilities.owl_intersection_of_node_p( node, v_graph ) )
    {
      final SubLObject intersection_objects = rdf_graph.rdf_graph_find_objects( v_graph, node, owl_utilities.owl_expanded_name( $str188$intersectionOf ) );
      SubLObject intersection_terms = NIL;
      SubLObject cdolist_list_var2 = intersection_objects;
      SubLObject intersection_object = NIL;
      intersection_object = cdolist_list_var2.first();
      while ( NIL != cdolist_list_var2)
      {
        SubLObject cdolist_list_var_$2 = el_utilities.el_list_items( owl_importer2_find_or_create_term( importer, intersection_object, UNPROVIDED ) );
        SubLObject v_term2 = NIL;
        v_term2 = cdolist_list_var_$2.first();
        while ( NIL != cdolist_list_var_$2)
        {
          final SubLObject item_var = v_term2;
          if( NIL == conses_high.member( item_var, intersection_terms, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
          {
            intersection_terms = ConsesLow.cons( item_var, intersection_terms );
          }
          cdolist_list_var_$2 = cdolist_list_var_$2.rest();
          v_term2 = cdolist_list_var_$2.first();
        }
        cdolist_list_var2 = cdolist_list_var2.rest();
        intersection_object = cdolist_list_var2.first();
      }
      intersection_terms = Sequences.nreverse( intersection_terms );
      result = ConsesLow.list( $const189$CollectionIntersectionFn, reader.bq_cons( $const190$TheSet, ConsesLow.append( intersection_terms, NIL ) ) );
    }
    else if( NIL != owl_utilities.owl_union_of_node_p( node, v_graph ) )
    {
      final SubLObject union_objects = rdf_graph.rdf_graph_find_objects( v_graph, node, owl_utilities.owl_expanded_name( $str191$unionOf ) );
      SubLObject union_terms = NIL;
      SubLObject cdolist_list_var2 = union_objects;
      SubLObject union_object = NIL;
      union_object = cdolist_list_var2.first();
      while ( NIL != cdolist_list_var2)
      {
        SubLObject cdolist_list_var_$3 = el_utilities.el_list_items( owl_importer2_find_or_create_term( importer, union_object, UNPROVIDED ) );
        SubLObject v_term2 = NIL;
        v_term2 = cdolist_list_var_$3.first();
        while ( NIL != cdolist_list_var_$3)
        {
          final SubLObject item_var = v_term2;
          if( NIL == conses_high.member( item_var, union_terms, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
          {
            union_terms = ConsesLow.cons( item_var, union_terms );
          }
          cdolist_list_var_$3 = cdolist_list_var_$3.rest();
          v_term2 = cdolist_list_var_$3.first();
        }
        cdolist_list_var2 = cdolist_list_var2.rest();
        union_object = cdolist_list_var2.first();
      }
      union_terms = Sequences.nreverse( union_terms );
      result = ConsesLow.list( $const192$CollectionUnionFn, reader.bq_cons( $const190$TheSet, ConsesLow.append( union_terms, NIL ) ) );
    }
    else if( NIL != owl_utilities.owl_complement_of_node_p( node, v_graph ) )
    {
      final SubLObject complement_object = rdf_graph.rdf_graph_find_objects( v_graph, node, owl_utilities.owl_expanded_name( $str193$complementOf ) ).first();
      final SubLObject complement_term = owl_importer2_find_or_create_term( importer, complement_object, UNPROVIDED );
      result = ConsesLow.list( $const194$CollectionDifferenceFn, $const195$Thing, complement_term );
    }
    else if( NIL != owl_utilities.owl_restriction_node_p( node, v_graph ) )
    {
      final SubLObject subject_triples = rdf_graph.rdf_graph_find_subject_triples( v_graph, node, UNPROVIDED );
      SubLObject on_property_triple = NIL;
      SubLObject type_triple = NIL;
      SubLObject value_constraint_triple = NIL;
      SubLObject cardinality_triple = NIL;
      SubLObject subclassof_triple = NIL;
      SubLObject other_triples = NIL;
      SubLObject cdolist_list_var3 = subject_triples;
      SubLObject triple = NIL;
      triple = cdolist_list_var3.first();
      while ( NIL != cdolist_list_var3)
      {
        if( NIL != rdf_graph.rdf_nodes_equalP( rdf_triple.rdf_triple_predicate( triple ), rdf_uri.get_rdf_uri( owl_utilities.owl_expanded_name( $str196$onProperty ), UNPROVIDED, UNPROVIDED ) ) )
        {
          on_property_triple = triple;
        }
        else if( NIL != rdf_graph.rdf_nodes_equalP( rdf_triple.rdf_triple_predicate( triple ), rdf_uri.get_rdf_uri( rdf_utilities.rdf_expanded_name( $str88$type ), UNPROVIDED, UNPROVIDED ) ) )
        {
          type_triple = triple;
        }
        else if( NIL != rdf_graph.rdf_nodes_equalP( rdf_triple.rdf_triple_predicate( triple ), rdf_uri.get_rdf_uri( owl_utilities.owl_expanded_name( $str197$allValuesFrom ), UNPROVIDED, UNPROVIDED ) ) )
        {
          value_constraint_triple = triple;
        }
        else if( NIL != rdf_graph.rdf_nodes_equalP( rdf_triple.rdf_triple_predicate( triple ), rdf_uri.get_rdf_uri( owl_utilities.owl_expanded_name( $str198$hasValue ), UNPROVIDED, UNPROVIDED ) ) )
        {
          value_constraint_triple = triple;
        }
        else if( NIL != rdf_graph.rdf_nodes_equalP( rdf_triple.rdf_triple_predicate( triple ), rdf_uri.get_rdf_uri( owl_utilities.owl_expanded_name( $str199$someValuesFrom ), UNPROVIDED, UNPROVIDED ) ) )
        {
          value_constraint_triple = triple;
        }
        else if( NIL != rdf_graph.rdf_nodes_equalP( rdf_triple.rdf_triple_predicate( triple ), rdf_uri.get_rdf_uri( owl_utilities.owl_expanded_name( $str200$valuesFrom ), UNPROVIDED, UNPROVIDED ) ) )
        {
          value_constraint_triple = triple;
        }
        else if( NIL != rdf_graph.rdf_nodes_equalP( rdf_triple.rdf_triple_predicate( triple ), rdf_uri.get_rdf_uri( rdf_utilities.rdfs_expanded_name( $str201$subClassOf ), UNPROVIDED, UNPROVIDED ) ) )
        {
          subclassof_triple = triple;
        }
        else if( NIL != rdf_graph.rdf_nodes_equalP( rdf_triple.rdf_triple_predicate( triple ), rdf_uri.get_rdf_uri( owl_utilities.owl_expanded_name( $str202$cardinality ), UNPROVIDED, UNPROVIDED ) ) )
        {
          cardinality_triple = triple;
        }
        else if( NIL != rdf_graph.rdf_nodes_equalP( rdf_triple.rdf_triple_predicate( triple ), rdf_uri.get_rdf_uri( owl_utilities.owl_expanded_name( $str203$minCardinality ), UNPROVIDED, UNPROVIDED ) ) )
        {
          cardinality_triple = triple;
        }
        else if( NIL != rdf_graph.rdf_nodes_equalP( rdf_triple.rdf_triple_predicate( triple ), rdf_uri.get_rdf_uri( owl_utilities.owl_expanded_name( $str204$maxCardinality ), UNPROVIDED, UNPROVIDED ) ) )
        {
          cardinality_triple = triple;
        }
        else
        {
          other_triples = ConsesLow.cons( triple, other_triples );
        }
        cdolist_list_var3 = cdolist_list_var3.rest();
        triple = cdolist_list_var3.first();
      }
      final SubLObject only_assert_restrictions_as_rmp_gafsP = owl_importer2_get_option( importer, $kw205$ONLY_ASSERT_RESTRICTIONS_AS_RMP_GAFS_, UNPROVIDED );
      final SubLObject value_constraint_node = ( NIL != value_constraint_triple ) ? rdf_triple.rdf_triple_predicate( value_constraint_triple ) : NIL;
      final SubLObject cardinality_pred_node = ( NIL != cardinality_triple ) ? rdf_triple.rdf_triple_predicate( cardinality_triple ) : NIL;
      final SubLObject cardinality_value = ( NIL != cardinality_triple ) ? owl_importer2_find_or_create_term( importer, rdf_triple.rdf_triple_object( cardinality_triple ), UNPROVIDED ) : NIL;
      final SubLObject pred = owl_importer2_find_or_create_term( importer, rdf_triple.rdf_triple_object( on_property_triple ), UNPROVIDED );
      final SubLObject target = ( NIL != value_constraint_triple ) ? owl_importer2_find_or_create_term( importer, rdf_triple.rdf_triple_object( value_constraint_triple ), UNPROVIDED ) : NIL;
      final SubLObject col1 = ( NIL != subclassof_triple ) ? owl_importer2_find_or_create_term( importer, rdf_triple.rdf_triple_object( subclassof_triple ), UNPROVIDED ) : $const195$Thing;
      if( NIL != rdf_graph.rdf_nodes_equalP( value_constraint_node, rdf_graph.rdf_graph_get_uri( v_graph, owl_utilities.owl_expanded_name( $str197$allValuesFrom ), UNPROVIDED, UNPROVIDED ) ) )
      {
        if( NIL != only_assert_restrictions_as_rmp_gafsP )
        {
          result = owl_importer2_assert_rmp_gaf_directly( importer, node, $const206$relationAllOnly, pred, target, UNPROVIDED );
        }
        else
        {
          result = ConsesLow.list( $const207$CollectionSubsetFn, col1, ConsesLow.list( $const208$TheSetOf, $sym209$_X, ConsesLow.list( $const210$relationInstanceOnly, pred, $sym209$_X, target ) ) );
        }
      }
      else if( NIL != rdf_graph.rdf_nodes_equalP( value_constraint_node, rdf_graph.rdf_graph_get_uri( v_graph, owl_utilities.owl_expanded_name( $str199$someValuesFrom ), UNPROVIDED, UNPROVIDED ) ) )
      {
        if( NIL != only_assert_restrictions_as_rmp_gafsP )
        {
          result = owl_importer2_assert_rmp_gaf_directly( importer, node, $const211$relationAllExists, pred, target, UNPROVIDED );
        }
        else
        {
          result = ConsesLow.list( $const207$CollectionSubsetFn, col1, ConsesLow.list( $const208$TheSetOf, $sym209$_X, ConsesLow.list( $const212$relationInstanceExists, pred, $sym209$_X, target ) ) );
        }
      }
      else if( NIL != rdf_graph.rdf_nodes_equalP( value_constraint_node, rdf_graph.rdf_graph_get_uri( v_graph, owl_utilities.owl_expanded_name( $str198$hasValue ), UNPROVIDED, UNPROVIDED ) ) )
      {
        if( NIL != only_assert_restrictions_as_rmp_gafsP )
        {
          result = owl_importer2_assert_rmp_gaf_directly( importer, node, $const213$relationAllInstance, pred, target, UNPROVIDED );
        }
        else
        {
          result = ConsesLow.list( $const207$CollectionSubsetFn, col1, ConsesLow.list( $const208$TheSetOf, $sym209$_X, ConsesLow.list( pred, $sym209$_X, target ) ) );
        }
      }
      else if( NIL != rdf_graph.rdf_nodes_equalP( cardinality_pred_node, rdf_graph.rdf_graph_get_uri( v_graph, owl_utilities.owl_expanded_name( $str204$maxCardinality ), UNPROVIDED, UNPROVIDED ) ) )
      {
        final SubLObject col2 = ( NIL != value_constraint_node && NIL != rdf_graph.rdf_nodes_equalP( value_constraint_node, rdf_graph.rdf_graph_get_uri( v_graph, owl_utilities.owl_expanded_name( $str200$valuesFrom ),
            UNPROVIDED, UNPROVIDED ) ) ) ? target : $const195$Thing;
        if( NIL != only_assert_restrictions_as_rmp_gafsP )
        {
          result = owl_importer2_assert_rmp_gaf_directly( importer, node, $const214$relationAllExistsMax, pred, target, cardinality_value );
        }
        else
        {
          result = ConsesLow.list( $const207$CollectionSubsetFn, col1, ConsesLow.list( $const208$TheSetOf, $sym209$_X, ConsesLow.list( $const215$relationInstanceExistsMax, pred, $sym209$_X, col2, cardinality_value ) ) );
        }
      }
      else if( NIL != rdf_graph.rdf_nodes_equalP( cardinality_pred_node, rdf_graph.rdf_graph_get_uri( v_graph, owl_utilities.owl_expanded_name( $str203$minCardinality ), UNPROVIDED, UNPROVIDED ) ) )
      {
        final SubLObject col2 = ( NIL != value_constraint_node && NIL != rdf_graph.rdf_nodes_equalP( value_constraint_node, rdf_graph.rdf_graph_get_uri( v_graph, owl_utilities.owl_expanded_name( $str200$valuesFrom ),
            UNPROVIDED, UNPROVIDED ) ) ) ? target : $const195$Thing;
        if( NIL != only_assert_restrictions_as_rmp_gafsP )
        {
          result = owl_importer2_assert_rmp_gaf_directly( importer, node, $const216$relationAllExistsMin, pred, target, cardinality_value );
        }
        else
        {
          result = ConsesLow.list( $const207$CollectionSubsetFn, col1, ConsesLow.list( $const208$TheSetOf, $sym209$_X, ConsesLow.list( $const217$relationInstanceExistsMin, pred, $sym209$_X, col2, cardinality_value ) ) );
        }
      }
      else if( NIL != rdf_graph.rdf_nodes_equalP( cardinality_pred_node, rdf_graph.rdf_graph_get_uri( v_graph, owl_utilities.owl_expanded_name( $str202$cardinality ), UNPROVIDED, UNPROVIDED ) ) )
      {
        final SubLObject col2 = ( NIL != value_constraint_node && NIL != rdf_graph.rdf_nodes_equalP( value_constraint_node, rdf_graph.rdf_graph_get_uri( v_graph, owl_utilities.owl_expanded_name( $str200$valuesFrom ),
            UNPROVIDED, UNPROVIDED ) ) ) ? target : $const195$Thing;
        if( NIL != only_assert_restrictions_as_rmp_gafsP )
        {
          result = owl_importer2_assert_rmp_gaf_directly( importer, node, $const218$relationAllExistsCount, pred, target, cardinality_value );
        }
        else
        {
          result = ConsesLow.list( $const207$CollectionSubsetFn, col1, ConsesLow.list( $const208$TheSetOf, $sym209$_X, ConsesLow.list( $const219$relationInstanceExistsCount, pred, $sym209$_X, col2,
              cardinality_value ) ) );
        }
      }
      else
      {
        Errors.sublisp_break( $str220$restriction_not_handled_yet___A__, new SubLObject[] { subject_triples, on_property_triple, type_triple, value_constraint_triple
        } );
      }
    }
    else if( NIL != owl_utilities.owl_one_of_node_p( node, v_graph ) )
    {
      final SubLObject one_of_triple = rdf_graph.rdf_graph_find_subject_triples( v_graph, node, owl_utilities.owl_expanded_name( $str221$oneOf ) ).first();
      final SubLObject cols_list = owl_importer2_find_or_create_term( importer, rdf_triple.rdf_triple_object( one_of_triple ), UNPROVIDED );
      result = reader.bq_cons( $const222$TheCollection, ConsesLow.append( el_utilities.el_list_items( cols_list ), NIL ) );
    }
    else
    {
      final SubLObject v_term = owl_utilities.owl_create_wff( $str223$AnonymousOWLTerm, NIL, $const224$UniversalVocabularyMt, $str10$, T, cyclist );
      owl_utilities.owl_assert_wff( el_utilities.make_binary_formula( $const178$quotedIsa, v_term, $const225$IndeterminateTerm ), $const224$UniversalVocabularyMt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      result = v_term;
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 49629L)
  public static SubLObject owl_importer2_assert_rmp_gaf_directly(final SubLObject importer, final SubLObject node, final SubLObject rmp_pred, final SubLObject pred, final SubLObject target, SubLObject cardinality_value)
  {
    if( cardinality_value == UNPROVIDED )
    {
      cardinality_value = NIL;
    }
    final SubLObject v_graph = owl_importer2_graph( importer );
    final SubLObject ontology_mt = owl_importer2_get_option( importer, $kw39$ONTOLOGY_MT, UNPROVIDED );
    final SubLObject spec_nodes = Mapping.mapcar( $sym226$RDF_TRIPLE_SUBJECT, rdf_graph.rdf_graph_find_object_triples( v_graph, node, rdf_graph.rdf_graph_get_uri( v_graph, rdf_utilities.rdfs_expanded_name(
        $str201$subClassOf ), UNPROVIDED, UNPROVIDED ) ) );
    if( NIL == spec_nodes )
    {
      Errors.warn( $str227$___A_was_not_the_object_of_any_rd, node );
      return NIL;
    }
    SubLObject cdolist_list_var = spec_nodes;
    SubLObject spec_node = NIL;
    spec_node = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject spec_term = owl_importer2_find_or_create_term( importer, spec_node, UNPROVIDED );
      if( NIL == cardinality_value )
      {
        owl_importer2_assert_wff( importer, el_utilities.make_ternary_formula( rmp_pred, pred, spec_term, target ), ontology_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      else
      {
        owl_importer2_assert_wff( importer, el_utilities.make_quaternary_formula( rmp_pred, pred, spec_term, target, cardinality_value ), ontology_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      cdolist_list_var = cdolist_list_var.rest();
      spec_node = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 50562L)
  public static SubLObject owl_importer2_create_wff(final SubLObject importer, final SubLObject name, final SubLObject isas, final SubLObject defining_mt, final SubLObject prefix, final SubLObject capitalizeP,
      SubLObject cyclist)
  {
    if( cyclist == UNPROVIDED )
    {
      cyclist = operation_communication.the_cyclist();
    }
    return owl_utilities.owl_create_wff( name, isas, defining_mt, prefix, capitalizeP, cyclist );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 50785L)
  public static SubLObject owl_importer2_find_or_create_nart(final SubLObject importer, final SubLObject nart, final SubLObject assume_all_reifiableP)
  {
    return czer_main.cyc_find_or_create_nart( nart, assume_all_reifiableP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 50956L)
  public static SubLObject owl_importer2_assert_wff(final SubLObject importer, final SubLObject formula, final SubLObject mt, SubLObject import_term, SubLObject cyclist, SubLObject utf_8P)
  {
    if( import_term == UNPROVIDED )
    {
      import_term = NIL;
    }
    if( cyclist == UNPROVIDED )
    {
      cyclist = operation_communication.the_cyclist();
    }
    if( utf_8P == UNPROVIDED )
    {
      utf_8P = T;
    }
    return owl_utilities.owl_assert_wff( formula, mt, import_term, cyclist, utf_8P );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 51161L)
  public static SubLObject owl_import_file_verify(final SubLObject filename, final SubLObject expected_constant_count, final SubLObject expected_nart_count, final SubLObject expected_assertion_count,
      SubLObject importer_options)
  {
    if( importer_options == UNPROVIDED )
    {
      importer_options = NIL;
    }
    final SubLObject importer = owl_import_file( filename, importer_options );
    return importer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-importer2.lisp", position = 51577L)
  public static SubLObject normalize_rdf_graph_by_eliminating_blank_node(final SubLObject v_graph, final SubLObject old_predicate_node, final SubLObject second_predicate_node, final SubLObject new_predicate_node,
      SubLObject progress_message)
  {
    if( progress_message == UNPROVIDED )
    {
      progress_message = $str228$Eliminating_blank_nodes___;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject new_predicate_triple_addedP = NIL;
    final SubLObject list_var = rdf_graph.rdf_graph_find_predicate_triples( v_graph, old_predicate_node );
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
      utilities_macros.$progress_note$.bind( ( NIL != progress_message ) ? progress_message : $str229$cdolist, thread );
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
        SubLObject triple = NIL;
        triple = csome_list_var.first();
        while ( NIL != csome_list_var)
        {
          final SubLObject subject_node = rdf_triple.rdf_triple_subject( triple );
          final SubLObject blank_node = rdf_triple.rdf_triple_object( triple );
          final SubLObject object_triple = rdf_graph.rdf_graph_find_subject_triples( v_graph, blank_node, second_predicate_node ).first();
          final SubLObject object_node = ( NIL != rdf_triple.rdf_triple_p( object_triple, UNPROVIDED ) ) ? rdf_triple.rdf_triple_object( object_triple ) : NIL;
          if( NIL != rdf_graph.valid_rdf_object_p( object_node ) )
          {
            new_predicate_triple_addedP = T;
            rdf_utilities.rdf_graph_remove_node( v_graph, blank_node );
            rdf_graph.rdf_graph_add_triple( v_graph, subject_node, new_predicate_node, object_node );
          }
          utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
          utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
          csome_list_var = csome_list_var.rest();
          triple = csome_list_var.first();
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$4, thread );
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
    if( NIL != new_predicate_triple_addedP )
    {
      final SubLObject possible_domain_triple = rdf_graph.rdf_graph_find_subject_triples( v_graph, old_predicate_node, rdf_graph.get_known_uri( $str230$rdfs_domain ) ).first();
      final SubLObject domain_node = ( NIL != rdf_triple.rdf_triple_p( possible_domain_triple, UNPROVIDED ) ) ? rdf_triple.rdf_triple_object( possible_domain_triple ) : rdf_graph.get_known_uri( $str231$owl_Thing );
      final SubLObject possible_range_triple = rdf_graph.rdf_graph_find_subject_triples( v_graph, old_predicate_node, rdf_graph.get_known_uri( $str232$rdfs_range ) ).first();
      final SubLObject range_node = ( NIL != rdf_triple.rdf_triple_p( possible_range_triple, UNPROVIDED ) ) ? rdf_triple.rdf_triple_object( possible_range_triple ) : rdf_graph.get_known_uri( $str231$owl_Thing );
      final SubLObject type_nodes = Mapping.mapcar( $sym233$RDF_TRIPLE_OBJECT, rdf_graph.rdf_graph_find_subject_triples( v_graph, second_predicate_node, rdf_graph.get_known_uri( $str185$rdf_type ) ) );
      if( NIL != type_nodes )
      {
        SubLObject cdolist_list_var = type_nodes;
        SubLObject type_node = NIL;
        type_node = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          rdf_graph.rdf_graph_add_triple( v_graph, new_predicate_node, rdf_graph.get_known_uri( $str185$rdf_type ), type_node );
          cdolist_list_var = cdolist_list_var.rest();
          type_node = cdolist_list_var.first();
        }
      }
      else
      {
        rdf_graph.rdf_graph_add_triple( v_graph, new_predicate_node, rdf_graph.get_known_uri( $str185$rdf_type ), rdf_graph.get_known_uri( $str234$rdf_Property ) );
      }
      rdf_graph.rdf_graph_add_triple( v_graph, new_predicate_node, rdf_graph.get_known_uri( $str230$rdfs_domain ), domain_node );
      rdf_graph.rdf_graph_add_triple( v_graph, new_predicate_node, rdf_graph.get_known_uri( $str232$rdfs_range ), range_node );
    }
    rdf_utilities.rdf_graph_remove_node( v_graph, old_predicate_node );
    return new_predicate_triple_addedP;
  }

  public static SubLObject declare_owl_importer2_file()
  {
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "show_owl_import_usages", "SHOW-OWL-IMPORT-USAGES", 0, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "owl_import_uri", "OWL-IMPORT-URI", 1, 1, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "owl_import_file", "OWL-IMPORT-FILE", 1, 1, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "owl_import_uri_from_file", "OWL-IMPORT-URI-FROM-FILE", 2, 1, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "owl_import_file_to_graph_only", "OWL-IMPORT-FILE-TO-GRAPH-ONLY", 1, 1, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "owl_import_xml_graph_from_file", "OWL-IMPORT-XML-GRAPH-FROM-FILE", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "owl_import_with_importer", "OWL-IMPORT-WITH-IMPORTER", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "determine_uri_prefix_from_prefix_map", "DETERMINE-URI-PREFIX-FROM-PREFIX-MAP", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "determine_base_uri_from_prefix_map", "DETERMINE-BASE-URI-FROM-PREFIX-MAP", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "validate_owl_import_parameters", "VALIDATE-OWL-IMPORT-PARAMETERS", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "owl_importer_dwim_a_cyclist", "OWL-IMPORTER-DWIM-A-CYCLIST", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "owl_importer_v2_version_number", "OWL-IMPORTER-V2-VERSION-NUMBER", 0, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "import_owl_ontology_from_url", "IMPORT-OWL-ONTOLOGY-FROM-URL", 2, 1, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "import_owl_ontology_from_file", "IMPORT-OWL-ONTOLOGY-FROM-FILE", 2, 2, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "get_owl_importer2_for_url", "GET-OWL-IMPORTER2-FOR-URL", 1, 1, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "get_owl_importer2_for_file", "GET-OWL-IMPORTER2-FOR-FILE", 1, 2, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "find_owl_importer2_by_id", "FIND-OWL-IMPORTER2-BY-ID", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "owl_importer2_version_number", "OWL-IMPORTER2-VERSION-NUMBER", 0, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "import_owl_triples_from_rdf_graph", "IMPORT-OWL-TRIPLES-FROM-RDF-GRAPH", 2, 1, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "cyclist_using_owl_importer2", "CYCLIST-USING-OWL-IMPORTER2", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "owl_importer2_load_graph", "OWL-IMPORTER2-LOAD-GRAPH", 1, 1, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "owl_importer2_load_graph_internal", "OWL-IMPORTER2-LOAD-GRAPH-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "owl_importer2_print_function_trampoline", "OWL-IMPORTER2-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "owl_importer2_p", "OWL-IMPORTER2-P", 1, 0, false );
    new $owl_importer2_p$UnaryFunction();
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "owl_imp2_id", "OWL-IMP2-ID", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "owl_imp2_uri", "OWL-IMP2-URI", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "owl_imp2_file", "OWL-IMP2-FILE", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "owl_imp2_graph", "OWL-IMP2-GRAPH", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "owl_imp2_cyclist", "OWL-IMP2-CYCLIST", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "owl_imp2_import", "OWL-IMP2-IMPORT", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "owl_imp2_ontologies", "OWL-IMP2-ONTOLOGIES", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "owl_imp2_terms", "OWL-IMP2-TERMS", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "owl_imp2_sentences", "OWL-IMP2-SENTENCES", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "owl_imp2_stats", "OWL-IMP2-STATS", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "owl_imp2_options", "OWL-IMP2-OPTIONS", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "owl_imp2_thread", "OWL-IMP2-THREAD", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "_csetf_owl_imp2_id", "_CSETF-OWL-IMP2-ID", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "_csetf_owl_imp2_uri", "_CSETF-OWL-IMP2-URI", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "_csetf_owl_imp2_file", "_CSETF-OWL-IMP2-FILE", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "_csetf_owl_imp2_graph", "_CSETF-OWL-IMP2-GRAPH", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "_csetf_owl_imp2_cyclist", "_CSETF-OWL-IMP2-CYCLIST", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "_csetf_owl_imp2_import", "_CSETF-OWL-IMP2-IMPORT", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "_csetf_owl_imp2_ontologies", "_CSETF-OWL-IMP2-ONTOLOGIES", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "_csetf_owl_imp2_terms", "_CSETF-OWL-IMP2-TERMS", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "_csetf_owl_imp2_sentences", "_CSETF-OWL-IMP2-SENTENCES", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "_csetf_owl_imp2_stats", "_CSETF-OWL-IMP2-STATS", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "_csetf_owl_imp2_options", "_CSETF-OWL-IMP2-OPTIONS", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "_csetf_owl_imp2_thread", "_CSETF-OWL-IMP2-THREAD", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "make_owl_importer2", "MAKE-OWL-IMPORTER2", 0, 1, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "visit_defstruct_owl_importer2", "VISIT-DEFSTRUCT-OWL-IMPORTER2", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "visit_defstruct_object_owl_importer2_method", "VISIT-DEFSTRUCT-OBJECT-OWL-IMPORTER2-METHOD", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "print_owl_importer2", "PRINT-OWL-IMPORTER2", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "new_owl_importer2", "NEW-OWL-IMPORTER2", 2, 2, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "new_owl_importer2_for_graph", "NEW-OWL-IMPORTER2-FOR-GRAPH", 1, 2, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "cyclist_using_owl_importer_v2", "CYCLIST-USING-OWL-IMPORTER-V2", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "next_owl_importer2_id", "NEXT-OWL-IMPORTER2-ID", 0, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "owl_importer2_id_map", "OWL-IMPORTER2-ID-MAP", 0, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "note_owl_importer2_id", "NOTE-OWL-IMPORTER2-ID", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "owl_importer2_id", "OWL-IMPORTER2-ID", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "owl_importer2_uri", "OWL-IMPORTER2-URI", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "owl_importer2_file", "OWL-IMPORTER2-FILE", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "owl_importer2_graph", "OWL-IMPORTER2-GRAPH", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "owl_importer2_set_graph", "OWL-IMPORTER2-SET-GRAPH", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "owl_importer2_cyclist", "OWL-IMPORTER2-CYCLIST", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "owl_importer2_import", "OWL-IMPORTER2-IMPORT", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "owl_importer2_ontologies", "OWL-IMPORTER2-ONTOLOGIES", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "owl_importer2_set_ontologies", "OWL-IMPORTER2-SET-ONTOLOGIES", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "owl_importer2_terms", "OWL-IMPORTER2-TERMS", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "owl_importer2_sentences", "OWL-IMPORTER2-SENTENCES", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "owl_importer2_stats", "OWL-IMPORTER2-STATS", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "owl_importer2_note_stat", "OWL-IMPORTER2-NOTE-STAT", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "owl_importer2_lookup_stat", "OWL-IMPORTER2-LOOKUP-STAT", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "owl_importer2_triple_count", "OWL-IMPORTER2-TRIPLE-COUNT", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "owl_importer2_triples_done", "OWL-IMPORTER2-TRIPLES-DONE", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "owl_importer2_nodes_done", "OWL-IMPORTER2-NODES-DONE", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "owl_importer2_increment_triples_done", "OWL-IMPORTER2-INCREMENT-TRIPLES-DONE", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "owl_importer2_increment_nodes_done", "OWL-IMPORTER2-INCREMENT-NODES-DONE", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "owl_importer2_set_options", "OWL-IMPORTER2-SET-OPTIONS", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "owl_importer2_set_option", "OWL-IMPORTER2-SET-OPTION", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "owl_importer2_set_option_if_not_set", "OWL-IMPORTER2-SET-OPTION-IF-NOT-SET", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "owl_importer2_get_option", "OWL-IMPORTER2-GET-OPTION", 2, 1, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "owl_importer2_options", "OWL-IMPORTER2-OPTIONS", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "owl_importer2_note_thread", "OWL-IMPORTER2-NOTE-THREAD", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "owl_importer2_thread", "OWL-IMPORTER2-THREAD", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "sxhash_owl_importer2_method", "SXHASH-OWL-IMPORTER2-METHOD", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "sxhash_owl_importer2", "SXHASH-OWL-IMPORTER2", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "owl_importer2_assert_triples", "OWL-IMPORTER2-ASSERT-TRIPLES", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "owl_importer2_assert_subject_triples", "OWL-IMPORTER2-ASSERT-SUBJECT-TRIPLES", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "owl_importer2_assert_triple", "OWL-IMPORTER2-ASSERT-TRIPLE", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "owl_importer2_sentence_doneP", "OWL-IMPORTER2-SENTENCE-DONE?", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "owl_importer2_note_sentence_done", "OWL-IMPORTER2-NOTE-SENTENCE-DONE", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "owl_importer2_sentence_for_triple", "OWL-IMPORTER2-SENTENCE-FOR-TRIPLE", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "owl_importer2_find_or_create_term_for_list_node", "OWL-IMPORTER2-FIND-OR-CREATE-TERM-FOR-LIST-NODE", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "owl_importer2_list_node_terms", "OWL-IMPORTER2-LIST-NODE-TERMS", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "owl_importer2_find_or_create_term", "OWL-IMPORTER2-FIND-OR-CREATE-TERM", 2, 1, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "owl_importer2_find_or_create_term_for_uri", "OWL-IMPORTER2-FIND-OR-CREATE-TERM-FOR-URI", 2, 1, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "owl_importer2_mark_term_in_ontology", "OWL-IMPORTER2-MARK-TERM-IN-ONTOLOGY", 2, 1, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "owl_importer2_find_or_create_uri_term", "OWL-IMPORTER2-FIND-OR-CREATE-URI-TERM", 2, 2, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "owl_importer2_possibly_abbreviate_uri", "OWL-IMPORTER2-POSSIBLY-ABBREVIATE-URI", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "cyc_uri_to_term", "CYC-URI-TO-TERM", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "dwim_rdf_uri_string", "DWIM-RDF-URI-STRING", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "owl_find_or_create_term_for_blank_node", "OWL-FIND-OR-CREATE-TERM-FOR-BLANK-NODE", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "owl_importer2_assert_rmp_gaf_directly", "OWL-IMPORTER2-ASSERT-RMP-GAF-DIRECTLY", 5, 1, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "owl_importer2_create_wff", "OWL-IMPORTER2-CREATE-WFF", 6, 1, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "owl_importer2_find_or_create_nart", "OWL-IMPORTER2-FIND-OR-CREATE-NART", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "owl_importer2_assert_wff", "OWL-IMPORTER2-ASSERT-WFF", 3, 3, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "owl_import_file_verify", "OWL-IMPORT-FILE-VERIFY", 4, 1, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.owl.owl_importer2", "normalize_rdf_graph_by_eliminating_blank_node", "NORMALIZE-RDF-GRAPH-BY-ELIMINATING-BLANK-NODE", 4, 1, false );
    return NIL;
  }

  public static SubLObject init_owl_importer2_file()
  {
    $owl_importer2_valid_options$ = SubLFiles.defparameter( "*OWL-IMPORTER2-VALID-OPTIONS*", $list0 );
    $owl_importer2_version_number$ = SubLFiles.deflexical( "*OWL-IMPORTER2-VERSION-NUMBER*", ( NIL != Symbols.boundp( $sym77$_OWL_IMPORTER2_VERSION_NUMBER_ ) ) ? $owl_importer2_version_number$.getGlobalValue() : NIL );
    $dtp_owl_importer2$ = SubLFiles.defconstant( "*DTP-OWL-IMPORTER2*", $sym90$OWL_IMPORTER2 );
    $owl_importer2_id_isg$ = SubLFiles.deflexical( "*OWL-IMPORTER2-ID-ISG*", ( NIL != Symbols.boundp( $sym147$_OWL_IMPORTER2_ID_ISG_ ) ) ? $owl_importer2_id_isg$.getGlobalValue()
        : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    $owl_importer2_id_map$ = SubLFiles.deflexical( "*OWL-IMPORTER2-ID-MAP*", ( NIL != Symbols.boundp( $sym148$_OWL_IMPORTER2_ID_MAP_ ) ) ? $owl_importer2_id_map$.getGlobalValue()
        : dictionary.new_dictionary( Symbols.symbol_function( EQL ), UNPROVIDED ) );
    $owl_importer2_subject_stack$ = SubLFiles.defparameter( "*OWL-IMPORTER2-SUBJECT-STACK*", NIL );
    return NIL;
  }

  public static SubLObject setup_owl_importer2_file()
  {
    access_macros.register_external_symbol( $sym5$OWL_IMPORT_URI );
    access_macros.register_external_symbol( $sym14$OWL_IMPORT_FILE );
    access_macros.register_external_symbol( $sym18$OWL_IMPORT_URI_FROM_FILE );
    access_macros.register_external_symbol( $sym23$OWL_IMPORT_XML_GRAPH_FROM_FILE );
    subl_macro_promotions.declare_defglobal( $sym77$_OWL_IMPORTER2_VERSION_NUMBER_ );
    $owl_importer2_version_number$.setGlobalValue( $str78$_revision__1_2__ );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_owl_importer2$.getGlobalValue(), Symbols.symbol_function( $sym97$OWL_IMPORTER2_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list98 );
    Structures.def_csetf( $sym99$OWL_IMP2_ID, $sym100$_CSETF_OWL_IMP2_ID );
    Structures.def_csetf( $sym101$OWL_IMP2_URI, $sym102$_CSETF_OWL_IMP2_URI );
    Structures.def_csetf( $sym103$OWL_IMP2_FILE, $sym104$_CSETF_OWL_IMP2_FILE );
    Structures.def_csetf( $sym105$OWL_IMP2_GRAPH, $sym106$_CSETF_OWL_IMP2_GRAPH );
    Structures.def_csetf( $sym107$OWL_IMP2_CYCLIST, $sym108$_CSETF_OWL_IMP2_CYCLIST );
    Structures.def_csetf( $sym109$OWL_IMP2_IMPORT, $sym110$_CSETF_OWL_IMP2_IMPORT );
    Structures.def_csetf( $sym111$OWL_IMP2_ONTOLOGIES, $sym112$_CSETF_OWL_IMP2_ONTOLOGIES );
    Structures.def_csetf( $sym113$OWL_IMP2_TERMS, $sym114$_CSETF_OWL_IMP2_TERMS );
    Structures.def_csetf( $sym115$OWL_IMP2_SENTENCES, $sym116$_CSETF_OWL_IMP2_SENTENCES );
    Structures.def_csetf( $sym117$OWL_IMP2_STATS, $sym118$_CSETF_OWL_IMP2_STATS );
    Structures.def_csetf( $sym119$OWL_IMP2_OPTIONS, $sym120$_CSETF_OWL_IMP2_OPTIONS );
    Structures.def_csetf( $sym121$OWL_IMP2_THREAD, $sym122$_CSETF_OWL_IMP2_THREAD );
    Equality.identity( $sym90$OWL_IMPORTER2 );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_owl_importer2$.getGlobalValue(), Symbols.symbol_function( $sym138$VISIT_DEFSTRUCT_OBJECT_OWL_IMPORTER2_METHOD ) );
    utilities_macros.note_funcall_helper_function( $sym96$PRINT_OWL_IMPORTER2 );
    subl_macro_promotions.declare_defglobal( $sym147$_OWL_IMPORTER2_ID_ISG_ );
    subl_macro_promotions.declare_defglobal( $sym148$_OWL_IMPORTER2_ID_MAP_ );
    Structures.register_method( Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_owl_importer2$.getGlobalValue(), Symbols.symbol_function( $sym152$SXHASH_OWL_IMPORTER2_METHOD ) );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_owl_importer2_file();
  }

  @Override
  public void initializeVariables()
  {
    init_owl_importer2_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_owl_importer2_file();
  }
  static
  {
    me = new owl_importer2();
    $owl_importer2_valid_options$ = null;
    $owl_importer2_version_number$ = null;
    $dtp_owl_importer2$ = null;
    $owl_importer2_id_isg$ = null;
    $owl_importer2_id_map$ = null;
    $owl_importer2_subject_stack$ = null;
    $list0 = ConsesLow.list( new SubLObject[] { makeKeyword( "ONTOLOGY-URI" ), makeKeyword( "ONTOLOGY-TERM" ), makeKeyword( "ONTOLOGY-MT" ), makeKeyword( "URI-PREFIX" ), makeKeyword( "CONSTANT-PREFIX" ), makeKeyword(
        "CONSTANT-SUFFIX" ), makeKeyword( "USE-NAMESPACE-PREFIXES-AS-CONSTANT-PREFIXES" ), makeKeyword( "SYNONYMOUS-CONCEPT-PREFIX" ), makeKeyword( "CYCLIST" ), makeKeyword( "TEST-MODE" ), makeKeyword( "VERBOSE?" ),
      makeKeyword( "PROGRESS-STREAM" ), makeKeyword( "GRAPH-TRANSLATION-FUNCTIONS" ), makeKeyword( "ONLY-ASSERT-RESTRICTIONS-AS-RMP-GAFS?" ), makeKeyword( "USE-RDFS-LABEL-FOR-CONSTANT-NAME?" ), makeKeyword(
          "USE-GENLS-FOR-RDFS-SUBCLASS?" )
    } );
    $str1$OWL_Importer_usages___ = makeString( "OWL Importer usages:~%" );
    $str2$_owl_import_uri__uri__optional_im = makeString( " owl-import-uri (uri &optional importer-options)~%" );
    $str3$_owl_import_file__filename__optio = makeString( " owl-import-file (filename &optional importer-options)~%" );
    $str4$_owl_import_uri_from_file__uri_fi = makeString( " owl-import-uri-from-file (uri filename &optional importer-options)~%" );
    $sym5$OWL_IMPORT_URI = makeSymbol( "OWL-IMPORT-URI" );
    $str6$owl_import_uri = makeString( "owl-import-uri" );
    $list7 = ConsesLow.list( makeKeyword( "URI" ), makeKeyword( "IMPORTER-OPTIONS" ) );
    $str8$Download_of_URI__S_to_temp_file_f = makeString( "Download of URI ~S to temp file failed." );
    $kw9$SYNONYMOUS_CONCEPT_PREFIX = makeKeyword( "SYNONYMOUS-CONCEPT-PREFIX" );
    $str10$ = makeString( "" );
    $kw11$ONTOLOGY_URI = makeKeyword( "ONTOLOGY-URI" );
    $kw12$CYCLIST = makeKeyword( "CYCLIST" );
    $kw13$PROGRESS_STREAM = makeKeyword( "PROGRESS-STREAM" );
    $sym14$OWL_IMPORT_FILE = makeSymbol( "OWL-IMPORT-FILE" );
    $str15$owl_import_file = makeString( "owl-import-file" );
    $list16 = ConsesLow.list( makeKeyword( "FILENAME" ), makeKeyword( "IMPORTER-OPTIONS" ) );
    $kw17$VERBOSE_ = makeKeyword( "VERBOSE?" );
    $sym18$OWL_IMPORT_URI_FROM_FILE = makeSymbol( "OWL-IMPORT-URI-FROM-FILE" );
    $str19$owl_import_uri_from_file = makeString( "owl-import-uri-from-file" );
    $list20 = ConsesLow.list( makeKeyword( "URI" ), makeKeyword( "FILENAME" ), makeKeyword( "IMPORTER-OPTIONS" ) );
    $kw21$TEST_MODE = makeKeyword( "TEST-MODE" );
    $kw22$GRAPH_ONLY = makeKeyword( "GRAPH-ONLY" );
    $sym23$OWL_IMPORT_XML_GRAPH_FROM_FILE = makeSymbol( "OWL-IMPORT-XML-GRAPH-FROM-FILE" );
    $str24$Importing_XML___ = makeString( "Importing XML..." );
    $kw25$URI_PREFIX = makeKeyword( "URI-PREFIX" );
    $str26$__Using_local_URI_part_for___syno = makeString( "~&Using local URI part for #$synonymousExternalConcept assertions~%" );
    $str27$__Using_URI_prefix___A__for___syn = makeString( "~&Using URI prefix \"~A\" for #$synonymousExternalConcept assertions~%" );
    $str28$__Using_full_URIs_for___synonymou = makeString( "~&Using full URIs for #$synonymousExternalConcept assertions~%" );
    $str29$__Note_that_synonymous_concept_pr = makeString( "~&Note that synonymous-concept-prefix of ~S and uri-prefix of ~S do not match~%" );
    $kw30$CONSTANT_PREFIX = makeKeyword( "CONSTANT-PREFIX" );
    $kw31$CONSTANT_SUFFIX = makeKeyword( "CONSTANT-SUFFIX" );
    $str32$_ = makeString( ":" );
    $sym33$VALID_CONSTANT_NAME_CHAR_P = makeSymbol( "VALID-CONSTANT-NAME-CHAR-P" );
    $str34$Changing_constant_prefix_from__S_ = makeString( "Changing constant prefix from ~S to ~S to avoid invalid chars~%" );
    $str35$__Using_prefix___A__for_new_const = makeString( "~&Using prefix \"~A\" for new constants~%" );
    $str36$__Using_suffix___A__for_new_const = makeString( "~&Using suffix \"~A\" for new constants~%" );
    $str37$__Using___ResourceWithURIFn_NARTs = makeString( "~&Using #$ResourceWithURIFn NARTs~%" );
    $kw38$ONTOLOGY_TERM = makeKeyword( "ONTOLOGY-TERM" );
    $kw39$ONTOLOGY_MT = makeKeyword( "ONTOLOGY-MT" );
    $const40$retainTerm = constant_handles.reader_make_constant_shell( makeString( "retainTerm" ) );
    $const41$OWLOntologyFn = constant_handles.reader_make_constant_shell( makeString( "OWLOntologyFn" ) );
    $const42$BaseKB = constant_handles.reader_make_constant_shell( makeString( "BaseKB" ) );
    $const43$ContextOfPCWFn = constant_handles.reader_make_constant_shell( makeString( "ContextOfPCWFn" ) );
    $str44$__Using_ontology_term_ = makeString( "~&Using ontology-term " );
    $str45$__Using_ontology_mt_ = makeString( "~&Using ontology-mt " );
    $str46$__Using_ontology_term__S__ = makeString( "~&Using ontology-term ~S~%" );
    $str47$__Using_ontology_mt__S__ = makeString( "~&Using ontology-mt ~S~%" );
    $list48 = ConsesLow.cons( makeSymbol( "PREFIX" ), makeSymbol( "URI-STRING" ) );
    $str49$xml_base = makeString( "xml:base" );
    $const50$baseNamespaceForSKS = constant_handles.reader_make_constant_shell( makeString( "baseNamespaceForSKS" ) );
    $const51$URIFn = constant_handles.reader_make_constant_shell( makeString( "URIFn" ) );
    $const52$nameSpacePrefixForSKS = constant_handles.reader_make_constant_shell( makeString( "nameSpacePrefixForSKS" ) );
    $sym53$FUNCTION_SPEC_P = makeSymbol( "FUNCTION-SPEC-P" );
    $kw54$GRAPH_TRANSLATION_FUNCTIONS = makeKeyword( "GRAPH-TRANSLATION-FUNCTIONS" );
    $kw55$NODE_COUNT = makeKeyword( "NODE-COUNT" );
    $kw56$TRIPLE_COUNT = makeKeyword( "TRIPLE-COUNT" );
    $str57$_A_triples__ = makeString( "~A triples~%" );
    $str58$_A_nodes__ = makeString( "~A nodes~%" );
    $sym59$CAR = makeSymbol( "CAR" );
    $sym60$SUPERSTRING_ = makeSymbol( "SUPERSTRING?" );
    $sym61$CDR = makeSymbol( "CDR" );
    $sym62$_ = makeSymbol( ">" );
    $sym63$LENGTH = makeSymbol( "LENGTH" );
    $sym64$STRING_ = makeSymbol( "STRING=" );
    $kw65$URI = makeKeyword( "URI" );
    $str66$_A__URI__S_is_not_valid__ = makeString( "~A: URI ~S is not valid~%" );
    $kw67$FILENAME = makeKeyword( "FILENAME" );
    $str68$_A__FILENAME__S_does_not_exist__ = makeString( "~A: FILENAME ~S does not exist~%" );
    $kw69$IMPORTER_OPTIONS = makeKeyword( "IMPORTER-OPTIONS" );
    $str70$_A__IMPORTER_OPTIONS__S_is_not_a_ = makeString( "~A: IMPORTER-OPTIONS ~S is not a valid property list~%" );
    $const71$Cyclist = constant_handles.reader_make_constant_shell( makeString( "Cyclist" ) );
    $str72$_A__IMPORTER_OPTIONS__cyclist__A_ = makeString( "~A: IMPORTER-OPTIONS :cyclist ~A is not a #$Cyclist~%" );
    $const73$Guest = constant_handles.reader_make_constant_shell( makeString( "Guest" ) );
    $str74$_A__Please_log_in_with__set_the_c = makeString( "~A: Please log in with (set-the-cyclist [Cyc Account])~%" );
    $str75$_A__IMPORTER_OPTIONS_has_invalid_ = makeString( "~A: IMPORTER-OPTIONS has invalid keys: ~A~%" );
    $str76$Errors_found__aborting_import___ = makeString( "Errors found, aborting import..." );
    $sym77$_OWL_IMPORTER2_VERSION_NUMBER_ = makeSymbol( "*OWL-IMPORTER2-VERSION-NUMBER*" );
    $str78$_revision__1_2__ = makeString( "$revision: 1.2 $" );
    $sym79$DIGIT_CHAR_P = makeSymbol( "DIGIT-CHAR-P" );
    $str80$2 = makeString( "2" );
    $const81$SoftwareVersion = constant_handles.reader_make_constant_shell( makeString( "SoftwareVersion" ) );
    $const82$OWLImporter_Cyc = constant_handles.reader_make_constant_shell( makeString( "OWLImporter-Cyc" ) );
    $const83$UserOfProgramFn = constant_handles.reader_make_constant_shell( makeString( "UserOfProgramFn" ) );
    $kw84$NODES_DONE = makeKeyword( "NODES-DONE" );
    $kw85$TRIPLES_DONE = makeKeyword( "TRIPLES-DONE" );
    $kw86$TERMS_CREATED = makeKeyword( "TERMS-CREATED" );
    $kw87$ASSERTIONS_CREATED = makeKeyword( "ASSERTIONS-CREATED" );
    $str88$type = makeString( "type" );
    $str89$Ontology = makeString( "Ontology" );
    $sym90$OWL_IMPORTER2 = makeSymbol( "OWL-IMPORTER2" );
    $sym91$OWL_IMPORTER2_P = makeSymbol( "OWL-IMPORTER2-P" );
    $list92 = ConsesLow.list( new SubLObject[] { makeSymbol( "ID" ), makeSymbol( "URI" ), makeSymbol( "FILE" ), makeSymbol( "GRAPH" ), makeSymbol( "CYCLIST" ), makeSymbol( "IMPORT" ), makeSymbol( "ONTOLOGIES" ),
      makeSymbol( "TERMS" ), makeSymbol( "SENTENCES" ), makeSymbol( "STATS" ), makeSymbol( "OPTIONS" ), makeSymbol( "THREAD" )
    } );
    $list93 = ConsesLow.list( new SubLObject[] { makeKeyword( "ID" ), makeKeyword( "URI" ), makeKeyword( "FILE" ), makeKeyword( "GRAPH" ), makeKeyword( "CYCLIST" ), makeKeyword( "IMPORT" ), makeKeyword( "ONTOLOGIES" ),
      makeKeyword( "TERMS" ), makeKeyword( "SENTENCES" ), makeKeyword( "STATS" ), makeKeyword( "OPTIONS" ), makeKeyword( "THREAD" )
    } );
    $list94 = ConsesLow.list( new SubLObject[] { makeSymbol( "OWL-IMP2-ID" ), makeSymbol( "OWL-IMP2-URI" ), makeSymbol( "OWL-IMP2-FILE" ), makeSymbol( "OWL-IMP2-GRAPH" ), makeSymbol( "OWL-IMP2-CYCLIST" ), makeSymbol(
        "OWL-IMP2-IMPORT" ), makeSymbol( "OWL-IMP2-ONTOLOGIES" ), makeSymbol( "OWL-IMP2-TERMS" ), makeSymbol( "OWL-IMP2-SENTENCES" ), makeSymbol( "OWL-IMP2-STATS" ), makeSymbol( "OWL-IMP2-OPTIONS" ), makeSymbol(
            "OWL-IMP2-THREAD" )
    } );
    $list95 = ConsesLow.list( new SubLObject[] { makeSymbol( "_CSETF-OWL-IMP2-ID" ), makeSymbol( "_CSETF-OWL-IMP2-URI" ), makeSymbol( "_CSETF-OWL-IMP2-FILE" ), makeSymbol( "_CSETF-OWL-IMP2-GRAPH" ), makeSymbol(
        "_CSETF-OWL-IMP2-CYCLIST" ), makeSymbol( "_CSETF-OWL-IMP2-IMPORT" ), makeSymbol( "_CSETF-OWL-IMP2-ONTOLOGIES" ), makeSymbol( "_CSETF-OWL-IMP2-TERMS" ), makeSymbol( "_CSETF-OWL-IMP2-SENTENCES" ), makeSymbol(
            "_CSETF-OWL-IMP2-STATS" ), makeSymbol( "_CSETF-OWL-IMP2-OPTIONS" ), makeSymbol( "_CSETF-OWL-IMP2-THREAD" )
    } );
    $sym96$PRINT_OWL_IMPORTER2 = makeSymbol( "PRINT-OWL-IMPORTER2" );
    $sym97$OWL_IMPORTER2_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "OWL-IMPORTER2-PRINT-FUNCTION-TRAMPOLINE" );
    $list98 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "OWL-IMPORTER2-P" ) );
    $sym99$OWL_IMP2_ID = makeSymbol( "OWL-IMP2-ID" );
    $sym100$_CSETF_OWL_IMP2_ID = makeSymbol( "_CSETF-OWL-IMP2-ID" );
    $sym101$OWL_IMP2_URI = makeSymbol( "OWL-IMP2-URI" );
    $sym102$_CSETF_OWL_IMP2_URI = makeSymbol( "_CSETF-OWL-IMP2-URI" );
    $sym103$OWL_IMP2_FILE = makeSymbol( "OWL-IMP2-FILE" );
    $sym104$_CSETF_OWL_IMP2_FILE = makeSymbol( "_CSETF-OWL-IMP2-FILE" );
    $sym105$OWL_IMP2_GRAPH = makeSymbol( "OWL-IMP2-GRAPH" );
    $sym106$_CSETF_OWL_IMP2_GRAPH = makeSymbol( "_CSETF-OWL-IMP2-GRAPH" );
    $sym107$OWL_IMP2_CYCLIST = makeSymbol( "OWL-IMP2-CYCLIST" );
    $sym108$_CSETF_OWL_IMP2_CYCLIST = makeSymbol( "_CSETF-OWL-IMP2-CYCLIST" );
    $sym109$OWL_IMP2_IMPORT = makeSymbol( "OWL-IMP2-IMPORT" );
    $sym110$_CSETF_OWL_IMP2_IMPORT = makeSymbol( "_CSETF-OWL-IMP2-IMPORT" );
    $sym111$OWL_IMP2_ONTOLOGIES = makeSymbol( "OWL-IMP2-ONTOLOGIES" );
    $sym112$_CSETF_OWL_IMP2_ONTOLOGIES = makeSymbol( "_CSETF-OWL-IMP2-ONTOLOGIES" );
    $sym113$OWL_IMP2_TERMS = makeSymbol( "OWL-IMP2-TERMS" );
    $sym114$_CSETF_OWL_IMP2_TERMS = makeSymbol( "_CSETF-OWL-IMP2-TERMS" );
    $sym115$OWL_IMP2_SENTENCES = makeSymbol( "OWL-IMP2-SENTENCES" );
    $sym116$_CSETF_OWL_IMP2_SENTENCES = makeSymbol( "_CSETF-OWL-IMP2-SENTENCES" );
    $sym117$OWL_IMP2_STATS = makeSymbol( "OWL-IMP2-STATS" );
    $sym118$_CSETF_OWL_IMP2_STATS = makeSymbol( "_CSETF-OWL-IMP2-STATS" );
    $sym119$OWL_IMP2_OPTIONS = makeSymbol( "OWL-IMP2-OPTIONS" );
    $sym120$_CSETF_OWL_IMP2_OPTIONS = makeSymbol( "_CSETF-OWL-IMP2-OPTIONS" );
    $sym121$OWL_IMP2_THREAD = makeSymbol( "OWL-IMP2-THREAD" );
    $sym122$_CSETF_OWL_IMP2_THREAD = makeSymbol( "_CSETF-OWL-IMP2-THREAD" );
    $kw123$ID = makeKeyword( "ID" );
    $kw124$FILE = makeKeyword( "FILE" );
    $kw125$GRAPH = makeKeyword( "GRAPH" );
    $kw126$IMPORT = makeKeyword( "IMPORT" );
    $kw127$ONTOLOGIES = makeKeyword( "ONTOLOGIES" );
    $kw128$TERMS = makeKeyword( "TERMS" );
    $kw129$SENTENCES = makeKeyword( "SENTENCES" );
    $kw130$STATS = makeKeyword( "STATS" );
    $kw131$OPTIONS = makeKeyword( "OPTIONS" );
    $kw132$THREAD = makeKeyword( "THREAD" );
    $str133$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw134$BEGIN = makeKeyword( "BEGIN" );
    $sym135$MAKE_OWL_IMPORTER2 = makeSymbol( "MAKE-OWL-IMPORTER2" );
    $kw136$SLOT = makeKeyword( "SLOT" );
    $kw137$END = makeKeyword( "END" );
    $sym138$VISIT_DEFSTRUCT_OBJECT_OWL_IMPORTER2_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-OWL-IMPORTER2-METHOD" );
    $str139$_OWL_IMPORTER__D_for__A_ = makeString( "<OWL-IMPORTER ~D for ~A>" );
    $sym140$URL_P = makeSymbol( "URL-P" );
    $sym141$FILE_EXISTS_ = makeSymbol( "FILE-EXISTS?" );
    $sym142$FORT_P = makeSymbol( "FORT-P" );
    $sym143$PROPERTY_LIST_P = makeSymbol( "PROPERTY-LIST-P" );
    $sym144$RDF_GRAPH_P = makeSymbol( "RDF-GRAPH-P" );
    $str145$No_import_owl_Ontology_URI_found_ = makeString( "No import owl:Ontology URI found.  Aborting." );
    $const146$SoftwareVersionFn = constant_handles.reader_make_constant_shell( makeString( "SoftwareVersionFn" ) );
    $sym147$_OWL_IMPORTER2_ID_ISG_ = makeSymbol( "*OWL-IMPORTER2-ID-ISG*" );
    $sym148$_OWL_IMPORTER2_ID_MAP_ = makeSymbol( "*OWL-IMPORTER2-ID-MAP*" );
    $sym149$NON_DOTTED_LIST_P = makeSymbol( "NON-DOTTED-LIST-P" );
    $sym150$RDF_URI_P = makeSymbol( "RDF-URI-P" );
    $sym151$PROCESSP = makeSymbol( "PROCESSP" );
    $sym152$SXHASH_OWL_IMPORTER2_METHOD = makeSymbol( "SXHASH-OWL-IMPORTER2-METHOD" );
    $str153$Importing_ = makeString( "Importing " );
    $str154$_triples___ = makeString( " triples..." );
    $str155$node_count___A__ = makeString( "node-count: ~A~%" );
    $str156$real_node_count___A__ = makeString( "real-node-count: ~A~%" );
    $str157$triple_count___A__ = makeString( "triple-count: ~A~%" );
    $str158$real_triple_count___A__ = makeString( "real-triple-count: ~A~%" );
    $int159$40 = makeInteger( 40 );
    $str160$Assert_nesting_depth___D = makeString( "Assert nesting depth: ~D" );
    $const161$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $list162 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "OWLProperty" ) ) );
    $str163$Failed_to_assert__S_in__S = makeString( "Failed to assert ~S in ~S" );
    $str164$__ = makeString( "~%" );
    $str165$_S_is_not_a_list_node_ = makeString( "~S is not a list node." );
    $str166$nil = makeString( "nil" );
    $const167$TheEmptyList = constant_handles.reader_make_constant_shell( makeString( "TheEmptyList" ) );
    $const168$TheList = constant_handles.reader_make_constant_shell( makeString( "TheList" ) );
    $str169$first = makeString( "first" );
    $sym170$RDF_TRIPLE_PREDICATE = makeSymbol( "RDF-TRIPLE-PREDICATE" );
    $str171$rest = makeString( "rest" );
    $str172$Can_t_find_or_create_term_for__S = makeString( "Can't find or create term for ~S" );
    $kw173$USE_GENLS_FOR_RDFS_SUBCLASS_ = makeKeyword( "USE-GENLS-FOR-RDFS-SUBCLASS?" );
    $str174$rdfs_subClassOf = makeString( "rdfs:subClassOf" );
    $const175$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $str176$Could_not_find_Cyc_term_for_URI__ = makeString( "Could not find Cyc term for URI ~A" );
    $kw177$USE_NAMESPACE_PREFIXES_AS_CONSTANT_PREFIXES = makeKeyword( "USE-NAMESPACE-PREFIXES-AS-CONSTANT-PREFIXES" );
    $const178$quotedIsa = constant_handles.reader_make_constant_shell( makeString( "quotedIsa" ) );
    $const179$TermFromOntologyFn = constant_handles.reader_make_constant_shell( makeString( "TermFromOntologyFn" ) );
    $const180$BookkeepingMt = constant_handles.reader_make_constant_shell( makeString( "BookkeepingMt" ) );
    $const181$synonymousExternalConcept = constant_handles.reader_make_constant_shell( makeString( "synonymousExternalConcept" ) );
    $const182$rdfURI = constant_handles.reader_make_constant_shell( makeString( "rdfURI" ) );
    $kw183$USE_RDFS_LABEL_FOR_CONSTANT_NAME_ = makeKeyword( "USE-RDFS-LABEL-FOR-CONSTANT-NAME?" );
    $str184$rdfs_label = makeString( "rdfs:label" );
    $str185$rdf_type = makeString( "rdf:type" );
    $str186$owl_Class = makeString( "owl:Class" );
    $sym187$CYC_URI_P = makeSymbol( "CYC-URI-P" );
    $str188$intersectionOf = makeString( "intersectionOf" );
    $const189$CollectionIntersectionFn = constant_handles.reader_make_constant_shell( makeString( "CollectionIntersectionFn" ) );
    $const190$TheSet = constant_handles.reader_make_constant_shell( makeString( "TheSet" ) );
    $str191$unionOf = makeString( "unionOf" );
    $const192$CollectionUnionFn = constant_handles.reader_make_constant_shell( makeString( "CollectionUnionFn" ) );
    $str193$complementOf = makeString( "complementOf" );
    $const194$CollectionDifferenceFn = constant_handles.reader_make_constant_shell( makeString( "CollectionDifferenceFn" ) );
    $const195$Thing = constant_handles.reader_make_constant_shell( makeString( "Thing" ) );
    $str196$onProperty = makeString( "onProperty" );
    $str197$allValuesFrom = makeString( "allValuesFrom" );
    $str198$hasValue = makeString( "hasValue" );
    $str199$someValuesFrom = makeString( "someValuesFrom" );
    $str200$valuesFrom = makeString( "valuesFrom" );
    $str201$subClassOf = makeString( "subClassOf" );
    $str202$cardinality = makeString( "cardinality" );
    $str203$minCardinality = makeString( "minCardinality" );
    $str204$maxCardinality = makeString( "maxCardinality" );
    $kw205$ONLY_ASSERT_RESTRICTIONS_AS_RMP_GAFS_ = makeKeyword( "ONLY-ASSERT-RESTRICTIONS-AS-RMP-GAFS?" );
    $const206$relationAllOnly = constant_handles.reader_make_constant_shell( makeString( "relationAllOnly" ) );
    $const207$CollectionSubsetFn = constant_handles.reader_make_constant_shell( makeString( "CollectionSubsetFn" ) );
    $const208$TheSetOf = constant_handles.reader_make_constant_shell( makeString( "TheSetOf" ) );
    $sym209$_X = makeSymbol( "?X" );
    $const210$relationInstanceOnly = constant_handles.reader_make_constant_shell( makeString( "relationInstanceOnly" ) );
    $const211$relationAllExists = constant_handles.reader_make_constant_shell( makeString( "relationAllExists" ) );
    $const212$relationInstanceExists = constant_handles.reader_make_constant_shell( makeString( "relationInstanceExists" ) );
    $const213$relationAllInstance = constant_handles.reader_make_constant_shell( makeString( "relationAllInstance" ) );
    $const214$relationAllExistsMax = constant_handles.reader_make_constant_shell( makeString( "relationAllExistsMax" ) );
    $const215$relationInstanceExistsMax = constant_handles.reader_make_constant_shell( makeString( "relationInstanceExistsMax" ) );
    $const216$relationAllExistsMin = constant_handles.reader_make_constant_shell( makeString( "relationAllExistsMin" ) );
    $const217$relationInstanceExistsMin = constant_handles.reader_make_constant_shell( makeString( "relationInstanceExistsMin" ) );
    $const218$relationAllExistsCount = constant_handles.reader_make_constant_shell( makeString( "relationAllExistsCount" ) );
    $const219$relationInstanceExistsCount = constant_handles.reader_make_constant_shell( makeString( "relationInstanceExistsCount" ) );
    $str220$restriction_not_handled_yet___A__ = makeString( "restriction not handled yet: ~A~% ~A~% ~A~% ~A~%" );
    $str221$oneOf = makeString( "oneOf" );
    $const222$TheCollection = constant_handles.reader_make_constant_shell( makeString( "TheCollection" ) );
    $str223$AnonymousOWLTerm = makeString( "AnonymousOWLTerm" );
    $const224$UniversalVocabularyMt = constant_handles.reader_make_constant_shell( makeString( "UniversalVocabularyMt" ) );
    $const225$IndeterminateTerm = constant_handles.reader_make_constant_shell( makeString( "IndeterminateTerm" ) );
    $sym226$RDF_TRIPLE_SUBJECT = makeSymbol( "RDF-TRIPLE-SUBJECT" );
    $str227$___A_was_not_the_object_of_any_rd = makeString( "~&~A was not the object of any rdfs:subClassOf triples!  No RMP assertion made.~%" );
    $str228$Eliminating_blank_nodes___ = makeString( "Eliminating blank nodes..." );
    $str229$cdolist = makeString( "cdolist" );
    $str230$rdfs_domain = makeString( "rdfs:domain" );
    $str231$owl_Thing = makeString( "owl:Thing" );
    $str232$rdfs_range = makeString( "rdfs:range" );
    $sym233$RDF_TRIPLE_OBJECT = makeSymbol( "RDF-TRIPLE-OBJECT" );
    $str234$rdf_Property = makeString( "rdf:Property" );
  }

  public static final class $owl_importer2_native
      extends
        SubLStructNative
  {
    public SubLObject $id;
    public SubLObject $uri;
    public SubLObject $file;
    public SubLObject $graph;
    public SubLObject $cyclist;
    public SubLObject $import;
    public SubLObject $ontologies;
    public SubLObject $terms;
    public SubLObject $sentences;
    public SubLObject $stats;
    public SubLObject $options;
    public SubLObject $thread;
    private static final SubLStructDeclNative structDecl;

    public $owl_importer2_native()
    {
      this.$id = CommonSymbols.NIL;
      this.$uri = CommonSymbols.NIL;
      this.$file = CommonSymbols.NIL;
      this.$graph = CommonSymbols.NIL;
      this.$cyclist = CommonSymbols.NIL;
      this.$import = CommonSymbols.NIL;
      this.$ontologies = CommonSymbols.NIL;
      this.$terms = CommonSymbols.NIL;
      this.$sentences = CommonSymbols.NIL;
      this.$stats = CommonSymbols.NIL;
      this.$options = CommonSymbols.NIL;
      this.$thread = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $owl_importer2_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$id;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$uri;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$file;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$graph;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$cyclist;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$import;
    }

    @Override
    public SubLObject getField8()
    {
      return this.$ontologies;
    }

    @Override
    public SubLObject getField9()
    {
      return this.$terms;
    }

    @Override
    public SubLObject getField10()
    {
      return this.$sentences;
    }

    @Override
    public SubLObject getField11()
    {
      return this.$stats;
    }

    @Override
    public SubLObject getField12()
    {
      return this.$options;
    }

    @Override
    public SubLObject getField13()
    {
      return this.$thread;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$id = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$uri = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$file = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$graph = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$cyclist = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$import = value;
    }

    @Override
    public SubLObject setField8(final SubLObject value)
    {
      return this.$ontologies = value;
    }

    @Override
    public SubLObject setField9(final SubLObject value)
    {
      return this.$terms = value;
    }

    @Override
    public SubLObject setField10(final SubLObject value)
    {
      return this.$sentences = value;
    }

    @Override
    public SubLObject setField11(final SubLObject value)
    {
      return this.$stats = value;
    }

    @Override
    public SubLObject setField12(final SubLObject value)
    {
      return this.$options = value;
    }

    @Override
    public SubLObject setField13(final SubLObject value)
    {
      return this.$thread = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $owl_importer2_native.class, $sym90$OWL_IMPORTER2, $sym91$OWL_IMPORTER2_P, $list92, $list93, new String[] { "$id", "$uri", "$file", "$graph", "$cyclist", "$import",
        "$ontologies", "$terms", "$sentences", "$stats", "$options", "$thread"
      }, $list94, $list95, $sym96$PRINT_OWL_IMPORTER2 );
    }
  }

  public static final class $owl_importer2_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $owl_importer2_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "OWL-IMPORTER2-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return owl_importer2_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 782 ms synthetic
 */
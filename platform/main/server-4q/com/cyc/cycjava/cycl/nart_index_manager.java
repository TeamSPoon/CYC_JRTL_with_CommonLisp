package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class nart_index_manager
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.nart_index_manager";
  public static final String myFingerPrint = "3744da31014cb2d8f8745a72c1a0a79638b02d4b50e65915a24edf2e4dc36e15";
  @SubLTranslatedFile.SubL(source = "cycl/nart-index-manager.lisp", position = 1408L)
  public static SubLSymbol $nart_index_manager$;
  @SubLTranslatedFile.SubL(source = "cycl/nart-index-manager.lisp", position = 1579L)
  private static SubLSymbol $nart_index_lru_size_percentage$;
  @SubLTranslatedFile.SubL(source = "cycl/nart-index-manager.lisp", position = 1847L)
  private static SubLSymbol $nart_index_lru_size_max$;
  private static final SubLSymbol $sym0$_NART_INDEX_MANAGER_;
  private static final SubLSymbol $kw1$UNINITIALIZED;
  private static final SubLInteger $int2$30000;
  private static final SubLString $str3$nart_index;
  private static final SubLSymbol $sym4$LOAD_NART_INDEX_FROM_CACHE;
  private static final SubLSymbol $kw5$NIM;
  private static final SubLSymbol $sym6$_EXIT;
  private static final SubLString $str7$nat_indices;
  private static final SubLString $str8$nat_indices_index;
  private static final SubLString $str9$nat_complex_indices;
  private static final SubLString $str10$nat_complex_indices_index;
  private static final SubLString $str11$nim;
  private static final SubLString $str12$cnim;
  private static final SubLSymbol $kw13$NART_INDEX;
  private static final SubLSymbol $sym14$WITH_KBOM_FULLY_LOADED;
  private static final SubLList $list15;

  @SubLTranslatedFile.SubL(source = "cycl/nart-index-manager.lisp", position = 2025L)
  public static SubLObject setup_nart_index_table(final SubLObject size, final SubLObject exactP)
  {
    $nart_index_manager$.setGlobalValue( kb_object_manager.new_kb_object_manager( $str3$nart_index, size, $nart_index_lru_size_percentage$.getGlobalValue(), $nart_index_lru_size_max$.getGlobalValue(),
        $sym4$LOAD_NART_INDEX_FROM_CACHE, exactP ) );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nart-index-manager.lisp", position = 2276L)
  public static SubLObject resize_nart_index_kbom_lru(SubLObject percentage, SubLObject max)
  {
    if( percentage == UNPROVIDED )
    {
      percentage = NIL;
    }
    if( max == UNPROVIDED )
    {
      max = NIL;
    }
    if( NIL == percentage )
    {
      percentage = $nart_index_lru_size_percentage$.getGlobalValue();
    }
    if( NIL == max )
    {
      max = $nart_index_lru_size_max$.getGlobalValue();
    }
    return kb_object_manager.resize_kbom_lru_cache_from_percentage_and_max( $nart_index_manager$.getGlobalValue(), percentage, max );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nart-index-manager.lisp", position = 2671L)
  public static SubLObject optimize_nart_index_table(final SubLObject new_nart_id_threshold)
  {
    return kb_object_manager.optimize_kb_object_content_table( $nart_index_manager$.getGlobalValue(), new_nart_id_threshold );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nart-index-manager.lisp", position = 2827L)
  public static SubLObject clear_nart_index_table()
  {
    return kb_object_manager.clear_kb_object_content_table( $nart_index_manager$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nart-index-manager.lisp", position = 2934L)
  public static SubLObject maintain_nart_index_usage_counts()
  {
    return kb_object_manager.maintain_kb_object_usage_counts( $nart_index_manager$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nart-index-manager.lisp", position = 3102L)
  public static SubLObject dont_maintain_nart_index_usage_counts()
  {
    return kb_object_manager.dont_maintain_kb_object_usage_counts( $nart_index_manager$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nart-index-manager.lisp", position = 3281L)
  public static SubLObject nart_index_usage_counts_enabled_p()
  {
    return kb_object_manager.kb_object_usage_counts_enabledP( $nart_index_manager$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nart-index-manager.lisp", position = 3477L)
  public static SubLObject cached_nart_index_count()
  {
    return kb_object_manager.cached_kb_object_count( $nart_index_manager$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nart-index-manager.lisp", position = 3835L)
  public static SubLObject nart_indices_completely_cachedP()
  {
    return Numbers.numE( nart_handles.nart_count(), cached_nart_index_count() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nart-index-manager.lisp", position = 4023L)
  public static SubLObject lookup_nart_index(final SubLObject id)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = kb_storage_logging.$kb_storage_client$.currentBinding( thread );
    try
    {
      kb_storage_logging.$kb_storage_client$.bind( kb_storage_logging.add_kb_storage_logging_add_tag( $kw5$NIM ), thread );
      return kb_object_manager.lookup_kb_object_content( $nart_index_manager$.getGlobalValue(), id );
    }
    finally
    {
      kb_storage_logging.$kb_storage_client$.rebind( _prev_bind_0, thread );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/nart-index-manager.lisp", position = 4161L)
  public static SubLObject nart_index_cachedP(final SubLObject id)
  {
    return kb_object_manager.kb_object_id_cachedP( $nart_index_manager$.getGlobalValue(), id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nart-index-manager.lisp", position = 4260L)
  public static SubLObject register_nart_index(final SubLObject id, final SubLObject nart_index)
  {
    return kb_object_manager.register_kb_object_content( $nart_index_manager$.getGlobalValue(), id, nart_index );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nart-index-manager.lisp", position = 4468L)
  public static SubLObject deregister_nart_index(final SubLObject id)
  {
    return kb_object_manager.deregister_kb_object_content( $nart_index_manager$.getGlobalValue(), id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nart-index-manager.lisp", position = 4629L)
  public static SubLObject mark_nart_index_as_muted(final SubLObject id)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = kb_storage_logging.$kb_storage_client$.currentBinding( thread );
    try
    {
      kb_storage_logging.$kb_storage_client$.bind( kb_storage_logging.add_kb_storage_logging_add_tag( $kw5$NIM ), thread );
      return kb_object_manager.mark_kb_object_content_as_muted( $nart_index_manager$.getGlobalValue(), id );
    }
    finally
    {
      kb_storage_logging.$kb_storage_client$.rebind( _prev_bind_0, thread );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/nart-index-manager.lisp", position = 4805L)
  public static SubLObject meter_nart_index_swap_time()
  {
    return kb_object_manager.meter_kb_object_content_swap_time( $nart_index_manager$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nart-index-manager.lisp", position = 4971L)
  public static SubLObject dont_meter_nart_index_swap_time()
  {
    return kb_object_manager.dont_meter_kb_object_content_swap_time( $nart_index_manager$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nart-index-manager.lisp", position = 5148L)
  public static SubLObject clear_nart_index_swap_time()
  {
    return kb_object_manager.clear_kb_object_content_swap_time( $nart_index_manager$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nart-index-manager.lisp", position = 5305L)
  public static SubLObject current_nart_index_swap_time()
  {
    return kb_object_manager.kb_object_manager_swap_time( $nart_index_manager$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nart-index-manager.lisp", position = 5561L)
  public static SubLObject swap_out_all_pristine_nart_indices()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = kb_storage_logging.$kb_storage_client$.currentBinding( thread );
    try
    {
      kb_storage_logging.$kb_storage_client$.bind( kb_storage_logging.add_kb_storage_logging_add_tag( $kw5$NIM ), thread );
      return kb_object_manager.safely_swap_out_all_pristine_kb_objects( $nart_index_manager$.getGlobalValue() );
    }
    finally
    {
      kb_storage_logging.$kb_storage_client$.rebind( _prev_bind_0, thread );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/nart-index-manager.lisp", position = 5726L)
  public static SubLObject initialize_nart_index_hl_store_cache()
  {
    final SubLObject result = kb_object_manager.initialize_kb_object_hl_store_cache( $nart_index_manager$.getGlobalValue(), $str7$nat_indices, $str8$nat_indices_index, $str9$nat_complex_indices,
        $str10$nat_complex_indices_index );
    kb_storage_logging.register_kb_storage_logging_tag( kb_object_manager.kb_object_manager_file_vector( $nart_index_manager$.getGlobalValue() ), $str11$nim );
    final SubLObject sub_fvector = kb_object_manager.kb_object_manager_sub_file_vector( $nart_index_manager$.getGlobalValue() );
    if( NIL != file_vector.file_vector_p( sub_fvector ) )
    {
      kb_storage_logging.register_kb_storage_logging_tag( sub_fvector, $str12$cnim );
      file_vector_utilities.register_indexical_file_vector_reference( $kw13$NART_INDEX, sub_fvector );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nart-index-manager.lisp", position = 6399L)
  public static SubLObject wide_nart_index_hl_store_cacheP()
  {
    return kb_object_manager.wide_kb_object_managerP( $nart_index_manager$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nart-index-manager.lisp", position = 6509L)
  public static SubLObject wide_nart_complex_index_hl_store_cacheP()
  {
    return kb_object_manager.wide_kb_object_sub_managerP( $nart_index_manager$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nart-index-manager.lisp", position = 6631L)
  public static SubLObject new_muted_nart_index_iterator()
  {
    return kb_object_manager.new_muted_kb_object_iterator( $nart_index_manager$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nart-index-manager.lisp", position = 6744L)
  public static SubLObject nart_index_change_stream_buffer_sizes(final SubLObject data_stream_buffer_size, final SubLObject index_stream_buffer_size)
  {
    return kb_object_manager.kb_object_manager_change_stream_buffer_sizes( $nart_index_manager$.getGlobalValue(), data_stream_buffer_size, index_stream_buffer_size );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nart-index-manager.lisp", position = 6993L)
  public static SubLObject nart_index_enable_memory_mapping()
  {
    return kb_object_manager.kb_object_manager_enable_memory_mapping( $nart_index_manager$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nart-index-manager.lisp", position = 7118L)
  public static SubLObject nart_index_memory_mappedP()
  {
    return kb_object_manager.kb_object_manager_memory_mappedP( $nart_index_manager$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nart-index-manager.lisp", position = 7229L)
  public static SubLObject with_nart_index_fully_loaded(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym14$WITH_KBOM_FULLY_LOADED, $list15, ConsesLow.append( body, NIL ) );
  }

  public static SubLObject declare_nart_index_manager_file()
  {
    SubLFiles.declareFunction( me, "setup_nart_index_table", "SETUP-NART-INDEX-TABLE", 2, 0, false );
    SubLFiles.declareFunction( me, "resize_nart_index_kbom_lru", "RESIZE-NART-INDEX-KBOM-LRU", 0, 2, false );
    SubLFiles.declareFunction( me, "optimize_nart_index_table", "OPTIMIZE-NART-INDEX-TABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_nart_index_table", "CLEAR-NART-INDEX-TABLE", 0, 0, false );
    SubLFiles.declareFunction( me, "maintain_nart_index_usage_counts", "MAINTAIN-NART-INDEX-USAGE-COUNTS", 0, 0, false );
    SubLFiles.declareFunction( me, "dont_maintain_nart_index_usage_counts", "DONT-MAINTAIN-NART-INDEX-USAGE-COUNTS", 0, 0, false );
    SubLFiles.declareFunction( me, "nart_index_usage_counts_enabled_p", "NART-INDEX-USAGE-COUNTS-ENABLED-P", 0, 0, false );
    SubLFiles.declareFunction( me, "cached_nart_index_count", "CACHED-NART-INDEX-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "nart_indices_completely_cachedP", "NART-INDICES-COMPLETELY-CACHED?", 0, 0, false );
    SubLFiles.declareFunction( me, "lookup_nart_index", "LOOKUP-NART-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "nart_index_cachedP", "NART-INDEX-CACHED?", 1, 0, false );
    SubLFiles.declareFunction( me, "register_nart_index", "REGISTER-NART-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "deregister_nart_index", "DEREGISTER-NART-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "mark_nart_index_as_muted", "MARK-NART-INDEX-AS-MUTED", 1, 0, false );
    SubLFiles.declareFunction( me, "meter_nart_index_swap_time", "METER-NART-INDEX-SWAP-TIME", 0, 0, false );
    SubLFiles.declareFunction( me, "dont_meter_nart_index_swap_time", "DONT-METER-NART-INDEX-SWAP-TIME", 0, 0, false );
    SubLFiles.declareFunction( me, "clear_nart_index_swap_time", "CLEAR-NART-INDEX-SWAP-TIME", 0, 0, false );
    SubLFiles.declareFunction( me, "current_nart_index_swap_time", "CURRENT-NART-INDEX-SWAP-TIME", 0, 0, false );
    SubLFiles.declareFunction( me, "swap_out_all_pristine_nart_indices", "SWAP-OUT-ALL-PRISTINE-NART-INDICES", 0, 0, false );
    SubLFiles.declareFunction( me, "initialize_nart_index_hl_store_cache", "INITIALIZE-NART-INDEX-HL-STORE-CACHE", 0, 0, false );
    SubLFiles.declareFunction( me, "wide_nart_index_hl_store_cacheP", "WIDE-NART-INDEX-HL-STORE-CACHE?", 0, 0, false );
    SubLFiles.declareFunction( me, "wide_nart_complex_index_hl_store_cacheP", "WIDE-NART-COMPLEX-INDEX-HL-STORE-CACHE?", 0, 0, false );
    SubLFiles.declareFunction( me, "new_muted_nart_index_iterator", "NEW-MUTED-NART-INDEX-ITERATOR", 0, 0, false );
    SubLFiles.declareFunction( me, "nart_index_change_stream_buffer_sizes", "NART-INDEX-CHANGE-STREAM-BUFFER-SIZES", 2, 0, false );
    SubLFiles.declareFunction( me, "nart_index_enable_memory_mapping", "NART-INDEX-ENABLE-MEMORY-MAPPING", 0, 0, false );
    SubLFiles.declareFunction( me, "nart_index_memory_mappedP", "NART-INDEX-MEMORY-MAPPED?", 0, 0, false );
    SubLFiles.declareMacro( me, "with_nart_index_fully_loaded", "WITH-NART-INDEX-FULLY-LOADED" );
    return NIL;
  }

  public static SubLObject init_nart_index_manager_file()
  {
    $nart_index_manager$ = SubLFiles.deflexical( "*NART-INDEX-MANAGER*", ( maybeDefault( $sym0$_NART_INDEX_MANAGER_, $nart_index_manager$, $kw1$UNINITIALIZED ) ) );
    $nart_index_lru_size_percentage$ = SubLFiles.deflexical( "*NART-INDEX-LRU-SIZE-PERCENTAGE*", TWENTY_INTEGER );
    $nart_index_lru_size_max$ = SubLFiles.deflexical( "*NART-INDEX-LRU-SIZE-MAX*", $int2$30000 );
    return NIL;
  }

  public static SubLObject setup_nart_index_manager_file()
  {
    subl_macro_promotions.declare_defglobal( $sym0$_NART_INDEX_MANAGER_ );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_nart_index_manager_file();
  }

  @Override
  public void initializeVariables()
  {
    init_nart_index_manager_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_nart_index_manager_file();
  }
  static
  {
    me = new nart_index_manager();
    $nart_index_manager$ = null;
    $nart_index_lru_size_percentage$ = null;
    $nart_index_lru_size_max$ = null;
    $sym0$_NART_INDEX_MANAGER_ = makeSymbol( "*NART-INDEX-MANAGER*" );
    $kw1$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $int2$30000 = makeInteger( 30000 );
    $str3$nart_index = makeString( "nart-index" );
    $sym4$LOAD_NART_INDEX_FROM_CACHE = makeSymbol( "LOAD-NART-INDEX-FROM-CACHE" );
    $kw5$NIM = makeKeyword( "NIM" );
    $sym6$_EXIT = makeSymbol( "%EXIT" );
    $str7$nat_indices = makeString( "nat-indices" );
    $str8$nat_indices_index = makeString( "nat-indices-index" );
    $str9$nat_complex_indices = makeString( "nat-complex-indices" );
    $str10$nat_complex_indices_index = makeString( "nat-complex-indices-index" );
    $str11$nim = makeString( "nim" );
    $str12$cnim = makeString( "cnim" );
    $kw13$NART_INDEX = makeKeyword( "NART-INDEX" );
    $sym14$WITH_KBOM_FULLY_LOADED = makeSymbol( "WITH-KBOM-FULLY-LOADED" );
    $list15 = ConsesLow.list( makeSymbol( "*NART-INDEX-MANAGER*" ) );
  }
}
/*
 * 
 * Total time: 48 ms
 * 
 */
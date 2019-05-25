package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class term_classification_tree
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.term_classification_tree";
  public static final String myFingerPrint = "75ac80145c9762079103c7e7e9deed49dfb51d6da3fddf7856074d82ac3702c0";
  @SubLTranslatedFile.SubL(source = "cycl/term-classification-tree.lisp", position = 1043L)
  public static SubLSymbol $term_classification_tree_collections$;
  @SubLTranslatedFile.SubL(source = "cycl/term-classification-tree.lisp", position = 5358L)
  public static SubLSymbol $term_classification_tree_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/term-classification-tree.lisp", position = 6023L)
  public static SubLSymbol $term_classification_tree$;
  @SubLTranslatedFile.SubL(source = "cycl/term-classification-tree.lisp", position = 6627L)
  private static SubLSymbol $term_good_wrt_classification_treeP_caching_state$;
  private static final SubLSymbol $sym0$CATCH_ERROR_MESSAGE_HANDLER;
  private static final SubLString $str1$ISA_;
  private static final SubLString $str2$QUOTEDISA_;
  private static final SubLString $str3$GENLS_;
  private static final SubLString $str4$Unexpected_term_classification_tr;
  private static final SubLString $str5$Creation_of_collections_from_a_Te;
  private static final SubLString $str6$CU2FN_;
  private static final SubLList $list7;
  private static final SubLSymbol $sym8$_EXIT;
  private static final SubLObject $const9$CollectionUnionFn;
  private static final SubLObject $const10$TheSet;
  private static final SubLString $str11$CU3FN_;
  private static final SubLString $str12$Unable_to_find_a_constant_when_ex;
  private static final SubLString $str13$CU2FN_1;
  private static final SubLString $str14$_2;
  private static final SubLString $str15$CU3FN_1;
  private static final SubLString $str16$_3;
  private static final SubLString $str17$Invalid_NAT_being_converted_to_tr;
  private static final SubLObject $const18$CurrentWorldDataCollectorMt_NonHo;
  private static final SubLSymbol $sym19$TERM_CLASSIFICATION_TREE_MT;
  private static final SubLSymbol $sym20$SET_TERM_CLASSIFICATION_TREE_MT;
  private static final SubLSymbol $sym21$HLMT_P;
  private static final SubLSymbol $sym22$STRINGP;
  private static final SubLSymbol $sym23$RESET_TERM_CLASSIFICATION_TREE;
  private static final SubLSymbol $sym24$TERM_GOOD_WRT_CLASSIFICATION_TREE_;
  private static final SubLSymbol $sym25$CYCL_TERM_P;
  private static final SubLSymbol $kw26$T;
  private static final SubLSymbol $kw27$F;
  private static final SubLSymbol $sym28$GOOD;
  private static final SubLSymbol $sym29$BAD;
  private static final SubLString $str30$Unexpected_term_classification_tr;
  private static final SubLSymbol $sym31$_TERM_GOOD_WRT_CLASSIFICATION_TREE__CACHING_STATE_;
  private static final SubLInteger $int32$5000;
  private static final SubLSymbol $sym33$CLEAR_TERM_GOOD_WRT_CLASSIFICATION_TREE_;

  @SubLTranslatedFile.SubL(source = "cycl/term-classification-tree.lisp", position = 1416L)
  public static SubLObject create_term_classification_tree_collections(final SubLObject v_term_classification_tree)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_properties = decision_tree.decision_tree_properties( v_term_classification_tree );
    final SubLObject collections = set.new_set( Symbols.symbol_function( EQ ), UNPROVIDED );
    SubLObject error_messages = NIL;
    SubLObject cdolist_list_var = v_properties;
    SubLObject property = NIL;
    property = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject symbol_name = Symbols.symbol_name( property );
      SubLObject error_message = NIL;
      try
      {
        thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( $sym0$CATCH_ERROR_MESSAGE_HANDLER, thread );
          try
          {
            if( NIL != string_utilities.starts_with( symbol_name, $str1$ISA_ ) )
            {
              final SubLObject col_name = string_utilities.substring( symbol_name, Sequences.length( $str1$ISA_ ), UNPROVIDED );
              set.set_add( constant_from_tree_term( col_name ), collections );
            }
            else if( NIL != string_utilities.starts_with( symbol_name, $str2$QUOTEDISA_ ) )
            {
              final SubLObject col_name = string_utilities.substring( symbol_name, Sequences.length( $str2$QUOTEDISA_ ), UNPROVIDED );
              set.set_add( constant_from_tree_term( col_name ), collections );
            }
            else if( NIL != string_utilities.starts_with( symbol_name, $str3$GENLS_ ) )
            {
              final SubLObject col_name = string_utilities.substring( symbol_name, Sequences.length( $str3$GENLS_ ), UNPROVIDED );
              set.set_add( constant_from_tree_term( col_name ), collections );
            }
            else
            {
              Errors.error( $str4$Unexpected_term_classification_tr, property );
            }
          }
          catch( final Throwable catch_var )
          {
            Errors.handleThrowable( catch_var, NIL );
          }
        }
        finally
        {
          Errors.$error_handler$.rebind( _prev_bind_0, thread );
        }
      }
      catch( final Throwable ccatch_env_var )
      {
        error_message = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      }
      finally
      {
        thread.throwStack.pop();
      }
      if( NIL != error_message )
      {
        error_messages = ConsesLow.cons( error_message, error_messages );
      }
      cdolist_list_var = cdolist_list_var.rest();
      property = cdolist_list_var.first();
    }
    if( NIL != error_messages )
    {
      Errors.error( $str5$Creation_of_collections_from_a_Te, error_messages );
    }
    return conses_high.copy_list( set.set_element_list( collections ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/term-classification-tree.lisp", position = 2672L)
  public static SubLObject initialize_term_classification_tree_collections()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    $term_classification_tree_collections$.setDynamicValue( create_term_classification_tree_collections( $term_classification_tree$.getDynamicValue( thread ) ), thread );
    return $term_classification_tree_collections$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/term-classification-tree.lisp", position = 3057L)
  public static SubLObject constant_from_tree_term(final SubLObject tree_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject error = NIL;
    try
    {
      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( $sym0$CATCH_ERROR_MESSAGE_HANDLER, thread );
        try
        {
          if( NIL != string_utilities.starts_with( tree_term, $str6$CU2FN_ ) )
          {
            final SubLObject col_union_parts = string_utilities.split_string( tree_term, $list7 );
            final SubLObject term1 = list_utilities.only_one( constant_completion_high.constant_complete( string_utilities.substring( conses_high.second( col_union_parts ), ONE_INTEGER, UNPROVIDED ), NIL, T, UNPROVIDED,
                UNPROVIDED ) );
            final SubLObject term2 = list_utilities.only_one( constant_completion_high.constant_complete( string_utilities.substring( conses_high.third( col_union_parts ), ONE_INTEGER, UNPROVIDED ), NIL, T, UNPROVIDED,
                UNPROVIDED ) );
            return narts_high.nart_substitute( ConsesLow.list( $const9$CollectionUnionFn, ConsesLow.list( $const10$TheSet, term1, term2 ) ) );
          }
          if( NIL != string_utilities.starts_with( tree_term, $str11$CU3FN_ ) )
          {
            final SubLObject col_union_parts = string_utilities.split_string( tree_term, $list7 );
            final SubLObject term1 = list_utilities.only_one( constant_completion_high.constant_complete( string_utilities.substring( conses_high.second( col_union_parts ), ONE_INTEGER, UNPROVIDED ), NIL, T, UNPROVIDED,
                UNPROVIDED ) );
            final SubLObject term2 = list_utilities.only_one( constant_completion_high.constant_complete( string_utilities.substring( conses_high.third( col_union_parts ), ONE_INTEGER, UNPROVIDED ), NIL, T, UNPROVIDED,
                UNPROVIDED ) );
            final SubLObject term3 = list_utilities.only_one( constant_completion_high.constant_complete( string_utilities.substring( conses_high.fourth( col_union_parts ), ONE_INTEGER, UNPROVIDED ), NIL, T, UNPROVIDED,
                UNPROVIDED ) );
            return narts_high.nart_substitute( ConsesLow.list( $const9$CollectionUnionFn, ConsesLow.list( $const10$TheSet, term1, term2, term3 ) ) );
          }
          return list_utilities.only_one( constant_completion_high.constant_complete( tree_term, NIL, T, UNPROVIDED, UNPROVIDED ) );
        }
        catch( final Throwable catch_var )
        {
          Errors.handleThrowable( catch_var, NIL );
        }
      }
      finally
      {
        Errors.$error_handler$.rebind( _prev_bind_0, thread );
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      error = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
    }
    finally
    {
      thread.throwStack.pop();
    }
    if( NIL != error )
    {
      Errors.error( $str12$Unable_to_find_a_constant_when_ex, tree_term );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/term-classification-tree.lisp", position = 4337L)
  public static SubLObject tree_term_from_constant(final SubLObject cycl_term)
  {
    if( NIL != nart_handles.nart_p( cycl_term ) )
    {
      if( cycl_utilities.nat_arg0( cycl_term ).eql( $const9$CollectionUnionFn ) )
      {
        final SubLObject col_union_parts = cycl_utilities.nat_arg1( cycl_term, UNPROVIDED ).rest();
        final SubLObject pcase_var;
        final SubLObject col_union_size = pcase_var = Sequences.length( col_union_parts );
        if( pcase_var.eql( TWO_INTEGER ) )
        {
          return Sequences.cconcatenate( $str13$CU2FN_1, new SubLObject[] { format_nil.format_nil_a_no_copy( string_utilities.make_valid_constant_name( kb_paths.fort_name( col_union_parts.first() ), UNPROVIDED ) ),
            $str14$_2, format_nil.format_nil_a_no_copy( string_utilities.make_valid_constant_name( kb_paths.fort_name( conses_high.second( col_union_parts ) ), UNPROVIDED ) )
          } );
        }
        if( pcase_var.eql( THREE_INTEGER ) )
        {
          return Sequences.cconcatenate( $str15$CU3FN_1, new SubLObject[] { format_nil.format_nil_a_no_copy( string_utilities.make_valid_constant_name( kb_paths.fort_name( col_union_parts.first() ), UNPROVIDED ) ),
            $str14$_2, format_nil.format_nil_a_no_copy( string_utilities.make_valid_constant_name( kb_paths.fort_name( conses_high.second( col_union_parts ) ), UNPROVIDED ) ), $str16$_3, format_nil.format_nil_a_no_copy(
                string_utilities.make_valid_constant_name( kb_paths.fort_name( conses_high.third( col_union_parts ) ), UNPROVIDED ) )
          } );
        }
        Errors.error( $str17$Invalid_NAT_being_converted_to_tr, cycl_term );
      }
      return NIL;
    }
    return string_utilities.make_valid_constant_name( kb_paths.fort_name( cycl_term ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/term-classification-tree.lisp", position = 5566L)
  public static SubLObject term_classification_tree_mt()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $term_classification_tree_mt$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/term-classification-tree.lisp", position = 5755L)
  public static SubLObject set_term_classification_tree_mt(final SubLObject mt)
  {
    assert NIL != hlmt.hlmt_p( mt ) : mt;
    $term_classification_tree_mt$.setDynamicValue( mt );
    return term_classification_tree_mt();
  }

  @SubLTranslatedFile.SubL(source = "cycl/term-classification-tree.lisp", position = 6077L)
  public static SubLObject initialize_term_classification_tree(final SubLObject v_decision_tree)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( v_decision_tree ) : v_decision_tree;
    $term_classification_tree$.setDynamicValue( decision_tree.new_decision_tree_from_weka_j48_format( v_decision_tree ), thread );
    return $term_classification_tree$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/term-classification-tree.lisp", position = 6398L)
  public static SubLObject reset_term_classification_tree()
  {
    $term_classification_tree$.setDynamicValue( NIL );
    $term_classification_tree_collections$.setDynamicValue( NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/term-classification-tree.lisp", position = 6627L)
  public static SubLObject clear_term_good_wrt_classification_treeP()
  {
    final SubLObject cs = $term_good_wrt_classification_treeP_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/term-classification-tree.lisp", position = 6627L)
  public static SubLObject remove_term_good_wrt_classification_treeP(final SubLObject v_term, final SubLObject v_decision_tree, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $term_classification_tree_mt$.getDynamicValue();
    }
    return memoization_state.caching_state_remove_function_results_with_args( $term_good_wrt_classification_treeP_caching_state$.getGlobalValue(), ConsesLow.list( v_term, v_decision_tree, mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/term-classification-tree.lisp", position = 6627L)
  public static SubLObject term_good_wrt_classification_treeP_internal(final SubLObject v_term, final SubLObject v_decision_tree, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != cycl_grammar.cycl_term_p( v_term ) : v_term;
    if( NIL == $term_classification_tree$.getDynamicValue( thread ) )
    {
      initialize_term_classification_tree( v_decision_tree );
    }
    if( NIL == $term_classification_tree_collections$.getDynamicValue( thread ) )
    {
      initialize_term_classification_tree_collections();
    }
    final SubLObject cols = $term_classification_tree_collections$.getDynamicValue( thread );
    final SubLObject isas = set_utilities.construct_set_from_list( isa.all_isa_among( v_term, cols, mt, UNPROVIDED ), Symbols.symbol_function( EQ ), UNPROVIDED );
    final SubLObject quoted_isas = set_utilities.construct_set_from_list( ( NIL != term.hl_term_p( v_term ) ) ? isa.all_quoted_isa_among( v_term, cols, mt, UNPROVIDED ) : NIL, Symbols.symbol_function( EQ ), UNPROVIDED );
    final SubLObject v_genls = set_utilities.construct_set_from_list( ( NIL != term.el_fort_p( v_term ) ) ? genls.all_genls_among( v_term, cols, mt, UNPROVIDED ) : NIL, Symbols.symbol_function( EQ ), UNPROVIDED );
    SubLObject plist = NIL;
    SubLObject cdolist_list_var = cols;
    SubLObject col = NIL;
    col = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject col_str = tree_term_from_constant( col );
      final SubLObject isa_property = Symbols.make_keyword( Strings.string_upcase( Sequences.cconcatenate( $str1$ISA_, col_str ), UNPROVIDED, UNPROVIDED ) );
      final SubLObject quoted_isa_property = Symbols.make_keyword( Strings.string_upcase( Sequences.cconcatenate( $str2$QUOTEDISA_, col_str ), UNPROVIDED, UNPROVIDED ) );
      final SubLObject genls_property = Symbols.make_keyword( Strings.string_upcase( Sequences.cconcatenate( $str3$GENLS_, col_str ), UNPROVIDED, UNPROVIDED ) );
      final SubLObject isa_value = ( NIL != set.set_memberP( col, isas ) ) ? $kw26$T : $kw27$F;
      final SubLObject quoted_isa_value = ( NIL != set.set_memberP( col, quoted_isas ) ) ? $kw26$T : $kw27$F;
      final SubLObject genls_value = ( NIL != set.set_memberP( col, v_genls ) ) ? $kw26$T : $kw27$F;
      plist = conses_high.putf( plist, isa_property, isa_value );
      plist = conses_high.putf( plist, quoted_isa_property, quoted_isa_value );
      plist = conses_high.putf( plist, genls_property, genls_value );
      cdolist_list_var = cdolist_list_var.rest();
      col = cdolist_list_var.first();
    }
    final SubLObject pcase_var;
    final SubLObject evaluation = pcase_var = decision_tree.evaluate_decision_tree( $term_classification_tree$.getDynamicValue( thread ), plist );
    if( pcase_var.eql( $sym28$GOOD ) )
    {
      return T;
    }
    if( pcase_var.eql( $sym29$BAD ) )
    {
      return NIL;
    }
    return Errors.error( $str30$Unexpected_term_classification_tr, evaluation );
  }

  @SubLTranslatedFile.SubL(source = "cycl/term-classification-tree.lisp", position = 6627L)
  public static SubLObject term_good_wrt_classification_treeP(final SubLObject v_term, final SubLObject v_decision_tree, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $term_classification_tree_mt$.getDynamicValue();
    }
    SubLObject caching_state = $term_good_wrt_classification_treeP_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym24$TERM_GOOD_WRT_CLASSIFICATION_TREE_, $sym31$_TERM_GOOD_WRT_CLASSIFICATION_TREE__CACHING_STATE_, $int32$5000, EQUAL, THREE_INTEGER,
          ZERO_INTEGER );
      memoization_state.register_hl_store_cache_clear_callback( $sym33$CLEAR_TERM_GOOD_WRT_CLASSIFICATION_TREE_ );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_3( v_term, v_decision_tree, mt );
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
        if( v_term.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( v_decision_tree.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( NIL != cached_args && NIL == cached_args.rest() && mt.equal( cached_args.first() ) )
            {
              return memoization_state.caching_results( results2 );
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( term_good_wrt_classification_treeP_internal( v_term, v_decision_tree, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( v_term, v_decision_tree, mt ) );
    return memoization_state.caching_results( results3 );
  }

  public static SubLObject declare_term_classification_tree_file()
  {
    SubLFiles.declareFunction( me, "create_term_classification_tree_collections", "CREATE-TERM-CLASSIFICATION-TREE-COLLECTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "initialize_term_classification_tree_collections", "INITIALIZE-TERM-CLASSIFICATION-TREE-COLLECTIONS", 0, 0, false );
    SubLFiles.declareFunction( me, "constant_from_tree_term", "CONSTANT-FROM-TREE-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "tree_term_from_constant", "TREE-TERM-FROM-CONSTANT", 1, 0, false );
    SubLFiles.declareFunction( me, "term_classification_tree_mt", "TERM-CLASSIFICATION-TREE-MT", 0, 0, false );
    SubLFiles.declareFunction( me, "set_term_classification_tree_mt", "SET-TERM-CLASSIFICATION-TREE-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "initialize_term_classification_tree", "INITIALIZE-TERM-CLASSIFICATION-TREE", 1, 0, false );
    SubLFiles.declareFunction( me, "reset_term_classification_tree", "RESET-TERM-CLASSIFICATION-TREE", 0, 0, false );
    SubLFiles.declareFunction( me, "clear_term_good_wrt_classification_treeP", "CLEAR-TERM-GOOD-WRT-CLASSIFICATION-TREE?", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_term_good_wrt_classification_treeP", "REMOVE-TERM-GOOD-WRT-CLASSIFICATION-TREE?", 2, 1, false );
    SubLFiles.declareFunction( me, "term_good_wrt_classification_treeP_internal", "TERM-GOOD-WRT-CLASSIFICATION-TREE?-INTERNAL", 3, 0, false );
    SubLFiles.declareFunction( me, "term_good_wrt_classification_treeP", "TERM-GOOD-WRT-CLASSIFICATION-TREE?", 2, 1, false );
    return NIL;
  }

  public static SubLObject init_term_classification_tree_file()
  {
    $term_classification_tree_collections$ = SubLFiles.defparameter( "*TERM-CLASSIFICATION-TREE-COLLECTIONS*", NIL );
    $term_classification_tree_mt$ = SubLFiles.defparameter( "*TERM-CLASSIFICATION-TREE-MT*", $const18$CurrentWorldDataCollectorMt_NonHo );
    $term_classification_tree$ = SubLFiles.defparameter( "*TERM-CLASSIFICATION-TREE*", NIL );
    $term_good_wrt_classification_treeP_caching_state$ = SubLFiles.deflexical( "*TERM-GOOD-WRT-CLASSIFICATION-TREE?-CACHING-STATE*", NIL );
    return NIL;
  }

  public static SubLObject setup_term_classification_tree_file()
  {
    access_macros.register_external_symbol( $sym19$TERM_CLASSIFICATION_TREE_MT );
    access_macros.register_external_symbol( $sym20$SET_TERM_CLASSIFICATION_TREE_MT );
    access_macros.register_external_symbol( $sym23$RESET_TERM_CLASSIFICATION_TREE );
    memoization_state.note_globally_cached_function( $sym24$TERM_GOOD_WRT_CLASSIFICATION_TREE_ );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_term_classification_tree_file();
  }

  @Override
  public void initializeVariables()
  {
    init_term_classification_tree_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_term_classification_tree_file();
  }
  static
  {
    me = new term_classification_tree();
    $term_classification_tree_collections$ = null;
    $term_classification_tree_mt$ = null;
    $term_classification_tree$ = null;
    $term_good_wrt_classification_treeP_caching_state$ = null;
    $sym0$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $str1$ISA_ = makeString( "ISA_" );
    $str2$QUOTEDISA_ = makeString( "QUOTEDISA_" );
    $str3$GENLS_ = makeString( "GENLS_" );
    $str4$Unexpected_term_classification_tr = makeString( "Unexpected term classification tree property ~s" );
    $str5$Creation_of_collections_from_a_Te = makeString( "Creation of collections from a Term Classification Tree failed due to the following errors: ~%~A~%" );
    $str6$CU2FN_ = makeString( "CU2FN_" );
    $list7 = ConsesLow.list( Characters.CHAR_underbar );
    $sym8$_EXIT = makeSymbol( "%EXIT" );
    $const9$CollectionUnionFn = constant_handles.reader_make_constant_shell( makeString( "CollectionUnionFn" ) );
    $const10$TheSet = constant_handles.reader_make_constant_shell( makeString( "TheSet" ) );
    $str11$CU3FN_ = makeString( "CU3FN_" );
    $str12$Unable_to_find_a_constant_when_ex = makeString( "Unable to find a constant when executing (CONSTANT-FROM-TREE-TERM ~S)" );
    $str13$CU2FN_1 = makeString( "CU2FN_1" );
    $str14$_2 = makeString( "_2" );
    $str15$CU3FN_1 = makeString( "CU3FN_1" );
    $str16$_3 = makeString( "_3" );
    $str17$Invalid_NAT_being_converted_to_tr = makeString( "Invalid NAT being converted to tree-term: ~S" );
    $const18$CurrentWorldDataCollectorMt_NonHo = constant_handles.reader_make_constant_shell( makeString( "CurrentWorldDataCollectorMt-NonHomocentric" ) );
    $sym19$TERM_CLASSIFICATION_TREE_MT = makeSymbol( "TERM-CLASSIFICATION-TREE-MT" );
    $sym20$SET_TERM_CLASSIFICATION_TREE_MT = makeSymbol( "SET-TERM-CLASSIFICATION-TREE-MT" );
    $sym21$HLMT_P = makeSymbol( "HLMT-P" );
    $sym22$STRINGP = makeSymbol( "STRINGP" );
    $sym23$RESET_TERM_CLASSIFICATION_TREE = makeSymbol( "RESET-TERM-CLASSIFICATION-TREE" );
    $sym24$TERM_GOOD_WRT_CLASSIFICATION_TREE_ = makeSymbol( "TERM-GOOD-WRT-CLASSIFICATION-TREE?" );
    $sym25$CYCL_TERM_P = makeSymbol( "CYCL-TERM-P" );
    $kw26$T = makeKeyword( "T" );
    $kw27$F = makeKeyword( "F" );
    $sym28$GOOD = makeSymbol( "GOOD" );
    $sym29$BAD = makeSymbol( "BAD" );
    $str30$Unexpected_term_classification_tr = makeString( "Unexpected term classification tree evaluation ~s" );
    $sym31$_TERM_GOOD_WRT_CLASSIFICATION_TREE__CACHING_STATE_ = makeSymbol( "*TERM-GOOD-WRT-CLASSIFICATION-TREE?-CACHING-STATE*" );
    $int32$5000 = makeInteger( 5000 );
    $sym33$CLEAR_TERM_GOOD_WRT_CLASSIFICATION_TREE_ = makeSymbol( "CLEAR-TERM-GOOD-WRT-CLASSIFICATION-TREE?" );
  }
}
/*
 * 
 * Total time: 93 ms
 * 
 */
package com.cyc.cycjava.cycl;

import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rtv
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.rtv";
  public static final String myFingerPrint = "926e01ddcbd7ea171aa9e67acc3ac782936a8a0e10e5123130cc518c939df40d";
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1810L)
  private static SubLSymbol $rtv_intersection_table$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3612L)
  public static SubLSymbol $rtv_predicates$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8959L)
  private static SubLSymbol $rtv_walk_prevent_loopsP$;
  private static final SubLSymbol $kw0$UNINITIALIZED;
  private static final SubLSymbol $kw1$NODES;
  private static final SubLSymbol $kw2$EDGES;
  private static final SubLSymbol $kw3$UNINTIALIZED;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLSymbol $kw6$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw7$LINK_VAR;
  private static final SubLSymbol $kw8$PREDICATES;
  private static final SubLSymbol $sym9$SOURCE_VAR;
  private static final SubLSymbol $sym10$CLET;
  private static final SubLSymbol $sym11$DO_RTV_LINKS;
  private static final SubLSymbol $sym12$LINK;
  private static final SubLSymbol $sym13$INDEX_ARG;
  private static final SubLSymbol $sym14$GATHER_ARG;
  private static final SubLSymbol $sym15$_RTV_PREDICATES_;
  private static final SubLSymbol $sym16$CDOLIST;
  private static final SubLList $list17;
  private static final SubLSymbol $sym18$DO_LIST;
  private static final SubLSymbol $sym19$RTV_ACCESSIBLE_EDGES;
  private static final SubLSymbol $sym20$FIF;
  private static final SubLSymbol $sym21$_;
  private static final SubLList $list22;
  private static final SubLList $list23;
  private static final SubLSymbol $sym24$GAF_ARG;
  private static final SubLSymbol $sym25$RELEVANT_PRED_IS_IN_LIST;
  private static final SubLSymbol $kw26$GAF;
  private static final SubLSymbol $kw27$TRUE;
  private static final SubLList $list28;
  private static final SubLSymbol $sym29$SOURCE_VAR;
  private static final SubLSymbol $sym30$DO_RTV_EDGE_MAP_NODES;
  private static final SubLSymbol $sym31$EDGE_MAP_VAR;
  private static final SubLSymbol $sym32$TARGET_MAP;
  private static final SubLSymbol $sym33$EDGE_SET;
  private static final SubLSymbol $sym34$MAP_GET_WITHOUT_VALUES;
  private static final SubLList $list35;
  private static final SubLSymbol $sym36$PWHEN;
  private static final SubLSymbol $sym37$DO_MAP;
  private static final SubLSymbol $sym38$IGNORE;
  private static final SubLList $list39;
  private static final SubLSymbol $sym40$SOURCE_VAR;
  private static final SubLSymbol $sym41$DO_RTV_EDGE_MAP_LINKS;
  private static final SubLSymbol $sym42$TARGET_VAR;
  private static final SubLSymbol $sym43$EDGE_MAP_VAR;
  private static final SubLSymbol $sym44$TARGET_MAP;
  private static final SubLSymbol $sym45$EDGE_SET;
  private static final SubLSymbol $sym46$DO_SET;
  private static final SubLSymbol $sym47$NON_NEGATIVE_INTEGER_P;
  private static final SubLString $str48$Unexpected_return_type___S;
  private static final SubLList $list49;
  private static final SubLSymbol $sym50$MAKE_SET_FROM_LIST;
  private static final SubLSymbol $sym51$SET_SIZE;
  private static final SubLList $list52;
  private static final SubLList $list53;
  private static final SubLList $list54;
  private static final SubLList $list55;

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2972L)
  public static SubLObject new_rtv_intersection_table(SubLObject size)
  {
    if( size == UNPROVIDED )
    {
      size = ZERO_INTEGER;
    }
    return keyhash.new_keyhash( size, Symbols.symbol_function( EQL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3069L)
  public static SubLObject rtv_union(final SubLObject left_solution, final SubLObject right_solution)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return keyhash_utilities.fast_union( left_solution, right_solution, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ), $rtv_intersection_table$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3221L)
  public static SubLObject rtv_intersection(final SubLObject left_solution, final SubLObject right_solution)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return keyhash_utilities.fast_intersection( left_solution, right_solution, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ), $rtv_intersection_table$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3386L)
  public static SubLObject rtv_sort(final SubLObject items, SubLObject return_type)
  {
    if( return_type == UNPROVIDED )
    {
      return_type = $kw1$NODES;
    }
    final SubLObject pcase_var = return_type;
    if( pcase_var.eql( $kw1$NODES ) )
    {
      return kb_utilities.sort_terms( items, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    if( pcase_var.eql( $kw2$EDGES ) )
    {
      return assertion_utilities.sort_assertions( items );
    }
    return kb_utilities.sort_terms( items, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3868L)
  public static SubLObject do_rtv_links(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list4 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject target_var = NIL;
    SubLObject source = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list4 );
    target_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list4 );
    source = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list4 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list4 );
      if( NIL == conses_high.member( current_$1, $list5, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw6$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list4 );
    }
    final SubLObject link_var_tail = cdestructuring_bind.property_list_member( $kw7$LINK_VAR, current );
    final SubLObject link_var = ( NIL != link_var_tail ) ? conses_high.cadr( link_var_tail ) : NIL;
    final SubLObject predicates_tail = cdestructuring_bind.property_list_member( $kw8$PREDICATES, current );
    final SubLObject predicates = ( NIL != predicates_tail ) ? conses_high.cadr( predicates_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    if( !source.isAtom() )
    {
      final SubLObject source_var = $sym9$SOURCE_VAR;
      return ConsesLow.list( $sym10$CLET, ConsesLow.list( ConsesLow.list( source_var, source ) ), ConsesLow.listS( $sym11$DO_RTV_LINKS, ConsesLow.list( target_var, source_var, $kw7$LINK_VAR, link_var, $kw8$PREDICATES,
          predicates ), ConsesLow.append( body, NIL ) ) );
    }
    if( NIL == link_var )
    {
      final SubLObject link = $sym12$LINK;
      return ConsesLow.listS( $sym11$DO_RTV_LINKS, ConsesLow.list( target_var, source, $kw7$LINK_VAR, link, $kw8$PREDICATES, predicates ), ConsesLow.append( body, NIL ) );
    }
    final SubLObject index_arg = $sym13$INDEX_ARG;
    final SubLObject gather_arg = $sym14$GATHER_ARG;
    return ConsesLow.list( $sym10$CLET, ConsesLow.list( ConsesLow.list( $sym15$_RTV_PREDICATES_, predicates ) ), ConsesLow.list( $sym16$CDOLIST, reader.bq_cons( index_arg, $list17 ), ConsesLow.list( $sym18$DO_LIST,
        ConsesLow.list( link_var, ConsesLow.list( $sym19$RTV_ACCESSIBLE_EDGES, source, index_arg ) ), ConsesLow.listS( $sym10$CLET, ConsesLow.list( ConsesLow.list( gather_arg, ConsesLow.listS( $sym20$FIF, ConsesLow
            .listS( $sym21$_, index_arg, $list22 ), $list23 ) ), ConsesLow.list( target_var, ConsesLow.list( $sym24$GAF_ARG, link_var, gather_arg ) ) ), ConsesLow.append( body, NIL ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4959L)
  public static SubLObject rtv_accessible_edges_internal(final SubLObject source_node, final SubLObject argnum)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject edges = NIL;
    final SubLObject _prev_bind_0 = pred_relevance_macros.$relevant_pred_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = pred_relevance_macros.$relevant_preds$.currentBinding( thread );
    try
    {
      pred_relevance_macros.$relevant_pred_function$.bind( $sym25$RELEVANT_PRED_IS_IN_LIST, thread );
      pred_relevance_macros.$relevant_preds$.bind( $rtv_predicates$.getDynamicValue( thread ), thread );
      final SubLObject pred_var = NIL;
      if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( source_node, argnum, pred_var ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( source_node, argnum, pred_var );
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
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw26$GAF, $kw27$TRUE, NIL );
              SubLObject done_var_$2 = NIL;
              final SubLObject token_var_$3 = NIL;
              while ( NIL == done_var_$2)
              {
                final SubLObject edge = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$3 );
                final SubLObject valid_$4 = makeBoolean( !token_var_$3.eql( edge ) );
                if( NIL != valid_$4 )
                {
                  edges = ConsesLow.cons( edge, edges );
                }
                done_var_$2 = makeBoolean( NIL == valid_$4 );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$5, thread );
              }
            }
          }
          done_var = makeBoolean( NIL == valid );
        }
      }
    }
    finally
    {
      pred_relevance_macros.$relevant_preds$.rebind( _prev_bind_2, thread );
      pred_relevance_macros.$relevant_pred_function$.rebind( _prev_bind_0, thread );
    }
    return Sequences.nreverse( edges );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4959L)
  public static SubLObject rtv_accessible_edges(final SubLObject source_node, final SubLObject argnum)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return rtv_accessible_edges_internal( source_node, argnum );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym19$RTV_ACCESSIBLE_EDGES, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym19$RTV_ACCESSIBLE_EDGES, TWO_INTEGER, NIL, EQL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym19$RTV_ACCESSIBLE_EDGES, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( source_node, argnum );
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
        if( source_node.eql( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && argnum.eql( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( rtv_accessible_edges_internal( source_node, argnum ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( source_node, argnum ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5287L)
  public static SubLObject do_rtv_edge_map_nodes(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list28 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject target_var = NIL;
    SubLObject source = NIL;
    SubLObject edge_map = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list28 );
    target_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list28 );
    source = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list28 );
    edge_map = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list28 );
      return NIL;
    }
    final SubLObject body;
    current = ( body = temp );
    if( !source.isAtom() )
    {
      final SubLObject source_var = $sym29$SOURCE_VAR;
      return ConsesLow.list( $sym10$CLET, ConsesLow.list( ConsesLow.list( source_var, source ) ), ConsesLow.listS( $sym30$DO_RTV_EDGE_MAP_NODES, ConsesLow.list( target_var, source_var, edge_map ), ConsesLow.append( body,
          NIL ) ) );
    }
    if( !edge_map.isAtom() )
    {
      final SubLObject edge_map_var = $sym31$EDGE_MAP_VAR;
      return ConsesLow.list( $sym10$CLET, ConsesLow.list( ConsesLow.list( edge_map_var, edge_map ) ), ConsesLow.listS( $sym30$DO_RTV_EDGE_MAP_NODES, ConsesLow.list( target_var, source, edge_map_var ), ConsesLow.append(
          body, NIL ) ) );
    }
    final SubLObject target_map = $sym32$TARGET_MAP;
    final SubLObject edge_set = $sym33$EDGE_SET;
    return ConsesLow.list( $sym10$CLET, ConsesLow.list( ConsesLow.list( target_map, ConsesLow.listS( $sym34$MAP_GET_WITHOUT_VALUES, edge_map, source, $list35 ) ) ), ConsesLow.list( $sym36$PWHEN, target_map, ConsesLow
        .listS( $sym37$DO_MAP, ConsesLow.list( target_var, edge_set, target_map ), ConsesLow.list( $sym38$IGNORE, edge_set ), ConsesLow.append( body, NIL ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6098L)
  public static SubLObject do_rtv_edge_map_links(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list39 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject link_var = NIL;
    SubLObject source = NIL;
    SubLObject target = NIL;
    SubLObject edge_map = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list39 );
    link_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list39 );
    source = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list39 );
    target = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list39 );
    edge_map = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list39 );
      return NIL;
    }
    final SubLObject body;
    current = ( body = temp );
    if( !source.isAtom() )
    {
      final SubLObject source_var = $sym40$SOURCE_VAR;
      return ConsesLow.list( $sym10$CLET, ConsesLow.list( ConsesLow.list( source_var, source ) ), ConsesLow.listS( $sym41$DO_RTV_EDGE_MAP_LINKS, ConsesLow.list( link_var, source_var, target, edge_map ), ConsesLow.append(
          body, NIL ) ) );
    }
    if( !target.isAtom() )
    {
      final SubLObject target_var = $sym42$TARGET_VAR;
      return ConsesLow.list( $sym10$CLET, ConsesLow.list( ConsesLow.list( target_var, target ) ), ConsesLow.listS( $sym41$DO_RTV_EDGE_MAP_LINKS, ConsesLow.list( link_var, source, target_var, edge_map ), ConsesLow.append(
          body, NIL ) ) );
    }
    if( !edge_map.isAtom() )
    {
      final SubLObject edge_map_var = $sym43$EDGE_MAP_VAR;
      return ConsesLow.list( $sym10$CLET, ConsesLow.list( ConsesLow.list( edge_map_var, edge_map ) ), ConsesLow.listS( $sym41$DO_RTV_EDGE_MAP_LINKS, ConsesLow.list( link_var, source, target, edge_map_var ), ConsesLow
          .append( body, NIL ) ) );
    }
    final SubLObject target_map = $sym44$TARGET_MAP;
    final SubLObject edge_set = $sym45$EDGE_SET;
    return ConsesLow.list( $sym10$CLET, ConsesLow.list( ConsesLow.list( target_map, ConsesLow.listS( $sym34$MAP_GET_WITHOUT_VALUES, edge_map, source, $list35 ) ) ), ConsesLow.list( $sym36$PWHEN, target_map, ConsesLow
        .list( $sym10$CLET, ConsesLow.list( ConsesLow.list( edge_set, ConsesLow.listS( $sym34$MAP_GET_WITHOUT_VALUES, target_map, target, $list35 ) ) ), ConsesLow.list( $sym36$PWHEN, edge_set, ConsesLow.listS(
            $sym46$DO_SET, ConsesLow.list( link_var, edge_set ), ConsesLow.append( body, NIL ) ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7176L)
  public static SubLObject rtv_walk_from_nodes(final SubLObject source_nodes, final SubLObject predicates, final SubLObject length, final SubLObject return_type, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != subl_promotions.non_negative_integer_p( length ) : length;
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = $rtv_intersection_table$.currentBinding( thread );
    try
    {
      $rtv_intersection_table$.bind( new_rtv_intersection_table( UNPROVIDED ), thread );
      final SubLObject mt_var = mt;
      final SubLObject _prev_bind_0_$6 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
        if( ZERO_INTEGER.numE( length ) )
        {
          if( return_type.eql( $kw1$NODES ) )
          {
            result = source_nodes;
          }
          else if( return_type.eql( $kw2$EDGES ) )
          {
            result = NIL;
          }
          else
          {
            Errors.error( $str48$Unexpected_return_type___S, return_type );
          }
        }
        else
        {
          final SubLObject local_state;
          final SubLObject state = local_state = memoization_state.new_memoization_state( UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          final SubLObject _prev_bind_0_$7 = memoization_state.$memoization_state$.currentBinding( thread );
          try
          {
            memoization_state.$memoization_state$.bind( local_state, thread );
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
            try
            {
              result = rtv_walk_from_nodes_internal( source_nodes, predicates, length, return_type );
            }
            finally
            {
              final SubLObject _prev_bind_0_$8 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$8, thread );
              }
            }
          }
          finally
          {
            memoization_state.$memoization_state$.rebind( _prev_bind_0_$7, thread );
          }
        }
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0_$6, thread );
      }
    }
    finally
    {
      $rtv_intersection_table$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7888L)
  public static SubLObject rtv_walk_from_nodes_internal(final SubLObject source_nodes, final SubLObject predicates, final SubLObject length, final SubLObject return_type)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject gather_edgesP = Equality.eq( return_type, $kw2$EDGES );
    final SubLObject visited_edges = ( NIL != gather_edgesP ) ? set.new_set( Symbols.symbol_function( EQL ), ZERO_INTEGER ) : NIL;
    final SubLObject visited_nodes = set_utilities.make_set_from_list( source_nodes, Symbols.symbol_function( EQL ) );
    SubLObject swap_var;
    for( SubLObject last_queue = queues.enqueue_all( source_nodes, queues.create_queue( UNPROVIDED ) ), next_queue = queues.create_queue( UNPROVIDED ), remaining_steps = length; !remaining_steps
        .isZero(); remaining_steps = Numbers.subtract( remaining_steps, ONE_INTEGER ), swap_var = last_queue, last_queue = next_queue, next_queue = swap_var )
    {
      SubLObject cdolist_list_var = queues.do_queue_elements_queue_elements( last_queue );
      SubLObject source_node = NIL;
      source_node = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject _prev_bind_0 = $rtv_predicates$.currentBinding( thread );
        try
        {
          $rtv_predicates$.bind( predicates, thread );
          SubLObject cdolist_list_var_$9 = $list49;
          SubLObject index_arg = NIL;
          index_arg = cdolist_list_var_$9.first();
          while ( NIL != cdolist_list_var_$9)
          {
            SubLObject cdolist_list_var_$10 = rtv_accessible_edges( source_node, index_arg );
            SubLObject edge = NIL;
            edge = cdolist_list_var_$10.first();
            while ( NIL != cdolist_list_var_$10)
            {
              final SubLObject gather_arg = index_arg.numE( ONE_INTEGER ) ? TWO_INTEGER : ONE_INTEGER;
              final SubLObject target_node = assertions_high.gaf_arg( edge, gather_arg );
              if( NIL != gather_edgesP && NIL == set.set_memberP( edge, visited_edges ) )
              {
                set.set_add( edge, visited_edges );
              }
              if( NIL == set.set_memberP( target_node, visited_nodes ) )
              {
                queues.enqueue( target_node, next_queue );
                set.set_add( target_node, visited_nodes );
              }
              cdolist_list_var_$10 = cdolist_list_var_$10.rest();
              edge = cdolist_list_var_$10.first();
            }
            cdolist_list_var_$9 = cdolist_list_var_$9.rest();
            index_arg = cdolist_list_var_$9.first();
          }
        }
        finally
        {
          $rtv_predicates$.rebind( _prev_bind_0, thread );
        }
        cdolist_list_var = cdolist_list_var.rest();
        source_node = cdolist_list_var.first();
      }
    }
    if( return_type.eql( $kw1$NODES ) )
    {
      return set.set_element_list( visited_nodes );
    }
    if( return_type.eql( $kw2$EDGES ) )
    {
      return set.set_element_list( visited_edges );
    }
    return Errors.error( $str48$Unexpected_return_type___S, return_type );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9034L)
  public static SubLObject rtv_walk_between_nodes(final SubLObject left_nodes, final SubLObject right_nodes, final SubLObject predicates, final SubLObject length, final SubLObject return_type, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != subl_promotions.non_negative_integer_p( length ) : length;
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = $rtv_intersection_table$.currentBinding( thread );
    try
    {
      $rtv_intersection_table$.bind( new_rtv_intersection_table( UNPROVIDED ), thread );
      final SubLObject mt_var = mt;
      final SubLObject _prev_bind_0_$11 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
        if( ZERO_INTEGER.numE( length ) )
        {
          if( return_type.eql( $kw1$NODES ) )
          {
            result = rtv_intersection( left_nodes, right_nodes );
          }
          else if( return_type.eql( $kw2$EDGES ) )
          {
            result = NIL;
          }
          else
          {
            Errors.error( $str48$Unexpected_return_type___S, return_type );
          }
        }
        else
        {
          final SubLObject local_state;
          final SubLObject state = local_state = memoization_state.new_memoization_state( UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          final SubLObject _prev_bind_0_$12 = memoization_state.$memoization_state$.currentBinding( thread );
          try
          {
            memoization_state.$memoization_state$.bind( local_state, thread );
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
            try
            {
              if( NIL != $rtv_walk_prevent_loopsP$.getDynamicValue( thread ) )
              {
                result = rtv_walk_between_nodes_internal( left_nodes, right_nodes, predicates, length, return_type );
              }
              else
              {
                result = rtv_walk_between_nodes_recursive( left_nodes, right_nodes, predicates, length, return_type );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$13 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$13, thread );
              }
            }
          }
          finally
          {
            memoization_state.$memoization_state$.rebind( _prev_bind_0_$12, thread );
          }
        }
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0_$11, thread );
      }
    }
    finally
    {
      $rtv_intersection_table$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9938L)
  public static SubLObject rtv_length_to_islands(final SubLObject length, final SubLObject left_size, final SubLObject right_size)
  {
    final SubLObject half = Numbers.integerDivide( length, TWO_INTEGER );
    if( NIL != Numbers.evenp( length ) )
    {
      return Values.values( half, half );
    }
    if( left_size.numGE( right_size ) )
    {
      return Values.values( number_utilities.f_1X( half ), half );
    }
    return Values.values( half, number_utilities.f_1X( half ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10202L)
  public static SubLObject rtv_walk_between_nodes_recursive(final SubLObject left_nodes, final SubLObject right_nodes, final SubLObject predicates, final SubLObject length, final SubLObject return_type)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( ONE_INTEGER.numE( length ) )
    {
      return rtv_walk_between_nodes_directly( left_nodes, right_nodes, predicates, return_type );
    }
    thread.resetMultipleValues();
    final SubLObject left_length = rtv_length_to_islands( length, Sequences.length( left_nodes ), Sequences.length( right_nodes ) );
    final SubLObject right_length = thread.secondMultipleValue();
    thread.resetMultipleValues();
    final SubLObject horizon_from_left = rtv_walk_from_nodes_internal( left_nodes, predicates, left_length, $kw1$NODES );
    final SubLObject horizon_from_right = rtv_walk_from_nodes_internal( right_nodes, predicates, right_length, $kw1$NODES );
    final SubLObject island_nodes = rtv_intersection( horizon_from_left, horizon_from_right );
    final SubLObject left_subsolution = rtv_walk_between_nodes_recursive( left_nodes, island_nodes, predicates, left_length, return_type );
    final SubLObject right_subsolution = rtv_walk_between_nodes_recursive( island_nodes, right_nodes, predicates, right_length, return_type );
    final SubLObject full_solution = rtv_union( left_subsolution, right_subsolution );
    return full_solution;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11226L)
  public static SubLObject rtv_walk_between_nodes_directly(final SubLObject left_nodes, final SubLObject right_nodes, final SubLObject predicates, final SubLObject return_type)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject gather_nodesP = Equality.equal( return_type, $kw1$NODES );
    final SubLObject gather_edgesP = Equality.equal( return_type, $kw2$EDGES );
    final SubLObject linked_nodes = ( NIL != gather_nodesP ) ? set.new_set( Symbols.symbol_function( EQL ), ZERO_INTEGER ) : NIL;
    final SubLObject direct_edges = ( NIL != gather_edgesP ) ? set.new_set( Symbols.symbol_function( EQL ), ZERO_INTEGER ) : NIL;
    SubLObject source_nodes = NIL;
    SubLObject target_nodes = NIL;
    SubLObject target_set = NIL;
    if( Sequences.length( left_nodes ).numLE( Sequences.length( right_nodes ) ) )
    {
      source_nodes = left_nodes;
      target_nodes = right_nodes;
    }
    else
    {
      source_nodes = right_nodes;
      target_nodes = left_nodes;
    }
    target_set = set_utilities.construct_set_from_list( target_nodes, Symbols.symbol_function( EQL ), UNPROVIDED );
    SubLObject cdolist_list_var = source_nodes;
    SubLObject source_node = NIL;
    source_node = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject _prev_bind_0 = $rtv_predicates$.currentBinding( thread );
      try
      {
        $rtv_predicates$.bind( predicates, thread );
        SubLObject cdolist_list_var_$14 = $list49;
        SubLObject index_arg = NIL;
        index_arg = cdolist_list_var_$14.first();
        while ( NIL != cdolist_list_var_$14)
        {
          SubLObject cdolist_list_var_$15 = rtv_accessible_edges( source_node, index_arg );
          SubLObject direct_edge = NIL;
          direct_edge = cdolist_list_var_$15.first();
          while ( NIL != cdolist_list_var_$15)
          {
            final SubLObject gather_arg = index_arg.numE( ONE_INTEGER ) ? TWO_INTEGER : ONE_INTEGER;
            final SubLObject candidate_node = assertions_high.gaf_arg( direct_edge, gather_arg );
            if( NIL != set.set_memberP( candidate_node, target_set ) )
            {
              if( NIL != gather_edgesP )
              {
                set.set_add( direct_edge, direct_edges );
              }
              if( NIL != gather_nodesP )
              {
                set.set_add( source_node, linked_nodes );
                set.set_add( candidate_node, linked_nodes );
              }
            }
            cdolist_list_var_$15 = cdolist_list_var_$15.rest();
            direct_edge = cdolist_list_var_$15.first();
          }
          cdolist_list_var_$14 = cdolist_list_var_$14.rest();
          index_arg = cdolist_list_var_$14.first();
        }
      }
      finally
      {
        $rtv_predicates$.rebind( _prev_bind_0, thread );
      }
      cdolist_list_var = cdolist_list_var.rest();
      source_node = cdolist_list_var.first();
    }
    if( return_type.eql( $kw1$NODES ) )
    {
      return set.set_element_list( linked_nodes );
    }
    if( return_type.eql( $kw2$EDGES ) )
    {
      return set.set_element_list( direct_edges );
    }
    return Errors.error( $str48$Unexpected_return_type___S, return_type );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12477L)
  public static SubLObject rtv_walk_between_nodes_internal(final SubLObject left_nodes, final SubLObject right_nodes, final SubLObject predicates, final SubLObject length, final SubLObject return_type)
  {
    SubLObject full_solution = NIL;
    SubLObject end_var;
    SubLObject n;
    SubLObject partial_solution;
    for( end_var = number_utilities.f_1X( length ), n = NIL, n = ZERO_INTEGER; !n.numGE( end_var ); n = number_utilities.f_1X( n ) )
    {
      partial_solution = rtv_walk_between_nodes_of_length( left_nodes, right_nodes, predicates, n, return_type );
      if( n.isZero() )
      {
        full_solution = partial_solution;
      }
      else
      {
        full_solution = rtv_union( full_solution, partial_solution );
      }
    }
    return full_solution;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12975L)
  public static SubLObject rtv_walk_between_nodes_of_length(final SubLObject left_nodes, final SubLObject right_nodes, final SubLObject predicates, final SubLObject length, final SubLObject return_type)
  {
    final SubLObject node_level_lists = rtv_walk_node_levels( left_nodes, right_nodes, predicates, length );
    final SubLObject node_level_sets = Mapping.mapcar( Symbols.symbol_function( $sym50$MAKE_SET_FROM_LIST ), node_level_lists );
    final SubLObject relevant_edge_map = rtv_walk_relevant_edge_map( node_level_sets, predicates );
    final SubLObject length_solution = rtv_walk_across_node_levels( node_level_sets, relevant_edge_map, return_type );
    return length_solution;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13506L)
  public static SubLObject rtv_walk_node_levels(final SubLObject left_nodes, final SubLObject right_nodes, final SubLObject predicates, final SubLObject length)
  {
    return rtv_walk_node_levels_recursive( ZERO_INTEGER, length, left_nodes, right_nodes, predicates );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13672L)
  public static SubLObject rtv_walk_node_levels_recursive(final SubLObject left_level, final SubLObject right_level, final SubLObject left_nodes, final SubLObject right_nodes, final SubLObject predicates)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject length = Numbers.subtract( right_level, left_level );
    if( ZERO_INTEGER.numE( length ) )
    {
      final SubLObject level_nodes = rtv_intersection( left_nodes, right_nodes );
      return ConsesLow.list( level_nodes );
    }
    if( ONE_INTEGER.numE( length ) )
    {
      thread.resetMultipleValues();
      final SubLObject connected_left_nodes = rtv_directly_connected_node_subsets( left_nodes, right_nodes, predicates );
      final SubLObject connected_right_nodes = thread.secondMultipleValue();
      thread.resetMultipleValues();
      return ConsesLow.list( connected_left_nodes, connected_right_nodes );
    }
    thread.resetMultipleValues();
    final SubLObject left_length = rtv_length_to_islands( length, Sequences.length( left_nodes ), Sequences.length( right_nodes ) );
    final SubLObject right_length = thread.secondMultipleValue();
    thread.resetMultipleValues();
    final SubLObject horizon_from_left = rtv_walk_from_nodes_internal( left_nodes, predicates, left_length, $kw1$NODES );
    final SubLObject horizon_from_right = rtv_walk_from_nodes_internal( right_nodes, predicates, right_length, $kw1$NODES );
    final SubLObject island_nodes = rtv_intersection( horizon_from_left, horizon_from_right );
    final SubLObject island_level = Numbers.add( left_level, left_length );
    final SubLObject left_subsolution = rtv_walk_node_levels_recursive( left_level, island_level, left_nodes, island_nodes, predicates );
    final SubLObject right_subsolution = rtv_walk_node_levels_recursive( island_level, right_level, island_nodes, right_nodes, predicates );
    final SubLObject left_node_levels = conses_high.butlast( left_subsolution, UNPROVIDED );
    final SubLObject island_node_level_left = list_utilities.last_one( left_subsolution );
    final SubLObject island_node_level_right = right_subsolution.first();
    final SubLObject right_node_levels = right_subsolution.rest();
    final SubLObject island_node_level = rtv_intersection( island_node_level_left, island_node_level_right );
    final SubLObject full_solution = ConsesLow.append( left_node_levels, ConsesLow.list( island_node_level ), right_node_levels );
    return full_solution;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15692L)
  public static SubLObject rtv_directly_connected_node_subsets(final SubLObject left_nodes, final SubLObject right_nodes, final SubLObject predicates)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject connected_source_set = set.new_set( Symbols.symbol_function( EQL ), ZERO_INTEGER );
    final SubLObject connected_target_set = set.new_set( Symbols.symbol_function( EQL ), ZERO_INTEGER );
    SubLObject source_nodes = NIL;
    SubLObject target_nodes = NIL;
    SubLObject swappedP = NIL;
    SubLObject target_set = NIL;
    if( Sequences.length( left_nodes ).numLE( Sequences.length( right_nodes ) ) )
    {
      source_nodes = left_nodes;
      target_nodes = right_nodes;
      swappedP = NIL;
    }
    else
    {
      source_nodes = right_nodes;
      target_nodes = left_nodes;
      swappedP = T;
    }
    target_set = set_utilities.construct_set_from_list( target_nodes, Symbols.symbol_function( EQL ), UNPROVIDED );
    SubLObject cdolist_list_var = source_nodes;
    SubLObject source_node = NIL;
    source_node = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject _prev_bind_0 = $rtv_predicates$.currentBinding( thread );
      try
      {
        $rtv_predicates$.bind( predicates, thread );
        SubLObject cdolist_list_var_$16 = $list49;
        SubLObject index_arg = NIL;
        index_arg = cdolist_list_var_$16.first();
        while ( NIL != cdolist_list_var_$16)
        {
          SubLObject cdolist_list_var_$17 = rtv_accessible_edges( source_node, index_arg );
          SubLObject direct_edge = NIL;
          direct_edge = cdolist_list_var_$17.first();
          while ( NIL != cdolist_list_var_$17)
          {
            final SubLObject gather_arg = index_arg.numE( ONE_INTEGER ) ? TWO_INTEGER : ONE_INTEGER;
            final SubLObject candidate_node = assertions_high.gaf_arg( direct_edge, gather_arg );
            if( NIL != set.set_memberP( candidate_node, target_set ) )
            {
              set.set_add( source_node, connected_source_set );
              set.set_add( candidate_node, connected_target_set );
            }
            cdolist_list_var_$17 = cdolist_list_var_$17.rest();
            direct_edge = cdolist_list_var_$17.first();
          }
          cdolist_list_var_$16 = cdolist_list_var_$16.rest();
          index_arg = cdolist_list_var_$16.first();
        }
      }
      finally
      {
        $rtv_predicates$.rebind( _prev_bind_0, thread );
      }
      cdolist_list_var = cdolist_list_var.rest();
      source_node = cdolist_list_var.first();
    }
    final SubLObject connected_left_nodes = set.set_element_list( ( NIL != swappedP ) ? connected_target_set : connected_source_set );
    final SubLObject connected_right_nodes = set.set_element_list( ( NIL != swappedP ) ? connected_source_set : connected_target_set );
    return Values.values( connected_left_nodes, connected_right_nodes );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17116L)
  public static SubLObject rtv_walk_relevant_edge_map(final SubLObject node_level_sets, final SubLObject predicates)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject length = number_utilities.f_1_( Sequences.length( node_level_sets ) );
    final SubLObject left_size = set.set_size( node_level_sets.first() );
    final SubLObject right_size = set.set_size( list_utilities.last_one( node_level_sets ) );
    thread.resetMultipleValues();
    final SubLObject left_length = rtv_length_to_islands( length, left_size, right_size );
    final SubLObject right_length = thread.secondMultipleValue();
    thread.resetMultipleValues();
    final SubLObject left_node_level_sets = list_utilities.first_n( number_utilities.f_1X( left_length ), node_level_sets );
    final SubLObject right_node_level_sets = list_utilities.first_n( number_utilities.f_1X( right_length ), Sequences.reverse( node_level_sets ) );
    final SubLObject edge_map = Hashtables.make_hash_table( number_utilities.summation( Mapping.mapcar( Symbols.symbol_function( $sym51$SET_SIZE ), node_level_sets ) ), Symbols.symbol_function( EQL ), UNPROVIDED );
    rtv_walk_relevant_edge_map_recursive( left_node_level_sets, predicates, edge_map );
    rtv_walk_relevant_edge_map_recursive( right_node_level_sets, predicates, edge_map );
    return edge_map;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 18003L)
  public static SubLObject rtv_walk_relevant_edge_map_recursive(final SubLObject node_level_sets, final SubLObject predicates, final SubLObject edge_map)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != node_level_sets )
    {
      SubLObject source_set = NIL;
      SubLObject rest_node_level_sets = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( node_level_sets, node_level_sets, $list52 );
      source_set = node_level_sets.first();
      final SubLObject current = rest_node_level_sets = node_level_sets.rest();
      if( NIL != rest_node_level_sets )
      {
        final SubLObject target_set = rest_node_level_sets.first();
        final SubLObject set_contents_var = set.do_set_internal( source_set );
        SubLObject basis_object;
        SubLObject state;
        SubLObject source_node;
        SubLObject _prev_bind_0;
        SubLObject cdolist_list_var;
        SubLObject index_arg;
        SubLObject cdolist_list_var_$18;
        SubLObject direct_edge;
        SubLObject gather_arg;
        SubLObject target_node;
        for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
            .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
        {
          source_node = set_contents.do_set_contents_next( basis_object, state );
          if( NIL != set_contents.do_set_contents_element_validP( state, source_node ) )
          {
            _prev_bind_0 = $rtv_predicates$.currentBinding( thread );
            try
            {
              $rtv_predicates$.bind( predicates, thread );
              cdolist_list_var = $list49;
              index_arg = NIL;
              index_arg = cdolist_list_var.first();
              while ( NIL != cdolist_list_var)
              {
                cdolist_list_var_$18 = rtv_accessible_edges( source_node, index_arg );
                direct_edge = NIL;
                direct_edge = cdolist_list_var_$18.first();
                while ( NIL != cdolist_list_var_$18)
                {
                  gather_arg = index_arg.numE( ONE_INTEGER ) ? TWO_INTEGER : ONE_INTEGER;
                  target_node = assertions_high.gaf_arg( direct_edge, gather_arg );
                  if( NIL != set.set_memberP( target_node, target_set ) )
                  {
                    rtv_walk_possibly_add_relevant_edge_to_map( edge_map, source_node, target_node, direct_edge );
                    rtv_walk_possibly_add_relevant_edge_to_map( edge_map, target_node, source_node, direct_edge );
                  }
                  cdolist_list_var_$18 = cdolist_list_var_$18.rest();
                  direct_edge = cdolist_list_var_$18.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                index_arg = cdolist_list_var.first();
              }
            }
            finally
            {
              $rtv_predicates$.rebind( _prev_bind_0, thread );
            }
          }
        }
        rtv_walk_relevant_edge_map_recursive( rest_node_level_sets, predicates, edge_map );
      }
    }
    return edge_map;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 18841L)
  public static SubLObject rtv_walk_possibly_add_relevant_edge_to_map(final SubLObject edge_map, final SubLObject source_node, final SubLObject target_node, final SubLObject edge)
  {
    SubLObject target_map = map_utilities.map_get_without_values( edge_map, source_node, NIL );
    if( NIL == target_map )
    {
      target_map = dictionary.new_dictionary( Symbols.symbol_function( EQL ), ZERO_INTEGER );
      map_utilities.map_put( edge_map, source_node, target_map );
    }
    SubLObject edge_set = map_utilities.map_get_without_values( target_map, target_node, NIL );
    if( NIL == edge_set )
    {
      edge_set = set.new_set( Symbols.symbol_function( EQL ), ZERO_INTEGER );
      map_utilities.map_put( target_map, target_node, edge_set );
    }
    if( NIL == set.set_memberP( edge, edge_set ) )
    {
      set.set_add( edge, edge_set );
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19486L)
  public static SubLObject rtv_walk_across_node_levels(final SubLObject node_levels, final SubLObject edge_map, final SubLObject return_type)
  {
    final SubLObject node_length = Sequences.length( node_levels );
    final SubLObject node_path = Vectors.make_vector( node_length, UNPROVIDED );
    final SubLObject result_set = set.new_set( Symbols.symbol_function( EQL ), ZERO_INTEGER );
    SubLObject first_node_level = NIL;
    SubLObject next_node_levels = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( node_levels, node_levels, $list53 );
    first_node_level = node_levels.first();
    final SubLObject current = next_node_levels = node_levels.rest();
    final SubLObject start_level = ZERO_INTEGER;
    final SubLObject set_contents_var = set.do_set_internal( first_node_level );
    SubLObject basis_object;
    SubLObject state;
    SubLObject start_node;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      start_node = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, start_node ) )
      {
        Vectors.set_aref( node_path, start_level, start_node );
        rtv_walk_across_node_levels_recursive( start_level, start_node, node_path, result_set, next_node_levels, edge_map, return_type );
      }
    }
    final SubLObject result = set.set_element_list( result_set );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20245L)
  public static SubLObject rtv_walk_across_node_levels_recursive(final SubLObject current_level, final SubLObject current_node, final SubLObject node_path, final SubLObject result_set, final SubLObject node_levels,
      final SubLObject edge_map, final SubLObject return_type)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == node_levels )
    {
      rtv_update_result_set_from_path( result_set, node_path, current_level, edge_map, return_type );
    }
    else
    {
      final SubLObject next_level = number_utilities.f_1X( current_level );
      SubLObject next_node_level = NIL;
      SubLObject after_node_levels = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( node_levels, node_levels, $list54 );
      next_node_level = node_levels.first();
      final SubLObject current = after_node_levels = node_levels.rest();
      final SubLObject target_map = map_utilities.map_get_without_values( edge_map, current_node, NIL );
      if( NIL != target_map )
      {
        final SubLObject iterator = map_utilities.new_map_iterator( target_map );
        SubLObject valid;
        for( SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean( NIL == valid ) )
        {
          thread.resetMultipleValues();
          final SubLObject var = iteration.iteration_next( iterator );
          valid = thread.secondMultipleValue();
          thread.resetMultipleValues();
          if( NIL != valid )
          {
            SubLObject current_$20;
            final SubLObject datum_$19 = current_$20 = var;
            SubLObject candidate_node = NIL;
            SubLObject edge_set = NIL;
            cdestructuring_bind.destructuring_bind_must_consp( current_$20, datum_$19, $list55 );
            candidate_node = current_$20.first();
            current_$20 = current_$20.rest();
            cdestructuring_bind.destructuring_bind_must_consp( current_$20, datum_$19, $list55 );
            edge_set = current_$20.first();
            current_$20 = current_$20.rest();
            if( NIL == current_$20 )
            {
              if( NIL != set.set_memberP( candidate_node, next_node_level ) )
              {
                Vectors.set_aref( node_path, next_level, candidate_node );
                if( NIL == Sequences.find( candidate_node, node_path, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ), ZERO_INTEGER, next_level ) )
                {
                  rtv_walk_across_node_levels_recursive( next_level, candidate_node, node_path, result_set, after_node_levels, edge_map, return_type );
                }
              }
            }
            else
            {
              cdestructuring_bind.cdestructuring_bind_error( datum_$19, $list55 );
            }
          }
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 21326L)
  public static SubLObject rtv_update_result_set_from_path(final SubLObject result_set, final SubLObject node_path, final SubLObject current_level, final SubLObject edge_map, final SubLObject return_type)
  {
    if( return_type.eql( $kw1$NODES ) )
    {
      final SubLObject backwardP_var = NIL;
      SubLObject length;
      SubLObject v_iteration;
      SubLObject level;
      SubLObject node;
      for( length = Sequences.length( node_path ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
      {
        level = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
        node = Vectors.aref( node_path, level );
        if( !level.numG( current_level ) )
        {
          set.set_add( node, result_set );
        }
      }
    }
    else if( return_type.eql( $kw2$EDGES ) )
    {
      final SubLObject backwardP_var = NIL;
      SubLObject length;
      SubLObject v_iteration;
      SubLObject level;
      SubLObject target_node;
      SubLObject source_index;
      SubLObject source_node;
      SubLObject target_map;
      SubLObject edge_set;
      SubLObject set_contents_var;
      SubLObject basis_object;
      SubLObject state;
      SubLObject result_edge;
      for( length = Sequences.length( node_path ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
      {
        level = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
        target_node = Vectors.aref( node_path, level );
        if( !level.numG( current_level ) && !level.isZero() )
        {
          source_index = number_utilities.f_1_( level );
          source_node = Vectors.aref( node_path, source_index );
          target_map = map_utilities.map_get_without_values( edge_map, source_node, NIL );
          if( NIL != target_map )
          {
            edge_set = map_utilities.map_get_without_values( target_map, target_node, NIL );
            if( NIL != edge_set )
            {
              set_contents_var = set.do_set_internal( edge_set );
              for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
                  .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
              {
                result_edge = set_contents.do_set_contents_next( basis_object, state );
                if( NIL != set_contents.do_set_contents_element_validP( state, result_edge ) )
                {
                  set.set_add( result_edge, result_set );
                }
              }
            }
          }
        }
      }
    }
    else
    {
      Errors.error( $str48$Unexpected_return_type___S, return_type );
    }
    return result_set;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 22100L)
  public static SubLObject new_rtv_all_nodes_from_node(final SubLObject source_node, final SubLObject predicates, final SubLObject length, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return rtv_all_nodes_from_nodes( ConsesLow.list( source_node ), predicates, length, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 22495L)
  public static SubLObject rtv_all_nodes_from_nodes(final SubLObject source_nodes, final SubLObject predicates, final SubLObject length, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLObject nodes = rtv_walk_from_nodes( source_nodes, predicates, length, $kw1$NODES, mt );
    return rtv_sort( nodes, $kw1$NODES );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 22699L)
  public static SubLObject rtv_all_nodes_between_two_nodes(final SubLObject left_node, final SubLObject right_node, final SubLObject predicates, final SubLObject length, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return rtv_all_nodes_between_nodes( ConsesLow.list( left_node ), ConsesLow.list( right_node ), predicates, length, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 22920L)
  public static SubLObject rtv_all_nodes_between_nodes(final SubLObject left_nodes, final SubLObject right_nodes, final SubLObject predicates, final SubLObject length, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLObject nodes = rtv_walk_between_nodes( left_nodes, right_nodes, predicates, length, $kw1$NODES, mt );
    return rtv_sort( nodes, $kw1$NODES );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23150L)
  public static SubLObject new_rtv_all_edges_from_node(final SubLObject source_node, final SubLObject predicates, final SubLObject length, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return rtv_all_edges_from_nodes( ConsesLow.list( source_node ), predicates, length, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23382L)
  public static SubLObject rtv_all_edges_from_nodes(final SubLObject source_nodes, final SubLObject predicates, final SubLObject length, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLObject edges = rtv_walk_from_nodes( source_nodes, predicates, length, $kw2$EDGES, mt );
    return rtv_sort( edges, $kw2$EDGES );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23586L)
  public static SubLObject rtv_all_edges_between_two_nodes(final SubLObject left_node, final SubLObject right_node, final SubLObject predicates, final SubLObject length, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return rtv_all_edges_between_nodes( ConsesLow.list( left_node ), ConsesLow.list( right_node ), predicates, length, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23870L)
  public static SubLObject rtv_all_edges_between_nodes(final SubLObject left_nodes, final SubLObject right_nodes, final SubLObject predicates, final SubLObject length, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLObject edges = rtv_walk_between_nodes( left_nodes, right_nodes, predicates, length, $kw2$EDGES, mt );
    return rtv_sort( edges, $kw2$EDGES );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 24100L)
  public static SubLObject rtv_all_edges_among(final SubLObject nodes, final SubLObject predicates, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject node_set = set_utilities.construct_set_from_list( nodes, Symbols.symbol_function( EQL ), UNPROVIDED );
    final SubLObject edge_set = set.new_set( Symbols.symbol_function( EQL ), ZERO_INTEGER );
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      final SubLObject local_state;
      final SubLObject state = local_state = memoization_state.new_memoization_state( UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      final SubLObject _prev_bind_0_$21 = memoization_state.$memoization_state$.currentBinding( thread );
      try
      {
        memoization_state.$memoization_state$.bind( local_state, thread );
        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
        try
        {
          SubLObject cdolist_list_var = nodes;
          SubLObject source_node = NIL;
          source_node = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            final SubLObject _prev_bind_0_$22 = $rtv_predicates$.currentBinding( thread );
            try
            {
              $rtv_predicates$.bind( predicates, thread );
              SubLObject cdolist_list_var_$23 = $list49;
              SubLObject index_arg = NIL;
              index_arg = cdolist_list_var_$23.first();
              while ( NIL != cdolist_list_var_$23)
              {
                SubLObject cdolist_list_var_$24 = rtv_accessible_edges( source_node, index_arg );
                SubLObject edge = NIL;
                edge = cdolist_list_var_$24.first();
                while ( NIL != cdolist_list_var_$24)
                {
                  final SubLObject gather_arg = index_arg.numE( ONE_INTEGER ) ? TWO_INTEGER : ONE_INTEGER;
                  final SubLObject target_node = assertions_high.gaf_arg( edge, gather_arg );
                  if( NIL != set.set_memberP( target_node, node_set ) && NIL == set.set_memberP( edge, edge_set ) )
                  {
                    set.set_add( edge, edge_set );
                  }
                  cdolist_list_var_$24 = cdolist_list_var_$24.rest();
                  edge = cdolist_list_var_$24.first();
                }
                cdolist_list_var_$23 = cdolist_list_var_$23.rest();
                index_arg = cdolist_list_var_$23.first();
              }
            }
            finally
            {
              $rtv_predicates$.rebind( _prev_bind_0_$22, thread );
            }
            cdolist_list_var = cdolist_list_var.rest();
            source_node = cdolist_list_var.first();
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$23 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$23, thread );
          }
        }
      }
      finally
      {
        memoization_state.$memoization_state$.rebind( _prev_bind_0_$21, thread );
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return set.set_element_list( edge_set );
  }

  public static SubLObject declare_rtv_file()
  {
    SubLFiles.declareFunction( me, "new_rtv_intersection_table", "NEW-RTV-INTERSECTION-TABLE", 0, 1, false );
    SubLFiles.declareFunction( me, "rtv_union", "RTV-UNION", 2, 0, false );
    SubLFiles.declareFunction( me, "rtv_intersection", "RTV-INTERSECTION", 2, 0, false );
    SubLFiles.declareFunction( me, "rtv_sort", "RTV-SORT", 1, 1, false );
    SubLFiles.declareMacro( me, "do_rtv_links", "DO-RTV-LINKS" );
    SubLFiles.declareFunction( me, "rtv_accessible_edges_internal", "RTV-ACCESSIBLE-EDGES-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "rtv_accessible_edges", "RTV-ACCESSIBLE-EDGES", 2, 0, false );
    SubLFiles.declareMacro( me, "do_rtv_edge_map_nodes", "DO-RTV-EDGE-MAP-NODES" );
    SubLFiles.declareMacro( me, "do_rtv_edge_map_links", "DO-RTV-EDGE-MAP-LINKS" );
    SubLFiles.declareFunction( me, "rtv_walk_from_nodes", "RTV-WALK-FROM-NODES", 4, 1, false );
    SubLFiles.declareFunction( me, "rtv_walk_from_nodes_internal", "RTV-WALK-FROM-NODES-INTERNAL", 4, 0, false );
    SubLFiles.declareFunction( me, "rtv_walk_between_nodes", "RTV-WALK-BETWEEN-NODES", 5, 1, false );
    SubLFiles.declareFunction( me, "rtv_length_to_islands", "RTV-LENGTH-TO-ISLANDS", 3, 0, false );
    SubLFiles.declareFunction( me, "rtv_walk_between_nodes_recursive", "RTV-WALK-BETWEEN-NODES-RECURSIVE", 5, 0, false );
    SubLFiles.declareFunction( me, "rtv_walk_between_nodes_directly", "RTV-WALK-BETWEEN-NODES-DIRECTLY", 4, 0, false );
    SubLFiles.declareFunction( me, "rtv_walk_between_nodes_internal", "RTV-WALK-BETWEEN-NODES-INTERNAL", 5, 0, false );
    SubLFiles.declareFunction( me, "rtv_walk_between_nodes_of_length", "RTV-WALK-BETWEEN-NODES-OF-LENGTH", 5, 0, false );
    SubLFiles.declareFunction( me, "rtv_walk_node_levels", "RTV-WALK-NODE-LEVELS", 4, 0, false );
    SubLFiles.declareFunction( me, "rtv_walk_node_levels_recursive", "RTV-WALK-NODE-LEVELS-RECURSIVE", 5, 0, false );
    SubLFiles.declareFunction( me, "rtv_directly_connected_node_subsets", "RTV-DIRECTLY-CONNECTED-NODE-SUBSETS", 3, 0, false );
    SubLFiles.declareFunction( me, "rtv_walk_relevant_edge_map", "RTV-WALK-RELEVANT-EDGE-MAP", 2, 0, false );
    SubLFiles.declareFunction( me, "rtv_walk_relevant_edge_map_recursive", "RTV-WALK-RELEVANT-EDGE-MAP-RECURSIVE", 3, 0, false );
    SubLFiles.declareFunction( me, "rtv_walk_possibly_add_relevant_edge_to_map", "RTV-WALK-POSSIBLY-ADD-RELEVANT-EDGE-TO-MAP", 4, 0, false );
    SubLFiles.declareFunction( me, "rtv_walk_across_node_levels", "RTV-WALK-ACROSS-NODE-LEVELS", 3, 0, false );
    SubLFiles.declareFunction( me, "rtv_walk_across_node_levels_recursive", "RTV-WALK-ACROSS-NODE-LEVELS-RECURSIVE", 7, 0, false );
    SubLFiles.declareFunction( me, "rtv_update_result_set_from_path", "RTV-UPDATE-RESULT-SET-FROM-PATH", 5, 0, false );
    SubLFiles.declareFunction( me, "new_rtv_all_nodes_from_node", "NEW-RTV-ALL-NODES-FROM-NODE", 3, 1, false );
    SubLFiles.declareFunction( me, "rtv_all_nodes_from_nodes", "RTV-ALL-NODES-FROM-NODES", 3, 1, false );
    SubLFiles.declareFunction( me, "rtv_all_nodes_between_two_nodes", "RTV-ALL-NODES-BETWEEN-TWO-NODES", 4, 1, false );
    SubLFiles.declareFunction( me, "rtv_all_nodes_between_nodes", "RTV-ALL-NODES-BETWEEN-NODES", 4, 1, false );
    SubLFiles.declareFunction( me, "new_rtv_all_edges_from_node", "NEW-RTV-ALL-EDGES-FROM-NODE", 3, 1, false );
    SubLFiles.declareFunction( me, "rtv_all_edges_from_nodes", "RTV-ALL-EDGES-FROM-NODES", 3, 1, false );
    SubLFiles.declareFunction( me, "rtv_all_edges_between_two_nodes", "RTV-ALL-EDGES-BETWEEN-TWO-NODES", 4, 1, false );
    SubLFiles.declareFunction( me, "rtv_all_edges_between_nodes", "RTV-ALL-EDGES-BETWEEN-NODES", 4, 1, false );
    SubLFiles.declareFunction( me, "rtv_all_edges_among", "RTV-ALL-EDGES-AMONG", 2, 1, false );
    return NIL;
  }

  public static SubLObject init_rtv_file()
  {
    $rtv_intersection_table$ = SubLFiles.defvar( "*RTV-INTERSECTION-TABLE*", $kw0$UNINITIALIZED );
    $rtv_predicates$ = SubLFiles.defparameter( "*RTV-PREDICATES*", $kw3$UNINTIALIZED );
    $rtv_walk_prevent_loopsP$ = SubLFiles.defparameter( "*RTV-WALK-PREVENT-LOOPS?*", T );
    return NIL;
  }

  public static SubLObject setup_rtv_file()
  {
    memoization_state.note_memoized_function( $sym19$RTV_ACCESSIBLE_EDGES );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_rtv_file();
  }

  @Override
  public void initializeVariables()
  {
    init_rtv_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_rtv_file();
  }
  static
  {
    me = new rtv();
    $rtv_intersection_table$ = null;
    $rtv_predicates$ = null;
    $rtv_walk_prevent_loopsP$ = null;
    $kw0$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $kw1$NODES = makeKeyword( "NODES" );
    $kw2$EDGES = makeKeyword( "EDGES" );
    $kw3$UNINTIALIZED = makeKeyword( "UNINTIALIZED" );
    $list4 = ConsesLow.list( ConsesLow.list( makeSymbol( "TARGET-VAR" ), makeSymbol( "SOURCE" ), makeSymbol( "&KEY" ), makeSymbol( "LINK-VAR" ), makeSymbol( "PREDICATES" ) ), makeSymbol( "&BODY" ), makeSymbol(
        "BODY" ) );
    $list5 = ConsesLow.list( makeKeyword( "LINK-VAR" ), makeKeyword( "PREDICATES" ) );
    $kw6$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw7$LINK_VAR = makeKeyword( "LINK-VAR" );
    $kw8$PREDICATES = makeKeyword( "PREDICATES" );
    $sym9$SOURCE_VAR = makeUninternedSymbol( "SOURCE-VAR" );
    $sym10$CLET = makeSymbol( "CLET" );
    $sym11$DO_RTV_LINKS = makeSymbol( "DO-RTV-LINKS" );
    $sym12$LINK = makeUninternedSymbol( "LINK" );
    $sym13$INDEX_ARG = makeUninternedSymbol( "INDEX-ARG" );
    $sym14$GATHER_ARG = makeUninternedSymbol( "GATHER-ARG" );
    $sym15$_RTV_PREDICATES_ = makeSymbol( "*RTV-PREDICATES*" );
    $sym16$CDOLIST = makeSymbol( "CDOLIST" );
    $list17 = ConsesLow.list( ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( ONE_INTEGER, TWO_INTEGER ) ) );
    $sym18$DO_LIST = makeSymbol( "DO-LIST" );
    $sym19$RTV_ACCESSIBLE_EDGES = makeSymbol( "RTV-ACCESSIBLE-EDGES" );
    $sym20$FIF = makeSymbol( "FIF" );
    $sym21$_ = makeSymbol( "=" );
    $list22 = ConsesLow.list( ONE_INTEGER );
    $list23 = ConsesLow.list( TWO_INTEGER, ONE_INTEGER );
    $sym24$GAF_ARG = makeSymbol( "GAF-ARG" );
    $sym25$RELEVANT_PRED_IS_IN_LIST = makeSymbol( "RELEVANT-PRED-IS-IN-LIST" );
    $kw26$GAF = makeKeyword( "GAF" );
    $kw27$TRUE = makeKeyword( "TRUE" );
    $list28 = ConsesLow.list( ConsesLow.list( makeSymbol( "TARGET-VAR" ), makeSymbol( "SOURCE" ), makeSymbol( "EDGE-MAP" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym29$SOURCE_VAR = makeUninternedSymbol( "SOURCE-VAR" );
    $sym30$DO_RTV_EDGE_MAP_NODES = makeSymbol( "DO-RTV-EDGE-MAP-NODES" );
    $sym31$EDGE_MAP_VAR = makeUninternedSymbol( "EDGE-MAP-VAR" );
    $sym32$TARGET_MAP = makeUninternedSymbol( "TARGET-MAP" );
    $sym33$EDGE_SET = makeUninternedSymbol( "EDGE-SET" );
    $sym34$MAP_GET_WITHOUT_VALUES = makeSymbol( "MAP-GET-WITHOUT-VALUES" );
    $list35 = ConsesLow.list( NIL );
    $sym36$PWHEN = makeSymbol( "PWHEN" );
    $sym37$DO_MAP = makeSymbol( "DO-MAP" );
    $sym38$IGNORE = makeSymbol( "IGNORE" );
    $list39 = ConsesLow.list( ConsesLow.list( makeSymbol( "LINK-VAR" ), makeSymbol( "SOURCE" ), makeSymbol( "TARGET" ), makeSymbol( "EDGE-MAP" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym40$SOURCE_VAR = makeUninternedSymbol( "SOURCE-VAR" );
    $sym41$DO_RTV_EDGE_MAP_LINKS = makeSymbol( "DO-RTV-EDGE-MAP-LINKS" );
    $sym42$TARGET_VAR = makeUninternedSymbol( "TARGET-VAR" );
    $sym43$EDGE_MAP_VAR = makeUninternedSymbol( "EDGE-MAP-VAR" );
    $sym44$TARGET_MAP = makeUninternedSymbol( "TARGET-MAP" );
    $sym45$EDGE_SET = makeUninternedSymbol( "EDGE-SET" );
    $sym46$DO_SET = makeSymbol( "DO-SET" );
    $sym47$NON_NEGATIVE_INTEGER_P = makeSymbol( "NON-NEGATIVE-INTEGER-P" );
    $str48$Unexpected_return_type___S = makeString( "Unexpected return type: ~S" );
    $list49 = ConsesLow.list( ONE_INTEGER, TWO_INTEGER );
    $sym50$MAKE_SET_FROM_LIST = makeSymbol( "MAKE-SET-FROM-LIST" );
    $sym51$SET_SIZE = makeSymbol( "SET-SIZE" );
    $list52 = ConsesLow.cons( makeSymbol( "SOURCE-SET" ), makeSymbol( "REST-NODE-LEVEL-SETS" ) );
    $list53 = ConsesLow.cons( makeSymbol( "FIRST-NODE-LEVEL" ), makeSymbol( "NEXT-NODE-LEVELS" ) );
    $list54 = ConsesLow.cons( makeSymbol( "NEXT-NODE-LEVEL" ), makeSymbol( "AFTER-NODE-LEVELS" ) );
    $list55 = ConsesLow.list( makeSymbol( "CANDIDATE-NODE" ), makeUninternedSymbol( "EDGE-SET" ) );
  }
}
/*
 * 
 * Total time: 435 ms
 * 
 */
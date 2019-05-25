package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rkf_ontology_utilities
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.rkf_ontology_utilities";
  public static final String myFingerPrint = "6947c294586268811e5809eb0f6dacc96f08751406d7204176c4ad518f34c09c";
  private static final SubLSymbol $kw0$DESCENDING;
  private static final SubLObject $const1$Set_Mathematical;
  private static final SubLObject $const2$SpecsFn;
  private static final SubLSymbol $kw3$ISA;
  private static final SubLObject $const4$and;
  private static final SubLObject $const5$nearestGenls;
  private static final SubLList $list6;
  private static final SubLList $list7;
  private static final SubLObject $const8$elementOf;
  private static final SubLList $list9;
  private static final SubLList $list10;
  private static final SubLList $list11;
  private static final SubLObject $const12$Collection;
  private static final SubLSymbol $sym13$_;
  private static final SubLSymbol $sym14$RELATION_GENERALITY_ESTIMATE;
  private static final SubLSymbol $sym15$_;
  private static final SubLSymbol $sym16$NUM_INDEX;

  @SubLTranslatedFile.SubL(source = "cycl/rkf-ontology-utilities.lisp", position = 748L)
  public static SubLObject rkf_min_isa(final SubLObject v_term, SubLObject domain_mt)
  {
    if( domain_mt == UNPROVIDED )
    {
      domain_mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_answer = NIL;
    final SubLObject mt_var = domain_mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      v_answer = rkf_all_isa( v_term, domain_mt );
      v_answer = genls.min_cols( v_answer, domain_mt, UNPROVIDED );
      v_answer = cardinality_estimates.sort_by_generality_estimate( v_answer, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-ontology-utilities.lisp", position = 1171L)
  public static SubLObject rkf_all_isa(final SubLObject v_term, SubLObject domain_mt)
  {
    if( domain_mt == UNPROVIDED )
    {
      domain_mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_answer = NIL;
    final SubLObject mt_var = domain_mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      if( NIL != forts.fort_p( v_term ) )
      {
        v_answer = isa.all_isa( v_term, domain_mt, UNPROVIDED );
      }
      else if( NIL != el_utilities.possibly_naut_p( v_term ) )
      {
        v_answer = isa.all_isa( v_term, domain_mt, UNPROVIDED );
      }
      else
      {
        v_answer = defns.all_defn_admits( v_term, domain_mt );
      }
      v_answer = rkf_relevance_utilities.rkf_filter_irrelevant_terms( v_answer, domain_mt );
      v_answer = cardinality_estimates.sort_by_generality_estimate( v_answer, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-ontology-utilities.lisp", position = 1707L)
  public static SubLObject rkf_min_genls(final SubLObject col, SubLObject domain_mt)
  {
    if( domain_mt == UNPROVIDED )
    {
      domain_mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_answer = NIL;
    final SubLObject mt_var = domain_mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      final SubLObject simple_answer = genls.min_genls( col, domain_mt, UNPROVIDED );
      v_answer = rkf_relevance_utilities.rkf_filter_irrelevant_terms( simple_answer, domain_mt );
      if( !Sequences.length( simple_answer ).numE( Sequences.length( v_answer ) ) )
      {
        v_answer = genls.all_genls( col, domain_mt, UNPROVIDED );
        v_answer = list_utilities.delete_first( col, v_answer, UNPROVIDED );
        v_answer = rkf_relevance_utilities.rkf_filter_irrelevant_terms( v_answer, domain_mt );
        v_answer = genls.min_cols( v_answer, domain_mt, UNPROVIDED );
      }
      v_answer = cardinality_estimates.sort_by_generality_estimate( v_answer, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-ontology-utilities.lisp", position = 2462L)
  public static SubLObject rkf_all_genls(final SubLObject col, SubLObject domain_mt)
  {
    if( domain_mt == UNPROVIDED )
    {
      domain_mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_answer = NIL;
    final SubLObject mt_var = domain_mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      v_answer = genls.all_genls( col, domain_mt, UNPROVIDED );
      v_answer = rkf_relevance_utilities.rkf_filter_irrelevant_terms( v_answer, domain_mt );
      v_answer = cardinality_estimates.sort_by_generality_estimate( v_answer, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-ontology-utilities.lisp", position = 2825L)
  public static SubLObject rkf_max_specs(final SubLObject col, SubLObject domain_mt)
  {
    if( domain_mt == UNPROVIDED )
    {
      domain_mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_answer = NIL;
    final SubLObject mt_var = domain_mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      v_answer = genls.specs( col, domain_mt, UNPROVIDED );
      v_answer = list_utilities.fast_delete_duplicates( v_answer, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      v_answer = rkf_relevance_utilities.rkf_filter_irrelevant_terms( v_answer, domain_mt );
      v_answer = cardinality_estimates.sort_by_generality_estimate( v_answer, $kw0$DESCENDING );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-ontology-utilities.lisp", position = 3324L)
  public static SubLObject rkf_instances(final SubLObject col, SubLObject domain_mt)
  {
    if( domain_mt == UNPROVIDED )
    {
      domain_mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_answer = NIL;
    final SubLObject mt_var = domain_mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      v_answer = isa.instances( col, domain_mt, UNPROVIDED );
      v_answer = list_utilities.fast_delete_duplicates( v_answer, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      v_answer = rkf_relevance_utilities.rkf_filter_irrelevant_terms( v_answer, domain_mt );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-ontology-utilities.lisp", position = 3795L)
  public static SubLObject rkf_all_fort_instances(final SubLObject col, final SubLObject domain_mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_instances = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( domain_mt ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( domain_mt ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( domain_mt ), thread );
      v_instances = isa.all_fort_instances( col, domain_mt, UNPROVIDED );
      v_instances = list_utilities.fast_delete_duplicates( v_instances, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      v_instances = rkf_relevance_utilities.rkf_filter_irrelevant_terms( v_instances, domain_mt );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return v_instances;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-ontology-utilities.lisp", position = 4238L)
  public static SubLObject rkf_instantiations(final SubLObject col, SubLObject domain_mt)
  {
    if( domain_mt == UNPROVIDED )
    {
      domain_mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject local_mt = ( NIL == domain_mt ) ? mt_relevance_macros.$mt$.getDynamicValue( thread ) : domain_mt;
    SubLObject v_answer = NIL;
    if( NIL != el_utilities.possibly_naut_p( col ) && NIL == isa.isaP( col, $const1$Set_Mathematical, UNPROVIDED, UNPROVIDED ) && !col.first().eql( $const2$SpecsFn ) )
    {
      v_answer = ask_utilities.ask_variable( $kw3$ISA, ConsesLow.listS( $const4$and, ConsesLow.listS( $const5$nearestGenls, col, $list6 ), $list7 ), local_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    else if( NIL != el_utilities.possibly_naut_p( col ) && !col.first().eql( $const2$SpecsFn ) )
    {
      v_answer = ask_utilities.ask_variable( $kw3$ISA, ConsesLow.list( $const8$elementOf, $kw3$ISA, col ), local_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    else
    {
      final SubLObject mt_var = domain_mt;
      final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
        v_answer = isa.instantiations( col, UNPROVIDED );
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
      }
    }
    v_answer = list_utilities.fast_delete_duplicates( v_answer, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    v_answer = rkf_relevance_utilities.rkf_filter_irrelevant_terms( v_answer, local_mt );
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-ontology-utilities.lisp", position = 5343L)
  public static SubLObject rkf_all_instantiations(final SubLObject col, SubLObject domain_mt)
  {
    if( domain_mt == UNPROVIDED )
    {
      domain_mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject local_mt = ( NIL == domain_mt ) ? mt_relevance_macros.$mt$.getDynamicValue( thread ) : domain_mt;
    SubLObject v_instances = NIL;
    if( NIL != el_utilities.possibly_naut_p( col ) && NIL == isa.isaP( col, $const1$Set_Mathematical, UNPROVIDED, UNPROVIDED ) && !col.first().eql( $const2$SpecsFn ) )
    {
      v_instances = ask_utilities.ask_variable( $kw3$ISA, ConsesLow.listS( $const4$and, ConsesLow.listS( $const5$nearestGenls, col, $list6 ), $list9 ), local_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    else if( NIL != el_utilities.possibly_naut_p( col ) && !col.first().eql( $const2$SpecsFn ) )
    {
      v_instances = ask_utilities.ask_variable( $kw3$ISA, ConsesLow.list( $const8$elementOf, $kw3$ISA, col ), local_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    else
    {
      final SubLObject mt_var = domain_mt;
      final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
        v_instances = isa.all_instantiations( col, UNPROVIDED );
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
      }
    }
    v_instances = list_utilities.fast_delete_duplicates( v_instances, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    v_instances = rkf_relevance_utilities.rkf_filter_irrelevant_terms( v_instances, local_mt );
    return v_instances;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-ontology-utilities.lisp", position = 6329L)
  public static SubLObject rkf_narrowest_isa_constraints(final SubLObject terms, SubLObject domain_mt)
  {
    if( domain_mt == UNPROVIDED )
    {
      domain_mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject mt_var = domain_mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      if( NIL == terms )
      {
        result = NIL;
      }
      else if( NIL != list_utilities.singletonP( terms ) )
      {
        result = rkf_narrowest_isa_constraints_nearest_isa( terms.first(), domain_mt );
      }
      else
      {
        SubLObject first_term = NIL;
        SubLObject rest_terms = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( terms, terms, $list10 );
        first_term = terms.first();
        final SubLObject current = rest_terms = terms.rest();
        SubLObject full_all_isas = rkf_narrowest_isa_constraints_all_isa( first_term, domain_mt );
        SubLObject cdolist_list_var = rest_terms;
        SubLObject rest_term = NIL;
        rest_term = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject term_all_isas = rkf_narrowest_isa_constraints_all_isa( rest_term, domain_mt );
          full_all_isas = conses_high.nintersection( term_all_isas, full_all_isas, Symbols.symbol_function( EQUAL ), UNPROVIDED );
          cdolist_list_var = cdolist_list_var.rest();
          rest_term = cdolist_list_var.first();
        }
        result = genls.min_cols( full_all_isas, domain_mt, UNPROVIDED );
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-ontology-utilities.lisp", position = 7352L)
  public static SubLObject rkf_narrowest_genls_constraints(final SubLObject collections, SubLObject domain_mt)
  {
    if( domain_mt == UNPROVIDED )
    {
      domain_mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject mt_var = domain_mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      if( NIL == collections )
      {
        result = NIL;
      }
      else if( NIL != list_utilities.singletonP( collections ) )
      {
        result = ConsesLow.list( collections.first() );
      }
      else
      {
        SubLObject first_collection = NIL;
        SubLObject rest_collections = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( collections, collections, $list11 );
        first_collection = collections.first();
        final SubLObject current = rest_collections = collections.rest();
        SubLObject full_all_genls = rkf_narrowest_genls_constraints_all_genls( first_collection, domain_mt );
        SubLObject cdolist_list_var = rest_collections;
        SubLObject rest_collection = NIL;
        rest_collection = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject collection_all_genls = rkf_narrowest_genls_constraints_all_genls( rest_collection, domain_mt );
          full_all_genls = conses_high.nintersection( collection_all_genls, full_all_genls, Symbols.symbol_function( EQUAL ), UNPROVIDED );
          cdolist_list_var = cdolist_list_var.rest();
          rest_collection = cdolist_list_var.first();
        }
        result = genls.min_cols( full_all_genls, domain_mt, UNPROVIDED );
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-ontology-utilities.lisp", position = 8267L)
  public static SubLObject rkf_narrowest_type_constraints(final SubLObject terms, SubLObject domain_mt)
  {
    if( domain_mt == UNPROVIDED )
    {
      domain_mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject isa_constraints = NIL;
    SubLObject genls_constraints = NIL;
    final SubLObject mt_var = domain_mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      isa_constraints = rkf_narrowest_isa_constraints( terms, domain_mt );
      genls_constraints = NIL;
      SubLObject some_collection = NIL;
      if( NIL == some_collection )
      {
        SubLObject csome_list_var;
        SubLObject isa_constraint;
        for( csome_list_var = isa_constraints, isa_constraint = NIL, isa_constraint = csome_list_var.first(); NIL == some_collection && NIL != csome_list_var; some_collection = genls.genlsP( isa_constraint,
            $const12$Collection, domain_mt, UNPROVIDED ), csome_list_var = csome_list_var.rest(), isa_constraint = csome_list_var.first() )
        {
        }
      }
      if( NIL != some_collection )
      {
        genls_constraints = rkf_narrowest_genls_constraints( terms, domain_mt );
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return Values.values( isa_constraints, genls_constraints );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-ontology-utilities.lisp", position = 8868L)
  public static SubLObject rkf_narrowest_isa_constraints_nearest_isa(final SubLObject v_term, SubLObject domain_mt)
  {
    if( domain_mt == UNPROVIDED )
    {
      domain_mt = NIL;
    }
    return rkf_min_isa( v_term, domain_mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-ontology-utilities.lisp", position = 9019L)
  public static SubLObject rkf_narrowest_isa_constraints_all_isa(final SubLObject v_term, SubLObject domain_mt)
  {
    if( domain_mt == UNPROVIDED )
    {
      domain_mt = NIL;
    }
    return rkf_all_isa( v_term, domain_mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-ontology-utilities.lisp", position = 9152L)
  public static SubLObject rkf_narrowest_genls_constraints_all_genls(final SubLObject col, SubLObject domain_mt)
  {
    if( domain_mt == UNPROVIDED )
    {
      domain_mt = NIL;
    }
    return rkf_all_genls( col, domain_mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-ontology-utilities.lisp", position = 9289L)
  public static SubLObject rkf_predicate_tops(final SubLObject predicate, SubLObject domain_mt)
  {
    if( domain_mt == UNPROVIDED )
    {
      domain_mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject predicate_tops = NIL;
    final SubLObject mt_var = domain_mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      predicate_tops = genl_predicates.max_predicates( ConsesLow.nconc( genl_predicates.all_genl_preds( predicate, domain_mt, UNPROVIDED ), genl_predicates.all_genl_inverses( predicate, domain_mt, UNPROVIDED ) ),
          UNPROVIDED, UNPROVIDED );
      predicate_tops = Sort.sort( predicate_tops, Symbols.symbol_function( $sym13$_ ), Symbols.symbol_function( $sym14$RELATION_GENERALITY_ESTIMATE ) );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return predicate_tops;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-ontology-utilities.lisp", position = 9766L)
  public static SubLObject rkf_salient_instance_exemplars(final SubLObject collection, final SubLObject domain_mt, SubLObject max_count)
  {
    if( max_count == UNPROVIDED )
    {
      max_count = Numbers.$most_positive_fixnum$.getGlobalValue();
    }
    final SubLObject v_instances = rkf_all_fort_instances( collection, domain_mt );
    final SubLObject attack_order = Sort.sort( v_instances, Symbols.symbol_function( $sym15$_ ), Symbols.symbol_function( $sym16$NUM_INDEX ) );
    return list_utilities.first_n( max_count, attack_order );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-ontology-utilities.lisp", position = 10237L)
  public static SubLObject rkf_salient_instantiation_exemplars(final SubLObject collection, final SubLObject domain_mt, SubLObject max_count, SubLObject max_instances_to_sort)
  {
    if( max_count == UNPROVIDED )
    {
      max_count = Numbers.$most_positive_fixnum$.getGlobalValue();
    }
    if( max_instances_to_sort == UNPROVIDED )
    {
      max_instances_to_sort = Numbers.$most_positive_fixnum$.getGlobalValue();
    }
    final SubLObject v_instances = list_utilities.first_n( max_instances_to_sort, rkf_all_instantiations( collection, domain_mt ) );
    final SubLObject attack_order = Sort.sort( v_instances, Symbols.symbol_function( $sym15$_ ), Symbols.symbol_function( $sym16$NUM_INDEX ) );
    return list_utilities.first_n( max_count, attack_order );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-ontology-utilities.lisp", position = 10770L)
  public static SubLObject rkf_salient_specialization_exemplars(final SubLObject collection, final SubLObject domain_mt, SubLObject max_count)
  {
    if( max_count == UNPROVIDED )
    {
      max_count = Numbers.$most_positive_fixnum$.getGlobalValue();
    }
    final SubLObject specs = rkf_max_specs( collection, domain_mt );
    final SubLObject attack_order = Sort.sort( specs, Symbols.symbol_function( $sym15$_ ), Symbols.symbol_function( $sym16$NUM_INDEX ) );
    return list_utilities.first_n( max_count, attack_order );
  }

  public static SubLObject declare_rkf_ontology_utilities_file()
  {
    SubLFiles.declareFunction( me, "rkf_min_isa", "RKF-MIN-ISA", 1, 1, false );
    SubLFiles.declareFunction( me, "rkf_all_isa", "RKF-ALL-ISA", 1, 1, false );
    SubLFiles.declareFunction( me, "rkf_min_genls", "RKF-MIN-GENLS", 1, 1, false );
    SubLFiles.declareFunction( me, "rkf_all_genls", "RKF-ALL-GENLS", 1, 1, false );
    SubLFiles.declareFunction( me, "rkf_max_specs", "RKF-MAX-SPECS", 1, 1, false );
    SubLFiles.declareFunction( me, "rkf_instances", "RKF-INSTANCES", 1, 1, false );
    SubLFiles.declareFunction( me, "rkf_all_fort_instances", "RKF-ALL-FORT-INSTANCES", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_instantiations", "RKF-INSTANTIATIONS", 1, 1, false );
    SubLFiles.declareFunction( me, "rkf_all_instantiations", "RKF-ALL-INSTANTIATIONS", 1, 1, false );
    SubLFiles.declareFunction( me, "rkf_narrowest_isa_constraints", "RKF-NARROWEST-ISA-CONSTRAINTS", 1, 1, false );
    SubLFiles.declareFunction( me, "rkf_narrowest_genls_constraints", "RKF-NARROWEST-GENLS-CONSTRAINTS", 1, 1, false );
    SubLFiles.declareFunction( me, "rkf_narrowest_type_constraints", "RKF-NARROWEST-TYPE-CONSTRAINTS", 1, 1, false );
    SubLFiles.declareFunction( me, "rkf_narrowest_isa_constraints_nearest_isa", "RKF-NARROWEST-ISA-CONSTRAINTS-NEAREST-ISA", 1, 1, false );
    SubLFiles.declareFunction( me, "rkf_narrowest_isa_constraints_all_isa", "RKF-NARROWEST-ISA-CONSTRAINTS-ALL-ISA", 1, 1, false );
    SubLFiles.declareFunction( me, "rkf_narrowest_genls_constraints_all_genls", "RKF-NARROWEST-GENLS-CONSTRAINTS-ALL-GENLS", 1, 1, false );
    SubLFiles.declareFunction( me, "rkf_predicate_tops", "RKF-PREDICATE-TOPS", 1, 1, false );
    SubLFiles.declareFunction( me, "rkf_salient_instance_exemplars", "RKF-SALIENT-INSTANCE-EXEMPLARS", 2, 1, false );
    SubLFiles.declareFunction( me, "rkf_salient_instantiation_exemplars", "RKF-SALIENT-INSTANTIATION-EXEMPLARS", 2, 2, false );
    SubLFiles.declareFunction( me, "rkf_salient_specialization_exemplars", "RKF-SALIENT-SPECIALIZATION-EXEMPLARS", 2, 1, false );
    return NIL;
  }

  public static SubLObject init_rkf_ontology_utilities_file()
  {
    return NIL;
  }

  public static SubLObject setup_rkf_ontology_utilities_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_rkf_ontology_utilities_file();
  }

  @Override
  public void initializeVariables()
  {
    init_rkf_ontology_utilities_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_rkf_ontology_utilities_file();
  }
  static
  {
    me = new rkf_ontology_utilities();
    $kw0$DESCENDING = makeKeyword( "DESCENDING" );
    $const1$Set_Mathematical = constant_handles.reader_make_constant_shell( makeString( "Set-Mathematical" ) );
    $const2$SpecsFn = constant_handles.reader_make_constant_shell( makeString( "SpecsFn" ) );
    $kw3$ISA = makeKeyword( "ISA" );
    $const4$and = constant_handles.reader_make_constant_shell( makeString( "and" ) );
    $const5$nearestGenls = constant_handles.reader_make_constant_shell( makeString( "nearestGenls" ) );
    $list6 = ConsesLow.list( makeSymbol( "?GENL" ) );
    $list7 = ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "nearestIsa" ) ), makeKeyword( "ISA" ), makeSymbol( "?GENL" ) ) );
    $const8$elementOf = constant_handles.reader_make_constant_shell( makeString( "elementOf" ) );
    $list9 = ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword( "ISA" ), makeSymbol( "?GENL" ) ) );
    $list10 = ConsesLow.cons( makeSymbol( "FIRST-TERM" ), makeSymbol( "REST-TERMS" ) );
    $list11 = ConsesLow.cons( makeSymbol( "FIRST-COLLECTION" ), makeSymbol( "REST-COLLECTIONS" ) );
    $const12$Collection = constant_handles.reader_make_constant_shell( makeString( "Collection" ) );
    $sym13$_ = makeSymbol( "<" );
    $sym14$RELATION_GENERALITY_ESTIMATE = makeSymbol( "RELATION-GENERALITY-ESTIMATE" );
    $sym15$_ = makeSymbol( ">" );
    $sym16$NUM_INDEX = makeSymbol( "NUM-INDEX" );
  }
}
/*
 * 
 * Total time: 111 ms
 * 
 */
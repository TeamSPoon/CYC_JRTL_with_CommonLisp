package com.cyc.cycjava.cycl;

import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Processes;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.inference.kbq_query_run;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class plot_generation
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.plot_generation";
  public static final String myFingerPrint = "6386048e9850e818b566eabb8a0a5599f893635359d4110b4a8ab4b704ec406a";
  @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 24951L)
  public static SubLSymbol $infn_count_data_dir$;
  @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 33731L)
  private static SubLSymbol $default_plot_name$;
  @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 34037L)
  private static SubLSymbol $plot_directory$;
  private static final SubLSymbol $kw0$LINE_LABEL;
  private static final SubLString $str1$;
  private static final SubLSymbol $kw2$LINE_LABELS;
  private static final SubLSymbol $sym3$COORDINATIFY;
  private static final SubLSymbol $kw4$BOTH;
  private static final SubLList $list5;
  private static final SubLString $str6$Invalid_sort_by_parameter_;
  private static final SubLSymbol $kw7$FIRST;
  private static final SubLList $list8;
  private static final SubLString $str9$There_should_be_atleast_2_runs_sp;
  private static final SubLSymbol $kw10$ALL;
  private static final SubLSymbol $sym11$TRUE;
  private static final SubLSymbol $sym12$SAFE__;
  private static final SubLSymbol $kw13$SCALE_;
  private static final SubLList $list14;
  private static final SubLList $list15;
  private static final SubLString $str16$timed_out;
  private static final SubLSymbol $sym17$KBQ_QUERY_RUN_TIMED_OUT_;
  private static final SubLString $str18$No_oracularly_answerable_timed_ou;
  private static final SubLString $str19$_tmp_inference_answer_timeline_da;
  private static final SubLString $str20$_tmp_inference_answer_timeline_pl;
  private static final SubLSymbol $kw21$QUERY;
  private static final SubLSymbol $kw22$BASELINE_NAME;
  private static final SubLString $str23$baseline;
  private static final SubLSymbol $kw24$EXPERIMENT_NAME;
  private static final SubLString $str25$experiment;
  private static final SubLString $str26$baseline_____;
  private static final SubLString $str27$experiment___;
  private static final SubLString $str28$property_____;
  private static final SubLString $str29$Cannot_handle_more_than_10_proper;
  private static final SubLSymbol $sym30$NUMBERP;
  private static final SubLString $str31$properties___;
  private static final SubLString $str32$classification_0;
  private static final SubLSymbol $sym33$_;
  private static final SubLSymbol $sym34$SECOND;
  private static final SubLSymbol $sym35$FIRST;
  private static final SubLString $str36$classification_;
  private static final SubLString $str37$Classification__S_was_empty;
  private static final SubLList $list38;
  private static final SubLSymbol $kw39$SKIP;
  private static final SubLString $str40$_cyc_top_data_kb_stats_;
  private static final SubLSymbol $sym41$LENGTH;
  private static final SubLList $list42;
  private static final SubLFloat $float43$0_3;
  private static final SubLFloat $float44$0_0;
  private static final SubLList $list45;
  private static final SubLString $str46$plot;
  private static final SubLSymbol $kw47$PLOT_NAME;
  private static final SubLSymbol $kw48$DISPLAY;
  private static final SubLString $str49$_tmp_;
  private static final SubLString $str50$_;
  private static final SubLString $str51$dat;
  private static final SubLString $str52$External_plotting_not_enabled_in_;
  private static final SubLSymbol $sym53$RANK_AND_CLASSIFY_PROPERTY_CLASSIFICATION_TUPLES;
  private static final SubLSymbol $kw54$TEST;
  private static final SubLSymbol $kw55$OWNER;
  private static final SubLSymbol $kw56$CLASSES;
  private static final SubLSymbol $kw57$KB;
  private static final SubLSymbol $kw58$TINY;
  private static final SubLSymbol $kw59$WORKING_;
  private static final SubLList $list60;

  @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 1458L)
  public static SubLObject generate_line_graph(final SubLObject coordinates, final SubLObject plot_properties)
  {
    final SubLObject line_label = conses_high.getf( plot_properties, $kw0$LINE_LABEL, $str1$ );
    SubLObject new_plot_properties = conses_high.copy_list( plot_properties );
    new_plot_properties = conses_high.remf( new_plot_properties, $kw0$LINE_LABEL );
    new_plot_properties = conses_high.putf( new_plot_properties, $kw2$LINE_LABELS, ConsesLow.list( line_label ) );
    return generate_lines_graph( ConsesLow.list( coordinates ), new_plot_properties );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 2424L)
  public static SubLObject generate_line_graph_from_values(final SubLObject values, final SubLObject plot_properties)
  {
    return generate_line_graph( coordinatify( values ), plot_properties );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 2807L)
  public static SubLObject generate_lines_graph(final SubLObject coordinates_list, final SubLObject plot_properties)
  {
    final SubLObject line_count = Sequences.length( coordinates_list );
    final SubLObject tuples = list_utilities.collate( coordinates_list );
    final SubLObject data_filename = plot_data_full_filename_from_properties( plot_properties );
    save_plot_datafile( data_filename, tuples, UNPROVIDED );
    final SubLObject plot_filename = plot_program_full_filename_from_properties( plot_properties );
    final SubLObject display = plot_properties_display( plot_properties );
    save_lines_graph_plot_file( plot_filename, data_filename, plot_properties, line_count );
    return possibly_display_saved_plot( plot_filename, display );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 3685L)
  public static SubLObject generate_unconnected_lines_graph(final SubLObject coordinates_list, final SubLObject plot_properties)
  {
    final SubLObject line_count = Sequences.length( coordinates_list );
    final SubLObject tuples = list_utilities.collate( coordinates_list );
    final SubLObject data_filename = plot_data_full_filename_from_properties( plot_properties );
    save_plot_datafile( data_filename, tuples, UNPROVIDED );
    final SubLObject plot_filename = plot_program_full_filename_from_properties( plot_properties );
    final SubLObject display = plot_properties_display( plot_properties );
    save_property_comparison_plot_file( plot_filename, data_filename, plot_properties, line_count );
    return possibly_display_saved_plot( plot_filename, display );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 4957L)
  public static SubLObject generate_points_graph(final SubLObject coordinates_list, final SubLObject plot_properties)
  {
    final SubLObject point_set_count = Sequences.length( coordinates_list );
    final SubLObject tuples = list_utilities.collate( coordinates_list );
    final SubLObject data_filename = plot_data_full_filename_from_properties( plot_properties );
    save_plot_datafile( data_filename, tuples, UNPROVIDED );
    final SubLObject plot_filename = plot_program_full_filename_from_properties( plot_properties );
    final SubLObject display = plot_properties_display( plot_properties );
    save_points_graph_plot_file( plot_filename, data_filename, plot_properties, point_set_count );
    return possibly_display_saved_plot( plot_filename, display );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 5836L)
  public static SubLObject generate_correlation_plot(final SubLObject coordinates, final SubLObject plot_properties)
  {
    final SubLObject data_filename = plot_data_full_filename_from_properties( plot_properties );
    final SubLObject ranked_coordinates = list_utilities.rank_tuples( coordinates );
    save_plot_datafile( data_filename, ranked_coordinates, UNPROVIDED );
    final SubLObject plot_filename = plot_program_full_filename_from_properties( plot_properties );
    final SubLObject display = plot_properties_display( plot_properties );
    save_correlation_plot_file( plot_filename, data_filename, plot_properties );
    return possibly_display_saved_plot( plot_filename, display );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 6850L)
  public static SubLObject generate_lines_graph_from_values_list(final SubLObject values_list, final SubLObject plot_properties, SubLObject scaleP)
  {
    if( scaleP == UNPROVIDED )
    {
      scaleP = T;
    }
    final SubLObject scaled_values_list = ( NIL != scaleP ) ? scale_lengths( values_list ) : values_list;
    final SubLObject coordinates_list = equalize_lengths( Mapping.mapcar( $sym3$COORDINATIFY, scaled_values_list ) );
    return generate_lines_graph( coordinates_list, plot_properties );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 7484L)
  public static SubLObject kbq_generate_property_correlation_plot(final SubLObject baseline_run, final SubLObject experiment_run, final SubLObject property, SubLObject plot_properties, SubLObject display)
  {
    if( plot_properties == UNPROVIDED )
    {
      plot_properties = NIL;
    }
    if( display == UNPROVIDED )
    {
      display = NIL;
    }
    final SubLObject data_filename = kbq_save_property_comparison_datafile( baseline_run, experiment_run, property, plot_properties );
    final SubLObject plot_filename = plot_program_full_filename_from_properties( plot_properties );
    save_property_correlation_plot_file( plot_filename, data_filename, plot_properties );
    return possibly_display_saved_plot( plot_filename, display );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 7992L)
  public static SubLObject kbq_generate_properties_correlation_plot(final SubLObject query_set_run, final SubLObject x_property, final SubLObject y_property, SubLObject plot_properties)
  {
    if( plot_properties == UNPROVIDED )
    {
      plot_properties = NIL;
    }
    final SubLObject data_filename = kbq_save_properties_comparison_datafile( query_set_run, ConsesLow.list( x_property, y_property ), plot_properties );
    final SubLObject plot_filename = plot_program_full_filename_from_properties( plot_properties );
    final SubLObject display = plot_properties_display( plot_properties );
    save_property_correlation_plot_file( plot_filename, data_filename, plot_properties );
    return possibly_display_saved_plot( plot_filename, display );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 8560L)
  public static SubLObject kbq_generate_sorted_property_comparison(final SubLObject baseline_run, final SubLObject experiment_run, final SubLObject property, SubLObject plot_properties, SubLObject sort_by,
      SubLObject display)
  {
    if( plot_properties == UNPROVIDED )
    {
      plot_properties = NIL;
    }
    if( sort_by == UNPROVIDED )
    {
      sort_by = $kw4$BOTH;
    }
    if( display == UNPROVIDED )
    {
      display = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == conses_high.member( sort_by, $list5, UNPROVIDED, UNPROVIDED ) )
    {
      Errors.error( $str6$Invalid_sort_by_parameter_ );
    }
    final SubLObject data_filename = kbq_save_property_comparison_datafile( baseline_run, experiment_run, property, plot_properties );
    final SubLObject plot_filename = plot_program_full_filename_from_properties( plot_properties );
    save_sorted_property_comparison_plot_file( plot_filename, data_filename, plot_properties, sort_by );
    return possibly_display_saved_plot( plot_filename, display );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 9192L)
  public static SubLObject kbq_generate_sorted_property_comparison_for_runs(final SubLObject runs, final SubLObject property, SubLObject plot_properties, SubLObject sort_by)
  {
    if( plot_properties == UNPROVIDED )
    {
      plot_properties = NIL;
    }
    if( sort_by == UNPROVIDED )
    {
      sort_by = $kw7$FIRST;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == conses_high.member( sort_by, $list8, UNPROVIDED, UNPROVIDED ) )
    {
      Errors.error( $str6$Invalid_sort_by_parameter_ );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !Sequences.length( runs ).numG( ONE_INTEGER ) )
    {
      Errors.error( $str9$There_should_be_atleast_2_runs_sp );
    }
    final SubLObject tuples = kbq_generate_sorted_tuples_for_property_comparison_for_runs( runs, property, sort_by );
    return generate_unconnected_lines_graph( tuples, plot_properties );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 9636L)
  public static SubLObject kbq_generate_sorted_properties_comparison(final SubLObject query_set_run, final SubLObject v_properties, SubLObject plot_properties, SubLObject sort_by, SubLObject display)
  {
    if( plot_properties == UNPROVIDED )
    {
      plot_properties = NIL;
    }
    if( sort_by == UNPROVIDED )
    {
      sort_by = $kw10$ALL;
    }
    if( display == UNPROVIDED )
    {
      display = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && sort_by != $kw10$ALL && NIL == conses_high.member( sort_by, v_properties, UNPROVIDED, UNPROVIDED ) )
    {
      Errors.error( $str6$Invalid_sort_by_parameter_ );
    }
    final SubLObject data_filename = kbq_save_properties_comparison_datafile( query_set_run, v_properties, plot_properties );
    final SubLObject plot_filename = plot_program_full_filename_from_properties( plot_properties );
    save_sorted_properties_comparison_plot_file( plot_filename, data_filename, plot_properties, sort_by, v_properties );
    return possibly_display_saved_plot( plot_filename, display );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 10272L)
  public static SubLObject kbq_generate_sorted_property_display(final SubLObject query_set_run, final SubLObject property, SubLObject classifications, SubLObject plot_properties, SubLObject display)
  {
    if( classifications == UNPROVIDED )
    {
      classifications = NIL;
    }
    if( plot_properties == UNPROVIDED )
    {
      plot_properties = NIL;
    }
    if( display == UNPROVIDED )
    {
      display = NIL;
    }
    if( NIL == classifications )
    {
      classifications = ConsesLow.list( Symbols.symbol_function( $sym11$TRUE ) );
    }
    final SubLObject data_filename = kbq_save_property_classification_datafile( query_set_run, property, classifications, plot_properties );
    final SubLObject plot_filename = plot_program_full_filename_from_properties( plot_properties );
    save_sorted_property_display_plot_file( plot_filename, data_filename, plot_properties, classifications );
    return possibly_display_saved_plot( plot_filename, display );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 10875L)
  public static SubLObject kbq_generate_answerable_vs_unanswerable_comparison(final SubLObject query_set_run, final SubLObject property, SubLObject plot_properties, SubLObject sort_pred)
  {
    if( plot_properties == UNPROVIDED )
    {
      plot_properties = NIL;
    }
    if( sort_pred == UNPROVIDED )
    {
      sort_pred = Symbols.symbol_function( $sym12$SAFE__ );
    }
    final SubLObject answerable = kbq_query_run.kbq_answerable_query_set_run( query_set_run );
    final SubLObject unanswerable = kbq_query_run.kbq_unanswerable_query_set_run( query_set_run );
    return kbq_generate_answerable_vs_unanswerable_comparison_int( answerable, unanswerable, property, plot_properties, sort_pred );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 11323L)
  public static SubLObject kbq_generate_answerable_vs_unanswerable_comparison_int(final SubLObject answerable, final SubLObject unanswerable, final SubLObject property, SubLObject plot_properties,
      final SubLObject sort_pred)
  {
    final SubLObject current;
    final SubLObject datum = current = plot_properties;
    final SubLObject scaleP_tail = cdestructuring_bind.property_list_member( $kw13$SCALE_, current );
    final SubLObject scaleP = ( NIL != scaleP_tail ) ? conses_high.cadr( scaleP_tail ) : T;
    final SubLObject answerable_values = kbq_query_run.kbq_extract_property_values( answerable, property, UNPROVIDED );
    final SubLObject unanswerable_values = kbq_query_run.kbq_extract_property_values( unanswerable, property, UNPROVIDED );
    final SubLObject values_list = ConsesLow.list( answerable_values, unanswerable_values );
    final SubLObject scaled_values_list = ( NIL != scaleP ) ? scale_lengths( values_list ) : values_list;
    SubLObject current_$2;
    final SubLObject datum_$1 = current_$2 = scaled_values_list;
    SubLObject scaled_answerable_values = NIL;
    SubLObject scaled_unanswerable_values = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current_$2, datum_$1, $list14 );
    scaled_answerable_values = current_$2.first();
    current_$2 = current_$2.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current_$2, datum_$1, $list14 );
    scaled_unanswerable_values = current_$2.first();
    current_$2 = current_$2.rest();
    if( NIL == current_$2 )
    {
      final SubLObject scaled_sorted_answerable_values = Sort.sort( scaled_answerable_values, sort_pred, UNPROVIDED );
      final SubLObject scaled_sorted_unanswerable_values = Sort.sort( scaled_unanswerable_values, sort_pred, UNPROVIDED );
      final SubLObject answerable_coords = coordinatify( scaled_sorted_answerable_values );
      final SubLObject unanswerable_coords = coordinatify( scaled_sorted_unanswerable_values );
      final SubLObject coordinates_list = equalize_lengths( ConsesLow.list( unanswerable_coords, answerable_coords ) );
      if( NIL == conses_high.getf( plot_properties, $kw2$LINE_LABELS, UNPROVIDED ) )
      {
        plot_properties = conses_high.copy_list( plot_properties );
        plot_properties = conses_high.putf( plot_properties, $kw2$LINE_LABELS, $list15 );
      }
      return generate_lines_graph( coordinates_list, plot_properties );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum_$1, $list14 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 12645L)
  public static SubLObject kbq_generate_answerability_prediction_display(final SubLObject query_set_run, final SubLObject oracle_query_set_run, final SubLObject property, SubLObject plot_properties, SubLObject sort_pred)
  {
    if( plot_properties == UNPROVIDED )
    {
      plot_properties = NIL;
    }
    if( sort_pred == UNPROVIDED )
    {
      sort_pred = Symbols.symbol_function( $sym12$SAFE__ );
    }
    final SubLObject oracle_queries = kbq_query_run.kbq_query_set_run_queries( kbq_query_run.kbq_answerable_query_set_run( oracle_query_set_run ) );
    final SubLObject unanswerable = kbq_query_run.kbq_unanswerable_query_set_run( query_set_run );
    final SubLObject timed_out = kbq_query_run.kbq_filter_query_set_run_by_test( unanswerable, $str16$timed_out, $sym17$KBQ_QUERY_RUN_TIMED_OUT_, UNPROVIDED );
    final SubLObject answerable_timed_out = kbq_query_run.kbq_filter_query_set_run_to_queries( timed_out, oracle_queries, NIL );
    final SubLObject unanswerable_timed_out = kbq_query_run.kbq_filter_query_set_run_to_queries( timed_out, oracle_queries, T );
    if( NIL == kbq_query_run.kbq_query_set_run_query_runs( answerable_timed_out ) )
    {
      Errors.warn( $str18$No_oracularly_answerable_timed_ou );
      return NIL;
    }
    return kbq_generate_answerable_vs_unanswerable_comparison_int( answerable_timed_out, unanswerable_timed_out, property, plot_properties, sort_pred );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 13971L)
  public static SubLObject generate_inference_answer_image(final SubLObject inference, final SubLObject outfile, SubLObject plot_properties)
  {
    if( plot_properties == UNPROVIDED )
    {
      plot_properties = NIL;
    }
    final SubLObject data_filename = $str19$_tmp_inference_answer_timeline_da;
    final SubLObject plot_filename = $str20$_tmp_inference_answer_timeline_pl;
    inference_save_answer_timeline_datafile( inference, data_filename );
    save_inference_answer_plot_file( plot_filename, data_filename, plot_properties, outfile, inference );
    return save_plot_as_image( plot_filename, outfile );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 14756L)
  public static SubLObject kbq_save_property_comparison_datafile(final SubLObject baseline_run, final SubLObject experiment_run, final SubLObject property, SubLObject plot_properties)
  {
    if( plot_properties == UNPROVIDED )
    {
      plot_properties = NIL;
    }
    final SubLObject tuples = kbq_generate_tuples_for_property_comparison( baseline_run, experiment_run, property );
    final SubLObject comments = comments_for_property_comparison_datafile( plot_properties, property );
    return save_property_comparison_datafile( tuples, plot_properties, comments );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 15240L)
  public static SubLObject save_property_comparison_datafile(final SubLObject tuples, final SubLObject plot_properties, final SubLObject comments)
  {
    final SubLObject data_filename = plot_data_full_filename_from_properties( plot_properties );
    final SubLObject ranked_tuples = list_utilities.rank_tuples( tuples );
    return save_plot_datafile( data_filename, ranked_tuples, comments );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 15518L)
  public static SubLObject kbq_generate_tuples_for_property_comparison(final SubLObject baseline_run, final SubLObject experiment_run, final SubLObject property)
  {
    SubLObject tuples = NIL;
    SubLObject cdolist_list_var = kbq_query_run.kbq_query_set_run_query_runs( baseline_run );
    SubLObject baseline_query_run = NIL;
    baseline_query_run = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject query = kbq_query_run.kbq_query_run_query( baseline_query_run );
      final SubLObject experiment_query_run = kbq_query_run.kbq_lookup_query_run( experiment_run, query );
      final SubLObject baseline_value = kbq_query_run.kbq_query_run_property_value( baseline_query_run, property, UNPROVIDED );
      final SubLObject experiment_value = kbq_query_run.kbq_query_run_property_value( experiment_query_run, property, UNPROVIDED );
      if( NIL != baseline_value && NIL != experiment_value )
      {
        tuples = ConsesLow.cons( ConsesLow.list( baseline_value, experiment_value ), tuples );
      }
      cdolist_list_var = cdolist_list_var.rest();
      baseline_query_run = cdolist_list_var.first();
    }
    return Sequences.nreverse( tuples );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 16347L)
  public static SubLObject kbq_generate_tuples_for_property_comparison_for_runs(final SubLObject runs, final SubLObject property)
  {
    SubLObject tuples = NIL;
    final SubLObject first_run = runs.first();
    final SubLObject queries = kbq_query_run.kbq_extract_property_values( first_run, $kw21$QUERY, UNPROVIDED );
    SubLObject count = ZERO_INTEGER;
    SubLObject query_run = NIL;
    SubLObject value = NIL;
    SubLObject tuple = NIL;
    SubLObject cdolist_list_var = queries;
    SubLObject query = NIL;
    query = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      query_run = kbq_query_run.kbq_lookup_query_run( first_run, query );
      value = kbq_query_run.kbq_query_run_property_value( query_run, property, UNPROVIDED );
      if( NIL != value )
      {
        tuple = ConsesLow.cons( ConsesLow.list( count, value ), tuple );
      }
      count = Numbers.add( count, ONE_INTEGER );
      cdolist_list_var = cdolist_list_var.rest();
      query = cdolist_list_var.first();
    }
    tuples = ConsesLow.cons( tuple, tuples );
    cdolist_list_var = runs.rest();
    SubLObject run = NIL;
    run = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      count = ZERO_INTEGER;
      SubLObject cdolist_list_var_$3 = queries;
      SubLObject query2 = NIL;
      query2 = cdolist_list_var_$3.first();
      while ( NIL != cdolist_list_var_$3)
      {
        query_run = kbq_query_run.kbq_lookup_query_run( run, query2 );
        value = kbq_query_run.kbq_query_run_property_value( query_run, property, UNPROVIDED );
        if( NIL != value )
        {
          tuple = ConsesLow.cons( ConsesLow.list( count, value ), tuple );
        }
        count = Numbers.add( count, ONE_INTEGER );
        cdolist_list_var_$3 = cdolist_list_var_$3.rest();
        query2 = cdolist_list_var_$3.first();
      }
      tuples = ConsesLow.cons( tuple, tuples );
      cdolist_list_var = cdolist_list_var.rest();
      run = cdolist_list_var.first();
    }
    return Sequences.nreverse( tuples );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 17350L)
  public static SubLObject kbq_generate_sorted_tuples_for_property_comparison_for_runs(final SubLObject runs, final SubLObject property, final SubLObject sort_by)
  {
    SubLObject tuples = NIL;
    SubLObject first_query_runs = NIL;
    SubLObject query_runs = NIL;
    first_query_runs = kbq_query_run.kbq_sort_query_runs( runs.first(), property );
    SubLObject count = ZERO_INTEGER;
    SubLObject value = NIL;
    SubLObject tuple = NIL;
    SubLObject cdolist_list_var = first_query_runs;
    SubLObject query_run = NIL;
    query_run = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      value = kbq_query_run.kbq_query_run_property_value( query_run, property, UNPROVIDED );
      if( NIL != value )
      {
        tuple = ConsesLow.cons( ConsesLow.list( count, value ), tuple );
      }
      count = Numbers.add( count, ONE_INTEGER );
      cdolist_list_var = cdolist_list_var.rest();
      query_run = cdolist_list_var.first();
    }
    tuples = ConsesLow.cons( tuple, tuples );
    cdolist_list_var = runs.rest();
    SubLObject run = NIL;
    run = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      count = ZERO_INTEGER;
      if( sort_by.eql( $kw10$ALL ) )
      {
        SubLObject cdolist_list_var_$4;
        query_runs = ( cdolist_list_var_$4 = kbq_query_run.kbq_sort_query_runs( run, property ) );
        SubLObject query_run2 = NIL;
        query_run2 = cdolist_list_var_$4.first();
        while ( NIL != cdolist_list_var_$4)
        {
          value = kbq_query_run.kbq_query_run_property_value( query_run2, property, UNPROVIDED );
          if( NIL != value )
          {
            tuple = ConsesLow.cons( ConsesLow.list( count, value ), tuple );
          }
          count = Numbers.add( count, ONE_INTEGER );
          cdolist_list_var_$4 = cdolist_list_var_$4.rest();
          query_run2 = cdolist_list_var_$4.first();
        }
      }
      else if( sort_by.eql( $kw7$FIRST ) )
      {
        SubLObject cdolist_list_var_$5 = first_query_runs;
        SubLObject query_run2 = NIL;
        query_run2 = cdolist_list_var_$5.first();
        while ( NIL != cdolist_list_var_$5)
        {
          final SubLObject c_query_run = kbq_query_run.kbq_lookup_query_run( run, kbq_query_run.kbq_query_run_property_value( query_run2, $kw21$QUERY, UNPROVIDED ) );
          value = kbq_query_run.kbq_query_run_property_value( c_query_run, property, UNPROVIDED );
          if( NIL != value )
          {
            tuple = ConsesLow.cons( ConsesLow.list( count, value ), tuple );
          }
          count = Numbers.add( count, ONE_INTEGER );
          cdolist_list_var_$5 = cdolist_list_var_$5.rest();
          query_run2 = cdolist_list_var_$5.first();
        }
      }
      tuples = ConsesLow.cons( tuple, tuples );
      cdolist_list_var = cdolist_list_var.rest();
      run = cdolist_list_var.first();
    }
    return Sequences.nreverse( tuples );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 18700L)
  public static SubLObject comments_for_property_comparison_datafile(final SubLObject plot_properties, final SubLObject property)
  {
    final SubLObject baseline_name_tail = cdestructuring_bind.property_list_member( $kw22$BASELINE_NAME, plot_properties );
    final SubLObject baseline_name = ( NIL != baseline_name_tail ) ? conses_high.cadr( baseline_name_tail ) : $str23$baseline;
    final SubLObject experiment_name_tail = cdestructuring_bind.property_list_member( $kw24$EXPERIMENT_NAME, plot_properties );
    final SubLObject experiment_name = ( NIL != experiment_name_tail ) ? conses_high.cadr( experiment_name_tail ) : $str25$experiment;
    final SubLObject comment1 = Sequences.cconcatenate( $str26$baseline_____, format_nil.format_nil_a_no_copy( baseline_name ) );
    final SubLObject comment2 = Sequences.cconcatenate( $str27$experiment___, format_nil.format_nil_a_no_copy( experiment_name ) );
    final SubLObject comment3 = Sequences.cconcatenate( $str28$property_____, format_nil.format_nil_s_no_copy( property ) );
    final SubLObject comments = ConsesLow.list( comment1, comment2, comment3 );
    return comments;
  }

  @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 19201L)
  public static SubLObject kbq_save_properties_comparison_datafile(final SubLObject query_set_run, final SubLObject v_properties, final SubLObject plot_properties)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == list_utilities.lengthLE( v_properties, TEN_INTEGER, UNPROVIDED ) )
    {
      Errors.error( $str29$Cannot_handle_more_than_10_proper, v_properties );
    }
    final SubLObject tuples = kbq_generate_tuples_for_properties_comparison( query_set_run, v_properties );
    final SubLObject comments = comments_for_properties_comparison_datafile( plot_properties, v_properties );
    return save_properties_comparison_datafile( tuples, plot_properties, comments );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 19680L)
  public static SubLObject save_properties_comparison_datafile(final SubLObject tuples, final SubLObject plot_properties, final SubLObject comments)
  {
    final SubLObject data_filename = plot_data_full_filename_from_properties( plot_properties );
    final SubLObject ranked_tuples = list_utilities.rank_tuples( tuples );
    return save_plot_datafile( data_filename, ranked_tuples, comments );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 19960L)
  public static SubLObject kbq_generate_tuples_for_properties_comparison(final SubLObject query_set_run, final SubLObject v_properties)
  {
    SubLObject tuples = NIL;
    SubLObject cdolist_list_var;
    final SubLObject query_runs = cdolist_list_var = kbq_query_run.kbq_query_set_run_query_runs( query_set_run );
    SubLObject query_run = NIL;
    query_run = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject tuple = NIL;
      SubLObject cdolist_list_var_$6 = v_properties;
      SubLObject property = NIL;
      property = cdolist_list_var_$6.first();
      while ( NIL != cdolist_list_var_$6)
      {
        final SubLObject property_value = kbq_query_run.kbq_query_run_property_value( query_run, property, UNPROVIDED );
        tuple = ConsesLow.cons( property_value, tuple );
        cdolist_list_var_$6 = cdolist_list_var_$6.rest();
        property = cdolist_list_var_$6.first();
      }
      if( NIL == list_utilities.member_if_not( Symbols.symbol_function( $sym30$NUMBERP ), tuple, UNPROVIDED ) )
      {
        tuples = ConsesLow.cons( Sequences.nreverse( tuple ), tuples );
      }
      cdolist_list_var = cdolist_list_var.rest();
      query_run = cdolist_list_var.first();
    }
    return Sequences.nreverse( tuples );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 20631L)
  public static SubLObject comments_for_properties_comparison_datafile(final SubLObject plot_properties, final SubLObject v_properties)
  {
    final SubLObject experiment_name_tail = cdestructuring_bind.property_list_member( $kw24$EXPERIMENT_NAME, plot_properties );
    final SubLObject experiment_name = ( NIL != experiment_name_tail ) ? conses_high.cadr( experiment_name_tail ) : $str25$experiment;
    final SubLObject comment1 = Sequences.cconcatenate( $str27$experiment___, format_nil.format_nil_a_no_copy( experiment_name ) );
    final SubLObject comment2 = Sequences.cconcatenate( $str31$properties___, format_nil.format_nil_s_no_copy( v_properties ) );
    final SubLObject comments = ConsesLow.list( comment1, comment2 );
    return comments;
  }

  @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 21033L)
  public static SubLObject kbq_save_property_classification_datafile(final SubLObject query_set_run, final SubLObject property, final SubLObject classifications, SubLObject plot_properties)
  {
    if( plot_properties == UNPROVIDED )
    {
      plot_properties = NIL;
    }
    final SubLObject tuples = kbq_generate_tuples_for_property_classification( query_set_run, property );
    final SubLObject comments = comments_for_property_classification_datafile( plot_properties, property );
    return save_property_classification_datafile( tuples, plot_properties, comments, classifications );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 21469L)
  public static SubLObject save_property_classification_datafile(final SubLObject tuples, final SubLObject plot_properties, final SubLObject comments, final SubLObject classifications)
  {
    final SubLObject data_filename = plot_data_full_filename_from_properties( plot_properties );
    final SubLObject ranked_and_classified_tuples = rank_and_classify_property_classification_tuples( tuples, classifications );
    return save_plot_datafile( data_filename, ranked_and_classified_tuples, comments );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 21850L)
  public static SubLObject comments_for_property_classification_datafile(final SubLObject plot_properties, final SubLObject property)
  {
    final SubLObject experiment_name_tail = cdestructuring_bind.property_list_member( $kw24$EXPERIMENT_NAME, plot_properties );
    final SubLObject experiment_name = ( NIL != experiment_name_tail ) ? conses_high.cadr( experiment_name_tail ) : $str25$experiment;
    final SubLObject comment1 = Sequences.cconcatenate( $str27$experiment___, format_nil.format_nil_a_no_copy( experiment_name ) );
    final SubLObject comment2 = Sequences.cconcatenate( $str28$property_____, format_nil.format_nil_s_no_copy( property ) );
    final SubLObject comment3 = Sequences.copy_seq( $str32$classification_0 );
    final SubLObject comments = ConsesLow.list( comment1, comment2, comment3 );
    return comments;
  }

  @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 22306L)
  public static SubLObject kbq_generate_tuples_for_property_classification(final SubLObject query_set_run, final SubLObject property)
  {
    SubLObject tuples = NIL;
    SubLObject cdolist_list_var;
    final SubLObject query_runs = cdolist_list_var = kbq_query_run.kbq_query_set_run_query_runs( query_set_run );
    SubLObject query_run = NIL;
    query_run = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject query = kbq_query_run.kbq_query_run_query( query_run );
      final SubLObject property_value = kbq_query_run.kbq_query_run_property_value( query_run, property, UNPROVIDED );
      if( property_value.isNumber() )
      {
        tuples = ConsesLow.cons( ConsesLow.list( query, property_value ), tuples );
      }
      cdolist_list_var = cdolist_list_var.rest();
      query_run = cdolist_list_var.first();
    }
    return Sequences.nreverse( tuples );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 22850L)
  public static SubLObject rank_and_classify_property_classification_tuples(final SubLObject tuples, final SubLObject classifications)
  {
    SubLObject classified_tuples = NIL;
    final SubLObject sorted_tuples = Sort.stable_sort( conses_high.copy_list( tuples ), Symbols.symbol_function( $sym33$_ ), Symbols.symbol_function( $sym34$SECOND ) );
    final SubLObject rank_dictionary = dictionary.new_dictionary( UNPROVIDED, UNPROVIDED );
    SubLObject list_var = NIL;
    SubLObject tuple = NIL;
    SubLObject rank = NIL;
    list_var = sorted_tuples;
    tuple = list_var.first();
    for( rank = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), tuple = list_var.first(), rank = Numbers.add( ONE_INTEGER, rank ) )
    {
      dictionary.dictionary_enter( rank_dictionary, tuple, rank );
    }
    final SubLObject tuple_classes = list_utilities.categorize_list_elements( sorted_tuples, classifications, Symbols.symbol_function( $sym35$FIRST ) );
    SubLObject list_var2 = NIL;
    SubLObject tuple_class = NIL;
    SubLObject index = NIL;
    list_var2 = tuple_classes;
    tuple_class = list_var2.first();
    for( index = ZERO_INTEGER; NIL != list_var2; list_var2 = list_var2.rest(), tuple_class = list_var2.first(), index = Numbers.add( ONE_INTEGER, index ) )
    {
      if( !index.isZero() )
      {
        final SubLObject classification_break = Sequences.cconcatenate( $str36$classification_, format_nil.format_nil_a_no_copy( index ) );
        classified_tuples = ConsesLow.cons( classification_break, classified_tuples );
      }
      if( NIL == tuple_class )
      {
        Errors.warn( $str37$Classification__S_was_empty, index );
      }
      SubLObject cdolist_list_var = tuple_class;
      SubLObject tuple2 = NIL;
      tuple2 = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject rank2 = dictionary.dictionary_lookup( rank_dictionary, tuple2, UNPROVIDED );
        SubLObject current;
        final SubLObject datum = current = tuple2;
        SubLObject element = NIL;
        SubLObject value = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list38 );
        element = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list38 );
        value = current.first();
        current = current.rest();
        if( NIL == current )
        {
          classified_tuples = ConsesLow.cons( ConsesLow.list( rank2, value ), classified_tuples );
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list38 );
        }
        cdolist_list_var = cdolist_list_var.rest();
        tuple2 = cdolist_list_var.first();
      }
    }
    return Sequences.nreverse( classified_tuples );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 24345L)
  public static SubLObject inference_save_answer_timeline_datafile(final SubLObject inference, final SubLObject data_filename)
  {
    final SubLObject tuples = inference_answer_elapsed_time_tuples( inference );
    return save_plot_datafile( data_filename, tuples, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 24580L)
  public static SubLObject inference_answer_elapsed_time_tuples(final SubLObject inference)
  {
    SubLObject tuples = NIL;
    final SubLObject idx = inference_datastructures_inference.inference_answer_id_index( inference );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw39$SKIP ) )
    {
      final SubLObject idx_$7 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$7, $kw39$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$7 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject v_answer;
        SubLObject id_$8;
        SubLObject time;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          v_answer = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( v_answer ) || NIL == id_index.id_index_skip_tombstones_p( $kw39$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( v_answer ) )
            {
              v_answer = $kw39$SKIP;
            }
            id_$8 = inference_datastructures_inference.inference_answer_suid( v_answer );
            time = inference_datastructures_inference.inference_answer_elapsed_time( v_answer, NIL );
            tuples = ConsesLow.cons( ConsesLow.list( time, id_$8 ), tuples );
          }
        }
      }
      final SubLObject idx_$8 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$8 ) || NIL == id_index.id_index_skip_tombstones_p( $kw39$SKIP ) )
      {
        final SubLObject sparse = id_index.id_index_sparse_objects( idx_$8 );
        SubLObject id2 = id_index.id_index_sparse_id_threshold( idx_$8 );
        final SubLObject end_id = id_index.id_index_next_id( idx_$8 );
        final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw39$SKIP ) ) ? NIL : $kw39$SKIP;
        while ( id2.numL( end_id ))
        {
          final SubLObject v_answer2 = Hashtables.gethash_without_values( id2, sparse, v_default );
          if( NIL == id_index.id_index_skip_tombstones_p( $kw39$SKIP ) || NIL == id_index.id_index_tombstone_p( v_answer2 ) )
          {
            final SubLObject id_$9 = inference_datastructures_inference.inference_answer_suid( v_answer2 );
            final SubLObject time2 = inference_datastructures_inference.inference_answer_elapsed_time( v_answer2, NIL );
            tuples = ConsesLow.cons( ConsesLow.list( time2, id_$9 ), tuples );
          }
          id2 = Numbers.add( id2, ONE_INTEGER );
        }
      }
    }
    return Sequences.nreverse( tuples );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 28200L)
  public static SubLObject save_plot_datafile(final SubLObject data_filename, final SubLObject tuples, SubLObject comments)
  {
    if( comments == UNPROVIDED )
    {
      comments = NIL;
    }
    return plot_unavailable_warning();
  }

  @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 28439L)
  public static SubLObject kbq_property_coordinates(final SubLObject query_set_run, final SubLObject property)
  {
    SubLObject coords = NIL;
    SubLObject list_var = NIL;
    SubLObject query_run = NIL;
    SubLObject i = NIL;
    list_var = kbq_query_run.kbq_query_set_run_query_runs( query_set_run );
    query_run = list_var.first();
    for( i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), query_run = list_var.first(), i = Numbers.add( ONE_INTEGER, i ) )
    {
      final SubLObject value = kbq_query_run.kbq_query_run_property_value( query_run, property, UNPROVIDED );
      final SubLObject coord = ConsesLow.list( i, value );
      coords = ConsesLow.cons( coord, coords );
    }
    return Sequences.nreverse( coords );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 28764L)
  public static SubLObject coordinatify(final SubLObject values)
  {
    SubLObject coords = NIL;
    SubLObject list_var = NIL;
    SubLObject value = NIL;
    SubLObject i = NIL;
    list_var = values;
    value = list_var.first();
    for( i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), value = list_var.first(), i = Numbers.add( ONE_INTEGER, i ) )
    {
      coords = ConsesLow.cons( ConsesLow.list( i, value ), coords );
    }
    return Sequences.nreverse( coords );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 28931L)
  public static SubLObject equalize_lengths(final SubLObject coordinates_list)
  {
    SubLObject new_coordinates_list = NIL;
    final SubLObject max_length = number_utilities.maximum( Mapping.mapcar( Symbols.symbol_function( $sym41$LENGTH ), coordinates_list ), UNPROVIDED );
    SubLObject cdolist_list_var = coordinates_list;
    SubLObject coordinates = NIL;
    coordinates = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject coordinates_vector = list_utilities.list2vector( coordinates );
      final SubLObject length = Sequences.length( coordinates_vector );
      SubLObject last_coord = NIL;
      SubLObject new_coordinates = NIL;
      SubLObject i;
      SubLObject coord;
      for( i = NIL, i = ZERO_INTEGER; i.numL( max_length ); i = Numbers.add( i, ONE_INTEGER ) )
      {
        if( i.numL( length ) )
        {
          coord = Vectors.aref( coordinates_vector, i );
          new_coordinates = ConsesLow.cons( coord, new_coordinates );
          last_coord = coord;
        }
        else
        {
          new_coordinates = ConsesLow.cons( last_coord, new_coordinates );
        }
      }
      new_coordinates_list = ConsesLow.cons( Sequences.nreverse( new_coordinates ), new_coordinates_list );
      cdolist_list_var = cdolist_list_var.rest();
      coordinates = cdolist_list_var.first();
    }
    return Sequences.nreverse( new_coordinates_list );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 29600L)
  public static SubLObject scale_lengths(final SubLObject lists)
  {
    SubLObject new_lists = NIL;
    final SubLObject max_length = number_utilities.maximum( Mapping.mapcar( Symbols.symbol_function( $sym41$LENGTH ), lists ), UNPROVIDED );
    SubLObject cdolist_list_var = lists;
    SubLObject list = NIL;
    list = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject scaling_factor = Numbers.round( Numbers.divide( max_length, Sequences.length( list ) ), UNPROVIDED );
      if( scaling_factor.numG( ONE_INTEGER ) )
      {
        SubLObject new_list = NIL;
        SubLObject cdolist_list_var_$11 = list;
        SubLObject elem = NIL;
        elem = cdolist_list_var_$11.first();
        while ( NIL != cdolist_list_var_$11)
        {
          SubLObject i;
          for( i = NIL, i = ZERO_INTEGER; i.numL( scaling_factor ); i = Numbers.add( i, ONE_INTEGER ) )
          {
            new_list = ConsesLow.cons( elem, new_list );
          }
          cdolist_list_var_$11 = cdolist_list_var_$11.rest();
          elem = cdolist_list_var_$11.first();
        }
        new_lists = ConsesLow.cons( Sequences.nreverse( new_list ), new_lists );
      }
      else
      {
        new_lists = ConsesLow.cons( list, new_lists );
      }
      cdolist_list_var = cdolist_list_var.rest();
      list = cdolist_list_var.first();
    }
    return Sequences.nreverse( new_lists );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 30090L)
  public static SubLObject save_lines_graph_plot_file(final SubLObject plot_filename, final SubLObject data_filename, final SubLObject plot_properties, final SubLObject line_count)
  {
    return plot_unavailable_warning();
  }

  @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 30426L)
  public static SubLObject save_points_graph_plot_file(final SubLObject plot_filename, final SubLObject data_filename, final SubLObject plot_properties, final SubLObject line_count)
  {
    return plot_unavailable_warning();
  }

  @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 30691L)
  public static SubLObject save_correlation_plot_file(final SubLObject plot_filename, final SubLObject data_filename, final SubLObject plot_properties)
  {
    return plot_unavailable_warning();
  }

  @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 30932L)
  public static SubLObject save_property_correlation_plot_file(final SubLObject plot_filename, final SubLObject data_filename, final SubLObject plot_properties)
  {
    return plot_unavailable_warning();
  }

  @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 31191L)
  public static SubLObject save_property_comparison_plot_file(final SubLObject plot_filename, final SubLObject data_filename, final SubLObject plot_properties, final SubLObject line_count)
  {
    return plot_unavailable_warning();
  }

  @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 31470L)
  public static SubLObject save_sorted_property_comparison_plot_file(final SubLObject plot_filename, final SubLObject data_filename, final SubLObject plot_properties, final SubLObject sort_by)
  {
    return plot_unavailable_warning();
  }

  @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 31757L)
  public static SubLObject save_sorted_properties_comparison_plot_file(final SubLObject plot_filename, final SubLObject data_filename, final SubLObject plot_properties, final SubLObject sort_by,
      final SubLObject v_properties)
  {
    return plot_unavailable_warning();
  }

  @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 32070L)
  public static SubLObject save_sorted_property_display_plot_file(final SubLObject plot_filename, final SubLObject data_filename, final SubLObject plot_properties, final SubLObject classifications)
  {
    return plot_unavailable_warning();
  }

  @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 32367L)
  public static SubLObject save_inference_answer_plot_file(final SubLObject plot_filename, final SubLObject data_filename, final SubLObject plot_properties, final SubLObject outfile, final SubLObject inference)
  {
    return plot_unavailable_warning();
  }

  @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 32654L)
  public static SubLObject compute_key_location(final SubLObject coordinates)
  {
    SubLObject min_x = Numbers.$most_positive_fixnum$.getGlobalValue();
    SubLObject max_x = Numbers.$most_negative_fixnum$.getGlobalValue();
    SubLObject min_y = Numbers.$most_positive_fixnum$.getGlobalValue();
    SubLObject max_y = Numbers.$most_negative_fixnum$.getGlobalValue();
    SubLObject cdolist_list_var = coordinates;
    SubLObject coord = NIL;
    coord = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = coord;
      SubLObject x = NIL;
      SubLObject y = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list42 );
      x = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list42 );
      y = current.first();
      current = current.rest();
      if( NIL == current )
      {
        if( x.isNumber() && y.isNumber() )
        {
          if( x.numG( max_x ) )
          {
            max_x = x;
          }
          if( y.numG( max_y ) )
          {
            max_y = y;
          }
          if( x.numL( min_x ) )
          {
            min_x = x;
          }
          if( y.numL( min_y ) )
          {
            min_y = y;
          }
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list42 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      coord = cdolist_list_var.first();
    }
    final SubLObject total_x = Numbers.subtract( max_x, min_x );
    final SubLObject x_location = Numbers.add( min_x, Numbers.multiply( $float43$0_3, total_x ) );
    final SubLObject total_y = Numbers.subtract( max_y, min_y );
    final SubLObject y_location = Numbers.add( max_y, Numbers.multiply( $float44$0_0, total_y ) );
    return ConsesLow.list( x_location, y_location );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 33437L)
  public static SubLObject compute_key_location_from_tuples(final SubLObject tuples)
  {
    SubLObject coordinates = NIL;
    SubLObject list_var = NIL;
    SubLObject tuple = NIL;
    SubLObject i = NIL;
    list_var = tuples;
    tuple = list_var.first();
    for( i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), tuple = list_var.first(), i = Numbers.add( ONE_INTEGER, i ) )
    {
      SubLObject current;
      final SubLObject datum = current = tuple;
      SubLObject who_cares = NIL;
      SubLObject value = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list45 );
      who_cares = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list45 );
      value = current.first();
      current = current.rest();
      if( NIL == current )
      {
        coordinates = ConsesLow.cons( ConsesLow.list( i, value ), coordinates );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list45 );
      }
    }
    return compute_key_location( Sequences.nreverse( coordinates ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 33814L)
  public static SubLObject plot_properties_name(final SubLObject plot_properties)
  {
    return conses_high.getf( plot_properties, $kw47$PLOT_NAME, $default_plot_name$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 33933L)
  public static SubLObject plot_properties_display(final SubLObject plot_properties)
  {
    return conses_high.getf( plot_properties, $kw48$DISPLAY, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 34084L)
  public static SubLObject plot_full_filename(final SubLObject filename, final SubLObject extension, SubLObject directory)
  {
    if( directory == UNPROVIDED )
    {
      directory = $plot_directory$.getGlobalValue();
    }
    return Sequences.cconcatenate( directory, new SubLObject[] { filename, $str50$_, extension
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 34327L)
  public static SubLObject plot_data_full_filename(final SubLObject filename)
  {
    return plot_full_filename( filename, $str51$dat, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 34423L)
  public static SubLObject plot_data_full_filename_from_properties(final SubLObject plot_properties)
  {
    final SubLObject plot_name = plot_properties_name( plot_properties );
    return plot_data_full_filename( plot_name );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 34606L)
  public static SubLObject plot_program_full_filename(final SubLObject filename)
  {
    return plot_full_filename( filename, $str46$plot, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 34706L)
  public static SubLObject plot_program_full_filename_from_properties(final SubLObject plot_properties)
  {
    final SubLObject plot_name = plot_properties_name( plot_properties );
    return plot_program_full_filename( plot_name );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 34895L)
  public static SubLObject possibly_display_saved_plot(final SubLObject plot_filename, final SubLObject display)
  {
    return plot_unavailable_warning();
  }

  @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 35094L)
  public static SubLObject save_plot_as_image(final SubLObject plot_filename, final SubLObject outfile)
  {
    final SubLObject full_output_filename = append_proper_plot_image_extension( outfile );
    return ( NIL != save_plot_as_image_successfulP( plot_filename ) ) ? full_output_filename : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 35400L)
  public static SubLObject save_plot_as_image_successfulP(final SubLObject plot_filename)
  {
    return plot_unavailable_warning();
  }

  @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 35636L)
  public static SubLObject plot_image_format()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject image_format = plot_image_format_and_extension();
    final SubLObject extension = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return image_format;
  }

  @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 35811L)
  public static SubLObject append_proper_plot_image_extension(final SubLObject outfile)
  {
    final SubLObject extension = plot_image_extension();
    return Sequences.cconcatenate( outfile, extension );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 35965L)
  public static SubLObject plot_image_extension()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject image_format = plot_image_format_and_extension();
    final SubLObject extension = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return extension;
  }

  @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 36143L)
  public static SubLObject plot_image_format_and_extension()
  {
    return plot_unavailable_warning();
  }

  @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 36307L)
  public static SubLObject plotting_availableP()
  {
    return makeBoolean( NIL != Processes.external_processes_supportedP() && NIL != gnuplot_availableP() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 36421L)
  public static SubLObject gnuplot_availableP()
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 36540L)
  public static SubLObject plot_unavailable_warning()
  {
    return Errors.warn( $str52$External_plotting_not_enabled_in_ );
  }

  public static SubLObject declare_plot_generation_file()
  {
    SubLFiles.declareFunction( me, "generate_line_graph", "GENERATE-LINE-GRAPH", 2, 0, false );
    SubLFiles.declareFunction( me, "generate_line_graph_from_values", "GENERATE-LINE-GRAPH-FROM-VALUES", 2, 0, false );
    SubLFiles.declareFunction( me, "generate_lines_graph", "GENERATE-LINES-GRAPH", 2, 0, false );
    SubLFiles.declareFunction( me, "generate_unconnected_lines_graph", "GENERATE-UNCONNECTED-LINES-GRAPH", 2, 0, false );
    SubLFiles.declareFunction( me, "generate_points_graph", "GENERATE-POINTS-GRAPH", 2, 0, false );
    SubLFiles.declareFunction( me, "generate_correlation_plot", "GENERATE-CORRELATION-PLOT", 2, 0, false );
    SubLFiles.declareFunction( me, "generate_lines_graph_from_values_list", "GENERATE-LINES-GRAPH-FROM-VALUES-LIST", 2, 1, false );
    SubLFiles.declareFunction( me, "kbq_generate_property_correlation_plot", "KBQ-GENERATE-PROPERTY-CORRELATION-PLOT", 3, 2, false );
    SubLFiles.declareFunction( me, "kbq_generate_properties_correlation_plot", "KBQ-GENERATE-PROPERTIES-CORRELATION-PLOT", 3, 1, false );
    SubLFiles.declareFunction( me, "kbq_generate_sorted_property_comparison", "KBQ-GENERATE-SORTED-PROPERTY-COMPARISON", 3, 3, false );
    SubLFiles.declareFunction( me, "kbq_generate_sorted_property_comparison_for_runs", "KBQ-GENERATE-SORTED-PROPERTY-COMPARISON-FOR-RUNS", 2, 2, false );
    SubLFiles.declareFunction( me, "kbq_generate_sorted_properties_comparison", "KBQ-GENERATE-SORTED-PROPERTIES-COMPARISON", 2, 3, false );
    SubLFiles.declareFunction( me, "kbq_generate_sorted_property_display", "KBQ-GENERATE-SORTED-PROPERTY-DISPLAY", 2, 3, false );
    SubLFiles.declareFunction( me, "kbq_generate_answerable_vs_unanswerable_comparison", "KBQ-GENERATE-ANSWERABLE-VS-UNANSWERABLE-COMPARISON", 2, 2, false );
    SubLFiles.declareFunction( me, "kbq_generate_answerable_vs_unanswerable_comparison_int", "KBQ-GENERATE-ANSWERABLE-VS-UNANSWERABLE-COMPARISON-INT", 5, 0, false );
    SubLFiles.declareFunction( me, "kbq_generate_answerability_prediction_display", "KBQ-GENERATE-ANSWERABILITY-PREDICTION-DISPLAY", 3, 2, false );
    SubLFiles.declareFunction( me, "generate_inference_answer_image", "GENERATE-INFERENCE-ANSWER-IMAGE", 2, 1, false );
    SubLFiles.declareFunction( me, "kbq_save_property_comparison_datafile", "KBQ-SAVE-PROPERTY-COMPARISON-DATAFILE", 3, 1, false );
    SubLFiles.declareFunction( me, "save_property_comparison_datafile", "SAVE-PROPERTY-COMPARISON-DATAFILE", 3, 0, false );
    SubLFiles.declareFunction( me, "kbq_generate_tuples_for_property_comparison", "KBQ-GENERATE-TUPLES-FOR-PROPERTY-COMPARISON", 3, 0, false );
    SubLFiles.declareFunction( me, "kbq_generate_tuples_for_property_comparison_for_runs", "KBQ-GENERATE-TUPLES-FOR-PROPERTY-COMPARISON-FOR-RUNS", 2, 0, false );
    SubLFiles.declareFunction( me, "kbq_generate_sorted_tuples_for_property_comparison_for_runs", "KBQ-GENERATE-SORTED-TUPLES-FOR-PROPERTY-COMPARISON-FOR-RUNS", 3, 0, false );
    SubLFiles.declareFunction( me, "comments_for_property_comparison_datafile", "COMMENTS-FOR-PROPERTY-COMPARISON-DATAFILE", 2, 0, false );
    SubLFiles.declareFunction( me, "kbq_save_properties_comparison_datafile", "KBQ-SAVE-PROPERTIES-COMPARISON-DATAFILE", 3, 0, false );
    SubLFiles.declareFunction( me, "save_properties_comparison_datafile", "SAVE-PROPERTIES-COMPARISON-DATAFILE", 3, 0, false );
    SubLFiles.declareFunction( me, "kbq_generate_tuples_for_properties_comparison", "KBQ-GENERATE-TUPLES-FOR-PROPERTIES-COMPARISON", 2, 0, false );
    SubLFiles.declareFunction( me, "comments_for_properties_comparison_datafile", "COMMENTS-FOR-PROPERTIES-COMPARISON-DATAFILE", 2, 0, false );
    SubLFiles.declareFunction( me, "kbq_save_property_classification_datafile", "KBQ-SAVE-PROPERTY-CLASSIFICATION-DATAFILE", 3, 1, false );
    SubLFiles.declareFunction( me, "save_property_classification_datafile", "SAVE-PROPERTY-CLASSIFICATION-DATAFILE", 4, 0, false );
    SubLFiles.declareFunction( me, "comments_for_property_classification_datafile", "COMMENTS-FOR-PROPERTY-CLASSIFICATION-DATAFILE", 2, 0, false );
    SubLFiles.declareFunction( me, "kbq_generate_tuples_for_property_classification", "KBQ-GENERATE-TUPLES-FOR-PROPERTY-CLASSIFICATION", 2, 0, false );
    SubLFiles.declareFunction( me, "rank_and_classify_property_classification_tuples", "RANK-AND-CLASSIFY-PROPERTY-CLASSIFICATION-TUPLES", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_save_answer_timeline_datafile", "INFERENCE-SAVE-ANSWER-TIMELINE-DATAFILE", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_answer_elapsed_time_tuples", "INFERENCE-ANSWER-ELAPSED-TIME-TUPLES", 1, 0, false );
    SubLFiles.declareFunction( me, "save_plot_datafile", "SAVE-PLOT-DATAFILE", 2, 1, false );
    SubLFiles.declareFunction( me, "kbq_property_coordinates", "KBQ-PROPERTY-COORDINATES", 2, 0, false );
    SubLFiles.declareFunction( me, "coordinatify", "COORDINATIFY", 1, 0, false );
    SubLFiles.declareFunction( me, "equalize_lengths", "EQUALIZE-LENGTHS", 1, 0, false );
    SubLFiles.declareFunction( me, "scale_lengths", "SCALE-LENGTHS", 1, 0, false );
    SubLFiles.declareFunction( me, "save_lines_graph_plot_file", "SAVE-LINES-GRAPH-PLOT-FILE", 4, 0, false );
    SubLFiles.declareFunction( me, "save_points_graph_plot_file", "SAVE-POINTS-GRAPH-PLOT-FILE", 4, 0, false );
    SubLFiles.declareFunction( me, "save_correlation_plot_file", "SAVE-CORRELATION-PLOT-FILE", 3, 0, false );
    SubLFiles.declareFunction( me, "save_property_correlation_plot_file", "SAVE-PROPERTY-CORRELATION-PLOT-FILE", 3, 0, false );
    SubLFiles.declareFunction( me, "save_property_comparison_plot_file", "SAVE-PROPERTY-COMPARISON-PLOT-FILE", 4, 0, false );
    SubLFiles.declareFunction( me, "save_sorted_property_comparison_plot_file", "SAVE-SORTED-PROPERTY-COMPARISON-PLOT-FILE", 4, 0, false );
    SubLFiles.declareFunction( me, "save_sorted_properties_comparison_plot_file", "SAVE-SORTED-PROPERTIES-COMPARISON-PLOT-FILE", 5, 0, false );
    SubLFiles.declareFunction( me, "save_sorted_property_display_plot_file", "SAVE-SORTED-PROPERTY-DISPLAY-PLOT-FILE", 4, 0, false );
    SubLFiles.declareFunction( me, "save_inference_answer_plot_file", "SAVE-INFERENCE-ANSWER-PLOT-FILE", 5, 0, false );
    SubLFiles.declareFunction( me, "compute_key_location", "COMPUTE-KEY-LOCATION", 1, 0, false );
    SubLFiles.declareFunction( me, "compute_key_location_from_tuples", "COMPUTE-KEY-LOCATION-FROM-TUPLES", 1, 0, false );
    SubLFiles.declareFunction( me, "plot_properties_name", "PLOT-PROPERTIES-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "plot_properties_display", "PLOT-PROPERTIES-DISPLAY", 1, 0, false );
    SubLFiles.declareFunction( me, "plot_full_filename", "PLOT-FULL-FILENAME", 2, 1, false );
    SubLFiles.declareFunction( me, "plot_data_full_filename", "PLOT-DATA-FULL-FILENAME", 1, 0, false );
    SubLFiles.declareFunction( me, "plot_data_full_filename_from_properties", "PLOT-DATA-FULL-FILENAME-FROM-PROPERTIES", 1, 0, false );
    SubLFiles.declareFunction( me, "plot_program_full_filename", "PLOT-PROGRAM-FULL-FILENAME", 1, 0, false );
    SubLFiles.declareFunction( me, "plot_program_full_filename_from_properties", "PLOT-PROGRAM-FULL-FILENAME-FROM-PROPERTIES", 1, 0, false );
    SubLFiles.declareFunction( me, "possibly_display_saved_plot", "POSSIBLY-DISPLAY-SAVED-PLOT", 2, 0, false );
    SubLFiles.declareFunction( me, "save_plot_as_image", "SAVE-PLOT-AS-IMAGE", 2, 0, false );
    SubLFiles.declareFunction( me, "save_plot_as_image_successfulP", "SAVE-PLOT-AS-IMAGE-SUCCESSFUL?", 1, 0, false );
    SubLFiles.declareFunction( me, "plot_image_format", "PLOT-IMAGE-FORMAT", 0, 0, false );
    SubLFiles.declareFunction( me, "append_proper_plot_image_extension", "APPEND-PROPER-PLOT-IMAGE-EXTENSION", 1, 0, false );
    SubLFiles.declareFunction( me, "plot_image_extension", "PLOT-IMAGE-EXTENSION", 0, 0, false );
    SubLFiles.declareFunction( me, "plot_image_format_and_extension", "PLOT-IMAGE-FORMAT-AND-EXTENSION", 0, 0, false );
    SubLFiles.declareFunction( me, "plotting_availableP", "PLOTTING-AVAILABLE?", 0, 0, false );
    SubLFiles.declareFunction( me, "gnuplot_availableP", "GNUPLOT-AVAILABLE?", 0, 0, false );
    SubLFiles.declareFunction( me, "plot_unavailable_warning", "PLOT-UNAVAILABLE-WARNING", 0, 0, false );
    return NIL;
  }

  public static SubLObject init_plot_generation_file()
  {
    $infn_count_data_dir$ = SubLFiles.deflexical( "*INFN-COUNT-DATA-DIR*", $str40$_cyc_top_data_kb_stats_ );
    $default_plot_name$ = SubLFiles.deflexical( "*DEFAULT-PLOT-NAME*", $str46$plot );
    $plot_directory$ = SubLFiles.deflexical( "*PLOT-DIRECTORY*", $str49$_tmp_ );
    return NIL;
  }

  public static SubLObject setup_plot_generation_file()
  {
    generic_testing.define_test_case_table_int( $sym53$RANK_AND_CLASSIFY_PROPERTY_CLASSIFICATION_TUPLES, ConsesLow.list( new SubLObject[] { $kw54$TEST, NIL, $kw55$OWNER, NIL, $kw56$CLASSES, NIL, $kw57$KB, $kw58$TINY,
      $kw59$WORKING_, T
    } ), $list60 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_plot_generation_file();
  }

  @Override
  public void initializeVariables()
  {
    init_plot_generation_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_plot_generation_file();
  }
  static
  {
    me = new plot_generation();
    $infn_count_data_dir$ = null;
    $default_plot_name$ = null;
    $plot_directory$ = null;
    $kw0$LINE_LABEL = makeKeyword( "LINE-LABEL" );
    $str1$ = makeString( "" );
    $kw2$LINE_LABELS = makeKeyword( "LINE-LABELS" );
    $sym3$COORDINATIFY = makeSymbol( "COORDINATIFY" );
    $kw4$BOTH = makeKeyword( "BOTH" );
    $list5 = ConsesLow.list( makeKeyword( "BOTH" ), makeKeyword( "BASELINE" ), makeKeyword( "EXPERIMENT" ) );
    $str6$Invalid_sort_by_parameter_ = makeString( "Invalid sort-by parameter." );
    $kw7$FIRST = makeKeyword( "FIRST" );
    $list8 = ConsesLow.list( makeKeyword( "ALL" ), makeKeyword( "FIRST" ) );
    $str9$There_should_be_atleast_2_runs_sp = makeString( "There should be atleast 2 runs specified" );
    $kw10$ALL = makeKeyword( "ALL" );
    $sym11$TRUE = makeSymbol( "TRUE" );
    $sym12$SAFE__ = makeSymbol( "SAFE-<" );
    $kw13$SCALE_ = makeKeyword( "SCALE?" );
    $list14 = ConsesLow.list( makeSymbol( "SCALED-ANSWERABLE-VALUES" ), makeSymbol( "SCALED-UNANSWERABLE-VALUES" ) );
    $list15 = ConsesLow.list( makeString( "unanswerable" ), makeString( "answerable" ) );
    $str16$timed_out = makeString( "timed out" );
    $sym17$KBQ_QUERY_RUN_TIMED_OUT_ = makeSymbol( "KBQ-QUERY-RUN-TIMED-OUT?" );
    $str18$No_oracularly_answerable_timed_ou = makeString( "No oracularly answerable timed-out queries" );
    $str19$_tmp_inference_answer_timeline_da = makeString( "/tmp/inference_answer_timeline.data" );
    $str20$_tmp_inference_answer_timeline_pl = makeString( "/tmp/inference_answer_timeline.plot" );
    $kw21$QUERY = makeKeyword( "QUERY" );
    $kw22$BASELINE_NAME = makeKeyword( "BASELINE-NAME" );
    $str23$baseline = makeString( "baseline" );
    $kw24$EXPERIMENT_NAME = makeKeyword( "EXPERIMENT-NAME" );
    $str25$experiment = makeString( "experiment" );
    $str26$baseline_____ = makeString( "baseline   = " );
    $str27$experiment___ = makeString( "experiment = " );
    $str28$property_____ = makeString( "property   = " );
    $str29$Cannot_handle_more_than_10_proper = makeString( "Cannot handle more than 10 properties, got ~s" );
    $sym30$NUMBERP = makeSymbol( "NUMBERP" );
    $str31$properties___ = makeString( "properties = " );
    $str32$classification_0 = makeString( "classification 0" );
    $sym33$_ = makeSymbol( "<" );
    $sym34$SECOND = makeSymbol( "SECOND" );
    $sym35$FIRST = makeSymbol( "FIRST" );
    $str36$classification_ = makeString( "classification " );
    $str37$Classification__S_was_empty = makeString( "Classification ~S was empty" );
    $list38 = ConsesLow.list( makeSymbol( "ELEMENT" ), makeSymbol( "VALUE" ) );
    $kw39$SKIP = makeKeyword( "SKIP" );
    $str40$_cyc_top_data_kb_stats_ = makeString( "/cyc/top/data/kb-stats/" );
    $sym41$LENGTH = makeSymbol( "LENGTH" );
    $list42 = ConsesLow.list( makeSymbol( "X" ), makeSymbol( "Y" ) );
    $float43$0_3 = makeDouble( 0.3 );
    $float44$0_0 = makeDouble( 0.0 );
    $list45 = ConsesLow.list( makeSymbol( "WHO-CARES" ), makeSymbol( "VALUE" ) );
    $str46$plot = makeString( "plot" );
    $kw47$PLOT_NAME = makeKeyword( "PLOT-NAME" );
    $kw48$DISPLAY = makeKeyword( "DISPLAY" );
    $str49$_tmp_ = makeString( "/tmp/" );
    $str50$_ = makeString( "." );
    $str51$dat = makeString( "dat" );
    $str52$External_plotting_not_enabled_in_ = makeString( "External plotting not enabled in this image" );
    $sym53$RANK_AND_CLASSIFY_PROPERTY_CLASSIFICATION_TUPLES = makeSymbol( "RANK-AND-CLASSIFY-PROPERTY-CLASSIFICATION-TUPLES" );
    $kw54$TEST = makeKeyword( "TEST" );
    $kw55$OWNER = makeKeyword( "OWNER" );
    $kw56$CLASSES = makeKeyword( "CLASSES" );
    $kw57$KB = makeKeyword( "KB" );
    $kw58$TINY = makeKeyword( "TINY" );
    $kw59$WORKING_ = makeKeyword( "WORKING?" );
    $list60 = ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.list( ONE_INTEGER, makeDouble( 0.4 ) ), ConsesLow.list( MINUS_ONE_INTEGER, makeDouble( 0.7 ) ), ConsesLow.list( TWO_INTEGER,
        makeDouble( 0.3 ) ), ConsesLow.list( makeInteger( -2 ), makeDouble( 0.1 ) ) ), ConsesLow.list( makeSymbol( "PLUSP" ), makeSymbol( "MINUSP" ) ) ), ConsesLow.list( ConsesLow.list( ONE_INTEGER, makeDouble( 0.3 ) ),
            ConsesLow.list( TWO_INTEGER, makeDouble( 0.4 ) ), makeString( "classification 1" ), ConsesLow.list( ZERO_INTEGER, makeDouble( 0.1 ) ), ConsesLow.list( THREE_INTEGER, makeDouble( 0.7 ) ) ) ) );
  }
}
/*
 * 
 * Total time: 229 ms
 * 
 */
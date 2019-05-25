package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class timing_by_category
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.timing_by_category";
  public static final String myFingerPrint = "f8996971d68b9b5da073138174425405ee54fa749d025d926d38bec6d8198182";
  @SubLTranslatedFile.SubL(source = "cycl/timing-by-category.lisp", position = 886L)
  public static SubLSymbol $categorized_times$;
  @SubLTranslatedFile.SubL(source = "cycl/timing-by-category.lisp", position = 1004L)
  public static SubLSymbol $categorize_time_context$;
  private static final SubLList $list0;
  private static final SubLSymbol $sym1$TOTAL_TIME;
  private static final SubLSymbol $sym2$CLET;
  private static final SubLList $list3;
  private static final SubLSymbol $sym4$CTIME;
  private static final SubLSymbol $sym5$PROGN;
  private static final SubLSymbol $sym6$MAYBE_OUTPUT_CATEGORIZED_TIMES;
  private static final SubLList $list7;
  private static final SubLSymbol $sym8$TIME;
  private static final SubLSymbol $sym9$_CATEGORIZE_TIME_CONTEXT_;
  private static final SubLSymbol $sym10$CONS;
  private static final SubLList $list11;
  private static final SubLSymbol $sym12$PWHEN;
  private static final SubLList $list13;
  private static final SubLSymbol $sym14$NOTE_CATEGORIZED_TIME;
  private static final SubLList $list15;
  private static final SubLSymbol $sym16$CATEGORIZED_TIMES;
  private static final SubLSymbol $sym17$WITH_CATEGORIZED_TIMES;
  private static final SubLSymbol $kw18$UNCATEGORIZED;
  private static final SubLString $str19$Categorized_time___S__is_greater_;
  private static final SubLString $str20$__Timing_data__total_time__A____;
  private static final SubLList $list21;
  private static final SubLSymbol $sym22$CATEGORIZED_TIME_DATA__;
  private static final SubLSymbol $kw23$TOTAL_TIME;
  private static final SubLSymbol $sym24$NON_NEGATIVE_NUMBER_P;
  private static final SubLList $list25;
  private static final SubLString $str26$___A_S___A___D____;
  private static final SubLSymbol $sym27$CATEGORIZE_TIME;
  private static final SubLList $list28;
  private static final SubLSymbol $kw29$TOP_LEVEL;
  private static final SubLFloat $float30$0_2;
  private static final SubLSymbol $kw31$SECOND_LEVEL;
  private static final SubLSymbol $kw32$THIRD_LEVEL;
  private static final SubLSymbol $kw33$TOP_LEVEL_2;
  private static final SubLFloat $float34$0_1;

  @SubLTranslatedFile.SubL(source = "cycl/timing-by-category.lisp", position = 1087L)
  public static SubLObject with_categorized_times(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    final SubLObject temp = current.rest();
    current = current.first();
    final SubLObject stream = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list0 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject total_time = $sym1$TOTAL_TIME;
      return ConsesLow.list( $sym2$CLET, ConsesLow.list( $list3, total_time ), ConsesLow.list( $sym4$CTIME, total_time, reader.bq_cons( $sym5$PROGN, ConsesLow.append( body, NIL ) ) ), ConsesLow.list(
          $sym6$MAYBE_OUTPUT_CATEGORIZED_TIMES, stream, total_time ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list0 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/timing-by-category.lisp", position = 1484L)
  public static SubLObject categorize_time(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list7 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject category_keyword = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list7 );
    category_keyword = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject time = $sym8$TIME;
      return ConsesLow.list( $sym2$CLET, ConsesLow.list( ConsesLow.list( $sym9$_CATEGORIZE_TIME_CONTEXT_, ConsesLow.listS( $sym10$CONS, category_keyword, $list11 ) ), time ), ConsesLow.list( $sym4$CTIME, time, reader
          .bq_cons( $sym5$PROGN, ConsesLow.append( body, NIL ) ) ), ConsesLow.list( $sym12$PWHEN, $list13, ConsesLow.listS( $sym14$NOTE_CATEGORIZED_TIME, time, $list15 ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list7 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/timing-by-category.lisp", position = 1936L)
  public static SubLObject categorized_times()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $categorized_times$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/timing-by-category.lisp", position = 2065L)
  public static SubLObject maybe_output_categorized_times(final SubLObject stream, final SubLObject total_time)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == stream || ( stream.isStream() && NIL != streams_high.output_stream_p( stream ) ) )
    {
      final SubLObject _prev_bind_0 = StreamsLow.$debug_io$.currentBinding( thread );
      try
      {
        StreamsLow.$debug_io$.bind( ( NIL != stream ) ? stream : StreamsLow.$debug_io$.getDynamicValue( thread ), thread );
        SubLObject categorized_time = ZERO_INTEGER;
        SubLObject iteration_state;
        for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( categorized_times() ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
            iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
        {
          thread.resetMultipleValues();
          final SubLObject category = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
          final SubLObject data = thread.secondMultipleValue();
          thread.resetMultipleValues();
          if( !category.eql( $kw18$UNCATEGORIZED ) )
          {
            categorized_time = Numbers.add( categorized_time, categorized_time_data_time( data ) );
          }
        }
        dictionary_contents.do_dictionary_contents_finalize( iteration_state );
        final SubLObject uncategorized_time = Numbers.subtract( total_time, categorized_time );
        if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == number_utilities.non_negative_number_p( uncategorized_time ) )
        {
          Errors.error( $str19$Categorized_time___S__is_greater_, numeric_date_utilities.readable_elapsed_time_string( categorized_time, UNPROVIDED ), numeric_date_utilities.readable_elapsed_time_string( total_time,
              UNPROVIDED ) );
        }
        if( uncategorized_time.isPositive() )
        {
          dictionary.dictionary_enter( categorized_times(), $kw18$UNCATEGORIZED, uncategorized_time );
        }
        PrintLow.format( StreamsLow.$debug_io$.getDynamicValue( thread ), $str20$__Timing_data__total_time__A____, numeric_date_utilities.readable_elapsed_time_string( total_time, UNPROVIDED ) );
        SubLObject cdolist_list_var = dictionary_utilities.sort_dictionary_by_values( categorized_times(), $sym22$CATEGORIZED_TIME_DATA__ );
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          SubLObject current;
          final SubLObject datum = current = cons;
          SubLObject category2 = NIL;
          SubLObject data2 = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list21 );
          category2 = current.first();
          current = ( data2 = current.rest() );
          output_categorized_time_data( category2, data2, total_time );
          cdolist_list_var = cdolist_list_var.rest();
          cons = cdolist_list_var.first();
        }
      }
      finally
      {
        StreamsLow.$debug_io$.rebind( _prev_bind_0, thread );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/timing-by-category.lisp", position = 3191L)
  public static SubLObject categorized_time_data_G(final SubLObject data1, final SubLObject data2)
  {
    return Numbers.numG( categorized_time_data_time( data1 ), categorized_time_data_time( data2 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/timing-by-category.lisp", position = 3332L)
  public static SubLObject categorized_time_data_time(final SubLObject data)
  {
    if( data.isNumber() )
    {
      return data;
    }
    if( NIL != dictionary.dictionary_p( data ) )
    {
      return dictionary.dictionary_lookup_without_values( data, $kw23$TOTAL_TIME, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/timing-by-category.lisp", position = 3516L)
  public static SubLObject output_categorized_time_data(final SubLObject category, final SubLObject data, final SubLObject total_time)
  {
    output_categorized_time_data_recursive( category, data, total_time, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/timing-by-category.lisp", position = 3675L)
  public static SubLObject output_categorized_time_data_recursive(final SubLObject category, final SubLObject data, final SubLObject total_time, final SubLObject nesting_level)
  {
    assert NIL != number_utilities.non_negative_number_p( total_time ) : total_time;
    if( data.isNumber() )
    {
      output_categorized_time( category, data, total_time, nesting_level );
    }
    else if( NIL != dictionary.dictionary_p( data ) )
    {
      final SubLObject total_category_time = dictionary.dictionary_lookup_without_values( data, $kw23$TOTAL_TIME, UNPROVIDED );
      output_categorized_time( category, total_category_time, total_time, nesting_level );
      SubLObject cdolist_list_var = dictionary_utilities.sort_dictionary_by_values( data, $sym22$CATEGORIZED_TIME_DATA__ );
      SubLObject cons = NIL;
      cons = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject current;
        final SubLObject datum = current = cons;
        SubLObject subcategory = NIL;
        SubLObject subcat_data = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list25 );
        subcategory = current.first();
        current = ( subcat_data = current.rest() );
        if( !subcategory.eql( $kw23$TOTAL_TIME ) )
        {
          output_categorized_time_data_recursive( subcategory, subcat_data, total_category_time, number_utilities.f_1X( nesting_level ) );
        }
        cdolist_list_var = cdolist_list_var.rest();
        cons = cdolist_list_var.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/timing-by-category.lisp", position = 4379L)
  public static SubLObject output_categorized_time(final SubLObject category, final SubLObject time, final SubLObject total_time, final SubLObject nesting_level)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != number_utilities.non_negative_number_p( time ) : time;
    PrintLow.format( StreamsLow.$debug_io$.getDynamicValue( thread ), $str26$___A_S___A___D____, new SubLObject[] { Strings.make_string( nesting_level, Characters.CHAR_space ), category, numeric_date_utilities
        .readable_elapsed_time_string( time, UNPROVIDED ), number_utilities.integer_percent( time, total_time, T )
    } );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/timing-by-category.lisp", position = 4682L)
  public static SubLObject note_categorized_time(final SubLObject time, final SubLObject stats_table, final SubLObject v_context)
  {
    if( NIL != misc_utilities.initialized_p( stats_table ) )
    {
      SubLObject my_category = NIL;
      SubLObject supercategories_ascending = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( v_context, v_context, $list28 );
      my_category = v_context.first();
      final SubLObject current = supercategories_ascending = v_context.rest();
      final SubLObject supercategory_stats = get_supercategory_timing_stats( stats_table, supercategories_ascending );
      note_categorized_time_in_stats( supercategory_stats, my_category, time );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/timing-by-category.lisp", position = 5086L)
  public static SubLObject get_supercategory_timing_stats(final SubLObject stats_table, final SubLObject supercategories_ascending)
  {
    SubLObject supercategory_stats = stats_table;
    SubLObject supercategory_home = NIL;
    SubLObject cdolist_list_var = Sequences.reverse( supercategories_ascending );
    SubLObject supercategory = NIL;
    supercategory = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      supercategory_home = supercategory_stats;
      supercategory_stats = dictionary.dictionary_lookup_without_values( supercategory_home, supercategory, ZERO_INTEGER );
      if( supercategory_stats.isNumber() )
      {
        final SubLObject supercategory_time = supercategory_stats;
        supercategory_stats = dictionary.new_dictionary( Symbols.symbol_function( EQL ), UNPROVIDED );
        dictionary.dictionary_enter( supercategory_stats, $kw23$TOTAL_TIME, supercategory_time );
        dictionary.dictionary_enter( supercategory_home, supercategory, supercategory_stats );
      }
      cdolist_list_var = cdolist_list_var.rest();
      supercategory = cdolist_list_var.first();
    }
    return supercategory_stats;
  }

  @SubLTranslatedFile.SubL(source = "cycl/timing-by-category.lisp", position = 5896L)
  public static SubLObject note_categorized_time_in_stats(final SubLObject supercategory_stats, final SubLObject category_keyword, final SubLObject time)
  {
    final SubLObject my_stats = dictionary.dictionary_lookup_without_values( supercategory_stats, category_keyword, ZERO_INTEGER );
    if( my_stats.isNumber() )
    {
      dictionary_utilities.dictionary_increment( supercategory_stats, category_keyword, time );
    }
    else
    {
      dictionary_utilities.dictionary_increment( my_stats, $kw23$TOTAL_TIME, time );
    }
    return my_stats;
  }

  @SubLTranslatedFile.SubL(source = "cycl/timing-by-category.lisp", position = 6306L)
  public static SubLObject test_categorized_timing()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = $categorized_times$.currentBinding( thread );
    try
    {
      $categorized_times$.bind( dictionary.new_dictionary( UNPROVIDED, UNPROVIDED ), thread );
      SubLObject total_time = NIL;
      final SubLObject time_var = Time.get_internal_real_time();
      final SubLObject _prev_bind_0_$1 = $categorize_time_context$.currentBinding( thread );
      try
      {
        $categorize_time_context$.bind( ConsesLow.cons( $kw29$TOP_LEVEL, $categorize_time_context$.getDynamicValue( thread ) ), thread );
        SubLObject time = NIL;
        final SubLObject time_var_$2 = Time.get_internal_real_time();
        Threads.sleep( $float30$0_2 );
        final SubLObject _prev_bind_0_$2 = $categorize_time_context$.currentBinding( thread );
        try
        {
          $categorize_time_context$.bind( ConsesLow.cons( $kw31$SECOND_LEVEL, $categorize_time_context$.getDynamicValue( thread ) ), thread );
          SubLObject time_$4 = NIL;
          final SubLObject time_var_$3 = Time.get_internal_real_time();
          final SubLObject _prev_bind_0_$3 = $categorize_time_context$.currentBinding( thread );
          try
          {
            $categorize_time_context$.bind( ConsesLow.cons( $kw32$THIRD_LEVEL, $categorize_time_context$.getDynamicValue( thread ) ), thread );
            SubLObject time_$5 = NIL;
            final SubLObject time_var_$4 = Time.get_internal_real_time();
            Threads.sleep( $float30$0_2 );
            time_$5 = Numbers.divide( Numbers.subtract( Time.get_internal_real_time(), time_var_$4 ), time_high.$internal_time_units_per_second$.getGlobalValue() );
            if( NIL != misc_utilities.initialized_p( categorized_times() ) )
            {
              note_categorized_time( time_$5, categorized_times(), $categorize_time_context$.getDynamicValue( thread ) );
            }
          }
          finally
          {
            $categorize_time_context$.rebind( _prev_bind_0_$3, thread );
          }
          time_$4 = Numbers.divide( Numbers.subtract( Time.get_internal_real_time(), time_var_$3 ), time_high.$internal_time_units_per_second$.getGlobalValue() );
          if( NIL != misc_utilities.initialized_p( categorized_times() ) )
          {
            note_categorized_time( time_$4, categorized_times(), $categorize_time_context$.getDynamicValue( thread ) );
          }
        }
        finally
        {
          $categorize_time_context$.rebind( _prev_bind_0_$2, thread );
        }
        time = Numbers.divide( Numbers.subtract( Time.get_internal_real_time(), time_var_$2 ), time_high.$internal_time_units_per_second$.getGlobalValue() );
        if( NIL != misc_utilities.initialized_p( categorized_times() ) )
        {
          note_categorized_time( time, categorized_times(), $categorize_time_context$.getDynamicValue( thread ) );
        }
      }
      finally
      {
        $categorize_time_context$.rebind( _prev_bind_0_$1, thread );
      }
      final SubLObject _prev_bind_0_$4 = $categorize_time_context$.currentBinding( thread );
      try
      {
        $categorize_time_context$.bind( ConsesLow.cons( $kw33$TOP_LEVEL_2, $categorize_time_context$.getDynamicValue( thread ) ), thread );
        SubLObject time = NIL;
        final SubLObject time_var_$5 = Time.get_internal_real_time();
        Threads.sleep( $float34$0_1 );
        time = Numbers.divide( Numbers.subtract( Time.get_internal_real_time(), time_var_$5 ), time_high.$internal_time_units_per_second$.getGlobalValue() );
        if( NIL != misc_utilities.initialized_p( categorized_times() ) )
        {
          note_categorized_time( time, categorized_times(), $categorize_time_context$.getDynamicValue( thread ) );
        }
      }
      finally
      {
        $categorize_time_context$.rebind( _prev_bind_0_$4, thread );
      }
      final SubLObject _prev_bind_0_$5 = $categorize_time_context$.currentBinding( thread );
      try
      {
        $categorize_time_context$.bind( ConsesLow.cons( $kw33$TOP_LEVEL_2, $categorize_time_context$.getDynamicValue( thread ) ), thread );
        SubLObject time = NIL;
        final SubLObject time_var_$6 = Time.get_internal_real_time();
        Threads.sleep( $float34$0_1 );
        time = Numbers.divide( Numbers.subtract( Time.get_internal_real_time(), time_var_$6 ), time_high.$internal_time_units_per_second$.getGlobalValue() );
        if( NIL != misc_utilities.initialized_p( categorized_times() ) )
        {
          note_categorized_time( time, categorized_times(), $categorize_time_context$.getDynamicValue( thread ) );
        }
      }
      finally
      {
        $categorize_time_context$.rebind( _prev_bind_0_$5, thread );
      }
      Threads.sleep( $float30$0_2 );
      total_time = Numbers.divide( Numbers.subtract( Time.get_internal_real_time(), time_var ), time_high.$internal_time_units_per_second$.getGlobalValue() );
      maybe_output_categorized_times( NIL, total_time );
    }
    finally
    {
      $categorized_times$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  public static SubLObject declare_timing_by_category_file()
  {
    SubLFiles.declareMacro( me, "with_categorized_times", "WITH-CATEGORIZED-TIMES" );
    SubLFiles.declareMacro( me, "categorize_time", "CATEGORIZE-TIME" );
    SubLFiles.declareFunction( me, "categorized_times", "CATEGORIZED-TIMES", 0, 0, false );
    SubLFiles.declareFunction( me, "maybe_output_categorized_times", "MAYBE-OUTPUT-CATEGORIZED-TIMES", 2, 0, false );
    SubLFiles.declareFunction( me, "categorized_time_data_G", "CATEGORIZED-TIME-DATA->", 2, 0, false );
    SubLFiles.declareFunction( me, "categorized_time_data_time", "CATEGORIZED-TIME-DATA-TIME", 1, 0, false );
    SubLFiles.declareFunction( me, "output_categorized_time_data", "OUTPUT-CATEGORIZED-TIME-DATA", 3, 0, false );
    SubLFiles.declareFunction( me, "output_categorized_time_data_recursive", "OUTPUT-CATEGORIZED-TIME-DATA-RECURSIVE", 4, 0, false );
    SubLFiles.declareFunction( me, "output_categorized_time", "OUTPUT-CATEGORIZED-TIME", 4, 0, false );
    SubLFiles.declareFunction( me, "note_categorized_time", "NOTE-CATEGORIZED-TIME", 3, 0, false );
    SubLFiles.declareFunction( me, "get_supercategory_timing_stats", "GET-SUPERCATEGORY-TIMING-STATS", 2, 0, false );
    SubLFiles.declareFunction( me, "note_categorized_time_in_stats", "NOTE-CATEGORIZED-TIME-IN-STATS", 3, 0, false );
    SubLFiles.declareFunction( me, "test_categorized_timing", "TEST-CATEGORIZED-TIMING", 0, 0, false );
    return NIL;
  }

  public static SubLObject init_timing_by_category_file()
  {
    $categorized_times$ = SubLFiles.defparameter( "*CATEGORIZED-TIMES*", misc_utilities.uninitialized() );
    $categorize_time_context$ = SubLFiles.defparameter( "*CATEGORIZE-TIME-CONTEXT*", NIL );
    return NIL;
  }

  public static SubLObject setup_timing_by_category_file()
  {
    access_macros.register_macro_helper( $sym16$CATEGORIZED_TIMES, $sym17$WITH_CATEGORIZED_TIMES );
    access_macros.register_macro_helper( $sym6$MAYBE_OUTPUT_CATEGORIZED_TIMES, $sym17$WITH_CATEGORIZED_TIMES );
    access_macros.register_macro_helper( $sym14$NOTE_CATEGORIZED_TIME, $sym27$CATEGORIZE_TIME );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_timing_by_category_file();
  }

  @Override
  public void initializeVariables()
  {
    init_timing_by_category_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_timing_by_category_file();
  }
  static
  {
    me = new timing_by_category();
    $categorized_times$ = null;
    $categorize_time_context$ = null;
    $list0 = ConsesLow.list( ConsesLow.list( makeSymbol( "&OPTIONAL" ), makeSymbol( "STREAM" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym1$TOTAL_TIME = makeUninternedSymbol( "TOTAL-TIME" );
    $sym2$CLET = makeSymbol( "CLET" );
    $list3 = ConsesLow.list( makeSymbol( "*CATEGORIZED-TIMES*" ), ConsesLow.list( makeSymbol( "NEW-DICTIONARY" ) ) );
    $sym4$CTIME = makeSymbol( "CTIME" );
    $sym5$PROGN = makeSymbol( "PROGN" );
    $sym6$MAYBE_OUTPUT_CATEGORIZED_TIMES = makeSymbol( "MAYBE-OUTPUT-CATEGORIZED-TIMES" );
    $list7 = ConsesLow.list( ConsesLow.list( makeSymbol( "CATEGORY-KEYWORD" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym8$TIME = makeUninternedSymbol( "TIME" );
    $sym9$_CATEGORIZE_TIME_CONTEXT_ = makeSymbol( "*CATEGORIZE-TIME-CONTEXT*" );
    $sym10$CONS = makeSymbol( "CONS" );
    $list11 = ConsesLow.list( makeSymbol( "*CATEGORIZE-TIME-CONTEXT*" ) );
    $sym12$PWHEN = makeSymbol( "PWHEN" );
    $list13 = ConsesLow.list( makeSymbol( "INITIALIZED-P" ), ConsesLow.list( makeSymbol( "CATEGORIZED-TIMES" ) ) );
    $sym14$NOTE_CATEGORIZED_TIME = makeSymbol( "NOTE-CATEGORIZED-TIME" );
    $list15 = ConsesLow.list( ConsesLow.list( makeSymbol( "CATEGORIZED-TIMES" ) ), makeSymbol( "*CATEGORIZE-TIME-CONTEXT*" ) );
    $sym16$CATEGORIZED_TIMES = makeSymbol( "CATEGORIZED-TIMES" );
    $sym17$WITH_CATEGORIZED_TIMES = makeSymbol( "WITH-CATEGORIZED-TIMES" );
    $kw18$UNCATEGORIZED = makeKeyword( "UNCATEGORIZED" );
    $str19$Categorized_time___S__is_greater_ = makeString( "Categorized time (~S) is greater than total time (~S)!" );
    $str20$__Timing_data__total_time__A____ = makeString( "~&Timing data (total time ~A):~%" );
    $list21 = ConsesLow.cons( makeSymbol( "CATEGORY" ), makeSymbol( "DATA" ) );
    $sym22$CATEGORIZED_TIME_DATA__ = makeSymbol( "CATEGORIZED-TIME-DATA->" );
    $kw23$TOTAL_TIME = makeKeyword( "TOTAL-TIME" );
    $sym24$NON_NEGATIVE_NUMBER_P = makeSymbol( "NON-NEGATIVE-NUMBER-P" );
    $list25 = ConsesLow.cons( makeSymbol( "SUBCATEGORY" ), makeSymbol( "SUBCAT-DATA" ) );
    $str26$___A_S___A___D____ = makeString( "~&~A~S: ~A (~D%)~%" );
    $sym27$CATEGORIZE_TIME = makeSymbol( "CATEGORIZE-TIME" );
    $list28 = ConsesLow.cons( makeSymbol( "MY-CATEGORY" ), makeSymbol( "SUPERCATEGORIES-ASCENDING" ) );
    $kw29$TOP_LEVEL = makeKeyword( "TOP-LEVEL" );
    $float30$0_2 = makeDouble( 0.2 );
    $kw31$SECOND_LEVEL = makeKeyword( "SECOND-LEVEL" );
    $kw32$THIRD_LEVEL = makeKeyword( "THIRD-LEVEL" );
    $kw33$TOP_LEVEL_2 = makeKeyword( "TOP-LEVEL-2" );
    $float34$0_1 = makeDouble( 0.1 );
  }
}
/*
 * 
 * Total time: 170 ms
 * 
 */
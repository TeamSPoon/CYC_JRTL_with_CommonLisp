package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;

import org.armedbear.lisp.Main;

import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class http_kernel
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.http_kernel";
  public static final String myFingerPrint = "503b40f95ba3a581a2d4603ad7d0a875139dbb7c6fbf3e9deced0cb7d5689687";
  @SubLTranslatedFile.SubL(source = "cycl/http-kernel.lisp", position = 1128L)
  public static SubLSymbol $http_cgi_bin_directory$;
  @SubLTranslatedFile.SubL(source = "cycl/http-kernel.lisp", position = 1278L)
  public static SubLSymbol $http_cg_url$;
  @SubLTranslatedFile.SubL(source = "cycl/http-kernel.lisp", position = 1328L)
  public static SubLSymbol $http_cgi_bin_ws_directory$;
  @SubLTranslatedFile.SubL(source = "cycl/http-kernel.lisp", position = 1851L)
  public static SubLSymbol $http_cyc_ws_directory$;
  @SubLTranslatedFile.SubL(source = "cycl/http-kernel.lisp", position = 1935L)
  public static SubLSymbol $http_cyc_ws_machine$;
  @SubLTranslatedFile.SubL(source = "cycl/http-kernel.lisp", position = 1983L)
  public static SubLSymbol $http_cyc_ws_port$;
  @SubLTranslatedFile.SubL(source = "cycl/http-kernel.lisp", position = 2060L)
  public static SubLSymbol $http_request_logging_stream$;
  @SubLTranslatedFile.SubL(source = "cycl/http-kernel.lisp", position = 6237L)
  private static SubLSymbol $get_http_logging_sequence_generator$;
  @SubLTranslatedFile.SubL(source = "cycl/http-kernel.lisp", position = 7525L)
  public static SubLSymbol $http_return_mime_type_prefix$;
  @SubLTranslatedFile.SubL(source = "cycl/http-kernel.lisp", position = 17241L)
  private static SubLSymbol $http_file_request_headers_int_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/http-kernel.lisp", position = 18234L)
  private static SubLSymbol $allow_css_js_expires_headers$;
  @SubLTranslatedFile.SubL(source = "cycl/http-kernel.lisp", position = 18953L)
  private static SubLSymbol $http_content_type_file_extension_table$;
  private static final SubLString $str0$_cgi_bin;
  private static final SubLString $str1$_cg_;
  private static final SubLString $str2$_cgi_bin_ws_;
  private static final SubLString $str3$_cyc_ws;
  private static final SubLSymbol $sym4$_HTTP_CYC_WS_MACHINE_;
  private static final SubLSymbol $sym5$_HTTP_CYC_WS_PORT_;
  private static final SubLSymbol $kw6$HTTP;
  private static final SubLSymbol $sym7$HTTP_SERVER_HANDLER;
  private static final SubLSymbol $kw8$TEXT;
  private static final SubLString $str9$HTTP_Request__6__0D_received_at__;
  private static final SubLString $str10$CYC;
  private static final SubLSymbol $sym11$DOUBLE_FLOAT;
  private static final SubLString $str12$HTTP_Request__6__0D_content___S__;
  private static final SubLSymbol $kw13$FILE;
  private static final SubLString $str14$_;
  private static final SubLSymbol $kw15$CGI;
  private static final SubLString $str16$_cgi_bin_cg_cb_start_redirect;
  private static final SubLSymbol $kw17$WS;
  private static final SubLSymbol $kw18$IGNORE_ERRORS_TARGET;
  private static final SubLSymbol $sym19$IGNORE_ERRORS_HANDLER;
  private static final SubLString $str20$HTTP_Request__6__0D_returned_at__;
  private static final SubLSymbol $sym21$HTTP_LOG_REQUESTS_TO_FILE;
  private static final SubLString $str22$Unable_to_write_to__S__;
  private static final SubLSymbol $kw23$ERROR;
  private static final SubLSymbol $kw24$OUTPUT;
  private static final SubLSymbol $kw25$APPEND;
  private static final SubLString $str26$GET;
  private static final SubLString $str27$Content_length;
  private static final SubLString $str28$Remote_Host;
  private static final SubLString $str29$unknown;
  private static final SubLSymbol $kw30$UNINITIALIZED;
  private static final SubLString $str31$Unable_to_initialize__A__;
  private static final SubLString $str32$_;
  private static final SubLString $str33$return_mime_type_;
  private static final SubLString $str34$_;
  private static final SubLString $str35$_;
  private static final SubLSymbol $sym36$_;
  private static final SubLString $str37$return_mime_type;
  private static final SubLString $str38$_;
  private static final SubLString $str39$text_html__charset_utf_8;
  private static final SubLString $str40$text_html;
  private static final SubLString $str41$application_xml;
  private static final SubLString $str42$application_json;
  private static final SubLString $str43$Unknown_return_type_for_handler__;
  private static final SubLList $list44;
  private static final SubLString $str45$Content_Type;
  private static final SubLString $str46$POST;
  private static final SubLSymbol $kw47$POST;
  private static final SubLSymbol $kw48$GET;
  private static final SubLSymbol $kw49$KEEP_ALIVE_;
  private static final SubLSymbol $kw50$WIDE_NEWLINES_;
  private static final SubLSymbol $kw51$ACCEPT_TYPES;
  private static final SubLSymbol $kw52$DEFAULT;
  private static final SubLSymbol $kw53$CONTENT_TYPE;
  private static final SubLInteger $int54$80;
  private static final SubLSymbol $kw55$PRIVATE;
  private static final SubLSymbol $kw56$MACHINE;
  private static final SubLSymbol $kw57$PORT;
  private static final SubLSymbol $kw58$METHOD;
  private static final SubLSymbol $kw59$URL;
  private static final SubLSymbol $kw60$QUERY;
  private static final SubLSymbol $kw61$SOAP_ACTION_URI;
  private static final SubLSymbol $sym62$STRINGP;
  private static final SubLList $list63;
  private static final SubLString $str64$Accept;
  private static final SubLList $list65;
  private static final SubLSymbol $kw66$INPUT;
  private static final SubLString $str67$Unable_to_open__S;
  private static final SubLSymbol $kw68$EOF;
  private static final SubLInteger $int69$35;
  private static final SubLInteger $int70$47;
  private static final SubLInteger $int71$49;
  private static final SubLInteger $int72$50;
  private static final SubLInteger $int73$51;
  private static final SubLInteger $int74$52;
  private static final SubLList $list75;
  private static final SubLInteger $int76$404;
  private static final SubLString $str77$File_not_found;
  private static final SubLString $str78$;
  private static final SubLString $str79$user;
  private static final SubLString $str80$project;
  private static final SubLString $str81$_jnlp;
  private static final SubLSymbol $sym82$HTTP_FILE_REQUEST_HEADERS_INT;
  private static final SubLString $str83$Last_Modified;
  private static final SubLList $list84;
  private static final SubLString $str85$Content_Length;
  private static final SubLString $str86$Expires;
  private static final SubLSymbol $sym87$_HTTP_FILE_REQUEST_HEADERS_INT_CACHING_STATE_;
  private static final SubLInteger $int88$200;
  private static final SubLString $str89$image_;
  private static final SubLString $str90$text_;
  private static final SubLString $str91$css;
  private static final SubLString $str92$javascript;
  private static final SubLList $list93;
  private static final SubLList $list94;
  private static final SubLSymbol $kw95$PNG;
  private static final SubLString $str96$image_png;
  private static final SubLSymbol $kw97$JPEG;
  private static final SubLString $str98$image_jpeg;
  private static final SubLSymbol $kw99$GIF;
  private static final SubLString $str100$image_gif;
  private static final SubLSymbol $sym101$QUOTE;
  private static final SubLSymbol $sym102$HTTP_SERVER_BASE_URL;
  private static final SubLString $str103$http___;
  private static final SubLString $str104$_;
  private static final SubLSymbol $sym105$HTTP_SERVER_CGI_BASE_URL;
  private static final SubLSymbol $sym106$HTTP_CGI_REQUEST_CG_ARGS;
  private static final SubLSymbol $kw107$TEST;
  private static final SubLSymbol $kw108$OWNER;
  private static final SubLSymbol $kw109$CLASSES;
  private static final SubLSymbol $kw110$KB;
  private static final SubLSymbol $kw111$TINY;
  private static final SubLSymbol $kw112$WORKING_;
  private static final SubLList $list113;

  @SubLTranslatedFile.SubL(source = "cycl/http-kernel.lisp", position = 2228L)
  public static SubLObject http_server_handler(final SubLObject in_stream, final SubLObject out_stream)
  {
    final boolean wasSubLisp = Main.isSubLisp();
    Main.setSubLisp( true );
    try
    {
      final SubLPackage prevPackage = SubLPackage.getCurrentPackage();
      try
      {
        SubLPackage.setCurrentPackage( "CYC" );
        return http_server_top_level( in_stream, out_stream );
      }
      finally
      {
        SubLPackage.setCurrentPackage( prevPackage );
      }
    }
    finally
    {
      Main.setSubLisp( wasSubLisp );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/http-kernel.lisp", position = 2450L)
  public static SubLObject http_server_top_level(final SubLObject in_stream, final SubLObject out_stream)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject request_id = NIL;
    SubLObject receive_time = NIL;
    if( NIL != $http_request_logging_stream$.getGlobalValue() )
    {
      request_id = next_http_request_id();
      receive_time = numeric_date_utilities.get_universal_millisecond( UNPROVIDED );
      PrintLow.format( $http_request_logging_stream$.getGlobalValue(), $str9$HTTP_Request__6__0D_received_at__, request_id, numeric_date_utilities.timestamp_with_milliseconds( UNPROVIDED, UNPROVIDED ) );
    }
    final SubLObject _prev_bind_0 = Packages.$package$.currentBinding( thread );
    final SubLObject _prev_bind_2 = reader.$read_default_float_format$.currentBinding( thread );
    final SubLObject _prev_bind_3 = print_high.$print_readably$.currentBinding( thread );
    final SubLObject _prev_bind_4 = reader.$read_eval$.currentBinding( thread );
    try
    {
      Packages.$package$.bind( Packages.find_package( $str10$CYC ), thread );
      reader.$read_default_float_format$.bind( $sym11$DOUBLE_FLOAT, thread );
      print_high.$print_readably$.bind( NIL, thread );
      reader.$read_eval$.bind( NIL, thread );
      final SubLObject old_priority = Threads.process_priority( Threads.current_process() );
      try
      {
        Threads.set_process_priority( Threads.current_process(), Threads.$process_normal_priority$.getGlobalValue() );
        thread.resetMultipleValues();
        SubLObject protocol = http_parse_request( in_stream );
        SubLObject content = thread.secondMultipleValue();
        final SubLObject host = thread.thirdMultipleValue();
        final SubLObject method = thread.fourthMultipleValue();
        final SubLObject header_alist = thread.fifthMultipleValue();
        thread.resetMultipleValues();
        if( NIL != $http_request_logging_stream$.getGlobalValue() )
        {
          PrintLow.format( $http_request_logging_stream$.getGlobalValue(), $str12$HTTP_Request__6__0D_content___S__, request_id, content );
        }
        if( protocol == $kw13$FILE && content.equal( $str14$_ ) )
        {
          protocol = $kw15$CGI;
          content = $str16$_cgi_bin_cg_cb_start_redirect;
        }
        try
        {
          final SubLObject pcase_var = protocol;
          if( pcase_var.eql( $kw15$CGI ) )
          {
            http_handle_cgi_request( out_stream, host, content );
          }
          else if( pcase_var.eql( $kw13$FILE ) )
          {
            http_handle_file_request( out_stream, host, content );
          }
          else if( pcase_var.eql( $kw17$WS ) )
          {
            http_handle_ws_request( out_stream, host, content, method, header_alist );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$1 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            SubLObject ignore_errors_tag = NIL;
            try
            {
              thread.throwStack.push( $kw18$IGNORE_ERRORS_TARGET );
              final SubLObject _prev_bind_0_$2 = Errors.$error_handler$.currentBinding( thread );
              try
              {
                Errors.$error_handler$.bind( Symbols.symbol_function( $sym19$IGNORE_ERRORS_HANDLER ), thread );
                try
                {
                  streams_high.force_output( out_stream );
                }
                catch( final Throwable catch_var )
                {
                  Errors.handleThrowable( catch_var, NIL );
                }
              }
              finally
              {
                Errors.$error_handler$.rebind( _prev_bind_0_$2, thread );
              }
            }
            catch( final Throwable ccatch_env_var )
            {
              ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw18$IGNORE_ERRORS_TARGET );
            }
            finally
            {
              thread.throwStack.pop();
            }
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
        final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values2 = Values.getValuesAsVector();
          Threads.set_process_priority( Threads.current_process(), old_priority );
          Values.restoreValuesFromVector( _values2 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$3, thread );
        }
      }
    }
    finally
    {
      reader.$read_eval$.rebind( _prev_bind_4, thread );
      print_high.$print_readably$.rebind( _prev_bind_3, thread );
      reader.$read_default_float_format$.rebind( _prev_bind_2, thread );
      Packages.$package$.rebind( _prev_bind_0, thread );
    }
    if( NIL != $http_request_logging_stream$.getGlobalValue() )
    {
      PrintLow.format( $http_request_logging_stream$.getGlobalValue(), $str20$HTTP_Request__6__0D_returned_at__, new SubLObject[] { request_id, numeric_date_utilities.timestamp_with_milliseconds( UNPROVIDED,
          UNPROVIDED ), Numbers.subtract( numeric_date_utilities.get_universal_millisecond( UNPROVIDED ), receive_time )
      } );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/http-kernel.lisp", position = 3909L)
  public static SubLObject http_port()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return ( system_parameters.$base_tcp_port$.getDynamicValue( thread ).isNumber() && system_parameters.$http_port_offset$.getDynamicValue( thread ).isNumber() ) ? Numbers.add( system_parameters.$base_tcp_port$
        .getDynamicValue( thread ), system_parameters.$http_port_offset$.getDynamicValue( thread ) ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/http-kernel.lisp", position = 4136L)
  public static SubLObject http_log_requests_to_file(final SubLObject filename, SubLObject overwrite)
  {
    if( overwrite == UNPROVIDED )
    {
      overwrite = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == file_utilities.file_valid_for_writing_p( filename ) )
    {
      Errors.warn( $str22$Unable_to_write_to__S__, filename );
      return $kw23$ERROR;
    }
    SubLObject ignore_errors_tag = NIL;
    try
    {
      thread.throwStack.push( $kw18$IGNORE_ERRORS_TARGET );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( Symbols.symbol_function( $sym19$IGNORE_ERRORS_HANDLER ), thread );
        try
        {
          streams_high.force_output( $http_request_logging_stream$.getGlobalValue() );
          if( NIL == streams_high.interactive_stream_p( $http_request_logging_stream$.getGlobalValue() ) )
          {
            streams_high.close( $http_request_logging_stream$.getGlobalValue(), UNPROVIDED );
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
      ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw18$IGNORE_ERRORS_TARGET );
    }
    finally
    {
      thread.throwStack.pop();
    }
    if( NIL != overwrite )
    {
      file_utilities.delete_file_if_exists( filename );
    }
    final SubLObject stream = compatibility.open_text( filename, ( NIL != overwrite ) ? $kw24$OUTPUT : $kw25$APPEND );
    $http_request_logging_stream$.setGlobalValue( stream );
    return filename;
  }

  @SubLTranslatedFile.SubL(source = "cycl/http-kernel.lisp", position = 4698L)
  public static SubLObject http_parse_request(final SubLObject in_stream)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject protocol = NIL;
    SubLObject content = NIL;
    SubLObject host = NIL;
    thread.resetMultipleValues();
    final SubLObject method = web_utilities.http_read_request( in_stream, T );
    final SubLObject url = thread.secondMultipleValue();
    final SubLObject version = thread.thirdMultipleValue();
    final SubLObject header_alist = thread.fourthMultipleValue();
    thread.resetMultipleValues();
    if( NIL == method )
    {
      return NIL;
    }
    host = http_determine_remote_hostname( header_alist, in_stream );
    if( NIL != string_utilities.starts_with( url, $http_cgi_bin_directory$.getGlobalValue() ) )
    {
      protocol = $kw15$CGI;
    }
    else if( NIL != string_utilities.starts_with( url, $http_cyc_ws_directory$.getGlobalValue() ) )
    {
      protocol = $kw17$WS;
    }
    else
    {
      protocol = $kw13$FILE;
    }
    if( method.equal( $str26$GET ) )
    {
      content = url;
    }
    else
    {
      SubLObject content_stream = NIL;
      try
      {
        content_stream = streams_high.make_private_string_output_stream();
        streams_high.write_string( url, content_stream, UNPROVIDED, UNPROVIDED );
        streams_high.write_char( Characters.CHAR_question, content_stream );
        final SubLObject content_length = conses_high.assoc( $str27$Content_length, header_alist, Symbols.symbol_function( EQUALP ), UNPROVIDED ).rest();
        if( NIL != content_length )
        {
          SubLObject cdotimes_end_var;
          SubLObject i;
          for( cdotimes_end_var = reader.parse_integer( content_length, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), i = NIL, i = ZERO_INTEGER; i.numL( cdotimes_end_var ); i = Numbers.add( i, ONE_INTEGER ) )
          {
            streams_high.write_char( streams_high.read_char( in_stream, UNPROVIDED, UNPROVIDED, UNPROVIDED ), content_stream );
          }
        }
        content = streams_high.get_output_stream_string( content_stream );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          streams_high.close( content_stream, UNPROVIDED );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    return Values.values( protocol, content, host, method, header_alist );
  }

  @SubLTranslatedFile.SubL(source = "cycl/http-kernel.lisp", position = 5707L)
  public static SubLObject http_determine_remote_hostname(final SubLObject header_alist, final SubLObject stream)
  {
    final SubLObject provided_host = conses_high.assoc( $str28$Remote_Host, header_alist, Symbols.symbol_function( EQUALP ), UNPROVIDED ).rest();
    if( provided_host.isString() )
    {
      return provided_host;
    }
    final SubLObject remote_hostname = subl_promotions.tcp_stream_remote_hostname( stream );
    if( remote_hostname.isString() )
    {
      return remote_hostname;
    }
    final SubLObject remote_address = subl_promotions.tcp_stream_remote_address( stream );
    if( remote_address.isString() )
    {
      return remote_address;
    }
    return $str29$unknown;
  }

  @SubLTranslatedFile.SubL(source = "cycl/http-kernel.lisp", position = 6237L)
  public static SubLObject get_http_logging_sequence_generator()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( $get_http_logging_sequence_generator$.getDynamicValue( thread ) == $kw30$UNINITIALIZED )
    {
      final SubLObject init_value = integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED );
      if( init_value == $kw30$UNINITIALIZED )
      {
        Errors.error( $str31$Unable_to_initialize__A__, $get_http_logging_sequence_generator$.getDynamicValue( thread ) );
      }
      $get_http_logging_sequence_generator$.setDynamicValue( init_value, thread );
    }
    return $get_http_logging_sequence_generator$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/http-kernel.lisp", position = 6327L)
  public static SubLObject next_http_request_id()
  {
    return integer_sequence_generator.integer_sequence_generator_next( get_http_logging_sequence_generator() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/http-kernel.lisp", position = 6449L)
  public static SubLObject http_handle_cgi_request(final SubLObject out_stream, final SubLObject host, final SubLObject content)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject success = NIL;
    SubLObject ignore_errors_tag = NIL;
    try
    {
      thread.throwStack.push( $kw18$IGNORE_ERRORS_TARGET );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( Symbols.symbol_function( $sym19$IGNORE_ERRORS_HANDLER ), thread );
        try
        {
          SubLObject cg_args = http_cgi_request_cg_args( content, UNPROVIDED );
          if( NIL != html_utilities.html_request_arguments_are_multipart_dataP( cg_args ) )
          {
            final SubLObject contents = html_utilities.html_parse_multipart_form_data( cg_args );
            cg_args = html_utilities.html_construct_message_from_multipart_data( contents );
          }
          final SubLObject html_message = Sequences.cconcatenate( host, new SubLObject[] { $str32$_, cg_args
          } );
          final SubLObject handler_function = html_kernel.handler_function_from_html_message( html_message );
          final SubLObject headers = http_cgi_request_headers( content, handler_function );
          web_utilities.http_send_ok_response( out_stream, headers );
          html_kernel.handle_html_message_to_stream( html_message, out_stream );
          success = T;
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
      ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw18$IGNORE_ERRORS_TARGET );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return success;
  }

  @SubLTranslatedFile.SubL(source = "cycl/http-kernel.lisp", position = 7770L)
  public static SubLObject http_cgi_request_cg_args(final SubLObject content, SubLObject cgi_start)
  {
    if( cgi_start == UNPROVIDED )
    {
      cgi_start = ZERO_INTEGER;
    }
    final SubLObject wsP = string_utilities.starts_with( content, $http_cgi_bin_ws_directory$.getGlobalValue() );
    final SubLObject question_mark_location = Sequences.search( $http_cg_url$.getGlobalValue(), content, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ), ZERO_INTEGER, NIL, cgi_start, NIL );
    if( NIL != wsP )
    {
      SubLObject args_string = string_utilities.substring( content, Sequences.length( $http_cgi_bin_ws_directory$.getGlobalValue() ), UNPROVIDED );
      final SubLObject question_location = Sequences.search( $str34$_, args_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      final SubLObject ampersand_location = Sequences.search( $str32$_, args_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      final SubLObject pipe_location = Sequences.search( $str35$_, args_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      final SubLObject first_separator = list_utilities.extremal( Sequences.remove( NIL, ConsesLow.list( ampersand_location, pipe_location ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), $sym36$_,
          UNPROVIDED );
      if( NIL != question_location && NIL != first_separator && question_location.numL( first_separator ) )
      {
        args_string = string_utilities.replace_substring_once( args_string, $str34$_, $str32$_, cgi_start );
      }
      return args_string;
    }
    if( NIL != subl_promotions.positive_integer_p( question_mark_location ) )
    {
      return string_utilities.substring( content, Numbers.add( Sequences.length( $http_cg_url$.getGlobalValue() ), question_mark_location ), UNPROVIDED );
    }
    return string_utilities.substring( content, number_utilities.f_1X( Sequences.length( $http_cgi_bin_directory$.getGlobalValue() ) ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/http-kernel.lisp", position = 8965L)
  public static SubLObject http_get_content_type_for_cgi_request(final SubLObject raw_content, final SubLObject handler_function)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject content = web_utilities.html_url_decode( raw_content );
    final SubLObject mime_description = Sequences.search( $str37$return_mime_type, content, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject handler_type = html_macros.get_handler_mime_type_property( handler_function );
    if( NIL != mime_description )
    {
      final SubLObject mime_type_start = Numbers.add( SEVENTEEN_INTEGER, mime_description );
      final SubLObject mime_type_end = Sequences.search( $str38$_, content, EQUAL, IDENTITY, ZERO_INTEGER, NIL, mime_type_start, UNPROVIDED );
      final SubLObject mime_type_string = string_utilities.substring( content, mime_type_start, mime_type_end );
      return mime_type_string;
    }
    if( handler_type.eql( html_macros.$html_handler_property$.getGlobalValue() ) && NIL != system_parameters.$permit_utf_8_character_display$.getDynamicValue( thread ) )
    {
      return $str39$text_html__charset_utf_8;
    }
    if( handler_type.eql( html_macros.$html_handler_property$.getGlobalValue() ) )
    {
      return $str40$text_html;
    }
    if( handler_type.eql( html_macros.$xml_handler_property$.getGlobalValue() ) )
    {
      return $str41$application_xml;
    }
    if( handler_type.eql( html_macros.$json_handler_property$.getGlobalValue() ) )
    {
      return $str42$application_json;
    }
    Errors.warn( $str43$Unknown_return_type_for_handler__, handler_function );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/http-kernel.lisp", position = 10404L)
  public static SubLObject http_cgi_request_headers(final SubLObject content, SubLObject handler_function)
  {
    if( handler_function == UNPROVIDED )
    {
      handler_function = NIL;
    }
    final SubLObject mime_type = http_get_content_type_for_cgi_request( content, handler_function );
    return ConsesLow.list( $list44, reader.bq_cons( $str45$Content_Type, mime_type ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/http-kernel.lisp", position = 10657L)
  public static SubLObject http_handle_ws_request(final SubLObject out_stream, final SubLObject host, final SubLObject content, SubLObject method, final SubLObject header_alist)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    method = method.equalp( $str46$POST ) ? $kw47$POST : $kw48$GET;
    final SubLObject proxy_content = string_utilities.substring( content, SEVEN_INTEGER, UNPROVIDED );
    final SubLObject header_plist = http_ws_header_conversion( header_alist );
    SubLObject total = ZERO_INTEGER;
    thread.resetMultipleValues();
    final SubLObject url = possibly_split_full_query_url( proxy_content );
    final SubLObject query = thread.secondMultipleValue();
    thread.resetMultipleValues();
    final SubLObject current;
    final SubLObject datum = current = header_plist;
    final SubLObject keep_aliveP_tail = cdestructuring_bind.property_list_member( $kw49$KEEP_ALIVE_, current );
    final SubLObject keep_aliveP = ( NIL != keep_aliveP_tail ) ? conses_high.cadr( keep_aliveP_tail ) : T;
    final SubLObject wide_newlinesP_tail = cdestructuring_bind.property_list_member( $kw50$WIDE_NEWLINES_, current );
    final SubLObject wide_newlinesP = ( NIL != wide_newlinesP_tail ) ? conses_high.cadr( wide_newlinesP_tail ) : NIL;
    final SubLObject accept_types_tail = cdestructuring_bind.property_list_member( $kw51$ACCEPT_TYPES, current );
    final SubLObject accept_types = ( NIL != accept_types_tail ) ? conses_high.cadr( accept_types_tail ) : $kw52$DEFAULT;
    final SubLObject content_type_tail = cdestructuring_bind.property_list_member( $kw53$CONTENT_TYPE, current );
    final SubLObject content_type = ( NIL != content_type_tail ) ? conses_high.cadr( content_type_tail ) : $kw52$DEFAULT;
    final SubLObject real_port = $http_cyc_ws_port$.getGlobalValue().eql( $kw52$DEFAULT ) ? $int54$80 : $http_cyc_ws_port$.getGlobalValue();
    SubLObject proxy_stream = NIL;
    try
    {
      proxy_stream = subl_promotions.open_tcp_stream_with_timeout( $http_cyc_ws_machine$.getGlobalValue(), real_port, NIL, $kw55$PRIVATE );
      if( NIL != subl_macro_promotions.validate_tcp_connection( proxy_stream, $http_cyc_ws_machine$.getGlobalValue(), real_port ) )
      {
        web_utilities.send_http_request( proxy_stream, ConsesLow.list( new SubLObject[] { $kw56$MACHINE, $http_cyc_ws_machine$.getGlobalValue(), $kw57$PORT, $http_cyc_ws_port$.getGlobalValue(), $kw58$METHOD, method,
          $kw59$URL, url, $kw60$QUERY, query, $kw49$KEEP_ALIVE_, NIL, $kw50$WIDE_NEWLINES_, wide_newlinesP, $kw51$ACCEPT_TYPES, accept_types, $kw53$CONTENT_TYPE, content_type, $kw61$SOAP_ACTION_URI, NIL
        } ) );
        for( SubLObject v_char = streams_high.read_char( proxy_stream, NIL, NIL, UNPROVIDED ); NIL != v_char; v_char = streams_high.read_char( proxy_stream, NIL, NIL, UNPROVIDED ) )
        {
          streams_high.write_char( v_char, out_stream );
          total = Numbers.add( total, ONE_INTEGER );
        }
      }
    }
    finally
    {
      final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        if( NIL != proxy_stream )
        {
          streams_high.close( proxy_stream, UNPROVIDED );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
      }
    }
    SubLObject ignore_errors_tag = NIL;
    try
    {
      thread.throwStack.push( $kw18$IGNORE_ERRORS_TARGET );
      final SubLObject _prev_bind_2 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( Symbols.symbol_function( $sym19$IGNORE_ERRORS_HANDLER ), thread );
        try
        {
          streams_high.force_output( out_stream );
        }
        catch( final Throwable catch_var )
        {
          Errors.handleThrowable( catch_var, NIL );
        }
      }
      finally
      {
        Errors.$error_handler$.rebind( _prev_bind_2, thread );
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw18$IGNORE_ERRORS_TARGET );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return total;
  }

  @SubLTranslatedFile.SubL(source = "cycl/http-kernel.lisp", position = 12157L)
  public static SubLObject possibly_split_full_query_url(final SubLObject full_query_url)
  {
    assert NIL != Types.stringp( full_query_url ) : full_query_url;
    final SubLObject url_end = Sequences.position( Characters.CHAR_question, full_query_url, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject url = full_query_url;
    SubLObject query = NIL;
    if( NIL != url_end )
    {
      url = string_utilities.substring( full_query_url, ZERO_INTEGER, url_end );
      query = string_utilities.substring( full_query_url, number_utilities.f_1X( url_end ), UNPROVIDED );
    }
    return Values.values( url, query );
  }

  @SubLTranslatedFile.SubL(source = "cycl/http-kernel.lisp", position = 12500L)
  public static SubLObject http_ws_header_conversion(final SubLObject header_alist)
  {
    SubLObject result_plist = NIL;
    SubLObject cdolist_list_var = header_alist;
    SubLObject cons = NIL;
    cons = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = cons;
      SubLObject header_key = NIL;
      SubLObject value = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list63 );
      header_key = current.first();
      current = ( value = current.rest() );
      if( header_key.equalp( $str45$Content_Type ) )
      {
        result_plist = conses_high.putf( result_plist, $kw53$CONTENT_TYPE, value );
      }
      else if( header_key.equalp( $str64$Accept ) )
      {
        result_plist = conses_high.putf( result_plist, $kw51$ACCEPT_TYPES, ConsesLow.list( value ) );
      }
      else if( NIL != list_utilities.member_equalpP( header_key, $list65 ) )
      {
      }
      cdolist_list_var = cdolist_list_var.rest();
      cons = cdolist_list_var.first();
    }
    return result_plist;
  }

  @SubLTranslatedFile.SubL(source = "cycl/http-kernel.lisp", position = 13403L)
  public static SubLObject http_handle_file_request(final SubLObject out_stream, final SubLObject host, final SubLObject content)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject whole_filename = http_file_request_filename( content );
    SubLObject success = NIL;
    thread.resetMultipleValues();
    final SubLObject filename = separate_args_from_file_request( whole_filename );
    final SubLObject cyclist = thread.secondMultipleValue();
    final SubLObject project = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    SubLObject ignore_errors_tag = NIL;
    try
    {
      thread.throwStack.push( $kw18$IGNORE_ERRORS_TARGET );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( Symbols.symbol_function( $sym19$IGNORE_ERRORS_HANDLER ), thread );
        try
        {
          if( NIL != Filesys.probe_file( filename ) && NIL == Filesys.directory_p( filename ) )
          {
            final SubLObject headers = http_file_request_headers( filename );
            final SubLObject java_web_start_fileP = java_web_start_file_p( filename );
            web_utilities.http_send_ok_response( out_stream, headers );
            SubLObject stream = NIL;
            try
            {
              final SubLObject _prev_bind_0_$4 = stream_macros.$stream_requires_locking$.currentBinding( thread );
              try
              {
                stream_macros.$stream_requires_locking$.bind( NIL, thread );
                stream = compatibility.open_binary( filename, $kw66$INPUT );
              }
              finally
              {
                stream_macros.$stream_requires_locking$.rebind( _prev_bind_0_$4, thread );
              }
              if( !stream.isStream() )
              {
                Errors.error( $str67$Unable_to_open__S, filename );
              }
              SubLObject content_stream;
              SubLObject v_byte;
              for( content_stream = stream, v_byte = NIL, v_byte = streams_high.read_byte( content_stream, NIL, $kw68$EOF ); $kw68$EOF != v_byte; v_byte = streams_high.read_byte( content_stream, NIL, $kw68$EOF ) )
              {
                if( NIL != java_web_start_fileP && v_byte.eql( $int69$35 ) )
                {
                  v_byte = streams_high.read_byte( content_stream, NIL, $kw68$EOF );
                  if( v_byte.eql( $int70$47 ) )
                  {
                    print_high.princ( Environment.get_machine_name( $str29$unknown ), out_stream );
                    streams_high.write_char( Characters.code_char( $int70$47 ), out_stream );
                  }
                  else if( v_byte.eql( $int71$49 ) )
                  {
                    print_high.princ( Environment.get_machine_name( $str29$unknown ), out_stream );
                  }
                  else if( v_byte.eql( $int72$50 ) )
                  {
                    print_high.princ( system_parameters.$base_tcp_port$.getDynamicValue( thread ), out_stream );
                  }
                  else if( v_byte.eql( $int73$51 ) )
                  {
                    print_high.princ( cyclist, out_stream );
                  }
                  else if( v_byte.eql( $int74$52 ) )
                  {
                    print_high.princ( project, out_stream );
                  }
                  else
                  {
                    streams_high.write_char( Characters.code_char( $int69$35 ), out_stream );
                    streams_high.write_char( Characters.code_char( v_byte ), out_stream );
                  }
                }
                else
                {
                  streams_high.write_char( Characters.code_char( v_byte ), out_stream );
                }
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                if( stream.isStream() )
                {
                  streams_high.close( stream, UNPROVIDED );
                }
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$5, thread );
              }
            }
            success = T;
          }
          else
          {
            final SubLObject headers = $list75;
            web_utilities.http_send_error_response( out_stream, $int76$404, headers );
            final SubLObject _prev_bind_0_$6 = html_macros.$html_stream$.currentBinding( thread );
            try
            {
              html_macros.$html_stream$.bind( out_stream, thread );
              cb_utilities.cb_error( $str77$File_not_found, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
            finally
            {
              html_macros.$html_stream$.rebind( _prev_bind_0_$6, thread );
            }
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
      ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw18$IGNORE_ERRORS_TARGET );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return success;
  }

  @SubLTranslatedFile.SubL(source = "cycl/http-kernel.lisp", position = 15462L)
  public static SubLObject separate_args_from_file_request(final SubLObject filename)
  {
    final SubLObject qm_position = string_utilities.char_position( Characters.CHAR_question, filename, UNPROVIDED );
    if( NIL == qm_position )
    {
      return Values.values( filename, NIL, NIL );
    }
    if( $str78$.equalp( Sequences.subseq( filename, Numbers.add( qm_position, ONE_INTEGER ), UNPROVIDED ) ) )
    {
      return Values.values( Sequences.subseq( filename, ZERO_INTEGER, qm_position ), NIL, NIL );
    }
    final SubLObject just_the_filename = Sequences.subseq( filename, ZERO_INTEGER, qm_position );
    final SubLObject args_string = Sequences.subseq( filename, Numbers.add( qm_position, ONE_INTEGER ), UNPROVIDED );
    final SubLObject args = html_kernel.parse_html_handler_arg_string( args_string, ZERO_INTEGER );
    final SubLObject cyclist_string = html_utilities.html_extract_input( $str79$user, args );
    final SubLObject project_string = html_utilities.html_extract_input( $str80$project, args );
    final SubLObject cyclist = ( NIL != cyclist_string ) ? czer_main.canonicalize_term( reader.read_from_string( web_utilities.html_url_decode( cyclist_string ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED,
        UNPROVIDED ), UNPROVIDED ) : NIL;
    final SubLObject project = ( NIL != project_string ) ? czer_main.canonicalize_term( reader.read_from_string( web_utilities.html_url_decode( project_string ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED,
        UNPROVIDED ), UNPROVIDED ) : NIL;
    return Values.values( just_the_filename, cyclist, project );
  }

  @SubLTranslatedFile.SubL(source = "cycl/http-kernel.lisp", position = 16691L)
  public static SubLObject java_web_start_file_p(final SubLObject filename)
  {
    return string_utilities.ends_with( filename, $str81$_jnlp, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/http-kernel.lisp", position = 16853L)
  public static SubLObject http_file_request_filename(final SubLObject content)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return file_utilities.relative_filename( system_parameters.$http_htdocs_directory$.getDynamicValue( thread ), content, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/http-kernel.lisp", position = 17110L)
  public static SubLObject http_file_request_headers(final SubLObject filename)
  {
    return http_file_request_headers_int( filename, Filesys.file_write_date( filename ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/http-kernel.lisp", position = 17241L)
  public static SubLObject clear_http_file_request_headers_int()
  {
    final SubLObject cs = $http_file_request_headers_int_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/http-kernel.lisp", position = 17241L)
  public static SubLObject remove_http_file_request_headers_int(final SubLObject filename, final SubLObject last_modified_time)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $http_file_request_headers_int_caching_state$.getGlobalValue(), ConsesLow.list( filename, last_modified_time ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/http-kernel.lisp", position = 17241L)
  public static SubLObject http_file_request_headers_int_internal(final SubLObject filename, final SubLObject last_modified_time)
  {
    final SubLObject last_modified_string = web_utilities.http_date_string( last_modified_time );
    SubLObject content_length = file_utilities.get_file_length( filename );
    final SubLObject content_type = http_file_request_content_type( filename );
    final SubLObject expires = ( NIL != last_modified_time ) ? NIL : http_file_request_expires( content_type );
    if( NIL != java_web_start_file_p( filename ) )
    {
      content_length = Numbers.add( content_length, number_utilities.f_1_( Sequences.length( Environment.get_machine_name( $str29$unknown ) ) ) );
    }
    return ConsesLow.listS( reader.bq_cons( $str83$Last_Modified, last_modified_string ), $list84, reader.bq_cons( $str85$Content_Length, content_length ), reader.bq_cons( $str45$Content_Type, content_type ), ConsesLow
        .append( ( NIL != expires ) ? ConsesLow.list( reader.bq_cons( $str86$Expires, expires ) ) : NIL, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/http-kernel.lisp", position = 17241L)
  public static SubLObject http_file_request_headers_int(final SubLObject filename, final SubLObject last_modified_time)
  {
    SubLObject caching_state = $http_file_request_headers_int_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym82$HTTP_FILE_REQUEST_HEADERS_INT, $sym87$_HTTP_FILE_REQUEST_HEADERS_INT_CACHING_STATE_, $int88$200, EQUAL, TWO_INTEGER, ZERO_INTEGER );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( filename, last_modified_time );
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
        if( filename.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && last_modified_time.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( http_file_request_headers_int_internal( filename, last_modified_time ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( filename, last_modified_time ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/http-kernel.lisp", position = 18382L)
  public static SubLObject http_file_request_expires(final SubLObject content_type)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != string_utilities.starts_with( content_type, $str89$image_ ) )
    {
      return web_utilities.http_date_string( numeric_date_utilities.universal_time_for_start_of_universal_date( numeric_date_utilities.encode_universal_date( ONE_INTEGER, ONE_INTEGER, Numbers.add( TWO_INTEGER,
          numeric_date_utilities.this_year() ) ), UNPROVIDED ) );
    }
    if( NIL != $allow_css_js_expires_headers$.getDynamicValue( thread ) && NIL != string_utilities.starts_with( content_type, $str90$text_ ) && ( NIL != string_utilities.ends_with( content_type, $str91$css, UNPROVIDED )
        || NIL != string_utilities.ends_with( content_type, $str92$javascript, UNPROVIDED ) ) )
    {
      return web_utilities.http_date_string( numeric_date_utilities.universal_time_for_start_of_universal_date( numeric_date_utilities.universal_date_add_days( numeric_date_utilities.today(), THREE_INTEGER ),
          UNPROVIDED ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/http-kernel.lisp", position = 19935L)
  public static SubLObject http_file_request_content_type(final SubLObject filename)
  {
    SubLObject cdolist_list_var = $http_content_type_file_extension_table$.getGlobalValue();
    SubLObject file_extention_info = NIL;
    file_extention_info = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = file_extention_info;
      SubLObject content_type = NIL;
      SubLObject extensions = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list94 );
      content_type = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list94 );
      extensions = current.first();
      current = current.rest();
      if( NIL == current )
      {
        SubLObject cdolist_list_var_$7 = extensions;
        SubLObject extension = NIL;
        extension = cdolist_list_var_$7.first();
        while ( NIL != cdolist_list_var_$7)
        {
          if( NIL != string_utilities.ends_with( filename, extension, Symbols.symbol_function( EQUALP ) ) )
          {
            return content_type;
          }
          cdolist_list_var_$7 = cdolist_list_var_$7.rest();
          extension = cdolist_list_var_$7.first();
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list94 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      file_extention_info = cdolist_list_var.first();
    }
    return $http_content_type_file_extension_table$.getGlobalValue().first().first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/http-kernel.lisp", position = 20342L)
  public static SubLObject html_determine_mime_type(final SubLObject filename, SubLObject type)
  {
    if( type == UNPROVIDED )
    {
      type = NIL;
    }
    final SubLObject pcase_var = type;
    if( pcase_var.eql( $kw95$PNG ) )
    {
      return $str96$image_png;
    }
    if( pcase_var.eql( $kw97$JPEG ) )
    {
      return $str98$image_jpeg;
    }
    if( pcase_var.eql( $kw99$GIF ) )
    {
      return $str100$image_gif;
    }
    if( pcase_var.eql( $sym101$QUOTE ) || pcase_var.eql( NIL ) )
    {
      return http_file_request_content_type( filename );
    }
    return html_determine_mime_type( filename, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/http-kernel.lisp", position = 20679L)
  public static SubLObject http_server_base_url(SubLObject start_http_server_if_noneP)
  {
    if( start_http_server_if_noneP == UNPROVIDED )
    {
      start_http_server_if_noneP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject port = NIL;
    if( NIL == port )
    {
      SubLObject csome_list_var = tcp_server_utilities.all_tcp_servers();
      SubLObject tcp_server = NIL;
      tcp_server = csome_list_var.first();
      while ( NIL == port && NIL != csome_list_var)
      {
        if( $kw6$HTTP == tcp_server_utilities.tcp_server_type( tcp_server ) )
        {
          port = tcp_server_utilities.tcp_server_port( tcp_server );
        }
        csome_list_var = csome_list_var.rest();
        tcp_server = csome_list_var.first();
      }
    }
    if( NIL == port && NIL != start_http_server_if_noneP )
    {
      port = http_port();
      final SubLObject tcp_server2 = tcp_server_utilities.enable_tcp_server( $kw6$HTTP, port );
      if( NIL == Threads.valid_process_p( tcp_server_utilities.tcp_server_process( tcp_server2 ) ) )
      {
        port = NIL;
      }
    }
    final SubLObject forwarding_machine = cb_uia_forwarding.get_forwarding_machine_name();
    final SubLObject forwarding_port = Numbers.add( cb_uia_forwarding.get_forwarding_base_port(), system_parameters.$http_port_offset$.getDynamicValue( thread ) );
    return Sequences.cconcatenate( $str103$http___, new SubLObject[] { format_nil.format_nil_a_no_copy( forwarding_machine ), format_nil.format_nil_a_no_copy( ( NIL != port ) ? Sequences.cconcatenate( $str104$_,
        format_nil.format_nil_a_no_copy( forwarding_port ) ) : $str78$ ), $str14$_
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/http-kernel.lisp", position = 22052L)
  public static SubLObject http_server_cgi_base_url()
  {
    final SubLObject base_url = http_server_base_url( UNPROVIDED );
    if( NIL != base_url )
    {
      return Sequences.cconcatenate( format_nil.format_nil_a_no_copy( base_url ), new SubLObject[] { format_nil.format_nil_a_no_copy( string_utilities.substring( $http_cgi_bin_directory$.getGlobalValue(), ONE_INTEGER,
          UNPROVIDED ) ), $str14$_
      } );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/http-kernel.lisp", position = 22375L)
  public static SubLObject get_absolute_url(final SubLObject url, SubLObject start_http_server_if_noneP)
  {
    if( start_http_server_if_noneP == UNPROVIDED )
    {
      start_http_server_if_noneP = NIL;
    }
    final SubLObject base_url = http_server_base_url( start_http_server_if_noneP );
    return web_utilities.absolute_url_from_relative_url_and_base( url, base_url );
  }

  public static SubLObject declare_http_kernel_file()
  {
    SubLFiles.declareFunction( me, "http_server_handler", "HTTP-SERVER-HANDLER", 2, 0, false );
    SubLFiles.declareFunction( me, "http_server_top_level", "HTTP-SERVER-TOP-LEVEL", 2, 0, false );
    SubLFiles.declareFunction( me, "http_port", "HTTP-PORT", 0, 0, false );
    SubLFiles.declareFunction( me, "http_log_requests_to_file", "HTTP-LOG-REQUESTS-TO-FILE", 1, 1, false );
    SubLFiles.declareFunction( me, "http_parse_request", "HTTP-PARSE-REQUEST", 1, 0, false );
    SubLFiles.declareFunction( me, "http_determine_remote_hostname", "HTTP-DETERMINE-REMOTE-HOSTNAME", 2, 0, false );
    SubLFiles.declareFunction( me, "get_http_logging_sequence_generator", "GET-HTTP-LOGGING-SEQUENCE-GENERATOR", 0, 0, false );
    SubLFiles.declareFunction( me, "next_http_request_id", "NEXT-HTTP-REQUEST-ID", 0, 0, false );
    SubLFiles.declareFunction( me, "http_handle_cgi_request", "HTTP-HANDLE-CGI-REQUEST", 3, 0, false );
    SubLFiles.declareFunction( me, "http_cgi_request_cg_args", "HTTP-CGI-REQUEST-CG-ARGS", 1, 1, false );
    SubLFiles.declareFunction( me, "http_get_content_type_for_cgi_request", "HTTP-GET-CONTENT-TYPE-FOR-CGI-REQUEST", 2, 0, false );
    SubLFiles.declareFunction( me, "http_cgi_request_headers", "HTTP-CGI-REQUEST-HEADERS", 1, 1, false );
    SubLFiles.declareFunction( me, "http_handle_ws_request", "HTTP-HANDLE-WS-REQUEST", 5, 0, false );
    SubLFiles.declareFunction( me, "possibly_split_full_query_url", "POSSIBLY-SPLIT-FULL-QUERY-URL", 1, 0, false );
    SubLFiles.declareFunction( me, "http_ws_header_conversion", "HTTP-WS-HEADER-CONVERSION", 1, 0, false );
    SubLFiles.declareFunction( me, "http_handle_file_request", "HTTP-HANDLE-FILE-REQUEST", 3, 0, false );
    SubLFiles.declareFunction( me, "separate_args_from_file_request", "SEPARATE-ARGS-FROM-FILE-REQUEST", 1, 0, false );
    SubLFiles.declareFunction( me, "java_web_start_file_p", "JAVA-WEB-START-FILE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "http_file_request_filename", "HTTP-FILE-REQUEST-FILENAME", 1, 0, false );
    SubLFiles.declareFunction( me, "http_file_request_headers", "HTTP-FILE-REQUEST-HEADERS", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_http_file_request_headers_int", "CLEAR-HTTP-FILE-REQUEST-HEADERS-INT", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_http_file_request_headers_int", "REMOVE-HTTP-FILE-REQUEST-HEADERS-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "http_file_request_headers_int_internal", "HTTP-FILE-REQUEST-HEADERS-INT-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "http_file_request_headers_int", "HTTP-FILE-REQUEST-HEADERS-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "http_file_request_expires", "HTTP-FILE-REQUEST-EXPIRES", 1, 0, false );
    SubLFiles.declareFunction( me, "http_file_request_content_type", "HTTP-FILE-REQUEST-CONTENT-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "html_determine_mime_type", "HTML-DETERMINE-MIME-TYPE", 1, 1, false );
    SubLFiles.declareFunction( me, "http_server_base_url", "HTTP-SERVER-BASE-URL", 0, 1, false );
    SubLFiles.declareFunction( me, "http_server_cgi_base_url", "HTTP-SERVER-CGI-BASE-URL", 0, 0, false );
    SubLFiles.declareFunction( me, "get_absolute_url", "GET-ABSOLUTE-URL", 1, 1, false );
    return NIL;
  }

  public static SubLObject init_http_kernel_file()
  {
    $http_cgi_bin_directory$ = SubLFiles.deflexical( "*HTTP-CGI-BIN-DIRECTORY*", $str0$_cgi_bin );
    $http_cg_url$ = SubLFiles.deflexical( "*HTTP-CG-URL*", $str1$_cg_ );
    $http_cgi_bin_ws_directory$ = SubLFiles.deflexical( "*HTTP-CGI-BIN-WS-DIRECTORY*", $str2$_cgi_bin_ws_ );
    $http_cyc_ws_directory$ = SubLFiles.deflexical( "*HTTP-CYC-WS-DIRECTORY*", $str3$_cyc_ws );
    $http_cyc_ws_machine$ = SubLFiles.deflexical( "*HTTP-CYC-WS-MACHINE*", ( maybeDefault( $sym4$_HTTP_CYC_WS_MACHINE_, $http_cyc_ws_machine$, NIL ) ) );
    $http_cyc_ws_port$ = SubLFiles.deflexical( "*HTTP-CYC-WS-PORT*", ( maybeDefault( $sym5$_HTTP_CYC_WS_PORT_, $http_cyc_ws_port$, NIL ) ) );
    $http_request_logging_stream$ = SubLFiles.deflexical( "*HTTP-REQUEST-LOGGING-STREAM*", NIL );
    $get_http_logging_sequence_generator$ = SubLFiles.defparameter( "*GET-HTTP-LOGGING-SEQUENCE-GENERATOR*", $kw30$UNINITIALIZED );
    $http_return_mime_type_prefix$ = SubLFiles.defconstant( "*HTTP-RETURN-MIME-TYPE-PREFIX*", $str33$return_mime_type_ );
    $http_file_request_headers_int_caching_state$ = SubLFiles.deflexical( "*HTTP-FILE-REQUEST-HEADERS-INT-CACHING-STATE*", NIL );
    $allow_css_js_expires_headers$ = SubLFiles.defvar( "*ALLOW-CSS-JS-EXPIRES-HEADERS*", T );
    $http_content_type_file_extension_table$ = SubLFiles.deflexical( "*HTTP-CONTENT-TYPE-FILE-EXTENSION-TABLE*", $list93 );
    return NIL;
  }

  public static SubLObject setup_http_kernel_file()
  {
    subl_macro_promotions.declare_defglobal( $sym4$_HTTP_CYC_WS_MACHINE_ );
    subl_macro_promotions.declare_defglobal( $sym5$_HTTP_CYC_WS_PORT_ );
    tcp_server_utilities.register_tcp_server_type( $kw6$HTTP, $sym7$HTTP_SERVER_HANDLER, $kw8$TEXT );
    access_macros.register_external_symbol( $sym21$HTTP_LOG_REQUESTS_TO_FILE );
    memoization_state.note_globally_cached_function( $sym82$HTTP_FILE_REQUEST_HEADERS_INT );
    access_macros.register_external_symbol( $sym102$HTTP_SERVER_BASE_URL );
    access_macros.register_external_symbol( $sym105$HTTP_SERVER_CGI_BASE_URL );
    generic_testing.define_test_case_table_int( $sym106$HTTP_CGI_REQUEST_CG_ARGS, ConsesLow.list( new SubLObject[] { $kw107$TEST, EQUAL, $kw108$OWNER, NIL, $kw109$CLASSES, NIL, $kw110$KB, $kw111$TINY, $kw112$WORKING_, T
    } ), $list113 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_http_kernel_file();
  }

  @Override
  public void initializeVariables()
  {
    init_http_kernel_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_http_kernel_file();
  }
  static
  {
    me = new http_kernel();
    $http_cgi_bin_directory$ = null;
    $http_cg_url$ = null;
    $http_cgi_bin_ws_directory$ = null;
    $http_cyc_ws_directory$ = null;
    $http_cyc_ws_machine$ = null;
    $http_cyc_ws_port$ = null;
    $http_request_logging_stream$ = null;
    $get_http_logging_sequence_generator$ = null;
    $http_return_mime_type_prefix$ = null;
    $http_file_request_headers_int_caching_state$ = null;
    $allow_css_js_expires_headers$ = null;
    $http_content_type_file_extension_table$ = null;
    $str0$_cgi_bin = makeString( "/cgi-bin" );
    $str1$_cg_ = makeString( "/cg?" );
    $str2$_cgi_bin_ws_ = makeString( "/cgi-bin/ws/" );
    $str3$_cyc_ws = makeString( "/cyc-ws" );
    $sym4$_HTTP_CYC_WS_MACHINE_ = makeSymbol( "*HTTP-CYC-WS-MACHINE*" );
    $sym5$_HTTP_CYC_WS_PORT_ = makeSymbol( "*HTTP-CYC-WS-PORT*" );
    $kw6$HTTP = makeKeyword( "HTTP" );
    $sym7$HTTP_SERVER_HANDLER = makeSymbol( "HTTP-SERVER-HANDLER" );
    $kw8$TEXT = makeKeyword( "TEXT" );
    $str9$HTTP_Request__6__0D_received_at__ = makeString( "HTTP Request ~6,'0D received at ~A~%" );
    $str10$CYC = makeString( "CYC" );
    $sym11$DOUBLE_FLOAT = makeSymbol( "DOUBLE-FLOAT" );
    $str12$HTTP_Request__6__0D_content___S__ = makeString( "HTTP Request ~6,'0D content: ~S~%" );
    $kw13$FILE = makeKeyword( "FILE" );
    $str14$_ = makeString( "/" );
    $kw15$CGI = makeKeyword( "CGI" );
    $str16$_cgi_bin_cg_cb_start_redirect = makeString( "/cgi-bin/cg?cb-start-redirect" );
    $kw17$WS = makeKeyword( "WS" );
    $kw18$IGNORE_ERRORS_TARGET = makeKeyword( "IGNORE-ERRORS-TARGET" );
    $sym19$IGNORE_ERRORS_HANDLER = makeSymbol( "IGNORE-ERRORS-HANDLER", "SUBLISP" );
    $str20$HTTP_Request__6__0D_returned_at__ = makeString( "HTTP Request ~6,'0D returned at ~A (~Ams)~%" );
    $sym21$HTTP_LOG_REQUESTS_TO_FILE = makeSymbol( "HTTP-LOG-REQUESTS-TO-FILE" );
    $str22$Unable_to_write_to__S__ = makeString( "Unable to write to ~S~%" );
    $kw23$ERROR = makeKeyword( "ERROR" );
    $kw24$OUTPUT = makeKeyword( "OUTPUT" );
    $kw25$APPEND = makeKeyword( "APPEND" );
    $str26$GET = makeString( "GET" );
    $str27$Content_length = makeString( "Content-length" );
    $str28$Remote_Host = makeString( "Remote-Host" );
    $str29$unknown = makeString( "unknown" );
    $kw30$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $str31$Unable_to_initialize__A__ = makeString( "Unable to initialize ~A~%" );
    $str32$_ = makeString( "&" );
    $str33$return_mime_type_ = makeString( "return-mime-type:" );
    $str34$_ = makeString( "?" );
    $str35$_ = makeString( "|" );
    $sym36$_ = makeSymbol( "<" );
    $str37$return_mime_type = makeString( "return-mime-type" );
    $str38$_ = makeString( "=" );
    $str39$text_html__charset_utf_8 = makeString( "text/html; charset=utf-8" );
    $str40$text_html = makeString( "text/html" );
    $str41$application_xml = makeString( "application/xml" );
    $str42$application_json = makeString( "application/json" );
    $str43$Unknown_return_type_for_handler__ = makeString( "Unknown return-type for handler ~A.  Assuming 'text/html'" );
    $list44 = ConsesLow.cons( makeString( "Connection" ), makeString( "close" ) );
    $str45$Content_Type = makeString( "Content-Type" );
    $str46$POST = makeString( "POST" );
    $kw47$POST = makeKeyword( "POST" );
    $kw48$GET = makeKeyword( "GET" );
    $kw49$KEEP_ALIVE_ = makeKeyword( "KEEP-ALIVE?" );
    $kw50$WIDE_NEWLINES_ = makeKeyword( "WIDE-NEWLINES?" );
    $kw51$ACCEPT_TYPES = makeKeyword( "ACCEPT-TYPES" );
    $kw52$DEFAULT = makeKeyword( "DEFAULT" );
    $kw53$CONTENT_TYPE = makeKeyword( "CONTENT-TYPE" );
    $int54$80 = makeInteger( 80 );
    $kw55$PRIVATE = makeKeyword( "PRIVATE" );
    $kw56$MACHINE = makeKeyword( "MACHINE" );
    $kw57$PORT = makeKeyword( "PORT" );
    $kw58$METHOD = makeKeyword( "METHOD" );
    $kw59$URL = makeKeyword( "URL" );
    $kw60$QUERY = makeKeyword( "QUERY" );
    $kw61$SOAP_ACTION_URI = makeKeyword( "SOAP-ACTION-URI" );
    $sym62$STRINGP = makeSymbol( "STRINGP" );
    $list63 = ConsesLow.cons( makeSymbol( "HEADER-KEY" ), makeSymbol( "VALUE" ) );
    $str64$Accept = makeString( "Accept" );
    $list65 = ConsesLow.list( new SubLObject[] { makeString( "User-Agent" ), makeString( "Host" ), makeString( "Content-Length" ), makeString( "Connection" ), makeString( "Keep-Alive" ), makeString( "Referer" ),
      makeString( "Accept-Charset" ), makeString( "Accept-Encoding" ), makeString( "Accept-Language" ), makeString( "Cache-Control" ), makeString( "Pragma" )
    } );
    $kw66$INPUT = makeKeyword( "INPUT" );
    $str67$Unable_to_open__S = makeString( "Unable to open ~S" );
    $kw68$EOF = makeKeyword( "EOF" );
    $int69$35 = makeInteger( 35 );
    $int70$47 = makeInteger( 47 );
    $int71$49 = makeInteger( 49 );
    $int72$50 = makeInteger( 50 );
    $int73$51 = makeInteger( 51 );
    $int74$52 = makeInteger( 52 );
    $list75 = ConsesLow.list( ConsesLow.cons( makeString( "Connection" ), makeString( "close" ) ) );
    $int76$404 = makeInteger( 404 );
    $str77$File_not_found = makeString( "File not found" );
    $str78$ = makeString( "" );
    $str79$user = makeString( "user" );
    $str80$project = makeString( "project" );
    $str81$_jnlp = makeString( ".jnlp" );
    $sym82$HTTP_FILE_REQUEST_HEADERS_INT = makeSymbol( "HTTP-FILE-REQUEST-HEADERS-INT" );
    $str83$Last_Modified = makeString( "Last-Modified" );
    $list84 = ConsesLow.cons( makeString( "Accept-Ranges" ), makeString( "bytes" ) );
    $str85$Content_Length = makeString( "Content-Length" );
    $str86$Expires = makeString( "Expires" );
    $sym87$_HTTP_FILE_REQUEST_HEADERS_INT_CACHING_STATE_ = makeSymbol( "*HTTP-FILE-REQUEST-HEADERS-INT-CACHING-STATE*" );
    $int88$200 = makeInteger( 200 );
    $str89$image_ = makeString( "image/" );
    $str90$text_ = makeString( "text/" );
    $str91$css = makeString( "css" );
    $str92$javascript = makeString( "javascript" );
    $list93 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeString( "text/html" ), ConsesLow.list( makeString( "html" ), makeString( "htm" ), makeString( "shtml" ) ) ), ConsesLow.list( makeString(
        "text/plain" ), ConsesLow.list( makeString( "txt" ), makeString( "text" ) ) ), ConsesLow.list( makeString( "image/gif" ), ConsesLow.list( makeString( "gif" ) ) ), ConsesLow.list( makeString( "image/jpeg" ),
            ConsesLow.list( makeString( "jpeg" ), makeString( "jpg" ), makeString( "jpe" ), makeString( "jfif" ), makeString( "pjpeg" ), makeString( "pjp" ) ) ), ConsesLow.list( makeString( "image/png" ), ConsesLow.list(
                makeString( "png" ) ) ), ConsesLow.list( makeString( "application/x-java-jnlp-file" ), ConsesLow.list( makeString( "jnlp" ) ) ), ConsesLow.list( makeString( "text/css" ), ConsesLow.list( makeString(
                    "css" ) ) ), ConsesLow.list( makeString( "text/javascript" ), ConsesLow.list( makeString( "js" ) ) ), ConsesLow.list( makeString( "application/json" ), ConsesLow.list( makeString( "json" ) ) ),
      ConsesLow.list( makeString( "text/xml" ), ConsesLow.list( makeString( "xml" ), makeString( "xsl" ) ) ), ConsesLow.list( makeString( "audio/ogg" ), ConsesLow.list( makeString( "ogg" ) ) )
    } );
    $list94 = ConsesLow.list( makeSymbol( "CONTENT-TYPE" ), makeSymbol( "EXTENSIONS" ) );
    $kw95$PNG = makeKeyword( "PNG" );
    $str96$image_png = makeString( "image/png" );
    $kw97$JPEG = makeKeyword( "JPEG" );
    $str98$image_jpeg = makeString( "image/jpeg" );
    $kw99$GIF = makeKeyword( "GIF" );
    $str100$image_gif = makeString( "image/gif" );
    $sym101$QUOTE = makeSymbol( "QUOTE" );
    $sym102$HTTP_SERVER_BASE_URL = makeSymbol( "HTTP-SERVER-BASE-URL" );
    $str103$http___ = makeString( "http://" );
    $str104$_ = makeString( ":" );
    $sym105$HTTP_SERVER_CGI_BASE_URL = makeSymbol( "HTTP-SERVER-CGI-BASE-URL" );
    $sym106$HTTP_CGI_REQUEST_CG_ARGS = makeSymbol( "HTTP-CGI-REQUEST-CG-ARGS" );
    $kw107$TEST = makeKeyword( "TEST" );
    $kw108$OWNER = makeKeyword( "OWNER" );
    $kw109$CLASSES = makeKeyword( "CLASSES" );
    $kw110$KB = makeKeyword( "KB" );
    $kw111$TINY = makeKeyword( "TINY" );
    $kw112$WORKING_ = makeKeyword( "WORKING?" );
    $list113 = ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString(
        "/cgi-bin/ws/xml-term-learner-create-new?termString0=hissentient&url=http%3A%2F%2Flocalhost%3A3742%2Fcgi-bin%2Fcg%3Fcb-content-frame%26c3096&title=GAF index for #$CityOfChristchurchNZ&argpos=(1)" ) ), makeString(
            "xml-term-learner-create-new&termString0=hissentient&url=http%3A%2F%2Flocalhost%3A3742%2Fcgi-bin%2Fcg%3Fcb-content-frame%26c3096&title=GAF index for #$CityOfChristchurchNZ&argpos=(1)" ) ), ConsesLow.list(
                ConsesLow.list( makeString( "/cgi-bin/ws/xml-term-learner-get-followups-for-term&max=1&questionsOnly=true&conceptId=Mx4rvVixTpwpEbGdrcN5Y29ycA" ) ), makeString(
                    "xml-term-learner-get-followups-for-term&max=1&questionsOnly=true&conceptId=Mx4rvVixTpwpEbGdrcN5Y29ycA" ) ), ConsesLow.list( ConsesLow.list( makeString( "/cgi-bin/cg?cb-content-frame&c3096" ) ),
                        makeString( "cb-content-frame&c3096" ) ) );
  }
}
/*
 * 
 * Total time: 389 ms
 * 
 */
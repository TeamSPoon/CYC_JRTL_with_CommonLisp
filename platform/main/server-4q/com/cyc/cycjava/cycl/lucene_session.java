package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class lucene_session
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.lucene_session";
  public static final String myFingerPrint = "3d36982e45e90cbe7d683ca604566487cacc050968fe337f139846280f162bc6";
  @SubLTranslatedFile.SubL(source = "cycl/lucene-session.lisp", position = 1708L)
  public static SubLSymbol $lucene_host$;
  @SubLTranslatedFile.SubL(source = "cycl/lucene-session.lisp", position = 1778L)
  public static SubLSymbol $lucene_port$;
  @SubLTranslatedFile.SubL(source = "cycl/lucene-session.lisp", position = 1812L)
  private static SubLSymbol $lucene_host_override$;
  @SubLTranslatedFile.SubL(source = "cycl/lucene-session.lisp", position = 1956L)
  private static SubLSymbol $lucene_port_override$;
  @SubLTranslatedFile.SubL(source = "cycl/lucene-session.lisp", position = 2734L)
  private static SubLSymbol $init_lucene_session$;
  @SubLTranslatedFile.SubL(source = "cycl/lucene-session.lisp", position = 2803L)
  private static SubLSymbol $add_document$;
  @SubLTranslatedFile.SubL(source = "cycl/lucene-session.lisp", position = 2841L)
  private static SubLSymbol $query$;
  @SubLTranslatedFile.SubL(source = "cycl/lucene-session.lisp", position = 2872L)
  private static SubLSymbol $optimize$;
  @SubLTranslatedFile.SubL(source = "cycl/lucene-session.lisp", position = 2906L)
  private static SubLSymbol $close_index$;
  @SubLTranslatedFile.SubL(source = "cycl/lucene-session.lisp", position = 2943L)
  private static SubLSymbol $new_index_writer$;
  @SubLTranslatedFile.SubL(source = "cycl/lucene-session.lisp", position = 2985L)
  public static SubLSymbol $dtp_lucene_session$;
  private static final SubLString $str0$semanticsearch;
  private static final SubLInteger $int1$1928;
  private static final SubLList $list2;
  private static final SubLSymbol $sym3$CLET;
  private static final SubLSymbol $sym4$CUNWIND_PROTECT;
  private static final SubLSymbol $sym5$PROGN;
  private static final SubLSymbol $sym6$CSETQ;
  private static final SubLSymbol $sym7$NEW_LUCENE_SESSION;
  private static final SubLSymbol $sym8$PWHEN;
  private static final SubLSymbol $sym9$LUCENE_SESSION_P;
  private static final SubLSymbol $sym10$LUCENE_FINALIZE;
  private static final SubLSymbol $sym11$LUCENE_SESSION;
  private static final SubLList $list12;
  private static final SubLList $list13;
  private static final SubLList $list14;
  private static final SubLList $list15;
  private static final SubLSymbol $sym16$LUCENE_PRINT;
  private static final SubLSymbol $sym17$LUCENE_SESSION_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list18;
  private static final SubLSymbol $sym19$LUCENE_HOST;
  private static final SubLSymbol $sym20$_CSETF_LUCENE_HOST;
  private static final SubLSymbol $sym21$LUCENE_PORT;
  private static final SubLSymbol $sym22$_CSETF_LUCENE_PORT;
  private static final SubLSymbol $sym23$LUCENE_CONNECTION;
  private static final SubLSymbol $sym24$_CSETF_LUCENE_CONNECTION;
  private static final SubLSymbol $sym25$LUCENE_SESSION_TYPE;
  private static final SubLSymbol $sym26$_CSETF_LUCENE_SESSION_TYPE;
  private static final SubLSymbol $sym27$LUCENE_INDEX;
  private static final SubLSymbol $sym28$_CSETF_LUCENE_INDEX;
  private static final SubLSymbol $sym29$LUCENE_OVERWRITE;
  private static final SubLSymbol $sym30$_CSETF_LUCENE_OVERWRITE;
  private static final SubLSymbol $kw31$HOST;
  private static final SubLSymbol $kw32$PORT;
  private static final SubLSymbol $kw33$CONNECTION;
  private static final SubLSymbol $kw34$SESSION_TYPE;
  private static final SubLSymbol $kw35$INDEX;
  private static final SubLSymbol $kw36$OVERWRITE;
  private static final SubLString $str37$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw38$BEGIN;
  private static final SubLSymbol $sym39$MAKE_LUCENE_SESSION;
  private static final SubLSymbol $kw40$SLOT;
  private static final SubLSymbol $kw41$END;
  private static final SubLSymbol $sym42$VISIT_DEFSTRUCT_OBJECT_LUCENE_SESSION_METHOD;
  private static final SubLSymbol $sym43$STRINGP;
  private static final SubLSymbol $sym44$POSITIVE_INTEGER_P;
  private static final SubLSymbol $sym45$KEYWORDP;
  private static final SubLSymbol $sym46$BOOLEANP;
  private static final SubLSymbol $kw47$CYC;
  private static final SubLSymbol $kw48$TEXT;
  private static final SubLSymbol $kw49$PRIVATE;
  private static final SubLString $str50$__LUCENE_SESSION_;
  private static final SubLString $str51$_;
  private static final SubLString $str52$_;
  private static final SubLFloat $float53$1_0;
  private static final SubLSymbol $sym54$POSITIVE_NUMBER_P;
  private static final SubLInteger $int55$50;
  private static final SubLSymbol $sym56$NON_NEGATIVE_INTEGER_P;

  @SubLTranslatedFile.SubL(source = "cycl/lucene-session.lisp", position = 2100L)
  public static SubLObject get_lucene_host()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return ( NIL != $lucene_host_override$.getDynamicValue( thread ) ) ? $lucene_host_override$.getDynamicValue( thread ) : $lucene_host$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lucene-session.lisp", position = 2195L)
  public static SubLObject get_lucene_port()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return ( NIL != $lucene_port_override$.getDynamicValue( thread ) ) ? $lucene_port_override$.getDynamicValue( thread ) : $lucene_port$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lucene-session.lisp", position = 2290L)
  public static SubLObject with_lucene_session(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list2 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject session = NIL;
    SubLObject index = NIL;
    SubLObject type = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list2 );
    session = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list2 );
    index = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list2 );
    type = current.first();
    current = current.rest();
    final SubLObject host = current.isCons() ? current.first() : get_lucene_host();
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list2 );
    current = current.rest();
    final SubLObject port = current.isCons() ? current.first() : get_lucene_port();
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list2 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.list( $sym3$CLET, ConsesLow.list( session ), ConsesLow.list( $sym4$CUNWIND_PROTECT, ConsesLow.listS( $sym5$PROGN, ConsesLow.list( $sym6$CSETQ, session, ConsesLow.list( $sym7$NEW_LUCENE_SESSION,
          host, port, index, type ) ), ConsesLow.append( body, NIL ) ), ConsesLow.list( $sym8$PWHEN, ConsesLow.list( $sym9$LUCENE_SESSION_P, session ), ConsesLow.list( $sym10$LUCENE_FINALIZE, session ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list2 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lucene-session.lisp", position = 2985L)
  public static SubLObject lucene_session_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    lucene_print( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lucene-session.lisp", position = 2985L)
  public static SubLObject lucene_session_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $lucene_session_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lucene-session.lisp", position = 2985L)
  public static SubLObject lucene_host(final SubLObject v_object)
  {
    assert NIL != lucene_session_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lucene-session.lisp", position = 2985L)
  public static SubLObject lucene_port(final SubLObject v_object)
  {
    assert NIL != lucene_session_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lucene-session.lisp", position = 2985L)
  public static SubLObject lucene_connection(final SubLObject v_object)
  {
    assert NIL != lucene_session_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lucene-session.lisp", position = 2985L)
  public static SubLObject lucene_session_type(final SubLObject v_object)
  {
    assert NIL != lucene_session_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lucene-session.lisp", position = 2985L)
  public static SubLObject lucene_index(final SubLObject v_object)
  {
    assert NIL != lucene_session_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lucene-session.lisp", position = 2985L)
  public static SubLObject lucene_overwrite(final SubLObject v_object)
  {
    assert NIL != lucene_session_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lucene-session.lisp", position = 2985L)
  public static SubLObject _csetf_lucene_host(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != lucene_session_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lucene-session.lisp", position = 2985L)
  public static SubLObject _csetf_lucene_port(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != lucene_session_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lucene-session.lisp", position = 2985L)
  public static SubLObject _csetf_lucene_connection(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != lucene_session_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lucene-session.lisp", position = 2985L)
  public static SubLObject _csetf_lucene_session_type(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != lucene_session_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lucene-session.lisp", position = 2985L)
  public static SubLObject _csetf_lucene_index(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != lucene_session_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lucene-session.lisp", position = 2985L)
  public static SubLObject _csetf_lucene_overwrite(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != lucene_session_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lucene-session.lisp", position = 2985L)
  public static SubLObject make_lucene_session(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $lucene_session_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw31$HOST ) )
      {
        _csetf_lucene_host( v_new, current_value );
      }
      else if( pcase_var.eql( $kw32$PORT ) )
      {
        _csetf_lucene_port( v_new, current_value );
      }
      else if( pcase_var.eql( $kw33$CONNECTION ) )
      {
        _csetf_lucene_connection( v_new, current_value );
      }
      else if( pcase_var.eql( $kw34$SESSION_TYPE ) )
      {
        _csetf_lucene_session_type( v_new, current_value );
      }
      else if( pcase_var.eql( $kw35$INDEX ) )
      {
        _csetf_lucene_index( v_new, current_value );
      }
      else if( pcase_var.eql( $kw36$OVERWRITE ) )
      {
        _csetf_lucene_overwrite( v_new, current_value );
      }
      else
      {
        Errors.error( $str37$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lucene-session.lisp", position = 2985L)
  public static SubLObject visit_defstruct_lucene_session(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw38$BEGIN, $sym39$MAKE_LUCENE_SESSION, SIX_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw40$SLOT, $kw31$HOST, lucene_host( obj ) );
    Functions.funcall( visitor_fn, obj, $kw40$SLOT, $kw32$PORT, lucene_port( obj ) );
    Functions.funcall( visitor_fn, obj, $kw40$SLOT, $kw33$CONNECTION, lucene_connection( obj ) );
    Functions.funcall( visitor_fn, obj, $kw40$SLOT, $kw34$SESSION_TYPE, lucene_session_type( obj ) );
    Functions.funcall( visitor_fn, obj, $kw40$SLOT, $kw35$INDEX, lucene_index( obj ) );
    Functions.funcall( visitor_fn, obj, $kw40$SLOT, $kw36$OVERWRITE, lucene_overwrite( obj ) );
    Functions.funcall( visitor_fn, obj, $kw41$END, $sym39$MAKE_LUCENE_SESSION, SIX_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lucene-session.lisp", position = 2985L)
  public static SubLObject visit_defstruct_object_lucene_session_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_lucene_session( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lucene-session.lisp", position = 3412L)
  public static SubLObject new_lucene_session(final SubLObject host, final SubLObject port, final SubLObject index, final SubLObject session_type, SubLObject overwriteP)
  {
    if( overwriteP == UNPROVIDED )
    {
      overwriteP = NIL;
    }
    assert NIL != Types.stringp( host ) : host;
    assert NIL != subl_promotions.positive_integer_p( port ) : port;
    assert NIL != Types.stringp( index ) : index;
    assert NIL != Types.keywordp( session_type ) : session_type;
    assert NIL != Types.booleanp( overwriteP ) : overwriteP;
    final SubLObject session = make_lucene_session( UNPROVIDED );
    SubLObject session_type_as_int = NIL;
    if( session_type.eql( $kw47$CYC ) )
    {
      session_type_as_int = ZERO_INTEGER;
    }
    else if( session_type.eql( $kw48$TEXT ) )
    {
      session_type_as_int = ONE_INTEGER;
    }
    _csetf_lucene_host( session, host );
    _csetf_lucene_port( session, port );
    _csetf_lucene_connection( session, subl_promotions.open_tcp_stream_with_timeout( host, port, NIL, $kw49$PRIVATE ) );
    _csetf_lucene_session_type( session, session_type );
    _csetf_lucene_index( session, index );
    _csetf_lucene_overwrite( session, overwriteP );
    lucene_init( session, index, session_type_as_int );
    return session;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lucene-session.lisp", position = 4422L)
  public static SubLObject lucene_finalize(final SubLObject session)
  {
    assert NIL != lucene_session_p( session ) : session;
    return streams_high.close( lucene_connection( session ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lucene-session.lisp", position = 4571L)
  public static SubLObject lucene_print(final SubLObject session, final SubLObject stream, final SubLObject depth)
  {
    streams_high.write_string( $str50$__LUCENE_SESSION_, stream, UNPROVIDED, UNPROVIDED );
    streams_high.write_string( lucene_host( session ), stream, UNPROVIDED, UNPROVIDED );
    streams_high.write_string( $str51$_, stream, UNPROVIDED, UNPROVIDED );
    print_high.princ( lucene_port( session ), stream );
    streams_high.write_string( $str52$_, stream, UNPROVIDED, UNPROVIDED );
    return session;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lucene-session.lisp", position = 4890L)
  public static SubLObject lucene_init(final SubLObject session, final SubLObject path, final SubLObject session_type)
  {
    return lucene_execute( session, $init_lucene_session$.getGlobalValue(), ConsesLow.list( path, session_type ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lucene-session.lisp", position = 5192L)
  public static SubLObject lucene_new_index_writer(final SubLObject session, SubLObject overwriteP)
  {
    if( overwriteP == UNPROVIDED )
    {
      overwriteP = NIL;
    }
    assert NIL != lucene_session_p( session ) : session;
    assert NIL != Types.booleanp( overwriteP ) : overwriteP;
    return lucene_execute( session, $new_index_writer$.getGlobalValue(), ConsesLow.list( overwriteP ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lucene-session.lisp", position = 5555L)
  public static SubLObject lucene_close_index_writer(final SubLObject session)
  {
    assert NIL != lucene_session_p( session ) : session;
    return lucene_execute( session, $close_index$.getGlobalValue(), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lucene-session.lisp", position = 5725L)
  public static SubLObject default_lucene_confirmed_terms_boost()
  {
    return $float53$1_0;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lucene-session.lisp", position = 5795L)
  public static SubLObject lucene_add_document(final SubLObject session, final SubLObject content, final SubLObject index_terms, final SubLObject confirmed_index_terms, final SubLObject url, final SubLObject title,
      SubLObject confirmed_terms_boost, SubLObject user_param)
  {
    if( confirmed_terms_boost == UNPROVIDED )
    {
      confirmed_terms_boost = default_lucene_confirmed_terms_boost();
    }
    if( user_param == UNPROVIDED )
    {
      user_param = NIL;
    }
    assert NIL != lucene_session_p( session ) : session;
    assert NIL != Types.stringp( content ) : content;
    assert NIL != Types.stringp( index_terms ) : index_terms;
    assert NIL != Types.stringp( confirmed_index_terms ) : confirmed_index_terms;
    assert NIL != Types.stringp( url ) : url;
    assert NIL != Types.stringp( title ) : title;
    assert NIL != number_utilities.positive_number_p( confirmed_terms_boost ) : confirmed_terms_boost;
    if( NIL != user_param && !assertionsDisabledInClass && NIL == Types.stringp( user_param ) )
    {
      throw new AssertionError( user_param );
    }
    SubLObject result = NIL;
    lucene_new_index_writer( session, lucene_overwrite( session ) );
    SubLObject v_arguments = ConsesLow.list( content, index_terms, confirmed_index_terms, url, title, confirmed_terms_boost );
    if( NIL != user_param )
    {
      v_arguments = ConsesLow.append( v_arguments, ConsesLow.list( user_param ) );
    }
    try
    {
      result = lucene_execute( session, $add_document$.getGlobalValue(), v_arguments );
    }
    finally
    {
      final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values = Values.getValuesAsVector();
        if( NIL != lucene_overwrite( session ) )
        {
          _csetf_lucene_overwrite( session, NIL );
        }
        lucene_close_index_writer( session );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lucene-session.lisp", position = 7243L)
  public static SubLObject lucene_optimize(final SubLObject session)
  {
    assert NIL != lucene_session_p( session ) : session;
    lucene_new_index_writer( session, UNPROVIDED );
    final SubLObject ret_value = lucene_execute( session, $optimize$.getGlobalValue(), NIL );
    lucene_close_index_writer( session );
    return ret_value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lucene-session.lisp", position = 7519L)
  public static SubLObject lucene_query(final SubLObject session, final SubLObject query, SubLObject count)
  {
    if( count == UNPROVIDED )
    {
      count = $int55$50;
    }
    assert NIL != lucene_session_p( session ) : session;
    assert NIL != Types.stringp( query ) : query;
    assert NIL != subl_promotions.non_negative_integer_p( count ) : count;
    return lucene_execute( session, $query$.getGlobalValue(), ConsesLow.list( query, count ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lucene-session.lisp", position = 7826L)
  public static SubLObject lucene_send(final SubLObject session, final SubLObject function, final SubLObject args)
  {
    cfasl.cfasl_output( ConsesLow.cons( function, args ), lucene_connection( session ) );
    streams_high.force_output( lucene_connection( session ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lucene-session.lisp", position = 8076L)
  public static SubLObject lucene_receive(final SubLObject session)
  {
    final SubLObject response = cfasl.cfasl_input( lucene_connection( session ), UNPROVIDED, UNPROVIDED );
    return interpret_lucene_response( response );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lucene-session.lisp", position = 8274L)
  public static SubLObject lucene_execute(final SubLObject session, final SubLObject function, final SubLObject args)
  {
    lucene_send( session, function, args );
    return lucene_receive( session );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lucene-session.lisp", position = 8468L)
  public static SubLObject interpret_lucene_response(final SubLObject response)
  {
    final SubLObject type = response.first();
    return type.isNegative() ? Errors.error( response.rest() ) : response.rest();
  }

  public static SubLObject declare_lucene_session_file()
  {
    SubLFiles.declareFunction( me, "get_lucene_host", "GET-LUCENE-HOST", 0, 0, false );
    SubLFiles.declareFunction( me, "get_lucene_port", "GET-LUCENE-PORT", 0, 0, false );
    SubLFiles.declareMacro( me, "with_lucene_session", "WITH-LUCENE-SESSION" );
    SubLFiles.declareFunction( me, "lucene_session_print_function_trampoline", "LUCENE-SESSION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "lucene_session_p", "LUCENE-SESSION-P", 1, 0, false );
    new $lucene_session_p$UnaryFunction();
    SubLFiles.declareFunction( me, "lucene_host", "LUCENE-HOST", 1, 0, false );
    SubLFiles.declareFunction( me, "lucene_port", "LUCENE-PORT", 1, 0, false );
    SubLFiles.declareFunction( me, "lucene_connection", "LUCENE-CONNECTION", 1, 0, false );
    SubLFiles.declareFunction( me, "lucene_session_type", "LUCENE-SESSION-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "lucene_index", "LUCENE-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "lucene_overwrite", "LUCENE-OVERWRITE", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_lucene_host", "_CSETF-LUCENE-HOST", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_lucene_port", "_CSETF-LUCENE-PORT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_lucene_connection", "_CSETF-LUCENE-CONNECTION", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_lucene_session_type", "_CSETF-LUCENE-SESSION-TYPE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_lucene_index", "_CSETF-LUCENE-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_lucene_overwrite", "_CSETF-LUCENE-OVERWRITE", 2, 0, false );
    SubLFiles.declareFunction( me, "make_lucene_session", "MAKE-LUCENE-SESSION", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_lucene_session", "VISIT-DEFSTRUCT-LUCENE-SESSION", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_lucene_session_method", "VISIT-DEFSTRUCT-OBJECT-LUCENE-SESSION-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "new_lucene_session", "NEW-LUCENE-SESSION", 4, 1, false );
    SubLFiles.declareFunction( me, "lucene_finalize", "LUCENE-FINALIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "lucene_print", "LUCENE-PRINT", 3, 0, false );
    SubLFiles.declareFunction( me, "lucene_init", "LUCENE-INIT", 3, 0, false );
    SubLFiles.declareFunction( me, "lucene_new_index_writer", "LUCENE-NEW-INDEX-WRITER", 1, 1, false );
    SubLFiles.declareFunction( me, "lucene_close_index_writer", "LUCENE-CLOSE-INDEX-WRITER", 1, 0, false );
    SubLFiles.declareFunction( me, "default_lucene_confirmed_terms_boost", "DEFAULT-LUCENE-CONFIRMED-TERMS-BOOST", 0, 0, false );
    SubLFiles.declareFunction( me, "lucene_add_document", "LUCENE-ADD-DOCUMENT", 6, 2, false );
    SubLFiles.declareFunction( me, "lucene_optimize", "LUCENE-OPTIMIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "lucene_query", "LUCENE-QUERY", 2, 1, false );
    SubLFiles.declareFunction( me, "lucene_send", "LUCENE-SEND", 3, 0, false );
    SubLFiles.declareFunction( me, "lucene_receive", "LUCENE-RECEIVE", 1, 0, false );
    SubLFiles.declareFunction( me, "lucene_execute", "LUCENE-EXECUTE", 3, 0, false );
    SubLFiles.declareFunction( me, "interpret_lucene_response", "INTERPRET-LUCENE-RESPONSE", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_lucene_session_file()
  {
    $lucene_host$ = SubLFiles.defparameter( "*LUCENE-HOST*", $str0$semanticsearch );
    $lucene_port$ = SubLFiles.defparameter( "*LUCENE-PORT*", $int1$1928 );
    $lucene_host_override$ = SubLFiles.defparameter( "*LUCENE-HOST-OVERRIDE*", NIL );
    $lucene_port_override$ = SubLFiles.defparameter( "*LUCENE-PORT-OVERRIDE*", NIL );
    $init_lucene_session$ = SubLFiles.deflexical( "*INIT-LUCENE-SESSION*", ZERO_INTEGER );
    $add_document$ = SubLFiles.deflexical( "*ADD-DOCUMENT*", ONE_INTEGER );
    $query$ = SubLFiles.deflexical( "*QUERY*", TWO_INTEGER );
    $optimize$ = SubLFiles.deflexical( "*OPTIMIZE*", THREE_INTEGER );
    $close_index$ = SubLFiles.deflexical( "*CLOSE-INDEX*", FOUR_INTEGER );
    $new_index_writer$ = SubLFiles.deflexical( "*NEW-INDEX-WRITER*", FIVE_INTEGER );
    $dtp_lucene_session$ = SubLFiles.defconstant( "*DTP-LUCENE-SESSION*", $sym11$LUCENE_SESSION );
    return NIL;
  }

  public static SubLObject setup_lucene_session_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_lucene_session$.getGlobalValue(), Symbols.symbol_function( $sym17$LUCENE_SESSION_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list18 );
    Structures.def_csetf( $sym19$LUCENE_HOST, $sym20$_CSETF_LUCENE_HOST );
    Structures.def_csetf( $sym21$LUCENE_PORT, $sym22$_CSETF_LUCENE_PORT );
    Structures.def_csetf( $sym23$LUCENE_CONNECTION, $sym24$_CSETF_LUCENE_CONNECTION );
    Structures.def_csetf( $sym25$LUCENE_SESSION_TYPE, $sym26$_CSETF_LUCENE_SESSION_TYPE );
    Structures.def_csetf( $sym27$LUCENE_INDEX, $sym28$_CSETF_LUCENE_INDEX );
    Structures.def_csetf( $sym29$LUCENE_OVERWRITE, $sym30$_CSETF_LUCENE_OVERWRITE );
    Equality.identity( $sym11$LUCENE_SESSION );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_lucene_session$.getGlobalValue(), Symbols.symbol_function( $sym42$VISIT_DEFSTRUCT_OBJECT_LUCENE_SESSION_METHOD ) );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_lucene_session_file();
  }

  @Override
  public void initializeVariables()
  {
    init_lucene_session_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_lucene_session_file();
  }
  static
  {
    me = new lucene_session();
    $lucene_host$ = null;
    $lucene_port$ = null;
    $lucene_host_override$ = null;
    $lucene_port_override$ = null;
    $init_lucene_session$ = null;
    $add_document$ = null;
    $query$ = null;
    $optimize$ = null;
    $close_index$ = null;
    $new_index_writer$ = null;
    $dtp_lucene_session$ = null;
    $str0$semanticsearch = makeString( "semanticsearch" );
    $int1$1928 = makeInteger( 1928 );
    $list2 = ConsesLow.list( ConsesLow.list( makeSymbol( "SESSION" ), makeSymbol( "INDEX" ), makeSymbol( "TYPE" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "HOST" ), ConsesLow.list( makeSymbol(
        "GET-LUCENE-HOST" ) ) ), ConsesLow.list( makeSymbol( "PORT" ), ConsesLow.list( makeSymbol( "GET-LUCENE-PORT" ) ) ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym3$CLET = makeSymbol( "CLET" );
    $sym4$CUNWIND_PROTECT = makeSymbol( "CUNWIND-PROTECT" );
    $sym5$PROGN = makeSymbol( "PROGN" );
    $sym6$CSETQ = makeSymbol( "CSETQ" );
    $sym7$NEW_LUCENE_SESSION = makeSymbol( "NEW-LUCENE-SESSION" );
    $sym8$PWHEN = makeSymbol( "PWHEN" );
    $sym9$LUCENE_SESSION_P = makeSymbol( "LUCENE-SESSION-P" );
    $sym10$LUCENE_FINALIZE = makeSymbol( "LUCENE-FINALIZE" );
    $sym11$LUCENE_SESSION = makeSymbol( "LUCENE-SESSION" );
    $list12 = ConsesLow.list( makeSymbol( "HOST" ), makeSymbol( "PORT" ), makeSymbol( "CONNECTION" ), makeSymbol( "SESSION-TYPE" ), makeSymbol( "INDEX" ), makeSymbol( "OVERWRITE" ) );
    $list13 = ConsesLow.list( makeKeyword( "HOST" ), makeKeyword( "PORT" ), makeKeyword( "CONNECTION" ), makeKeyword( "SESSION-TYPE" ), makeKeyword( "INDEX" ), makeKeyword( "OVERWRITE" ) );
    $list14 = ConsesLow.list( makeSymbol( "LUCENE-HOST" ), makeSymbol( "LUCENE-PORT" ), makeSymbol( "LUCENE-CONNECTION" ), makeSymbol( "LUCENE-SESSION-TYPE" ), makeSymbol( "LUCENE-INDEX" ), makeSymbol(
        "LUCENE-OVERWRITE" ) );
    $list15 = ConsesLow.list( makeSymbol( "_CSETF-LUCENE-HOST" ), makeSymbol( "_CSETF-LUCENE-PORT" ), makeSymbol( "_CSETF-LUCENE-CONNECTION" ), makeSymbol( "_CSETF-LUCENE-SESSION-TYPE" ), makeSymbol(
        "_CSETF-LUCENE-INDEX" ), makeSymbol( "_CSETF-LUCENE-OVERWRITE" ) );
    $sym16$LUCENE_PRINT = makeSymbol( "LUCENE-PRINT" );
    $sym17$LUCENE_SESSION_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "LUCENE-SESSION-PRINT-FUNCTION-TRAMPOLINE" );
    $list18 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "LUCENE-SESSION-P" ) );
    $sym19$LUCENE_HOST = makeSymbol( "LUCENE-HOST" );
    $sym20$_CSETF_LUCENE_HOST = makeSymbol( "_CSETF-LUCENE-HOST" );
    $sym21$LUCENE_PORT = makeSymbol( "LUCENE-PORT" );
    $sym22$_CSETF_LUCENE_PORT = makeSymbol( "_CSETF-LUCENE-PORT" );
    $sym23$LUCENE_CONNECTION = makeSymbol( "LUCENE-CONNECTION" );
    $sym24$_CSETF_LUCENE_CONNECTION = makeSymbol( "_CSETF-LUCENE-CONNECTION" );
    $sym25$LUCENE_SESSION_TYPE = makeSymbol( "LUCENE-SESSION-TYPE" );
    $sym26$_CSETF_LUCENE_SESSION_TYPE = makeSymbol( "_CSETF-LUCENE-SESSION-TYPE" );
    $sym27$LUCENE_INDEX = makeSymbol( "LUCENE-INDEX" );
    $sym28$_CSETF_LUCENE_INDEX = makeSymbol( "_CSETF-LUCENE-INDEX" );
    $sym29$LUCENE_OVERWRITE = makeSymbol( "LUCENE-OVERWRITE" );
    $sym30$_CSETF_LUCENE_OVERWRITE = makeSymbol( "_CSETF-LUCENE-OVERWRITE" );
    $kw31$HOST = makeKeyword( "HOST" );
    $kw32$PORT = makeKeyword( "PORT" );
    $kw33$CONNECTION = makeKeyword( "CONNECTION" );
    $kw34$SESSION_TYPE = makeKeyword( "SESSION-TYPE" );
    $kw35$INDEX = makeKeyword( "INDEX" );
    $kw36$OVERWRITE = makeKeyword( "OVERWRITE" );
    $str37$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw38$BEGIN = makeKeyword( "BEGIN" );
    $sym39$MAKE_LUCENE_SESSION = makeSymbol( "MAKE-LUCENE-SESSION" );
    $kw40$SLOT = makeKeyword( "SLOT" );
    $kw41$END = makeKeyword( "END" );
    $sym42$VISIT_DEFSTRUCT_OBJECT_LUCENE_SESSION_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-LUCENE-SESSION-METHOD" );
    $sym43$STRINGP = makeSymbol( "STRINGP" );
    $sym44$POSITIVE_INTEGER_P = makeSymbol( "POSITIVE-INTEGER-P" );
    $sym45$KEYWORDP = makeSymbol( "KEYWORDP" );
    $sym46$BOOLEANP = makeSymbol( "BOOLEANP" );
    $kw47$CYC = makeKeyword( "CYC" );
    $kw48$TEXT = makeKeyword( "TEXT" );
    $kw49$PRIVATE = makeKeyword( "PRIVATE" );
    $str50$__LUCENE_SESSION_ = makeString( "#<LUCENE-SESSION " );
    $str51$_ = makeString( ":" );
    $str52$_ = makeString( ">" );
    $float53$1_0 = makeDouble( 1.0 );
    $sym54$POSITIVE_NUMBER_P = makeSymbol( "POSITIVE-NUMBER-P" );
    $int55$50 = makeInteger( 50 );
    $sym56$NON_NEGATIVE_INTEGER_P = makeSymbol( "NON-NEGATIVE-INTEGER-P" );
  }

  public static final class $lucene_session_native
      extends
        SubLStructNative
  {
    public SubLObject $host;
    public SubLObject $port;
    public SubLObject $connection;
    public SubLObject $session_type;
    public SubLObject $index;
    public SubLObject $overwrite;
    private static final SubLStructDeclNative structDecl;

    public $lucene_session_native()
    {
      this.$host = CommonSymbols.NIL;
      this.$port = CommonSymbols.NIL;
      this.$connection = CommonSymbols.NIL;
      this.$session_type = CommonSymbols.NIL;
      this.$index = CommonSymbols.NIL;
      this.$overwrite = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $lucene_session_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$host;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$port;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$connection;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$session_type;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$index;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$overwrite;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$host = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$port = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$connection = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$session_type = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$index = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$overwrite = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $lucene_session_native.class, $sym11$LUCENE_SESSION, $sym9$LUCENE_SESSION_P, $list12, $list13, new String[] { "$host", "$port", "$connection", "$session_type",
        "$index", "$overwrite"
      }, $list14, $list15, $sym16$LUCENE_PRINT );
    }
  }

  public static final class $lucene_session_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $lucene_session_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "LUCENE-SESSION-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return lucene_session_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 279 ms synthetic
 */
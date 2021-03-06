package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_query_browser_oc
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.cb_query_browser_oc";
  public static final String myFingerPrint = "ce53377e760225eaad88cdeef9a3d260e345a1c802cf02b2065bd18fabfbcec7";
  private static SubLSymbol $g5387$;
  private static final SubLSymbol $ic0$;
  private static final SubLString $ic1$;
  private static final SubLString $ic2$;
  private static final SubLString $ic3$;
  private static final SubLString $ic4$;
  private static final SubLSymbol $ic5$;
  private static final SubLSymbol $ic6$;
  private static final SubLString $ic7$;
  private static final SubLSymbol $ic8$;
  private static final SubLString $ic9$;
  private static final SubLSymbol $ic10$;
  private static final SubLString $ic11$;
  private static final SubLSymbol $ic12$;
  private static final SubLString $ic13$;
  private static final SubLSymbol $ic14$;
  private static final SubLString $ic15$;
  private static final SubLSymbol $ic16$;
  private static final SubLString $ic17$;
  private static final SubLSymbol $ic18$;
  private static final SubLString $ic19$;
  private static final SubLSymbol $ic20$;
  private static final SubLString $ic21$;
  private static final SubLSymbol $ic22$;
  private static final SubLString $ic23$;
  private static final SubLSymbol $ic24$;
  private static final SubLSymbol $ic25$;
  private static final SubLString $ic26$;
  private static final SubLSymbol $ic27$;
  private static final SubLString $ic28$;
  private static final SubLSymbol $ic29$;
  private static final SubLString $ic30$;
  private static final SubLSymbol $ic31$;
  private static final SubLString $ic32$;
  private static final SubLSymbol $ic33$;
  private static final SubLString $ic34$;
  private static final SubLSymbol $ic35$;
  private static final SubLString $ic36$;
  private static final SubLSymbol $ic37$;
  private static final SubLString $ic38$;
  private static final SubLSymbol $ic39$;
  private static final SubLString $ic40$;
  private static final SubLSymbol $ic41$;
  private static final SubLString $ic42$;
  private static final SubLList $ic43$;
  private static final SubLString $ic44$;
  private static final SubLSymbol $ic45$;
  private static final SubLSymbol $ic46$;
  private static final SubLSymbol $ic47$;
  private static final SubLSymbol $ic48$;
  private static final SubLString $ic49$;
  private static final SubLString $ic50$;
  private static final SubLSymbol $ic51$;
  private static final SubLString $ic52$;
  private static final SubLString $ic53$;
  private static final SubLSymbol $ic54$;
  private static final SubLSymbol $ic55$;
  private static final SubLSymbol $ic56$;
  private static final SubLString $ic57$;
  private static final SubLString $ic58$;
  private static final SubLSymbol $ic59$;
  private static final SubLString $ic60$;
  private static final SubLString $ic61$;
  private static final SubLString $ic62$;
  private static final SubLString $ic63$;
  private static final SubLString $ic64$;
  private static final SubLSymbol $ic65$;
  private static final SubLString $ic66$;
  private static final SubLString $ic67$;
  private static final SubLString $ic68$;
  private static final SubLString $ic69$;
  private static final SubLSymbol $ic70$;
  private static final SubLString $ic71$;
  private static final SubLString $ic72$;
  private static final SubLSymbol $ic73$;
  private static final SubLSymbol $ic74$;
  private static final SubLString $ic75$;
  private static final SubLSymbol $ic76$;
  private static final SubLList $ic77$;
  private static final SubLString $ic78$;
  private static final SubLSymbol $ic79$;
  private static final SubLString $ic80$;
  private static final SubLString $ic81$;
  private static final SubLString $ic82$;
  private static final SubLString $ic83$;
  private static final SubLSymbol $ic84$;
  private static final SubLString $ic85$;
  private static final SubLString $ic86$;
  private static final SubLString $ic87$;
  private static final SubLString $ic88$;
  private static final SubLString $ic89$;
  private static final SubLSymbol $ic90$;
  private static final SubLSymbol $ic91$;
  private static final SubLString $ic92$;
  private static final SubLString $ic93$;
  private static final SubLString $ic94$;
  private static final SubLString $ic95$;
  private static final SubLObject $ic96$;
  private static final SubLString $ic97$;
  private static final SubLString $ic98$;
  private static final SubLString $ic99$;
  private static final SubLString $ic100$;
  private static final SubLSymbol $ic101$;
  private static final SubLSymbol $ic102$;
  private static final SubLSymbol $ic103$;
  private static final SubLString $ic104$;
  private static final SubLString $ic105$;
  private static final SubLString $ic106$;
  private static final SubLString $ic107$;
  private static final SubLSymbol $ic108$;
  private static final SubLSymbol $ic109$;
  private static final SubLSymbol $ic110$;
  private static final SubLSymbol $ic111$;
  private static final SubLSymbol $ic112$;
  private static final SubLString $ic113$;
  private static final SubLSymbol $ic114$;
  private static final SubLString $ic115$;
  private static final SubLSymbol $ic116$;
  private static final SubLString $ic117$;
  private static final SubLSymbol $ic118$;
  private static final SubLString $ic119$;
  private static final SubLSymbol $ic120$;
  private static final SubLString $ic121$;
  private static final SubLSymbol $ic122$;
  private static final SubLString $ic123$;
  private static final SubLString $ic124$;
  private static final SubLSymbol $ic125$;
  private static final SubLString $ic126$;
  private static final SubLList $ic127$;
  private static final SubLString $ic128$;
  private static final SubLSymbol $ic129$;
  private static final SubLSymbol $ic130$;
  private static final SubLSymbol $ic131$;
  private static final SubLSymbol $ic132$;
  private static final SubLList $ic133$;
  private static final SubLSymbol $ic134$;

  public static SubLObject f41964(final SubLObject var1, SubLObject var2)
  {
    if( var2 == UNPROVIDED )
    {
      var2 = T;
    }
    SubLObject var3 = inference_datastructures_inference_oc.f25423( var1 );
    if( NIL == var3 )
    {
      var3 = module0204.f13094( inference_datastructures_inference_oc.f25487( var1 ) );
    }
    if( NIL != var2 )
    {
      final SubLObject var4 = inference_datastructures_inference_oc.f25424( var1 );
      if( NIL != var4 )
      {
        module0642.f39021( $ic2$ );
        module0642.f39032( UNPROVIDED );
        module0656.f39915( var4, ZERO_INTEGER, NIL );
        module0642.f39026( UNPROVIDED );
      }
    }
    module0642.f39021( $ic3$ );
    module0642.f39026( UNPROVIDED );
    module0656.f39804( var3, ZERO_INTEGER, T );
    final SubLObject var5 = inference_datastructures_inference_oc.f25482( var1 );
    if( NIL != var5 )
    {
      module0642.f39026( UNPROVIDED );
      module0642.f39021( $ic4$ );
      module0642.f39026( UNPROVIDED );
      module0656.f39804( var5, ZERO_INTEGER, T );
    }
    return var1;
  }

  public static SubLObject f41965(final SubLObject var6)
  {
    assert NIL != module0360.f23869( var6 ) : var6;
    if( var6.eql( $ic6$ ) )
    {
      module0642.f39019( $ic7$ );
    }
    else if( var6.eql( $ic8$ ) )
    {
      module0642.f39019( $ic9$ );
    }
    else if( var6.eql( $ic10$ ) )
    {
      module0642.f39019( $ic11$ );
    }
    else if( var6.eql( $ic12$ ) )
    {
      module0642.f39019( $ic13$ );
    }
    else if( var6.eql( $ic14$ ) )
    {
      module0642.f39019( $ic15$ );
    }
    else if( var6.eql( $ic16$ ) )
    {
      module0642.f39019( $ic17$ );
    }
    else if( var6.eql( $ic18$ ) )
    {
      module0642.f39019( $ic19$ );
    }
    else if( var6.eql( $ic20$ ) )
    {
      module0642.f39019( $ic21$ );
    }
    else if( var6.eql( $ic22$ ) )
    {
      module0642.f39019( $ic23$ );
    }
    else
    {
      module0642.f39019( var6 );
    }
    return NIL;
  }

  public static SubLObject f41966(final SubLObject var8)
  {
    assert NIL != module0360.f23865( var8 ) : var8;
    if( var8.eql( $ic25$ ) )
    {
      module0642.f39019( $ic26$ );
    }
    else if( var8.eql( $ic27$ ) )
    {
      module0642.f39019( $ic28$ );
    }
    else if( var8.eql( $ic29$ ) )
    {
      module0642.f39019( $ic30$ );
    }
    else if( var8.eql( $ic31$ ) )
    {
      module0642.f39019( $ic32$ );
    }
    else if( var8.eql( $ic33$ ) )
    {
      module0642.f39019( $ic34$ );
    }
    else if( var8.eql( $ic35$ ) )
    {
      module0642.f39019( $ic36$ );
    }
    else if( var8.eql( $ic37$ ) )
    {
      module0642.f39019( $ic38$ );
    }
    else if( var8.eql( $ic39$ ) )
    {
      module0642.f39019( $ic40$ );
    }
    else if( var8.eql( $ic41$ ) )
    {
      module0642.f39019( $ic42$ );
    }
    else
    {
      module0642.f39019( var8 );
    }
    return NIL;
  }

  public static SubLObject f41967(final SubLObject var9)
  {
    SubLObject var10 = NIL;
    SubLObject var11 = NIL;
    SubLObject var12 = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var9, var9, $ic43$ );
    var10 = var9.first();
    SubLObject var13 = var9.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var13, var9, $ic43$ );
    var11 = var13.first();
    var13 = var13.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var13, var9, $ic43$ );
    var12 = var13.first();
    var13 = var13.rest();
    if( NIL != var13 )
    {
      cdestructuring_bind.cdestructuring_bind_error( var9, $ic43$ );
      return NIL;
    }
    final SubLObject var14 = f41968( var10, var11, var12 );
    if( NIL == inference_datastructures_inference_oc.f25684( var14 ) )
    {
      return module0656.f39789( $ic44$, var9, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return f41969( var14 );
  }

  public static SubLObject f41970(final SubLObject var15, SubLObject var16, SubLObject var17, SubLObject var18)
  {
    if( var16 == UNPROVIDED )
    {
      var16 = NIL;
    }
    if( var17 == UNPROVIDED )
    {
      var17 = NIL;
    }
    if( var18 == UNPROVIDED )
    {
      var18 = NIL;
    }
    final SubLThread var19 = SubLProcess.currentSubLThread();
    if( NIL == var18 )
    {
      var18 = $ic46$;
    }
    if( NIL == var16 )
    {
      var16 = $ic47$;
    }
    final SubLObject var20 = inference_datastructures_inference_oc.f25732( var15 );
    final SubLObject var21 = inference_datastructures_inference_oc.f25422( var20 );
    final SubLObject var22 = inference_datastructures_inference_oc.f25421( var20 );
    final SubLObject var23 = module0361.f23996( var22 );
    final SubLObject var24 = inference_datastructures_inference_oc.f25629( var15 );
    final SubLObject var25 = inference_datastructures_inference_oc.f25687( var15 );
    if( NIL == var17 )
    {
      final SubLObject var26 = var16;
      if( var26.eql( $ic48$ ) )
      {
        var17 = PrintLow.format( NIL, $ic49$, new SubLObject[] { var23, var21, var24
        } );
      }
      else if( var26.eql( $ic47$ ) )
      {
        var17 = PrintLow.format( NIL, $ic50$, new SubLObject[] { var23, var21, var24
        } );
      }
      else if( var26.eql( $ic51$ ) )
      {
        var17 = PrintLow.format( NIL, $ic52$, new SubLObject[] { var23, var21, var24, var25
        } );
      }
    }
    module0642.f39020( module0015.$g459$.getGlobalValue() );
    final SubLObject var27 = module0656.f39832( var18 );
    module0642.f39020( module0015.$g381$.getGlobalValue() );
    module0642.f39020( module0015.$g383$.getGlobalValue() );
    module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
    module0655.f39768();
    PrintLow.format( module0015.$g131$.getDynamicValue( var19 ), $ic53$, new SubLObject[] { var23, var21, var24
    } );
    module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != var27 )
    {
      module0642.f39020( module0015.$g387$.getGlobalValue() );
      module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
      module0642.f39020( var27 );
      module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
    }
    module0642.f39012( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject var28 = module0015.$g533$.currentBinding( var19 );
    try
    {
      module0015.$g533$.bind( T, var19 );
      module0642.f39019( var17 );
    }
    finally
    {
      module0015.$g533$.rebind( var28, var19 );
    }
    module0642.f39020( module0015.$g382$.getGlobalValue() );
    module0642.f39020( module0015.$g460$.getGlobalValue() );
    return var15;
  }

  public static SubLObject f41971(final SubLObject var27, SubLObject var28, SubLObject var29)
  {
    if( var28 == UNPROVIDED )
    {
      var28 = NIL;
    }
    if( var29 == UNPROVIDED )
    {
      var29 = NIL;
    }
    module0656.f39837( $ic54$, var27, $ic51$, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return var27;
  }

  public static SubLObject f41968(final SubLObject var12, final SubLObject var13, final SubLObject var14)
  {
    final SubLObject var15 = module0038.f2642( var12 );
    final SubLObject var16 = module0038.f2642( var13 );
    final SubLObject var17 = module0038.f2642( var14 );
    if( var16.isInteger() && var17.isInteger() )
    {
      final SubLObject var18 = inference_datastructures_inference_oc.f25617( var15, var16, var17 );
      if( NIL != inference_datastructures_inference_oc.f25684( var18 ) )
      {
        return var18;
      }
    }
    return NIL;
  }

  public static SubLObject f41972(final SubLObject var24, final SubLObject var30)
  {
    f41973( var24, var30 );
    return NIL;
  }

  public static SubLObject f41974(final SubLObject var15)
  {
    module0656.f39837( $ic54$, var15, $ic47$, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    module0642.f39026( UNPROVIDED );
    final SubLObject var16 = inference_datastructures_inference_oc.f25687( var15 );
    f41975( var16, UNPROVIDED );
    return var15;
  }

  public static SubLObject f41969(final SubLObject var15)
  {
    final SubLThread var16 = SubLProcess.currentSubLThread();
    module0642.f39020( $ic57$ );
    module0642.f39029( UNPROVIDED );
    module0642.f39020( module0015.$g155$.getGlobalValue() );
    module0642.f39020( module0015.$g153$.getGlobalValue() );
    module0015.f718();
    module0642.f39029( UNPROVIDED );
    module0642.f39020( module0015.$g173$.getGlobalValue() );
    module0642.f39019( $ic58$ );
    module0642.f39020( module0015.$g174$.getGlobalValue() );
    module0642.f39020( module0015.$g154$.getGlobalValue() );
    module0642.f39029( UNPROVIDED );
    final SubLObject var17 = module0015.$g538$.currentBinding( var16 );
    final SubLObject var18 = module0015.$g535$.currentBinding( var16 );
    try
    {
      module0015.$g538$.bind( ( NIL != module0057.f4158( module0015.$g538$.getDynamicValue( var16 ) ) ) ? module0015.$g538$.getDynamicValue( var16 ) : module0057.f4173( UNPROVIDED, UNPROVIDED, UNPROVIDED ), var16 );
      module0015.$g535$.bind( T, var16 );
      module0642.f39020( module0015.$g133$.getGlobalValue() );
      module0642.f39012( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject var26_32 = module0015.$g533$.currentBinding( var16 );
      try
      {
        module0015.$g533$.bind( T, var16 );
        module0644.f39197();
        module0016.f941();
        module0642.f39021( $ic58$ );
        module0642.f39032( UNPROVIDED );
        module0656.f39837( $ic54$, var15, $ic47$, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        module0642.f39032( FOUR_INTEGER );
        module0656.f39837( $ic59$, var15, $ic60$, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        module0642.f39032( TWO_INTEGER );
        module0642.f39051( UNPROVIDED, UNPROVIDED );
        f41964( inference_datastructures_inference_oc.f25732( var15 ), UNPROVIDED );
        module0642.f39026( TWO_INTEGER );
        module0642.f39021( $ic61$ );
        f41976( var15 );
        module0642.f39026( UNPROVIDED );
        module0642.f39021( $ic62$ );
        f41977( var15 );
        module0642.f39026( UNPROVIDED );
        final SubLObject var19 = inference_datastructures_inference_oc.f25687( var15 );
        final SubLObject var20 = inference_datastructures_inference_oc.f25749( var15 );
        module0642.f39021( $ic63$ );
        module0642.f39026( UNPROVIDED );
        f41972( var19, var20 );
        module0642.f39026( UNPROVIDED );
        module0642.f39021( $ic64$ );
        if( NIL != module0035.f1997( inference_datastructures_inference_oc.f25744( var15 ) ) )
        {
          module0642.f39032( TWO_INTEGER );
          module0656.f39837( $ic65$, inference_datastructures_inference_oc.f25744( var15 ).first(), $ic47$, $ic66$, UNPROVIDED, UNPROVIDED );
        }
        SubLObject var21 = inference_datastructures_inference_oc.f25744( var15 );
        SubLObject var22 = NIL;
        var22 = var21.first();
        while ( NIL != var21)
        {
          module0642.f39026( UNPROVIDED );
          f41978( var22 );
          var21 = var21.rest();
          var22 = var21.first();
        }
        module0642.f39029( UNPROVIDED );
        module0642.f39050();
      }
      finally
      {
        module0015.$g533$.rebind( var26_32, var16 );
      }
      module0642.f39020( module0015.$g134$.getGlobalValue() );
      module0642.f39029( UNPROVIDED );
    }
    finally
    {
      module0015.$g535$.rebind( var18, var16 );
      module0015.$g538$.rebind( var17, var16 );
    }
    module0642.f39020( module0015.$g156$.getGlobalValue() );
    module0642.f39029( UNPROVIDED );
    return NIL;
  }

  public static SubLObject f41976(final SubLObject var15)
  {
    final SubLObject var16 = inference_datastructures_inference_oc.f25750( var15 );
    final SubLObject var17 = inference_datastructures_inference_oc.f25623( var15, NIL );
    module0642.f39019( $ic67$ );
    module0642.f39019( module0051.f3602( var17 ) );
    module0642.f39019( $ic68$ );
    f41979( var16 );
    module0642.f39019( $ic69$ );
    return NIL;
  }

  public static SubLObject f41979(SubLObject var38)
  {
    if( var38 == UNPROVIDED )
    {
      var38 = Time.get_universal_time();
    }
    final SubLThread var39 = SubLProcess.currentSubLThread();
    assert NIL != module0051.f3549( var38 ) : var38;
    var39.resetMultipleValues();
    final SubLObject var40 = module0051.f3642( var38 );
    final SubLObject var41 = var39.secondMultipleValue();
    var39.resetMultipleValues();
    module0642.f39019( module0051.f3634( var41 ) );
    if( var40.numE( module0051.f3605() ) )
    {
      module0642.f39019( $ic71$ );
    }
    else
    {
      PrintLow.format( module0015.$g131$.getDynamicValue( var39 ), $ic72$, module0051.f3617( var40 ) );
    }
    return NIL;
  }

  public static SubLObject f41977(final SubLObject var15)
  {
    final SubLObject var16 = inference_datastructures_inference_oc.f25625( var15 );
    module0642.f39019( var16 );
    return NIL;
  }

  public static SubLObject f41980(final SubLObject var9)
  {
    SubLObject var10 = NIL;
    SubLObject var11 = NIL;
    SubLObject var12 = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var9, var9, $ic43$ );
    var10 = var9.first();
    SubLObject var13 = var9.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var13, var9, $ic43$ );
    var11 = var13.first();
    var13 = var13.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var13, var9, $ic43$ );
    var12 = var13.first();
    var13 = var13.rest();
    if( NIL != var13 )
    {
      cdestructuring_bind.cdestructuring_bind_error( var9, $ic43$ );
      return NIL;
    }
    final SubLObject var14 = f41968( var10, var11, var12 );
    if( NIL == inference_datastructures_inference_oc.f25684( var14 ) )
    {
      return module0656.f39789( $ic44$, var9, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    final SubLObject var15 = inference_datastructures_inference_oc.f25732( var14 );
    final SubLObject var16 = inference_datastructures_inference_oc.f25756( var14 );
    final SubLObject var17 = inference_datastructures_inference_oc.f25424( var15 );
    final SubLObject var18 = NIL;
    return module0683.f41802( var16, var17, var18 );
  }

  public static SubLObject f41981(final SubLObject var44, SubLObject var17)
  {
    if( var17 == UNPROVIDED )
    {
      var17 = NIL;
    }
    final SubLThread var45 = SubLProcess.currentSubLThread();
    if( NIL == var17 )
    {
      var17 = $ic60$;
    }
    final SubLObject var46 = inference_datastructures_inference_oc.f25629( var44 );
    final SubLObject var47 = inference_datastructures_inference_oc.f25732( var44 );
    final SubLObject var48 = inference_datastructures_inference_oc.f25422( var47 );
    final SubLObject var49 = inference_datastructures_inference_oc.f25421( var47 );
    final SubLObject var50 = module0361.f23996( var49 );
    final SubLObject var51 = module0656.f39832( $ic74$ );
    module0642.f39020( module0015.$g381$.getGlobalValue() );
    module0642.f39020( module0015.$g383$.getGlobalValue() );
    module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
    module0655.f39768();
    PrintLow.format( module0015.$g131$.getDynamicValue( var45 ), $ic75$, new SubLObject[] { var50, var48, var46
    } );
    module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != var51 )
    {
      module0642.f39020( module0015.$g387$.getGlobalValue() );
      module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
      module0642.f39020( var51 );
      module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
    }
    module0642.f39012( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject var52 = module0015.$g533$.currentBinding( var45 );
    try
    {
      module0015.$g533$.bind( T, var45 );
      module0642.f39019( var17 );
    }
    finally
    {
      module0015.$g533$.rebind( var52, var45 );
    }
    module0642.f39020( module0015.$g382$.getGlobalValue() );
    return NIL;
  }

  public static SubLObject f41982(final SubLObject var9)
  {
    SubLObject var10 = NIL;
    SubLObject var11 = NIL;
    SubLObject var12 = NIL;
    SubLObject var13 = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var9, var9, $ic77$ );
    var10 = var9.first();
    SubLObject var14 = var9.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var14, var9, $ic77$ );
    var11 = var14.first();
    var14 = var14.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var14, var9, $ic77$ );
    var12 = var14.first();
    var14 = var14.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var14, var9, $ic77$ );
    var13 = var14.first();
    var14 = var14.rest();
    if( NIL != var14 )
    {
      cdestructuring_bind.cdestructuring_bind_error( var9, $ic77$ );
      return NIL;
    }
    final SubLObject var15 = f41983( var10, var11, var12, var13 );
    if( NIL == inference_datastructures_inference_oc.f25691( var15 ) )
    {
      return module0656.f39789( $ic78$, var9, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return f41984( var15 );
  }

  public static SubLObject f41985(final SubLObject var35, SubLObject var16, SubLObject var17, SubLObject var18)
  {
    if( var16 == UNPROVIDED )
    {
      var16 = NIL;
    }
    if( var17 == UNPROVIDED )
    {
      var17 = NIL;
    }
    if( var18 == UNPROVIDED )
    {
      var18 = NIL;
    }
    final SubLThread var36 = SubLProcess.currentSubLThread();
    if( NIL == var18 )
    {
      var18 = $ic46$;
    }
    if( NIL == var16 )
    {
      var16 = $ic47$;
    }
    final SubLObject var37 = f41986( var35 );
    final SubLObject var38 = inference_datastructures_inference_oc.f25782( var35 );
    final SubLObject var39 = inference_datastructures_inference_oc.f25629( var38 );
    final SubLObject var40 = inference_datastructures_inference_oc.f25732( var38 );
    final SubLObject var41 = inference_datastructures_inference_oc.f25422( var40 );
    final SubLObject var42 = inference_datastructures_inference_oc.f25421( var40 );
    final SubLObject var43 = module0361.f23996( var42 );
    final SubLObject var44 = inference_datastructures_inference_oc.f25687( var38 );
    if( NIL == var17 )
    {
      final SubLObject var45 = var16;
      if( var45.eql( $ic48$ ) )
      {
        var17 = PrintLow.format( NIL, $ic80$, new SubLObject[] { var43, var41, var39, var37
        } );
      }
      else if( var45.eql( $ic47$ ) )
      {
        var17 = PrintLow.format( NIL, $ic81$, new SubLObject[] { var43, var41, var39, var37
        } );
      }
      else if( var45.eql( $ic51$ ) )
      {
        var17 = PrintLow.format( NIL, $ic82$, new SubLObject[] { var43, var41, var39, var37, var44
        } );
      }
    }
    module0642.f39020( module0015.$g459$.getGlobalValue() );
    final SubLObject var46 = module0656.f39832( var18 );
    module0642.f39020( module0015.$g381$.getGlobalValue() );
    module0642.f39020( module0015.$g383$.getGlobalValue() );
    module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
    module0655.f39768();
    PrintLow.format( module0015.$g131$.getDynamicValue( var36 ), $ic83$, new SubLObject[] { var43, var41, var39, var37
    } );
    module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != var46 )
    {
      module0642.f39020( module0015.$g387$.getGlobalValue() );
      module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
      module0642.f39020( var46 );
      module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
    }
    module0642.f39012( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject var47 = module0015.$g533$.currentBinding( var36 );
    try
    {
      module0015.$g533$.bind( T, var36 );
      module0642.f39019( var17 );
    }
    finally
    {
      module0015.$g533$.rebind( var47, var36 );
    }
    module0642.f39020( module0015.$g382$.getGlobalValue() );
    module0642.f39020( module0015.$g460$.getGlobalValue() );
    return var38;
  }

  public static SubLObject f41986(final SubLObject var35)
  {
    final SubLObject var36 = inference_datastructures_inference_oc.f25782( var35 );
    final SubLObject var37 = inference_datastructures_inference_oc.f25744( var36 );
    return Sequences.position( var35, var37, Symbols.symbol_function( EQ ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  public static SubLObject f41983(final SubLObject var12, final SubLObject var13, final SubLObject var14, final SubLObject var49)
  {
    final SubLObject var50 = f41968( var12, var13, var14 );
    if( NIL != inference_datastructures_inference_oc.f25684( var50 ) )
    {
      final SubLObject var51 = reader.read_from_string_ignoring_errors( var49, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      if( NIL != module0004.f106( var51 ) )
      {
        final SubLObject var52 = ConsesLow.nth( var51, inference_datastructures_inference_oc.f25744( var50 ) );
        return var52;
      }
    }
    return NIL;
  }

  public static SubLObject f41984(final SubLObject var35)
  {
    final SubLThread var36 = SubLProcess.currentSubLThread();
    final SubLObject var37 = inference_datastructures_inference_oc.f25782( var35 );
    final SubLObject var38 = inference_datastructures_inference_oc.f25732( var37 );
    final SubLObject var39 = inference_datastructures_inference_oc.f25421( var38 );
    module0642.f39020( $ic57$ );
    module0642.f39029( UNPROVIDED );
    module0642.f39020( module0015.$g155$.getGlobalValue() );
    module0642.f39020( module0015.$g153$.getGlobalValue() );
    module0015.f718();
    module0642.f39029( UNPROVIDED );
    module0642.f39020( module0015.$g173$.getGlobalValue() );
    module0642.f39019( $ic85$ );
    module0642.f39020( module0015.$g174$.getGlobalValue() );
    module0642.f39020( module0015.$g154$.getGlobalValue() );
    module0642.f39029( UNPROVIDED );
    final SubLObject var40 = module0015.$g535$.currentBinding( var36 );
    try
    {
      module0015.$g535$.bind( T, var36 );
      module0642.f39020( module0015.$g133$.getGlobalValue() );
      module0642.f39012( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject var26_53 = module0015.$g533$.currentBinding( var36 );
      try
      {
        module0015.$g533$.bind( T, var36 );
        module0644.f39197();
        module0642.f39021( $ic85$ );
        module0642.f39032( UNPROVIDED );
        module0656.f39837( $ic65$, var35, $ic48$, NIL, $ic74$, UNPROVIDED );
        module0642.f39019( $ic86$ );
        module0656.f39837( $ic54$, var37, $ic48$, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        module0642.f39051( UNPROVIDED, UNPROVIDED );
        f41964( var38, UNPROVIDED );
        module0642.f39026( TWO_INTEGER );
        final SubLObject var41 = inference_datastructures_inference_oc.f25687( var37 );
        final SubLObject var42 = inference_datastructures_inference_oc.f25749( var37 );
        module0642.f39021( $ic63$ );
        module0642.f39026( UNPROVIDED );
        f41972( var41, var42 );
        final SubLObject var43 = Functions.funcall( makeSymbol( "S#45965", "CYC" ), var35 );
        module0642.f39026( UNPROVIDED );
        module0642.f39021( PrintLow.format( NIL, $ic87$, Sequences.length( var43 ) ) );
        if( NIL != var43 )
        {
          SubLObject var44 = var43;
          SubLObject var45 = NIL;
          var45 = var44.first();
          while ( NIL != var44)
          {
            module0656.f39804( var45, UNPROVIDED, UNPROVIDED );
            module0642.f39026( UNPROVIDED );
            var44 = var44.rest();
            var45 = var44.first();
          }
        }
        else
        {
          module0642.f39019( $ic88$ );
          module0642.f39026( UNPROVIDED );
        }
        module0642.f39026( UNPROVIDED );
        module0642.f39021( $ic89$ );
        final SubLObject var46 = inference_datastructures_inference_oc.f25775( var35 );
        final SubLObject var47 = module0333.f22430( var46 );
        final SubLObject var48 = module0361.f24160( var39 );
        module0671.f41013( var47, var48 );
        module0642.f39029( UNPROVIDED );
        module0642.f39050();
      }
      finally
      {
        module0015.$g533$.rebind( var26_53, var36 );
      }
      module0642.f39020( module0015.$g134$.getGlobalValue() );
      module0642.f39029( UNPROVIDED );
    }
    finally
    {
      module0015.$g535$.rebind( var40, var36 );
    }
    module0642.f39020( module0015.$g156$.getGlobalValue() );
    module0642.f39029( UNPROVIDED );
    return NIL;
  }

  public static SubLObject f41978(final SubLObject var35)
  {
    final SubLThread var36 = SubLProcess.currentSubLThread();
    module0642.f39020( module0015.$g346$.getGlobalValue() );
    module0642.f39012( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject var37 = module0015.$g533$.currentBinding( var36 );
    try
    {
      module0015.$g533$.bind( T, var36 );
      module0642.f39020( module0015.$g364$.getGlobalValue() );
      module0642.f39012( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject var26_58 = module0015.$g533$.currentBinding( var36 );
      try
      {
        module0015.$g533$.bind( T, var36 );
        module0642.f39020( module0015.$g360$.getGlobalValue() );
        module0642.f39020( module0015.$g370$.getGlobalValue() );
        module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
        module0642.f39020( module0642.f39049( $ic90$ ) );
        module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
        module0642.f39020( module0015.$g373$.getGlobalValue() );
        module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
        module0642.f39020( module0642.f39049( $ic91$ ) );
        module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
        module0642.f39012( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject var26_59 = module0015.$g533$.currentBinding( var36 );
        try
        {
          module0015.$g533$.bind( T, var36 );
          final SubLObject var38 = inference_datastructures_inference_oc.f25775( var35 );
          module0671.f41013( var38, module0361.f24160( inference_datastructures_inference_oc.f25792( var35 ) ) );
        }
        finally
        {
          module0015.$g533$.rebind( var26_59, var36 );
        }
        module0642.f39020( module0015.$g361$.getGlobalValue() );
      }
      finally
      {
        module0015.$g533$.rebind( var26_58, var36 );
      }
      module0642.f39020( module0015.$g365$.getGlobalValue() );
      module0642.f39029( UNPROVIDED );
    }
    finally
    {
      module0015.$g533$.rebind( var37, var36 );
    }
    module0642.f39020( module0015.$g347$.getGlobalValue() );
    return var35;
  }

  public static SubLObject f41987(final SubLObject var1, final SubLObject var60)
  {
    final SubLThread var61 = SubLProcess.currentSubLThread();
    var61.resetMultipleValues();
    final SubLObject var62 = f41988( var1 );
    final SubLObject var63 = var61.secondMultipleValue();
    final SubLObject var64 = var61.thirdMultipleValue();
    var61.resetMultipleValues();
    final SubLObject var65 = Sequences.length( var62 );
    if( NIL == var63 && var65.isZero() )
    {
      if( NIL != inference_datastructures_inference_oc.f25429( var1 ) )
      {
        module0642.f39021( $ic92$ );
      }
      else
      {
        module0642.f39021( $ic93$ );
      }
    }
    else if( var65.isZero() )
    {
      module0642.f39021( $ic94$ );
    }
    else if( NIL == var63 && ONE_INTEGER.numE( var65 ) )
    {
      final SubLObject var66 = var62.first();
      module0642.f39021( $ic95$ );
      module0642.f39032( UNPROVIDED );
      module0656.f39915( $ic96$, UNPROVIDED, UNPROVIDED );
      module0642.f39032( UNPROVIDED );
      f41989( var66, var64, var65 );
    }
    else
    {
      module0642.f39020( module0015.$g346$.getGlobalValue() );
      module0642.f39020( module0015.$g352$.getGlobalValue() );
      module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
      module0642.f39020( ZERO_INTEGER );
      module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
      module0642.f39020( module0015.$g353$.getGlobalValue() );
      module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
      module0642.f39020( TWO_INTEGER );
      module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
      module0642.f39020( module0015.$g354$.getGlobalValue() );
      module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
      module0642.f39020( TWO_INTEGER );
      module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
      module0642.f39012( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject var67 = module0015.$g533$.currentBinding( var61 );
      try
      {
        module0015.$g533$.bind( T, var61 );
        module0642.f39020( module0015.$g364$.getGlobalValue() );
        module0642.f39012( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject var26_65 = module0015.$g533$.currentBinding( var61 );
        try
        {
          module0015.$g533$.bind( T, var61 );
          module0642.f39020( module0015.$g360$.getGlobalValue() );
          module0642.f39020( module0015.$g370$.getGlobalValue() );
          module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
          module0642.f39020( module0642.f39049( $ic90$ ) );
          module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
          module0642.f39020( module0015.$g373$.getGlobalValue() );
          module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
          module0642.f39020( module0642.f39049( $ic91$ ) );
          module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
          module0642.f39012( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject var26_66 = module0015.$g533$.currentBinding( var61 );
          try
          {
            module0015.$g533$.bind( T, var61 );
            module0642.f39021( $ic97$ );
          }
          finally
          {
            module0015.$g533$.rebind( var26_66, var61 );
          }
          module0642.f39020( module0015.$g361$.getGlobalValue() );
          f41990( var63, NIL, T );
          if( NIL != $g5387$.getDynamicValue( var61 ) )
          {
            module0642.f39020( module0015.$g360$.getGlobalValue() );
            module0642.f39020( module0015.$g370$.getGlobalValue() );
            module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
            module0642.f39020( module0642.f39049( $ic90$ ) );
            module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
            module0642.f39020( module0015.$g373$.getGlobalValue() );
            module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
            module0642.f39020( module0642.f39049( $ic91$ ) );
            module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
            module0642.f39012( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject var26_67 = module0015.$g533$.currentBinding( var61 );
            try
            {
              module0015.$g533$.bind( T, var61 );
              module0642.f39021( $ic98$ );
            }
            finally
            {
              module0015.$g533$.rebind( var26_67, var61 );
            }
            module0642.f39020( module0015.$g361$.getGlobalValue() );
          }
        }
        finally
        {
          module0015.$g533$.rebind( var26_65, var61 );
        }
        module0642.f39020( module0015.$g365$.getGlobalValue() );
        module0642.f39029( UNPROVIDED );
        SubLObject var68 = ZERO_INTEGER;
        SubLObject var69 = NIL;
        if( NIL == var69 )
        {
          SubLObject var70 = var62;
          SubLObject var71 = NIL;
          var71 = var70.first();
          while ( NIL == var69 && NIL != var70)
          {
            if( NIL != var60 && var68.numGE( var60 ) )
            {
              var69 = T;
            }
            else
            {
              var68 = Numbers.add( var68, ONE_INTEGER );
              module0642.f39020( module0015.$g364$.getGlobalValue() );
              module0642.f39012( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject var26_68 = module0015.$g533$.currentBinding( var61 );
              try
              {
                module0015.$g533$.bind( T, var61 );
                module0642.f39020( module0015.$g360$.getGlobalValue() );
                module0642.f39020( module0015.$g370$.getGlobalValue() );
                module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
                module0642.f39020( module0642.f39049( $ic90$ ) );
                module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
                module0642.f39020( module0015.$g373$.getGlobalValue() );
                module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
                module0642.f39020( module0642.f39049( $ic91$ ) );
                module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
                module0642.f39012( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject var26_69 = module0015.$g533$.currentBinding( var61 );
                try
                {
                  module0015.$g533$.bind( T, var61 );
                  f41989( var71, var64, var65 );
                }
                finally
                {
                  module0015.$g533$.rebind( var26_69, var61 );
                }
                module0642.f39020( module0015.$g361$.getGlobalValue() );
                f41991( var71, var63 );
                if( NIL != $g5387$.getDynamicValue( var61 ) )
                {
                  module0642.f39020( module0015.$g360$.getGlobalValue() );
                  module0642.f39020( module0015.$g370$.getGlobalValue() );
                  module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
                  module0642.f39020( module0642.f39049( $ic90$ ) );
                  module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
                  module0642.f39020( module0015.$g373$.getGlobalValue() );
                  module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
                  module0642.f39020( module0642.f39049( $ic91$ ) );
                  module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
                  module0642.f39012( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject var26_70 = module0015.$g533$.currentBinding( var61 );
                  try
                  {
                    module0015.$g533$.bind( T, var61 );
                    final SubLObject var72 = Functions.funcall( makeSymbol( "S#45966", "CYC" ), var71 );
                    if( NIL != var72 )
                    {
                      SubLObject var73 = var72;
                      SubLObject var74 = NIL;
                      var74 = var73.first();
                      while ( NIL != var73)
                      {
                        module0656.f39804( var74, UNPROVIDED, UNPROVIDED );
                        module0642.f39026( UNPROVIDED );
                        var73 = var73.rest();
                        var74 = var73.first();
                      }
                    }
                    else
                    {
                      module0642.f39019( $ic88$ );
                      module0642.f39026( UNPROVIDED );
                    }
                  }
                  finally
                  {
                    module0015.$g533$.rebind( var26_70, var61 );
                  }
                  module0642.f39020( module0015.$g361$.getGlobalValue() );
                }
              }
              finally
              {
                module0015.$g533$.rebind( var26_68, var61 );
              }
              module0642.f39020( module0015.$g365$.getGlobalValue() );
              module0642.f39029( UNPROVIDED );
            }
            var70 = var70.rest();
            var71 = var70.first();
          }
        }
      }
      finally
      {
        module0015.$g533$.rebind( var67, var61 );
      }
      module0642.f39020( module0015.$g347$.getGlobalValue() );
      if( NIL != module0655.$g5094$.getDynamicValue( var61 ) && NIL != module0411.f28576( var1 ) )
      {
        f41992( var1 );
      }
    }
    return NIL;
  }

  public static SubLObject f41989(final SubLObject var15, final SubLObject var63, final SubLObject var64)
  {
    final SubLObject var65 = ONE_INTEGER.numE( var64 ) ? $ic99$ : PrintLow.format( NIL, $ic100$, inference_datastructures_inference_oc.f25629( var15 ) );
    final SubLObject var66 = f41993( var15, var63 );
    f41994( var66 );
    module0656.f39837( $ic54$, var15, $ic48$, var65, UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  public static SubLObject f41993(final SubLObject var15, final SubLObject var63)
  {
    if( NIL != inference_datastructures_inference_oc.f25754( var15 ) )
    {
      return $ic101$;
    }
    if( NIL != f41995( var15, var63 ) )
    {
      return $ic102$;
    }
    return $ic103$;
  }

  public static SubLObject f41994(final SubLObject var74)
  {
    final SubLThread var75 = SubLProcess.currentSubLThread();
    final SubLObject var76 = f41996( var74 );
    SubLObject var77 = NIL;
    if( var74.eql( $ic103$ ) )
    {
      var77 = $ic104$;
    }
    else if( var74.eql( $ic101$ ) )
    {
      var77 = $ic105$;
    }
    else if( var74.eql( $ic102$ ) )
    {
      var77 = $ic106$;
    }
    if( $ic103$ != var74 )
    {
      module0642.f39020( module0015.$g240$.getGlobalValue() );
      module0642.f39020( module0015.$g149$.getGlobalValue() );
      module0642.f39020( module0015.$g152$.getGlobalValue() );
      module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
      module0642.f39048( var76 );
      module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
      module0642.f39012( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject var78 = module0015.$g533$.currentBinding( var75 );
      try
      {
        module0015.$g533$.bind( T, var75 );
        module0683.f41675( $ic107$, var77, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      finally
      {
        module0015.$g533$.rebind( var78, var75 );
      }
      module0642.f39020( module0015.$g150$.getGlobalValue() );
      module0642.f39020( module0015.$g241$.getGlobalValue() );
    }
    return NIL;
  }

  public static SubLObject f41995(final SubLObject var15, final SubLObject var77)
  {
    SubLObject var78 = inference_datastructures_inference_oc.f25744( var15 );
    SubLObject var79 = NIL;
    var79 = var78.first();
    while ( NIL != var78)
    {
      if( NIL != module0077.f5320( var79, var77 ) )
      {
        return T;
      }
      var78 = var78.rest();
      var79 = var78.first();
    }
    return NIL;
  }

  public static SubLObject f41996(final SubLObject var74)
  {
    if( var74.eql( $ic103$ ) )
    {
      return NIL;
    }
    if( var74.eql( $ic101$ ) )
    {
      return $ic108$;
    }
    if( var74.eql( $ic102$ ) )
    {
      return $ic109$;
    }
    return NIL;
  }

  public static SubLObject f41988(final SubLObject var1)
  {
    final SubLObject var2 = inference_datastructures_inference_oc.f25590( var1 );
    final SubLObject var3 = module0077.f5313( Symbols.symbol_function( EQ ), inference_datastructures_inference_oc.f25665( var1 ) );
    SubLObject var4 = module0055.f4034( inference_datastructures_inference_oc.f25495( var1 ) );
    SubLObject var5 = NIL;
    var5 = var4.first();
    while ( NIL != var4)
    {
      module0077.f5326( var5, var3 );
      var4 = var4.rest();
      var5 = var4.first();
    }
    SubLObject var6 = NIL;
    final SubLObject var7 = inference_datastructures_inference_oc.f25492( var1 );
    if( NIL == module0065.f4772( var7, $ic110$ ) )
    {
      final SubLObject var79_80 = var7;
      if( NIL == module0065.f4775( var79_80, $ic110$ ) )
      {
        final SubLObject var8 = module0065.f4740( var79_80 );
        final SubLObject var9 = NIL;
        SubLObject var10;
        SubLObject var11;
        SubLObject var12;
        SubLObject var13;
        for( var10 = Sequences.length( var8 ), var11 = NIL, var11 = ZERO_INTEGER; var11.numL( var10 ); var11 = Numbers.add( var11, ONE_INTEGER ) )
        {
          var12 = ( ( NIL != var9 ) ? Numbers.subtract( var10, var11, ONE_INTEGER ) : var11 );
          var13 = Vectors.aref( var8, var12 );
          if( NIL == module0065.f4749( var13 ) || NIL == module0065.f4773( $ic110$ ) )
          {
            if( NIL != module0065.f4749( var13 ) )
            {
              var13 = $ic110$;
            }
            var6 = ConsesLow.cons( var13, var6 );
          }
        }
      }
      final SubLObject var86_87 = var7;
      if( NIL == module0065.f4777( var86_87 ) )
      {
        final SubLObject var14 = module0065.f4738( var86_87 );
        SubLObject var15 = NIL;
        SubLObject var16 = NIL;
        final Iterator var17 = Hashtables.getEntrySetIterator( var14 );
        try
        {
          while ( Hashtables.iteratorHasNext( var17 ))
          {
            final Map.Entry var18 = Hashtables.iteratorNextEntry( var17 );
            var15 = Hashtables.getEntryKey( var18 );
            var16 = Hashtables.getEntryValue( var18 );
            var6 = ConsesLow.cons( var16, var6 );
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( var17 );
        }
      }
    }
    var6 = Sort.sort( var6, Symbols.symbol_function( $ic111$ ), Symbols.symbol_function( $ic112$ ) );
    return Values.values( var6, var2, var3 );
  }

  public static SubLObject f41991(final SubLObject var44, final SubLObject var62)
  {
    final SubLObject var63 = inference_datastructures_inference_oc.f25687( var44 );
    f41997( var63, var62 );
    return NIL;
  }

  public static SubLObject f41992(final SubLObject var1)
  {
    final SubLObject var2 = module0411.f28578( var1 );
    module0642.f39019( $ic113$ );
    module0642.f39020( module0015.$g234$.getGlobalValue() );
    f41998( var2 );
    module0642.f39020( module0015.$g235$.getGlobalValue() );
    return NIL;
  }

  public static SubLObject f41998(final SubLObject var91)
  {
    if( var91.eql( $ic114$ ) )
    {
      module0642.f39019( $ic115$ );
    }
    else if( var91.eql( $ic116$ ) )
    {
      module0642.f39019( $ic117$ );
    }
    else if( var91.eql( $ic118$ ) )
    {
      module0642.f39019( $ic119$ );
    }
    else if( var91.eql( $ic120$ ) )
    {
      module0642.f39019( $ic121$ );
    }
    else if( var91.eql( $ic122$ ) )
    {
      module0642.f39019( $ic123$ );
    }
    else
    {
      module0642.f39019( $ic124$ );
    }
    return NIL;
  }

  public static SubLObject f41975(final SubLObject var24, SubLObject var92)
  {
    if( var92 == UNPROVIDED )
    {
      var92 = $ic125$;
    }
    module0642.f39019( $ic126$ );
    if( $ic125$ == var92 )
    {
      SubLObject var93 = var24;
      SubLObject var94 = NIL;
      var94 = var93.first();
      while ( NIL != var93)
      {
        if( !var94.eql( var24.first() ) )
        {
          module0642.f39032( UNPROVIDED );
        }
        module0642.f39020( module0015.$g459$.getGlobalValue() );
        f41999( var94 );
        module0642.f39020( module0015.$g460$.getGlobalValue() );
        var93 = var93.rest();
        var94 = var93.first();
      }
    }
    else
    {
      SubLObject var95 = NIL;
      SubLObject var96 = var92;
      SubLObject var97 = NIL;
      var97 = var96.first();
      while ( NIL != var96)
      {
        final SubLObject var98 = module0233.f15368( var97, var24 );
        if( NIL != var98 )
        {
          if( NIL != var95 )
          {
            module0642.f39032( UNPROVIDED );
          }
          else
          {
            var95 = T;
          }
          module0642.f39020( module0015.$g459$.getGlobalValue() );
          f41999( var98 );
          module0642.f39020( module0015.$g460$.getGlobalValue() );
        }
        var96 = var96.rest();
        var97 = var96.first();
      }
    }
    module0642.f39019( $ic69$ );
    return NIL;
  }

  public static SubLObject f41999(final SubLObject var93)
  {
    SubLObject var94 = NIL;
    SubLObject var95 = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var93, var93, $ic127$ );
    var94 = var93.first();
    final SubLObject var96 = var95 = var93.rest();
    module0642.f39019( $ic126$ );
    module0656.f39915( var94, UNPROVIDED, UNPROVIDED );
    module0642.f39019( $ic128$ );
    module0656.f39915( var95, UNPROVIDED, UNPROVIDED );
    module0642.f39019( $ic69$ );
    return var93;
  }

  public static SubLObject f41973(final SubLObject var24, SubLObject var92)
  {
    if( var92 == UNPROVIDED )
    {
      var92 = $ic125$;
    }
    final SubLThread var93 = SubLProcess.currentSubLThread();
    module0642.f39020( module0015.$g346$.getGlobalValue() );
    module0642.f39020( module0015.$g352$.getGlobalValue() );
    module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
    module0642.f39020( ZERO_INTEGER );
    module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
    module0642.f39020( module0015.$g353$.getGlobalValue() );
    module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
    module0642.f39020( ZERO_INTEGER );
    module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
    module0642.f39020( module0015.$g354$.getGlobalValue() );
    module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
    module0642.f39020( ZERO_INTEGER );
    module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
    module0642.f39012( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject var94 = module0015.$g533$.currentBinding( var93 );
    try
    {
      module0015.$g533$.bind( T, var93 );
      if( $ic125$ == var92 )
      {
        SubLObject var95 = var24;
        SubLObject var96 = NIL;
        var96 = var95.first();
        while ( NIL != var95)
        {
          f42000( var96 );
          var95 = var95.rest();
          var96 = var95.first();
        }
      }
      else
      {
        SubLObject var95 = var92;
        SubLObject var97 = NIL;
        var97 = var95.first();
        while ( NIL != var95)
        {
          final SubLObject var98 = module0233.f15368( var97, var24 );
          if( NIL != var98 )
          {
            f42000( var98 );
          }
          var95 = var95.rest();
          var97 = var95.first();
        }
      }
    }
    finally
    {
      module0015.$g533$.rebind( var94, var93 );
    }
    module0642.f39020( module0015.$g347$.getGlobalValue() );
    return NIL;
  }

  public static SubLObject f42000(final SubLObject var93)
  {
    final SubLThread var94 = SubLProcess.currentSubLThread();
    SubLObject var95 = NIL;
    SubLObject var96 = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var93, var93, $ic127$ );
    var95 = var93.first();
    final SubLObject var97 = var96 = var93.rest();
    module0642.f39020( module0015.$g364$.getGlobalValue() );
    module0642.f39012( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject var98 = module0015.$g533$.currentBinding( var94 );
    try
    {
      module0015.$g533$.bind( T, var94 );
      module0642.f39020( module0015.$g360$.getGlobalValue() );
      module0642.f39020( module0015.$g370$.getGlobalValue() );
      module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
      module0642.f39020( module0642.f39049( $ic129$ ) );
      module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
      module0642.f39020( module0015.$g373$.getGlobalValue() );
      module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
      module0642.f39020( module0642.f39049( $ic91$ ) );
      module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
      module0642.f39012( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject var26_102 = module0015.$g533$.currentBinding( var94 );
      try
      {
        module0015.$g533$.bind( T, var94 );
        module0642.f39020( module0015.$g459$.getGlobalValue() );
        module0642.f39019( var95 );
        module0642.f39020( module0015.$g460$.getGlobalValue() );
      }
      finally
      {
        module0015.$g533$.rebind( var26_102, var94 );
      }
      module0642.f39020( module0015.$g361$.getGlobalValue() );
      module0642.f39020( module0015.$g360$.getGlobalValue() );
      module0642.f39020( module0015.$g370$.getGlobalValue() );
      module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
      module0642.f39020( module0642.f39049( $ic130$ ) );
      module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
      module0642.f39020( module0015.$g373$.getGlobalValue() );
      module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
      module0642.f39020( module0642.f39049( $ic91$ ) );
      module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
      module0642.f39012( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject var26_103 = module0015.$g533$.currentBinding( var94 );
      try
      {
        module0015.$g533$.bind( T, var94 );
        module0642.f39027( $ic131$, UNPROVIDED );
        module0642.f39027( $ic132$, UNPROVIDED );
        module0642.f39027( $ic131$, UNPROVIDED );
      }
      finally
      {
        module0015.$g533$.rebind( var26_103, var94 );
      }
      module0642.f39020( module0015.$g361$.getGlobalValue() );
      module0642.f39020( module0015.$g360$.getGlobalValue() );
      module0642.f39046( module0015.$g369$.getGlobalValue() );
      module0642.f39020( module0015.$g370$.getGlobalValue() );
      module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
      module0642.f39020( module0642.f39049( $ic90$ ) );
      module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
      module0642.f39020( module0015.$g373$.getGlobalValue() );
      module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
      module0642.f39020( module0642.f39049( $ic91$ ) );
      module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
      module0642.f39012( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject var26_104 = module0015.$g533$.currentBinding( var94 );
      try
      {
        module0015.$g533$.bind( T, var94 );
        module0656.f39915( var96, ZERO_INTEGER, T );
      }
      finally
      {
        module0015.$g533$.rebind( var26_104, var94 );
      }
      module0642.f39020( module0015.$g361$.getGlobalValue() );
    }
    finally
    {
      module0015.$g533$.rebind( var98, var94 );
    }
    module0642.f39020( module0015.$g365$.getGlobalValue() );
    module0642.f39029( UNPROVIDED );
    return var93;
  }

  public static SubLObject f42001(final SubLObject var24, SubLObject var92)
  {
    if( var92 == UNPROVIDED )
    {
      var92 = $ic125$;
    }
    final SubLThread var93 = SubLProcess.currentSubLThread();
    module0642.f39020( module0015.$g346$.getGlobalValue() );
    module0642.f39020( module0015.$g352$.getGlobalValue() );
    module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
    module0642.f39020( ZERO_INTEGER );
    module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
    module0642.f39020( module0015.$g353$.getGlobalValue() );
    module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
    module0642.f39020( TWO_INTEGER );
    module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
    module0642.f39020( module0015.$g354$.getGlobalValue() );
    module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
    module0642.f39020( FOUR_INTEGER );
    module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
    module0642.f39012( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject var94 = module0015.$g533$.currentBinding( var93 );
    try
    {
      module0015.$g533$.bind( T, var93 );
      module0642.f39020( module0015.$g364$.getGlobalValue() );
      module0642.f39012( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject var26_105 = module0015.$g533$.currentBinding( var93 );
      try
      {
        module0015.$g533$.bind( T, var93 );
        f41990( var92, var24, UNPROVIDED );
      }
      finally
      {
        module0015.$g533$.rebind( var26_105, var93 );
      }
      module0642.f39020( module0015.$g365$.getGlobalValue() );
      module0642.f39029( UNPROVIDED );
      module0642.f39020( module0015.$g364$.getGlobalValue() );
      module0642.f39012( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject var26_106 = module0015.$g533$.currentBinding( var93 );
      try
      {
        module0015.$g533$.bind( T, var93 );
        f41997( var24, var92 );
      }
      finally
      {
        module0015.$g533$.rebind( var26_106, var93 );
      }
      module0642.f39020( module0015.$g365$.getGlobalValue() );
      module0642.f39029( UNPROVIDED );
    }
    finally
    {
      module0015.$g533$.rebind( var94, var93 );
    }
    module0642.f39020( module0015.$g347$.getGlobalValue() );
    return NIL;
  }

  public static SubLObject f41990(final SubLObject var92, SubLObject var24, SubLObject var107)
  {
    if( var24 == UNPROVIDED )
    {
      var24 = NIL;
    }
    if( var107 == UNPROVIDED )
    {
      var107 = NIL;
    }
    if( $ic125$ == var92 )
    {
      SubLObject var108 = var24;
      SubLObject var109 = NIL;
      var109 = var108.first();
      while ( NIL != var108)
      {
        f42002( module0233.f15355( var109 ), var107 );
        var108 = var108.rest();
        var109 = var108.first();
      }
    }
    else
    {
      SubLObject var108 = var92;
      SubLObject var110 = NIL;
      var110 = var108.first();
      while ( NIL != var108)
      {
        f42002( var110, var107 );
        var108 = var108.rest();
        var110 = var108.first();
      }
    }
    return NIL;
  }

  public static SubLObject f41997(final SubLObject var24, SubLObject var92)
  {
    if( var92 == UNPROVIDED )
    {
      var92 = $ic125$;
    }
    if( $ic125$ == var92 )
    {
      SubLObject var93 = var24;
      SubLObject var94 = NIL;
      var94 = var93.first();
      while ( NIL != var93)
      {
        f42003( module0233.f15370( var94 ) );
        var93 = var93.rest();
        var94 = var93.first();
      }
    }
    else
    {
      SubLObject var93 = var92;
      SubLObject var95 = NIL;
      var95 = var93.first();
      while ( NIL != var93)
      {
        final SubLObject var96 = module0233.f15368( var95, var24 );
        if( NIL != var96 )
        {
          f42003( module0233.f15370( var96 ) );
        }
        else
        {
          f42004();
        }
        var93 = var93.rest();
        var95 = var93.first();
      }
    }
    return NIL;
  }

  public static SubLObject f42002(final SubLObject var98, SubLObject var107)
  {
    if( var107 == UNPROVIDED )
    {
      var107 = NIL;
    }
    final SubLThread var108 = SubLProcess.currentSubLThread();
    module0642.f39020( module0015.$g360$.getGlobalValue() );
    module0642.f39020( module0015.$g370$.getGlobalValue() );
    module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
    module0642.f39020( module0642.f39049( $ic90$ ) );
    module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
    module0642.f39020( module0015.$g373$.getGlobalValue() );
    module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
    module0642.f39020( module0642.f39049( $ic91$ ) );
    module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
    module0642.f39012( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject var109 = module0015.$g533$.currentBinding( var108 );
    try
    {
      module0015.$g533$.bind( T, var108 );
      module0642.f39020( module0015.$g459$.getGlobalValue() );
      if( NIL != var107 )
      {
        module0642.f39021( var98 );
      }
      else
      {
        module0642.f39019( var98 );
      }
      module0642.f39020( module0015.$g460$.getGlobalValue() );
    }
    finally
    {
      module0015.$g533$.rebind( var109, var108 );
    }
    module0642.f39020( module0015.$g361$.getGlobalValue() );
    return var98;
  }

  public static SubLObject f42003(final SubLObject var99)
  {
    final SubLThread var100 = SubLProcess.currentSubLThread();
    module0642.f39020( module0015.$g360$.getGlobalValue() );
    module0642.f39020( module0015.$g370$.getGlobalValue() );
    module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
    module0642.f39020( module0642.f39049( $ic90$ ) );
    module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
    module0642.f39020( module0015.$g373$.getGlobalValue() );
    module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
    module0642.f39020( module0642.f39049( $ic91$ ) );
    module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
    module0642.f39012( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject var101 = module0015.$g533$.currentBinding( var100 );
    try
    {
      module0015.$g533$.bind( T, var100 );
      module0656.f39915( var99, ZERO_INTEGER, T );
    }
    finally
    {
      module0015.$g533$.rebind( var101, var100 );
    }
    module0642.f39020( module0015.$g361$.getGlobalValue() );
    return var99;
  }

  public static SubLObject f42004()
  {
    final SubLThread var19 = SubLProcess.currentSubLThread();
    module0642.f39020( module0015.$g360$.getGlobalValue() );
    module0642.f39020( module0015.$g370$.getGlobalValue() );
    module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
    module0642.f39020( module0642.f39049( $ic90$ ) );
    module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
    module0642.f39020( module0015.$g373$.getGlobalValue() );
    module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
    module0642.f39020( module0642.f39049( $ic91$ ) );
    module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
    module0642.f39012( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject var20 = module0015.$g533$.currentBinding( var19 );
    try
    {
      module0015.$g533$.bind( T, var19 );
      module0642.f39032( UNPROVIDED );
    }
    finally
    {
      module0015.$g533$.rebind( var20, var19 );
    }
    module0642.f39020( module0015.$g361$.getGlobalValue() );
    return NIL;
  }

  public static SubLObject f42005(final SubLObject var108)
  {
    final SubLThread var109 = SubLProcess.currentSubLThread();
    module0642.f39020( module0015.$g346$.getGlobalValue() );
    module0642.f39020( module0015.$g353$.getGlobalValue() );
    module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
    module0642.f39020( TWO_INTEGER );
    module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
    module0642.f39020( module0015.$g354$.getGlobalValue() );
    module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
    module0642.f39020( ZERO_INTEGER );
    module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
    module0642.f39012( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject var110 = module0015.$g533$.currentBinding( var109 );
    try
    {
      module0015.$g533$.bind( T, var109 );
      module0642.f39020( module0015.$g364$.getGlobalValue() );
      module0642.f39012( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject var26_109 = module0015.$g533$.currentBinding( var109 );
      try
      {
        module0015.$g533$.bind( T, var109 );
        SubLObject var111 = var108;
        SubLObject var112 = NIL;
        var112 = var111.first();
        while ( NIL != var111)
        {
          SubLObject var114;
          final SubLObject var113 = var114 = var112;
          SubLObject var115 = NIL;
          SubLObject var116 = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( var114, var113, $ic133$ );
          var115 = var114.first();
          var114 = ( var116 = var114.rest() );
          module0642.f39020( module0015.$g360$.getGlobalValue() );
          module0642.f39020( module0015.$g370$.getGlobalValue() );
          module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
          module0642.f39020( module0642.f39049( $ic130$ ) );
          module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
          module0642.f39020( module0015.$g373$.getGlobalValue() );
          module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
          module0642.f39020( module0642.f39049( $ic91$ ) );
          module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
          module0642.f39012( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject var26_110 = module0015.$g533$.currentBinding( var109 );
          try
          {
            module0015.$g533$.bind( T, var109 );
            module0642.f39020( module0015.$g459$.getGlobalValue() );
            module0642.f39019( var116 );
            module0642.f39020( module0015.$g460$.getGlobalValue() );
          }
          finally
          {
            module0015.$g533$.rebind( var26_110, var109 );
          }
          module0642.f39020( module0015.$g361$.getGlobalValue() );
          var111 = var111.rest();
          var112 = var111.first();
        }
      }
      finally
      {
        module0015.$g533$.rebind( var26_109, var109 );
      }
      module0642.f39020( module0015.$g365$.getGlobalValue() );
      module0642.f39029( UNPROVIDED );
      module0642.f39020( module0015.$g364$.getGlobalValue() );
      module0642.f39012( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject var26_111 = module0015.$g533$.currentBinding( var109 );
      try
      {
        module0015.$g533$.bind( T, var109 );
        SubLObject var111 = var108;
        SubLObject var112 = NIL;
        var112 = var111.first();
        while ( NIL != var111)
        {
          module0642.f39020( module0015.$g360$.getGlobalValue() );
          module0642.f39020( module0015.$g370$.getGlobalValue() );
          module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
          module0642.f39020( module0642.f39049( $ic130$ ) );
          module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
          module0642.f39020( module0015.$g373$.getGlobalValue() );
          module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
          module0642.f39020( module0642.f39049( $ic91$ ) );
          module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
          module0642.f39012( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject var26_112 = module0015.$g533$.currentBinding( var109 );
          try
          {
            module0015.$g533$.bind( T, var109 );
            module0642.f39027( $ic134$, UNPROVIDED );
          }
          finally
          {
            module0015.$g533$.rebind( var26_112, var109 );
          }
          module0642.f39020( module0015.$g361$.getGlobalValue() );
          var111 = var111.rest();
          var112 = var111.first();
        }
      }
      finally
      {
        module0015.$g533$.rebind( var26_111, var109 );
      }
      module0642.f39020( module0015.$g365$.getGlobalValue() );
      module0642.f39029( UNPROVIDED );
      module0642.f39020( module0015.$g364$.getGlobalValue() );
      module0642.f39012( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject var26_113 = module0015.$g533$.currentBinding( var109 );
      try
      {
        module0015.$g533$.bind( T, var109 );
        SubLObject var111 = var108;
        SubLObject var112 = NIL;
        var112 = var111.first();
        while ( NIL != var111)
        {
          SubLObject var118;
          final SubLObject var117 = var118 = var112;
          SubLObject var115 = NIL;
          SubLObject var116 = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( var118, var117, $ic133$ );
          var115 = var118.first();
          var118 = ( var116 = var118.rest() );
          module0642.f39020( module0015.$g360$.getGlobalValue() );
          module0642.f39020( module0015.$g370$.getGlobalValue() );
          module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
          module0642.f39020( module0642.f39049( $ic130$ ) );
          module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
          module0642.f39020( module0015.$g373$.getGlobalValue() );
          module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
          module0642.f39020( module0642.f39049( $ic91$ ) );
          module0642.f39012( Characters.CHAR_quotation, UNPROVIDED );
          module0642.f39012( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject var26_114 = module0015.$g533$.currentBinding( var109 );
          try
          {
            module0015.$g533$.bind( T, var109 );
            module0642.f39020( module0015.$g459$.getGlobalValue() );
            module0642.f39019( var115 );
            module0642.f39020( module0015.$g460$.getGlobalValue() );
          }
          finally
          {
            module0015.$g533$.rebind( var26_114, var109 );
          }
          module0642.f39020( module0015.$g361$.getGlobalValue() );
          var111 = var111.rest();
          var112 = var111.first();
        }
      }
      finally
      {
        module0015.$g533$.rebind( var26_113, var109 );
      }
      module0642.f39020( module0015.$g365$.getGlobalValue() );
      module0642.f39029( UNPROVIDED );
    }
    finally
    {
      module0015.$g533$.rebind( var110, var109 );
    }
    module0642.f39020( module0015.$g347$.getGlobalValue() );
    return NIL;
  }

  public static SubLObject f42006()
  {
    SubLFiles.declareFunction(me, "f41964", "S#45673", 1, 1, false );
    SubLFiles.declareFunction(me, "f41965", "S#45669", 1, 0, false );
    SubLFiles.declareFunction(me, "f41966", "S#45670", 1, 0, false );
    SubLFiles.declareFunction(me, "f41967", "CB-INFERENCE-ANSWER", 1, 0, false );
    SubLFiles.declareFunction(me, "f41970", "S#45967", 1, 3, false );
    SubLFiles.declareFunction(me, "f41971", "S#45968", 1, 2, false );
    SubLFiles.declareFunction(me, "f41968", "S#45969", 3, 0, false );
    SubLFiles.declareFunction(me, "f41972", "S#45970", 2, 0, false );
    SubLFiles.declareFunction(me, "f41974", "S#45971", 1, 0, false );
    SubLFiles.declareFunction(me, "f41969", "S#45972", 1, 0, false );
    SubLFiles.declareFunction(me, "f41976", "S#45973", 1, 0, false );
    SubLFiles.declareFunction(me, "f41979", "S#45974", 0, 1, false );
    SubLFiles.declareFunction(me, "f41977", "S#45975", 1, 0, false );
    SubLFiles.declareFunction(me, "f41980", "CB-SOCRATIC-QUERY-FROM-ANSWER", 1, 0, false );
    SubLFiles.declareFunction(me, "f41981", "S#45976", 1, 1, false );
    SubLFiles.declareFunction(me, "f41982", "CB-INFERENCE-ANSWER-FULL-JUSTIFICATION", 1, 0, false );
    SubLFiles.declareFunction(me, "f41985", "S#45977", 1, 3, false );
    SubLFiles.declareFunction(me, "f41986", "S#45978", 1, 0, false );
    SubLFiles.declareFunction(me, "f41983", "S#45979", 4, 0, false );
    SubLFiles.declareFunction(me, "f41984", "S#45980", 1, 0, false );
    SubLFiles.declareFunction(me, "f41978", "S#45981", 1, 0, false );
    SubLFiles.declareFunction(me, "f41987", "S#45676", 2, 0, false );
    SubLFiles.declareFunction(me, "f41989", "S#45683", 3, 0, false );
    SubLFiles.declareFunction(me, "f41993", "S#45982", 2, 0, false );
    SubLFiles.declareFunction(me, "f41994", "S#45983", 1, 0, false );
    SubLFiles.declareFunction(me, "f41995", "S#45984", 2, 0, false );
    SubLFiles.declareFunction(me, "f41996", "S#45985", 1, 0, false );
    SubLFiles.declareFunction(me, "f41988", "S#45681", 1, 0, false );
    SubLFiles.declareFunction(me, "f41991", "S#45684", 2, 0, false );
    SubLFiles.declareFunction(me, "f41992", "S#45986", 1, 0, false );
    SubLFiles.declareFunction(me, "f41998", "S#45987", 1, 0, false );
    SubLFiles.declareFunction(me, "f41975", "S#45988", 1, 1, false );
    SubLFiles.declareFunction(me, "f41999", "S#45989", 1, 0, false );
    SubLFiles.declareFunction(me, "f41973", "S#45990", 1, 1, false );
    SubLFiles.declareFunction(me, "f42000", "S#45991", 1, 0, false );
    SubLFiles.declareFunction(me, "f42001", "S#45992", 1, 1, false );
    SubLFiles.declareFunction(me, "f41990", "S#45682", 1, 2, false );
    SubLFiles.declareFunction(me, "f41997", "S#45993", 1, 1, false );
    SubLFiles.declareFunction(me, "f42002", "S#45994", 1, 1, false );
    SubLFiles.declareFunction(me, "f42003", "S#45995", 1, 0, false );
    SubLFiles.declareFunction(me, "f42004", "S#45996", 0, 0, false );
    SubLFiles.declareFunction(me, "f42005", "S#45997", 1, 0, false );
    return NIL;
  }

  public static SubLObject f42007()
  {
    $g5387$ = SubLFiles.defparameter( "S#45998", NIL );
    return NIL;
  }

  public static SubLObject f42008()
  {
    module0015.f873( $ic45$ );
    module0656.f39840( $ic54$, $ic55$, FOUR_INTEGER );
    Structures.register_method( module0656.$g5160$.getGlobalValue(), inference_datastructures_inference_oc.$g3151$.getGlobalValue(), Symbols.symbol_function( $ic56$ ) );
    module0015.f873( $ic73$ );
    module0656.f39840( $ic59$, $ic76$, TWO_INTEGER );
    module0015.f873( $ic79$ );
    module0656.f39840( $ic65$, $ic84$, FOUR_INTEGER );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    f42006();
  }

  @Override
  public void initializeVariables()
  {
    f42007();
  }

  @Override
  public void runTopLevelForms()
  {
    f42008();
  }
  static
  {
    me = new cb_query_browser_oc();
    $g5387$ = null;
    $ic0$ = makeKeyword( "SILK" );
    $ic1$ = makeString( "SILK Query :" );
    $ic2$ = makeString( "Mt :" );
    $ic3$ = makeString( "EL Query :" );
    $ic4$ = makeString( "Pragmatics :" );
    $ic5$ = makeSymbol( "S#26560", "CYC" );
    $ic6$ = makeKeyword( "NEW" );
    $ic7$ = makeString( "New" );
    $ic8$ = makeKeyword( "PREPARED" );
    $ic9$ = makeString( "Prepared" );
    $ic10$ = makeKeyword( "READY" );
    $ic11$ = makeString( "Ready" );
    $ic12$ = makeKeyword( "RUNNING" );
    $ic13$ = makeString( "Running" );
    $ic14$ = makeKeyword( "SUSPENDED" );
    $ic15$ = makeString( "Suspended" );
    $ic16$ = makeKeyword( "DEAD" );
    $ic17$ = makeString( "Dead" );
    $ic18$ = makeKeyword( "TAUTOLOGY" );
    $ic19$ = makeString( "Tautology" );
    $ic20$ = makeKeyword( "CONTRADICTION" );
    $ic21$ = makeString( "Contradiction" );
    $ic22$ = makeKeyword( "ILL-FORMED" );
    $ic23$ = makeString( "Ill-Formed" );
    $ic24$ = makeSymbol( "S#26563", "CYC" );
    $ic25$ = makeKeyword( "ABORT" );
    $ic26$ = makeString( "Abort" );
    $ic27$ = makeKeyword( "INTERRUPT" );
    $ic28$ = makeString( "Interrupt" );
    $ic29$ = makeKeyword( "MAX-NUMBER" );
    $ic30$ = makeString( "Max Number" );
    $ic31$ = makeKeyword( "MAX-TIME" );
    $ic32$ = makeString( "Max Time" );
    $ic33$ = makeKeyword( "MAX-STEP" );
    $ic34$ = makeString( "Max Step" );
    $ic35$ = makeKeyword( "MAX-PROBLEM-COUNT" );
    $ic36$ = makeString( "Max Problem Count" );
    $ic37$ = makeKeyword( "PROBABLY-APPROXIMATELY-DONE" );
    $ic38$ = makeString( "Probably Approximately Done" );
    $ic39$ = makeKeyword( "EXHAUST" );
    $ic40$ = makeString( "Exhaust" );
    $ic41$ = makeKeyword( "EXHAUST-TOTAL" );
    $ic42$ = makeString( "Exhaust Total" );
    $ic43$ = ConsesLow.list( makeSymbol( "S#45911", "CYC" ), makeSymbol( "S#45912", "CYC" ), makeSymbol( "S#45999", "CYC" ) );
    $ic44$ = makeString( "~A did not specify an inference answer" );
    $ic45$ = makeSymbol( "CB-INFERENCE-ANSWER" );
    $ic46$ = makeKeyword( "MAIN" );
    $ic47$ = makeKeyword( "TERSE" );
    $ic48$ = makeKeyword( "MINIMAL" );
    $ic49$ = makeString( "[~A.~A.~A]" );
    $ic50$ = makeString( "[Inference Answer ~A.~A.~A]" );
    $ic51$ = makeKeyword( "VERBOSE" );
    $ic52$ = makeString( "[Inference Answer ~A.~A.~A ~A]" );
    $ic53$ = makeString( "cb-inference-answer&~A&~A&~A" );
    $ic54$ = makeKeyword( "INFERENCE-ANSWER" );
    $ic55$ = makeSymbol( "S#45967", "CYC" );
    $ic56$ = makeSymbol( "S#45968", "CYC" );
    $ic57$ = makeString( "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">" );
    $ic58$ = makeString( "Inference Answer" );
    $ic59$ = makeKeyword( "SOCRATIC-QUERY-FROM-ANSWER" );
    $ic60$ = makeString( "[Socratic Query]" );
    $ic61$ = makeString( "Creation Time :  " );
    $ic62$ = makeString( "Steps to This Answer :  " );
    $ic63$ = makeString( "Answer Bindings :" );
    $ic64$ = makeString( "Justifications :" );
    $ic65$ = makeKeyword( "INFERENCE-ANSWER-FULL-JUSTIFICATION" );
    $ic66$ = makeString( "[Full]" );
    $ic67$ = makeString( "after" );
    $ic68$ = makeString( " (at " );
    $ic69$ = makeString( ")" );
    $ic70$ = makeSymbol( "S#4951", "CYC" );
    $ic71$ = makeString( " today" );
    $ic72$ = makeString( " on ~A" );
    $ic73$ = makeSymbol( "CB-SOCRATIC-QUERY-FROM-ANSWER" );
    $ic74$ = makeKeyword( "SELF" );
    $ic75$ = makeString( "cb-socratic-query-from-answer&~A&~A&~A" );
    $ic76$ = makeSymbol( "S#45976", "CYC" );
    $ic77$ = ConsesLow.list( makeSymbol( "S#45911", "CYC" ), makeSymbol( "S#45912", "CYC" ), makeSymbol( "S#45999", "CYC" ), makeSymbol( "S#46000", "CYC" ) );
    $ic78$ = makeString( "~A did not specify an inference answer justification" );
    $ic79$ = makeSymbol( "CB-INFERENCE-ANSWER-FULL-JUSTIFICATION" );
    $ic80$ = makeString( "[~A.~A.~A.~A]" );
    $ic81$ = makeString( "[Inference Answer ~A.~A.~A.~A]" );
    $ic82$ = makeString( "[Inference Answer ~A.~A.~A.~A ~A]" );
    $ic83$ = makeString( "cb-inference-answer-full-justification&~A&~A&~A&~A" );
    $ic84$ = makeSymbol( "S#45977", "CYC" );
    $ic85$ = makeString( "Inference Answer Full Justification" );
    $ic86$ = makeString( " for answer " );
    $ic87$ = makeString( "Answer Justification Mt~p : " );
    $ic88$ = makeString( "None found" );
    $ic89$ = makeString( "Full Justification :" );
    $ic90$ = makeKeyword( "LEFT" );
    $ic91$ = makeKeyword( "TOP" );
    $ic92$ = makeString( "Query was not yet proven" );
    $ic93$ = makeString( "Query was not proven" );
    $ic94$ = makeString( "No answers" );
    $ic95$ = makeString( "Query was proven" );
    $ic96$ = constant_handles_oc.f8479( makeString( "True" ) );
    $ic97$ = makeString( "Answer" );
    $ic98$ = makeString( "Answer Mt" );
    $ic99$ = makeString( "[Explain]" );
    $ic100$ = makeString( "[Explain #~A]" );
    $ic101$ = makeKeyword( "NEW-ANSWER" );
    $ic102$ = makeKeyword( "NEW-JUSTIFICATION" );
    $ic103$ = makeKeyword( "OLD" );
    $ic104$ = makeString( "Old answer" );
    $ic105$ = makeString( "New answer" );
    $ic106$ = makeString( "Old answer with a new justification" );
    $ic107$ = makeString( "*" );
    $ic108$ = makeKeyword( "YELLOW" );
    $ic109$ = makeKeyword( "GREEN" );
    $ic110$ = makeKeyword( "SKIP" );
    $ic111$ = makeSymbol( ">" );
    $ic112$ = makeSymbol( "S#28653", "CYC" );
    $ic113$ = makeString( "Weighing these arguments yields an overall result of: " );
    $ic114$ = makeKeyword( "TRUE-DEF" );
    $ic115$ = makeString( "True (default)" );
    $ic116$ = makeKeyword( "TRUE-MON" );
    $ic117$ = makeString( "True (monotonic)" );
    $ic118$ = makeKeyword( "FALSE-DEF" );
    $ic119$ = makeString( "False (default)" );
    $ic120$ = makeKeyword( "FALSE-MON" );
    $ic121$ = makeString( "False (monotonic)" );
    $ic122$ = makeKeyword( "UNKNOWN" );
    $ic123$ = makeString( "Unknown" );
    $ic124$ = makeString( "???" );
    $ic125$ = makeKeyword( "ALL" );
    $ic126$ = makeString( "(" );
    $ic127$ = ConsesLow.cons( makeSymbol( "VARIABLE" ), makeSymbol( "S#132", "CYC" ) );
    $ic128$ = makeString( " . " );
    $ic129$ = makeKeyword( "RIGHT" );
    $ic130$ = makeKeyword( "CENTER" );
    $ic131$ = makeKeyword( "NBSP" );
    $ic132$ = makeKeyword( "RIGHTWARDS-ARROW" );
    $ic133$ = ConsesLow.cons( makeSymbol( "S#46001", "CYC" ), makeSymbol( "S#46002", "CYC" ) );
    $ic134$ = makeKeyword( "UPWARDS-ARROW" );
  }
}
/*
 * DECOMPILATION REPORT
 *
 * Decompiled from:
 * G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/
 * cycjava/cycl/class Total time: 543 ms
 *
 * Decompiled with Procyon 0.5.32.
 */
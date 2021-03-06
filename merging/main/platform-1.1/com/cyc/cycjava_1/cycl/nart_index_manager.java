/***
 *   Copyright (c) 1995-2009 Cycorp Inc.
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *   
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 *  Substantial portions of this code were developed by the Cyc project
 *  and by Cycorp Inc, whose contribution is gratefully acknowledged.
*/

package com.cyc.cycjava_1.cycl;

import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.kb_object_manager;
//dm import com.cyc.cycjava_1.cycl.nart_handles;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;

public  final class nart_index_manager extends SubLTranslatedFile {

  //// Constructor

  private nart_index_manager() {}
  public static final SubLFile me = new nart_index_manager();
  public static final String myName = "com.cyc.cycjava_1.cycl.nart_index_manager";

  //// Definitions

  /** The KB object manager for nart indices */
  @SubL(source = "cycl/nart-index-manager.lisp", position = 1412) 
  private static SubLSymbol $nart_index_manager$ = null;

  /** Based on arete experiments, only 20% of all narts are touched during normal inference,
   so we'll make a conservative guess that every one of those touched the nart's index. */
  @SubL(source = "cycl/nart-index-manager.lisp", position = 1581) 
  private static SubLSymbol $nart_index_lru_size_percentage$ = null;

  @SubL(source = "cycl/nart-index-manager.lisp", position = 1849) 
  public static final SubLObject setup_nart_index_table(SubLObject size, SubLObject exactP) {
    $nart_index_manager$.setGlobalValue(kb_object_manager.new_kb_object_manager($str2$nart_index, size, $nart_index_lru_size_percentage$.getGlobalValue(), $sym3$LOAD_NART_INDEX_FROM_CACHE, exactP));
    return T;
  }

  /** Return the number of nart-indices whose content is cached in memory. */
  @SubL(source = "cycl/nart-index-manager.lisp", position = 2880) 
  public static final SubLObject cached_nart_index_count() {
    return kb_object_manager.cached_kb_object_count($nart_index_manager$.getGlobalValue());
  }

  @SubL(source = "cycl/nart-index-manager.lisp", position = 4538) 
  public static final SubLObject swap_out_all_pristine_nart_indices() {
    return kb_object_manager.swap_out_all_pristine_kb_objects_int($nart_index_manager$.getGlobalValue());
  }

  @SubL(source = "cycl/nart-index-manager.lisp", position = 4664) 
  public static final SubLObject initialize_nart_index_hl_store_cache() {
    return kb_object_manager.initialize_kb_object_hl_store_cache($nart_index_manager$.getGlobalValue(), $str4$nat_indices, $str5$nat_indices_index);
  }

  public static final SubLObject declare_nart_index_manager_file() {
    declareFunction("setup_nart_index_table", "SETUP-NART-INDEX-TABLE", 2, 0, false);
    declareFunction("optimize_nart_index_table", "OPTIMIZE-NART-INDEX-TABLE", 1, 0, false);
    declareFunction("clear_nart_index_table", "CLEAR-NART-INDEX-TABLE", 0, 0, false);
    declareFunction("maintain_nart_index_usage_counts", "MAINTAIN-NART-INDEX-USAGE-COUNTS", 0, 0, false);
    declareFunction("dont_maintain_nart_index_usage_counts", "DONT-MAINTAIN-NART-INDEX-USAGE-COUNTS", 0, 0, false);
    declareFunction("nart_index_usage_counts_enabled_p", "NART-INDEX-USAGE-COUNTS-ENABLED-P", 0, 0, false);
    declareFunction("cached_nart_index_count", "CACHED-NART-INDEX-COUNT", 0, 0, false);
    declareFunction("nart_indices_completely_cachedP", "NART-INDICES-COMPLETELY-CACHED?", 0, 0, false);
    declareFunction("lookup_nart_index", "LOOKUP-NART-INDEX", 1, 0, false);
    declareFunction("register_nart_index", "REGISTER-NART-INDEX", 2, 0, false);
    declareFunction("deregister_nart_index", "DEREGISTER-NART-INDEX", 1, 0, false);
    declareFunction("mark_nart_index_as_muted", "MARK-NART-INDEX-AS-MUTED", 1, 0, false);
    declareFunction("meter_nart_index_swap_time", "METER-NART-INDEX-SWAP-TIME", 0, 0, false);
    declareFunction("dont_meter_nart_index_swap_time", "DONT-METER-NART-INDEX-SWAP-TIME", 0, 0, false);
    declareFunction("clear_nart_index_swap_time", "CLEAR-NART-INDEX-SWAP-TIME", 0, 0, false);
    declareFunction("current_nart_index_swap_time", "CURRENT-NART-INDEX-SWAP-TIME", 0, 0, false);
    declareFunction("swap_out_all_pristine_nart_indices", "SWAP-OUT-ALL-PRISTINE-NART-INDICES", 0, 0, false);
    declareFunction("initialize_nart_index_hl_store_cache", "INITIALIZE-NART-INDEX-HL-STORE-CACHE", 0, 0, false);
    return NIL;
  }

  public static final SubLObject init_nart_index_manager_file() {
    $nart_index_manager$ = deflexical("*NART-INDEX-MANAGER*", maybeDefault( $sym0$_NART_INDEX_MANAGER_, $nart_index_manager$, ()-> ($kw1$UNINITIALIZED)));
    $nart_index_lru_size_percentage$ = deflexical("*NART-INDEX-LRU-SIZE-PERCENTAGE*", TWENTY_INTEGER);
    return NIL;
  }

  public static final SubLObject setup_nart_index_manager_file() {
        subl_macro_promotions.declare_defglobal($sym0$_NART_INDEX_MANAGER_);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$_NART_INDEX_MANAGER_ = makeSymbol("*NART-INDEX-MANAGER*");
  public static final SubLSymbol $kw1$UNINITIALIZED = makeKeyword("UNINITIALIZED");
  public static final SubLString $str2$nart_index = makeString("nart-index");
  public static final SubLSymbol $sym3$LOAD_NART_INDEX_FROM_CACHE = makeSymbol("LOAD-NART-INDEX-FROM-CACHE");
  public static final SubLString $str4$nat_indices = makeString("nat-indices");
  public static final SubLString $str5$nat_indices_index = makeString("nat-indices-index");

  //// Initializers

  public void declareFunctions() {
    declare_nart_index_manager_file();
  }

  public void initializeVariables() {
    init_nart_index_manager_file();
  }

  public void runTopLevelForms() {
    setup_nart_index_manager_file();
  }

}

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
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.unrepresented_terms;

public  final class unrepresented_term_index_manager extends SubLTranslatedFile {

  //// Constructor

  private unrepresented_term_index_manager() {}
  public static final SubLFile me = new unrepresented_term_index_manager();
  public static final String myName = "com.cyc.cycjava_1.cycl.unrepresented_term_index_manager";

  //// Definitions

  /** The KB object manager for unrepresented-term indices */
  @SubL(source = "cycl/unrepresented-term-index-manager.lisp", position = 1650) 
  private static SubLSymbol $unrepresented_term_index_manager$ = null;

  /** Wild guess */
  @SubL(source = "cycl/unrepresented-term-index-manager.lisp", position = 1861) 
  private static SubLSymbol $unrepresented_term_index_lru_size_percentage$ = null;

  @SubL(source = "cycl/unrepresented-term-index-manager.lisp", position = 1978) 
  public static final SubLObject setup_unrepresented_term_index_table(SubLObject size, SubLObject exactP) {
    $unrepresented_term_index_manager$.setGlobalValue(kb_object_manager.new_kb_object_manager($str2$unrepresented_term_index, size, $unrepresented_term_index_lru_size_percentage$.getGlobalValue(), $sym3$LOAD_UNREPRESENTED_TERM_INDEX_FROM_CACHE, exactP));
    return T;
  }

  @SubL(source = "cycl/unrepresented-term-index-manager.lisp", position = 2485) 
  public static final SubLObject clear_unrepresented_term_index_table() {
    return kb_object_manager.clear_kb_object_content_table($unrepresented_term_index_manager$.getGlobalValue());
  }

  /** Return the number of unrepresented-term-indices whose content is cached in memory. */
  @SubL(source = "cycl/unrepresented-term-index-manager.lisp", position = 3289) 
  public static final SubLObject cached_unrepresented_term_index_count() {
    return kb_object_manager.cached_kb_object_count($unrepresented_term_index_manager$.getGlobalValue());
  }

  @SubL(source = "cycl/unrepresented-term-index-manager.lisp", position = 3667) 
  public static final SubLObject lookup_unrepresented_term_index(SubLObject id) {
    return kb_object_manager.lookup_kb_object_content($unrepresented_term_index_manager$.getGlobalValue(), id);
  }

  /** Note that ID will be used as the id for UNREPRESENTED-TERM-INDEX. */
  @SubL(source = "cycl/unrepresented-term-index-manager.lisp", position = 3797) 
  public static final SubLObject register_unrepresented_term_index(SubLObject id, SubLObject unrepresented_term_index) {
    return kb_object_manager.register_kb_object_content($unrepresented_term_index_manager$.getGlobalValue(), id, unrepresented_term_index);
  }

  /** Note that ID is not in use as an UNREPRESENTED-TERM-INDEX id */
  @SubL(source = "cycl/unrepresented-term-index-manager.lisp", position = 4075) 
  public static final SubLObject deregister_unrepresented_term_index(SubLObject id) {
    return kb_object_manager.deregister_kb_object_content($unrepresented_term_index_manager$.getGlobalValue(), id);
  }

  @SubL(source = "cycl/unrepresented-term-index-manager.lisp", position = 4278) 
  public static final SubLObject mark_unrepresented_term_index_as_muted(SubLObject id) {
    return kb_object_manager.mark_kb_object_content_as_muted($unrepresented_term_index_manager$.getGlobalValue(), id);
  }

  @SubL(source = "cycl/unrepresented-term-index-manager.lisp", position = 5370) 
  public static final SubLObject swap_out_all_pristine_unrepresented_term_indices() {
    return kb_object_manager.swap_out_all_pristine_kb_objects_int($unrepresented_term_index_manager$.getGlobalValue());
  }

  @SubL(source = "cycl/unrepresented-term-index-manager.lisp", position = 5524) 
  public static final SubLObject initialize_unrepresented_term_index_hl_store_cache() {
    return kb_object_manager.initialize_kb_object_hl_store_cache($unrepresented_term_index_manager$.getGlobalValue(), $str4$unrepresented_term_indices, $str5$unrepresented_term_indices_index);
  }

  public static final SubLObject declare_unrepresented_term_index_manager_file() {
    declareFunction("setup_unrepresented_term_index_table", "SETUP-UNREPRESENTED-TERM-INDEX-TABLE", 2, 0, false);
    declareFunction("optimize_unrepresented_term_index_table", "OPTIMIZE-UNREPRESENTED-TERM-INDEX-TABLE", 1, 0, false);
    declareFunction("clear_unrepresented_term_index_table", "CLEAR-UNREPRESENTED-TERM-INDEX-TABLE", 0, 0, false);
    declareFunction("maintain_unrepresented_term_index_usage_counts", "MAINTAIN-UNREPRESENTED-TERM-INDEX-USAGE-COUNTS", 0, 0, false);
    declareFunction("dont_maintain_unrepresented_term_index_usage_counts", "DONT-MAINTAIN-UNREPRESENTED-TERM-INDEX-USAGE-COUNTS", 0, 0, false);
    declareFunction("unrepresented_term_index_usage_counts_enabled_p", "UNREPRESENTED-TERM-INDEX-USAGE-COUNTS-ENABLED-P", 0, 0, false);
    declareFunction("cached_unrepresented_term_index_count", "CACHED-UNREPRESENTED-TERM-INDEX-COUNT", 0, 0, false);
    declareFunction("unrepresented_term_indices_completely_cachedP", "UNREPRESENTED-TERM-INDICES-COMPLETELY-CACHED?", 0, 0, false);
    declareFunction("lookup_unrepresented_term_index", "LOOKUP-UNREPRESENTED-TERM-INDEX", 1, 0, false);
    declareFunction("register_unrepresented_term_index", "REGISTER-UNREPRESENTED-TERM-INDEX", 2, 0, false);
    declareFunction("deregister_unrepresented_term_index", "DEREGISTER-UNREPRESENTED-TERM-INDEX", 1, 0, false);
    declareFunction("mark_unrepresented_term_index_as_muted", "MARK-UNREPRESENTED-TERM-INDEX-AS-MUTED", 1, 0, false);
    declareFunction("meter_unrepresented_term_index_swap_time", "METER-UNREPRESENTED-TERM-INDEX-SWAP-TIME", 0, 0, false);
    declareFunction("dont_meter_unrepresented_term_index_swap_time", "DONT-METER-UNREPRESENTED-TERM-INDEX-SWAP-TIME", 0, 0, false);
    declareFunction("clear_unrepresented_term_index_swap_time", "CLEAR-UNREPRESENTED-TERM-INDEX-SWAP-TIME", 0, 0, false);
    declareFunction("current_unrepresented_term_index_swap_time", "CURRENT-UNREPRESENTED-TERM-INDEX-SWAP-TIME", 0, 0, false);
    declareFunction("swap_out_all_pristine_unrepresented_term_indices", "SWAP-OUT-ALL-PRISTINE-UNREPRESENTED-TERM-INDICES", 0, 0, false);
    declareFunction("initialize_unrepresented_term_index_hl_store_cache", "INITIALIZE-UNREPRESENTED-TERM-INDEX-HL-STORE-CACHE", 0, 0, false);
    return NIL;
  }

  public static final SubLObject init_unrepresented_term_index_manager_file() {
    $unrepresented_term_index_manager$ = deflexical("*UNREPRESENTED-TERM-INDEX-MANAGER*", maybeDefault( $sym0$_UNREPRESENTED_TERM_INDEX_MANAGER_, $unrepresented_term_index_manager$, ()-> ($kw1$UNINITIALIZED)));
    $unrepresented_term_index_lru_size_percentage$ = deflexical("*UNREPRESENTED-TERM-INDEX-LRU-SIZE-PERCENTAGE*", TEN_INTEGER);
    return NIL;
  }

  public static final SubLObject setup_unrepresented_term_index_manager_file() {
        subl_macro_promotions.declare_defglobal($sym0$_UNREPRESENTED_TERM_INDEX_MANAGER_);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$_UNREPRESENTED_TERM_INDEX_MANAGER_ = makeSymbol("*UNREPRESENTED-TERM-INDEX-MANAGER*");
  public static final SubLSymbol $kw1$UNINITIALIZED = makeKeyword("UNINITIALIZED");
  public static final SubLString $str2$unrepresented_term_index = makeString("unrepresented-term-index");
  public static final SubLSymbol $sym3$LOAD_UNREPRESENTED_TERM_INDEX_FROM_CACHE = makeSymbol("LOAD-UNREPRESENTED-TERM-INDEX-FROM-CACHE");
  public static final SubLString $str4$unrepresented_term_indices = makeString("unrepresented-term-indices");
  public static final SubLString $str5$unrepresented_term_indices_index = makeString("unrepresented-term-indices-index");

  //// Initializers

  public void declareFunctions() {
    declare_unrepresented_term_index_manager_file();
  }

  public void initializeVariables() {
    init_unrepresented_term_index_manager_file();
  }

  public void runTopLevelForms() {
    setup_unrepresented_term_index_manager_file();
  }

}

package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_source_schema_object_fn extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_source_schema_object_fn";
    public static final String myFingerPrint = "b911b141f08220e426b6b86ab00d1e5875bca46335a3ff0205a1e0509660e70f";
    private static final SubLSymbol $kw0$REMOVAL_SOURCE_SCHEMA_OBJECT_FN_EQUALS_CHECK_POS;
    private static final SubLList $list1;
    private static final SubLSymbol $kw2$REMOVAL_SOURCE_SCHEMA_OBJECT_FN_EQUALS_RIGHT_UNIFY;
    private static final SubLList $list3;
    private static final SubLSymbol $kw4$REMOVAL_SOURCE_SCHEMA_OBJECT_FN_EQUALS_LEFT_UNIFY;
    private static final SubLList $list5;
    private static final SubLSymbol $kw6$REMOVAL_SOURCE_SCHEMA_OBJECT_FN_UNDEFINED_CHECK_POS;
    private static final SubLList $list7;
    private static final SubLSymbol $kw8$REMOVAL_SOURCE_SCHEMA_OBJECT_FN_UNDEFINED_CHECK_NEG;
    private static final SubLList $list9;
    private static final SubLSymbol $kw10$SOURCE_SCHEMA_OBJECT_FN;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-source-schema-object-fn.lisp", position = 6743L)
    public static SubLObject removal_source_schema_object_fn_unify_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_source_schema_object_fn.UNPROVIDED) {
            sense = (SubLObject)removal_modules_source_schema_object_fn.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return removal_modules_equals.$default_unify_cost$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-source-schema-object-fn.lisp", position = 6926L)
    public static SubLObject removal_source_schema_object_fn_equals_support(final SubLObject support_sentence, SubLObject support_mt) {
        if (support_mt == removal_modules_source_schema_object_fn.UNPROVIDED) {
            support_mt = (SubLObject)removal_modules_source_schema_object_fn.NIL;
        }
        final SubLObject support = arguments.make_hl_support((SubLObject)removal_modules_source_schema_object_fn.$kw10$SOURCE_SCHEMA_OBJECT_FN, support_sentence, support_mt, (SubLObject)removal_modules_source_schema_object_fn.UNPROVIDED);
        final SubLObject more_supports = (SubLObject)removal_modules_source_schema_object_fn.NIL;
        return Values.values(support, more_supports);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-source-schema-object-fn.lisp", position = 7180L)
    public static SubLObject removal_source_schema_object_fn_undefined_support(final SubLObject support_sentence, SubLObject support_mt) {
        if (support_mt == removal_modules_source_schema_object_fn.UNPROVIDED) {
            support_mt = (SubLObject)removal_modules_source_schema_object_fn.NIL;
        }
        final SubLObject support = arguments.make_hl_support((SubLObject)removal_modules_source_schema_object_fn.$kw10$SOURCE_SCHEMA_OBJECT_FN, support_sentence, support_mt, (SubLObject)removal_modules_source_schema_object_fn.UNPROVIDED);
        final SubLObject more_supports = (SubLObject)removal_modules_source_schema_object_fn.NIL;
        return Values.values(support, more_supports);
    }
    
    public static SubLObject declare_removal_modules_source_schema_object_fn_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_source_schema_object_fn", "removal_source_schema_object_fn_unify_cost", "REMOVAL-SOURCE-SCHEMA-OBJECT-FN-UNIFY-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_source_schema_object_fn", "removal_source_schema_object_fn_equals_support", "REMOVAL-SOURCE-SCHEMA-OBJECT-FN-EQUALS-SUPPORT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_source_schema_object_fn", "removal_source_schema_object_fn_undefined_support", "REMOVAL-SOURCE-SCHEMA-OBJECT-FN-UNDEFINED-SUPPORT", 1, 1, false);
        return (SubLObject)removal_modules_source_schema_object_fn.NIL;
    }
    
    public static SubLObject init_removal_modules_source_schema_object_fn_file() {
        return (SubLObject)removal_modules_source_schema_object_fn.NIL;
    }
    
    public static SubLObject setup_removal_modules_source_schema_object_fn_file() {
        inference_modules.inference_removal_module((SubLObject)removal_modules_source_schema_object_fn.$kw0$REMOVAL_SOURCE_SCHEMA_OBJECT_FN_EQUALS_CHECK_POS, (SubLObject)removal_modules_source_schema_object_fn.$list1);
        inference_modules.inference_removal_module((SubLObject)removal_modules_source_schema_object_fn.$kw2$REMOVAL_SOURCE_SCHEMA_OBJECT_FN_EQUALS_RIGHT_UNIFY, (SubLObject)removal_modules_source_schema_object_fn.$list3);
        inference_modules.inference_removal_module((SubLObject)removal_modules_source_schema_object_fn.$kw4$REMOVAL_SOURCE_SCHEMA_OBJECT_FN_EQUALS_LEFT_UNIFY, (SubLObject)removal_modules_source_schema_object_fn.$list5);
        inference_modules.inference_removal_module((SubLObject)removal_modules_source_schema_object_fn.$kw6$REMOVAL_SOURCE_SCHEMA_OBJECT_FN_UNDEFINED_CHECK_POS, (SubLObject)removal_modules_source_schema_object_fn.$list7);
        inference_modules.inference_removal_module((SubLObject)removal_modules_source_schema_object_fn.$kw8$REMOVAL_SOURCE_SCHEMA_OBJECT_FN_UNDEFINED_CHECK_NEG, (SubLObject)removal_modules_source_schema_object_fn.$list9);
        return (SubLObject)removal_modules_source_schema_object_fn.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_removal_modules_source_schema_object_fn_file();
    }
    
    @Override
	public void initializeVariables() {
        init_removal_modules_source_schema_object_fn_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_removal_modules_source_schema_object_fn_file();
    }
    
    static {
        me = (SubLFile)new removal_modules_source_schema_object_fn();
        $kw0$REMOVAL_SOURCE_SCHEMA_OBJECT_FN_EQUALS_CHECK_POS = SubLObjectFactory.makeKeyword("REMOVAL-SOURCE-SCHEMA-OBJECT-FN-EQUALS-CHECK-POS");
        $list1 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("CHECK"), removal_modules_source_schema_object_fn.T, SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals")), SubLObjectFactory.makeKeyword("REQUIRED-MT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SKSIMt")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAT"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SourceSchemaObjectFn")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAT"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SourceSchemaObjectFn")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("EXPRESSION1")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("EXPRESSION2"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("EXPRESSION1")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("EXPRESSION2")))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EXPRESSION1"), (SubLObject)SubLObjectFactory.makeSymbol("EXPRESSION2")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("SOURCE-SCHEMA-OBJECT-FN-EXPRESSIONS-EQUAL?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("EXPRESSION1")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("EXPRESSION2")))), SubLObjectFactory.makeKeyword("SUPPORT"), SubLObjectFactory.makeSymbol("REMOVAL-SOURCE-SCHEMA-OBJECT-FN-EQUALS-SUPPORT"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$equals\n       (#$SourceSchemaObjectFn <SKS1> <ODS> <ID>)\n       (#$SourceSchemaObjectFn <SKS2> <ODS> <ID>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$equals\n      (#$SourceSchemaObjectFn #$CATS-KS #$CATS-fbi-LS 5)\n      (#$SourceSchemaObjectFn #$CATS-fbi-KS #$CATS-fbi-LS 5))") });
        $kw2$REMOVAL_SOURCE_SCHEMA_OBJECT_FN_EQUALS_RIGHT_UNIFY = SubLObjectFactory.makeKeyword("REMOVAL-SOURCE-SCHEMA-OBJECT-FN-EQUALS-RIGHT-UNIFY");
        $list3 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals")), SubLObjectFactory.makeKeyword("REQUIRED-MT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SKSIMt")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAT"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SourceSchemaObjectFn")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"))), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-SOURCE-SCHEMA-OBJECT-FN-UNIFY-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("INCOMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("EXPRESSION")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("EXPRESSION")))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EXPRESSION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("SOURCE-SCHEMA-OBJECT-FN-EQUAL-EXPRESSIONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("EXPRESSION")))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("EXPRESSION")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT"), SubLObjectFactory.makeSymbol("REMOVAL-SOURCE-SCHEMA-OBJECT-FN-EQUALS-SUPPORT"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$equals\n      (#$SourceSchemaObjectFn <SKS> <ODS> <ID>)\n      <NOT-FULLY-BOUND>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$equals\n      (#$SourceSchemaObjectFn #$CATS-fbi-KS #$CATS-fbi-LS 5)\n      (#$SourceSchemaObjectFn ?SKS #$CATS-fbi-LS 5))") });
        $kw4$REMOVAL_SOURCE_SCHEMA_OBJECT_FN_EQUALS_LEFT_UNIFY = SubLObjectFactory.makeKeyword("REMOVAL-SOURCE-SCHEMA-OBJECT-FN-EQUALS-LEFT-UNIFY");
        $list5 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals")), SubLObjectFactory.makeKeyword("REQUIRED-MT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SKSIMt")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAT"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SourceSchemaObjectFn")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-SOURCE-SCHEMA-OBJECT-FN-UNIFY-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("INCOMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("EXPRESSION"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("EXPRESSION")))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EXPRESSION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("SOURCE-SCHEMA-OBJECT-FN-EQUAL-EXPRESSIONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("EXPRESSION")))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("EXPRESSION"))), SubLObjectFactory.makeKeyword("SUPPORT"), SubLObjectFactory.makeSymbol("REMOVAL-SOURCE-SCHEMA-OBJECT-FN-EQUALS-SUPPORT"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$equals\n      <NOT-FULLY-BOUND>\n      (#$SourceSchemaObjectFn <SKS> <ODS> <ID>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$equals\n      (#$SourceSchemaObjectFn ?SKS #$CATS-fbi-LS 5)\n      (#$SourceSchemaObjectFn #$CATS-fbi-KS #$CATS-fbi-LS 5))") });
        $kw6$REMOVAL_SOURCE_SCHEMA_OBJECT_FN_UNDEFINED_CHECK_POS = SubLObjectFactory.makeKeyword("REMOVAL-SOURCE-SCHEMA-OBJECT-FN-UNDEFINED-CHECK-POS");
        $list7 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("CHECK"), removal_modules_source_schema_object_fn.T, SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("undefined")), SubLObjectFactory.makeKeyword("REQUIRED-MT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SKSIMt")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("undefined")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAT"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SourceSchemaObjectFn")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("INCOMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("undefined")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("EXPRESSION"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("EXPRESSION")))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EXPRESSION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("SOURCE-SCHEMA-OBJECT-FN-EXPRESSION-UNDEFINED?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("EXPRESSION")))), SubLObjectFactory.makeKeyword("SUPPORT"), SubLObjectFactory.makeSymbol("REMOVAL-SOURCE-SCHEMA-OBJECT-FN-UNDEFINED-SUPPORT"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$undefined\n      (#$SourceSchemaObjectFn <SKS> <ODS> <ID>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$undefined\n      (#$SourceSchemaObjectFn #$CATS-fbi-KS #$CATS-hospital-LS 5))") });
        $kw8$REMOVAL_SOURCE_SCHEMA_OBJECT_FN_UNDEFINED_CHECK_NEG = SubLObjectFactory.makeKeyword("REMOVAL-SOURCE-SCHEMA-OBJECT-FN-UNDEFINED-CHECK-NEG");
        $list9 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("CHECK"), removal_modules_source_schema_object_fn.T, SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("undefined")), SubLObjectFactory.makeKeyword("REQUIRED-MT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SKSIMt")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("undefined")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAT"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SourceSchemaObjectFn")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("INCOMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("undefined")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("EXPRESSION"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("EXPRESSION")))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EXPRESSION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("SOURCE-SCHEMA-OBJECT-FN-EXPRESSION-POSSIBLY-DEFINED?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("EXPRESSION")))), SubLObjectFactory.makeKeyword("SUPPORT"), SubLObjectFactory.makeSymbol("REMOVAL-SOURCE-SCHEMA-OBJECT-FN-UNDEFINED-SUPPORT"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not\n      (#$undefined\n        (#$SourceSchemaObjectFn <SKS> <ODS> <ID>)))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not\n      (#$undefined\n        (#$SourceSchemaObjectFn #$CATS-fbi-KS #$CATS-fbi-LS 5)))") });
        $kw10$SOURCE_SCHEMA_OBJECT_FN = SubLObjectFactory.makeKeyword("SOURCE-SCHEMA-OBJECT-FN");
    }
}

/*

	Total time: 102 ms
	
*/
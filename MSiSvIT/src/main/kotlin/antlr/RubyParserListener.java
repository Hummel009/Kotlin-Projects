// Generated from java-escape by ANTLR 4.11.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RubyParser}.
 */
public interface RubyParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RubyParser#compilation_unit}.
	 * @param ctx the parse tree
	 */
	void enterCompilation_unit(RubyParser.Compilation_unitContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#compilation_unit}.
	 * @param ctx the parse tree
	 */
	void exitCompilation_unit(RubyParser.Compilation_unitContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#statement_list_terms}.
	 * @param ctx the parse tree
	 */
	void enterStatement_list_terms(RubyParser.Statement_list_termsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#statement_list_terms}.
	 * @param ctx the parse tree
	 */
	void exitStatement_list_terms(RubyParser.Statement_list_termsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#statement_list_noterms}.
	 * @param ctx the parse tree
	 */
	void enterStatement_list_noterms(RubyParser.Statement_list_notermsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#statement_list_noterms}.
	 * @param ctx the parse tree
	 */
	void exitStatement_list_noterms(RubyParser.Statement_list_notermsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(RubyParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(RubyParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#undef_statement}.
	 * @param ctx the parse tree
	 */
	void enterUndef_statement(RubyParser.Undef_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#undef_statement}.
	 * @param ctx the parse tree
	 */
	void exitUndef_statement(RubyParser.Undef_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#alias_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlias_statement(RubyParser.Alias_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#alias_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlias_statement(RubyParser.Alias_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#function_name_or_symbol}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name_or_symbol(RubyParser.Function_name_or_symbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#function_name_or_symbol}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name_or_symbol(RubyParser.Function_name_or_symbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#begin_block}.
	 * @param ctx the parse tree
	 */
	void enterBegin_block(RubyParser.Begin_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#begin_block}.
	 * @param ctx the parse tree
	 */
	void exitBegin_block(RubyParser.Begin_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#end_block}.
	 * @param ctx the parse tree
	 */
	void enterEnd_block(RubyParser.End_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#end_block}.
	 * @param ctx the parse tree
	 */
	void exitEnd_block(RubyParser.End_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#module_definition}.
	 * @param ctx the parse tree
	 */
	void enterModule_definition(RubyParser.Module_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#module_definition}.
	 * @param ctx the parse tree
	 */
	void exitModule_definition(RubyParser.Module_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#class_definition}.
	 * @param ctx the parse tree
	 */
	void enterClass_definition(RubyParser.Class_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#class_definition}.
	 * @param ctx the parse tree
	 */
	void exitClass_definition(RubyParser.Class_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#superclass}.
	 * @param ctx the parse tree
	 */
	void enterSuperclass(RubyParser.SuperclassContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#superclass}.
	 * @param ctx the parse tree
	 */
	void exitSuperclass(RubyParser.SuperclassContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#class_header}.
	 * @param ctx the parse tree
	 */
	void enterClass_header(RubyParser.Class_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#class_header}.
	 * @param ctx the parse tree
	 */
	void exitClass_header(RubyParser.Class_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void enterFunction_definition(RubyParser.Function_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void exitFunction_definition(RubyParser.Function_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#function_definition_header}.
	 * @param ctx the parse tree
	 */
	void enterFunction_definition_header(RubyParser.Function_definition_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#function_definition_header}.
	 * @param ctx the parse tree
	 */
	void exitFunction_definition_header(RubyParser.Function_definition_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(RubyParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(RubyParser.Function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#function_definition_params}.
	 * @param ctx the parse tree
	 */
	void enterFunction_definition_params(RubyParser.Function_definition_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#function_definition_params}.
	 * @param ctx the parse tree
	 */
	void exitFunction_definition_params(RubyParser.Function_definition_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#function_definition_param}.
	 * @param ctx the parse tree
	 */
	void enterFunction_definition_param(RubyParser.Function_definition_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#function_definition_param}.
	 * @param ctx the parse tree
	 */
	void exitFunction_definition_param(RubyParser.Function_definition_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#function_call_param}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call_param(RubyParser.Function_call_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#function_call_param}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call_param(RubyParser.Function_call_paramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprLogicalNot}
	 * labeled alternative in {@link RubyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprLogicalNot(RubyParser.ExprLogicalNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprLogicalNot}
	 * labeled alternative in {@link RubyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprLogicalNot(RubyParser.ExprLogicalNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprDotClass}
	 * labeled alternative in {@link RubyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprDotClass(RubyParser.ExprDotClassContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprDotClass}
	 * labeled alternative in {@link RubyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprDotClass(RubyParser.ExprDotClassContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprCalcuation}
	 * labeled alternative in {@link RubyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprCalcuation(RubyParser.ExprCalcuationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprCalcuation}
	 * labeled alternative in {@link RubyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprCalcuation(RubyParser.ExprCalcuationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprPrimary}
	 * labeled alternative in {@link RubyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprPrimary(RubyParser.ExprPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprPrimary}
	 * labeled alternative in {@link RubyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprPrimary(RubyParser.ExprPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprCompareLogical}
	 * labeled alternative in {@link RubyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprCompareLogical(RubyParser.ExprCompareLogicalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprCompareLogical}
	 * labeled alternative in {@link RubyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprCompareLogical(RubyParser.ExprCompareLogicalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprBatchAssign}
	 * labeled alternative in {@link RubyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprBatchAssign(RubyParser.ExprBatchAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprBatchAssign}
	 * labeled alternative in {@link RubyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprBatchAssign(RubyParser.ExprBatchAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprPatternMatch2}
	 * labeled alternative in {@link RubyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprPatternMatch2(RubyParser.ExprPatternMatch2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprPatternMatch2}
	 * labeled alternative in {@link RubyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprPatternMatch2(RubyParser.ExprPatternMatch2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprPatternMatch3}
	 * labeled alternative in {@link RubyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprPatternMatch3(RubyParser.ExprPatternMatch3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprPatternMatch3}
	 * labeled alternative in {@link RubyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprPatternMatch3(RubyParser.ExprPatternMatch3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprPrefixCalc}
	 * labeled alternative in {@link RubyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprPrefixCalc(RubyParser.ExprPrefixCalcContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprPrefixCalc}
	 * labeled alternative in {@link RubyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprPrefixCalc(RubyParser.ExprPrefixCalcContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprFunctionCall3}
	 * labeled alternative in {@link RubyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprFunctionCall3(RubyParser.ExprFunctionCall3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprFunctionCall3}
	 * labeled alternative in {@link RubyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprFunctionCall3(RubyParser.ExprFunctionCall3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprQuestion}
	 * labeled alternative in {@link RubyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprQuestion(RubyParser.ExprQuestionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprQuestion}
	 * labeled alternative in {@link RubyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprQuestion(RubyParser.ExprQuestionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprFunctionCall2}
	 * labeled alternative in {@link RubyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprFunctionCall2(RubyParser.ExprFunctionCall2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprFunctionCall2}
	 * labeled alternative in {@link RubyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprFunctionCall2(RubyParser.ExprFunctionCall2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprFunctionCall1}
	 * labeled alternative in {@link RubyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprFunctionCall1(RubyParser.ExprFunctionCall1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprFunctionCall1}
	 * labeled alternative in {@link RubyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprFunctionCall1(RubyParser.ExprFunctionCall1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprEqualTest}
	 * labeled alternative in {@link RubyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprEqualTest(RubyParser.ExprEqualTestContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprEqualTest}
	 * labeled alternative in {@link RubyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprEqualTest(RubyParser.ExprEqualTestContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprRange}
	 * labeled alternative in {@link RubyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprRange(RubyParser.ExprRangeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprRange}
	 * labeled alternative in {@link RubyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprRange(RubyParser.ExprRangeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprPatternMatch1}
	 * labeled alternative in {@link RubyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprPatternMatch1(RubyParser.ExprPatternMatch1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprPatternMatch1}
	 * labeled alternative in {@link RubyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprPatternMatch1(RubyParser.ExprPatternMatch1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprBlock}
	 * labeled alternative in {@link RubyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprBlock(RubyParser.ExprBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprBlock}
	 * labeled alternative in {@link RubyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprBlock(RubyParser.ExprBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprLogicalJoin}
	 * labeled alternative in {@link RubyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprLogicalJoin(RubyParser.ExprLogicalJoinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprLogicalJoin}
	 * labeled alternative in {@link RubyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprLogicalJoin(RubyParser.ExprLogicalJoinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprArrayAccess}
	 * labeled alternative in {@link RubyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprArrayAccess(RubyParser.ExprArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprArrayAccess}
	 * labeled alternative in {@link RubyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprArrayAccess(RubyParser.ExprArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprConditionStatement}
	 * labeled alternative in {@link RubyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprConditionStatement(RubyParser.ExprConditionStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprConditionStatement}
	 * labeled alternative in {@link RubyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprConditionStatement(RubyParser.ExprConditionStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprWitStatementSuffix}
	 * labeled alternative in {@link RubyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprWitStatementSuffix(RubyParser.ExprWitStatementSuffixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprWitStatementSuffix}
	 * labeled alternative in {@link RubyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprWitStatementSuffix(RubyParser.ExprWitStatementSuffixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprDefineTest}
	 * labeled alternative in {@link RubyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprDefineTest(RubyParser.ExprDefineTestContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprDefineTest}
	 * labeled alternative in {@link RubyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprDefineTest(RubyParser.ExprDefineTestContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprList}
	 * labeled alternative in {@link RubyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprList(RubyParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprList}
	 * labeled alternative in {@link RubyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprList(RubyParser.ExprListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprDotRef}
	 * labeled alternative in {@link RubyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprDotRef(RubyParser.ExprDotRefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprDotRef}
	 * labeled alternative in {@link RubyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprDotRef(RubyParser.ExprDotRefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAssign}
	 * labeled alternative in {@link RubyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAssign(RubyParser.ExprAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAssign}
	 * labeled alternative in {@link RubyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAssign(RubyParser.ExprAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#expr_statement_suffix}.
	 * @param ctx the parse tree
	 */
	void enterExpr_statement_suffix(RubyParser.Expr_statement_suffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#expr_statement_suffix}.
	 * @param ctx the parse tree
	 */
	void exitExpr_statement_suffix(RubyParser.Expr_statement_suffixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryVarPath}
	 * labeled alternative in {@link RubyParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryVarPath(RubyParser.PrimaryVarPathContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryVarPath}
	 * labeled alternative in {@link RubyParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryVarPath(RubyParser.PrimaryVarPathContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryRegex}
	 * labeled alternative in {@link RubyParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryRegex(RubyParser.PrimaryRegexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryRegex}
	 * labeled alternative in {@link RubyParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryRegex(RubyParser.PrimaryRegexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimarySymbol}
	 * labeled alternative in {@link RubyParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimarySymbol(RubyParser.PrimarySymbolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimarySymbol}
	 * labeled alternative in {@link RubyParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimarySymbol(RubyParser.PrimarySymbolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryBracket}
	 * labeled alternative in {@link RubyParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryBracket(RubyParser.PrimaryBracketContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryBracket}
	 * labeled alternative in {@link RubyParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryBracket(RubyParser.PrimaryBracketContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryBlock}
	 * labeled alternative in {@link RubyParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryBlock(RubyParser.PrimaryBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryBlock}
	 * labeled alternative in {@link RubyParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryBlock(RubyParser.PrimaryBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryStatementBreak}
	 * labeled alternative in {@link RubyParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryStatementBreak(RubyParser.PrimaryStatementBreakContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryStatementBreak}
	 * labeled alternative in {@link RubyParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryStatementBreak(RubyParser.PrimaryStatementBreakContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryStatementReturn}
	 * labeled alternative in {@link RubyParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryStatementReturn(RubyParser.PrimaryStatementReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryStatementReturn}
	 * labeled alternative in {@link RubyParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryStatementReturn(RubyParser.PrimaryStatementReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryStatementRaise}
	 * labeled alternative in {@link RubyParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryStatementRaise(RubyParser.PrimaryStatementRaiseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryStatementRaise}
	 * labeled alternative in {@link RubyParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryStatementRaise(RubyParser.PrimaryStatementRaiseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryStatementRescue}
	 * labeled alternative in {@link RubyParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryStatementRescue(RubyParser.PrimaryStatementRescueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryStatementRescue}
	 * labeled alternative in {@link RubyParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryStatementRescue(RubyParser.PrimaryStatementRescueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryStatementYield}
	 * labeled alternative in {@link RubyParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryStatementYield(RubyParser.PrimaryStatementYieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryStatementYield}
	 * labeled alternative in {@link RubyParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryStatementYield(RubyParser.PrimaryStatementYieldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryBeginBlock}
	 * labeled alternative in {@link RubyParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryBeginBlock(RubyParser.PrimaryBeginBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryBeginBlock}
	 * labeled alternative in {@link RubyParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryBeginBlock(RubyParser.PrimaryBeginBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryBlockIf2}
	 * labeled alternative in {@link RubyParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryBlockIf2(RubyParser.PrimaryBlockIf2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryBlockIf2}
	 * labeled alternative in {@link RubyParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryBlockIf2(RubyParser.PrimaryBlockIf2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryBlockIf}
	 * labeled alternative in {@link RubyParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryBlockIf(RubyParser.PrimaryBlockIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryBlockIf}
	 * labeled alternative in {@link RubyParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryBlockIf(RubyParser.PrimaryBlockIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryBlockWhen}
	 * labeled alternative in {@link RubyParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryBlockWhen(RubyParser.PrimaryBlockWhenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryBlockWhen}
	 * labeled alternative in {@link RubyParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryBlockWhen(RubyParser.PrimaryBlockWhenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryBlockUnless}
	 * labeled alternative in {@link RubyParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryBlockUnless(RubyParser.PrimaryBlockUnlessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryBlockUnless}
	 * labeled alternative in {@link RubyParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryBlockUnless(RubyParser.PrimaryBlockUnlessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryBlockCase1}
	 * labeled alternative in {@link RubyParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryBlockCase1(RubyParser.PrimaryBlockCase1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryBlockCase1}
	 * labeled alternative in {@link RubyParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryBlockCase1(RubyParser.PrimaryBlockCase1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryBlockCase2}
	 * labeled alternative in {@link RubyParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryBlockCase2(RubyParser.PrimaryBlockCase2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryBlockCase2}
	 * labeled alternative in {@link RubyParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryBlockCase2(RubyParser.PrimaryBlockCase2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryBlockWhile}
	 * labeled alternative in {@link RubyParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryBlockWhile(RubyParser.PrimaryBlockWhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryBlockWhile}
	 * labeled alternative in {@link RubyParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryBlockWhile(RubyParser.PrimaryBlockWhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryBlockUntil}
	 * labeled alternative in {@link RubyParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryBlockUntil(RubyParser.PrimaryBlockUntilContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryBlockUntil}
	 * labeled alternative in {@link RubyParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryBlockUntil(RubyParser.PrimaryBlockUntilContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryBlockFor}
	 * labeled alternative in {@link RubyParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryBlockFor(RubyParser.PrimaryBlockForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryBlockFor}
	 * labeled alternative in {@link RubyParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryBlockFor(RubyParser.PrimaryBlockForContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryBlockClassDef}
	 * labeled alternative in {@link RubyParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryBlockClassDef(RubyParser.PrimaryBlockClassDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryBlockClassDef}
	 * labeled alternative in {@link RubyParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryBlockClassDef(RubyParser.PrimaryBlockClassDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryBlockFunctionDef}
	 * labeled alternative in {@link RubyParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryBlockFunctionDef(RubyParser.PrimaryBlockFunctionDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryBlockFunctionDef}
	 * labeled alternative in {@link RubyParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryBlockFunctionDef(RubyParser.PrimaryBlockFunctionDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryBlockModelDef}
	 * labeled alternative in {@link RubyParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryBlockModelDef(RubyParser.PrimaryBlockModelDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryBlockModelDef}
	 * labeled alternative in {@link RubyParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryBlockModelDef(RubyParser.PrimaryBlockModelDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryFunctionCall0}
	 * labeled alternative in {@link RubyParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryFunctionCall0(RubyParser.PrimaryFunctionCall0Context ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryFunctionCall0}
	 * labeled alternative in {@link RubyParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryFunctionCall0(RubyParser.PrimaryFunctionCall0Context ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryListHash}
	 * labeled alternative in {@link RubyParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryListHash(RubyParser.PrimaryListHashContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryListHash}
	 * labeled alternative in {@link RubyParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryListHash(RubyParser.PrimaryListHashContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryListExpr}
	 * labeled alternative in {@link RubyParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryListExpr(RubyParser.PrimaryListExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryListExpr}
	 * labeled alternative in {@link RubyParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryListExpr(RubyParser.PrimaryListExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryRange}
	 * labeled alternative in {@link RubyParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryRange(RubyParser.PrimaryRangeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryRange}
	 * labeled alternative in {@link RubyParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryRange(RubyParser.PrimaryRangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#func_call_parameters}.
	 * @param ctx the parse tree
	 */
	void enterFunc_call_parameters(RubyParser.Func_call_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#func_call_parameters}.
	 * @param ctx the parse tree
	 */
	void exitFunc_call_parameters(RubyParser.Func_call_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#func_call_parameters_no_bracket}.
	 * @param ctx the parse tree
	 */
	void enterFunc_call_parameters_no_bracket(RubyParser.Func_call_parameters_no_bracketContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#func_call_parameters_no_bracket}.
	 * @param ctx the parse tree
	 */
	void exitFunc_call_parameters_no_bracket(RubyParser.Func_call_parameters_no_bracketContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#rescure_param}.
	 * @param ctx the parse tree
	 */
	void enterRescure_param(RubyParser.Rescure_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#rescure_param}.
	 * @param ctx the parse tree
	 */
	void exitRescure_param(RubyParser.Rescure_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#case_body}.
	 * @param ctx the parse tree
	 */
	void enterCase_body(RubyParser.Case_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#case_body}.
	 * @param ctx the parse tree
	 */
	void exitCase_body(RubyParser.Case_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#when_cond}.
	 * @param ctx the parse tree
	 */
	void enterWhen_cond(RubyParser.When_condContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#when_cond}.
	 * @param ctx the parse tree
	 */
	void exitWhen_cond(RubyParser.When_condContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#if_tail}.
	 * @param ctx the parse tree
	 */
	void enterIf_tail(RubyParser.If_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#if_tail}.
	 * @param ctx the parse tree
	 */
	void exitIf_tail(RubyParser.If_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#else_tail}.
	 * @param ctx the parse tree
	 */
	void enterElse_tail(RubyParser.Else_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#else_tail}.
	 * @param ctx the parse tree
	 */
	void exitElse_tail(RubyParser.Else_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#dot_ref}.
	 * @param ctx the parse tree
	 */
	void enterDot_ref(RubyParser.Dot_refContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#dot_ref}.
	 * @param ctx the parse tree
	 */
	void exitDot_ref(RubyParser.Dot_refContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOperator(RubyParser.LogicalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOperator(RubyParser.LogicalOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#equalsOperator}.
	 * @param ctx the parse tree
	 */
	void enterEqualsOperator(RubyParser.EqualsOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#equalsOperator}.
	 * @param ctx the parse tree
	 */
	void exitEqualsOperator(RubyParser.EqualsOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#compareOperator}.
	 * @param ctx the parse tree
	 */
	void enterCompareOperator(RubyParser.CompareOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#compareOperator}.
	 * @param ctx the parse tree
	 */
	void exitCompareOperator(RubyParser.CompareOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#bitOperator}.
	 * @param ctx the parse tree
	 */
	void enterBitOperator(RubyParser.BitOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#bitOperator}.
	 * @param ctx the parse tree
	 */
	void exitBitOperator(RubyParser.BitOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#mathOperator}.
	 * @param ctx the parse tree
	 */
	void enterMathOperator(RubyParser.MathOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#mathOperator}.
	 * @param ctx the parse tree
	 */
	void exitMathOperator(RubyParser.MathOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#assignOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignOperator(RubyParser.AssignOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#assignOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignOperator(RubyParser.AssignOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#not}.
	 * @param ctx the parse tree
	 */
	void enterNot(RubyParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#not}.
	 * @param ctx the parse tree
	 */
	void exitNot(RubyParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(RubyParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(RubyParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#block_params}.
	 * @param ctx the parse tree
	 */
	void enterBlock_params(RubyParser.Block_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#block_params}.
	 * @param ctx the parse tree
	 */
	void exitBlock_params(RubyParser.Block_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#id_symbol}.
	 * @param ctx the parse tree
	 */
	void enterId_symbol(RubyParser.Id_symbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#id_symbol}.
	 * @param ctx the parse tree
	 */
	void exitId_symbol(RubyParser.Id_symbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#symbol}.
	 * @param ctx the parse tree
	 */
	void enterSymbol(RubyParser.SymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#symbol}.
	 * @param ctx the parse tree
	 */
	void exitSymbol(RubyParser.SymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#hash_asso}.
	 * @param ctx the parse tree
	 */
	void enterHash_asso(RubyParser.Hash_assoContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#hash_asso}.
	 * @param ctx the parse tree
	 */
	void exitHash_asso(RubyParser.Hash_assoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarPathLiteral}
	 * labeled alternative in {@link RubyParser#variable_path}.
	 * @param ctx the parse tree
	 */
	void enterVarPathLiteral(RubyParser.VarPathLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarPathLiteral}
	 * labeled alternative in {@link RubyParser#variable_path}.
	 * @param ctx the parse tree
	 */
	void exitVarPathLiteral(RubyParser.VarPathLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarPathId}
	 * labeled alternative in {@link RubyParser#variable_path}.
	 * @param ctx the parse tree
	 */
	void enterVarPathId(RubyParser.VarPathIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarPathId}
	 * labeled alternative in {@link RubyParser#variable_path}.
	 * @param ctx the parse tree
	 */
	void exitVarPathId(RubyParser.VarPathIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarPathGlobalPrefix}
	 * labeled alternative in {@link RubyParser#variable_path}.
	 * @param ctx the parse tree
	 */
	void enterVarPathGlobalPrefix(RubyParser.VarPathGlobalPrefixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarPathGlobalPrefix}
	 * labeled alternative in {@link RubyParser#variable_path}.
	 * @param ctx the parse tree
	 */
	void exitVarPathGlobalPrefix(RubyParser.VarPathGlobalPrefixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarPathJoin}
	 * labeled alternative in {@link RubyParser#variable_path}.
	 * @param ctx the parse tree
	 */
	void enterVarPathJoin(RubyParser.VarPathJoinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarPathJoin}
	 * labeled alternative in {@link RubyParser#variable_path}.
	 * @param ctx the parse tree
	 */
	void exitVarPathJoin(RubyParser.VarPathJoinContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#cpath}.
	 * @param ctx the parse tree
	 */
	void enterCpath(RubyParser.CpathContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#cpath}.
	 * @param ctx the parse tree
	 */
	void exitCpath(RubyParser.CpathContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(RubyParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(RubyParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(RubyParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(RubyParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#empty}.
	 * @param ctx the parse tree
	 */
	void enterEmpty(RubyParser.EmptyContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#empty}.
	 * @param ctx the parse tree
	 */
	void exitEmpty(RubyParser.EmptyContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#globalVar}.
	 * @param ctx the parse tree
	 */
	void enterGlobalVar(RubyParser.GlobalVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#globalVar}.
	 * @param ctx the parse tree
	 */
	void exitGlobalVar(RubyParser.GlobalVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#classVar}.
	 * @param ctx the parse tree
	 */
	void enterClassVar(RubyParser.ClassVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#classVar}.
	 * @param ctx the parse tree
	 */
	void exitClassVar(RubyParser.ClassVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#instanceVar}.
	 * @param ctx the parse tree
	 */
	void enterInstanceVar(RubyParser.InstanceVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#instanceVar}.
	 * @param ctx the parse tree
	 */
	void exitInstanceVar(RubyParser.InstanceVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#idArg}.
	 * @param ctx the parse tree
	 */
	void enterIdArg(RubyParser.IdArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#idArg}.
	 * @param ctx the parse tree
	 */
	void exitIdArg(RubyParser.IdArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#do_keyword}.
	 * @param ctx the parse tree
	 */
	void enterDo_keyword(RubyParser.Do_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#do_keyword}.
	 * @param ctx the parse tree
	 */
	void exitDo_keyword(RubyParser.Do_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#then_keyword}.
	 * @param ctx the parse tree
	 */
	void enterThen_keyword(RubyParser.Then_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#then_keyword}.
	 * @param ctx the parse tree
	 */
	void exitThen_keyword(RubyParser.Then_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(RubyParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(RubyParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#crlfs}.
	 * @param ctx the parse tree
	 */
	void enterCrlfs(RubyParser.CrlfsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#crlfs}.
	 * @param ctx the parse tree
	 */
	void exitCrlfs(RubyParser.CrlfsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#terms}.
	 * @param ctx the parse tree
	 */
	void enterTerms(RubyParser.TermsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#terms}.
	 * @param ctx the parse tree
	 */
	void exitTerms(RubyParser.TermsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(RubyParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(RubyParser.TermContext ctx);
}
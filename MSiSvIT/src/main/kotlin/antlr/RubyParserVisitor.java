// Generated from java-escape by ANTLR 4.11.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RubyParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RubyParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link RubyParser#compilation_unit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilation_unit(RubyParser.Compilation_unitContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#statement_list_terms}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_list_terms(RubyParser.Statement_list_termsContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#statement_list_noterms}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_list_noterms(RubyParser.Statement_list_notermsContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(RubyParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#undef_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUndef_statement(RubyParser.Undef_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#alias_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias_statement(RubyParser.Alias_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#function_name_or_symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name_or_symbol(RubyParser.Function_name_or_symbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#begin_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBegin_block(RubyParser.Begin_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#end_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd_block(RubyParser.End_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#module_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_definition(RubyParser.Module_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#class_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_definition(RubyParser.Class_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#superclass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperclass(RubyParser.SuperclassContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#class_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_header(RubyParser.Class_headerContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#function_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_definition(RubyParser.Function_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#function_definition_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_definition_header(RubyParser.Function_definition_headerContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(RubyParser.Function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#function_definition_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_definition_params(RubyParser.Function_definition_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#function_definition_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_definition_param(RubyParser.Function_definition_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#function_call_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call_param(RubyParser.Function_call_paramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprLogicalNot}
	 * labeled alternative in {@link RubyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprLogicalNot(RubyParser.ExprLogicalNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprDotClass}
	 * labeled alternative in {@link RubyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprDotClass(RubyParser.ExprDotClassContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprCalcuation}
	 * labeled alternative in {@link RubyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCalcuation(RubyParser.ExprCalcuationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprPrimary}
	 * labeled alternative in {@link RubyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPrimary(RubyParser.ExprPrimaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprCompareLogical}
	 * labeled alternative in {@link RubyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCompareLogical(RubyParser.ExprCompareLogicalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprBatchAssign}
	 * labeled alternative in {@link RubyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBatchAssign(RubyParser.ExprBatchAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprPatternMatch2}
	 * labeled alternative in {@link RubyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPatternMatch2(RubyParser.ExprPatternMatch2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprPatternMatch3}
	 * labeled alternative in {@link RubyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPatternMatch3(RubyParser.ExprPatternMatch3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprPrefixCalc}
	 * labeled alternative in {@link RubyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPrefixCalc(RubyParser.ExprPrefixCalcContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprFunctionCall3}
	 * labeled alternative in {@link RubyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprFunctionCall3(RubyParser.ExprFunctionCall3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprQuestion}
	 * labeled alternative in {@link RubyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprQuestion(RubyParser.ExprQuestionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprFunctionCall2}
	 * labeled alternative in {@link RubyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprFunctionCall2(RubyParser.ExprFunctionCall2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprFunctionCall1}
	 * labeled alternative in {@link RubyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprFunctionCall1(RubyParser.ExprFunctionCall1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprEqualTest}
	 * labeled alternative in {@link RubyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprEqualTest(RubyParser.ExprEqualTestContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprRange}
	 * labeled alternative in {@link RubyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprRange(RubyParser.ExprRangeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprPatternMatch1}
	 * labeled alternative in {@link RubyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPatternMatch1(RubyParser.ExprPatternMatch1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprBlock}
	 * labeled alternative in {@link RubyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBlock(RubyParser.ExprBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprLogicalJoin}
	 * labeled alternative in {@link RubyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprLogicalJoin(RubyParser.ExprLogicalJoinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprArrayAccess}
	 * labeled alternative in {@link RubyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprArrayAccess(RubyParser.ExprArrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprConditionStatement}
	 * labeled alternative in {@link RubyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprConditionStatement(RubyParser.ExprConditionStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprWitStatementSuffix}
	 * labeled alternative in {@link RubyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprWitStatementSuffix(RubyParser.ExprWitStatementSuffixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprDefineTest}
	 * labeled alternative in {@link RubyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprDefineTest(RubyParser.ExprDefineTestContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprList}
	 * labeled alternative in {@link RubyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprList(RubyParser.ExprListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprDotRef}
	 * labeled alternative in {@link RubyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprDotRef(RubyParser.ExprDotRefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprAssign}
	 * labeled alternative in {@link RubyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAssign(RubyParser.ExprAssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#expr_statement_suffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_statement_suffix(RubyParser.Expr_statement_suffixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryVarPath}
	 * labeled alternative in {@link RubyParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryVarPath(RubyParser.PrimaryVarPathContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryRegex}
	 * labeled alternative in {@link RubyParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryRegex(RubyParser.PrimaryRegexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimarySymbol}
	 * labeled alternative in {@link RubyParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimarySymbol(RubyParser.PrimarySymbolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryBracket}
	 * labeled alternative in {@link RubyParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryBracket(RubyParser.PrimaryBracketContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryBlock}
	 * labeled alternative in {@link RubyParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryBlock(RubyParser.PrimaryBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryStatementBreak}
	 * labeled alternative in {@link RubyParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryStatementBreak(RubyParser.PrimaryStatementBreakContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryStatementReturn}
	 * labeled alternative in {@link RubyParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryStatementReturn(RubyParser.PrimaryStatementReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryStatementRaise}
	 * labeled alternative in {@link RubyParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryStatementRaise(RubyParser.PrimaryStatementRaiseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryStatementRescue}
	 * labeled alternative in {@link RubyParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryStatementRescue(RubyParser.PrimaryStatementRescueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryStatementYield}
	 * labeled alternative in {@link RubyParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryStatementYield(RubyParser.PrimaryStatementYieldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryBeginBlock}
	 * labeled alternative in {@link RubyParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryBeginBlock(RubyParser.PrimaryBeginBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryBlockIf2}
	 * labeled alternative in {@link RubyParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryBlockIf2(RubyParser.PrimaryBlockIf2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryBlockIf}
	 * labeled alternative in {@link RubyParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryBlockIf(RubyParser.PrimaryBlockIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryBlockWhen}
	 * labeled alternative in {@link RubyParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryBlockWhen(RubyParser.PrimaryBlockWhenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryBlockUnless}
	 * labeled alternative in {@link RubyParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryBlockUnless(RubyParser.PrimaryBlockUnlessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryBlockCase1}
	 * labeled alternative in {@link RubyParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryBlockCase1(RubyParser.PrimaryBlockCase1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryBlockCase2}
	 * labeled alternative in {@link RubyParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryBlockCase2(RubyParser.PrimaryBlockCase2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryBlockWhile}
	 * labeled alternative in {@link RubyParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryBlockWhile(RubyParser.PrimaryBlockWhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryBlockUntil}
	 * labeled alternative in {@link RubyParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryBlockUntil(RubyParser.PrimaryBlockUntilContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryBlockFor}
	 * labeled alternative in {@link RubyParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryBlockFor(RubyParser.PrimaryBlockForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryBlockClassDef}
	 * labeled alternative in {@link RubyParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryBlockClassDef(RubyParser.PrimaryBlockClassDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryBlockFunctionDef}
	 * labeled alternative in {@link RubyParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryBlockFunctionDef(RubyParser.PrimaryBlockFunctionDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryBlockModelDef}
	 * labeled alternative in {@link RubyParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryBlockModelDef(RubyParser.PrimaryBlockModelDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryFunctionCall0}
	 * labeled alternative in {@link RubyParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryFunctionCall0(RubyParser.PrimaryFunctionCall0Context ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryListHash}
	 * labeled alternative in {@link RubyParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryListHash(RubyParser.PrimaryListHashContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryListExpr}
	 * labeled alternative in {@link RubyParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryListExpr(RubyParser.PrimaryListExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryRange}
	 * labeled alternative in {@link RubyParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryRange(RubyParser.PrimaryRangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#func_call_parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_call_parameters(RubyParser.Func_call_parametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#func_call_parameters_no_bracket}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_call_parameters_no_bracket(RubyParser.Func_call_parameters_no_bracketContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#rescure_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRescure_param(RubyParser.Rescure_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#case_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_body(RubyParser.Case_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#when_cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhen_cond(RubyParser.When_condContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#if_tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_tail(RubyParser.If_tailContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#else_tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_tail(RubyParser.Else_tailContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#dot_ref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDot_ref(RubyParser.Dot_refContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#logicalOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOperator(RubyParser.LogicalOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#equalsOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualsOperator(RubyParser.EqualsOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#compareOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareOperator(RubyParser.CompareOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#bitOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitOperator(RubyParser.BitOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#mathOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathOperator(RubyParser.MathOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#assignOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignOperator(RubyParser.AssignOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#not}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(RubyParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(RubyParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#block_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_params(RubyParser.Block_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#id_symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_symbol(RubyParser.Id_symbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbol(RubyParser.SymbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#hash_asso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHash_asso(RubyParser.Hash_assoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarPathLiteral}
	 * labeled alternative in {@link RubyParser#variable_path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarPathLiteral(RubyParser.VarPathLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarPathId}
	 * labeled alternative in {@link RubyParser#variable_path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarPathId(RubyParser.VarPathIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarPathGlobalPrefix}
	 * labeled alternative in {@link RubyParser#variable_path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarPathGlobalPrefix(RubyParser.VarPathGlobalPrefixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarPathJoin}
	 * labeled alternative in {@link RubyParser#variable_path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarPathJoin(RubyParser.VarPathJoinContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#cpath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCpath(RubyParser.CpathContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(RubyParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(RubyParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#empty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmpty(RubyParser.EmptyContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#globalVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalVar(RubyParser.GlobalVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#classVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassVar(RubyParser.ClassVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#instanceVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceVar(RubyParser.InstanceVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#idArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdArg(RubyParser.IdArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#do_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_keyword(RubyParser.Do_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#then_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThen_keyword(RubyParser.Then_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(RubyParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#crlfs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrlfs(RubyParser.CrlfsContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#terms}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerms(RubyParser.TermsContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(RubyParser.TermContext ctx);
}
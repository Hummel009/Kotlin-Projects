// Generated from java-escape by ANTLR 4.11.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CorundumParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CorundumVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CorundumParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(CorundumParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by .
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_list(CorundumParser.Expression_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorundumParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(CorundumParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorundumParser#global_get}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_get(CorundumParser.Global_getContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorundumParser#global_set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_set(CorundumParser.Global_setContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorundumParser#global_result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_result(CorundumParser.Global_resultContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorundumParser#function_inline_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_inline_call(CorundumParser.Function_inline_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorundumParser#require_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequire_block(CorundumParser.Require_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorundumParser#pir_inline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPir_inline(CorundumParser.Pir_inlineContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorundumParser#pir_expression_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPir_expression_list(CorundumParser.Pir_expression_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorundumParser#function_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_definition(CorundumParser.Function_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorundumParser#function_definition_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_definition_body(CorundumParser.Function_definition_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorundumParser#function_definition_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_definition_header(CorundumParser.Function_definition_headerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorundumParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(CorundumParser.Function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorundumParser#function_definition_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_definition_params(CorundumParser.Function_definition_paramsContext ctx);
	/**
	 * Visit a parse tree produced by
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_definition_params_list(CorundumParser.Function_definition_params_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorundumParser#function_definition_param_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_definition_param_id(CorundumParser.Function_definition_param_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorundumParser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(CorundumParser.Return_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorundumParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(CorundumParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorundumParser#function_call_param_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call_param_list(CorundumParser.Function_call_param_listContext ctx);
	/**
	 * Visit a parse tree produced by
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call_params(CorundumParser.Function_call_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorundumParser#function_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_param(CorundumParser.Function_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorundumParser#function_unnamed_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_unnamed_param(CorundumParser.Function_unnamed_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorundumParser#function_named_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_named_param(CorundumParser.Function_named_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorundumParser#function_call_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call_assignment(CorundumParser.Function_call_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorundumParser#all_result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAll_result(CorundumParser.All_resultContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorundumParser#elsif_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElsif_statement(CorundumParser.Elsif_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorundumParser#if_elsif_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_elsif_statement(CorundumParser.If_elsif_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorundumParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(CorundumParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorundumParser#unless_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnless_statement(CorundumParser.Unless_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorundumParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(CorundumParser.While_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorundumParser#for_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_statement(CorundumParser.For_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorundumParser#init_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit_expression(CorundumParser.Init_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorundumParser#all_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAll_assignment(CorundumParser.All_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_init_list(CorundumParser.For_init_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorundumParser#cond_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_expression(CorundumParser.Cond_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorundumParser#loop_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_expression(CorundumParser.Loop_expressionContext ctx);
	/**
	 * Visit a parse tree produced by
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_loop_list(CorundumParser.For_loop_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorundumParser#statement_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_body(CorundumParser.Statement_bodyContext ctx);
	/**
	 * Visit a parse tree produced by
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_expression_list(CorundumParser.Statement_expression_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorundumParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(CorundumParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorundumParser#dynamic_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDynamic_assignment(CorundumParser.Dynamic_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorundumParser#int_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_assignment(CorundumParser.Int_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorundumParser#float_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat_assignment(CorundumParser.Float_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorundumParser#string_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_assignment(CorundumParser.String_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorundumParser#initial_array_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitial_array_assignment(CorundumParser.Initial_array_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorundumParser#array_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_assignment(CorundumParser.Array_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorundumParser#array_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_definition(CorundumParser.Array_definitionContext ctx);
	/**
	 * Visit a parse tree produced by
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_definition_elements(CorundumParser.Array_definition_elementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorundumParser#array_selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_selector(CorundumParser.Array_selectorContext ctx);
	/**
	 * Visit a parse tree produced by
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDynamic_result(CorundumParser.Dynamic_resultContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorundumParser#dynamic_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDynamic_(CorundumParser.Dynamic_Context ctx);
	/**
	 * Visit a parse tree produced by
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_result(CorundumParser.Int_resultContext ctx);
	/**
	 * Visit a parse tree produced by
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat_result(CorundumParser.Float_resultContext ctx);
	/**
	 * Visit a parse tree produced by
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_result(CorundumParser.String_resultContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorundumParser#comparison_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison_list(CorundumParser.Comparison_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorundumParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(CorundumParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorundumParser#comp_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_var(CorundumParser.Comp_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorundumParser#lvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLvalue(CorundumParser.LvalueContext ctx);
	/**
	 * Visit a parse tree produced by
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRvalue(CorundumParser.RvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorundumParser#break_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_expression(CorundumParser.Break_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorundumParser#literal_t}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_t(CorundumParser.Literal_tContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorundumParser#float_t}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat_t(CorundumParser.Float_tContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorundumParser#int_t}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_t(CorundumParser.Int_tContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorundumParser#bool_t}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_t(CorundumParser.Bool_tContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorundumParser#nil_t}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNil_t(CorundumParser.Nil_tContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorundumParser#id_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_(CorundumParser.Id_Context ctx);
	/**
	 * Visit a parse tree produced by {@link CorundumParser#id_global}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_global(CorundumParser.Id_globalContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorundumParser#id_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_function(CorundumParser.Id_functionContext ctx);
	/**
	 * Visit a parse tree produced by
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerminator(CorundumParser.TerminatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorundumParser#else_token}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_token(CorundumParser.Else_tokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorundumParser#crlf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrlf(CorundumParser.CrlfContext ctx);
}
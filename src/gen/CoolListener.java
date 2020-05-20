// Generated from D:/MyCompiler/src/main/grammar\Cool.g4 by ANTLR 4.8
package gen;

    import main.handler.Handler;
    import main.model.Variable;
    
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CoolParser}.
 */
public interface CoolListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CoolParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CoolParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CoolParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(CoolParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(CoolParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#assigment}.
	 * @param ctx the parse tree
	 */
	void enterAssigment(CoolParser.AssigmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#assigment}.
	 * @param ctx the parse tree
	 */
	void exitAssigment(CoolParser.AssigmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#typeVariable}.
	 * @param ctx the parse tree
	 */
	void enterTypeVariable(CoolParser.TypeVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#typeVariable}.
	 * @param ctx the parse tree
	 */
	void exitTypeVariable(CoolParser.TypeVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#typeFunction}.
	 * @param ctx the parse tree
	 */
	void enterTypeFunction(CoolParser.TypeFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#typeFunction}.
	 * @param ctx the parse tree
	 */
	void exitTypeFunction(CoolParser.TypeFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(CoolParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(CoolParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(CoolParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(CoolParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CoolParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CoolParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterRelation(CoolParser.RelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitRelation(CoolParser.RelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CoolParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CoolParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(CoolParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(CoolParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(CoolParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(CoolParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(CoolParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(CoolParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(CoolParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(CoolParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(CoolParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(CoolParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(CoolParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(CoolParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(CoolParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(CoolParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(CoolParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(CoolParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#length}.
	 * @param ctx the parse tree
	 */
	void enterLength(CoolParser.LengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#length}.
	 * @param ctx the parse tree
	 */
	void exitLength(CoolParser.LengthContext ctx);
}
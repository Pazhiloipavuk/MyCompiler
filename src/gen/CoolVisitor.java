// Generated from D:/MyCompiler/src/main/grammar\Cool.g4 by ANTLR 4.8
package gen;

    import main.handler.Handler;
    import main.model.Variable;
    
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CoolParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CoolVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CoolParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(CoolParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(CoolParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#assigment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssigment(CoolParser.AssigmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#typeVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeVariable(CoolParser.TypeVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#typeFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeFunction(CoolParser.TypeFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(CoolParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(CoolParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(CoolParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelation(CoolParser.RelationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(CoolParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(CoolParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(CoolParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(CoolParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(CoolParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(CoolParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(CoolParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(CoolParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(CoolParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#length}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLength(CoolParser.LengthContext ctx);
}
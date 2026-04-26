package com.luv2code.designpatterns.behavioral.interpreter.v2_advanced_with_and_expression;

/**
 * Role: Non-Terminal expression (contains other rules)
 *
 * Interprets two expressions as a logical AND:
 * succeeds only if both left and right expressions succeed.
 */
public class AndExpression implements Expression {

    private Expression leftExpression;
    private Expression rightExpression;

    public AndExpression(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public boolean interpret(ChatContext chatContext) {
        return leftExpression.interpret(chatContext) && rightExpression.interpret(chatContext);
    }

}

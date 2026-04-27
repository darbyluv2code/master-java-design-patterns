package com.luv2code.designpatterns.behavioral.interpreter.v2_advanced_with_and_expression;

/**
 * Role: Abstract Expression
 *
 * Declares the interpret() method that all expressions must implement.
 */
public interface Expression {

    boolean interpret(ChatContext chatContext);
}

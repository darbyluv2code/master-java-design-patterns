package com.luv2code.designpatterns.behavioral.interpreter;

/**
 * Role: Abstract Expression
 *
 * Declares the interpret() method that all expressions must implement.
 */
public interface Expression {

    void interpret(ChatContext chatContext);
}

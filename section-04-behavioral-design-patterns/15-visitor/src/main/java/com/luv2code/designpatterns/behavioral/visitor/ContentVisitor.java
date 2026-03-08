package com.luv2code.designpatterns.behavioral.visitor;

/**
 * Role: Visitor
 *
 * Declares a visit method for each type of course content element.
 * Implement this interface to add a new operation to the course content.
 */
public interface ContentVisitor {

    // One method per element type
    // Allows each visitor to handle each type differently

    void visit(VideoLesson videoLesson);

    void visit(Quiz quiz);

    void visit(Assignment assignment);

}

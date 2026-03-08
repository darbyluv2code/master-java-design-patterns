package com.luv2code.designpatterns.behavioral.visitor;

/**
 * Role: Element
 *
 * Defines the contract for all course content elements.
 * Each element must accept a visitor.
 */
public interface CourseContent {

    String getTitle();

    void accept(ContentVisitor visitor);

}

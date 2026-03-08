package com.luv2code.designpatterns.behavioral.visitor;

/**
 * Role: Concrete Element
 *
 * Represents an assignment in the course.
 * Accepts a visitor and delegates to the correct visit method.
 */
public class Assignment implements CourseContent {

    private String title;
    private int estimatedCompletionMinutes;

    public Assignment(String title, int estimatedCompletionMinutes) {
        this.title = title;
        this.estimatedCompletionMinutes = estimatedCompletionMinutes;
    }

    @Override
    public String getTitle() {
        return title;
    }

    public int getEstimatedCompletionMinutes() {
        return estimatedCompletionMinutes;
    }

    @Override
    public void accept(ContentVisitor visitor) {
        visitor.visit(this);
    }
}

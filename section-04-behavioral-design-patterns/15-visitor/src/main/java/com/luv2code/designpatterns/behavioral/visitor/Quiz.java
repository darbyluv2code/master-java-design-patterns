package com.luv2code.designpatterns.behavioral.visitor;

/**
 * Role: Concrete Element
 *
 * Represents a quiz in the course.
 * Accepts a visitor and delegates to the correct visit method.
 */
public class Quiz implements CourseContent {

    private String title;
    private int numberOfQuestions;

    public Quiz(String title, int numberOfQuestions) {
        this.title = title;
        this.numberOfQuestions = numberOfQuestions;
    }

    @Override
    public String getTitle() {
        return title;
    }

    public int getNumberOfQuestions() {
        return numberOfQuestions;
    }

    @Override
    public void accept(ContentVisitor visitor) {
        visitor.visit(this);
    }
}

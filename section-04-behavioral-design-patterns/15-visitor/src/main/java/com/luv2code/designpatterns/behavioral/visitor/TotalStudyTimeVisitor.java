package com.luv2code.designpatterns.behavioral.visitor;

/**
 * Role: Concrete Visitor
 *
 * Estimates the total study time for the course by summing
 * the time for each content element.
 */
public class TotalStudyTimeVisitor implements ContentVisitor {

    private static final int MINUTES_PER_QUESTION = 2;

    private int totalMinutes = 0;

    @Override
    public void visit(VideoLesson videoLesson) {
        System.out.println("Processing VideoLesson: " + videoLesson.getTitle());
        totalMinutes += videoLesson.getDurationInMinutes();
    }

    @Override
    public void visit(Quiz quiz) {
        System.out.println("Processing Quiz: " + quiz.getTitle());
        totalMinutes += quiz.getNumberOfQuestions() * MINUTES_PER_QUESTION;
    }

    @Override
    public void visit(Assignment assignment) {
        System.out.println("Processing Assignment: " + assignment.getTitle());
        totalMinutes += assignment.getEstimatedCompletionMinutes();
    }

    public int getTotalMinutes() {
        return totalMinutes;
    }
}

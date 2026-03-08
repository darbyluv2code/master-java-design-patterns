package com.luv2code.designpatterns.behavioral.visitor;

/**
 * Role: Concrete Element
 *
 * Represents a video lesson in the course.
 * Accepts a visitor and delegates to the correct visit method.
 */
public class VideoLesson implements CourseContent {

    private String title;
    private int durationInMinutes;

    public VideoLesson(String title, int durationInMinutes) {
        this.title = title;
        this.durationInMinutes = durationInMinutes;
    }

    @Override
    public String getTitle() {
        return title;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    @Override
    public void accept(ContentVisitor visitor) {
        visitor.visit(this);
    }
}

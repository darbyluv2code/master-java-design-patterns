package com.luv2code.designpatterns.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Role: Object Structure
 *
 * Holds a collection of course content elements.
 * Applies a visitor to each element by calling accept().
 */
public class Course {

    private String courseName;
    private List<CourseContent> contents;

    public Course(String courseName) {
        this.courseName = courseName;
        this.contents = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void addContent(CourseContent theContent) {
        contents.add(theContent);
    }

    public void accept(ContentVisitor visitor) {

        for (CourseContent theContent : contents) {
            theContent.accept(visitor); // each element then calls visitor.visit(this)
        }
    }
}











package com.luv2code.designpatterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Role: Aggregate (Collection)
 *
 * Stores the collection of Course objects and
 * provides a method to create an iterator.
 */
public class CourseCatalog {

    private List<Course> courses = new ArrayList<>();

    public void addCourse(Course course) {
        courses.add(course);
    }

    public PatternIterator<Course> iterator() {
        return new CourseIterator(courses);
    }

    public PatternIterator<Course> reverseIterator() {
        return new ReverseCourseIterator(courses);
    }

}













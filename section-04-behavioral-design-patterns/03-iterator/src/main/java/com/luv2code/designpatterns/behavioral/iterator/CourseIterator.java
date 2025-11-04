package com.luv2code.designpatterns.behavioral.iterator;

import java.util.List;
import java.util.NoSuchElementException;

/**
 * Role: Concrete Iterator
 *
 * Implements traversal logic and maintains the
 * current position within the course list.
 */
public class CourseIterator implements PatternIterator<Course> {

    private List<Course> courses;
    private int index = 0;

    public CourseIterator(List<Course> courses) {
        this.courses = courses;
    }

    /**
     * Return true if there is a next course, else false
     */
    @Override
    public boolean hasNext() {
        return index < courses.size();
    }

    /**
     * Return the next course
     */
    @Override
    public Course next() {

        if (!hasNext()) {
            throw new NoSuchElementException();
        }

        Course course = courses.get(index);
        index++;

        return course;
    }
}

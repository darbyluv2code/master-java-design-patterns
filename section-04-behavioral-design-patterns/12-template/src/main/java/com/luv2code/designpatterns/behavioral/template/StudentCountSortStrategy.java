package com.luv2code.designpatterns.behavioral.template;

import java.util.Comparator;

/**
 * Role: Concrete Strategy
 *
 * Sorts courses by student count.
 */
public class StudentCountSortStrategy extends AbstractSortStrategy {

    public StudentCountSortStrategy() {
    }

    public StudentCountSortStrategy(SortDirection direction) {
        super(direction);
    }

    @Override
    protected Comparator<Course> getComparator() {
        return Comparator.comparingInt(Course::getStudentCount);
    }

}

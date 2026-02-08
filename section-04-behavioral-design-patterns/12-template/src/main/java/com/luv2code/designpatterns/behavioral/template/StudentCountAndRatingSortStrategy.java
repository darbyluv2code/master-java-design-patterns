package com.luv2code.designpatterns.behavioral.template;

import java.util.Comparator;

/**
 * Role: Concrete Strategy
 *
 * Sorts courses by student count, then by rating as a tiebreaker.
 */
public class StudentCountAndRatingSortStrategy extends AbstractSortStrategy {

    public StudentCountAndRatingSortStrategy() {
    }

    public StudentCountAndRatingSortStrategy(SortDirection direction) {
        super(direction);
    }

    @Override
    protected Comparator<Course> getComparator() {
        return Comparator.comparingInt(Course::getStudentCount)
                .thenComparingDouble(Course::getRating);
    }

}









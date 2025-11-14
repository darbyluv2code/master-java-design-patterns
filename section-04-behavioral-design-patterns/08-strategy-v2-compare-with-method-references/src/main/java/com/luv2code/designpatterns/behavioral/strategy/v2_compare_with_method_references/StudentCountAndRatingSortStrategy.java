package com.luv2code.designpatterns.behavioral.strategy.v2_compare_with_method_references;

import java.util.Comparator;
import java.util.List;

/**
 * Concrete strategy that sorts courses by student count first,
 * then by rating as a tiebreaker.
 *
 * This implements a composite sorting strategy where:
 * - Primary sort: student count
 * - Secondary sort: rating
 */
public class StudentCountAndRatingSortStrategy implements SortStrategy {

    private final SortDirection direction;

    public StudentCountAndRatingSortStrategy() {
        this(SortDirection.ASCENDING);
    }

    public StudentCountAndRatingSortStrategy(SortDirection direction) {

        if (direction == null) {
            throw new IllegalArgumentException("Sort direction must be non-null");
        }

        this.direction = direction;
    }

    @Override
    public void sort(List<Course> courses) {

        // Create a comparator that first compares by student count, then by rating
        Comparator<Course> comparator = Comparator.comparingInt(Course::getStudentCount)
                .thenComparingDouble(Course::getRating);

        if (direction == SortDirection.DESCENDING) {
            comparator = comparator.reversed();
        }

        courses.sort(comparator);
    }
}









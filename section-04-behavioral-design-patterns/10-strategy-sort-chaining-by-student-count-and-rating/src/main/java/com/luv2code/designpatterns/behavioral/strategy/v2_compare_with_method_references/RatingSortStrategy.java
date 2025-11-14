package com.luv2code.designpatterns.behavioral.strategy.v2_compare_with_method_references;

import java.util.Comparator;
import java.util.List;

/**
 * Role: Concrete Strategy
 *
 * Implements sorting algorithm for courses by rating.
 * Sorts course by rating in ascending or descending order.
 */
public class RatingSortStrategy implements SortStrategy {

    private final SortDirection direction;

    public RatingSortStrategy() {
        this(SortDirection.ASCENDING);
    }

    public RatingSortStrategy(SortDirection direction) {

        if (direction == null) {
            throw new IllegalArgumentException("Sort direction must be non-null");
        }

        this.direction = direction;
    }

    @Override
    public void sort(List<Course> courses) {
        Comparator<Course> comparator = Comparator.comparing(Course::getRating);

        if (direction == SortDirection.DESCENDING) {
            comparator = comparator.reversed();
        }

        courses.sort(comparator);
    }

}

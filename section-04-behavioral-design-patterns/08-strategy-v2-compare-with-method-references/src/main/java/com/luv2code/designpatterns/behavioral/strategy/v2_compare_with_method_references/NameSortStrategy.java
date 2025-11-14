package com.luv2code.designpatterns.behavioral.strategy.v2_compare_with_method_references;

import java.util.Comparator;
import java.util.List;

/**
 * Role: Concrete Strategy
 *
 * Implements sorting algorithm for courses by name.
 * Supports both ascending (default) and descending order.
 */
public class NameSortStrategy implements SortStrategy {

    private final SortDirection direction;

    // Default constructor - sorts in ascending order
    public NameSortStrategy() {
        this(SortDirection.ASCENDING);
    }

    // Constructor with explicit direction
    public NameSortStrategy(SortDirection direction) {

        if (direction == null) {
            throw new IllegalArgumentException("Sort direction must be non-null");
        }

        this.direction = direction;
    }

    @Override
    public void sort(List<Course> courses) {
        Comparator<Course> comparator = Comparator.comparing(Course::getName);

        if (direction == SortDirection.DESCENDING) {
            comparator = comparator.reversed();
        }

        courses.sort(comparator);
    }

}










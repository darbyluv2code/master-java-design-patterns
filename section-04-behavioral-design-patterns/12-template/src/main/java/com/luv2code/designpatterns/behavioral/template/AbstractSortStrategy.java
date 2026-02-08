package com.luv2code.designpatterns.behavioral.template;

import java.util.Comparator;
import java.util.List;

/**
 * Abstract base class for sorting strategies.
 *
 * Provides direction support (ascending/descending) for all subclasses.
 * Subclasses implement getComparator() to define their sorting criteria.
 */
public abstract class AbstractSortStrategy implements SortStrategy {

    private final SortDirection direction;

    // Default constructor
    protected AbstractSortStrategy() {
        this(SortDirection.ASCENDING);
    }

    // Parameterized constructor
    protected AbstractSortStrategy(SortDirection direction) {
        if (direction == null) {
            throw new IllegalArgumentException("Sort direction must be non-null");
        }
        this.direction = direction;
    }

    @Override
    public void sort(List<Course> courses) {
        Comparator<Course> comparator = getComparator();

        if (direction == SortDirection.DESCENDING) {
            comparator = comparator.reversed();
        }

        courses.sort(comparator);
    }

    // Template method: subclasses provide the specific comparator
    protected abstract Comparator<Course> getComparator();

}

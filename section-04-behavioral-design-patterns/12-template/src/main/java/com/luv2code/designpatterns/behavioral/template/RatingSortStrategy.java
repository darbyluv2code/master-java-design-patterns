package com.luv2code.designpatterns.behavioral.template;

import java.util.Comparator;

/**
 * Role: Concrete Strategy
 *
 * Sorts courses by rating.
 */
public class RatingSortStrategy extends AbstractSortStrategy {

    public RatingSortStrategy() {
    }

    public RatingSortStrategy(SortDirection direction) {
        super(direction);
    }

    @Override
    protected Comparator<Course> getComparator() {
        return Comparator.comparingDouble(Course::getRating);
    }

}

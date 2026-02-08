package com.luv2code.designpatterns.behavioral.template;

import java.util.Comparator;

/**
 * Role: Concrete Strategy
 *
 * Sorts courses by name.
 */
public class NameSortStrategy extends AbstractSortStrategy {

    public NameSortStrategy() {
    }

    public NameSortStrategy(SortDirection direction) {
        super(direction);
    }

    @Override
    protected Comparator<Course> getComparator() {
        return Comparator.comparing(Course::getName);
    }

}










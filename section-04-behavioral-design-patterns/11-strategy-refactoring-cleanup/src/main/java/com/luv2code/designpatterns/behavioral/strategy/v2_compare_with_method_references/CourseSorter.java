package com.luv2code.designpatterns.behavioral.strategy.v2_compare_with_method_references;

import java.util.List;

/**
 * Role: Context
 *
 * Maintains a reference to a SortStrategy and delegates sorting to it.
 * Allows clients to change sorting behavior by providing different strategies.
 */
public class CourseSorter {

    private SortStrategy sortStrategy;

    public CourseSorter(SortStrategy sortStrategy) {

        if (sortStrategy == null) {
            throw new IllegalArgumentException("Sort strategy must be non-null");
        }

        this.sortStrategy = sortStrategy;
    }

    public void setSortStrategy(SortStrategy sortStrategy) {

        if (sortStrategy == null) {
            throw new IllegalArgumentException("Sort strategy must be non-null");
        }

        this.sortStrategy = sortStrategy;
    }

    public void sort(List<Course> courses) {

        if (courses == null) {
            throw new IllegalArgumentException("Courses must be non-null");
        }

        sortStrategy.sort(courses);

    }
}

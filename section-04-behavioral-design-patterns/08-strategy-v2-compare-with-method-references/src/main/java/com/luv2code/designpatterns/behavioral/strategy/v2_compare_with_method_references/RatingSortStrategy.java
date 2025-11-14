package com.luv2code.designpatterns.behavioral.strategy.v2_compare_with_method_references;

import java.util.Comparator;
import java.util.List;

/**
 * Role: Concrete Strategy
 *
 * Implements sorting algorithm for courses by rating.
 * Sorts course by rating in ascending order.
 */
public class RatingSortStrategy implements SortStrategy {

    @Override
    public void sort(List<Course> courses) {
        courses.sort(Comparator.comparing(Course::getRating));
    }

}

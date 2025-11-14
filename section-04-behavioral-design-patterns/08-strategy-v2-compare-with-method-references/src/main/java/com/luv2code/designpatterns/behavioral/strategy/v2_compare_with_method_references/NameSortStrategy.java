package com.luv2code.designpatterns.behavioral.strategy.v2_compare_with_method_references;

import java.util.Comparator;
import java.util.List;

/**
 * Role: Concrete Strategy
 *
 * Implements sorting algorithm for courses by name.
 * Sorts course by name in ascending order.
 */
public class NameSortStrategy implements SortStrategy {

    @Override
    public void sort(List<Course> courses) {
        courses.sort(Comparator.comparing(Course::getName));
    }

}










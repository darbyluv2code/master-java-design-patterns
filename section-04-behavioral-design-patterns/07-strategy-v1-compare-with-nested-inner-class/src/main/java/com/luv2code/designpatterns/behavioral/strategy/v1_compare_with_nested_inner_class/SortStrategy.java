package com.luv2code.designpatterns.behavioral.strategy.v1_compare_with_nested_inner_class;

import java.util.List;

/**
 * Role: Strategy
 *
 * Defines the interface for different sorting algorithms.
 * Allows the sorting behavior to be selected at runtime.
 */
public interface SortStrategy {

    void sort(List<Course> courses);

}

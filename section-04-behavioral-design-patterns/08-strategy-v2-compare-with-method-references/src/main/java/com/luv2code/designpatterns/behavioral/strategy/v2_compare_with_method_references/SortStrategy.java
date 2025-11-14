package com.luv2code.designpatterns.behavioral.strategy.v2_compare_with_method_references;

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

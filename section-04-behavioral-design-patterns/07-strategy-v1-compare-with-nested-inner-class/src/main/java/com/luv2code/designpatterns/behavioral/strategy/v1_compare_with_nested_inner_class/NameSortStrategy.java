package com.luv2code.designpatterns.behavioral.strategy.v1_compare_with_nested_inner_class;

import java.util.Comparator;
import java.util.List;

/**
 * Role: Concrete Strategy
 *
 * Implements sorting algorithm for courses by name.
 * Sorts courses alphabetically in ascending order.
 */
public class NameSortStrategy implements SortStrategy {

    // Define a custom comparator that decides ordering based on the course name
    // inner class
    class NameComparator implements Comparator<Course> {

        // returns: negative if course1 < course2, zero if equal, positive if course1 > course2
        @Override
        public int compare(Course course1, Course course2) {

            // Uses the String method: compareTo()
            return course1.getName().compareTo(course2.getName());

        }

    }

    private Comparator<Course> nameComparator = new NameComparator();

    @Override
    public void sort(List<Course> courses) {
        courses.sort(nameComparator);
    }

}

package com.luv2code.designpatterns.behavioral.strategy.v2_compare_with_method_references;

import java.util.ArrayList;
import java.util.List;

/**
 * Role: Client
 *
 * Demonstrates the Strategy pattern by sorting courses using different strategies.
 * Shows how sorting behavior can be changed by providing different strategy implementations.
 * Can even change sorting strategy at runtime.
 */
public class MainApp {

    public static void main(String[] args) {

        List<Course> courses = new ArrayList<>();

        Course course1 = new Course("JavaScript for Beginners", 4.8, 9800);
        Course course2 = new Course("Advanced Game Development", 4.5, 4350);
        Course course3 = new Course("Building Scalable Cloud Solutions", 4.9, 1200);

        courses.add(course1);
        courses.add(course2);
        courses.add(course3);

        System.out.println("=== Before Sorting ===");
        displayCourses(courses);

        System.out.println();

        // Create sorter with initial strategy (default ascending order)
        CourseSorter courseSorter = new CourseSorter(new NameSortStrategy());

        System.out.println("=== Sort by name (ascending - default) ===");
        courseSorter.sort(courses);
        displayCourses(courses);

        System.out.println();

        // Change strategy at runtime with explicit descending order
        System.out.println("=== Sort by name (descending) ===");
        courseSorter.setSortStrategy(new NameSortStrategy(SortDirection.DESCENDING));
        courseSorter.sort(courses);
        displayCourses(courses);

        System.out.println();

        // Change to different sorting criteria with default ascending
        System.out.println("=== Sort by rating (ascending - default) ===");
        courseSorter.setSortStrategy(new RatingSortStrategy());
        courseSorter.sort(courses);
        displayCourses(courses);

        System.out.println();

        // Change to descending
        System.out.println("=== Sort by rating (descending) ===");
        courseSorter.setSortStrategy(new RatingSortStrategy(SortDirection.DESCENDING));
        courseSorter.sort(courses);
        displayCourses(courses);

        System.out.println();

        // Sort by student count ascending
        System.out.println("=== Sort by number of students (ascending - default) ===");
        courseSorter.setSortStrategy(new StudentCountSortStrategy());
        courseSorter.sort(courses);
        displayCourses(courses);

        System.out.println();

        // Sort by student count descending
        System.out.println("=== Sort by number of students (descending) ===");
        courseSorter.setSortStrategy(new StudentCountSortStrategy(SortDirection.DESCENDING));
        courseSorter.sort(courses);
        displayCourses(courses);

        System.out.println();

    }

    private static void displayCourses(List<Course> courses) {

        for (Course course : courses) {
            System.out.println(course);
        }

    }
}














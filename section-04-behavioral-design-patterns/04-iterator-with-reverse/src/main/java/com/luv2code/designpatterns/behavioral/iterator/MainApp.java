package com.luv2code.designpatterns.behavioral.iterator;

/**
 * Role: Client
 *
 * Demonstrates the Iterator design patter in action.
 * Uses the Iterator to traverse a CourseCatalog without
 * exposing the collection's internal structure.
 */
public class MainApp {

    public static void main(String[] args) {

        // create a collection and add courses
        CourseCatalog courseCatalog = new CourseCatalog();

        courseCatalog.addCourse(new Course("Master Java Design Patterns"));
        courseCatalog.addCourse(new Course("Spring Boot for Beginners"));
        courseCatalog.addCourse(new Course("Modern Spring Boot REST APIs"));

        // get a handle to the iterator
        // PatternIterator<Course> courseIterator = courseCatalog.iterator();
        PatternIterator<Course> courseIterator = courseCatalog.reverseIterator();

        // use the iterator to loop through the courses, print course name
        while (courseIterator.hasNext()) {
            Course tempCourse = courseIterator.next();
            System.out.println("Course name: " + tempCourse.getName());
        }

    }
}













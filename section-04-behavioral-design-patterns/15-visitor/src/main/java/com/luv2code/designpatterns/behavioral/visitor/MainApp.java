package com.luv2code.designpatterns.behavioral.visitor;

/**
 * Role: Client
 *
 * Demonstrates the Visitor pattern through three teaching scenarios.
 * The course structure is built once and can accept any number of visitors.
 */
public class MainApp {

    static void main() {

        Course course = buildCourse();

        System.out.println("--- Demo 1: Content Count Report ---");
        runContentCountDemo(course);

        System.out.println("\n--- Demo 2: Study Time Report ---");
        runStudyTimeDemo(course);

        System.out.println("\n--- Demo 3: Multiple Visitors on the Same Course ---");
        runMultipleVisitorsDemo(course);

    }

    private static void runMultipleVisitorsDemo(Course course) {

        // New visitor instances are required because
        // each visitor accumulates state as it runs

        ContentCountVisitor contentCountVisitor = new ContentCountVisitor();
        course.accept(contentCountVisitor);

        System.out.println("Course: " + course.getCourseName());
        System.out.println("Videos: " + contentCountVisitor.getVideoCount());
        System.out.println("Quizzes: " + contentCountVisitor.getQuizCount());
        System.out.println("Assignments: " + contentCountVisitor.getAssignmentCount());

        System.out.println();

        TotalStudyTimeVisitor totalStudyTimeVisitor = new TotalStudyTimeVisitor();
        course.accept(totalStudyTimeVisitor);
        System.out.println("Study time: " + totalStudyTimeVisitor.getTotalMinutes() + " minutes");
    }

    private static void runStudyTimeDemo(Course course) {

        TotalStudyTimeVisitor totalStudyTimeVisitor = new TotalStudyTimeVisitor();
        course.accept(totalStudyTimeVisitor);

        System.out.println("\nEstimated total study time: "
                + totalStudyTimeVisitor.getTotalMinutes()
                + " minutes");

    }

    private static void runContentCountDemo(Course course) {

        ContentCountVisitor contentCountVisitor = new ContentCountVisitor();
        course.accept(contentCountVisitor);

        System.out.println("Course: " + course.getCourseName());
        System.out.println("Videos: " + contentCountVisitor.getVideoCount());
        System.out.println("Quizzes: " + contentCountVisitor.getQuizCount());
        System.out.println("Assignments: " + contentCountVisitor.getAssignmentCount());
    }

    private static Course buildCourse() {
        Course course = new Course("Master Java Design Patterns");

        course.addContent(new VideoLesson("Visitor Pattern Overview", 12));
        course.addContent(new VideoLesson("Visitor Pattern Coding Example", 15));
        course.addContent(new Quiz("Visitor Pattern Quiz", 5));
        course.addContent(new Assignment("Build a Visitor Implementation", 30));

        return course;
    }
}









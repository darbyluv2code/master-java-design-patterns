package com.luv2code.designpatterns.behavioral.strategy.v1_compare_with_nested_inner_class;

/**
 * Role: Element
 *
 * The element we will sort on.
 */
public class Course {

    private String name;
    private double rating;
    private int studentCount;

    public Course(String name, double rating, int studentCount) {
        this.name = name;
        this.rating = rating;
        this.studentCount = studentCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                ", studentCount=" + studentCount +
                '}';
    }
}

package com.skillforge;

import java.util.Arrays;

// Course details
public abstract class Course implements ICertifiable {

    protected String title;
    protected Instructor instructor;
    protected String[] modules;

    private double rating;           // encapsulated
    private String[] reviews;         // read-only data

    // Constructor with default modules
    public Course(String title, Instructor instructor) {
        this(title, instructor, new String[]{"Intro", "Basics", "Advanced"});
    }

    // Constructor with custom modules
    public Course(String title, Instructor instructor, String[] modules) {
        this.title = title;
        this.instructor = instructor;
        this.modules = modules;
        this.rating = 4.0; // default rating
        this.reviews = new String[]{"Very good course", "Helpful content"};
    }

    // Rating calculation protected
    protected void updateRating(double newRating) {
        rating = (rating + newRating) / 2; // operator usage
    }

    public double getRating() {
        return rating;
    }

    // Reviews sirf read-only
    public String[] getReviews() {
        return Arrays.copyOf(reviews, reviews.length);
    }

    public int getTotalModules() {
        return modules.length;
    }

    public void showCourseDetails() {
        System.out.println("Course: " + title);
        System.out.println("Instructor: " + instructor.getName());
        System.out.println("Modules: " + Arrays.toString(modules));
        System.out.println("Rating: " + rating);
    }
}

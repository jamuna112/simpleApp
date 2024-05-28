package com.bueno.simpleApp.model;

public class Course {

    private long id;
    private String course;
    private String description;


    public Course() {
    }

    public Course(long id, String course, String description) {
        this.id = id;
        this.course = course;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



}

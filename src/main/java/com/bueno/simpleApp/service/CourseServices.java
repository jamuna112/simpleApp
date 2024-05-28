package com.bueno.simpleApp.service;

import com.bueno.simpleApp.model.Course;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface CourseServices {

    public List<Course> getAllCourse();
    public Course getCourse(long courseId);
    public Course createCourse(Course course);
    public Course updateCourse(long courseId, Course course);
    public void deleteCourse(long courseId);
}

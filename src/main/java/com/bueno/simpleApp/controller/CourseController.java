package com.bueno.simpleApp.controller;
import com.bueno.simpleApp.model.Course;
import com.bueno.simpleApp.service.CourseServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class CourseController {

    @Autowired
    private CourseServices courseServices;

    @GetMapping("/home")
    public String getGreetingMessage() {
        return "Hello, How are you..";
    }

    @GetMapping("/courses")
    public List<Course> getAllEmployees() {

        return this.courseServices.getAllCourse();
    }

    @GetMapping("/course/{courseId}")
    public Course getCourse(@PathVariable long courseId) {
        return this.courseServices.getCourse(courseId);
    }

    @PostMapping("/course/create")
    public Course createCourse(@RequestBody Course course) {
        return this.courseServices.createCourse(course);
    }

    @PutMapping("/course/{courseId}")
    public Course updateCourse(@PathVariable long courseId, @RequestBody Course course) {

        return this.courseServices.updateCourse(courseId, course);
    }

    @DeleteMapping("/course/{courseId}")
    public void deleteCourse(@PathVariable long courseId) {

         this.courseServices.deleteCourse(courseId);
    }

}
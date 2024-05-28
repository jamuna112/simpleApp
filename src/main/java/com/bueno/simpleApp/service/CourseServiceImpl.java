package com.bueno.simpleApp.service;

import com.bueno.simpleApp.model.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseServices{

    List<Course> coursesList;

    public CourseServiceImpl(){
        coursesList = new ArrayList<>();
        Course course = new Course(12, "Java Core", "Basic of core java course");
        Course course1 = new Course(13, "Spring Framework", "rest api using spring framework");

        coursesList.add(course);
        coursesList.add(course1);
    }
    @Override
    public List<Course> getAllCourse() {
        return coursesList;
    }

    @Override
    public Course getCourse(long courseId) {

        Course c = null;
        for(Course course: coursesList){
            if(course.getId() == courseId){
                c = course;
                break;
            }
        }
        return c;
    }

    @Override
    public Course createCourse(Course course) {
        coursesList.add(course);
        return course;
    }

    @Override
    public Course updateCourse(long courseId, Course course) {
        Course cou = null ;
       for(Course c : coursesList){
           if(c.getId() == courseId){
               c.setCourse(course.getCourse());
               c.setDescription(course.getDescription());
               cou =  c;
               break;
           }
       }
       return cou;
    }

    @Override
    public void deleteCourse(long courseId) {
        Course course = null;

        for(Course c : coursesList){
            if(c.getId() == courseId){
                course = c;
            }
        }

        if(course == null){
            System.out.println("Invalid record");
        } else {
            coursesList.remove(course);
        }
    }

}

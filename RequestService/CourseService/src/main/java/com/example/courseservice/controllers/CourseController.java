package com.example.courseservice.controllers;

import com.example.courseservice.entity.Course;
import com.example.courseservice.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    private CourseRepository courseRepository;
    @PostMapping("/course-service/create")
    public Course create
            (@RequestBody Course course){
        return courseRepository.save(course);
    }
    @GetMapping("/course-service/read")
    public List<Course> read(){return courseRepository.findAll();}

}

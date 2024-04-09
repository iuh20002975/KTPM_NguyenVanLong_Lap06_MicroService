package com.example.service2.controllers;

import com.example.service2.entity.Course;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class CourseController {
    private final String createCourseApi = "http://localhost:8080/course-service/create";
    private final String readCourseApi = "http://localhost:8080/course-service/read";
    RestTemplate restTemplate = new RestTemplate();

    @PostMapping("/course-service2/create")
    public Course create(@RequestBody Course subject){
        HttpEntity<Course> request = new HttpEntity<>(subject);
        ResponseEntity<Course> responseEntity = restTemplate.exchange(
                createCourseApi,
                HttpMethod.POST,
                request,
                new ParameterizedTypeReference<Course>() {}
        );
        return responseEntity.getBody();
    }


    @GetMapping("/course-service2/read")
    public List<Course> read(){



        ResponseEntity<List<Course>> responseEntity = restTemplate.exchange(
                readCourseApi,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Course>>() {}
        );
        return responseEntity.getBody();
    }
}

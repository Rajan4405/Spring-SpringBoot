package com.learn.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class CourseController {

  public String requestMethodName(@RequestParam String param) {
    return new String();
  }

  @RequestMapping("/courses")
  public List<Course> getAllCourses() {
    return Arrays.asList(
        new Course(1, "Peter", "John"),
        new Course(1, "Rajan", "John"),
        new Course(1, "Santosh", "John"),
        new Course(1, "John", "Peter"));
  }
}

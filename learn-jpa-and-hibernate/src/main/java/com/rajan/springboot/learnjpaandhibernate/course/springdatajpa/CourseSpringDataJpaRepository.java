package com.rajan.springboot.learnjpaandhibernate.course.springdatajpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rajan.springboot.learnjpaandhibernate.course.Course;
import java.util.List;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {
  List<Course> findByAuthor(String author);

  List<Course> findByName(String name);
}

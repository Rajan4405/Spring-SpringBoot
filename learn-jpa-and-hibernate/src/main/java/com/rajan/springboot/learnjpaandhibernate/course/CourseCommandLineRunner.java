package com.rajan.springboot.learnjpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.rajan.springboot.learnjpaandhibernate.course.jdbc.CourseJdbcRepository;
import com.rajan.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

  // @Autowired
  // private CourseJdbcRepository repository;

  @Autowired
  private CourseJpaRepository repository;

  @Override
  public void run(String... args) throws Exception {
    repository.insert(new Course(1, "Learn Java", "Rajan"));
    repository.insert(new Course(2, "Learn AWS", "Rajan"));
    repository.insert(new Course(3, "Learn NodeJs", "Rajan"));

    repository.deleteById(1);
    System.out.println(repository.findById(2));
    System.out.println(repository.findById(3));
  }
}

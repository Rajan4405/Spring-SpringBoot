package com.rajan.springboot.learnjpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

// import com.rajan.springboot.learnjpaandhibernate.course.jdbc.CourseJdbcRepository;
// import com.rajan.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import com.rajan.springboot.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

  // @Autowired
  // private CourseJdbcRepository repository;

  // @Autowired
  // private CourseJpaRepository repository;

  @Autowired
  private CourseSpringDataJpaRepository repository;

  @Override
  public void run(String... args) throws Exception {
    // repository.insert(new Course(1, "Learn Java", "Rajan"));
    // repository.insert(new Course(2, "Learn AWS", "Rajan"));
    // repository.insert(new Course(3, "Learn NodeJs", "Rajan"));
    repository.save(new Course(1, "Learn Java", "Rajan"));
    repository.save(new Course(2, "Learn AWS", "Rajan"));
    repository.save(new Course(3, "Learn NodeJs", "Rajan"));

    // repository.deleteById(1l);
    // System.out.println(repository.findById(2l));
    // System.out.println(repository.findById(3l));

    System.out.println(repository.findAll());
    System.out.println(repository.count());

    System.out.println(repository.findByAuthor("Rajan"));
    System.out.println(repository.findByName("Learn Java"));

  }
}

package com.rajan.springboot.learnjpaandhibernate.course;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {

  @Id
  private long id;
  private String name;
  private String author;

  public Course() {

  }

  public Course(long id, String name, String author) {
    super();
    this.id = id;
    this.name = name;
    this.author = author;
  }

  public long getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  public String getAuthor() {
    return this.author;
  }

  public void setId(long id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  @Override
  public String toString() {
    return "Course [id=]" + id + "name=" + name + ", author" + author + "]";
  }

}

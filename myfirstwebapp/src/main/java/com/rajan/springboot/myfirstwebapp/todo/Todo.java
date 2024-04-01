package com.rajan.springboot.myfirstwebapp.todo;

import java.time.LocalDate;

import jakarta.validation.constraints.Size;

// Database (MySql)
// static list of todos => Database (H2, MYSQL)

public class Todo {

  public Todo(int id, String username, String description, LocalDate targetDate, boolean isDone) {
    this.id = id;
    this.username = username;

    this.description = description;
    this.targetDate = targetDate;
    this.isDone = isDone;
  }

  private int id;
  private String username;

  @Size(min = 10, message = "Description must be at least 10 characters long")
  private String description;
  private LocalDate targetDate;
  private boolean isDone;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public LocalDate getTargetDate() {
    return targetDate;
  }

  public void setTargetDate(LocalDate targetDate) {
    this.targetDate = targetDate;
  }

  public boolean getIsDone() {
    return isDone;
  }

  public void setDone(boolean isDone) {
    this.isDone = isDone;
  }

  @Override
  public String toString() {
    return "Todo [id=" + id + ", username=" + username + ", description=" + description + ", targetDate=" + targetDate
        + ", isDone=" + isDone + "]";
  }

}

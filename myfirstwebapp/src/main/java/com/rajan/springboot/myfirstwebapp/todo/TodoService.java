package com.rajan.springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import jakarta.validation.Valid;

@Service
public class TodoService {
  private static List<Todo> todos = new ArrayList<>();

  private static int todosCount = 0;
  static {
    todos.add(new Todo(++todosCount, "quick coder", "Learn NodeJs", LocalDate.now().plusYears(1), false));
    todos.add(new Todo(++todosCount, "quick coder", "Learn Java", LocalDate.now().plusYears(1), false));
    todos.add(new Todo(++todosCount, "quick coder", "Learn React", LocalDate.now().plusYears(1), false));
  }

  public List<Todo> findBuUsername(String username) {
    return todos;
  }

  public void addTodo(String username, String description, LocalDate targetDate, boolean isDone) {
    Todo todo = new Todo(++todosCount, username, description, targetDate, false);
    todos.add(todo);
  }

  public void deleteById(int id) {
    todos.removeIf(todo -> todo.getId() == id);
  }

  public void updateById(int id) {
    todos.removeIf(todo -> todo.getId() == id);
  }

  public Todo findById(int id) {
    return todos.stream().filter(t -> t.getId() == id).findFirst().get();
  }

  public void updateTodo(@Valid Todo todo) {
    deleteById(todo.getId());
    todos.add(todo);
  }
}

package com.rajan.springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import jakarta.validation.Valid;

@Controller
@SessionAttributes("name")
public class TodoController {
  // /lits-todos

  public TodoController(TodoService todoService) {
    this.todoService = todoService;
  }

  private TodoService todoService;

  @RequestMapping("list-todos")
  public String listAllTodos(ModelMap modelMap) {
    List<Todo> todos = todoService.findBuUsername("quick coder");
    modelMap.addAttribute("todos", todos);
    return "listTodos";
  }

  @RequestMapping(value = "add-todo", method = RequestMethod.GET)
  public String showNewTodoPage(ModelMap modelMap) {
    String name = (String) modelMap.get("name");
    Todo todo = new Todo(0, name, "", LocalDate.now().plusYears(1), false);
    modelMap.put("todo", todo);
    return "todo";
  }

  @RequestMapping(value = "add-todo", method = RequestMethod.POST)
  public String addNewTodoPage(ModelMap modelMap, @Valid Todo todo, BindingResult bindingResult) {
    if (bindingResult.hasErrors()) {
      return "todo";
    }
    todoService.addTodo((String) modelMap.get("name"), todo.getDescription(), todo.getTargetDate(), false);
    return "redirect:list-todos";
  }

  @RequestMapping("delete-todo")
  public String deleteTodo(@RequestParam int id) {
    // Delete todo
    todoService.deleteById(id);

    return "redirect:list-todos";
  }

  @RequestMapping(value = "update-todo", method = RequestMethod.GET)
  public String showUpdateTodoPage(@RequestParam int id, ModelMap modelMap) {
    Todo todo = todoService.findById(id);
    modelMap.addAttribute("todo", todo);
    return "todo";
  }

  @RequestMapping(value = "update-todo", method = RequestMethod.POST)
  public String updateTodoPage(ModelMap modelMap, @Valid Todo todo, BindingResult bindingResult) {
    if (bindingResult.hasErrors()) {
      return "todo";
    }
    String username = (String) modelMap.get("name");
    todo.setUsername(username);
    todoService.updateTodo(todo);
    return "redirect:list-todos";
  }

}

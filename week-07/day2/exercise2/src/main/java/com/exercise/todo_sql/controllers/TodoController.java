package com.exercise.todo_sql.controllers;

import com.exercise.todo_sql.models.ToDo;
import com.exercise.todo_sql.services.ToDoService;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/todo")
public class TodoController {

  @Autowired
  ToDoService toDoService;

  @RequestMapping(value = {"/list", "/"}, method = RequestMethod.GET)
  public String list(Model model) {
    model.addAttribute("todoList", toDoService.findAll());
    return "todolist";
  }

  @GetMapping("/table")
  public String getTable(Model model,
      @RequestParam(name = "isActive", required = false) String isActive) {
    if(isActive==null) {
      model.addAttribute("table", toDoService.findAll());
      return "todotable";
    }
    if (isActive.equals("true")) {
      List<ToDo> filteredByDone= toDoService.findAll().stream().filter(toDo -> toDo.isDone()==false)
              .collect(Collectors.toList());
      model.addAttribute("table", filteredByDone);
      return "todotable";
    } else {
      List<ToDo> filteredTodo =toDoService.findAll().stream().filter(todo->todo.isDone()==true)
          .collect(Collectors.toList());
      model.addAttribute("table", filteredTodo);
      return "todotable";
    }
  }

  @GetMapping("/create")
  public String getCreateForm(){
    return "create";
  }

  @PostMapping("/create")
  public String createTodo( @ModelAttribute(name="title") String title) {
    ToDo toDo = new ToDo(title);
    toDoService.save(toDo);
    return "redirect:/todo/table";
  }
}

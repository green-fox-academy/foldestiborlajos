package com.excercise.listing_todo.controllers;

import com.excercise.listing_todo.models.ToDo;
import com.excercise.listing_todo.services.ToDoable;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/todo")
public class TodoController {

  @Autowired
  ToDoable toDoable;

  @RequestMapping(value= {"/list", "/"}, method = RequestMethod.GET)
  public String list(Model model){
    List<ToDo> todoList = new ArrayList<>();
    toDoable.findAll().forEach(toDo -> todoList.add(toDo));
    model.addAttribute("todoList", todoList);
    return "todolist"  ;
  }
}

package com.exercise.todo_sql.controllers;

import com.exercise.todo_sql.models.ToDo;
import com.exercise.todo_sql.services.ToDoService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
      @RequestParam(name = "isActive", required = false) String isActive,
      @RequestParam(name = "isUrgent", required = false) String isUrgent,
      @RequestParam(name = "searchTitle", required = false) String searchTitle) {
    if (searchTitle == null) {
      if (isActive == null) {
        model.addAttribute("table", toDoService.findAll());
        if (isUrgent == null) {
          model.addAttribute("table", toDoService.findAll());
        } else {
          model.addAttribute("table", toDoService.filteredByUrgent());
        }
        return "todotable";
      } else {
        model.addAttribute("table", toDoService.filteredByDone());
        if (isUrgent == null) {
          model.addAttribute("table", toDoService.filteredByDone());
        } else {
          model.addAttribute("table", toDoService.filteredByUrgent(toDoService.filteredByDone()));
        }
      }

    } else {
      model.addAttribute("table", toDoService.filteredByTitle(searchTitle));
    }
    return "todotable";
  }


  @GetMapping("/create")
  public String getCreateForm() {
    return "create";
  }

  @PostMapping("/create")
  public String createTodo(@ModelAttribute(name = "title") String title) {
    ToDo toDo = new ToDo(title);
    toDoService.save(toDo);
    return "redirect:/todo/table";
  }

  @GetMapping(value = "/{id}/delete")
  public String deleteEntry(@PathVariable(name = "id") Long id) {
    if (toDoService.findById(id) != null) {
      toDoService.delete(id);
      return "redirect:/todo/table";
    } else {
      return "redirect:/todo/table";
    }
  }

  @GetMapping(value = "/{id}")
  public String getEditForm(Model model, @PathVariable(name = "id") Long id) {
    model.addAttribute("todoById", toDoService.findById(id));
    return "edit";
  }

  @RequestMapping(value = "/{id}", method = RequestMethod.POST)
  public String edit(Model model, Boolean urgent,
      Boolean done, @PathVariable(name = "id") Long id) {
    model.addAttribute("urgent", urgent);
    model.addAttribute("done", done);

    if (done == null) {
      toDoService.setDone(id, false);
      if (urgent == null) {
        toDoService.setUrgent(id, false);
      } else {
        toDoService.setUrgent(id, true);
      }
      return "redirect:/todo/table";
    } else {
      toDoService.setDone(id, true);
      toDoService.setUrgent(id, false);
    }
    return "redirect:/todo/table";
  }
}


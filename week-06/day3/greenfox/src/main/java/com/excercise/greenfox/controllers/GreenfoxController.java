package com.excercise.greenfox.controllers;

import com.excercise.greenfox.services.StudentService;
import java.lang.reflect.Method;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreenfoxController {

  StudentService studentService;

  public GreenfoxController(StudentService studentService) {
    this.studentService = studentService;
  }

  @GetMapping("/gfa")
  public String showMain(Model model) {
    model.addAttribute("visitors", studentService.count());
    return "/gfa";
  }

  @GetMapping("/gfa/list")
  public String listStundents(Model model) {
    model.addAttribute("list", studentService.findAll());
    return "list";
  }

  @GetMapping("/gfa/add")
  public String showForm(Model model, String name){
    model.addAttribute("name", name);
    return "add";
  }

  @PostMapping("/gfa/save")
  public String saveStudent(@RequestParam(name="name")String name) {
    studentService.save(name);
    return "redirect:/gfa/list";
  }

}

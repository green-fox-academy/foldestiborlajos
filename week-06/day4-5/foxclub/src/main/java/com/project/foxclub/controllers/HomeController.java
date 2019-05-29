package com.project.foxclub.controllers;

import com.project.foxclub.services.ClubService;
import com.project.foxclub.services.FoxService;
import com.project.foxclub.services.MessageService;
import com.project.foxclub.services.PasswordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

  @Autowired
  ClubService clubService;
  @Autowired
  PasswordService passwordService;
  @Autowired
  MessageService messageService;
  @Autowired
  FoxService foxService;

  @GetMapping("/")
  public String getIndex(Model model,
      @RequestParam(required = false) @PathVariable(name = "id") String name) {
    if (name == null) {
      return "redirect:/login";
    } else if (clubService.foxes.size() > 0 && clubService.isFoxExist(name)) {
      if (passwordService
          .validiatePassword(clubService.findFox(name), passwordService.passwordToken)) {
        foxService.initializeFoxAttributes(clubService.findFox((name)));
        model.addAttribute("fox", clubService.findFox(name));
        model.addAttribute("emptyTrickMessage", messageService.sendEmptyTrickListMessage(name));
        passwordService.setPasswordFail(false);
        return "index";
      } else {
        passwordService.setPasswordFail(true);
        return "redirect:/login";
      }
    } else {
      return "redirect:/create";
    }
  }

  @GetMapping("/login")
  public String getLogin(Model model) {
    if (passwordService.passwordFail) {
      model.addAttribute("wrongPasswordMessage", messageService.sendWrongPasswordMessage());
      model.addAttribute("passwordFail", passwordService.passwordFail);
    }
    return "login";
  }

  @PostMapping("/login")
  public String postFox(@RequestParam(name = "name") String name,
      @RequestParam(name = "password") String password) {
    passwordService.rememberPassword(password);
    return "redirect:/?name=" + name;
  }

  @GetMapping("/create")
  public String getCreateForm(Model model) {
    if (messageService.isAlreadyExist()) {
      model.addAttribute("isAlredyExist", messageService.isAlreadyExist());
      model.addAttribute("alreadyExistMessage", messageService.sendAlreadyExisitngFoxMessage());
    }
    return "create";
  }

  @PostMapping("/create")
  public String createFox(@RequestParam(name = "name") String name,
      @RequestParam(name = "password") String password) {
    if (!clubService.isFoxExist(name)) {
      clubService.addToFoxes(name, password);
      passwordService.rememberPassword(password);
      messageService.setAlreadyExist(false);
      return "redirect:/login";
    } else {
      messageService.setAlreadyExist(true);
      return "redirect:/create";
    }
  }
}

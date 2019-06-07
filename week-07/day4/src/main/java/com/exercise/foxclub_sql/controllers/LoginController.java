package com.exercise.foxclub_sql.controllers;

import com.exercise.foxclub_sql.models.Fox;
import com.exercise.foxclub_sql.models.Password;
import com.exercise.foxclub_sql.models.User;
import com.exercise.foxclub_sql.repositories.Userable;
import com.exercise.foxclub_sql.services.FoxServiceImp;
import com.exercise.foxclub_sql.services.MessageService;
import com.exercise.foxclub_sql.services.PasswordServiceImp;
import com.exercise.foxclub_sql.services.UserService;
import com.exercise.foxclub_sql.services.UserServiceImp;
import java.util.List;
import java.util.stream.Collectors;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class LoginController {

  private UserServiceImp userServiceImp;
  private PasswordServiceImp passwordServiceImp;
  private FoxServiceImp foxServiceImp;
  private MessageService messageService;

  @Autowired
  UserService userService;

  public LoginController(UserServiceImp userServiceImp, PasswordServiceImp passwordServiceImp,
      FoxServiceImp foxServiceImp, MessageService messageService) {
    this.foxServiceImp = foxServiceImp;
    this.passwordServiceImp = passwordServiceImp;
    this.userServiceImp = userServiceImp;
    this.messageService = messageService;
  }

  @GetMapping("/")
  public String getIndex(Model model,
      @PathVariable @RequestParam(name = "id", required = false) String id) {
    if (id == null) {
      return "redirect:/login";
    } else {
      model.addAttribute("fox", foxServiceImp.findById(Long.parseLong(id)));
      return "index";
    }
  }

  @GetMapping("/login")
  public String getLoginForm(Model model) {
    return "login";
  }

  @PostMapping("/login")
  public String login(Model model, String email, String password) {
    User user = userServiceImp.findById(email);
    Password pass =passwordServiceImp.findById(password);
    if (passwordServiceImp.isPasswordValid(user,pass)) {
      return "redirect:/index?id=" + user.getEmail();
    } else {
      model.addAttribute("notRegisteredMessage", messageService.sendNotRegisteredMessage());
      return "redirect:/register";
  }
  }

  @GetMapping("/create")
  public String getCreate(Model model, @RequestParam (name="userId")String userId) {

    model.addAttribute("userId", userId);
    model.addAttribute("fox", new Fox());
    model.addAttribute("foxes", foxServiceImp.findAll());
    return "/create";
  }

  @PostMapping("/create")
  public String create(Model model, Fox fox, @RequestParam @PathVariable (name="userId") String userId) {
    foxServiceImp.save(fox);
    fox.getUsers().add(userServiceImp.findById(userId));
    foxServiceImp.save(fox);
    User user = userServiceImp.findById(userId);
    user.setFox(fox);
    userServiceImp.save(user);
    return "redirect:/login";
  }

  @GetMapping("/join/{foxId}/{userId}")
  public String getJoin(@PathVariable(name = "foxId") Long foxId,
      @PathVariable(name = "userId") String userId) {
    Fox fox = foxServiceImp.findById(foxId);
    User user = userServiceImp.findById(userId);
    fox.getUsers().add(user);
    userServiceImp.findUserInFoxListAndRemoveByUserId(userId);
    user.setFox(fox);
    userServiceImp.save(user);
    foxServiceImp.save(fox);
    return "redirect:/login";
  }

  @GetMapping("/register")
  public String getRegistryForm(Model model) {
    model.addAttribute(
        "user", new User());

    return "registryform";
  }

  @PostMapping("/register")
  public String register( String password, @Valid User user, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
     if(bindingResult.hasErrors()){
       redirectAttributes.addAttribute("user", user.getEmail());
       return "registryform";
     }else{
      userServiceImp.save(user);
      passwordServiceImp.registerPassword(password);
      Password pass = passwordServiceImp.findById(password);
      passwordServiceImp.save(pass);
      user.setPassword(pass);
      userServiceImp.save(user);
      pass.getUsers().add(user);
      passwordServiceImp.save(pass);

      return "redirect:/create?userId="+user.getEmail();}
    }
  }

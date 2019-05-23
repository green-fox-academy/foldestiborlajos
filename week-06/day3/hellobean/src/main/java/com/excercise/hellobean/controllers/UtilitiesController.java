package com.excercise.hellobean.controllers;

import com.excercise.hellobean.services.UtilityService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class UtilitiesController {

  UtilityService utilityService;

  public UtilitiesController(UtilityService utilityService) {
    this.utilityService = utilityService;
  }

  @GetMapping("/useful")
  public String getUtilities() {
    return "/useful";
  }

  @GetMapping("/useful/colors")
  public String colorBackground(Model model){
    model.addAttribute("randomColor", utilityService.randomColor());
    return "colors";
  }

  @GetMapping("/useful/email")
  public String isMailValid(Model model, @RequestParam (name ="input", required = false) String inputEmail){
    model.addAttribute("inputEmail",inputEmail);
    model.addAttribute("emailValid", utilityService.colorValidEmail(inputEmail));
    return "email";
  }

  @GetMapping("/useful/ceasar_encoder")
  public String encode(Model model, @RequestParam(name = "text") String text, @RequestParam(name = "key") Integer key){
    model.addAttribute("result", utilityService.caesar(text,key));
    return "ceasar_encoder";
  }

  @GetMapping("/useful/ceasar_decoder")
  public String decode(Model model, @RequestParam(name = "text") String text, @RequestParam(name = "key") Integer key){
    model.addAttribute("result", utilityService.caesar(text,0 - key));
    return "ceasar_decoder";
  }
}

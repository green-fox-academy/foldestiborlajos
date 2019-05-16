package com.greenfox.springstart.controllers;

import com.greenfox.springstart.Greeting;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class GreetCounterController{
    AtomicLong greetCounter = new AtomicLong(1);

    @RequestMapping("greetingcount")
    public String greeting(Model model){
      Greeting tokenGreet = new Greeting(greetCounter.getAndIncrement(), "Tibor" );
      model.addAttribute("name", tokenGreet.getContent());
      model.addAttribute("id", tokenGreet.getId());
      return "greetingcount";
    }

}

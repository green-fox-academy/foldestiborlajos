package com.greenfox.springstart.controllers;

import com.greenfox.springstart.Greeting;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

  AtomicLong counterOfGreets = new AtomicLong(1);

  @RequestMapping("/greeting")
  @ResponseBody
  public Greeting greeting(@RequestParam (required = true)String name) {

    Greeting result =  new Greeting(counterOfGreets.getAndIncrement(), "Hello");
    result.setContent("Hello " + name);

    return result;
  }
}

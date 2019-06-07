package com.excercise.rest.controller;

import com.excercise.rest.model.Greeting;
import com.excercise.rest.model.erorrs.GreeterError;
import java.rmi.NoSuchObjectException;
import java.util.InputMismatchException;
import javax.servlet.http.HttpServletResponse;
import javax.validation.constraints.Null;
import org.springframework.cache.support.NullValue;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class GreeterController {

  @GetMapping("/greeter")
  @ResponseBody
  public Greeting getGreet(
      @RequestParam(name = "name", required = false) String name,
      @RequestParam(name = "title", required = false) String title) {
    GreeterError error = new GreeterError();
    Greeting resultGreeting = new Greeting();
    if (title == null && name == null) {
      throw new ResponseStatusException(HttpStatus.BAD_REQUEST, error.getErrorNameTitle());
    } else if (name == null && title != null
    ) {
      throw new ResponseStatusException(
          HttpStatus.BAD_REQUEST, error.getErrorName()
      );
    } else if (name != null && title == null) {
      throw new ResponseStatusException(
          HttpStatus.BAD_REQUEST, error.getErrorTitle()
      );
    } else {
      resultGreeting.setwelcome_message(name, title);
    }
    return resultGreeting;
  }
}

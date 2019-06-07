package com.excercise.rest.controller;

import com.excercise.rest.model.Append;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class AppendController {

  @GetMapping("/appenda/{a}")
  @ResponseBody
  public Append append(@PathVariable String a){
    Append result = new Append(a);
    if(a == null) {
      throw new ResponseStatusException(
          HttpStatus.NOT_FOUND, "404");
    }
    return result;
  }
}

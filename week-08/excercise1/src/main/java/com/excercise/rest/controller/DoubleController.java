package com.excercise.rest.controller;

import com.excercise.rest.model.DoubleX;
import com.excercise.rest.model.erorrs.DoubleError;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class DoubleController {

  @GetMapping("/doubling")
  @ResponseBody
  public Object doubling(@RequestParam(name = "input", required = false) Integer input) {
    DoubleX doub = new DoubleX();
    if (input == null) {
      throw new ResponseStatusException(HttpStatus.BAD_REQUEST, new DoubleError().getError());
    } else {
      doub.setReceived(input);
      doub.setResult(input * 2);
      return doub;
    }
  }
}

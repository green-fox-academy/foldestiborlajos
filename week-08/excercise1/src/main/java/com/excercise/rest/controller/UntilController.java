package com.excercise.rest.controller;

import com.excercise.rest.model.Number;
import com.excercise.rest.model.erorrs.UntilError;
import com.excercise.rest.service.Until;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UntilController {

  private Until until;

  public UntilController(Until until) {
    this.until = until;
  }


  @PostMapping(path = "/dountil/{action}", consumes ="application/json")
  @ResponseBody
  public ResponseEntity doUntil(
      @PathVariable String action,
      @RequestBody (required = false) Number number) {
    if (number == null) {
      return ResponseEntity.badRequest().body(new UntilError());
    } else if (action.equals("factor")) {
      return ResponseEntity.ok(until.factor(number));
    } else {
      return ResponseEntity.ok(until.sum(number));
    }
  }
}

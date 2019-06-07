package com.exercise.foxclub_sql.controllers;

import com.exercise.foxclub_sql.dto.FoxDTO;
import com.exercise.foxclub_sql.services.FoxServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
public class FoxController {

  @Autowired
  FoxServiceImp foxServiceImp;

  @GetMapping("/fox/{id}")
  public ResponseEntity getFox(@PathVariable(required = false) Long id) {
    if (foxServiceImp.findById(id) == null) {
      return ResponseEntity.badRequest().body(HttpStatus.NOT_FOUND);
    } else {
      return ResponseEntity.ok().body(new FoxDTO(foxServiceImp.findById(id)));
    }
  }
}

package com.project.foxclub.services;


import com.project.foxclub.model.Fox;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClubService {

  public List<Fox> foxes = new ArrayList<>();

  @Autowired
  PasswordService passwordService;

  public List<Fox> addToFoxes(String name, String password) {
    Fox createdFox=new Fox(name);
    this.foxes.add(createdFox);
    this.passwordService.passwords.put(createdFox, password);
    return this.foxes;
  }

  public Fox findFox(String inputName){
    return this.foxes.stream()
        .filter(fox -> fox.getName().equals(inputName))
        .collect(Collectors.toList())
        .get(0);
  }

  public boolean isFoxExist(String inputName){
    return  this.foxes.stream()
        .anyMatch(fox->fox.getName().equals(inputName));
  }




}

package com.project.foxclub.services;

import com.project.foxclub.model.Fox;
import com.project.foxclub.model.nutritions.Food;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FoxService {

  @Autowired
  Food foodList;

  public Fox initializeFoxAttributes(Fox inputFox) {

    List<String> emptyTrick = new ArrayList<>();
    inputFox.setDrink("nothing");
    inputFox.setFood("nothing");
    inputFox.setTricks(emptyTrick);

    return inputFox;
  }
}

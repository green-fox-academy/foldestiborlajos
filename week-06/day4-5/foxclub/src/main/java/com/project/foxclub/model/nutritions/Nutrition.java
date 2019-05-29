package com.project.foxclub.model.nutritions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Nutrition {
  List<String> nutrritionList;

  public Nutrition(){
    nutrritionList= new ArrayList<>();
  }

  public List<String> populateNutritionList(String[] inputArray) {
    nutrritionList= Arrays.asList(inputArray);
  return this.nutrritionList;
  }

  public String findNutrition(String inputNutrition){
    if(nutrritionList.stream().anyMatch(nut -> nut.equals(inputNutrition)))
    {
      return inputNutrition;
    }else{
      return "Sorry we have no such item";
    }
  }
}

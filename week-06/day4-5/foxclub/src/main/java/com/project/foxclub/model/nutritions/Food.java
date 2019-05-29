package com.project.foxclub.model.nutritions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class Food extends Nutrition {
  List<String> foodList;
  public Food() {
    foodList = new ArrayList<>();

  }

  @Override
  public List<String> populateNutritionList(String[] inputArray) {
    foodList= Arrays.asList(inputArray);
    return foodList;
  }


  @Override
  public String findNutrition(String inputNutrition){
    if(foodList.stream().anyMatch(nut -> nut.equals(inputNutrition)))
    {
      return inputNutrition;
    }else{
      return "Sorry we have no such item";
    }
  }

  public List<String> foodItems(){
    String[] foods= {"mouse", "rat", "chicken","goose", "lamb"};
    return this.populateNutritionList(foods);
  }
}

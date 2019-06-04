package com.excercise.rest.model;

public class Until {
  Number inputNumber;

  public Until(Number inputNumber){
    this.inputNumber = inputNumber;
  }

  public Integer sum(){
    int result = 0;
    for(int i = 0; i <= this.inputNumber.getNumber(); i++){
      result = result + i;
      i++;
    }
    return result;
  }

  public Integer factor(){
    int result = 0;
    for(int i = 0; i <= this.inputNumber.getNumber(); i++){
      result = result * i;
      i++;
    }
    return result;
  }

  public Number getInputNumber() {
    return inputNumber;
  }

  public void setInputNumber(Number inputNumber) {
    this.inputNumber = inputNumber;
  }
}

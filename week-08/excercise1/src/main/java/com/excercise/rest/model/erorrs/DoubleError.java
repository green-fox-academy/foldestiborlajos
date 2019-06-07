package com.excercise.rest.model.erorrs;

import com.excercise.rest.model.erorrs.Error;

public class DoubleError extends Error {
   private String error;

   public DoubleError(){
     super();
     error="Please provide an input";
   }

  @Override
  public String getError() {
    return error;
  }

  @Override
  public void setError(String error) {
    this.error = error;
  }
}

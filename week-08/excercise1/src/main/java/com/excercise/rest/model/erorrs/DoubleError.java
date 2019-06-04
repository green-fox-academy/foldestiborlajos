package com.excercise.rest.model;

public class DoubleError extends Error {
   private String error;

   public DoubleError(){
     super();
     error="Please provide an input";
   }
}

package com.excercise.rest.model.erorrs;

import com.excercise.rest.model.erorrs.Error;
import org.springframework.web.bind.annotation.ResponseStatus;

public class GreeterError extends Error {
  private String errorNameTitle;
  private String errorName;
  private String errorTitle;

  public GreeterError(){
    super();
    errorNameTitle = "Please provide a name and a title!";
    errorName = "Please provide a name!";
    errorTitle = "Please provide a title!";
  }

  public String getErrorNameTitle () {
    return errorNameTitle;
  }

  public void setErrorNameTitle(String errorNameTitle) {
    this.errorNameTitle = errorNameTitle;
  }

  public String getErrorName() {
    return errorName;
  }

  public void setErrorName(String errorName) {
    this.errorName = errorName;
  }

  public String getErrorTitle() {
    return errorTitle;
  }

  public void setErrorTitle(String erorrTitle) {
    this.errorTitle = erorrTitle;
  }
}

package com.excercise.hellobean;

import com.excercise.hellobean.interfaces.MyColorable;
import com.excercise.hellobean.services.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloBeanApplication implements CommandLineRunner {

  Printer printer;

  @Autowired
  HelloBeanApplication(Printer printer){
    this.printer=printer;
  }

   @Autowired
   @Qualifier("blue")
   MyColorable colorable;

  public static void main(String[] args) {
    SpringApplication.run(HelloBeanApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
      printer.log(colorable.printColor());
  }


}

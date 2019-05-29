package com.excercise.listing_todo;

import com.exercise.todo_sql.controllers.models.ToDo;
import com.exercise.todo_sql.services.ToDoable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ListingTodoApplication implements CommandLineRunner {

  @Autowired
  ToDoable toDoable;

  public static void main(String[] args) {
    SpringApplication.run(ListingTodoApplication.class, args);
  }

  @Override
  public void run (String... args) throws Exception{
   toDoable.save(new ToDo("go to cinema"));
   toDoable.save(new ToDo("save some todo to the list"));
   toDoable.save(new ToDo("have some sleep"));
   toDoable.save(new ToDo("go to the doctor"));
  }

}

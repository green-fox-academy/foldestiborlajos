package com.exercise.todo_sql;


import com.exercise.todo_sql.models.ToDo;
import com.exercise.todo_sql.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoSqlApplication implements CommandLineRunner {

  @Autowired
  ToDoRepository toDoRepository;
  public static void main(String[] args) {
    SpringApplication.run(TodoSqlApplication.class, args);
  }

  @Override
  public void run (String... args) throws Exception{
    System.out.println("hello");
  }
}

package com.exercise.todo_sql.services;

import com.exercise.todo_sql.models.ToDo;
import java.util.List;

public interface ToDoAble {

  List<ToDo> findAll();
  ToDo findById(long id);
  void save(ToDo toDo);
  void delete(long id);

}

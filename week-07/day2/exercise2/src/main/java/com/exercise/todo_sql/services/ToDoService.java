package com.exercise.todo_sql.services;

import com.exercise.todo_sql.models.ToDo;
import com.exercise.todo_sql.repository.ToDoRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ToDoService implements ToDoAble{

  @Autowired
  ToDoRepository toDoRepository;

  @Override
  public List<ToDo> findAll() {
    List<ToDo> returnList = new ArrayList<>();
    toDoRepository.findAll().forEach(toDo -> returnList.add(toDo));
    return returnList;
  }

  @Override
  public ToDo findById(long id) {
    return null;
  }

  @Override
  public void save(ToDo toDo) {
    toDoRepository.save(toDo);
  }

  @Override
  public void delete(long id) {

  }
}

package com.exercise.todo_sql.services;

import com.exercise.todo_sql.models.ToDo;
import com.exercise.todo_sql.repository.ToDoRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ToDoService implements ToDoAble {

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
    return toDoRepository.findById(id).orElse(null);
  }

  @Override
  public void save(ToDo toDo) {
    toDoRepository.save(toDo);
  }

  @Override
  public void delete(long id) {
    toDoRepository.delete(toDoRepository.findById(id).orElse(null));
  }

  public void setDone(long id, boolean done) {
    ToDo toDo = this.findById(id);
    toDo.setDone(done);
    this.save(toDo);
  }

  public void setUrgent(long id, Boolean urgent) {
    ToDo toDo = this.findById(id);
    toDo.setUrgent(urgent);
    this.save(toDo);
  }

  public List<ToDo> filteredByUrgent() {
    List<ToDo> filteredByUrgent = this.findAll().stream()
        .filter(toDo -> toDo.isUrgent() == true)
        .collect(Collectors.toList());
    return filteredByUrgent;
  }

  public List<ToDo> filteredByUrgent(List<ToDo> inputTodoList) {
    List<ToDo> todoListFiltered = inputTodoList.stream().
        filter(toDo -> toDo.isUrgent() == true)
        .collect(Collectors.toList());
    return todoListFiltered;
  }

  public List<ToDo> filteredByDone() {
    List<ToDo> filteredByDone = this.findAll().stream()
        .filter(toDo -> toDo.isDone() == false)
        .collect(Collectors.toList());
    return filteredByDone;
  }

  public List<ToDo> filteredByTitle(String title) {
    List<ToDo> filteredByTitle = this.findAll().stream()
        .filter(toDo -> toDo.getTitle().equalsIgnoreCase(title))
        .collect(Collectors.toList());
    return filteredByTitle;
  }
}


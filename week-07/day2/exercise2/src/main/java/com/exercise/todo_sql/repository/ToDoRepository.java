package com.exercise.todo_sql.repository;

import com.exercise.todo_sql.models.ToDo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ToDoRepository extends CrudRepository<ToDo, Long> {

  @Query
  List<ToDo> findAllByUrgentIsTrueOrderById();

}


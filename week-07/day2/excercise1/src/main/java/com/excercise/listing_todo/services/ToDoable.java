package com.excercise.listing_todo.services;

import com.excercise.listing_todo.models.ToDo;
import org.springframework.data.repository.CrudRepository;

public interface ToDoable extends CrudRepository<ToDo, Long> {

}

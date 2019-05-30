package com.exercise.foxclub_sql.repositories;

import com.exercise.foxclub_sql.models.Fox;
import org.springframework.data.repository.CrudRepository;

public interface FoxAble extends CrudRepository<Fox, String> {

}

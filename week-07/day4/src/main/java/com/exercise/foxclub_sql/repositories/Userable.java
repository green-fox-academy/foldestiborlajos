package com.exercise.foxclub_sql.repositories;

import com.exercise.foxclub_sql.models.User;
import org.springframework.data.repository.CrudRepository;

public interface Userable extends CrudRepository<User, String > {

}

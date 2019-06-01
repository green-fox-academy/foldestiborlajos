package com.exercise.foxclub_sql.repositories;

import com.exercise.foxclub_sql.models.Password;
import org.springframework.data.repository.CrudRepository;

public interface PasswordAble extends CrudRepository<Password, String> {

}

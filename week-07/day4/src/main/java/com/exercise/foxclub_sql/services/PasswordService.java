package com.exercise.foxclub_sql.services;

import com.exercise.foxclub_sql.models.Password;
import java.util.List;

public interface PasswordService {

  List<Password> findAll();
  void save(Password password);
  Password findPasswordById(long id);

}

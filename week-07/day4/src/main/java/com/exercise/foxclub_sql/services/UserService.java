package com.exercise.foxclub_sql.services;

import com.exercise.foxclub_sql.models.Fox;
import com.exercise.foxclub_sql.models.User;
import java.util.List;

public interface UserService {
  List<User> findAll();
  void save(User user);
  Fox findById(String name);

}

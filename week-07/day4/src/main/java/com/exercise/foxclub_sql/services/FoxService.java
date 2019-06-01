package com.exercise.foxclub_sql.services;

import com.exercise.foxclub_sql.models.Fox;
import java.util.List;

public interface FoxService {
  List<Fox> findAll();
  void save(Fox fox);
  Fox findById(long id);

}

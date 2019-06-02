package com.excercise.reddit.service;

import com.excercise.reddit.model.User;
import java.util.List;

public interface UserService {

  public List<User> findAll();
  public User findById(Long id);
  public void save(User user);
  public void delete(User user);

}

package com.exercise.foxclub_sql.services;

import com.exercise.foxclub_sql.models.Fox;
import com.exercise.foxclub_sql.models.User;
import com.exercise.foxclub_sql.repositories.Userable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {

  private Userable userable;

  public UserServiceImp(Userable userable) {
    this.userable = userable;
  }


  public Fox findFoxByUserId(String id){
    return this.findById(id).getFox();
  }



  @Override
  public List<User> findAll() {
    List<User> userList = new ArrayList<>();
    this.userable.findAll().forEach(user -> userList.add(user));
    return userList;
  }

  @Override
  public void save(User user) {
    this.userable.save(user);
  }

  @Override
  public User findById(String id) {

    return this.userable.findById(id).orElse(null);
  }

  public List<User> findUserInFoxListAndRemoveByUserId(String userId) {
    List<User> resultList = new ArrayList<>();
      this.findFoxByUserId(userId).getUsers().stream().map(userl -> !userl.getEmail()
        .equals(this.findById(userId)))
        .collect(Collectors.toList());
        return resultList;
  }
}
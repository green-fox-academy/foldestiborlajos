package com.excercise.reddit.service;

import com.excercise.reddit.model.User;
import com.excercise.reddit.repository.UserManageAble;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

   private UserManageAble userManageAble;

  public UserServiceImpl(UserManageAble userManageAble){
    this.userManageAble=userManageAble;
  }

  @Override
  public List<User> findAll() {
    return null;
  }

  @Override
  public User findById(Long id) {
    return null;
  }

  @Override
  public void save(User user) {

  }

  @Override
  public void delete(User user) {

  }
}

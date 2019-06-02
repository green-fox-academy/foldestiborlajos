package com.excercise.reddit.service;

import com.excercise.reddit.model.Password;
import com.excercise.reddit.model.Post;
import com.excercise.reddit.repository.AutetificationAble;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class PasswordServiceImpl implements PasswordService{
  AutetificationAble autetificationAble;

  public PasswordServiceImpl(AutetificationAble autetificationAble){
    this.autetificationAble=autetificationAble;
  }


  @Override
  public Password findByUser(Long userId) {
    return null;
  }

  @Override
  public void save() {

  }

  @Override
  public boolean validatePassword(String inputPassword) {
    return false;
  }
}


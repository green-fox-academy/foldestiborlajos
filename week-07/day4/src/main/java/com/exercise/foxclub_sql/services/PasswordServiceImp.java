package com.exercise.foxclub_sql.services;

import com.exercise.foxclub_sql.models.Password;
import com.exercise.foxclub_sql.models.User;
import com.exercise.foxclub_sql.repositories.PasswordAble;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PasswordServiceImp implements PasswordService{

  private PasswordAble passwordAble;

  @Autowired
  UserServiceImp userServiceImp;

  public PasswordServiceImp(PasswordAble passwordAble) {

    this.passwordAble = passwordAble;
  }

  public boolean isPasswordValid(User user, Password password){
    return this.findAll().stream().filter(pass -> pass.equals(password))
     .collect(Collectors.toList()).get(0).getUsers().stream().anyMatch(use ->use.equals(use));
  }


  public void registerPassword(String id){
    if(this.findById(id)==null){
      Password password=new Password(id);
      this.save(password);
  }else{
    }
  }


  @Override
  public List<Password> findAll() {
    List<Password> passwordList = new ArrayList<>();
    this.passwordAble.findAll().forEach( passw-> passwordList.add(passw));
    return passwordList;
  }

  @Override
  public void save(Password password) {
      passwordAble.save(password);
  }

  @Override
  public Password findById(String id) {
    return passwordAble.findById(id).orElse(null);
  }
}

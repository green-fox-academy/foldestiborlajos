package com.exercise.foxclub_sql.services;

import com.exercise.foxclub_sql.models.Fox;
import com.exercise.foxclub_sql.models.User;
import com.exercise.foxclub_sql.repositories.FoxAble;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

@Service
public class FoxServiceImp implements FoxService{

  private FoxAble foxAble;


  public FoxServiceImp(FoxAble foxAble){
    this.foxAble=foxAble;
  }



  @Override
  public List<Fox> findAll() {
    List<Fox> foxList = new ArrayList<>();
    this.foxAble.findAll().forEach(fox -> foxList.add(fox));
    return foxList;
  }

  @Override
  public void save(Fox fox) {
    this.foxAble.save(fox);

  }

  @Override
  public Fox findById(long id) {
    return this.foxAble.findById(id).orElse(null);

  }
}

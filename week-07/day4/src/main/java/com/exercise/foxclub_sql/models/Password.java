package com.exercise.foxclub_sql.models;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Password {

  @Id
  @Column(name="password", nullable = false)
  private String password;
  @OneToMany
  private List<User> users;

  public Password(){
    users=new ArrayList<>();

  }

  public Password(String password){
    this.password=password;
    users=new ArrayList<>();

  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public List<User> getUsers() {
    return users;
  }

  public void setUsers(List<User> users) {
    this.users = users;
  }
}

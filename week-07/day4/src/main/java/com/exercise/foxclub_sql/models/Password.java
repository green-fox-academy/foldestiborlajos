package com.exercise.foxclub_sql.models;

import java.util.List;
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
  @GeneratedValue
  private long id;
  private String password;
  @OneToMany
  private List<User> users;

}

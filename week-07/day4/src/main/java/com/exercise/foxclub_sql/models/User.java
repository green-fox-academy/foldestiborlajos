package com.exercise.foxclub_sql.models;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  long id;
  private String name;
  @ManyToOne
  private Password password;
  @ManyToOne
  private Fox fox;
  private int age;
  private boolean sex;
  @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
  List<SocialStatus> socialStatus;

  public User(){
    socialStatus=new ArrayList<>();
  }




}

package com.exercise.foxclub_sql.models;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Trick {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  long id;
  String name;
  @ManyToOne
  Fox fox;

  public Trick(){


  }

}

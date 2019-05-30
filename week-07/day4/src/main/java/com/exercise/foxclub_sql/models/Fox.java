package com.exercise.foxclub_sql.models;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Fox {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   long id;
   String name;
   @OneToMany(fetch = FetchType.EAGER, mappedBy = "id")
   List<User> users;
   String food;
   String drink;
   int health;
   int age;
   @OneToMany(fetch = FetchType.LAZY, mappedBy = "fox")
   List<Trick> tricks;

   public Fox(){
     tricks= new ArrayList<>();
   }

}

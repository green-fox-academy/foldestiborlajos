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
   @OneToMany(fetch = FetchType.EAGER, mappedBy = "fox")
   List<User> users;
   String food;
   String drink;
   int health;
   int age;
   @OneToMany(fetch = FetchType.LAZY, mappedBy = "fox")
   List<Trick> tricks;

   public Fox(){
      users=new ArrayList<>();
     tricks= new ArrayList<>();
     this.health=100;
   }

   public long getId() {
      return id;
   }

   public void setId(long id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public List<User> getUsers() {
      return users;
   }

   public void setUsers(List<User> users) {
      this.users = users;
   }

   public String getFood() {
      return food;
   }

   public void setFood(String food) {
      this.food = food;
   }

   public String getDrink() {
      return drink;
   }

   public void setDrink(String drink) {
      this.drink = drink;
   }

   public int getHealth() {
      return health;
   }

   public void setHealth(int health) {
      this.health = health;
   }

   public int getAge() {
      return age;
   }

   public void setAge(int age) {
      this.age = age;
   }

   public List<Trick> getTricks() {
      return tricks;
   }

   public void setTricks(List<Trick> tricks) {
      this.tricks = tricks;
   }
}

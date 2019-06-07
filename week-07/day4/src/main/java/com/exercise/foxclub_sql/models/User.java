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
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class User {

  @Id
  @Column(name="email", nullable = false)
  @Email
  String email;
  @Column(name="name", nullable =true)
  private String name;
  @ManyToOne
  private Password password;
  @ManyToOne
  private Fox fox;
  @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
  List<SocialStatus> socialStatus;

  public User(){

    socialStatus=new ArrayList<>();
  }

  public User(String email){
    this.email=email;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Password getPassword() {
    return password;
  }

  public void setPassword(Password password) {
    this.password = password;
  }

  public Fox getFox() {
    return fox;
  }

  public void setFox(Fox fox) {
    this.fox = fox;
  }
}

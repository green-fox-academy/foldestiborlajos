package com.exercise.todo_sql.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Pattern;


@Entity
public class ToDo {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  long id;
  @Pattern(regexp = "/^A-Z/")
  String title;
  boolean urgent;
  boolean done;

  public ToDo() {
    urgent = false;
    done = false;

  }

  public ToDo(String title) {
    this.title = title;
    urgent = false;
    done = false;
  }

  @Override
  public String toString() {
    return this.id + " " + this.title;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public boolean isUrgent() {
    return urgent;
  }

  public void setUrgent(boolean urgent) {
    this.urgent = urgent;
  }

  public boolean isDone() {
    return done;
  }

  public void setDone(boolean done) {
    this.done = done;
  }
}
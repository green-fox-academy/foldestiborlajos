package com.excercise.greenfox.services;


import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
  public class StudentService {
    ArrayList<String> names;
    int counter=0;

    public StudentService() {
      names = new ArrayList<>();
      names.add("Sanyi");
      names.add("Lilla");
      names.add("John");
    }

    public List<String> findAll() {
      return names;
    }

    public void save(String student) {
      names.add(student);
    }

    public int count(){
      counter++;
      return counter;
    }

  }


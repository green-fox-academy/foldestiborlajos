package com.exercise.foxclub_sql.dto;

import com.exercise.foxclub_sql.models.Fox;
import java.util.List;
import java.util.stream.Collectors;

public class FoxDTO {
    private Long id;
    private String name;
    private List<UserDTO> userDTOList;


  public FoxDTO(Fox fox) {
    this.id =fox.getId();
    this.name = fox.getName();
    this.userDTOList = fox.getUsers().stream()
        .map(user -> new UserDTO(user))
        .collect(Collectors.toList());
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<UserDTO> getUserDTOList() {
    return userDTOList;
  }

  public void setUserDTOList(List<UserDTO> userDTOList) {
    this.userDTOList = userDTOList;
  }
}

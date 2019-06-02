package com.excercise.reddit.repository;

import com.excercise.reddit.model.Password;
import org.springframework.data.repository.CrudRepository;

public interface AutetificationAble extends CrudRepository<Password, Long> {

}

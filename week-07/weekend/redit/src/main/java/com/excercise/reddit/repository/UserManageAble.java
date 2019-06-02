package com.excercise.reddit.repository;

import com.excercise.reddit.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserManageAble extends CrudRepository<User, Long> {

}

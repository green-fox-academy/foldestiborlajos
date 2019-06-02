package com.excercise.reddit.repository;

import com.excercise.reddit.model.Post;
import java.util.List;
import javax.persistence.NamedQuery;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface PostAble extends CrudRepository<Post, Long > {




}

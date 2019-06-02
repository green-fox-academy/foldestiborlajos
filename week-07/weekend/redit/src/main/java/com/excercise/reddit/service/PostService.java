package com.excercise.reddit.service;

import com.excercise.reddit.model.Post;
import java.util.List;

public interface PostService {
  public List<Post> findAll();
  public Post findById(Long id);
  public void save(Post post);
  public void delete(Post post);
  public Post upVote(Post post);
  public Post downVote(Post post);


}

package com.excercise.reddit.service;

import com.excercise.reddit.model.Post;
import com.excercise.reddit.repository.PostAble;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {

  PostAble postAble;

  public PostServiceImpl(PostAble postAble) {
    this.postAble = postAble;
  }

  @Override
  public List<Post> findAll() {
    List<Post> posts = new ArrayList<>();
    postAble.findAll().forEach(post -> posts.add(post));
    return posts;
  }

  @Override
  public Post findById(Long id) {
    return postAble.findById(id).orElse(null);
  }

  @Override
  public void save(Post post) {
    postAble.save(post);
  }

  @Override
  public void delete(Post post) {
    postAble.delete(post);
  }

  @Override
  public Post upVote(Post post) {
    post.setPopularity(post.getPopularity() + 1);
    return post;
  }

  public Post downVote(Post post) {
    post.setPopularity(post.getPopularity() - 1);
    return post;
  }

  public List<Post> orderByPopularity(){
    return this.findAll().stream()
        .sorted(Comparator.comparing(Post::getPopularity).reversed())
         .collect(Collectors.toList());
  }
}


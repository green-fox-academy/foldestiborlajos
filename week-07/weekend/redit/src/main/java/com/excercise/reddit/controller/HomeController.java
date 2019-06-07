package com.excercise.reddit.controller;

import com.excercise.reddit.model.Post;
import com.excercise.reddit.service.PostServiceImpl;
import com.excercise.reddit.service.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
  UserServiceImpl userServiceImpl;
  PostServiceImpl postServiceImpl;

  public HomeController(UserServiceImpl userServiceImpl, PostServiceImpl postServiceImpl) {
    this.userServiceImpl = userServiceImpl;
    this.postServiceImpl = postServiceImpl;
  }

  @GetMapping("/")
  public String getPosts(Model model) {
    model.addAttribute("posts", postServiceImpl.orderByPopularity());
    model.addAttribute("transpost", new Post() );
    return "index";
  }

  @GetMapping("/raise")
  public String upVote(@RequestParam(name = "id") Long id){
    postServiceImpl.save(postServiceImpl.upVote(postServiceImpl.findById(id)));
    return "redirect:/";
  }

  @RequestMapping("/reduce")
  public String downVote(@RequestParam(name="id") Long id){
    postServiceImpl.save((postServiceImpl.downVote(postServiceImpl.findById(id))));
    return "redirect:/";
  }

  @GetMapping("/addPost")
  public String getAddForm(Model model) {
    model.addAttribute("post", new Post());
    return "submit";
  }

  @PostMapping("/addPost")
  public String postPost(Post post) {
    postServiceImpl.save(post);
    return "redirect:/";
  }

  @DeleteMapping("/delete")
  public String deletePost(Post transpost){
    postServiceImpl.delete(postServiceImpl.findById(transpost.getId()));
    return "redirect:/";
  }
}


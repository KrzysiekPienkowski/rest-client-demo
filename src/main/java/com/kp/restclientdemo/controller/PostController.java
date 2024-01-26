package com.kp.restclientdemo.controller;

import com.kp.restclientdemo.model.Post;
import com.kp.restclientdemo.service.PostService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class PostController {

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("")
    List<Post> findAll(){
        return postService.findAll();
    }
}

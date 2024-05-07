package com.tdd.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class RestController {

    @Autowired
    private PostService postService;

    @GetMapping("/findAllPosts")
    public List<Post> findAllPosts(){
        return postService.findAllPost();
    }

    @GetMapping("/findById/{id}")
    public Post BfindAllPosts(@PathVariable int id){
        return postService.findById(id);
    }
}

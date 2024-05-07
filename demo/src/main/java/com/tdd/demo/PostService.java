package com.tdd.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    PostRepository postRepository;
    public List<Post> findAllPost(){
        return postRepository.findAll();
    }

    public Post findById(int id){
        return postRepository.findById(id).get();
    }

}

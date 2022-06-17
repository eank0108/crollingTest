package com.example.crollingtest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {
    @GetMapping("/test")
    public ResponseDto readPosts() {
        return new ResponseDto("aa","bb");
    }

    @PostMapping("/test")
    public ResponseDto createPost() {
        return new ResponseDto("abba","cc");
    }


}

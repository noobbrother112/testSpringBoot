package com.blog.blog.test;

import org.springframework.web.bind.annotation.*;

@RestController
public class HttpControllerTest {

    //http://localhost:8080/http/get
    @GetMapping("http/get")
    public String getTest(Member member){
        return "get요청"+member.getId();
    }
    //http://localhost:8080/http/post
    @PostMapping("http/post")
    public String postTest(){
        return "post요청";
    }
    //http://localhost:8080/http/put
    @PutMapping("http/put")
    public String putTest(){
        return "put요청";
    }
    //http://localhost:8080/http/delete
    @DeleteMapping("http/delete")
    public String deleteTest(){
        return "delete요청";
    }
}

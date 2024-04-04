package com.soehardi.movie.controller.post;

import org.springframework.web.bind.annotation.RestController;

import com.soehardi.movie.controller.Mapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@RestController
@Mapping
public class PostMovie {
    // private final String path = "/movie";
    @RequestMapping(value="/movie", method=RequestMethod.POST)
    public Object requestMethodName() {
        return "this from post";
    }
        
}

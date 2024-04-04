package com.soehardi.movie.controller.put;

import org.springframework.web.bind.annotation.RestController;

import com.soehardi.movie.controller.Mapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@RestController
@Mapping
public class PutMovie {
    // private final String path = "/movie";
    @RequestMapping(value="/movie", method=RequestMethod.PUT)
    public Object requestMethodName() {
        return "this from put";
    }
        
}

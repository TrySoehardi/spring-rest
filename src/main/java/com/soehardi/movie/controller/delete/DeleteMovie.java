package com.soehardi.movie.controller.delete;

import org.springframework.web.bind.annotation.RestController;

import com.soehardi.movie.controller.Mapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@RestController
@Mapping
public class DeleteMovie {
    // private final String path = "/movie";
    @RequestMapping(value="/movie", method=RequestMethod.DELETE)
    public Object requestMethodName() {
        System.out.print("/movie");
        return "this from delete";
    }
        
}

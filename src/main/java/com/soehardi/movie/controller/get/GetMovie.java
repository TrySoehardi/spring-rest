package com.soehardi.movie.controller.get;

import org.springframework.web.bind.annotation.RestController;
import com.soehardi.movie.controller.Mapping;
import com.soehardi.movie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@RestController
@Mapping
public class GetMovie {
    @Autowired
    private MovieService movieService;
    private GetMovie(MovieService movieService) {
        this.movieService = movieService;
    }
    

    @RequestMapping(value="/movie", method=RequestMethod.GET)
    public Object request() {
        return this.movieService.findAllMovie();
    }
        
}

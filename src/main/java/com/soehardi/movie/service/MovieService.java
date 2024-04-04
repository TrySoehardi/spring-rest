package com.soehardi.movie.service;

import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;
import com.soehardi.movie.model.ModelMovie;
import com.soehardi.movie.repository.MovieRepository;

@Service
@Configuration
public class MovieService {
    
    // Initial repo
    private final MovieRepository movieRepository;
    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Bean
    public List<ModelMovie> findAllMovie() {
        return movieRepository.findAll();
    }


}

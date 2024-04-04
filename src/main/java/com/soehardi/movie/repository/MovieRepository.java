package com.soehardi.movie.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.soehardi.movie.model.ModelMovie;

public interface MovieRepository extends JpaRepository<ModelMovie, Long> {
    
}

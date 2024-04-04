package com.soehardi.movie.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "movie")
public class ModelMovie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(name = "production_company",nullable = false)
    private String productionCompany;

    @Column(nullable = false)
    private String country;

    @Column(nullable = false)
    private String language;

    @Column(name = "created_at",nullable = false)
    private String createdAt;

    @Column(name = "deleted_at", nullable = true)
    private String deletedAt;


}
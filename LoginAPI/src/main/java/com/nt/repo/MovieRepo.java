package com.nt.repo;

import org.springframework.data.repository.CrudRepository;

import com.nt.entity.Movie;

public interface MovieRepo extends CrudRepository<Movie, Integer> {

}
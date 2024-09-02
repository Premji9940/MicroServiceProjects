package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Movie;
import com.nt.repo.MovieRepo;

import lombok.extern.slf4j.Slf4j;
@Service
@Slf4j
public class MovieService {

	@Autowired private MovieRepo repo;
	
	public String save(Movie m) {
		log.info("MovieService -> save() started...");
		return "Movie Saved with "+ repo.save(m);
	}
}

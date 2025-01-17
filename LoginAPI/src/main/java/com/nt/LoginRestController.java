package com.nt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.entity.Movie;
import com.nt.service.MovieService;

import lombok.extern.slf4j.Slf4j;

@RestController()
@RequestMapping("/login")
@Slf4j
public class LoginRestController {
	@Autowired private MovieService service;
	
	
	
	@GetMapping("/log")
	public ResponseEntity<String> login(){
		log.info("LoginRestController- Login() started...");
		return new ResponseEntity<String>(service.save(new Movie(null,"RRR","RajaMouli")),HttpStatus.OK);
	}

}

package com.nt.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIGatewayController {
	
	@GetMapping("/gateway")
	public ResponseEntity<String> gateWay(){
		return new ResponseEntity<String>("HI From Api Gateway",HttpStatus.OK);
	}

}

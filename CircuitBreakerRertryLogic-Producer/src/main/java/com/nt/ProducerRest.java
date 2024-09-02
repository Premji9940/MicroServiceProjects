package com.nt;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ProducerRest {
	
	
	private static final String URL="http://localhost:5050/consumer";
int count=1;
	
	@GetMapping("/producer")
	public ResponseEntity<String> callProducer() {
		
		String body=" Iam From producer app";

			return new ResponseEntity<String>(body,HttpStatus.OK);
	}
	

}
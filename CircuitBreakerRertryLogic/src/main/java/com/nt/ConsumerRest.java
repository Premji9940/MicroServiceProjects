package com.nt;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;

@RestController
public class ConsumerRest {
	
	
	private static final String URL="http://localhost:5050/producer";
	
	
public static final String USER_SERVICE="UserService";
int count=1;
	
	@GetMapping("/consumer")
	
	//@CircuitBreaker(name = USER_SERVICE,fallbackMethod = "getFallBackResponse")
	@Retry(name = USER_SERVICE,fallbackMethod = "getFallBackResponse")
	public ResponseEntity<String> callProducer() {
		System.out.println(" producer Method calling Producer for "+count++ +" Time ON "+ new Date());

		RestTemplate rest=new RestTemplate();
		ResponseEntity<String> result = rest.getForEntity(URL, String.class);
		String body = result.getBody();
		
		
		return new ResponseEntity<String>(body,HttpStatus.OK);

	}
	//Fall Back Method
	
	public ResponseEntity<String>  getFallBackResponse(Exception e) {
		System.out.println("ConsumerRest.fallBack()");
		return new ResponseEntity<String>("Iam From Fallback Method",HttpStatus.OK);
	}

}

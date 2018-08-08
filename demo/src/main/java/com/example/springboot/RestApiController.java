/**
 * Request Practice
 */
package com.example.springboot;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/request")
public class RestApiController {
	
	@RequestMapping(value = "/")
	public String RequestMsg() {
		return "Please send GET or POST request";
	}
	
	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public ResponseEntity<?> getRequest(){
			
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@RequestMapping(value = "/post", method = RequestMethod.POST)
	public ResponseEntity<?> postRequest(@RequestBody String s){
		HttpHeaders header = new HttpHeaders();
		header.set("/request/post/", s);
		return new ResponseEntity<String>(header,HttpStatus.CREATED);
		
	}
}



package com.example.cloudant.app.response.helper;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseHelper<T> {

	
	public ResponseEntity<T> getResponseEntity(T t, HttpHeaders headers, HttpStatus status) {
		return new ResponseEntity<T>(t, headers, status);
	}

	public ResponseEntity<T> getResponseEntity(T t, HttpStatus status) {
		return new ResponseEntity<T>(t, status);
	}
}

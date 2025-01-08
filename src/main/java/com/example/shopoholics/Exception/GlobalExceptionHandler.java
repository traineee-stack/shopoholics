package com.example.shopoholics.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;



@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<String > resourcenotfoundException(ResourceNotFoundException ex)
	{
		return new ResponseEntity<>(ex.getMessage(),HttpStatus.BAD_REQUEST);
	}

}


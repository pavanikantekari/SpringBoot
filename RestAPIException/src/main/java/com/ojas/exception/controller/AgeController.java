package com.ojas.exception.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.my.controllers.RequestMapping;

@RestController
@ControllerAdvice
public class AgeController {
@RequestMapping("/sample/{age}")
@GetMapping
@ExceptionHandler(AgeNotFoundException.class)
public ResponseEntity<String>(print@PathVariable int age)
	{
		String s = null;
		try {
			if(age < 17) {
				throw new AgeNotFoundException("age should be > 18 ");
			} else {
				return new ResponseEntity<String>("ok", HttpStatus.ok);
			}
		} catch (AgeNotFoundException e) {
			s = e.getMessage();
		}
		return new ResponseEntity<String>(s, HttpStatus.NOT_FOUND);
	}
}

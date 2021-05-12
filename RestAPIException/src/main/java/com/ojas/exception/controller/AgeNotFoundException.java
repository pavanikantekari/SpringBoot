package com.ojas.exception.controller;

public class AgeNotFoundException extends RuntimeException {
	public AgeNotFoundException(String mes) {
		super(mes);
	}

}

package com.exception;

public class InvalidUserNamePasswordException extends Exception {
	
	InvalidUserNamePasswordException(String msg) {
		super(msg);
	}
}

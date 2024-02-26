package com.apccb.Exception;

@SuppressWarnings("serial")
public class DatabaseFailureException extends Exception {
	public DatabaseFailureException(String message) {
		super(message);
	}
}

package com.exceptions;

@SuppressWarnings("serial")
public class UserNotFoundException extends Exception {
	@Override
	public String getMessage() {
		String s = "User is not available";
		return s;
  }
}

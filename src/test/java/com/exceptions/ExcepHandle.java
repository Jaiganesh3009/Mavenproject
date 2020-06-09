package com.exceptions;

public class ExcepHandle {
public static void main(String[] args) {
	System.out.println("Start");
	System.out.println(100);
	System.out.println(100);
	try {
		System.out.println(100/0);
		System.out.println(100);
		System.out.println(100);
	} catch (ArithmeticException e) {
		e.printStackTrace();
	} catch (NumberFormatException e) {
		e.printStackTrace();
	}
	System.out.println(100);
	System.out.println("End");
  }
}

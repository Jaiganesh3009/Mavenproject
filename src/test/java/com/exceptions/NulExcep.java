package com.exceptions;

public class NulExcep {
@SuppressWarnings("null")
public static void main(String[] args) {
	
	//null exception
	String s = null;
	int l = s.length();
	System.out.println(l);

}
}

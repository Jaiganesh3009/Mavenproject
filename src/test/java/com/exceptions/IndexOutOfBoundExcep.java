package com.exceptions;

import java.util.ArrayList;
import java.util.List;

public class IndexOutOfBoundExcep {
public static void main(String[] args) {
	List<Integer> emp = new ArrayList<Integer>();
	emp.add(100);
	emp.add(100);
	emp.add(100);
	emp.add(100);
	emp.add(100);
	System.out.println(emp.get(10));
}
}

package com.pojo;

public class Circle extends Shape {
	 public Circle(int i, int j) {
		// TODO Auto-generated constructor stub
		 super(i,j);
		 requiredN = 1;
		 numCorners = 0;
	}

	void showArea() {
		System.out.println("Area of Circle is = pi * (r^2)\n");
	}
}

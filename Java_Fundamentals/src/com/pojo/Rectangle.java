package com.pojo;

public class Rectangle extends Shape {
	public Rectangle(int i, int j) {
		// TODO Auto-generated constructor stub
		super(i,j);
		requiredN = 2;
		numCorners = 4;
	}
	void showArea() {
		System.out.println("Area of rectangle id = length * breadth.\n");
	}
	
}

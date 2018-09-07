package com.pojo;

public class Shape {
	int requiredN;
	int numCorners;
	
	public Shape() {
		// TODO Auto-generated constructor stub
	}
	public Shape(int r, int n) {
		// TODO Auto-generated constructor stub
		requiredN = r;
		numCorners = n;
	}
	void display() {
		System.out.println("Minimum Required measures:: "+ requiredN);
		System.out.println("Number of Corners:: "+ numCorners);
	}
}

package com.city.pojo;
import com.city.data.*;
public class StudentDetails {
	int rollno;
	String name;
	static Institute insti = new Institute();
	public StudentDetails(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	
	void display() {
		System.out.println("Roll No:: "+rollno+"\tName:: "+name+"\tInstitute:: "+insti.getInstitute());
	}
	
	public static void main(String []args) {
		StudentDetails s1 = new StudentDetails(1, "Sarvesh");
		s1.display();
	}
}

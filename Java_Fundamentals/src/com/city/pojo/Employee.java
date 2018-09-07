package com.city.pojo;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee {
	String name;
	int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	void showEmployeeDetails() {
		System.out.println("Name: "+name+"\tage: "+age);
	}
	
	public static void main(String []args) {
		Scanner reader = new Scanner(System.in);
		ArrayList<Employee> elist = new ArrayList<Employee>(5);
		for(int i = 0; i<5; i++) {
			System.out.println("Enter Employee Name:: ");
			String nm = reader.nextLine();
			System.out.println("Enter Employee Age:: ");
			int ag = Integer.parseInt(reader.nextLine());   //(reader.nextLine());
			elist.add(new Employee(nm, ag)) ;
		}
		reader.close();
		for(Employee emp : elist) {
			emp.showEmployeeDetails();
		}
	}
	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
}

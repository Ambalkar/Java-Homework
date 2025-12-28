package com.tka.dec11;

public class Student {

	// int roll;
	// String name;
	// int marks;
	
	// void displayDetails() {
	// 	System.out.println("Roll:" + roll);
	// 	System.out.println("Name:" + name);
	// 	System.out.println("Marks:" + marks);
	void m1 () {
		System.out.println("m1 method of student class");
		Student s1 = new Student();
		System.out.println(s1);
		s1.m2();
	}
		
	void m2 () {
			System.out.println("m2 method of student class");
//			Student s1 = new Student();
//			System.out.println(s1);
//			s1.m2();
	}
}

package com.oracle.oops.part1;

public class StaticEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student.setCourseName("Java");
		
		Student s1 = new Student();
		s1.setStudentId(101);
		s1.setStudentName("Sindhu");
		s1.setGrades(93);
		
		Student s2 = new Student();
		s2.setStudentId(101);
		s2.setStudentName("Mary");
		s2.setGrades(98);
		
		System.out.println(s1.getStudentName()+" Scored "+s1.getGrades()+" in "+ s1.getCourseName());
		
		System.out.println(s2.getStudentName()+" Scored "+s2.getGrades()+" in "+ s2.getCourseName());
		
	}

}

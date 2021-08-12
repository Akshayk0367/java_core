package com.oracle.oops.part1;

public class Student {
	private String studentName;
	private int studentId;
	private float grades;
	private static String courseName;
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public float getGrades() {
		return grades;
	}
	public void setGrades(float grades) {
		this.grades = grades;
	}
	public static String getCourseName() {
		return courseName;
	}
	public static void setCourseName(String courseName) {
		Student.courseName = courseName;
	}
	
	
}

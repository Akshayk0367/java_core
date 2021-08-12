package com.oracle.oops.part1;

public class Employees {
	private int employeeId;
	private String firstName;
	private String lastName;
	private float salary;
	private float grades;
	static int employeeCount = 0;
	
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId() {
		this.employeeId = employeeCount++;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public float getGrades() {
		return grades;
	}
	public void setGrades(float grades) {
		this.grades = grades;
	}
	public static int getEmployeeCount() {
		return employeeCount;
	}
	public static void setEmployeeCount(int employeeCount) {
		Employees.employeeCount = employeeCount;
	}
	
}

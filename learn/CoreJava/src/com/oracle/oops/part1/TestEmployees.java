package com.oracle.oops.part1;

public class TestEmployees {

	public static void main(String[] args) {
		Employees e = new Employees();
		e.setEmployeeId();
		e.setFirstName("Steve");
		e.setLastName("Jobs");
		e.setSalary(50000);
		e.setGrades(98);
		
		print(e);
		System.out.println("current employee count "+e.getEmployeeCount());

		Employees e2 = new Employees();
		e2.setEmployeeId();
		e2.setFirstName("Jeff");
		e2.setLastName("Bezos");
		e2.setSalary(25000);
		e2.setGrades(88);
		print(e2);
		System.out.println("current employee count "+e.getEmployeeCount());
	}

	private static void print(Employees e) {
		System.out.println("emp Id "+e.getEmployeeId()+" " +e.getFirstName()+" "+e.getLastName()+" earns "+e.getSalary());
		
	}

}

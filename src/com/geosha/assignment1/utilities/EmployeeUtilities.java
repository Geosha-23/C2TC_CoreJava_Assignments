package com.geosha.assignment1.utilities;
import com.geosha.assignment1.employee.*;
public class EmployeeUtilities {
       
	public static void displayEmployeeInfo(Employee emp)
	{
		System.out.println("Name:" + emp.getName());
		System.out.println("EmployeeId:" + emp.geteId());
		System.out.println("Salary:" + emp.getSalary());
		
		if (emp instanceof Manager) {
			System.out.println("Team Size:" + ((Manager)emp).getTeamsize());
		}
		
		else if (emp instanceof Developer) {
			System.out.println("Programming Language:" + ((Developer)emp).getProgrammer());
		}
		
			System.out.println("-----------------------------------------------");
		
	}
	public static void increaseSalary(Employee emp, double amount) {
		emp.setSalary(emp.getSalary() + amount);
		
		System.out.println(emp.getName() + " salary Increased by "+ amount);
		System.out.println("-----------------------------------------------");
	}
}

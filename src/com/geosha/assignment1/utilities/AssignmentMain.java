package com.geosha.assignment1.utilities;
import com.geosha.assignment1.employee.*;
public class AssignmentMain {

	public static void main(String[] args) {
		
             Manager manager=new Manager ("Geo" , 23 , 50000 ,4);
             Developer developer=new Developer("Grace", 27, 50000 , "Python");
             
             EmployeeUtilities.displayEmployeeInfo(manager);
             EmployeeUtilities.displayEmployeeInfo(developer);
             
             EmployeeUtilities.increaseSalary(manager , 10000);
             EmployeeUtilities.increaseSalary(developer , 15000);
             
             EmployeeUtilities.displayEmployeeInfo(manager);
             EmployeeUtilities.displayEmployeeInfo(developer);
	}

}

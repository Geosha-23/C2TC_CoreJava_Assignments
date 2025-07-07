package com.geosha.assignment1.employee;

public class Developer extends Employee{
	
	private String Programmer;

	public Developer(String name, int eId, double salary, String programmer) {
		super(name, eId, salary);
		this.Programmer = programmer;
		
	}

	public String getProgrammer() {
		return Programmer;
	}

	public void setProgrammer(String programmer) {
		Programmer = programmer;
	}
	
	
        
}

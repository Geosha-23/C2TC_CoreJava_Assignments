package com.geosha.assignment2;

public class Main {

	public static void main(String[] args) {
		//creating object for Student class so that it prints the given info.
	Student student = new Student();
	
	//creating object for Commission class
	Commission commission = new Commission();
	commission.acceptDetails();
	commission.calculateCommission();

	}

}

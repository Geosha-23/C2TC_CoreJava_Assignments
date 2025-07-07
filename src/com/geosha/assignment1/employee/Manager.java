package com.geosha.assignment1.employee;

public class Manager extends Employee{
	
	private int teamsize;

	public Manager(String name, int eId, double salary, int teamsize) {
		super(name, eId, salary);
		this.teamsize = teamsize;
	}

	public int getTeamsize() {
		return teamsize;
	}

	public void setTeamsize(int teamsize) {
		this.teamsize = teamsize;
	}
	

}

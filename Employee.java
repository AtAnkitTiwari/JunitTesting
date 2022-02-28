package com.junit.testing;

public class Employee {
	public String addCEO(String name) {
		return name;
	}
	
	public String addProjectManager(String name) {
		return name;
	}
	
	public String addTeamLead(String name) {
		return name;
	}
	
	public double Salary(double oldSalary) {
		
		double salaryHikePercent =10;
		double newSalary =((oldSalary*10)/100)+(oldSalary);
		return newSalary;
		
	}

}

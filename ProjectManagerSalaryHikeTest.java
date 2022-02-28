package com.junit.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProjectManagerSalaryHikeTest {

	@Test
	void test() {
		Employee ProjectManager=new Employee();
		double output=ProjectManager.Salary(40000);
		assertEquals(44000,output);
	}

}

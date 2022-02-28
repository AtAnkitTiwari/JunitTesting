package com.junit.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TeamLeadSalaryHikeTest {

	@Test
	void test() {
		Employee TeamLead=new Employee();
		double output=TeamLead.Salary(30000);
		assertEquals(33000,output);
	}

}

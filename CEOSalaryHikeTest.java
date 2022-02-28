package com.junit.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CEOSalaryHikeTest {

	@Test
	void test() {
		Employee CEO=new Employee();
		double output=CEO.Salary(50000);
		assertEquals(55000,output);
	}

}

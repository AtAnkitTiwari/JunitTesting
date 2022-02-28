package com.junit.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CEOTest {

	@Test
	void test() {
		Employee CEO=new Employee();
		String output=CEO.addCEO("Jhon Dey");
		assertEquals("Jhon Dey",output);
	}

}

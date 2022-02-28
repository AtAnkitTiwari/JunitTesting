package com.junit.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestProjectManager {

	@Test
	void test() {
		Employee ProjectManager=new Employee();
		String output=ProjectManager.addProjectManager("Joe");
		assertEquals("Joe",output);
		
	}

}

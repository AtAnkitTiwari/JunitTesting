package com.junit.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TeamLead {

	@Test
	void test() {
		Employee TeamLead=new Employee();
		String output=TeamLead.addTeamLead("Roger");
		assertEquals("Roger",output);
	}

}

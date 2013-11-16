package com.nhpatt.ptd.doubles.stories.fixtures;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.nhpatt.ptd.doubles.stories.EstimateType;
import com.nhpatt.ptd.doubles.stories.User;
import com.nhpatt.ptd.doubles.stories.UserStory;
import com.nhpatt.ptd.doubles.stories.stub.Proyect;

public class ManualFixturesTests {

	private Proyect proyect;

	@Before
	public void setUp() {
		proyect = new Proyect();
		User juan = new User();
		UserStory userStory = new UserStory("do tests", 2,
				EstimateType.HISTORY_POINTS);
		juan.addUserStory(userStory);
		User pepe = new User();
		proyect.setUsers(new User[] { juan, pepe });
	}

	@Test
	public void memoryFixturesAreHardTest() {
		assertTrue(true);
	}
}
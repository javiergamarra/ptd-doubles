package com.nhpatt.ptd.doubles.stories;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

import org.junit.Test;

public class UserTests {

	@Test
	public void aNewUserCanWork() {
		User user = new User();
		user.addUserStory(createADummyUserStory());
		assertEquals(1, user.getStoriesInProgress().size());
	}
	
	@Test
	public void aNewUserCanWorkWithADummyStory() {
		User user = new User();
		UserStory dummy = mock(UserStory.class);
		user.addUserStory(dummy);
		assertEquals(1, user.getStoriesInProgress().size());
	}

	private UserStory createADummyUserStory() {
		UserStory userStory = new UserStory("name", 3,
				EstimateType.HISTORY_POINTS);
		// userStory.addProject(new Project());
		// A LOT OF THINGS HERE
		return userStory;
	}

}
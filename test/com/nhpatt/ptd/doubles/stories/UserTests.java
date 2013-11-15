package com.nhpatt.ptd.doubles.stories;

import static org.junit.Assert.*;

import org.junit.Test;

import com.nhpatt.ptd.doubles.stories.EstimateType;
import com.nhpatt.ptd.doubles.stories.User;
import com.nhpatt.ptd.doubles.stories.UserStory;

public class UserTests {

	@Test
	public void aNewUserCanWork() {
		User user = new User();
		user.addUserStory(createADummyUserStory());
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
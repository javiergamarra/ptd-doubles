package com.nhpatt.ptd.doubles.stories.databuilders;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.nhpatt.ptd.doubles.stories.UserStory;

public class UserStoryDataBuilderTests {

	@Test
	public void creatingAUserTest() {

		UserStory userStory = new UserStoryBuilder().withName("do tests")
				.withEstimate(3).build();
		
		assertEquals("do tests", userStory.getName());

	}
}

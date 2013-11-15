package com.nhpatt.ptd.doubles.stories;

import java.util.ArrayList;
import java.util.List;

public class User {

	private List<UserStory> storiesInProgress = new ArrayList<UserStory>();

	public void addUserStory(UserStory story) {
		if (iAmFree()) {
			storiesInProgress.add(story);
		}
	}

	private boolean iAmFree() {
		// DO COMPLEX LOGIC
		return true;
	}

	public List<UserStory> getStoriesInProgress() {
		return storiesInProgress;
	}

}

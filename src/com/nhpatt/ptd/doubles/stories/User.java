package com.nhpatt.ptd.doubles.stories;

import java.util.ArrayList;
import java.util.List;

import com.nhpatt.ptd.doubles.stories.stub.Proyect;

public class User {

	private List<UserStory> storiesInProgress = new ArrayList<UserStory>();
	private int failedProyects;

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

	public void closePendingTasks(Proyect proyect) {
		failedProyects++;
		//Other things
	}

	public int getFailedProyects() {
		return failedProyects;
	}

}

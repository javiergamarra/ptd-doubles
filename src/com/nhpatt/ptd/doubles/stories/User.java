package com.nhpatt.ptd.doubles.stories;

import java.util.ArrayList;
import java.util.List;

import com.nhpatt.ptd.doubles.stories.stub.Proyect;

public class User {

	private List<UserStory> storiesInProgress = new ArrayList<UserStory>();
	private int failedProyects;
	private String name;
	private String surname;

	public void setFailedProyects(int failedProyects) {
		this.failedProyects = failedProyects;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public void setStoriesInProgress(List<UserStory> storiesInProgress) {
		this.storiesInProgress = storiesInProgress;
	}

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

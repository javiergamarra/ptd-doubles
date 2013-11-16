package com.nhpatt.ptd.doubles.stories.stub;

import java.security.AccessControlException;

import com.nhpatt.ptd.doubles.stories.User;

public class Proyect {

	private static final Integer ID = 1;
	
	private User[] users;

	public Priorities getMostImportantUserStory(Database database) {
		try {

			Priorities[] prioritiesForThisProyect = database
					.getPrioritiesForThisProyect(ID);
			for (Priorities priority : prioritiesForThisProyect) {
				// Calculating things...

				if (priority == Priorities.CRITICAL) {
					return priority;
				}
			}
		} catch (AccessControlException e) {
			return Priorities.ASAP;
		}
		return Priorities.NOW;
	}

	public void close(Database database) {
		User[] users = database.getUsers(this);
		for (User user : users) {
			user.closePendingTasks(this);
		}
	}
	
	public void setUsers(User[] users) {
		this.users = users;
	}

}

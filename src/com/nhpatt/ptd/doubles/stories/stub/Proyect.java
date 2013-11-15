package com.nhpatt.ptd.doubles.stories.stub;

import java.security.AccessControlException;

public class Proyect {

	private static final Integer ID = 1;

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

}

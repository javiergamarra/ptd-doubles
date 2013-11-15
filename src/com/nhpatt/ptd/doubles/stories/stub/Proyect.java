package com.nhpatt.ptd.doubles.stories.stub;

public class Proyect {
	
	private static final Integer ID = 1;

	public Priorities getMostImportantUserStory(Database database) {
		Priorities[] prioritiesForThisProyect = database.getPrioritiesForThisProyect(ID);
		for (Priorities priority : prioritiesForThisProyect) {
			//Calculating things...
			
			if (priority == Priorities.CRITICAL) {
				return priority;
			}
		}
		return Priorities.NOW;
	}

}

package com.nhpatt.ptd.doubles.stories.databuilders;

import com.nhpatt.ptd.doubles.stories.EstimateType;
import com.nhpatt.ptd.doubles.stories.UserStory;

public class UserStoryBuilder {
	
	private String name;
	private Integer estimate;

	public UserStory build() {
		return new UserStory(name, estimate, EstimateType.HOURS);
	}

	public UserStoryBuilder withName(String name) {
		this.name = name;
		return this;
	}

	public UserStoryBuilder withEstimate(Integer estimate) {
		this.estimate = estimate;
		return this;
	}

}

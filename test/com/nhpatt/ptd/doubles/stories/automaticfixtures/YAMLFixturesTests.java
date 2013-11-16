package com.nhpatt.ptd.doubles.stories.automaticfixtures;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import com.nhpatt.ptd.doubles.stories.User;

public class YAMLFixturesTests {

	private static final String DATA = "name: Juan\n"
			+ "surname: Luis\n"
			+ "failedProyects: 2";

	@Test
	public void memoryFixturesAreHardTest() {
		Yaml yaml = new Yaml(new Constructor(User.class));
		User user = (User) yaml.load(DATA);
		assertEquals("Juan", user.getName());
		assertEquals("Luis", user.getSurname());
		assertEquals(2, user.getFailedProyects());

	}
}
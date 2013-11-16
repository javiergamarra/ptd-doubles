package com.nhpatt.ptd.doubles.stories.fixtures;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.nhpatt.ptd.doubles.stories.stub.Database;

public class DatabaseFixturesTests {

	@Before
	public void setUp() {
		Database database = new Database();
		database.loadTestDatabase("base_de_datos:1525");
	}

	@Test
	public void databaseFixturesAreEasilyBroken() {
		assertTrue(true);
	}
}
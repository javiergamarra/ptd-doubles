package com.nhpatt.ptd.doubles.stories.stub;

import static com.nhpatt.ptd.doubles.stories.stub.Priorities.ASAP;
import static com.nhpatt.ptd.doubles.stories.stub.Priorities.CRITICAL;
import static com.nhpatt.ptd.doubles.stories.stub.Priorities.NOW;
import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

public class ProyectTests {

	private Proyect proyect;

	@Before
	public void setUp() {
		proyect = new Proyect();
	}

	@Test
	public void youCanRetrieveUserStoriesPriorizedTest() {
		Database database = mock(Database.class);
		when(database.getPrioritiesForThisProyect(any(Integer.class)))
				.thenReturn(new Priorities[]{CRITICAL, NOW, ASAP});

		assertEquals(CRITICAL, proyect.getMostImportantUserStory(database));
	}
}
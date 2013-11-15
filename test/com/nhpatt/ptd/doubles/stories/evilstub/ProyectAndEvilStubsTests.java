package com.nhpatt.ptd.doubles.stories.evilstub;

import static com.nhpatt.ptd.doubles.stories.stub.Priorities.ASAP;
import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.security.AccessControlException;

import org.junit.Before;
import org.junit.Test;

import com.nhpatt.ptd.doubles.stories.stub.Database;
import com.nhpatt.ptd.doubles.stories.stub.Proyect;

public class ProyectAndEvilStubsTests {

	private Proyect proyect;

	@Before
	public void setUp() {
		proyect = new Proyect();
	}

	@Test
	public void youCanReadTheDefaultPriorityForAProyectTest() {
		Database database = mock(Database.class);
		when(database.getPrioritiesForThisProyect(any(Integer.class)))
				.thenThrow(new AccessControlException("Los usuarios no pueden consultar!"));

		assertEquals(ASAP, proyect.getMostImportantUserStory(database));
	}
}
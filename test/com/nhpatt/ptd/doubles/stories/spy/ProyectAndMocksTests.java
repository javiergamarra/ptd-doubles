package com.nhpatt.ptd.doubles.stories.spy;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.nhpatt.ptd.doubles.stories.User;
import com.nhpatt.ptd.doubles.stories.stub.Database;
import com.nhpatt.ptd.doubles.stories.stub.Proyect;

public class ProyectAndMocksTests {

	private Proyect proyect;

	@Mock
	private Database database;

	@Mock
	private User juan;

	@Before
	public void setUp() {
		proyect = new Proyect();
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void youCanCloseAProyectAndRemovePendingTasksTest() {
		when(database.getUsers(proyect)).thenReturn(new User[] { juan });

		proyect.close(database);

		verify(juan).closePendingTasks(proyect);
	}
}
package com.nhpatt.ptd.doubles.stories.mock;

import static com.nhpatt.ptd.doubles.stories.stub.Priorities.ASAP;
import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.security.AccessControlException;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;

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
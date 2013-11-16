package com.nhpatt.ptd.doubles.stories.spy;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

import com.nhpatt.ptd.doubles.stories.User;
import com.nhpatt.ptd.doubles.stories.stub.Database;
import com.nhpatt.ptd.doubles.stories.stub.Proyect;

public class ProyectAndSpiesTests {

	private Proyect proyect;

	@Mock
	private Database database;

	@Mock
	private User juan;
	
	@Spy
	private User pepe;

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
		Assert.assertEquals(0, juan.getFailedProyects());
	}

	@Test
	public void youCanCloseAProyectAndSpyItTest() {
		when(database.getUsers(proyect)).thenReturn(new User[] { pepe });

		proyect.close(database);

		verify(pepe).closePendingTasks(proyect);
		Assert.assertEquals(1, pepe.getFailedProyects());
	}
}
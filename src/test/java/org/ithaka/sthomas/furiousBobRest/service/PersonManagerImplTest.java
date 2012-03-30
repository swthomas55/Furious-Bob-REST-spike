package org.ithaka.sthomas.furiousBobRest.service;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.appfuse.service.impl.BaseManagerMockTestCase;
import org.ithaka.sthomas.furiousBobRest.dao.PersonDao;
import org.ithaka.sthomas.furiousBobRest.model.Person;
import org.ithaka.sthomas.furiousBobRest.service.impl.PersonManagerImpl;
import org.jmock.Expectations;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PersonManagerImplTest extends BaseManagerMockTestCase {

	private PersonDao dao;
	private PersonManagerImpl manager;

	@Before
	public void setUp() throws Exception {
		dao = context.mock(PersonDao.class);
		manager = new PersonManagerImpl(dao);
	}

	@After
	public void tearDown() throws Exception {
		manager = null;
	}

	@Test
	public void testGetPerson() {
		log.debug("testing get...");
		
		final Long id = 7L;
		final Person person = new Person();
		
		// set expected behavior on dao
		context.checking(new Expectations() {{
			one(dao).get(with(equal(id)));
			will(returnValue(person));
		}});
		
		Person result = manager.get(id);
		assertSame(person, result);
	}
	
	@Test
	public void testGetPersons() throws Exception {
		log.debug("testing getAll...");
		
		final List<Person> persons = new ArrayList<Person>();
		
		// set expected behavior on dao
		context.checking(new Expectations() {{ 
			one(dao).getAll();
			will(returnValue(persons));
		}});
		
		List<Person> result = manager.getAll();
		
		assertSame(persons, result);
	}
	
	@Test
	public void testGetPeople() throws Exception {
		log.debug("testing getPeople...");
		
		final List<Person> persons = new ArrayList<Person>();
		
		// set expected behavior on dao
		context.checking(new Expectations() {{ 
			one(dao).getAll();
			will(returnValue(persons));
		}});
		
		List<Person> result = manager.getPeople();
		
		assertSame(persons, result);
	}
	
	@Test
	public void testSavePerson() throws Exception {
		log.debug("testing save...");
		
		final Person person = new Person();
		// enter all required fields
		
		// set expected behavior on dao
		context.checking(new Expectations() {{ 
			one(dao).save(with(same(person)));
		}});
		
		manager.save(person);
	}
	
	@Test
	public void testRemovePerson() throws Exception {
		log.debug("testing remove...");
		
		final Long id = -11L;
		
		// set expected behavior on dao
		context.checking(new Expectations() {{ 
			one(dao).remove(with(equal(id)));
		}});
		
		manager.remove(id);
	}

}

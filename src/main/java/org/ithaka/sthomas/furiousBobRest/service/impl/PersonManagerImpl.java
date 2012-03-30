package org.ithaka.sthomas.furiousBobRest.service.impl;

import java.util.List;
import javax.jws.WebService;

import org.appfuse.service.impl.GenericManagerImpl;
import org.ithaka.sthomas.furiousBobRest.dao.PersonDao;
import org.ithaka.sthomas.furiousBobRest.model.Person;
import org.ithaka.sthomas.furiousBobRest.service.PersonManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("personManager")
@WebService(serviceName="PersonService", endpointInterface="org.ithaka.sthomas.furiousBobRest.service.PersonService")
public class PersonManagerImpl extends GenericManagerImpl<Person,Long> implements
		PersonManager {

	PersonDao personDao;
	
	@Autowired
	public PersonManagerImpl(PersonDao personDao) {
		super(personDao);
		this.personDao = personDao;
	}
	
	public List<Person> findByLastName(String lastName) {
		return personDao.findByLastName(lastName);
	}

	public List<Person> getPeople() {
		return personDao.getAll();
	}

}

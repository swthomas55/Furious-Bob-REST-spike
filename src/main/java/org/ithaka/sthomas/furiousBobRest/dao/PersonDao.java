package org.ithaka.sthomas.furiousBobRest.dao;

import java.util.List;

import org.appfuse.dao.GenericDao;
import org.ithaka.sthomas.furiousBobRest.model.Person;

public interface PersonDao extends GenericDao<Person, Long> {
	public List<Person> findByLastName(String lastName);
}

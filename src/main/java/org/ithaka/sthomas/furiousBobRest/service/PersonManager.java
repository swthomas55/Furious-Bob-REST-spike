package org.ithaka.sthomas.furiousBobRest.service;

import java.util.List;

import org.appfuse.service.GenericManager;
import org.ithaka.sthomas.furiousBobRest.model.Person;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

public interface PersonManager extends GenericManager<Person, Long> {
	List<Person> findByLastName(@PathParam("lastname") String lastName);
	
	List<Person>getPeople();
}

package org.ithaka.sthomas.furiousBobRest.service;

import java.util.List;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.ithaka.sthomas.furiousBobRest.model.Person;

/**
 * Web Service interface so hierarchy of Generic Manager isn't carried through.
 */
@WebService
@Path("/ppl")
@Produces({"application/json", "application/xml"})
public interface PersonService {
	@Path("/person/{lastname}")
	@GET
	public List<Person> findByLastName(String lastName);

	@GET @Path("/people")
	public List<Person> getPeople();

}

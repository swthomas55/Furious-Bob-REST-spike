package org.ithaka.sthomas.furiousBobRest.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonTest extends Person {

	private static final long serialVersionUID = 1L;

	@Test
	public void testToString() {
		Person p = new Person();
		p.setId(7L);
		p.setFirstName("Bob");
		p.setLastName("Smith");
		
		assertEquals("Bob,Smith", p.toString());
	}

}

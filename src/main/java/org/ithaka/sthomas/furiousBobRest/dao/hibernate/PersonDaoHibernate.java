package org.ithaka.sthomas.furiousBobRest.dao.hibernate;

import java.util.List;
import org.appfuse.dao.hibernate.GenericDaoHibernate;
import org.ithaka.sthomas.furiousBobRest.dao.PersonDao;
import org.ithaka.sthomas.furiousBobRest.model.Person;
import org.springframework.stereotype.Repository;

@Repository("personDao")
public class PersonDaoHibernate extends GenericDaoHibernate<Person,Long> implements
		PersonDao {

	public PersonDaoHibernate() {
		super(Person.class);
	}

	public List<Person> findByLastName(String lastName) {
		return getHibernateTemplate().find("from Person where lastName=?", lastName);
	}

}

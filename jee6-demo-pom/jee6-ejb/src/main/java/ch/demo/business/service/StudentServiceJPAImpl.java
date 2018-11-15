package ch.demo.business.service;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ch.demo.dom.Student;

@Stateless
public class StudentServiceJPAImpl implements StudentServiceRemote {
	
	/** The serial-id. */
	private static final long serialVersionUID = 1386508985359072388L;

	/** The number of times, the service has been invoked. */
	private Long numberOfAccess = 0l;
	
	/**
	 * The entity manager that manages the persistence. As there is only one
	 * persistence unit, it takes it by default.
	 */
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Student getStudentByLastName(String lastname) {
		return null;
	}



}

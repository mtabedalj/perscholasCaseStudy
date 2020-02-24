/**
 * 
 */
package com.mahmoud.services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author mtabedalj
 *
 */
public class AbstractServices {
	protected EntityManagerFactory emf;
	protected EntityManager em;

	public AbstractServices() {
		emf = Persistence.createEntityManagerFactory("PerscholasCaseStudy"); 
		em = emf.createEntityManager();
	}
	
	public AbstractServices(String PU) {  
		emf = Persistence.createEntityManagerFactory(PU);
		em = emf.createEntityManager();
	}
	
	protected void cleanup() {
		em.close();
		emf.close();
	}
}

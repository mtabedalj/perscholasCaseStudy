package com.mahmoud.services;

import java.util.List;

import javax.persistence.Query;

import com.mahmoud.entities.Business;
import com.mahmoud.entities.Client;

public class ClientService extends AbstractServices {
	public ClientService() {
		super();
	}
	
	public void addClient(Client client) {
		em.getTransaction().begin();
		em.persist(client);
		em.getTransaction().commit();
	}
	
	public List<Client> getClientByEmail(String clientEmail) {
		Query query = em.createNamedQuery("GetClientByEmail");
		query.setParameter("cEmail", clientEmail);
		return query.getResultList();
	}
}

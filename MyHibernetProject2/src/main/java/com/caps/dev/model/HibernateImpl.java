package com.caps.dev.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.caps.dev.beans.Person;

public class HibernateImpl implements PersonDAO {
	public void create(Person person) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPersistanceUnit");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(person);
		tx.commit();
	}
	
	public void delete() {
		
	}
	
	public void update() {
		
	}
	
	public void search(int perId) {
		
	}

}
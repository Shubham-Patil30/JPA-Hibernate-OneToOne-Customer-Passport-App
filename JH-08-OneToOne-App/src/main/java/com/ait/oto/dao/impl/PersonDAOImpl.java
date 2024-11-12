package com.ait.oto.dao.impl;


import com.ait.oto.dao.PersonDAO;
import com.ait.oto.entities.Person;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class PersonDAOImpl implements PersonDAO {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("test"); 

		  @Override
		public void savePerson(Person person) {
			  EntityManager em = factory.createEntityManager(); 
				EntityTransaction tx = em.getTransaction(); 
				tx.begin();
				try {
					
					em.merge(person); 
					tx.commit();
					System.out.println("Person Passport details  are added in db ");
				} catch (Exception e) {
					tx.rollback();
					System.out.println("Some error occurs");
					e.printStackTrace();
				}
				
		  }		  
		 @Override
		public Person getPersonById(Integer id) {
			 EntityManager em = factory.createEntityManager(); 
				
				Person  exstingPerson = em.find(Person.class, id);
				if(exstingPerson!= null) {
					return exstingPerson;
				}
				else {
					System.out.println("Person not found");
				}
				return exstingPerson; 
		}
		 
		 @Override
		public void removePerson(Integer id) {
			 EntityManager em = factory.createEntityManager(); 
				EntityTransaction tx = em.getTransaction(); 
				tx.begin();
				try {
					Person  exstingPerson = em.find(Person.class, id);
					if(exstingPerson != null) {
						em.remove(exstingPerson);
						tx.commit();
						System.out.println("Person is removed");
					}
					else {
						System.out.println("Person not found");
					}
				} catch (Exception e) {
					tx.rollback();
					System.out.println("Some error occurs");
					e.printStackTrace();
				}
		
		}
		  
}

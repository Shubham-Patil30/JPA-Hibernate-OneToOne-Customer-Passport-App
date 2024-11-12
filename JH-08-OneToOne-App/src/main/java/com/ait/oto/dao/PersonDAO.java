package com.ait.oto.dao;

import com.ait.oto.entities.Person;

public interface PersonDAO {
 
	public void savePerson(Person person); 
	
	public Person getPersonById(Integer id); 
	
	public void removePerson(Integer id); 
}

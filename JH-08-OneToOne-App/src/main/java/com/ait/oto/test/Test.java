package com.ait.oto.test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.ait.oto.dao.PersonDAO;
import com.ait.oto.dao.impl.PersonDAOImpl;
import com.ait.oto.entities.Passport;
import com.ait.oto.entities.Person;
import com.ait.oto.entities.Person;

public class Test {

	public static void main(String[] args) {
		PersonDAO dao = new PersonDAOImpl(); 
		
		// ========= Adding Person details===========
		
		Person p1 = new Person(); 
		p1.setPersonId(1);
		p1.setPersonName("shubham");
		
		//===== adding Passport Details ========== 
		 
		
		Passport ps1 = new Passport();
		ps1.setPassportNo(101);
		ps1.setExpireDate(LocalDate.of(2025, 8, 2));
		
		p1.setPassport(ps1);
		
		//============ Saveing Person in Db ========== 
		dao.savePerson(p1);
		

	}

}

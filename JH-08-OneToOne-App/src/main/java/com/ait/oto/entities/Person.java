package com.ait.oto.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_person")
public class Person {
	@Id
	@Column(name="person_id")
	private Integer personId; 
	
	@Column(name="person_name")
	private String personName; 
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="passport_no" , referencedColumnName = "passport_no", unique = true,nullable = false)
	private Passport passport ;

	public Integer getPersonId() {
		return personId;
	}

	public void setPersonId(Integer personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public Passport getPassport() {
		return passport;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + "]";
	} 
	
	
	
}

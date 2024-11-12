package com.ait.oto.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_passport")
public class Passport {
	
	@Id
	@Column(name="passport_no")
	private Integer passportNo; 
	
	@Column(name="expire_date")
	private LocalDate expireDate;

	public Integer getPassportNo() {
		return passportNo;
	}

	public void setPassportNo(Integer passportNo) {
		this.passportNo = passportNo;
	}

	public LocalDate getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(LocalDate expireDate) {
		this.expireDate = expireDate;
	}

	@Override
	public String toString() {
		return "Passport [passportNo=" + passportNo + ", expireDate=" + expireDate + "]";
	} 
	
}

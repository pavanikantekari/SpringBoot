package com.ojas.emps.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "laptops")
public class Laptop {
	@Id
	private int lid;
	private String lname;
	@OneToOne(mappedBy = "laptop")
	private Student student;

	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", student=" + student + "]";
	}

	
	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}


	public Laptop(int lid, String lname) {
		super();
		this.lid = lid;
		this.lname = lname;
		
	}


	public int getLid() {
		return lid;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}


	
}

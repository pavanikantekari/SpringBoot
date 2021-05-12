package com.ojas.emps.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Student {
	@Id
	private int rollNo;
	private String name;
	private int marks;
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "laptop-id")
	private Laptop laptop;

	public Student(int rollNo, String name, int marks, Laptop laptop) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
		this.laptop = laptop;
	}

	public Student() {

	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + "]";
	}

}

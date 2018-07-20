package com.renu.Syllabus_and_Result_Management.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class D extends DBase<Long> {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	@Column(name="department",nullable=false)
	private String department;
	@Column(name="faculty",nullable=false)
	private String  faculty;
	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return id;
	}
	
	public D() {
		// TODO Auto-generated constructor stub
	}

	


	

	public D(long id, String department, String faculty) {
		super();
		this.id = id;
		this.department = department;
		this.faculty = faculty;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void setId(long id) {
		this.id = id;
	}



	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	@Override
	public String toString() {
		return "D [id=" + id + ", department=" + department + ", faculty=" + faculty + "]";
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

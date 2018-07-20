package com.renu.Syllabus_and_Result_Management.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class F extends FBase<Long> {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	@Column(name="faculty",nullable=false)
	private String faculty;
	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return  id;
	}
	
	public F() {
		// TODO Auto-generated constructor stub
	}

	public F(long id, String faculty) {
		super();
		this.id = id;
		this.faculty = faculty;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "F [id=" + id + ", faculty=" + faculty + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

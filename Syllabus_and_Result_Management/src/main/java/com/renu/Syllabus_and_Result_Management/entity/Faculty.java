package com.renu.Syllabus_and_Result_Management.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//@Entity
public class Faculty extends FacultyBaseEntity<Long>{
   
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	@Column(name="f_name",nullable=false)
	private String f_name;
	@Column(name="d_name",nullable=false)
	private String d_name;
	@Column(name="level",nullable=false)
	private String level;
	@Column(name="semester",nullable=false)
	private String semester;
	@Column(name="total_credit",nullable=false)
	private double total_credit;
	private Faculty faculty;
	
	public Faculty() {
		// TODO Auto-generated constructor stub
	}
	
	
	




	public Faculty(long id, String f_name, String d_name, String level, String semester, double total_credit,
			Faculty faculty) {
		super();
		this.id = id;
		this.f_name = f_name;
		this.d_name = d_name;
		this.level = level;
		this.semester = semester;
		this.total_credit = total_credit;
		this.faculty = faculty;
	}







	public Faculty getFaculty() {
		return faculty;
	}







	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}







	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}



	public String getF_name() {
		return f_name;
	}



	public void setF_name(String f_name) {
		this.f_name = f_name;
	}



	public String getD_name() {
		return d_name;
	}



	public void setD_name(String d_name) {
		this.d_name = d_name;
	}



	public String getLevel() {
		return level;
	}



	public void setLevel(String level) {
		this.level = level;
	}



	public String getSemester() {
		return semester;
	}



	public void setSemester(String semester) {
		this.semester = semester;
	}



	public double getTotal_credit() {
		return total_credit;
	}



	public void setTotal_credit(double total_credit) {
		this.total_credit = total_credit;
	}



	public void setId(long id) {
		this.id = id;
	}







	@Override
	public String toString() {
		return "Faculty [id=" + id + ", f_name=" + f_name + ", d_name=" + d_name + ", level=" + level + ", semester="
				+ semester + ", total_credit=" + total_credit + ", faculty=" + faculty + "]";
	}



	
	
	
	
	
	
}

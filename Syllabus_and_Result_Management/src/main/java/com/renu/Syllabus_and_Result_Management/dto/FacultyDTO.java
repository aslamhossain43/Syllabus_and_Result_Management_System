package com.renu.Syllabus_and_Result_Management.dto;

import javax.persistence.Column;

import com.renu.Syllabus_and_Result_Management.entity.Faculty;

public class FacultyDTO {

	private long id;
	private String f_name;
	private String d_name;
	private String level;
	private String semester;
	private double total_credit;
	private Faculty faculty;
	
	
	
	public FacultyDTO() {
		// TODO Auto-generated constructor stub
	}



	public FacultyDTO(long id, String f_name, String d_name, String level, String semester, double total_credit,
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



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
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



	public Faculty getFaculty() {
		return faculty;
	}



	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}



	@Override
	public String toString() {
		return "FacultyDTO [id=" + id + ", f_name=" + f_name + ", d_name=" + d_name + ", level=" + level + ", semester="
				+ semester + ", total_credit=" + total_credit + ", faculty=" + faculty + "]";
	}
	
	
	
	
	
	
}

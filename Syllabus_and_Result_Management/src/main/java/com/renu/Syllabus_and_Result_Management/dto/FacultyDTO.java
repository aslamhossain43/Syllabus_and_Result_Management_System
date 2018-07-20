package com.renu.Syllabus_and_Result_Management.dto;

import java.io.Serializable;

import javax.validation.constraints.Size;

public class FacultyDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long id;
	@Size(min=3,max=150)
	private String f_name;
	@Size(min=3,max=150)
	private String d_name;
	private String level;
	private String semester;
	private double total_credit;
	
	
	
	
	public FacultyDTO() {
		// TODO Auto-generated constructor stub
	}




	public FacultyDTO(long id, String f_name, String d_name, String level, String semester, double total_credit) {
		super();
		this.id = id;
		this.f_name = f_name;
		this.d_name = d_name;
		this.level = level;
		this.semester = semester;
		this.total_credit = total_credit;
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




	@Override
	public String toString() {
		return "FacultyDTO [id=" + id + ", f_name=" + f_name + ", d_name=" + d_name + ", level=" + level + ", semester="
				+ semester + ", total_credit=" + total_credit + "]";
	}



	
	
	
}

package com.renu.Syllabus_and_Result_Management.dto;

import java.io.Serializable;

public class DepartmentDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private int id;
	private String d_name;
	
	public DepartmentDTO() {
		// TODO Auto-generated constructor stub
	}

	public DepartmentDTO(int id, String d_name) {
		super();
		this.id = id;
		this.d_name = d_name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getD_name() {
		return d_name;
	}

	public void setD_name(String d_name) {
		this.d_name = d_name;
	}

	@Override
	public String toString() {
		return "DepartmentDTO [id=" + id + ", d_name=" + d_name + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
}

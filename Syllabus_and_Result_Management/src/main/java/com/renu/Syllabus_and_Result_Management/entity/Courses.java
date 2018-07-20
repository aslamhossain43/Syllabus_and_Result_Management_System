package com.renu.Syllabus_and_Result_Management.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Courses extends CoursesBaseEntity<Long> {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column(name="c_title",nullable=false,unique=true)
	private String c_title;
	@Column(name="c_code",nullable=false,unique=true)
	private String c_code;
	@Column(name="c_credit",nullable=false)
	private String c_credit;
	@Column(name="c_type",nullable=false)
	private String c_type;
	@Column(name="f_name",nullable=false)
	private String f_name;
	@Column(name="d_name",nullable=false)
	private String d_name;
	@Column(name="level",nullable=false)
	private String level;
	@Column(name="semester",nullable=false)
	private String semester;
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="f_id",unique=true,nullable=false,referencedColumnName="id")
	private Faculty faculty;
	@OneToMany(mappedBy="courses",cascade=CascadeType.ALL)	
	private List<Results> results=new ArrayList<>();
	@Override
	public Long getId() {
		
		return id;
	}
	
	public Courses() {
		
	}

	public Courses(Long id, String c_title, String c_code, String c_credit, String c_type, String f_name, String d_name,
			String level, String semester, Faculty faculty, List<Results> results) {
		super();
		this.id = id;
		this.c_title = c_title;
		this.c_code = c_code;
		this.c_credit = c_credit;
		this.c_type = c_type;
		this.f_name = f_name;
		this.d_name = d_name;
		this.level = level;
		this.semester = semester;
		this.faculty = faculty;
		this.results = results;
	}

	public String getC_title() {
		return c_title;
	}

	public void setC_title(String c_title) {
		this.c_title = c_title;
	}

	public String getC_code() {
		return c_code;
	}

	public void setC_code(String c_code) {
		this.c_code = c_code;
	}

	public String getC_credit() {
		return c_credit;
	}

	public void setC_credit(String c_credit) {
		this.c_credit = c_credit;
	}

	public String getC_type() {
		return c_type;
	}

	public void setC_type(String c_type) {
		this.c_type = c_type;
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

	public Faculty getFaculty() {
		return faculty;
	}

	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}

	public List<Results> getResults() {
		return results;
	}

	public void setResults(List<Results> results) {
		this.results = results;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Courses [id=" + id + ", c_title=" + c_title + ", c_code=" + c_code + ", c_credit=" + c_credit
				+ ", c_type=" + c_type + ", f_name=" + f_name + ", d_name=" + d_name + ", level=" + level
				+ ", semester=" + semester + "]";
	}

	
	
	
	
	
}

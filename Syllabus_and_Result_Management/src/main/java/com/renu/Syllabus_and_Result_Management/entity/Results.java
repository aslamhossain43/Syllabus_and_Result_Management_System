package com.renu.Syllabus_and_Result_Management.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Results extends ResultsBasicEntity<Long> {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	@Column(name="sid",nullable=false,unique=true)
	private String sid;
	@Column(name="sname",nullable=false)
	private String sname;
	@Column(name="session",nullable=false)
	private String session;
	
	@Column(name="course1")
	private String course1;
	@Column(name="course2")
	private String course2;
	@Column(name="course3")
	private String course3;
	@Column(name="course4")
	private String course4;
	@Column(name="course5")
	private String course5;
	@Column(name="course6")
	private String course6;
	@Column(name="course7")
	private String course7;
	@Column(name="course8")
	private String course8;
	@Column(name="course9")
	private String course9;
	@Column(name="course10")
	private String course10;
	@Column(name="course11")
	private String course11;
	@Column(name="course12")
	private String course12;
	@Column(name="course13")
	private String course13;
	@Column(name="course14")
	private String course14;
	@Column(name="course15")
	private String course15;
	@Column(name="gpa")
	private String gpa;
	
	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return id;
	}
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="c_id",referencedColumnName="id",nullable=false,unique=true)
	private Courses courses;
	
	public Results() {
		// TODO Auto-generated constructor stub
	}

	public Results(long id, String sid, String sName, String course1, String course2, String course3, String course4,
			String course5, String course6, String course7, String course8, String course9, String course10,
			String course11, String course12, String course13, String course14, String course15, String gpa,
			Courses courses) {
		super();
		this.id = id;
		this.sid = sid;
		this.sname = sName;
		this.course1 = course1;
		this.course2 = course2;
		this.course3 = course3;
		this.course4 = course4;
		this.course5 = course5;
		this.course6 = course6;
		this.course7 = course7;
		this.course8 = course8;
		this.course9 = course9;
		this.course10 = course10;
		this.course11 = course11;
		this.course12 = course12;
		this.course13 = course13;
		this.course14 = course14;
		this.course15 = course15;
		this.gpa = gpa;
		this.courses = courses;
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getsName() {
		return sname;
	}

	public void setsName(String sName) {
		this.sname = sName;
	}

	public String getCourse1() {
		return course1;
	}

	public void setCourse1(String course1) {
		this.course1 = course1;
	}

	public String getCourse2() {
		return course2;
	}

	public void setCourse2(String course2) {
		this.course2 = course2;
	}

	public String getCourse3() {
		return course3;
	}

	public void setCourse3(String course3) {
		this.course3 = course3;
	}

	public String getCourse4() {
		return course4;
	}

	public void setCourse4(String course4) {
		this.course4 = course4;
	}

	public String getCourse5() {
		return course5;
	}

	public void setCourse5(String course5) {
		this.course5 = course5;
	}

	public String getCourse6() {
		return course6;
	}

	public void setCourse6(String course6) {
		this.course6 = course6;
	}

	public String getCourse7() {
		return course7;
	}

	public void setCourse7(String course7) {
		this.course7 = course7;
	}

	public String getCourse8() {
		return course8;
	}

	public void setCourse8(String course8) {
		this.course8 = course8;
	}

	public String getCourse9() {
		return course9;
	}

	public void setCourse9(String course9) {
		this.course9 = course9;
	}

	public String getCourse10() {
		return course10;
	}

	public void setCourse10(String course10) {
		this.course10 = course10;
	}

	public String getCourse11() {
		return course11;
	}

	public void setCourse11(String course11) {
		this.course11 = course11;
	}

	public String getCourse12() {
		return course12;
	}

	public void setCourse12(String course12) {
		this.course12 = course12;
	}

	public String getCourse13() {
		return course13;
	}

	public void setCourse13(String course13) {
		this.course13 = course13;
	}

	public String getCourse14() {
		return course14;
	}

	public void setCourse14(String course14) {
		this.course14 = course14;
	}

	public String getCourse15() {
		return course15;
	}

	public void setCourse15(String course15) {
		this.course15 = course15;
	}

	public String getGpa() {
		return gpa;
	}

	public void setGpa(String gpa) {
		this.gpa = gpa;
	}

	public Courses getCourses() {
		return courses;
	}

	public void setCourses(Courses courses) {
		this.courses = courses;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Results [id=" + id + ", sid=" + sid + ", sName=" + sname + ", course1=" + course1 + ", course2="
				+ course2 + ", course3=" + course3 + ", course4=" + course4 + ", course5=" + course5 + ", course6="
				+ course6 + ", course7=" + course7 + ", course8=" + course8 + ", course9=" + course9 + ", course10="
				+ course10 + ", course11=" + course11 + ", course12=" + course12 + ", course13=" + course13
				+ ", course14=" + course14 + ", course15=" + course15 + ", gpa=" + gpa + ", courses=" + courses + "]";
	}

	
	
	
}

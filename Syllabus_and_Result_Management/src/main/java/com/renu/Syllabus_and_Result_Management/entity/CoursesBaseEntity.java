package com.renu.Syllabus_and_Result_Management.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Version;



@MappedSuperclass
public abstract class CoursesBaseEntity<ID> {

	@Version
	private long version;
	@Column(name="created_date",nullable=false)
	private Date createdDate;
	@Column(name="last_modified_date",nullable=false)
	private Date lastMdifiedDate;
	public abstract ID getId();
	public long getVersion() {
		return version;
	}
	public void setVersion(long version) {
		this.version = version;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getLastMdifiedDate() {
		return lastMdifiedDate;
	}
	public void setLastMdifiedDate(Date lastMdifiedDate) {
		this.lastMdifiedDate = lastMdifiedDate;
	}
	
	
	@PrePersist
	public void prepersist() {
		this.createdDate=new Date();
		this.lastMdifiedDate=new Date();
	}
	
	@PreUpdate
	public void preUpdate() {
		this.lastMdifiedDate=new Date();
		
	}
	
	
}

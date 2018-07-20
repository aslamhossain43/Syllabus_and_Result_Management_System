package com.renu.Syllabus_and_Result_Management.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

@MappedSuperclass
public abstract class FBase<ID> {
     @Column(name="created_date",nullable=false)
	private Date createdDate;
  @Column(name="last_modified_date",nullable=false)
  private Date lastModifiedDate;
  public abstract ID getId();
public Date getCreatedDate() {
	return createdDate;
}
public void setCreatedDate(Date createdDate) {
	this.createdDate = createdDate;
}
public Date getLastModifiedDate() {
	return lastModifiedDate;
}
public void setLastModifiedDate(Date lastModifiedDate) {
	this.lastModifiedDate = lastModifiedDate;
}
  
	
	@PrePersist
	public void prepersist() {
		this.createdDate=new Date();
		this.lastModifiedDate=new Date();
	}
  @PreUpdate
  public void preUpdate() {
	  this.lastModifiedDate=new Date();
  }
  
  
  
  
  
	
}

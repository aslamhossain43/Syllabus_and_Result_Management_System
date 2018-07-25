package com.renu.Syllabus_and_Result_Management.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.renu.Syllabus_and_Result_Management.entity.Courses;

public interface CoursesRepository extends CrudRepository<Courses, Long>{
	String qString="SELECT c_code FROM Courses";
	@Query(value=qString,nativeQuery=true)	
	public List<Object[]>findByC_code();
}

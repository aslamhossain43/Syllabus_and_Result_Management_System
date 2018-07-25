package com.renu.Syllabus_and_Result_Management.test;

import javax.persistence.Id;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.renu.Syllabus_and_Result_Management.SyllabusAndResultManagementApplication;
import com.renu.Syllabus_and_Result_Management.entity.Courses;
import com.renu.Syllabus_and_Result_Management.entity.Faculty;
import com.renu.Syllabus_and_Result_Management.repository.CoursesRepository;
import com.renu.Syllabus_and_Result_Management.repository.FacultyRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=SyllabusAndResultManagementApplication.class)
@WebAppConfiguration
public class FacultyTest {

	
	@Autowired
	private FacultyRepository facultyRepository;
	@Autowired
	private CoursesRepository coursesRepository;;
	
	
	@Test
	public void test() {
		
		Faculty faculty1=new Faculty("cse", "ece", "l-1","s-1" , "22");
		Courses courses=new Courses("eee", "eee233","3","sessional", "cse", "ece", "l-1", "s-1");
		faculty1.setCourses(courses);
		courses.setFaculty(faculty1);
		facultyRepository.save(faculty1);
		
		
		//retrieve
		//Faculty faculty2=facultyRepository.deleteById();
		
		
		//System.out.println(faculty2);

		System.out.println(facultyRepository.findAll());
		
		
	}
	
	
	
	
}

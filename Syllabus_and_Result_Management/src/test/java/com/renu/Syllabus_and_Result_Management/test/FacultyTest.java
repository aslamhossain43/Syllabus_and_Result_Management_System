package com.renu.Syllabus_and_Result_Management.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.renu.Syllabus_and_Result_Management.SyllabusAndResultManagementApplication;
import com.renu.Syllabus_and_Result_Management.entity.Faculty;
import com.renu.Syllabus_and_Result_Management.repository.FacultyRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=SyllabusAndResultManagementApplication.class)
@WebAppConfiguration
public class FacultyTest {

	
	@Autowired
	private FacultyRepository facultyRepository;
	
	
	@Test
	public void test() {
		Faculty faculty=new Faculty();
		facultyRepository.save(faculty);
		System.out.println(facultyRepository.findAll());
		
		
	}
	
	
	
	
}

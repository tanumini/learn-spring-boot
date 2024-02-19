package com.practice.springboot.learnspringboot;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

	@RequestMapping("/courses")
	public List<Course> retriveAllCourses()
	{
		return Arrays.asList(
				new Course(1,"Learn AWS", "Tanaz"),
				new Course(2,"Learn Devops","Mehnaz"),
				new Course(3,"Learn Python","Swarna")
				);
	}
}

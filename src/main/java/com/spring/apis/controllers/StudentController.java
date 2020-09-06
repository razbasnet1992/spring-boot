package com.spring.apis.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.apis.beans.Student;
import com.spring.apis.beans.StudentRegistration;

@Controller
//@RestController
public class StudentController {

	@RequestMapping(method = RequestMethod.GET, value = "/student/allstudent")

	@ResponseBody
	public List<Student> getAllStudents() {
		return StudentRegistration.getInstance().getStudentRecords();

	}

}

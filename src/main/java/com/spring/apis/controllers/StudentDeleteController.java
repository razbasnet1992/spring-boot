package com.spring.apis.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.spring.apis.beans.StudentRegistration;

@Controller
public class StudentDeleteController {

	@RequestMapping(method = RequestMethod.DELETE,value = "/delete/student/{redgNum}")
	
	@ResponseBody
	public String deleteStudentRecord(@PathVariable ("redgNum") String redgNum) {
		System.out.println("In deleteStudentRecord");
		return StudentRegistration.getInstance().deleteStudent(redgNum);
		
	}
	
}

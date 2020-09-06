package com.spring.apis.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.apis.beans.*;

@Controller
@Component
public class RegistrationController {



	@RequestMapping(method = RequestMethod.POST, value = "/register/student" )
	@ResponseBody
		public StudentRegistrationReply registerStudent(@RequestBody Student student) {
		System.out.println("In registerStudent");
	StudentRegistrationReply stdregreply = new StudentRegistrationReply();
		StudentRegistration.getInstance().add(student);
		stdregreply.setName(student.getName());
		stdregreply.setAge(student.getAge());
		stdregreply.setRegistrationNum(student.getRegistrationNum());
		stdregreply.setRegistrationStatus("Successful");
		
		return stdregreply;
		
	}

}

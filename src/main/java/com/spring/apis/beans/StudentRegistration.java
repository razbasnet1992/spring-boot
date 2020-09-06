package com.spring.apis.beans;

import java.util.ArrayList;
import java.util.List;

public class StudentRegistration {
	
	private List<Student> studentRecords;
	
	private static StudentRegistration stdregd = null;
	
	private StudentRegistration() {
		studentRecords = new ArrayList<Student>();
	
		
	}
	public static StudentRegistration getInstance() {
		
		if(stdregd == null) {
			stdregd = new StudentRegistration();
			return stdregd;
		}
		else {
			return stdregd;
		}
	}

	public void add(Student std) {
		studentRecords.add(std);
		
	}
	public String upDateStudent(Student std) {
		
		for(int i = 0;i<studentRecords.size();i++) {
			Student stdn = studentRecords.get(i);
			if(stdn.getRegistrationNum().equals(std.getRegistrationNum())) {
				studentRecords.set(i,std);
				return "Successfully updated";
				
			}
			
		}
		return "Update is Unsuccessful";
	}
	
	public String deleteStudent(String registrationNum) {
		
		for(int i = 0;i<studentRecords.size();i++) {
			
			Student stdn = studentRecords.get(i);
			if(stdn.getRegistrationNum().equals(registrationNum)) {
				studentRecords.remove(i);
				return "Delete successful";
				
			}
		}
		
		return "Delete unsuccessfull";
	}
	public List<Student> getStudentRecords(){
		return studentRecords;
	}
}


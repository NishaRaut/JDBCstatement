package com.bridgelabz.jdbc.controler;

import com.bridgelabz.jdbc.model.Student;
import com.bridgelabz.jdbc.model.StudentDAO;
import com.bridgelabz.jdbc.service.StudentImpl;


public class StudentMain {
	public static void main(String[] args)
	{
		StudentDAO studentDAO = new StudentImpl();
		Student student=getStudent();
		studentDAO.createStudent(student);
		
		
	}
	private static Student getStudent()
	{
		Student student=new Student();
		student.setRollno(112);
		student.setName("Nisha");
		student.setAddress("pune");
		student.setStream("CSE");
		return student;
	}

}

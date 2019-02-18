package com.bridgelabz.jdbc.model;


import java.util.List;

import com.bridgelabz.jdbc.model.Student;
public interface StudentDAO {
	
	public abstract void createStudent(Student student);
	public abstract Student  getStudentByRollno(int rollno);
    public abstract void updateStudentAddressById(String newAddress, int rollno);
    public abstract void deleteRollNo(int rollno);
    public abstract List<Student>getAllStudentInfo();
	
}


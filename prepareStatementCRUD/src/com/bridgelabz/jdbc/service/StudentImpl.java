package com.bridgelabz.jdbc.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.bridgelabz.jdbc.model.Student;
import com.bridgelabz.jdbc.model.StudentDAO;
import com.bridgelabz.jdbc.repository.databaseOperation;

public  class StudentImpl implements StudentDAO{

   @Override
	public void createStudent(Student student)
	{ String sql="insert into student(rollno,name,address,stream)values(?,?,?,?)";
		try(Connection connection=databaseOperation.getConnection();PreparedStatement ps=connection.prepareStatement(sql);)
		{
			ps.setInt(1,student.getRollno());
			ps.setString(2,student.getName());
			ps.setString(3,student.getAddress());
			ps.setString(4,student.getStream());
			int executeUpdate = ps.executeUpdate();
			if(executeUpdate==1)
			{
				System.out.println("Student is created");
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
	}
   @Override
   public Student getStudentByRollno(int rollno) {
   	// TODO Auto-generated method stub
   	return null;
   }
   public void updateStudentAddressById(String newAddress, int rollno)
   {
	   
   }
   public void deleteRollNo(int rollno)
   {
	   
   }

@Override
public List<Student> getAllStudentInfo() {
	// TODO Auto-generated method stub
	return null;
}
}

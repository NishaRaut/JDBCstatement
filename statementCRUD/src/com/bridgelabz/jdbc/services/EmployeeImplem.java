package com.bridgelabz.jdbc.services;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.bridgelabz.jdbc.model.Employee;
import com.bridgelabz.jdbc.repository.DatabaseOperations;


public class EmployeeImplem {
	
	public void createEmployee(Employee emp)
	{
	
		try(Connection connection=DatabaseOperations.getConnection();Statement st=connection.createStatement();) {
			String sqlInsert="insert into Employee1(emp_id,emp_name,emp_address,emp_technology)"+"values('"+emp.getEmpId()+"','"+emp.getEmpName()+"','"+emp.getEmpAddress()+"','"+emp.getEmpTechnology()+"')";
			int exicuteUpdate = st.executeUpdate(sqlInsert);
			String sqlUpdate="update Employee1 set emp_name='mayur' where emp_address='pune'";
			   exicuteUpdate = st.executeUpdate(sqlUpdate);
			   String sqlDelete="delete from Employee1 where emp_address='tufy'";
			   exicuteUpdate = st.executeUpdate(sqlDelete);
		String readData="select * from Employee1";
		ResultSet rs= st.executeQuery(readData);
		while(rs.next())
		{
	         int id=rs.getInt("emp_id");
	         String name=rs.getString("emp_name");
	         String address=rs.getString("emp_address");
	         String technology=rs.getString("emp_technology");
	         System.out.println(id+"\t"+name+"\t"+address+"\t"+technology);
		}
	         if(exicuteUpdate == 1)
			{
				System.out.println("Employee is created.........");
			}
		}catch(Exception e)
		{
			e.printStackTrace(); 
		}
	}

}

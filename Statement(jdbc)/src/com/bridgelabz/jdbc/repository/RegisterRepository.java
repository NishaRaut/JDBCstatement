package com.bridgelabz.jdbc.repository;
import java.sql.Connection;


import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import com.bridgelabz.jdbc.model.User;

public class RegisterRepository {
	/*************************************************************
	 * Register repository to perform action of registration to communicate to database
	 * @author NISHA
	 * Version  - 1.0
	 * Since    - 13/02/2019
	
	 ***********************************************************/
		public void save(User user) throws ClassNotFoundException, SQLException
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			// establishing Connection
			Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/JDBC","root","nisha@123");  
			//Creating statement
			Statement stmt=con.createStatement();  
			//statement to execute in String
			String sql="insert into Statement_table(userId,userName,userEmail,passWord) values ('"+user.getUserId()+"','"+user.getUserName()+"','"+user.getUserEmail()+"','"+user.getPassWord()+"')";
			//executing the statement
			stmt.executeUpdate(sql);
			//closing statement
			stmt.close();
			//releasing the connection
			con.close();
	     }
	}

	

	
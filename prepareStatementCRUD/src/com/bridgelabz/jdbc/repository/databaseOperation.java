package com.bridgelabz.jdbc.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class databaseOperation {
	private static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "nisha@123";
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/JDBC";
	private static Connection connection = null;
	static
	{
	  try
	  {
		  Class.forName(DB_DRIVER);
		  connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		  System.out.println(connection);
	  }catch(ClassNotFoundException | SQLException s) {
		  s.printStackTrace();
	  }
	}
	
	public static Connection getConnection() {
		return connection;
	}
}

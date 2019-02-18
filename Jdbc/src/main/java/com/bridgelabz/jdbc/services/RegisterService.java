package com.bridgelabz.jdbc.services;

import java.sql.SQLException;
import java.util.Scanner;

import com.bridgelabz.jdbc.model.User;
import com.bridgelabz.jdbc.repository.RegisterRepository;

public class RegisterService {
	private User user;
	RegisterRepository regRepository;
	Scanner sc=new Scanner(System.in);
	public RegisterService(User user) {
			regRepository=new RegisterRepository();
		this.user = user;
	}
		/*
		 * To accept user inputs 
		 */
			public void userInputs() throws ClassNotFoundException, SQLException {
				System.out.println("Enter the id :");
				user.setUserId(sc.nextInt());
				System.out.println(" Enter user name :");
		        user.setUserName(sc.next());
		        System.out.println("Enter the EmailId :");
		        user.setUserName(sc.next());
		        System.out.println("Enter the password:");
		        user.setUserName(sc.next());
		      //checking for null data
			//	if(user.getUserId()==0||user.getUserName()==null||user.getUserEmail()==null||user.getPassWord()==null) {
				//	System.out.println("Not Updated to database");
				//}else {
					//passing control to repository
				regRepository.save(user);
		//}
}
	
}

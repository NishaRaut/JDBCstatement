package com.bridgelabz.jdbc.services;

import java.sql.SQLException;
import java.util.Scanner;

import com.bridgelabz.jdbc.model.User;
import com.bridgelabz.jdbc.repository.RegisterRepository;

public class RegisterService {
	private User user;
	RegisterRepository regRepository;
	Scanner sc = new Scanner(System.in);
	Scanner sc1 = new Scanner(System.in);
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
		        user.setUserName(sc1.nextLine());
		        System.out.println("Enter the EmailId :");
		        user.setUserEmail(sc1.nextLine());
		        System.out.println("Enter the password:");
		        user.setPassword(sc1.nextLine());
		      //checking for null data
				regRepository.save(user);
}
	
}

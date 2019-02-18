package com.bridgelabz.jdbc.service;


import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.bridgelabz.jdbc.model.LoginUser;
import com.bridgelabz.jdbc.model.RegisterUser;
import com.bridgelabz.jdbc.repository.RegisterRepository;

public class RegisterImplService {
	private RegisterUser regUser;
	private RegisterRepository regRepository;
	Scanner sc=new Scanner(System.in);
	
	public RegisterImplService(RegisterUser user) {
		regRepository=new RegisterRepository();
		this.regUser=user;
	}
	/*
	 * To perform registration (non-Javadoc)
	 * @see com.labz.jdbc.service.RegisterServiceInterface#registerInputs()
	 */

	//@Override
	public void registerInputs() throws SQLException {
		System.out.println("***************Register****************");
		System.out.println(" Enter user name ");
		regUser.setUserName(sc.nextLine());
		System.out.println("Enter E-Mail ");
		regUser.setUserEmail(sc.nextLine());
		System.out.println("Enter Password");
		regUser.setPassword(sc.nextLine());
		saveToRepository();
	}
	public void saveToRepository() throws SQLException {
		if(regUser.getUserName()==null||regUser.getUserEmail()==null||regUser.getPassword()==null) {
			System.out.println("Not Updated to database");
		}else {
			//passing control  to repository
			regRepository.save(regUser);
			System.out.println("Successfully Registered");
		}
	}
	/*
	 * To perform login for user inputs
	 * @param User model
	 */
	public void loginInputs(LoginUser logUser) throws SQLException {
		Boolean check=false;
		System.out.println("*******************Login***********************");
		System.out.println("Enter E-Mail ");
		logUser.setUserEmail(sc.nextLine());
		System.out.println("Enter Password");
		logUser.setPassword(sc.nextLine());
		if(logUser.getUserEmail()==null||logUser.getPassword()==null) {
			System.out.println("Invalid login inputs");
		}else {
			//passing control to repository
			List listUser=regRepository.loginCheck(logUser);
			System.out.println(listUser);
		}
	
}
}

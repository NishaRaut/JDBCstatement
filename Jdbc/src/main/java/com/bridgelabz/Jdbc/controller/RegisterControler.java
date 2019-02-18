package com.bridgelabz.Jdbc.controller;

import com.bridgelabz.jdbc.model.User;
import com.bridgelabz.jdbc.services.RegisterService;

public class RegisterControler {
	static User user;
	static RegisterService registerService;
	
	public static void main(String[] args) {
		try {
			System.out.println("Welcome ");
			System.out.println();
//passing control to service
			registerService.userInputs();
		}catch (Exception e) {
			e.printStackTrace();
			
}
}
	static {
		user=new User();
		registerService=new RegisterService(user);
	}
}

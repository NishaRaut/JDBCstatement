 package com.bridgelabz.jdbc.controler;

import java.util.Scanner;


import com.bridgelabz.jdbc.model.LoginUser;
import com.bridgelabz.jdbc.model.RegisterUser;
import com.bridgelabz.jdbc.service.RegisterImplService;

public class RegisterLoginControler {
	
	static RegisterImplService regService;
	static {
		RegisterUser user = new RegisterUser();
		regService = new RegisterImplService(user);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Welcome ");
			System.out.println();
			System.out.println("PRESS 1 for Resistration: ");
			System.out.println("PRESS 2 for Login:");
			System.out.println("PRESS 3 for Exit:");
			int choice = sc.nextInt();
			outer: while (choice < 3) {
				switch (choice) {
				case 1:
					// passing control to servicec to register
					regService.registerInputs();
					break;
				case 2:
					LoginUser logUser = new LoginUser();
					// passing control to service to login
					regService.loginInputs(logUser);
					
					break;
				case 3:break outer;
				default:
					System.out.println("Exiting");
					break;
				}
				System.out.println("PRESS 1 for Registration");
				System.out.println("PRESS 2 for Login");
				choice = sc.nextInt();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
}
}

package com.bridgelabz.jdbc.model;


public class RegisterUser {

	private String userName;
	private String userEmail;
	private String password;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		if (userName != null && userName.length() < 20) {
			this.userName = userName;
		} else {
			System.out.println("User name can't be empty ");
		}
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		if (userEmail != null) {
			if (userEmail.contains("@")) {
				this.userEmail = userEmail;
			}
		} else {
			System.out.println("Invalid Email!!!!!!!!!");
		}
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		if (password != null && password.length() >= 6) {
			this.password = password;
		} else {
			System.out.println("Invalid Password!!!!!!!!!!!!!!");
		}
	}

}

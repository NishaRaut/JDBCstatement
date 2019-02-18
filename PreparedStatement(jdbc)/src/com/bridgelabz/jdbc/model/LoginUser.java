package com.bridgelabz.jdbc.model;

public class LoginUser {
	private String userEmail;
	private String password;

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		if (userEmail != null) {
			if (userEmail.contains("@")) {
				this.userEmail = userEmail;
			}
		} else {
			System.out.println("Invalid Email!!!!!!!!!!");
		}
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		if (password != null && password.length() >= 6) {
			this.password = password;
		} else {
			System.out.println("Invalid Password!!!!!!!!!!!");
		}
	}
}

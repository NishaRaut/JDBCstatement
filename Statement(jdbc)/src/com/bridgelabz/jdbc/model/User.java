package com.bridgelabz.jdbc.model;
/**
 * user model-pojo
 * version 1.0
 * @author nisha
 *since-13/02/2019
 */
public class User {
	private int userId;
	private String userName;
	private String userEmail;
    private String passWord;
    

public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getUserEmail() {
	return userEmail;
}
public void setUserEmail(String userEmail) {
	this.userEmail = userEmail;
}
public String getPassWord() {
	return passWord;
}
public void setPassword(String password) {
	this.passWord = password;
}
}

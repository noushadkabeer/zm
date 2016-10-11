package com.mintapple.Entity;

import javax.persistence.Id;

public class User {

	@Id
	private String userId;
	private String userName;
	private String userType;
	private String userPassword;
	private String userDescription;
	private String userStatus;
	public User(String userId, String userName, String userType, String userPassword, String userDescription,
			String userStatus) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userType = userType;
		this.userPassword = userPassword;
		this.userDescription = userDescription;
		this.userStatus = userStatus;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserDescription() {
		return userDescription;
	}
	public void setUserDescription(String userDescription) {
		this.userDescription = userDescription;
	}
	public String getUserStatus() {
		return userStatus;
	}
	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userType=" + userType + ", userPassword="
				+ userPassword + ", userDescription=" + userDescription + ", userStatus=" + userStatus + "]";
	}

	
}

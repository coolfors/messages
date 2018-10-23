package com.messages.entity;

/**
 * @author coolfors
 * @date 2018年10月23日 上午10:16:55
 * @description:
 *
 */
public class User {
	private int userId;
	private String  userName;
	private String  userPwd;
	
	
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


	public String getUserPwd() {
		return userPwd;
	}


	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}


	@Override
	public String toString() {
		return "userentity [userId=" + userId + ", userName=" + userName + ", userPwd=" + userPwd + "]";
	}


	public User(int userId, String userName, String userPwd) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPwd = userPwd;
	}


	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}

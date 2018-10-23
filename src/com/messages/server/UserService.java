package com.messages.server;

import java.util.List;

import com.messages.entity.User;


/**
 * 自定义的UserService接口
 * 
 * @author Administrator
 *
 */
public interface UserService {
	List<User> getUser();

	boolean addUser(User user);// 增加用户

	User loginUser(String userName, String userPwd);// 用户登录
	
} 


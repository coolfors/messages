package com.messages.dao;

import java.util.List;

import com.messages.entity.User;


/**
 * 自定义的userdao接口
 * 
 * @author Administrator
 *
 */
public interface UserDao {
	List<User> queryUser();

	boolean addUser(User user);// 增加用户

	User loginUser(String userName, String userPwd);// 用户登录

	User getUserById(String userId);//根据用户id获取用户
	
}

package com.messages.serverImpl;

import java.util.List;

import com.messages.DaoImpl.UserDaoImpl;
import com.messages.dao.UserDao;
import com.messages.entity.User;
import com.messages.server.UserService;


/**
 * 实现UserService接口的类
 * 
 * @author Administrator
 *
 */
public class UserServiceImpl implements UserService {
	// 创建对象
	UserDao ud = new UserDaoImpl();

	// 增加用户
	@Override
	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		return ud.addUser(user);
	}

	// 用户登录
	@Override
	public User loginUser(String userName, String userPwd) {
		// TODO Auto-generated method stub
		return ud.loginUser(userName, userPwd);
	}
	//前台显示用户信息
	@Override
	public List<User> getUser() {
		// TODO Auto-generated method stub
		return ud.queryUser();
	}

}

package com.messages.DaoImpl;

import java.util.Iterator;
import java.util.List;

import com.messages.dao.UserDao;
import com.messages.entity.User;
import com.messages.util.BaseDao;


/**
 * UserDao的实现类
 * 
 * @author Administrator
 *
 */
public class UserDaoImpl implements UserDao {

	// 增加用户
	// 修改增加用户语句：原型：insert into user(userName,userPwd,sockState,userType,userdate)
	// values(?,?,?,?,?)
	@Override
	public boolean addUser(User u) {
		// TODO Auto-generated method stub
		Object obj = BaseDao.select("select * from user where userName=?", User.class, u.getUserName());
		if (obj != null) {
			return false;
		} else {
			String sql = "insert into user(userName,userPwd) values(?,?)";
			return BaseDao.execute(sql, u.getUserName(), u.getUserPwd() ) > 0;
		}

	}


	// 用户登录
	@Override
	public User loginUser(String userName, String userPwd) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM user where username = ? and userpwd= ?";

		@SuppressWarnings("unchecked")
		List<User> list = (List<User>) BaseDao.select(sql, User.class, userName, userPwd);
		Iterator<User> it = list.iterator();
		User u = null;
		if (it.hasNext()) {
			u = it.next();
		}
		return u;

	}


	@Override
	public List<User> queryUser() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public User getUserById(String userId) {
		// TODO Auto-generated method stub
		return null;
	}


}

package com.aaa.dao.impl; 

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.aaa.dao.UserDao;
import com.aaa.domain.User;
import com.sk.jdbc.MyQueryRunner;

/** 
 * @author liujia  
 * @version 创建时间：2017-8-21 下午3:31:15 
 * 类说明 
 */
public class UserDaoImpl implements UserDao {

	private QueryRunner qr = new MyQueryRunner();
	@Override
	public User login(User user) {
		
		//1.写sql,有参数的话，就参数
		String sql = "select * from user where username=? and pass=?";
		
		//2.执行sql
		User u = null;
		Object[] params = {user.getUsername(), user.getPass()};
		try {
			u = qr.query(sql, params, new BeanHandler<User>(User.class));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return u;
	}

}
 
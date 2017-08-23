package com.aaa.service.impl; 

import com.aaa.dao.UserDao;
import com.aaa.dao.impl.UserDaoImpl;
import com.aaa.domain.User;
import com.aaa.service.UserService;

/** 
 * @author liujia  
 * @version 创建时间：2017-8-21 下午3:23:13 
 * 类说明 
 */
public class UserServiceImpl implements UserService {
	
	private UserDao userDao = new UserDaoImpl();
	
	@Override
	public boolean login(User user) {
		
		User u = userDao.login(user);
		//如果u不为空，说明数据库中有该用户
		if(null != u){
			return true;
		}
		
		return false;
	}

}
 
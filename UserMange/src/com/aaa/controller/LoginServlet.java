package com.aaa.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aaa.domain.User;
import com.aaa.service.UserService;
import com.aaa.service.impl.UserServiceImpl;
import com.sk.utils.CommonUtils;

/**
 * @author liujia
 * @version 创建时间：2017-8-21 下午3:10:23 类说明
 */
public class LoginServlet extends HttpServlet {
	private UserService userService = new UserServiceImpl();
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 1.获取页面的数据
//		 String username = request.getParameter("username");
//		 String pass = request.getParameter("pass");

		// 2.将页面中的数据封装成一个uesr对象
//		 User u = new User();
//		 u.setUsername(username);
//		 u.setPass(pass);

		User u = CommonUtils.toBean(request.getParameterMap(), User.class);

		// 3.调用service
		 boolean flag = userService.login(u);
		 
		// 4.根据sevice返回的结果，存取到request域中
		 if(!flag){
			 //如果用户名或者密码不正确
			 request.setAttribute("message", "您输入的用户名或者密码不正确");
			 request.getRequestDispatcher("/fail.jsp").forward(request, response);
			 return;
		 }
		// 5.如果成功，转发到首页面，返回转发到失败页面
		 request.setAttribute("message", "欢迎" + u.getUsername() + "登录");
		 request.getRequestDispatcher("/success.jsp").forward(request, response);
		 
	}

}

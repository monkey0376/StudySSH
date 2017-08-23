package com.zhongheng.action; 

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.zhongheng.entry.User;

/** 
 * @author liujia  
 * @version 创建时间：2017-8-22 下午5:12:00 
 * 类说明 
 */
public class UserAction extends ActionSupport{
	
	public String show(){
		User user = new User();
		user.setId(1);
		user.setName("zs");
		user.setAge(18);
		ActionContext.getContext().put("user", user);
		
		//获取值栈对象
		//ValueStack valueStack = ActionContext.getContext().getValueStack();
		
		//将user对象放入到对象栈的栈顶
		//valueStack.push(user);
		
		return "success";
	}
	
	
	public String list(){
		List<User> list = new ArrayList<User>();
		User user = new User();
		user.setId(1);
		user.setName("zs");
		user.setAge(18);
		list.add(user);
		
		
		User user1 = new User();
		user1.setId(2);
		user1.setName("lisi");
		user1.setAge(28);
		list.add(user1);
		//存到map栈
		//ActionContext.getContext().put("list", list);
		ActionContext.getContext().getValueStack().push(list);
		
		return "success";
	}
}
 
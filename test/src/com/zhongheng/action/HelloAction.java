package com.zhongheng.action; 

import com.opensymphony.xwork2.ActionContext;


/** 
 * @author liujia  
 * @version 创建时间：2017-8-22 下午3:58:15 
 * 类说明 
 */
public class HelloAction {
	private String msg = "xxxxx";
	public String say(){
		ActionContext context = ActionContext.getContext();
		//往struts的map栈里存数据
		context.put("msg", "今天很开心");
		return "success";
	}
	
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}





 
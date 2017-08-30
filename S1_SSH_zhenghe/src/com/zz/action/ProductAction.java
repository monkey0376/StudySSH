package com.zz.action;
/*
 * 管理类的Action类
 */

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.zz.domain.Product;
import com.zz.service.ProductService;

public class ProductAction extends ActionSupport implements ModelDriven<Product>{

	//模型驱动使用个的类
	private Product product = new Product();
	@Override
	public Product getModel() {
		// TODO Auto-generated method stub
		return product;
	}
	
	//Struts和Spring整合过程中按名称自动注入的业务层
	private ProductService productService;

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	/*
	 * 保存商品的执行的方法：save
	 */
	public String save(){
		System.out.println("Action中的方法执行了....");
		productService.save(product);
		return NONE;
	}
	
	
}

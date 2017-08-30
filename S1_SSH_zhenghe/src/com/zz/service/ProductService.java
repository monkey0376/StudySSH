package com.zz.service;

import com.zz.dao.ProductDao;
import com.zz.domain.Product;

/*
 * 商品管理类的业务层类
 */
public class ProductService {

	private ProductDao productDao;

	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}

	
	/**
	 * 业务层保存商品的方法
	 * @param product
	 */
	public void save(Product product) {
		System.out.println("Service中的save方法执行了...");
		productDao.save(product);
		
	}
	
}

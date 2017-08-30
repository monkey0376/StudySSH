package com.zz.dao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.zz.domain.Product;

/*
 * 商品管理类的DAO类
 */
public class ProductDao extends HibernateDaoSupport{

	/**
	 * DAO 中的保存商品的方法
	 * @param product
	 */
	public void save(Product product) {
		System.out.println("DAO中的方法执行了..");
		this.getHibernateTemplate().save(product);
	}

}

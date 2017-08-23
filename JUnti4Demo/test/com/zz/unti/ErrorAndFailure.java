package com.zz.unti;

import static org.junit.Assert.*;

import org.junit.Test;

public class ErrorAndFailure {

	//测试用例不是用来证明你是对的，而是证明你没有错。
	/*Failure一般有单元测试使用的断言方法判断失败引起的。
	 *这经表示测试点发现了问题,就是说程序输出的结果和我们预期的不一样。
	 *Error是由代码异常引起的,他可以产生于测试代码本身的错误,
	 *也可以是被测试代码中的一个隐藏的bug。
	 */
	@Test
	public void testAdd(){
		assertEquals(5, new Calculate().add(3, 3));
	}
	
	
	@Test
	public void testDivide(){
		assertEquals(2, new Calculate().divide(10, 0));
	}

}

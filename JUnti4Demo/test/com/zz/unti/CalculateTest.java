package com.zz.unti;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 * 1.测试方法上必须使用@Test修饰
 * 2.测试方法必须使用public void进行修饰不能带任何参数
 * 3.使用一个源代码目录来存放我们的测试代码
 * 4.测试的包应该和测试类保持一致
 * 5测试单元中每个方法必须独立测试，测试的方法不能有任何的依赖
 * 6测试类使用的Test作为类名的后缀（不是必须的）
 * 7测试方法使用test作为方法的前缀（不是必须的）
 *
 */

public class CalculateTest {

	@Test
	public void testAdd(){
		assertEquals(6, new Calculate().add(3, 3));
	}
	
	@Test
	public void testSubtract(){
		assertEquals(3, new Calculate().subtract(5, 2));
	}
	
	@Test
	public void testMultiply(){
		assertEquals(25, new Calculate().multiply(5, 5));
	}
	
	@Test
	public void testDivide(){
		assertEquals(2, new Calculate().divide(10, 5));
	}
}

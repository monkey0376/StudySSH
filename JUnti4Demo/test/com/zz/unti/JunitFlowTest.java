package com.zz.unti;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/*
 * @AfterClass修饰的方法也必须是static void，
 * 由于@BeforeClass和@AfterClass只会在加载测试类，
 * 或者运行结束时才会调用，适合被用来加载文件或清理资源
 * 一个JUnit4的单元测试用例执行顺序为： 
 * @BeforeClass -> @Before -> @Test -> @After -> @AfterClass; 
 */

/*@Before修饰的方法会在所有方法被调用前被执行
而且该方法是静态的   所以当测试被夹在后接着就会运行它
而且在内存中它只会存在一份实例  它比较适合加载配置文件
@AfterClass所修饰的方法通常用来对资源的管理  如关闭数据库的连接
@before和@After会在每个测试方法的前后各执行一次*/
public class JunitFlowTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	
		System.out.println("this is beforeClass...");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("this is afterClass...");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("this is before...");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("this is after ...");
	}
	
	@Test
	public void test1(){
		System.out.println("this is test1...");
	}
	
	@Test
	public void test2(){
		System.out.println("this is test2...");
	}

	
}

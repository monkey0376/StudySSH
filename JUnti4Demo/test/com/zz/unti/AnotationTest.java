package com.zz.unti;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

public class AnotationTest {

	/*@Test:将一个普通的方法修饰成为一个测试方法
	 *   @Test(expected = Xxx.class)
	 *   @Test(timeout= 毫秒)
	 * @BeforeClass：它会在所有的方法运行前被执行，static修饰
	 * @AfterClass：它会在所有的方法运行结束后被执行，static修饰
	 * @Before：会在每一个测试方法被运行前执行一次
	 * @After：会在每一个测试方法运行后被执行一次
	 * @Ignore:所修饰的方法会被测试运行器忽略,@Ignore("忽略的原因...")
	 * @RunWith:可以更改测试运行器org.junit.runner.Runne
	 */
	
	@Test(expected=ArithmeticException.class)
	public void testDivide(){
		assertEquals(2, new Calculate().divide(10, 0));
	}
	
	@Ignore("这个方法不会被执行")
	@Test(timeout = 1000)
	public void While(){
		int i = 0;
		while(true){
			System.out.println("xxxxx"+ i++);
		}
	}
	
	@Test(timeout = 3000)
	public void testReadeFile(){
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

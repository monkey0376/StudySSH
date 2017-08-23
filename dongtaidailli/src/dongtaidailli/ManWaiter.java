package dongtaidailli;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * 
 * @author Admin
 * 实现接口
 */
public class ManWaiter implements Waiter{

	public void service(){
		System.out.println("服务正在进行中...");
	}
}

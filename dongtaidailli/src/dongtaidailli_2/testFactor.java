package dongtaidailli_2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.junit.Test;

public class testFactor {

	@Test
	public void test() {
		
		Waiter waiter =new ManWaiter();
		ClassLoader loader = this.getClass().getClassLoader();
		
		Class[] interfaces = {Waiter.class};
		
		InvocationHandler h = new WaiterInvocationHander(waiter);
		
		Waiter o = (Waiter) Proxy.newProxyInstance(loader, interfaces, h);

		o.service();
	}

	class WaiterInvocationHander implements InvocationHandler {

		private Waiter waiter;

		public WaiterInvocationHander(Waiter waiter) {
		
			this.waiter = waiter;
		}

		@Override
		public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
			System.out.println("提前的输出");
			this.waiter.service();
			System.out.println("之后的给你");
			return null;
		}
		
		
	}
}
package designpattern.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理
 * @author tengfeili
 *
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tank tank = new Tank();
		//reflection: 二进制  类的属性
		
		Movable movable = (Movable) Proxy.newProxyInstance(Tank.class.getClassLoader(), 
				new Class[]{Movable.class}, 
				new LogHandler(tank)
				);
		movable.move();
	}



}

class LogHandler implements InvocationHandler{

	Tank tank;
	
	public LogHandler(Tank tank) {
		this.tank = tank;
	}


	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Method "+method.getName()+" starts.");
		Object object = method.invoke(tank, args);//相当于调用了tank的move方法
		System.out.println("Method "+method.getName()+" end.");
		return object;
	}
	
}

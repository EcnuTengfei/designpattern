package designpattern.staticproxy;


/**
 * 实现代理的组合：静态代理
 * @author tengfeili
 *
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TankLogProxy(new TankTimeProxy(new Tank())).move();
	}


}

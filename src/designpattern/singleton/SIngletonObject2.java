package designpattern.singleton;

public class SIngletonObject2 {

	private static SIngletonObject2 instance;
	static {
		new SIngletonObject2();
	}
	private SIngletonObject2() {}
	
	private static SIngletonObject2 getInstance() {
		return instance;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SIngletonObject2 sObject1 = SIngletonObject2.getInstance();
		SIngletonObject2 sObject2 = SIngletonObject2.getInstance();
		System.out.println(sObject1 == sObject2);
	}

}

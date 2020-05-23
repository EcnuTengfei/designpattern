package designpattern.singleton;

public class SingleObject1 {
	private static SingleObject1 instance = new SingleObject1();
	
	private static SingleObject1 getInstance() {
		return instance;
	}
	
	public static void main(String[] args) {
		SingleObject1 sObject1 = SingleObject1.getInstance();
		SingleObject1 sObject2 = SingleObject1.getInstance();
		System.out.println(sObject1 == sObject2);
	}
}

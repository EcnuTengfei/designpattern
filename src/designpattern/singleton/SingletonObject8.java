package designpattern.singleton;

public enum SingletonObject8 {

	INSTANCE;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 100; i++) {
			new Thread(()->{
				System.out.println(SingletonObject8.INSTANCE.hashCode());
			}).start();
		}
	}
}

package designpattern.singleton;

public class SingletonObject3 {

	private static SingletonObject3 instance;
	
	private SingletonObject3() {}
	
	private static synchronized SingletonObject3 getInstance() {
		if (instance == null) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			instance = new SingletonObject3();
		}
		return instance;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 100; i++) {
			new Thread(()->{
				System.out.println(SingletonObject3.getInstance().hashCode());
			}).start();;
		}
		
	}

}

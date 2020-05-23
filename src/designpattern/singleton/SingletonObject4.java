package designpattern.singleton;

public class SingletonObject4 {

	private static SingletonObject4 instance;
	
	private SingletonObject4() {}
	
	private static synchronized SingletonObject4 getInstance() {
		if(instance == null) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			instance = new SingletonObject4();
		}
		return instance;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 100; i++) {
			new Thread(()->{
				System.out.println(SingletonObject4.getInstance().hashCode());
			}).start();
		}
	}

}

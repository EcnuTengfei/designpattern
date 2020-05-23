package designpattern.singleton;

public class SIngletonObject5 {

private static SIngletonObject5 instance;
	
	private SIngletonObject5() {}
	
	private static synchronized SIngletonObject5 getInstance() {
		if(instance == null) {
			synchronized(SIngletonObject5.class) {
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				instance = new SIngletonObject5();
			}
		}
		return instance;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 100; i++) {
			new Thread(()->{
				System.out.println(SIngletonObject5.getInstance().hashCode());
			}).start();
		}
	}
}

package designpattern.singleton;

public class SIngletonObject6 {

private static SIngletonObject6 instance;
	
	private SIngletonObject6() {}
	
	private static synchronized SIngletonObject6 getInstance() {
		if(instance == null) {
			synchronized(SIngletonObject5.class) {
				if(instance == null) {
					try {
						Thread.sleep(1);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					instance = new SIngletonObject6();
				}
			}
		}
		return instance;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 100; i++) {
			new Thread(()->{
				System.out.println(SIngletonObject6.getInstance().hashCode());
			}).start();
		}
	}

}

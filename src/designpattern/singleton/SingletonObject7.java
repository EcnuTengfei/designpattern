package designpattern.singleton;

public class SingletonObject7 {
	
	
	private static class Singleton7{
		private static final SingletonObject7 instance = new SingletonObject7();
	}
	
	private static SingletonObject7 getInstance(){
		return Singleton7.instance;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 100; i++) {
			new Thread(()->{
				System.out.println(SingletonObject7.getInstance().hashCode());
			}).start();
		}
	}

}

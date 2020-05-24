package designpattern.observer;

public class Dog implements Observer{

	public void wang() {
		System.out.println("Dog wangwang...");
	}
	
	@Override
	public void actionWakeup(WakeUpEvent event) {
		// TODO Auto-generated method stub
		wang();
	}

}

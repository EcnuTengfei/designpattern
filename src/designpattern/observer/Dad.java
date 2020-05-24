package designpattern.observer;

public class Dad implements Observer{
	public void feed() {
		System.out.println("Dad is feeding...");
	}

	@Override
	public void actionWakeup(WakeUpEvent event) {
		// TODO Auto-generated method stub
		feed();
	}

}

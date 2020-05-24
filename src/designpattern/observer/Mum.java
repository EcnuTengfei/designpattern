package designpattern.observer;

public class Mum implements Observer{

	public void hug() {
		System.out.println("Mum huging...");
	}
	
	@Override
	public void actionWakeup(WakeUpEvent event) {
		// TODO Auto-generated method stub
		hug();
	}

}

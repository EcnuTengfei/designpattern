package designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Child {
	//事件源对象传给观察者
	boolean cry = false;
	private List<Observer> observers = new ArrayList<>();
	
	{
		observers.add(new Dad());
		observers.add(new Mum());
		observers.add(new Dog());
	}	
	
	public boolean isCry() {
		return cry;
	}
	
	WakeUpEvent event = new WakeUpEvent(System.currentTimeMillis(), "bed", this);
	
	public void weekUp() {
		cry = true;
		for(Observer observer: observers) {
			observer.actionWakeup(event);
		}
	}
	

}

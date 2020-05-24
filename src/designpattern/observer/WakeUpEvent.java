package designpattern.observer;

public class WakeUpEvent extends Event<Child>{
	long time;
	String location;
	Child source;
	
	public WakeUpEvent(long time, String location, Child source) {
		this.time = time;
		this.location = location;
		this.source = source;
	}

	@Override
	Child getSource() {
		// TODO Auto-generated method stub
		return source;
	}

}

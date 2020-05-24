package designpattern.state;

public class Car {
	String name;
	CarState state;
	
	public void open() {
		state.open();
	}
	
	public void close() {
		state.close();
	}
	
	public void run() {
		state.run();
	}
	
	public void stop() {
		state.stop();
	}

}

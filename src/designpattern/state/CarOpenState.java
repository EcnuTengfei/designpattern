package designpattern.state;

public class CarOpenState extends CarState{

	@Override
	void open() {
		// TODO Auto-generated method stub
		System.out.println("Open state: you can not open");
	}

	@Override
	void close() {
		// TODO Auto-generated method stub
		System.out.println("Open state: you can close");
	}

	@Override
	void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		
	}

}

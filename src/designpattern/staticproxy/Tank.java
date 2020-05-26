package designpattern.staticproxy;

import java.util.Random;

public class Tank implements Movable{

	/**
	 * Record the move time
	 */
	@Override
	public void move() {
		// TODO Auto-generated method stub
		
		System.out.println("Tank moves....");
		
		try {
			Thread.sleep(new Random().nextInt(10000));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

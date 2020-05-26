package designpattern.staticproxy;

public class TankLogProxy implements Movable{

	Movable movable;
	
	
	
	
	public TankLogProxy(Movable movable) {
		this.movable = movable;
	}




	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("log starts...");
		movable.move();
		System.out.println("log end...");
		
	}

}

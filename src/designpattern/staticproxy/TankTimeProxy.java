package designpattern.staticproxy;

public class TankTimeProxy implements Movable{

	Movable movable;

	
	public TankTimeProxy(Movable movable) {
		this.movable = movable;
	}


	@Override
	public void move() {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		movable.move();
		long end = System.currentTimeMillis();
		System.out.println(end - start);
		
	}

}

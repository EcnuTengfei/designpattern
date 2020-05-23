package designpattern.factory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Moveable moveable = new CarFactory().createCar();
		//moveable.go();
	}

}

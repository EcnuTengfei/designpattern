package designpattern.factory;

public class CarFactory {
	public Moveable createCar() {
		System.out.println("A new car is created");
		return new Car();
	}
}

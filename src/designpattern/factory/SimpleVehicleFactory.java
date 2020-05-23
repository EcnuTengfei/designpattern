package designpattern.factory;
/**
 * 可拓展性不好
 * @author tengfeili
 *
 */
public class SimpleVehicleFactory {
	public Car createCar() {
		return new Car();
	}
	
	public Broom createBroom() {
		return new Broom();
	}
	
	public Plane createPlane() {
		return new Plane();
	}
	
}

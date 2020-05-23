package designpattern.abstractfactory;

/**
 * 产品族
 * @author tengfeili
 * Food 为什么用抽象类不用接口。从语义的角度：名词用抽象类，形容词用接口
 *简单工厂：产品纬度拓展；抽象工厂：产品族的拓展
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Car car = new Car();
//		car.go();
//		AK47 ak47 = new AK47();
//		ak47.shoot();
//		Bread bread = new Bread();
//		bread.printName();
		
		AbstractFactory abstractFactory = new MagicFactory();
		Vehicle vehicle = abstractFactory.createVehicle();
		vehicle.go();
		Weapon weapon = abstractFactory.createWeapon();
		weapon.shoot();
		Food food = abstractFactory.createFood();
		food.printName();
	}

}

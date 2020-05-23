package designpattern.abstractfactory;

public class ModernFactory extends AbstractFactory{

	@Override
	Food createFood() {
		// TODO Auto-generated method stub
		return new Bread();
	}

	@Override
	Vehicle createVehicle() {
		// TODO Auto-generated method stub
		return new Car();
	}

	@Override
	Weapon createWeapon() {
		// TODO Auto-generated method stub
		return new AK47();
	}

}

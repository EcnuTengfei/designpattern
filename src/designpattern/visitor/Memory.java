package designpattern.visitor;

public class Memory extends ComputerPart{

	@Override
	void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visitMemory(this);
	}

	@Override
	int getPrice() {
		// TODO Auto-generated method stub
		return 350;
	}

}

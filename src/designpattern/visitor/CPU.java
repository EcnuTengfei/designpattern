package designpattern.visitor;

public class CPU extends ComputerPart{

	@Override
	void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visitCPU(this);
	}

	@Override
	int getPrice() {
		// TODO Auto-generated method stub
		return 500;
	}

}

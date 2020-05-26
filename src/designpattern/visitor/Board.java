package designpattern.visitor;

public class Board extends ComputerPart{

	@Override
	void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visitBoard(this);
	}

	@Override
	int getPrice() {
		// TODO Auto-generated method stub
		return 200;
	}

}

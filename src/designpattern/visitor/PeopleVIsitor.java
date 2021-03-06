package designpattern.visitor;

public class PeopleVIsitor implements Visitor{

	double totlePrice = 0.0;
	@Override
	public void visitCPU(CPU cpu) {
		// TODO Auto-generated method stub
		totlePrice += cpu.getPrice()*0.9;
	}

	@Override
	public void visitMemory(Memory memory) {
		// TODO Auto-generated method stub
		totlePrice += memory.getPrice()*0.95;
	}

	@Override
	public void visitBoard(Board board) {
		// TODO Auto-generated method stub
		totlePrice += board.getPrice()*0.9;
	}

}

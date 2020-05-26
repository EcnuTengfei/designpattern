package designpattern.visitor;

public class Computer {

	ComputerPart cpu = new CPU();
	ComputerPart memory = new Memory();
	ComputerPart board = new Board();
	
	public void accept(Visitor visitor) {
		this.cpu.accept(visitor);
		this.memory.accept(visitor);
		this.board.accept(visitor);
	}
}

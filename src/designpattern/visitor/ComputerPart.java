package designpattern.visitor;

public abstract class ComputerPart {
	abstract void accept(Visitor visitor);
	abstract int getPrice();

}

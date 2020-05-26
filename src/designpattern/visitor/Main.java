package designpattern.visitor;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PeopleVIsitor peopleVIsitor = new PeopleVIsitor();
		new Computer().accept(peopleVIsitor);
		System.out.println(peopleVIsitor.totlePrice);
	}

}

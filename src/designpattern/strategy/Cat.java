package designpattern.strategy;

public class Cat implements Comparable<Cat>{
	int weight, height;
	
	public Cat(int weight, int height) {
		// TODO Auto-generated constructor stub
		this.weight = weight;
		this.height = height;
	}


	@Override
	public int compareTo(Cat o) {
		// TODO Auto-generated method stub
		Cat cat = (Cat)o;
		if(this.weight < cat.weight) return -1;
		else if(this.weight > cat.weight) return 1;
		else return 0;
	}


	@Override
	public String toString() {
		return "Cat [weight=" + weight + ", height=" + height + "]";
	}
	
	
}

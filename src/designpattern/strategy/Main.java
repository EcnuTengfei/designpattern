package designpattern.strategy;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Cat[] cats = {new Cat(3, 3), new Cat(1, 1), new Cat(5, 5)};
		Dog[] dogs = {new Dog(3), new Dog(5), new Dog(2)};
		Sort<Dog> sorter = new Sort<>();
		sorter.sort(dogs,new DogComparator());
		System.out.println(Arrays.toString(dogs));
	}

}

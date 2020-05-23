package designpattern.strategy;

public class Sort<T> {
	
	public void sort(T[] c, Comparator<T> comparator) {
		for (int i = 0; i < c.length; i++) {
			int minPos = i;
			for (int j = i+1; j < c.length; j++) {
				minPos = comparator.compare(c[j],c[minPos]) == -1 ? j: minPos;
			}
			swap(c, i, minPos);
		}
	}
	
	public void swap(T[] c, int i, int j) {
		T temp = c[i];
		c[i] = c[j];
		c[j] = temp;
	}

}

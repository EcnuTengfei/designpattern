package designpattern.iterator;

public class ArrayList_ implements Collection_{
	Object[] objects = new Object[10];
	
	protected int index = 0;
	
	public void add(Object object) {
		if (index == objects.length) {
			Object[] newObject = new Object[objects.length*2];
			System.arraycopy(objects, 0, newObject, 0, objects.length);
			objects = newObject;
		}
		objects[index] = object;
		index++;
	}
	
	public int size() {
		return index;
	}

	@Override
	public Iterator_ iterator() {
		// TODO Auto-generated method stub
		return new ArrayListIterator_();
	}
	
	
	private class ArrayListIterator_ implements Iterator_{

		private int currentIndex = 0;
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return currentIndex >= index ? false : true;
		}

		@Override
		public Object next() {
			// TODO Auto-generated method stub
			Object object = objects[currentIndex];
			currentIndex++;
			return object;
		}
		
	}
}

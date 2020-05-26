package designpattern.iterator;

public class LinkList_ implements Collection_{
	Node head = null;
	Node tail = null;
	
	private int size = 0;
	
	public void add(Object object) {
		Node node = new Node(object);
		node.next = null;
		
		if (head == null) {
			head = node;
			tail = node;
		}
		tail.next = node;
		tail = node;
		size++;
		
	}
	
	public int size() {
		return size;
	}

	@Override
	public Iterator_ iterator() {
		// TODO Auto-generated method stub
		return new LinkListIterator_();
	}
	
	private class LinkListIterator_ implements Iterator_{
		
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return head.next == null?false: true;
		}
		@Override
		public Object next() {
			// TODO Auto-generated method stub
			head = head.next;
			return head;
		}
		
	}
}


class Node{
	Object object;
	Node next;
	
	public Node(Object object) {
		this.object = object;
	}
	
}

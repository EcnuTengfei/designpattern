package designpattern.iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		LinkList_ linkList_ = new LinkList_();
//		for (int i = 0; i < 15; i++) {
//			linkList_.add("s"+i);
//		}
//		System.out.println(linkList_.size());
		
		Collection_ list_ = new LinkList_();
		for (int i = 0; i < 20; i++) {
			list_.add("S"+i);
		}
		System.out.println(list_.size());
		
		Iterator_ iterator_ = list_.iterator();
		while (iterator_.hasNext()) {
			Object object = iterator_.next();
			System.out.println(object);
		}
		
	}

}

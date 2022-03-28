package collectionFRAMEWORK;

import java.util.LinkedList;

public class LinkedlistExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> llist=new LinkedList<Integer>();

		llist.add(12);
		llist.add(52);
		llist.add(92);
		llist.add(2);
		System.out.print(llist);
		
		llist.addFirst(10);
		llist.addLast(10);
		System.out.print(llist);
		
		llist.add(3, 30);
		System.out.print(llist);
		
		LinkedList<String> list=new LinkedList<String>();
		list.add(" apple: ");
		list.add( " orange:  ");
		System.out.print(list);
	}

}

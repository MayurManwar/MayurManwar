package collectionFRAMEWORK;

import java.util.ArrayList;

public class ArraylistExample {

	public static void main(String[] args) {
		ArrayList<Integer> list= new ArrayList<Integer>();

		list.add(10);

		list.add(12);

		list.add(12);
		
		list.add(13);

		list.add(14);
		System.out.print(list);
		System.out.print(list.size());
		
		list.add(15);
		list.add(16);

System.out.print(list.size());
//insert in an specific position
list.add(2, 5);
System.out.print(list);
//change any element
list.add(3, 17);
System.out.print(list);




	}

}

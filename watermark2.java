package collectionFRAMEWORK;

import java.util.LinkedList;

public class watermark2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> link=new LinkedList<String>();
		link.add(" apple ");
		link.add(" orrenge ");
		link.add(" kiwi ");
		link.add(" banana ");
		link.add(" mango ");
		System.out.print(link);

		int index=link.lastIndexOf(" apple :");
		System.out.print (index );

		//replace element with new value
		link.set(2, " watermelon ");
		for (String s:link)
		{
			System.out.print(s);
		}

		//whether the element is present or not
		if(link.contains(" kiwi"))
			System.out.print(" element is present: ");
		else
			System.out.print(" element is  present ");
		
		//push element in the list
		link.push("dragon fruit");
		System.out.print(link);
		
		//pop the element and return
		String p=link.pop();
		System.out.print(" popped element: " + p);
		System.out.print(link);
		System.out.print(link.pop());
		
		
		//poll() return head element and remove
		System.out.print(link.poll());
		System.out.print(link);
		
		//pollFirst()-retrieve first element and remove
		
		System.out.print(link.pollFirst());
		System.out.print(link);
		
		//pollFirst()-retrieve last element and remove
		System.out.print(link.pollLast());
		System.out.print(link);
		
			}

		

	

}

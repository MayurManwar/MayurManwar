package collectionFRAMEWORK;

import java.util.LinkedList;

public class watermark {

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
			System.out.print(" element is not present ");
			
			}

		

	}



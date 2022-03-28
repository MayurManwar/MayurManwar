package collectionFRAMEWORK;

import java.util.HashSet;

public class HashsetExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set=new HashSet<String>();
		
		set.add( " mayur " );
		set.add( " rahul " );
		set.add( " Pavan " );
		set.add( " nayan " );
		set.add( " Sahil " );
		set.add( null );
		System.out.print(set );

		
		//convert a hashset to an array
		String[] arr=new String[set.size()];
		set.toArray(arr);
		for(String s:arr)
		{
			System.out.print( s );
		}
	}

}

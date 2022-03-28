package collectionFRAMEWORK;

import java.util.Stack;

public class stackExample {

	public static void main(String[] args) {
		 Stack<Integer> stack =new Stack<Integer>();

		 stack.push ( 12 );
		 stack.push ( 13 );
		 stack.push ( 52 );
		 stack.push ( 82 );
		 stack.push( 18 );
		 System.out.print(stack);
		 
		 int el=stack.pop();
		 System.out.print(el);
		 System.out.print(stack);
		 int re=stack.peek();
		 
		 System.out.print(re);
		 System.out.print(stack);
	int index=stack.search ( 13 );
	
	 System.out.print(index);		 
				 
				 
				 
				 
				 
				 
				 
				 
				 
	}

}

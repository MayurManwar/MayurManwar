

		
	package Inheritance;

	
	interface Aa
	{
		void Dis1();
		
	}
	interface Bb extends Aa
	{
		void Dis2();
		
	}
	interface  Cb extends Aa
	{
		void Dis3();
	}
	
	class Db implements Bb, Cb
	{
		public void Dis1()
		{
			System.out.print(" Dis1 " );
		}
		@Override
		
		public  void Dis3()
		
		{
			System.out.print(" Dis3");
		}
		
		@Override
		 public void Dis2()
		 {
			System.out.print("Dis2");
		 }
	
	
	}
	
	
	
public class HybridInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Db obj =new Db();

obj.Dis1();
obj.Dis2();
obj.Dis3();

	}

}

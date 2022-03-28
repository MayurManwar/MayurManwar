package Inheritance;

interface A
{
	void Display(); //abtract method
	
}


 interface B extends A
 {
	 void Display();
 }
 
 
interface C
{
	void Display();
	
}

class D implements B ,C
{
	public void Display()
	{
		System .out.print("multiple inheritance");
	}
}



public class MultipleInhertitance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     D cobj=new D();
     cobj.Display();
	}

}

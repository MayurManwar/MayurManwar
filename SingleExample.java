package Inheritance;

class Bank
{
	String Bank_name;
	int x=10;
	public Bank(String Bank_name)
	{
		this.Bank_name=Bank_name;
		
	}
	public int interest()
	{
		return 8;
		
	}
}
class sbi extends  Bank
{
	int x=100;
	public sbi(String Bank_name)
	{
		super (Bank_name);
	}
	void display()
	{
		int x=200;
		System.out.print("Bank name:"+Bank_name);
		System.out.print("display:"+x);
		System.out.print("child:"+this.x);
		System.out.print("parent:"+super.x);
	}
	
}



public class SingleExample {

	public static void main(String[] args)
	{
	sbi s=new sbi("State bank of india");
	s.display();
	System.out.print(s.interest());
	
	
	}

}



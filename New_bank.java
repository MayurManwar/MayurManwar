package Bank;



import java.util.*;
class bankk
{
	int acc_no;
	String holder_name;
	long acc_balance;
	
	
	public bankk (int  acc_no, String holder_name, long acc_balance)
	{
		this.acc_balance=acc_balance;
		this.acc_no=acc_no;
		this.holder_name=holder_name;
				
	}
	
	
	public void withdraw (long amount)
	{
		if((amount<acc_balance)&&(amount>=500))
		{
			acc_balance=acc_balance-amount;
			System.out.print(amount+"withdraw has done successful");
		}
		else
		{
			System.out.print("insufficint balance Mayur!!deposite first");
		}
		
	}
	



 public void checkbalance() 
 {
	System.out.print("account no:"+this.acc_no); 
	System.out.print("account holder name:"+this .holder_name);
	System.out.print("account balance:"+this.acc_balance);
 }
 
 
public static class New_bankk {

	public static void main(String[] args) {
		
		long withdraw, acc_balance;
		int acc_no;
		String holder_name;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter account number");
		acc_no=sc.nextInt();
		
		System.out.print("enter account holder name");
		holder_name=sc.nextLine();
		
		sc.nextLine();
		
		System.out.print("enter Balance");
		acc_balance=sc.nextLong();
		
		
		bankk obank=new bankk(acc_no, holder_name,acc_balance);
		
		System.out.print("enter amount to withdraw");
		withdraw=sc.nextLong();
		
		obank.withdraw(withdraw);
		obank.checkbalance();
		
	
		
	}
		
	}

}

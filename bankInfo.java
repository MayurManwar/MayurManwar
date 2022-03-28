
class bank_info
{
	int acc_no;
	String name;
	float amount;
	
	public void set_data(int no, String aa_name, float aa_amount)
	
	{
		acc_no=no;
		name=aa_name;
		amount=aa_amount;
	}	
				
	
	
	public void putdata()
	{
		System.out.print("acc_no:"+acc_no+ " "+"name:"+name+" " +"amount:"+amount+" ");
		
	}
	public void withdraw (float famount)
	{
			if (famount>amount)
			{
				System.out.print("amount is not sufficient to withdraw");
				
			}
			else
			{
				System.out.print("amount is sufficient to withdraw");
			}
		}
	
	}



public class bankInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bank_info bobj=new bank_info();
		bobj.set_data(12345, "Mayur Manwar", 10000);
		bobj.putdata();
		bobj.withdraw(500);
		
	}

}

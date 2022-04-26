package bank_Transaction;

import javax.print.attribute.standard.Media;

public class BankService {
	public void withdraw(long wamount,Bank bank) throws InsufficientBalanceException, MinimumBalanceException{
		try {
			if(wamount<bank.accbalance) {
				try {
					if(wamount>=500){
						        bank.accbalance=bank.accbalance-wamount;
						        System.out.println(wamount +" withdraw has done successfully");
					          }
					else
					{
						throw new MinimumBalanceException("minimun withdraw balance 500");
					}
					
					
					
				}
			catch(MinimumBalanceException me)
				{
				System.out.println(me.getMessage());
			    }
		   }
		else
		{
			throw new InsufficientBalanceException("insufficient account balance");
		}
		
	}
	
	catch(InsufficientBalanceException e) 
		{
		System.out.println(e.getMessage());
	}

  }
	public void deposit(long damnt,Bank bank)
	{
		bank.accbalance=bank.accbalance+damnt;
		System.out.println("deposit is completed");
	}
	
	public void checkBalance(Bank bk)
	{
		System.out.println("account no:" + bk.accno);
		System.out.println("account Holder name:" + bk.holdername);
		System.out.println("account Balance:" + bk.accbalance);

		
	}
				
		
}

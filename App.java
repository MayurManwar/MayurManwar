package bank_Transaction;

import java.util.Scanner;

import org.hibernate.HibernateError;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	
	static SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	static Session session=factory.openSession();
	
	static BankService b=new BankService();
	
	public static Bank checkExistingAccount(int accountno)
	{
		Bank b=session.get(Bank.class,accountno );
		
		try 
		{
			if(b!=null)
			{
				throw new AccountExistException("account number already exist!");
			}
		}
		catch(AccountExistException e)
		{
			System.out.println(e.getMessage());
		}
		
		return b; //if acnt not present
	}
	
	public static Bank checkAccount()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter account number:");
		int acno=sc.nextInt();
		
		Bank u=session.find(Bank.class, acno);
		try
		{
			if(u==null)
				throw new AccountNotFoundException("account number not found");
			
		}
		catch(AccountNotFoundException e)
		{
			System.out.println(e.getMessage());
		}
		
		return u;
	}

	public static void main(String[] args) {
		String ch;
		long withdraw,accbalance,damnt;
		int accno,choice;
		String holdername;
		
		Scanner sc=new Scanner(System.in);
		
		do {
			System.out.println("Press 1. for Add account\n Press 2. for withdraw amount\n Press 3.for deposite amount\n Press 4.for check balance\n"
					 +" Press 5. for delete account\n Press 6. for update account\n Press 7.for quit");
			
			System.out.println("-----------------------------------------------");
			System.out.println("Enter your choice");
			choice=sc.nextInt();
			
			System.out.println("--------------------------------------------------");
			
			switch(choice) {
			
			case 1:
				System.out.println("enter account no:");
				accno=sc.nextInt();
				//check account exist or not 
				Bank uk=App.checkExistingAccount(accno);
				
				if(uk==null)
				{
					Transaction tx=session.beginTransaction();
					System.out.println("Enter account holder name:");
					holdername=sc.next();
					
					System.out.println("Enter account balance:");
					accbalance=sc.nextLong();
					
					session.save(new Bank(accno, holdername, accbalance));
					tx.commit();
					System.out.println("your account has been created successfully!");
				}
				
				System.out.println("--------------------------------------------------");
				break;
				
				case 2: //withdraw ammount
					Transaction tx1=session.beginTransaction();
					try
					{
						Bank u=App.checkAccount();
						if(u!=null)
						{
							System.out.println("enter amount to withdraw:");
							withdraw=sc.nextLong();
							
							try
							{
								b.withdraw(withdraw, u);
								tx1.commit();						
						     }
							
							catch(Exception e)
							{
								
							}
						}
					    
						    
						
					}
					
					catch(HibernateError e)
					{
						if(tx1!=null) tx1.rollback();
						e.printStackTrace();
					}
					
					System.out.println("-----------------------------------------");
					break;
					
				case 3: //deposite amount
					Transaction tx2=session.beginTransaction();
					try
					{
						Bank u1=App.checkAccount();
						if(u1!=null)
						{
							System.out.println("enter amount to deposite:");
							damnt=sc.nextLong();
							
							b.deposit(damnt, u1);
							tx2.commit();
							
						}
					}
					catch(HibernateError e)
					{
						if(tx2!=null) tx2.rollback();
						e.printStackTrace();
					}
					System.out.println("---------------------------------------------");
					break;
			
			}
		}//do
		 while(choice!=7);   
		//System.out.println("====================================================================");
         System.out.println("Thank you!Visit our bank again");

	}

}

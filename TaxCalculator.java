package ExceptionHandling;

import java.util.Scanner;

public class TaxCalculator {



	
		String emp_name;
		boolean isIndian;
		static double emp_sal;
		
		
		private TaxCalculator(String emp_name, boolean isIndian, double emp_sal) {
			super();
			this.emp_name=emp_name;
			this.isIndian= isIndian;
			TaxCalculator.emp_sal=emp_sal;
		}
	
	
	public static void calculate_Tax(String emp_name, boolean isIndian,double emp_Sal)
	{
		double taxAmount=0;
		try
		{
		if(isIndian== false)
			{
				throw new Exception(" The employee  should be an Indian citizen for calculating ");
			}//if
		else if (emp_name.isEmpty())
		{
			throw new Exception(" the employee can not be empty.");
			
		}
		else if (emp_sal>1000000 &&  isIndian==true)
		{
			taxAmount= (emp_sal*8)/100;
			System.out.print(" \n Employee_name : " +emp_name+" \nEmployee_salary: " +emp_sal+"\nTax_Amount:  ");
		}
		else if(50000<emp_Sal && emp_Sal<=100000 && isIndian==true)
		{
			taxAmount = (emp_Sal*6)/100;
			System.out.println("\nEmployee_name:  "+emp_name+"\nEmployee_salary: "+emp_Sal+"\nTax_Amount: "+taxAmount);
		}
		else if(30000<emp_Sal && emp_Sal<=50000 && isIndian==true)
		{
			taxAmount = (emp_Sal*5)/100;
			System.out.println("\nEmployee_name:  "+emp_name+"\nEmployee_salary: "+emp_Sal+"\nTax_Amount: "+taxAmount);
		}
		else if(10000<emp_Sal && emp_Sal<=30000 && isIndian==true)
		{
			taxAmount = (emp_Sal*4)/100;
			System.out.println("\nEmployee_name:  "+emp_name+"\nEmployee_salary: "+emp_Sal+"\nTax_Amount: "+taxAmount);
		}
		else
		{
			System.out.println("The employee does not need to pay tax.");
		}
		
	}//try
	
	catch(test2 t)
	{
		System.out.println(t.getMessage());
		
	} 
		//catch
	finally
	{
		System.out.println("Thank U"); 
	}
}
}
	public class test1{
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			
			String emp_name, country;
			boolean b;
			double emp_Sal;
			
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter your name:");
			emp_name=sc.nextLine();
			
			System.out.println("Enter your nationality:");
			country =sc.nextLine();
			if(country.equalsIgnoreCase("India"))
			{
				b=true;
			}
			else
			{
				b=false;
			}	
			
			System.out.println("Enter your salary:");
			emp_Sal = sc.nextDouble();
			
			TaxCalculator.calculate_Tax(emp_name,b,emp_Sal);
			
		}
	}
		
	
	
	
	
	
	
	
	
	
	
	
	
	

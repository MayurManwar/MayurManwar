package ExceptionHandling;

class vaccinationn
{
	public static void ageValidation(int age)
	{
		try 
		{
			
			if(age<18)
			{
				// thow exception explicitly
				//throw new ArithmeticException("Age not valid for vaccination");
				throw new  Exception("Age not valid for vaccination");
			}
			else
			{
				System.out.println("Age is valid for vaccination");
			}	
		}
		catch( Exception e)
		//catch(ArithmeticException e)
		{
			
			System.out.println(e.getMessage());
		}
	}

}

public class ThowDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vaccinationn.ageValidation(34);
		vaccinationn.ageValidation(16);
	}

}

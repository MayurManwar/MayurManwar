package ExceptionHandling;

import java.io.*;

class M
{
	void method() throws IOException
	{
		throw new IOException("device error");
		
	}
}
public class TestThrows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try 
{
	M m= new M();
	m.method();
	
	
}
catch(Exception e)
{
	System.out.print(" exception handling");
}
System.out.print(" normal flow..");
	}

}

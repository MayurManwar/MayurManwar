package ExceptionHandling;

import java.rmi.AccessException;
import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) throws AccessException {
		// TODO Auto-generated method stub
int a;
int b;
Scanner sc=new Scanner(System.in);
// AritmaticException
System.out.print(" Enter 1st value : ");
a=sc.nextInt();


System.out.print(" Enter 2nd value : ");
b=sc.nextInt();

 int c=a/b;
 
		 System.out.print(c);
 //nullPointerException
 String s=null;
  try
  {
	System.out.print(s.length());  
  }
 catch(NullPointerException e )
  {
	 System.out.print(" thanks:" +e);
  }
  //numberForgetException
  int num;
  String o="abc";
  try
  {
	num = Integer.parseInt(o)  ;
	System.out.print( num+"/n");

  }
  catch(NumberFormatException n)
  {
	  System.out.print("thanks: ");
	  
  }
  //Array Index  Out Of Bounds Exception
  int arr[]=new int[5];
  try
  {
	arr[10]=50;
	System.out.print(arr+ " /n ");
	
  }
  catch(ArrayIndexOutOfBoundsException ar)
  {
	  System.out.print(" thanks: ");
	  
  }
  System.out.print(" End code ");
	}

}

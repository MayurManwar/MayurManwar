package Array;

import java.util.Scanner;

public class CalculateMarhinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i, sum=0;
int arry[]= new int[5];
Scanner sc=new Scanner(System.in);
System.out.print(" Enter mark for five Subject : ");
for (i=0;i<5;i++)
{
	arry[i]=sc.nextInt();
	sum=sum+arry[i];
	
}
System.out.print( " Sum of five subject mark:   " + sum);
	}

}

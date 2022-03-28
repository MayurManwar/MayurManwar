package project1;

import java.util.Scanner;

public class sumOfFirstAndLastdigit {

	public static void main(String[] args) {
		int sum,num,firstdigit,lastdigit;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter number: ");
		num=sc.nextInt();
		//calculating last no
		lastdigit=num%10;
		System.out.print("last digit"+lastdigit);
		//calculating first digit
		
		{
	num=num/10;
		}
			firstdigit=num;
		System.out.print("firstdigit:"+firstdigit);
		System.out.print("sum of first digit and last digit is:"+(firstdigit+lastdigit));
			
		 
			
			
			
		
		
		

	}

}

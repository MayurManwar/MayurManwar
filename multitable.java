package project1;

import java.util.Scanner;

public class multitable {

	public static void main(String[] args) {
		int num, i;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number to print multiplication table");
		num=sc.nextInt();
		for (i=1;i<=10;i++)
		{
			System.out.print(num + " *"+ i + "= " + (num * i));
					
					
		}
			
	}

}

package project1;

import java.util.Scanner;

public class triaglepattern {

	public static void main(String[] args) {
		System.out.print("enter character");
		Scanner sc=new Scanner(System.in);
		char star=sc.next().charAt(0);
	
		for(int i=1;i<=5;i++)
		{
			for(int k=5;k>i;k--) 
			{
				System.out.print("");
				
				
		}
			for(int j=1;j<=(i*2)-1;j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
			
				
		}
			
			
		
		
		
	}

}

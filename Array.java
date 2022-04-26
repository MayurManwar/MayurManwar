package joinOperation;

import java.util.Scanner;


public class Array {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int i = 0; 
		
		int num[] = new int[500];
		
		System.out.println("enter the no. of element you want in array:");
		int arr=sc.nextInt();
		System.out.println("enter the " + arr + "elements in an array");
		
		
		for(i=0;i<arr;i++) {
		num[i]=sc.nextInt();
		}
		
		
		int max=num[0];
		int min=num[0];
		
		for(i=0;i<arr;i++)
		{
			if(num[i]>max) {
				max=num[i];
			}
			else if(num[i]<min) {
				min=num[i];
				
			}
				
		}
		
		System.out.println("the maximum element in an array is:" +max);
		System.out.println("the manimum element in an array is:" +min);
		
		
		

	}

}

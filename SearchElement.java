package Array;

import java.util.Scanner;

public class SearchElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int arr[];
int i=0, j=0, flag=0;
System.out.print("\n enterSize of array: ");
int size=sc.nextInt();
arr=new int [size];


System.out.print("\n enter"+size+"array: ");
for(i=0; i<size; i++)
{
	arr[i]=sc.nextInt();
	
}
System.out.print("\n enter in array are: ");
for (int k:arr)
{
	System.out.print("\n"+k);
}

System.out.print("\n  element search to in array : ");
int element=sc.nextInt();
for(j=0; j<size; j++)
{
	if (arr[j]==element)
	{
		flag=1;
		break;
		
	}
	else
	{
		flag=0;
	}
}
	if(flag==1)
	{
		System.out.print("\n Element "+element+"present at"+(j+1)+"position: ");
		
	}
	else
	{
	System.out.print("\n element is not present array: ");	
	}


	

	}

}

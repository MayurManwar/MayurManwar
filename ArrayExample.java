package Array;

import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc=new Scanner(System.in);
 int i;
 int arr[]= {2,3,4,5,6,};
 
 int arr1[]=new int [5];
 arr1[0]= 5;
 arr1[1]=6 ;
 arr1[2]=7 ;
 arr1[3]=8 ;
 arr1[4]=9 ; 
 
 System.out.print("\n enter size of array");
 int N =sc.nextInt();
 int arr2[]=new int[N];
 
 //or
 
 System.out.print("\n enter"+N+"in array");
 for(int k=0; k<N; k++)
 {
	 arr2[k]=sc.nextInt();
	 
 }
 
 //traversing array
 
 System.out.print("\n"+arr[1]);
 for(i=0; i<5;i++)
 {
	 System.out.print("\n"+arr1[i]);
	 //for each loop
	 //for(data type  variable array){sout (variable)}
	 for(int j:arr1)
	 {
		 System.out.print("\n"+j);
	 }
 }
 
 
 
	}

}

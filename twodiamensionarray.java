package Array;

public class twodiamensionarray {

	public static void main(String[] args) {
		//  declare and initialize at comile time
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int i=0; i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(arr[i][j]+"");
				
			}
			System.out.print("\n");
		}
//declare and initialize at run time
		
		int a[][]=new int[2][3];
		System.out.print("  \nenter element is an 2x3 matrix  ");
		
		//taking value from user
		
		for (int i=0;i<2;i++)
		{
			for (int j=0;j<3;j++)
			{
				System.out.print(a[i][j]+" ");
				
			}
			System.out.print("\n");
		}
	}

}

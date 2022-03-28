package Array;

public class BinarySearch {

	public static void binarySearch(int  first, int last, int arr[], int key)
	{
		int mid=0;
		mid=(first +last)/2;
		while(first<+last)
		{
			if(arr[mid]<key) 
			{
				first =mid+1;
				
			}
			else if (arr[mid]==key)		
			{
				System.out.print(" Element found at index: " +mid);
				break;
			}
			else
			{
				last=mid-1;
				
			}
			mid= (first+last)/2;
			
		}
		if (first>last)
		{
			System.out.print(" Element not found: ");
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= { 20,30,40,50,60};

int key=50;
int last=arr.length-1;
binarySearch(0,last,arr,key);
	}

}

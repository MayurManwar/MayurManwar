import java.util.Scanner;

public class FrequencyOfChatCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String value;
   int i,count=0;
   char ch;
   char search;
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter Sentence");
   value=sc.nextLine();
   
   
   System.out.print("Enter charater to find Count");
   ch=sc.next().charAt(0);
   
   
   for (i=0; i<value.length();i++)
   {
	   if (value.charAt(i)==ch) {
		   {
			   count++;
			   
		   }
		   System.out.print("Count of charater:"+count);
	   }
   }
	   

	}

}

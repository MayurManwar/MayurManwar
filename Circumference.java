package project1;

import java.util.Scanner;

public class Circumference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
float r;
double area,circum;
System.out.print("enter redius");
Scanner sc=new Scanner(System.in);
r=sc.nextFloat();

area=3.14*r*r;
circum=3.14*2*r;

System.out.print("area of circle is="+ area);
System.out.print("circum of circle="+ circum);



	}

}

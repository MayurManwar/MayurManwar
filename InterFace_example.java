package Inheritance;
;


interface  demo


{

   void method1();
	void method2();
	
}

interface demo1 extends demo
{
	void method3();
	
}

class XYZ implements demo1
{
	
public void method1()	
{
	System.out.print("In method1");
}
public void method2()	
{
	System.out.print("In method2");
}
public void method3()	
{
	System.out.print("In method3");
}
}



public class InterFace_example {

}

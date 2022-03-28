package collectionFRAMEWORK;


 class Employee extends Object
 {
	int age;
	int salary;
	String name;
	public Employee(int age, int salary, String name)
	{
	super();
	this.age=age;
	this.salary=salary;
	this.name=name;
	
	}
	public boolean equals (Object obj)
	{
		//if both object has same reference
		if(this==obj) 
		{
		return true;	
		}
	
	// if parameter is null or both are not same class
	if (obj==null|| this.getClass()!=obj.getClass())
	{
	return false;
	
	}

//compare using data member
	Employee emp=(Employee)obj;
	return this.name==emp.name
			&& this.age==emp.age
			&&this.salary==emp.salary;
	
	}
 }
 

public class EqualMethodAndHashCodeMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//system.out.print(2==2)
		Employee e1=new Employee(45,  25000 , " sachin ");
		Employee e2=new Employee (45, 35000, " virat ");
		System.out.print(e1.equals(e2));
	}

}

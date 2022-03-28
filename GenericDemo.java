package collectionFRAMEWORK;

class Container<T>
{
	T value;
	
	public T getValue()
	{
		return value;
		
	}
	public void setvalue( T value)
	{
		this.value= value;
		
	}
	public void show ()
	{
		System.out.print( value);
		System.out.print(value.getClass().getName());
	}
}

public class GenericDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Container<Double>  obj=new Container ();
// obj.value="hello";
obj.setvalue(3.4 );
obj.show();
	}

}

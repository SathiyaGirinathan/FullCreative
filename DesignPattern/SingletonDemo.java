/*
 * Rules for singleton java class:
 * -------------------------------
 * singleton java class should have
 * 1)private static reference var of that class type
 * 2)private constructor
 * 3)public static factory method
 * 4)Override Object class clone() method
 * 
 */

class Demo
{
	private static Demo instance;
	private Demo()
	{
		System.out.println("Demo: 0-arg cons");
	}
	//Static factory method
	public static Demo getInstance()
	{
		if(instance==null)
		{
			instance=new Demo();
		}
		return instance;
	}
	
	public Object clone()
	{
		return instance;
	}
	
	public void called()
	{
		System.out.println("Normal method got called.");
	}
}
public class SingletonDemo {

	public static void main(String[] args)
	{
		System.out.println();
		Demo d1=Demo.getInstance();
		System.out.println("Hashcode of d1 Object: "+d1.hashCode());
		d1.called();
		System.out.println();
		
		Demo d2=d1.getInstance();
		System.out.println("Hashcode of d2 Object: "+d2.hashCode());
		d2.called();
		System.out.println();
		Demo d3=(Demo)d1.clone();
		System.out.println("Hashcode of d3 Object: "+d3.hashCode());
		d3.called();
	}
}

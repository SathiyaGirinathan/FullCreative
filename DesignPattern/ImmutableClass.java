/*
 * Immutable java class is developed using factory method
 * 
 */
final class Demo1
{
	private String name;
	private int no;
	
	public Demo1()
	{
		System.out.println("0-arg Constructor");
	}
	
	public Demo1(String name, int no)
	{
		this.name=name;
		this.no=no;
		System.out.println("2 arg constructor");
	}
	
	public Demo1(String s)
	{
		this.name=s;
		System.out.println("1 arg constructor");
	}
	public Demo1(int n)
	{
		this.no=n;
		System.out.println("1 arg constructor");
	}
	
	public Demo1 modifyName(String s)
	{
		Demo1 d=new Demo1(s);
		d.no=this.no;
		return d;
	}
	public Demo1 modifyNo(int n)
	{
		Demo1 d=new Demo1(n);
		d.name=this.name;
		return d;
	}
	
	public String toString()
	{
		return "Name="+name+"   No="+no;
	}
		
};
public class ImmutableClass {

	public static void main(String[] arhs)
	{
		Demo1 d1=new Demo1("durga",35);
		System.out.println("Hashcode of d1="+d1.hashCode());
		System.out.println(d1.toString());
		System.out.println();
		Demo1 d2=d1.modifyName("venkat");
		System.out.println("Hashcode of d2 Object: "+d2.hashCode());
		System.out.println(d2); // which internally calss toString() to print those values
		System.out.println();
		Demo1 d3=d1.modifyNo(25);
		System.out.println("Hashcode of d3 Object: "+d3.hashCode());
		System.out.println(d3);
	}
}

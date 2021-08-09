// Compile time polymorphism -  method overloading
class A{
	public void m1()
	{
		System.out.println("Hi this is m1 frm class A");
	}
}
class B extends A
{
	public void m1(int i)// Overloaded method
	{
		System.out.println("Hi this is m1 from class B");	
	}
	public void m2()
	{ 
		System.out.println("Hey I'm m2 method frm class B");
	}
}
public class OverloadingExample {
	public static void main(String... arhs)
	{
		A a = new A();
		a.m1();
		
		B b = new B();
		b.m1(10);
		b.m2();
		
		A a1 = new B();
		a1.m1();
		//a1.m2();
		
		
		/* In overloading:
		 * --------------
		 * Parent reference can be used to hold child reference but by using
		 * that reference we could call only parent specific methods.
		 */
		
	}
	
}

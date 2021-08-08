//Runtime polymorphism - Method overriding
class C 
{
	public void m1()
	{
		System.out.println("Hey This is Sathiya");
	}
}
class D extends C
{
	public void m1()
	{
		System.out.println("Hey this is overrided method");
	}
	public void m2()
	{ 
		System.out.println("Hey I'm m2 method frm class D ");
	}
}
public class OverridingExamples {

	public static void main(String... args)
	{
		C c = new C();
		c.m1();
		
		D d = new D();
		d.m1();
		d.m2();
		
		C c1 = new D();
		c1.m1();
		//c1.m2();
		
		/* In overriding
		 * -------------
		 * Parent reference can be used to hold child reference. By that reference we can call
		 * child specific method which are OVERRIDDEN.
		 */
	}
}

class Test {
	int x;
	private Test()
	{
		System.out.println("Constructor: 0");
	}
	
	//static factory method
	public static Test staticFactoryMethod()
	{
		Test t=new Test();
		t.x=5;
		return t;
	}
	
	public Test instanceFactoryMethod()
	{
		Test t=new Test();
		t.x=this.x+5;
		return t;
	}
	
	public String toString()
	{
		return "x="+x;
	}
}

public class FactoryMethodDemo
{
	public static void main(String[] args)
	{
		Test t1=Test.staticFactoryMethod();
		System.out.println(t1); // which internally calls toString()
		Test t2=t1.instanceFactoryMethod();
		System.out.println(t2);
	}
}
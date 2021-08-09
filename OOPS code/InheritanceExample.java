class ParentClass
{
	ParentClass()
	{
		
	}
	public void m1()
	{
		System.out.println("This is parent clas");
	}
	
}
class ChildClass extends ParentClass
{
	public void m2()
	{
		System.out.println("this is child class");
	}
}
class InheritanceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentClass p = new ParentClass();
		ChildClass c = new ChildClass();
	//	p.m1();
		c.m2();
		c.m1();
	}

}

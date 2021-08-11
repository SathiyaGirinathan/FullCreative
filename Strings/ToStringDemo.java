class ToStringDemo1
{
	private String s;
	private int rollno;
	
	ToStringDemo1(String s, int rollno)
	{
		this.s=s;
		this.rollno=rollno;
	}
	
	public String toString()
	{
		return rollno+ ": "+s;
	}
}

public class ToStringDemo {

	public static void main(String[] args)
	{
		String s = "Hey there Sathiya";
		System.out.println(s);
		/*
		 * String class overrides object class toString() method to
		 * print some meaningful statement.
		 * But in normal class it is not Overridden.
		 * It's our choice to override
		 */
		ToStringDemo1 d= new ToStringDemo1("Sathiya",86);
		System.out.println(d);
		
	}
}

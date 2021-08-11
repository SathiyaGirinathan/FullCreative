
public final class ImmutableClass {
	private final int i;
	ImmutableClass(int i)
	{
		this.i=i;
	}
	public ImmutableClass modify(int i)
	{
		if(this.i==i)
		{
			return this;
		}
		else
			return (new ImmutableClass(i));
	}
	public static void main(String[] arhs)
	{
		ImmutableClass i1=new ImmutableClass(10);
		ImmutableClass i2=i1.modify(10);
		ImmutableClass i3=i1.modify(100);
		ImmutableClass i4=i3.modify(100);
		System.out.println(i1==i2);
		System.out.println(i1==i3);
		System.out.println(i1==i4);
		System.out.println(i3==i4);	
		
	}
}


public class ValueOf {
	public static void main(String[] args)
	{
	/*
	 * Wrapper class constructor got deprecated since 
	 * Java 9
	 * SO USe utility methods
	 */
		
		//valueOf() 
		/*
		 * public static Wrapper valueOf(String s)
		 * public static Wrapper valueOf(String s, radix)
		 * public static Wrapper valueOf(primitive);
		 */
		Byte bb=Byte.valueOf((byte)120);
		Integer i = Integer.valueOf(10);
		Integer i1 = Integer.valueOf(10);
		Boolean b = Boolean.valueOf(true);
		Boolean b1 = Boolean.valueOf("TRue");
		Character c = Character.valueOf('a');
		Character c1 = Character.valueOf((char)130);
		System.out.println(i);
		System.out.println(i1);
		System.out.println(b);
		System.out.println(b1);
		System.out.println(c);
		System.out.println(c1);
	}

}

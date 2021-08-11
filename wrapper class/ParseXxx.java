
public class ParseXxx {
	public static void main(String[] args)
	{
		//parseXxx(String s)
		Integer i = Integer.parseInt("100");
		Boolean b = Boolean.parseBoolean("True");
		Byte b1=Byte.parseByte("122");
		
		//parseXxx(String s, radix)
		Long l=Long.parseLong("170", 8);
		
		System.out.println(i);
		System.out.println(b);System.out.println(b1);
		System.out.println(l);
		
	}
}

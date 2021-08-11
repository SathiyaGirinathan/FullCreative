
public class XxxValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * xxxValue() to convert wrapper to primitive
		 * total 38 xxxValue() methods are there
		 */
		//Number Type wrapper class
		
		Integer i=Integer.valueOf(140);
		System.out.println(i.byteValue());
		System.out.println(i.shortValue());
		System.out.println(i.intValue());
		System.out.println(i.longValue());
		System.out.println(i.floatValue());
		System.out.println(i.doubleValue());
		//Character type wrapper class
		Character c = Character.valueOf('a');
		System.out.println(c.charValue());
		//Boolean type wrapper class
		Boolean b=Boolean.valueOf("True");
		System.out.println(b.booleanValue());
	}

}

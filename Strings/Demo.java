
public class Demo {
	public static void main(String[] arhs)
	{
		String s="SathiyaGirinathanRamadass";
		
		//Finding Length
		System.out.println("String length: "+s.length());
		
		//Returns character at ith Index
		System.out.println("Char at 5th position: "+s.charAt(5));
		
		//Returns subString from the specified index to end of string
		System.out.println("Substring: "+s.substring(4));
		
		//Returns subString frm i to j-1 index
		System.out.println("SubString: "+s.substring(4, 10));
		
		//COncatenation
		String s1 = "Hello";
		String s2 = " Amandeep";
		System.out.println("COncatenated String: "+s1.concat(s2));
		
		//Finding the index of string within the string
		String s3="I love to learn new things";
		System.out.println("Index of \"new\": "+s3.indexOf("new"));
		
		//Finding the index of string from the specified index
		System.out.println("Index of \"new\": "+s3.indexOf("new",17));
		// LastIndexOF
		System.out.println("Index of \"new\": "+s3.lastIndexOf("new"));
	}
}

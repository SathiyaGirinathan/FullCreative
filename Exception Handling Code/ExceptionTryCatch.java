
public class ExceptionTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			System.out.println("Hi this is sathiya");
			System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println(10/2);
		}
		System.out.println("Normally terminated");
	}
	/*
	 * Risky-code is placed in Try block
	 * Handling-COde is placed inside Catch block
	 */

}

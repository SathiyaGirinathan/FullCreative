
public class ExceptionTryCatchFinally {
	static ExceptionTryCatchFinally e;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			System.out.println("This is try block......");
			System.out.println(e);
		}
		catch(NullPointerException f)
		{ 
			System.out.println("This is catch block......");
			f.printStackTrace();
		}
		finally
		{
			System.out.println("This is finally block");
			e=new ExceptionTryCatchFinally();
			System.out.println(e);
			e=null;
			System.out.println("End of finally block");
		}

		System.out.println("COde got executed ... Normal termination");
		/*
		 * Cleanup code placed inside finally block
		 */
	}

}

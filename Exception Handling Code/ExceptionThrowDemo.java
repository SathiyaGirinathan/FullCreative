class TooYoungException extends RuntimeException
{
	TooYoungException(String str)
	{
		super(str);
	}
}
class TooOldException extends RuntimeException
{
	TooOldException(String str)
	{
		super(str);
	}
}
public class ExceptionThrowDemo {
	public static void validate(int age)
	{
		if(age<18)
			throw new TooYoungException("This is not the correct age for marriage... You are Under 18");
		else if(age>75)
			throw new TooOldException("u r too old to get married");
		else
			System.out.println("u r at The correct age for marriage");
			
	}
	public static void main(String[] args)
	{
		validate(34);
		validate(12);
	}
}

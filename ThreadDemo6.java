/*
 * Priorites: setting and getting
 */
class MyThread extends Thread
{}

public class ThreadDemo6
{
	public static void main(String[] args)
	{
		System.out.println(Thread.currentThread().getPriority());//5
		Thread.currentThread().setPriority(9);
		MyThread t=new MyThread();
		System.out.println(t.getPriority());//9
	}
}
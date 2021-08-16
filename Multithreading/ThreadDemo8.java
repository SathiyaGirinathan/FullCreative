/*
 * join() method Demo program
 */
class MyThread extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Sita Thread");
		try
		{
			Thread.sleep(1000);
		}
		catch (InterruptedException e){}
		}
	}
}
public class ThreadDemo8
{
	public static void main(String[] args)throws InterruptedException
	{
		MyThread t=new MyThread();
		t.start();
		t.join(); //--->1
		for(int i=0;i<5;i++)
		{
			System.out.println("Rama Thread");
		}
	}
}
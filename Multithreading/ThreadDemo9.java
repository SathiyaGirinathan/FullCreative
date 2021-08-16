/*
 * interrupt() method Demo program
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
		catch (InterruptedException e){System.out.println("I got interupted");}
		}
	}
}
public class ThreadDemo9
{
	public static void main(String[] args)throws InterruptedException
	{
		MyThread t=new MyThread();
		t.start();
		t.interrupt(); //--->1
		for(int i=0;i<5;i++)
		{
			System.out.println("Rama Thread");
		}
	}
}
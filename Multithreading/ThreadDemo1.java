/*
 * Defining a thread by extending "Thread Class"
 */
class MyThread extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Child Thread");
		}
	}
}
public class ThreadDemo1 {
	public static void main(String[] arhs)
	{
		MyThread t=new MyThread();
		t.start();
		for(int i=0;i<5;i++)
		{
			System.out.println("main Thread");
		}
	}

}

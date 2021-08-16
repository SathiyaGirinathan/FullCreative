/*
 * Overloading of run():
 * -------------------
 * 1) By default the no arg run() will be called which got executed by thread
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
	public void run(int a)
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Child Thread");
		}
	}
}
public class ThreadDemo2 {
	

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

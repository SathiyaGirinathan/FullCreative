/*
 * Overriding start():
 * -----------------
 * 1) If we override start(), then no new thread will get created
 * it will be exe just like normal method call
 * 2) If we called parent class start() from overridded start() then a new thread will get created
 */
class MyThread extends Thread
{
	public void start()
	{
		super.start(); 
		// This stmt is used to invoke original start method in this case run() method will get exe.
		// and a new thread got created. if this smnt not present, then no new thread will get created.
		System.out.println("Start method");
	}
	public void run()
	{ 
		System.out.println(Thread.currentThread().getName());
		//This smnt used to get name of current exe thread.
		for(int i=0;i<10;i++)
		{
			System.out.println("Child Thread");
		}
	}
}
public class ThreadDemo3 {
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

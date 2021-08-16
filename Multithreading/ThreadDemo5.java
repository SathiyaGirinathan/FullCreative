/*
 * Getting and setting name of thread
 */
class MyThread extends Thread
{
	
}
public class ThreadDemo5 {
	public static void main(String[] arhs)
	{
		System.out.println(Thread.currentThread().getName());
		
		//Creating a thread, Setting and Getting name
		MyThread t = new MyThread();
		System.out.println(t.getName());
		t.setName("Child Thread");
		System.out.println(t.getName());
		
		//Changing the name of main thread to Giri
		Thread.currentThread().setName("Giri");
		System.out.println(Thread.currentThread().getName());
	}
}

/*
 * Creating a thread by implementing runnable interface
 */
class MyThread implements Runnable
{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Sita Thread");
	}
	
}
public class ThreadDemo4 {

	public static void main(String[] arhs)
	{
		Runnable r=new MyThread();
		Thread t = new Thread(r);
		// -> Thread t=new Thread(Runnable r);
		t.start();
		for(int i=0;i<5;i++)
		{
			System.out.println("Rama Thread");
		}
		
	}
}

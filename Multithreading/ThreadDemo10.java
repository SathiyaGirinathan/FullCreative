class Display
{
	public synchronized void wish(String name)
	{
		for(int i=0;i<5;i++)
		{
			System.out.print("Good morning: ");
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{}
			System.out.println(name);
		}
	}
}
class MyThread extends Thread
{
	Display d;
	String name;
	MyThread(Display d, String name)
	{
		this.d=d;
		this.name=name;
	}
	public void run()
	{
		d.wish(name);
		//t1 thread got lock of Display d to execute wish method
		//... After this gets completed...
		//t2 thread got lock of Display d to execute wish method
	}
}
public class ThreadDemo10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display d1=new Display();
		//Display d2=new Display();
		MyThread t1=new MyThread(d1, "Dhoni");
		MyThread t2=new MyThread(d1,"Yuvaraj");
		t1.start();
		t2.start();
		/*
		 * Here t1 and t2 both are operating on a same Object Display d1
		 */
	}

}

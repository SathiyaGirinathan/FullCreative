
public class YouTube 
{
	public static void main(String args[])
	{
		Channel Geeks = new Channel();
		
		Subscriber s1=new Subscriber("Sathiya");
		Subscriber s2=new Subscriber("Akkshay");
		Subscriber s3=new Subscriber("Amandeep");
		Subscriber s4=new Subscriber("Hari");
		Subscriber s5=new Subscriber("Giri");
		
		Geeks.subscribe(s1);
		Geeks.subscribe(s2);
		Geeks.subscribe(s3);
		Geeks.subscribe(s4);
		Geeks.subscribe(s5);
		
		s1.subscribeChannel(Geeks);
		s2.subscribeChannel(Geeks);
		s3.subscribeChannel(Geeks);
		s4.subscribeChannel(Geeks);
		s5.subscribeChannel(Geeks);
		
		Geeks.upload("Hw to load video");
	
	}
	
}

import java.util.LinkedList;

public class LinkedListDemo {
	
	public static void main(String[] args)
	{
		LinkedList l = new LinkedList();
		l.add("10");
		l.add(null);
		l.add("Sathiya");
		l.add("Giri");
		l.add("Nathan");
		System.out.println(l);
		l.set(4,"Ramadass");
		System.out.println(l);
		l.add(0,"venky");
		System.out.println(l);
		l.removeLast();
		l.addFirst("CCC");
		System.out.println(l);
		System.out.println(l.size());
	}	
}

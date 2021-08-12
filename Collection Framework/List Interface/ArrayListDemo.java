import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args)
	{
		ArrayList l = new ArrayList();
		//System.out.println(l);
		l.add(10);
		l.add("100");
		l.add("Sathiya");
		l.add('a');
		System.out.println(l);
		
		l.remove(2);
		System.out.println(l);
		
		l.removeAll(l);
		
		System.out.println(l);
	}
}

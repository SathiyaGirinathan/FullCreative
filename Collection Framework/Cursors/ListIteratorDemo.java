import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l=new LinkedList();
		l.add("Baala");
		l.add("Venki");
		l.add("Chiru");
		l.add("Naag");
		System.out.println(l);
		ListIterator itr=l.listIterator();
		while(itr.hasNext())
		{
			String s=(String)itr.next();
			if(s.equals("Venki"))
				itr.remove();
			if(s.equals("Naag"))
				itr.add("rajini");
			if(s.equals("Chiru"))
				itr.add("Charan");
		}
		System.out.println(l);
	}

}

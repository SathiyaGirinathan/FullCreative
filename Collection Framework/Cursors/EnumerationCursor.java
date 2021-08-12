import java.util.Enumeration;
import java.util.Vector;

/*
 * Enumeration Concept is Applicable Only for Legacy Classes and it is Not a Universal Cursor.
 * By using Enumeration we can Perform Read Operation and we can't Perform Remove Operation.
 */
public class EnumerationCursor {
	public static void main(String[] arhs)
	{
		Vector v = new Vector();
		for(int i=0;i<=10;i++)
		{
			v.addElement(i);
		}
		System.out.println(v);
		Enumeration e = v.elements();
		while(e.hasMoreElements())
		{
			Integer i = (Integer)e.nextElement();
			if(i%2==0)
			{
				//printing even number;
				System.out.println(i);
			}
		}
		System.out.println(v);
	}
}

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v = new Vector();
		System.out.println(v.capacity());
		for(int i=1;i<=10;i++)
			v.add(i);
		System.out.println(v.capacity());
		v.addElement("A");
		/*
		 * new Capacity = old capacity*2
		 * 
		 */
		System.out.println(v.capacity());
		System.out.println(v);

	}

}

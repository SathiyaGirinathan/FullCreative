import java.util.Stack;

public class StackDemo {
	public static void main(String[] args)
	{
		Stack s = new Stack();
		s.push("A");
		s.push("B");
		s.push("C");
		s.add("a");
		//System.out.println(s.capacity());
		System.out.println(s);
		System.out.println(s.search("A"));
		System.out.println(s.search("Z"));
		System.out.println(s.peek());
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s);
		/*
		 * search() returns offset 
		 * and not index of that element...
		 * Offset - Top to bottom from 1 to n
		 * Index - Bottom to top from 0 to n
		 */
	}
}

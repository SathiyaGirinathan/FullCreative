import java.util.Scanner;

abstract class ShapeEx
{
	public abstract void draw();
}
class Line extends ShapeEx
{
	public Line()
	{
		System.out.println("You are choosen line to draw");
	}
	public void draw()
	{
		System.out.println("Line: draw()");
	}
}

class Square extends ShapeEx
{
	public Square()
	{
		System.out.println("You are choosen Square To draw");
	}
	public void draw()
	{
		System.out.println("Square: draw()");
	}
}

public class FactoryPattern {
	
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		FactoryPattern fp=new FactoryPattern();
		System.out.println();
		String s1=in.next();
		ShapeEx s=fp.getShape(s1);
		System.out.println();
		System.out.println("Object is created for: "+s.getClass());
	}

	private ShapeEx getShape(String shape) {
		// TODO Auto-generated method stub
		if(shape.equals("L"))
			return new Line();
		else if(shape.equals("S"))
			return new Square();
		else
			return null;
	}
}

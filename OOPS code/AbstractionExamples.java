abstract class Animal
{
	//Inside abstract class we can take abstract as well as concrete methods
	abstract void move();
	abstract void eat();
}

class Dog extends Animal
{
	void move()
	{
		System.out.println("Moves by running");
	}
	void eat()
	{
		System.out.println("eats Dogfood and meat");
	}
}

class Cow extends Animal
{
	void move()
	{
		System.out.println("Moves by walking and running");
	}
	void eat()
	{
		System.out.println("eats grass");
	}
}
public class AbstractionExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Dog();
	
		a.move();
		a.eat(); 
		
		Animal b= new Cow();
		b.move();
		b.eat();
		
	}

}

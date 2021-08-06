class Animal {
	private String name;
	private int noOfLegs;
	private String food;
	
	//Getter Methods
	public String getName()
	{
		return name;
	}
	public  int getNoOfLegs()
	{
		return noOfLegs;
	}
	public String getEatingFood()
	{
		return food;
	}
	
	//Setter methods
	public void setAnimalInfo(String name, int noOfLegs, String food)
	{
		this.food=food;
		this.name=name;
		this.noOfLegs=noOfLegs;
	}
	
}
public class EncapsulationExample
{
	public static void main(String[] args)
	{
		Animal a=new Animal();
		a.setAnimalInfo("Dog", 4, "Meat");
		
		System.out.println(a.getName()+" is a animal which has "+a.getNoOfLegs()+
				" legs and it eats "+a.getEatingFood());
	}
}
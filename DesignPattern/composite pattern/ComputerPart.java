import java.util.ArrayList;
import java.util.List;

interface Component
{
	void showPrice();
}
class leaf implements Component
{
	int price;
	String name;

	public leaf(int price, String name) {
		super();
		this.price = price;
		this.name = name;
	}

	@Override
	public void showPrice() {
		// TODO Auto-generated method stub
		System.out.println(name+" = "+price);
	}
	
}
class Composite implements Component
{
	String name;
	List<Component> components=new ArrayList<>();
	public void addComponent(Component com)
	{
		components.add(com);
	}
	
	public Composite(String name) {
		super();
		this.name = name;
		//this.components = components;
	}


	@Override
	public void showPrice() {
		// TODO Auto-generated method stub
		System.out.println(name);
		for(Component c: components)
		{
			c.showPrice();
		}
	}
	
}

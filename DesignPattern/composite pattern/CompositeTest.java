
public class CompositeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Component hd= new leaf(4000,"Hdd");
		Component mouse=new leaf(3000,"Mouse");
		Component ram=new leaf(5000,"ram");
		Component monitor=new leaf(6000,"monitor");
		Component cpu=new leaf(8000,"cpu");
		
		Composite ph=new Composite("Peri");
		Composite cabinet=new Composite("Cabinet");
		Composite mb=new Composite("MotherBoard");
		Composite computer = new Composite("Computer");
		
		mb.addComponent(cpu);
		mb.addComponent(ram);
		
		ph.addComponent(mouse);
		ph.addComponent(monitor);
		
		cabinet.addComponent(hd);
		cabinet.addComponent(mb);
		
		computer.addComponent(ph);
		computer.addComponent(cabinet);
		
		computer.showPrice();
	}

}

package loosecouplinginstancephone;

public class TestCrush 
{
	public static void main(String[] args) {
		
	
	Crush c3 = new Crush();
	
	Basicset b1 =new Basicset();
	Oppo o1 = new Oppo();
	OnePlus o2 = new OnePlus();
	Apple a1 = new Apple();
	Phone p1 = new Phone();
	
	c3.receive(b1);
	c3.receive(o1);
	c3.receive(a1);
	c3.receive(p1);
	c3.receive(o2);
	

}
}

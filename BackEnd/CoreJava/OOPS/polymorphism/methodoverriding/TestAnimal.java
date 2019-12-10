package methodoverriding;

public class TestAnimal 
{
	public static void main(String[] args) {
		Lion l1 = new Lion();
		l1.eat();
		
		Cat c1 = new Cat();
		c1.eat();
		
		Animal a = new Lion();
		a.eat();
		
		Animal a2= new Cat();
		a2.eat();
	}

}

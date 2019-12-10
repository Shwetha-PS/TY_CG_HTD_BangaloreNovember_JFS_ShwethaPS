package abstractionbottle;

public class TestBottle
{
	public static void main(String[] args)
	{
		Pepsi p1 = new Pepsi();
		p1.open();
		p1.drinks();
		Bottle.close();
		p1.juice();
		
		Fanta f1 = new Fanta();
		f1.juice();
		
		
		
	}

}

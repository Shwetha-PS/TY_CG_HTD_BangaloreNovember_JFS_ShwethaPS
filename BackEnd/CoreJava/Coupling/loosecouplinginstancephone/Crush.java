package loosecouplinginstancephone;

public class Crush
{
	void receive(Phone m)
	{
	if(m instanceof Basicset)
		System.out.println("THANKS");
	else if(m instanceof Oppo)
		System.out.println("THANKYOU");
	else if(m instanceof OnePlus)
		System.out.println("THANKYOU SO MUCH DEAR");
	else if(m instanceof Apple)
		System.out.println("LOVE YOU");
	else
		System.out.println("IDIOT");

	}
}

package loosecouplingbank;

public class User
{
	void atm(Bank b)
	{
		b.insert();
		b.withDraw();
	}

}

package loosecouplingbank;

public class TestUser
{
	public static void main(String[] args) {
		User u = new User();
		
		Bank b1 = new Bank();
		SbiBank s1 = new SbiBank();
		HdfcBank h1 = new HdfcBank();
		
		u.atm(b1);
		u.atm(s1);
		u.atm(h1);
	}

}

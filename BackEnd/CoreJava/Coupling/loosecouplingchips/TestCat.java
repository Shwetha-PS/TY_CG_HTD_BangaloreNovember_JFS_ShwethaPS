package loosecouplingchips;

public class TestCat 
{
	public static void main(String[] args) {
		Cat c1 = new Cat();
		
		Chips c2=new Chips();
		Lays l1 = new Lays();
		Bingo b1 = new Bingo();
		Kurkure k1 = new Kurkure();
		
		c1.feedChips(k1);
		//c1.feedChips(k1);
		//c1.feedChips(b1);
		//c1.feedChips(l1);
	}

}

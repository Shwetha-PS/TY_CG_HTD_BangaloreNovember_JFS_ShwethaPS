package abstractsourceclass;

public class TestHeroHonda 
{
	public static void main(String[] args) {
		Hero h = new Hero();
		h.design();
		h.engine();
		
		
		HeroHonda hh = new Hero();
		hh.design();
		hh.engine();
		
		Honda ho = new Honda();
		ho.design();
		ho.engine();
	}

}

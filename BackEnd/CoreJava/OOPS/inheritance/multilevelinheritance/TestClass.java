package multilevelinheritance;

public class TestClass
{
	public static void main(String[] args) {
	/*(  FirstGeneration fg = new FirstGeneration();
		fg.cal();
		fg.msg();
		
		SecondGeneration sg = new SecondGeneration();
		sg.cal();
		sg.msg();
		sg.radio();
		
		ThirdGeneration tg = new ThirdGeneration();
		tg.cal();
		tg.msg();
		tg.radio();
		tg.camera();         )*/
		
		
		FirstGeneration sg1 = new SecondGeneration();
		sg1.cal();
		sg1.msg();
		//sg1.radio();   //only parent class properties we can access so radio is not possible
		
		FirstGeneration fg = new ThirdGeneration();
		fg.cal();
		fg.msg();
		//fg.camera();  we cannot access
		
		SecondGeneration sg = new ThirdGeneration();
		sg.cal();
		sg.msg();
		sg.radio();
		//sg.camera();  we cannot access
		
		
	
	}

}

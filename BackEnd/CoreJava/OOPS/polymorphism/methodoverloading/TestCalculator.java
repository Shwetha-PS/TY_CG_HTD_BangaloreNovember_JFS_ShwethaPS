package methodoverloading;

public class TestCalculator 
{
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		int r1 = c1.add(25);
		System.out.println(r1);
		
		int r2 = c1.add(50,100);
		System.out.println(r2);
		
		double r3 = c1.add(12.50);
		System.out.println(r3);
		
		Calculator.multiply(50);
		Calculator.multiply(50,20);
		Calculator.multilply(25.50);

	}

}

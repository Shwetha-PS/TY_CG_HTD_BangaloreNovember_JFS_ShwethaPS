package arithmeticexceptions;

public class Calculator
{
	void divide(int a, int b)
	{
		System.out.println("divide method started");
		try
		{
		System.out.println(a/b);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Dont divide by zero");
	
		}
		System.out.println("divide method ended");
	}
}

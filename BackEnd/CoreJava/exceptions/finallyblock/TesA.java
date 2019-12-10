package finallyblock;

public class TesA
{
	public static void main(String[] args) {
		System.out.println("main started");
		try
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Dont deal with zero");
		}
		finally
		{
			System.out.println("Finally block called");
		}
		System.out.println("main ended");
	}

}

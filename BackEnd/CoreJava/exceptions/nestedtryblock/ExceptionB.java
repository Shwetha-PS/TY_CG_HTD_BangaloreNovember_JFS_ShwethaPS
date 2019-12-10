package nestedtryblock;

import sun.applet.Main;

public class ExceptionB
{
	void exceptionB(int a, String b)
	{
		try
		{
			System.out.println(10/0);
			try
			{
				System.out.println(500/a);
			}
		
			catch(ArithmeticException e)
			{
				System.out.println("dont deal with 0");
			}
		}
			catch(NullPointerException e)
			{
				System.out.println("Dont deal with null");
				
			}
		
	}

}

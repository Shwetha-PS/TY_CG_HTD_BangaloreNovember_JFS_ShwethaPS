package methodoverloading;

public class Calculator 
{
	int add(int a)
	{
		return a+a;
	}
	
	int add(int a, int b)
	{
		return a+b;
	}
	
	double add(double a)
	{
		return a+a;
	}
	
	static void multiply(int a) 
	{
		System.out.println(a*a);
	}
	
	static void multiply(int a,int b)
	{
		System.out.println("product of int a and b is "+(a*b));
	}
	
	static void multilply(double a)
	{
		System.out.println("product of double a and b is "+(a*a));
	}

}

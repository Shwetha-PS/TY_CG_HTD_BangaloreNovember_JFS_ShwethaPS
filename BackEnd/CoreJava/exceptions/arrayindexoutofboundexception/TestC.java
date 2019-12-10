package arrayindexoutofboundexception;

public class TestC
{
	public static void main(String[] args) {
		System.out.println("main started");
		int a1[] = new int[2];
		a1[0]=5;
		a1[1]=20;
		try
		{
			a1[3]=40;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Reallocate the value of size");
		}
		System.out.println("main ended");
	}

}

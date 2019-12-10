package nullpointerexception;

public class TestB 
{
	void write() {
		String s1=null;
		try
		{
		System.out.println("length of string is "+s1.length());
		}
		catch(NullPointerException e)
		{
			System.out.println("Dont deal with null");   
		}
		
	}
	public static void main(String[] args) {
		System.out.println("main started");
		TestB b1 = new TestB();
		b1.write();
		System.out.println("main ended");
	}

}

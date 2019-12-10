package trywithmultiplecatchblocks;

public class TestA 
{
	public static void main(String[] args)
	{
		System.out.println("main started");
		ExceptionA e1 = new ExceptionA();
		e1.Exception(0, "PS");
		e1.Exception(2, null);
		System.out.println("main ended");
	}

}

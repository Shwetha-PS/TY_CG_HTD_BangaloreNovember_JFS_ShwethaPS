package nestedtryblock;

public class TestException 
{
	public static void main(String[] args) {
		ExceptionB b1 = new ExceptionB();
		b1.exceptionB(0, "PS");
		b1.exceptionB(2, null);
	}

}

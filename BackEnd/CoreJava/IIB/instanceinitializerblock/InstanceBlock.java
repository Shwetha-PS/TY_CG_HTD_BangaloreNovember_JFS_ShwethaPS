package instanceinitializerblock;

public class InstanceBlock
{
	final int MAXIMUM;
	static final double PI;
	
	public InstanceBlock()
	{
		System.out.println("Constructor is called");
	}
	
	public InstanceBlock(int a)
	{
		System.out.println("Constructor Overloaded");
	}
	
	{
		this.MAXIMUM = 30000;
		System.out.println("ABC");
	}
	
	static {
		System.out.println("Static block executed");
		PI = 3.142;
		
	}

}

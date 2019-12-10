package abstractionbottle;

public interface Bottle 
{
	void open();
	void drinks();
	default void juice()
	{
		System.out.println("Juice name is ");
	}
	static void close()
	{
		System.out.println("close the bottle");	
	}

}

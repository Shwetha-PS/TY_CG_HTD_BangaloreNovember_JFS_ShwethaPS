package privateaccessmodifier;
//private class PErson{} is not possible
public class Person
{
	private String name;
	
	private Person(String name)
	{
		this.name=name;
	}
	
	private void details() {
		System.out.println("name is "+name);
	}

}

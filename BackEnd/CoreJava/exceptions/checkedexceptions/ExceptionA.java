
public class ExceptionA 
{
	public static void main(String[] args) {
		System.out.println("main started");
		
		try 
		{
			Class c1 = Class.forName("Person");  //forname will find the Perosn class in default package.
									//if it is not default package then we should write "packagename.Person"
									//for example ("checkedexception.Person");
			System.out.println("class found");
		}
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
			System.out.println("class not found");
		}
		System.out.println("main ended");
		
		
	}

}

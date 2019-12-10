package checkedexceptionstrywithmultiplecatch;

public class ExceptionB 
{
	public static void main(String[] args) {
		System.out.println("main started");
		
		Student s1 = new Student();
		try
		{
		Object o1 = s1.clone();
		System.out.println("object is cloned");
		Class c1 = Class.forName("checkedexceptions.Student");
		}
		 catch (CloneNotSupportedException e)
		{
			 System.out.println("clone not supported");
		
		}
		catch (ClassNotFoundException e)
		{
			System.out.println("class not found");	
		}
		System.out.println("main ended");
		
	}
}

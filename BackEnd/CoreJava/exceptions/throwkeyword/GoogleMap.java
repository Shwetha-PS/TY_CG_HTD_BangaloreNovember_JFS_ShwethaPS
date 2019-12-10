package throwkeyword;

public class GoogleMap 
{
	void findLocation(String loc)
	{
		try
		{
			System.out.println(loc.length());	
		}
		catch(NullPointerException e)
		{
			System.out.println("Google map plz fill the location name");
			throw e;
		}
	}

}

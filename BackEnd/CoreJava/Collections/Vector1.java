import java.util.*;

public class Vector1 
{
	public static void main(String[] args) {
		Vector v1 = new Vector();
		v1.add(23);
		v1.add(33);
		v1.add(43);
		v1.add(53);
		System.out.println(v1);
		System.out.println("--------remove--------");
		v1.remove(new Integer(23));
		System.out.println(v1);
		
		System.out.println("------add at particular index-----------");
		v1.add(1, 40);
		System.out.println(v1);
		
		System.out.println("-----------set vector------");
		v1.set(2, 50);
		System.out.println(v1);
		
		System.out.println("----------------for loop----------");
		for(int i=0;i<v1.size();i++)
		{
			System.out.println(v1.get(i));
		}
	}

}

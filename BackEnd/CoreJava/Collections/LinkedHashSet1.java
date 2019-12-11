import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet1
{
	public static void main(String[] args) {
		LinkedHashSet h1 = new LinkedHashSet();
		h1.add(11);
		h1.add(14);
		h1.add(17);
		h1.add(11);
		h1.add(null);
		Iterator itr = h1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}

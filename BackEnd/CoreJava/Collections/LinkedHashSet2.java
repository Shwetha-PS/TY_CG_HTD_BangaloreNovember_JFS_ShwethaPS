import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet2
{
	public static void main(String[] args) {
		LinkedHashSet<String> h1 = new LinkedHashSet<String>();
		h1.add("anu");
		h1.add("daddy");
		h1.add("amma");
		h1.add("chinni");
		h1.add(null);
		Iterator itr = h1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}



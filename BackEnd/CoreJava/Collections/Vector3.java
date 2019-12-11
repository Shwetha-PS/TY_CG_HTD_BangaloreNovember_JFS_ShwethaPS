import java.util.Vector;

public class Vector3
{
	public static void main(String[] args) {
		Vector v1 = new Vector();
		v1.addElement(24);
		v1.addElement(56);
		v1.addElement(78);
		v1.add(67);
		System.out.println(v1);

		System.out.println("----------removeElement-------------");
		v1.removeElement(new Integer(24));
		System.out.println(v1);
		v1.removeElementAt(2);
		System.out.println("remove element at" +v1);

		System.out.println("-----for loop iterating--------");
		Object i1[] = new Object[v1.size()];
		v1.copyInto(i1);
		for(int i=0;i<i1.length; i++)
		{
			System.out.println(i1[i]);
		}

		v1.removeAllElements();
		System.out.println("remove all elements "+v1);

		Vector v2 = new Vector();
		v2.addElement(34);
		v2.addElement(56);
		v2.elementAt(1);
		System.out.println(v2);

		System.out.println(v2.size());
		System.out.println(v2.capacity());

		v2.trimToSize();
		System.out.println(v2.size());
		System.out.println(v2.capacity());

		v2.ensureCapacity(9);
		v2.setSize(10);
		System.out.println(v2.size());
		System.out.println(v2.capacity());
		System.out.println(v2);



	}
}

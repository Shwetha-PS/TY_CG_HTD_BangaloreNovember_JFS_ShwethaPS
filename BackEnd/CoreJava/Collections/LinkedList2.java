import java.util.*;

public class LinkedList2 {

	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		
		l1.add(22);
		l1.add(25);
		l1.add(27);
		l1.add(29);
		System.out.println(l1);
		l1.addFirst(20);
		System.out.println(l1);
		l1.addLast(30);
		System.out.println(l1);
		l1.remove(new Integer(22));
		System.out.println(l1);
		System.out.println(l1.getFirst());
		System.out.println(l1.getLast());
		
		LinkedList l2 = new LinkedList();
		l2.add(29);
		l2.add(32);
		l2.add(35);
		l2.add(37);
		l2.add(29);
		System.out.println(l2);
		
		l2.removeFirst();
		System.out.println(l2);
		l2.removeLast();
		System.out.println(l2);

	}

}

import java.util.*;

public class LinkedList3 
{
	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1.add(23);
		l1.add(56);
		l1.add(64);
		l1.add(85);
		System.out.println("------------peek and peekFirst and pekLast-------------");
		System.out.println(l1.peek());
		System.out.println(l1.peekFirst());
		System.out.println(l1.peekLast());
		System.out.println(l1);
		
		System.out.println("-----------------poll and pollFirst and pollLast------------");
		System.out.println(l1.poll());
		System.out.println(l1.pollFirst());
		System.out.println(l1.pollLast());
		System.out.println(l1);
		
		System.out.println("-----------offer and offerfirst and offerlast------------------");
		l1.offer(23);
		System.out.println(l1);
		l1.offerFirst(75);
		System.out.println(l1);
		l1.offerLast(98);
		System.out.println(l1);
	}

}

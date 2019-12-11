import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {
		Stack<Integer> s1 = new Stack<Integer>();
		s1.add(23);
		s1.add(56);
		s1.add(67);
		System.out.println(s1);
		s1.pop();
		System.out.println("pop is " +s1);
		System.out.println("searching is "+s1.search(56)+ " position we have added");//which element we are adding in stack that position it will give
		System.out.println("last element we wil get in stack for peek " +s1.peek());
	}

}

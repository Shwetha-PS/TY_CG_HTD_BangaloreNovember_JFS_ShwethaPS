import java.util.function.Consumer;
import java.util.function.Supplier;
public class TestB
{
	public static void main(String[] args) {
		
	
	System.out.println("------------Supplier ------------------");
	Supplier<Person> s1 = () -> new Person(24, "Anu");
	System.out.println(s1.get().getAge());
	System.out.println(s1.get().getName());

	
	System.out.println("--------Consumer----------------------");
	Consumer<Person> c1 = j -> {
		System.out.println(j.getAge());
		System.out.println(j.getName());
	};
	Person p1 = new Person(24, "Anu");
	c1.accept(p1);

	}
}

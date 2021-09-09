package static_field;

public class Main {

	public static void main(String[] args) {
		
		Count c1 = new Count();
		c1.a++;
		c1.b++;
		
		System.out.println("c1의 a: " + c1.a);
		System.out.println("c1의 b: " + c1.b);
		
		Count c2 = new Count();
		c2.a++;
		c2.b++;
		
		System.out.println("c2의 a: " + c2.a);
		System.out.println("c2의 b: " + c2.b);
		System.out.println(Count.b);
		
		
	}
}

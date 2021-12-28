package p14lambda.p02quiz;

public class Ex02 {
	public static void main(String[] args) {
		MyInterface2 o1 = () -> {
			System.out.println("hello");
		};
		
		o1.method();
		
		MyInterface2 o2 = () -> System.out.println("java");;
		
		o2.method();
		
	}
}

interface MyInterface2 {
	void method();
}
package p14lambda.p02quiz;

public class Ex03 {
	public static void main(String[] args) {

		MyInterface3 o1 = () -> (int) (Math.random() * 10) + 1;
		
		
		
		System.out.println(o1.method());
	}
}

interface MyInterface3 {
	int method();
}
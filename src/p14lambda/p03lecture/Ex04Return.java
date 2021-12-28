package p14lambda.p03lecture;

public class Ex04Return {
	public static void main(String[] args) {
		MyInterface4 o1 = new MyInterface4() {
			public int method() {
				return 1;
			}

		};
	}
}

interface MyInterface4 {
	int method();

}
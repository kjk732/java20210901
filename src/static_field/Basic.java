package static_field;

public class Basic {

	public int a;
	public static int b;
	
	public int method1() {
		a = 10;
		return a + b;
	}

	public static int method2() {
//		a = 10; 일반변수 사용 불가!
		return ++b;
	}
	
}

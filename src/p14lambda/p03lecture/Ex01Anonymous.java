package p14lambda.p03lecture;

public class Ex01Anonymous {

	public static void main(String[] args) {
		MyInterface1 o1;
		o1 = new MyClass1();
		
		MyInterface1 o2 = new MyInterface1() {

			@Override
			public void method1() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void method2() {
				// TODO Auto-generated method stub
				
			}
		};
		
	}
}

interface MyInterface1{
	public void method1();
	public void method2();
}

class MyClass1 implements MyInterface1{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}
	
}
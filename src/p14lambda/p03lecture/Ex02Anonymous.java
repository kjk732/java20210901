package p14lambda.p03lecture;

public class Ex02Anonymous {//추상메서드 하나를 잘 구현해놓는 람다식

	public static void main(String[] args) {
		MyInterface2 o1 = new MyInterface2() {

			@Override
			public void method1() {
				// TODO Auto-generated method stub
			}
		};
		//lambda
		MyInterface2 o2 = () ->{//메서드 명은 생략가능 파라미터값()은 필요 / 화살표는 람다식인걸 알아보기위한 것(람다기호)
			System.out.println("실행코드2");
		};
	}
}

interface MyInterface2 {
	public void method1();
}
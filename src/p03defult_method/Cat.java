package p03defult_method;

public class Cat implements Pet {


	public void sit() {
		System.out.println("무시합니다");
		
	}

	@Override
	public void roll() {
		
		Pet.super.roll();
		System.out.println("안구릅니다.");
	
	}

	
}

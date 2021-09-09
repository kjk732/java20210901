package p08.p2quiz;

public class Ex1 {

	public static void main(String[] args) {
		Hero hero = new Hero();
		
		System.out.println("불검을 장착합니다.");
		hero.setSword(new FireSword());
		
		System.out.println("공격합니다.");
		hero.attack(new FireSword());
		
		System.out.println("무지개검을 장착합니다.");
		hero.setSword(new RainbowSword());
		
		System.out.println("공격합니다.");
		hero.attack(new RainbowSword());
	}
	
	
}

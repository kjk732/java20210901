package p08.p2quiz;

public class Hero {

	private Sword sword;

	public void setSword(Sword sword) {
		this.sword = sword;
	} 
		
	public void attack(Sword sword) {
		System.out.println(sword.SwordAttack());
	}
}


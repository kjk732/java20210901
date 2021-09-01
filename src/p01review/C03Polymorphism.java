package p01review;



public class C03Polymorphism {

	public static void main(String[] args) {
		
		Gun g1 = new Gun();
		Hero hero = new Hero();
		Sword s1 = new Sword();
		
		
		hero.setGun(g1);
		
		System.out.println("-공격합니다.");
		hero.attackG();
		
		System.out.println("-불총을 습득했다.");
		hero.setGun(new FireGun());
		
		System.out.println("-다시 공격합니다.");
		hero.attackG();
		
		hero.setSword(s1);
		System.out.println();
		hero.attackS();
	}
}

class Hero{
	private Gun gun;
	private Sword sword;
	
	public void setGun(Gun gun) {
		this.gun = gun;
		
	}
	
	public void setSword(Sword sw) {
		this.sword = sw;
	}
	public void attackG() {
		
		gun.fire();	
	}
	public void attackS() {
		
		sword.slash();	
	}
	
}

class Gun  {
	
	public void fire() {
		System.out.println("총을 쏩니다.");
	}
	

}

class FireGun extends Gun{
	
	public void fire() {
		System.out.println("불을 쏩니다.");
	}
}

class Sword extends Gun{
	
	public void slash() {
		System.out.println("칼을 휘두릅니다.");
	}
}
package p08.ex3;

public class SoundableEx {
	public static void main(String[] args) {
	Cat cat = new Cat();
	Dog dog = new Dog();
	
	printSound(cat);
	printSound(dog);
	
	
	}
	
	public static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
		
	}
}

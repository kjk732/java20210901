package p10.exception.quiz02;

public class ex6 {
	
	public static void main(String[] args) {
		Animal animal = new Animal();
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		Dog dog1 = (Dog) animal;
		System.out.println("zzz");
		throw new ClassCastException();
	}
	
}
class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}



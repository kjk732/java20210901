package p03defult_method;

public interface Pet {

	void sit();
	default void roll() { //항상 public
		System.out.println("구른다");
	}
}

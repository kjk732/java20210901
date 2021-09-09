package p10.exception.throws_ex.quiz07;

public class WrongPasswordException extends Exception {
	public WrongPasswordException() {
	}
	public WrongPasswordException(String message) {
		super(message);
		
	}
}

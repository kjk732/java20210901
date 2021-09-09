package p10.exception.throws_ex;

public class ClassNotFoundException {
	
	public static void main(String[] args) {
	
		
		try {
			Class.forName("aaaa");
		} catch (java.lang.ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
}
	
}

package p11api.p03lecture.p01string;

public class Ex03Length {

	public static void main(String[] args) {
		
		
		String s1 = "java";
		System.out.println(s1.length());
		
		
		String s2 = "spring";
		System.out.println(s2.length());
		
		String s3 = " java";
		System.out.println(s3.length());
		
		String s4 = "                      ";
		System.out.println(s4.length());
		
		String s5 = "j\ta";//tab(8번띄어쓰기)도 1글자
		System.out.println(s5.length());
	}
}

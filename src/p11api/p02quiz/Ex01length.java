package p11api.p02quiz;

import java.util.Scanner;

public class Ex01length {

	//scanner
	//loop
	//입력받은 문자열이 몇 글자인지 출력하는 코드
	
	public static void main(String[] args) {
		
		String str = new String();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		str = sc.next();
		
		if ( str.equals("종료")) {
		
			System.out.println("종료합니다");
			break;
			
		}
		System.out.println(str.length() + "글자입니다.");
		
		}
	}
	
	
}

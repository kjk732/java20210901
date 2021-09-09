package p10.exception;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		
		
		while(run) {
			
			System.out.print("첫번째 수 입력");
			String str1 = sc.next();
			
			System.out.print("두번째 수 입력");
			String str2 = sc.next();
			
			try {
				int n1 = Integer.parseInt(str1);
				int n2 = Integer.parseInt(str2);
				
				System.out.println(n1 + n2);
	
			} catch(NumberFormatException e) {
				System.out.println("잘못 입력하셨습니다.");
			}
				
		}
		sc.close();
	}

}
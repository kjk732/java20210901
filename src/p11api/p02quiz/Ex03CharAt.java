package p11api.p02quiz;

import java.util.Scanner;

public class Ex03CharAt {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		while(true) {
		String str = sc.next();
		
		System.out.println(str.charAt(str.length()/2));
		
		}
	}
}

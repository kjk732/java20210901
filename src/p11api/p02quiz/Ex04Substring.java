package p11api.p02quiz;

import java.util.Scanner;

public class Ex04Substring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {

			String str1 = sc.next();
			int len = str1.length();

			System.out.println("앞절반: " + str1.substring(0, len / 2));
			System.out.println("뒤절반: " + str1.substring(len / 2, len));

		}
	}
}

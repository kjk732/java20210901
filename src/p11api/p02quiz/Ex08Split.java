package p11api.p02quiz;

import java.util.Scanner;

public class Ex08Split {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("입력문자열: ");
			String input = sc.nextLine();

			System.out.print("구분자: ");
			String dm = sc.nextLine();

			String[] Arr = input.split(dm);

			for (String result : Arr) {
				System.out.println(result);

			}
		
		}
		
	}
}

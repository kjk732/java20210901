package p18io.p02quiz;

import java.io.FileWriter;

import java.io.Writer;
import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) throws Exception {
		
		String name = "C:\\Users\\kjk73\\OneDrive\\바탕 화면\\iotest\\outtestD.txt";
		Writer wr = new FileWriter(name);
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("입력:");
			String a = sc.nextLine();
			if(a.equals("exit")) {
				break;
			}else {
			wr.write(a);
			wr.write("\n");
			}
		}wr.close();
		
	}
}

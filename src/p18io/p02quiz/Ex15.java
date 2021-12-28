package p18io.p02quiz;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) throws Exception {

		OutputStream os = getOutputStream("C:\\Users\\kjk73\\OneDrive\\바탕 화면\\iotest\\outtestI.txt");
		Writer wr = new OutputStreamWriter(os);
		Scanner sc = new Scanner(System.in);

		String input = null;
		boolean run = true;
		while (run) {
			System.out.print("입력:");
			input = sc.nextLine();

			if (input.equals("exit")) {
				break;
			}
			
			wr.write(input);
			wr.write("\n");

		}

		System.out.println("종료");
		sc.close();
		wr.close();
		os.close();
	}

	public static OutputStream getOutputStream(String file) throws Exception {

		return new FileOutputStream(file);
	}
}

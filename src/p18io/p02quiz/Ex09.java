package p18io.p02quiz;

import java.io.FileWriter;
import java.io.Writer;

public class Ex09 {
	public static void main(String[] args) throws Exception {
		String fileName = "C:\\Users\\kjk73\\OneDrive\\바탕 화면\\iotest\\outter08.txt";
		Writer wr = new FileWriter(fileName);

		for(int i = 65 ;  i< 91 ; i++) {
			wr.write(i);
		}
		System.out.println("종료");
		wr.close();
	}
}


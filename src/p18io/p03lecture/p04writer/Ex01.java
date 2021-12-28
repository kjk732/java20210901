package p18io.p03lecture.p04writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Ex01 {

	public static void main(String[] args) throws Exception {
		String fileName = "C:\\Users\\kjk73\\OneDrive\\바탕 화면\\iotest\\outter05.txt";
		Writer wr = new FileWriter(fileName);

		wr.write('a');
		wr.write('A');
		wr.write(65);
		wr.write('가');
		System.out.println("종료");
		wr.close();
	}
}

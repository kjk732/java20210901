package p18io.p03lecture.p03reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class Ex01 {

	public static void main(String[] args) throws Exception {
		
		String fileName = "C:\\Users\\kjk73\\OneDrive\\바탕 화면\\iotest\\test3.txt";
		Reader r = new FileReader(fileName);
		
		int c1 = r.read();
		int c2 = r.read();
		int c3 = r.read();
		int c4 = r.read();
		int c5 = r.read();
		
		System.out.println((char)c1);
		System.out.println((char)c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		
		
		r.close();
	}
}

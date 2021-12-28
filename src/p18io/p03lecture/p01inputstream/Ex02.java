package p18io.p03lecture.p01inputstream;

import java.io.FileInputStream;
import java.io.InputStream;

public class Ex02 {
	public static void main(String[] args) throws Exception  {
		
		String file = "C:\\Users\\kjk73\\OneDrive\\바탕 화면\\iotest\\text1.txt";
		InputStream is = new FileInputStream(file);
		
		System.out.println("프로그램 종료");
		is.close();
	}
}

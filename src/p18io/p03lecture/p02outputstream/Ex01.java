package p18io.p03lecture.p02outputstream;


import java.io.FileOutputStream;
import java.io.OutputStream;

public class Ex01 {

	public static void main(String[] args) throws Exception {
		
		String file = "C:\\Users\\kjk73\\OneDrive\\바탕 화면\\iotest\\outtest1.txt";
		OutputStream os = new FileOutputStream(file);
	
		os.write(65);
		os.write(66);
		System.out.println("프로그램종료");
		
		os.close();
	}
}

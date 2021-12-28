package p18io.p03lecture.p01inputstream;

import java.io.FileInputStream;
import java.io.InputStream;

public class Ex03 {

	public static void main(String[] args) throws Exception {
		String file = "C:\\Users\\kjk73\\OneDrive\\바탕 화면\\iotest\\test2.txt";
		InputStream is = new FileInputStream(file);
		
		byte[] data = new byte[10];
		
		int dataSize1 = is.read(data);
		int dataSize2 = is.read(data);
		int dataSize3 = is.read(data);
		int dataSize4 = is.read(data);
		int dataSize5 = is.read(data);
		
		
		System.out.println(dataSize1);
		System.out.println(dataSize2);
		System.out.println(dataSize3);
		System.out.println(dataSize4);
		System.out.println(dataSize5);
		
		is.close();
	}
}

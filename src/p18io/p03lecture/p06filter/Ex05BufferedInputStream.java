package p18io.p03lecture.p06filter;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class Ex05BufferedInputStream {

	public static void main(String[] args) throws Exception {

		String file = "C:\\Users\\kjk73\\OneDrive\\바탕 화면\\iotest\\outtestF.txt";
		InputStream is =new FileInputStream(file);
		BufferedInputStream bi = new BufferedInputStream(is);
		
		
		long start = System.currentTimeMillis();
		while (bi.read()!= -1) {
			
			
		}
		long end =System.currentTimeMillis();
		System.out.println((end -start) + "ms");
		
		bi.close();
		is.close();
	}
}

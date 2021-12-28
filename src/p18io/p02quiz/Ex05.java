package p18io.p02quiz;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex05 {
	public static void main(String[] args) throws Exception {
		String file = "C:\\Users\\kjk73\\OneDrive\\바탕 화면\\iotest\\output05.txt";
		OutputStream os = new FileOutputStream(file);
		
		byte[] a =new byte[1024];
		for( int i = 0 ; i < 1024 ; i++) {
			os.write(a);
		}
		
		os.close();
	}
}

package p18io.p02quiz;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex04 {
	public static void main(String[] args) throws Exception {
		String in_file = "C:\\Users\\kjk73\\OneDrive\\바탕 화면\\iotest\\g.png";
		InputStream is = new FileInputStream(in_file);
		String out_file = "C:\\Users\\kjk73\\OneDrive\\바탕 화면\\iotest\\outtest3.png";
		OutputStream os = new FileOutputStream(out_file);
		
		
		byte[] data = new byte[100];
		
		while(is.read(data) != -1) {
			os.write(data);
		}
		is.close();
		os.close();
	}
}

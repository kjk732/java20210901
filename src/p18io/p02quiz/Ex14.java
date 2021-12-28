package p18io.p02quiz;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex14 {

	public static void main(String[] args) throws Exception {

		String src = "C:\\Users\\kjk73\\OneDrive\\바탕 화면\\iotest\\outtestF.txt";
		String des = "C:\\Users\\kjk73\\OneDrive\\바탕 화면\\iotest\\outtestG.txt";

		InputStream is = new FileInputStream(src);
		BufferedInputStream bis = new BufferedInputStream(is);
		
		OutputStream os = new FileOutputStream(des);
		BufferedOutputStream bos = new BufferedOutputStream(os);
		
		int cnt =0;
		
		while((cnt = bis.read()) !=-1) {
			
			bos.write(cnt);
		}
		
		bis.close();
		bos.close();
		is.close();
		os.close();
	}
}
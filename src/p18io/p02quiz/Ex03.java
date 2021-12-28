package p18io.p02quiz;


import java.io.FileOutputStream;
import java.io.OutputStream;

public class Ex03 {

	public static void main(String[] args) throws Exception {
		String file = "C:\\Users\\kjk73\\OneDrive\\바탕 화면\\iotest\\outtest2.txt";
		OutputStream os = new FileOutputStream(file);
		
		for(int i = 0 ; i < 1024; i++) {
			int a= (int)((Math.random()*26)+65);
			os.write(a);
		}
		os.close();
	}
}

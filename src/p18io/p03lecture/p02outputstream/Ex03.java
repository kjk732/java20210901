package p18io.p03lecture.p02outputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex03 {

	public static void main(String[] args) throws Exception {

		InputStream is = new FileInputStream("C:\\Users\\kjk73\\OneDrive\\바탕 화면\\iotest\\g.png");
		OutputStream os = new FileOutputStream("C:\\Users\\kjk73\\OneDrive\\바탕 화면\\iotest\\outtest6.png");

		byte[] datas = new byte[100];

		for (int i = 0; i < 191; i++) {
			if (i == 190) {
				is.read(datas);
				os.write(datas, 0, 91);
			} else {
				is.read(datas);
				os.write(datas);

			}

		}
		is.close();
		os.close();
	}
}

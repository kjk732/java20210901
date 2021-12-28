package p18io.p03lecture.p06filter;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;


public class Ex11MultiFilter {

	public static void main(String[] args) throws Exception {
		String file = "C:\\Users\\kjk73\\OneDrive\\바탕 화면\\iotest\\outtestJ.txt";

		InputStream is = new FileInputStream(file);
		Reader rd = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(rd);
		
		// inputStream to Reader
		// Reader를 BufferedReader로 감싸서 (BufferedReader의 변수 br)
		String line = "";
		
		// 읽어서 출력
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}

		System.out.println("종료");
		br.close();
		rd.close();
		is.close();
	}

}

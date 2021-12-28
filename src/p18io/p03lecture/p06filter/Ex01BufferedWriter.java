package p18io.p03lecture.p06filter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Ex01BufferedWriter {
	public static void main(String[] args) throws Exception {

		String name = "C:\\Users\\kjk73\\OneDrive\\바탕 화면\\iotest\\outtestE.txt";
		Writer wr =new FileWriter(name);
		char[] datas = new char[1024];
		
		for(int i= 0; i< datas.length; i++) {
			datas[i] = (char)(((int) Math.random() * 26) + 'a');
		}
		wr.write(datas);
		System.out.println("확인");
		wr.close();
	}
}

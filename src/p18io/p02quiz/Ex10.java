package p18io.p02quiz;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;

public class Ex10 {

	public static void main(String[] args) throws Exception {
		
		String src = "C:\\Users\\kjk73\\OneDrive\\바탕 화면\\iotest\\test9.txt";
		String des = "C:\\Users\\kjk73\\OneDrive\\바탕 화면\\iotest\\outtest9.txt";
		String a = "";
		
		FileReader rd = new FileReader(src);
		Writer wr = new FileWriter(des);
		
		char[] datas =new char[4];
		int cnt = 0;
		
		while((cnt = rd.read(datas))!= -1) {
			for(int i = cnt-1 ; i >=0 ; i--) {
				
				a += datas[i];
			}
		}
		System.out.println(a);
	}
}

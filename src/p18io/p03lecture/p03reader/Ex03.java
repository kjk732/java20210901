package p18io.p03lecture.p03reader;

import java.io.FileReader;
import java.util.Arrays;

public class Ex03 {

	public static void main(String[] args) throws Exception {
		String name = "C:\\Users\\kjk73\\OneDrive\\바탕 화면\\iotest\\test4.txt";
		FileReader fr = new FileReader(name);
		char[] datas =new char[3];
		
		fr.read(datas);
		System.out.println(Arrays.toString(datas));
		
		fr.read(datas);
		System.out.println(Arrays.toString(datas));
		
		fr.read(datas);
		System.out.println(Arrays.toString(datas));
		
		fr.read(datas);
		System.out.println(Arrays.toString(datas)); // 뒤에 두개는 필요없는 값
		
		fr.close();
	}
}

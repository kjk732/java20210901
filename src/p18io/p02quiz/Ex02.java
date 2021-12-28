package p18io.p02quiz;

import java.io.FileInputStream;
import java.io.InputStream;

public class Ex02 {
	public static void main(String[] args) throws Exception {
		String name = "C:\\Users\\kjk73\\OneDrive\\바탕 화면\\iotest\\g.png";
		InputStream is = new FileInputStream(name);
		
		byte[] data = new byte[100];
		int cnt = 0;
		int fileSize = 0;
		
//		while () // InputStream.read(byte[]) 를 활용해서 file 크기 계산
		
		while((cnt = is.read(data))!=-1) {
			
			fileSize += cnt;
		}
		
		System.out.println("파일크기:" + fileSize + "bytes"); // 파일크기:6778bytes
		System.out.println("프로그램 종료");
		is.close();
	}
}

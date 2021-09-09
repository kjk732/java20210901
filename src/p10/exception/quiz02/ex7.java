package p10.exception.quiz02;

import java.io.FileNotFoundException;

public class ex7 {

	public static void main(String[] args) {
		
		
		try {
		throw new FileNotFoundException(); // 일반예외
		}catch(FileNotFoundException e) {
			System.out.println("파일못찾음");
		}
		
		}
}

package p10.exception.throws_ex;

import java.io.IOException;
import java.io.InputStreamReader;

public class ex08 {

	public static void main(String[] args) throws IOException {
		
		
		InputStreamReader isr = new InputStreamReader(System.in);
		
		isr.close();
	}
}

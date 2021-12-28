package p18io.p03lecture.p07network;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Ex05ClientGetText {

	public static void main(String[] args) throws Exception {
		
		Socket socket = new Socket();
		socket.connect(new InetSocketAddress("192.168.0.2" , 33333));
		
		InputStream is = socket.getInputStream();
		Reader rd = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(rd);
		
		String line = null;
		while((line = br.readLine()) != null) {
			System.out.println("출력:" + line);
		}
		br.close();
		socket.close();
	}
}

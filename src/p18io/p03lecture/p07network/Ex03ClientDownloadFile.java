package p18io.p03lecture.p07network;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Ex03ClientDownloadFile {

	public static void main(String[] args) throws Exception  {
		
		Socket socket = new Socket();
		
		socket.connect(new InetSocketAddress("192.168.0.2" , 33333));
		
		OutputStream os = new FileOutputStream("C:\\Users\\kjk73\\OneDrive\\바탕 화면\\iotest\\서버.png");
		BufferedOutputStream bos = new BufferedOutputStream(os);
		InputStream is = socket.getInputStream();
		BufferedInputStream bis = new BufferedInputStream(is);
		
		System.out.println("파일 받기 시작 +++++");
		int data = 0;
		while((data = bis.read()) != -1) {
			bos.write(data);
		}
		System.out.println("파일 받기 완료+++++");
		bis.close();
		bos.close();
		socket.close();
	}
}

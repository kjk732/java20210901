package p18io.p03lecture.p07network;


import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;


public class Ex07WebServerResponse {

	public static void main(String[] args) throws Exception {
		ServerSocket serverSocket = new ServerSocket();
		serverSocket.bind(new InetSocketAddress("192.168.0.2", 33333));
		
		System.out.println("연결준비");
		Socket socket = serverSocket.accept();
		System.out.println("연결완료");
		
		OutputStream os = socket.getOutputStream();
		Writer wr = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(wr);
		
		bw.write("HTTp/1.1 200 OK");
		bw.newLine();
		bw.write("Content-Type: text/html; charset=utf-8");
		bw.write("Content-Length:21");
		bw.newLine();
		bw.newLine();
		bw.write("<h1>hello client</h1>");
		
		bw.close();
		socket.close();
		serverSocket.close();
		
		
	}
}

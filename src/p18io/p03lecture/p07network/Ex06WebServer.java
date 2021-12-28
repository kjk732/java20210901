package p18io.p03lecture.p07network;

import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex06WebServer {

	public static void main(String[] args) {
		ServerSocket serverSocket = new ServerSocket();
		serverSocket.bind(new InetSocketAddress("192.168.0.2", 33333));
		
		System.out.println("연결 준비");
		Socket socket = serverSocket.accept();
		
		InputStream is = socket.
		
	}
}

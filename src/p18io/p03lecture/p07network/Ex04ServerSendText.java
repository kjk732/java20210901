package p18io.p03lecture.p07network;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Ex04ServerSendText {

	public static void main(String[] args) throws Exception {
		ServerSocket serverSocket = new ServerSocket();
		serverSocket.bind(new InetSocketAddress("192.168.0.2" , 33333));
		
		System.out.println("연결 준비 ======");
		Socket socket = serverSocket.accept();
		System.out.println("연결 완료 ======");
		
		Scanner sc =new Scanner(System.in);
		OutputStream os = socket.getOutputStream();
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		
		String input = null;
		boolean run = true;
		while(run) {
			System.out.print("입력:");
			input = sc.nextLine();
			
			if (input.equals("exit")) break;
			
			bw.write(input);
			bw.newLine();
		}
		
		bw.close();
		sc.close();
		socket.close();
		serverSocket.close();
			
		
	}
}

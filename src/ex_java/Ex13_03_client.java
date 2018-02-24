package ex_java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Ex13_03_client {

	public static void main(String[] args) throws IOException {

		Socket socket= null;
		PrintWriter out = null;
		BufferedReader in = null;
		
		try {
			socket = new Socket("localhost", 5555);//(아이피주소, ) 내컴퓨터라서 아이피주소를 localhost로 만듬 (127.0.0.1)도 내컴퓨터라는뜻
			out = new PrintWriter(socket.getOutputStream());//socket.getOutputStream() 소켓을 통해 데이터를 보내는것 //PrintWriter 이걸써서 2바이트(한글) 데이터를 이용하기위해서
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
		} catch (UnknownHostException e) {
			System.out.println("locallhost에 접근할 수 없습니다.");
			System.exit(1);
		} catch (IOException e) {
			System.out.println("입출력오류");
			System.exit(1);
			
		}
		
		
		BufferedReader user = new BufferedReader(new InputStreamReader(System.in));
		
		//String fromServer;
		String fromUser;
		
		System.out.println("문자입력");
		fromUser=user.readLine();
		System.out.println("클라이언트:"+fromUser);
		out.println(fromUser);//
		
		out.close();
		in.close();
		socket.close();
		
	}

}

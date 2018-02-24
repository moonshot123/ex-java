package ex_java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
// javac: 컴파일 
// dir: 디렉토리 보기
// cd: 디렉토리로 이동
// cd src: src 디렉토리로 가기
public class Ex13_03_sever {

	public static void main(String[] args) throws IOException {
		
		ServerSocket serverSocket = null;// 서버와 클라이언트를 연결하기위한 문같은 존재
		//그래서 서버와 클라이언트 둘다에 넣어줘야됨
		
		try {
			serverSocket = new ServerSocket(5555);
		} catch (IOException e) {
			System.out.println("다음의 포드번호에 연결할 수 없습니다.:5555");
			System.exit(1);// 정상종료:0    비정상종료:1
		}
		
		
		
		
		Socket clientsocket =null;
		try {
			System.out.println("서버준비");
			clientsocket = serverSocket.accept();//accept 를 통해서 요청한 정보를 받아들인다. // 접속할때 까지 기다림
			System.out.println("요청접수함");
		} catch (IOException e) {
			System.out.println("accept()실패");
			System.exit(1);
		}
		
		BufferedReader in  = new BufferedReader(new InputStreamReader(clientsocket.getInputStream()));
		
		String inputline;
		inputline = in.readLine();
		System.out.println("클라이언트에서 나오는 데이터"+inputline);
		
		in.close();
		clientsocket.close();
		serverSocket.close();
		
		
	}

}

package quiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class QuizServer {

	public static void main(String[] args) throws IOException {
		
		ServerSocket serverSocket=null;
		
		try {
			serverSocket = new ServerSocket(9991);
			
		} catch (IOException e) {
			System.err.println("다음의 포트번호에 연결할 수 없습니다.:9991");
			System.exit(1);
		}
		
		Socket clientsocket = null; //clientsocket 는 서버로 들어오는 클라이언트의 모든정보
		
		try {
			System.out.println("서버준비");
			clientsocket = serverSocket.accept();
		} catch (IOException e) {
			System.err.println("accept() 실패");
			System.exit(1);
		}
		//PrintWriter 버퍼기능있음
		PrintWriter out = new PrintWriter(clientsocket.getOutputStream(),true);// 정보를 보내는 연결다리   true는 데이터가 남지 않도록 자동으로 내보내도록 하려고
		BufferedReader in = new BufferedReader(new InputStreamReader(clientsocket.getInputStream()));// 정보를 받는 연결다리
		
		String inputLine, outputLine;
		QuizProtocol qp =new QuizProtocol();//QuizProtocol 프로토콜로 접근하도록객체생성
		outputLine = qp.process(null);
		out.println(outputLine);
		//null도 스트링 타입
		while((inputLine = in.readLine()) != null){
			outputLine =qp.process(inputLine);
			out.println(outputLine);
			if(outputLine.equals("quiz")){
				break;
			}
			out.close();
			in.close();
			clientsocket.close();
			serverSocket.close();
		}
		
	}

}

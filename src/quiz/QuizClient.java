package quiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class QuizClient {

	public static void main(String[] args) throws IOException {
		
		Socket quizsocket = null;
		PrintWriter out = null;
		BufferedReader in = null;
		
		try {
			quizsocket = new Socket("localhost",9991);
			
			out = new PrintWriter(quizsocket.getOutputStream(),true);
			in = new BufferedReader(new InputStreamReader(quizsocket.getInputStream())); // 
			
		} catch (UnknownHostException e) {
			System.err.println("localhost에 접근 할수 없습니다.");
			System.exit(1);
		} catch (IOException e) {
			System.err.println("입출력오류.");
			System.exit(1);
		}
		
		
		BufferedReader user = new BufferedReader(new InputStreamReader(System.in));
		
		
		
		String fromServer;
		String fromUser;
		
		while((fromServer = in.readLine()) != null){//in.readLine() 서버에서 들어오는걸 읽어내겠따
			System.out.println("서버:"+fromServer);
			if(fromServer.equals("quiz")){
				break;
			}
			
			fromUser = user.readLine();//user.readLine() 클라이언트가 입력한내용
			
			if(fromUser != null){
				System.out.println("클라이언트"+fromUser);
				out.println(fromUser);
			}
			out.close();
			in.close();
			quizsocket.close();
			
			
		}
		
	}

}

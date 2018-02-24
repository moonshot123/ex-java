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
			System.err.println("localhost�� ���� �Ҽ� �����ϴ�.");
			System.exit(1);
		} catch (IOException e) {
			System.err.println("����¿���.");
			System.exit(1);
		}
		
		
		BufferedReader user = new BufferedReader(new InputStreamReader(System.in));
		
		
		
		String fromServer;
		String fromUser;
		
		while((fromServer = in.readLine()) != null){//in.readLine() �������� �����°� �о�ڵ�
			System.out.println("����:"+fromServer);
			if(fromServer.equals("quiz")){
				break;
			}
			
			fromUser = user.readLine();//user.readLine() Ŭ���̾�Ʈ�� �Է��ѳ���
			
			if(fromUser != null){
				System.out.println("Ŭ���̾�Ʈ"+fromUser);
				out.println(fromUser);
			}
			out.close();
			in.close();
			quizsocket.close();
			
			
		}
		
	}

}

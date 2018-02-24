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
			socket = new Socket("localhost", 5555);//(�������ּ�, ) ����ǻ�Ͷ� �������ּҸ� localhost�� ���� (127.0.0.1)�� ����ǻ�Ͷ�¶�
			out = new PrintWriter(socket.getOutputStream());//socket.getOutputStream() ������ ���� �����͸� �����°� //PrintWriter �̰ɽἭ 2����Ʈ(�ѱ�) �����͸� �̿��ϱ����ؼ�
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
		} catch (UnknownHostException e) {
			System.out.println("locallhost�� ������ �� �����ϴ�.");
			System.exit(1);
		} catch (IOException e) {
			System.out.println("����¿���");
			System.exit(1);
			
		}
		
		
		BufferedReader user = new BufferedReader(new InputStreamReader(System.in));
		
		//String fromServer;
		String fromUser;
		
		System.out.println("�����Է�");
		fromUser=user.readLine();
		System.out.println("Ŭ���̾�Ʈ:"+fromUser);
		out.println(fromUser);//
		
		out.close();
		in.close();
		socket.close();
		
	}

}

package ex_java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
// javac: ������ 
// dir: ���丮 ����
// cd: ���丮�� �̵�
// cd src: src ���丮�� ����
public class Ex13_03_sever {

	public static void main(String[] args) throws IOException {
		
		ServerSocket serverSocket = null;// ������ Ŭ���̾�Ʈ�� �����ϱ����� ������ ����
		//�׷��� ������ Ŭ���̾�Ʈ �Ѵٿ� �־���ߵ�
		
		try {
			serverSocket = new ServerSocket(5555);
		} catch (IOException e) {
			System.out.println("������ �����ȣ�� ������ �� �����ϴ�.:5555");
			System.exit(1);// ��������:0    ����������:1
		}
		
		
		
		
		Socket clientsocket =null;
		try {
			System.out.println("�����غ�");
			clientsocket = serverSocket.accept();//accept �� ���ؼ� ��û�� ������ �޾Ƶ��δ�. // �����Ҷ� ���� ��ٸ�
			System.out.println("��û������");
		} catch (IOException e) {
			System.out.println("accept()����");
			System.exit(1);
		}
		
		BufferedReader in  = new BufferedReader(new InputStreamReader(clientsocket.getInputStream()));
		
		String inputline;
		inputline = in.readLine();
		System.out.println("Ŭ���̾�Ʈ���� ������ ������"+inputline);
		
		in.close();
		clientsocket.close();
		serverSocket.close();
		
		
	}

}

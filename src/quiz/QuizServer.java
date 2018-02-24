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
			System.err.println("������ ��Ʈ��ȣ�� ������ �� �����ϴ�.:9991");
			System.exit(1);
		}
		
		Socket clientsocket = null; //clientsocket �� ������ ������ Ŭ���̾�Ʈ�� �������
		
		try {
			System.out.println("�����غ�");
			clientsocket = serverSocket.accept();
		} catch (IOException e) {
			System.err.println("accept() ����");
			System.exit(1);
		}
		//PrintWriter ���۱������
		PrintWriter out = new PrintWriter(clientsocket.getOutputStream(),true);// ������ ������ ����ٸ�   true�� �����Ͱ� ���� �ʵ��� �ڵ����� ���������� �Ϸ���
		BufferedReader in = new BufferedReader(new InputStreamReader(clientsocket.getInputStream()));// ������ �޴� ����ٸ�
		
		String inputLine, outputLine;
		QuizProtocol qp =new QuizProtocol();//QuizProtocol �������ݷ� �����ϵ��ϰ�ü����
		outputLine = qp.process(null);
		out.println(outputLine);
		//null�� ��Ʈ�� Ÿ��
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

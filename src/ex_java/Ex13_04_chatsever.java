package ex_java;
/*import java.awt.BorderLayout;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import javax.swing.*;

public class Ex13_04_ChatServer extends JFrame implements ActionListener {
	
	BufferedReader in = null;
	BufferedWriter out = null;
	
	ServerSocket listener = null;
	Socket socket = null;
	
	JTextField serverMessage;
	JScrollPane spane;
	Receiver clientMessage;
	
	
	public Ex13_04_ChatServer() {
		setTitle("���� ä�� â");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		// Ŭ���̾�Ʈ���� ���� �޽����� ����� ������Ʈ
		clientMessage = new Receiver(); 
		
		clientMessage.setEditable(false); // ���� �Ұ�
		
		// Ŭ���̾�Ʈ���� �޽��� ������ ���� ������ ����
		Thread t = new Thread(clientMessage); 
		
		serverMessage = new JTextField();
		serverMessage.addActionListener(this); //�ؽ�Ʈ �ʵ忡 �Է��� �ϰ� ���͸� ġ�� �׼Ǹ����ʰ� ���⵵�� �ϰ� this�� �׼������带 ȣ����  
		spane = new JScrollPane(clientMessage); 
							
		
		add(spane,BorderLayout.CENTER);
		add(serverMessage,BorderLayout.SOUTH);
		setSize(400, 200); 
		setVisible(true); 
		
		try {
			setupConnection();
		} catch (IOException e) {
			handleError(e.getMessage());//� �������� Ȯ���ϴ°�
			e.printStackTrace();
		}
		t.start();
	}
	
	private void setupConnection() throws IOException {// Ŭ���̾�Ʈ�� ������ �ް� ����ϴ� �������
		// ���� ��ȣ �ٸ���, accept,InputStreamReader ���� ������ ����µ� �̰��� 
		listener = new ServerSocket(9999); // ���� ���� �����. 
		socket = listener.accept(); // Ŭ���̾�Ʈ�κ��� ���� ��û ���
		System.out.println("�����");// socket���� ����(��������)
		
		in = new BufferedReader(new InputStreamReader(
				socket.getInputStream())); // Ŭ���̾�Ʈ�κ����� �Է� ��Ʈ�� (�Է������� �޾ƿ��� �ڵ�)
		
		out = new BufferedWriter(new OutputStreamWriter(
				socket.getOutputStream())); // Ŭ���̾�Ʈ���� ��� ��Ʈ�� ()
	}
	
	public static void main(String[] args) {
		Ex13_04_ChatServer frame = new Ex13_04_ChatServer();
	}

	private static void handleError(String string) {
		System.out.println(string);
		System.exit(1); 
	}
	
	
	
	
	
	
}



*/
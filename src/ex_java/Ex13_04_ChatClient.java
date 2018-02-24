package ex_java;
import java.awt.BorderLayout;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import javax.swing.*;


public class Ex13_04_ChatClient extends JFrame implements ActionListener {
	BufferedReader in = null;
	BufferedWriter out = null;
	Socket socket = null;
	Receiver serverMessage;
	JTextField clientMessage;
	JScrollPane spane;
	
	public Ex13_04_ChatClient() {
		setTitle("Ŭ���̾�Ʈ ä�� â"); // ������ Ÿ��Ʋ
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		serverMessage = new Receiver(); 
		serverMessage.setEditable(false); // ���� �Ұ�
		
		// �������� �޽��� ������ ���� ������ ����
		Thread t = new Thread(serverMessage); 
		
		clientMessage = new JTextField();
		clientMessage.addActionListener(this);
		
		spane = new JScrollPane(serverMessage); 
		add(spane,BorderLayout.CENTER);
		add(clientMessage,BorderLayout.SOUTH);
		setSize(400, 200); 
		setVisible(true); 
		
		try {
			setupConnection();
		} catch (IOException e) {
			handleError(e.getMessage());
		}
		t.start();
	}
	
	private void setupConnection() throws IOException {

		// Ŭ���̾�Ʈ ���� ����
		socket = new Socket("localhost", 9999); //("localhost", 9999) localhost�� ip�� 9999�� ��Ʈ�� ���� ���Ͽ���
		System.out.println("�����");
		
		in = new BufferedReader(new InputStreamReader(
				socket.getInputStream())); // Ŭ���̾�Ʈ�κ����� �Է� ��Ʈ��
		
		out = new BufferedWriter(new OutputStreamWriter(
				socket.getOutputStream())); // Ŭ���̾�Ʈ���� ��� ��Ʈ��
	}
	
	public static void main(String[] args) {
		Ex13_04_ChatClient frame = new Ex13_04_ChatClient();
	}

	private static void handleError(String string) {
		System.out.println(string);
		System.exit(1);
	}
	
	private class Receiver extends JTextArea implements Runnable {
		@Override
		public void run() {
			String inputMessage=null;
			while (true) {
				try {
					// Ŭ���̾�Ʈ���� �� ���� ���ڿ� ����
					inputMessage = in.readLine(); 
				} catch (IOException e) {
					handleError(e.getMessage());
				} 
				serverMessage.append("\n" + inputMessage);
				int pos = serverMessage.getText().length();
				serverMessage.setCaretPosition(pos); 
				
			}
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == clientMessage) {
			String outputMessage = clientMessage.getText();// ������clientMessage �� outputMessage ����
			
			try {
				out.write("Ŭ���̾�Ʈ>" + outputMessage+"\n"); 
				out.flush();
				serverMessage.append("\nŬ���̾�Ʈ>" + outputMessage);//append
				int pos = serverMessage.getText().length();
				serverMessage.setCaretPosition(pos); 
				clientMessage.setText(null); // �Է�â�� ���ڿ� ����
			} catch (IOException e1) {
				handleError(e1.getMessage());
			}
		}
	}
}


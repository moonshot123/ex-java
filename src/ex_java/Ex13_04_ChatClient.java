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
		setTitle("클라이언트 채팅 창"); // 프레임 타이틀
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		serverMessage = new Receiver(); 
		serverMessage.setEditable(false); // 편집 불가
		
		// 서버에서 메시지 수신을 위한 스레드 생성
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

		// 클라이언트 소켓 생성
		socket = new Socket("localhost", 9999); //("localhost", 9999) localhost의 ip로 9999의 포트를 통해 소켓연결
		System.out.println("연결됨");
		
		in = new BufferedReader(new InputStreamReader(
				socket.getInputStream())); // 클라이언트로부터의 입력 스트림
		
		out = new BufferedWriter(new OutputStreamWriter(
				socket.getOutputStream())); // 클라이언트로의 출력 스트림
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
					// 클라이언트에서 한 행의 문자열 읽음
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
			String outputMessage = clientMessage.getText();// 내가쓴clientMessage 를 outputMessage 저장
			
			try {
				out.write("클라이언트>" + outputMessage+"\n"); 
				out.flush();
				serverMessage.append("\n클라이언트>" + outputMessage);//append
				int pos = serverMessage.getText().length();
				serverMessage.setCaretPosition(pos); 
				clientMessage.setText(null); // 입력창의 문자열 지움
			} catch (IOException e1) {
				handleError(e1.getMessage());
			}
		}
	}
}


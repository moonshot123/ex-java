package ex_java;
import java.awt.BorderLayout;
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
		setTitle("서버 채팅 창");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		// 클라이언트에서 받은 메시지를 출력할 컴포넌트
		clientMessage = new Receiver(); 
		
		clientMessage.setEditable(false); // 편집 불가
		
		// 클라이언트에서 메시지 수신을 위한 스레드 생성
		Thread t = new Thread(clientMessage); 
		
		serverMessage = new JTextField();
		serverMessage.addActionListener(this);
		spane = new JScrollPane(clientMessage); 
							
		
		add(spane,BorderLayout.CENTER);
		add(serverMessage,BorderLayout.SOUTH);
		setSize(400, 200); 
		setVisible(true); 
		
		try {
			setupConnection();
		} catch (IOException e) {
			handleError(e.getMessage());
			e.printStackTrace();
		}
		t.start();
	}
	
	private void setupConnection() throws IOException {
		
		listener = new ServerSocket(9999); //9999 포트번호
		socket = listener.accept(); // 클라이언트로부터 연결 요청 대기
		System.out.println("연결됨");
		
		in = new BufferedReader(new InputStreamReader(// 데이터 읽기
				socket.getInputStream())); // 클라이언트로부터의 입력 스트림
		
		out = new BufferedWriter(new OutputStreamWriter(// 데이터 쓰긴
				socket.getOutputStream())); // 클라이언트로의 출력 스트림
	}
	
	public static void main(String[] args) {
		Ex13_04_ChatServer frame = new Ex13_04_ChatServer();
	}

	private static void handleError(String string) {
		System.out.println(string);
		System.exit(1); 
	}
	
		
	private class Receiver extends JTextArea implements Runnable {
		@Override
		public void run() { //Runnable을 구현 했으므로...
			// 클라이언트가 보내온 내용을 서버창에 출력하는 기능
			
			String inputMessage=null;
			while (true) {
				try {
					inputMessage = in.readLine(); 
					
				} catch (IOException e) {
					handleError(e.getMessage());
					e.printStackTrace();
				}
				clientMessage.append("\n" + inputMessage);
				
				int pos = clientMessage.getText().length();
				clientMessage.setCaretPosition(pos); 

			}
		}
	}

	// 서버에서 입력한 내용을 서버창과 클라이언트창에 출력하는 기능
	@Override
	public void actionPerformed(ActionEvent e) { 
		if (e.getSource() == serverMessage) { 
			String outputMessage = serverMessage.getText(); 
						
			try {
				out.write("서버>" + outputMessage+"\n"); 
				// 클라이언트로 문자열 전송
				out.flush(); 
				
				// 내창에 문자열 출력
				clientMessage.append("\n서버>" + outputMessage); 
				int pos = clientMessage.getText().length();// 클라이언트 공간의 모든 글자를 가지고 와서 글자수를 세는것
				clientMessage.setCaretPosition(pos); //CaretPosition(pos) pos의 숫자만큼의 글자수다음으로 이동하는뜻 그래서 위에다가 글자수를 샘
								// caret 포지션을 가장 마지막으로 이동
				serverMessage.setText(null); // 입력창의 문자열 지움  // 입력창을 지워줘야 입력할떄 편함
			} catch (IOException e1) {
				handleError(e1.getMessage());
				e1.printStackTrace();
			} 
		}
	}
}




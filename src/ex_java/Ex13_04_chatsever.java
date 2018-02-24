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
		setTitle("서버 채팅 창");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		// 클라이언트에서 받은 메시지를 출력할 컴포넌트
		clientMessage = new Receiver(); 
		
		clientMessage.setEditable(false); // 편집 불가
		
		// 클라이언트에서 메시지 수신을 위한 스레드 생성
		Thread t = new Thread(clientMessage); 
		
		serverMessage = new JTextField();
		serverMessage.addActionListener(this); //텍스트 필드에 입력을 하고 엔터를 치면 액션리스너가 생기도록 하고 this라서 액션퍼폼드를 호출함  
		spane = new JScrollPane(clientMessage); 
							
		
		add(spane,BorderLayout.CENTER);
		add(serverMessage,BorderLayout.SOUTH);
		setSize(400, 200); 
		setVisible(true); 
		
		try {
			setupConnection();
		} catch (IOException e) {
			handleError(e.getMessage());//어떤 예외인지 확인하는것
			e.printStackTrace();
		}
		t.start();
	}
	
	private void setupConnection() throws IOException {// 클라이언트의 정보를 받고 출력하는 기능을함
		// 소켓 번호 다를때, accept,InputStreamReader 등이 오류가 생기는데 이것을 
		listener = new ServerSocket(9999); // 서버 문을 만든다. 
		socket = listener.accept(); // 클라이언트로부터 연결 요청 대기
		System.out.println("연결됨");// socket정보 저장(누구인지)
		
		in = new BufferedReader(new InputStreamReader(
				socket.getInputStream())); // 클라이언트로부터의 입력 스트림 (입력정보를 받아오는 코드)
		
		out = new BufferedWriter(new OutputStreamWriter(
				socket.getOutputStream())); // 클라이언트로의 출력 스트림 ()
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
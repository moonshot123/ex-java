package ex_java;
import java.io.IOException;
import java.net.ServerSocket;

public class Ex13_02_port {
//현재 사용되고 있는 포트번호 알아내는 방법
	public static void main(String[] args) {
		
		ServerSocket ss = null;
		
		for (int i = 0; i<65535;i++){
			
			try {
				ss=new ServerSocket(i);// 현재 사용되고 있는 곳은 오류가 생기니 이렇게 코드를 짠듯
				ss.close();
			} catch (IOException e) {
				System.out.println(i+"포트는 이미사용중입니다.");				
			}
			
		}
		
	}

}

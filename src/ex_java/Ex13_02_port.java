package ex_java;
import java.io.IOException;
import java.net.ServerSocket;

public class Ex13_02_port {
//���� ���ǰ� �ִ� ��Ʈ��ȣ �˾Ƴ��� ���
	public static void main(String[] args) {
		
		ServerSocket ss = null;
		
		for (int i = 0; i<65535;i++){
			
			try {
				ss=new ServerSocket(i);// ���� ���ǰ� �ִ� ���� ������ ����� �̷��� �ڵ带 §��
				ss.close();
			} catch (IOException e) {
				System.out.println(i+"��Ʈ�� �̹̻�����Դϴ�.");				
			}
			
		}
		
	}

}

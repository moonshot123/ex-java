package ex_java;
// ��Ƽ������ ����  
// �������̱�
import java.util.Date;

import javax.swing.JOptionPane;

class Multi extends Thread{
	public void run(){ // ������� ����� ������ ������ run�� 
		for(int i=10;i>0;i--){
			System.out.println(new Date());//new Date() �ڸ��� �ٲ��ָ��
			try {
				sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.exit(0);
	}
}

public class Ex10_04_Thread {

	public static void main(String[] args) {
		Multi th1 =new Multi();
		th1.start();
		
		String input =JOptionPane.showInputDialog("�ƹ����̳� �Է��ϼ���");
		System.out.println("�Է��ϽŰ���"+input+"�Դϴ�.");
		
	}

}

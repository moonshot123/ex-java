package ex_java;
// 멀티스레드 기초  
// 숫자줄이기
import java.util.Date;

import javax.swing.JOptionPane;

class Multi extends Thread{
	public void run(){ // 쓰레드로 만들고 싶은건 무조건 run에 
		for(int i=10;i>0;i--){
			System.out.println(new Date());//new Date() 자리만 바꿔주면됨
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
		
		String input =JOptionPane.showInputDialog("아무값이나 입력하세요");
		System.out.println("입력하신값은"+input+"입니다.");
		
	}

}

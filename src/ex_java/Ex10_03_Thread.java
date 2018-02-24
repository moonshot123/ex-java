package ex_java;
//thread 만드는 방법 2가지
class Big extends Thread{// 1)Thread를 직접 받는다.
	public void run(){
		for(char i ='A'; i<='Z';i++){
			System.out.print(i+" ");
			try {
				Thread.sleep(1000);// 1000 = 1초  한번 실행하고 1초동안 멈췄다가 실행    >>>   sleep은 무조건 예외처리 해줘야됨
				sleep(1000);// 1000 = 1초  한번 실행하고 1초동안 멈췄다가 실행    >>>   아래의 것과 같지만 Thread를 상속받은것이기 떄문에 바로 sleep()메소드를 부를수도 있음
			} catch (InterruptedException e) {//예외가 발생하면 InterruptedException 객체를 만듬 
				e.printStackTrace();//자동 완성기능으로 만들면 나오는 메소드인데 어디에서 예외가 발생했는지 알려주는 메소드이다. // 꼭없어도 됨 있어되 상관없음 
			}
		}
		System.out.println();
	}
}

class Small implements Runnable{// 2)Runnable 인터페이스를 사용받는다.
	public void run(){
		for(char i ='a'; i<='z';i++){
			System.out.print(i+" ");
			try {
				Thread.sleep(1000);// 1000 = 1초  한번 실행하고 1초동안 멈췄다가 실행  
			} catch (InterruptedException e) {//예외가 발생하면 InterruptedException 객체를 만듬 
				e.printStackTrace();//자동 완성기능으로 만들면 나오는 메소드인데 어디에서 예외가 발생했는지 알려주는 메소드이다. // 꼭없어도 됨 있어되 상관없음 
			}
		}
		System.out.println();
	}
}


public class Ex10_03_Thread {

	public static void main(String[] args) {
		
		
		System.out.println("프로그램시작");
		
			Thread th = new Thread(new Small()); // 인터페이스로 만들어서 small클래스 자체를 객체로 만들어 주지 못하기 떄문에 Thread를 이용해서 객체를 만드는것 같다.???
			th.start();
			
			Big bth = new Big();// 이건직접 생성이 가능하기 떄문에 객체를 만듬?
			bth.start();
		
		System.out.println("프로그램종료");
		
		
	}

}


/*
//알파벳대문자
for(int i =65; i<91;i++){
	System.out.print((char)i+"");
}
System.out.println();

for(char i ='A'; i<='Z';i++){
	System.out.print(i+"");
}
System.out.println();
*/

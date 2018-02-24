package ex_java;
class DerivedThread extends Thread{// 쓰레드를 상속받는 방법 // DerivedThread 클래스가 다른 것을 상속받아야된다면 이건 못쓰고 runnable인터페이스를 이용하여 만들어야함 
	public void run(){
		for(int i=0; i<50;i++){
			System.out.print(i+" ");
		}
		System.out.println();
	}


}

public class Ex10_02_Thread {

	public static void main(String[] args) {
		System.out.println("시스템시작");
		DerivedThread d =new DerivedThread();// 쓰레드를 상속 받았기 떄문에 객체를 만들어서 쓰레드 만들기
		d.start();
		
		d=new DerivedThread();// 쓰레드를 사용할때는 객체를 다시만들어야 동시에돌아갈수 있다.
		d.start();
		System.out.println("프로그램종료");
		
		/*
		 * 여기에는 3개의 프로세스의 우선순위는 같고 
		 * 각각의 프로세스가 미세하게 다르지만 동시에 돌아가는것 처럼 빠르게 실행됨  
		*/
	}

}

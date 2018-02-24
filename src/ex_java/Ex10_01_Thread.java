package ex_java;
class ThreadRun implements Runnable{//Runnable 이라는 인터페이스에 있는 run메소드를 상속 받아야한다.
	public void run(){//run안에 작동하려는것을 넣어줘야한다. public void run() 형태는 이대로 맞춰줘야함
		for(int i=0; i<50;i++){
			System.out.print(i+" ");
		}
	}
}


public class Ex10_01_Thread {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		
		//ThreadRun t = new ThreadRun();  
		//Thread thd = new Thread(t);  
		
		Thread thd =new Thread(new ThreadRun());
		thd.start();//start()는 쓰레드 클래스 안에 내부적으로 들어있음 
		//start를 하면 내부적으로 스타트 메소드가 run 를 실행해야됨 
		//run을 직접 호출하면 메인 이 멈춤 그래서 스타트메소드를 사용하면 run 이 움직임
		//thd.start(); 이러면 안됨 사용하여면 객체 다시 만들기 
 		
		thd=new Thread(new ThreadRun());//쓰레드 객체로 만든다는건 그 객체를 여러개 만들어 사용하겠다는뜻
		thd.start();
		//무조건 한번더 사용하려면 무조건 객체를 다시 만들어서 스타트를 해야함
		
		System.out.println("프로그램 종료");
		
	}

}

/***************************************
 * 쓰레드 만드는방법(2가지)
 * ① 스레드 만들기
public interface Runnable{
void run();
}
public class 클래스이름 implements Runnable{
public void run(){
 :
}
}
 
 
 ② 스레드 만들기
public class 클래스이름 extends Thread{
public void run(){
 :
}
}
 
 */
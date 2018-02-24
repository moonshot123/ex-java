package ex_java;

class Data1{
	public int i = 0;//멤버변수  
}
class AA extends Thread{
	public void run(){
		for (int i=0; i<100000; i++){//지역변수
			Ex10_07_NotSyncTest.data.i++;   
		}
		System.out.println("ThreadTest1 :" + Ex10_07_NotSyncTest.data.i);//i는 멤버변수의 i이다.
	}
}
class BB extends Thread{
	public void run(){
		for (int i=0; i<100000; i++){//지역변수
			Ex10_07_NotSyncTest.data.i++; // 공유자원(임계영역)을 사용하는 상황에서는 동기화의 문제점이 발생하기 떄문에 값이 
		}
		System.out.println("ThreadTest2 :" + Ex10_07_NotSyncTest.data.i);
	}
}
public class Ex10_07_NotSyncTest{
	public static Data1 data = new Data1(); 
	// static을 써서 공유자원으로 만든다.
	
	public static void main(String[] args){
		System.out.println("main 시작");
		AA t1 = new AA(); 
		BB t2 = new BB(); 
		t1.start(); 
		t2.start();  
		System.out.println("main 종료");
	}
} 

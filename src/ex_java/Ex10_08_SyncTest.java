package ex_java;
class Data2{
	public int i = 0;
}
class Sync1 extends Thread{
	public void run(){
		for (int i=0; i<100000; i++){
			synchronized(Ex10_08_SyncTest.Data2){// 이 블럭안의 내용이 동시에 시작하지 않도록 한다.// 예를 들어 
				// 이 부분이 추가되면서 동기화 보장됨
				Ex10_08_SyncTest.Data2.i++;
			}
		}
		System.out.println("Sync1 :" + Ex10_08_SyncTest.Data2.i);
	}
}
class Sync2 extends Thread{
	public void run(){
		for (int i=0; i<100000; i++){
			synchronized(Ex10_08_SyncTest.Data2){ 
				// 이 부분이 추가되면서 동기화 보장됨
				Ex10_08_SyncTest.Data2.i++;
			}
		}
		System.out.println("Sync2 :" + Ex10_08_SyncTest.Data2.i);
	}
}
public class Ex10_08_SyncTest{
	
	public static Data2 Data2 = new Data2(); 

	public static void main(String[] args){
		System.out.println("main 시작");
		Sync1 t1 = new Sync1();
		Sync2 t2 = new Sync2();
		t1.start();
		t2.start();
		System.out.println("main 종료");
	}
}
/*
 * public synchronized void saveMoney(int save){  //saveMoney메소드를 동시에 들어오지 못하게 하겠다.
:
}
*/

/*
//synchronized 블록의 예
public void saveMoney(int save){
synchronized(this){ //  saveMoney 메소드에는 들어갈수 있지만 synchronized(this)[]블럭안에는 동시에 들어올수 없도록 만든다.
:
}
}
*/

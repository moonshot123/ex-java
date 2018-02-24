package ex_java;
class Data2{
	public int i = 0;
}
class Sync1 extends Thread{
	public void run(){
		for (int i=0; i<100000; i++){
			synchronized(Ex10_08_SyncTest.Data2){// �� ������ ������ ���ÿ� �������� �ʵ��� �Ѵ�.// ���� ��� 
				// �� �κ��� �߰��Ǹ鼭 ����ȭ �����
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
				// �� �κ��� �߰��Ǹ鼭 ����ȭ �����
				Ex10_08_SyncTest.Data2.i++;
			}
		}
		System.out.println("Sync2 :" + Ex10_08_SyncTest.Data2.i);
	}
}
public class Ex10_08_SyncTest{
	
	public static Data2 Data2 = new Data2(); 

	public static void main(String[] args){
		System.out.println("main ����");
		Sync1 t1 = new Sync1();
		Sync2 t2 = new Sync2();
		t1.start();
		t2.start();
		System.out.println("main ����");
	}
}
/*
 * public synchronized void saveMoney(int save){  //saveMoney�޼ҵ带 ���ÿ� ������ ���ϰ� �ϰڴ�.
:
}
*/

/*
//synchronized ����� ��
public void saveMoney(int save){
synchronized(this){ //  saveMoney �޼ҵ忡�� ���� ������ synchronized(this)[]���ȿ��� ���ÿ� ���ü� ������ �����.
:
}
}
*/

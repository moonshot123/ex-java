package ex_java;

class Data1{
	public int i = 0;//�������  
}
class AA extends Thread{
	public void run(){
		for (int i=0; i<100000; i++){//��������
			Ex10_07_NotSyncTest.data.i++;   
		}
		System.out.println("ThreadTest1 :" + Ex10_07_NotSyncTest.data.i);//i�� ��������� i�̴�.
	}
}
class BB extends Thread{
	public void run(){
		for (int i=0; i<100000; i++){//��������
			Ex10_07_NotSyncTest.data.i++; // �����ڿ�(�Ӱ迵��)�� ����ϴ� ��Ȳ������ ����ȭ�� �������� �߻��ϱ� ������ ���� 
		}
		System.out.println("ThreadTest2 :" + Ex10_07_NotSyncTest.data.i);
	}
}
public class Ex10_07_NotSyncTest{
	public static Data1 data = new Data1(); 
	// static�� �Ἥ �����ڿ����� �����.
	
	public static void main(String[] args){
		System.out.println("main ����");
		AA t1 = new AA(); 
		BB t2 = new BB(); 
		t1.start(); 
		t2.start();  
		System.out.println("main ����");
	}
} 

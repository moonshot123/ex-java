package ex_java;
class ThreadRun implements Runnable{//Runnable �̶�� �������̽��� �ִ� run�޼ҵ带 ��� �޾ƾ��Ѵ�.
	public void run(){//run�ȿ� �۵��Ϸ��°��� �־�����Ѵ�. public void run() ���´� �̴�� ���������
		for(int i=0; i<50;i++){
			System.out.print(i+" ");
		}
	}
}


public class Ex10_01_Thread {

	public static void main(String[] args) {
		System.out.println("���α׷� ����");
		
		
		//ThreadRun t = new ThreadRun();  
		//Thread thd = new Thread(t);  
		
		Thread thd =new Thread(new ThreadRun());
		thd.start();//start()�� ������ Ŭ���� �ȿ� ���������� ������� 
		//start�� �ϸ� ���������� ��ŸƮ �޼ҵ尡 run �� �����ؾߵ� 
		//run�� ���� ȣ���ϸ� ���� �� ���� �׷��� ��ŸƮ�޼ҵ带 ����ϸ� run �� ������
		//thd.start(); �̷��� �ȵ� ����Ͽ��� ��ü �ٽ� ����� 
 		
		thd=new Thread(new ThreadRun());//������ ��ü�� ����ٴ°� �� ��ü�� ������ ����� ����ϰڴٴ¶�
		thd.start();
		//������ �ѹ��� ����Ϸ��� ������ ��ü�� �ٽ� ���� ��ŸƮ�� �ؾ���
		
		System.out.println("���α׷� ����");
		
	}

}

/***************************************
 * ������ ����¹��(2����)
 * �� ������ �����
public interface Runnable{
void run();
}
public class Ŭ�����̸� implements Runnable{
public void run(){
 :
}
}
 
 
 �� ������ �����
public class Ŭ�����̸� extends Thread{
public void run(){
 :
}
}
 
 */
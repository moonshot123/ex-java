package ex_java;
class DerivedThread extends Thread{// �����带 ��ӹ޴� ��� // DerivedThread Ŭ������ �ٸ� ���� ��ӹ޾ƾߵȴٸ� �̰� ������ runnable�������̽��� �̿��Ͽ� �������� 
	public void run(){
		for(int i=0; i<50;i++){
			System.out.print(i+" ");
		}
		System.out.println();
	}


}

public class Ex10_02_Thread {

	public static void main(String[] args) {
		System.out.println("�ý��۽���");
		DerivedThread d =new DerivedThread();// �����带 ��� �޾ұ� ������ ��ü�� ���� ������ �����
		d.start();
		
		d=new DerivedThread();// �����带 ����Ҷ��� ��ü�� �ٽø����� ���ÿ����ư��� �ִ�.
		d.start();
		System.out.println("���α׷�����");
		
		/*
		 * ���⿡�� 3���� ���μ����� �켱������ ���� 
		 * ������ ���μ����� �̼��ϰ� �ٸ����� ���ÿ� ���ư��°� ó�� ������ �����  
		*/
	}

}

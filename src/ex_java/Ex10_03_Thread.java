package ex_java;
//thread ����� ��� 2����
class Big extends Thread{// 1)Thread�� ���� �޴´�.
	public void run(){
		for(char i ='A'; i<='Z';i++){
			System.out.print(i+" ");
			try {
				Thread.sleep(1000);// 1000 = 1��  �ѹ� �����ϰ� 1�ʵ��� ����ٰ� ����    >>>   sleep�� ������ ����ó�� ����ߵ�
				sleep(1000);// 1000 = 1��  �ѹ� �����ϰ� 1�ʵ��� ����ٰ� ����    >>>   �Ʒ��� �Ͱ� ������ Thread�� ��ӹ������̱� ������ �ٷ� sleep()�޼ҵ带 �θ����� ����
			} catch (InterruptedException e) {//���ܰ� �߻��ϸ� InterruptedException ��ü�� ���� 
				e.printStackTrace();//�ڵ� �ϼ�������� ����� ������ �޼ҵ��ε� ��𿡼� ���ܰ� �߻��ߴ��� �˷��ִ� �޼ҵ��̴�. // ����� �� �־�� ������� 
			}
		}
		System.out.println();
	}
}

class Small implements Runnable{// 2)Runnable �������̽��� ���޴´�.
	public void run(){
		for(char i ='a'; i<='z';i++){
			System.out.print(i+" ");
			try {
				Thread.sleep(1000);// 1000 = 1��  �ѹ� �����ϰ� 1�ʵ��� ����ٰ� ����  
			} catch (InterruptedException e) {//���ܰ� �߻��ϸ� InterruptedException ��ü�� ���� 
				e.printStackTrace();//�ڵ� �ϼ�������� ����� ������ �޼ҵ��ε� ��𿡼� ���ܰ� �߻��ߴ��� �˷��ִ� �޼ҵ��̴�. // ����� �� �־�� ������� 
			}
		}
		System.out.println();
	}
}


public class Ex10_03_Thread {

	public static void main(String[] args) {
		
		
		System.out.println("���α׷�����");
		
			Thread th = new Thread(new Small()); // �������̽��� ���� smallŬ���� ��ü�� ��ü�� ����� ���� ���ϱ� ������ Thread�� �̿��ؼ� ��ü�� ����°� ����.???
			th.start();
			
			Big bth = new Big();// �̰����� ������ �����ϱ� ������ ��ü�� ����?
			bth.start();
		
		System.out.println("���α׷�����");
		
		
	}

}


/*
//���ĺ��빮��
for(int i =65; i<91;i++){
	System.out.print((char)i+"");
}
System.out.println();

for(char i ='A'; i<='Z';i++){
	System.out.print(i+"");
}
System.out.println();
*/

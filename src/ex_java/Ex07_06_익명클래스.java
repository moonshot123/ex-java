package ex_java;
class Car5{
	void drive(){
		System.out.println("�θ��θ�");
	}
	void gogogo(){
		
	}
}


public class Ex07_06_�͸�Ŭ���� {

	public static void main(String[] args) {
		
		//System.out.println("����� ����");
		
		
		new Car5(){
			void drive(){
				System.out.println("����� ����");
			}
		}.drive();//ȣ���Ѵٴ� �ǹ�( ���ѹ� ���� )
		// �͸�Ŭ������ �������� ���� ���ҵ�
		
		
		Car5 c =new Car5();
		c.drive();// �Ϲ����� ȣ��
		
		
		
		
		new Car5().drive();//�޼ҵ带 �ѹ� ������ �̷��� �ᵵ ������ ������ ����
		
		new Car5().gogogo();
		//�̷��� ����  new Car5().drive();, new Car5().gogogo(); �ҋ� ���� ���ο� ��ü�� ��������Ƿ� ����
		
		
		
		
	}

}

package ex_java;
class Sub{
	int x=2;
	void show(){
		System.out.println(x*x);
	}
}


class Sub2 extends Sub{//�Ϲ������� show()�� �������̵��ؼ� ���ο� show()�� ����¹���� ����ϴµ� �̷��� ���� Ŭ������ ������ �ʰ� �Ҽ� ����
	void show(){
		System.out.println(x*x*x);
	}
}

public class Ex07_05_�͸�Ŭ���� {

	public static void main(String[] args) {
		
		Sub s1 =new Sub();
		s1.show();
		
		Sub2 s2 =new Sub2();
		s2.show();
	
		
		new Sub(){//show()�� �������̵��� �����ʰ� ��ü�� ����� ��ó�� �������� �׻��̿� ���� ���ϴ� �޼ҵ带 ������
			void show(){
				System.out.println(x*x*x*x);
			}
		}.show();

		
		new Sub(){//�̷����� �͸�Ŭ���������
			void show(){
				System.out.println(x*x*x*x*x);
			}
		}.show();
		
		
	}

}

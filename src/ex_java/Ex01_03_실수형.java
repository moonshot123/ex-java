package ex_java;

public class Ex01_03_�Ǽ��� {

	public static void main(String[] args) {
		
		System.out.println(1.1 + 2.2); //��� 3.3000000000000003 ��ǻ�Ͱ� �Ǽ������ �߸��� 
				
		float f1 = 1.1f; //f�� �Ⱦ��� 8����Ʈ ������1.1�� float���� ���� �ʾƼ� ������ ����
		double f2 = 2.2; //float�� , double�� �Ǽ��� �ִ�. 
		
		System.out.println(f1);
		System.out.println(f2);
		
		int i; //int,double: 4����Ʈ
		i = (int) f1; // ���� 4����Ʈ������ float�� ���� ũ�ٰ� ������ �׷��� ����ȯ�� �������
		System.out.println(i);
		
		i = 3;
		f1 = i; // ���� 4����Ʈ������ float�� ũ�ٰ� �����ϱ� ������ ��������
		System.out.println(f1);
		
		
		
	}

}

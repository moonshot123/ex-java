package ex_java;

public class Ex05_07_���ȣ�� {

	public static void main(String[] args) {
		
		//show(3);
		show2(3);
		
	}
	
	
	public static void show (int cnt){
		
		System.out.println("hi~ "+cnt);
		if(cnt==1){
			return;//������ ��� 1.���� ��ȯ   2.���� �޼ҵ� ���� 
		}
		show(--cnt);
		// �ڱ��ڽ��� �޼ҵ带 �θ��� ��:���ȣ��, ���� ������ for�� ó�� �ڽ��� �θ��鼭 �����ϸ鼭 ��������� �޼ҵ带 ȣ����
		// cnt�� �������� �̹Ƿ� �� �ȿ� �ִ� ���� ��� �״�� ���� �Ǵµ�? 
	}
	
	
	public static void show2 (int cnt){
		
		if(cnt==1){
			return;//������ ��� 1.���� ��ȯ   2.���� �޼ҵ� ����  show(--cnt);//���� ȣ�������Ƿ� ����� ��ȯ�� 
		}
		show(--cnt);
		// �ڱ��ڽ��� �޼ҵ带 �θ��� ��:���ȣ��, ���� ������ for�� ó�� �ڽ��� �θ��鼭 �����ϸ鼭 ��������� �޼ҵ带 ȣ����
		// cnt�� �������� �̹Ƿ� �� �ȿ� �ִ� ���� ��� �״�� ���� �Ǵµ�? 
		System.out.println("hi1~ "+cnt);
		System.out.println("hi2~ "+cnt);
	}
	
	
	
	
	
}

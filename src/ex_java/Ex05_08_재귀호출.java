package ex_java;

public class Ex05_08_���ȣ�� {

	public static void main(String[] args) {
		
		System.out.println("4���丮��:" + factorial(4));
		//ȣ��� ��ȯ��ġ�� ���ؼ� Ȯ���� �ؾ� Ʋ���� �ʰ� ����� ������
		//�����ϸ� ���������� ������ ���ϸ� ���� Ʋ����, ���ȣ�⿡ ���� ���� � Ǯ�� ����.
	}

	private static int factorial(int n) {
		if(n==1){
			return 1;
		}else{
			return n*factorial(n-1);
			//factorial(n-1)���� ��� �Ǵ� �κп��� �ٽ� �޼ҵ带 ȣ�������μ� 1�� �ɶ����� ��� �پ��� ����� �Է°��� ���丮�˰� ���� ��갪�� ��ȯ�ϰ� �ȴ�. 
		}
		
	}

}
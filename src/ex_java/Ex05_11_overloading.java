package ex_java;
public class Ex05_11_overloading {

	public static void main(String[] args) {
		
		int result1 =plus(3,5,7);
		System.out.println("result1="+result1);
		
		double result2=plus(1.5, 2.7);
		System.out.println("result2="+result2);
		
		sharp();
		System.out.println();
		sharp(3);
		
	}
	
	//�ٸ��̸����� �ᵵ ������ �ƹ����� ��������� ������ �ִ� �޼ҵ忡 �̸��� ���� �ϸ� ���� ����?
	//��ǥ������ api���� ���� ���¸��� �̷��͵��� ���� ���� �����µ� �޼ҵ� �̸��� ������ �Ű��������� ����� ���� ���� �����̸����� ���ϰ� ����ϴ� �� �����غ���.
	static void sharp(){
		for(int i=0; i<5;i++){
			System.out.print("#");
		}
	}
	
	static void sharp(int a){
		for(int i=0; i<a;i++){
			System.out.print("#");
		}
	}
	
	
	//�޼ҵ��̸��� ������ �Ű������� �ٸ���(����, ��)�� �ٸ��� �����ε��� ���� ����� �� �ִ�. 
	
	/*
	�����ε��� �������̵�	

		ex)�����ε�:   
					println()
				    println(int u)
					println(double d)
					println(boolean b)
					
					�ϳ��� Ŭ������ ���� �̸��� �޼ҵ尡 ������ �ִ°�
					�Ű������� ������ Ÿ���� �޶����
					����Ÿ���� ����� ����
					�Ű����� �����̸��� �������
					�Ű����� ������ ���� ���� ��
					
					 
		ex)�������̵�: 
					��Ӱ��迡�� �θ� �����ִ� �޼ҵ带 �ڽ��� �������ϴ°�
					�����ִ� �޼ҵ�� ���� ���� �ϴ� �޼ҵ� �̸��� ���ƾ��Ѵ�.
					�Ű������� ���ƾ��Ѵ�.
					����Ÿ�Ե� ���ƾ��Ѵ�. 
					 
					
	*/
	static int plus(int a, int b, int c){
		return a+b+c;
	} 

	static double plus(double a, double b){
		return a+b;
	}
	
	/*
	 * ����Ÿ���� ������⶧���� ��������
	 * �Ű������̸��� �ٸ����� �����ɷ� �ν���
	 * 
	static double plus(double a, double b){
		return a+b;
	}
	static int plus(double c, double d){
		return a+b;
	}
	*/

	
	
	//������ �޶����� �ٸ� �޼ҵ�� ������
	static double plus(double a, int b){
		return a+b;
	}
	
	static double plus(int a, double b){
		return a+b;
	}
	
}

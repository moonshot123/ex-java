package ex_java;
public class Ex05_03_�޼ҵ� {
	
	public static void main(String[] args) {//���θ޼ҵ� ����
		
		System.out.println("main ����");
		
		Ex05_03_�޼ҵ� ex = new Ex05_03_�޼ҵ�();
		
		add(3,5); //add��� �޼ҵ带 ȣ���ϰڵ�. 
		
		add(10,20);//10, 20 :��������
		
		int s = sub(9,5,1);//9,5,1 :��������
		System.out.println("s:"+s);
		
		//mul�޼ҵ�(�Լ�)ȣ��
		double m =mul();
		System.out.println("m:"+m);
		
		ex.div(); //��������.�޼ҵ�ȣ��() �Ҷ� static ��������
		
		System.out.println("main ��");
	}
	
	
	static void smile(){
		System.out.println("������");
		System.out.println("=====");
	}
	
	static void div() {
		int x =10,y=3;
		System.out.println("������:"+x/y);
		//return;
	}
	
	
	
	static double mul() {//mul �޼ҵ� ���� 
		double x =1.1,y=22;
		return x*y;
	}
	
	
	
	static void add(int a, int b){//add �޼ҵ� ���� //main�� static�� �����Ƿ� ���⵵ ������ static�־���
		//void ��ȯ �Ǵ� ���� ������  // a,b �Ű�����
		System.out.println("��:"+(a+b));
		smile();
		/*System.out.println("������");
		System.out.println("=====");*/
	}
	
	
	
	static int sub(int a, int b, int c) {
		//int ���� ��ȯ  // a,b,c �Ű�����
		int result = a-b-c;
		return result;
	}
	
	
	
	
}
package ex_java;
class Calc{
	int x;

	int add(int a, int b){		
		return a+b;
		//System.out.println(a); ��ȯ�Ǹ� ������ �����Ƿ� �̹����� ���� ������� ����, ��� ������ ���Ͼտ� ����. 
	}
	
	static int sub(int a, int b){		
		return a-b;
	}
	
	double div(double a, double b ){
		return a/b;
	}
	
	
}


public class Ex05_04_�޼ҵ� {

	public static void main(String[] args) {
		
		System.out.println("main ����");
		
		Calc c =new Calc();// �ٸ� Ŭ������ �ִ� �޼ҵ峪 ������ �����Ҷ��� �� ��ü�� ������
		c.x=10;
		
		int sum = c.add(100, 200);
		System.out.println("sum:"+sum);
		//System.out.println("sum:"+c.add(100, 200)); �Ѵ� ������

		System.out.println("sum:"+Calc.sub(100, 200));//sub�޼ҵ忡 static�� �ֱ⶧���� ��ü�� ������ �ʰ� Cal.sub�� �ٷ� ����� �� �ִ�.
		
		
		double d =c.div(95.67, 3.67);
		System.out.println(d);
		
		System.out.println("main ��");
		
	}

}
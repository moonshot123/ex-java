package ex_java;
class VarCnt{
	static int a =0;
	int b=0;
	
	public void increment(){
		
		int c =0; // c�� increment()�޼ҵ�ȿ����� ���Ǵ� �������� 
		a++; b++; c++;
		
		System.out.println("static ���� a:"+a);
		System.out.println("�ν��Ͻ� ���� b:"+b);
		System.out.println("���� ���� c:"+c);
		System.out.println();
	}
}


public class Ex05_06_���� {
	public static void main(String[] args) {
		
		int a=0;// ���������� �׻� �ʱ�ȭ ���� �ʱ� ������ �� �ʱ�ȭ �ؾߵ� �ȱ׷� ������... �ν��Ͻ������� static������ �ڵ����� �ʱ�ȭ�� �ȴ�.
		System.out.println("��ü1 ����");
		VarCnt cnt1 =new VarCnt();
		cnt1.increment();
		cnt1.increment();
		
		System.out.println("��ü2 ����");
		VarCnt cnt2 =new VarCnt();
		cnt2.increment();
		cnt2.increment();
		
		/*
		int i;
		for(i=1;i<5;i++){
			int j=3; //��������: for���ȿ� ���� ������ j�� �ٸ��������� ���� ���� �ٷ� �Ʒ� for������ ������ �ϸ� ������ ���������� �׷���.....
			System.out.print(i+" "+j);
		}
		System.out.println();
		
		for(i=11;i<15;i++){
			System.out.print(i+" "+j+a);
		}
		*/
	}
}

package ex_java;

public class Ex01_02_������_������_���� {
	public static void main(String[] args){
				
		int a ; // a��� ���� �������� �Է��Ѵٰ� ������ 
		int b ; // b��� ���� �������� �Է��Ѵٰ� ������   
		byte c; // c��� ���� �������� �Է��Ѵٰ� ������ int�� ũ�⸸ �ٸ�
		int d = 5 ; //����� �ʱ�ȭ�� ���ÿ� 		
		// int a; ������ �ߺ��� �̸��� ������ ����ϸ� �ȵ�		
		
		a = 1; //a�� 1�� �ʱ�ȭ
		b = 2; //b�� 2�� �ʱ�ȭ
		//c = 1000; ���� �ִ� ���� �۾Ƽ� ���� ���ȵ�
		
		/*
			����: ���� ��ȭ �Ǵ� �ָӴ�
			a = 1; 
			a �� 1�̶�� ���� �ִ´�.
			
			1 = a �� �ȵ� ������ �׻� �����ʿ��� ����
			
			 ������ ����ϱ� ���� ������ �������
		*/
		
		System.out.println(a+b);
		System.out.println("a+b");
		
		a = 10; 
		System.out.println(a+b);
		
		a = 100; 
		System.out.println(a+b);
		
		byte b1 = 10;
		byte b2 = 20;
		byte b3 ;
		b3 = (byte) (b2 + b1); // ������ ����ȯ: b1+b2 ���� ���Ҷ��� �ڵ����� int������ ���� > int�� byte���� ũ�Ƿ� ���� > �׷��� b3�� byte�̹Ƿ� ���� �޶����Ƿ� ������ ����ȯ(ĳ����)�� ���� �ٲ���� ���� ������ ��  
		System.out.println(b3);
		
		byte a1 = 10;
		byte a2 = 20;
		long a3 ;
		a3 = a2 + a1; // �� ũ�Ƿ� ������ ����
		
		char c1,c2; // ������ ����c1, c2 ����
		
		c1 = 65; //��� ���ڵ��� ���� ���ڰ� ���� 65�� �빮�� a  �̷��� ���� �ƽ�Ű �ڵ��� ��
		c2 = 'B';
		System.out.println("c1");
		System.out.println(c1);
		System.out.println(c1+c2);
		System.out.println(c1+2); //int ������ ������ ����ȯ�� �Ǿ 67�̵�
		System.out.println((char)(c1+2)); //ĳ������ �ϸ� 67�� �ش��ϴ� ���ڰ� ��µ�
		
		/*		
		�ƽ�Ű�ڵ尪
		
		A :65
		B :66
		
		a :97
		b :98
		*/
		
		boolean x,y;
		
		x = true; // ���� ����  
		y = false; //
		System.out.println(x);
		System.out.println(y);
		System.out.println("3>5");
		System.out.println(3>5);
		boolean z = 3>5;
		System.out.println("z��"+z);
		String s1,s2;
		s1 ="a";
		s2 ="abc";		
		System.out.println(s1);
		System.out.println(s2);
				
	}
}

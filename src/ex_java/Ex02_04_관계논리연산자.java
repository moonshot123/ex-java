package ex_java;

public class Ex02_04_����������� {

	public static void main(String[] args) {
		
		int a=10, b=20;
		boolean b1;
				
		System.out.println(a>b);
		
		b1 = (a<=b);
		System.out.println(b1);
		
		b1 = (a==b);
		System.out.println(b1);
		
		b1 = (a!=b);
		System.out.println(b1);
		
		b1= (a>=10 && b>=10);	// and����: �Ѵ� true�� true 
		System.out.println(b1);
		
		b1= (a>=20 && b>=20);	// and����: �Ѵ� true�� true
		System.out.println(b1);
				
		b1= (a>=10 || b>=10);	// or����: �����ϳ��� true�� true
		System.out.println(b1);
		
		b1= (a>=20 || b>=20);	// or����: �����ϳ��� true�� true
		System.out.println(b1);
		
		System.out.println(!(a>=10)); // !: ������ ��ȯ
		
		
	}

}

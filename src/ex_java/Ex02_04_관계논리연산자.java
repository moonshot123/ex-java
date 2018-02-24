package ex_java;

public class Ex02_04_관계논리연산자 {

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
		
		b1= (a>=10 && b>=10);	// and연산: 둘다 true면 true 
		System.out.println(b1);
		
		b1= (a>=20 && b>=20);	// and연산: 둘다 true면 true
		System.out.println(b1);
				
		b1= (a>=10 || b>=10);	// or연산: 둘중하나라도 true면 true
		System.out.println(b1);
		
		b1= (a>=20 || b>=20);	// or연산: 둘중하나라도 true면 true
		System.out.println(b1);
		
		System.out.println(!(a>=10)); // !: 참거짓 전환
		
		
	}

}

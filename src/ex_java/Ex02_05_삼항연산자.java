package ex_java;

public class Ex02_05_삼항연산자 {

	public static void main(String[] args) {
/*
	이항연산자
	3+4 , - * / % && ||
	
	단항연산자
	! ++ --
	
	삼항연산자
	?:
	
*/	
		
		
/*
	조건 ? a:b
	조건이 참이면 a 거짓이면 b	
		
*/
		int a=5;	
		boolean b;
		String result;
		
		result = a>1 ? "1보다 크다" :"1보다 작다"; 
		System.out.println(result);
		
		result = (a%2)==0 ? "짝수" :"홀수"; 
		System.out.println(result);
		
		
		result = a/2 == 0 ? "a" : "b";
		System.out.println(result);
		
		
		
		
	}

}

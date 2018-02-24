package ex_java;

public class Ex02_02_대입연산자 {
	// main 자동완성 : main > 컨트롤 + 스페이스 
	public static void main(String[] args) {
		
		int a =3, b,c;
		//	a = a + 5;  같은 뜻   a+= 5;
		a+= 5;
		System.out.println("a:"+a); //a = 8
		
		//a = a - 1;  같은 뜻   a-= 1;
		a-=1;
		System.out.println("a:"+a); //a = 7
		
		a%=3;
		System.out.println("a:"+a); //a = 1
		
		
		
		String fruit = "apple";
		fruit =fruit +"pie"; //fruit += pie
		System.out.println("fruit: "+fruit);
		
	}
}

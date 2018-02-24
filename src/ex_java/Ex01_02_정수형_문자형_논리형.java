package ex_java;

public class Ex01_02_정수형_문자형_논리형 {
	public static void main(String[] args){
				
		int a ; // a라는 곳에 정수형을 입력한다고 선언함 
		int b ; // b라는 곳에 정수형을 입력한다고 선언함   
		byte c; // c라는 곳에 정수형을 입력한다고 선언함 int와 크기만 다름
		int d = 5 ; //선언과 초기화를 동시에 		
		// int a; 오류남 중복된 이름의 변수는 사용하면 안됨		
		
		a = 1; //a를 1로 초기화
		b = 2; //b를 2로 초기화
		//c = 1000; 쓸수 있는 수가 작아서 거의 사용안됨
		
		/*
			변수: 값이 변화 되는 주머니
			a = 1; 
			a 에 1이라는 값을 넣는다.
			
			1 = a 는 안됨 기준은 항상 오른쪽에서 왼쪽
			
			 변수는 사용하기 전에 선언을 해줘야함
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
		b3 = (byte) (b2 + b1); // 묵시적 형변환: b1+b2 값을 더할때는 자동으로 int형으로 변함 > int가 byte보다 크므로 오류 > 그래서 b3은 byte이므로 형이 달라지므로 강제적 형변환(캐스팅)을 통해 바꿔줘야 같은 형으로 됨  
		System.out.println(b3);
		
		byte a1 = 10;
		byte a2 = 20;
		long a3 ;
		a3 = a2 + a1; // 더 크므로 문제는 없음
		
		char c1,c2; // 문자형 변수c1, c2 선언
		
		c1 = 65; //모든 문자들은 고유 숫자가 있음 65는 대문자 a  이러한 값을 아스키 코드라고 함
		c2 = 'B';
		System.out.println("c1");
		System.out.println(c1);
		System.out.println(c1+c2);
		System.out.println(c1+2); //int 형으로 묵시적 형변환이 되어서 67이됨
		System.out.println((char)(c1+2)); //캐스팅을 하면 67에 해당하는 문자가 출력됨
		
		/*		
		아스키코드값
		
		A :65
		B :66
		
		a :97
		b :98
		*/
		
		boolean x,y;
		
		x = true; // 참의 상태  
		y = false; //
		System.out.println(x);
		System.out.println(y);
		System.out.println("3>5");
		System.out.println(3>5);
		boolean z = 3>5;
		System.out.println("z는"+z);
		String s1,s2;
		s1 ="a";
		s2 ="abc";		
		System.out.println(s1);
		System.out.println(s2);
				
	}
}

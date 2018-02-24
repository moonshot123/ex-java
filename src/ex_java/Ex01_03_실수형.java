package ex_java;

public class Ex01_03_실수형 {

	public static void main(String[] args) {
		
		System.out.println(1.1 + 2.2); //결과 3.3000000000000003 컴퓨터가 실수계산을 잘못함 
				
		float f1 = 1.1f; //f를 안쓰면 8바이트 숫자인1.1을 float형과 맞지 않아서 오류가 생김
		double f2 = 2.2; //float형 , double형 실수가 있다. 
		
		System.out.println(f1);
		System.out.println(f2);
		
		int i; //int,double: 4바이트
		i = (int) f1; // 같은 4바이트이지만 float이 좀더 크다고 생각함 그래서 형변환을 해줘야함
		System.out.println(i);
		
		i = 3;
		f1 = i; // 같은 4바이트이지만 float이 크다고 생각하기 때문에 오류없음
		System.out.println(f1);
		
		
		
	}

}

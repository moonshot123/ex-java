package ex_java;

public class Ex05_10_Math {

	public static void main(String[] args) {
		
		int a=Math.max(10,20);//두수중 큰수  c.max(10,20); 에서 c는 1.객체이름 2.클래스이름
		System.out.println("a:"+a);
		
		int b=Math.min(10,20);//두수중 작은수  c.max(10,20); 에서 c는 1.객체이름 2.클래스이름
		System.out.println("b:"+b); 
		
		System.out.println(Math.PI);// 파이값 
		//lang패키지에 있는 클래스들은 import할 필요없음
		System.out.println(Math.abs(-30)); // 절대값
		
		// Math.min(10,20); Math가 대문자 이므로 클래스일듯
		// 자바에서 이전에 만들어둔 라이브러리
		// Math의 max메소드는 static이라서 바로 호출가능 하고 int 가 반환형으로 되어 있기 떄문에  
		
		
		//javalang > system > out(static):system.out 표준출력=모니터 
		//system.out 은PrintStream 으로 반환됨 >> PrintStream으로 가면 println메소드로 가면
		//System.out.println()은 자바랭에 있는 system클래스중out에클래스에 있는println을 이용한다는 뜻임  
		
		//scanner는 자바 유틸에 있는 클래스로 lang은 import를 하여 써줘야 됨 
		
		
		
		/*
		
		책에 기본 api가 있으니 처음부터 끝까지 몇번 만들어 보는게 좋을거 같다.
		
		*/
		
		
		
	}

}

package ex_java;

public class Ex05_07_재귀호출 {

	public static void main(String[] args) {
		
		//show(3);
		show2(3);
		
	}
	
	
	public static void show (int cnt){
		
		System.out.println("hi~ "+cnt);
		if(cnt==1){
			return;//리턴의 기능 1.값을 반환   2.현재 메소드 종료 
		}
		show(--cnt);
		// 자기자신의 메소드를 부르는 것:재귀호출, 여기 예제는 for문 처럼 자신을 부르면서 감소하면서 계속적으로 메소드를 호출함
		// cnt는 지역변수 이므로 그 안에 있는 값이 계속 그대로 유지 되는듯? 
	}
	
	
	public static void show2 (int cnt){
		
		if(cnt==1){
			return;//리턴의 기능 1.값을 반환   2.현재 메소드 종료  show(--cnt);//에서 호출했으므로 여기로 반환됨 
		}
		show(--cnt);
		// 자기자신의 메소드를 부르는 것:재귀호출, 여기 예제는 for문 처럼 자신을 부르면서 감소하면서 계속적으로 메소드를 호출함
		// cnt는 지역변수 이므로 그 안에 있는 값이 계속 그대로 유지 되는듯? 
		System.out.println("hi1~ "+cnt);
		System.out.println("hi2~ "+cnt);
	}
	
	
	
	
	
}

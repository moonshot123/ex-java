package ex_java;
public class Ex05_03_메소드 {
	
	public static void main(String[] args) {//메인메소드 정의
		
		System.out.println("main 시작");
		
		Ex05_03_메소드 ex = new Ex05_03_메소드();
		
		add(3,5); //add라는 메소드를 호출하겠따. 
		
		add(10,20);//10, 20 :전달인자
		
		int s = sub(9,5,1);//9,5,1 :전달인자
		System.out.println("s:"+s);
		
		//mul메소드(함수)호출
		double m =mul();
		System.out.println("m:"+m);
		
		ex.div(); //참조변수.메소드호출() 할때 static 생략가능
		
		System.out.println("main 끝");
	}
	
	
	static void smile(){
		System.out.println("하하하");
		System.out.println("=====");
	}
	
	static void div() {
		int x =10,y=3;
		System.out.println("나누기:"+x/y);
		//return;
	}
	
	
	
	static double mul() {//mul 메소드 정의 
		double x =1.1,y=22;
		return x*y;
	}
	
	
	
	static void add(int a, int b){//add 메소드 정의 //main이 static이 있으므로 여기도 강제로 static넣어줌
		//void 반환 되는 값이 없을때  // a,b 매개변수
		System.out.println("합:"+(a+b));
		smile();
		/*System.out.println("하하하");
		System.out.println("=====");*/
	}
	
	
	
	static int sub(int a, int b, int c) {
		//int 값이 반환  // a,b,c 매개변수
		int result = a-b-c;
		return result;
	}
	
	
	
	
}
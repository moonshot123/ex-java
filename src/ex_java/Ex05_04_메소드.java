package ex_java;
class Calc{
	int x;

	int add(int a, int b){		
		return a+b;
		//System.out.println(a); 반환되면 문장이 끝나므로 이문장을 절대 출력하지 않음, 모든 문장은 리턴앞에 쓰자. 
	}
	
	static int sub(int a, int b){		
		return a-b;
	}
	
	double div(double a, double b ){
		return a/b;
	}
	
	
}


public class Ex05_04_메소드 {

	public static void main(String[] args) {
		
		System.out.println("main 시작");
		
		Calc c =new Calc();// 다른 클래스에 있는 메소드나 변수에 접근할때는 꼭 객체를 만들자
		c.x=10;
		
		int sum = c.add(100, 200);
		System.out.println("sum:"+sum);
		//System.out.println("sum:"+c.add(100, 200)); 둘다 같은거

		System.out.println("sum:"+Calc.sub(100, 200));//sub메소드에 static이 있기때문에 객체를 만들지 않고 Cal.sub로 바로 사용할 수 있다.
		
		
		double d =c.div(95.67, 3.67);
		System.out.println(d);
		
		System.out.println("main 끝");
		
	}

}